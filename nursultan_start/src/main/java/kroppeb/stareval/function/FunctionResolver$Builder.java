/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
package kroppeb.stareval.function;

import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import kroppeb.stareval.function.FunctionResolver;
import kroppeb.stareval.function.Type;
import kroppeb.stareval.function.TypedFunction;

public class FunctionResolver$Builder {
    private final Map<String, List<TypedFunction>> functions = new Object2ObjectLinkedOpenHashMap();
    private final Map<String, Map<Type, List<Supplier<? extends TypedFunction>>>> dynamicFunctions = new Object2ObjectLinkedOpenHashMap();

    public <T extends TypedFunction> void add(String string, T t) {
        this.addFunction(string, t);
    }

    public FunctionResolver build() {
        Object2ObjectLinkedOpenHashMap object2ObjectLinkedOpenHashMap = new Object2ObjectLinkedOpenHashMap();
        for (Map.Entry<String, List<TypedFunction>> entry : this.functions.entrySet()) {
            Object2ObjectLinkedOpenHashMap object2ObjectLinkedOpenHashMap2 = new Object2ObjectLinkedOpenHashMap();
            for (TypedFunction typedFunction : entry.getValue()) {
                object2ObjectLinkedOpenHashMap2.computeIfAbsent(typedFunction.getReturnType(), type -> new ObjectArrayList()).add(typedFunction);
            }
            object2ObjectLinkedOpenHashMap.put(entry.getKey(), object2ObjectLinkedOpenHashMap2);
        }
        return new FunctionResolver((Map<String, Map<Type, List<TypedFunction>>>)object2ObjectLinkedOpenHashMap, this.dynamicFunctions);
    }

    public void addDynamicFunction(String string2, Type type2, Supplier<? extends TypedFunction> supplier) {
        this.dynamicFunctions.computeIfAbsent(string2, string -> new Object2ObjectLinkedOpenHashMap()).computeIfAbsent(type2, type -> new ObjectArrayList()).add(supplier);
    }

    public void addFunction(String string2, TypedFunction typedFunction) {
        this.functions.computeIfAbsent(string2, string -> new ObjectArrayList()).add(typedFunction);
    }

    public <T extends TypedFunction> void addDynamic(String string, Type type, Supplier<T> supplier) {
        this.addDynamicFunction(string, type, supplier);
    }
}

