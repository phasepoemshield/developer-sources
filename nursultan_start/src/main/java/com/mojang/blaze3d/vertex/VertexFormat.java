/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.CommandEncoder
 *  com.mojang.blaze3d.systems.GpuDevice
 *  it.unimi.dsi.fastutil.ints.IntList
 *  minecraft.class08741
 *  net.caffeinemc.mods.sodium.api.vertex.format.VertexFormatExtensions
 *  net.caffeinemc.mods.sodium.api.vertex.format.VertexFormatRegistry
 *  net.irisshaders.iris.pipeline.programs.VertexFormatExtension
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.mojang.blaze3d.vertex;

import com.google.common.collect.ImmutableSet;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat$Builder;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import it.unimi.dsi.fastutil.ints.IntList;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import minecraft.class08741;
import net.caffeinemc.mods.sodium.api.vertex.format.VertexFormatExtensions;
import net.caffeinemc.mods.sodium.api.vertex.format.VertexFormatRegistry;
import net.irisshaders.iris.pipeline.programs.VertexFormatExtension;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class VertexFormat
implements VertexFormatExtensions,
VertexFormatExtension {
    public static final int UNKNOWN_ELEMENT = -1;
    private final List<VertexFormatElement> elements;
    private final List<String> names;
    private final int vertexSize;
    private final int elementsMask;
    private final int[] offsetsByElement = new int[32];
    private @Nullable GpuBuffer immediateDrawVertexBuffer;
    private @Nullable GpuBuffer immediateDrawIndexBuffer;
    private static final ImmutableSet ATTRIBUTE_LIST = ImmutableSet.of((Object)"Position", (Object)"Color", (Object)"Normal", (Object)"UV0", (Object)"UV1", (Object)"UV2", (Object[])new Object[]{"LineWidth"});
    private int sodium$globalId;

    public String getElementName(VertexFormatElement vertexFormatElement) {
        int n = this.elements.indexOf((Object)vertexFormatElement);
        if (n == -1) {
            throw new IllegalArgumentException(String.valueOf((Object)vertexFormatElement) + " is not contained in format");
        }
        return this.names.get(n);
    }

    VertexFormat(List<VertexFormatElement> list, List<String> list2, IntList intList, int n3) {
        this.elements = list;
        this.names = list2;
        this.vertexSize = n3;
        this.elementsMask = list.stream().mapToInt(VertexFormatElement::mask).reduce(0, (n, n2) -> n | n2);
        for (int i = 0; i < this.offsetsByElement.length; ++i) {
            VertexFormatElement vertexFormatElement = VertexFormatElement.byId(i);
            int n4 = vertexFormatElement != null ? list.indexOf((Object)vertexFormatElement) : -1;
            this.offsetsByElement[i] = n4 != -1 ? intList.getInt(n4) : -1;
        }
        this.handler$cke000$sodium$afterInit(list, list2, intList, n3, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof VertexFormat)) return false;
        VertexFormat vertexFormat = (VertexFormat)object;
        if (this.elementsMask != vertexFormat.elementsMask) return false;
        if (this.vertexSize != vertexFormat.vertexSize) return false;
        if (!this.names.equals(vertexFormat.names)) return false;
        if (!Arrays.equals(this.offsetsByElement, vertexFormat.offsetsByElement)) return false;
        return true;
    }

    public String toString() {
        return "VertexFormat" + String.valueOf(this.names);
    }

    public int hashCode() {
        return this.elementsMask * 31 + Arrays.hashCode(this.offsetsByElement);
    }

    public static VertexFormat$Builder builder() {
        return new VertexFormat$Builder();
    }

    public boolean contains(VertexFormatElement vertexFormatElement) {
        return (this.elementsMask & vertexFormatElement.mask()) != 0;
    }

    public int getOffset(VertexFormatElement vertexFormatElement) {
        return this.offsetsByElement[vertexFormatElement.id()];
    }

    public void bindAttributesIris(boolean bl, int n) {
        int n2 = 0;
        for (String string : this.getElementAttributeNames()) {
            GlStateManager._glBindAttribLocation((int)n, (int)n2, (CharSequence)(ATTRIBUTE_LIST.contains((Object)string) && !bl ? "iris_" + string : string));
            ++n2;
        }
    }

    private static GpuBuffer uploadToBuffer(@Nullable GpuBuffer gpuBuffer, ByteBuffer byteBuffer, int n, Supplier<String> supplier) {
        GpuDevice gpuDevice = RenderSystem.getDevice();
        if (class08741.N((GpuDevice)gpuDevice).N()) {
            if (gpuBuffer != null) {
                gpuBuffer.close();
            }
            return gpuDevice.createBuffer(supplier, n, byteBuffer);
        }
        if (gpuBuffer == null) {
            gpuBuffer = gpuDevice.createBuffer(supplier, n, byteBuffer);
        } else {
            CommandEncoder commandEncoder = gpuDevice.createCommandEncoder();
            if (gpuBuffer.size() < (long)byteBuffer.remaining()) {
                gpuBuffer.close();
                gpuBuffer = gpuDevice.createBuffer(supplier, n, byteBuffer);
            } else {
                commandEncoder.writeToBuffer(gpuBuffer.slice(), byteBuffer);
            }
        }
        return gpuBuffer;
    }

    public int getVertexSize() {
        return this.vertexSize;
    }

    public int getElementsMask() {
        return this.elementsMask;
    }

    public int sodium$getGlobalId() {
        return this.sodium$globalId;
    }

    private void handler$cke000$sodium$afterInit(List list, List list2, IntList intList, int n, CallbackInfo callbackInfo) {
        this.sodium$globalId = VertexFormatRegistry.instance().allocateGlobalId(this);
    }

    public GpuBuffer uploadImmediateVertexBuffer(ByteBuffer byteBuffer) {
        this.immediateDrawVertexBuffer = VertexFormat.uploadToBuffer(this.immediateDrawVertexBuffer, byteBuffer, 40, () -> "Immediate vertex buffer for " + String.valueOf(this));
        return this.immediateDrawVertexBuffer;
    }

    public List<VertexFormatElement> getElements() {
        return this.elements;
    }

    public List<String> getElementAttributeNames() {
        return this.names;
    }

    public int[] getOffsetsByElement() {
        return this.offsetsByElement;
    }

    public GpuBuffer uploadImmediateIndexBuffer(ByteBuffer byteBuffer) {
        this.immediateDrawIndexBuffer = VertexFormat.uploadToBuffer(this.immediateDrawIndexBuffer, byteBuffer, 72, () -> "Immediate index buffer for " + String.valueOf(this));
        return this.immediateDrawIndexBuffer;
    }
}

