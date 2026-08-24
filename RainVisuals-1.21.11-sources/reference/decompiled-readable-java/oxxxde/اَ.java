/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  org.lwjgl.opengl.GL11
 */
package oxxxde;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;
import oxxxde.\u0636\u0651;

public class \u0627\u064e
implements \u0636\u0651 {
    public static final int GL_RGB = 6407;
    public static final int GL_RGBA = 6408;

    @Override
    public int genTexId() {
        return GlStateManager._genTexture();
    }

    @Override
    public void deleteTexture(int id) {
        GlStateManager._deleteTexture((int)id);
    }

    @Override
    public void bindTexture(int id) {
        GlStateManager._bindTexture((int)id);
    }

    @Override
    public void texImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) {
        GlStateManager._texImage2D((int)target, (int)level, (int)internalformat, (int)width, (int)height, (int)border, (int)format, (int)type, (ByteBuffer)pixels);
    }

    @Override
    public void texSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        GL11.glTexSubImage2D((int)target, (int)level, (int)xoffset, (int)yoffset, (int)width, (int)height, (int)format, (int)type, (long)pixels);
    }

    @Override
    public void texParameter(int target, int pname, float param) {
        GL11.glTexParameterf((int)target, (int)pname, (float)param);
    }

    @Override
    public void pixelStore(int pname, int param) {
        GlStateManager._pixelStore((int)pname, (int)param);
    }

    @Override
    public void texParameter(int target, int pname, int param) {
        GlStateManager._texParameter((int)target, (int)pname, (int)param);
    }

    @Override
    public void run(Runnable runnable) {
        runnable.run();
    }
}

