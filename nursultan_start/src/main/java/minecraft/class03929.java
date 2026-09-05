/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class03543
 *  minecraft.class04336
 *  minecraft.class04581
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import minecraft.class03543;
import minecraft.class03923;
import minecraft.class03947;
import minecraft.class04336;
import minecraft.class04581;
import org.apache.commons.lang3.mutable.MutableInt;

public class class03929 {
    public static <T> List<class03923> N(List<T> list, Function<T, List<class03543<class04336>>> function, boolean bl) {
        ArrayList<T> arrayList;
        Object object2;
        Object object3;
        ArrayList arrayList2;
        Object object42;
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        MutableInt mutableInt = new MutableInt(0);
        Comparator<class03947> comparator = Comparator.comparingInt(class03947::y).thenComparingInt(class03947::N);
        TreeMap<class03947, Set> treeMap = new TreeMap<class03947, Set>(comparator);
        int n = 0;
        for (Object object42 : list) {
            int n2;
            arrayList2 = Lists.newArrayList();
            object3 = function.apply(object42);
            n = Math.max(n, object3.size());
            for (n2 = 0; n2 < object3.size(); ++n2) {
                for (Object object5 : (class03543)object3.get(n2)) {
                    object2 = (class04336)object5.N();
                    arrayList2.add(new class03947(object2IntOpenHashMap.computeIfAbsent(object2, object -> mutableInt.getAndIncrement()), n2, (class04336)object2));
                }
            }
            for (n2 = 0; n2 < arrayList2.size(); ++n2) {
                arrayList = treeMap.computeIfAbsent((class03947)((Object)arrayList2.get(n2)), class039472 -> new TreeSet(comparator));
                if (n2 >= arrayList2.size() - 1) continue;
                arrayList.add((T)((Object)((class03947)((Object)arrayList2.get(n2 + 1)))));
            }
        }
        TreeSet<class03947> treeSet = new TreeSet<class03947>(comparator);
        object42 = new TreeSet<class03947>(comparator);
        arrayList2 = Lists.newArrayList();
        for (class03947 class039473 : treeMap.keySet()) {
            if (!object42.isEmpty()) {
                throw new IllegalStateException("You somehow broke the universe; DFS bork (iteration finished with non-empty in-progress vertex set");
            }
            if (treeSet.contains((Object)class039473) || !class04581.N(treeMap, (Set)treeSet, (Set)object42, arrayList2::add, (Object)((Object)class039473))) continue;
            if (bl) {
                int n3;
                arrayList = new ArrayList<T>(list);
                do {
                    n3 = arrayList.size();
                    object2 = arrayList.listIterator();
                    while (object2.hasNext()) {
                        Object e = object2.next();
                        object2.remove();
                        try {
                            class03929.N(arrayList, function, false);
                        }
                        catch (IllegalStateException illegalStateException) {
                            continue;
                        }
                        object2.add(e);
                    }
                } while (n3 != arrayList.size());
                throw new IllegalStateException("Feature order cycle found, involved sources: " + String.valueOf(arrayList));
            }
            throw new IllegalStateException("Feature order cycle found");
        }
        Collections.reverse(arrayList2);
        object3 = ImmutableList.builder();
        int n4 = 0;
        while (n4 < n) {
            Object object5;
            int n5 = n4++;
            object5 = arrayList2.stream().filter(class039472 -> class039472.y() == n5).map(class03947::L).collect(Collectors.toList());
            object3.add((Object)new class03923((List<class04336>)object5));
        }
        return object3.build();
    }
}

