/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.Object2IntArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class03556
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05474
 *  minecraft.class05487
 *  minecraft.class05540
 *  minecraft.class06069
 *  minecraft.class06082
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class07049
 *  minecraft.class07101
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07536
 *  minecraft.class08005
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08400
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import java.util.function.Function;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class03556;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05474;
import minecraft.class05487;
import minecraft.class05540;
import minecraft.class06069;
import minecraft.class06082;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class07049;
import minecraft.class07101;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07536;
import minecraft.class08005;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08400;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class05584
extends class07101
implements class00873,
class06084 {
    public static final MapCodec<class05584> N = class05584.y(class05584::new);
    private static final class06667 y = class06665.q;
    private static final class08064<class06082> L = class06665.yT;
    private static final int u = -1;
    private static final Object2IntMap<class06082> i = (Object2IntMap)class07536.N((Object)new Object2IntArrayMap(), (T object2IntArrayMap) -> {
        object2IntArrayMap.defaultReturnValue(-1);
        object2IntArrayMap.put((Object)class06082.field_28719, 10);
        object2IntArrayMap.put((Object)class06082.field_28720, 10);
        object2IntArrayMap.put((Object)class06082.field_28721, 100);
    });
    private static final int M = 5;
    private static final int B = 11;
    private static final int Z = 13;
    private static final Map<class06082, class00494> O = Maps.newEnumMap(Map.of(class06082.field_28718, class00891.y((double)16.0, (double)11.0, (double)15.0), class06082.field_28719, class00891.y((double)16.0, (double)11.0, (double)15.0), class06082.field_28720, class00891.y((double)16.0, (double)11.0, (double)13.0), class06082.field_28721, class00389.N()));
    private final Function<class00500, class00494> F;

    private Function<class00500, class00494> L() {
        Map map = class00389.L((class00494)class00891.y((double)6.0, (double)0.0, (double)13.0).method_1096(0.0, 0.0, 0.25).method_1097());
        return this.N((T class005002) -> class00389.N((class00494)O.get(class005002.L(L)), (class00494)((class00494)map.get(class005002.L((class08092)R)))), new class08092[]{y});
    }

    private static void L(class00500 class005002, class07299 class072992, class07209 class072092) {
        class05584.N(class005002, class072992, class072092, class06082.field_28718);
        if (class005002.L(L) != class06082.field_28718) {
            class05584.N(class072992, class072092, class04909.zU);
        }
    }

    public class05584(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Boolean.valueOf(false))).y((class08092)R, (Comparable)class07211.field_11043)).y(L, (Comparable)class06082.field_28718));
        this.F = this.L();
    }

    private static boolean U(class00500 class005002) {
        return class005002.P() || class005002.N(class00869.K) || class005002.N(class00869.ni);
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    protected class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return O.get(class005002.L(L));
    }

    private void N(class00500 class005002, class07299 class072992, class07209 class072092, class06082 class060822, @Nullable class04891 class048912) {
        int n;
        class05584.N(class005002, class072992, class072092, class060822);
        if (class048912 != null) {
            class05584.N(class072992, class072092, class048912);
        }
        if ((n = i.getInt((Object)class060822)) != -1) {
            class072992.N(class072092, (class00891)this, n);
        }
    }

    public MapCodec<class05584> N() {
        return N;
    }

    private static void N(class00500 class005002, class07299 class072992, class07209 class072092, class06082 class060822) {
        class06082 class060823 = (class06082)class005002.L(L);
        class072992.method_8652(class072092, (class00500)class005002.y(L, (Comparable)class060822), 2);
        if (class060822.N() && class060822 != class060823) {
            class072992.N(null, (class03556)class01194.L, class072092);
        }
    }

    private static boolean N(class07209 class072092, class07049 class070492) {
        return class070492.method_24828() && class070492.method_73189().B > (double)((float)class072092.method_10264() + 0.6875f);
    }

    private static void N(class07299 class072992, class07209 class072092, class04891 class048912) {
        float f = class04995.y((class06069)class072992.field_9229, (float)0.8f, (float)1.2f);
        class072992.method_8396(null, class072092, class048912, class04911.field_15245, 1.0f, f);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, R, L});
    }

    public class00500 N(class06942 class069422) {
        class00500 class005002 = class069422.method_8045().method_8320(class069422.method_8037().method_10074());
        class04688 class046882 = class069422.method_8045().method_8316(class069422.method_8037());
        boolean bl = class005002.N(class00869.nL) || class005002.N(class00869.nu);
        return (class00500)((class00500)this.W().y((class08092)y, (Comparable)Boolean.valueOf(class046882.N((class04651)class04684.L)))).y((class08092)R, (Comparable)(bl ? (class07211)class005002.L((class08092)R) : class069422.method_8042().b()));
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.F.apply(class005002);
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return class05584.U(class054872.method_8320(class072092.method_10084()));
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11033 && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        if (class072112 == class07211.field_11036 && class005003.N((class00891)this)) {
            return class00869.nu.s(class005002);
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected void N(class07299 class072992, class00500 class005002, class06183 class061832, class08005 class080052) {
        this.N(class005002, class072992, class061832.u(), class06082.field_28721, class04909.zz);
    }

    protected static boolean N(class07284 class072842, class07209 class072092, class04688 class046882, class07211 class072112) {
        class00500 class005002 = (class00500)((class00500)class00869.nL.W().y((class08092)y, (Comparable)Boolean.valueOf(class046882.N((class04651)class04684.L)))).y((class08092)R, (Comparable)class072112);
        return class072842.method_8652(class072092, class005002, 3);
    }

    protected static boolean N(class05474 class054742, class07209 class072092, class00500 class005002) {
        return !class054742.method_31606(class072092) && class05584.U(class005002);
    }

    public static void N(class07284 class072842, class06069 class060692, class07209 class072092, class07211 class072112) {
        int n;
        int n2 = class04995.N((class06069)class060692, (int)2, (int)5);
        class07218 class072182 = class072092.method_25503();
        for (n = 0; n < n2 && class05584.N((class05474)class072842, (class07209)class072182, class072842.method_8320((class07209)class072182)); ++n) {
            class072182.N(class07211.field_11036);
        }
        int n3 = class072092.method_10264() + n - 1;
        class072182.method_10099(class072092.method_10264());
        while (class072182.method_10264() < n3) {
            class05540.N((class07284)class072842, (class07209)class072182, (class04688)class072842.method_8316((class07209)class072182), (class07211)class072112);
            class072182.N(class07211.field_11036);
        }
        class05584.N(class072842, (class07209)class072182, class072842.method_8316((class07209)class072182), class072112);
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        if (class072992.W(class072092)) {
            class05584.L(class005002, class072992, class072092);
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (class047822.W(class072092)) {
            class05584.L(class005002, (class07299)class047822, class072092);
            return;
        }
        class06082 class060822 = (class06082)class005002.L(L);
        if (class060822 == class06082.field_28719) {
            this.N(class005002, (class07299)class047822, class072092, class06082.field_28720, class04909.zz);
        } else if (class060822 == class06082.field_28720) {
            this.N(class005002, (class07299)class047822, class072092, class06082.field_28721, class04909.zz);
        } else if (class060822 == class06082.field_28721) {
            class05584.L(class005002, (class07299)class047822, class072092);
        }
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        if (class072992.method_8608()) {
            return;
        }
        if (class005002.L(L) == class06082.field_28718 && class05584.N(class072092, class070492) && !class072992.W(class072092)) {
            this.N(class005002, class072992, class072092, class06082.field_28719, null);
        }
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        class00500 class005003;
        class07209 class072093 = class072092.method_10084();
        if (class05584.N((class05474)class047822, class072093, class005003 = class047822.method_8320(class072093))) {
            class07211 class072112 = (class07211)class005002.L((class08092)R);
            class05540.N((class07284)class047822, (class07209)class072092, (class04688)class005002.Y(), (class07211)class072112);
            class05584.N((class07284)class047822, class072093, class005003.Y(), class072112);
        }
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07209 class072093 = class072092.method_10074();
        class00500 class005003 = class054872.method_8320(class072093);
        return class005003.N((class00891)this) || class005003.N(class00869.nu) || class005003.N(class01210.ye);
    }
}

