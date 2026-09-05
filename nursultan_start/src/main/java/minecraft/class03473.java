/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00457
 *  minecraft.class00772
 *  minecraft.class01296
 *  minecraft.class01383
 *  minecraft.class01857
 *  minecraft.class02566
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06724
 *  minecraft.class06747
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07739
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.time.Duration;
import java.time.Instant;
import minecraft.class00457;
import minecraft.class00772;
import minecraft.class01296;
import minecraft.class01383;
import minecraft.class01857;
import minecraft.class02566;
import minecraft.class03448;
import minecraft.class03501;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06724;
import minecraft.class06747;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07739;
import org.jspecify.annotations.Nullable;

public class class03473
implements class01857 {
    private static final Duration N = Duration.ofMillis(500L);
    private static final int y = 10;
    private static final int L = class02566.N((float)0.25f, (float)1.0f, (float)1.0f, (float)0.0f);
    private static final int u = class02566.N((float)0.125f, (float)0.25f, (float)0.125f, (float)0.0f);
    private final class06202 i;
    private final class00772 R;
    private Instant M = Instant.now();
    private @Nullable class03501 B;

    public class03473(class06202 class062022, class00772 class007722) {
        this.i = class062022;
        this.R = class007722;
    }

    private static void y(class07739 class077392, class01296 class012962, int n) {
        class077392.method_1064((n2, n3, n4, n5, n6, n7) -> {
            int n8 = n2 + class012962.method_10263();
            int n9 = n3 + class012962.method_10264();
            int n10 = n4 + class012962.method_10260();
            int n11 = n5 + class012962.method_10263();
            int n12 = n6 + class012962.method_10264();
            int n13 = n7 + class012962.method_10260();
            class03473.N(n8, n9, n10, n11, n12, n13, n);
        }, true);
    }

    private static void N(class07211 class072112, int n, int n2, int n3, int n4) {
        class06889 class068892 = new class06889((double)class01296.L((int)n), (double)class01296.L((int)n2), (double)class01296.L((int)n3));
        class06889 class068893 = class068892.y(16.0, 16.0, 16.0);
        class06724.N((class06889)class068892, (class06889)class068893, (class07211)class072112, (class06747)class06747.y((int)n4));
    }

    private static void N(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        double d = class01296.L((int)n);
        double d2 = class01296.L((int)n2);
        double d3 = class01296.L((int)n3);
        double d4 = class01296.L((int)n4);
        double d5 = class01296.L((int)n5);
        double d6 = class01296.L((int)n6);
        int n8 = class02566.M((int)n7);
        class06724.N((class06889)new class06889(d, d2, d3), (class06889)new class06889(d4, d5, d6), (int)n8);
    }

    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        Instant instant = Instant.now();
        if (this.B == null || Duration.between(this.M, instant).compareTo(N) > 0) {
            this.M = instant;
            this.B = new class03501(((class03448)((Object)this.i.T_3)).method_22336(), class01296.N((class07209)((class04453)this.i.T_4).method_24515()), 10, this.R);
        }
        class03473.y(this.B.N, this.B.L, L);
        class03473.y(this.B.y, this.B.L, u);
        class03473.N(this.B.N, this.B.L, L);
        class03473.N(this.B.y, this.B.L, u);
    }

    private static void N(class07739 class077392, class01296 class012962, int n) {
        class077392.method_1046((class072112, n2, n3, n4) -> {
            int n5 = n2 + class012962.method_10263();
            int n6 = n3 + class012962.method_10264();
            int n7 = n4 + class012962.method_10260();
            class03473.N(class072112, n5, n6, n7, n);
        });
    }
}

