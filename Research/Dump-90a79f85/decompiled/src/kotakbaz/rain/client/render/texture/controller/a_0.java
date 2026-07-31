/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package kotakbaz.rain.client.render.texture.controller;

import java.nio.ByteBuffer;
import kotakbaz.rain.client.render.texture.controller.A;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from kotakbaz.rain.client.render.texture.controller.a
 */
public class a_0
implements A {
    public static final int a = 6407;
    public static final int A = 6408;
    public static int[] B;

    public a_0() {
        super();
    }

    @Override
    public void run(Runnable runnable) {
        runnable.run();
    }

    @Override
    public int genTexId() {
        return GL11.glGenTextures();
    }

    @Override
    public void deleteTexture(int n) {
        GL11.glDeleteTextures((int)n);
    }

    @Override
    public void bindTexture(int n) {
        int n2 = B[0];
        n2 += B[1];
        GL11.glBindTexture((int)(n2 ^= B[2]), (int)n);
    }

    @Override
    public void texParameter(int n, int n2, int n3) {
        GL11.glTexParameteri((int)n, (int)n2, (int)n3);
    }

    @Override
    public void texParameter(int n, int n2, float f2) {
        GL11.glTexParameterf((int)n, (int)n2, (float)f2);
    }

    @Override
    public void texImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, ByteBuffer byteBuffer) {
        GL11.glTexImage2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (ByteBuffer)byteBuffer);
    }

    @Override
    public void texSubImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, long l) {
        GL11.glTexSubImage2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (long)l);
    }

    @Override
    public void pixelStore(int n, int n2) {
        GL11.glPixelStorei((int)n, (int)n2);
    }

    static {
        a_0.a();
    }

    public static void a() {
        B = new int[0x9273 ^ 0x9270];
        a_0.B[0x102A2 ^ 0x102A0] = 0xFFFEFD75 ^ 0x102A0;
        a_0.B[0x9688 ^ 0x9689] = 0xFFFF6954 ^ 0x9689;
        a_0.B[0x246F ^ 0x246F] = 0xFFFFD638 ^ 0x246F;
    }
}

