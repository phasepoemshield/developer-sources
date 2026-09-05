/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00507
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06901
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00507;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06901;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class05543
extends class00891
implements class06084 {
    public static final MapCodec<class05543> y = class05543.y(class05543::new);
    public static final class06667 L = class06665.q;
    private static final Map<class07211, class06667> N = class06901.B;
    protected static final class07211[] u = class07211.values();
    private final Function<class00500, class00494> i;
    private final boolean R;
    private final boolean M;
    private final boolean B;

    public @Nullable class00500 y(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        if (!this.N(class072902, class005002, class072092, class072112)) {
            return null;
        }
        class00500 class005003 = class005002.N((class00891)this) ? class005002 : (class005002.Y().N((class04651)class04684.L) ? (class00500)this.W().y((class08092)class06665.q, (Comparable)Boolean.valueOf(true)) : this.W());
        return (class00500)class005003.y((class08092)class05543.y(class072112), (Comparable)Boolean.valueOf(true));
    }

    public static boolean T(class00500 class005002) {
        for (class07211 class072112 : u) {
            if (!class05543.N(class005002, class072112)) continue;
            return true;
        }
        return false;
    }

    public class05543(class01362 class013622) {
        super(class013622);
        this.P(class05543.N((class00507<class00891, class00500>)this.Q));
        this.i = this.i();
        this.R = class07221.field_11062.N().allMatch(this::N);
        this.M = class07221.field_11062.N().filter(class07185.field_11048).filter(this::N).count() % 2L == 0L;
        this.B = class07221.field_11062.N().filter(class07185.field_11051).filter(this::N).count() % 2L == 0L;
    }

    private Function<class00500, class00494> i() {
        Map var1 = class00389.u((class00494)class00891.L((double)16.0, (double)0.0, (double)1.0));
        return this.N((T class005002) -> {
            class00494 class004942 = class00389.N();
            for (class07211 class072112 : u) {
                if (!class05543.N(class005002, class072112)) continue;
                class004942 = class00389.N((class00494)class004942, (class00494)((class00494)var1.get(class072112)));
            }
            return class004942.method_1110() ? class00389.y() : class004942;
        }, new class08092[]{L});
    }

    private static boolean b(class00500 class005002) {
        for (class07211 class072112 : u) {
            if (class05543.N(class005002, class072112)) continue;
            return true;
        }
        return false;
    }

    public static Set<class07211> U(class00500 class005002) {
        if (!(class005002.i() instanceof class05543)) {
            return Set.of();
        }
        EnumSet<class07211> var1 = EnumSet.noneOf(class07211.class);
        for (class07211 class072112 : class07211.values()) {
            if (!class05543.N(class005002, class072112)) continue;
            var1.add(class072112);
        }
        return var1;
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    public static class06667 y(class07211 class072112) {
        return N.get(class072112);
    }

    public static boolean N(class07290 class072902, class07211 class072112, class07209 class072092, class00500 class005002) {
        return class00891.N((class00494)class005002.B(class072902, class072092), (class07211)class072112.b()) || class00891.N((class00494)class005002.M(class072902, class072092), (class07211)class072112.b());
    }

    public static boolean N(class07290 class072902, class07209 class072092, class07211 class072112) {
        class07209 class072093 = class072092.method_10093(class072112);
        class00500 class005002 = class072902.method_8320(class072093);
        return class05543.N(class072902, class072112, class072093, class005002);
    }

    private class00500 N(class00500 class005002, Function<class07211, class07211> function) {
        class00500 class005003 = class005002;
        for (class07211 class072112 : u) {
            if (!this.N(class072112)) continue;
            class005003 = (class00500)class005003.y((class08092)class05543.y(function.apply(class072112)), (Comparable)((Boolean)class005002.L((class08092)class05543.y(class072112))));
        }
        return class005003;
    }

    public static boolean N(class00500 class005002, class07211 class072112) {
        class06667 class066672 = class05543.y(class072112);
        return (Boolean)class005002.N((class08092)class066672, (Comparable)Boolean.valueOf(false));
    }

    private static class00500 N(class00507<class00891, class00500> class005072) {
        class00500 class005002 = (class00500)((class00500)class005072.y()).y((class08092)L, (Comparable)Boolean.valueOf(false));
        for (class06667 class066672 : N.values()) {
            class005002 = (class00500)class005002.L((class08092)class066672, (Comparable)Boolean.valueOf(false));
        }
        return class005002;
    }

    protected MapCodec<? extends class05543> N() {
        return y;
    }

    private static class00500 N(class00500 class005002, class06667 class066672) {
        class00500 class005003 = (class00500)class005002.y((class08092)class066672, (Comparable)Boolean.valueOf(false));
        if (class05543.T(class005003)) {
            return class005003;
        }
        return class00869.N.W();
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.i.apply(class005002);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        if (!class05543.T(class005002)) {
            return class00869.N.W();
        }
        if (!class05543.N(class005002, class072112) || class05543.N((class07290)class054872, class072112, class072093, class005003)) {
            return class005002;
        }
        return class05543.N(class005002, class05543.y(class072112));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        for (class07211 class072112 : u) {
            if (!this.N(class072112)) continue;
            class005172.N(new class08092[]{class05543.y(class072112)});
        }
        class005172.N(new class08092[]{L});
    }

    protected boolean N(class07211 class072112) {
        return true;
    }

    public static byte N(Collection<class07211> collection) {
        byte by = 0;
        for (class07211 class072112 : collection) {
            by = (byte)(by | 1 << class072112.ordinal());
        }
        return by;
    }

    public static Set<class07211> N(byte by) {
        EnumSet<class07211> var1 = EnumSet.noneOf(class07211.class);
        for (class07211 class072112 : class07211.values()) {
            if ((by & (byte)(1 << class072112.ordinal())) <= 0) continue;
            var1.add(class072112);
        }
        return var1;
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        if (!this.R) {
            return class005002;
        }
        return this.N(class005002, arg_0 -> ((class06993)class069932).N(arg_0));
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        if (class071112 == class07111.field_11301 && !this.M) {
            return class005002;
        }
        if (class071112 == class07111.field_11300 && !this.B) {
            return class005002;
        }
        return this.N(class005002, arg_0 -> ((class07111)class071112).y(arg_0));
    }

    public @Nullable class00500 N(class06942 class069422) {
        class07299 class072992 = class069422.method_8045();
        class07209 class072092 = class069422.method_8037();
        class00500 class005002 = class072992.method_8320(class072092);
        return Arrays.stream(class069422.i()).map(class072112 -> this.y(class005002, (class07290)class072992, class072092, (class07211)class072112)).filter(Objects::nonNull).findFirst().orElse(null);
    }

    protected boolean N(class00500 class005002, class06942 class069422) {
        return !class069422.method_8041().N(this.B()) || class05543.b(class005002);
    }

    public boolean N(class07290 class072902, class00500 class005002, class07209 class072092, class07211 class072112) {
        if (!this.N(class072112) || class005002.N((class00891)this) && class05543.N(class005002, class072112)) {
            return false;
        }
        class07209 class072093 = class072092.method_10093(class072112);
        return class05543.N(class072902, class072112, class072093, class072902.method_8320(class072093));
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        boolean bl = false;
        for (class07211 class072112 : u) {
            if (!class05543.N(class005002, class072112)) continue;
            if (!class05543.N((class07290)class054872, class072092, class072112)) {
                return false;
            }
            bl = true;
        }
        return bl;
    }
}

