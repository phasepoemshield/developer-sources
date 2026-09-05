/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.JumpEffect
 *  Nursultan.class09321
 *  Nursultan.class09322
 *  Nursultan.class11174
 *  Nursultan.class11176
 *  Nursultan.class11185
 *  Nursultan.class11192
 *  Nursultan.class11204
 *  Nursultan.class11213
 *  Nursultan.class11925
 *  Nursultan.class12003
 *  Nursultan.class12019
 *  Nursultan.class12036
 *  Nursultan.class12038
 *  minecraft.class08066
 *  org.joml.Matrix4f
 */
package Nursultan;

import Nursultan.JumpEffect;
import Nursultan.class09321;
import Nursultan.class09322;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11185;
import Nursultan.class11192;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11925;
import Nursultan.class12003;
import Nursultan.class12019;
import Nursultan.class12036;
import Nursultan.class12038;
import minecraft.class08066;
import org.joml.Matrix4f;

public class class11049
implements class11192<class09321> {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public static Object y_0;

    class11049(JumpEffect jumpEffect, class11213 class112132) {
        this.u();
        this.N_6 = jumpEffect;
        this.N_2 = new Matrix4f();
        this.N_3 = ((class09322)class11185.B_5).z("u_projection");
        this.N_4 = ((class09322)class11185.B_5).z("u_view");
        this.N_5 = ((class09322)class11185.B_5).L("texture_in");
        this.N_0 = class112132;
        this.N_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.B_5).N(4).N()).N(class112132).N();
    }

    static {
        class11049.N();
        class11049.R();
    }

    private void u() {
    }

    private static void N() {
    }

    public void execute(class09321 class093212) {
        class08066 class080662 = JumpEffect.N((JumpEffect)((JumpEffect)this.N_6)).e();
        ((Matrix4f)this.N_2).setOrtho(0.0f, (float)class080662.N, (float)class080662.y, 0.0f, -1.0f, 1000.0f);
        class11176.N((class11213)((class11213)this.N_0), (float)0.0f, (float)0.0f, (float)0.0f, (float)class080662.N, (float)class080662.y, (int)-1);
        ((class11174)this.N_1).N(class093222 -> {
            ((class12038)this.N_3).N((Matrix4f)this.N_2);
            ((class12038)this.N_4).N((Matrix4f)class11925.y_3);
            ((class12003)this.N_5).N(0);
        });
    }

    private static void R() {
        y_0 = 0;
    }
}

