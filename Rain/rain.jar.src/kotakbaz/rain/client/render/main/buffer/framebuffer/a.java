/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.buffer.framebuffer;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.client.gl.Framebuffer;

public class a
extends Framebuffer {
    private static final int a;
    private final int A;
    public static int[] B;

    public a(String name, boolean useDepth) {
        int n2 = B[0];
        n2 += B[1];
        int n3 = B[3];
        n3 += B[4];
        this(name, n2 += B[2], n3 += B[5], useDepth);
    }

    public a(String name, int width2, int height, boolean useDepth) {
        this(name, width2, height, a, useDepth);
    }

    public a(String name, int width2, int height, int clearColor, boolean useDepth) {
        super(name, useDepth);
        this.resize(width2, height);
        this.A = clearColor;
    }

    public void clearColorTexture() {
        if (this.colorAttachment != null) {
            RenderSystem.getDevice().createCommandEncoder().clearColorTexture(this.colorAttachment, this.A);
        }
    }

    public void clearDepthTexture() {
        if (this.depthAttachment != null) {
            RenderSystem.getDevice().createCommandEncoder().clearDepthTexture(this.depthAttachment, 0.0);
        }
    }

    public void clearAllTextures() {
        this.clearColorTexture();
        this.clearDepthTexture();
    }

    public void bind(boolean setViewport) {
        int n2 = B[6];
        n2 += B[7];
        GlStateManager._glBindFramebuffer((int)(n2 -= B[8]), (int)kotakbaz.rain.client.render.main.a.getFrameBufferId(this.colorAttachmentView, this.colorAttachmentView));
        if (setViewport) {
            int n3 = B[9];
            n3 -= B[10];
            n3 ^= B[11];
            int n4 = B[12];
            n4 -= B[13];
            int n5 = B[15];
            n5 -= B[16];
            int n6 = B[18];
            n6 += B[19];
            GlStateManager._viewport((int)n3, (int)(n4 += B[14]), (int)this.colorAttachment.getWidth(n5 += B[17]), (int)this.colorAttachment.getHeight(n6 -= B[20]));
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

