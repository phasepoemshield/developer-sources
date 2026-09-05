/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00680
 *  minecraft.class00869
 *  minecraft.class00885
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class04770
 *  minecraft.class05487
 *  minecraft.class06113
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06646
 *  minecraft.class06649
 *  minecraft.class06653
 *  minecraft.class06670
 *  minecraft.class06684
 *  minecraft.class06912
 *  minecraft.class07000
 *  minecraft.class07030
 *  minecraft.class07032
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07086
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07237
 *  minecraft.class07299
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00680;
import minecraft.class00869;
import minecraft.class00885;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class04770;
import minecraft.class05487;
import minecraft.class06113;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06646;
import minecraft.class06649;
import minecraft.class06653;
import minecraft.class06670;
import minecraft.class06684;
import minecraft.class06912;
import minecraft.class07000;
import minecraft.class07030;
import minecraft.class07032;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07086;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07237;
import minecraft.class07299;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public class class00399
extends class07000 {
    public static final MapCodec<class00399> y = class00399.y(class00399::new);
    private static @Nullable class06649 R;
    private static @Nullable class06649 M;

    private static class06649 L() {
        if (R == null) {
            R = class06684.N().N(new String[]{"^^^", "###", "~#~"}).N('#', (T class066462) -> class066462.N().N(class01210.Nf)).N('^', class06646.N((Predicate)class06670.N((class00891)class00869.Bl).or((Predicate)class06670.N((class00891)class00869.Bd)))).N('~', (T class066462) -> class066462.N().P()).y();
        }
        return R;
    }

    public class00399(class01362 class013622) {
        super((class07030)class07032.field_11513, class013622);
    }

    private static class06649 u() {
        if (M == null) {
            M = class06684.N().N(new String[]{"   ", "###", "~#~"}).N('#', (T class066462) -> class066462.N().N(class01210.Nf)).N('~', (T class066462) -> class066462.N().P()).y();
        }
        return M;
    }

    public static boolean y(class07299 class072992, class07209 class072092, class06584 class065842) {
        if (class065842.N(class06570.Gd) && class072092.method_10264() >= class072992.method_31607() + 2 && class072992.y() != class07086.field_5801 && !class072992.method_8608()) {
            return class00399.u().N((class05487)class072992, class072092) != null;
        }
        return false;
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, @Nullable class07438 class074382, class06584 class065842) {
        class00399.N(class072992, class072092);
    }

    public MapCodec<class00399> N() {
        return y;
    }

    public static void N(class07299 class072992, class07209 class072092) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class07237) {
            class07237 class072372 = (class07237)class003942;
            class00399.N(class072992, class072092, class072372);
        }
    }

    public static void N(class07299 class072992, class07209 class072092, class07237 class072372) {
        if (class072992.method_8608()) {
            return;
        }
        class00500 class005002 = class072372.w();
        if (!(class005002.N(class00869.Bl) || class005002.N(class00869.Bd)) || class072092.method_10264() < class072992.method_31607() || class072992.y() == class07086.field_5801) {
            return;
        }
        class06653 class066532 = class00399.L().N((class05487)class072992, class072092);
        if (class066532 == null) {
            return;
        }
        class00680 class006802 = (class00680)class07078.yF.N(class072992, class06113.field_16461);
        if (class006802 != null) {
            class00885.N((class07299)class072992, (class06653)class066532);
            class07209 class072093 = class066532.N(1, 2, 0).u();
            class006802.method_5808((double)class072093.method_10263() + 0.5, (double)class072093.method_10264() + 0.55, (double)class072093.method_10260() + 0.5, class066532.y().z() == class07185.field_11048 ? 0.0f : 90.0f, 0.0f);
            class006802.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(class066532.y().z() == class07185.field_11048 ? 0.0f : 90.0f);
            class006802.M();
            for (class04770 class047702 : class072992.N(class04770.class, class006802.method_5829().M(50.0))) {
                class06912.P.N(class047702, (class07049)class006802);
            }
            class072992.method_8649((class07049)class006802);
            class00885.y((class07299)class072992, (class06653)class066532);
        }
    }
}

