/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04770
 *  minecraft.class07808
 *  minecraft.class07947
 */
package minecraft;

import java.util.UUID;
import minecraft.class00392;
import minecraft.class04770;
import minecraft.class07379;
import minecraft.class07382;
import minecraft.class07393;
import minecraft.class07403;
import minecraft.class07406;
import minecraft.class07808;
import minecraft.class07947;

public class class07416 {
    public static boolean N(class07393 class073932, class07403 class074032) {
        class073932.N(() -> class073932.M().N(false, class074032));
        return true;
    }

    public static boolean N(class07393 class073932, class07379 class073792, class07403 class074032) {
        class00392 class003922 = class073792.N().N().orElse(null);
        if (class003922 == null) {
            return false;
        }
        if (class073792.L().isPresent()) {
            if (class073792.L().get().isEmpty()) {
                return false;
            }
            for (class07947 class079472 : class073792.L().get()) {
                class04770 class047702;
                if (class079472.N().isPresent()) {
                    class047702 = class073932.L().N((UUID)class079472.N().get());
                } else {
                    if (!class079472.y().isPresent()) continue;
                    class047702 = class073932.L().L((String)class079472.y().get());
                }
                if (class047702 == null) continue;
                class047702.method_43502(class003922, class073792.y());
            }
        } else {
            class073932.M().N(class003922, class073792.y(), class074032);
        }
        return true;
    }

    public static class07382 N(class07393 class073932) {
        if (!class073932.M().N()) {
            return class07382.y;
        }
        return new class07382(true, class07406.N(class073932), class07808.N());
    }

    public static boolean N(class07393 class073932, boolean bl, class07403 class074032) {
        return class073932.M().N(true, bl, true, class074032);
    }
}

