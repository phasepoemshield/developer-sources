/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class02676
 *  minecraft.class03748
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class07061
 *  minecraft.class07209
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class02676;
import minecraft.class03748;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class07061;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class07264
extends class00394
implements class07061 {
    private static final class00392 P = class00392.L((String)"container.enchant");
    public int N;
    public float y;
    public float L;
    public float u;
    public float i;
    public float R;
    public float M;
    public float B;
    public float Z;
    public float m;
    private static final class06069 s = class06069.u();
    private @Nullable class00392 T;

    public @Nullable class00392 method_5797() {
        return this.T;
    }

    public class00392 method_5477() {
        if (this.T != null) {
            return this.T;
        }
        return P;
    }

    public class07264(class07209 class072092, class00500 class005002) {
        super(class00404.field_11912, class072092, class005002);
    }

    public void y(class08329 class083292) {
        class083292.L("CustomName");
    }

    protected void N_9(class02666 class026662) {
        super.N_9(class026662);
        this.T = (class00392)class026662.method_58694(class02484.B);
    }

    protected void N(class02676 class026762) {
        super.N(class026762);
        class026762.N(class02484.B, (Object)this.T);
    }

    public void N(@Nullable class00392 class003922) {
        this.T = class003922;
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        class083292.y("CustomName", class03748.N, (Object)this.T);
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.T = class07264.N_10((class08299)class082992, (String)"CustomName");
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class07264 class072642) {
        float f;
        class072642.M = class072642.R;
        class072642.Z = class072642.B;
        class08036 class080362 = class072992.N((double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5, 3.0, false);
        if (class080362 != null) {
            double d = class080362.method_23317() - ((double)class072092.method_10263() + 0.5);
            double d2 = class080362.method_23321() - ((double)class072092.method_10260() + 0.5);
            class072642.m = (float)class04995.u((double)d2, (double)d);
            class072642.R += 0.1f;
            if (class072642.R < 0.5f || s.y(40) == 0) {
                float f2 = class072642.u;
                do {
                    class072642.u += (float)(s.y(4) - s.y(4));
                } while (f2 == class072642.u);
            }
        } else {
            class072642.m += 0.02f;
            class072642.R -= 0.1f;
        }
        while (class072642.B >= (float)Math.PI) {
            class072642.B -= (float)Math.PI * 2;
        }
        while (class072642.B < (float)(-Math.PI)) {
            class072642.B += (float)Math.PI * 2;
        }
        while (class072642.m >= (float)Math.PI) {
            class072642.m -= (float)Math.PI * 2;
        }
        while (class072642.m < (float)(-Math.PI)) {
            class072642.m += (float)Math.PI * 2;
        }
        for (f = class072642.m - class072642.B; f >= (float)Math.PI; f -= (float)Math.PI * 2) {
        }
        while (f < (float)(-Math.PI)) {
            f += (float)Math.PI * 2;
        }
        class072642.B += f * 0.4f;
        class072642.R = class04995.N((float)class072642.R, (float)0.0f, (float)1.0f);
        ++class072642.N;
        class072642.L = class072642.y;
        float f3 = (class072642.u - class072642.y) * 0.4f;
        float f4 = 0.2f;
        f3 = class04995.N((float)f3, (float)-0.2f, (float)0.2f);
        class072642.i += (f3 - class072642.i) * 0.9f;
        class072642.y += class072642.i;
    }
}

