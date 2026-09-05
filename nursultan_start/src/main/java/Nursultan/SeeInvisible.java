/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10986
 *  Nursultan.class10988
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11300
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11782
 *  minecraft.class00681
 */
package Nursultan;

import Nursultan.class10986;
import Nursultan.class10988;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11300;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11782;
import minecraft.class00681;

@class11080(L="SeeInvisible", y=class11072.VISUAL, N=class11106.WORLD)
public class SeeInvisible
extends class11067 {
    public Object L_0;

    public SeeInvisible() {
        this.m();
        this.L_0 = class11524.N((class11512)this, (String)"opacity", (float)0.5f, (float)0.1f, (float)1.0f, (float)0.1f);
    }

    private void m() {
    }

    @class11782
    public void N(class10986 class109862) {
        this.m();
        class109862.y(class11300.y((int)255, (int)((int)(255.0f * ((Float)((class11504)this.L_0).i()).floatValue()))));
    }

    @class11782
    public void N(class10988 class109882) {
        if (class109882.N() instanceof class00681) {
            return;
        }
        class109882.N(false);
    }
}

