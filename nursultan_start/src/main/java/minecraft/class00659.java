/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class05543
 *  minecraft.class06069
 *  minecraft.class06092
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
 *  minecraft.class07305
 *  minecraft.class07536
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class05543;
import minecraft.class06069;
import minecraft.class06092;
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
import minecraft.class07305;
import minecraft.class07536;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class00659
extends class00891 {
    public static final MapCodec<class00659> N = class00659.y(class00659::new);
    public static final class06667 y = class06901.R;
    public static final class06667 L = class06901.y;
    public static final class06667 u = class06901.L;
    public static final class06667 i = class06901.u;
    public static final class06667 R = class06901.i;
    public static final Map<class07211, class06667> M = (Map)class06901.B.entrySet().stream().filter(entry -> entry.getKey() != class07211.field_11033).collect(class07536.N());
    private final Function<class00500, class00494> B;

    private int T(class00500 class005002) {
        int n = 0;
        for (class06667 class066672 : M.values()) {
            if (!((Boolean)class005002.L((class08092)class066672)).booleanValue()) continue;
            ++n;
        }
        return n;
    }

    public class00659(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Boolean.valueOf(false))).y((class08092)L, (Comparable)Boolean.valueOf(false))).y((class08092)u, (Comparable)Boolean.valueOf(false))).y((class08092)i, (Comparable)Boolean.valueOf(false))).y((class08092)R, (Comparable)Boolean.valueOf(false)));
        this.B = this.y();
    }

    private class00500 i(class00500 class005002, class07290 class072902, class07209 class072092) {
        class07209 class072093 = class072092.method_10084();
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            class005002 = (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(class00659.N(class072902, class072093, class07211.field_11033)));
        }
        class00500 class005003 = null;
        for (class07211 class072112 : class07221.field_11062) {
            class06667 class066672 = class00659.N(class072112);
            if (!((Boolean)class005002.L((class08092)class066672)).booleanValue()) continue;
            boolean bl = this.y(class072902, class072092, class072112);
            if (!bl) {
                if (class005003 == null) {
                    class005003 = class072902.method_8320(class072093);
                }
                bl = class005003.N((class00891)this) && (Boolean)class005003.L((class08092)class066672) != false;
            }
            class005002 = (class00500)class005002.y((class08092)class066672, (Comparable)Boolean.valueOf(bl));
        }
        return class005002;
    }

    private boolean b(class00500 class005002) {
        return (Boolean)class005002.L((class08092)L) != false || (Boolean)class005002.L((class08092)u) != false || (Boolean)class005002.L((class08092)i) != false || (Boolean)class005002.L((class08092)R) != false;
    }

    private boolean U(class00500 class005002) {
        return this.T(class005002) > 0;
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class00500 class005003;
        class00500 class005004;
        class07209 class072093;
        class00500 class005005;
        if (!((Boolean)class047822.method_64395().N(class07305.NL)).booleanValue()) {
            return;
        }
        if (class060692.y(4) != 0) {
            return;
        }
        class07211 class072112 = class07211.y((class06069)class060692);
        class07209 class072094 = class072092.method_10084();
        if (class072112.z().L() && !((Boolean)class005002.L((class08092)class00659.N(class072112))).booleanValue()) {
            if (!this.N((class07290)class047822, class072092)) {
                return;
            }
            class07209 class072095 = class072092.method_10093(class072112);
            class00500 class005006 = class047822.method_8320(class072095);
            if (class005006.P()) {
                class07211 class072113 = class072112.R();
                class07211 class072114 = class072112.M();
                boolean bl = (Boolean)class005002.L((class08092)class00659.N(class072113));
                boolean bl2 = (Boolean)class005002.L((class08092)class00659.N(class072114));
                class07209 class072096 = class072095.method_10093(class072113);
                class07209 class072097 = class072095.method_10093(class072114);
                if (bl && class00659.N((class07290)class047822, class072096, class072113)) {
                    class047822.method_8652(class072095, (class00500)this.W().y((class08092)class00659.N(class072113), (Comparable)Boolean.valueOf(true)), 2);
                } else if (bl2 && class00659.N((class07290)class047822, class072097, class072114)) {
                    class047822.method_8652(class072095, (class00500)this.W().y((class08092)class00659.N(class072114), (Comparable)Boolean.valueOf(true)), 2);
                } else {
                    class07211 class072115 = class072112.b();
                    if (bl && class047822.R(class072096) && class00659.N((class07290)class047822, class072092.method_10093(class072113), class072115)) {
                        class047822.method_8652(class072096, (class00500)this.W().y((class08092)class00659.N(class072115), (Comparable)Boolean.valueOf(true)), 2);
                    } else if (bl2 && class047822.R(class072097) && class00659.N((class07290)class047822, class072092.method_10093(class072114), class072115)) {
                        class047822.method_8652(class072097, (class00500)this.W().y((class08092)class00659.N(class072115), (Comparable)Boolean.valueOf(true)), 2);
                    } else if ((double)class060692.z() < 0.05 && class00659.N((class07290)class047822, class072095.method_10084(), class07211.field_11036)) {
                        class047822.method_8652(class072095, (class00500)this.W().y((class08092)y, (Comparable)Boolean.valueOf(true)), 2);
                    }
                }
            } else if (class00659.N((class07290)class047822, class072095, class072112)) {
                class047822.method_8652(class072092, (class00500)class005002.y((class08092)class00659.N(class072112), (Comparable)Boolean.valueOf(true)), 2);
            }
            return;
        }
        if (class072112 == class07211.field_11036 && class072092.method_10264() < class047822.method_31600()) {
            if (this.y((class07290)class047822, class072092, class072112)) {
                class047822.method_8652(class072092, (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(true)), 2);
                return;
            }
            if (class047822.R(class072094)) {
                if (!this.N((class07290)class047822, class072092)) {
                    return;
                }
                class00500 class005007 = class005002;
                for (class07211 class072116 : class07221.field_11062) {
                    if (!class060692.Z() && class00659.N((class07290)class047822, class072094.method_10093(class072116), class072116)) continue;
                    class005007 = (class00500)class005007.y((class08092)class00659.N(class072116), (Comparable)Boolean.valueOf(false));
                }
                if (this.b(class005007)) {
                    class047822.method_8652(class072094, class005007, 2);
                }
                return;
            }
        }
        if (class072092.method_10264() > class047822.method_31607() && ((class005005 = class047822.method_8320(class072093 = class072092.method_10074())).P() || class005005.N((class00891)this)) && (class005004 = class005005.P() ? this.W() : class005005) != (class005003 = this.N(class005002, class005004, class060692)) && this.b(class005003)) {
            class047822.method_8652(class072093, class005003, 2);
        }
    }

    private boolean y(class07290 class072902, class07209 class072092, class07211 class072112) {
        if (class072112 == class07211.field_11033) {
            return false;
        }
        class07209 class072093 = class072092.method_10093(class072112);
        if (class00659.N(class072902, class072093, class072112)) {
            return true;
        }
        if (class072112.z() != class07185.field_11052) {
            class06667 class066672 = M.get(class072112);
            class00500 class005002 = class072902.method_8320(class072092.method_10084());
            return class005002.N((class00891)this) && (Boolean)class005002.L((class08092)class066672) != false;
        }
        return false;
    }

    protected boolean y(class00500 class005002) {
        return true;
    }

    private Function<class00500, class00494> y() {
        Map map = class00389.u((class00494)class00891.L((double)16.0, (double)0.0, (double)1.0));
        return this.N((T class005002) -> {
            class00494 class004942 = class00389.N();
            for (Map.Entry<class07211, class06667> entry : M.entrySet()) {
                if (!((Boolean)class005002.L((class08092)entry.getValue())).booleanValue()) continue;
                class004942 = class00389.N((class00494)class004942, (class00494)((class00494)map.get(entry.getKey())));
            }
            return class004942.method_1110() ? class00389.y() : class004942;
        });
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        switch (class069932) {
            case field_11464: {
                return (class00500)((class00500)((class00500)((class00500)class005002.y((class08092)L, (Comparable)((Boolean)class005002.L((class08092)i)))).y((class08092)u, (Comparable)((Boolean)class005002.L((class08092)R)))).y((class08092)i, (Comparable)((Boolean)class005002.L((class08092)L)))).y((class08092)R, (Comparable)((Boolean)class005002.L((class08092)u)));
            }
            case field_11465: {
                return (class00500)((class00500)((class00500)((class00500)class005002.y((class08092)L, (Comparable)((Boolean)class005002.L((class08092)u)))).y((class08092)u, (Comparable)((Boolean)class005002.L((class08092)i)))).y((class08092)i, (Comparable)((Boolean)class005002.L((class08092)R)))).y((class08092)R, (Comparable)((Boolean)class005002.L((class08092)L)));
            }
            case field_11463: {
                return (class00500)((class00500)((class00500)((class00500)class005002.y((class08092)L, (Comparable)((Boolean)class005002.L((class08092)R)))).y((class08092)u, (Comparable)((Boolean)class005002.L((class08092)L)))).y((class08092)i, (Comparable)((Boolean)class005002.L((class08092)u)))).y((class08092)R, (Comparable)((Boolean)class005002.L((class08092)i)));
            }
        }
        return class005002;
    }

    public @Nullable class00500 N(class06942 class069422) {
        class00500 class005002 = class069422.method_8045().method_8320(class069422.method_8037());
        boolean bl = class005002.N((class00891)this);
        class00500 class005003 = bl ? class005002 : this.W();
        for (class07211 class072112 : class069422.i()) {
            if (class072112 == class07211.field_11033) continue;
            class06667 class066672 = class00659.N(class072112);
            if (bl && (Boolean)class005002.L((class08092)class066672) != false || !this.y((class07290)class069422.method_8045(), class069422.method_8037(), class072112)) continue;
            return (class00500)class005003.y((class08092)class066672, (Comparable)Boolean.valueOf(true));
        }
        return bl ? class005003 : null;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L, u, i, R});
    }

    public static class06667 N(class07211 class072112) {
        return M.get(class072112);
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        switch (class071112) {
            case field_11300: {
                return (class00500)((class00500)class005002.y((class08092)L, (Comparable)((Boolean)class005002.L((class08092)i)))).y((class08092)i, (Comparable)((Boolean)class005002.L((class08092)L)));
            }
            case field_11301: {
                return (class00500)((class00500)class005002.y((class08092)u, (Comparable)((Boolean)class005002.L((class08092)R)))).y((class08092)R, (Comparable)((Boolean)class005002.L((class08092)u)));
            }
        }
        return super.N(class005002, class071112);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.B.apply(class005002);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11033) {
            return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
        }
        class00500 class005004 = this.i(class005002, (class07290)class054872, class072092);
        if (!this.U(class005004)) {
            return class00869.N.W();
        }
        return class005004;
    }

    public static boolean N(class07290 class072902, class07209 class072092, class07211 class072112) {
        return class05543.N((class07290)class072902, (class07211)class072112, (class07209)class072092, (class00500)class072902.method_8320(class072092));
    }

    protected boolean N(class00500 class005002, class06942 class069422) {
        class00500 class005003 = class069422.method_8045().method_8320(class069422.method_8037());
        if (class005003.N((class00891)this)) {
            return this.T(class005003) < M.size();
        }
        return super.N(class005002, class069422);
    }

    public MapCodec<class00659> N() {
        return N;
    }

    private boolean N(class07290 class072902, class07209 class072092) {
        int n = 4;
        Iterable iterable = class07209.method_10094((int)(class072092.method_10263() - 4), (int)(class072092.method_10264() - 1), (int)(class072092.method_10260() - 4), (int)(class072092.method_10263() + 4), (int)(class072092.method_10264() + 1), (int)(class072092.method_10260() + 4));
        int n2 = 5;
        for (class07209 class072093 : iterable) {
            if (!class072902.method_8320(class072093).N((class00891)this) || --n2 > 0) continue;
            return false;
        }
        return true;
    }

    private class00500 N(class00500 class005002, class00500 class005003, class06069 class060692) {
        for (class07211 class072112 : class07221.field_11062) {
            class06667 class066672;
            if (!class060692.Z() || !((Boolean)class005002.L((class08092)(class066672 = class00659.N(class072112)))).booleanValue()) continue;
            class005003 = (class00500)class005003.y((class08092)class066672, (Comparable)Boolean.valueOf(true));
        }
        return class005003;
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return this.U(this.i(class005002, (class07290)class054872, class072092));
    }
}

