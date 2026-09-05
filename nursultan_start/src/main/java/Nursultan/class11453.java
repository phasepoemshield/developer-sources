/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.TargetEsp
 *  Nursultan.class09063
 *  Nursultan.class09078
 *  Nursultan.class09087
 *  Nursultan.class09321
 *  Nursultan.class09322
 *  Nursultan.class10203
 *  Nursultan.class11174
 *  Nursultan.class11176
 *  Nursultan.class11185
 *  Nursultan.class11200
 *  Nursultan.class11204
 *  Nursultan.class11213
 *  Nursultan.class11792
 *  Nursultan.class11798
 *  Nursultan.class11807
 *  Nursultan.class11887
 *  Nursultan.class11903
 *  Nursultan.class11905
 *  Nursultan.class11925
 *  Nursultan.class11934
 *  Nursultan.class11993
 *  Nursultan.class12003
 *  Nursultan.class12017
 *  Nursultan.class12019
 *  Nursultan.class12027
 *  Nursultan.class12036
 *  Nursultan.class12038
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTexture
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01422
 *  minecraft.class03063
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04790
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class08066
 *  minecraft.class08133
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package Nursultan;

import Nursultan.TargetEsp;
import Nursultan.class09063;
import Nursultan.class09078;
import Nursultan.class09087;
import Nursultan.class09321;
import Nursultan.class09322;
import Nursultan.class10203;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11185;
import Nursultan.class11200;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11515;
import Nursultan.class11792;
import Nursultan.class11798;
import Nursultan.class11807;
import Nursultan.class11887;
import Nursultan.class11903;
import Nursultan.class11905;
import Nursultan.class11925;
import Nursultan.class11934;
import Nursultan.class11993;
import Nursultan.class12003;
import Nursultan.class12017;
import Nursultan.class12019;
import Nursultan.class12027;
import Nursultan.class12036;
import Nursultan.class12038;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import java.time.Duration;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class03063;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04790;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class08066;
import minecraft.class08133;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class class11453
extends class11807<TargetEsp> {
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public Object u_6;
    public Object u_7;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public Object i_3;
    public Object i_4;
    public Object i_5;

    public class11453(TargetEsp targetEsp, String string, boolean bl) {
        super((Object)targetEsp, string, bl);
        this.B();
        this.i_0 = new class11934(class11903.FORWARDS);
        this.i_1 = new class10203(null, 1, 1, true);
        this.i_2 = class11213.N((class09087)((class09087)class09063.N_2), (int)4096, (int)1024);
        this.i_3 = class11174.N().N(class11204.L().N((class12036)class12019.N_1).N((class09322)class11185.N_0).N(4).N()).N((class11213)this.i_2).N();
        this.i_4 = new Matrix4f();
        this.i_5 = new Matrix4f();
        this.u_0 = new Matrix4f();
        this.u_1 = ((class09322)class11185.N_0).z("u_projection");
        this.u_2 = ((class09322)class11185.N_0).z("u_view");
        this.u_3 = ((class09322)class11185.N_0).L("texture_in");
        this.u_4 = ((class09322)class11185.N_0).L("depth_texture_in");
        this.u_5 = ((class09322)class11185.N_0).z("inv_mvp");
        this.u_6 = ((class09322)class11185.N_0).U("u_center");
        this.u_7 = ((class09322)class11185.N_0).i("u_band_y");
        this.y_0 = ((class09322)class11185.N_0).R("u_dir_vel");
        this.y_1 = ((class09322)class11185.N_0).i("u_time");
        this.y_2 = ((class09322)class11185.N_0).i("u_alpha");
    }

    static {
        class11453.N();
        class11453.m();
        L_0 = Duration.ofMillis(300L);
    }

    private void B() {
    }

    private static void m() {
        L_0 = null;
        L_1 = Float.valueOf(0.5f);
        L_2 = Float.valueOf(0.1f);
        L_3 = Math.PI * 10;
    }

    public void y(Object object) {
        this.B();
        if (object instanceof class09321) {
            class09321 class093212 = (class09321)object;
            ((class11934)this.i_0).N(((TargetEsp)((class11798)this).N_1).m() ? 1.0 : 0.0, (Duration)L_0, (class11887)class11905.u_4);
            ((class11934)this.i_0).N();
            if (((class11934)this.i_0).N(class11903.BACKWARDS)) {
                return;
            }
            class07438 class074382 = ((TargetEsp)((class11798)this).N_1).T();
            if (class074382.method_31481() || !class11925.y((class07049)class074382)) {
                return;
            }
            this.N(class093212, class074382);
            this.y(class093212, class074382);
        }
    }

    private void y(class09321 class093212, class07438 class074382) {
        this.B();
        class08066 class080662 = ((class06202)((class11798)this).N_0).e();
        int n = class080662.N;
        int n2 = class080662.y;
        ((Matrix4f)this.i_4).setOrtho(0.0f, (float)n, (float)n2, 0.0f, -1.0f, 1000.0f);
        class11176.N((class11213)((class11213)this.i_2), (float)0.0f, (float)0.0f, (float)0.0f, (float)n, (float)n2, (int)((Integer)((class11515)((TargetEsp)((class11798)this).N_1).L_5).i()));
        ((Matrix4f)this.i_5).set((Matrix4fc)class093212.i()).mul((Matrix4fc)class093212.N());
        ((Matrix4f)this.u_0).set((Matrix4fc)((Matrix4f)this.i_5)).invert();
        class06889 class068892 = class093212.y().y();
        float f = (float)(class11925.i((class07049)class074382) - class068892.M);
        float f2 = (float)(class11925.u((class07049)class074382) - class068892.B);
        float f3 = (float)(class11925.L((class07049)class074382) - class068892.Z);
        float f4 = class074382.method_17682();
        double d = (double)((float)((class04453)((class06202)((class11798)this).N_0).T_4).field_6012 + ((class06202)((class11798)this).N_0).NK().N(false)) / 20.0;
        double d2 = d % 2.0 * 0.5 * 6.2831854820251465;
        float f5 = f4 / 2.0f + 0.1f;
        float f6 = f2 + f4 / 2.0f + (float)Math.sin(d2) * f5;
        float f7 = (float)Math.cos(d2);
        class11925.N((GpuTexture)((class08066)this.i_1).L());
        class11925.N((GpuTexture)((class08066)this.i_1).i());
        ((class11174)this.i_3).N(class093222 -> {
            this.B();
            GlStateManager._activeTexture((int)33984);
            GlStateManager._bindTexture((int)class11925.N((class08066)((class08066)this.i_1)));
            GlStateManager._activeTexture((int)33990);
            GlStateManager._bindTexture((int)class11925.y((class08066)((class08066)this.i_1)));
            ((class12038)this.u_1).N((Matrix4f)this.i_4);
            ((class12038)this.u_2).N((Matrix4f)class11925.y_3);
            ((class12003)this.u_3).N(0);
            ((class12003)this.u_4).N(6);
            ((class12038)this.u_5).N((Matrix4f)this.u_0);
            ((class12017)this.u_6).N(f, f2, f3);
            ((class11200)this.u_7).N(f6);
            ((class11993)this.y_0).N(f7 > 0.0f ? 1.0f : -1.0f, Math.abs(f7));
            ((class11200)this.y_1).N((float)(d % (Math.PI * 10)));
            ((class11200)this.y_2).N(((class11934)this.i_0).E().floatValue());
        });
    }

    private void N(class09321 class093212, class07438 class074382) {
        this.B();
        class08066 class080662 = ((class06202)((class11798)this).N_0).e();
        class12027.N();
        class11925.N((class08066)((class08066)this.i_1), (int)class080662.N, (int)class080662.y);
        class04790 class047902 = ((class03063)((class06202)((class11798)this).N_0).B_2).Z;
        class08133 class081332 = ((class03063)((class06202)((class11798)this).N_0).B_2).z;
        class06959 class069592 = ((class03063)((class06202)((class11798)this).N_0).B_2).B.N;
        class01422 class014222 = ((class03063)((class06202)((class11798)this).N_0).B_2).u.L();
        class06889 class068892 = class093212.y().y();
        class01421 class014212 = new class01421();
        class014212.L().N().mul((Matrix4fc)class093212.N());
        RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(((class08066)this.i_1).L(), 0, ((class08066)this.i_1).i(), 1.0);
        class09078.N((class08066)((class08066)this.i_1));
        ((class11792)((class06202)((class11798)this).N_0).Ng()).N((class07049)class074382, class069592, class068892.M, class068892.B, class068892.Z, class093212.u().N(((class03448)((class06202)((class11798)this).N_0).T_3).method_54719().N((class07049)class074382)), class014212, (class01237)class047902);
        class11925.N((class08066)((class08066)this.i_1), (boolean)true);
        class081332.N();
        class014222.u();
        class09078.L();
        class11925.N((class08066)class080662, (boolean)true);
        GlStateManager._depthFunc((int)515);
        class12027.y();
    }

    private static void N() {
    }
}

