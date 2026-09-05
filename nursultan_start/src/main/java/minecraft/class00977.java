/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00984
 *  minecraft.class05846
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class00984;
import minecraft.class05846;

public final class class00977
extends Record {
    final int indexCount;
    final GpuBufferSlice dynamicTransforms;
    final Map<class05846, class00984> layers;

    public Map<class05846, class00984> L() {
        return this.layers;
    }

    public class00977(int n, GpuBufferSlice gpuBufferSlice, Map<class05846, class00984> map) {
        this.indexCount = n;
        this.dynamicTransforms = gpuBufferSlice;
        this.layers = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00977.class, "indexCount;dynamicTransforms;layers", "indexCount", "dynamicTransforms", "layers"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00977.class, "indexCount;dynamicTransforms;layers", "indexCount", "dynamicTransforms", "layers"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00977.class, "indexCount;dynamicTransforms;layers", "indexCount", "dynamicTransforms", "layers"}, this);
    }

    public GpuBufferSlice y() {
        return this.dynamicTransforms;
    }

    public int N() {
        return this.indexCount;
    }
}

