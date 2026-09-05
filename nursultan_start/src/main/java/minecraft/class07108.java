/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04978
 *  minecraft.class04983
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00389;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04978;
import minecraft.class04983;
import minecraft.class07132;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public class class07108
extends class04978
implements class07132 {
    public static final MapCodec<class07108> N = class07108.y(class07108::new);

    protected class04983 L() {
        return (class04983)class00869.Wh;
    }

    public class07108(class01362 class013622) {
        super(class013622, class07211.field_11036, class00389.y(), true);
    }

    protected boolean U(class00500 class005002) {
        return this.L().U(class005002);
    }

    protected class04688 u(class00500 class005002) {
        return class04684.L.N(false);
    }

    public MapCodec<class07108> N() {
        return N;
    }

    @Override
    public boolean N(class07284 class072842, class07209 class072092, class00500 class005002, class04688 class046882) {
        return false;
    }

    @Override
    public boolean N(@Nullable class07438 class074382, class07290 class072902, class07209 class072092, class00500 class005002, class04651 class046512) {
        return false;
    }
}

