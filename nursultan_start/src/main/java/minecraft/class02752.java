/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03794
 *  minecraft.class07211
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class02733;
import minecraft.class02759;
import minecraft.class03794;
import minecraft.class07211;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class02752 {
    public static @Nullable class02733 N(class07299 class072992, @Nullable class07211 class072112, @Nullable class07211 class072113) {
        if (class072992.method_45162().y(class03794.L)) {
            class02733 class027332 = class02733.N(class072992.field_9229).N(class02759.field_52681);
            if (class072113 != null) {
                class027332 = class027332.N(class072113);
            }
            if (class072112 != null) {
                class027332 = class027332.y(class072112);
            }
            return class027332;
        }
        return null;
    }

    public static @Nullable class02733 N(@Nullable class02733 class027332, class07211 class072112) {
        return class027332 == null ? null : class027332.y(class072112);
    }
}

