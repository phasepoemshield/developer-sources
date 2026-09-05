/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class01210
 *  minecraft.class01339
 *  minecraft.class01362
 *  minecraft.class02674
 *  minecraft.class02774
 *  minecraft.class02859
 *  minecraft.class04770
 *  minecraft.class05487
 *  minecraft.class06113
 *  minecraft.class06646
 *  minecraft.class06649
 *  minecraft.class06653
 *  minecraft.class06670
 *  minecraft.class06684
 *  minecraft.class06912
 *  minecraft.class06942
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07101
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07625
 *  minecraft.class07888
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08950
 *  minecraft.class08982
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.BiMap;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01339;
import minecraft.class01362;
import minecraft.class02674;
import minecraft.class02774;
import minecraft.class02859;
import minecraft.class04770;
import minecraft.class05487;
import minecraft.class06113;
import minecraft.class06646;
import minecraft.class06649;
import minecraft.class06653;
import minecraft.class06670;
import minecraft.class06684;
import minecraft.class06912;
import minecraft.class06942;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07101;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07625;
import minecraft.class07888;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08950;
import minecraft.class08982;
import org.jspecify.annotations.Nullable;

public class class00885
extends class07101 {
    public static final MapCodec<class00885> N = class00885.y(class00885::new);
    public static final class08064<class07211> y = class07101.R;
    private @Nullable class06649 L;
    private @Nullable class06649 u;
    private @Nullable class06649 i;
    private @Nullable class06649 M;
    private @Nullable class06649 B;
    private @Nullable class06649 Z;
    private static final Predicate<class00500> O = class005002 -> class005002.N(class00869.iK) || class005002.N(class00869.iV);

    public void L(class07299 class072992, class06653 class066532) {
        class06646 class066462 = class066532.N(0, 1, 0);
        class07211 class072112 = (class07211)class066532.N(0, 0, 0).N().L(y);
        class00500 class005002 = class08950.N((class00891)class066462.N().i(), (class07211)class072112, (class07299)class072992, (class07209)class066462.u());
        class072992.method_8652(class066462.u(), class005002, 2);
    }

    private class06649 L() {
        if (this.u == null) {
            this.u = class06684.N().N(new String[]{"^", "#", "#"}).N('^', class06646.N(O)).N('#', class06646.N((Predicate)class06670.N((class00891)class00869.ib))).y();
        }
        return this.u;
    }

    private class06649 T() {
        if (this.B == null) {
            this.B = class06684.N().N(new String[]{" ", "#"}).N('#', class06646.N((T class005002) -> class005002.N(class01210.NU))).y();
        }
        return this.B;
    }

    public class00885(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y(y, (Comparable)class07211.field_11043));
    }

    private class06649 i() {
        if (this.M == null) {
            this.M = class06684.N().N(new String[]{"~^~", "###", "~#~"}).N('^', class06646.N(O)).N('#', class06646.N((Predicate)class06670.N((class00891)class00869.Lj))).N('~', class06646.N(class01339::P)).y();
        }
        return this.M;
    }

    private class06649 b() {
        if (this.Z == null) {
            this.Z = class06684.N().N(new String[]{"^", "#"}).N('^', class06646.N(O)).N('#', class06646.N((T class005002) -> class005002.N(class01210.NU))).y();
        }
        return this.Z;
    }

    private class06649 u() {
        if (this.i == null) {
            this.i = class06684.N().N(new String[]{"~ ~", "###", "~#~"}).N('#', class06646.N((Predicate)class06670.N((class00891)class00869.Lj))).N('~', class06646.N(class01339::P)).y();
        }
        return this.i;
    }

    public static void y(class07299 class072992, class06653 class066532) {
        for (int i = 0; i < class066532.u(); ++i) {
            for (int j = 0; j < class066532.i(); ++j) {
                class06646 class066462 = class066532.N(i, j, 0);
                class072992.method_8408(class066462.u(), class00869.N);
            }
        }
    }

    private class06649 y() {
        if (this.L == null) {
            this.L = class06684.N().N(new String[]{" ", "#", "#"}).N('#', class06646.N((Predicate)class06670.N((class00891)class00869.ib))).y();
        }
        return this.L;
    }

    public boolean N(class05487 class054872, class07209 class072092) {
        return this.y().N(class054872, class072092) != null || this.u().N(class054872, class072092) != null || this.T().N(class054872, class072092) != null;
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        if (class005003.N(class005002.i())) {
            return;
        }
        this.N(class072992, class072092);
    }

    public MapCodec<? extends class00885> N() {
        return N;
    }

    private static void N(class07299 class072992, class06653 class066532, class07049 class070492, class07209 class072092) {
        class00885.N(class072992, class066532);
        class070492.method_5808((double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.05, (double)class072092.method_10260() + 0.5, 0.0f, 0.0f);
        class072992.method_8649(class070492);
        for (class04770 class047702 : class072992.N(class04770.class, class070492.method_5829().M(5.0))) {
            class06912.P.N(class047702, class070492);
        }
        class00885.y(class072992, class066532);
    }

    public static void N(class07299 class072992, class06653 class066532) {
        for (int i = 0; i < class066532.u(); ++i) {
            for (int j = 0; j < class066532.i(); ++j) {
                class06646 class066462 = class066532.N(i, j, 0);
                class072992.method_8652(class066462.u(), class00869.N.W(), 2);
                class072992.N(2001, class066462.u(), class00891.W(class066462.N()));
            }
        }
    }

    public class00500 N(class06942 class069422) {
        return (class00500)this.W().y(y, (Comparable)class069422.method_8042().b());
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    private class02774 N(class06653 class066532) {
        class00500 class005002 = class066532.N(0, 1, 0).N();
        class00891 class008913 = class005002.i();
        if (class008913 instanceof class02674) {
            return (class02774)((class02674)class008913).i();
        }
        return (class02774)Optional.ofNullable((class00891)((Object)((BiMap)class02859.y.get()).get((Object)class005002.i()))).filter(class008912 -> class008912 instanceof class02674).map(class008912 -> (class02674)class008912).orElse((class02674)class00869.bx).i();
    }

    private void N(class07299 class072992, class07209 class072092) {
        class08982 class089822;
        class07625 class076252;
        class07888 class078882;
        class06653 class066532 = this.L().N((class05487)class072992, class072092);
        if (class066532 != null && (class078882 = (class07888)class07078.yv.N(class072992, class06113.field_16461)) != null) {
            class00885.N(class072992, class066532, (class07049)class078882, class066532.N(0, 2, 0).u());
            return;
        }
        class078882 = this.i().N((class05487)class072992, class072092);
        if (class078882 != null && (class076252 = (class07625)class07078.Nn.N(class072992, class06113.field_16461)) != null) {
            class076252.M(true);
            class00885.N(class072992, (class06653)class078882, (class07049)class076252, class078882.N(1, 2, 0).u());
            return;
        }
        class076252 = this.b().N((class05487)class072992, class072092);
        if (class076252 != null && (class089822 = (class08982)class07078.g.N(class072992, class06113.field_16461)) != null) {
            class00885.N(class072992, (class06653)class076252, (class07049)class089822, class076252.N(0, 0, 0).u());
            this.L(class072992, (class06653)class076252);
            class089822.y(this.N((class06653)class076252));
        }
    }
}

