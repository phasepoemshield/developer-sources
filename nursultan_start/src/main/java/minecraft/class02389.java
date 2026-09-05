/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.PropertyMap
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  io.netty.buffer.ByteBuf
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  minecraft.class00750
 *  minecraft.class00751
 *  minecraft.class01487
 *  minecraft.class01657
 *  minecraft.class02876
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class04995
 *  minecraft.class05946
 *  minecraft.class07001
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class07726
 *  org.joml.Quaternionfc
 *  org.joml.Vector3fc
 */
package minecraft;

import com.google.gson.JsonElement;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import minecraft.class00750;
import minecraft.class00751;
import minecraft.class01487;
import minecraft.class01657;
import minecraft.class02362;
import minecraft.class02363;
import minecraft.class02364;
import minecraft.class02366;
import minecraft.class02367;
import minecraft.class02368;
import minecraft.class02369;
import minecraft.class02370;
import minecraft.class02371;
import minecraft.class02373;
import minecraft.class02374;
import minecraft.class02375;
import minecraft.class02376;
import minecraft.class02377;
import minecraft.class02378;
import minecraft.class02379;
import minecraft.class02380;
import minecraft.class02382;
import minecraft.class02383;
import minecraft.class02384;
import minecraft.class02385;
import minecraft.class02386;
import minecraft.class02387;
import minecraft.class02388;
import minecraft.class02390;
import minecraft.class02392;
import minecraft.class02393;
import minecraft.class02394;
import minecraft.class02395;
import minecraft.class02397;
import minecraft.class02398;
import minecraft.class02399;
import minecraft.class02401;
import minecraft.class02402;
import minecraft.class02404;
import minecraft.class02876;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class04995;
import minecraft.class05946;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07726;
import org.joml.Quaternionfc;
import org.joml.Vector3fc;

public interface class02389 {
    public static final int N = 65536;
    public static final class02362<ByteBuf, Boolean> y = new class02376();
    public static final class02362<ByteBuf, Byte> L = new class02383();
    public static final class02362<ByteBuf, Float> u = L.N_10(class04995::N, class04995::i);
    public static final class02362<ByteBuf, Short> i = new class02394();
    public static final class02362<ByteBuf, Integer> R = new class02375();
    public static final class02362<ByteBuf, Integer> M = new class02373();
    public static final class02362<ByteBuf, Integer> B = new class02388();
    public static final class02362<ByteBuf, OptionalInt> Z = B.N_10(n -> n == 0 ? OptionalInt.empty() : OptionalInt.of(n - 1), optionalInt -> optionalInt.isPresent() ? optionalInt.getAsInt() + 1 : 0);
    public static final class02362<ByteBuf, Long> z = new class02368();
    public static final class02362<ByteBuf, Long> U = new class02369();
    public static final class02362<ByteBuf, Float> E = new class02395();
    public static final class02362<ByteBuf, Double> W = new class02377();
    public static final class02362<ByteBuf, byte[]> m = new class02397();
    public static final class02362<ByteBuf, long[]> P = new class02370();
    public static final class02362<ByteBuf, String> s = class02389.y(Short.MAX_VALUE);
    public static final class02362<ByteBuf, class07709> T = class02389.y(class07726::N);
    public static final class02362<ByteBuf, class07709> b = class02389.y(class07726::L);
    public static final class02362<ByteBuf, class07001> j = class02389.L(class07726::N);
    public static final class02362<ByteBuf, class07001> v = class02389.L(class07726::L);
    public static final class02362<ByteBuf, Optional<class07001>> n = new class02363();
    public static final class02362<ByteBuf, Vector3fc> t = new class02404();
    public static final class02362<ByteBuf, Quaternionfc> G = new class02378();
    public static final class02362<ByteBuf, Integer> l = new class02364();
    public static final class02362<ByteBuf, PropertyMap> d = new class02392();
    public static final class02362<ByteBuf, String> w = class02389.y(16);
    public static final class02362<ByteBuf, GameProfile> k = class02362.N(class01487.M, GameProfile::id, w, GameProfile::name, d, GameProfile::properties, GameProfile::new);
    public static final class02362<ByteBuf, Integer> Y = new class02386();

    public static <T> class02362<class04247, class03543<T>> L(class05946<? extends class00751<T>> class059462) {
        return new class02366(class059462);
    }

    public static class02362<ByteBuf, class07001> L(Supplier<class07726> supplier) {
        return class02389.y(supplier).N_10(class077092 -> {
            if (class077092 instanceof class07001) {
                return (class07001)class077092;
            }
            throw new DecoderException("Not a compound tag: " + String.valueOf(class077092));
        }, class070012 -> class070012);
    }

    public static <T> class02362<class04247, T> L(Codec<T> codec) {
        return class02389.y(codec, class07726::L);
    }

    public static <B extends ByteBuf, V> class02876<B, V, List<V>> L(int n) {
        return class023622 -> class02389.N(ArrayList::new, class023622, n);
    }

    public static <V> class02876<class04247, V, V> i(int n) {
        return class02389.N(n, (B class042472, ByteBuf byteBuf) -> new class04247(byteBuf, class042472.J()));
    }

    public static <T> class02362<class04247, T> u(Codec<T> codec) {
        return class02389.y(codec, class07726::N);
    }

    public static <V> class02876<ByteBuf, V, V> u(int n) {
        return class02389.N(n, (B byteBuf, ByteBuf byteBuf2) -> byteBuf2);
    }

    public static <T> class02362<class04247, class03556<T>> y(class05946<? extends class00751<T>> class059462) {
        return class02389.N(class059462, class00751::v);
    }

    public static <T> class02362<class04247, T> y(Codec<T> codec, Supplier<class07726> supplier) {
        class02362<ByteBuf, class07709> class023622 = class02389.y(supplier);
        return new class02371(class023622, codec);
    }

    public static <T> class02362<ByteBuf, T> y(Codec<T> codec) {
        return class02389.N(codec, class07726::N);
    }

    public static class02362<ByteBuf, String> y(int n) {
        return new class02379(n);
    }

    public static class02362<ByteBuf, class07709> y(Supplier<class07726> supplier) {
        return new class02367(supplier);
    }

    public static <T> class02362<class04247, class03556<T>> N(class05946<? extends class00751<T>> class059462, class02362<? super class04247, T> class023622) {
        return new class02399(class059462, class023622);
    }

    private static <T, R> class02362<class04247, R> N(class05946<? extends class00751<T>> class059462, Function<class00751<T>, class00750<R>> function) {
        return new class02401(function, class059462);
    }

    public static class02362<ByteBuf, byte[]> N(int n) {
        return new class02382(n);
    }

    public static <T> class02362<class04247, T> N(class05946<? extends class00751<T>> class059462) {
        return class02389.N(class059462, (class00751<T> class007512) -> class007512);
    }

    public static <B extends ByteBuf, V> class02362<B, Optional<V>> N(class02362<? super B, V> class023622) {
        return new class02380(class023622);
    }

    public static int N(ByteBuf byteBuf, int n) {
        int n2 = class01657.N((ByteBuf)byteBuf);
        if (n2 > n) {
            throw new DecoderException(n2 + " elements exceeded max size of: " + n);
        }
        return n2;
    }

    public static void N(ByteBuf byteBuf, int n, int n2) {
        if (n > n2) {
            throw new EncoderException(n + " elements exceeded max size of: " + n2);
        }
        class01657.N((ByteBuf)byteBuf, (int)n);
    }

    public static <B extends ByteBuf, V, C extends Collection<V>> class02362<B, C> N(IntFunction<C> intFunction, class02362<? super B, V> class023622) {
        return class02389.N(intFunction, class023622, Integer.MAX_VALUE);
    }

    public static <B extends ByteBuf, V, C extends Collection<V>> class02362<B, C> N(IntFunction<C> intFunction, class02362<? super B, V> class023622, int n) {
        return new class02393(n, intFunction, class023622);
    }

    public static class02362<ByteBuf, Optional<class07709>> N_35(Supplier<class07726> supplier) {
        return new class02387(supplier);
    }

    public static <T> class02362<ByteBuf, T> N(Codec<T> codec) {
        return class02389.N(codec, class07726::L);
    }

    public static <T, B extends ByteBuf, V> class02876<B, T, V> N(DynamicOps<T> dynamicOps, Codec<V> codec) {
        return class023622 -> new class02385(class023622, codec, dynamicOps);
    }

    public static <T> class02362<ByteBuf, T> N(Codec<T> codec, Supplier<class07726> supplier) {
        return class02389.y(supplier).N_33(class02389.N(class07713.N, codec));
    }

    public static <T> class02362<ByteBuf, T> N(class00750<T> class007502) {
        return class02389.N(arg_0 -> class007502.y(arg_0), arg_0 -> class007502.L(arg_0));
    }

    public static <B extends ByteBuf, L, R> class02362<B, Either<L, R>> N(class02362<? super B, L> class023622, class02362<? super B, R> class023623) {
        return new class02398(class023622, class023623);
    }

    public static <B extends ByteBuf, V> class02876<B, V, V> N(int n, BiFunction<B, ByteBuf, B> biFunction) {
        return class023622 -> new class02384(n, biFunction, class023622);
    }

    public static <T> class02362<ByteBuf, T> N(IntFunction<T> intFunction, ToIntFunction<T> toIntFunction) {
        return new class02390(intFunction, toIntFunction);
    }

    public static <B extends ByteBuf, V, C extends Collection<V>> class02876<B, V, C> N(IntFunction<C> intFunction) {
        return class023622 -> class02389.N(intFunction, class023622);
    }

    public static <B extends ByteBuf, V> class02876<B, V, List<V>> N() {
        return class023622 -> class02389.N(ArrayList::new, class023622);
    }

    public static <B extends ByteBuf, K, V, M extends Map<K, V>> class02362<B, M> N(IntFunction<? extends M> intFunction, class02362<? super B, K> class023622, class02362<? super B, V> class023623) {
        return class02389.N(intFunction, class023622, class023623, Integer.MAX_VALUE);
    }

    public static <B extends ByteBuf, K, V, M extends Map<K, V>> class02362<B, M> N(IntFunction<? extends M> intFunction, class02362<? super B, K> class023622, class02362<? super B, V> class023623, int n) {
        return new class02374(n, class023622, class023623, intFunction);
    }

    public static class02362<ByteBuf, JsonElement> R(int n) {
        return new class02402(n);
    }
}

