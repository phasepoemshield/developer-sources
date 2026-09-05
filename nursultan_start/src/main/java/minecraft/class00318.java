/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class05543
 *  minecraft.class06008
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class05543;
import minecraft.class06008;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class00318
extends class00891
implements class00873 {
    public static final MapCodec<class00318> N = class00318.y(class00318::new);
    public static final class06667 y = class06665.u;
    public static final class08064<class06008> L = class06665.NN;
    public static final class08064<class06008> u = class06665.r;
    public static final class08064<class06008> i = class06665.Ny;
    public static final class08064<class06008> R = class06665.NL;
    public static final Map<class07211, class08064<class06008>> M = ImmutableMap.copyOf((Map)Maps.newEnumMap(Map.of(class07211.field_11043, L, class07211.field_11034, u, class07211.field_11035, i, class07211.field_11039, R)));
    private final Function<class00500, class00494> B;

    public Function<class00500, class00494> L() {
        Map map = class00389.L((class00494)class00891.N((double)16.0, (double)0.0, (double)10.0, (double)0.0, (double)1.0));
        Map map2 = class00389.u((class00494)class00891.L((double)16.0, (double)0.0, (double)1.0));
        return this.N((T class005002) -> {
            class00494 class004942 = (Boolean)class005002.L((class08092)y) != false ? (class00494)map2.get(class07211.field_11033) : class00389.N();
            for (Map.Entry<class07211, class08064<class06008>> entry : M.entrySet()) {
                switch ((class06008)class005002.L((class08092)entry.getValue())) {
                    case field_22178: {
                        break;
                    }
                    case field_22179: {
                        class004942 = class00389.N((class00494)class004942, (class00494)((class00494)map.get(entry.getKey())));
                        break;
                    }
                    case field_22180: {
                        class004942 = class00389.N((class00494)class004942, (class00494)((class00494)map2.get(entry.getKey())));
                    }
                }
            }
            return class004942.method_1110() ? class00389.y() : class004942;
        });
    }

    public class00318(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Boolean.valueOf(true))).y(L, (Comparable)class06008.field_22178)).y(u, (Comparable)class06008.field_22178)).y(i, (Comparable)class06008.field_22178)).y(R, (Comparable)class06008.field_22178));
        this.B = this.L();
    }

    private static boolean U(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            return true;
        }
        for (class08064<class06008> class080642 : M.values()) {
            if (class005002.L(class080642) == class06008.field_22178) continue;
            return true;
        }
        return false;
    }

    protected class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return (Boolean)class005002.L((class08092)y) != false ? this.B.apply(this.W()) : class00389.N();
    }

    protected boolean y(class00500 class005002) {
        return true;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return (Boolean)class005002.L((class08092)y) != false && !class00318.N((class07290)class054872, class072092, () -> true).P();
    }

    public static @Nullable class08064<class06008> N(class07211 class072112) {
        return M.get(class072112);
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return switch (class071112) {
            case class07111.field_11300 -> (class00500)((class00500)class005002.y(L, (Comparable)((class06008)class005002.L(i)))).y(i, (Comparable)((class06008)class005002.L(L)));
            case class07111.field_11301 -> (class00500)((class00500)class005002.y(u, (Comparable)((class06008)class005002.L(R)))).y(R, (Comparable)((class06008)class005002.L(u)));
            default -> super.N(class005002, class071112);
        };
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return switch (class069932) {
            case class06993.field_11464 -> (class00500)((class00500)((class00500)((class00500)class005002.y(L, (Comparable)((class06008)class005002.L(i)))).y(u, (Comparable)((class06008)class005002.L(R)))).y(i, (Comparable)((class06008)class005002.L(L)))).y(R, (Comparable)((class06008)class005002.L(u)));
            case class06993.field_11465 -> (class00500)((class00500)((class00500)((class00500)class005002.y(L, (Comparable)((class06008)class005002.L(u)))).y(u, (Comparable)((class06008)class005002.L(i)))).y(i, (Comparable)((class06008)class005002.L(R)))).y(R, (Comparable)((class06008)class005002.L(L)));
            case class06993.field_11463 -> (class00500)((class00500)((class00500)((class00500)class005002.y(L, (Comparable)((class06008)class005002.L(R)))).y(u, (Comparable)((class06008)class005002.L(L)))).y(i, (Comparable)((class06008)class005002.L(u)))).y(R, (Comparable)((class06008)class005002.L(i)));
            default -> class005002;
        };
    }

    public MapCodec<class00318> N() {
        return N;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        class00500 class005003 = class00318.N((class07290)class047822, class072092, () -> true);
        if (!class005003.P()) {
            class047822.method_8652(class072092.method_10084(), class005003, 3);
        }
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public static void N(class07284 class072842, class07209 class072092, class06069 class060692, int n) {
        class00500 class005002 = class00318.N(class00869.nC.W(), (class07290)class072842, class072092, true);
        class072842.method_8652(class072092, class005002, n);
        class00500 class005003 = class00318.N((class07290)class072842, class072092, () -> ((class06069)class060692).Z());
        if (!class005003.P()) {
            class072842.method_8652(class072092.method_10084(), class005003, n);
            class00500 class005004 = class00318.N(class005002, (class07290)class072842, class072092, true);
            class072842.method_8652(class072092, class005004, n);
        }
    }

    public @Nullable class00500 N(class06942 class069422) {
        return class00318.N(this.W(), (class07290)class069422.method_8045(), class069422.method_8037(), true);
    }

    private static class00500 N(class00500 class005002, class07290 class072902, class07209 class072092, boolean bl) {
        class00500 class005003 = null;
        class00500 class005004 = null;
        bl |= ((Boolean)class005002.L((class08092)y)).booleanValue();
        for (class07211 class072112 : class07221.field_11062) {
            class06008 class060082;
            class08064<class06008> class080642 = class00318.N(class072112);
            class06008 class060083 = class00318.N(class072902, class072092, class072112) ? (bl ? class06008.field_22179 : (class06008)class005002.L(class080642)) : (class060082 = class06008.field_22178);
            if (class060082 == class06008.field_22179) {
                if (class005003 == null) {
                    class005003 = class072902.method_8320(class072092.method_10084());
                }
                if (class005003.N(class00869.nC) && class005003.L(class080642) != class06008.field_22178 && !((Boolean)class005003.L((class08092)y)).booleanValue()) {
                    class060082 = class06008.field_22180;
                }
                if (!((Boolean)class005002.L((class08092)y)).booleanValue()) {
                    if (class005004 == null) {
                        class005004 = class072902.method_8320(class072092.method_10074());
                    }
                    if (class005004.N(class00869.nC) && class005004.L(class080642) == class06008.field_22178) {
                        class060082 = class06008.field_22178;
                    }
                }
            }
            class005002 = (class00500)class005002.y(class080642, (Comparable)class060082);
        }
        return class005002;
    }

    private static boolean N(class07290 class072902, class07209 class072092, class07211 class072112) {
        if (class072112 == class07211.field_11036) {
            return false;
        }
        return class05543.N((class07290)class072902, (class07209)class072092, (class07211)class072112);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.B.apply(class005002);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L, u, i, R});
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (!class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        class00500 class005004 = class00318.N(class005002, (class07290)class054872, class072092, false);
        if (!class00318.U(class005004)) {
            return class00869.N.W();
        }
        return class005004;
    }

    private static class00500 N(class07290 class072902, class07209 class072092, BooleanSupplier booleanSupplier) {
        class07209 class072093 = class072092.method_10084();
        class00500 class005002 = class072902.method_8320(class072093);
        boolean bl = class005002.N(class00869.nC);
        if (bl && ((Boolean)class005002.L((class08092)y)).booleanValue() || !bl && !class005002.d()) {
            return class00869.N.W();
        }
        class00500 class005003 = class00318.N((class00500)class00869.nC.W().y((class08092)y, (Comparable)Boolean.valueOf(false)), class072902, class072092.method_10084(), true);
        Iterator iterator = class07221.field_11062.iterator();
        while (iterator.hasNext()) {
            class08064<class06008> class080642 = class00318.N((class07211)iterator.next());
            if (class005003.L(class080642) == class06008.field_22178 || booleanSupplier.getAsBoolean()) continue;
            class005003 = (class00500)class005003.y(class080642, (Comparable)class06008.field_22178);
        }
        if (class00318.U(class005003) && class005003 != class005002) {
            return class005003;
        }
        return class00869.N.W();
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, @Nullable class07438 class074382, class06584 class065842) {
        if (class072992.method_8608()) {
            return;
        }
        class06069 class060692 = class072992.method_8409();
        class00500 class005003 = class00318.N((class07290)class072992, class072092, () -> ((class06069)class060692).Z());
        if (!class005003.P()) {
            class072992.method_8652(class072092.method_10084(), class005003, 3);
        }
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class00500 class005003 = class054872.method_8320(class072092.method_10074());
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            return !class005003.P();
        }
        return class005003.N((class00891)this) && (Boolean)class005003.L((class08092)y) != false;
    }
}

