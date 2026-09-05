/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09339
 *  Nursultan.class11938
 *  it.unimi.dsi.fastutil.floats.FloatUnaryOperator
 */
package minecraft;

import Nursultan.class09339;
import Nursultan.class11938;
import it.unimi.dsi.fastutil.floats.FloatUnaryOperator;
import minecraft.class02233;

public class class02212
implements class02233 {
    private float L;
    private float u;
    private float i;
    private float R;
    private long M;
    private long B;
    private final float Z;
    private final FloatUnaryOperator z;
    private boolean U;
    private boolean E;

    private void L() {
        if (!this.U) {
            this.R = this.u;
        }
        this.U = true;
    }

    public void L(boolean bl) {
        this.E = bl;
    }

    public class02212(float f, long l, FloatUnaryOperator floatUnaryOperator) {
        this.Z = 1000.0f / f;
        this.B = this.M = l;
        this.z = floatUnaryOperator;
    }

    private void u() {
        if (this.U) {
            this.u = this.R;
        }
        this.U = false;
    }

    @Override
    public float y() {
        if (this.i > 7.0f) {
            return 0.5f;
        }
        return this.i;
    }

    private void y(long l) {
        this.i = (float)(l - this.B) / this.Z;
        this.B = l;
    }

    public void y(boolean bl) {
        if (bl) {
            this.L();
        } else {
            this.u();
        }
    }

    @Override
    public float N(boolean bl) {
        if (!bl && this.E) {
            return 1.0f;
        }
        return this.U ? this.R : this.u;
    }

    private float N(float f) {
        class09339 class093392 = class09339.N();
        class11938.L().L((Object)class093392);
        return f / class093392.y();
    }

    @Override
    public float N() {
        return this.L;
    }

    public int N(long l, boolean bl) {
        this.y(l);
        if (bl) {
            return this.N(l);
        }
        return 0;
    }

    private int N(long l) {
        this.L = (float)(l - this.M) / this.N(this.z.apply(this.Z));
        this.M = l;
        this.u += this.L;
        int n = (int)this.u;
        this.u -= (float)n;
        return n;
    }
}

