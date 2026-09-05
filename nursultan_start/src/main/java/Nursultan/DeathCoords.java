/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10990
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11287
 *  Nursultan.class11288
 *  Nursultan.class11303
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11782
 *  Nursultan.class11910
 *  Nursultan.class11921
 *  Nursultan.class11938
 *  Nursultan.class12020
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class02675
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class05216
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06889
 */
package Nursultan;

import Nursultan.class10990;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11287;
import Nursultan.class11288;
import Nursultan.class11303;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11782;
import Nursultan.class11910;
import Nursultan.class11921;
import Nursultan.class11938;
import Nursultan.class12020;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class02675;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06889;

@class11080(L="DeathCoords", y=class11072.MISC, N=class11106.BASE)
public class DeathCoords
extends class11067 {
    public Object L_0;

    public DeathCoords() {
        this.b();
        this.L_0 = class11524.N((class11512)this, (String)"save-waypoint", (boolean)false);
    }

    private void b() {
    }

    @class11782
    public void N(class10990 class109902) {
        this.b();
        class00381 var3 = class109902.u();
        if (!(var3 instanceof class02675)) {
            return;
        }
        class02675 class026752 = (class02675)var3;
        if (((class03448)((class06202)this.y_0).T_3).method_8469(class026752.N()) != (class04453)((class06202)this.y_0).T_4) {
            return;
        }
        class06889 class068892 = ((class04453)((class06202)this.y_0).T_4).method_73189();
        int n = (int)class068892.N();
        int n2 = (int)class068892.y();
        int n3 = (int)class068892.L();
        class05216 class052162 = class11921.N((String)"death-message", (Object[])new Object[]{n, n2, n3}).N(class06541.field_1080);
        class11303.N((class11287)new class11288((class11067)this), (class00392)class052162);
        if (!((Boolean)((class11507)this.L_0).i()).booleanValue()) {
            return;
        }
        class11938.E().N(class12020.N((String)"death-waypoint"), new class06889((double)n, (double)n2, (double)n3), class11910.L());
    }
}

