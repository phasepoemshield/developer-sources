/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortType
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.UpdatedQuadsList
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data;

import java.nio.IntBuffer;
import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortType;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.UpdatedQuadsList;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad;

public abstract class TranslucentData {
    public static final int INDICES_PER_QUAD = 6;
    public static final int VERTICES_PER_QUAD = 4;
    public static final int BYTES_PER_INDEX = 4;
    public static final int BYTES_PER_QUAD = 24;
    public final class01296 sectionPos;

    TranslucentData(class01296 class012962) {
        this.sectionPos = class012962;
    }

    public void prepareTrigger(boolean bl) {
    }

    public UpdatedQuadsList getUpdatedQuads() {
        return null;
    }

    public boolean meshesWereModified() {
        return false;
    }

    public abstract boolean oldDataMatches(TranslucentGeometryCollector var1, SortType var2, TQuad[] var3);

    public abstract SortType getSortType();

    public static int quadCountToVertexCount(int n) {
        return n * 4;
    }

    public static void writeQuadVertexIndexes(IntBuffer intBuffer, int n) {
        int n2 = n * 4;
        intBuffer.put(n2 + 0);
        intBuffer.put(n2 + 1);
        intBuffer.put(n2 + 2);
        intBuffer.put(n2 + 2);
        intBuffer.put(n2 + 3);
        intBuffer.put(n2 + 0);
    }

    public static void writeQuadVertexIndexes(IntBuffer intBuffer, int[] nArray) {
        for (int i = 0; i < nArray.length; ++i) {
            TranslucentData.writeQuadVertexIndexes(intBuffer, nArray[i]);
        }
    }

    public static int vertexCountToQuadCount(int n) {
        return n / 4;
    }

    public static int quadCountToIndexBytes(int n) {
        return n * 24;
    }
}

