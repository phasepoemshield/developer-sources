/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00756
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04770
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06942
 *  minecraft.class07049
 *  minecraft.class07107
 *  minecraft.class07121
 *  minecraft.class07126
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08397
 *  minecraft.class08400
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Optional;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00756;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04770;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class06001;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06942;
import minecraft.class07049;
import minecraft.class07107;
import minecraft.class07121;
import minecraft.class07126;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08397;
import minecraft.class08400;

public abstract class class05989
extends class00891 {
    private static final int N = 8;
    private static final int y = 1;
    private static final int L = 3;
    private final float u;
    protected static final class00494 O = class00891.y((double)16.0, (double)0.0, (double)1.0);

    public class05989(class01362 class013622, float f) {
        super(class013622);
        this.u = f;
    }

    protected abstract boolean U(class00500 var1);

    private static boolean y(class07299 class072992, class07209 class072092, class07211 class072112) {
        if (!class05989.N(class072992)) {
            return false;
        }
        class07218 class072182 = class072092.method_25503();
        boolean bl = false;
        for (class07211 class072113 : class07211.values()) {
            if (!class072992.method_8320((class07209)class072182.N((class00753)class072092).N(class072113)).N(class00869.LV)) continue;
            bl = true;
            break;
        }
        if (!bl) {
            return false;
        }
        class07185 class071852 = class072112.z().L() ? class072112.M().z() : class07221.field_11062.y(class072992.field_9229);
        return class07121.N((class07284)class072992, (class07209)class072092, (class07185)class071852).isPresent();
    }

    public static class00500 y(class07290 class072902, class07209 class072092) {
        class07209 class072093 = class072092.method_10074();
        if (class06001.T(class072902.method_8320(class072093))) {
            return class00869.LX.W();
        }
        return ((class00756)class00869.Lc).N(class072902, class072092);
    }

    public class00500 N(class07299 class072992, class07209 class072092, class00500 class005002, class08036 class080362) {
        if (!class072992.method_8608()) {
            class072992.method_8444(null, 1009, class072092, 0);
        }
        return super.N(class072992, class072092, class005002, class080362);
    }

    protected void N(class07299 class072992, class08036 class080362, class07209 class072092, class00500 class005002) {
    }

    private static boolean N(class07299 class072992) {
        return class072992.method_27983() == class07299.field_25179 || class072992.method_27983() == class07299.field_25180;
    }

    public static boolean N(class07299 class072992, class07209 class072092, class07211 class072112) {
        if (!class072992.method_8320(class072092).P()) {
            return false;
        }
        return class05989.y((class07290)class072992, class072092).N((class05487)class072992, class072092) || class05989.y(class072992, class072092, class072112);
    }

    public static void N(class07049 class070492) {
        if (!class070492.method_5753()) {
            if (class070492.method_20802() < 0) {
                class070492.method_20803(class070492.method_20802() + 1);
            } else if (class070492 instanceof class04770) {
                int n = class070492.method_73183().method_8409().y(1, 3);
                class070492.method_20803(class070492.method_20802() + n);
            }
            if (class070492.method_20802() >= 0) {
                class070492.method_5639(8.0f);
            }
        }
    }

    public class00500 N(class06942 class069422) {
        return class05989.y((class07290)class069422.method_8045(), class069422.method_8037());
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return O;
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        block12: {
            double d;
            double d2;
            double d3;
            int n;
            block11: {
                class07209 class072093;
                class00500 class005003;
                if (class060692.y(24) == 0) {
                    class072992.method_8486((double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5, class04909.Uo, class04911.field_15245, 1.0f + class060692.z(), class060692.z() * 0.7f + 0.3f, false);
                }
                if (!this.U(class005003 = class072992.method_8320(class072093 = class072092.method_10074())) && !class005003.L((class07290)class072992, class072093, class07211.field_11036)) break block11;
                for (int i = 0; i < 3; ++i) {
                    double d4 = (double)class072092.method_10263() + class060692.U();
                    double d5 = (double)class072092.method_10264() + class060692.U() * 0.5 + 0.5;
                    double d6 = (double)class072092.method_10260() + class060692.U();
                    class072992.method_8406((class07126)class07107.Ny, d4, d5, d6, 0.0, 0.0, 0.0);
                }
                break block12;
            }
            if (this.U(class072992.method_8320(class072092.method_10067()))) {
                for (n = 0; n < 2; ++n) {
                    d3 = (double)class072092.method_10263() + class060692.U() * (double)0.1f;
                    d2 = (double)class072092.method_10264() + class060692.U();
                    d = (double)class072092.method_10260() + class060692.U();
                    class072992.method_8406((class07126)class07107.Ny, d3, d2, d, 0.0, 0.0, 0.0);
                }
            }
            if (this.U(class072992.method_8320(class072092.method_10078()))) {
                for (n = 0; n < 2; ++n) {
                    d3 = (double)(class072092.method_10263() + 1) - class060692.U() * (double)0.1f;
                    d2 = (double)class072092.method_10264() + class060692.U();
                    d = (double)class072092.method_10260() + class060692.U();
                    class072992.method_8406((class07126)class07107.Ny, d3, d2, d, 0.0, 0.0, 0.0);
                }
            }
            if (this.U(class072992.method_8320(class072092.method_10095()))) {
                for (n = 0; n < 2; ++n) {
                    d3 = (double)class072092.method_10263() + class060692.U();
                    d2 = (double)class072092.method_10264() + class060692.U();
                    d = (double)class072092.method_10260() + class060692.U() * (double)0.1f;
                    class072992.method_8406((class07126)class07107.Ny, d3, d2, d, 0.0, 0.0, 0.0);
                }
            }
            if (this.U(class072992.method_8320(class072092.method_10072()))) {
                for (n = 0; n < 2; ++n) {
                    d3 = (double)class072092.method_10263() + class060692.U();
                    d2 = (double)class072092.method_10264() + class060692.U();
                    d = (double)(class072092.method_10260() + 1) - class060692.U() * (double)0.1f;
                    class072992.method_8406((class07126)class07107.Ny, d3, d2, d, 0.0, 0.0, 0.0);
                }
            }
            if (!this.U(class072992.method_8320(class072092.method_10084()))) break block12;
            for (n = 0; n < 2; ++n) {
                d3 = (double)class072092.method_10263() + class060692.U();
                d2 = (double)(class072092.method_10264() + 1) - class060692.U() * (double)0.1f;
                d = (double)class072092.method_10260() + class060692.U();
                class072992.method_8406((class07126)class07107.Ny, d3, d2, d, 0.0, 0.0, 0.0);
            }
        }
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070493, class08400 class084002, boolean bl) {
        class084002.N(class08397.field_61896);
        class084002.N(class08397.field_56643);
        class084002.y(class08397.field_56643, (T class070492) -> class070492.method_64419(class070492.method_73183().method_48963().N(), this.u));
    }

    protected abstract MapCodec<? extends class05989> N();

    public void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        Optional var6;
        if (class005003.N(class005002.i())) {
            return;
        }
        if (class05989.N(class072992) && (var6 = class07121.N((class07284)class072992, (class07209)class072092, (class07185)class07185.field_11048)).isPresent()) {
            ((class07121)var6.get()).N((class07284)class072992);
            return;
        }
        if (!class005002.N((class05487)class072992, class072092)) {
            class072992.method_8650(class072092, false);
        }
    }
}

