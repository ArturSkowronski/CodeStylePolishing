package onp;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by arturskowronski on 13/04/15.
 */
public class ReversePolishNotationParserImpl implements ReversePolishNotationParser {

    FunctionFactory functionFactory = new FunctionFactory();

    @Override
    public int calculateExpressionValue(String expression) {
        if(expression==null){
            throw new IllegalArgumentException("Elements cannot be null");
        }

        Stack<Integer> stack = new Stack<>();

        Arrays.stream(expression.split(" ")).forEach(item -> {
            if(NumberUtils.isNumber(item)){
                stack.push(Integer.parseInt(item));
            } else {
                functionFactory.getFunction(item).operate(stack);
            }
        }
        );
        return stack.pop();
    }
}
