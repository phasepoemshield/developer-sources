/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializer
 *  org.lwjgl.system.MemoryUtil
 */
package me.flashyreese.mods.sodiumextra.compat;

import me.flashyreese.mods.sodiumextra.compat.IrisCompat;
import net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializer;
import org.lwjgl.system.MemoryUtil;

public class ModelVertexToTerrainSerializer
implements VertexSerializer {
    public void serialize(long l, long l2, int n) {
        for (int i = 0; i < n; ++i) {
            MemoryUtil.memCopy((long)l, (long)l2, (long)24L);
            MemoryUtil.memCopy((long)(l + 28L), (long)(l2 + 24L), (long)8L);
            l += 36L;
            l2 += (long)IrisCompat.getTerrainFormat().getVertexSize();
        }
    }
}

