/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09321
 *  Nursultan.class10965
 *  Nursultan.class10996
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11174
 *  Nursultan.class11190
 *  Nursultan.class11207
 *  Nursultan.class11213
 *  Nursultan.class11382
 *  Nursultan.class11504
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11515
 *  Nursultan.class11524
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11884
 *  Nursultan.class11910
 *  Nursultan.class11938
 *  minecraft.class00381
 *  minecraft.class00535
 *  minecraft.class00541
 *  minecraft.class00559
 *  minecraft.class00734
 *  minecraft.class01635
 *  minecraft.class02275
 *  minecraft.class03448
 *  minecraft.class04187
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07816
 *  minecraft.class07839
 *  minecraft.class07848
 *  org.joml.Matrix4fStack
 */
package Nursultan;

import Nursultan.class09321;
import Nursultan.class10965;
import Nursultan.class10996;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11174;
import Nursultan.class11190;
import Nursultan.class11207;
import Nursultan.class11213;
import Nursultan.class11382;
import Nursultan.class11504;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11524;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11884;
import Nursultan.class11910;
import Nursultan.class11938;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import minecraft.class00381;
import minecraft.class00535;
import minecraft.class00541;
import minecraft.class00559;
import minecraft.class00734;
import minecraft.class01635;
import minecraft.class02275;
import minecraft.class03448;
import minecraft.class04187;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07816;
import minecraft.class07839;
import minecraft.class07848;
import org.joml.Matrix4fStack;

@class11080(L="Blink", y=class11072.PLAYER, N=class11106.BASE)
public class Blink
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public Object L_7;
    public boolean L_init;

    private void P() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_7 = 0;
        }
    }

    public Blink() {
        this.P();
        this.L_0 = class11524.N((class11512)this, (String)"release-packets-on-hit", (boolean)true);
        this.L_1 = class11524.N((class11512)this, (String)"render-server-position", (boolean)true);
        this.L_2 = (class11515)class11524.N((class11512)this, (String)"render-color", (int)-11104513).N(class115362 -> {
            this.P();
            return (Boolean)((class11507)this.L_1).i();
        });
        this.L_3 = (class11507)class11524.N((class11512)this, (String)"auto-release-packets", (boolean)true).N_6((class115362, bl) -> {
            this.P();
            this.L_7 = class11938.j().y();
        });
        this.L_4 = (class11504)class11524.N((class11512)this, (String)"release-packets-ticks", (float)20.0f, (float)5.0f, (float)100.0f, (float)5.0f).N(class115362 -> {
            this.P();
            return (Boolean)((class11507)this.L_3).i();
        });
        this.L_5 = new LinkedList();
    }

    public boolean Z() {
        this.P();
        if ((class03448)((class06202)this.y_0).T_3 == null) {
            return false;
        }
        ((List)this.L_5).clear();
        this.j();
        this.L_7 = class11938.j().y();
        return super.Z();
    }

    public boolean i() {
        this.t();
        return super.i();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void t() {
        this.P();
        List list = (List)this.L_5;
        synchronized (list) {
            if ((class04453)((class06202)this.y_0).T_4 == null) {
                ((List)this.L_5).clear();
                return;
            }
            Iterator iterator = ((List)this.L_5).iterator();
            while (iterator.hasNext()) {
                class11910.N((class00381)((class00381)iterator.next()));
            }
            ((List)this.L_5).clear();
            this.L_7 = class11938.j().y();
            this.j();
        }
    }

    private void j() {
        this.P();
        if ((class04453)((class06202)this.y_0).T_4 == null) {
            return;
        }
        class00734 class007342 = ((class04453)((class06202)this.y_0).T_4).method_5829();
        this.L_6 = class11884.N((class00734)class007342);
    }

    @class11782
    public void N(class09321 class093212) {
        this.P();
        if (!((Boolean)((class11507)this.L_1).i()).booleanValue() || (class11884)this.L_6 == null) {
            return;
        }
        class11207.N((Matrix4fStack)class093212.R(), (class11213)((class11174)class11190.N_2).u(), (class11213)((class11174)class11190.y_3).u(), (class06889)class093212.y().y(), (class11884)((class11884)this.L_6), (int)((Integer)((class11515)this.L_2).i()));
    }

    @class11782
    public void N(class10996 class109962) {
        this.P();
        if (!((Boolean)((class11507)this.L_3).i()).booleanValue()) {
            return;
        }
        if (class11938.j().y() - (Integer)this.L_7 > ((Float)((class11504)this.L_4).i()).intValue()) {
            this.t();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @class11782(y=class11777.AFTER_ALL)
    public void N(class10965 class109652) {
        this.P();
        if (class109652.y()) {
            return;
        }
        class00381 var2 = class109652.L();
        if (var2 instanceof class00535 || var2 instanceof class07848 || var2 instanceof class07816 || var2 instanceof class04187 || var2 instanceof class00541 || var2 instanceof class00559 || var2 instanceof class02275 || var2 instanceof class01635 || var2 instanceof class07839) {
            this.t();
            return;
        }
        class109652.N();
        List list = (List)this.L_5;
        synchronized (list) {
            ((List)this.L_5).add(var2);
        }
    }

    @class11782
    public void N(class11382 class113822) {
        this.P();
        if (!((Boolean)((class11507)this.L_0).i()).booleanValue()) {
            return;
        }
        this.t();
    }
}

