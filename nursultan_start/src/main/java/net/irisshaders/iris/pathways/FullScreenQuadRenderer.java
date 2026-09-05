/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  minecraft.class02609
 *  minecraft.class07331
 *  minecraft.class07835
 *  minecraft.class07849
 */
package net.irisshaders.iris.pathways;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import minecraft.class02609;
import minecraft.class07331;
import minecraft.class07835;
import minecraft.class07849;

public class FullScreenQuadRenderer {
    public static final FullScreenQuadRenderer INSTANCE = new FullScreenQuadRenderer();
    private final GpuBuffer quad;

    private FullScreenQuadRenderer() {
        class07331 class073312 = class07849.y().N(VertexFormat.class_5596.field_27382, class07835.Z);
        class073312.method_22912(0.0f, 0.0f, 0.0f).method_22913(0.0f, 0.0f);
        class073312.method_22912(1.0f, 0.0f, 0.0f).method_22913(1.0f, 0.0f);
        class073312.method_22912(1.0f, 1.0f, 0.0f).method_22913(1.0f, 1.0f);
        class073312.method_22912(0.0f, 1.0f, 0.0f).method_22913(0.0f, 1.0f);
        class02609 class026092 = class073312.N();
        this.quad = RenderSystem.getDevice().createBuffer(() -> "Quad", 40, class026092.N());
        class026092.close();
        class07849.y().L();
    }

    public static int init() {
        return -1;
    }

    public GpuBuffer getQuad() {
        return this.quad;
    }
}

