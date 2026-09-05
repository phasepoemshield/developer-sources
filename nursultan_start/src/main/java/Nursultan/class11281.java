/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11297
 *  Nursultan.class11328
 *  minecraft.class00743
 *  minecraft.class02834
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07043
 *  minecraft.class07085
 *  minecraft.class08044
 */
package Nursultan;

import Nursultan.class11297;
import Nursultan.class11328;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;
import minecraft.class00743;
import minecraft.class02834;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07043;
import minecraft.class07085;
import minecraft.class08044;

public class class11281 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;

    public static Stream<class11297> L(class06581 class065812) {
        return class11281.i(class11328.N((class06581)class065812));
    }

    public static int L(int n) {
        if (!class11281.y(n)) {
            return class11281.u(n) ? n + 36 : n;
        }
        return -1;
    }

    public static Stream<class11297> L(class11328 class113282) {
        Objects.requireNonNull((class04453)((class06202)class11281.N_0).T_4);
        ArrayList<class11297> arrayList = new ArrayList<class11297>();
        class00743 var2 = ((class04453)((class06202)class11281.N_0).T_4).method_31548().u();
        for (int i = 0; i < var2.size(); ++i) {
            class06584 class065842 = (class06584)var2.get(i);
            if (!class113282.test((Object)class065842)) continue;
            arrayList.add(new class11297(class065842, i));
        }
        return arrayList.stream();
    }

    public static int M(class11328 class113282) {
        Objects.requireNonNull((class04453)((class06202)class11281.N_0).T_4);
        int n = 0;
        for (class06584 class065842 : ((class04453)((class06202)class11281.N_0).T_4).method_31548().u()) {
            if (!class113282.test((Object)class065842)) continue;
            n += class065842.c();
        }
        return n;
    }

    private class11281() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class11281.u();
        N_0 = class06202.Nq();
    }

    public static Stream<class11297> i(class11328 class113282) {
        Objects.requireNonNull((class04453)((class06202)class11281.N_0).T_4);
        ArrayList<class11297> arrayList = new ArrayList<class11297>();
        class00743 var2 = ((class04453)((class06202)class11281.N_0).T_4).method_31548().u();
        for (int i = 0; i < 9; ++i) {
            class06584 class065842 = (class06584)var2.get(i);
            if (!class113282.test((Object)class065842)) continue;
            arrayList.add(new class11297(class065842, i));
        }
        return arrayList.stream();
    }

    public static Stream<class11297> i(class06581 class065812) {
        return class11281.L(class11328.N((class06581)class065812));
    }

    private static void u() {
        N_0 = null;
        N_1 = -1;
        N_2 = 9;
    }

    public static int u(class06581 class065812) {
        return class11281.M(class11328.N((class06581)class065812));
    }

    public static boolean u(int n) {
        return n < 9 && n >= 0;
    }

    public static boolean u(class11328 class113282) {
        Objects.requireNonNull((class04453)((class06202)class11281.N_0).T_4);
        for (class07085 class070852 : class02834.field_49224) {
            class06584 class065842;
            if (class070852.N() != class07043.field_6178 || !class113282.test((Object)(class065842 = ((class04453)((class06202)class11281.N_0).T_4).method_6118(class070852)))) continue;
            return true;
        }
        return false;
    }

    public static boolean y(int n) {
        return n == -1;
    }

    public static int y(class11328 class113282) {
        Objects.requireNonNull((class04453)((class06202)class11281.N_0).T_4);
        class08044 class080442 = ((class04453)((class06202)class11281.N_0).T_4).method_31548();
        for (int i = 0; i < 9; ++i) {
            if (!class113282.test((Object)class080442.method_5438(i))) continue;
            return i;
        }
        return -1;
    }

    public static boolean y(class06581 class065812) {
        return class11281.u(class11328.N((class06581)class065812));
    }

    public static boolean y() {
        Objects.requireNonNull((class04453)((class06202)class11281.N_0).T_4);
        return ((class04453)((class06202)class11281.N_0).T_4).method_31548().u().stream().allMatch(class06584::R);
    }

    public static boolean N() {
        Objects.requireNonNull((class04453)((class06202)class11281.N_0).T_4);
        return ((class04453)((class06202)class11281.N_0).T_4).method_31548().u().stream().noneMatch(class06584::R);
    }

    public static class11297 N(class11328 class113282) {
        Objects.requireNonNull((class04453)((class06202)class11281.N_0).T_4);
        Optional<class11297> var1 = class11281.L(class113282).findFirst();
        if (var1.isEmpty()) {
            return null;
        }
        class11297 class112972 = var1.get();
        if (class112972.N().R() || ((class04453)((class06202)class11281.N_0).T_4).method_7357().N(class112972.N())) {
            return null;
        }
        return class112972;
    }

    public static OptionalInt N(int n) {
        return n == -1 ? OptionalInt.empty() : OptionalInt.of(n);
    }

    public static int N(class06581 class065812) {
        return class11281.R(class11328.N((class06581)class065812));
    }

    public static int R(class06581 class065812) {
        return class11281.y(class11328.N((class06581)class065812));
    }

    public static int R(class11328 class113282) {
        Objects.requireNonNull((class04453)((class06202)class11281.N_0).T_4);
        class00743 var1 = ((class04453)((class06202)class11281.N_0).T_4).method_31548().u();
        for (int i = 0; i < var1.size(); ++i) {
            if (!class113282.test((Object)((class06584)var1.get(i)))) continue;
            return i;
        }
        return -1;
    }
}

