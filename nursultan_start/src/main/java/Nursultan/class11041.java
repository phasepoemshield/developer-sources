/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.JumpEffect
 *  Nursultan.class09064
 *  Nursultan.class09321
 *  Nursultan.class09322
 *  Nursultan.class11170
 *  Nursultan.class11174
 *  Nursultan.class11176
 *  Nursultan.class11185
 *  Nursultan.class11192
 *  Nursultan.class11204
 *  Nursultan.class11213
 *  Nursultan.class11504
 *  Nursultan.class11515
 *  Nursultan.class11925
 *  Nursultan.class11993
 *  Nursultan.class12003
 *  Nursultan.class12019
 *  Nursultan.class12036
 *  Nursultan.class12038
 *  Nursultan.class12043
 *  com.mojang.blaze3d.textures.GpuTexture
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package Nursultan;

import Nursultan.JumpEffect;
import Nursultan.class09064;
import Nursultan.class09321;
import Nursultan.class09322;
import Nursultan.class11170;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11185;
import Nursultan.class11192;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11504;
import Nursultan.class11515;
import Nursultan.class11925;
import Nursultan.class11993;
import Nursultan.class12003;
import Nursultan.class12019;
import Nursultan.class12036;
import Nursultan.class12038;
import Nursultan.class12043;
import com.mojang.blaze3d.textures.GpuTexture;
import java.nio.FloatBuffer;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class class11041
implements class11192<class09321> {
    public Object N_0;
    public Object N_1;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public Object y_6;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public static Object i_0;
    public static Object i_1;

    private void M() {
    }

    class11041(JumpEffect jumpEffect, class11213 class112132) {
        this.M();
        this.L_2 = jumpEffect;
        this.u_0 = new Matrix4f();
        this.u_1 = new Matrix4f();
        this.u_2 = new Matrix4f();
        this.u_3 = ((class09322)class11185.i_1).z("u_projection");
        this.u_4 = ((class09322)class11185.i_1).z("u_view");
        this.y_0 = ((class09322)class11185.i_1).L("texture_in");
        this.y_1 = ((class09322)class11185.i_1).L("depth_texture_in");
        this.y_2 = ((class09322)class11185.i_1).z("inv_mvp");
        this.y_3 = ((class09322)class11185.i_1).z("mvp");
        this.y_4 = ((class09322)class11185.i_1).N("wave_params");
        this.y_5 = ((class09322)class11185.i_1).N("first_color");
        this.y_6 = ((class09322)class11185.i_1).N("second_color");
        this.L_0 = ((class09322)class11185.i_1).R("gradient_dir");
        this.L_1 = ((class09322)class11185.i_1).y("waves");
        this.N_0 = class112132;
        this.N_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.i_1).N(4).N()).N(class112132).N();
    }

    static {
        class11041.N();
    }

    public void execute(class09321 class093212) {
        int n = ((class09064)((JumpEffect)this.L_2).L_3).G();
        int n2 = ((class09064)((JumpEffect)this.L_2).L_3).u();
        float f = class093212.u().N(true);
        ((Matrix4f)this.u_0).setOrtho(0.0f, (float)n, (float)n2, 0.0f, -1.0f, 1000.0f);
        class11176.N((class11213)((class11213)this.N_0), (float)0.0f, (float)0.0f, (float)0.0f, (float)n, (float)n2, (int)-1);
        ((Matrix4f)this.u_1).set((Matrix4fc)class093212.i()).mul((Matrix4fc)class093212.N());
        ((Matrix4f)this.u_2).set((Matrix4fc)((Matrix4f)this.u_1)).invert();
        ((JumpEffect)this.L_2).N(class093212.y().y(), f);
        class11925.N((GpuTexture)JumpEffect.L((JumpEffect)((JumpEffect)this.L_2)).e().i());
        class11925.N((GpuTexture)JumpEffect.y((JumpEffect)((JumpEffect)this.L_2)).e().L());
        ((class11174)this.N_1).N(class093222 -> {
            ((class12038)this.u_3).N((Matrix4f)this.u_0);
            ((class12038)this.u_4).N((Matrix4f)class11925.y_3);
            ((class12003)this.y_0).N(0);
            ((class12003)this.y_1).N(6);
            ((class12038)this.y_2).N((Matrix4f)this.u_2);
            ((class12038)this.y_3).N((Matrix4f)this.u_1);
            ((class12043)this.y_4).N(0.1f, ((Float)((class11504)((JumpEffect)this.L_2).u_1).i()).floatValue(), 0.0f, 20.0f);
            ((class12043)this.y_5).N(((Integer)((class11515)((JumpEffect)this.L_2).u_2).i()).intValue());
            ((class12043)this.y_6).N(((Integer)((class11515)((JumpEffect)this.L_2).u_3).i()).intValue());
            double d = (double)((float)((Integer)((JumpEffect)this.L_2).L_1).intValue() + f) / 8.0;
            ((class11993)this.L_0).N((float)Math.sin(d), (float)Math.cos(d));
            ((class11170)this.L_1).N((FloatBuffer)((JumpEffect)this.L_2).L_0);
        });
    }

    private static void N() {
        i_0 = 0;
        i_1 = 6;
    }
}

