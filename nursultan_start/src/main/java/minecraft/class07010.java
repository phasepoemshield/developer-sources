/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00864
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01231
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06942
 *  minecraft.class07132
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07749
 *  minecraft.class08059
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00864;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01231;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06942;
import minecraft.class07132;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07749;
import minecraft.class08059;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class07010
extends class00864
implements class00873,
class07132 {
    public static final MapCodec<class07010> N = class07010.y(class07010::new);
    private static final class00494 y = class00891.y((double)12.0, (double)0.0, (double)12.0);

    public class07010(class01362 class013622) {
        super(class013622);
    }

    protected class04688 u(class00500 class005002) {
        return class04684.L.N(false);
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        class00500 class005003 = class00869.yo.W();
        class00500 class005004 = (class00500)class005003.y((class08092)class07749.u, (Comparable)class08059.field_12609);
        class07209 class072093 = class072092.method_10084();
        class047822.method_8652(class072092, class005003, 2);
        class047822.method_8652(class072093, class005004, 2);
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public boolean N(@Nullable class07438 class074382, class07290 class072902, class07209 class072092, class00500 class005002, class04651 class046512) {
        return false;
    }

    public boolean N(class07284 class072842, class07209 class072092, class00500 class005002, class04688 class046882) {
        return false;
    }

    public MapCodec<class07010> N() {
        return N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return y;
    }

    protected boolean N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return class005002.L(class072902, class072092, class07211.field_11036) && !class005002.N(class00869.EI);
    }

    public @Nullable class00500 N(class06942 class069422) {
        class04688 class046882 = class069422.method_8045().method_8316(class069422.method_8037());
        if (class046882.N(class01231.N) && class046882.R() == 8) {
            return super.N(class069422);
        }
        return null;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        class00500 class005004 = super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
        if (!class005004.P()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return class005004;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return class054872.method_8320(class072092.method_10084()).N(class00869.K);
    }
}

