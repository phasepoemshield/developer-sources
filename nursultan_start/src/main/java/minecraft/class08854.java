/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlConst
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.opengl.ARBBufferStorage
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.opengl.GL31
 */
package minecraft;

import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import minecraft.class08882;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.ARBBufferStorage;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL31;

class class08854
extends class08882 {
    class08854() {
    }

    @Override
    void y(int n, long l, int n2) {
        int n3 = this.N(n2);
        GlStateManager._glBindBuffer((int)n3, (int)n);
        ARBBufferStorage.glBufferStorage((int)n3, (long)l, (int)GlConst.bufferUsageToGlFlag((int)n2));
        GlStateManager._glBindBuffer((int)n3, (int)0);
    }

    @Override
    void y(int n, ByteBuffer byteBuffer, int n2) {
        int n3 = this.N(n2);
        GlStateManager._glBindBuffer((int)n3, (int)n);
        ARBBufferStorage.glBufferStorage((int)n3, (ByteBuffer)byteBuffer, (int)GlConst.bufferUsageToGlFlag((int)n2));
        GlStateManager._glBindBuffer((int)n3, (int)0);
    }

    @Override
    public int y() {
        return GlStateManager.glGenFramebuffers();
    }

    @Override
    void N(int n, int n2) {
        int n3 = this.N(n2);
        GlStateManager._glBindBuffer((int)n3, (int)n);
        GlStateManager._glUnmapBuffer((int)n3);
        GlStateManager._glBindBuffer((int)n3, (int)0);
    }

    @Override
    void N(int n, long l, long l2, int n2) {
        int n3 = this.N(n2);
        GlStateManager._glBindBuffer((int)n3, (int)n);
        GL30.glFlushMappedBufferRange((int)n3, (long)l, (long)l2);
        GlStateManager._glBindBuffer((int)n3, (int)0);
    }

    @Override
    void N(int n, int n2, long l, long l2, long l3) {
        GlStateManager._glBindBuffer((int)36662, (int)n);
        GlStateManager._glBindBuffer((int)36663, (int)n2);
        GL31.glCopyBufferSubData((int)36662, (int)36663, (long)l, (long)l2, (long)l3);
        GlStateManager._glBindBuffer((int)36662, (int)0);
        GlStateManager._glBindBuffer((int)36663, (int)0);
    }

    private int N(int n) {
        if ((n & 0x20) != 0) {
            return 34962;
        }
        if ((n & 0x40) != 0) {
            return 34963;
        }
        if ((n & 0x80) != 0) {
            return 35345;
        }
        return 36663;
    }

    @Override
    public void N(int n, int n2, int n3, int n4, int n5) {
        int n6 = n5 == 0 ? 36009 : n5;
        int n7 = GlStateManager.getFrameBuffer((int)n6);
        GlStateManager._glBindFramebuffer((int)n6, (int)n);
        GlStateManager._glFramebufferTexture2D((int)n6, (int)36064, (int)3553, (int)n2, (int)n4);
        GlStateManager._glFramebufferTexture2D((int)n6, (int)36096, (int)3553, (int)n3, (int)n4);
        if (n5 == 0) {
            GlStateManager._glBindFramebuffer((int)n6, (int)n7);
        }
    }

    @Override
    public void N(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        int n13 = GlStateManager.getFrameBuffer((int)36008);
        int n14 = GlStateManager.getFrameBuffer((int)36009);
        GlStateManager._glBindFramebuffer((int)36008, (int)n);
        GlStateManager._glBindFramebuffer((int)36009, (int)n2);
        GlStateManager._glBlitFrameBuffer((int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (int)n9, (int)n10, (int)n11, (int)n12);
        GlStateManager._glBindFramebuffer((int)36008, (int)n13);
        GlStateManager._glBindFramebuffer((int)36009, (int)n14);
    }

    @Override
    void N(int n, ByteBuffer byteBuffer, int n2) {
        int n3 = this.N(n2);
        GlStateManager._glBindBuffer((int)n3, (int)n);
        GlStateManager._glBufferData((int)n3, (ByteBuffer)byteBuffer, (int)GlConst.bufferUsageToGlEnum((int)n2));
        GlStateManager._glBindBuffer((int)n3, (int)0);
    }

    @Override
    void N(int n, long l, ByteBuffer byteBuffer, int n2) {
        int n3 = this.N(n2);
        GlStateManager._glBindBuffer((int)n3, (int)n);
        GlStateManager._glBufferSubData((int)n3, (long)l, (ByteBuffer)byteBuffer);
        GlStateManager._glBindBuffer((int)n3, (int)0);
    }

    @Override
    void N(int n, long l, int n2) {
        int n3 = this.N(n2);
        GlStateManager._glBindBuffer((int)n3, (int)n);
        GlStateManager._glBufferData((int)n3, (long)l, (int)GlConst.bufferUsageToGlEnum((int)n2));
        GlStateManager._glBindBuffer((int)n3, (int)0);
    }

    @Override
    int N() {
        return GlStateManager._glGenBuffers();
    }

    @Override
    @Nullable ByteBuffer N(int n, long l, long l2, int n2, int n3) {
        int n4 = this.N(n3);
        GlStateManager._glBindBuffer((int)n4, (int)n);
        ByteBuffer byteBuffer = GlStateManager._glMapBufferRange((int)n4, (long)l, (long)l2, (int)n2);
        GlStateManager._glBindBuffer((int)n4, (int)0);
        return byteBuffer;
    }
}

