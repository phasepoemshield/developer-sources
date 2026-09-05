/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.gl.tessellation.GlIndexType
 */
package net.caffeinemc.mods.sodium.client.render.chunk;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlIndexType;
import net.caffeinemc.mods.sodium.client.render.chunk.SharedQuadIndexBuffer$IndexType;

final class SharedQuadIndexBuffer$IndexType$1
extends SharedQuadIndexBuffer$IndexType {
    SharedQuadIndexBuffer$IndexType$1(GlIndexType glIndexType, int n2) {
    }

    @Override
    public void createIndexBuffer(ByteBuffer byteBuffer, int n) {
        ShortBuffer shortBuffer = byteBuffer.asShortBuffer();
        for (int i = 0; i < n; ++i) {
            int n2 = i * 6;
            int n3 = i * 4;
            shortBuffer.put(n2 + 0, (short)(n3 + 0));
            shortBuffer.put(n2 + 1, (short)(n3 + 1));
            shortBuffer.put(n2 + 2, (short)(n3 + 2));
            shortBuffer.put(n2 + 3, (short)(n3 + 2));
            shortBuffer.put(n2 + 4, (short)(n3 + 3));
            shortBuffer.put(n2 + 5, (short)(n3 + 0));
        }
    }
}

