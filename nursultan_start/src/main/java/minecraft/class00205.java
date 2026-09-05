/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class00956
 *  minecraft.class00974
 *  minecraft.class00985
 *  minecraft.class00997
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class02566
 *  minecraft.class03356
 *  minecraft.class03358
 *  minecraft.class03575
 *  minecraft.class06715
 *  minecraft.class06724
 *  minecraft.class06747
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07209
 *  minecraft.class08141
 *  minecraft.class08610
 *  minecraft.class08635
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00394;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00956;
import minecraft.class00974;
import minecraft.class00985;
import minecraft.class00997;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class02566;
import minecraft.class03356;
import minecraft.class03358;
import minecraft.class03575;
import minecraft.class06715;
import minecraft.class06724;
import minecraft.class06747;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07209;
import minecraft.class08141;
import minecraft.class08610;
import minecraft.class08635;
import org.jspecify.annotations.Nullable;

public class class00205
implements class03358<class08610, class00997> {
    private static final float N = 0.02f;
    private final class03575<class08610> y = new class03575();
    private final class03356<class08610> L = new class03356();

    public class00997 i() {
        return new class00997();
    }

    public boolean N(class08610 class086102, class06889 class068892) {
        return this.y.N((class00394)class086102, class068892) || this.L.N((class00394)class086102, class068892);
    }

    public void N(class00997 class009972, class01421 class014212, class01237 class012372, class06959 class069592) {
        this.y.N(class009972.N, class014212, class012372, class069592);
        this.L.N(class009972.y, class014212, class012372, class069592);
        for (class08635 class086352 : class009972.L) {
            this.N(class086352);
        }
    }

    private void N(class08635 class086352) {
        class07209 class072092 = class086352.N();
        class06724.N((class00734)new class00734(class072092).M((double)0.02f), (class06747)class06747.y((int)class02566.N((float)0.375f, (float)1.0f, (float)0.0f, (float)0.0f)));
        String string = class086352.y().getString();
        float f = 0.16f;
        class06724.N((String)string, (class06889)class06889.N((class00753)class072092, (double)0.5, (double)1.2, (double)0.5), (class06715)class06715.N().N(0.16f)).N();
    }

    public void N(class08610 class086102, class00997 class009972, float f, class06889 class068892, @Nullable class08141 class081412) {
        super.N((class00394)class086102, (class00985)class009972, f, class068892, class081412);
        class009972.N = new class00956();
        class00985.N((class00394)class086102, (class00985)class009972.N, (class08141)class081412);
        class03575.N((class00394)class086102, (class00956)class009972.N, (float)f, (class06889)class068892);
        class009972.y = new class00974();
        class00985.N((class00394)class086102, (class00985)class009972.y, (class08141)class081412);
        class03356.N((class00394)class086102, (class00974)class009972.y);
        class009972.L.clear();
        for (class08635 class086352 : class086102.t()) {
            class009972.L.add(new class08635(class086352.N(), class086352.y()));
        }
    }

    public int u_() {
        return Math.max(this.y.u_(), this.L.u_());
    }

    public boolean t_() {
        return this.y.t_() || this.L.t_();
    }
}

