/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class01343
 *  minecraft.class01894
 *  minecraft.class05388
 *  minecraft.class05403
 *  minecraft.class08819
 */
package minecraft;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class00891;
import minecraft.class01343;
import minecraft.class01894;
import minecraft.class05388;
import minecraft.class05403;
import minecraft.class05433;
import minecraft.class08819;

public class class05428 {
    public static final class01343 N = class05428.N(class05388::N, class05433.L);
    public static final class01343 y = class05428.N(class05388::N, class05433.u);
    public static final class01343 L = class05428.N(class05388::N, class05433.i);
    public static final class01343 u = class05428.N(class05388::m, class05433.z);
    public static final class01343 i = class05428.N(class05388::m, class05433.U);
    public static final class01343 R = class05428.N(class05388::v, class05433.m);
    public static final class01343 M = class05428.N(class05388::P, class05433.W);
    public static final class01343 B = class05428.N(class05388::g, class05433.s);
    public static final class01343 Z = class05428.N(class05388::O, class05433.T);
    public static final class01343 z = class05428.N(class05388::Z, class05433.Nd);
    public static final class01343 U = class05428.N(class05388::u, class05433.Nw);
    public static final class01343 E = class05428.N(class05388::z, class05433.Nk);
    public static final class01343 W = class05428.N(class05388::z, class05433.NY);
    public static final class01343 m = class05428.N(class05388::z, class05433.NQ);
    public static final class01343 P = class05428.N(class05388::z, class05433.NO);
    public static final class01343 s = class05428.N(class05388::y, class05433.Ng);
    public static final class01343 T = class05428.N(class05388::y, class05433.NI);
    public static final class01343 b = class05428.N(class05388::y, class05433.NJ);
    public static final class01343 j = class05428.N(class05388::y, class05433.No);
    public static final class01343 v = class05428.N(class05388::E, class05433.NV);
    public static final class01343 n = class05428.N(class05388::W, class05433.Nq);
    public static final class01343 t = class05428.N(class05388::J, class05433.yM);
    public static final class01343 G = class05428.N(class05388::N, class05433.Nu);
    public static final class01343 l = class05428.N(class05388::k, class05433.yb);
    public static final class01343 d = class05428.N(class05388::k, class05433.yj);
    public static final class01343 w = class05428.N(class05388::y, class05433.yv);
    public static final class01343 k = class05428.N(class05388::y, class05433.yK);
    public static final class01343 Y = class05428.N(class05388::T, class05433.z);
    public static final class01343 Q = class05428.N(class05388::T, class05433.U);
    public static final class01343 O = class05428.N(class05388::n, class05433.m);
    public static final class01343 g = class05428.N(class05388::t, class05433.z);
    private final class05388 I;
    private final class05403 J;

    private class05428(class05388 class053882, class05403 class054032) {
        this.I = class053882;
        this.J = class054032;
    }

    public class05388 y() {
        return this.I;
    }

    public static class01343 N(Function<class00891, class05388> function, class05403 class054032) {
        return class008912 -> new class05428((class05388)function.apply(class008912), class054032);
    }

    public static class05428 N(class01894 class018942) {
        return new class05428(class05388.y((class01894)class018942), class05433.L);
    }

    public class01894 N(class00891 class008912, String string, BiConsumer<class01894, class08819> biConsumer) {
        return this.J.N(class008912, string, this.I, biConsumer);
    }

    public class05403 N() {
        return this.J;
    }

    public class01894 N(class00891 class008912, BiConsumer<class01894, class08819> biConsumer) {
        return this.J.N(class008912, this.I, biConsumer);
    }

    public class05428 N(Consumer<class05388> consumer) {
        consumer.accept(this.I);
        return this;
    }
}

