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

public class class09056
implements class11192<class09101> {
    public static Object N_0;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public Object y_6;
    public boolean y_init;

    private void M() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_2 = Float.valueOf(0.0f);
        }
    }

    public class09056(class11213 class112132, float f) {
        this.M();
        this.y_3 = ((class09322)class11185.B_3).z("u_projection");
        this.y_4 = ((class09322)class11185.B_3).z("u_view");
        this.y_5 = ((class09322)class11185.B_3).L("texture_in");
        this.y_6 = ((class09322)class11185.B_3).R("texel_size");
        this.y_0 = class112132;
        this.y_2 = Float.valueOf(f);
        this.y_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.B_3).N(4).N()).N(class112132).N();
    }

    static {
        class09056.N();
        class09056.i();
    }

    private static void i() {
        N_0 = 0;
    }

    private static void N() {
    }

    public void execute(class09101 class091012) {
        class11176.N((class11213)((class11213)this.y_0), (float)class091012.Z(), (float)class091012.R(), (float)class091012.B(), (float)class091012.i(), (float)class091012.u(), (float)class091012.L(), (float)class091012.U(), (float)class091012.M(), (int)-1);
        ((class11174)this.y_1).N(class093222 -> {
            ((class12038)this.y_3).N(class091012.z());
            ((class12038)this.y_4).N(class091012.y());
            ((class12003)this.y_5).N(0);
            ((class11993)this.y_6).N(((Float)this.y_2).floatValue() / class091012.E(), ((Float)this.y_2).floatValue() / class091012.m());
        });
    }
}

