/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09181
 *  Nursultan.class09222
 *  Nursultan.class09378
 *  Nursultan.class11364
 *  Nursultan.class11389
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11515
 *  Nursultan.class11517
 *  Nursultan.class11524
 *  Nursultan.class11527
 *  Nursultan.class11535
 *  Nursultan.class11536
 *  Nursultan.class11753
 *  Nursultan.class11777
 *  Nursultan.class11782
 */
package Nursultan;

import Nursultan.class09181;
import Nursultan.class09222;
import Nursultan.class09378;
import Nursultan.class11364;
import Nursultan.class11389;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11517;
import Nursultan.class11524;
import Nursultan.class11527;
import Nursultan.class11535;
import Nursultan.class11536;
import Nursultan.class11753;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11938;
import Nursultan.class11994;
import Nursultan.class11999;
import Nursultan.class12002;
import Nursultan.class12018;

public class class12023
extends class11512 {
    public Object N_0;
    public Object N_1;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public static Object L_0;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public Object i_3;

    public void L() {
        class11535 class115352;
        this.R();
        class11535 class115353 = class115352 = class11938.P().N() == class11999.RU ? (class11535)this.i_0 : (class11535)this.i_1;
        if (((class11517)this.y_3).i() != class115352) {
            ((class11517)this.y_3).y(class115352);
        }
    }

    public class12023() {
        this.R();
        this.i_0 = new class11535("ru", false);
        this.i_1 = new class11535("en", true);
        this.i_2 = new class11994("scale_100", true, 1.0f);
        this.i_3 = new class11994("scale_150", false, 1.5f);
        this.N_0 = new class11994("scale_200", false, 2.0f);
        this.N_1 = new class11994("scale_100", true, 1.0f);
        this.y_0 = new class11994("scale_150", false, 1.5f);
        this.y_1 = new class11994("scale_200", false, 2.0f);
        this.y_2 = (class11527)class11524.N((class11512)this, (String)"bind", (class12002)class12002.RIGHT_SHIFT).N_6(this::N);
        this.y_3 = (class11517)class11524.N((class11512)this, (String)"language", (class11535[])new class11535[]{(class11535)this.i_0, (class11535)this.i_1}).N_6(this::N);
        this.u_0 = (class11517)class11524.N((class11512)this, (String)"menu-scale", (class11535[])new class11994[]{(class11994)((Object)this.i_2), (class11994)((Object)this.i_3), (class11994)((Object)this.N_0)}).N_6(this::y);
        this.u_1 = (class11517)class11524.N((class11512)this, (String)"hud-scale", (class11535[])new class11994[]{(class11994)((Object)this.N_1), (class11994)((Object)this.y_0), (class11994)((Object)this.y_1)}).N_6(this::N);
        this.u_2 = (class11515)class11524.N((class11512)this, (String)"accent", (int)-7623425).y(true).N(false).N_6(this::N);
        this.u_3 = (class11507)class11524.N((class11512)this, (String)"descriptions", (boolean)true).N_6((class115362, bl) -> this.B());
        this.u_4 = (class11507)class11524.N((class11512)this, (String)"auto-save-preset", (boolean)true).N_6((class115362, bl) -> this.B());
        class11938.L().y((Object)this);
    }

    static {
        class12023.i();
    }

    private void B() {
        class11938.L().L((Object)class11364.N((class09378)class09378.CLIENT_SETTINGS));
    }

    private static void i() {
        L_0 = "menu.setting";
    }

    private void y(class11536<class11994> class115362, class11994 class119942) {
        class09222.N((float)class119942.N());
        this.B();
    }

    public boolean y() {
        this.R();
        return (Boolean)((class11507)this.u_3).i();
    }

    private void N(class11536<class11994> class115362, class11994 class119942) {
        class11753.N((float)class119942.N());
        this.B();
    }

    public boolean N() {
        this.R();
        return (Boolean)((class11507)this.u_4).i();
    }

    private void N(class11536<class11535> class115362, class11535 class115352) {
        this.R();
        if (((class11535)this.i_0).U()) {
            class11938.P().N(class11999.RU);
        } else {
            class11938.P().N(class11999.EN);
        }
        this.B();
    }

    private void N(class11536<Integer> class115362, Integer n) {
        class09181.N((int)n);
        this.B();
    }

    public class12018 N_7(String string) {
        return new class12018("menu.setting").N(string);
    }

    private void N(class11536<class12002> class115362, class12002 class120022) {
        this.R();
        if (class120022.y() || class120022 == class12002.MOUSE_1) {
            ((class11527)this.y_2).N((Object)class12002.RIGHT_SHIFT);
            return;
        }
        this.B();
    }

    @class11782(y=class11777.BEFORE, L={class09222.class}, u=true)
    public void N(class11389 class113892) {
        this.R();
        if (((class11527)this.y_2).N(class113892)) {
            class09222.N();
            class113892.N();
        }
    }

    private void R() {
    }
}

