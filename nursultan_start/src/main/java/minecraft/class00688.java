/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01284
 *  minecraft.class04688
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07307
 */
package minecraft;

import java.util.Optional;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01284;
import minecraft.class04688;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07307;

class class00688
extends class01284 {
    class00688() {
    }

    public boolean N(class07307 class073072, class07290 class072902, class07209 class072092, class00500 class005002, float f) {
        if (class005002.N(class00869.iq)) {
            return false;
        }
        return super.N(class073072, class072902, class072092, class005002, f);
    }

    public Optional<Float> N(class07307 class073072, class07290 class072902, class07209 class072092, class00500 class005002, class04688 class046882) {
        if (class005002.N(class00869.iq)) {
            return Optional.empty();
        }
        return super.N(class073072, class072902, class072092, class005002, class046882);
    }
}

