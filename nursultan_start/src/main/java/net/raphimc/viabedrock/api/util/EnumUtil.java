/*
 * Decompiled with CFR 0.152.
 */
package net.raphimc.viabedrock.api.util;

import java.math.BigInteger;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.ToIntFunction;

public class EnumUtil {
    public static <T extends Enum<T>> BigInteger getBigBitmaskFromEnumSet(Set<T> set, ToIntFunction<T> bitGetter) {
        BigInteger bitmask = BigInteger.ZERO;
        for (Enum constant : set) {
            int bit = bitGetter.applyAsInt(constant);
            if (bit < 0) continue;
            bitmask = bitmask.setBit(bit);
        }
        return bitmask;
    }

    public static <T extends Enum<T>> long getLongBitmaskFromEnumSet(Set<T> set, ToIntFunction<T> bitGetter) {
        long bitmask = 0L;
        for (Enum constant : set) {
            int bit = bitGetter.applyAsInt(constant);
            if (bit < 0 || bit >= 64) continue;
            bitmask |= 1L << bit;
        }
        return bitmask;
    }

    public static <T extends Enum<T>> T getEnumConstantOrNull(Class<T> enumClass, String name) {
        try {
            return Enum.valueOf(enumClass, name);
        }
        catch (IllegalArgumentException e) {
            return null;
        }
    }

    public static <T extends Enum<T>> Set<T> getEnumSetFromBitmask(Class<T> enumClass, BigInteger bitmask, ToIntFunction<T> bitGetter) {
        EnumSet<T> set = EnumSet.noneOf(enumClass);
        for (Enum constant : (Enum[])enumClass.getEnumConstants()) {
            int bit = bitGetter.applyAsInt(constant);
            if (bit < 0 || !bitmask.testBit(bit)) continue;
            set.add(constant);
        }
        return set;
    }

    public static <T extends Enum<T>> Set<T> getEnumSetFromBitmask(Class<T> enumClass, long bitmask, ToIntFunction<T> bitGetter) {
        EnumSet<T> set = EnumSet.noneOf(enumClass);
        for (Enum constant : (Enum[])enumClass.getEnumConstants()) {
            int bit = bitGetter.applyAsInt(constant);
            if (bit < 0 || bit >= 64 || (bitmask & 1L << bit) == 0L) continue;
            set.add(constant);
        }
        return set;
    }

    public static <T extends Enum<T>> int getIntBitmaskFromEnumSet(Set<T> set, ToIntFunction<T> bitGetter) {
        int bitmask = 0;
        for (Enum constant : set) {
            int bit = bitGetter.applyAsInt(constant);
            if (bit < 0 || bit >= 32) continue;
            bitmask |= 1 << bit;
        }
        return bitmask;
    }
}

