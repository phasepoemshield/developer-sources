/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  java.lang.runtime.SwitchBootstraps
 */
package kroppeb.stareval.resolver;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import kroppeb.stareval.element.ExpressionElement;
import kroppeb.stareval.element.token.IdToken;
import kroppeb.stareval.element.token.NumberToken;
import kroppeb.stareval.element.tree.AccessExpressionElement;
import kroppeb.stareval.element.tree.BinaryExpressionElement;
import kroppeb.stareval.element.tree.FunctionCall;
import kroppeb.stareval.element.tree.UnaryExpressionElement;
import kroppeb.stareval.expression.CallExpression;
import kroppeb.stareval.expression.ConstantExpression;
import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.function.FunctionResolver;
import kroppeb.stareval.function.Type;
import kroppeb.stareval.function.TypedFunction;
import kroppeb.stareval.function.TypedFunction$Parameter;
import kroppeb.stareval.resolver.ExpressionResolver$1;
import kroppeb.stareval.resolver.ExpressionResolver$2;
import kroppeb.stareval.resolver.ExpressionResolver$3;
import kroppeb.stareval.resolver.ExpressionResolver$4;

public class ExpressionResolver {
    private final FunctionResolver functionResolver;
    private final Function<String, Type> variableTypeMap;
    private final boolean enableDebugging;
    private final Map<String, ConstantExpression> numbers = new Object2ObjectOpenHashMap();
    private List<String> logs;

    public ExpressionResolver(FunctionResolver functionResolver, Function<String, Type> function) {
        this(functionResolver, function, false);
    }

    public ExpressionResolver(FunctionResolver functionResolver, Function<String, Type> function, boolean bl) {
        this.functionResolver = functionResolver;
        this.variableTypeMap = function;
        this.enableDebugging = bl;
    }

    private void log(String string, Object ... objectArray) {
        if (this.enableDebugging) {
            this.logs.add(String.format(string, objectArray));
        }
    }

    private void log(String string) {
        if (this.enableDebugging) {
            this.logs.add(string);
        }
    }

    private void log(Supplier<String> supplier) {
        if (this.enableDebugging) {
            this.log(supplier.get());
        }
    }

    private Expression resolveCallExpression(Type type, String string, List<? extends ExpressionElement> list, boolean bl, boolean bl2) {
        this.log("[DEBUG] resolving function %s with args %s to type %s", string, list, type);
        Expression expression = null;
        if (bl) {
            expression = this.resolveCallExpressionInternal(type, string, list, false);
        }
        if (expression != null) {
            this.log("[DEBUG] resolved function %s with args %s to type %s directly", string, list, type);
            return expression;
        }
        if (!bl2) {
            this.log("[DEBUG] Failed to resolve function %s with args %s to type %s directly", string, list, type);
            return null;
        }
        List<? extends TypedFunction> list2 = this.functionResolver.resolve("<cast>", type);
        for (TypedFunction typedFunction : list2) {
            Expression expression2 = this.resolveCallExpression(typedFunction.getParameters()[0].type(), string, list, true, true);
            if (expression2 == null) continue;
            if (expression != null) {
                throw new RuntimeException("Ambiguity");
            }
            expression = new CallExpression(typedFunction, new Expression[]{expression2});
        }
        if (expression != null) {
            this.log("[DEBUG] resolved function %s with args %s to type %s using only final cast", string, list, type);
            return expression;
        }
        expression = this.resolveCallExpressionInternal(type, string, list, true);
        if (expression != null) {
            this.log("[DEBUG] resolved function %s with args %s to type %s using implicit inner casts", string, list, type);
        } else {
            this.log("[DEBUG] failed to resolve function %s with args %s to type %s", string, list, type);
        }
        return expression;
    }

    private Expression resolveExpressionInternal(Type type, ExpressionElement expressionElement, boolean bl, boolean bl2) {
        Type type2;
        Object object;
        this.log("[DEBUG] resolving %s to type %s (%d%d)", expressionElement, type, bl ? 1 : 0, bl2 ? 1 : 0);
        Object object2 = expressionElement;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{UnaryExpressionElement.class, BinaryExpressionElement.class, FunctionCall.class, AccessExpressionElement.class, NumberToken.class, IdToken.class}, (Object)object2, (int)n)) {
            case 0: {
                UnaryExpressionElement unaryExpressionElement = (UnaryExpressionElement)object2;
                return this.resolveCallExpression(type, unaryExpressionElement.op().name(), Collections.singletonList(unaryExpressionElement.inner()), bl, bl2);
            }
            case 1: {
                BinaryExpressionElement binaryExpressionElement = (BinaryExpressionElement)object2;
                return this.resolveCallExpression(type, binaryExpressionElement.op().name(), Arrays.asList(binaryExpressionElement.left(), binaryExpressionElement.right()), bl, bl2);
            }
            case 2: {
                FunctionCall functionCall = (FunctionCall)object2;
                return this.resolveCallExpression(type, functionCall.id(), functionCall.args(), bl, bl2);
            }
            case 3: {
                AccessExpressionElement accessExpressionElement = (AccessExpressionElement)object2;
                return this.resolveCallExpression(type, "<access$" + accessExpressionElement.index() + ">", Collections.singletonList(accessExpressionElement.base()), bl, bl2);
            }
            case 4: {
                NumberToken numberToken = (NumberToken)object2;
                Object object3 = this.resolveNumber(numberToken.getNumber());
                if (((ConstantExpression)object3).getType().equals(type)) {
                    this.log("[DEBUG] resolved constant %s to type %s", numberToken.getNumber(), type);
                    return object3;
                }
                if (!bl2) {
                    this.log("[DEBUG] failed to resolve constant %s (of type %s) to type %s without implicit casts", numberToken.getNumber(), ((ConstantExpression)object3).getType(), type);
                    return null;
                }
                this.log("[DEBUG] trying implicit casts to resolve constant %s (of type %s) to type %s", numberToken.getNumber(), ((ConstantExpression)object3).getType(), type);
                object = object3;
                type2 = ((ConstantExpression)object3).getType();
                break;
            }
            case 5: {
                Object object3 = (IdToken)object2;
                String string = ((IdToken)object3).getId();
                Type type3 = this.variableTypeMap.apply(string);
                if (type3 == null) {
                    throw new RuntimeException("Unknown variable: " + string);
                }
                if (type3.equals(type)) {
                    this.log("[DEBUG] resolved variable %s to type %s", string, type);
                    return new ExpressionResolver$1(this, string);
                }
                if (!bl2) {
                    this.log("[DEBUG] failed to resolve variable %s (of type %s) to type %s without implicit casts", string, type3, type);
                    return null;
                }
                object = new ExpressionResolver$2(this, string);
                type2 = type3;
                break;
            }
            default: {
                throw new RuntimeException("unexpected token: " + expressionElement.toString());
            }
        }
        object2 = this.functionResolver.resolve("<cast>", type);
        Iterator iterator = object2.iterator();
        while (iterator.hasNext()) {
            TypedFunction typedFunction = (TypedFunction)iterator.next();
            if (!typedFunction.getParameters()[0].type().equals(type2)) continue;
            this.log("[DEBUG] resolved %s to type %s using implicit casts", expressionElement, type);
            return new CallExpression(typedFunction, new Expression[]{object});
        }
        this.log("[DEBUG] failed to resolved %s to type %s, even using implicit casts", expressionElement, type);
        return null;
    }

    public void clearLogs() {
        this.logs = new ArrayList<String>();
    }

    Expression resolveCallExpressionInternal(Type type, String string, List<? extends ExpressionElement> list, boolean bl) {
        int n = list.size();
        CallExpression callExpression = null;
        TypedFunction typedFunction = null;
        block0: for (TypedFunction typedFunction2 : this.functionResolver.resolve(string, type)) {
            TypedFunction$Parameter[] typedFunction$ParameterArray = typedFunction2.getParameters();
            if (typedFunction$ParameterArray.length != n) continue;
            Expression[] expressionArray = new Expression[n];
            for (int i = 0; i < n; ++i) {
                ExpressionElement expressionElement = list.get(i);
                TypedFunction$Parameter typedFunction$Parameter = typedFunction$ParameterArray[i];
                if (typedFunction$Parameter.constant() && !(expressionElement instanceof NumberToken)) continue block0;
                Expression expression = this.resolveExpressionInternal(typedFunction$Parameter.type(), expressionElement, !bl || n > 1, bl);
                if (expression == null) continue block0;
                expressionArray[i] = expression;
            }
            if (callExpression != null && typedFunction2.priority() == typedFunction.priority()) {
                throw new RuntimeException("Ambiguity, \n\told: " + TypedFunction.format(typedFunction, "") + "\n\tnew: " + TypedFunction.format(typedFunction2, ""));
            }
            if (typedFunction != null && typedFunction2.priority() < typedFunction.priority()) continue;
            callExpression = new CallExpression(typedFunction2, expressionArray);
            typedFunction = typedFunction2;
        }
        return callExpression;
    }

    public Expression resolveExpression(Type type, ExpressionElement expressionElement) {
        this.clearLogs();
        Expression expression = this.resolveExpressionInternal(type, expressionElement, true, true);
        if (expression != null) {
            return expression;
        }
        throw new RuntimeException("Couldn't resolve: \n" + String.join((CharSequence)"\n", this.extractLogs()));
    }

    public List<String> extractLogs() {
        List<String> list = this.logs;
        this.clearLogs();
        return list;
    }

    private ConstantExpression resolveNumber(String string2) {
        return this.numbers.computeIfAbsent(string2, string -> {
            try {
                int n;
                if (string.length() >= 2 && string.charAt(0) == '0') {
                    switch (string.charAt(1)) {
                        case 'b': {
                            n = Integer.parseInt(string.substring(2), 2);
                            break;
                        }
                        case 'x': {
                            n = Integer.parseInt(string.substring(2), 16);
                            break;
                        }
                        default: {
                            n = Integer.parseInt(string.substring(1), 8);
                            break;
                        }
                    }
                } else {
                    n = Integer.parseInt(string);
                }
                return new ExpressionResolver$3(this, Type.Int, n);
            }
            catch (NumberFormatException numberFormatException) {
                NumberFormatException numberFormatException2 = numberFormatException;
                try {
                    float f = Float.parseFloat(string);
                    return new ExpressionResolver$4(this, Type.Float, f);
                }
                catch (NumberFormatException numberFormatException3) {
                    RuntimeException runtimeException = new RuntimeException("Illegal number: " + string, numberFormatException3);
                    runtimeException.addSuppressed(numberFormatException2);
                    throw runtimeException;
                }
            }
        });
    }
}

