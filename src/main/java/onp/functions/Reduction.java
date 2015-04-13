package onp.functions;

import java.util.Stack;

/**
 * Created by arturskowronski on 13/04/15.
 */
public class Reduction implements BaseFunction {
    @Override
    public void operate(Stack<Integer> stack) {
        Integer pop = stack.pop();
        Integer pop2 = stack.pop();
        stack.push(pop2 - pop);
    }
}
