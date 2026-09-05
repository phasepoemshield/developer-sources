/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class00143
 *  minecraft.class00379
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00570
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class00860
 *  minecraft.class04782
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05744
 *  minecraft.class05765
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class06289
 *  minecraft.class06293
 *  minecraft.class06584
 *  minecraft.class06638
 *  minecraft.class06695
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07085
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07236
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07438
 *  minecraft.class07475
 *  minecraft.class07623
 *  minecraft.class07655
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class00143;
import minecraft.class00379;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00570;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class00860;
import minecraft.class04782;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05744;
import minecraft.class05765;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06289;
import minecraft.class06293;
import minecraft.class06584;
import minecraft.class06638;
import minecraft.class06695;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07236;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07438;
import minecraft.class07475;
import minecraft.class07623;
import minecraft.class07655;
import minecraft.class08092;
import minecraft.class08948;
import minecraft.class08964;
import minecraft.class08969;
import minecraft.class08993;
import org.jspecify.annotations.Nullable;

public class class08945
extends class05765<class07475> {
    public static final int N = 60;
    private static final int y = 6000;
    private static final int L = 16;
    private static final int u = 10;
    private static final int i = 50;
    private static final int R = 1;
    private static final int Z = 140;
    private static final double z = 3.0;
    private static final double U = 0.5;
    private static final double E = 1.0;
    private static final double W = 2.0;
    private final float m;
    private final int P;
    private final int s;
    private final Predicate<class00500> T;
    private final Predicate<class00500> b;
    private final Predicate<class08948> j;
    private final Consumer<class07475> v;
    private final Map<class08969, class08993> n;
    private @Nullable class08948 t = null;
    private class08964 G;
    private @Nullable class08969 l;
    private int d;

    private class06889 L(class07475 class074752) {
        return this.N(class074752, class074752.method_73189());
    }

    private void L(class07475 class074752, class06695 class066952) {
        class074752.method_5673(class07085.field_6173, class08945.y(class066952));
        class074752.N(class07085.field_6173);
        class066952.method_5431();
        this.y(class074752);
    }

    private void L(class08948 class089482, class07299 class072992, class07475 class074752) {
        if (!this.y(class089482, class072992)) {
            this.i(class074752);
        }
    }

    private Optional<class08948> L(class04782 class047822, class07475 class074752) {
        class00734 class007342 = this.B(class074752);
        Set<class06289> var4 = class08945.U(class074752);
        Set<class06289> var5 = class08945.E(class074752);
        List var6 = class07321.N((class07321)new class07321(class074752.method_24515()), (int)(Math.floorDiv(this.Z(class074752), 16) + 1)).toList();
        class08948 class089482 = null;
        double d = 3.4028234663852886E38;
        for (class07321 class073212 : var6) {
            class00570 class005702 = class047822.method_14178().N(class073212.B, class073212.Z);
            if (class005702 == null) continue;
            for (class00394 class003942 : class005702.o().values()) {
                class08948 class089483;
                class00379 class003792;
                double d2;
                if (!(class003942 instanceof class00379) || !((d2 = (class003792 = (class00379)class003942).d().method_19770((class00737)class074752.method_73189())) < d) || (class089483 = this.N(class074752, (class07299)class047822, (class00394)class003792, var4, var5, class007342)) == null) continue;
                class089482 = class089483;
                d = d2;
            }
        }
        return class089482 == null ? Optional.empty() : Optional.of(class089482);
    }

    protected void L(class04782 class047822, class07475 class074752, long l) {
        boolean bl = this.y(class047822, class074752);
        if (this.t == null) {
            this.u(class047822, class074752, l);
            return;
        }
        if (bl) {
            return;
        }
        if (this.G.equals((Object)class08964.field_61251)) {
            this.L(this.t, (class07299)class047822, class074752);
        }
        if (this.G.equals((Object)class08964.field_61250)) {
            this.N(this.t, (class07299)class047822, class074752);
        }
        if (this.G.equals((Object)class08964.field_61252)) {
            this.y(this.t, (class07299)class047822, class074752);
        }
    }

    private void M(class07475 class074752) {
        this.v.accept(class074752);
        this.N(class08964.field_61250);
        this.l = null;
        this.d = 0;
    }

    private static boolean P(class07475 class074752) {
        return class074752.method_6047().R();
    }

    private void T(class07475 class074752) {
        class074752.f().W();
        class074752.L(0.0f);
        class074752.y(0.0f);
        class074752.method_6125(0.0f);
        class074752.method_18800(0.0, class074752.method_18798().B, 0.0);
    }

    public class08945(float f, Predicate<class00500> predicate, Predicate<class00500> predicate2, int n, int n2, Map<class08969, class08993> map, Consumer<class07475> consumer, Predicate<class08948> predicate3) {
        super((Map)ImmutableMap.of((Object)class05378.NL, (Object)class05367.field_18458, (Object)class05378.Nu, (Object)class05367.field_18458, (Object)class05378.Ni, (Object)class05367.field_18457, (Object)class05378.NN, (Object)class05367.field_18457));
        this.m = f;
        this.T = predicate;
        this.b = predicate2;
        this.P = n;
        this.s = n2;
        this.v = consumer;
        this.j = predicate3;
        this.n = map;
        this.G = class08964.field_61250;
    }

    private class00734 B(class07475 class074752) {
        int n = this.Z(class074752);
        return new class00734(class074752.method_24515()).L((double)n, (double)this.z(class074752), (double)n);
    }

    private int Z(class07475 class074752) {
        return class074752.method_5765() ? 1 : this.P;
    }

    private static class06584 i(class07475 class074752, class06695 class066952) {
        int n = 0;
        class06584 class065842 = class074752.method_6047();
        for (class06584 class065843 : class066952) {
            if (class065843.R()) {
                class066952.method_5447(n, class065842);
                return class06584.E;
            }
            if (class06584.L((class06584)class065843, (class06584)class065842) && class065843.c() < class065843.U()) {
                int n2 = class065843.U() - class065843.c();
                int n3 = Math.min(n2, class065842.c());
                class065843.i(class065843.c() + n3);
                class065842.i(class065842.c() - n2);
                class066952.method_5447(n, class065843);
                if (class065842.R()) {
                    return class06584.E;
                }
            }
            ++n;
        }
        return class065842;
    }

    private void i(class07475 class074752) {
        this.N(class08964.field_61250);
        this.R(class074752);
    }

    private void s(class07475 class074752) {
        this.N(class074752);
        class074752.method_18868().N(class05378.Ni, (Object)140);
        class074752.method_18868().y(class05378.NL);
        class074752.method_18868().y(class05378.Nu);
    }

    private static double m(class07475 class074752) {
        return class08945.W(class074752) ? 1.0 : 0.5;
    }

    private static Set<class06289> U(class07475 class074752) {
        return class074752.method_18868().L(class05378.NL).orElse(Set.of());
    }

    private int z(class07475 class074752) {
        return class074752.method_5765() ? 1 : this.s;
    }

    private void u(class07475 class074752) {
        this.T(class074752);
        this.N(class08964.field_61251);
    }

    private void u(class07475 class074752, class06695 class066952) {
        class06584 class065842 = class08945.i(class074752, class066952);
        class066952.method_5431();
        class074752.method_5673(class07085.field_6173, class065842);
        if (class065842.R()) {
            this.y(class074752);
        } else {
            this.N(class074752);
        }
    }

    protected void u(class04782 class047822, class07475 class074752, long l) {
        this.M(class074752);
        class07623 class076232 = class074752.f();
        if (class076232 instanceof class07655) {
            ((class07655)class076232).i(false);
        }
    }

    private static class06584 y(class06695 class066952) {
        int n = 0;
        for (class06584 class065842 : class066952) {
            if (!class065842.R()) {
                int n2 = Math.min(class065842.c(), 16);
                return class066952.method_5434(n, n2);
            }
            ++n;
        }
        return class06584.E;
    }

    protected void y(class07475 class074752) {
        this.N(class074752);
        class074752.method_18868().y(class05378.NL);
        class074752.method_18868().y(class05378.Nu);
    }

    private static boolean y(class07475 class074752, class06695 class066952) {
        class06584 class065842 = class074752.method_6047();
        Iterator var3 = class066952.iterator();
        while (var3.hasNext()) {
            if (!class06584.y((class06584)((class06584)var3.next()), (class06584)class065842)) continue;
            return true;
        }
        return false;
    }

    private boolean y(class08948 class089482, class07299 class072992) {
        return this.N(class089482, class072992).anyMatch(this.j);
    }

    protected void y(class07475 class074752, class07299 class072992, class07209 class072092) {
        HashSet<class06289> hashSet = new HashSet<class06289>(class08945.U(class074752));
        hashSet.remove(new class06289(class072992.method_27983(), class072092));
        HashSet<class06289> hashSet2 = new HashSet<class06289>(class08945.E(class074752));
        hashSet2.add(new class06289(class072992.method_27983(), class072092));
        if (hashSet2.size() > 50) {
            this.s(class074752);
        } else {
            class074752.method_18868().N(class05378.NL, hashSet, 6000L);
            class074752.method_18868().N(class05378.Nu, hashSet2, 6000L);
        }
    }

    private void y(class08969 class089692) {
        this.l = class089692;
    }

    private void y(class08948 class089482, class07475 class074752) {
        class074752.method_18868().N(class05378.P, (Object)new class05744(class089482.N()));
        this.T(class074752);
        if (this.l != null) {
            Optional.ofNullable(this.n.get((Object)this.l)).ifPresent(class089932 -> class089932.accept(class074752, (Object)class089482, this.d));
        }
    }

    protected boolean y(class04782 class047822, class07475 class074752, long l) {
        return class074752.method_18868().L(class05378.Ni).isEmpty() && !class074752.Nk() && !class074752.g_();
    }

    private boolean y(class04782 class047822, class07475 class074752) {
        if (!this.N((class07299)class047822, class074752)) {
            this.N(class074752);
            Optional<class08948> var3 = this.L(class047822, class074752);
            if (var3.isPresent()) {
                this.t = var3.get();
                this.M(class074752);
                this.N(class074752, (class07299)class047822, this.t.N());
                return true;
            }
            this.s(class074752);
            return true;
        }
        return false;
    }

    private boolean y(class07299 class072992, class08948 class089482) {
        return class089482.L().equals(class072992.method_8321(class089482.N()));
    }

    protected void y(class08948 class089482, class07299 class072992, class07475 class074752) {
        if (!this.N(2.0, class089482, class072992, class074752, this.L(class074752))) {
            this.M(class074752);
        } else {
            ++this.d;
            this.y(class089482, class074752);
            if (this.d >= 60) {
                this.N(class074752, class089482.y(), this::L, (class07475 class074753, class06695 class066952) -> this.N(class074752), this::u, (class07475 class074753, class06695 class066952) -> this.N(class074752));
                this.M(class074752);
            }
        }
    }

    private static Set<class06289> E(class07475 class074752) {
        return class074752.method_18868().L(class05378.Nu).orElse(Set.of());
    }

    protected boolean N(long l) {
        return false;
    }

    private void N(class08948 class089482, class07475 class074752) {
        this.N(class074752, class089482.y(), this.N(class08969.field_61245), this.N(class08969.field_61246), this.N(class08969.field_61247), this.N(class08969.field_61248));
        this.N(class08964.field_61252);
    }

    protected void N(class07475 class074752) {
        this.d = 0;
        this.t = null;
        class074752.f().W();
        class074752.method_18868().y(class05378.m);
    }

    protected void N(class08948 class089482, class07299 class072992, class07475 class074752) {
        if (this.N(3.0, class089482, class072992, class074752, this.L(class074752)) && this.y(class089482, class072992)) {
            this.u(class074752);
        } else if (this.N(class08945.m(class074752), class089482, class072992, class074752, this.L(class074752))) {
            this.N(class089482, class074752);
        } else {
            this.R(class074752);
        }
    }

    protected void N(class04782 class047822, class07475 class074752, long l) {
        class07623 class076232 = class074752.f();
        if (class076232 instanceof class07655) {
            ((class07655)class076232).i(true);
        }
    }

    private boolean N(Set<class06289> set, Set<class06289> set2, class08948 class089483, class07299 class072992) {
        return this.N(class089483, class072992).map(class089482 -> new class06289(class072992.method_27983(), class089482.N())).anyMatch(class062892 -> set.contains(class062892) || set2.contains(class062892));
    }

    protected boolean N(class04782 class047822, class07475 class074752) {
        return !class074752.g_();
    }

    protected void N(class07475 class074752, class07299 class072992, class07209 class072092) {
        HashSet<class06289> hashSet = new HashSet<class06289>(class08945.U(class074752));
        hashSet.add(new class06289(class072992.method_27983(), class072092));
        if (hashSet.size() > 10) {
            this.s(class074752);
        } else {
            class074752.method_18868().N(class05378.NL, hashSet, 6000L);
        }
    }

    private boolean N(class07299 class072992, class07475 class074752) {
        if (this.t != null && this.N(class074752, this.t.u()) && this.y(class072992, this.t) && !this.N(class072992, this.t)) {
            if (!this.G.equals((Object)class08964.field_61250)) {
                return true;
            }
            if (this.N(class072992, this.t, class074752)) {
                return true;
            }
            this.y(class074752, class072992, this.t.N());
        }
        return false;
    }

    private boolean N(class07475 class074752, class00500 class005002) {
        return class08945.P(class074752) ? this.T.test(class005002) : this.b.test(class005002);
    }

    private boolean N(class08948 class089482) {
        class00394 class003942 = class089482.L();
        return class003942 instanceof class07236 && ((class07236)class003942).Z();
    }

    private boolean N(double d, class08948 class089482, class07299 class072992, class07475 class074752, class06889 class068892) {
        class00734 class007342 = class074752.method_5829();
        class00734 class007343 = class00734.N((class06889)class068892, (double)class007342.y(), (double)class007342.L(), (double)class007342.u());
        return class089482.u().M((class07290)class072992, class089482.N()).method_1107().L(d, 0.5, d).N(class089482.N()).L(class007343);
    }

    private Stream<class08948> N(class08948 class089482, class07299 class072992) {
        if (class089482.u().N((class08092)class00860.i, (Comparable)class06638.field_12569) != class06638.field_12569) {
            class08948 class089483 = class08948.N(class00860.y((class07209)class089482.N(), (class00500)class089482.u()), class072992);
            return class089483 != null ? Stream.of(class089482, class089483) : Stream.of(class089482);
        }
        return Stream.of(class089482);
    }

    private boolean N(class07299 class072992, class08948 class089482) {
        return class00860.N((class07284)class072992, (class07209)class089482.N());
    }

    private class06889 N(class07475 class074752, class06889 class068892) {
        return class068892.y(0.0, class074752.method_5829().L() / 2.0, 0.0);
    }

    private class06889 N(@Nullable class00143 class001432, class07475 class074752) {
        class06889 class068892 = class001432 == null || class001432.u() == null ? class074752.method_73189() : class001432.u().u().method_61082();
        return this.N(class074752, class068892);
    }

    private boolean N(class07299 class072992, class08948 class089482, class07475 class074752) {
        class00143 class001432 = class074752.f().Z() == null ? class074752.f().N(class089482.N(), 0) : class074752.f().Z();
        class06889 class068892 = this.N(class001432, class074752);
        boolean bl = this.N(class08945.m(class074752), class089482, class072992, class074752, class068892);
        return class001432 == null && !bl || this.N(class072992, bl, class068892, class089482, class074752);
    }

    private static boolean N(class06695 class066952) {
        return !class066952.method_5442();
    }

    private static boolean N(class07475 class074752, class06695 class066952) {
        return class066952.method_5442() || class08945.y(class074752, class066952);
    }

    private void N(class08964 class089642) {
        this.G = class089642;
    }

    private BiConsumer<class07475, class06695> N(class08969 class089692) {
        return (class074752, class066952) -> this.y(class089692);
    }

    private boolean N(class08948 class089482, class07299 class072992, class07475 class074752, class06889 class068892) {
        class06889 class068894 = class089482.N().method_46558();
        return class07211.N().map(class072112 -> class068894.y(0.5 * (double)class072112.P(), 0.5 * (double)class072112.s(), 0.5 * (double)class072112.T())).map(class068893 -> class072992.N(new class05862(class068892, class068893, class05849.field_17558, class05835.field_1348, (class07049)class074752))).anyMatch(class061832 -> class061832.N() == class07113.field_1332 && class061832.u().equals((Object)class089482.N()));
    }

    private @Nullable class08948 N(class07475 class074752, class07299 class072992, class00394 class003942, Set<class06289> set, Set<class06289> set2, class00734 class007342) {
        class07209 class072092 = class003942.d();
        if (!class007342.i((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260())) {
            return null;
        }
        class08948 class089482 = class08948.N(class003942, class072992);
        if (class089482 == null) {
            return null;
        }
        return this.N(class074752, class089482.u()) && !this.N(set, set2, class089482, class072992) && !this.N(class089482) ? class089482 : null;
    }

    private void N(class07475 class074752, class06695 class066952, BiConsumer<class07475, class06695> biConsumer, BiConsumer<class07475, class06695> biConsumer2, BiConsumer<class07475, class06695> biConsumer3, BiConsumer<class07475, class06695> biConsumer4) {
        if (class08945.P(class074752)) {
            if (class08945.N(class066952)) {
                biConsumer.accept(class074752, class066952);
            } else {
                biConsumer2.accept(class074752, class066952);
            }
        } else if (class08945.N(class074752, class066952)) {
            biConsumer3.accept(class074752, class066952);
        } else {
            biConsumer4.accept(class074752, class066952);
        }
    }

    private boolean N(class07299 class072992, boolean bl, class06889 class068892, class08948 class089482, class07475 class074752) {
        return bl && this.N(class089482, class072992, class074752, class068892);
    }

    private static boolean W(class07475 class074752) {
        return class074752.f().Z() != null && class074752.f().Z().L();
    }

    private void R(class07475 class074752) {
        if (this.t != null) {
            class06293.N((class07438)class074752, (class07209)this.t.N(), (float)this.m, (int)0);
        }
    }
}

