package onp;

import onp.functions.*;

/**
 * Created by arturskowronski on 13/04/15.
 */
public class FunctionFactory {
    static BaseFunction getFunction(String operation){
        BaseFunction function = null;
        switch(operation){
            case "+":
                function = new Addition();
            break;
            case "-":
                function = new Reduction();
            break;
            case "*":
                function = new Multiplication();
            break;
            case "/":
                function = new Division();
            break;
            case "abs":
                function = new Absolute();
            break;
        }
        return function;
    }
}
