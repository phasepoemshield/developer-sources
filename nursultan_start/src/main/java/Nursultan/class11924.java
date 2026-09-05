/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
package Nursultan;

import Nursultan.class11906;
import Nursultan.class11909;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class class11924 {
    private static String[] L;
    public static Object N_0;

    private static void M() {
        class11924.N(class11909.staticFields_0d98e95695d6732fd9192964e161ca232_0, Pair.of((Object)1001, (Object)1001));
    }

    private class11924() {
        throw new UnsupportedOperationException(L[0]);
    }

    static {
        class11924.u();
        class11924.i();
        N_0 = new ArrayList();
        class11924.M();
        class11924.R();
    }

    private static void i() {
    }

    private static void u() {
        L = new String[1];
        class11924.L[0] = "This is a utility class and cannot be instantiated";
    }

    public static Iterable<class11906> y() {
        return (List)N_0;
    }

    @SafeVarargs
    private static void N(class11909 class119092, Pair<Integer, Integer> ... pairArray) {
        for (Pair<Integer, Integer> pair : pairArray) {
            for (int i = ((Integer)pair.getFirst()).intValue(); i <= (Integer)pair.getSecond(); ++i) {
                ((List)N_0).add(new class11906(class119092, pair, i));
            }
        }
    }

    public static Stream<class11906> N() {
        return ((List)N_0).stream();
    }

    private static void R() {
        class11924.N(class11909.staticFields_0d98e95695d6732fd9192964e161ca232_1, Pair.of((Object)101, (Object)115), Pair.of((Object)201, (Object)236), Pair.of((Object)301, (Object)325), Pair.of((Object)501, (Object)516), Pair.of((Object)901, (Object)904));
    }
}

