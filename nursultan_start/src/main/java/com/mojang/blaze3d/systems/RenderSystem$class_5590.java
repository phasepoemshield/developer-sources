/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.systems.RenderSystem$1
 *  it.unimi.dsi.fastutil.ints.IntConsumer
 *  minecraft.class04995
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryUtil
 */
package com.mojang.blaze3d.systems;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem$class_5590$class_5591;
import com.mojang.blaze3d.vertex.VertexFormat$class_5595;
import it.unimi.dsi.fastutil.ints.IntConsumer;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import minecraft.class04995;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryUtil;

public final class RenderSystem$class_5590 {
    private final int field_27332;
    private final int field_27333;
    private final RenderSystem$class_5590$class_5591 field_27334;
    private @Nullable GpuBuffer field_54299;
    private VertexFormat$class_5595 field_27336 = VertexFormat$class_5595.field_27372;
    private int field_27337;

    RenderSystem$class_5590(int n, int n2, RenderSystem$class_5590$class_5591 renderSystem$class_5590$class_5591) {
        this.field_27332 = n;
        this.field_27333 = n2;
        this.field_27334 = renderSystem$class_5590$class_5591;
    }

    public boolean method_43409(int n) {
        return n <= this.field_27337;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void method_31920(int n) {
        if (this.method_43409(n)) {
            return;
        }
        n = class04995.i((int)(n * 2), (int)this.field_27333);
        RenderSystem.LOGGER.debug("Growing IndexBuffer: Old limit {}, new limit {}.", (Object)this.field_27337, (Object)n);
        int n2 = n / this.field_27333;
        int n3 = n2 * this.field_27332;
        VertexFormat$class_5595 vertexFormat$class_5595 = VertexFormat$class_5595.method_31972(n3);
        int n4 = class04995.i((int)(n * vertexFormat$class_5595.field_27375), (int)4);
        ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)n4);
        try {
            this.field_27336 = vertexFormat$class_5595;
            IntConsumer intConsumer = this.method_31922(byteBuffer);
            for (int i = 0; i < n; i += this.field_27333) {
                this.field_27334.accept(intConsumer, i * this.field_27332 / this.field_27333);
            }
            byteBuffer.flip();
            if (this.field_54299 != null) {
                this.field_54299.close();
            }
            this.field_54299 = RenderSystem.getDevice().createBuffer(() -> "Auto Storage index buffer", 64, byteBuffer);
        }
        finally {
            MemoryUtil.memFree((Buffer)byteBuffer);
        }
        this.field_27337 = n;
    }

    private IntConsumer method_31922(ByteBuffer byteBuffer) {
        switch (RenderSystem.1.field_27331[this.field_27336.ordinal()]) {
            case 1: {
                return n -> byteBuffer.putShort((short)n);
            }
        }
        return byteBuffer::putInt;
    }

    public GpuBuffer method_68274(int n) {
        this.method_31920(n);
        return this.field_54299;
    }

    public VertexFormat$class_5595 method_31924() {
        return this.field_27336;
    }
}

