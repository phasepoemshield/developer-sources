/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector2f
 *  org.lwjgl.system.MemoryUtil
 */
package net.caffeinemc.mods.sodium.api.vertex.attributes.common;

import org.joml.Vector2f;
import org.lwjgl.system.MemoryUtil;

public class TextureAttribute {
    public static Vector2f get(long l) {
        return new Vector2f(TextureAttribute.getU(l), TextureAttribute.getV(l));
    }

    public static void put(long l, float f, float f2) {
        MemoryUtil.memPutFloat((long)(l + 0L), (float)f);
        MemoryUtil.memPutFloat((long)(l + 4L), (float)f2);
    }

    public static void put(long l, Vector2f vector2f) {
        TextureAttribute.put(l, vector2f.x(), vector2f.y());
    }

    public static float getV(long l) {
        return MemoryUtil.memGetFloat((long)(l + 4L));
    }

    public static float getU(long l) {
        return MemoryUtil.memGetFloat((long)(l + 0L));
    }
}

