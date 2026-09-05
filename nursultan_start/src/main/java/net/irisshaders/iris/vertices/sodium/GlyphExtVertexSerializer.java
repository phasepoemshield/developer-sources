/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07835
 *  net.caffeinemc.mods.sodium.api.memory.MemoryIntrinsics
 *  net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializer
 *  org.joml.Vector3f
 *  org.lwjgl.system.MemoryUtil
 */
package net.irisshaders.iris.vertices.sodium;

import minecraft.class07835;
import net.caffeinemc.mods.sodium.api.memory.MemoryIntrinsics;
import net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializer;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.IrisVertexFormats;
import net.irisshaders.iris.vertices.NormI8;
import net.irisshaders.iris.vertices.NormalHelper;
import net.irisshaders.iris.vertices.sodium.QuadViewEntity;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryUtil;

public class GlyphExtVertexSerializer
implements VertexSerializer {
    private static final int OFFSET_POSITION = 0;
    private static final int OFFSET_COLOR = 12;
    private static final int OFFSET_TEXTURE = 16;
    private static final int OFFSET_MID_TEXTURE;
    private static final int OFFSET_LIGHT = 24;
    private static final int OFFSET_NORMAL;
    private static final int OFFSET_TANGENT;
    private static final QuadViewEntity quad;
    private static final Vector3f saveNormal;
    private static final int STRIDE;

    static {
        STRIDE = IrisVertexFormats.GLYPH.getVertexSize();
        quad = new QuadViewEntity();
        saveNormal = new Vector3f();
    }

    public void serialize(long l, long l2, int n) {
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < n; ++i) {
            float f3 = MemoryUtil.memGetFloat((long)(l + 16L));
            float f4 = MemoryUtil.memGetFloat((long)(l + 16L + 4L));
            f += f3;
            f2 += f4;
            MemoryIntrinsics.copyMemory((long)l, (long)l2, (int)28);
            MemoryUtil.memPutShort((long)(l2 + 32L), (short)((short)CapturedRenderingState.INSTANCE.getCurrentRenderedEntity()));
            MemoryUtil.memPutShort((long)(l2 + 34L), (short)((short)CapturedRenderingState.INSTANCE.getCurrentRenderedBlockEntity()));
            MemoryUtil.memPutShort((long)(l2 + 36L), (short)((short)CapturedRenderingState.INSTANCE.getCurrentRenderedItem()));
            if (i == 3) continue;
            l += (long)class07835.U.getVertexSize();
            l2 += (long)IrisVertexFormats.GLYPH.getVertexSize();
        }
        GlyphExtVertexSerializer.endQuad(f, f2, l, l2);
    }

    private static void endQuad(float f, float f2, long l, long l2) {
        f *= 0.25f;
        f2 *= 0.25f;
        quad.setup(l2, IrisVertexFormats.GLYPH.getVertexSize());
        NormalHelper.computeFaceNormal(saveNormal, quad);
        float f3 = GlyphExtVertexSerializer.saveNormal.x;
        float f4 = GlyphExtVertexSerializer.saveNormal.y;
        float f5 = GlyphExtVertexSerializer.saveNormal.z;
        int n = NormI8.pack(saveNormal);
        int n2 = NormalHelper.computeTangent(f3, f4, f5, quad);
        for (long i = 0L; i < 4L; ++i) {
            MemoryUtil.memPutFloat((long)(l2 + (long)OFFSET_MID_TEXTURE - (long)STRIDE * i), (float)f);
            MemoryUtil.memPutFloat((long)(l2 + (long)(OFFSET_MID_TEXTURE + 4) - (long)STRIDE * i), (float)f2);
            MemoryUtil.memPutInt((long)(l2 + (long)OFFSET_NORMAL - (long)STRIDE * i), (int)n);
            MemoryUtil.memPutInt((long)(l2 + (long)OFFSET_TANGENT - (long)STRIDE * i), (int)n2);
        }
    }
}

