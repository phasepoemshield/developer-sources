/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00608
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01008
 *  minecraft.class01009
 *  minecraft.class01026
 *  minecraft.class01032
 *  minecraft.class01325
 *  minecraft.class01362
 *  minecraft.class02234
 *  minecraft.class02244
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06113
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06681
 *  minecraft.class06889
 *  minecraft.class06993
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07091
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07376
 *  minecraft.class08036
 *  minecraft.class08057
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08400
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00608;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01008;
import minecraft.class01009;
import minecraft.class01026;
import minecraft.class01032;
import minecraft.class01325;
import minecraft.class01362;
import minecraft.class02234;
import minecraft.class02244;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06113;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06681;
import minecraft.class06889;
import minecraft.class06993;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07091;
import minecraft.class07107;
import minecraft.class07121;
import minecraft.class07126;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07376;
import minecraft.class08036;
import minecraft.class08057;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08400;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07136
extends class00891
implements class02234 {
    private static final Logger L = LogUtils.getLogger();
    public static final MapCodec<class07136> N = class07136.y(class07136::new);
    public static final class08064<class07185> y = class06665.K;
    private static final Map<class07185, class00494> u = class00389.N((class00494)class00891.N((double)4.0, (double)16.0, (double)0.0, (double)16.0));

    public class07136(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y(y, (Comparable)((Object)class07185.field_11048)));
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (class047822.method_74962() && ((Boolean)class047822.method_75728().N(class00608.g, class072092)).booleanValue() && class060692.y(2000) < class047822.y().N() && class047822.method_67506(class072092)) {
            class07049 class070492;
            while (class047822.method_8320(class072092).N((class00891)this)) {
                class072092 = class072092.method_10074();
            }
            if (class047822.method_8320(class072092).N((class07290)class047822, class072092, class07078.LN) && (class070492 = class07078.LN.N(class047822, class072092.method_10084(), class06113.field_16474)) != null) {
                class070492.method_30229();
                class07049 class070493 = class070492.method_5854();
                if (class070493 != null) {
                    class070493.method_30229();
                }
            }
        }
    }

    public class02244 y() {
        return class02244.field_52061;
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        switch (class07091.y[class069932.ordinal()]) {
            case 1: 
            case 2: {
                switch (class07091.N[((class07185)((Object)class005002.L(y))).ordinal()]) {
                    case 1: {
                        return (class00500)class005002.y(y, (Comparable)((Object)class07185.field_11051));
                    }
                    case 2: {
                        return (class00500)class005002.y(y, (Comparable)((Object)class07185.field_11048));
                    }
                }
                return class005002;
            }
        }
        return class005002;
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return class06584.E;
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        if (class060692.y(100) == 0) {
            class072992.method_8486((double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5, class04909.lv, class04911.field_15245, 0.5f, class060692.z() * 0.4f + 0.8f, false);
        }
        for (int i = 0; i < 4; ++i) {
            double d = (double)class072092.method_10263() + class060692.U();
            double d2 = (double)class072092.method_10264() + class060692.U();
            double d3 = (double)class072092.method_10260() + class060692.U();
            double d4 = ((double)class060692.z() - 0.5) * 0.5;
            double d5 = ((double)class060692.z() - 0.5) * 0.5;
            double d6 = ((double)class060692.z() - 0.5) * 0.5;
            int n = class060692.y(2) * 2 - 1;
            if (class072992.method_8320(class072092.method_10067()).N((class00891)this) || class072992.method_8320(class072092.method_10078()).N((class00891)this)) {
                d3 = (double)class072092.method_10260() + 0.5 + 0.25 * (double)n;
                d6 = class060692.z() * 2.0f * (float)n;
            } else {
                d = (double)class072092.method_10263() + 0.5 + 0.25 * (double)n;
                d4 = class060692.z() * 2.0f * (float)n;
            }
            class072992.method_8406((class07126)class07107.NM, d, d2, d3, d4, d5, d6);
        }
    }

    public MapCodec<class07136> N() {
        return N;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    public int N(class04782 class047822, class07049 class070492) {
        if (class070492 instanceof class08036) {
            class08036 class080362 = (class08036)class070492;
            return Math.max(0, (Integer)class047822.method_64395().N(class080362.method_31549().N ? class07305.q : class07305.K));
        }
        return 0;
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        if (class070492.method_5822(false)) {
            class070492.method_60697((class02234)this, class072092);
        }
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        class07185 class071852 = class072112.z();
        class07185 class071853 = (class07185)((Object)class005002.L(y));
        if (class071853 != class071852 && class071852.L() || class005003.N((class00891)this) || class07121.N((class07290)class054872, class072092, class071853).y()) {
            return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
        }
        return class00869.N.W();
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return u.get(class005002.L(y));
    }

    private static class01032 N(class04782 class047822, class01009 class010092, class07185 class071852, class06889 class068892, class07049 class070492, class01026 class010262) {
        class07209 class072092 = class010092.N;
        class07185 class071853 = class047822.method_8320(class072092).u((class08092)class06665.K).orElse(class07185.field_11048);
        double d = class010092.y;
        double d2 = class010092.L;
        class01325 class013252 = class070492.method_18377(class070492.method_18376());
        int n = class071852 == class071853 ? 0 : 90;
        double d3 = (double)class013252.N() / 2.0 + (d - (double)class013252.N()) * class068892.N();
        double d4 = (d2 - (double)class013252.y()) * class068892.y();
        double d5 = 0.5 + class068892.L();
        boolean bl = class071853 == class07185.field_11048;
        class06889 class068893 = class07121.N(new class06889((double)class072092.method_10263() + (bl ? d3 : d5), (double)class072092.method_10264() + d4, (double)class072092.method_10260() + (bl ? d5 : d3)), class047822, class070492, class013252);
        return new class01032(class047822, class068893, class06889.L, (float)n, 0.0f, class06681.N((Set[])new Set[]{class06681.field_54094, class06681.field_40711}), class010262);
    }

    private static class01032 N(class07049 class070492, class07209 class072093, class01009 class010092, class04782 class047822, class01026 class010262) {
        class06889 class068892;
        class07185 class071852;
        class00500 class005002 = class070492.method_73183().method_8320(class072093);
        if (class005002.y((class08092)class06665.K)) {
            class071852 = (class07185)((Object)class005002.L((class08092)class06665.K));
            class01009 class010093 = class01008.N((class07209)class072093, (class07185)class071852, (int)21, (class07185)class07185.field_11052, (int)21, (T class072092) -> class070492.method_73183().method_8320(class072092) == class005002);
            class068892 = class070492.method_30633(class071852, class010093);
        } else {
            class071852 = class07185.field_11048;
            class068892 = new class06889(0.5, 0.0, 0.0);
        }
        return class07136.N(class047822, class010092, class071852, class068892, class070492, class010262);
    }

    private @Nullable class01032 N(class04782 class047822, class07049 class070493, class07209 class072093, class07209 class072094, boolean bl, class08057 class080572) {
        class01026 class010262;
        class01009 class010092;
        Optional optional = class047822.method_14173().N(class072094, bl, class080572);
        if (optional.isPresent()) {
            class07209 class072095 = (class07209)((Object)optional.get());
            class00500 class005002 = class047822.method_8320(class072095);
            class010092 = class01008.N((class07209)class072095, (class07185)((class07185)((Object)class005002.L((class08092)class06665.K))), (int)21, (class07185)class07185.field_11052, (int)21, (T class072092) -> class047822.method_8320(class072092) == class005002);
            class010262 = class01032.y.N(class070492 -> class070492.method_60950(class072095));
        } else {
            class07185 class071852 = class070493.method_73183().method_8320(class072093).u(y).orElse(class07185.field_11048);
            Optional var11 = class047822.method_14173().N(class072094, class071852);
            if (var11.isEmpty()) {
                L.error("Unable to create a portal, likely target out of worldborder");
                return null;
            }
            class010092 = (class01009)var11.get();
            class010262 = class01032.y.N(class01032.L);
        }
        return class07136.N(class070493, class072093, class010092, class047822, class010262);
    }

    public @Nullable class01032 N(class04782 class047822, class07049 class070492, class07209 class072092) {
        class05946 var4 = class047822.method_27983() == class07299.field_25180 ? class07299.field_25179 : class07299.field_25180;
        class04782 class047823 = class047822.method_8503().N(var4);
        if (class047823 == null) {
            return null;
        }
        boolean bl = class047823.method_27983() == class07299.field_25180;
        class08057 class080572 = class047823.method_8621();
        double d = class07376.N((class07376)class047822.method_8597(), (class07376)class047823.method_8597());
        class07209 class072093 = class080572.y(class070492.method_23317() * d, class070492.method_23318(), class070492.method_23321() * d);
        return this.N(class047823, class070492, class072092, class072093, bl, class080572);
    }
}

