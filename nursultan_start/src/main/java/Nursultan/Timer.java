/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09339
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11782
 */
package Nursultan;

import Nursultan.class09339;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11782;

@class11080(L="Timer", y=class11072.MOVEMENT, N=class11106.BASE)
public class Timer
extends class11067 {
    public Object L_0;

    public Timer() {
        this.s();
        this.L_0 = class11524.N((class11512)this, (String)"timer", (float)1.0f, (float)0.1f, (float)10.0f, (float)0.05f);
    }

    private void s() {
    }

    @class11782
    public void N(class09339 class093392) {
        this.s();
        class093392.N(((Float)((class11504)this.L_0).i()).floatValue());
    }
}

