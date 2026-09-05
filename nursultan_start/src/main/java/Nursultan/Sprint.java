/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10947
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11385
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11777
 *  Nursultan.class11782
 */
package Nursultan;

import Nursultan.class10947;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11385;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11777;
import Nursultan.class11782;

@class11080(L="Sprint", y=class11072.MOVEMENT, N=class11106.BASE)
public class Sprint
extends class11067 {
    public Object L_0;

    public Sprint() {
        this.m();
        this.L_0 = class11524.N((class11512)this, (String)"ignore-hunger", (boolean)false);
    }

    private void m() {
    }

    @class11782
    public void N(class10947 class109472) {
        this.m();
        class109472.N(((Boolean)((class11507)this.L_0).i()).booleanValue());
    }

    @class11782(y=class11777.AFTER)
    public void N(class11385 class113852) {
        class113852.M(class113852.i());
    }
}

