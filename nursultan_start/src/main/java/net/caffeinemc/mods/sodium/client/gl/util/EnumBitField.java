/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.util;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import net.caffeinemc.mods.sodium.client.gl.util.EnumBit;

public class EnumBitField<T extends Enum<T>> {
    private final EnumSet<T> set;
    private final int bitfield;

    private EnumBitField(EnumSet<T> enumSet) {
        this.set = enumSet;
        this.bitfield = EnumBitField.computeBitField(enumSet);
    }

    @SafeVarargs
    public static <T extends Enum<T>> EnumBitField<T> of(T ... TArray) {
        List<T> list = Arrays.asList(TArray);
        EnumSet<T> enumSet = EnumSet.copyOf(list);
        return new EnumBitField<T>(enumSet);
    }

    public boolean contains(T t) {
        return this.set.contains(t);
    }

    private static <T extends Enum<T>> int computeBitField(Set<T> set) {
        int n = 0;
        for (Enum enum_ : set) {
            n |= ((EnumBit)((Object)enum_)).getBits();
        }
        return n;
    }

    public int getBitField() {
        return this.bitfield;
    }
}

