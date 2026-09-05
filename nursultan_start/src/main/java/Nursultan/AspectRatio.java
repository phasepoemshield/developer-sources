/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11535;
import minecraft.class06202;

@class11080(L="AspectRatio", y=class11072.VISUAL, N=class11106.SCREEN)
public class AspectRatio
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;

    public AspectRatio() {
        this.b();
        this.L_0 = new class11535("_16_9", true);
        this.L_1 = new class11535("_16_10", false);
        this.L_2 = new class11535("_21_9", false);
        this.L_3 = new class11535("_4_3", false);
        this.L_4 = new class11535("custom", false);
        this.L_5 = class11524.N((class11512)this, (String)"aspect-ratio", (class11535[])new class11535[]{(class11535)this.L_0, (class11535)this.L_1, (class11535)this.L_2, (class11535)this.L_3, (class11535)this.L_4});
        this.L_6 = (class11504)class11524.N((class11512)this, (String)"custom-ratio", (float)1.0f, (float)0.5f, (float)2.0f, (float)0.01f).N(class115362 -> {
            this.b();
            return ((class11535)this.L_4).U();
        });
    }

    private void b() {
    }

    public float N(float f) {
        this.b();
        float f2 = ((class06202)this.y_0).Nt().U();
        float f3 = ((class06202)this.y_0).Nt().E();
        if (!this.U()) {
            return f;
        }
        if (((class11535)this.L_0).U()) {
            return 1.7777778f;
        }
        if (((class11535)this.L_1).U()) {
            return 1.6f;
        }
        if (((class11535)this.L_2).U()) {
            return 2.3888888f;
        }
        if (((class11535)this.L_3).U()) {
            return 1.3f;
        }
        if (((class11535)this.L_4).U()) {
            return f2 / ((Float)((class11504)this.L_6).i()).floatValue() / f3;
        }
        return f;
    }
}

