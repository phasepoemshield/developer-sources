/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09343
 *  Nursultan.class10967
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11281
 *  Nursultan.class11467
 *  Nursultan.class11494
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11517
 *  Nursultan.class11524
 *  Nursultan.class11525
 *  Nursultan.class11535
 *  Nursultan.class11671
 *  Nursultan.class11673
 *  Nursultan.class11676
 *  Nursultan.class11702
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  minecraft.class00388
 *  minecraft.class03443
 *  minecraft.class04439
 *  minecraft.class04453
 *  minecraft.class05096
 *  minecraft.class06026
 *  minecraft.class06202
 *  minecraft.class06937
 *  minecraft.class07490
 *  minecraft.class07510
 *  minecraft.class08036
 *  org.apache.commons.lang3.RandomUtils
 */
package Nursultan;

import Nursultan.class09343;
import Nursultan.class10967;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11281;
import Nursultan.class11467;
import Nursultan.class11494;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11517;
import Nursultan.class11524;
import Nursultan.class11525;
import Nursultan.class11535;
import Nursultan.class11671;
import Nursultan.class11673;
import Nursultan.class11676;
import Nursultan.class11702;
import Nursultan.class11777;
import Nursultan.class11782;
import java.util.stream.IntStream;
import minecraft.class00388;
import minecraft.class03443;
import minecraft.class04439;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class06026;
import minecraft.class06202;
import minecraft.class06937;
import minecraft.class07490;
import minecraft.class07510;
import minecraft.class08036;
import org.apache.commons.lang3.RandomUtils;

@class11080(L="ChestStealer", y=class11072.PLAYER, N=class11106.BASE)
public class ChestStealer
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
    public Object u_2;
    public Object u_3;
    public boolean u_init;

    private void P() {
        this.n();
        this.u_2 = RandomUtils.insecure().randomInt((int)((class11494)((class11525)this.L_6).i()).N(), (int)((class11494)((class11525)this.L_6).i()).L());
    }

    public ChestStealer() {
        this.n();
        this.L_0 = new class11671("normal", true);
        this.L_1 = new class11702("reverse");
        this.L_2 = new class11673("shuffle");
        this.L_3 = class11524.N((class11512)this, (String)"loot-type", (class11535[])new class11676[]{(class11671)this.L_0, (class11702)this.L_1, (class11673)this.L_2});
        this.L_4 = class11524.N((class11512)this, (String)"auto-close", (boolean)true);
        this.L_5 = class11524.N((class11512)this, (String)"ignore-server-menus", (boolean)false);
        this.L_6 = class11524.N((class11512)this, (String)"delay", (class11494)new class11494(0.0f, 600.0f), (class11494)new class11494(100.0f, 300.0f), (float)10.0f);
        this.u_0 = new class11467();
    }

    private void s() {
        this.n();
        this.u_1 = null;
        this.u_2 = 0;
        this.u_3 = 0;
    }

    private void n() {
        if (!this.u_init) {
            this.u_init = true;
            this.u_2 = 0;
            this.u_3 = 0;
        }
    }

    public void y() {
        this.s();
        super.y();
    }

    private boolean N(class06026 class060262) {
        class04439 class044392 = class060262.method_25440().method_10851();
        return !(class044392 instanceof class00388) || !((class00388)class044392).y().startsWith("container.");
    }

    private void N(class07490 class074902) {
        this.n();
        int n = class074902.E().method_5439();
        if ((int[])this.u_1 == null || ((int[])this.u_1).length != n) {
            this.R(n);
        }
        for (int n2 : (int[])this.u_1) {
            class06937 class069372 = class074902.L(n2);
            if (!class069372.R() || !((class11467)this.u_0).N((long)((Integer)this.u_2).intValue())) continue;
            this.N(class074902, class069372);
            this.P();
            this.R(n);
            ((class11467)this.u_0).N();
            break;
        }
    }

    @class11782
    public void N(class09343 class093432) {
        this.n();
        this.u_3 = 0;
    }

    private boolean N(int n2, class07490 class074902) {
        this.n();
        return IntStream.range(0, n2).noneMatch(n -> class074902.L(n).R()) && (Integer)this.u_3 > 40 && ((class11467)this.u_0).N(100L);
    }

    @class11782(y=class11777.BEFORE_ALL)
    public void N(class10967 class109672) {
        this.n();
        class05096 class050962 = (class05096)((class06202)this.y_0).v_3;
        if (!(class050962 instanceof class06026)) {
            if ((int[])this.u_1 != null) {
                this.s();
            }
            return;
        }
        class06026 class060262 = (class06026)class050962;
        if (((Boolean)((class11507)this.L_5).i()).booleanValue() && this.N(class060262)) {
            if ((int[])this.u_1 != null) {
                this.s();
            }
            return;
        }
        class050962 = (class07490)class060262.E();
        this.N((class07490)class050962);
        if (((Boolean)((class11507)this.L_4).i()).booleanValue() && (class11281.N() || this.N(class050962.E().method_5439(), (class07490)class050962))) {
            ((class04453)((class06202)this.y_0).T_4).method_7346();
            this.s();
            return;
        }
        this.u_3 = (Integer)this.u_3 + 1;
    }

    private void N(class07490 class074902, class06937 class069372) {
        ((class03443)((class06202)this.y_0).T_2).N(class074902.b, class069372.u, 1, class07510.field_7794, (class08036)((class04453)((class06202)this.y_0).T_4));
    }

    private void R(int n) {
        this.n();
        this.u_1 = ((class11676)((class11517)this.L_3).i()).N(n);
    }
}

