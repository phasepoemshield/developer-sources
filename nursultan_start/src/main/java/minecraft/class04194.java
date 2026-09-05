/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10316
 *  minecraft.class00457
 *  minecraft.class00734
 *  minecraft.class01296
 *  minecraft.class01383
 *  minecraft.class01391
 *  minecraft.class01857
 *  minecraft.class02566
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class06202
 *  minecraft.class06724
 *  minecraft.class06747
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 */
package minecraft;

import Nursultan.class10316;
import minecraft.class00457;
import minecraft.class00734;
import minecraft.class01296;
import minecraft.class01383;
import minecraft.class01391;
import minecraft.class01857;
import minecraft.class02566;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class06724;
import minecraft.class06747;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;

public class class04194
implements class01857 {
    private static final float N = 4.0f;
    private static final float y = 1.0f;
    private final class06202 L;
    private static final int u = class02566.y((int)255, (int)0, (int)155, (int)155);
    private static final int i = class02566.y((int)255, (int)255, (int)255, (int)0);
    private static final int R = class02566.N((float)1.0f, (float)0.25f, (float)0.25f, (float)1.0f);
    private class01391 M = new class10316(this);

    public class04194(class06202 class062022) {
        this.L = class062022;
    }

    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        int n;
        int n2;
        class07049 class070492 = ((class03386)this.L.i_5).s().B();
        float f2 = ((class03448)this.L.T_3).method_31607();
        float f3 = ((class03448)this.L.T_3).method_31600() + 1;
        class01296 class012962 = class01296.N((class07209)class070492.method_24515());
        double d4 = class012962.u();
        double d5 = class012962.R();
        for (n2 = -16; n2 <= 32; n2 += 16) {
            for (n = -16; n <= 32; n += 16) {
                class06724.N((class06889)new class06889(d4 + (double)n2, (double)f2, d5 + (double)n), (class06889)new class06889(d4 + (double)n2, (double)f3, d5 + (double)n), (int)class02566.N((float)0.5f, (float)1.0f, (float)0.0f, (float)0.0f), (float)4.0f);
            }
        }
        for (n2 = 2; n2 < 16; n2 += 2) {
            n = n2 % 4 == 0 ? u : i;
            class06724.N((class06889)new class06889(d4 + (double)n2, (double)f2, d5), (class06889)new class06889(d4 + (double)n2, (double)f3, d5), (int)n, (float)1.0f);
            class06724.N((class06889)new class06889(d4 + (double)n2, (double)f2, d5 + 16.0), (class06889)new class06889(d4 + (double)n2, (double)f3, d5 + 16.0), (int)n, (float)1.0f);
        }
        for (n2 = 2; n2 < 16; n2 += 2) {
            n = n2 % 4 == 0 ? u : i;
            class06724.N((class06889)new class06889(d4, (double)f2, d5 + (double)n2), (class06889)new class06889(d4, (double)f3, d5 + (double)n2), (int)n, (float)1.0f);
            class06724.N((class06889)new class06889(d4 + 16.0, (double)f2, d5 + (double)n2), (class06889)new class06889(d4 + 16.0, (double)f3, d5 + (double)n2), (int)n, (float)1.0f);
        }
        for (n2 = ((class03448)this.L.T_3).method_31607(); n2 <= ((class03448)this.L.T_3).method_31600() + 1; n2 += 2) {
            float f4 = n2;
            int n3 = n2 % 8 == 0 ? u : i;
            class06724.N((class06889)new class06889(d4, (double)f4, d5), (class06889)new class06889(d4, (double)f4, d5 + 16.0), (int)n3, (float)1.0f);
            class06724.N((class06889)new class06889(d4, (double)f4, d5 + 16.0), (class06889)new class06889(d4 + 16.0, (double)f4, d5 + 16.0), (int)n3, (float)1.0f);
            class06724.N((class06889)new class06889(d4 + 16.0, (double)f4, d5 + 16.0), (class06889)new class06889(d4 + 16.0, (double)f4, d5), (int)n3, (float)1.0f);
            class06724.N((class06889)new class06889(d4 + 16.0, (double)f4, d5), (class06889)new class06889(d4, (double)f4, d5), (int)n3, (float)1.0f);
        }
        for (n2 = 0; n2 <= 16; n2 += 16) {
            for (int i = 0; i <= 16; i += 16) {
                class06724.N((class06889)new class06889(d4 + (double)n2, (double)f2, d5 + (double)i), (class06889)new class06889(d4 + (double)n2, (double)f3, d5 + (double)i), (int)R, (float)4.0f);
            }
        }
        class06724.N((class00734)new class00734((double)class012962.u(), (double)class012962.i(), (double)class012962.R(), (double)(class012962.M() + 1), (double)(class012962.B() + 1), (double)(class012962.Z() + 1)), (class06747)class06747.N((int)R, (float)1.0f)).N();
        for (n2 = ((class03448)this.L.T_3).method_31607(); n2 <= ((class03448)this.L.T_3).method_31600() + 1; n2 += 16) {
            class06724.N((class06889)new class06889(d4, (double)n2, d5), (class06889)new class06889(d4, (double)n2, d5 + 16.0), (int)R, (float)4.0f);
            class06724.N((class06889)new class06889(d4, (double)n2, d5 + 16.0), (class06889)new class06889(d4 + 16.0, (double)n2, d5 + 16.0), (int)R, (float)4.0f);
            class06724.N((class06889)new class06889(d4 + 16.0, (double)n2, d5 + 16.0), (class06889)new class06889(d4 + 16.0, (double)n2, d5), (int)R, (float)4.0f);
            class06724.N((class06889)new class06889(d4 + 16.0, (double)n2, d5), (class06889)new class06889(d4, (double)n2, d5), (int)R, (float)4.0f);
        }
    }
}

