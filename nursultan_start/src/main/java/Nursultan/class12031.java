/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11911
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  minecraft.class01079
 *  minecraft.class06202
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.stb.STBImage
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 */
package Nursultan;

import Nursultan.class11911;
import Nursultan.class12037;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import minecraft.class01079;
import minecraft.class06202;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class class12031
implements class12037 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;
    public static Object y_0;

    public class12031(String string) {
        this(string, 9729);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public class12031(String var1_1, int var2_2) {
        block26: {
            super();
            this.i();
            this.N_1 = var1_1;
            var3_3 = null;
            var4_4 = null;
            var5_5 = 0;
            var6_6 = 0;
            try {
                var7_7 = MemoryStack.stackPush();
                try {
                    var8_9 = this.y();
                    try {
                        var9_11 = IOUtils.toByteArray((InputStream)var8_9);
                        var3_3 = MemoryUtil.memAlloc((int)var9_11.length);
                        var3_3.put(var9_11).flip();
                        var10_14 = var7_7.mallocInt(1);
                        var11_16 = var7_7.mallocInt(1);
                        var12_17 = var7_7.mallocInt(1);
                        var4_4 = STBImage.stbi_load_from_memory((ByteBuffer)var3_3, (IntBuffer)var10_14, (IntBuffer)var11_16, (IntBuffer)var12_17, (int)4);
                        if (var4_4 == null) {
                            throw new IllegalStateException("Failed to decode image " + var1_1 + ": " + STBImage.stbi_failure_reason());
                        }
                        var5_5 = GL11.glGenTextures();
                        var6_6 = GL11.glGetInteger((int)32873);
                        GlStateManager._bindTexture((int)var5_5);
                        GlStateManager._texParameter((int)3553, (int)10240, (int)var2_2);
                        GlStateManager._texParameter((int)3553, (int)10241, (int)var2_2);
                        GlStateManager._texParameter((int)3553, (int)10242, (int)33071);
                        GlStateManager._texParameter((int)3553, (int)10243, (int)33071);
                        GlStateManager._pixelStore((int)3314, (int)0);
                        GlStateManager._pixelStore((int)3316, (int)0);
                        GlStateManager._pixelStore((int)3315, (int)0);
                        GlStateManager._pixelStore((int)3317, (int)1);
                        GL11.glTexImage2D((int)3553, (int)0, (int)32856, (int)var10_14.get(0), (int)var11_16.get(0), (int)0, (int)6408, (int)5121, (ByteBuffer)var4_4);
                    }
                    finally {
                        if (var8_9 != null) {
                            var8_9.close();
                        }
                    }
                }
                finally {
                    if (var7_7 != null) {
                        var7_7.close();
                    }
                }
                if (var4_4 == null) break block26;
            }
            catch (IOException | RuntimeException var7_8) {
                block27: {
                    try {
                        ((Logger)class12031.y_0).error("Failed to load texture: {}", (Object)var1_1, (Object)var7_8);
                        if (var5_5 != 0) {
                            GL11.glDeleteTextures((int)var5_5);
                            var5_5 = 0;
                        }
                        if (var4_4 == null) break block27;
                    }
                    catch (Throwable var13_18) {
                        if (var4_4 != null) {
                            STBImage.stbi_image_free(var4_4);
                        }
                        if (var3_3 != null) {
                            MemoryUtil.memFree(var3_3);
                        }
                        if (var5_5 != 0) {
                            GlStateManager._bindTexture((int)var6_6);
                        }
                        throw var13_18;
                    }
                    STBImage.stbi_image_free(var4_4);
                }
                if (var3_3 != null) {
                    MemoryUtil.memFree((Buffer)var3_3);
                }
                if (var5_5 != 0) {
                    GlStateManager._bindTexture((int)var6_6);
                } else {
                    ** GOTO lbl75
                }
            }
            STBImage.stbi_image_free((ByteBuffer)var4_4);
        }
        if (var3_3 != null) {
            MemoryUtil.memFree((Buffer)var3_3);
        }
        if (var5_5 != 0) {
            GlStateManager._bindTexture((int)var6_6);
        }
        this.N_0 = var5_5;
    }

    static {
        class12031.Z();
        y_0 = LogManager.getLogger(String.class);
    }

    private static void Z() {
        y_0 = null;
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
        }
    }

    public InputStream y() throws IOException {
        return ((class01079)class06202.Nq().Nm().method_14486(class11911.N((String)((String)this.N_1))).orElseThrow()).method_14482();
    }

    @Override
    public int N() {
        return (Integer)this.N_0;
    }
}

