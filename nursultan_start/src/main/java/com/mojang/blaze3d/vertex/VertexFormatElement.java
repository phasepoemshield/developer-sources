/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.mojang.blaze3d.vertex;

import com.mojang.blaze3d.vertex.VertexFormatElement$Type;
import com.mojang.blaze3d.vertex.VertexFormatElement$Usage;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public record VertexFormatElement(int id, int index, VertexFormatElement$Type type, VertexFormatElement$Usage usage, int count) {
    public static final int MAX_COUNT = 32;
    private static final @Nullable VertexFormatElement[] BY_ID = new VertexFormatElement[32];
    private static final List<VertexFormatElement> ELEMENTS = new ArrayList<VertexFormatElement>(32);
    public static final VertexFormatElement POSITION = VertexFormatElement.register(0, 0, VertexFormatElement$Type.FLOAT, VertexFormatElement$Usage.POSITION, 3);
    public static final VertexFormatElement COLOR = VertexFormatElement.register(1, 0, VertexFormatElement$Type.UBYTE, VertexFormatElement$Usage.COLOR, 4);
    public static final VertexFormatElement UV0;
    public static final VertexFormatElement UV;
    public static final VertexFormatElement UV1;
    public static final VertexFormatElement UV2;
    public static final VertexFormatElement NORMAL;
    public static final VertexFormatElement LINE_WIDTH;

    public int mask() {
        return 1 << this.id;
    }

    public VertexFormatElement(int n, int n2, VertexFormatElement$Type vertexFormatElement$Type, VertexFormatElement$Usage vertexFormatElement$Usage, int n3) {
        if (n < 0 || n >= BY_ID.length) {
            throw new IllegalArgumentException("Element ID must be in range [0; " + BY_ID.length + ")");
        }
        if (!this.supportsUsage(n2, vertexFormatElement$Usage)) {
            throw new IllegalStateException("Multiple vertex elements of the same type other than UVs are not supported");
        }
        this.id = n;
        this.index = n2;
        this.type = vertexFormatElement$Type;
        this.usage = vertexFormatElement$Usage;
        this.count = n3;
    }

    public String toString() {
        return this.count + "," + String.valueOf((Object)this.usage) + "," + String.valueOf((Object)this.type) + " (" + this.id + ")";
    }

    public static VertexFormatElement register(int n, int n2, VertexFormatElement$Type vertexFormatElement$Type, VertexFormatElement$Usage vertexFormatElement$Usage, int n3) {
        VertexFormatElement vertexFormatElement = new VertexFormatElement(n, n2, vertexFormatElement$Type, vertexFormatElement$Usage, n3);
        if (BY_ID[n] != null) {
            throw new IllegalArgumentException("Duplicate element registration for: " + n);
        }
        VertexFormatElement.BY_ID[n] = vertexFormatElement;
        ELEMENTS.add(vertexFormatElement);
        return vertexFormatElement;
    }

    public int byteSize() {
        return this.type.size() * this.count;
    }

    public static @Nullable VertexFormatElement byId(int n) {
        return BY_ID[n];
    }

    public static Stream<VertexFormatElement> elementsFromMask(int n) {
        return ELEMENTS.stream().filter(vertexFormatElement -> (n & vertexFormatElement.mask()) != 0);
    }

    private boolean supportsUsage(int n, VertexFormatElement$Usage vertexFormatElement$Usage) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$bib000$iris$fixGenericAttributes(n, vertexFormatElement$Usage, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return n == 0 || vertexFormatElement$Usage == VertexFormatElement$Usage.UV;
    }

    private void handler$bib000$iris$fixGenericAttributes(int n, VertexFormatElement$Usage vertexFormatElement$Usage, CallbackInfoReturnable callbackInfoReturnable) {
        if (vertexFormatElement$Usage == VertexFormatElement$Usage.GENERIC) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    static {
        UV = UV0 = VertexFormatElement.register(2, 0, VertexFormatElement$Type.FLOAT, VertexFormatElement$Usage.UV, 2);
        UV1 = VertexFormatElement.register(3, 1, VertexFormatElement$Type.SHORT, VertexFormatElement$Usage.UV, 2);
        UV2 = VertexFormatElement.register(4, 2, VertexFormatElement$Type.SHORT, VertexFormatElement$Usage.UV, 2);
        NORMAL = VertexFormatElement.register(5, 0, VertexFormatElement$Type.BYTE, VertexFormatElement$Usage.NORMAL, 3);
        LINE_WIDTH = VertexFormatElement.register(6, 0, VertexFormatElement$Type.FLOAT, VertexFormatElement$Usage.GENERIC, 1);
    }
}

