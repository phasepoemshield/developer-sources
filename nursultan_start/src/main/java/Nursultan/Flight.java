/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10892
 *  Nursultan.class10925
 *  Nursultan.class10931
 *  Nursultan.class10990
 *  Nursultan.class10996
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11370
 *  Nursultan.class11385
 *  Nursultan.class11512
 *  Nursultan.class11517
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  Nursultan.class11801
 *  Nursultan.class11807
 */
package Nursultan;

import Nursultan.class10892;
import Nursultan.class10925;
import Nursultan.class10931;
import Nursultan.class10990;
import Nursultan.class10996;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11370;
import Nursultan.class11385;
import Nursultan.class11512;
import Nursultan.class11517;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11782;
import Nursultan.class11801;
import Nursultan.class11807;

@class11080(L="Flight", y=class11072.MOVEMENT, N=class11106.BASE)
public class Flight
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;

    public Flight() {
        this.m();
        this.L_0 = new class10931(this, "multi-jump", true);
        this.L_1 = new class10892(this, "vanilla", false);
        this.L_2 = new class10925(this, "motion", false);
        this.L_3 = class11524.N((class11512)this, (String)"mode", (class11535[])new class11807[]{(class11807)this.L_0, (class11807)this.L_1, (class11807)this.L_2});
        for (class11535 class115352 : ((class11517)this.L_3).L()) {
            if (!(class115352 instanceof class11801)) continue;
            ((class11801)class115352).N((Object)this);
        }
    }

    private void m() {
    }

    @class11782
    public void N(class11385 class113852) {
        this.m();
        ((class11807)((class11517)this.L_3).i()).y((Object)class113852);
    }

    @class11782
    public void N(class10990 class109902) {
        this.m();
        ((class11807)((class11517)this.L_3).i()).y((Object)class109902);
    }

    @class11782
    public void N(class11370 class113702) {
        this.m();
        ((class11807)((class11517)this.L_3).i()).y((Object)class113702);
    }

    @class11782
    public void N(class10996 class109962) {
        this.m();
        ((class11807)((class11517)this.L_3).i()).y((Object)class109962);
    }
}

