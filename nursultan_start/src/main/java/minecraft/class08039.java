/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04293
 *  minecraft.class04782
 *  minecraft.class05849
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07089
 *  minecraft.class07107
 *  minecraft.class07113
 *  minecraft.class07126
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class04293;
import minecraft.class04782;
import minecraft.class05849;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07089;
import minecraft.class07107;
import minecraft.class07113;
import minecraft.class07126;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08005;
import minecraft.class08038;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public abstract class class08039
extends class08005 {
    public static final double N = 0.1;
    public static final double y = 0.5;
    public double L = 0.1;

    private void M() {
        float f;
        class06889 class068892 = this.method_18798();
        class06889 class068893 = this.method_73189();
        if (this.method_5799()) {
            for (int i = 0; i < 4; ++i) {
                float f2 = 0.25f;
                this.method_73183().method_8406((class07126)class07107.u, class068893.M - class068892.M * 0.25, class068893.B - class068892.B * 0.25, class068893.Z - class068892.Z * 0.25, class068892.M, class068892.B, class068892.Z);
            }
            f = this.R();
        } else {
            f = this.i();
        }
        this.method_18799(class068892.i(class068892.u().L(this.L)).L((double)f));
    }

    protected void method_5693(class04293 class042932) {
    }

    @Override
    public void method_5773() {
        class07049 class070492 = this.z();
        this.M();
        if (!this.method_73183().method_8608() && (class070492 != null && class070492.method_31481() || !this.method_73183().E(this.method_24515()))) {
            this.method_31472();
            return;
        }
        class07089 class070892 = class08038.N((class07049)this, this::N, this.y());
        class06889 class068892 = class070892.N() != class07113.field_1333 ? class070892.y() : this.method_73189().i(this.method_18798());
        class08038.N((class07049)this, 0.2f);
        this.method_33574(class068892);
        this.method_61409();
        super.method_5773();
        if (this.ad_()) {
            this.method_5639(1.0f);
        }
        if (class070892.N() != class07113.field_1333 && this.method_5805()) {
            this.y(class070892);
        }
        this.B();
    }

    @Override
    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        return false;
    }

    public float method_5718() {
        return 1.0f;
    }

    @Override
    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("acceleration_power", this.L);
    }

    public boolean method_5640(double d) {
        double d2 = this.method_5829().N() * 4.0;
        if (Double.isNaN(d2)) {
            d2 = 4.0;
        }
        return d < (d2 *= 64.0) * d2;
    }

    @Override
    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.L = class082992.N("acceleration_power", 0.1);
    }

    protected class08039(class07078<? extends class08039> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    protected class08039(class07078<? extends class08039> class070782, double d, double d2, double d3, class07299 class072992) {
        this(class070782, class072992);
        this.method_5814(d, d2, d3);
    }

    public class08039(class07078<? extends class08039> class070782, class07438 class074382, class06889 class068892, class07299 class072992) {
        this(class070782, class074382.method_23317(), class074382.method_23318(), class074382.method_23321(), class068892, class072992);
        this.L((class07049)class074382);
        this.method_5710(class074382.method_36454(), class074382.method_36455());
    }

    public class08039(class07078<? extends class08039> class070782, double d, double d2, double d3, class06889 class068892, class07299 class072992) {
        this(class070782, class072992);
        this.method_5808(d, d2, d3, this.method_36454(), this.method_36455());
        this.method_23311();
        this.N(class068892, this.L);
    }

    private void B() {
        class07126 class071262 = this.u();
        class06889 class068892 = this.method_73189();
        if (class071262 != null) {
            this.method_73183().method_8406(class071262, class068892.M, class068892.B + 0.5, class068892.Z, 0.0, 0.0, 0.0);
        }
    }

    protected float i() {
        return 0.95f;
    }

    protected @Nullable class07126 u() {
        return class07107.NZ;
    }

    protected class05849 y() {
        return class05849.field_17558;
    }

    private void N(class06889 class068892, double d) {
        this.method_18799(class068892.u().L(d));
        this.field_64356 = true;
    }

    @Override
    protected boolean N(class07049 class070492) {
        return super.N(class070492) && !class070492.field_5960;
    }

    protected float R() {
        return 0.8f;
    }

    @Override
    protected void a_(boolean bl) {
        super.a_(bl);
        this.L = bl ? 0.1 : (this.L *= 0.5);
    }

    protected boolean ad_() {
        return true;
    }
}

