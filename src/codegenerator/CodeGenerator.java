package codegenerator;

import ast.type.Type;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CodeGenerator {

    private PrintWriter out;
    private String outFile;
    private String srcFile;


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

    public void writeSource(){
        out.write("#surce \"" + this.srcFile + "\"");
        out.flush();
    }

    public void push(char c){
        out.write("pushb " + (int)c);
        out.flush();
    }

    public void push(int i){
        out.write("pushi " + i);
        out.flush();
    }

    public void push(double d){
        out.write("pushf " + d);
        out.flush();
    }

    public void pushAddress(int i){
        out.write("pusha " + i);
        out.flush();
    }

    public void pushBP(){
        out.write("push bp");
        out.flush();
    }

    public void push(Type type){
        out.write("push" + type.suffix());
        out.flush();
    }

    public void pop(Type type){
        out.write("pop" + type.suffix());
        out.flush();
    }

    public void dup(Type type){
        out.write("dup" + type.suffix());
        out.flush();
    }

    public void comment(String comment){
        out.write("'" + comment);
        out.flush();
    }

    public void load(Type type){
        out.write("load" + type.suffix());
        out.flush();
    }

    public void store(Type type){
        out.write("store" + type.suffix());
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
        out.write(operation + suffix);
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
        out.write("mod" + suffix);
        out.flush();
    }


    //LOGICAL OPERATIONS

    public void and(){
        out.write("and");
        out.flush();
    }
    public void or(){
        out.write("or");
        out.flush();
    }
    public void not(){
        out.write("not");
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
        out.write(comparison + suffix);
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
        out.write("out" + type.suffix());
        out.flush();
    }
    public void in(Type type){
        out.write("in" + type.suffix());
        out.flush();
    }

    //Conversion

    public void b2i(){
        out.write("b2i");
        out.flush();
    }

    public void i2f(){
        out.write("i2f");
        out.flush();
    }
    public void f2i(){
        out.write("f2i");
        out.flush();
    }

    public void i2b(){
        out.write("i2b");
        out.flush();
    }

    public void mainProgram(){
        out.write("call main\nhalt\n");
        out.flush();

    }

    public void write(String text){
        out.write(text);
        out.flush();
    }


}
