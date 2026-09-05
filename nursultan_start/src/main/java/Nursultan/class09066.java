/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11192
 *  Nursultan.class11206
 *  Nursultan.class11213
 *  Nursultan.class11218
 *  Nursultan.class11925
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class08066
 *  minecraft.class08844
 *  org.joml.Matrix4fc
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.system.MemoryUtil
 */
package Nursultan;

import Nursultan.class09056;
import Nursultan.class09057;
import Nursultan.class09063;
import Nursultan.class09064;
import Nursultan.class09072;
import Nursultan.class09087;
import Nursultan.class09089;
import Nursultan.class09097;
import Nursultan.class09101;
import Nursultan.class11192;
import Nursultan.class11206;
import Nursultan.class11213;
import Nursultan.class11218;
import Nursultan.class11925;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class08066;
import minecraft.class08844;
import org.joml.Matrix4fc;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryUtil;

public class class09066 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public Object y_6;
    public Object y_7;
    public boolean y_init;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public boolean L_init;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public boolean u_init;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public Object i_3;
    public Object R_0;
    public Object R_1;
    public Object R_2;
    public Object R_3;
    public Object R_4;
    public Object R_5;
    public boolean R_init;
    public Object M_0;
    public Object M_1;
    public Object M_2;
    public Object M_3;
    public Object M_4;
    public Object M_5;
    public boolean M_init;
    public static Object B_0;
    public static Object B_1;

    private void L(class09101 class091012) {
        GL11.glViewport((int)0, (int)0, (int)((Integer)this.R_3), (int)((Integer)this.R_4));
    }

    public float L() {
        return ((float)((Integer)this.R_3).intValue() - 0.5f) / (float)((Integer)this.R_5).intValue();
    }

    private int M() {
        return (class09057)this.y_5 != null ? ((class09057)this.y_5).i() : class11925.N((class08066)((class06202)this.i_0).e());
    }

    private int T() {
        return (class09057)this.y_6 != null ? ((class09057)this.y_6).i() : this.M();
    }

    public class09066() {
        this.E();
        this.i_0 = class06202.Nq();
        this.i_1 = class11213.N((class09087)((class09087)((Object)class09063.N_2)), (int)4096, (int)1024);
        this.i_2 = new class09101();
        this.i_3 = class09072.N((class11213)this.i_1, (float[])class09072.N_0);
        this.R_0 = class09072.N((class11213)this.i_1, (float[])class09072.N_1);
        this.R_1 = 1;
        this.R_2 = 1;
        this.R_3 = 1;
        this.R_4 = 1;
        this.R_5 = 32;
        this.y_0 = 32;
        this.y_1 = 1;
        this.y_2 = 1;
        this.y_3 = 1;
        this.y_4 = 1;
        this.y_7 = 1;
        this.M_0 = 1;
        this.M_3 = 1;
        this.M_4 = 1;
        this.N_0 = Float.valueOf(1.0f);
        this.N_2 = Float.valueOf(1.0f);
        this.N_4 = Float.valueOf(1.0f);
        this.L_0 = Float.valueOf(1.0f);
        this.L_1 = class09097.L(() -> (Integer)this.R_1, () -> (Integer)this.R_2);
        this.L_2 = class09097.L(() -> (Integer)this.R_1, () -> (Integer)this.R_2);
        this.L_3 = class09097.L(() -> (Integer)this.R_5, () -> (Integer)this.y_0);
        this.L_4 = new class09056((class11213)this.i_1, 6.0f);
        this.L_5 = new class09089((class11213)this.i_1, 6.0f);
        this.L_6 = new class09056((class11213)this.i_1, 0.0f);
        this.u_0 = this.N((class09056)this.L_4, false);
        this.u_1 = this.N((class09089)this.L_5, true);
        this.u_5 = new int[4];
    }

    static {
        class09066.b();
    }

    private void i(class09101 class091012) {
        GL11.glViewport((int)0, (int)0, (int)((Integer)this.R_1), (int)((Integer)this.R_2));
    }

    private static void b() {
        B_0 = 6;
        B_1 = 32;
    }

    private int z(int n) {
        return Math.floorDiv(n, 6) * 6;
    }

    public float u() {
        return 0.0f;
    }

    private void u(int n) {
        if (n == (Integer)this.u_3 && (FloatBuffer)this.u_2 != null) {
            return;
        }
        this.u_3 = n;
        if ((FloatBuffer)this.u_2 == null) {
            this.u_2 = MemoryUtil.memAllocFloat((int)n);
        } else if (n > ((FloatBuffer)this.u_2).capacity()) {
            this.u_2 = MemoryUtil.memRealloc((FloatBuffer)((FloatBuffer)this.u_2), (int)n);
        }
        class11925.N((FloatBuffer)((FloatBuffer)this.u_2), (int)(n - 1));
    }

    private void u(class09101 class091012) {
        class091012.z().setOrtho(0.0f, (float)((Integer)this.y_7).intValue(), (float)((Integer)this.M_0).intValue(), 0.0f, -1.0f, 1.0f);
        class091012.y((Integer)this.M_1).N((Integer)this.M_2).i((Integer)this.M_3).u((Integer)this.M_4).u((float)((Integer)this.R_1).intValue()).R(((Integer)this.R_2).intValue()).y(((Float)this.M_5).floatValue()).N(((Float)this.N_2).floatValue()).L(((Float)this.N_0).floatValue()).i(((Float)this.N_1).floatValue());
    }

    public float y() {
        return ((float)((Integer)this.R_4).intValue() - 0.5f) / (float)((Integer)this.y_0).intValue();
    }

    private void y(class09101 class091012) {
        class091012.z().setOrtho(0.0f, (float)((Integer)this.y_1).intValue(), (float)((Integer)this.y_2).intValue(), 0.0f, -1.0f, 1.0f);
        class091012.y(0).N(0).i((Integer)this.y_1).u((Integer)this.y_2).u((float)((Integer)this.R_1).intValue()).R(((Integer)this.R_2).intValue()).y(0.0f).N(1.0f).L(1.0f).i(0.0f);
    }

    private int y(int n, int n2) {
        return Math.min(this.R(n), n2);
    }

    private void E() {
        if (!this.R_init) {
            this.R_init = true;
            this.R_1 = 0;
            this.R_2 = 0;
            this.R_3 = 0;
            this.R_4 = 0;
            this.R_5 = 0;
        }
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = 0;
            this.y_1 = 0;
            this.y_2 = 0;
            this.y_3 = 0;
            this.y_4 = 0;
            this.y_7 = 0;
        }
        if (!this.M_init) {
            this.M_init = true;
            this.M_0 = 0;
            this.M_1 = 0;
            this.M_2 = 0;
            this.M_3 = 0;
            this.M_4 = 0;
            this.M_5 = Float.valueOf(0.0f);
        }
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = Float.valueOf(0.0f);
            this.N_1 = Float.valueOf(0.0f);
            this.N_2 = Float.valueOf(0.0f);
            this.N_3 = Float.valueOf(0.0f);
            this.N_4 = Float.valueOf(0.0f);
            this.N_5 = Float.valueOf(0.0f);
        }
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = Float.valueOf(0.0f);
        }
        if (!this.u_init) {
            this.u_init = true;
            this.u_3 = 0;
            this.u_4 = 0;
        }
    }

    public class09057 N(class09057 class090572, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        return this.N(class090572, null, n, n2, n3, n4, n5, n6, n7);
    }

    private class09057 N(class09057 class090572, class09057 class090573, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n5 <= 0 || n6 <= 0) {
            return null;
        }
        this.y_5 = class090572;
        this.y_6 = class090573;
        this.y_3 = Math.max(1, n);
        this.y_4 = Math.max(1, n2);
        int n8 = Math.min(30, n7);
        this.u(n8);
        int n9 = class04995.N((int)n3, (int)0, (int)((Integer)this.y_3));
        int n10 = class04995.N((int)n4, (int)0, (int)((Integer)this.y_4));
        int n11 = class04995.N((int)(n3 + n5), (int)0, (int)((Integer)this.y_3));
        int n12 = class04995.N((int)(n4 + n6), (int)0, (int)((Integer)this.y_4));
        int n13 = n11 - n9;
        int n14 = n12 - n10;
        if (n13 <= 0 || n14 <= 0) {
            return null;
        }
        int n15 = this.y(n13, (Integer)this.y_3);
        int n16 = this.y(n14, (Integer)this.y_4);
        if (n15 <= 0 || n16 <= 0) {
            return null;
        }
        int n17 = this.N(n9, n15, (Integer)this.y_3);
        int n18 = this.N(n10, n16, (Integer)this.y_4);
        int n19 = n17 + n15;
        int n20 = n18 + n16;
        int n21 = this.N(n15);
        int n22 = this.N(n16);
        int n23 = this.N(n5);
        int n24 = this.N(n6);
        float f = (float)class04995.N((int)(n9 - n17), (int)0, (int)n15) / (float)n15;
        float f2 = 1.0f - (float)class04995.N((int)(n19 - n11), (int)0, (int)n15) / (float)n15;
        float f3 = (float)class04995.N((int)(n20 - n12), (int)0, (int)n16) / (float)n16;
        float f4 = 1.0f - (float)class04995.N((int)(n10 - n18), (int)0, (int)n16) / (float)n16;
        this.R_1 = n21;
        this.R_2 = n22;
        this.R_3 = n23;
        this.R_4 = n24;
        this.R_5 = this.N((Integer)this.R_5, (Integer)this.R_3);
        this.y_0 = this.N((Integer)this.y_0, (Integer)this.R_4);
        this.y_1 = n15;
        this.y_2 = n16;
        this.y_7 = n5;
        this.M_0 = n6;
        this.M_1 = n9 - n3;
        this.M_2 = n10 - n4;
        this.M_3 = n13;
        this.M_4 = n14;
        this.M_5 = Float.valueOf(f);
        this.N_0 = Float.valueOf(f2);
        this.N_1 = Float.valueOf(f3);
        this.N_2 = Float.valueOf(f4);
        this.N_3 = Float.valueOf((float)n17 / (float)((Integer)this.y_3).intValue());
        this.N_4 = Float.valueOf((float)n19 / (float)((Integer)this.y_3).intValue());
        this.N_5 = Float.valueOf(1.0f - (float)n18 / (float)((Integer)this.y_4).intValue());
        this.L_0 = Float.valueOf(1.0f - (float)n20 / (float)((Integer)this.y_4).intValue());
        ((class09101)this.i_2).L(n8).N((FloatBuffer)this.u_2);
        ((class09101)this.i_2).y().set((Matrix4fc)RenderSystem.getModelViewMatrix());
        this.u_4 = GL11.glGetInteger((int)36006);
        GL11.glGetIntegerv((int)2978, (int[])((int[])this.u_5));
        ((class09057)this.y_6 != null ? (class11218)this.u_1 : (class11218)this.u_0).execute((Object)((class09101)this.i_2));
        GlStateManager._glBindFramebuffer((int)36160, (int)((Integer)this.u_4));
        GL11.glViewport((int)((int[])this.u_5)[0], (int)((int[])this.u_5)[1], (int)((int[])this.u_5)[2], (int)((int[])this.u_5)[3]);
        return ((class09064)this.L_3).U();
    }

    private void N(class09101 class091012) {
        class091012.z().setOrtho(0.0f, (float)((Integer)this.y_1).intValue(), (float)((Integer)this.y_2).intValue(), 0.0f, -1.0f, 1.0f);
        class091012.y(0).N(0).i((Integer)this.y_1).u((Integer)this.y_2).u((float)((Integer)this.y_3).intValue()).R(((Integer)this.y_4).intValue()).y(((Float)this.N_3).floatValue()).N(((Float)this.N_5).floatValue()).L(((Float)this.N_4).floatValue()).i(((Float)this.L_0).floatValue());
    }

    public class09057 N(int n, int n2, int n3, int n4, int n5) {
        class08844 class088442 = ((class06202)this.i_0).Nt();
        return this.N(null, null, class088442.U(), class088442.E(), n, n2, n3, n4, n5);
    }

    public class09057 N(class09057 class090572, int n, int n2, int n3, int n4, int n5) {
        class08844 class088442 = ((class06202)this.i_0).Nt();
        return this.N(null, class090572, class088442.U(), class088442.E(), n, n2, n3, n4, n5);
    }

    private int N(int n) {
        return Math.max(1, (n + 6 - 1) / 6);
    }

    private int N(int n, int n2, int n3) {
        if (n2 >= n3) {
            return 0;
        }
        return class04995.N((int)this.z(n), (int)0, (int)(n3 - n2));
    }

    public float N() {
        return 0.0f;
    }

    private class11218<class09101> N(class11192<class09101> class111922, boolean bl) {
        class11206 class112062 = class11218.N().N(class111922).y(this::N).y((class09064)this.L_1, false).N_3(this::i).N(33984, this::M);
        if (bl) {
            class112062.N(33985, this::T);
        }
        return class112062.N((class11192)((class09072)this.i_3)).y(this::y).y((class09064)this.L_2, false).N_3(this::i).L((class09064)this.L_1).N((class11192)((class09072)this.R_0)).y(this::y).y((class09064)this.L_1, false).N_3(this::i).L((class09064)this.L_2).N((class11192)((class09056)this.L_6)).y(this::u).N((class09064)this.L_3, false).N_3(this::L).L((class09064)this.L_1).N();
    }

    private int N(int n, int n2) {
        if (n2 <= n) {
            return n;
        }
        return Math.max(32, (n2 + 32 - 1) / 32 * 32);
    }

    private int R(int n) {
        return (Math.max(0, n) + 6 - 1) / 6 * 6;
    }
}

