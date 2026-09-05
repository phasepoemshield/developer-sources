/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00751
 *  minecraft.class00780
 *  minecraft.class01894
 *  minecraft.class02258
 *  minecraft.class03005
 *  minecraft.class03010
 *  minecraft.class03011
 *  minecraft.class03013
 *  minecraft.class03017
 *  minecraft.class03020
 *  minecraft.class03022
 *  minecraft.class03028
 *  minecraft.class03033
 *  minecraft.class03034
 *  minecraft.class03035
 *  minecraft.class03037
 *  minecraft.class03979
 *  minecraft.class05056
 *  minecraft.class05946
 *  minecraft.class06055
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.List;
import minecraft.class00500;
import minecraft.class00751;
import minecraft.class00780;
import minecraft.class01894;
import minecraft.class02258;
import minecraft.class03005;
import minecraft.class03010;
import minecraft.class03011;
import minecraft.class03013;
import minecraft.class03017;
import minecraft.class03020;
import minecraft.class03022;
import minecraft.class03028;
import minecraft.class03033;
import minecraft.class03034;
import minecraft.class03035;
import minecraft.class03037;
import minecraft.class03979;
import minecraft.class04017;
import minecraft.class04034;
import minecraft.class04036;
import minecraft.class04040;
import minecraft.class04047;
import minecraft.class05056;
import minecraft.class05946;
import minecraft.class06055;

public class class04020 {
    public static final class04017 N = class04020.N(0, false, class02258.field_29314);
    public static final class04017 y = class04020.N(0, true, class02258.field_29314);
    public static final class04017 L = class04020.N(0, true, 6, class02258.field_29314);
    public static final class04017 u = class04020.N(0, true, 30, class02258.field_29314);
    public static final class04017 i = class04020.N(0, false, class02258.field_29313);
    public static final class04017 R = class04020.N(0, true, class02258.field_29313);

    public static class04017 L() {
        return class03035.field_35600;
    }

    public static class03028 i() {
        return class04036.field_35225;
    }

    public static class04017 u() {
        return class03017.field_35260;
    }

    public static class04017 y(int n, int n2) {
        return new class03033(n, n2, true);
    }

    public static class04017 y(class06055 class060552, int n) {
        return new class03022(class060552, n, true);
    }

    public static class04017 y() {
        return class04040.field_35243;
    }

    public static class03028 N(class04017 class040172, class03028 class030282) {
        return new class03013(class040172, class030282);
    }

    public static class04017 N(int n, boolean bl, class02258 class022582) {
        return new class03037(n, bl, 0, class022582);
    }

    public static class04017 N(class05946<class05056> class059462, double d, double d2) {
        return new class03011(class059462, d, d2);
    }

    public static class03028 N(class03028 ... class03028Array) {
        if (class03028Array.length == 0) {
            throw new IllegalArgumentException("Need at least 1 rule for a sequence");
        }
        return new class03010(Arrays.asList(class03028Array));
    }

    public static class03028 N(class00500 class005002) {
        return new class04047(class005002);
    }

    static <A> MapCodec<? extends A> N(class00751<MapCodec<? extends A>> class007512, String string, class03979<? extends A> class039792) {
        return (MapCodec)class00751.N(class007512, (String)string, (Object)class039792.N());
    }

    public static class04034 N(List<class05946<class00780>> list) {
        return new class04034(list);
    }

    @SafeVarargs
    public static class04017 N(class05946<class00780> ... class05946Array) {
        return class04020.N(List.of(class05946Array));
    }

    public static class04017 N(int n, int n2) {
        return new class03033(n, n2, false);
    }

    public static class04017 N(class06055 class060552, int n) {
        return new class03022(class060552, n, false);
    }

    public static class04017 N(class04017 class040172) {
        return new class03034(class040172);
    }

    public static class04017 N() {
        return class03020.field_35254;
    }

    public static class04017 N(String string, class06055 class060552, class06055 class060553) {
        return new class03005(class01894.N((String)string), class060552, class060553);
    }

    public static class04017 N(int n, boolean bl, int n2, class02258 class022582) {
        return new class03037(n, bl, n2, class022582);
    }

    public static class04017 N(class05946<class05056> class059462, double d) {
        return class04020.N(class059462, d, Double.MAX_VALUE);
    }
}

