/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11128
 *  Nursultan.class11136
 *  Nursultan.class11144
 *  Nursultan.class11153
 *  Nursultan.class11156
 *  Nursultan.class11382
 *  Nursultan.class11385
 *  Nursultan.class11502
 *  Nursultan.class11504
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11517
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11908
 *  minecraft.class04453
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.Sprint;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11128;
import Nursultan.class11136;
import Nursultan.class11144;
import Nursultan.class11153;
import Nursultan.class11156;
import Nursultan.class11382;
import Nursultan.class11385;
import Nursultan.class11502;
import Nursultan.class11504;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11517;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11908;
import java.util.function.Supplier;
import minecraft.class04453;
import minecraft.class06202;

@class11080(L="SprintReset", y=class11072.COMBAT, N=class11106.TOOLS)
public class SprintReset
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public boolean i_init;

    public SprintReset() {
        this.j();
        this.L_0 = new class11156(this, "w-tap", true);
        this.L_1 = new class11128(this, "s-tap", false);
        this.u_0 = new class11136(this, "shift-tap", false);
        this.u_1 = new class11153(this, "no-stop", false);
        this.u_2 = class11524.N((class11512)this, (String)"mode", (class11535[])new class11144[]{(class11156)this.L_0, (class11128)this.L_1, (class11136)this.u_0, (class11153)this.u_1});
        this.u_3 = class11524.N((class11512)this, (String)"chance", (float)100.0f, (float)1.0f, (float)100.0f, (float)1.0f).N((Supplier)class11502.N_0);
        this.u_4 = class11524.N((class11512)this, (String)"ground-only", (boolean)true);
        this.u_5 = (class11504)class11524.N((class11512)this, (String)"delay", (float)1.0f, (float)1.0f, (float)10.0f, (float)1.0f).N((Supplier)class11502.N_3).N(class115362 -> {
            this.j();
            return ((class11144)((class11517)this.u_2).i()).N();
        });
    }

    public int m() {
        this.j();
        return ((Float)((class11504)this.u_5).i()).intValue();
    }

    private void j() {
        if (!this.i_init) {
            this.i_init = true;
            this.i_0 = 0;
            this.i_1 = 0;
            this.i_2 = 0;
        }
    }

    @class11782(y=class11777.AFTER, L={Sprint.class})
    public void N(class11385 class113852) {
        this.j();
        this.i_2 = (Integer)this.i_2 - 1;
        if ((Integer)this.i_1 > 0) {
            this.i_1 = (Integer)this.i_1 - 1;
            return;
        }
        if ((Integer)this.i_0 <= 0) {
            return;
        }
        this.i_0 = (Integer)this.i_0 - 1;
        ((class11144)((class11517)this.u_2).i()).y((Object)class113852);
    }

    @class11782
    public void N(class11382 class113822) {
        this.j();
        if (!((Boolean)((class04453)((class06202)this.y_0).T_4).R_6).booleanValue()) {
            return;
        }
        if (((Boolean)((class11507)this.u_4).i()).booleanValue() && !((class04453)((class06202)this.y_0).T_4).method_24828()) {
            return;
        }
        if ((Integer)this.i_2 <= 0 && Math.random() * 100.0 <= (double)((Float)((class11504)this.u_3).i()).floatValue()) {
            this.i_1 = class11908.N((int)0, (int)2);
            this.i_0 = ((class11144)((class11517)this.u_2).i()).y();
            this.i_2 = 10;
        }
    }
}

