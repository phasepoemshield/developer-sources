/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01289
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class04877
 *  minecraft.class05359
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class01289;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class04877;
import minecraft.class05359;
import minecraft.class07438;

public class class06303 {
    public static class04142<class07438> N() {
        return class04137.N_42(class041282 -> class041282.point((class047822, class074382, l) -> {
            if (class047822.field_9229.y(20) != 0) {
                return false;
            }
            class01289 var4 = class074382.method_18868();
            class04877 class048772 = class047822.method_19502(class074382.method_24515());
            if (class048772 == null || class048772.u() || class048772.R()) {
                var4.y(class05359.y);
                var4.N(class047822.method_75728(), class047822.N(), class074382.method_73189());
            }
            return true;
        }));
    }
}

