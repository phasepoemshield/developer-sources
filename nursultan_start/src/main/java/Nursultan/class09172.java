/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09139
 *  Nursultan.class09141
 *  Nursultan.class11097
 *  minecraft.class04995
 */
package Nursultan;

import Nursultan.class09139;
import Nursultan.class09141;
import Nursultan.class11097;
import minecraft.class04995;

public class class09172 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public boolean y_init;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public boolean L_init;

    private void M() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = 0L;
            this.y_1 = 0L;
        }
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0L;
            this.N_1 = Float.valueOf(0.0f);
            this.N_2 = Float.valueOf(0.0f);
            this.N_3 = Float.valueOf(0.0f);
            this.N_4 = Float.valueOf(0.0f);
            this.N_5 = Float.valueOf(0.0f);
        }
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = Float.valueOf(0.0f);
            this.L_1 = Float.valueOf(0.0f);
            this.L_2 = false;
            this.L_3 = false;
        }
    }

    public class09172() {
        this.M();
        this.N_1 = Float.valueOf(11.0f);
        this.N_2 = Float.valueOf(1.0f);
        this.N_3 = Float.valueOf(1.0f);
        this.N_4 = Float.valueOf(0.55f);
        this.N_5 = Float.valueOf(0.42f);
    }

    private boolean y(class11097 class110972, boolean bl, boolean bl2, boolean bl3, long l) {
        if (class110972.B() || bl3 && l >= 500L) {
            return false;
        }
        if (bl2) {
            boolean bl4 = l >= 18L && l <= 98L;
            return bl4 && (class110972.U() >= 2.2f || class110972.L() >= 1.1f || !class110972.z()) && Math.random() < 0.38;
        }
        if (class110972.M() && l >= 32L) {
            return Math.random() < 0.24;
        }
        if (class110972.z() && class110972.U() < ((Float)this.N_1).floatValue() && class110972.L() < 3.2f) {
            return class110972.U() <= 4.8f && l >= 70L && Math.random() < 0.18;
        }
        float f = class110972.z() ? ((Float)this.N_1).floatValue() * 0.86f : Math.max(4.4f, ((Float)this.N_1).floatValue() * 0.58f);
        boolean bl5 = class110972.U() >= f;
        boolean bl6 = !class110972.z() && class110972.U() >= 4.8f;
        boolean bl7 = bl3 && bl && (class110972.U() >= 3.4f || class110972.L() >= 1.8f);
        return bl5 || bl6 || bl7;
    }

    public void N() {
        this.y_0 = 0L;
        this.y_1 = 0L;
        this.N_0 = 0L;
        this.N_1 = Float.valueOf(class09139.N((double)8.5, (double)14.5));
        this.N_2 = Float.valueOf(1.0f);
        this.N_3 = Float.valueOf(1.0f);
        this.N_4 = Float.valueOf(0.55f);
        this.N_5 = Float.valueOf(0.42f);
        this.L_0 = Float.valueOf(0.0f);
        this.L_1 = Float.valueOf(0.0f);
        this.L_2 = false;
        this.L_3 = false;
    }

    private void N(long l, class11097 class110972, boolean bl, boolean bl2) {
        float f = class110972.U();
        boolean bl3 = class110972.M() || f >= 14.0f || !class110972.z() && f >= 8.0f;
        this.N_2 = Float.valueOf(class09139.N((double)(bl3 ? 1.48 : 1.24), (double)(bl3 ? 2.36 : 1.82)));
        this.N_3 = Float.valueOf(class09139.N((double)(bl2 && bl ? 1.12 : 1.02), (double)(bl3 ? 1.46 : 1.28)));
        this.N_4 = Float.valueOf(class09139.N((double)(bl3 ? 0.52 : 0.38), (double)(bl3 ? 0.86 : 0.68)));
        this.N_5 = Float.valueOf(class09139.N((double)0.24, (double)(bl3 ? 0.52 : 0.42)));
        boolean bl4 = class110972.M() && f <= 12.0f || class110972.z() && f <= 5.6f || Math.random() < 0.18;
        this.L_2 = bl4;
        boolean bl5 = bl4;
        if (((Boolean)this.L_2).booleanValue()) {
            float f2 = Math.random() > 0.5 ? 1.0f : -1.0f;
            this.L_0 = Float.valueOf(f2 * class09139.N((double)(bl3 ? 2.2 : 1.25), (double)(bl3 ? 5.4 : 3.6)));
            this.L_1 = Float.valueOf(class09139.N((double)(bl3 ? -1.75 : -0.95), (double)(bl3 ? 1.75 : 0.95)));
            this.N_2 = Float.valueOf(Math.max(((Float)this.N_2).floatValue(), class09139.N((double)1.74, (double)2.42)));
            this.N_3 = Float.valueOf(Math.max(((Float)this.N_3).floatValue(), class09139.N((double)1.18, (double)1.52)));
            this.N_4 = Float.valueOf(Math.max(((Float)this.N_4).floatValue(), class09139.N((double)0.62, (double)0.9)));
            this.N_5 = Float.valueOf(Math.max(((Float)this.N_5).floatValue(), class09139.N((double)0.34, (double)0.58)));
        } else {
            this.L_0 = Float.valueOf(0.0f);
            this.L_1 = Float.valueOf(0.0f);
        }
        this.y_1 = l;
        this.N_0 = l + (long)class09139.N((double)((Boolean)this.L_2 != false ? 120.0 : 72.0), (double)((Boolean)this.L_2 != false ? 230.0 : (bl3 ? 150.0 : 126.0)));
        this.y_0 = l + (long)class09139.N((double)((Boolean)this.L_2 != false ? 260.0 : 340.0), (double)((Boolean)this.L_2 != false ? 760.0 : (bl3 ? 880.0 : 1120.0)));
        this.N_1 = Float.valueOf(class09139.N((double)4.8, (double)(bl3 ? 12.5 : 9.8)));
        this.L_3 = true;
    }

    public class09141 N(class11097 class110972, boolean bl, boolean bl2, boolean bl3, long l) {
        long l2 = System.currentTimeMillis();
        boolean bl4 = l >= 500L && bl3;
        boolean bl5 = bl4;
        if (bl4 || class110972.B()) {
            this.L_3 = false;
            this.L_2 = false;
        }
        if (l2 >= (Long)this.N_0) {
            this.L_3 = false;
            this.L_2 = false;
        }
        if (!((Boolean)this.L_3).booleanValue() && l2 >= (Long)this.y_0 && this.y(class110972, bl, bl2, bl3, l)) {
            this.N(l2, class110972, bl, bl3);
        }
        if (!((Boolean)this.L_3).booleanValue()) {
            return class09141.Z();
        }
        float f = class04995.N((float)((float)(l2 - (Long)this.y_1) / (float)Math.max(1L, (Long)this.N_0 - (Long)this.y_1)), (float)0.0f, (float)1.0f);
        float f2 = (float)Math.pow(Math.max(0.0f, 1.0f - f), 0.54f);
        float f3 = 0.16f + f2 * 0.96f;
        float f4 = (Boolean)this.L_2 != false ? Math.max(0.74f, (float)Math.sin((double)f * Math.PI)) : 0.0f;
        return new class09141(true, class04995.B((float)f3, (float)1.0f, (float)((Float)this.N_2).floatValue()), class04995.B((float)f3, (float)1.0f, (float)((Float)this.N_3).floatValue()), class04995.B((float)f3, (float)0.72f, (float)1.22f), ((Float)this.N_4).floatValue(), ((Float)this.N_5).floatValue(), ((Float)this.L_0).floatValue() * f4, ((Float)this.L_1).floatValue() * f4, (Boolean)this.L_2 != false && f4 > 0.08f);
    }
}

