/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00751
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04562
 *  minecraft.class05056
 *  minecraft.class06066
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiFunction;
import java.util.function.Function;
import minecraft.class00751;
import minecraft.class03556;
import minecraft.class03868;
import minecraft.class03870;
import minecraft.class03871;
import minecraft.class03872;
import minecraft.class03873;
import minecraft.class03876;
import minecraft.class03877;
import minecraft.class03878;
import minecraft.class03879;
import minecraft.class03883;
import minecraft.class03884;
import minecraft.class03886;
import minecraft.class03887;
import minecraft.class03888;
import minecraft.class03889;
import minecraft.class03890;
import minecraft.class03891;
import minecraft.class03892;
import minecraft.class03893;
import minecraft.class03897;
import minecraft.class03898;
import minecraft.class03900;
import minecraft.class03902;
import minecraft.class03903;
import minecraft.class03904;
import minecraft.class03906;
import minecraft.class03909;
import minecraft.class03910;
import minecraft.class03979;
import minecraft.class04206;
import minecraft.class04562;
import minecraft.class05056;
import minecraft.class06066;

public final class class03865 {
    private static final Codec<class03877> u = class04206.Nu.T().dispatch(class038772 -> class038772.L().N(), Function.identity());
    protected static final double N = 1000000.0;
    static final Codec<Double> y = Codec.doubleRange((double)-1000000.0, (double)1000000.0);
    public static final Codec<class03877> L = Codec.either(y, u).xmap(either -> (class03877)either.map(class03865::N, Function.identity()), class038772 -> {
        if (class038772 instanceof class03879) {
            return Either.left((Object)((class03879)class038772).u());
        }
        return Either.right((Object)class038772);
    });

    public static class03877 L(class03877 class038772, class03877 class038773) {
        return class03871.N(class03892.field_36546, class038772, class038773);
    }

    public static class03877 L() {
        return class03886.field_36551;
    }

    public static class03877 L(class03556<class05056> class035562) {
        return new class03888(new class03876(class035562));
    }

    public static class03877 L(class03877 class038772) {
        return new class03897(class03909.field_36564, class038772);
    }

    private class03865() {
    }

    public static class03877 i(class03877 class038772) {
        return new class03897(class03909.field_36566, class038772);
    }

    public static class03877 u(class03877 class038772) {
        return new class03897(class03909.field_36565, class038772);
    }

    public static class03877 u(class03556<class05056> class035562) {
        return new class03910(new class03876(class035562));
    }

    public static class03877 u(class03877 class038772, class03877 class038773) {
        return class03871.N(class03892.field_36547, class038772, class038773);
    }

    public static class03877 y(class03877 class038772, class03877 class038773) {
        return class03871.N(class03892.field_36545, class038772, class038773);
    }

    public static class03877 y(class03556<class05056> class035562, double d, double d2) {
        return new class03870(new class03876(class035562), d, d2);
    }

    public static class03877 y(class03556<class05056> class035562) {
        return new class03898(new class03876(class035562));
    }

    public static class03877 y() {
        return class03884.field_36549;
    }

    public static class03877 y(class03877 class038772) {
        return new class03897(class03909.field_36563, class038772);
    }

    public static class03877 N(class04562<class03903, class03890> class045622) {
        return new class03887(class045622);
    }

    public static class03877 N() {
        return class03879.L;
    }

    public static class03877 N(class03877 class038772, double d, class03877 class038773) {
        return class03865.N(class03865.y(class038772, class03865.N(class038773, class03865.N(-d))), class03865.N(d));
    }

    public static class03877 N(class03877 class038772, class03877 class038773, int n, int n2) {
        return new class03889(class038772, class038773, n, n2);
    }

    public static class03877 N(class03877 class038772, class03891 class038912) {
        return class03883.N(class038912, class038772);
    }

    public static class03877 N(int n, int n2, double d, double d2) {
        return new class03902(n, n2, d, d2);
    }

    public static class03877 N(double d) {
        return new class03879(d);
    }

    public static class03877 N(class03877 class038772, class03877 class038773, class03877 class038774) {
        if (class038773 instanceof class03879) {
            class03879 class038792 = (class03879)class038773;
            return class03865.N(class038772, class038792.u(), class038774);
        }
        class03877 class038775 = class03865.u(class038772);
        class03877 class038776 = class03865.N(class03865.y(class038775, class03865.N(-1.0)), class03865.N(1.0));
        return class03865.N(class03865.y(class038773, class038776), class03865.y(class038774, class038775));
    }

    private static class03877 N(class03877 class038772, double d, double d2) {
        double d3 = (d + d2) * 0.5;
        double d4 = (d2 - d) * 0.5;
        return class03865.N(class03865.N(d3), class03865.y(class03865.N(d4), class038772));
    }

    static <O> class03979<O> N(MapCodec<O> mapCodec) {
        return class03979.N(mapCodec);
    }

    public static class03877 N(class03877 class038772) {
        return new class03897(class03909.field_36562, class038772);
    }

    public static class03877 N(class03556<class05056> class035562, @Deprecated double d, double d2, double d3, double d4) {
        return class03865.N((class03877)new class03870(new class03876(class035562), d, d2), d3, d4);
    }

    public static class03877 N(class03556<class05056> class035562, double d, double d2, double d3) {
        return class03865.N(class035562, 1.0, d, d2, d3);
    }

    public static class03877 N(class03556<class05056> class035562, double d, double d2) {
        return class03865.N(class035562, 1.0, 1.0, d, d2);
    }

    private static MapCodec<? extends class03877> N(class00751<MapCodec<? extends class03877>> class007512, String string, class03979<? extends class03877> class039792) {
        return (MapCodec)class00751.N(class007512, (String)string, class039792.N());
    }

    static <A, O> class03979<O> N(Codec<A> codec, Function<A, O> function, Function<O, A> function2) {
        return class03979.N(codec.fieldOf("argument").xmap(function, function2));
    }

    static <O> class03979<O> N(Function<class03877, O> function, Function<O, class03877> function2) {
        return class03865.N(class03877.R, function, function2);
    }

    static <O> class03979<O> N(BiFunction<class03877, class03877, O> biFunction, Function<O, class03877> function, Function<O, class03877> function2) {
        return class03979.N(RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03877.R.fieldOf("argument1").forGetter(function), (App)class03877.R.fieldOf("argument2").forGetter(function2)).apply((Applicative)instance, biFunction)));
    }

    public static MapCodec<? extends class03877> N(class00751<MapCodec<? extends class03877>> class007512) {
        class03865.N(class007512, "blend_alpha", class03884.field_37079);
        class03865.N(class007512, "blend_offset", class03886.field_37081);
        class03865.N(class007512, "beardifier", class03904.L);
        class03865.N(class007512, "old_blended_noise", class06066.N);
        for (class03909 enum_ : class03909.values()) {
            class03865.N(class007512, enum_.method_15434(), enum_.field_37089);
        }
        class03865.N(class007512, "noise", class03870.y);
        class03865.N(class007512, "end_islands", class03906.N);
        class03865.N(class007512, "weird_scaled_sampler", class03872.N);
        class03865.N(class007512, "shifted_noise", class03878.N);
        class03865.N(class007512, "range_choice", class03893.y);
        class03865.N(class007512, "shift_a", class03898.N);
        class03865.N(class007512, "shift_b", class03888.N);
        class03865.N(class007512, "shift", class03910.N);
        class03865.N(class007512, "blend_density", class03868.N);
        class03865.N(class007512, "clamp", class03900.N);
        for (Enum enum_ : class03891.values()) {
            class03865.N(class007512, ((class03891)enum_).method_15434(), ((class03891)enum_).field_37087);
        }
        for (Enum enum_ : class03892.values()) {
            class03865.N(class007512, ((class03892)enum_).method_15434(), ((class03892)enum_).field_37111);
        }
        class03865.N(class007512, "spline", class03887.N);
        class03865.N(class007512, "constant", class03879.y);
        class03865.N(class007512, "y_clamped_gradient", class03902.N);
        return class03865.N(class007512, "find_top_surface", class03889.N);
    }

    public static class03877 N(long l) {
        return new class03906(l);
    }

    public static class03877 N(class03877 class038772, class03556<class05056> class035562, class03873 class038732) {
        return new class03872(class038772, new class03876(class035562), class038732);
    }

    public static class03877 N(class03877 class038772, class03877 class038773) {
        return class03871.N(class03892.field_36544, class038772, class038773);
    }

    public static class03877 N(class03877 class038772, class03877 class038773, double d, class03556<class05056> class035562) {
        return new class03878(class038772, class03865.N(), class038773, d, 0.0, new class03876(class035562));
    }

    public static class03877 N(class03556<class05056> class035562) {
        return class03865.y(class035562, 1.0, 1.0);
    }

    public static class03877 N(class03556<class05056> class035562, double d) {
        return class03865.y(class035562, 1.0, d);
    }

    public static class03877 N(class03877 class038772, double d, double d2, class03877 class038773, class03877 class038774) {
        return new class03893(class038772, d, d2, class038773, class038774);
    }

    public static class03877 R(class03877 class038772) {
        return new class03868(class038772);
    }
}

