/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09308
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

import Nursultan.class09308;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11782;

@class11080(L="Gamma", y=class11072.VISUAL, N=class11106.WORLD)
public class Gamma
extends class11067 {
    public Object L_0;

    public Gamma() {
        this.s();
        this.L_0 = class11524.N((class11512)this, (String)"gamma", (float)5.0f, (float)1.0f, (float)10.0f, (float)0.1f);
    }

    private void s() {
    }

    @class11782
    public void N(class09308 class093082) {
        this.s();
        class093082.y(((Float)((class11504)this.L_0).i()).floatValue() / 10.0f);
    }
}

