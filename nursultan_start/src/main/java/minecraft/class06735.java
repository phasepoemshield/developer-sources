/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00457
 *  minecraft.class00690
 *  minecraft.class00695
 *  minecraft.class00734
 *  minecraft.class01383
 *  minecraft.class01857
 *  minecraft.class02566
 *  minecraft.class03448
 *  minecraft.class04782
 *  minecraft.class05455
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06747
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class07529
 *  minecraft.class08337
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00457;
import minecraft.class00690;
import minecraft.class00695;
import minecraft.class00734;
import minecraft.class01383;
import minecraft.class01857;
import minecraft.class02566;
import minecraft.class03448;
import minecraft.class04782;
import minecraft.class05455;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06715;
import minecraft.class06724;
import minecraft.class06747;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class07529;
import minecraft.class08337;
import org.jspecify.annotations.Nullable;

public class class06735
implements class01857 {
    final class06202 N;

    public class06735(class06202 class062022) {
        this.N = class062022;
    }

    private void N(class07049 class070492, float f, boolean bl) {
        class06889 class068892;
        float f2;
        class06889 class068893 = class070492.method_73189();
        class06889 class068894 = class070492.method_30950(f);
        class06889 class068895 = class068894.u(class068893);
        int n = bl ? -16711936 : -1;
        class06724.N(class070492.method_5829().L(class068895), class06747.N((int)n));
        class06724.N(class068894, n, 2.0f);
        class07049 class070493 = class070492.method_5854();
        if (class070493 != null) {
            float f3 = Math.min(class070493.method_17681(), class070492.method_17681()) / 2.0f;
            f2 = 0.0625f;
            class068892 = class070493.method_52538(class070492).i(class068895);
            class06724.N(new class00734(class068892.M - (double)f3, class068892.B, class068892.Z - (double)f3, class068892.M + (double)f3, class068892.B + 0.0625, class068892.Z + (double)f3), class06747.N((int)-256));
        }
        if (class070492 instanceof class07438) {
            class00734 class007342 = class070492.method_5829().L(class068895);
            f2 = 0.01f;
            class06724.N(new class00734(class007342.N, class007342.y + (double)class070492.method_5751() - (double)0.01f, class007342.L, class007342.u, class007342.y + (double)class070492.method_5751() + (double)0.01f, class007342.R), class06747.N((int)-65536));
        }
        if (class070492 instanceof class00690) {
            class00690 class006902 = (class00690)class070492;
            for (class00695 class006952 : class006902.E()) {
                class06889 class068896 = class006952.method_73189();
                class06889 class068897 = class006952.method_30950(f).u(class068896);
                class06724.N(class006952.method_5829().L(class068897), class06747.N((int)class02566.N((float)1.0f, (float)0.25f, (float)1.0f, (float)0.0f)));
            }
        }
        class06889 class068898 = class068894.y(0.0, (double)class070492.method_5751(), 0.0);
        class06889 class068899 = class070492.method_5828(f);
        class06724.y(class068898, class068898.i(class068899.L(2.0)), -16776961);
        if (bl) {
            class068892 = class070492.method_18798();
            class06724.y(class068894, class068894.i(class068892), -256);
        }
    }

    private @Nullable class07049 N(class07049 class070492) {
        class04782 class047822;
        class08337 class083372 = this.N.Na();
        if (class083372 != null && (class047822 = class083372.N(class070492.method_73183().method_27983())) != null) {
            return class047822.method_8469(class070492.method_5628());
        }
        return null;
    }

    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        if ((class03448)this.N.T_3 == null) {
            return;
        }
        for (class07049 class070492 : ((class03448)this.N.T_3).M()) {
            if (class070492.method_5767() || !class013832.method_23093(class070492.method_5829()) || class070492 == this.N.F() && ((class05630)this.N.i_7).NS() == class05455.field_26664) continue;
            this.N(class070492, f, false);
            if (!class07529.Y) continue;
            if (this.N(class070492) != null) {
                this.N(class070492, f, true);
                continue;
            }
            class06724.N("Missing Server Entity", class070492.method_30950(f).y(0.0, class070492.method_5829().L() + 1.5, 0.0), class06715.N(-65536));
        }
    }
}

