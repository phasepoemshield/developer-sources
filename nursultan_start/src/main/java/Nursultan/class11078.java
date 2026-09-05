/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09139
 *  Nursultan.class11499
 *  minecraft.class04995
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class09139;
import Nursultan.class11087;
import Nursultan.class11499;
import minecraft.class04995;
import minecraft.class07438;

public class class11078 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public boolean N_init;

    public class11078() {
        this.y();
        this.N_3 = 1;
    }

    private void y() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0L;
            this.N_1 = Float.valueOf(0.0f);
            this.N_2 = Float.valueOf(0.0f);
            this.N_3 = 0;
        }
    }

    public class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (class114992 == null || class114993 == null || !bl || bl2 || bl4) {
            return class114993;
        }
        long l = System.currentTimeMillis();
        this.N(l, bl3);
        float f = class114993.y();
        float f2 = class114993.R();
        float f3 = bl3 ? 1.45f : 1.0f;
        float[][] fArrayArray = new float[][]{{((Float)this.N_1).floatValue() * f3, ((Float)this.N_2).floatValue() * f3}, {((Float)this.N_1).floatValue() * 0.74f * f3, -((Float)this.N_2).floatValue() * 0.92f}, {-((Float)this.N_1).floatValue() * 0.62f, ((Float)this.N_2).floatValue() * 0.72f * f3}, {(float)((Integer)this.N_3).intValue() * 0.38f, (float)(-((Integer)this.N_3).intValue()) * 0.16f}, {(float)(-((Integer)this.N_3).intValue()) * 0.31f, (float)((Integer)this.N_3).intValue() * 0.18f}, {((Float)this.N_1).floatValue() * 1.38f, ((Float)this.N_2).floatValue() * 0.44f}, {-((Float)this.N_1).floatValue() * 0.92f, -((Float)this.N_2).floatValue() * 1.16f}};
        for (float[] fArray : fArrayArray) {
            class11499 class114994 = new class11499(f + fArray[0], class04995.N((float)(f2 + fArray[1]), (float)-90.0f, (float)90.0f));
            if (!class110872.N(class074382, class114994)) continue;
            return class114994;
        }
        return class114993;
    }

    public void N() {
        this.N_0 = 0L;
        this.N_1 = Float.valueOf(0.0f);
        this.N_2 = Float.valueOf(0.0f);
        this.N_3 = 1;
    }

    private void N(long l, boolean bl) {
        if (l < (Long)this.N_0) {
            return;
        }
        this.N_3 = -((Integer)this.N_3).intValue();
        float f = bl ? 1.0f : 0.0f;
        this.N_1 = Float.valueOf((float)((Integer)this.N_3).intValue() * class09139.N((double)(0.36f + f * 0.14f), (double)(1.18f + f * 0.36f)));
        this.N_2 = Float.valueOf((Math.random() > 0.5 ? 1.0f : -1.0f) * class09139.N((double)0.12f, (double)(0.44f + f * 0.18f)));
        this.N_0 = l + (long)class09139.N((double)38.0, (double)(bl ? 92.0 : 132.0));
    }
}

