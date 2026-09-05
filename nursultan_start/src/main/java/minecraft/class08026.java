/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00717
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05640
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00717;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05640;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class08026
extends class07049
implements class05640 {
    private static final float N = 12.25f;
    private static final float y = 8.0f;
    private static final float L = 12.0f;
    private static final class02131<class06584> u = class03289.N(class08026.class, (class04383)class02154.B);
    private @Nullable class06889 i;
    private int R;
    private boolean M;

    public class06584 L() {
        return (class06584)this.method_5841().N(u);
    }

    protected void method_5693(class04293 class042932) {
        class042932.N(u, (Object)this.N());
    }

    public void method_5773() {
        super.method_5773();
        class06889 class068892 = this.method_73189().i(this.method_18798());
        if (!this.method_73183().method_8608() && this.i != null) {
            this.method_18799(class08026.N(this.method_18798(), class068892, this.i));
        }
        if (this.method_73183().method_8608()) {
            class06889 class068893 = class068892.u(this.method_18798().L(0.25));
            this.N(class068893, this.method_18798());
        }
        this.method_33574(class068892);
        if (!this.method_73183().method_8608()) {
            ++this.R;
            if (this.R > 80 && !this.method_73183().method_8608()) {
                this.method_5783(class04909.za, 1.0f, 1.0f);
                this.method_31472();
                if (this.M) {
                    this.method_73183().method_8649((class07049)new class00717(this.method_73183(), this.method_23317(), this.method_23318(), this.method_23321(), this.L()));
                } else {
                    this.method_73183().N(2003, this.method_24515(), 0);
                }
            }
        }
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        return false;
    }

    public float method_5718() {
        return 1.0f;
    }

    protected void method_5652(class08329 class083292) {
        class083292.N("Item", class06584.y, (Object)this.L());
    }

    public boolean method_5640(double d) {
        if (this.field_6012 < 2 && d < 12.25) {
            return false;
        }
        double d2 = this.method_5829().N() * 4.0;
        if (Double.isNaN(d2)) {
            d2 = 4.0;
        }
        return d < (d2 *= 64.0) * d2;
    }

    protected void method_5749(class08299 class082992) {
        this.N(class082992.N("Item", class06584.y).orElse(this.N()));
    }

    public boolean method_5732() {
        return false;
    }

    public class08026(class07078<? extends class08026> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public class08026(class07299 class072992, double d, double d2, double d3) {
        this((class07078<? extends class08026>)class07078.NN, class072992);
        this.method_5814(d, d2, d3);
    }

    public void N(class06889 class068892) {
        class06889 class068893 = class068892.u(this.method_73189());
        double d = class068893.Z();
        this.i = d > 12.0 ? this.method_73189().y(class068893.M / d * 12.0, 8.0, class068893.Z / d * 12.0) : class068892;
        this.R = 0;
        this.M = this.field_5974.y(5) > 0;
    }

    private void N(class06889 class068892, class06889 class068893) {
        if (this.method_5799()) {
            for (int i = 0; i < 4; ++i) {
                this.method_73183().method_8406((class07126)class07107.u, class068892.M, class068892.B, class068892.Z, class068893.M, class068893.B, class068893.Z);
            }
        } else {
            this.method_73183().method_8406((class07126)class07107.NM, class068892.M + this.field_5974.U() * 0.6 - 0.3, class068892.B - 0.5, class068892.Z + this.field_5974.U() * 0.6 - 0.3, class068893.M, class068893.B, class068893.Z);
        }
    }

    public void N(class06584 class065842) {
        if (class065842.R()) {
            this.method_5841().N(u, (Object)this.N());
        } else {
            this.method_5841().N(u, (Object)class065842.L(1));
        }
    }

    private class06584 N() {
        return new class06584((class07310)class06570.nG);
    }

    private static class06889 N(class06889 class068892, class06889 class068893, class06889 class068894) {
        class06889 class068895 = new class06889(class068894.M - class068893.M, 0.0, class068894.Z - class068893.Z);
        double d = class068895.M();
        double d2 = class04995.u((double)0.0025, (double)class068892.Z(), (double)d);
        double d3 = class068892.B;
        if (d < 1.0) {
            d2 *= 0.8;
            d3 *= 0.8;
        }
        double d4 = class068893.B - class068892.B < class068894.B ? 1.0 : -1.0;
        return class068895.L(d2 / d).y(0.0, d3 + (d4 - d3) * 0.015, 0.0);
    }
}

