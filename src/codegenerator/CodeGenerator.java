package codegenerator;

import ast.type.Type;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CodeGenerator {

    private PrintWriter out;
    private String outFile;
    private String srcFile;

    private int labelCounter;

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

    public void writeArithmetic(String operator, Type arithmeticType){

        switch (operator){

            case "+": {add(arithmeticType); break;}
            case "-": {sub(arithmeticType); break;}
            case "/": {div(arithmeticType); break;}
            case "*": {mul(arithmeticType); break;}
            case "%": {mod(arithmeticType); break;}
        }

    }

    public void comparison(String operand, Type comparisonLeftType){

        switch(operand){
            case "<": {lt(comparisonLeftType); break;}
            case ">": {gt(comparisonLeftType); break;}
            case "<=": {le(comparisonLeftType); break;}
            case ">=": {ge(comparisonLeftType); break; }
            case "==": {eq(comparisonLeftType); break; }
            case "!=": {ne(comparisonLeftType); break; }
        }

    }

    public void call(String funcName){
        out.write("\tcall " + funcName + "\n");
        out.flush();
    }

    public int getLabelCounter(){
        return labelCounter++;
    }

    public void label(int id){
        out.write("\tlabel_" + id + ":" + "\n");
        out.flush();
    }

    public void ret(int returnBytes, int localBytes, int paramBytes){
        out.write("\tret " + returnBytes + "," + localBytes + "," + paramBytes +  "\n");
        out.flush();
    }

    public void enter(int num){
        out.write("\tenter " + num + "\n");
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
        out.write("\tpushb " + (int)c + "\n");
        out.flush();
    }

    public void push(int i){
        out.write("\tpushi " + i+ "\n");
        out.flush();
    }

    public void push(double d){
        out.write("\tpushf " + d+ "\n");
        out.flush();
    }

    public void pushAddress(int i){
        out.write("\tpusha " + i+ "\n");
        out.flush();
    }

    public void pushBP(){
        out.write("\tpush bp"+ "\n");
        out.flush();
    }

    public void push(Type type, String number){
        out.write("\tpush" + type.suffix() + " " + number+ "\n");
        out.flush();
    }

    public void pop(Type type){
        out.write("\tpop" + type.suffix()+ "\n");
        out.flush();
    }

    public void dup(Type type){
        out.write("\tdup" + type.suffix()+ "\n");
        out.flush();
    }

    public void comment(String comment){
        if(enableComments){
            out.write("'" + comment + "\n");
            out.flush();
        }

    }

    public void load(Type type){
        out.write("\tload" + type.suffix() + "\n");
        out.flush();
    }

    public void store(Type type){
        out.write("\tstore" + type.suffix()+ "\n");
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
        out.write("\t"+operation + suffix+ "\n");
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
        out.write("\tmod" + suffix+ "\n");
        out.flush();
    }


    //LOGICAL OPERATIONS

    public void and(){
        out.write("\tand"+ "\n");
        out.flush();
    }
    public void or(){
        out.write("\tor"+ "\n");
        out.flush();
    }
    public void not(){
        out.write("\tnot"+ "\n");
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
        out.write("\t"+comparison + suffix+ "\n");
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
        out.write("\tout" + type.suffix()+ "\n");
        out.flush();
    }
    public void in(Type type){
        out.write("\tin" + type.suffix()+ "\n");
        out.flush();
    }

    //Conversion

    public void b2i(){
        out.write("\tb2i"+ "\n");
        out.flush();
    }

    public void i2f(){
        out.write("\ti2f"+ "\n");
        out.flush();
    }
    public void f2i(){
        out.write("\tf2i"+ "\n");
        out.flush();
    }

    public void i2b(){
        out.write("\ti2b"+ "\n");
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
        out.write("#line\t" + line + "\n");
        out.flush();
    }

    public void jz(String label){
        out.write("\tjz "+ label+"\n");
        out.flush();
    }

    public void jmp(String label){
        out.write("\tjmp "+ label+"\n");
        out.flush();
    }


}
