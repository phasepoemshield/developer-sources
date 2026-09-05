/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.mixin.GlStateManagerAccessor
 *  org.lwjgl.opengl.ARBDirectStateAccess
 *  org.lwjgl.opengl.GL45C
 */
package net.irisshaders.iris.gl;

import net.irisshaders.iris.gl.IrisRenderSystem$DSAUnsupported;
import net.irisshaders.iris.mixin.GlStateManagerAccessor;
import org.lwjgl.opengl.ARBDirectStateAccess;
import org.lwjgl.opengl.GL45C;

public class IrisRenderSystem$DSAARB
extends IrisRenderSystem$DSAUnsupported {
    @Override
    public void readBuffer(int n, int n2) {
        ARBDirectStateAccess.glNamedFramebufferReadBuffer((int)n, (int)n2);
    }

    @Override
    public int createTexture(int n) {
        return ARBDirectStateAccess.glCreateTextures((int)n);
    }

    @Override
    public int createBuffers() {
        return ARBDirectStateAccess.glCreateBuffers();
    }

    @Override
    public void blitFramebuffer(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        ARBDirectStateAccess.glBlitNamedFramebuffer((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (int)n9, (int)n10, (int)n11, (int)n12);
    }

    @Override
    public int createFramebuffer() {
        return ARBDirectStateAccess.glCreateFramebuffers();
    }

    @Override
    public void drawBuffers(int n, int[] nArray) {
        ARBDirectStateAccess.glNamedFramebufferDrawBuffers((int)n, (int[])nArray);
    }

    @Override
    public void clearBufferuiv(int n, int n2, int n3, int[] nArray) {
        ARBDirectStateAccess.glClearNamedFramebufferuiv((int)n, (int)n2, (int)n3, (int[])nArray);
    }

    @Override
    public void copyTexSubImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        ARBDirectStateAccess.glCopyTextureSubImage2D((int)n, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (int)n9);
    }

    @Override
    public void texParameteri(int n, int n2, int n3, int n4) {
        ARBDirectStateAccess.glTextureParameteri((int)n, (int)n3, (int)n4);
    }

    @Override
    public void texParameteriv(int n, int n2, int n3, int[] nArray) {
        ARBDirectStateAccess.glTextureParameteriv((int)n, (int)n3, (int[])nArray);
    }

    @Override
    public void clearBufferiv(int n, int n2, int n3, int[] nArray) {
        ARBDirectStateAccess.glClearNamedFramebufferiv((int)n, (int)n2, (int)n3, (int[])nArray);
    }

    @Override
    public void generateMipmaps(int n, int n2) {
        ARBDirectStateAccess.glGenerateTextureMipmap((int)n);
    }

    @Override
    public void clearBufferfv(int n, int n2, int n3, float[] fArray) {
        ARBDirectStateAccess.glClearNamedFramebufferfv((int)n, (int)n2, (int)n3, (float[])fArray);
    }

    @Override
    public void texParameterf(int n, int n2, int n3, float f) {
        ARBDirectStateAccess.glTextureParameterf((int)n, (int)n3, (float)f);
    }

    @Override
    public int getTexParameteri(int n, int n2, int n3) {
        return ARBDirectStateAccess.glGetTextureParameteri((int)n, (int)n3);
    }

    @Override
    public void bindTextureToUnit(int n, int n2, int n3) {
        if (n == 3553) {
            if (GlStateManagerAccessor.getTEXTURES()[n2].field_5167 == n3) {
                return;
            }
            ARBDirectStateAccess.glBindTextureUnit((int)n2, (int)n3);
            GlStateManagerAccessor.getTEXTURES()[n2].field_5167 = n3;
        } else {
            ARBDirectStateAccess.glBindTextureUnit((int)n2, (int)n3);
        }
    }

    @Override
    public int bufferStorage(int n, float[] fArray, int n2) {
        int n3 = GL45C.glCreateBuffers();
        GL45C.glNamedBufferData((int)n3, (float[])fArray, (int)n2);
        return n3;
    }

    @Override
    public void framebufferTexture2D(int n, int n2, int n3, int n4, int n5, int n6) {
        ARBDirectStateAccess.glNamedFramebufferTexture((int)n, (int)n3, (int)n5, (int)n6);
    }
}

