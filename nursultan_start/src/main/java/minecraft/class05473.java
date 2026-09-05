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

import minecraft.class05444;
import minecraft.class05459;
import minecraft.class05464;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07475;
import org.jspecify.annotations.Nullable;

public class class05473 {
    public static @Nullable class06889 N(class07475 class074752, int n, int n2, int n3, class06889 class068892, double d) {
        class06889 class068893 = class068892.N(class074752.method_23317(), class074752.method_23318(), class074752.method_23321());
        boolean bl = class05459.N(class074752, n);
        return class05464.N(class074752, () -> {
            class07209 class072092 = class05444.N(class074752, n, n2, n3, class068892.M, class068892.Z, d, bl);
            if (class072092 == null || class05459.N(class074752, class072092)) {
                return null;
            }
            return class072092;
        });
    }
}

