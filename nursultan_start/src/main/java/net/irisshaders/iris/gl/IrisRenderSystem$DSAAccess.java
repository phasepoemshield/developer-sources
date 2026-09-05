/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.gl;

public interface IrisRenderSystem$DSAAccess {
    public void readBuffer(int var1, int var2);

    public int createTexture(int var1);

    public int createBuffers();

    public void blitFramebuffer(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12);

    public int createFramebuffer();

    public void drawBuffers(int var1, int[] var2);

    public void clearBufferuiv(int var1, int var2, int var3, int[] var4);

    public void copyTexSubImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

    public void texParameteri(int var1, int var2, int var3, int var4);

    public void texParameteriv(int var1, int var2, int var3, int[] var4);

    public void clearBufferiv(int var1, int var2, int var3, int[] var4);

    public void generateMipmaps(int var1, int var2);

    public void clearBufferfv(int var1, int var2, int var3, float[] var4);

    public void texParameterf(int var1, int var2, int var3, float var4);

    public int getTexParameteri(int var1, int var2, int var3);

    public void bindTextureToUnit(int var1, int var2, int var3);

    public int bufferStorage(int var1, float[] var2, int var3);

    public void framebufferTexture2D(int var1, int var2, int var3, int var4, int var5, int var6);
}

