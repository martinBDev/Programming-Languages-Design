package codegenerator;

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

}
