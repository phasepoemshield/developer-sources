/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.api.math.MatrixHelper
 *  net.caffeinemc.mods.sodium.api.vertex.attributes.common.ColorAttribute
 *  net.caffeinemc.mods.sodium.api.vertex.attributes.common.NormalAttribute
 *  net.caffeinemc.mods.sodium.api.vertex.attributes.common.PositionAttribute
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package net.irisshaders.iris.vertices.sodium;

import net.caffeinemc.mods.sodium.api.math.MatrixHelper;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.ColorAttribute;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.NormalAttribute;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.PositionAttribute;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public final class CloudVertex {
    public static final int STRIDE = 20;
    private static final int OFFSET_POSITION = 0;
    private static final int OFFSET_COLOR = 12;
    private static final int OFFSET_NORMAL = 16;

    public static void put(long l, Matrix4f matrix4f, float f, float f2, float f3, int n, int n2) {
        float f4 = MatrixHelper.transformPositionX((Matrix4fc)matrix4f, (float)f, (float)f2, (float)f3);
        float f5 = MatrixHelper.transformPositionY((Matrix4fc)matrix4f, (float)f, (float)f2, (float)f3);
        float f6 = MatrixHelper.transformPositionZ((Matrix4fc)matrix4f, (float)f, (float)f2, (float)f3);
        CloudVertex.put(l, f4, f5, f6, n, n2);
    }

    public static void put(long l, float f, float f2, float f3, int n, int n2) {
        PositionAttribute.put((long)(l + 0L), (float)f, (float)f2, (float)f3);
        ColorAttribute.set((long)(l + 12L), (int)n);
        NormalAttribute.set((long)(l + 16L), (int)n2);
    }
}

