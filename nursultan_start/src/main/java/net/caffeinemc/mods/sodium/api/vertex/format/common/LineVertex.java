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
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.NormalAttribute;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.PositionAttribute;

public final class LineVertex {
    public static final VertexFormat FORMAT = class07835.M;
    public static final int STRIDE = 20;
    private static final int OFFSET_POSITION = 0;
    private static final int OFFSET_COLOR = 12;
    private static final int OFFSET_NORMAL = 16;

    public static void put(long l, float f, float f2, float f3, int n, int n2) {
        PositionAttribute.put(l + 0L, f, f2, f3);
        ColorAttribute.set(l + 12L, n);
        NormalAttribute.set(l + 16L, n2);
    }
}

