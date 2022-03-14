package errorhandler;

import ast.type.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class EH {

    private static EH instance;
    private List<ErrorType> errors;

    private EH(){
        this.errors = new ArrayList<ErrorType>();
    }


    public static EH getEH(){
        if(instance==null)instance=new EH();

        return instance;
    }


    public void addError(ErrorType error){
        this.errors.add(error);
    }

    public boolean hasErrors(){
        return !errors.isEmpty();
    }

    public void showErrors(PrintStream pst){
        for(ErrorType et : errors){
            pst.println(et.toString());
        }
    }

}
