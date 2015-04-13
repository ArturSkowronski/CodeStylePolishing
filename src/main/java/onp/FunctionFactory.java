package onp;

import onp.functions.*;

import java.util.HashMap;

/**
 * Created by arturskowronski on 13/04/15.
 */
public class FunctionFactory {

    private HashMap<String, BaseFunction> functionRespository = new HashMap<>();

    public FunctionFactory() {
        register(new Addition());
        register(new Reduction());
        register(new Multiplication());
        register(new Division());
        register(new Absolute());
    }

    private void register(BaseFunction function){
        functionRespository.put(function.getOperation(), function);
    }

    public BaseFunction getFunction(String operation){
        BaseFunction function = functionRespository.get(operation);
        if(function == null) throw new IllegalArgumentException("Unssuported Function");
        return function;
    }
}
