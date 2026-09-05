/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  minecraft.class07835
 *  net.caffeinemc.mods.sodium.api.vertex.attributes.common.ColorAttribute
 *  net.caffeinemc.mods.sodium.api.vertex.attributes.common.LightAttribute
 *  net.caffeinemc.mods.sodium.api.vertex.attributes.common.PositionAttribute
 *  net.caffeinemc.mods.sodium.api.vertex.attributes.common.TextureAttribute
 *  org.lwjgl.system.MemoryUtil
 */
package me.flashyreese.mods.sodiumextra.client.render.vertex.formats;

import com.mojang.blaze3d.vertex.VertexFormat;
import minecraft.class07835;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.ColorAttribute;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.LightAttribute;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.PositionAttribute;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.TextureAttribute;
import org.lwjgl.system.MemoryUtil;

public final class WeatherVertex {
    public static final VertexFormat FORMAT = class07835.u;
    public static final int STRIDE = 28;
    private static final int OFFSET_POSITION = 0;
    private static final int OFFSET_TEXTURE = 12;
    private static final int OFFSET_COLOR = 20;
    private static final int OFFSET_LIGHT = 24;

    public static void put(long l, float f, float f2, float f3, float f4, float f5, int n, int n2) {
        PositionAttribute.put((long)(l + 0L), (float)f, (float)f2, (float)f3);
        TextureAttribute.put((long)(l + 12L), (float)f4, (float)f5);
        ColorAttribute.set((long)(l + 20L), (int)n);
        LightAttribute.set((long)(l + 24L), (int)n2);
    }

    public static void put(long l, float f, float f2, float f3, float f4, float f5, int n, int n2, int n3) {
        PositionAttribute.put((long)(l + 0L), (float)f, (float)f2, (float)f3);
        TextureAttribute.put((long)(l + 12L), (float)f4, (float)f5);
        ColorAttribute.set((long)(l + 20L), (int)n);
        MemoryUtil.memPutShort((long)(l + 24L), (short)((short)n2));
        MemoryUtil.memPutShort((long)(l + 24L + 2L), (short)((short)n3));
    }
}

