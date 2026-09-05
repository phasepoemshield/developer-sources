/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00561
 *  minecraft.class00570
 */
package net.caffeinemc.mods.lithium.common.util;

import java.lang.reflect.Field;
import minecraft.class00561;
import minecraft.class00570;
import sun.misc.Unsafe;

public class ChunkConstants {
    public static final class00570 DUMMY_CHUNK;

    static {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            Unsafe unsafe = (Unsafe)field.get(null);
            DUMMY_CHUNK = (class00570)unsafe.allocateInstance(class00561.class);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}

