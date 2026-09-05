/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11097
 *  minecraft.class04995
 */
package Nursultan;

import Nursultan.class09139;
import Nursultan.class09143;
import Nursultan.class11097;
import minecraft.class04995;

public class class09125 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;
    public boolean N_init;

    public class09125() {
        this.i();
        this.N_5 = Float.valueOf(1.0f);
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0L;
            this.N_1 = 0L;
            this.N_2 = 0L;
            this.N_3 = 0L;
            this.N_4 = Float.valueOf(0.0f);
            this.N_5 = Float.valueOf(0.0f);
            this.N_6 = false;
            this.N_7 = false;
        }
    }

    private void y() {
        this.N_0 = 0L;
        this.N_4 = Float.valueOf(0.0f);
        this.N_6 = false;
        this.N_7 = false;
    }

    private void N(long l, float f) {
        this.N_0 = l;
        this.N_4 = Float.valueOf(Math.max(0.001f, f));
        this.N_6 = true;
        this.N_7 = false;
    }

    private float N(double d) {
        return (float)((double)Math.round(d * 1000000.0) / 1000000.0);
    }

    public void N() {
        this.N_0 = 0L;
        this.N_1 = 0L;
        this.N_2 = 0L;
        this.N_3 = 0L;
        this.N_4 = Float.valueOf(0.0f);
        this.N_5 = Float.valueOf(1.0f);
        this.N_6 = false;
        this.N_7 = false;
    }

    private float N(class11097 class110972) {
        return class04995.N((float)(class110972.U() * class110972.U() + class110972.L() * class110972.L() * 2.15f));
    }

    private void N(long l) {
        this.N_5 = Float.valueOf(this.N(class09139.N(1.7234382842983, 2.320309329)));
        this.N_1 = l;
        this.N_2 = l + (long)class09139.N(42.0, 86.0);
        this.N_3 = l + (long)class09139.N(260.0, 620.0);
        this.N_7 = true;
    }

    public class09143 N(class11097 class110972, float f, boolean bl) {
        long l = System.currentTimeMillis();
        float f2 = this.N(class110972);
        boolean bl2 = !bl && (class110972.M() || class110972.B() || !class110972.z()) && f2 > f * 4.0f;
        boolean bl3 = bl2;
        if (!bl2) {
            this.y();
            return class09143.y();
        }
        if (!((Boolean)this.N_6).booleanValue() || f2 > ((Float)this.N_4).floatValue() * 1.24f) {
            this.N(l, f2);
        }
        float f3 = 1.0f - class04995.N((float)(f2 / Math.max(f, ((Float)this.N_4).floatValue())), (float)0.0f, (float)1.0f);
        if (!((Boolean)this.N_7).booleanValue() && l >= (Long)this.N_3 && f3 > class09139.N((double)0.52f, (double)0.64f)) {
            this.N(l);
        }
        if (l >= (Long)this.N_2) {
            return class09143.y();
        }
        float f4 = class04995.N((float)((float)(l - (Long)this.N_1) / (float)Math.max(1L, (Long)this.N_2 - (Long)this.N_1)), (float)0.0f, (float)1.0f);
        float f5 = 0.32f + (float)Math.pow(1.0f - f4, 0.36f) * 0.68f;
        return new class09143(true, ((Float)this.N_5).floatValue(), f5);
    }
}

