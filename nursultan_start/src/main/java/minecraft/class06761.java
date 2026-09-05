/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00864
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04995
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06942
 *  minecraft.class07049
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08059
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00864;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04995;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06942;
import minecraft.class07049;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08059;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class06761
extends class00864 {
    public static final MapCodec<class06761> N = class06761.y(class06761::new);
    public static final class08064<class08059> y = class06665.NB;

    public class06761(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y(y, (Comparable)class08059.field_12607));
    }

    public static class00500 y(class05487 class054872, class07209 class072092, class00500 class005002) {
        if (class005002.y((class08092)class06665.q)) {
            return (class00500)class005002.y((class08092)class06665.q, (Comparable)Boolean.valueOf(class054872.z(class072092)));
        }
        return class005002;
    }

    protected static void y(class07299 class072992, class07209 class072092, class00500 class005002, class08036 class080362) {
        class07209 class072093;
        class00500 class005003;
        if ((class08059)class005002.L(y) == class08059.field_12609 && (class005003 = class072992.method_8320(class072093 = class072092.method_10074())).N(class005002.i()) && class005003.L(y) == class08059.field_12607) {
            class00500 class005004 = class005003.Y().y((class04651)class04684.L) ? class00869.K.W() : class00869.N.W();
            class072992.method_8652(class072093, class005004, 35);
            class072992.method_8444((class07049)class080362, 2001, class072093, class00891.W((class00500)class005003));
        }
    }

    public void N(class07299 class072992, class08036 class080362, class07209 class072092, class00500 class005002, @Nullable class00394 class003942, class06584 class065842) {
        super.N(class072992, class080362, class072092, class00869.N.W(), class003942, class065842);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        class08059 class080592 = (class08059)class005002.L(y);
        if (!(class072112.z() != class07185.field_11052 || class080592 == class08059.field_12607 != (class072112 == class07211.field_11036) || class005003.N((class00891)this) && class005003.L(y) != class080592)) {
            return class00869.N.W();
        }
        if (class080592 == class08059.field_12607 && class072112 == class07211.field_11033 && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    protected long N(class00500 class005002, class07209 class072092) {
        return class04995.y((int)class072092.method_10263(), (int)class072092.method_10087(class005002.L(y) == class08059.field_12607 ? 0 : 1).method_10264(), (int)class072092.method_10260());
    }

    public MapCodec<? extends class06761> N() {
        return N;
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, @Nullable class07438 class074382, class06584 class065842) {
        class07209 class072093 = class072092.method_10084();
        class072992.method_8652(class072093, class06761.y((class05487)class072992, class072093, (class00500)this.W().y(y, (Comparable)class08059.field_12609)), 3);
    }

    public static void N(class07284 class072842, class00500 class005002, class07209 class072092, int n) {
        class07209 class072093 = class072092.method_10084();
        class072842.method_8652(class072092, class06761.y((class05487)class072842, class072092, (class00500)class005002.y(y, (Comparable)class08059.field_12607)), n);
        class072842.method_8652(class072093, class06761.y((class05487)class072842, class072093, (class00500)class005002.y(y, (Comparable)class08059.field_12609)), n);
    }

    public @Nullable class00500 N(class06942 class069422) {
        class07209 class072092 = class069422.method_8037();
        class07299 class072992 = class069422.method_8045();
        if (class072092.method_10264() < class072992.method_31600() && class072992.method_8320(class072092.method_10084()).N(class069422)) {
            return super.N(class069422);
        }
        return null;
    }

    public class00500 N(class07299 class072992, class07209 class072092, class00500 class005002, class08036 class080362) {
        if (!class072992.method_8608()) {
            if (class080362.method_66324()) {
                class06761.y(class072992, class072092, class005002, class080362);
            } else {
                class06761.N((class00500)class005002, (class07299)class072992, (class07209)class072092, null, (class07049)class080362, (class06584)class080362.method_6047());
            }
        }
        return super.N(class072992, class072092, class005002, class080362);
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        if (class005002.L(y) == class08059.field_12609) {
            class00500 class005003 = class054872.method_8320(class072092.method_10074());
            return class005003.N((class00891)this) && class005003.L(y) == class08059.field_12607;
        }
        return super.a_(class005002, class054872, class072092);
    }
}

