/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09056
 *  Nursultan.class09057
 *  Nursultan.class09063
 *  Nursultan.class09064
 *  Nursultan.class09069
 *  Nursultan.class09072
 *  Nursultan.class09087
 *  Nursultan.class09101
 *  Nursultan.class09322
 *  Nursultan.class11890
 *  Nursultan.class11904
 *  Nursultan.class11925
 *  Nursultan.class11993
 *  Nursultan.class11996
 *  Nursultan.class12012
 *  Nursultan.class12014
 *  Nursultan.class12026
 *  Nursultan.class12027
 *  Nursultan.class12030
 *  Nursultan.class12036
 *  Nursultan.class12038
 *  Nursultan.class12043
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTexture
 *  minecraft.class01421
 *  minecraft.class03049
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class07050
 *  minecraft.class07070
 *  minecraft.class08066
 *  minecraft.class08844
 *  minecraft.class08893
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL33
 */
package Nursultan;

import Nursultan.class09056;
import Nursultan.class09057;
import Nursultan.class09063;
import Nursultan.class09064;
import Nursultan.class09069;
import Nursultan.class09072;
import Nursultan.class09087;
import Nursultan.class09101;
import Nursultan.class09322;
import Nursultan.class11174;
import Nursultan.class11175;
import Nursultan.class11178;
import Nursultan.class11184;
import Nursultan.class11185;
import Nursultan.class11192;
import Nursultan.class11199;
import Nursultan.class11200;
import Nursultan.class11204;
import Nursultan.class11206;
import Nursultan.class11213;
import Nursultan.class11218;
import Nursultan.class11890;
import Nursultan.class11904;
import Nursultan.class11925;
import Nursultan.class11993;
import Nursultan.class11996;
import Nursultan.class12012;
import Nursultan.class12014;
import Nursultan.class12026;
import Nursultan.class12027;
import Nursultan.class12030;
import Nursultan.class12036;
import Nursultan.class12038;
import Nursultan.class12043;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import java.nio.FloatBuffer;
import java.util.List;
import minecraft.class01421;
import minecraft.class03049;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07050;
import minecraft.class07070;
import minecraft.class08066;
import minecraft.class08844;
import minecraft.class08893;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL33;

public class class11247 {
    public static Object N_0;
    public static Object N_1;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public boolean y_init;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public Object u_6;
    public Object u_7;
    public boolean u_init;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public Object i_3;
    public Object i_4;
    public Object i_5;
    public Object i_6;
    public Object i_7;
    public Object R_0;
    public Object R_1;
    public Object R_2;
    public Object R_3;
    public Object R_4;
    public Object M_0;
    public Object M_1;
    public Object M_2;
    public Object M_3;
    public Object M_4;

    private class11218<class09101> L() {
        if ((Integer)this.u_4 == 0) {
            return (class11218)this.L_1;
        }
        return switch ((Integer)this.y_3) {
            case 2 -> (class11218)this.L_2;
            case 4 -> (class11218)this.u_0;
            default -> (class11218)this.u_1;
        };
    }

    private class11218<class09101> M(int n) {
        class11206<class09101> class112062 = class11218.N().N((class09056)this.y_2).y((C class091012) -> this.N((class09101)class091012, 1, 2)).N(n == 2 ? (class09064)this.R_2 : (class09064)this.R_0).N(() -> class11925.N((class08066)((class06202)this.i_0).e()));
        if (n >= 4) {
            class112062 = class112062.N((class11192<class09101>)((class09056)this.y_2)).y((C class091012) -> this.N((class09101)class091012, 2, 4)).N(n == 4 ? (class09064)this.R_2 : (class09064)this.R_1).L((class09064)this.R_0);
        }
        if (n == 8) {
            class112062 = class112062.N((class11192<class09101>)((class09056)this.y_2)).y((C class091012) -> this.N((class09101)class091012, 4, 8)).N((class09064)this.R_2).L((class09064)this.R_1);
        }
        return class112062.N((class11192<class09101>)((class09072)this.M_4)).y(this::N).N((class09064)this.R_3).L((class09064)this.R_2).N((class11192<class09101>)((class09072)this.y_0)).y(this::N).N((class09064)this.R_4).L((class09064)this.R_3).N();
    }

    private int P() {
        if ((Integer)this.u_6 == 0) {
            this.u_6 = GL33.glGenSamplers();
            GL33.glSamplerParameteri((int)((Integer)this.u_6), (int)10241, (int)9728);
            GL33.glSamplerParameteri((int)((Integer)this.u_6), (int)10240, (int)9728);
            GL33.glSamplerParameteri((int)((Integer)this.u_6), (int)10242, (int)33071);
            GL33.glSamplerParameteri((int)((Integer)this.u_6), (int)10243, (int)33071);
        }
        return (Integer)this.u_6;
    }

    public class11247() {
        this.z();
        this.i_0 = class06202.Nq();
        this.i_1 = class11213.N((class09087)N_1, 65536, 16384);
        this.i_2 = class11174.N().N(class11204.L().N(class12036.u().N((class12012)class12012.R_0).N((class12030)class12030.N_0).N((class12014)class12014.y_0).N((class11996)class11996.N_1).N()).N((class09322)class11185.i_4).N(4).N()).N((class11213)this.i_1).N();
        this.i_3 = ((class09322)class11185.i_4).z("u_projection");
        this.i_4 = ((class09322)class11185.i_4).z("u_view");
        this.i_5 = ((class09322)class11185.i_4).M("texture_in");
        this.i_6 = ((class09322)class11185.i_4).M("blurred_in");
        this.i_7 = ((class09322)class11185.i_4).N("u_color");
        this.M_0 = ((class09322)class11185.i_4).i("u_mix");
        this.M_1 = ((class09322)class11185.i_4).R("u_resolution");
        this.M_2 = class11213.N((class09087)class09063.N_2, 4096, 1024);
        this.M_3 = new class09101();
        this.M_4 = class09072.N((class11213)((class11213)this.M_2), (float[])((float[])class09072.N_0));
        this.y_0 = class09072.N((class11213)((class11213)this.M_2), (float[])((float[])class09072.N_1));
        this.y_1 = new class09056((class11213)this.M_2, 0.0f);
        this.y_2 = new class09056((class11213)this.M_2, 2.0f);
        this.y_3 = 1;
        this.R_0 = this.U(2);
        this.R_1 = this.U(4);
        this.R_2 = this.N(class11175.CLAMP_TO_EDGE);
        this.R_3 = this.N(class11175.CLAMP_TO_EDGE);
        this.R_4 = this.N(class11175.MIRRORED_REPEAT);
        this.L_0 = BufferUtils.createFloatBuffer((int)30);
        this.L_1 = this.W();
        this.L_2 = this.M(2);
        this.u_0 = this.M(4);
        this.u_1 = this.M(8);
        this.u_2 = new int[4];
        this.u_5 = -1;
    }

    static {
        class11247.E();
        class11247.i();
        class11247.R();
        N_1 = new class09087(new class09069[]{class09069.N((int)3), class09069.N((int)2), class09069.N((int)3)});
    }

    private static void i() {
    }

    private class09064 U(int n) {
        return class09064.N(() -> this.N(((class06202)this.i_0).Nt().U(), n), () -> this.N(((class06202)this.i_0).Nt().E(), n)).N(class11199.LINEAR, class11199.LINEAR).y(class11175.CLAMP_TO_EDGE).N();
    }

    private void z() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_3 = 0;
        }
        if (!this.u_init) {
            this.u_init = true;
            this.u_4 = 0;
            this.u_5 = 0;
            this.u_6 = 0;
        }
    }

    public boolean y() {
        return (class09057)this.u_3 != null;
    }

    private int y(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 5) {
            return 2;
        }
        return n < 15 ? 4 : 8;
    }

    private static void E() {
    }

    private void N(List<class11904> list, Matrix4f matrix4f, class08844 class088442, class09057 class090572, int n, float f) {
        for (class11904 class119042 : list) {
            GpuTexture gpuTexture;
            if (class119042.i().isClosed() || !((gpuTexture = class119042.i().texture()) instanceof class08893)) continue;
            class08893 class088932 = (class08893)gpuTexture;
            this.N(class119042);
            ((class11174)this.i_2).N((class09322 class093222) -> {
                ((class12038)this.i_3).N(matrix4f);
                ((class12038)this.i_4).N(RenderSystem.getModelViewMatrix());
                ((class12026)this.i_5).N(class088932.N());
                GL33.glBindSampler((int)0, (int)this.P());
                ((class12026)this.i_6).N(33985, class090572.i());
                ((class12043)this.i_7).N(n);
                ((class11200)this.M_0).N(f);
                ((class11993)this.M_1).N((float)class088442.U(), (float)class088442.E());
            });
        }
    }

    public void N(int n) {
        this.u_4 = Math.clamp((long)n, (int)0, (int)30);
        this.y_3 = this.y((Integer)this.u_4);
        if ((Integer)this.u_4 > 0 && ((Integer)this.u_5).intValue() != ((Integer)this.u_4).intValue()) {
            this.u_5 = (int)((Integer)this.u_4);
            class11925.N((FloatBuffer)((FloatBuffer)this.L_0), (int)((Integer)this.u_4 - 1));
        }
        int n2 = GL33.glGetInteger((int)36006);
        GL33.glGetIntegerv((int)2978, (int[])((int[])this.u_2));
        this.L().execute((class09101)this.M_3);
        GlStateManager._glBindFramebuffer((int)36160, (int)n2);
        GL33.glViewport((int)((int[])this.u_2)[0], (int)((int[])this.u_2)[1], (int)((int[])this.u_2)[2], (int)((int[])this.u_2)[3]);
        this.u_3 = ((class09064)this.R_4).U();
    }

    private int N(int n, int n2) {
        return Math.max(1, (n + n2 - 1) / n2);
    }

    private void N(class09101 class091012) {
        class08844 class088442 = ((class06202)this.i_0).Nt();
        class091012.u((float)this.W(class088442.U())).R((float)this.W(class088442.E())).L(((Integer)this.u_4).intValue()).N((FloatBuffer)this.L_0);
    }

    public boolean N(class07050 class070502) {
        return (class07050)this.u_7 == null || (class07050)this.u_7 == class070502;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void N(class03049 class030492, float f, class01421 class014212, class04453 class044532, int n, Matrix4f matrix4f, int n2, int n3, float f2) {
        List var12;
        List var11;
        class09057 class090572 = (class09057)this.u_3;
        this.u_3 = null;
        try {
            this.u_7 = class07050.field_5808;
            var11 = class11890.N(class012372 -> class030492.N(f, class014212, class012372, class044532, n));
            this.u_7 = class07050.field_5810;
            var12 = class11890.N(class012372 -> class030492.N(f, class014212, class012372, class044532, n));
        }
        finally {
            this.u_7 = null;
        }
        if (class090572 == null || var11.isEmpty() && var12.isEmpty()) {
            return;
        }
        class07070 class070702 = class044532.method_6068();
        class08844 class088442 = ((class06202)this.i_0).Nt();
        try (class12027 class120272 = class12027.y();){
            class11925.N((class08066)((class06202)this.i_0).e(), (boolean)true);
            this.N(var11, matrix4f, class088442, class090572, class070702 == class07070.field_6183 ? n2 : n3, f2);
            this.N(var12, matrix4f, class088442, class090572, class070702 == class07070.field_6183 ? n3 : n2, f2);
            GL33.glBindSampler((int)0, (int)0);
        }
    }

    private void N(class09101 class091012, int n, int n2) {
        class08844 class088442 = ((class06202)this.i_0).Nt();
        int n3 = this.N(class088442.U(), n2);
        int n4 = this.N(class088442.E(), n2);
        class091012.z().setOrtho(0.0f, (float)n3, (float)n4, 0.0f, -1.0f, 1.0f);
        class091012.y().set((Matrix4fc)((Matrix4f)class11925.y_3));
        class091012.y(0).N(0).i(n3).u(n4).u((float)this.N(class088442.U(), n)).R((float)this.N(class088442.E(), n)).y(0.0f).N(1.0f).L(1.0f).i(0.0f);
    }

    private void N(class11904 class119042) {
        class11184 class111842 = ((class11213)this.i_1).M();
        class11178 class111782 = ((class11213)this.i_1).N();
        float[] fArray = class119042.M();
        float[] fArray2 = class119042.u();
        float[] fArray3 = class119042.R();
        int n = fArray.length / 3;
        for (int i = 0; i < n; ++i) {
            class111842.N(fArray[i * 3], fArray[i * 3 + 1], fArray[i * 3 + 2]).N(fArray2[i * 2], fArray2[i * 2 + 1]).N(fArray3[i * 3], fArray3[i * 3 + 1], fArray3[i * 3 + 2]).y();
        }
        for (int n2 : class119042.y()) {
            class111782.N(n2);
        }
    }

    public void N() {
        this.u_3 = null;
    }

    private class09064 N(class11175 class111752) {
        return class09064.N(() -> this.W(((class06202)this.i_0).Nt().U()), () -> this.W(((class06202)this.i_0).Nt().E())).N(class11199.LINEAR, class11199.LINEAR).y(class111752).N();
    }

    private class11218<class09101> W() {
        return class11218.N().N((class09056)this.y_1).y((C class091012) -> this.N((class09101)class091012, 1, 1)).N((class09064)this.R_4).N(() -> class11925.N((class08066)((class06202)this.i_0).e())).N();
    }

    private int W(int n) {
        return this.N(n, (Integer)this.y_3);
    }

    private static void R() {
        N_0 = 30;
        N_1 = null;
    }
}

