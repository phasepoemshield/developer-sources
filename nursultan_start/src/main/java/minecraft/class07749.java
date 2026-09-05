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
 *  minecraft.class05487
 *  minecraft.class06092
 *  minecraft.class06584
 *  minecraft.class06761
 *  minecraft.class06942
 *  minecraft.class07132
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class08059
 *  minecraft.class08064
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
import minecraft.class05487;
import minecraft.class06092;
import minecraft.class06584;
import minecraft.class06761;
import minecraft.class06942;
import minecraft.class07132;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class08059;
import minecraft.class08064;
import org.jspecify.annotations.Nullable;

public class class07749
extends class06761
implements class07132 {
    public static final MapCodec<class07749> L = class07749.y(class07749::new);
    public static final class08064<class08059> u = class06761.y;
    private static final class00494 i = class00891.y((double)12.0, (double)0.0, (double)16.0);

    public class07749(class01362 class013622) {
        super(class013622);
    }

    protected class04688 u(class00500 class005002) {
        return class04684.L.N(false);
    }

    public MapCodec<class07749> N() {
        return L;
    }

    public boolean N(@Nullable class07438 class074382, class07290 class072902, class07209 class072092, class00500 class005002, class04651 class046512) {
        return false;
    }

    public boolean N(class07284 class072842, class07209 class072092, class00500 class005002, class04688 class046882) {
        return false;
    }

    protected boolean N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return class005002.L(class072902, class072092, class07211.field_11036) && !class005002.N(class00869.EI);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return i;
    }

    public @Nullable class00500 N(class06942 class069422) {
        class04688 class046882;
        class00500 class005002 = super.N(class069422);
        if (class005002 != null && (class046882 = class069422.method_8045().method_8316(class069422.method_8037().method_10084())).N(class01231.N) && class046882.R() == 8) {
            return class005002;
        }
        return null;
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return new class06584((class07310)class00869.yJ);
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        if (class005002.L(u) == class08059.field_12609) {
            class00500 class005003 = class054872.method_8320(class072092.method_10074());
            return class005003.N((class00891)this) && class005003.L(u) == class08059.field_12607;
        }
        class04688 class046882 = class054872.method_8316(class072092);
        return super.a_(class005002, class054872, class072092) && class046882.N(class01231.N) && class046882.R() == 8;
    }
}

