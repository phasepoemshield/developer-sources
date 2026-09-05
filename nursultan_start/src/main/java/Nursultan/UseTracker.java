/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10990
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11396
 *  Nursultan.class11512
 *  Nursultan.class11523
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11559
 *  Nursultan.class11572
 *  Nursultan.class11590
 *  Nursultan.class11782
 */
package Nursultan;

import Nursultan.class10990;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11396;
import Nursultan.class11512;
import Nursultan.class11523;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11559;
import Nursultan.class11572;
import Nursultan.class11590;
import Nursultan.class11782;
import java.util.List;

@class11080(L="UseTracker", y=class11072.MISC, N=class11106.TRACKERS)
public class UseTracker
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;

    public UseTracker() {
        this.m();
        this.L_0 = new class11559(this, "totem-tracker", true);
        this.L_1 = new class11572(this, "food-tracker", true);
        this.L_2 = class11524.y((class11512)this, (String)"trackers", (class11535[])new class11590[]{(class11590)this.L_0, (class11590)this.L_1});
    }

    private void m() {
    }

    @class11782
    public void N(class11396 class113962) {
        this.m();
        ((List)((class11523)this.L_2).i()).forEach(class115902 -> class115902.y((Object)class113962));
    }

    @class11782
    public void N(class10990 class109902) {
        this.m();
        ((List)((class11523)this.L_2).i()).forEach(class115902 -> class115902.y((Object)class109902));
    }
}

