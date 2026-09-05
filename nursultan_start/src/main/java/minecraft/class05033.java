/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10486
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Keyable
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10486;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Keyable;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import minecraft.class04997;
import minecraft.class05031;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public interface class05033 {
    public static final int L = 16;

    public static Keyable y(class05033[] class05033Array) {
        return new class10486(class05033Array);
    }

    public static <T extends class05033> Codec<T> y(Supplier<T[]> supplier) {
        class05033[] class05033Array = (class05033[])supplier.get();
        Function function = class05033.N((class05033[])class05033Array);
        ToIntFunction toIntFunction = class07536.R(Arrays.asList(class05033Array));
        return new class04997(class05033Array, function, toIntFunction);
    }

    public static <T> Function<String, @Nullable T> N(T[] TArray, Function<T, String> function) {
        if (TArray.length > 16) {
            return Arrays.stream(TArray).collect(Collectors.toMap(function, object -> object))::get;
        }
        return string -> {
            for (Object object : TArray) {
                if (!((String)function.apply(object)).equals(string)) continue;
                return object;
            }
            return null;
        };
    }

    public static <E extends Enum<E>> class05031<E> N(Supplier<E[]> supplier) {
        return class05033.N(supplier, (String string) -> string);
    }

    public static <E extends Enum<E>> class05031<E> N(Supplier<E[]> supplier, Function<String, String> function) {
        Enum[] enumArray = (Enum[])supplier.get();
        Function<String, Enum> function2 = class05033.N(enumArray, (T enum_) -> (String)function.apply(((class05033)((Object)enum_)).method_15434()));
        return new class05031(enumArray, function2);
    }

    public static <T extends class05033> Function<String, @Nullable T> N(T[] TArray) {
        return class05033.N(TArray, class05033::method_15434);
    }

    public String method_15434();
}

