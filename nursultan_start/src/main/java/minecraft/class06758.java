/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00737
 *  minecraft.class00755
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class02484
 *  minecraft.class02733
 *  minecraft.class03556
 *  minecraft.class04438
 *  minecraft.class04782
 *  minecraft.class06069
 *  minecraft.class06183
 *  minecraft.class06237
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06704
 *  minecraft.class06889
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07082
 *  minecraft.class07111
 *  minecraft.class07206
 *  minecraft.class07209
 *  minecraft.class07210
 *  minecraft.class07211
 *  minecraft.class07243
 *  minecraft.class07247
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07482
 *  minecraft.class07796
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08711
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00737;
import minecraft.class00755;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class02484;
import minecraft.class02733;
import minecraft.class03556;
import minecraft.class04438;
import minecraft.class04782;
import minecraft.class06069;
import minecraft.class06183;
import minecraft.class06237;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06704;
import minecraft.class06760;
import minecraft.class06889;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07082;
import minecraft.class07111;
import minecraft.class07206;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07243;
import minecraft.class07247;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07482;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08711;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class06758
extends class07796 {
    private static final Logger i = LogUtils.getLogger();
    public static final MapCodec<class06758> N = class06758.y(class06758::new);
    public static final class08064<class07211> y = class06760.y;
    public static final class06667 L = class06665.J;
    private static final class07206 R = new class07206();
    public static final Map<class06581, class00755> u = new IdentityHashMap<class06581, class00755>();
    private static final int M = 4;

    public class06758(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)class07211.field_11043)).y((class08092)L, (Comparable)Boolean.valueOf(false)));
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    public static class00737 N(class07210 class072102, double d, class06889 class068892) {
        class07211 class072112 = (class07211)class072102.u().L(y);
        return class072102.N().y(d * (double)class072112.P() + class068892.N(), d * (double)class072112.s() + class068892.y(), d * (double)class072112.T() + class068892.L());
    }

    public static class00737 N(class07210 class072102) {
        return class06758.N(class072102, 0.7, class06889.L);
    }

    public class00500 N(class06942 class069422) {
        return (class00500)this.W().y(y, (Comparable)class069422.L().b());
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        class06704.N((class00500)class005002, (class07299)class047822, (class07209)class072092);
    }

    public MapCodec<? extends class06758> N() {
        return N;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L});
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(y)));
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)class069932.N((class07211)class005002.L(y)));
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        return class07482.N((class00394)class072992.method_8321(class072092));
    }

    protected class00755 N(class07299 class072992, class06584 class065842) {
        if (!class065842.N(class072992.method_45162())) {
            return R;
        }
        class00755 class007552 = u.get(class065842.B());
        if (class007552 != null) {
            return class007552;
        }
        return class06758.N(class065842);
    }

    protected void N(class04782 class047822, class00500 class005002, class07209 class072092) {
        class07243 class072432 = class047822.N(class072092, class00404.field_11887).orElse(null);
        if (class072432 == null) {
            i.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", (Object)class072092);
            return;
        }
        class07210 class072102 = new class07210(class047822, class072092, class005002, class072432);
        int n = class072432.N(class047822.field_9229);
        if (n < 0) {
            class047822.N(1001, class072092, 0);
            class047822.N((class03556)class01194.N, class072092, class01164.N((class00500)class072432.w()));
            return;
        }
        class06584 class065842 = class072432.method_5438(n);
        class00755 class007552 = this.N((class07299)class047822, class065842);
        if (class007552 != class00755.L) {
            class072432.method_5447(n, class007552.dispense(class072102, class065842));
        }
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        class00394 class003942;
        if (!class072992.method_8608() && (class003942 = class072992.method_8321(class072092)) instanceof class07243) {
            class07243 class072432 = (class07243)class003942;
            class080362.method_17355((class06237)class072432);
            class080362.method_7281(class072432 instanceof class07247 ? class01235.Ni : class01235.NM);
        }
        return class07082.N;
    }

    public static void N(class07310 class073102) {
        u.put(class073102.B(), (class00755)new class04438(class073102.B()));
    }

    public static void N(class07310 class073102, class00755 class007552) {
        u.put(class073102.B(), class007552);
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class07243(class072092, class005002);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        this.N(class047822, class005002, class072092);
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        boolean bl2 = class072992.W(class072092) || class072992.W(class072092.method_10084());
        boolean bl3 = (Boolean)class005002.L((class08092)L);
        if (bl2 && !bl3) {
            class072992.N(class072092, (class00891)this, 4);
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(true)), 2);
        } else if (!bl2 && bl3) {
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(false)), 2);
        }
    }

    private static class00755 N(class06584 class065842) {
        if (class065842.L(class02484.o)) {
            return class08711.N;
        }
        return R;
    }
}

