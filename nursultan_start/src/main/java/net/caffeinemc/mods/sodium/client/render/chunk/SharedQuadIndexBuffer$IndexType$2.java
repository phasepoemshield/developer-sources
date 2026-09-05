/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.gl.tessellation.GlIndexType
 */
package net.caffeinemc.mods.sodium.client.render.chunk;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlIndexType;
import net.caffeinemc.mods.sodium.client.render.chunk.SharedQuadIndexBuffer$IndexType;

final class SharedQuadIndexBuffer$IndexType$2
extends SharedQuadIndexBuffer$IndexType {
    SharedQuadIndexBuffer$IndexType$2(GlIndexType glIndexType, int n2) {
    }

    @Override
    public void createIndexBuffer(ByteBuffer byteBuffer, int n) {
        IntBuffer intBuffer = byteBuffer.asIntBuffer();
        for (int i = 0; i < n; ++i) {
            int n2 = i * 6;
            int n3 = i * 4;
            intBuffer.put(n2 + 0, n3 + 0);
            intBuffer.put(n2 + 1, n3 + 1);
            intBuffer.put(n2 + 2, n3 + 2);
            intBuffer.put(n2 + 3, n3 + 2);
            intBuffer.put(n2 + 4, n3 + 3);
            intBuffer.put(n2 + 5, n3 + 0);
        }
    }
}

