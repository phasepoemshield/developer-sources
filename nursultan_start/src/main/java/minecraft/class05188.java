/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00624
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class01210
 *  minecraft.class01312
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07322
 *  minecraft.class07438
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Iterator;
import java.util.function.Function;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00624;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class01210;
import minecraft.class01312;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07322;
import minecraft.class07438;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class05188 {
    public static class00494 N(class07290 class072902, class07209 class072092) {
        class00500 class005002 = class072902.method_8320(class072092);
        if (class005002.N(class01210.yu) || class005002.i() instanceof class00624 && ((Boolean)class005002.L((class08092)class00624.y)).booleanValue()) {
            return class00389.N();
        }
        return class005002.M(class072902, class072092);
    }

    public static double N(class07209 class072092, int n, Function<class07209, class00494> function) {
        class07218 class072182 = class072092.method_25503();
        for (int i = 0; i < n; ++i) {
            class00494 class004942 = function.apply((class07209)class072182);
            if (!class004942.method_1110()) {
                return (double)(class072092.method_10264() + i) + class004942.method_1091(class07185.field_11052);
            }
            class072182.N(class07211.field_11036);
        }
        return Double.POSITIVE_INFINITY;
    }

    public static @Nullable class06889 N(class07078<?> class070782, class07322 class073222, class07209 class072092, boolean bl) {
        if (bl && class070782.N(class073222.method_8320(class072092))) {
            return null;
        }
        double d = class073222.N(class05188.N((class07290)class073222, class072092), () -> class05188.N((class07290)class073222, class072092.method_10074()));
        if (!class05188.N(d)) {
            return null;
        }
        if (bl && d <= 0.0 && class070782.N(class073222.method_8320(class072092.method_10074()))) {
            return null;
        }
        class06889 class068892 = class06889.N((class00753)class072092, (double)d);
        class00734 class007342 = class070782.E().N(class068892);
        Iterator var9 = class073222.method_20812(null, class007342).iterator();
        while (var9.hasNext()) {
            if (((class00494)var9.next()).method_1110()) continue;
            return null;
        }
        if (class070782 == class07078.Ly && (class073222.method_8320(class072092).N(class01210.Lq) || class073222.method_8320(class072092.method_10084()).N(class01210.Lq))) {
            return null;
        }
        if (!class073222.method_8621().N(class007342)) {
            return null;
        }
        return class068892;
    }

    public static int[][] N(class07211 class072112) {
        class07211 class072113 = class072112.R();
        class07211 class072114 = class072113.b();
        class07211 class072115 = class072112.b();
        return new int[][]{{class072113.P(), class072113.T()}, {class072114.P(), class072114.T()}, {class072115.P() + class072113.P(), class072115.T() + class072113.T()}, {class072115.P() + class072114.P(), class072115.T() + class072114.T()}, {class072112.P() + class072113.P(), class072112.T() + class072113.T()}, {class072112.P() + class072114.P(), class072112.T() + class072114.T()}, {class072115.P(), class072115.T()}, {class072112.P(), class072112.T()}};
    }

    public static boolean N(double d) {
        return !Double.isInfinite(d) && d < 1.0;
    }

    public static boolean N(class07322 class073222, class07438 class074382, class00734 class007342) {
        Iterator var4 = class073222.method_20812((class07049)class074382, class007342).iterator();
        while (var4.hasNext()) {
            if (((class00494)var4.next()).method_1110()) continue;
            return false;
        }
        return class073222.method_8621().N(class007342);
    }

    public static boolean N(class07322 class073222, class06889 class068892, class07438 class074382, class01312 class013122) {
        return class05188.N(class073222, class074382, class074382.method_24833(class013122).L(class068892));
    }
}

