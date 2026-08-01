/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.texture.controller;

import java.nio.ByteBuffer;
import kotakbaz.rain.client.render.texture.controller.a_0;
import org.lwjgl.opengl.GL11;

public class a
implements a_0 {
    public static final int a = 6407;
    public static final int A = 6408;
    public static int[] B;

    @Override
    public void run(Runnable runnable) {
        runnable.run();
    }

    @Override
    public int genTexId() {
        return GL11.glGenTextures();
    }

    @Override
    public void deleteTexture(int id) {
        GL11.glDeleteTextures((int)id);
    }

    @Override
    public void bindTexture(int id) {
        int n2 = B[0];
        n2 += B[1];
        GL11.glBindTexture((int)(n2 ^= B[2]), (int)id);
    }

    @Override
    public void texParameter(int target, int pname, int param) {
        GL11.glTexParameteri((int)target, (int)pname, (int)param);
    }

    @Override
    public void texParameter(int target, int pname, float param) {
        GL11.glTexParameterf((int)target, (int)pname, (float)param);
    }

    @Override
    public void texImage2D(int target, int level, int internalformat, int width2, int height, int border, int format, int type, ByteBuffer pixels) {
        GL11.glTexImage2D((int)target, (int)level, (int)internalformat, (int)width2, (int)height, (int)border, (int)format, (int)type, (ByteBuffer)pixels);
    }

    @Override
    public void texSubImage2D(int target, int level, int xoffset, int yoffset, int width2, int height, int format, int type, long pixels) {
        GL11.glTexSubImage2D((int)target, (int)level, (int)xoffset, (int)yoffset, (int)width2, (int)height, (int)format, (int)type, (long)pixels);
    }

    @Override
    public void pixelStore(int pname, int param) {
        GL11.glPixelStorei((int)pname, (int)param);
    }

    static {
        kotakbaz.rain.client.render.texture.controller.a.a();
    }

    public static void a() {
        B = new int[0x9273 ^ 0x9270];
        kotakbaz.rain.client.render.texture.controller.a.B[0x102A2 ^ 0x102A0] = 0xFFFEFD75 ^ 0x102A0;
        kotakbaz.rain.client.render.texture.controller.a.B[0x9688 ^ 0x9689] = 0xFFFF6954 ^ 0x9689;
        kotakbaz.rain.client.render.texture.controller.a.B[0x246F ^ 0x246F] = 0xFFFFD638 ^ 0x246F;
    }
}

