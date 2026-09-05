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
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.PositionAttribute;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.TextureAttribute;

public final class ParticleVertex {
    public static final VertexFormat FORMAT = class07835.u;
    public static final int STRIDE = 28;
    private static final int OFFSET_POSITION = 0;
    private static final int OFFSET_TEXTURE = 12;
    private static final int OFFSET_COLOR = 20;
    private static final int OFFSET_LIGHT = 24;

    public static void put(long l, float f, float f2, float f3, float f4, float f5, int n, int n2) {
        PositionAttribute.put(l + 0L, f, f2, f3);
        TextureAttribute.put(l + 12L, f4, f5);
        ColorAttribute.set(l + 20L, n);
        LightAttribute.set(l + 24L, n2);
    }
}

