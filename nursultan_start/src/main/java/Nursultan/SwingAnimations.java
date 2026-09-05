/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09354
 *  Nursultan.class10977
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11440
 *  Nursultan.class11442
 *  Nursultan.class11444
 *  Nursultan.class11450
 *  Nursultan.class11452
 *  Nursultan.class11504
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11517
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class07070
 */
package Nursultan;

import Nursultan.AttackAura;
import Nursultan.class09354;
import Nursultan.class10977;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11440;
import Nursultan.class11442;
import Nursultan.class11444;
import Nursultan.class11450;
import Nursultan.class11452;
import Nursultan.class11504;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11517;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11782;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class07070;

@class11080(L="SwingAnimations", y=class11072.VISUAL, N=class11106.WORLD)
public class SwingAnimations
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public Object u_0;
    public Object u_1;

    public SwingAnimations() {
        this.b();
        this.L_0 = new class11440(this, "swing-1", true);
        this.L_1 = new class11452(this, "swing-2", false);
        this.L_2 = new class11444(this, "swing-3", false);
        this.L_3 = new class11450(this, "swing-4", false);
        this.L_4 = class11524.N((class11512)this, (String)"swing", (class11535[])new class11442[]{(class11440)this.L_0, (class11452)this.L_1, (class11444)this.L_2, (class11450)this.L_3});
        this.L_5 = (class11504)class11524.N((class11512)this, (String)"swing-strength", (float)8.0f, (float)1.0f, (float)10.0f, (float)1.0f).N(class115362 -> {
            this.b();
            return ((class11442)((class11517)this.L_4).i()).N();
        });
        this.L_6 = (class11504)class11524.N((class11512)this, (String)"spin-smoothness", (float)8.0f, (float)3.0f, (float)10.0f, (float)1.0f).N(class115362 -> {
            this.b();
            return ((class11442)((class11517)this.L_4).i()).L();
        });
        this.u_0 = (class11507)class11524.N((class11512)this, (String)"spinning", (boolean)false).N(class115362 -> {
            this.b();
            return ((class11452)this.L_1).U();
        });
        this.u_1 = class11524.N((class11512)this, (String)"only-while-have-target", (boolean)false);
    }

    private void b() {
    }

    public class11507 m() {
        this.b();
        return (class11507)this.u_0;
    }

    @class11782
    public void N(class10977 class109772) {
        this.b();
        class07070 class070702 = class109772.i();
        if (AttackAura.y((Boolean)((class11507)this.u_1).i()) || ((class04453)((class06202)this.y_0).T_4).method_6068() != class070702) {
            return;
        }
        ((class11442)((class11517)this.L_4).i()).N(class109772.u(), class070702 == class07070.field_6182 ? -1 : 1, class04995.m((double)(class109772.R() * 1.5707964f * 2.0f)), ((Float)((class11504)this.L_6).i()).floatValue(), ((Float)((class11504)this.L_5).i()).floatValue() * 10.0f, class109772.R(), class109772.L());
        class109772.N();
    }

    @class11782
    public void N(class09354 class093542) {
        this.b();
        if (AttackAura.y((Boolean)((class11507)this.u_1).i())) {
            return;
        }
        class093542.N(((Float)((class11504)this.L_6).i()).intValue());
    }
}

