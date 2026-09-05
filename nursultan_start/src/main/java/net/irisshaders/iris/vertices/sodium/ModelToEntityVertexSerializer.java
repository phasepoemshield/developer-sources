/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.api.memory.MemoryIntrinsics
 *  net.caffeinemc.mods.sodium.api.util.NormI8
 *  net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializer
 *  org.lwjgl.system.MemoryUtil
 */
package net.irisshaders.iris.vertices.sodium;

import net.caffeinemc.mods.sodium.api.memory.MemoryIntrinsics;
import net.caffeinemc.mods.sodium.api.util.NormI8;
import net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializer;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.IrisVertexFormats;
import net.irisshaders.iris.vertices.NormalHelper;
import org.lwjgl.system.MemoryUtil;

public class ModelToEntityVertexSerializer
implements VertexSerializer {
    public void serialize(long l, long l2, int n) {
        int n2 = n / 4;
        for (int i = 0; i < n2; ++i) {
            int n3;
            int n4 = MemoryUtil.memGetInt((long)(l + 32L));
            int n5 = NormalHelper.computeTangent(null, NormI8.unpackX((int)n4), NormI8.unpackY((int)n4), NormI8.unpackZ((int)n4), MemoryUtil.memGetFloat((long)l), MemoryUtil.memGetFloat((long)(l + 4L)), MemoryUtil.memGetFloat((long)(l + 8L)), MemoryUtil.memGetFloat((long)(l + 16L)), MemoryUtil.memGetFloat((long)(l + 20L)), MemoryUtil.memGetFloat((long)(l + 36L)), MemoryUtil.memGetFloat((long)(l + 4L + 36L)), MemoryUtil.memGetFloat((long)(l + 8L + 36L)), MemoryUtil.memGetFloat((long)(l + 16L + 36L)), MemoryUtil.memGetFloat((long)(l + 20L + 36L)), MemoryUtil.memGetFloat((long)(l + 36L + 36L)), MemoryUtil.memGetFloat((long)(l + 4L + 36L + 36L)), MemoryUtil.memGetFloat((long)(l + 8L + 36L + 36L)), MemoryUtil.memGetFloat((long)(l + 16L + 36L + 36L)), MemoryUtil.memGetFloat((long)(l + 20L + 36L + 36L)));
            float f = 0.0f;
            float f2 = 0.0f;
            for (n3 = 0; n3 < 4; ++n3) {
                f += MemoryUtil.memGetFloat((long)(l + 16L + (long)(36 * n3)));
                f2 += MemoryUtil.memGetFloat((long)(l + 20L + (long)(36 * n3)));
            }
            f /= 4.0f;
            f2 /= 4.0f;
            for (n3 = 0; n3 < 4; ++n3) {
                MemoryIntrinsics.copyMemory((long)l, (long)l2, (int)36);
                MemoryUtil.memPutShort((long)(l2 + 36L), (short)((short)CapturedRenderingState.INSTANCE.getCurrentRenderedEntity()));
                MemoryUtil.memPutShort((long)(l2 + 38L), (short)((short)CapturedRenderingState.INSTANCE.getCurrentRenderedBlockEntity()));
                MemoryUtil.memPutShort((long)(l2 + 40L), (short)((short)CapturedRenderingState.INSTANCE.getCurrentRenderedItem()));
                MemoryUtil.memPutFloat((long)(l2 + 42L), (float)f);
                MemoryUtil.memPutFloat((long)(l2 + 46L), (float)f2);
                MemoryUtil.memPutInt((long)(l2 + 50L), (int)n5);
                l += 36L;
                l2 += (long)IrisVertexFormats.ENTITY.getVertexSize();
            }
        }
    }
}

