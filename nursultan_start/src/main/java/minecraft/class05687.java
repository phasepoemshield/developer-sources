/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00429
 *  minecraft.class00457
 *  minecraft.class00753
 *  minecraft.class01383
 *  minecraft.class01857
 *  minecraft.class02566
 *  minecraft.class03386
 *  minecraft.class05363
 *  minecraft.class06202
 *  minecraft.class06715
 *  minecraft.class06724
 *  minecraft.class06747
 *  minecraft.class06889
 *  minecraft.class07209
 */
package minecraft;

import minecraft.class00429;
import minecraft.class00457;
import minecraft.class00753;
import minecraft.class01383;
import minecraft.class01857;
import minecraft.class02566;
import minecraft.class03386;
import minecraft.class05363;
import minecraft.class06202;
import minecraft.class06715;
import minecraft.class06724;
import minecraft.class06747;
import minecraft.class06889;
import minecraft.class07209;

public class class05687
implements class01857 {
    private static final int N = 160;
    private static final float y = 0.64f;
    private final class06202 L;

    public class05687(class06202 class062022) {
        this.L = class062022;
    }

    private static void N(String string, class07209 class072092, int n) {
        class06724.N((String)string, (class06889)class06889.N((class00753)class072092, (double)0.5, (double)1.3, (double)0.5), (class06715)class06715.y((int)n).N(0.64f)).N();
    }

    private class05363 N() {
        return ((class03386)this.L.i_5).s();
    }

    private static void N(class07209 class072092) {
        class06724.N((class07209)class072092, (class06747)class06747.y((int)class02566.N((float)0.15f, (float)1.0f, (float)0.0f, (float)0.0f)));
        class05687.N("Raid center", class072092, -65536);
    }

    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        class07209 class072092 = this.N().u();
        class004572.N(class00429.E, (class073212, list) -> {
            for (class07209 class072093 : list) {
                if (!class072092.method_19771((class00753)class072093, 160.0)) continue;
                class05687.N(class072093);
            }
        });
    }
}

