/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class06573
 *  minecraft.class06584
 *  minecraft.class07036
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07267
 *  minecraft.class07299
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class06502;
import minecraft.class06573;
import minecraft.class06584;
import minecraft.class07036;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07267;
import minecraft.class07299;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class06494
extends class06502 {
    public class06494(class00891 class008912, class00891 class008913, class06573 class065732) {
        super(class008912, class008913, class07211.field_11033, class065732);
    }

    public class06494(class06573 class065732, class00891 class008912, class00891 class008913, class07211 class072112) {
        super(class008912, class008913, class072112, class065732);
    }

    protected boolean N(class07209 class072092, class07299 class072992, @Nullable class08036 class080362, class06584 class065842, class00500 class005002) {
        class00394 class003942;
        boolean bl = super.N(class072092, class072992, class080362, class065842, class005002);
        if (!class072992.method_8608() && !bl && class080362 != null && (class003942 = class072992.method_8321(class072092)) instanceof class07267) {
            class07267 class072672 = (class07267)class003942;
            class003942 = class072992.method_8320(class072092).i();
            if (class003942 instanceof class07036) {
                ((class07036)class003942).N(class080362, class072672, true);
            }
        }
        return bl;
    }
}

