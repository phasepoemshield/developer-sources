/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class04688
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07307
 */
package minecraft;

import java.util.Optional;
import minecraft.class00500;
import minecraft.class04688;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07307;

public class class01284 {
    public boolean N(class07307 class073072, class07049 class070492) {
        return true;
    }

    public float N(class07049 class070492) {
        return 1.0f;
    }

    public float N(class07307 class073072, class07049 class070492, float f) {
        float f2 = class073072.i() * 2.0f;
        class06889 class068892 = class073072.R();
        double d = Math.sqrt(class070492.method_5707(class068892)) / (double)f2;
        double d2 = (1.0 - d) * (double)f;
        return (float)((d2 * d2 + d2) / 2.0 * 7.0 * (double)f2 + 1.0);
    }

    public boolean N(class07307 class073072, class07290 class072902, class07209 class072092, class00500 class005002, float f) {
        return true;
    }

    public Optional<Float> N(class07307 class073072, class07290 class072902, class07209 class072092, class00500 class005002, class04688 class046882) {
        if (class005002.P() && class046882.W()) {
            return Optional.empty();
        }
        return Optional.of(Float.valueOf(Math.max(class005002.i().R(), class046882.z())));
    }
}

