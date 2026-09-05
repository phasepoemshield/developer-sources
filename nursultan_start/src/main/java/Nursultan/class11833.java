/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09753
 *  Nursultan.class09780
 */
package Nursultan;

import Nursultan.class09753;
import Nursultan.class09780;
import Nursultan.class11863;
import java.util.Objects;

public class class11833
implements class09780 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public boolean N_init;
    public static Object y_0;

    public float L() {
        return ((Float)this.N_1).floatValue();
    }

    private void L(float f) {
        float f2 = ((Float)this.N_1).floatValue() - ((Float)this.N_3).floatValue();
        float f3 = (-((class11863)((Object)this.N_0)).L() * f2 - ((class11863)((Object)this.N_0)).i() * ((Float)this.N_2).floatValue()) / ((class11863)((Object)this.N_0)).M();
        this.N_2 = Float.valueOf(((Float)this.N_2).floatValue() + f3 * f);
        this.N_1 = Float.valueOf(((Float)this.N_1).floatValue() + ((Float)this.N_2).floatValue() * f);
    }

    private static void M() {
        y_0 = Float.valueOf(0.25f);
    }

    public class11833(float f, float f2, class11863 class118632) {
        this.E();
        this.N_0 = Objects.requireNonNull(class118632, "spec");
        this.N_1 = Float.valueOf(f);
        this.N_3 = Float.valueOf(f2);
        this.N_4 = this.Z();
        if (((Boolean)this.N_4).booleanValue()) {
            this.N_1 = Float.valueOf(((Float)this.N_3).floatValue());
        }
    }

    static {
        class11833.M();
    }

    private boolean Z() {
        return Math.abs(((Float)this.N_1).floatValue() - ((Float)this.N_3).floatValue()) <= ((class11863)((Object)this.N_0)).y() && Math.abs(((Float)this.N_2).floatValue()) <= ((class11863)((Object)this.N_0)).B();
    }

    public float u() {
        return ((Float)this.N_2).floatValue();
    }

    public boolean y() {
        return (Boolean)this.N_4;
    }

    public boolean y(float f) {
        this.N_3 = Float.valueOf(f);
        this.N_4 = this.Z();
        if (((Boolean)this.N_4).booleanValue()) {
            this.N_1 = Float.valueOf(((Float)this.N_3).floatValue());
            this.N_2 = Float.valueOf(0.0f);
        }
        return true;
    }

    private void E() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = Float.valueOf(0.0f);
            this.N_2 = Float.valueOf(0.0f);
            this.N_3 = Float.valueOf(0.0f);
            this.N_4 = false;
        }
    }

    public boolean N(class09753 class097532) {
        return this.y(class097532.y());
    }

    public boolean N(float f) {
        float f2;
        if (((Boolean)this.N_4).booleanValue() || f <= 0.0f) {
            return false;
        }
        float f3 = ((Float)this.N_1).floatValue();
        for (float f4 = Math.min(f, 0.25f); f4 > 0.0f; f4 -= f2) {
            f2 = Math.min(((class11863)((Object)this.N_0)).R(), f4);
            this.L(f2);
        }
        if (this.Z()) {
            this.N_1 = Float.valueOf(((Float)this.N_3).floatValue());
            this.N_2 = Float.valueOf(0.0f);
            this.N_4 = true;
        }
        return Float.compare(f3, ((Float)this.N_1).floatValue()) != 0;
    }

    public class09753 N() {
        return class09753.N((float)((Float)this.N_1).floatValue());
    }
}

