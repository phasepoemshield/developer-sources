/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.api.memory;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public class MemoryIntrinsics {
    private static final Unsafe UNSAFE;

    public static void copyMemory(long l, long l2, int n) {
        UNSAFE.copyMemory(l, l2, n);
    }

    static {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            UNSAFE = (Unsafe)field.get(null);
        }
        catch (IllegalAccessException | NoSuchFieldException e) {
            throw new RuntimeException("Couldn't obtain reference to sun.misc.Unsafe", e);
        }
    }
}

