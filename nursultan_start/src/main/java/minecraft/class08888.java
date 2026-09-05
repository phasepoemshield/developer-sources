/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlConst
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.opengl.ARBDirectStateAccess
 */
package minecraft;

import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import minecraft.class08882;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.ARBDirectStateAccess;

class class08888
extends class08882 {
    class08888() {
    }

    @Override
    void y(int n, long l, int n2) {
        ARBDirectStateAccess.glNamedBufferStorage((int)n, (long)l, (int)GlConst.bufferUsageToGlFlag((int)n2));
    }

    @Override
    void y(int n, ByteBuffer byteBuffer, int n2) {
        ARBDirectStateAccess.glNamedBufferStorage((int)n, (ByteBuffer)byteBuffer, (int)GlConst.bufferUsageToGlFlag((int)n2));
    }

    @Override
    public int y() {
        return ARBDirectStateAccess.glCreateFramebuffers();
    }

    @Override
    void N(int n, int n2) {
        ARBDirectStateAccess.glUnmapNamedBuffer((int)n);
    }

    @Override
    void N(int n, int n2, long l, long l2, long l3) {
        ARBDirectStateAccess.glCopyNamedBufferSubData((int)n, (int)n2, (long)l, (long)l2, (long)l3);
    }

    @Override
    void N(int n, long l, long l2, int n2) {
        ARBDirectStateAccess.glFlushMappedNamedBufferRange((int)n, (long)l, (long)l2);
    }

    @Override
    public void N(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        ARBDirectStateAccess.glBlitNamedFramebuffer((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (int)n9, (int)n10, (int)n11, (int)n12);
    }

    @Override
    public void N(int n, int n2, int n3, int n4, int n5) {
        ARBDirectStateAccess.glNamedFramebufferTexture((int)n, (int)36064, (int)n2, (int)n4);
        ARBDirectStateAccess.glNamedFramebufferTexture((int)n, (int)36096, (int)n3, (int)n4);
        if (n5 != 0) {
            GlStateManager._glBindFramebuffer((int)n5, (int)n);
        }
    }

    @Override
    int N() {
        GlStateManager.incrementTrackedBuffers();
        return ARBDirectStateAccess.glCreateBuffers();
    }

    @Override
    void N(int n, long l, int n2) {
        ARBDirectStateAccess.glNamedBufferData((int)n, (long)l, (int)GlConst.bufferUsageToGlEnum((int)n2));
    }

    @Override
    void N(int n, ByteBuffer byteBuffer, int n2) {
        ARBDirectStateAccess.glNamedBufferData((int)n, (ByteBuffer)byteBuffer, (int)GlConst.bufferUsageToGlEnum((int)n2));
    }

    @Override
    void N(int n, long l, ByteBuffer byteBuffer, int n2) {
        ARBDirectStateAccess.glNamedBufferSubData((int)n, (long)l, (ByteBuffer)byteBuffer);
    }

    @Override
    @Nullable ByteBuffer N(int n, long l, long l2, int n2, int n3) {
        return ARBDirectStateAccess.glMapNamedBufferRange((int)n, (long)l, (long)l2, (int)n2);
    }
}

