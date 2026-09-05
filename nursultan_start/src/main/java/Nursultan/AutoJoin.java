/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10990
 *  Nursultan.class10996
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11112
 *  Nursultan.class11127
 *  Nursultan.class11158
 *  Nursultan.class11512
 *  Nursultan.class11517
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  Nursultan.class11801
 */
package Nursultan;

import Nursultan.class10990;
import Nursultan.class10996;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11112;
import Nursultan.class11127;
import Nursultan.class11158;
import Nursultan.class11512;
import Nursultan.class11517;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11782;
import Nursultan.class11801;

@class11080(L="AutoJoin", y=class11072.PLAYER, N=class11106.AUTO)
public class AutoJoin
extends class11067 {
    public Object L_0;

    public AutoJoin() {
        this.b();
        this.L_0 = class11524.N((class11512)this, (String)"mode", (class11535[])new class11127[]{new class11112(this, "spooky-time-duels", true), new class11158(this, "really-world", false)});
        ((class11517)this.L_0).L().forEach(class111272 -> {
            if (class111272 instanceof class11801) {
                ((class11801)class111272).N((Object)this);
            }
        });
    }

    private void b() {
    }

    public void y() {
        this.b();
        ((class11517)this.L_0).L().forEach(class11127::N);
    }

    @class11782
    public void N(class10990 class109902) {
        this.b();
        ((class11127)((class11517)this.L_0).i()).y((Object)class109902);
    }

    @class11782
    public void N(class10996 class109962) {
        this.b();
        ((class11127)((class11517)this.L_0).i()).y((Object)class109962);
    }
}

