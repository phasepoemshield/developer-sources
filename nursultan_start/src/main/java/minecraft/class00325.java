/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00608
 *  minecraft.class00891
 *  minecraft.class01118
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class02756
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06704
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07004
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07307
 *  minecraft.class07438
 *  minecraft.class07796
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08630
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import minecraft.class00327;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00608;
import minecraft.class00891;
import minecraft.class01118;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class02756;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06704;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07004;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07307;
import minecraft.class07438;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08630;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class00325
extends class07796 {
    public static final MapCodec<class00325> N = class00325.y(class00325::new);
    public static final class08064<class07185> y = class06665.V;
    public static final class08064<class08630> L = class06665.yI;
    public static final class06667 u = class06665.G;

    private static class00500 L(class00500 class005002, class07299 class072992, class07209 class072092) {
        boolean bl;
        boolean bl2 = class00325.N(class005002, (class05487)class072992, class072092);
        boolean bl3 = bl = class005002.L(L) == class08630.field_55831;
        if (bl2 && bl) {
            return (class00500)class005002.y(L, (Comparable)((Boolean)class072992.method_75728().N(class00608.e, class072092) != false ? class08630.field_55833 : class08630.field_55832));
        }
        return class005002;
    }

    public class00325(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.W().y(y, (Comparable)class07185.field_11052)).y(L, (Comparable)class08630.field_55831)).y((class08092)u, (Comparable)Boolean.valueOf(false)));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L, u});
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class07307 class073072, BiConsumer<class06584, class07209> biConsumer) {
        class00394 class003942 = class047822.method_8321(class072092);
        if (class003942 instanceof class00327) {
            class00327 class003272 = (class00327)class003942;
            if (class073072 instanceof class02756) {
                class02756 class027562 = (class02756)class073072;
                if (class073072.y().N()) {
                    class003272.N(class027562.U());
                    class07438 class074382 = class073072.L();
                    if (class074382 instanceof class08036) {
                        class003942 = (class08036)class074382;
                        if (class073072.y().N()) {
                            this.N((class08036)class003942, class005002, (class07299)class047822, class072092);
                        }
                    }
                }
            }
        }
        super.N(class005002, class047822, class072092, class073072, biConsumer);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        class06704.N((class00500)class005002, (class07299)class047822, (class07209)class072092);
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return class07004.y((class00500)class005002, (class06993)class069932);
    }

    public MapCodec<class00325> N() {
        return N;
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        if (class005002.L(L) == class08630.field_55831) {
            return 0;
        }
        class00394 class003942 = class072992.method_8321(class072092);
        if (!(class003942 instanceof class00327)) {
            return 0;
        }
        class00327 class003272 = (class00327)class003942;
        return class003272.L();
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    private void N(class08036 class080362, class00500 class005002, class07299 class072992, class07209 class072092) {
        if (!class080362.method_66324() && !class080362.method_7325() && ((Boolean)class005002.L((class08092)u)).booleanValue() && class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.N(class047822, class072092, class072992.field_9229.N(20, 24));
        }
    }

    public class00500 N(class07299 class072992, class07209 class072092, class00500 class005002, class08036 class080362) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class00327) {
            ((class00327)class003942).N(class080362.method_48923().N(class080362));
            this.N(class080362, class005002, class072992, class072092);
        }
        return super.N(class072992, class072092, class005002, class080362);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        class087132.N(class072092, (class00891)this, 1);
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        if (!((Boolean)class072992.method_75728().N(class00608.e, class072092)).booleanValue()) {
            return;
        }
        if (class005002.L(L) == class08630.field_55831) {
            return;
        }
        if (class060692.y(16) == 0 && class00325.N((class07284)class072992, class072092)) {
            class072992.method_8486((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), class04909.Bg, class04911.field_15245, 1.0f, 1.0f, false);
        }
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        if (class072992.method_8608()) {
            return null;
        }
        if (class005002.L(L) != class08630.field_55831) {
            return class00325.N(class004042, (class00404)class00404.field_54774, class00327::N);
        }
        return null;
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class00327(class072092, class005002);
    }

    public @Nullable class00500 N(class06942 class069422) {
        return class00325.L((class00500)this.W().y(y, (Comparable)class069422.method_8038().z()), class069422.method_8045(), class069422.method_8037());
    }

    private static boolean N(class07284 class072842, class07209 class072092) {
        for (class07211 class072112 : class07211.values()) {
            class07209 class072093 = class072092.method_10093(class072112);
            if (class072842.method_8320(class072093).N(class01210.v)) continue;
            return false;
        }
        return true;
    }

    public static boolean N(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07185 class071852 = (class07185)class005002.L(y);
        for (class07211 class072112 : class071852.R()) {
            class00500 class005003 = class054872.method_8320(class072092.method_10093(class072112));
            if (class005003.N(class01210.v) && class005003.L(y) == class071852) continue;
            return false;
        }
        return true;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class00500 class005003 = class00325.L(class005002, (class07299)class047822, class072092);
        if (class005003 != class005002) {
            class047822.method_8652(class072092, class005003, 3);
        }
    }
}

