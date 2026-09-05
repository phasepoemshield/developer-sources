/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap
 */
package kroppeb.stareval.function;

import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import kroppeb.stareval.function.Type;
import kroppeb.stareval.function.TypedFunction;

public class FunctionResolver {
    private final Map<String, Map<Type, List<TypedFunction>>> functions;
    private final Map<String, Map<Type, List<Supplier<? extends TypedFunction>>>> dynamicFunctions;

    public FunctionResolver(Map<String, Map<Type, List<TypedFunction>>> map, Map<String, Map<Type, List<Supplier<? extends TypedFunction>>>> map2) {
        this.functions = map;
        this.dynamicFunctions = map2;
    }

    public List<? extends TypedFunction> resolve(String string, Type type) {
        List<Supplier<? extends TypedFunction>> list;
        Map<Type, List<TypedFunction>> map = this.functions.get(string);
        Map<Type, List<Supplier<? extends TypedFunction>>> map2 = this.dynamicFunctions.get(string);
        List<TypedFunction> list2 = null;
        if (map == null && map2 == null) {
            throw new RuntimeException("No such function: " + string);
        }
        if (map != null) {
            list2 = map.get(type);
        }
        if (map2 != null && (list = map2.get(type)) != null) {
            List list3 = list.stream().map(Supplier::get).collect(Collectors.toList());
            if (list2 == null) {
                list2 = list3;
            } else {
                ArrayList<TypedFunction> arrayList = new ArrayList<TypedFunction>(list2.size() + list3.size());
                arrayList.addAll(list2);
                arrayList.addAll(list3);
                list2 = arrayList;
            }
        }
        if (list2 == null) {
            return Collections.emptyList();
        }
        return list2;
    }

    public void logAllFunctions() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.addAll(this.functions.keySet());
        linkedHashSet.addAll(this.dynamicFunctions.keySet());
        for (String string : linkedHashSet) {
            Map<Type, List<Supplier<? extends TypedFunction>>> map;
            Object2ObjectLinkedOpenHashMap object2ObjectLinkedOpenHashMap = new Object2ObjectLinkedOpenHashMap();
            Map<Type, List<TypedFunction>> map2 = this.functions.get(string);
            if (map2 != null) {
                object2ObjectLinkedOpenHashMap.putAll(map2);
            }
            if ((map = this.dynamicFunctions.get(string)) != null) {
                object2ObjectLinkedOpenHashMap.putAll(map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> ((List)entry.getValue()).stream().map(Supplier::get).collect(Collectors.toList()))));
            }
            for (Map.Entry entry2 : object2ObjectLinkedOpenHashMap.entrySet()) {
                for (TypedFunction typedFunction : (List)entry2.getValue()) {
                    System.out.println(TypedFunction.format(typedFunction, string));
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

