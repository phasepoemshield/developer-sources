/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5595
 *  java.lang.runtime.ObjectMethods
 *  org.jspecify.annotations.Nullable
 */
package com.mojang.blaze3d.systems;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.RenderPass$class_10885;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public record RenderPass$class_10884<T>(int comp_3804, GpuBuffer comp_3805, @Nullable GpuBuffer comp_3806, // Could not load outer class - annotation placement on inner may be incorrect
 @Nullable VertexFormat.class_5595 comp_3807, int comp_3808, int comp_3809, @Nullable BiConsumer<T, RenderPass$class_10885> comp_3810) {
    public RenderPass$class_10884(int n, GpuBuffer gpuBuffer, GpuBuffer gpuBuffer2, VertexFormat.class_5595 class_55952, int n2, int n3) {
        this(n, gpuBuffer, gpuBuffer2, class_55952, n2, n3, null);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{RenderPass$class_10884.class, "slot;vertexBuffer;indexBuffer;indexType;firstIndex;indexCount;uniformUploaderConsumer", "comp_3804", "comp_3805", "comp_3806", "comp_3807", "comp_3808", "comp_3809", "comp_3810"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{RenderPass$class_10884.class, "slot;vertexBuffer;indexBuffer;indexType;firstIndex;indexCount;uniformUploaderConsumer", "comp_3804", "comp_3805", "comp_3806", "comp_3807", "comp_3808", "comp_3809", "comp_3810"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{RenderPass$class_10884.class, "slot;vertexBuffer;indexBuffer;indexType;firstIndex;indexCount;uniformUploaderConsumer", "comp_3804", "comp_3805", "comp_3806", "comp_3807", "comp_3808", "comp_3809", "comp_3810"}, this);
    }
}

