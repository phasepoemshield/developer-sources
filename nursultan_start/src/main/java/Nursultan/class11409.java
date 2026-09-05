/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09317
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
 *  minecraft.class06202
 *  minecraft.class08066
 *  org.joml.Matrix4f
 */
package Nursultan;

import Nursultan.class09317;
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
import minecraft.class06202;
import minecraft.class08066;
import org.joml.Matrix4f;

public class class11409
implements class11192<class09317> {
    public static Object N_0;
    public static Object N_1;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;

    public class11409(class11213 class112132) {
        this.R();
        this.y_2 = new Matrix4f();
        this.y_3 = ((class09322)class11185.B_5).z("u_projection");
        this.y_4 = ((class09322)class11185.B_5).z("u_view");
        this.y_5 = ((class09322)class11185.B_5).L("texture_in");
        this.y_0 = class112132;
        this.y_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.B_5).N(4).N()).N(class112132).N();
    }

    static {
        class11409.N();
        class11409.u();
        N_1 = class06202.Nq();
    }

    private static void u() {
        N_0 = 0;
        N_1 = null;
    }

    private static void N() {
    }

    public void execute(class09317 class093172) {
        class08066 class080662 = ((class06202)N_1).e();
        ((Matrix4f)this.y_2).setOrtho(0.0f, (float)class080662.N, (float)class080662.y, 0.0f, -1.0f, 1000.0f);
        class11176.N((class11213)((class11213)this.y_0), (float)0.0f, (float)0.0f, (float)0.0f, (float)class080662.N, (float)class080662.y, (int)-1);
        ((class11174)this.y_1).N(class093222 -> {
            ((class12038)this.y_3).N((Matrix4f)this.y_2);
            ((class12038)this.y_4).N((Matrix4f)class11925.y_3);
            ((class12003)this.y_5).N(0);
        });
    }

    private void R() {
    }
}

