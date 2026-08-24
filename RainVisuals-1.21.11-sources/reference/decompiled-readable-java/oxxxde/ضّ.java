/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.nio.ByteBuffer;

public interface \u0636\u0651 {
    public void pixelStore(int var1, int var2);

    public void texParameter(int var1, int var2, int var3);

    public void bindTexture(int var1);

    public void texSubImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9);

    public void deleteTexture(int var1);

    public void texParameter(int var1, int var2, float var3);

    public void run(Runnable var1);

    public int genTexId();

    public void texImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ByteBuffer var9);
}

