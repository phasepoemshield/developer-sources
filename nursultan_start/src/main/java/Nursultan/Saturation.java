/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09063
 *  Nursultan.class09087
 *  Nursultan.class09321
 *  Nursultan.class09322
 *  Nursultan.class10203
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11174
 *  Nursultan.class11176
 *  Nursultan.class11185
 *  Nursultan.class11200
 *  Nursultan.class11204
 *  Nursultan.class11213
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11925
 *  Nursultan.class11938
 *  Nursultan.class12019
 *  Nursultan.class12026
 *  Nursultan.class12036
 *  Nursultan.class12038
 *  minecraft.class06202
 *  minecraft.class08066
 *  minecraft.class08893
 *  org.joml.Matrix4f
 */
package Nursultan;

import Nursultan.class09063;
import Nursultan.class09087;
import Nursultan.class09321;
import Nursultan.class09322;
import Nursultan.class10203;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11185;
import Nursultan.class11200;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11925;
import Nursultan.class11938;
import Nursultan.class12019;
import Nursultan.class12026;
import Nursultan.class12036;
import Nursultan.class12038;
import minecraft.class06202;
import minecraft.class08066;
import minecraft.class08893;
import org.joml.Matrix4f;

@class11080(L="Saturation", y=class11072.VISUAL, N=class11106.WORLD)
public class Saturation
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public Object u_0;
    public Object u_1;
    public Object u_2;

    private void T() {
    }

    public Saturation() {
        this.T();
        this.u_0 = class11524.N((class11512)this, (String)"saturation", (float)0.0f, (float)-1.0f, (float)3.0f, (float)0.1f);
        this.u_1 = new class10203(null, 1, 1, false);
        this.u_2 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.L_6).N(4).N()).N(class11213.N((class09087)((class09087)class09063.N_2), (int)256, (int)16)).N();
        this.L_0 = ((class09322)class11185.L_6).z("u_projection");
        this.L_1 = ((class09322)class11185.L_6).z("u_view");
        this.L_2 = ((class09322)class11185.L_6).M("texture_in");
        this.L_3 = ((class09322)class11185.L_6).M("depth_texture_in");
        this.L_4 = ((class09322)class11185.L_6).i("alpha");
        this.L_5 = ((class09322)class11185.L_6).i("sky_protection");
        this.L_6 = new Matrix4f();
    }

    @class11782(y=class11777.BEFORE_ALL)
    public void N(class09321 class093212) {
        this.T();
        class08066 class080662 = ((class06202)this.y_0).e();
        ((Matrix4f)this.L_6).setOrtho(0.0f, (float)class080662.N, (float)class080662.y, 0.0f, -1.0f, 1.0f);
        class11925.N((class08066)((class08066)this.u_1), (int)class080662.N, (int)class080662.y);
        class11925.N((class08066)class080662, (class08066)((class08066)this.u_1));
        class11925.N((class08066)class080662, (boolean)false);
        class11176.N((class11213)((class11174)this.u_2).u(), (float)0.0f, (float)0.0f, (float)1.0f, (float)class080662.N, (float)class080662.y, (int)-1);
        ((class11174)this.u_2).N(class093222 -> {
            this.T();
            ((class12038)this.L_0).N((Matrix4f)this.L_6);
            ((class12038)this.L_1).N((Matrix4f)class11925.y_3);
            ((class12026)this.L_2).N(((class08893)((class08066)this.u_1).L()).N());
            ((class12026)this.L_3).N(33985, class11925.y((class08066)class080662));
            ((class11200)this.L_4).N(-((Float)((class11504)this.u_0).i()).floatValue());
            ((class11200)this.L_5).N(class11938.u().NR().U() ? 1.0f : 0.0f);
        });
    }
}

