/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.Iris
 */
package net.irisshaders.iris.shaderpack.parsing;

import java.util.EmptyStackException;
import java.util.Stack;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.shaderpack.option.values.OptionValues;
import net.irisshaders.iris.shaderpack.parsing.BooleanParser$Operation;

public class BooleanParser {
    private static void evaluate(Stack<BooleanParser$Operation> stack, Stack<Boolean> stack2, boolean bl) {
        boolean bl2 = stack2.pop();
        while (!(stack.isEmpty() || bl && stack.peek() == BooleanParser$Operation.OPEN)) {
            bl2 = stack.pop().compute(bl2, stack2);
        }
        if (!stack.isEmpty() && stack.peek() == BooleanParser$Operation.OPEN) {
            stack.pop();
            if (!stack.isEmpty() && stack.peek() == BooleanParser$Operation.NOT) {
                bl2 = stack.pop().compute(bl2, stack2);
            }
        }
        stack2.push(bl2);
    }

    public static boolean parse(String string, OptionValues optionValues) {
        try {
            int n;
            StringBuilder stringBuilder = new StringBuilder();
            Stack<BooleanParser$Operation> stack = new Stack<BooleanParser$Operation>();
            Stack<Boolean> stack2 = new Stack<Boolean>();
            block10: for (n = 0; n < string.length(); n += 1) {
                char c = string.charAt(n);
                switch (c) {
                    case '!': {
                        stack.push(BooleanParser$Operation.NOT);
                        continue block10;
                    }
                    case '&': {
                        if (!stringBuilder.isEmpty()) {
                            stack2.push(BooleanParser.processValue(stringBuilder.toString(), optionValues, stack));
                            stringBuilder = new StringBuilder();
                        }
                        if (stack.isEmpty() || !stack.peek().equals((Object)BooleanParser$Operation.AND)) {
                            stack.push(BooleanParser$Operation.OPEN);
                        }
                        n += 1;
                        stack.push(BooleanParser$Operation.AND);
                        continue block10;
                    }
                    case '|': {
                        if (!stringBuilder.isEmpty()) {
                            stack2.push(BooleanParser.processValue(stringBuilder.toString(), optionValues, stack));
                            stringBuilder = new StringBuilder();
                        }
                        if (!stack.isEmpty() && stack.peek().equals((Object)BooleanParser$Operation.AND)) {
                            BooleanParser.evaluate(stack, stack2, true);
                        }
                        n += 1;
                        stack.push(BooleanParser$Operation.OR);
                        continue block10;
                    }
                    case '(': {
                        stack.push(BooleanParser$Operation.OPEN);
                        continue block10;
                    }
                    case ')': {
                        if (!stringBuilder.isEmpty()) {
                            stack2.push(BooleanParser.processValue(stringBuilder.toString(), optionValues, stack));
                            stringBuilder = new StringBuilder();
                        }
                        if (!stack.isEmpty() && stack.peek().equals((Object)BooleanParser$Operation.AND)) {
                            BooleanParser.evaluate(stack, stack2, true);
                        }
                        BooleanParser.evaluate(stack, stack2, true);
                        continue block10;
                    }
                    case ' ': {
                        continue block10;
                    }
                    default: {
                        stringBuilder.append(c);
                    }
                }
            }
            if (!stringBuilder.isEmpty()) {
                stack2.push(BooleanParser.processValue(stringBuilder.toString(), optionValues, stack));
            }
            BooleanParser.evaluate(stack, stack2, false);
            n = stack2.pop().booleanValue() ? 1 : 0;
            if (!stack2.isEmpty() || !stack.isEmpty()) {
                Iris.logger.warn("Failed to parse the following boolean operation correctly, stacks not empty, defaulting to true!: '{}'", new Object[]{string});
                return true;
            }
            return n != 0;
        }
        catch (EmptyStackException emptyStackException) {
            Iris.logger.warn("Failed to parse the following boolean operation correctly, stacks empty when it shouldn't, defaulting to true!: '{}'", new Object[]{string});
            return true;
        }
    }

    private static boolean processValue(String string, OptionValues optionValues, Stack<BooleanParser$Operation> stack) {
        boolean bl;
        switch (string) {
            case "true": 
            case "1": {
                boolean bl2 = true;
                break;
            }
            case "false": 
            case "0": {
                boolean bl2 = false;
                break;
            }
            default: {
                boolean bl2 = bl = optionValues != null && optionValues.getBooleanValueOrDefault(string);
            }
        }
        if (!stack.isEmpty() && stack.peek() == BooleanParser$Operation.NOT) {
            stack.pop();
            return !bl;
        }
        return bl;
    }
}

