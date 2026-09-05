/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 */
package kroppeb.stareval.function;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.function.FunctionContext;

public class BasicFunctionContext
implements FunctionContext {
    private final Map<String, Expression> variables = new Object2ObjectOpenHashMap();

    @Override
    public Expression getVariable(String string) {
        Expression expression = this.variables.get(string);
        if (expression == null) {
            throw new RuntimeException("Variable hasn't been set: " + string);
        }
        return expression;
    }

    @Override
    public boolean hasVariable(String string) {
        return this.variables.containsKey(string);
    }

    public void setIntVariable(String string, int n) {
        this.setVariable(string, (functionContext, functionReturn) -> {
            functionReturn.intReturn = n;
        });
    }

    public void setFloatVariable(String string, float f) {
        this.setVariable(string, (functionContext, functionReturn) -> {
            functionReturn.floatReturn = f;
        });
    }

    public void setVariable(String string, Expression expression) {
        this.variables.put(string, expression);
    }
}

