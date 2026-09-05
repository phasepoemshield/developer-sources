/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  minecraft.class00734
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class02566
 *  minecraft.class02666
 *  minecraft.class02676
 *  minecraft.class03556
 *  minecraft.class03748
 *  minecraft.class04206
 *  minecraft.class04770
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05700
 *  minecraft.class05845
 *  minecraft.class05880
 *  minecraft.class06237
 *  minecraft.class06695
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class07001
 *  minecraft.class07044
 *  minecraft.class07047
 *  minecraft.class07055
 *  minecraft.class07061
 *  minecraft.class07084
 *  minecraft.class07209
 *  minecraft.class07236
 *  minecraft.class07269
 *  minecraft.class07299
 *  minecraft.class07482
 *  minecraft.class07501
 *  minecraft.class07830
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08618
 *  minecraft.class08633
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class00385;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01929;
import minecraft.class02484;
import minecraft.class02566;
import minecraft.class02666;
import minecraft.class02676;
import minecraft.class03556;
import minecraft.class03748;
import minecraft.class04206;
import minecraft.class04770;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05700;
import minecraft.class05845;
import minecraft.class05880;
import minecraft.class06237;
import minecraft.class06695;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class07001;
import minecraft.class07044;
import minecraft.class07047;
import minecraft.class07055;
import minecraft.class07061;
import minecraft.class07084;
import minecraft.class07209;
import minecraft.class07236;
import minecraft.class07269;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class07501;
import minecraft.class07830;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08618;
import minecraft.class08633;
import org.jspecify.annotations.Nullable;

public class class00419
extends class00394
implements class06237,
class07061,
class08618 {
    private static final int m = 4;
    public static final List<List<class03556<class07084>>> N = List.of(List.of(class07047.N, class07047.L), List.of(class07047.U, class07047.B), List.of(class07047.i), List.of(class07047.z));
    private static final Set<class03556<class07084>> P = N.stream().flatMap(Collection::stream).collect(Collectors.toSet());
    public static final int y = 0;
    public static final int L = 1;
    public static final int u = 2;
    public static final int i = 3;
    private static final int s = 10;
    private static final class00392 T = class00392.L("container.beacon");
    private static final String b = "primary_effect";
    private static final String j = "secondary_effect";
    List<class08633> R = new ArrayList<class08633>();
    private List<class08633> v = new ArrayList<class08633>();
    int M;
    private int n;
    @Nullable class03556<class07084> B;
    @Nullable class03556<class07084> Z;
    private @Nullable class00392 t;
    private class07044 G = class07044.N;
    private final class05845 l = new class00385(this);

    public class07269 i() {
        return class07269.N((class00394)this);
    }

    public class00392 method_5476() {
        return this.method_5477();
    }

    public @Nullable class00392 method_5797() {
        return this.t;
    }

    public class00392 method_5477() {
        if (this.t != null) {
            return this.t;
        }
        return T;
    }

    public class00419(class07209 class072092, class00500 class005002) {
        super(class00404.field_11890, class072092, class005002);
    }

    @Override
    public void y(class08329 class083292) {
        class083292.L("CustomName");
        class083292.L("lock");
    }

    private static @Nullable class03556<class07084> y(class08299 class082992, String string) {
        return class082992.N(string, class04206.u.b()).filter(P::contains).orElse(null);
    }

    public void N(@Nullable class00392 class003922) {
        this.t = class003922;
    }

    static @Nullable class03556<class07084> N(@Nullable class03556<class07084> class035562) {
        return P.contains(class035562) ? class035562 : null;
    }

    @Override
    public void N(class07299 class072992) {
        super.N(class072992);
        this.n = class072992.method_31607() - 1;
    }

    @Override
    protected void N(class02676 class026762) {
        super.N(class026762);
        class026762.N(class02484.B, (Object)this.t);
        if (!this.G.equals((Object)class07044.N)) {
            class026762.N(class02484.Nw, (Object)this.G);
        }
    }

    @Override
    protected void N_9(class02666 class026662) {
        super.N_9(class026662);
        this.t = (class00392)class026662.method_58694(class02484.B);
        this.G = (class07044)class026662.a_(class02484.Nw, (Object)class07044.N);
    }

    public List<class08633> N() {
        return this.M == 0 ? ImmutableList.of() : this.R;
    }

    public static void N(class07299 class072992, class07209 class072092, class04891 class048912) {
        class072992.method_8396(null, class072092, class048912, class04911.field_15245, 1.0f, 1.0f);
    }

    private static void N(class07299 class072992, class07209 class072092, int n, @Nullable class03556<class07084> class035562, @Nullable class03556<class07084> class035563) {
        if (class072992.method_8608() || class035562 == null) {
            return;
        }
        double d = n * 10 + 10;
        int n2 = 0;
        if (n >= 4 && Objects.equals(class035562, class035563)) {
            n2 = 1;
        }
        int n3 = (9 + n * 2) * 20;
        class00734 class007342 = new class00734(class072092).M(d).y(0.0, (double)class072992.method_31605(), 0.0);
        List var10 = class072992.N(class08036.class, class007342);
        for (class08036 class080362 : var10) {
            class080362.method_6092(new class07055(class035562, n3, n2, true, true));
        }
        if (n >= 4 && !Objects.equals(class035562, class035563) && class035563 != null) {
            for (class08036 class080362 : var10) {
                class080362.method_6092(new class07055(class035563, n3, 0, true, true));
            }
        }
    }

    private static int N(class07299 class072992, int n, int n2, int n3) {
        int n4;
        int n5 = 0;
        int n6 = 1;
        while (n6 <= 4 && (n4 = n2 - n6) >= class072992.method_31607()) {
            boolean bl = true;
            block1: for (int i = n - n6; i <= n + n6 && bl; ++i) {
                for (int j = n3 - n6; j <= n3 + n6; ++j) {
                    if (class072992.method_8320(new class07209(i, n4, j)).N(class01210.yN)) continue;
                    bl = false;
                    continue block1;
                }
            }
            if (!bl) break;
            n5 = n6++;
        }
        return n5;
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class00419 class004192) {
        int n;
        class07209 class072093;
        int n2 = class072092.method_10263();
        int n3 = class072092.method_10264();
        int n4 = class072092.method_10260();
        if (class004192.n < n3) {
            class072093 = class072092;
            class004192.v = Lists.newArrayList();
            class004192.n = class072093.method_10264() - 1;
        } else {
            class072093 = new class07209(n2, class004192.n + 1, n4);
        }
        class08633 class086332 = class004192.v.isEmpty() ? null : class004192.v.get(class004192.v.size() - 1);
        int n5 = class072992.method_8624(class07830.field_13202, n2, n4);
        for (n = 0; n < 10 && class072093.method_10264() <= n5; ++n) {
            block18: {
                class00500 class005003;
                block16: {
                    int n6;
                    block17: {
                        class005003 = class072992.method_8320(class072093);
                        class00891 class008912 = class005003.i();
                        if (!(class008912 instanceof class05700)) break block16;
                        class05700 class057002 = (class05700)class008912;
                        n6 = class057002.y().L();
                        if (class004192.v.size() > 1) break block17;
                        class086332 = new class08633(n6);
                        class004192.v.add(class086332);
                        break block18;
                    }
                    if (class086332 == null) break block18;
                    if (n6 == class086332.y()) {
                        class086332.N();
                    } else {
                        class086332 = new class08633(class02566.M((int)class086332.y(), (int)n6));
                        class004192.v.add(class086332);
                    }
                    break block18;
                }
                if (class086332 != null && (class005003.z() < 15 || class005003.N(class00869.q))) {
                    class086332.N();
                } else {
                    class004192.v.clear();
                    class004192.n = n5;
                    break;
                }
            }
            class072093 = class072093.method_10084();
            ++class004192.n;
        }
        n = class004192.M;
        if (class072992.N() % 80L == 0L) {
            if (!class004192.R.isEmpty()) {
                class004192.M = class00419.N(class072992, n2, n3, n4);
            }
            if (class004192.M > 0 && !class004192.R.isEmpty()) {
                class00419.N(class072992, class072092, class004192.M, class004192.B, class004192.Z);
                class00419.N(class072992, class072092, class04909.yD);
            }
        }
        if (class004192.n >= n5) {
            class004192.n = class072992.method_31607() - 1;
            boolean bl = n > 0;
            class004192.R = class004192.v;
            if (!class072992.method_8608()) {
                boolean bl2;
                boolean bl3 = bl2 = class004192.M > 0;
                if (!bl && bl2) {
                    class00419.N(class072992, class072092, class04909.yx);
                    for (class04770 class047702 : class072992.N(class04770.class, new class00734((double)n2, (double)n3, (double)n4, (double)n2, (double)(n3 - 4), (double)n4).L(10.0, 5.0, 10.0))) {
                        class06912.W.N(class047702, class004192.M);
                    }
                } else if (bl && !bl2) {
                    class00419.N(class072992, class072092, class04909.yh);
                }
            }
        }
    }

    @Override
    protected void N(class08329 class083292) {
        super.N(class083292);
        class00419.N(class083292, b, this.B);
        class00419.N(class083292, j, this.Z);
        class083292.N("Levels", this.M);
        class083292.y("CustomName", class03748.N, (Object)this.t);
        this.G.N(class083292);
    }

    @Override
    protected void N(class08299 class082992) {
        super.N(class082992);
        this.B = class00419.y(class082992, b);
        this.Z = class00419.y(class082992, j);
        this.t = class00419.N_10(class082992, "CustomName");
        this.G = class07044.N((class08299)class082992);
    }

    private static void N(class08329 class083292, String string, @Nullable class03556<class07084> class035562) {
        if (class035562 != null) {
            class035562.i().ifPresent(class059462 -> class083292.N(string, class059462.N().toString()));
        }
    }

    @Override
    public class07001 N(class01929 class019292) {
        return this.u(class019292);
    }

    @Override
    public void r_() {
        class00419.N(this.z, this.U, class04909.yh);
        super.r_();
    }

    public @Nullable class07482 createMenu(int n, class08044 class080442, class08036 class080362) {
        if (this.G.N(class080362)) {
            return new class07501(n, (class06695)class080442, this.l, class05880.N((class07299)this.z, (class07209)this.d()));
        }
        class07236.N((class06889)this.d().method_46558(), (class08036)class080362, (class00392)this.method_5476());
        return null;
    }
}

