/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class06889
 */
package minecraft;

import minecraft.class04995;
import minecraft.class06889;

public class class06602 {
    private class06889 N = class06889.L;
    private float y;
    private float L;
    private double u;
    private double i;
    private double R;
    private double M;
    private double B;
    private double Z;
    private float z;
    private float U;

    public double L(float f) {
        return class04995.u((double)f, (double)this.B, (double)this.i);
    }

    public float M(float f) {
        float f2 = this.y - this.L;
        return -(this.y + f2 * f);
    }

    public float B(float f) {
        return class04995.B((float)f, (float)this.L, (float)this.y);
    }

    public void i(float f) {
        this.U = this.z;
        this.z += (f - this.z) * 0.4f;
    }

    public double u(float f) {
        return class04995.u((double)f, (double)this.Z, (double)this.R);
    }

    public void y() {
        this.U = this.z;
        this.z = 0.0f;
    }

    public double y(float f) {
        return class04995.u((double)f, (double)this.M, (double)this.u);
    }

    public class06889 N() {
        return this.N;
    }

    public void N(class06889 class068892, class06889 class068893) {
        this.L = this.y;
        this.N = class068893;
        this.N(class068892);
    }

    private void N(class06889 class068892) {
        this.M = this.u;
        this.B = this.i;
        this.Z = this.R;
        double d = class068892.N() - this.u;
        double d2 = class068892.y() - this.i;
        double d3 = class068892.L() - this.R;
        double d4 = 10.0;
        if (d > 10.0 || d < -10.0) {
            this.M = this.u = class068892.N();
        } else {
            this.u += d * 0.25;
        }
        if (d2 > 10.0 || d2 < -10.0) {
            this.B = this.i = class068892.y();
        } else {
            this.i += d2 * 0.25;
        }
        if (d3 > 10.0 || d3 < -10.0) {
            this.Z = this.R = class068892.L();
        } else {
            this.R += d3 * 0.25;
        }
    }

    public void N(float f) {
        this.y += f;
    }

    public float R(float f) {
        return class04995.B((float)f, (float)this.U, (float)this.z);
    }
}

