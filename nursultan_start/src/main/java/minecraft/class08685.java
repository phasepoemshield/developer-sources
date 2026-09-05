/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00007
 *  minecraft.class00023
 *  minecraft.class00028
 *  minecraft.class00036
 *  minecraft.class00945
 *  minecraft.class01054
 *  minecraft.class01683
 *  minecraft.class01894
 *  minecraft.class02233
 *  minecraft.class02566
 *  minecraft.class03106
 *  minecraft.class03386
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class07049
 *  minecraft.class07299
 *  minecraft.class08301
 *  minecraft.class08394
 *  minecraft.class08657
 */
package minecraft;

import minecraft.class00007;
import minecraft.class00023;
import minecraft.class00028;
import minecraft.class00036;
import minecraft.class00945;
import minecraft.class01054;
import minecraft.class01683;
import minecraft.class01894;
import minecraft.class02233;
import minecraft.class02566;
import minecraft.class03106;
import minecraft.class03386;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class07049;
import minecraft.class07299;
import minecraft.class08301;
import minecraft.class08394;
import minecraft.class08657;

public class class08685
implements class08657 {
    private static final class01894 i = class01894.y((String)"hud/locator_bar_background");
    private static final class01894 R = class01894.y((String)"hud/locator_bar_arrow_up");
    private static final class01894 M = class01894.y((String)"hud/locator_bar_arrow_down");
    private static final int B = 9;
    private static final int Z = 60;
    private static final int z = 7;
    private static final int U = 5;
    private static final int E = 1;
    private static final int W = 1;
    private final class06202 m;

    public class08685(class06202 class062022) {
        this.m = class062022;
    }

    public void y(class01054 class010542, class02233 class022332) {
        int n = this.y(this.m.Nt());
        class07049 class070493 = this.m.F();
        if (class070493 == null) {
            return;
        }
        class07299 class072992 = class070493.method_73183();
        class03106 class031062 = class072992.method_54719();
        class00945 class009452 = class070492 -> class022332.N(!class031062.N(class070492));
        ((class01683)((class04453)this.m.T_4).y_0).O().N(class070493, (T class000372) -> {
            if (class000372.N().left().map(uUID -> uUID.equals(class070493.method_5667())).orElse(false).booleanValue()) {
                return;
            }
            double d = class000372.N(class072992, (class00023)((class03386)this.m.i_5).s(), class009452);
            if (d <= -60.0 || d > 60.0) {
                return;
            }
            int n2 = class04995.u((float)((float)(class010542.N() - 9) / 2.0f));
            class00028 class000282 = class000372.y();
            class08301 class083012 = this.m.a().N(class000282.u);
            float f = class04995.N((float)((float)class000372.N(class070493)));
            class01894 class018942 = class083012.N(f);
            int n3 = class000282.i.orElseGet(() -> (Integer)class000372.N().map(uUID -> class02566.L((int)class02566.R((int)255, (int)uUID.hashCode()), (float)0.9f), string -> class02566.L((int)class02566.R((int)255, (int)string.hashCode()), (float)0.9f)));
            int n4 = class04995.N((double)(d * 173.0 / 2.0 / 60.0));
            class010542.N(class08394.Na, class018942, n2 + n4, n - 2, 9, 9, n3);
            class00036 class000362 = class000372.N(class072992, (class00007)((class03386)this.m.i_5), class009452);
            if (class000362 != class00036.field_60423) {
                class01894 class018943;
                int n5;
                if (class000362 == class00036.field_60425) {
                    n5 = 6;
                    class018943 = M;
                } else {
                    n5 = -6;
                    class018943 = R;
                }
                class010542.N(class08394.Na, class018943, n2 + n4 + 1, n + n5, 7, 5);
            }
        });
    }

    public void N(class01054 class010542, class02233 class022332) {
        class010542.N(class08394.Na, i, this.N(this.m.Nt()), this.y(this.m.Nt()), 182, 5);
    }
}

