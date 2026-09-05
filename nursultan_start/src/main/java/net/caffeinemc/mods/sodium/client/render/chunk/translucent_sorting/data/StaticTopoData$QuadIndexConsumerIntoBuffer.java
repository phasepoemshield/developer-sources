/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data;

import java.nio.IntBuffer;
import java.util.function.IntConsumer;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;

record StaticTopoData$QuadIndexConsumerIntoBuffer(IntBuffer buffer) implements IntConsumer
{
    @Override
    public void accept(int n) {
        TranslucentData.writeQuadVertexIndexes(this.buffer, n);
    }
}

