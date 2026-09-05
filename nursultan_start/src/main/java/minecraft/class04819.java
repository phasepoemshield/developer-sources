/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00701
 *  minecraft.class00869
 *  minecraft.class00886
 *  minecraft.class00891
 *  minecraft.class01217
 *  minecraft.class01362
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06093
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07085
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07443
 *  minecraft.class08036
 *  minecraft.class08397
 *  minecraft.class08400
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Optional;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00701;
import minecraft.class00869;
import minecraft.class00886;
import minecraft.class00891;
import minecraft.class01217;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06093;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07443;
import minecraft.class08036;
import minecraft.class08397;
import minecraft.class08400;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;

public class class04819
extends class00891
implements class00886 {
    public static final MapCodec<class04819> N = class04819.y(class04819::new);
    private static final float y = 0.083333336f;
    private static final float L = 0.9f;
    private static final float u = 1.5f;
    private static final float i = 2.5f;
    private static final class00494 R = class00389.N((double)0.0, (double)0.0, (double)0.0, (double)1.0, (double)0.9f, (double)1.0);
    private static final double M = 4.0;
    private static final double B = 7.0;

    protected class00494 L(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return class00389.N();
    }

    public class04819(class01362 class013622) {
        super(class013622);
    }

    protected boolean y(class00500 class005002, class00500 class005003, class07211 class072112) {
        if (class005003.N((class00891)this)) {
            return true;
        }
        return super.y(class005002, class005003, class072112);
    }

    protected class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        class07049 class070492;
        if (!class060922.i() && class060922 instanceof class06093 && (class070492 = ((class06093)class060922).R()) != null) {
            if (class070492.field_6017 > 2.5) {
                return R;
            }
            if (class070492 instanceof class00701 || class04819.N(class070492) && class060922.N(class00389.y(), class072092, false) && !class060922.L()) {
                return super.y_4(class005002, class072902, class072092, class060922);
            }
        }
        return class00389.N();
    }

    public class06584 N(@Nullable class07438 class074382, class07284 class072842, class07209 class072092, class00500 class005002) {
        class072842.method_8652(class072092, class00869.N.W(), 11);
        if (!class072842.method_8608()) {
            class072842.N(2001, class072092, class00891.W((class00500)class005002));
        }
        return new class06584((class07310)class06570.jm);
    }

    public MapCodec<class04819> N() {
        return N;
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return true;
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070493, class08400 class084002, boolean bl) {
        class07209 class072093;
        if (!(class070493 instanceof class07438) || class070493.method_55667().N((class00891)this)) {
            class070493.method_5844(class005002, new class06889((double)0.9f, 1.5, (double)0.9f));
            if (class072992.method_8608()) {
                class072093 = class072992.method_8409();
                if ((class070493.field_6038 != class070493.method_23317() || class070493.field_5989 != class070493.method_23321()) && class072093.Z()) {
                    class072992.method_8406((class07126)class07107.NX, class070493.method_23317(), (double)(class072092.method_10264() + 1), class070493.method_23321(), (double)(class04995.y((class06069)class072093, (float)-1.0f, (float)1.0f) * 0.083333336f), (double)0.05f, (double)(class04995.y((class06069)class072093, (float)-1.0f, (float)1.0f) * 0.083333336f));
                }
            }
        }
        class072093 = class072092.method_10062();
        class084002.N(class08397.field_56645, class070492 -> {
            if (class072992 instanceof class04782) {
                class04782 class047822 = (class04782)class072992;
                if (class070492.method_5809() && (((Boolean)class047822.method_64395().N(class07305.I)).booleanValue() || class070492 instanceof class08036) && class070492.method_36971(class047822, class072093)) {
                    class072992.N(class072093, false);
                }
            }
        });
        class084002.N(class08397.field_56642);
        class084002.N(class08397.field_56645);
    }

    public void N(class07299 class072992, class00500 class005002, class07209 class072092, class07049 class070492, double d) {
        if (d < 4.0 || !(class070492 instanceof class07438)) {
            return;
        }
        class07438 class074382 = (class07438)class070492;
        class07443 class074432 = class074382.method_39760();
        class04891 class048912 = d < 7.0 ? class074432.y() : class074432.N();
        class070492.method_5783(class048912, 1.0f, 1.0f);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class07049 class070492) {
        class00494 class004942 = this.y_4(class005002, class072902, class072092, class06092.N((class07049)class070492));
        return class004942.method_1110() ? class00389.y() : class004942;
    }

    public static boolean N(class07049 class070492) {
        if (class070492.method_5864().N(class01217.Z)) {
            return true;
        }
        if (class070492 instanceof class07438) {
            return ((class07438)class070492).method_6118(class07085.field_6166).N(class06570.bB);
        }
        return false;
    }

    public Optional<class04891> s_() {
        return Optional.of(class04909.uw);
    }
}

