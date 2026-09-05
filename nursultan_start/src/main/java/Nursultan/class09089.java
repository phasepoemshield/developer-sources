/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09322
 *  Nursultan.class11174
 *  Nursultan.class11176
 *  Nursultan.class11185
 *  Nursultan.class11192
 *  Nursultan.class11204
 *  Nursultan.class11213
 *  Nursultan.class11993
 *  Nursultan.class12003
 *  Nursultan.class12019
 *  Nursultan.class12036
 *  Nursultan.class12038
 */
package Nursultan;

import Nursultan.class09101;
import Nursultan.class09322;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11185;
import Nursultan.class11192;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11993;
import Nursultan.class12003;
import Nursultan.class12019;
import Nursultan.class12036;
import Nursultan.class12038;

public class class09089
implements class11192<class09101> {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;
    public boolean N_init;
    public static Object y_0;
    public static Object y_1;

    public class09089(class11213 class112132, float f) {
        this.R();
        this.N_3 = ((class09322)class11185.B_4).z("u_projection");
        this.N_4 = ((class09322)class11185.B_4).z("u_view");
        this.N_5 = ((class09322)class11185.B_4).L("texture_in");
        this.N_6 = ((class09322)class11185.B_4).L("overlay_in");
        this.N_7 = ((class09322)class11185.B_4).R("texel_size");
        this.N_0 = class112132;
        this.N_2 = Float.valueOf(f);
        this.N_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.B_4).N(4).N()).N(class112132).N();
    }

    static {
        class09089.N();
        class09089.u();
    }

    private static void u() {
        y_0 = 0;
        y_1 = 1;
    }

    private static void N() {
    }

    public void execute(class09101 class091012) {
        class11176.N((class11213)((class11213)this.N_0), (float)class091012.Z(), (float)class091012.R(), (float)class091012.B(), (float)class091012.i(), (float)class091012.u(), (float)class091012.L(), (float)class091012.U(), (float)class091012.M(), (int)-1);
        ((class11174)this.N_1).N(class093222 -> {
            ((class12038)this.N_3).N(class091012.z());
            ((class12038)this.N_4).N(class091012.y());
            ((class12003)this.N_5).N(0);
            ((class12003)this.N_6).N(1);
            ((class11993)this.N_7).N(((Float)this.N_2).floatValue() / class091012.E(), ((Float)this.N_2).floatValue() / class091012.m());
        });
    }

    private void R() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_2 = Float.valueOf(0.0f);
        }
    }
}

