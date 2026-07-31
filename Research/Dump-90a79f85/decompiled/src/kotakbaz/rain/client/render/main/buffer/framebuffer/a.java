/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_276
 */
package kotakbaz.rain.client.render.main.buffer.framebuffer;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import kotakbaz.rain.client.render.main.a_0;
import net.minecraft.class_276;

public class a
extends class_276 {
    private static final int a;
    private final int A;
    public static int[] B;

    public a(String string, boolean bl) {
        int n = B[0];
        n += B[1];
        int n2 = B[3];
        n2 += B[4];
        this(string, n += B[2], n2 += B[5], bl);
    }

    public a(String string, int n, int n2, boolean bl) {
        this(string, n, n2, a, bl);
    }

    public a(String string, int n, int n2, int n3, boolean bl) {
        super(string, bl);
        this.method_1234(n, n2);
        this.A = n3;
    }

    public void clearColorTexture() {
        if (this.field_1475 != null) {
            RenderSystem.getDevice().createCommandEncoder().clearColorTexture(this.field_1475, this.A);
        }
    }

    public void clearDepthTexture() {
        if (this.field_56739 != null) {
            RenderSystem.getDevice().createCommandEncoder().clearDepthTexture(this.field_56739, 0.0);
        }
    }

    public void clearAllTextures() {
        this.clearColorTexture();
        this.clearDepthTexture();
    }

    public void bind(boolean bl) {
        int n = B[6];
        n += B[7];
        GlStateManager._glBindFramebuffer((int)(n -= B[8]), (int)a_0.getFrameBufferId(this.field_60567, this.field_60567));
        if (bl) {
            int n2 = B[9];
            n2 -= B[10];
            n2 ^= B[11];
            int n3 = B[12];
            n3 -= B[13];
            int n4 = B[15];
            n4 -= B[16];
            int n5 = B[18];
            n5 += B[19];
            GlStateManager._viewport((int)n2, (int)(n3 += B[14]), (int)this.field_1475.getWidth(n4 += B[17]), (int)this.field_1475.getHeight(n5 -= B[20]));
        }
    }

    static {
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.a();
        a = new Color(0.0f, 0.0f, 0.0f, 0.0f).hashCode();
    }

    public static void a() {
        B = new int[0xEC87 ^ 0xEC92];
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0x331A ^ 0x331E] = 0xFFFFCC81 ^ 0x331E;
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0x8891 ^ 0x8897] = 0x5A3 ^ 0x8897;
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0x365 ^ 0x365] = 0xFFFFFCC2 ^ 0x365;
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0x5F78 ^ 0x5F6A] = 0x5F1A ^ 0x5F6A;
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0x842A ^ 0x8424] = 0x8402 ^ 0x8424;
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0x33D9 ^ 0x33CD] = 0x33C7 ^ 0x33CD;
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0x9E2D ^ 0x9E21] = 0xFFFF61FB ^ 0x9E21;
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0x251 ^ 0x25C] = 0x25C ^ 0x25C;
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0xE15 ^ 0xE1E] = 0xFFFFF19B ^ 0xE1E;
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0x86AC ^ 0x86BD] = 0x86B4 ^ 0x86BD;
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0x141B ^ 0x1411] = 0x1470 ^ 0x1411;
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0xABA5 ^ 0xABA6] = 0xABFB ^ 0xABA6;
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0xE51E ^ 0xE517] = 0xFFFF1AF1 ^ 0xE517;
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0x9EBF ^ 0x9EB0] = 0x9EFD ^ 0x9EB0;
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0xFFC8 ^ 0xFFDB] = 0xFFFF0041 ^ 0xFFDB;
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0xB507 ^ 0xB506] = 0xB53A ^ 0xB506;
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0x3DA7 ^ 0x3DB7] = 0x3DE1 ^ 0x3DB7;
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0xFC08 ^ 0xFC0D] = 0xFC08 ^ 0xFC0D;
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0x102AE ^ 0x102AC] = 0x102B2 ^ 0x102AC;
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0x1117 ^ 0x1110] = 0x112A ^ 0x1110;
        kotakbaz.rain.client.render.main.buffer.framebuffer.a.B[0x7ACB ^ 0x7AC3] = 0x7AED ^ 0x7AC3;
    }
}

