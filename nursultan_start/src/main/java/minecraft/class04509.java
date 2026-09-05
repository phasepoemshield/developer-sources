/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00500
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01231
 *  minecraft.class01312
 *  minecraft.class03847
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05298
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05739
 *  minecraft.class05765
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class06069
 *  minecraft.class06183
 *  minecraft.class06244
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07438
 *  minecraft.class07536
 *  minecraft.class07664
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01231;
import minecraft.class01312;
import minecraft.class03847;
import minecraft.class04494;
import minecraft.class04508;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05298;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05739;
import minecraft.class05765;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06069;
import minecraft.class06183;
import minecraft.class06244;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07438;
import minecraft.class07536;
import minecraft.class07664;
import org.jspecify.annotations.Nullable;

public class class04509
extends class05765<class04508> {
    private static final int N = 4;
    private static final int y = 10;
    private static final int L = 2;
    private static final int u = Math.round(10.0f);
    private static final float i = 24.0f;
    private static final float R = 1.4f;
    private static final float Z = 0.058333334f;
    private static final ObjectArrayList<Integer> z = new ObjectArrayList((Collection)Lists.newArrayList((Object[])new Integer[]{40, 55, 60, 75, 80}));

    protected void L(class04782 class047822, class04508 class045082, long l) {
        boolean bl = class045082.method_5799();
        if (!bl && class045082.method_18868().N_22(class05378.yW, class05367.field_18456)) {
            class045082.method_18868().y(class05378.yW);
        }
        if (class04509.N(class045082)) {
            class06889 class068892 = class045082.method_18868().L(class05378.yE).flatMap(class072092 -> class04509.N(class045082, class045082.method_59922(), class06889.L((class00753)class072092))).orElse(null);
            if (class068892 == null) {
                class045082.method_18380(class01312.field_18076);
                return;
            }
            if (bl) {
                class045082.method_18868().N(class05378.yW, (Object)class06244.field_17274);
            }
            class045082.method_5783(class04909.Lx, 1.0f, 1.0f);
            class045082.method_18380(class01312.field_30095);
            class045082.method_36456(((class07438)class045082).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue());
            class045082.method_35054(true);
            class045082.method_18799(class068892);
        } else if (class04509.y(class045082)) {
            class045082.method_5783(class04909.LD, 1.0f, 1.0f);
            class045082.method_18380(class01312.field_18076);
            class045082.method_35054(false);
            boolean bl2 = class045082.method_18868().N(class05378.d);
            class045082.method_18868().N(class05378.yR, (Object)class06244.field_17274, bl2 ? 2L : 10L);
            class045082.method_18868().N(class05378.yM, (Object)class06244.field_17274, 100L);
        }
    }

    private static boolean L(class04782 class047822, class04508 class045082) {
        class07209 class072092 = class045082.method_24515();
        if (class047822.method_8320(class072092).N(class00869.TM)) {
            return false;
        }
        for (int i = 1; i <= 4; ++i) {
            class07209 class072093 = class072092.method_10079(class07211.field_11036, i);
            if (class047822.method_8320(class072093).P() || class047822.method_8316(class072093).N(class01231.N)) continue;
            return false;
        }
        return true;
    }

    public class04509() {
        super(Map.of(class05378.s, class05367.field_18456, class05378.yR, class05367.field_18457, class05378.yU, class05367.field_18458, class05378.yE, class05367.field_18458, class05378.yM, class05367.field_18457, class05378.m, class05367.field_18457, class05378.yW, class05367.field_18458), 200);
    }

    protected void u(class04782 class047822, class04508 class045082, long l) {
        if (class045082.method_18376() == class01312.field_30095 || class045082.method_18376() == class01312.field_47248) {
            class045082.method_18380(class01312.field_18076);
        }
        class045082.method_18868().y(class05378.yE);
        class045082.method_18868().y(class05378.yU);
        class045082.method_18868().y(class05378.yW);
    }

    private static boolean y(class04508 class045082, class07438 class074382) {
        return class074382.method_5739((class07049)class045082) - 4.0f <= 0.0f;
    }

    protected boolean y(class04782 class047822, class04508 class045082) {
        return class04509.N(class047822, class045082);
    }

    private static boolean y(class04508 class045082) {
        boolean bl = class045082.method_18376() == class01312.field_30095;
        boolean bl2 = class045082.method_24828();
        boolean bl3 = class045082.method_5799() && class045082.method_18868().N_22(class05378.yW, class05367.field_18457);
        return bl && (bl2 || bl3);
    }

    protected void y(class04782 class047822, class04508 class045082, long l) {
        if (class045082.method_18868().N_22(class05378.yU, class05367.field_18457)) {
            class045082.method_18868().N(class05378.yU, (Object)class06244.field_17274, (long)u);
        }
        class045082.method_18380(class01312.field_47248);
        class047822.method_43129(null, (class07049)class045082, class04909.Lp, class04911.field_15251, 1.0f, 1.0f);
        class045082.method_18868().L(class05378.yE).ifPresent(class072092 -> class045082.method_5702(class07664.field_9851, class072092.method_46558()));
    }

    private static boolean N(class04508 class045082) {
        return class045082.method_18868().L(class05378.yU).isEmpty() && class045082.method_18376() == class01312.field_47248;
    }

    public static boolean N(class04782 class047822, class04508 class045082) {
        if (!class045082.method_24828() && !class045082.method_5799()) {
            return false;
        }
        if (class05739.N((class07079)class045082)) {
            return false;
        }
        if (class045082.method_18868().N_22(class05378.yE, class05367.field_18456)) {
            return true;
        }
        class07438 class074382 = class045082.method_18868().L(class05378.s).orElse(null);
        if (class074382 == null) {
            return false;
        }
        if (class04509.N(class045082, class074382)) {
            class045082.method_18868().y(class05378.s);
            return false;
        }
        if (class04509.y(class045082, class074382)) {
            return false;
        }
        if (!class04509.L(class047822, class045082)) {
            return false;
        }
        class07209 class072092 = class04509.N((class07438)class045082, class03847.N((class07438)class074382, (class06069)class045082.method_59922()));
        if (class072092 == null) {
            return false;
        }
        class00500 class005002 = class047822.method_8320(class072092.method_10074());
        if (class045082.method_5864().N(class005002)) {
            return false;
        }
        if (!class03847.N((class04508)class045082, (class06889)class072092.method_46558()) && !class03847.N((class04508)class045082, (class06889)class072092.method_10086(4).method_46558())) {
            return false;
        }
        class045082.method_18868().N(class05378.yE, (Object)class072092);
        return true;
    }

    protected boolean N(class04782 class047822, class04508 class045082, long l) {
        return class045082.method_18376() != class01312.field_18076 && !class045082.method_18868().N(class05378.yR);
    }

    private static boolean N(class04508 class045082, class07438 class074382) {
        return !class074382.method_24516((class07049)class045082, class045082.method_45325(class05298.P));
    }

    private static Optional<class06889> N(class04508 class045082, class06069 class060692, class06889 class068893) {
        Iterator var4 = class07536.N(z, (class06069)class060692).iterator();
        while (var4.hasNext()) {
            int n = (Integer)var4.next();
            float f = 0.058333334f * (float)class045082.method_45325(class05298.P);
            Optional<class06889> var7 = class04494.N((class07079)class045082, class068893, f, n, false);
            if (!var7.isPresent()) continue;
            if (class045082.method_6059(class07047.B)) {
                double d = var7.get().u().B * (double)class045082.method_37416();
                return var7.map(class068892 -> class068892.y(0.0, d, 0.0));
            }
            return var7;
        }
        return Optional.empty();
    }

    private static @Nullable class07209 N(class07438 class074382, class06889 class068892) {
        class05862 class058622 = new class05862(class068892, class068892.N(class07211.field_11033, 10.0), class05849.field_17558, class05835.field_1348, (class07049)class074382);
        class06183 class061832 = class074382.method_73183().N(class058622);
        if (class061832.N() == class07113.field_1332) {
            return class07209.method_49638((class00737)class061832.y()).method_10084();
        }
        class05862 class058623 = new class05862(class068892, class068892.N(class07211.field_11036, 10.0), class05849.field_17558, class05835.field_1348, (class07049)class074382);
        class06183 class061833 = class074382.method_73183().N(class058623);
        if (class061833.N() == class07113.field_1332) {
            return class07209.method_49638((class00737)class061833.y()).method_10084();
        }
        return null;
    }
}

