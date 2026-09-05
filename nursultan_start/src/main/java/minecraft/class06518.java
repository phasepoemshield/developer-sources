/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00737
 *  minecraft.class01235
 *  minecraft.class02197
 *  minecraft.class02477
 *  minecraft.class02523
 *  minecraft.class02661
 *  minecraft.class02833
 *  minecraft.class02834
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class07451
 *  minecraft.class07463
 *  minecraft.class07471
 *  minecraft.class07517
 *  minecraft.class08005
 *  minecraft.class08008
 *  minecraft.class08036
 */
package minecraft;

import java.util.List;
import minecraft.class00737;
import minecraft.class01235;
import minecraft.class02197;
import minecraft.class02477;
import minecraft.class02523;
import minecraft.class02661;
import minecraft.class02833;
import minecraft.class02834;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class06509;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07451;
import minecraft.class07463;
import minecraft.class07471;
import minecraft.class07517;
import minecraft.class08005;
import minecraft.class08008;
import minecraft.class08036;

public class class06518
extends class06581
implements class02661 {
    public static final int N = 10;
    public static final float y = 8.0f;
    public static final float L = 2.5f;

    public static class02197 L() {
        return new class02197(List.of(), 1.0f, 2, false);
    }

    public class06518(class06573 class065732) {
        super(class065732);
    }

    @Override
    public class06509 y(class06584 class065842) {
        return class06509.field_63380;
    }

    public static class02833 y() {
        return class02833.N().N(class05298.u, new class07471(M, 8.0, class07463.field_6328), class02834.field_49217).N(class05298.R, new class07471(B, (double)-2.9f, class07463.field_6328), class02834.field_49217).N();
    }

    public class08005 N(class07299 class072992, class00737 class007372, class06584 class065842, class07211 class072112) {
        class07517 class075172 = new class07517(class072992, class007372.N(), class007372.y(), class007372.L(), class065842.L(1));
        class075172.y = class08008.field_7593;
        return class075172;
    }

    @Override
    public class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (class065842.b()) {
            return class07082.u;
        }
        if (class07323.N((class06584)class065842, (class07438)class080362) > 0.0f && !class080362.method_5721()) {
            return class07082.u;
        }
        class080362.method_6019(class070502);
        return class07082.L;
    }

    @Override
    public boolean N(class06584 class065842, class07299 class072992, class07438 class074382, int n) {
        if (!(class074382 instanceof class08036)) {
            return false;
        }
        class08036 class080362 = (class08036)class074382;
        if (this.N(class065842, class074382) - n < 10) {
            return false;
        }
        float f = class07323.N((class06584)class065842, (class07438)class080362);
        if (f > 0.0f && !class080362.method_5721()) {
            return false;
        }
        if (class065842.b()) {
            return false;
        }
        class03556 var8 = class07323.y((class06584)class065842, (class02477)class02523.O).orElse(class04909.Qh);
        class080362.method_7259(class01235.L.y((Object)this));
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class065842.N(1, class080362);
            if (f == 0.0f) {
                class06584 class065843 = class065842.y(1, (class07438)class080362);
                class07517 class075172 = (class07517)class08005.N(class07517::new, (class04782)class047822, (class06584)class065843, (class07438)class080362, (float)0.0f, (float)2.5f, (float)1.0f);
                if (class080362.method_56992()) {
                    class075172.y = class08008.field_7594;
                }
                class072992.method_43129(null, (class07049)class075172, (class04891)var8.N(), class04911.field_15248, 1.0f, 1.0f);
                return true;
            }
        }
        if (f > 0.0f) {
            float f2 = class080362.method_36454();
            float f3 = class080362.method_36455();
            float f4 = -class04995.m((double)(f2 * ((float)Math.PI / 180))) * class04995.P((double)(f3 * ((float)Math.PI / 180)));
            float f5 = -class04995.m((double)(f3 * ((float)Math.PI / 180)));
            float f6 = class04995.P((double)(f2 * ((float)Math.PI / 180))) * class04995.P((double)(f3 * ((float)Math.PI / 180)));
            float f7 = class04995.N((float)(f4 * f4 + f5 * f5 + f6 * f6));
            class080362.method_5762((double)(f4 *= f / f7), (double)(f5 *= f / f7), (double)(f6 *= f / f7));
            class080362.method_40126(20, 8.0f, class065842);
            if (class080362.method_24828()) {
                float f8 = 1.1999999f;
                class080362.method_5784(class07451.field_6308, new class06889(0.0, 1.1999999284744263, 0.0));
            }
            class072992.method_43129(null, (class07049)class080362, (class04891)var8.N(), class04911.field_15248, 1.0f, 1.0f);
            return true;
        }
        return false;
    }

    @Override
    public int N(class06584 class065842, class07438 class074382) {
        return 72000;
    }
}

