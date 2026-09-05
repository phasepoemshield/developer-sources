/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  net.irisshaders.iris.api.v0.IrisTextVertexSink
 *  org.joml.Vector3f
 *  org.lwjgl.system.MemoryUtil
 */
package net.irisshaders.iris.vertices;

import com.mojang.blaze3d.vertex.VertexFormat;
import java.nio.ByteBuffer;
import java.util.function.IntFunction;
import net.irisshaders.iris.api.v0.IrisTextVertexSink;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.IrisTextVertexSinkImpl$TextQuadView;
import net.irisshaders.iris.vertices.IrisVertexFormats;
import net.irisshaders.iris.vertices.NormI8;
import net.irisshaders.iris.vertices.NormalHelper;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryUtil;

public class IrisTextVertexSinkImpl
implements IrisTextVertexSink {
    static final VertexFormat format = IrisVertexFormats.GLYPH;
    private static final int STRIDE = IrisVertexFormats.GLYPH.getVertexSize();
    private static final int OFFSET_POSITION = 0;
    private static final int OFFSET_COLOR = 12;
    private static final int OFFSET_TEXTURE = 16;
    private static final int OFFSET_MID_TEXTURE = 38;
    private static final int OFFSET_LIGHT = 24;
    private static final int OFFSET_NORMAL = 28;
    private static final int OFFSET_TANGENT = 46;
    private final ByteBuffer buffer;
    private final IrisTextVertexSinkImpl$TextQuadView quad = new IrisTextVertexSinkImpl$TextQuadView();
    private final Vector3f saveNormal = new Vector3f();
    private int vertexCount;
    private long elementOffset;
    private float uSum;
    private float vSum;

    public IrisTextVertexSinkImpl(int n, IntFunction<ByteBuffer> intFunction) {
        this.buffer = intFunction.apply(format.getVertexSize() * 4 * n);
        this.elementOffset = MemoryUtil.memAddress((ByteBuffer)this.buffer);
    }

    private void vertex(float f, float f2, float f3, int n, float f4, float f5, int n2) {
        ++this.vertexCount;
        this.uSum += f4;
        this.vSum += f5;
        long l = this.elementOffset;
        MemoryUtil.memPutFloat((long)(l + 0L), (float)f);
        MemoryUtil.memPutFloat((long)(l + 0L + 4L), (float)f2);
        MemoryUtil.memPutFloat((long)(l + 0L + 8L), (float)f3);
        MemoryUtil.memPutInt((long)(l + 12L), (int)n);
        MemoryUtil.memPutFloat((long)(l + 16L), (float)f4);
        MemoryUtil.memPutFloat((long)(l + 16L + 4L), (float)f5);
        MemoryUtil.memPutInt((long)(l + 24L), (int)n2);
        MemoryUtil.memPutShort((long)(l + 32L), (short)((short)CapturedRenderingState.INSTANCE.getCurrentRenderedEntity()));
        MemoryUtil.memPutShort((long)(l + 34L), (short)((short)CapturedRenderingState.INSTANCE.getCurrentRenderedBlockEntity()));
        MemoryUtil.memPutShort((long)(l + 36L), (short)((short)CapturedRenderingState.INSTANCE.getCurrentRenderedItem()));
        if (this.vertexCount == 4) {
            this.vertexCount = 0;
            this.uSum *= 0.25f;
            this.vSum *= 0.25f;
            this.quad.setup(this.elementOffset, IrisVertexFormats.GLYPH.getVertexSize());
            NormalHelper.computeFaceNormal(this.saveNormal, this.quad);
            float f6 = this.saveNormal.x;
            float f7 = this.saveNormal.y;
            float f8 = this.saveNormal.z;
            int n3 = NormI8.pack(f6, f7, f8, 0.0f);
            int n4 = NormalHelper.computeTangent(f6, f7, f8, this.quad);
            for (long i = 0L; i < 4L; ++i) {
                MemoryUtil.memPutFloat((long)(l + 38L - (long)STRIDE * i), (float)this.uSum);
                MemoryUtil.memPutFloat((long)(l + 42L - (long)STRIDE * i), (float)this.vSum);
                MemoryUtil.memPutInt((long)(l + 28L - (long)STRIDE * i), (int)n3);
                MemoryUtil.memPutInt((long)(l + 46L - (long)STRIDE * i), (int)n4);
            }
            this.uSum = 0.0f;
            this.vSum = 0.0f;
        }
        this.buffer.position(this.buffer.position() + STRIDE);
        this.elementOffset += (long)STRIDE;
    }

    public void quad(float f, float f2, float f3, float f4, float f5, int n, float f6, float f7, float f8, float f9, int n2) {
        this.vertex(f, f2, f5, n, f6, f7, n2);
        this.vertex(f, f4, f5, n, f6, f9, n2);
        this.vertex(f3, f4, f5, n, f8, f9, n2);
        this.vertex(f3, f2, f5, n, f8, f7, n2);
    }

    public ByteBuffer getUnderlyingByteBuffer() {
        return this.buffer;
    }

    public VertexFormat getUnderlyingVertexFormat() {
        return format;
    }
}

