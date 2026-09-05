/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  minecraft.class01391
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryStack
 */
package net.caffeinemc.mods.sodium.api.vertex.buffer;

import com.mojang.blaze3d.vertex.VertexFormat;
import minecraft.class01391;
import net.caffeinemc.mods.sodium.api.memory.MemoryIntrinsics;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryStack;

public interface VertexBufferWriter {
    public static void copyInto(VertexBufferWriter vertexBufferWriter, MemoryStack memoryStack, long l, int n, VertexFormat vertexFormat) {
        int n2 = n * vertexFormat.getVertexSize();
        long l2 = memoryStack.nmalloc(n2);
        MemoryIntrinsics.copyMemory(l, l2, n2);
        vertexBufferWriter.push(memoryStack, l2, n, vertexFormat);
    }

    public static VertexBufferWriter of(class01391 class013912) {
        VertexBufferWriter vertexBufferWriter;
        if (class013912 instanceof VertexBufferWriter && (vertexBufferWriter = (VertexBufferWriter)class013912).canUseIntrinsics()) {
            return vertexBufferWriter;
        }
        throw VertexBufferWriter.createUnsupportedVertexConsumerThrowable(class013912);
    }

    public void push(MemoryStack var1, long var2, int var4, VertexFormat var5);

    public static @Nullable VertexBufferWriter tryOf(class01391 class013912) {
        VertexBufferWriter vertexBufferWriter;
        if (class013912 instanceof VertexBufferWriter && (vertexBufferWriter = (VertexBufferWriter)class013912).canUseIntrinsics()) {
            return vertexBufferWriter;
        }
        return null;
    }

    default public boolean canUseIntrinsics() {
        return true;
    }

    private static RuntimeException createUnsupportedVertexConsumerThrowable(class01391 class013912) {
        Class clazz = class013912.getClass();
        String string = clazz.getName();
        return new IllegalArgumentException("The class %s does not implement interface VertexBufferWriter, which is required for compatibility with Sodium (see: https://github.com/CaffeineMC/sodium/issues/1620)".formatted(new Object[]{string}));
    }
}

