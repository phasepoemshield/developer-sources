/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06898
 *  minecraft.class07049
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class08092
 *  minecraft.class08400
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Optional;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00886;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06898;
import minecraft.class07049;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class08092;
import minecraft.class08400;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class00884
extends class00891
implements class00886 {
    public static final MapCodec<class00884> N = class00884.y(class00884::new);
    public static final class06667 y = class06665.B;
    private static final int L = 5;

    private static class00500 T(class00500 class005002) {
        if (class005002.N(class00869.PN)) {
            return class005002;
        }
        if (class005002.N(class00869.iw)) {
            return (class00500)class00869.PN.W().y((class08092)y, (Comparable)Boolean.valueOf(false));
        }
        if (class005002.N(class00869.EI)) {
            return (class00500)class00869.PN.W().y((class08092)y, (Comparable)Boolean.valueOf(true));
        }
        return class00869.K.W();
    }

    public class00884(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Boolean.valueOf(true)));
    }

    private static boolean U(class00500 class005002) {
        return class005002.N(class00869.PN) || class005002.N(class00869.K) && class005002.Y().R() >= 8 && class005002.Y().u();
    }

    protected class04688 u(class00500 class005002) {
        return class04684.L.N(false);
    }

    public static void y(class07284 class072842, class07209 class072092, class00500 class005002) {
        class00884.N(class072842, class072092, class072842.method_8320(class072092), class005002);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        if (!class005002.N(class054872, class072092) || class072112 == class07211.field_11033 || class072112 == class07211.field_11036 && !class005003.N(class00869.PN) && class00884.U(class005003)) {
            class087132.N(class072092, (class00891)this, 5);
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return class00389.N();
    }

    public MapCodec<class00884> N() {
        return N;
    }

    @Override
    public class06584 N(@Nullable class07438 class074382, class07284 class072842, class07209 class072092, class00500 class005002) {
        class072842.method_8652(class072092, class00869.N.W(), 11);
        return new class06584((class07310)class06570.jE);
    }

    @Override
    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class00884.N((class07284)class047822, class072092, class005002, class047822.method_8320(class072092.method_10074()));
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        if (bl) {
            class00500 class005003 = class072992.method_8320(class072092.method_10084());
            if (class005003.M((class07290)class072992, class072092).method_1110() && class005003.Y().W()) {
                class070492.method_5700(((Boolean)class005002.L((class08092)y)).booleanValue(), class072092);
            } else {
                class070492.method_5764(((Boolean)class005002.L((class08092)y)).booleanValue());
            }
        }
    }

    public static void N(class07284 class072842, class07209 class072092, class00500 class005002, class00500 class005003) {
        if (!class00884.U(class005002)) {
            return;
        }
        class00500 class005004 = class00884.T(class005003);
        class072842.method_8652(class072092, class005004, 2);
        class07218 class072182 = class072092.method_25503().N(class07211.field_11036);
        while (class00884.U(class072842.method_8320((class07209)class072182))) {
            if (!class072842.method_8652((class07209)class072182, class005004, 2)) {
                return;
            }
            class072182.N(class07211.field_11036);
        }
    }

    @Override
    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        double d = class072092.method_10263();
        double d2 = class072092.method_10264();
        double d3 = class072092.method_10260();
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            class072992.method_8494((class07126)class07107.Nv, d + 0.5, d2 + 0.8, d3, 0.0, 0.0, 0.0);
            if (class060692.y(200) == 0) {
                class072992.method_8486(d, d2, d3, class04909.uW, class04911.field_15245, 0.2f + class060692.z() * 0.2f, 0.9f + class060692.z() * 0.15f, false);
            }
        } else {
            class072992.method_8494((class07126)class07107.Nn, d + 0.5, d2, d3 + 0.5, 0.0, 0.04, 0.0);
            class072992.method_8494((class07126)class07107.Nn, d + (double)class060692.z(), d2 + (double)class060692.z(), d3 + (double)class060692.z(), 0.0, 0.04, 0.0);
            if (class060692.y(200) == 0) {
                class072992.method_8486(d, d2, d3, class04909.uU, class04911.field_15245, 0.2f + class060692.z() * 0.2f, 0.9f + class060692.z() * 0.15f, false);
            }
        }
    }

    @Override
    public Optional<class04891> s_() {
        return class04684.L.z();
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class00500 class005003 = class054872.method_8320(class072092.method_10074());
        return class005003.N(class00869.PN) || class005003.N(class00869.EI) || class005003.N(class00869.iw);
    }

    protected class06898 d_(class00500 class005002) {
        return class06898.field_11455;
    }
}

