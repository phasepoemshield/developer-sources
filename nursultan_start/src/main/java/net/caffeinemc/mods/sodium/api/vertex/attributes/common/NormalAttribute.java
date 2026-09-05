/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryUtil
 */
package net.caffeinemc.mods.sodium.api.vertex.attributes.common;

import org.lwjgl.system.MemoryUtil;

public class NormalAttribute {
    public static int get(long l) {
        return MemoryUtil.memGetInt((long)l);
    }

    public static void set(long l, int n) {
        MemoryUtil.memPutInt((long)l, (int)n);
    }
}

