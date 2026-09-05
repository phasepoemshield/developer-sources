/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  minecraft.class07835
 */
package net.caffeinemc.mods.sodium.api.vertex.format.common;

import com.mojang.blaze3d.vertex.VertexFormat;
import minecraft.class07835;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.ColorAttribute;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.LightAttribute;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.NormalAttribute;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.OverlayAttribute;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.PositionAttribute;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.TextureAttribute;

public final class EntityVertex {
    public static final VertexFormat FORMAT = class07835.L;
    public static final int STRIDE = 36;
    private static final int OFFSET_POSITION = 0;
    private static final int OFFSET_COLOR = 12;
    private static final int OFFSET_TEXTURE = 16;
    private static final int OFFSET_OVERLAY = 24;
    private static final int OFFSET_LIGHT = 28;
    private static final int OFFSET_NORMAL = 32;

    public static void write(long l, float f, float f2, float f3, int n, float f4, float f5, int n2, int n3, int n4) {
        PositionAttribute.put(l + 0L, f, f2, f3);
        ColorAttribute.set(l + 12L, n);
        TextureAttribute.put(l + 16L, f4, f5);
        OverlayAttribute.set(l + 24L, n2);
        LightAttribute.set(l + 28L, n3);
        NormalAttribute.set(l + 32L, n4);
    }
}

