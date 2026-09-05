/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00138
 *  minecraft.class00143
 *  minecraft.class00429
 *  minecraft.class00450
 *  minecraft.class00457
 *  minecraft.class00734
 *  minecraft.class01383
 *  minecraft.class01763
 *  minecraft.class01857
 *  minecraft.class02566
 *  minecraft.class04995
 *  minecraft.class06715
 *  minecraft.class06724
 *  minecraft.class06747
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 */
package minecraft;

import java.util.Locale;
import minecraft.class00138;
import minecraft.class00143;
import minecraft.class00429;
import minecraft.class00450;
import minecraft.class00457;
import minecraft.class00734;
import minecraft.class01383;
import minecraft.class01763;
import minecraft.class01857;
import minecraft.class02566;
import minecraft.class04995;
import minecraft.class06715;
import minecraft.class06724;
import minecraft.class06747;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;

public class class01645
implements class01857 {
    private static final float N = 80.0f;
    private static final int y = 8;
    private static final boolean L = false;
    private static final boolean u = true;
    private static final boolean i = false;
    private static final boolean R = false;
    private static final boolean M = true;
    private static final boolean B = true;
    private static final float Z = 0.32f;

    public static void N(class00143 class001432, double d, double d2, double d3) {
        if (class001432.i() < 2) {
            return;
        }
        class06889 class068892 = class001432.N(0).i();
        for (int i = 1; i < class001432.i(); ++i) {
            class01763 class017632 = class001432.N(i);
            if (class01645.N(class017632.u(), d, d2, d3) > 80.0f) {
                class068892 = class017632.i();
                continue;
            }
            int n = class02566.M((int)class04995.M((float)((float)i / (float)class001432.i() * 0.33f), (float)0.9f, (float)0.9f));
            class06724.y((class06889)class068892.y(0.5, 0.5, 0.5), (class06889)class017632.i().y(0.5, 0.5, 0.5), (int)n);
            class068892 = class017632.i();
        }
    }

    private static float N(class07209 class072092, double d, double d2, double d3) {
        return (float)(Math.abs((double)class072092.method_10263() - d) + Math.abs((double)class072092.method_10264() - d2) + Math.abs((double)class072092.method_10260() - d3));
    }

    private static /* synthetic */ void N(class00457 class004572, double d, double d2, double d3, class07049 class070492) {
        class00450 class004502 = (class00450)class004572.N(class00429.R, class070492);
        if (class004502 != null) {
            class01645.N(d, d2, d3, class004502.N(), class004502.y());
        }
    }

    public static void N(class00143 class001432, float f, boolean bl, boolean bl2, double d, double d2, double d3) {
        class01645.N(class001432, d, d2, d3);
        class07209 class072092 = class001432.E();
        if (class01645.N(class072092, d, d2, d3) <= 80.0f) {
            class06724.N((class00734)new class00734((double)((float)class072092.method_10263() + 0.25f), (double)((float)class072092.method_10264() + 0.25f), (double)class072092.method_10260() + 0.25, (double)((float)class072092.method_10263() + 0.75f), (double)((float)class072092.method_10264() + 0.75f), (double)((float)class072092.method_10260() + 0.75f)), (class06747)class06747.y((int)class02566.N((float)0.5f, (float)0.0f, (float)1.0f, (float)0.0f)));
            for (int i = 0; i < class001432.i(); ++i) {
                class01763 class017632 = class001432.N(i);
                if (!(class01645.N(class017632.u(), d, d2, d3) <= 80.0f)) continue;
                float f2 = i == class001432.R() ? 1.0f : 0.0f;
                float f3 = i == class001432.R() ? 0.0f : 1.0f;
                class01763 class017633 = new class00734((double)((float)class017632.N + 0.5f - f), (double)((float)class017632.y + 0.01f * (float)i), (double)((float)class017632.L + 0.5f - f), (double)((float)class017632.N + 0.5f + f), (double)((float)class017632.y + 0.25f + 0.01f * (float)i), (double)((float)class017632.L + 0.5f + f));
                class06724.N((class00734)class017633, (class06747)class06747.y((int)class02566.N((float)0.5f, (float)f2, (float)0.0f, (float)f3)));
            }
        }
        class00138 class001382 = class001432.U();
        if (bl && class001382 != null) {
            for (class01763 class017633 : class001382.y()) {
                if (!(class01645.N(class017633.u(), d, d2, d3) <= 80.0f)) continue;
                class06724.N((class00734)new class00734((double)((float)class017633.N + 0.5f - f / 2.0f), (double)((float)class017633.y + 0.01f), (double)((float)class017633.L + 0.5f - f / 2.0f), (double)((float)class017633.N + 0.5f + f / 2.0f), (double)class017633.y + 0.1, (double)((float)class017633.L + 0.5f + f / 2.0f)), (class06747)class06747.y((int)class02566.N((float)0.5f, (float)1.0f, (float)0.8f, (float)0.8f)));
            }
            for (class01763 class017633 : class001382.N()) {
                if (!(class01645.N(class017633.u(), d, d2, d3) <= 80.0f)) continue;
                class06724.N((class00734)new class00734((double)((float)class017633.N + 0.5f - f / 2.0f), (double)((float)class017633.y + 0.01f), (double)((float)class017633.L + 0.5f - f / 2.0f), (double)((float)class017633.N + 0.5f + f / 2.0f), (double)class017633.y + 0.1, (double)((float)class017633.L + 0.5f + f / 2.0f)), (class06747)class06747.y((int)class02566.N((float)0.5f, (float)0.8f, (float)1.0f, (float)1.0f)));
            }
        }
        if (bl2) {
            for (int i = 0; i < class001432.i(); ++i) {
                class01763 class017634 = class001432.N(i);
                if (!(class01645.N(class017634.u(), d, d2, d3) <= 80.0f)) continue;
                class06724.N((String)String.valueOf(class017634.E), (class06889)new class06889((double)class017634.N + 0.5, (double)class017634.y + 0.75, (double)class017634.L + 0.5), (class06715)class06715.N().N(0.32f)).N();
                class06724.N((String)String.format(Locale.ROOT, "%.2f", Float.valueOf(class017634.U)), (class06889)new class06889((double)class017634.N + 0.5, (double)class017634.y + 0.25, (double)class017634.L + 0.5), (class06715)class06715.N().N(0.32f)).N();
            }
        }
    }

    private static void N(double d, double d2, double d3, class00143 class001432, float f) {
        class01645.N(class001432, f, true, true, d, d2, d3);
    }

    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        class004572.L(class00429.R, (class070492, class004502) -> class01645.N(d, d2, d3, class004502.N(), class004502.y()));
    }
}

