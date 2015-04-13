package onp;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by arturskowronski on 13/04/15.
 */
public class ReversePolishNotationParserImpl implements ReversePolishNotationParser {

    @Override
    public int calculateExpressionValue(String expression) {
        if(expression==null){
            throw new IllegalArgumentException("Elements cannot be null");
        }

        Stack<Integer> stack = new Stack<>();

        Arrays.stream(expression.split(" ")).forEach(item -> {
            if(StringUtils.isNumeric(item)){
                stack.push(Integer.parseInt(item));
            } else {
                FunctionFactory.getFunction(item).operate(stack);
            }
        }
        );
        return stack.pop();
    }
}
