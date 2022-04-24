package codegenerator;

import ast.type.Type;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CodeGenerator {

    private PrintWriter out;
    private String outFile;
    private String srcFile;

    private boolean enableComments = true;


    public CodeGenerator(String outputFile, String sourceFile){

        try {
            out = new PrintWriter(outputFile);
            this.outFile = outputFile;
            this.srcFile = sourceFile;

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        writeSource();

    }

    public void ret(int returnBytes, int localBytes, int paramBytes){
        out.write("ret " + returnBytes + "," + localBytes + "," + paramBytes +  "\n");
        out.flush();
    }

    public void enter(int num){
        out.write("enter " + num + "\n");
        out.flush();
    }

    public void label(String label){
        out.write(label +":\n");
        out.flush();
    }

    public void writeSource(){
        out.write("#SOURCE \"" + this.srcFile + "\""+ "\n");
        out.flush();
    }

    public void writeConvertion(String instruction){

        String[] conversions = instruction.split("\n");

        for(String s : conversions){

            switch (s){
                case "b2i": {this.b2i();break;}
                case "i2f": {this.i2f();break;}
                case "f2i": {this.f2i();break;}
                case "i2b": {this.i2b();break;}
            }



        }


    }

    public void push(char c){
        out.write("pushb " + (int)c + "\n");
        out.flush();
    }

    public void push(int i){
        out.write("pushi " + i+ "\n");
        out.flush();
    }

    public void push(double d){
        out.write("pushf " + d+ "\n");
        out.flush();
    }

    public void pushAddress(int i){
        out.write("pusha " + i+ "\n");
        out.flush();
    }

    public void pushBP(){
        out.write("push bp"+ "\n");
        out.flush();
    }

    public void push(Type type, String number){
        out.write("push" + type.suffix() + " " + number+ "\n");
        out.flush();
    }

    public void pop(Type type){
        out.write("pop" + type.suffix()+ "\n");
        out.flush();
    }

    public void dup(Type type){
        out.write("dup" + type.suffix()+ "\n");
        out.flush();
    }

    public void comment(String comment){
        if(enableComments){
            out.write("'" + comment + "\n");
            out.flush();
        }

    }

    public void load(Type type){
        out.write("load" + type.suffix() + "\n");
        out.flush();
    }

    public void store(Type type){
        out.write("store" + type.suffix()+ "\n");
        out.flush();
    }


    //ARITHMETIC INSTRUCTIONS
    /**
     * add[i], addf
     * sub[i], subf
     * mul[i], mulf
     * div[i], divf
     * mod[i]
     * @param type
     * @param operation
     */
    private void arithmetic(Type type, String operation){

        //Si sufijo == 'b' --> no lo usamos, porque sumar chars es sumar integers
        String suffix = type.suffix()=='b' ? "" : ""+type.suffix();
        out.write(operation + suffix+ "\n");
        out.flush();

    }

    public void add(Type type){
        arithmetic(type,"add");
    }

    public void sub(Type type){
        arithmetic(type,"sub");
    }

    public void mul(Type type){
        arithmetic(type,"mul");
    }

    public void div(Type type){
        arithmetic(type,"div");
    }

    public void mod(Type type){
        String suffix = type.suffix()=='i' ? "i" : "";
        out.write("mod" + suffix+ "\n");
        out.flush();
    }


    //LOGICAL OPERATIONS

    public void and(){
        out.write("and"+ "\n");
        out.flush();
    }
    public void or(){
        out.write("or"+ "\n");
        out.flush();
    }
    public void not(){
        out.write("not"+ "\n");
        out.flush();
    }


    //COMPARISON

    /**
     * gt[i], gtf
     * lt[i], ltf
     * ge[i], gef
     * le[i], lef
     * eq[i], eqf
     * ne[i], nef
     * @param type
     * @param comparison
     */
    private void comparison(Type type, String comparison){

        //Si sufijo == 'b' --> no lo usamos, porque sumar chars es sumar integers
        String suffix = type.suffix()=='b' ? "" : ""+type.suffix();
        out.write(comparison + suffix+ "\n");
        out.flush();

    }

    public void gt(Type type){
        comparison(type,"gt");
    }

    public void lt(Type type){
        comparison(type,"lt");
    }

    public void ge(Type type){
        comparison(type,"ge");
    }

    public void le(Type type){
        comparison(type,"le");
    }

    public void eq(Type type){
        comparison(type,"eq");
    }

    public void ne(Type type){
        comparison(type,"ne");
    }


    //Input/Output

    public void out(Type type){
        out.write("out" + type.suffix()+ "\n");
        out.flush();
    }
    public void in(Type type){
        out.write("in" + type.suffix()+ "\n");
        out.flush();
    }

    //Conversion

    public void b2i(){
        out.write("b2i"+ "\n");
        out.flush();
    }

    public void i2f(){
        out.write("i2f"+ "\n");
        out.flush();
    }
    public void f2i(){
        out.write("f2i"+ "\n");
        out.flush();
    }

    public void i2b(){
        out.write("i2b"+ "\n");
        out.flush();
    }

    public void mainProgram(){
        out.write("call main\nhalt\n");
        out.flush();

    }

    public void write(String text){
        out.write(text+ "\n");
        out.flush();
    }

    public void writeLine(int line){
        out.write("#LINE\t" + line+ "\n");
        out.flush();
    }


}
