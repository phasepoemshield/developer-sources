/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  minecraft.class06333
 *  minecraft.class07571
 *  minecraft.class08173
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import minecraft.class06333;
import minecraft.class07571;
import minecraft.class07602;
import minecraft.class08173;

public interface class07586 {
    public static final class06333<String, class07586> N = new class06333();
    public static final Codec<class07586> y = Codec.either((Codec)N.N((Codec)Codec.STRING), (Codec)class07571.q).xmap(Either::unwrap, class075862 -> class075862 instanceof class07571 ? Either.right((Object)((class07571)class075862)) : Either.left((Object)class075862));
    public static final class07586 L = class07586.N("constant", f -> 0.0f);
    public static final class07586 u = class07586.N("linear", f -> f);
    public static final class07586 i = class07586.N("in_back", class08173::N);
    public static final class07586 R = class07586.N("in_bounce", class08173::y);
    public static final class07586 M = class07586.N("in_circ", class08173::Q);
    public static final class07586 B = class07586.N("in_cubic", class08173::L);
    public static final class07586 Z = class07586.N("in_elastic", class08173::u);
    public static final class07586 z = class07586.N("in_expo", class08173::i);
    public static final class07586 U = class07586.N("in_quad", class08173::w);
    public static final class07586 E = class07586.N("in_quart", class08173::R);
    public static final class07586 W = class07586.N("in_quint", class08173::M);
    public static final class07586 m = class07586.N("in_sine", class08173::B);
    public static final class07586 P = class07586.N("in_out_back", class08173::O);
    public static final class07586 s = class07586.N("in_out_bounce", class08173::Z);
    public static final class07586 T = class07586.N("in_out_circ", class08173::z);
    public static final class07586 b = class07586.N("in_out_cubic", class08173::U);
    public static final class07586 j = class07586.N("in_out_elastic", class08173::Y);
    public static final class07586 v = class07586.N("in_out_expo", class08173::d);
    public static final class07586 n = class07586.N("in_out_quad", class08173::E);
    public static final class07586 t = class07586.N("in_out_quart", class08173::W);
    public static final class07586 G = class07586.N("in_out_quint", class08173::m);
    public static final class07586 l = class07586.N("in_out_sine", class08173::n);
    public static final class07586 d = class07586.N("out_back", class08173::t);
    public static final class07586 w = class07586.N("out_bounce", class08173::P);
    public static final class07586 k = class07586.N("out_circ", class08173::k);
    public static final class07586 Y = class07586.N("out_cubic", class08173::l);
    public static final class07586 Q = class07586.N("out_elastic", class08173::s);
    public static final class07586 O = class07586.N("out_expo", class08173::T);
    public static final class07586 g = class07586.N("out_quad", class08173::b);
    public static final class07586 I = class07586.N("out_quart", class08173::G);
    public static final class07586 J = class07586.N("out_quint", class08173::j);
    public static final class07586 o = class07586.N("out_sine", class08173::v);

    public float apply(float var1);

    public static class07586 N(String string, class07586 class075862) {
        N.N((Object)string, (Object)class075862);
        return class075862;
    }

    public static class07586 N(float f, float f2) {
        return class07586.N(f, f2, 1.0f - f, 1.0f - f2);
    }

    public static class07586 N(float f, float f2, float f3, float f4) {
        return new class07571(new class07602(f, f2, f3, f4));
    }
}

