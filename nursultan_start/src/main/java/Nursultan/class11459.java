/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11319
 *  Nursultan.class11908
 *  minecraft.class04995
 */
package Nursultan;

import Nursultan.class11319;
import Nursultan.class11908;
import minecraft.class04995;

public class class11459 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;

    public void L() {
        long l = System.currentTimeMillis();
        float f = (float)(l - (Long)this.N_3) / 1000.0f;
        if (f > 0.0f) {
            long l2 = (long)class04995.N((float)(((Float)this.N_2).floatValue() / f), (float)0.0f, (float)((Float)this.N_2).floatValue());
            ((class11319)this.N_1).add((Object)l2);
        }
        this.N_3 = l;
        this.u();
    }

    public class11459() {
        this.z();
        this.N_0 = 20;
        this.N_1 = new class11319(((Integer)this.N_0).intValue());
        this.N_2 = Float.valueOf(20.0f);
        this.N_5 = Float.valueOf(((Float)this.N_2).floatValue());
    }

    private void z() {
        this.N_0 = 0;
        this.N_2 = Float.valueOf(0.0f);
        this.N_3 = 0L;
        this.N_4 = 0L;
        this.N_5 = Float.valueOf(0.0f);
    }

    public void u() {
        long l2 = System.currentTimeMillis();
        if (l2 - (Long)this.N_4 < 4000L) {
            return;
        }
        double d = ((class11319)this.N_1).stream().filter(l -> l != null && l > 0L).mapToLong(Long::longValue).average().orElse(((Float)this.N_2).floatValue());
        this.N_5 = Float.valueOf(class11908.N((float)((float)d), (float)0.1f));
        this.N_4 = l2;
    }

    public float y() {
        return ((Float)this.N_5).floatValue();
    }

    public void N(float f) {
        this.N_0 = (int)Math.ceil(f);
        this.N_2 = Float.valueOf(f);
        this.N_1 = new class11319(((Integer)this.N_0).intValue());
    }

    public void N() {
        ((class11319)this.N_1).clear();
        for (int i = 0; i < (Integer)this.N_0; ++i) {
            ((class11319)this.N_1).add((Object)0L);
        }
        long l = System.currentTimeMillis();
        this.N_3 = l;
        this.N_4 = l;
        this.u();
    }
}

