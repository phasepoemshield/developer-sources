/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.ClickAction
 *  Nursultan.class11142
 *  Nursultan.class11303
 *  Nursultan.class11389
 *  Nursultan.class11791
 *  Nursultan.class11892
 *  Nursultan.class11921
 *  Nursultan.class11938
 *  Nursultan.class11951
 *  Nursultan.class11987
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class05363
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class06145
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07089
 *  minecraft.class07113
 */
package Nursultan;

import Nursultan.ClickAction;
import Nursultan.class11142;
import Nursultan.class11303;
import Nursultan.class11389;
import Nursultan.class11791;
import Nursultan.class11892;
import Nursultan.class11921;
import Nursultan.class11938;
import Nursultan.class11951;
import Nursultan.class11987;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05363;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07089;
import minecraft.class07113;

public class class11552
extends class11142 {
    public Object y_0;
    public boolean y_init;

    public class11552(ClickAction clickAction) {
        super(clickAction, "point-key");
        this.N();
    }

    public void y(class11389 class113892) {
        this.N();
        if (System.currentTimeMillis() - (Long)this.y_0 < 750L) {
            return;
        }
        if (!class11938.z().R()) {
            class11303.y((Object)class11921.N((String)"socket.not-connected").N(class06541.field_1061));
            return;
        }
        class05363 class053632 = ((class03386)((class06202)this.N_0).i_5).s();
        class06889 class068892 = ((class04453)((class06202)this.N_0).T_4).method_5631(class053632.i(), class053632.R()).L(256.0);
        class06889 class068893 = class053632.y();
        class07089 class070892 = class11892.N((class07049)((class04453)((class06202)this.N_0).T_4), (class06889)class068893, (class06889)class068892, (double)256.0, (boolean)true, class11791.B().and(class11791.N()));
        if (class070892 != null && class070892.N() == class07113.field_1331) {
            class07049 class070492 = ((class06145)class070892).L();
            class11938.z().N((class11951)new class11987(class070492.method_23317(), class070492.method_23318(), class070492.method_23321(), class070492.method_5628()));
            this.y_0 = System.currentTimeMillis();
            return;
        }
        class06889 class068894 = class068893.i(class068892);
        class06183 class061832 = ((class03448)((class06202)this.N_0).T_3).N(new class05862(class068893, class068894, class05849.field_17559, class05835.field_1348, (class07049)((class04453)((class06202)this.N_0).T_4)));
        if (class061832.N() == class07113.field_1333) {
            return;
        }
        class06889 class068895 = class061832.y();
        class11938.z().N((class11951)new class11987(class068895.N(), class068895.y(), class068895.L(), -1));
        this.y_0 = System.currentTimeMillis();
    }

    private void N() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = 0L;
        }
    }
}

