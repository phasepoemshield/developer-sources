/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01014
 *  minecraft.class01022
 *  minecraft.class01042
 *  minecraft.class05946
 *  minecraft.class07536
 */
package minecraft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01014;
import minecraft.class01022;
import minecraft.class01042;
import minecraft.class05946;
import minecraft.class07536;

public class class02003<T> {
    private final List<T> N;
    private final List<class01022> y;
    private final class01022 L;

    public class01022 L(T t) {
        int n = this.u(t);
        return this.N(n, this.y.size());
    }

    public class02003(List<T> list) {
        this(list, (List)class07536.N(() -> {
            Object[] objectArray = new class01022[list.size()];
            Arrays.fill(objectArray, class01042.y);
            return Arrays.asList(objectArray);
        }));
    }

    private class02003(List<T> list, List<class01022> list2) {
        this.N = List.copyOf(list);
        this.y = List.copyOf(list2);
        this.L = new class01014(class02003.N(list2.stream())).method_40316();
    }

    private int u(T t) {
        int n = this.N.indexOf(t);
        if (n == -1) {
            throw new IllegalStateException("Can't find " + String.valueOf(t) + " inside " + String.valueOf(this.N));
        }
        return n;
    }

    public class01022 y(T t) {
        int n = this.u(t);
        return this.N(0, n);
    }

    private static Map<class05946<? extends class00751<?>>, class00751<?>> N(Stream<? extends class01042> stream) {
        HashMap hashMap = new HashMap();
        stream.forEach(class010422 -> class010422.method_40311().forEach(class010122 -> {
            if (hashMap.put(class010122.N(), class010122.y()) != null) {
                throw new IllegalStateException("Duplicated registry " + String.valueOf(class010122.N()));
            }
        }));
        return hashMap;
    }

    public class01022 N() {
        return this.L;
    }

    public class01022 N(T t) {
        int n = this.u(t);
        return this.y.get(n);
    }

    private class01022 N(int n, int n2) {
        return new class01014(class02003.N(this.y.subList(n, n2).stream())).method_40316();
    }

    public class02003<T> N(T t, class01022 ... class01022Array) {
        return this.N(t, Arrays.asList(class01022Array));
    }

    public class02003<T> N(T t, List<class01022> list) {
        int n = this.u(t);
        if (list.size() > this.y.size() - n) {
            throw new IllegalStateException("Too many values to replace");
        }
        ArrayList<class01022> arrayList = new ArrayList<class01022>();
        for (int i = 0; i < n; ++i) {
            arrayList.add(this.y.get(i));
        }
        arrayList.addAll(list);
        while (arrayList.size() < this.y.size()) {
            arrayList.add(class01042.y);
        }
        return new class02003<T>(this.N, arrayList);
    }
}

