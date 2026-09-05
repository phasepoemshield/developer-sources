/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09069
 *  Nursultan.class09087
 *  Nursultan.class09321
 *  Nursultan.class09322
 *  Nursultan.class11174
 *  Nursultan.class11178
 *  Nursultan.class11184
 *  Nursultan.class11185
 *  Nursultan.class11204
 *  Nursultan.class11213
 *  Nursultan.class11890
 *  Nursultan.class11904
 *  Nursultan.class11925
 *  Nursultan.class11996
 *  Nursultan.class12012
 *  Nursultan.class12014
 *  Nursultan.class12026
 *  Nursultan.class12030
 *  Nursultan.class12036
 *  Nursultan.class12038
 *  Nursultan.class12043
 *  com.mojang.blaze3d.textures.GpuTexture
 *  minecraft.class03269
 *  minecraft.class03386
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class08066
 *  minecraft.class08893
 *  org.joml.Matrix4f
 *  org.lwjgl.opengl.GL33
 */
package Nursultan;

import Nursultan.class09069;
import Nursultan.class09087;
import Nursultan.class09321;
import Nursultan.class09322;
import Nursultan.class11174;
import Nursultan.class11178;
import Nursultan.class11184;
import Nursultan.class11185;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11890;
import Nursultan.class11904;
import Nursultan.class11925;
import Nursultan.class11996;
import Nursultan.class12012;
import Nursultan.class12014;
import Nursultan.class12026;
import Nursultan.class12030;
import Nursultan.class12036;
import Nursultan.class12038;
import Nursultan.class12043;
import com.mojang.blaze3d.textures.GpuTexture;
import java.util.List;
import minecraft.class03269;
import minecraft.class03386;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class08066;
import minecraft.class08893;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL33;

public class class11074 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public Object y_6;
    public Object y_7;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public boolean L_init;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public Object u_6;
    public boolean u_init;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public boolean i_init;
    public static Object R_0;
    public static Object R_1;

    private int M() {
        if ((Integer)this.N_3 == 0) {
            this.N_3 = GL33.glGenSamplers();
            GL33.glSamplerParameteri((int)((Integer)this.N_3), (int)10241, (int)9728);
            GL33.glSamplerParameteri((int)((Integer)this.N_3), (int)10240, (int)9728);
            GL33.glSamplerParameteri((int)((Integer)this.N_3), (int)10242, (int)33071);
            GL33.glSamplerParameteri((int)((Integer)this.N_3), (int)10243, (int)33071);
        }
        return (Integer)this.N_3;
    }

    public class11074() {
        this.i();
        this.y_0 = class06202.Nq();
        this.y_1 = class11213.N((class09087)((class09087)R_1), (int)65536, (int)16384);
        this.y_2 = class11174.N().N(class11204.L().N(class12036.u().N((class12012)class12012.R_0).N((class12030)class12030.N_0).N((class12014)class12014.y_0).N((class11996)class11996.N_1).N()).N((class09322)class11185.i_3).N(4).N()).N((class11213)this.y_1).N();
        this.y_3 = ((class09322)class11185.i_3).z("u_projection");
        this.y_4 = ((class09322)class11185.i_3).z("u_view");
        this.y_5 = ((class09322)class11185.i_3).M("texture_in");
        this.y_6 = ((class09322)class11185.i_3).M("lightmap_in");
        this.y_7 = ((class09322)class11185.i_3).N("u_color");
        this.u_0 = new Matrix4f();
    }

    static {
        class11074.u();
        R_1 = new class09087(new class09069[]{class09069.N((int)3), class09069.N((int)2), class09069.y(), class09069.N((int)2)});
    }

    private void i() {
        if (!this.u_init) {
            this.u_init = true;
            this.u_6 = Float.valueOf(0.0f);
        }
        if (!this.i_init) {
            this.i_init = true;
            this.i_0 = Float.valueOf(0.0f);
            this.i_1 = 0;
            this.i_2 = Float.valueOf(0.0f);
        }
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = Float.valueOf(0.0f);
            this.L_1 = Float.valueOf(0.0f);
            this.L_2 = Float.valueOf(0.0f);
            this.L_3 = Float.valueOf(0.0f);
            this.L_4 = Float.valueOf(0.0f);
            this.L_5 = Float.valueOf(0.0f);
        }
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = Float.valueOf(0.0f);
            this.N_1 = Float.valueOf(0.0f);
            this.N_2 = false;
            this.N_3 = 0;
        }
    }

    private int U() {
        GpuTexture gpuTexture = ((class03386)((class06202)this.y_0).i_5).T().N().texture();
        return gpuTexture instanceof class08893 ? ((class08893)gpuTexture).N() : 0;
    }

    private static void u() {
        R_0 = 3;
        R_1 = null;
    }

    private void y(class06889 class068892) {
        float f = Math.min((float)Math.hypot(class068892.M - ((class06889)this.u_4).M, class068892.Z - ((class06889)this.u_4).Z) * 4.0f, 1.0f);
        this.L_5 = Float.valueOf(((Float)this.N_0).floatValue());
        this.N_0 = Float.valueOf(((Float)this.N_0).floatValue() + (f - ((Float)this.N_0).floatValue()) * 0.4f);
        this.N_1 = Float.valueOf(((Float)this.N_1).floatValue() + ((Float)this.N_0).floatValue());
    }

    public void N() {
        this.u_1 = null;
        this.u_2 = null;
        this.u_3 = null;
        this.u_4 = null;
        this.N_2 = false;
    }

    public void N(class07438 class074382, class06889 class068892) {
        this.u_1 = class074382;
        class06889 class068893 = class068892 != null ? class068892 : class074382.method_73189();
        this.u_3 = class068893;
        this.u_4 = class068893;
        this.u_5 = class068893;
        this.i_2 = Float.valueOf(class074382.fields_4212a028292fd3c078969e3ee4c71d9e8_1.floatValue());
        this.L_0 = Float.valueOf(class074382.fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue());
        this.L_1 = Float.valueOf(class074382.fields_5212a028292fd3c078969e3ee4c71d9e8_0.floatValue());
        this.L_2 = Float.valueOf(class074382.fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue());
        this.L_3 = Float.valueOf(class074382.field_6004);
        this.L_4 = Float.valueOf(class074382.method_36455());
        this.u_6 = Float.valueOf(((Float)this.L_4).floatValue());
        this.i_0 = Float.valueOf(((Float)this.L_2).floatValue());
        this.i_1 = 0;
        class03269 class032692 = class074382.fields_3212a028292fd3c078969e3ee4c71d9e8_3;
        this.L_5 = Float.valueOf(class032692.N);
        this.N_0 = Float.valueOf(class032692.y);
        this.N_1 = Float.valueOf(class032692.L);
        this.N_2 = true;
    }

    public void N(class06889 class068892, float f, float f2) {
        if (!((Boolean)this.N_2).booleanValue() || class068892 == null) {
            return;
        }
        if (!class068892.equals((Object)((class06889)this.u_5)) || f != ((Float)this.u_6).floatValue() || f2 != ((Float)this.i_0).floatValue()) {
            this.u_5 = class068892;
            this.u_6 = Float.valueOf(f);
            this.i_0 = Float.valueOf(f2);
            this.i_1 = 3;
        }
        this.u_3 = (class06889)this.u_4;
        this.i_2 = Float.valueOf(((Float)this.L_0).floatValue());
        this.L_1 = Float.valueOf(((Float)this.L_2).floatValue());
        this.L_3 = Float.valueOf(((Float)this.L_4).floatValue());
        class06889 class068893 = (class06889)this.u_4;
        if ((Integer)this.i_1 > 0) {
            float f3 = 1.0f / (float)((Integer)this.i_1).intValue();
            class068893 = new class06889(((class06889)this.u_4).M + (((class06889)this.u_5).M - ((class06889)this.u_4).M) * (double)f3, ((class06889)this.u_4).B + (((class06889)this.u_5).B - ((class06889)this.u_4).B) * (double)f3, ((class06889)this.u_4).Z + (((class06889)this.u_5).Z - ((class06889)this.u_4).Z) * (double)f3);
            this.L_2 = Float.valueOf(((Float)this.L_2).floatValue() + class04995.R((float)(((Float)this.i_0).floatValue() - ((Float)this.L_2).floatValue())) * f3);
            this.L_4 = Float.valueOf(((Float)this.L_4).floatValue() + (((Float)this.u_6).floatValue() - ((Float)this.L_4).floatValue()) * f3);
            this.i_1 = (Integer)this.i_1 - 1;
        }
        this.L_0 = Float.valueOf(this.N(class068893));
        this.y(class068893);
        this.u_4 = class068893;
    }

    public void N(class09321 class093212, int n) {
        if (!((Boolean)this.N_2).booleanValue()) {
            return;
        }
        float f = class093212.u().N(true);
        this.N(f);
        if ((List)this.u_2 == null) {
            return;
        }
        class06889 class068892 = class093212.y().y();
        class06889 class068893 = ((class06889)this.u_3).N((class06889)this.u_4, (double)f);
        ((Matrix4f)this.u_0).translation((float)(class068893.M - class068892.M), (float)(class068893.B - class068892.B), (float)(class068893.Z - class068892.Z));
        class11925.N((class08066)((class06202)this.y_0).e(), (boolean)true);
        for (class11904 class119042 : (List)this.u_2) {
            GpuTexture gpuTexture;
            if (class119042.i().isClosed() || !((gpuTexture = class119042.i().texture()) instanceof class08893)) continue;
            class08893 class088932 = (class08893)gpuTexture;
            this.N(class119042);
            ((class11174)this.y_2).N(class093222 -> {
                ((class12038)this.y_3).N(class093212.i());
                ((class12038)this.y_4).N(class093212.N());
                ((class12026)this.y_5).N(class088932.N());
                GL33.glBindSampler((int)0, (int)this.M());
                ((class12026)this.y_6).N(33985, this.U());
                GL33.glBindSampler((int)1, (int)this.M());
                ((class12043)this.y_7).N(n);
            });
        }
        GL33.glBindSampler((int)0, (int)0);
        GL33.glBindSampler((int)1, (int)0);
    }

    private void N(class11904 class119042) {
        class11184 class111842 = ((class11213)this.y_1).M();
        class11178 class111782 = ((class11213)this.y_1).N();
        float[] fArray = class119042.M();
        float[] fArray2 = class119042.u();
        int[] nArray = class119042.L();
        float[] fArray3 = class119042.N();
        for (int i = 0; i < nArray.length; ++i) {
            class111842.N((Matrix4f)this.u_0, fArray[i * 3], fArray[i * 3 + 1], fArray[i * 3 + 2]).N(fArray2[i * 2], fArray2[i * 2 + 1]).y(nArray[i]).N(fArray3[i * 2], fArray3[i * 2 + 1]).y();
        }
        for (int n : class119042.y()) {
            class111782.N(n);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void N(float f) {
        if ((class07438)this.u_1 == null || ((class07438)this.u_1).method_31481()) {
            return;
        }
        float f2 = ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue();
        float f3 = ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_1.floatValue();
        float f4 = ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue();
        float f5 = ((class07438)this.u_1).fields_5212a028292fd3c078969e3ee4c71d9e8_0.floatValue();
        float f6 = ((class07438)this.u_1).method_36454();
        float f7 = ((class07438)this.u_1).field_5982;
        float f8 = ((class07438)this.u_1).method_36455();
        float f9 = ((class07438)this.u_1).field_6004;
        class03269 class032692 = ((class07438)this.u_1).fields_3212a028292fd3c078969e3ee4c71d9e8_3;
        float f10 = class032692.y;
        float f11 = class032692.N;
        float f12 = class032692.L;
        ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(((Float)this.L_0).floatValue());
        ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_1 = Float.valueOf(((Float)this.i_2).floatValue());
        ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(((Float)this.L_2).floatValue());
        ((class07438)this.u_1).fields_5212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(((Float)this.L_1).floatValue());
        ((class07438)this.u_1).method_36456(((Float)this.L_2).floatValue());
        ((class07438)this.u_1).field_5982 = ((Float)this.L_1).floatValue();
        ((class07438)this.u_1).method_36457(((Float)this.L_4).floatValue());
        ((class07438)this.u_1).field_6004 = ((Float)this.L_3).floatValue();
        class032692.y = ((Float)this.N_0).floatValue();
        class032692.N = ((Float)this.L_5).floatValue();
        class032692.L = ((Float)this.N_1).floatValue();
        try {
            class06889 class068892 = new class06889(class04995.u((double)f, (double)((class07438)this.u_1).field_6014, (double)((class07438)this.u_1).method_23317()), class04995.u((double)f, (double)((class07438)this.u_1).field_6036, (double)((class07438)this.u_1).method_23318()), class04995.u((double)f, (double)((class07438)this.u_1).field_5969, (double)((class07438)this.u_1).method_23321()));
            List var15 = class11890.N((class07049)((class07438)this.u_1), (class06889)class068892, (float)f);
            if (!var15.isEmpty()) {
                this.u_2 = var15;
            }
        }
        catch (Exception exception) {
        }
        finally {
            ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(f2);
            ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_1 = Float.valueOf(f3);
            ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(f4);
            ((class07438)this.u_1).fields_5212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(f5);
            ((class07438)this.u_1).method_36456(f6);
            ((class07438)this.u_1).field_5982 = f7;
            ((class07438)this.u_1).method_36457(f8);
            ((class07438)this.u_1).field_6004 = f9;
            class032692.y = f10;
            class032692.N = f11;
            class032692.L = f12;
        }
    }

    private float N(class06889 class068892) {
        float f;
        float f2;
        double d = class068892.M - ((class06889)this.u_4).M;
        double d2 = class068892.Z - ((class06889)this.u_4).Z;
        float f3 = f2 = ((Float)this.L_0).floatValue();
        if (d * d + d2 * d2 > 0.002500000176951289) {
            f3 = (float)class04995.u((double)d2, (double)d) * 57.295776f - 90.0f;
            f = class04995.L((float)(class04995.R((float)((Float)this.L_2).floatValue()) - f3));
            if (95.0f < f && f < 265.0f) {
                f3 -= 180.0f;
            }
        }
        f2 += class04995.R((float)(f3 - f2)) * 0.3f;
        f = class04995.R((float)(((Float)this.L_2).floatValue() - f2));
        if (Math.abs(f) > 50.0f) {
            f2 += f - (float)class04995.U((double)f) * 50.0f;
        }
        return f2;
    }
}

