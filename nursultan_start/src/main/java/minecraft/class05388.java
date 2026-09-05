/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class06581
 */
package minecraft;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class05418;
import minecraft.class06581;

public class class05388 {
    private final Map<class05418, class01894> N = Maps.newHashMap();
    private final Set<class05418> y = Sets.newHashSet();

    public static class05388 w(class00891 class008912) {
        return new class05388().N(class05418.O, class05388.N(class008912, "_1"));
    }

    public class05388 L(class05418 class054182, class01894 class018942) {
        class05388 class053882 = new class05388();
        class053882.N.putAll(this.N);
        class053882.y.addAll(this.y);
        class053882.N(class054182, class018942);
        return class053882;
    }

    public static class05388 L(class00891 class008912, class00891 class008913) {
        return new class05388().N(class05418.L, class05388.N(class008912, "_front")).N(class05418.P, class05388.V(class008913)).N(class05418.m, class05388.N(class008912, "_top")).N(class05418.z, class05388.N(class008912, "_front")).N(class05418.E, class05388.N(class008912, "_side")).N(class05418.U, class05388.N(class008912, "_side")).N(class05418.W, class05388.N(class008912, "_front"));
    }

    public static class05388 L(class01894 class018942) {
        return class05388.u(class05418.s, class018942);
    }

    public static class01894 L(class06581 class065812) {
        return class04206.B.y((Object)class065812).R("item/");
    }

    public static class05388 L(class00891 class008912) {
        return class05388.u(class05418.s, class05388.V(class008912));
    }

    public static class05388 L(class01894 class018942, class01894 class018943) {
        return new class05388().N(class05418.q, class018942).N(class05418.K, class018943);
    }

    public static class05388 M(class00891 class008912) {
        return new class05388().N(class05418.b, class05388.V(class008912)).N(class05418.T, class05388.N(class008912, "_emissive"));
    }

    public static class05388 M(class01894 class018942) {
        return class05388.u(class05418.Y, class018942);
    }

    public static class05388 P(class00891 class008912) {
        return new class05388().N(class05418.Z, class05388.N(class008912, "_side")).N(class05418.R, class05388.N(class008912, "_top"));
    }

    public static class05388 K(class00891 class008912) {
        return new class05388().N(class05418.q, class05388.V(class008912));
    }

    public static class05388 T(class00891 class008912) {
        return new class05388().N(class05418.Z, class05388.V(class008912)).N(class05418.u, class05388.N(class008912, "_top")).N(class05418.L, class05388.V(class008912));
    }

    public static class05388 Q(class00891 class008912) {
        return new class05388().N(class05418.Z, class05388.N(class008912, "_side")).N(class05418.M, class05388.N(class008912, "_front")).N(class05418.B, class05388.N(class008912, "_back"));
    }

    public static class05388 B(class00891 class008912) {
        return class05388.u(class05418.v, class05388.V(class008912));
    }

    public static class05388 B(class01894 class018942) {
        return new class05388().N(class05418.L, class018942);
    }

    public static class05388 I(class00891 class008912) {
        return new class05388().N(class05418.Z, class05388.N(class008912, "_side")).N(class05418.M, class05388.N(class008912, "_front")).N(class05418.u, class05388.N(class008912, "_end"));
    }

    public static class05388 J(class00891 class008912) {
        return new class05388().N(class05418.R, class05388.N(class008912, "_top"));
    }

    public static class05388 Z(class00891 class008912) {
        return class05388.u(class05418.n, class05388.V(class008912));
    }

    public static class05388 Z(class01894 class018942) {
        return new class05388().N(class05418.o, class018942);
    }

    public static class01894 V(class00891 class008912) {
        return class04206.i.y((Object)class008912).R("block/");
    }

    public static class05388 i(class00891 class008912) {
        return new class05388().N(class05418.s, class05388.V(class008912)).N(class05418.T, class05388.N(class008912, "_emissive"));
    }

    public static class05388 i(class01894 class018942) {
        return class05388.u(class05418.v, class018942);
    }

    public static class05388 b(class00891 class008912) {
        return new class05388().N(class05418.y, class05388.V(class008912)).N(class05418.Z, class05388.N(class008912, "_side")).N(class05418.R, class05388.N(class008912, "_top"));
    }

    public static class05388 s(class00891 class008912) {
        return new class05388().N(class05418.b, class05388.N(class008912, "_plant")).N(class05418.Z, class05388.N(class008912, "_side")).N(class05418.R, class05388.N(class008912, "_top"));
    }

    public static class05388 n(class00891 class008912) {
        class01894 class018942 = class05388.V(class008912);
        return new class05388().N(class05418.j, class018942).N(class05418.Z, class018942).N(class05418.R, class05388.N(class008912, "_top")).N(class05418.i, class05388.N(class008912, "_bottom"));
    }

    public static class05388 l(class00891 class008912) {
        return new class05388().N(class05418.L, class05388.V(class008912));
    }

    public static class05388 d(class00891 class008912) {
        return new class05388().N(class05418.O, class05388.N(class008912, "_0"));
    }

    public static class05388 m(class00891 class008912) {
        return new class05388().N(class05418.Z, class05388.N(class008912, "_side")).N(class05418.u, class05388.N(class008912, "_top"));
    }

    public static class05388 o(class00891 class008912) {
        return new class05388().N(class05418.e, class05388.N(class008912, "_log_lit")).N(class05418.O, class05388.N(class008912, "_fire"));
    }

    public static class05388 k(class00891 class008912) {
        return new class05388().N(class05418.g, class05388.V(class008912));
    }

    public static class05388 t(class00891 class008912) {
        class01894 class018942 = class05388.V(class008912);
        return new class05388().N(class05418.y, class018942).N(class05418.j, class018942).N(class05418.Z, class018942).N(class05418.u, class05388.N(class008912, "_top"));
    }

    public static class05388 g(class00891 class008912) {
        return new class05388().N(class05418.Z, class05388.N(class008912, "_side")).N(class05418.M, class05388.N(class008912, "_front")).N(class05418.R, class05388.N(class008912, "_top"));
    }

    public static class05388 v(class00891 class008912) {
        return new class05388().N(class05418.Z, class05388.N(class008912, "_side")).N(class05418.R, class05388.N(class008912, "_top")).N(class05418.i, class05388.N(class008912, "_bottom"));
    }

    public static class05388 j(class00891 class008912) {
        return new class05388().N(class05418.y, class05388.V(class008912)).N(class05418.L, class05388.N(class008912, "_particle"));
    }

    public static class05388 q(class00891 class008912) {
        return new class05388().N(class05418.A, class05388.V(class008912)).N(class05418.l, class05388.V(class008912));
    }

    public static class05388 U(class00891 class008912) {
        return class05388.u(class05418.w, class05388.V(class008912));
    }

    public static class05388 U(class01894 class018942) {
        return new class05388().N(class05418.q, class018942);
    }

    public static class05388 z(class00891 class008912) {
        return new class05388().N(class05418.p, class05388.V(class008912)).N(class05418.w, class05388.N(class008912, "_stem"));
    }

    public static class05388 z(class01894 class018942) {
        return new class05388().N(class05418.L, class05388.N(class00869.MZ, "_side")).N(class05418.Z, class05388.N(class00869.MZ, "_side")).N(class05418.R, class05388.N(class00869.MZ, "_top")).N(class05418.i, class05388.N(class00869.MZ, "_bottom")).N(class05418.c, class05388.N(class00869.MZ, "_inner")).N(class05418.X, class018942);
    }

    public static class05388 u(class01894 class018942) {
        return class05388.u(class05418.b, class018942);
    }

    public static class05388 u(class05418 class054182, class01894 class018942) {
        return new class05388().N(class054182, class018942);
    }

    public static class05388 u(class00891 class008912) {
        return class05388.u(class05418.Z, class05388.V(class008912));
    }

    public static class05388 u(class00891 class008912, class00891 class008913) {
        return new class05388().N(class05418.L, class05388.N(class008912, "_front")).N(class05418.P, class05388.V(class008913)).N(class05418.m, class05388.N(class008912, "_top")).N(class05418.z, class05388.N(class008912, "_front")).N(class05418.U, class05388.N(class008912, "_front")).N(class05418.E, class05388.N(class008912, "_side")).N(class05418.W, class05388.N(class008912, "_side"));
    }

    public class05388 y(class05418 class054182, class05418 class054183) {
        this.N.put(class054183, this.N.get(class054182));
        this.y.add(class054183);
        return this;
    }

    public static class05388 y(class00891 class008912) {
        return class05388.N(class05388.V(class008912));
    }

    public static class05388 y(String string) {
        return new class05388().N(class05418.L, class05388.N(class00869.mu, string + "_north")).N(class05418.i, class05388.N(class00869.mu, string + "_bottom")).N(class05418.R, class05388.N(class00869.mu, string + "_top")).N(class05418.z, class05388.N(class00869.mu, string + "_north")).N(class05418.U, class05388.N(class00869.mu, string + "_south")).N(class05418.E, class05388.N(class00869.mu, string + "_east")).N(class05418.W, class05388.N(class00869.mu, string + "_west")).N(class05418.F, class05388.N(class00869.mu, string + "_tentacles"));
    }

    public class05388 y(class05418 class054182, class01894 class018942) {
        this.N.put(class054182, class018942);
        this.y.add(class054182);
        return this;
    }

    public static class05388 y(class00891 class008912, class00891 class008913) {
        return new class05388().N(class05418.G, class05388.V(class008912)).N(class05418.l, class05388.N(class008913, "_top"));
    }

    public static class05388 y(class06581 class065812) {
        return new class05388().N(class05418.q, class05388.L(class065812));
    }

    public static class05388 y(class01894 class018942, class01894 class018943) {
        return new class05388().N(class05418.R, class018942).N(class05418.i, class018943);
    }

    public static class05388 y(class01894 class018942) {
        return new class05388().N(class05418.N, class018942);
    }

    public static class05388 E(class00891 class008912) {
        return class05388.u(class05418.t, class05388.V(class008912));
    }

    public static class05388 N(class00891 class008912, class00891 class008913) {
        return new class05388().N(class05418.w, class05388.V(class008912)).N(class05418.k, class05388.V(class008913));
    }

    public Stream<class05418> N() {
        return this.y.stream();
    }

    public static class05388 N(class01894 class018942, class01894 class018943, class01894 class018944) {
        return new class05388().N(class05418.q, class018942).N(class05418.K, class018943).N(class05418.V, class018944);
    }

    public class05388 N(class05418 class054182, class05418 class054183) {
        this.N.put(class054183, this.N.get(class054182));
        return this;
    }

    public static class05388 N(class01894 class018942, class01894 class018943) {
        return new class05388().N(class05418.Z, class018942).N(class05418.u, class018943);
    }

    public static class05388 N(boolean bl) {
        String string = bl ? "_can_summon" : "";
        return new class05388().N(class05418.L, class05388.N(class00869.bS, "_bottom")).N(class05418.Z, class05388.N(class00869.bS, "_side")).N(class05418.R, class05388.N(class00869.bS, "_top")).N(class05418.a, class05388.N(class00869.bS, string + "_inner_top")).N(class05418.i, class05388.N(class00869.bS, "_bottom"));
    }

    public static class05388 N(class06581 class065812) {
        return new class05388().N(class05418.L, class05388.L(class065812));
    }

    public static class01894 N(class06581 class065812, String string) {
        return class04206.B.y((Object)class065812).N(string2 -> "item/" + string2 + string);
    }

    public class05388 N(class05418 class054182, class01894 class018942) {
        this.N.put(class054182, class018942);
        return this;
    }

    public static class01894 N(class00891 class008912, String string) {
        return class04206.i.y((Object)class008912).N(string2 -> "block/" + string2 + string);
    }

    public static class05388 N(class00891 class008912) {
        return class05388.y(class05388.V(class008912));
    }

    public class01894 N(class05418 class054182) {
        for (class05418 class054183 = class054182; class054183 != null; class054183 = class054183.y()) {
            class01894 class018942 = this.N.get(class054183);
            if (class018942 == null) continue;
            return class018942;
        }
        throw new IllegalStateException("Can't find texture for slot " + String.valueOf(class054182));
    }

    public static class05388 N(String string) {
        return new class05388().N(class05418.L, class05388.N(class00869.mL, string + "_north")).N(class05418.i, class05388.N(class00869.mL, string + "_bottom")).N(class05418.R, class05388.N(class00869.mL, string + "_top")).N(class05418.z, class05388.N(class00869.mL, string + "_north")).N(class05418.U, class05388.N(class00869.mL, string + "_south")).N(class05418.E, class05388.N(class00869.mL, string + "_east")).N(class05418.W, class05388.N(class00869.mL, string + "_west"));
    }

    public static class05388 N(class00891 class008912, String string, String string2) {
        return new class05388().N(class05418.Z, class05388.N(class008912, string)).N(class05418.R, class05388.N(class008912, string2)).N(class05418.i, class05388.N(class008912, "_bottom"));
    }

    public static class05388 N(class01894 class018942) {
        return new class05388().N(class05418.y, class018942);
    }

    public static class05388 N(class00891 class008912, boolean bl) {
        return new class05388().N(class05418.L, class05388.N(class00869.ie, "_side")).N(class05418.i, class05388.N(class00869.ie, "_bottom")).N(class05418.R, class05388.N(class00869.ie, "_top")).N(class05418.Z, class05388.N(class00869.ie, "_side")).N(class05418.H, class05388.N(class008912, bl ? "_lit" : ""));
    }

    public static class05388 N(class00891 class008912, String string, String string2, String string3, String string4) {
        return new class05388().N(class05418.M, class05388.N(class008912, string)).N(class05418.Z, class05388.N(class008912, string2)).N(class05418.R, class05388.N(class008912, string3)).N(class05418.i, class05388.N(class008912, string4));
    }

    public static class05388 W(class00891 class008912) {
        return class05388.u(class05418.d, class05388.V(class008912));
    }

    public static class05388 R(class00891 class008912) {
        return class05388.u(class05418.b, class05388.V(class008912));
    }

    public static class05388 R(class01894 class018942) {
        return class05388.u(class05418.n, class018942);
    }

    public static class05388 O(class00891 class008912) {
        return new class05388().N(class05418.Z, class05388.N(class008912, "_side")).N(class05418.M, class05388.N(class008912, "_front")).N(class05418.R, class05388.N(class008912, "_top")).N(class05418.i, class05388.N(class008912, "_bottom"));
    }

    public static class05388 G(class00891 class008912) {
        return new class05388().N(class05418.R, class05388.N(class008912, "_top")).N(class05418.i, class05388.N(class008912, "_bottom"));
    }

    public static class05388 Y(class00891 class008912) {
        return new class05388().N(class05418.o, class05388.V(class008912));
    }
}

