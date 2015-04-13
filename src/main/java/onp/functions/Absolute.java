package onp.functions;

import java.util.Stack;

import static java.lang.StrictMath.abs;

/**
 * Created by arturskowronski on 13/04/15.
 */
public class Absolute implements BaseFunction{
    @Override
    public void operate(Stack<Integer> stack) {
        Integer pop = stack.pop();
        stack.push(abs(pop));
    }


}
