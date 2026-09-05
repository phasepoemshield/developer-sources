/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09139
 *  Nursultan.class09170
 *  Nursultan.class11499
 *  minecraft.class04995
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class09139;
import Nursultan.class09170;
import Nursultan.class11060;
import Nursultan.class11087;
import Nursultan.class11096;
import Nursultan.class11499;
import minecraft.class04995;
import minecraft.class07438;

public class class11081 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public boolean N_init;

    public class11081() {
        this.y();
        this.N_5 = class11060.IDLE;
    }

    private float y(float f) {
        return 1.0f - (float)Math.pow(1.0f - f, 2.25);
    }

    private void y() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0L;
            this.N_1 = 0L;
            this.N_2 = 0L;
            this.N_3 = Float.valueOf(0.0f);
            this.N_4 = Float.valueOf(0.0f);
        }
    }

    public void N() {
        this.N_0 = 0L;
        this.N_1 = 0L;
        this.N_2 = 0L;
        this.N_3 = Float.valueOf(0.0f);
        this.N_4 = Float.valueOf(0.0f);
        this.N_5 = class11060.IDLE;
    }

    private boolean N(class11499 class114992, class11499 class114993) {
        float f = Math.abs(class09170.N((float)class114992.y(), (float)class114993.y()));
        float f2 = Math.abs(class114993.R() - class114992.R());
        if (f > 2.6f || f2 > 1.3f) {
            return false;
        }
        return Math.random() < 0.42;
    }

    private float N(float f) {
        return f * f * (3.0f - 2.0f * f);
    }

    private void N(long l) {
        this.N_5 = class11060.IDLE;
        this.N_1 = 0L;
        this.N_2 = 0L;
        this.N_3 = Float.valueOf(0.0f);
        this.N_4 = Float.valueOf(0.0f);
        if (l >= (Long)this.N_0) {
            this.N_0 = l + (long)class09139.N((double)220.0, (double)520.0);
        }
    }

    public class11096 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        long l = System.currentTimeMillis();
        if (!bl || bl3 || bl2 && bl4) {
            this.N(l);
            return new class11096(class114993, false);
        }
        if ((class11060)((Object)this.N_5) == class11060.IDLE && l >= (Long)this.N_0 && this.N(class114992, class114993)) {
            this.N(l, class114992, class114993);
        }
        if ((class11060)((Object)this.N_5) == class11060.IDLE) {
            return new class11096(class114993, false);
        }
        float f = class04995.N((float)((float)(l - (Long)this.N_1) / (float)Math.max(1L, (Long)this.N_2)), (float)0.0f, (float)1.0f);
        if (f >= 1.0f) {
            if ((class11060)((Object)this.N_5) == class11060.OUT) {
                this.N_5 = class11060.RETURN;
                this.N_1 = l;
                this.N_2 = (long)class09139.N((double)95.0, (double)185.0);
                f = 0.0f;
            } else {
                this.N(l);
                return new class11096(class114993, false);
            }
        }
        float f2 = (class11060)((Object)this.N_5) == class11060.OUT ? this.y(f) : 1.0f - this.N(f);
        class11499 class114994 = new class11499(class114993.y() + ((Float)this.N_3).floatValue() * f2, class04995.N((float)(class114993.R() + ((Float)this.N_4).floatValue() * f2), (float)-90.0f, (float)90.0f));
        return new class11096(class114994, true);
    }

    private void N(long l, class11499 class114992, class11499 class114993) {
        float f = class09170.N((float)class114992.y(), (float)class114993.y());
        float f2 = Math.abs(f) > 0.12f ? Math.signum(f) : (Math.random() > 0.5 ? 1.0f : -1.0f);
        this.N_3 = Float.valueOf(f2 * class09139.N((double)1.35, (double)4.65) + (float)(Math.random() * 8.1371E-4));
        this.N_4 = Float.valueOf(class09139.N((double)-0.52, (double)0.52) + (float)(Math.random() * 2.7193E-4));
        this.N_5 = class11060.OUT;
        this.N_1 = l;
        this.N_2 = (long)class09139.N((double)70.0, (double)135.0);
        this.N_0 = l + (long)class09139.N((double)430.0, (double)980.0);
    }
}

