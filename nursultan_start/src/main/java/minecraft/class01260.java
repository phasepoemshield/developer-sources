/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class04688
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07307
 */
package minecraft;

import java.util.Optional;
import minecraft.class00500;
import minecraft.class01284;
import minecraft.class04688;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07307;

public class class01260
extends class01284 {
    private final class07049 N;

    public class01260(class07049 class070492) {
        this.N = class070492;
    }

    public Optional N(class07307 class073072, class07290 class072902, class07209 class072092, class00500 class005002, class04688 class046882) {
        float f;
        float f2;
        Optional<Float> var6 = super.N(class073072, class072902, class072092, class005002, class046882);
        if (var6.isPresent() && (f2 = this.N.method_5774(class073072, class072902, class072092, class005002, class046882, f = var6.get().floatValue())) != f) {
            return Optional.of(Float.valueOf(f2));
        }
        return var6;
    }

    private /* synthetic */ Float N(class07307 class073072, class07290 class072902, class07209 class072092, class00500 class005002, class04688 class046882, Float f) {
        return Float.valueOf(this.N.method_5774(class073072, class072902, class072092, class005002, class046882, f.floatValue()));
    }

    @Override
    public boolean N(class07307 class073072, class07290 class072902, class07209 class072092, class00500 class005002, float f) {
        return this.N.method_5853(class073072, class072902, class072092, class005002, f);
    }
}

