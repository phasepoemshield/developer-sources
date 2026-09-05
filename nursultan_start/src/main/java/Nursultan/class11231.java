/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.KillEffect
 *  Nursultan.class09321
 *  Nursultan.class09322
 *  Nursultan.class11300
 *  Nursultan.class11507
 *  Nursultan.class11515
 *  Nursultan.class12019
 *  Nursultan.class12030
 *  Nursultan.class12036
 *  Nursultan.class12038
 *  minecraft.class04995
 *  minecraft.class06889
 */
package Nursultan;

import Nursultan.KillEffect;
import Nursultan.class09321;
import Nursultan.class09322;
import Nursultan.class11174;
import Nursultan.class11184;
import Nursultan.class11185;
import Nursultan.class11192;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11232;
import Nursultan.class11265;
import Nursultan.class11300;
import Nursultan.class11507;
import Nursultan.class11515;
import Nursultan.class12019;
import Nursultan.class12030;
import Nursultan.class12036;
import Nursultan.class12038;
import java.util.Set;
import minecraft.class04995;
import minecraft.class06889;

public class class11231
implements class11192<class09321> {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;

    class11231(KillEffect killEffect, class11213 class112132) {
        this.i();
        this.N_5 = killEffect;
        this.N_3 = ((class09322)class11185.E_5).z("u_projection");
        this.N_4 = ((class09322)class11185.E_5).z("u_view");
        this.N_0 = class112132;
        this.N_1 = class11174.N().N(class11204.L().N(((class12036)class12019.N_1).L().N((class12030)class12030.N_0).N()).N((class09322)class11185.E_5).N(4).N()).N(class112132).N(6).N();
        this.N_2 = class11174.N().N(class11204.L().N((class12036)class12019.N_1).N((class09322)class11185.E_5).N(4).N()).N(class112132).N(6).N();
    }

    static {
        class11231.N();
    }

    private void i() {
    }

    private static void N() {
    }

    @Override
    public void execute(class09321 class093212) {
        class06889 class068892 = class093212.y().y();
        float f = class093212.u().N(true);
        class11184 class111842 = ((class11213)this.N_0).M();
        Object object = ((Set)((KillEffect)this.N_5).u_0).iterator();
        while (object.hasNext()) {
            for (class11232 class112322 : ((class11265)object.next()).N()) {
                double d = class04995.u((double)f, (double)((class06889)class112322.y_1).M, (double)((class06889)class112322.y_0).M);
                double d2 = class04995.u((double)f, (double)((class06889)class112322.y_1).B, (double)((class06889)class112322.y_0).B);
                double d3 = class04995.u((double)f, (double)((class06889)class112322.y_1).Z, (double)((class06889)class112322.y_0).Z);
                int n = (Integer)class112322.N_1 - (Integer)class112322.N_2;
                float f2 = Math.min(1.0f, (float)n / 20.0f);
                int n2 = class11300.N((int)((Integer)((class11515)((KillEffect)this.N_5).i_1).i()), (int)((int)(255.0f * f2)));
                class111842.N((float)(d - class068892.M), (float)(d2 - class068892.B), (float)(d3 - class068892.Z)).N(((Float)class112322.N_0).floatValue()).y(n2).y();
            }
        }
        object = (Boolean)((class11507)((KillEffect)this.N_5).i_0).i() != false ? (class11174)this.N_2 : (class11174)this.N_1;
        ((class11174)object).y(class093222 -> {
            ((class12038)this.N_3).N(class093212.i());
            ((class12038)this.N_4).N(class093212.N());
        });
    }
}

