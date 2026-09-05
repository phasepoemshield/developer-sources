/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializer
 *  org.lwjgl.system.MemoryUtil
 */
package net.irisshaders.iris.vertices.sodium;

import net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializer;
import net.irisshaders.iris.vertices.IrisVertexFormats;
import org.lwjgl.system.MemoryUtil;

public class IrisEntityToTerrainVertexSerializer
implements VertexSerializer {
    public void serialize(long l, long l2, int n) {
        for (int i = 0; i < n; ++i) {
            MemoryUtil.memPutFloat((long)l2, (float)MemoryUtil.memGetFloat((long)l));
            MemoryUtil.memPutFloat((long)(l2 + 4L), (float)MemoryUtil.memGetFloat((long)(l + 4L)));
            MemoryUtil.memPutFloat((long)(l2 + 8L), (float)MemoryUtil.memGetFloat((long)(l + 8L)));
            MemoryUtil.memPutInt((long)(l2 + 12L), (int)MemoryUtil.memGetInt((long)(l + 12L)));
            MemoryUtil.memPutFloat((long)(l2 + 16L), (float)MemoryUtil.memGetFloat((long)(l + 16L)));
            MemoryUtil.memPutFloat((long)(l2 + 20L), (float)MemoryUtil.memGetFloat((long)(l + 20L)));
            MemoryUtil.memPutInt((long)(l2 + 24L), (int)MemoryUtil.memGetInt((long)(l + 28L)));
            MemoryUtil.memPutInt((long)(l2 + 28L), (int)MemoryUtil.memGetInt((long)(l + 32L)));
            MemoryUtil.memPutInt((long)(l2 + 32L), (int)0);
            MemoryUtil.memPutInt((long)(l2 + 36L), (int)MemoryUtil.memGetInt((long)(l + 36L)));
            MemoryUtil.memPutInt((long)(l2 + 40L), (int)MemoryUtil.memGetInt((long)(l + 40L)));
            MemoryUtil.memPutInt((long)(l2 + 44L), (int)MemoryUtil.memGetInt((long)(l + 44L)));
            l += (long)IrisVertexFormats.ENTITY.getVertexSize();
            l2 += (long)IrisVertexFormats.TERRAIN.getVertexSize();
        }
    }
}

