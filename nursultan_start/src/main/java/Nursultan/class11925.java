/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09060
 *  Nursultan.class09064
 *  Nursultan.class09065
 *  Nursultan.class09079
 *  Nursultan.class09086
 *  Nursultan.class09093
 *  Nursultan.class10203
 *  Nursultan.class11176
 *  Nursultan.class11213
 *  Nursultan.class11216
 *  Nursultan.class11893
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTexture
 *  minecraft.class00056
 *  minecraft.class00312
 *  minecraft.class00734
 *  minecraft.class01054
 *  minecraft.class01383
 *  minecraft.class03386
 *  minecraft.class03394
 *  minecraft.class03396
 *  minecraft.class03448
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class08066
 *  minecraft.class08844
 *  minecraft.class08879
 *  minecraft.class08893
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector2f
 *  org.joml.Vector4f
 *  org.lwjgl.opengl.GL12
 *  org.lwjgl.opengl.GL33C
 */
package Nursultan;

import Nursultan.class09060;
import Nursultan.class09064;
import Nursultan.class09065;
import Nursultan.class09079;
import Nursultan.class09086;
import Nursultan.class09093;
import Nursultan.class10203;
import Nursultan.class11176;
import Nursultan.class11213;
import Nursultan.class11216;
import Nursultan.class11893;
import Nursultan.class11938;
import Nursultan.class12035;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import java.nio.FloatBuffer;
import minecraft.class00056;
import minecraft.class00312;
import minecraft.class00734;
import minecraft.class01054;
import minecraft.class01383;
import minecraft.class03386;
import minecraft.class03394;
import minecraft.class03396;
import minecraft.class03448;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class08066;
import minecraft.class08844;
import minecraft.class08879;
import minecraft.class08893;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector2f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL33C;

public class class11925 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object N_6;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public static Object L_4;
    public static Object L_5;
    public static Object L_6;

    public static double L(class07049 class070492) {
        if (!class070492.method_5805()) {
            return class070492.method_23321();
        }
        return class04995.u((double)class11925.N(class070492), (double)class070492.field_5969, (double)class070492.method_23321());
    }

    public static void L(class08066 class080662) {
        class080662.N((class08066)L_5);
    }

    public static Matrix4f L() {
        return (Matrix4f)L_3;
    }

    private class11925() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class11925.Z();
        y_0 = Float.valueOf(1.5f);
        y_1 = Float.valueOf(1.0f);
        y_2 = Float.valueOf(2.2f);
        y_3 = new Matrix4f();
        y_4 = new Matrix4f();
        L_0 = new class03394().N(class03396.field_60101);
        L_1 = new class00056("nursultan-unscale", -1000.0f, 11000.0f, true);
        L_2 = class06202.Nq();
        L_3 = new Matrix4f();
        L_5 = new class10203(null, 1, 1, true);
        L_6 = new class11216();
    }

    private static void Z() {
        N_0 = 4;
        N_1 = 4;
        N_2 = 16;
        N_3 = 20;
        N_4 = 5;
        N_5 = 35;
        N_6 = -1442182646;
        y_0 = Float.valueOf(1.5f);
        y_1 = Float.valueOf(1.0f);
        y_2 = Float.valueOf(2.2f);
        y_3 = null;
        y_4 = null;
        L_0 = null;
        L_1 = null;
        L_2 = null;
        L_3 = null;
        L_4 = null;
        L_5 = null;
        L_6 = null;
    }

    public static void i() {
        class08844 class088442 = class06202.Nq().Nt();
        float f = class088442.U() / class088442.j();
        float f2 = class088442.E() / class088442.j();
        RenderSystem.setProjectionMatrix((GpuBufferSlice)((class00056)L_1).y(f, f2), (class00312)class00312.field_54954);
        ((Matrix4f)L_3).set((Matrix4fc)((class12035)((class00056)L_1)).N(f, f2));
    }

    public static double i(class07049 class070492) {
        if (!class070492.method_5805()) {
            return class070492.method_23317();
        }
        return class04995.u((double)class11925.N(class070492), (double)class070492.field_6014, (double)class070492.method_23317());
    }

    public static double u(class07049 class070492) {
        if (!class070492.method_5805()) {
            return class070492.method_23318();
        }
        return class04995.u((double)class11925.N(class070492), (double)class070492.field_6036, (double)class070492.method_23318());
    }

    public static int u() {
        return GL12.glGetInteger((int)3379);
    }

    public static void u(class08066 class080662) {
        class11925.N((class08066)L_5, class080662.N, class080662.y);
        ((class08066)L_5).N(class080662);
    }

    public static class11893 y(float f, float f2, float f3) {
        boolean bl;
        Vector4f vector4f = new Vector4f(f, f2, f3, 1.0f);
        vector4f.mul((Matrix4fc)((Matrix4f)y_4));
        float f4 = vector4f.x / vector4f.w;
        float f5 = vector4f.y / vector4f.w;
        class08844 class088442 = ((class06202)L_2).Nt();
        float f6 = class088442.U();
        float f7 = class088442.E();
        float f8 = (f4 * 0.5f + 0.5f) * f6;
        float f9 = (1.0f - (f5 * 0.5f + 0.5f)) * f7;
        boolean bl2 = bl = vector4f.w > 0.01f;
        if (!bl) {
            f8 = f6 - f8;
            f9 = f7 - f9;
        }
        return new class11893(new Vector2f(f8, f9), bl);
    }

    public static Matrix4f y(float f, float f2) {
        RenderSystem.setProjectionMatrix((GpuBufferSlice)((class00056)L_1).y(f, f2), (class00312)class00312.field_54954);
        ((Matrix4f)L_3).set((Matrix4fc)((class12035)((class00056)L_1)).N(f, f2));
        return (Matrix4f)L_3;
    }

    public static int y(class08066 class080662) {
        GpuTexture gpuTexture = class080662.i();
        return gpuTexture == null ? 0 : ((class08893)gpuTexture).N();
    }

    public static boolean y(class07049 class070492) {
        return class11925.N(class070492.method_5829());
    }

    public static class06889 y() {
        return ((class03386)((class06202)class11925.L_2).i_5).s().y();
    }

    public static void N(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        class11925.N(n, n2, n3, n4, n5, n6, n7, n8, n9, n10, 16384, 9728);
    }

    public static void N(class01383 class013832) {
        L_4 = class013832;
    }

    public static Vector2f N(Vector2f vector2f, float f, float f2, float f3) {
        float f4 = f / 2.0f;
        float f5 = f2 / 2.0f;
        float f6 = f4 - f3;
        float f7 = f5 - f3;
        float f8 = vector2f.x - f4;
        float f9 = vector2f.y - f5;
        if (f8 == 0.0f && f9 == 0.0f) {
            return new Vector2f(f4, f5 - f7);
        }
        float f10 = f8 * f8 / (f6 * f6) + f9 * f9 / (f7 * f7);
        float f11 = (float)(1.0 / Math.sqrt(f10));
        return new Vector2f(f4 + f8 * f11, f5 + f9 * f11);
    }

    public static void N(FloatBuffer floatBuffer, int n) {
        int n2;
        floatBuffer.clear();
        float f = Math.max((float)n / 3.0f, 1.0f);
        double d = 0.0;
        for (n2 = 0; n2 <= n; ++n2) {
            double d2 = class11925.N(n2, f);
            floatBuffer.put((float)d2);
            d += n2 == 0 ? d2 : d2 * 2.0;
        }
        for (n2 = 0; n2 <= n; ++n2) {
            floatBuffer.put(n2, (float)((double)floatBuffer.get(n2) / d));
        }
        floatBuffer.rewind();
    }

    public static double N(float f, float f2) {
        double d = f2 * f2;
        return Math.exp((double)(-(f * f)) / (2.0 * d));
    }

    public static void N(class08066 class080662, int n, int n2) {
        if (n <= 0 || n2 <= 0) {
            return;
        }
        if (n == class080662.N && n2 == class080662.y) {
            return;
        }
        class080662.N(n, n2);
        class11925.N(class080662.L());
        class11925.N(class080662.i());
    }

    public static Vector4f N(class07049 class070492, boolean bl) {
        class06889 class068892 = class11925.y();
        double d = (bl ? class11925.i(class070492) : class070492.method_23317()) - class068892.M;
        double d2 = (bl ? class11925.u(class070492) : class070492.method_23318()) - class068892.B;
        double d3 = (bl ? class11925.L(class070492) : class070492.method_23321()) - class068892.Z;
        float f = class070492.method_17681() / 2.0f;
        float f2 = class070492.method_17682();
        float f3 = (float)(d - (double)f);
        float f4 = (float)d2;
        float f5 = (float)(d3 - (double)f);
        float f6 = (float)(d + (double)f);
        float f7 = (float)(d2 + (double)f2 + 0.1);
        float f8 = (float)(d3 + (double)f);
        float[] fArray = new float[]{f3, f4, f5, f3, f7, f5, f6, f4, f5, f6, f7, f5, f3, f4, f8, f3, f7, f8, f6, f4, f8, f6, f7, f8};
        Vector4f vector4f = new Vector4f(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
        for (int i = 0; i < 8; ++i) {
            Vector2f vector2f = class11925.N(fArray[i * 3], fArray[i * 3 + 1], fArray[i * 3 + 2]);
            if (vector2f == null) continue;
            vector2f = vector2f.round();
            vector4f.set(Math.min(vector2f.x, vector4f.x()), Math.min(vector2f.y, vector4f.y()), Math.max(vector2f.x, vector4f.z()), Math.max(vector2f.y, vector4f.w()));
        }
        if (vector4f.x() == Float.MAX_VALUE && vector4f.y() == Float.MAX_VALUE && vector4f.z() == Float.MIN_VALUE && vector4f.w() == Float.MIN_VALUE) {
            return null;
        }
        return vector4f;
    }

    public static void N(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        GlStateManager._glBindFramebuffer((int)36008, (int)n);
        GlStateManager._glBindFramebuffer((int)36009, (int)n2);
        GlStateManager._glBlitFrameBuffer((int)0, (int)0, (int)n3, (int)n4, (int)0, (int)0, (int)n5, (int)n6, (int)n7, (int)n8);
    }

    public static Vector2f N(float f, float f2, float f3) {
        Vector4f vector4f = new Vector4f(f, f2, f3, 1.0f);
        vector4f.mul((Matrix4fc)((Matrix4f)y_4));
        if (vector4f.w <= 0.01f) {
            return null;
        }
        float f4 = vector4f.x / vector4f.w;
        float f5 = vector4f.y / vector4f.w;
        class08844 class088442 = ((class06202)L_2).Nt();
        float f6 = (f4 * 0.5f + 0.5f) * (float)class088442.U();
        float f7 = (1.0f - (f5 * 0.5f + 0.5f)) * (float)class088442.E();
        return new Vector2f(f6, f7);
    }

    public static int N(class08066 class080662) {
        return ((class08893)class080662.L()).N();
    }

    public static void N(class09093 class090932, class11213 class112132, String string, int n, float f, float f2, class06584 class065842, int n2) {
        class11925.N(class090932, class112132, string, n, f, f2, class065842, n2, -1.0f);
    }

    public static void N(class09093 class090932, class11213 class112132, String string, int n, float f, float f2, class06584 class065842, int n2, float f3) {
        String string2 = String.valueOf(Math.max((float)Math.round((float)n2 * 50.0f / 100.0f) / 10.0f, 0.0f));
        float f4 = class090932.N((float)n, class09079.REGULAR, false);
        boolean bl = !string.isEmpty();
        float f5 = bl ? class090932.y(string, (float)n, class09079.REGULAR, false) : 0.0f;
        float f6 = bl ? class090932.y(" ", (float)n, class09079.REGULAR, false) : 0.0f;
        float f7 = class090932.y(string2, (float)n, class09079.REGULAR, false);
        float f8 = Math.max(35.0f, (float)Math.ceil(f7 / 5.0f) * 5.0f);
        float f9 = f5 + f6 + f8;
        float f10 = f9 + 20.0f + 8.0f;
        float f11 = 24.0f;
        float f12 = class04995.y((float)(f - f10 / 2.0f));
        float f13 = class04995.y((float)(f2 - f11 / 2.0f));
        float f14 = f12 + 4.0f + 20.0f;
        float f15 = f13 + (f11 - f4) / 2.0f;
        class11176.N((class11213)class112132, (float)(f12 - 2.0f), (float)f13, (float)(f10 + 4.0f + 4.0f), (float)(f11 + (float)(f3 >= 0.0f ? 2 : 0)), (int)-1442182646);
        class11938.k().N(class065842, f12 + 4.0f, f13 + 4.0f, 16.0f);
        if (bl) {
            class090932.y(string).N(f14, f15).N((float)n).N(class09079.REGULAR).i(-1).L();
        }
        class090932.y(string2).N(f14 + f9 - f7, f15).N((float)n).N(class09079.REGULAR).i(-1).L();
        if (f3 >= 0.0f) {
            float f16 = Math.min(f3, 1.0f);
            float f17 = f10 + 4.0f + 4.0f;
            int n3 = class04995.M((float)(f16 / 3.0f), (float)1.0f, (float)1.0f) | 0xFF000000;
            class11176.N((class11213)class112132, (float)(f12 - 2.0f), (float)(f13 + f11), (float)(f17 * f16), (float)2.0f, (int)n3);
        }
    }

    public static void N(class08066 class080662, class08066 class080663) {
        RenderSystem.getDevice().createCommandEncoder().copyTextureToTexture(class080662.L(), class080663.L(), 0, 0, 0, 0, 0, class080663.N, class080663.y);
    }

    public static Matrix4f N() {
        class08844 class088442 = class06202.Nq().Nt();
        float f = class088442.U();
        float f2 = class088442.E();
        return class11925.y(f, f2);
    }

    public static float N(class07049 class070492) {
        return ((class06202)L_2).NK().N((class03448)((class06202)class11925.L_2).T_3 == null || !((class03448)((class06202)class11925.L_2).T_3).method_54719().N(class070492));
    }

    public static void N(class08066 class080662, class09064 class090642, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        if (n3 <= 0 || n4 <= 0 || n7 <= 0 || n8 <= 0) {
            return;
        }
        int n11 = ((class08893)class080662.L()).N(((class08879)RenderSystem.getDevice()).y(), class080662.i());
        class09060 class090602 = class09060.N();
        class09086 class090862 = class090602.N(n11, class080662.N, class080662.y);
        class09086 class090863 = ((class09065)class09065.y_0).L(class090642);
        class090602.N(class090862, class090863, n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
    }

    public static void N(class01054 class010542, class06584 class065842, float f, float f2) {
        class010542.N(class065842, class04995.y((float)f), class04995.y((float)f2));
    }

    public static void N(class08066 class080662, boolean bl) {
        ((class09065)class09065.y_0).N(class080662, bl);
    }

    public static void N(GpuTexture gpuTexture) {
        if (!(gpuTexture instanceof class08893)) {
            return;
        }
        class08893 class088932 = (class08893)gpuTexture;
        GlStateManager._activeTexture((int)33984);
        GlStateManager._bindTexture((int)class088932.N());
        GL33C.glBindSampler((int)0, (int)0);
        GL12.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL12.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL12.glTexParameteri((int)3553, (int)10242, (int)33071);
        GL12.glTexParameteri((int)3553, (int)10243, (int)33071);
        GL12.glTexParameteri((int)3553, (int)33084, (int)0);
        GL12.glTexParameteri((int)3553, (int)33085, (int)0);
    }

    public static boolean N(class00734 class007342) {
        return (class01383)L_4 != null && ((class01383)L_4).method_23093(class007342);
    }

    public static void N(class08066 class080662, class09064 class090642, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        class11925.N(class080662, class090642, n, n2, n3, n4, n5, n6, n7, n8, 16384, 9728);
    }

    public static void N(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        if (n5 <= 0 || n6 <= 0 || n9 <= 0 || n10 <= 0) {
            return;
        }
        int n13 = GlStateManager.getFrameBuffer((int)36008);
        int n14 = GlStateManager.getFrameBuffer((int)36009);
        GlStateManager._glBindFramebuffer((int)36008, (int)n);
        GlStateManager._glBindFramebuffer((int)36009, (int)n2);
        GlStateManager._glBlitFrameBuffer((int)n3, (int)n4, (int)(n3 + n5), (int)(n4 + n6), (int)n7, (int)n8, (int)(n7 + n9), (int)(n8 + n10), (int)n11, (int)n12);
        GlStateManager._glBindFramebuffer((int)36009, (int)n14);
        GlStateManager._glBindFramebuffer((int)36008, (int)n13);
    }

    public static void N(int n, int n2, int n3, int n4, int n5, int n6) {
        class11925.N(n, n2, n3, n4, n5, n6, 16384, 9728);
    }
}

