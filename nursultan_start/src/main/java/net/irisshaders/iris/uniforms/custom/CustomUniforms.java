/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  kroppeb.stareval.expression.Expression
 *  kroppeb.stareval.expression.VariableExpression
 *  kroppeb.stareval.function.FunctionContext
 *  kroppeb.stareval.function.FunctionReturn
 *  kroppeb.stareval.function.Type
 *  kroppeb.stareval.resolver.ExpressionResolver
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.uniform.LocationalUniformHolder
 *  net.irisshaders.iris.parsing.IrisFunctions
 */
package net.irisshaders.iris.uniforms.custom;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.expression.VariableExpression;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import kroppeb.stareval.resolver.ExpressionResolver;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.uniform.LocationalUniformHolder;
import net.irisshaders.iris.parsing.IrisFunctions;
import net.irisshaders.iris.uniforms.custom.CustomUniformFixedInputUniformsHolder;
import net.irisshaders.iris.uniforms.custom.CustomUniforms$Builder$Variable;
import net.irisshaders.iris.uniforms.custom.cached.CachedUniform;

public class CustomUniforms
implements FunctionContext {
    private final Map<String, CachedUniform> variables = new Object2ObjectLinkedOpenHashMap();
    private final Map<String, Expression> variablesExpressions = new Object2ObjectLinkedOpenHashMap();
    private final CustomUniformFixedInputUniformsHolder inputHolder;
    private final List<CachedUniform> uniformOrder;
    private final Map<Object, Object2IntMap<CachedUniform>> locationMap = new Object2ObjectOpenHashMap();
    private final Map<CachedUniform, List<CachedUniform>> dependsOn;

    CustomUniforms(CustomUniformFixedInputUniformsHolder customUniformFixedInputUniformsHolder, Map<String, CustomUniforms$Builder$Variable> map) {
        Object object;
        ObjectOpenHashSet objectOpenHashSet;
        CachedUniform cachedUniform22;
        Object object2;
        CustomUniforms$Builder$Variable customUniforms$Builder$Variable22;
        this.inputHolder = customUniformFixedInputUniformsHolder;
        ExpressionResolver expressionResolver = new ExpressionResolver(IrisFunctions.functions, string -> {
            Type type = this.inputHolder.getType((String)string);
            if (type != null) {
                return type;
            }
            CustomUniforms$Builder$Variable customUniforms$Builder$Variable = (CustomUniforms$Builder$Variable)((Object)((Object)((Object)map.get(string))));
            if (customUniforms$Builder$Variable != null) {
                return customUniforms$Builder$Variable.type;
            }
            return null;
        }, true);
        for (CustomUniforms$Builder$Variable customUniforms$Builder$Variable22 : map.values()) {
            try {
                object2 = expressionResolver.resolveExpression(customUniforms$Builder$Variable22.type, customUniforms$Builder$Variable22.expression);
                cachedUniform22 = CachedUniform.forExpression(customUniforms$Builder$Variable22.name, customUniforms$Builder$Variable22.type, (Expression)object2, this);
                this.addVariable((Expression)object2, cachedUniform22);
                if (!customUniforms$Builder$Variable22.uniform) continue;
                objectOpenHashSet = new ArrayList();
                objectOpenHashSet.add(cachedUniform22);
            }
            catch (Exception exception) {
                Iris.logger.warn("Failed to resolve uniform " + customUniforms$Builder$Variable22.name + ", reason: " + exception.getMessage() + " ( = " + String.valueOf(customUniforms$Builder$Variable22.expression) + ")", (Throwable)exception);
            }
        }
        this.dependsOn = new Object2ObjectOpenHashMap();
        Object2ObjectOpenHashMap object2ObjectOpenHashMap = new Object2ObjectOpenHashMap();
        customUniforms$Builder$Variable22 = new Object2IntOpenHashMap();
        for (CachedUniform cachedUniform22 : this.inputHolder.getAll()) {
            object2ObjectOpenHashMap.put(cachedUniform22, new ObjectArrayList());
        }
        for (CachedUniform cachedUniform22 : this.variables.values()) {
            object2ObjectOpenHashMap.put(cachedUniform22, new ObjectArrayList());
        }
        object2 = new FunctionReturn();
        cachedUniform22 = new ObjectOpenHashSet();
        objectOpenHashSet = new ObjectOpenHashSet();
        for (Map.Entry<String, Expression> objectArrayList2 : this.variablesExpressions.entrySet()) {
            VariableExpression variableExpression;
            cachedUniform22.clear();
            objectArrayList2.getValue().listVariables((Collection)((Object)cachedUniform22));
            if (cachedUniform22.isEmpty()) continue;
            object = this.variables.get(objectArrayList2.getKey());
            Object object3 = new ArrayList();
            Iterator iterator = cachedUniform22.iterator();
            while (iterator.hasNext()) {
                variableExpression = (VariableExpression)iterator.next();
                Expression expression = variableExpression.partialEval((FunctionContext)this, (FunctionReturn)object2);
                if (expression instanceof CachedUniform) {
                    object3.add((CachedUniform)((CachedUniform)expression));
                    continue;
                }
                objectOpenHashSet.add(object);
            }
            if (object3.isEmpty()) continue;
            this.dependsOn.put((CachedUniform)object, (List<CachedUniform>)object3);
            customUniforms$Builder$Variable22.put(object, object3.size());
            iterator = object3.iterator();
            while (iterator.hasNext()) {
                variableExpression = (CachedUniform)iterator.next();
                ((List)object2ObjectOpenHashMap.get(variableExpression)).add(object);
            }
        }
        ObjectArrayList objectArrayList3 = new ObjectArrayList();
        ObjectArrayList objectArrayList = new ObjectArrayList();
        for (Object object3 : object2ObjectOpenHashMap.keySet()) {
            if (customUniforms$Builder$Variable22.containsKey(object3)) continue;
            objectArrayList.add(object3);
        }
        while (!objectArrayList.isEmpty()) {
            object = (CachedUniform)objectArrayList.removeLast();
            if (!objectOpenHashSet.contains(object)) {
                objectArrayList3.add(object);
            } else {
                objectOpenHashSet.addAll((Collection)object2ObjectOpenHashMap.get(object));
            }
            for (Iterator iterator : (List)object2ObjectOpenHashMap.get(object)) {
                int n = customUniforms$Builder$Variable22.mergeInt(iterator, -1, Integer::sum);
                assert (n >= 0);
                if (n != 0) continue;
                objectArrayList.add(iterator);
                customUniforms$Builder$Variable22.removeInt(iterator);
            }
        }
        if (!objectOpenHashSet.isEmpty()) {
            Iris.logger.warn("The following uniforms won't work, either because they are broken, or reference a broken uniform: \n" + objectOpenHashSet.stream().map(CachedUniform::getName).collect(Collectors.joining(", ")));
        }
        if (!customUniforms$Builder$Variable22.isEmpty()) {
            throw new IllegalStateException("Circular reference detected between: " + customUniforms$Builder$Variable22.object2IntEntrySet().stream().map(entry -> ((CachedUniform)entry.getKey()).getName() + " (" + entry.getIntValue() + ")").collect(Collectors.joining(", ")));
        }
        this.uniformOrder = objectArrayList3;
    }

    public void update() {
        for (CachedUniform cachedUniform : this.uniformOrder) {
            cachedUniform.update();
        }
    }

    public void push(Object object) {
        Object2IntMap<CachedUniform> object2IntMap = this.locationMap.get(object);
        if (object2IntMap != null) {
            object2IntMap.forEach(CachedUniform::pushIfChanged);
        }
    }

    public void mapholderToPass(LocationalUniformHolder locationalUniformHolder, Object object) {
        this.locationMap.put(object, this.locationMap.remove(locationalUniformHolder));
    }

    public Expression getVariable(String string) {
        CachedUniform cachedUniform = this.inputHolder.getUniform(string);
        if (cachedUniform != null) {
            return cachedUniform;
        }
        CachedUniform cachedUniform2 = this.variables.get(string);
        if (cachedUniform2 != null) {
            return cachedUniform2;
        }
        throw new RuntimeException("Unknown variable: " + string);
    }

    public boolean hasVariable(String string) {
        return this.inputHolder.containsKey(string) || this.variables.containsKey(string);
    }

    /*
     * WARNING - void declaration
     */
    public void optimise() {
        void var3_7;
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        for (List<CachedUniform> object2IntMap : this.dependsOn.values()) {
            for (Object object2 : object2IntMap) {
                object2IntOpenHashMap.mergeInt(object2, 1, Integer::sum);
            }
        }
        for (Object2IntMap object2IntMap : this.locationMap.values()) {
            for (Object object2 : object2IntMap.keySet()) {
                object2IntOpenHashMap.mergeInt(object2, 1, Integer::sum);
            }
        }
        ObjectOpenHashSet objectOpenHashSet = new ObjectOpenHashSet();
        int n2 = this.uniformOrder.size() - 1;
        while (var3_7 >= 0) {
            Object object = this.uniformOrder.get((int)var3_7);
            if (!object2IntOpenHashMap.containsKey(object)) {
                Object object2;
                objectOpenHashSet.add(object);
                object2 = this.dependsOn.get(object);
                if (object2 != null) {
                    Iterator iterator = object2.iterator();
                    while (iterator.hasNext()) {
                        CachedUniform cachedUniform2 = (CachedUniform)iterator.next();
                        object2IntOpenHashMap.computeIntIfPresent((Object)cachedUniform2, (cachedUniform, n) -> n - 1);
                    }
                }
            }
            --var3_7;
        }
        this.uniformOrder.removeAll((Collection<?>)objectOpenHashSet);
    }

    public void assignTo(LocationalUniformHolder locationalUniformHolder) {
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        for (CachedUniform cachedUniform : this.uniformOrder) {
            try {
                OptionalInt optionalInt = locationalUniformHolder.location(cachedUniform.getName(), Type.convert((Type)cachedUniform.getType()));
                if (!optionalInt.isPresent()) continue;
                object2IntOpenHashMap.put((Object)cachedUniform, optionalInt.getAsInt());
            }
            catch (Exception exception) {
                throw new RuntimeException(cachedUniform.getName(), exception);
            }
        }
        this.locationMap.put(locationalUniformHolder, (Object2IntMap<CachedUniform>)object2IntOpenHashMap);
    }

    private void addVariable(Expression expression, CachedUniform cachedUniform) throws Exception {
        String string = cachedUniform.getName();
        if (this.variables.containsKey(string)) {
            throw new Exception("Duplicated variable: " + string);
        }
        if (this.inputHolder.containsKey(string)) {
            throw new Exception("Variable shadows build in uniform: " + string);
        }
        this.variables.put(string, cachedUniform);
        this.variablesExpressions.put(string, expression);
    }
}

