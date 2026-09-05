/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11302
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07109
 *  org.joml.Vector2f
 */
package Nursultan;

import Nursultan.class11302;
import Nursultan.class11500;
import Nursultan.class11522;
import Nursultan.class11538;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07109;
import org.joml.Vector2f;

public class class11499 {
    private static double[] P;
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public boolean y_init;

    public class11499 L(boolean bl) {
        this.N_3 = bl;
        return this;
    }

    public class07109 L() {
        return new class07109(this.y(), this.R());
    }

    public Vector2f M() {
        return new Vector2f(this.y(), this.R());
    }

    private static void P() {
        P = new double[2];
        class11499.P[0] = Double.longBitsToDouble(-4616189618054758400L);
        class11499.P[1] = Double.longBitsToDouble(0x3FF0000000000000L);
    }

    public class11499(float f, float f2) {
        this(f, f2, false, false, false, class11522.staticFields_05ffa7eec8dd73e94b3c68970de658457_1);
    }

    public class11499(float f, float f2, boolean bl, boolean bl2, boolean bl3, class11522 class115222) {
        this.b();
        this.N_2 = class06202.Nq();
        this.N_0 = Float.valueOf(f);
        this.N_1 = Float.valueOf(f2);
        this.N_4 = bl2;
        this.N_3 = bl;
        this.y_2 = class115222;
        this.y_3 = class11538.staticFields_002f846683278372c86f24838365e6c39_0;
        this.y_0 = bl3;
    }

    static {
        class11499.P();
    }

    public String toString() {
        return "Yaw: " + this.y() + ", Pitch: " + this.R();
    }

    public boolean B() {
        return (Boolean)this.N_3;
    }

    public class06202 Z() {
        return (class06202)this.N_2;
    }

    public boolean i() {
        return (Boolean)this.y_1;
    }

    private void b() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = Float.valueOf(0.0f);
            this.N_1 = Float.valueOf(0.0f);
            this.N_3 = false;
            this.N_4 = false;
        }
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = false;
            this.y_1 = false;
        }
    }

    public class06889 U() {
        return class06889.N((float)this.R(), (float)this.y());
    }

    public class11522 z() {
        return (class11522)((Object)this.y_2);
    }

    public class11499 u(boolean bl) {
        this.y_0 = bl;
        return this;
    }

    public boolean u() {
        return (Boolean)this.N_4;
    }

    public float y() {
        if (((Boolean)this.y_1).booleanValue()) {
            return class11302.N((float)((class04453)((class06202)this.N_2).T_4).field_5982, (float)((Float)this.N_0).floatValue());
        }
        return ((Float)this.N_0).floatValue();
    }

    public class11499 y(boolean bl) {
        this.N_4 = bl;
        return this;
    }

    public class11499 y(class11499 class114992) {
        return new class11500(class04995.R((float)(this.y() - class114992.y())), this.R() - class114992.R());
    }

    public boolean E() {
        return (Boolean)this.y_0;
    }

    public float N(class06889 class068892) {
        class06889 class068893 = class068892.u(((class04453)((class06202)this.N_2).T_4).method_33571()).u();
        double d = ((class04453)((class06202)this.N_2).T_4).method_5631(this.R(), this.y()).y(class068893);
        d = class04995.N((double)d, (double)P[0], (double)P[1]);
        return (float)Math.toDegrees(Math.acos(d));
    }

    public class11499 N(class11538 class115382) {
        this.y_3 = class115382;
        return this;
    }

    public class11499 N(boolean bl) {
        this.y_1 = bl;
        return this;
    }

    public class11538 N() {
        return (class11538)((Object)this.y_3);
    }

    public class11499 N(class11522 class115222) {
        this.y_2 = class115222;
        return this;
    }

    public class11499 N(class11499 class114992) {
        return new class11499(this.y() + class114992.y(), this.R() + class114992.R());
    }

    public class11499 N(float f, float f2) {
        return this.N(new class11500(f, f2));
    }

    public float R() {
        float f = ((Float)this.N_1).floatValue();
        if (((Boolean)this.y_1).booleanValue()) {
            f = class11302.N((float)((class04453)((class06202)this.N_2).T_4).field_6004, (float)f);
        }
        return Math.clamp((float)f, (float)-90.0f, (float)90.0f);
    }
}

