/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00680
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class06145
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07086
 *  minecraft.class07089
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07307
 *  minecraft.class07323
 *  minecraft.class07328
 *  minecraft.class07438
 *  minecraft.class08039
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00680;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class06145;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07086;
import minecraft.class07089;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07307;
import minecraft.class07323;
import minecraft.class07328;
import minecraft.class07438;
import minecraft.class08039;
import minecraft.class08299;
import minecraft.class08329;

public class class07513
extends class08039 {
    private static final class02131<Boolean> u = class03289.N(class07513.class, (class04383)class02154.U);
    private static final boolean R = false;

    public boolean M() {
        return (Boolean)this.field_6011.N(u);
    }

    public float method_5774(class07307 class073072, class07290 class072902, class07209 class072092, class00500 class005002, class04688 class046882, float f) {
        if (this.M() && class00680.N((class00500)class005002)) {
            return Math.min(0.8f, f);
        }
        return f;
    }

    protected void method_5693(class04293 class042932) {
        class042932.N(u, (Object)false);
    }

    public boolean method_5809() {
        return false;
    }

    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("dangerous", this.M());
    }

    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.y(class082992.N("dangerous", false));
    }

    public class07513(class07078<? extends class07513> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public class07513(class07299 class072992, class07438 class074382, class06889 class068892) {
        super(class07078.yf, class074382, class068892, class072992);
    }

    protected float i() {
        return this.M() ? 0.73f : super.i();
    }

    public void y(boolean bl) {
        this.field_6011.N(u, (Object)bl);
    }

    protected void N(class07089 class070892) {
        super.N(class070892);
        if (!this.method_73183().method_8608()) {
            this.method_73183().method_8537((class07049)this, this.method_23317(), this.method_23318(), this.method_23321(), 1.0f, false, class07328.field_40890);
            this.method_31472();
        }
    }

    protected void N(class06145 class061452) {
        boolean bl;
        class07438 class074382;
        super.N(class061452);
        class07299 class072992 = this.method_73183();
        if (!(class072992 instanceof class04782)) {
            return;
        }
        class04782 class047822 = (class04782)class072992;
        class072992 = class061452.L();
        class07049 class070492 = this.z();
        if (class070492 instanceof class07438) {
            class074382 = (class07438)class070492;
            class07072 class070722 = this.method_48923().N_41(this, (class07049)class074382);
            bl = class072992.method_64397(class047822, class070722, 8.0f);
            if (bl) {
                if (class072992.method_5805()) {
                    class07323.N((class04782)class047822, (class07049)class072992, (class07072)class070722);
                } else {
                    class074382.method_6025(5.0f);
                }
            }
        } else {
            bl = class072992.method_64397(class047822, this.method_48923().T(), 5.0f);
        }
        if (bl && class072992 instanceof class07438) {
            class074382 = (class07438)class072992;
            int n = 0;
            if (this.method_73183().y() == class07086.field_5802) {
                n = 10;
            } else if (this.method_73183().y() == class07086.field_5807) {
                n = 40;
            }
            if (n > 0) {
                class074382.method_37222(new class07055(class07047.v, 20 * n, 1), this.P());
            }
        }
    }

    protected boolean ad_() {
        return false;
    }
}

