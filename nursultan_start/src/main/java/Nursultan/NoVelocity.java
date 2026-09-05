/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10990
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11138
 *  Nursultan.class11146
 *  Nursultan.class11385
 *  Nursultan.class11387
 *  Nursultan.class11512
 *  Nursultan.class11517
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11787
 *  Nursultan.class11801
 */
package Nursultan;

import Nursultan.SprintReset;
import Nursultan.class10990;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11138;
import Nursultan.class11146;
import Nursultan.class11385;
import Nursultan.class11387;
import Nursultan.class11512;
import Nursultan.class11517;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11787;
import Nursultan.class11801;

@class11080(L="NoVelocity", y=class11072.COMBAT, N=class11106.FIGHTING)
public class NoVelocity
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;

    private void P() {
    }

    public NoVelocity() {
        this.P();
        this.L_0 = new class11146("jump-reset", true);
        this.L_1 = new class11138("vanilla", false);
        this.L_2 = class11524.N((class11512)this, (String)"mode", (class11535[])new class11787[]{(class11146)this.L_0, (class11138)this.L_1});
        for (class11535 class115352 : ((class11517)this.L_2).L()) {
            if (!(class115352 instanceof class11801)) continue;
            ((class11801)class115352).N((Object)this);
        }
    }

    @class11782(y=class11777.AFTER, L={SprintReset.class})
    public void N(class11385 class113852) {
        this.P();
        ((class11787)((class11517)this.L_2).i()).y((Object)class113852);
    }

    @class11782
    public void N(class11387 class113872) {
        this.P();
        ((class11787)((class11517)this.L_2).i()).y((Object)class113872);
    }

    @class11782
    public void N(class10990 class109902) {
        this.P();
        ((class11787)((class11517)this.L_2).i()).y((Object)class109902);
    }
}

