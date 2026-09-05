/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing
 *  net.caffeinemc.mods.sodium.client.util.NativeBuffer
 */
package net.caffeinemc.mods.sodium.client.render.chunk.data;

import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.util.NativeBuffer;

public class BuiltSectionMeshParts {
    private final int[] vertexSegments;
    private final NativeBuffer buffer;

    public BuiltSectionMeshParts(NativeBuffer nativeBuffer, int[] nArray) {
        this.vertexSegments = nArray;
        this.buffer = nativeBuffer;
    }

    public NativeBuffer getVertexData() {
        return this.buffer;
    }

    public int[] getVertexSegments() {
        return this.vertexSegments;
    }

    public int[] computeVertexCounts() {
        int[] nArray = new int[ModelQuadFacing.COUNT];
        for (int i = 0; i < this.vertexSegments.length; i += 2) {
            int n = this.vertexSegments[i];
            if (n == 0) continue;
            nArray[this.vertexSegments[i + 1]] = n;
        }
        return nArray;
    }
}

