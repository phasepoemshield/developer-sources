/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01284
 *  minecraft.class03543
 *  minecraft.class04688
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07307
 *  minecraft.class08036
 */
package minecraft;

import java.util.Optional;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01284;
import minecraft.class03543;
import minecraft.class04688;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07307;
import minecraft.class08036;

public class class02247
extends class01284 {
    private final boolean N;
    private final boolean y;
    private final Optional<Float> L;
    private final Optional<class03543<class00891>> u;

    public class02247(boolean bl, boolean bl2, Optional<Float> optional, Optional<class03543<class00891>> optional2) {
        this.N = bl;
        this.y = bl2;
        this.L = optional;
        this.u = optional2;
    }

    public boolean N(class07307 class073072, class07049 class070492) {
        return this.y;
    }

    public float N(class07049 class070492) {
        return class070492 instanceof class08036 && ((class08036)class070492).method_31549().y ? 0.0f : this.L.orElseGet(() -> Float.valueOf(super.N(class070492))).floatValue();
    }

    public Optional<Float> N(class07307 class073072, class07290 class072902, class07209 class072092, class00500 class005002, class04688 class046882) {
        if (this.u.isPresent()) {
            if (class005002.N(this.u.get())) {
                return Optional.of(Float.valueOf(3600000.0f));
            }
            return Optional.empty();
        }
        return super.N(class073072, class072902, class072092, class005002, class046882);
    }

    public boolean N(class07307 class073072, class07290 class072902, class07209 class072092, class00500 class005002, float f) {
        return this.N;
    }
}

