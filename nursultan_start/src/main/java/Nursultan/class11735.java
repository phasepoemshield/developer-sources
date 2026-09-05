/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  org.lwjgl.opengl.GL12
 *  org.lwjgl.opengl.GL33
 */
package Nursultan;

import Nursultan.class11741;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL33;

public class class11735
implements class11741 {
    class11735() {
    }

    @Override
    public int N(int n, int n2, ByteBuffer byteBuffer) {
        int n3 = GL33.glGenTextures();
        if (n3 == 0) {
            return 0;
        }
        int n4 = GL33.glGetInteger((int)32873);
        GlStateManager._bindTexture((int)n3);
        GlStateManager._texParameter((int)3553, (int)10240, (int)9729);
        GlStateManager._texParameter((int)3553, (int)10241, (int)9729);
        GlStateManager._texParameter((int)3553, (int)10242, (int)33071);
        GlStateManager._texParameter((int)3553, (int)10243, (int)33071);
        GlStateManager._pixelStore((int)3314, (int)0);
        GlStateManager._pixelStore((int)3316, (int)0);
        GlStateManager._pixelStore((int)3315, (int)0);
        GlStateManager._pixelStore((int)3317, (int)1);
        GL33.glTexImage2D((int)3553, (int)0, (int)32856, (int)n, (int)n2, (int)0, (int)6408, (int)5121, (ByteBuffer)byteBuffer);
        GlStateManager._bindTexture((int)n4);
        return n3;
    }

    @Override
    public int N() {
        int n = GL33.glGenTextures();
        if (n == 0) {
            return 0;
        }
        int n2 = GL33.glGetInteger((int)32873);
        GlStateManager._bindTexture((int)n);
        GlStateManager._texParameter((int)3553, (int)10240, (int)9729);
        GlStateManager._texParameter((int)3553, (int)10241, (int)9729);
        GlStateManager._texParameter((int)3553, (int)10242, (int)33071);
        GlStateManager._texParameter((int)3553, (int)10243, (int)33071);
        GlStateManager._texParameter((int)3553, (int)32882, (int)33071);
        GlStateManager._texParameter((int)3553, (int)36418, (int)1);
        GlStateManager._texParameter((int)3553, (int)36419, (int)1);
        GlStateManager._texParameter((int)3553, (int)36420, (int)1);
        GlStateManager._texParameter((int)3553, (int)36421, (int)6403);
        GlStateManager._bindTexture((int)n2);
        return n;
    }

    @Override
    public void N(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, ByteBuffer byteBuffer) {
        int n8 = GL33.glGetInteger((int)32873);
        GlStateManager._bindTexture((int)n);
        GlStateManager._pixelStore((int)3314, (int)0);
        GlStateManager._pixelStore((int)3316, (int)0);
        GlStateManager._pixelStore((int)3315, (int)0);
        GlStateManager._pixelStore((int)3317, (int)1);
        if (bl) {
            GL33.glTexImage2D((int)3553, (int)0, (int)33321, (int)n6, (int)n7, (int)0, (int)6403, (int)5121, (ByteBuffer)byteBuffer);
        } else {
            GL12.glTexSubImage2D((int)3553, (int)0, (int)n2, (int)n3, (int)n4, (int)n5, (int)6403, (int)5121, (ByteBuffer)byteBuffer);
        }
        GlStateManager._bindTexture((int)n8);
    }
}

