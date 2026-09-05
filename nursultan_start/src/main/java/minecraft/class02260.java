/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class01210
 *  minecraft.class01284
 *  minecraft.class04206
 *  minecraft.class04782
 *  minecraft.class05640
 *  minecraft.class06145
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07089
 *  minecraft.class07126
 *  minecraft.class07299
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class08039
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import java.util.function.Function;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class01210;
import minecraft.class01284;
import minecraft.class02247;
import minecraft.class04206;
import minecraft.class04782;
import minecraft.class05640;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07089;
import minecraft.class07126;
import minecraft.class07299;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class08039;
import org.jspecify.annotations.Nullable;

public abstract class class02260
extends class08039
implements class05640 {
    public static final class01284 u = new class02247(true, false, Optional.empty(), class04206.i.N(class01210.Lp).map(Function.identity()));
    public static final double R = 0.25;

    public class06584 L() {
        return class06584.E;
    }

    protected class00734 method_65341(class06889 class068892) {
        float f = this.method_5864().E().N() / 2.0f;
        float f2 = this.method_5864().E().y();
        float f3 = 0.15f;
        return new class00734(class068892.M - (double)f, class068892.B - (double)0.15f, class068892.Z - (double)f, class068892.M + (double)f, class068892.B - (double)0.15f + (double)f2, class068892.Z + (double)f);
    }

    public void method_5773() {
        if (!this.method_73183().method_8608() && this.method_31478() > this.method_73183().method_31600() + 30) {
            this.N(this.method_73189());
            this.method_31472();
        } else {
            super.method_5773();
        }
    }

    public void method_5762(double d, double d2, double d3) {
    }

    public boolean method_30949(class07049 class070492) {
        if (class070492 instanceof class02260) {
            return false;
        }
        return super.method_30949(class070492);
    }

    public class02260(class07078<? extends class02260> class070782, class07299 class072992, class07049 class070492, double d, double d2, double d3) {
        super(class070782, d, d2, d3, class072992);
        this.L(class070492);
        this.L = 0.0;
    }

    class02260(class07078<? extends class02260> class070782, double d, double d2, double d3, class06889 class068892, class07299 class072992) {
        super(class070782, d, d2, d3, class068892, class072992);
        this.L = 0.0;
    }

    public class02260(class07078<? extends class02260> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.L = 0.0;
    }

    protected float i() {
        return 1.0f;
    }

    protected @Nullable class07126 u() {
        return null;
    }

    protected abstract void N(class06889 var1);

    protected boolean N(class07049 class070492) {
        if (class070492 instanceof class02260) {
            return false;
        }
        if (class070492.method_5864() == class07078.S) {
            return false;
        }
        return super.N(class070492);
    }

    protected void N(class06183 class061832) {
        super.N(class061832);
        if (!this.method_73183().method_8608()) {
            class06889 class068892 = class06889.N((class00753)class061832.i().E()).u(0.25, 0.25, 0.25);
            class06889 class068893 = class061832.y().i(class068892);
            this.N(class068893);
            this.method_31472();
        }
    }

    protected void N(class07089 class070892) {
        super.N(class070892);
        if (!this.method_73183().method_8608()) {
            this.method_31472();
        }
    }

    protected void N(class06145 class061452) {
        class07438 class074382;
        super.N(class061452);
        class07299 class072992 = this.method_73183();
        if (!(class072992 instanceof class04782)) {
            return;
        }
        class04782 class047822 = (class04782)class072992;
        class07049 class070492 = this.z();
        class072992 = class070492 instanceof class07438 ? (class074382 = (class07438)class070492) : null;
        class074382 = class061452.L();
        if (class072992 != null) {
            class072992.method_6114((class07049)class074382);
        }
        if (class074382.method_64397(class047822, (class07072)(class070492 = this.method_48923().L((class07049)this, (class07438)class072992)), 1.0f) && class074382 instanceof class07438) {
            class07438 class074383 = class074382;
            class07323.N((class04782)class047822, (class07049)class074383, (class07072)class070492);
        }
        this.N(this.method_73189());
    }

    protected float R() {
        return this.i();
    }

    protected boolean ad_() {
        return false;
    }
}

