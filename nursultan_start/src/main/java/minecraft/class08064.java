/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  minecraft.class05033
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import minecraft.class05033;
import minecraft.class08092;

public final class class08064<T extends Enum<T>>
extends class08092<T> {
    private final List<T> N;
    private final Map<String, T> y;
    private final int[] L;

    private class08064(String string, Class<T> clazz, List<T> list) {
        super(string, clazz);
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Trying to make empty EnumProperty '" + string + "'");
        }
        this.N = List.copyOf(list);
        ImmutableMap.Builder builder = (ImmutableMap.Builder)clazz.getEnumConstants();
        this.L = new int[((Enum[])builder).length];
        for (Object object : builder) {
            this.L[object.ordinal()] = list.indexOf(object);
        }
        ImmutableMap.Builder builder2 = ImmutableMap.builder();
        for (Enum enum_ : list) {
            Object object;
            object = ((class05033)enum_).method_15434();
            builder2.put(object, (Object)enum_);
        }
        this.y = builder2.buildOrThrow();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof class08064) {
            class08064 class080642 = (class08064)object;
            if (super.equals(object)) {
                return this.N.equals(class080642.N);
            }
        }
        return false;
    }

    @Override
    public int y() {
        int n = super.y();
        n = 31 * n + this.N.hashCode();
        return n;
    }

    @Override
    public Optional<T> y(String string) {
        return Optional.ofNullable((Enum)this.y.get(string));
    }

    public int y(T t) {
        return this.L[((Enum)t).ordinal()];
    }

    public static <T extends Enum<T>> class08064<T> N(String string, Class<T> clazz, List<T> list) {
        return new class08064<T>(string, clazz, list);
    }

    public static <T extends Enum<T>> class08064<T> N(String string, Class<T> clazz) {
        return class08064.N(string, clazz, (T enum_) -> true);
    }

    public String N(T t) {
        return ((class05033)t).method_15434();
    }

    @Override
    public List<T> N() {
        return this.N;
    }

    public static <T extends Enum<T>> class08064<T> N(String string, Class<T> clazz, Predicate<T> predicate) {
        return class08064.N(string, clazz, Arrays.stream((Enum[])clazz.getEnumConstants()).filter(predicate).collect(Collectors.toList()));
    }

    @SafeVarargs
    public static <T extends Enum<T>> class08064<T> N(String string, Class<T> clazz, T ... TArray) {
        return class08064.N(string, clazz, List.of(TArray));
    }
}

