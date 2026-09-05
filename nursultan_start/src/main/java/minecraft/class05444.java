/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07475
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class05459;
import minecraft.class05464;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07475;
import org.jspecify.annotations.Nullable;

public class class05444 {
    public static @Nullable class06889 N(class07475 class074752, int n, int n2, int n3, double d, double d2, double d3) {
        boolean bl = class05459.N(class074752, n);
        return class05464.N(class074752, () -> class05444.N(class074752, n, n2, n3, d, d2, d3, bl));
    }

    public static @Nullable class07209 N(class07475 class074752, int n, int n2, int n3, double d, double d2, double d3, boolean bl) {
        class07209 class072093 = class05464.N(class074752.method_59922(), 0.0, n, n2, n3, d, d2, d3);
        if (class072093 == null) {
            return null;
        }
        class07209 class072094 = class05464.N(class074752, (double)n, class074752.method_59922(), class072093);
        if (class05459.N(class072094, class074752) || class05459.N(bl, class074752, class072094)) {
            return null;
        }
        if (class05459.y(class074752, class072094 = class05464.N(class072094, class074752.method_73183().method_31600(), class072092 -> class05459.L(class074752, class072092)))) {
            return null;
        }
        return class072094;
    }
}

