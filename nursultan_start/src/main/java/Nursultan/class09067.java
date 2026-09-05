/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09322
 *  Nursultan.class11170
 *  Nursultan.class11174
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
import Nursultan.class11170;
import Nursultan.class11174;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11993;
import Nursultan.class12003;
import Nursultan.class12019;
import Nursultan.class12036;
import Nursultan.class12038;

public class class09067 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;

    class09067(class11213 class112132, class09322 class093222, boolean bl, boolean bl2, String string) {
        this.y();
        this.N_0 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N(class093222).N(4).N()).N(class112132).N();
        this.N_1 = class093222.z("u_projection");
        this.N_2 = class093222.z("u_view");
        this.N_3 = class093222.L("texture_in");
        this.N_4 = class093222.R("texel_size");
        this.N_5 = bl2 ? class093222.R("direction") : null;
        this.N_6 = bl ? class093222.L("radius") : null;
        this.N_7 = string != null ? class093222.y(string) : null;
    }

    static {
        class09067.N();
    }

    private void y() {
    }

    void N(class09101 class091012, float f, float f2) {
        ((class11174)this.N_0).N(class093222 -> {
            ((class12038)this.N_1).N(class091012.z());
            ((class12038)this.N_2).N(class091012.y());
            ((class12003)this.N_3).N(0);
            ((class11993)this.N_4).N(1.0f / class091012.E(), 1.0f / class091012.m());
            if ((class11993)this.N_5 != null) {
                ((class11993)this.N_5).N(f, f2);
            }
            if ((class12003)this.N_6 != null) {
                ((class12003)this.N_6).N(class091012.N() - 1);
            }
            if ((class11170)this.N_7 != null) {
                ((class11170)this.N_7).N(class091012.W());
            }
        });
    }

    private static void N() {
    }
}

