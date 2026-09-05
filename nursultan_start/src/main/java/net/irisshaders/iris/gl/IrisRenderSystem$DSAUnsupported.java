/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.irisshaders.iris.mixin.GlStateManagerAccessor
 *  org.lwjgl.opengl.GL32C
 *  org.lwjgl.opengl.GL46C
 */
package net.irisshaders.iris.gl;

import com.mojang.blaze3d.opengl.GlStateManager;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.IrisRenderSystem$DSAAccess;
import net.irisshaders.iris.mixin.GlStateManagerAccessor;
import org.lwjgl.opengl.GL32C;
import org.lwjgl.opengl.GL46C;

public class IrisRenderSystem$DSAUnsupported
implements IrisRenderSystem$DSAAccess {
    @Override
    public void readBuffer(int n, int n2) {
        GlStateManager._glBindFramebuffer((int)36160, (int)n);
        GL32C.glReadBuffer((int)n2);
    }

    @Override
    public int createTexture(int n) {
        int n2 = GlStateManager._genTexture();
        IrisRenderSystem.bindTextureForSetup(n, n2);
        IrisRenderSystem.restoreTexture();
        return n2;
    }

    @Override
    public int createBuffers() {
        return GlStateManager._glGenBuffers();
    }

    @Override
    public void blitFramebuffer(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        GlStateManager._glBindFramebuffer((int)36008, (int)n);
        GlStateManager._glBindFramebuffer((int)36009, (int)n2);
        GL32C.glBlitFramebuffer((int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (int)n9, (int)n10, (int)n11, (int)n12);
    }

    @Override
    public int createFramebuffer() {
        int n = GlStateManager.glGenFramebuffers();
        GlStateManager._glBindFramebuffer((int)36160, (int)n);
        return n;
    }

    @Override
    public void drawBuffers(int n, int[] nArray) {
        GlStateManager._glBindFramebuffer((int)36160, (int)n);
        GL32C.glDrawBuffers((int[])nArray);
    }

    @Override
    public void clearBufferuiv(int n, int n2, int n3, int[] nArray) {
        GlStateManager._glBindFramebuffer((int)36160, (int)n);
        GL32C.glClearBufferuiv((int)n2, (int)n3, (int[])nArray);
    }

    @Override
    public void copyTexSubImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        int n10 = GlStateManagerAccessor.getTEXTURES()[GlStateManagerAccessor.getActiveTexture()].field_5167;
        GlStateManager._bindTexture((int)n);
        GL32C.glCopyTexSubImage2D((int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (int)n9);
        GlStateManager._bindTexture((int)n10);
    }

    @Override
    public void texParameteri(int n, int n2, int n3, int n4) {
        IrisRenderSystem.bindTextureForSetup(n2, n);
        GL32C.glTexParameteri((int)n2, (int)n3, (int)n4);
        IrisRenderSystem.restoreTexture();
    }

    @Override
    public void texParameteriv(int n, int n2, int n3, int[] nArray) {
        IrisRenderSystem.bindTextureForSetup(n2, n);
        GL32C.glTexParameteriv((int)n2, (int)n3, (int[])nArray);
        IrisRenderSystem.restoreTexture();
    }

    @Override
    public void clearBufferiv(int n, int n2, int n3, int[] nArray) {
        GlStateManager._glBindFramebuffer((int)36160, (int)n);
        GL32C.glClearBufferiv((int)n2, (int)n3, (int[])nArray);
    }

    @Override
    public void generateMipmaps(int n, int n2) {
        int n3 = GlStateManagerAccessor.getTEXTURES()[GlStateManagerAccessor.getActiveTexture()].field_5167;
        GlStateManager._bindTexture((int)n);
        GL32C.glGenerateMipmap((int)n2);
        GlStateManager._bindTexture((int)n3);
    }

    @Override
    public void clearBufferfv(int n, int n2, int n3, float[] fArray) {
        GlStateManager._glBindFramebuffer((int)36160, (int)n);
        GL32C.glClearBufferfv((int)n2, (int)n3, (float[])fArray);
    }

    @Override
    public void texParameterf(int n, int n2, int n3, float f) {
        IrisRenderSystem.bindTextureForSetup(n2, n);
        GL32C.glTexParameterf((int)n2, (int)n3, (float)f);
        IrisRenderSystem.restoreTexture();
    }

    @Override
    public int getTexParameteri(int n, int n2, int n3) {
        IrisRenderSystem.bindTextureForSetup(n2, n);
        return GL32C.glGetTexParameteri((int)n2, (int)n3);
    }

    @Override
    public void bindTextureToUnit(int n, int n2, int n3) {
        int n4 = GlStateManagerAccessor.getActiveTexture();
        GlStateManager._activeTexture((int)(33984 + n2));
        GL46C.glBindTexture((int)n, (int)n3);
        if (n == 3553) {
            GlStateManagerAccessor.getTEXTURES()[n2].field_5167 = n3;
        }
        GlStateManager._activeTexture((int)(33984 + n4));
    }

    @Override
    public int bufferStorage(int n, float[] fArray, int n2) {
        int n3 = GlStateManager._glGenBuffers();
        GlStateManager._glBindBuffer((int)n, (int)n3);
        IrisRenderSystem.bufferData(n, fArray, n2);
        GlStateManager._glBindBuffer((int)n, (int)0);
        return n3;
    }

    @Override
    public void framebufferTexture2D(int n, int n2, int n3, int n4, int n5, int n6) {
        GlStateManager._glBindFramebuffer((int)n2, (int)n);
        GL32C.glFramebufferTexture2D((int)n2, (int)n3, (int)n4, (int)n5, (int)n6);
    }
}

