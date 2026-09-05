/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryUtil
 */
package net.caffeinemc.mods.sodium.api.vertex.attributes.common;

import org.lwjgl.system.MemoryUtil;

public class PositionAttribute {
    public static void put(long l, float f, float f2, float f3) {
        MemoryUtil.memPutFloat((long)(l + 0L), (float)f);
        MemoryUtil.memPutFloat((long)(l + 4L), (float)f2);
        MemoryUtil.memPutFloat((long)(l + 8L), (float)f3);
    }

    public static float getY(long l) {
        return MemoryUtil.memGetFloat((long)(l + 4L));
    }

    public static float getX(long l) {
        return MemoryUtil.memGetFloat((long)(l + 0L));
    }

    public static float getZ(long l) {
        return MemoryUtil.memGetFloat((long)(l + 8L));
    }
}

