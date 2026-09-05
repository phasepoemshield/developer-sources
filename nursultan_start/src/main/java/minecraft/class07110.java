/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01231
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04983
 *  minecraft.class06069
 *  minecraft.class06942
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01231;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04983;
import minecraft.class06069;
import minecraft.class06942;
import minecraft.class07132;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public class class07110
extends class04983
implements class07132 {
    public static final MapCodec<class07110> N = class07110.y(class07110::new);
    private static final double M = 0.14;
    private static final class00494 B = class00891.y((double)16.0, (double)0.0, (double)9.0);

    public class07110(class01362 class013622) {
        super(class013622, class07211.field_11036, B, true, 0.14);
    }

    protected boolean U(class00500 class005002) {
        return !class005002.N(class00869.EI);
    }

    protected class04688 u(class00500 class005002) {
        return class04684.L.N(false);
    }

    protected class00891 u() {
        return class00869.Wr;
    }

    protected boolean E(class00500 class005002) {
        return class005002.N(class00869.K);
    }

    public @Nullable class00500 N(class06942 class069422) {
        class04688 class046882 = class069422.method_8045().method_8316(class069422.method_8037());
        if (class046882.N(class01231.N) && class046882.R() == 8) {
            return super.N(class069422);
        }
        return null;
    }

    public MapCodec<class07110> N() {
        return N;
    }

    protected int N(class06069 class060692) {
        return 1;
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

