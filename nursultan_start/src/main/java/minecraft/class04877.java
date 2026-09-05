/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.MatchException
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00412
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01235
 *  minecraft.class01296
 *  minecraft.class01487
 *  minecraft.class02055
 *  minecraft.class02484
 *  minecraft.class02701
 *  minecraft.class02708
 *  minecraft.class02875
 *  minecraft.class04227
 *  minecraft.class04444
 *  minecraft.class04770
 *  minecraft.class04774
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05220
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06495
 *  minecraft.class06563
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06685
 *  minecraft.class06702
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07055
 *  minecraft.class07078
 *  minecraft.class07085
 *  minecraft.class07086
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07448
 *  minecraft.class07529
 *  minecraft.class07830
 *  minecraft.class08073
 *  minecraft.class08562
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00412;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01235;
import minecraft.class01296;
import minecraft.class01487;
import minecraft.class02055;
import minecraft.class02484;
import minecraft.class02701;
import minecraft.class02708;
import minecraft.class02875;
import minecraft.class04227;
import minecraft.class04444;
import minecraft.class04770;
import minecraft.class04774;
import minecraft.class04782;
import minecraft.class04847;
import minecraft.class04875;
import minecraft.class04882;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05220;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06495;
import minecraft.class06563;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06685;
import minecraft.class06702;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07055;
import minecraft.class07078;
import minecraft.class07085;
import minecraft.class07086;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07448;
import minecraft.class07529;
import minecraft.class07830;
import minecraft.class08073;
import minecraft.class08562;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04877 {
    public static final class02875 N = class07448.N((class07078)class07078.yB);
    public static final MapCodec<class04877> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.BOOL.fieldOf("started").forGetter(class048772 -> class048772.O), (App)Codec.BOOL.fieldOf("active").forGetter(class048772 -> class048772.J), (App)Codec.LONG.fieldOf("ticks_active").forGetter(class048772 -> class048772.Y), (App)Codec.INT.fieldOf("raid_omen_level").forGetter(class048772 -> class048772.I), (App)Codec.INT.fieldOf("groups_spawned").forGetter(class048772 -> class048772.o), (App)Codec.INT.fieldOf("cooldown_ticks").forGetter(class048772 -> class048772.V), (App)Codec.INT.fieldOf("post_raid_ticks").forGetter(class048772 -> class048772.K), (App)Codec.FLOAT.fieldOf("total_health").forGetter(class048772 -> Float.valueOf(class048772.g)), (App)Codec.INT.fieldOf("group_count").forGetter(class048772 -> class048772.H), (App)class04875.field_56440.fieldOf("status").forGetter(class048772 -> class048772.c), (App)class07209.field_25064.fieldOf("center").forGetter(class048772 -> class048772.Q), (App)class01487.y.fieldOf("heroes_of_the_village").forGetter(class048772 -> class048772.k)).apply(instance, class04877::new));
    private static final int Z = 7;
    private static final int z = 2;
    private static final int U = 32;
    private static final int E = 48000;
    private static final int W = 5;
    private static final class00392 m = class00392.L((String)"block.minecraft.ominous_banner");
    private static final String P = "event.minecraft.raid.raiders_remaining";
    public static final int L = 16;
    private static final int s = 40;
    private static final int T = 300;
    public static final int u = 2400;
    public static final int i = 600;
    private static final int b = 30;
    public static final int R = 5;
    private static final int j = 2;
    private static final class00392 v = class00392.L((String)"event.minecraft.raid");
    private static final class00392 n = class00392.L((String)"event.minecraft.raid.victory.full");
    private static final class00392 t = class00392.L((String)"event.minecraft.raid.defeat.full");
    private static final int G = 48000;
    private static final int l = 96;
    public static final int M = 9216;
    public static final int B = 12544;
    private final Map<Integer, class04882> d = Maps.newHashMap();
    private final Map<Integer, Set<class04882>> w = Maps.newHashMap();
    private final Set<UUID> k = Sets.newHashSet();
    private long Y;
    private class07209 Q;
    private boolean O;
    private float g;
    private int I;
    private boolean J;
    private int o;
    private final class04774 q = new class04774(v, class06685.field_5784, class06702.field_5791);
    private int K;
    private int V;
    private final class06069 e = class06069.u();
    private final int H;
    private class04875 c;
    private int X;
    private Optional<class07209> a = Optional.empty();
    private boolean p;

    private boolean w() {
        return this.V == 0 && (this.o < this.H || this.d()) && this.P() == 0;
    }

    private void L(class04782 class047822) {
        class01296.N((class01296)class01296.N((class07209)this.Q), (int)2).filter(arg_0 -> ((class04782)class047822).method_20588(arg_0)).map(class01296::U).min(Comparator.comparingDouble(class072092 -> class072092.method_10262((class00753)this.Q))).ifPresent(this::N);
    }

    public boolean L() {
        return this.o > 0;
    }

    public void L(int n) {
        this.d.remove(n);
    }

    public float M() {
        return this.g;
    }

    public int P() {
        return this.w.values().stream().mapToInt(Set::size).sum();
    }

    public boolean T() {
        return this.J;
    }

    public class04877(class07209 class072092, class07086 class070862) {
        this.J = true;
        this.V = 300;
        this.q.N(0.0f);
        this.Q = class072092;
        this.H = this.N(class070862);
        this.c = class04875.field_19026;
    }

    private class04877(boolean bl, boolean bl2, long l, int n, int n2, int n3, int n4, float f, int n5, class04875 class048752, class07209 class072092, Set<UUID> set) {
        this.O = bl;
        this.J = bl2;
        this.Y = l;
        this.I = n;
        this.o = n2;
        this.V = n3;
        this.K = n4;
        this.g = f;
        this.Q = class072092;
        this.H = n5;
        this.c = class048752;
        this.k.addAll(set);
    }

    public Set<class04882> B() {
        HashSet hashSet = Sets.newHashSet();
        for (Set<class04882> var3 : this.w.values()) {
            hashSet.addAll(var3);
        }
        return hashSet;
    }

    public boolean Z() {
        return this.O;
    }

    private void i(class04782 class047822) {
        Iterator<Set<class04882>> var2 = this.w.values().iterator();
        HashSet hashSet = Sets.newHashSet();
        while (var2.hasNext()) {
            Set<class04882> var4 = var2.next();
            for (class04882 class048822 : var4) {
                class07209 class072092 = class048822.method_24515();
                if (class048822.method_31481() || class048822.method_73183().method_27983() != class047822.method_27983() || this.Q.method_10262((class00753)class072092) >= 12544.0) {
                    hashSet.add(class048822);
                    continue;
                }
                if (class048822.field_6012 <= 600) continue;
                if (class047822.method_66347(class048822.method_5667()) == null) {
                    hashSet.add(class048822);
                }
                if (!class047822.method_19500(class072092) && class048822.method_6131() > 2400) {
                    class048822.y(class048822.NI() + 1);
                }
                if (class048822.NI() < 30) continue;
                hashSet.add(class048822);
            }
        }
        for (class04882 class048823 : hashSet) {
            this.N(class047822, class048823, true);
            if (!class048823.Q()) continue;
            this.L(class048823.NO());
        }
    }

    public boolean i() {
        return this.c == class04875.field_19027;
    }

    public float b() {
        int n = this.E();
        if (n == 2) {
            return 0.1f;
        }
        if (n == 3) {
            return 0.25f;
        }
        if (n == 4) {
            return 0.5f;
        }
        if (n == 5) {
            return 0.75f;
        }
        return 0.0f;
    }

    public class07209 s() {
        return this.Q;
    }

    private boolean n() {
        if (this.G()) {
            return !this.l();
        }
        return !this.t();
    }

    private boolean l() {
        return this.z() > this.H;
    }

    private boolean d() {
        return this.t() && this.P() == 0 && this.G();
    }

    public float m() {
        float f = 0.0f;
        Iterator<Set<class04882>> var2 = this.w.values().iterator();
        while (var2.hasNext()) {
            for (class04882 class048822 : var2.next()) {
                f += class048822.method_6032();
            }
        }
        return f;
    }

    private boolean t() {
        return this.z() == this.H;
    }

    private Predicate<class04770> v() {
        return class047702 -> {
            class07209 class072092 = class047702.method_24515();
            return class047702.method_5805() && class047702.method_51469().method_19502(class072092) == this;
        };
    }

    public void j() {
        this.p = true;
    }

    public int U() {
        return 5;
    }

    public int z() {
        return this.o;
    }

    public boolean u() {
        return this.c == class04875.field_19029;
    }

    private Optional<class07209> u(class04782 class047822) {
        class07209 class072092 = this.N(class047822, 8);
        if (class072092 != null) {
            return Optional.of(class072092);
        }
        return Optional.empty();
    }

    private void y(class04782 class047822, class07209 class072092) {
        boolean bl = false;
        int n = this.o + 1;
        this.g = 0.0f;
        class07052 class070522 = class047822.method_8404(class072092);
        boolean bl2 = this.d();
        for (class04847 class048472 : class04847.field_16636) {
            class04882 class048822;
            int n2 = this.N(class048472, n, bl2) + this.N(class048472, this.e, n, class070522, bl2);
            int n3 = 0;
            for (int i = 0; i < n2 && (class048822 = (class04882)class048472.field_16629.N((class07299)class047822, class06113.field_16467)) != null; ++i) {
                if (!bl && class048822.v()) {
                    class048822.M(true);
                    this.N(n, class048822);
                    bl = true;
                }
                this.N(class047822, n, class048822, class072092, false);
                if (class048472.field_16629 != class07078.yB) continue;
                class04882 class048823 = null;
                if (n == this.N(class07086.field_5802)) {
                    class048823 = (class04882)class07078.yy.N((class07299)class047822, class06113.field_16467);
                } else if (n >= this.N(class07086.field_5807)) {
                    class048823 = n3 == 0 ? (class04882)class07078.x.N((class07299)class047822, class06113.field_16467) : (class04882)class07078.yH.N((class07299)class047822, class06113.field_16467);
                }
                ++n3;
                if (class048823 == null) continue;
                this.N(class047822, n, class048823, class072092, false);
                class048823.method_5725(class072092, 0.0f, 0.0f);
                class048823.method_5873((class07049)class048822, false, false);
            }
        }
        this.a = Optional.empty();
        ++this.o;
        this.j();
        this.R(class047822);
    }

    private void y(class04782 class047822) {
        HashSet hashSet = Sets.newHashSet((Iterable)this.q.s());
        List var3 = class047822.method_18766(this.v());
        for (class04770 class047702 : var3) {
            if (hashSet.contains(class047702)) continue;
            this.q.N(class047702);
        }
        for (class04770 class047702 : hashSet) {
            if (var3.contains(class047702)) continue;
            this.q.y(class047702);
        }
    }

    public @Nullable class04882 y(int n) {
        return this.d.get(n);
    }

    public boolean y() {
        return this.L() && this.P() == 0 && this.V > 0;
    }

    public int E() {
        return this.I;
    }

    public void N(class07049 class070492) {
        this.k.add(class070492.method_5667());
    }

    private void N(CallbackInfo callbackInfo) {
        if (this.p) {
            this.q.N(class04995.N((float)(this.m() / this.g), (float)0.0f, (float)1.0f));
            this.p = false;
        }
    }

    public boolean N() {
        return this.i() || this.R();
    }

    private @Nullable class07209 N(class04782 class047822, int n) {
        int n2 = this.V / 20;
        float f = 0.22f * (float)n2 - 0.24f;
        class07218 class072182 = new class07218();
        float f2 = class047822.field_9229.z() * ((float)Math.PI * 2);
        for (int i = 0; i < n; ++i) {
            int n3;
            float f3 = f2 + (float)Math.PI * (float)i / 8.0f;
            int n4 = this.Q.method_10263() + class04995.y((float)(class04995.P((double)f3) * 32.0f * f)) + class047822.field_9229.y(3) * class04995.y((float)f);
            int n5 = class047822.method_8624(class07830.field_13202, n4, n3 = this.Q.method_10260() + class04995.y((float)(class04995.m((double)f3) * 32.0f * f)) + class047822.field_9229.y(3) * class04995.y((float)f));
            if (class04995.N((int)(n5 - this.Q.method_10264())) > 96) continue;
            class072182.N(n4, n5, n3);
            if (class047822.method_19500((class07209)class072182) && n2 > 7) continue;
            int n6 = 10;
            if (!class047822.N(class072182.method_10263() - 10, class072182.method_10260() - 10, class072182.method_10263() + 10, class072182.method_10260() + 10) || !class047822.method_37118((class07209)class072182) || !N.isSpawnPositionOk((class05487)class047822, (class07209)class072182, class07078.yB) && (!class047822.method_8320(class072182.method_10074()).N(class00869.is) || !class047822.method_8320((class07209)class072182).P())) continue;
            return class072182;
        }
        return null;
    }

    public void N(class04782 class047822, int n, class04882 class048822, @Nullable class07209 class072092, boolean bl) {
        if (this.N(class047822, n, class048822)) {
            class048822.N(this);
            class048822.N(n);
            class048822.Z(true);
            class048822.y(0);
            if (!bl && class072092 != null) {
                class048822.method_5814((double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 1.0, (double)class072092.method_10260() + 0.5);
                class048822.N((class01001)class047822, class047822.method_8404(class072092), class06113.field_16467, null);
                class048822.N(class047822, n, false);
                class048822.method_24830(true);
                class047822.y((class07049)class048822);
            }
        }
    }

    private boolean N(class04782 class047822, int n, class04882 class048822) {
        return this.N(class047822, n, class048822, true);
    }

    public boolean N(class04782 class047822, int n2, class04882 class048822, boolean bl) {
        this.w.computeIfAbsent(n2, n -> Sets.newHashSet());
        Set<class04882> var5 = this.w.get(n2);
        class04882 class048823 = null;
        for (class04882 class048824 : var5) {
            if (!class048824.method_5667().equals(class048822.method_5667())) continue;
            class048823 = class048824;
            break;
        }
        if (class048823 != null) {
            var5.remove((Object)class048823);
            var5.add(class048822);
        }
        var5.add(class048822);
        if (bl) {
            this.g += class048822.method_6032();
        }
        this.j();
        this.R(class047822);
        return true;
    }

    private void N(class04782 class047822, class07209 class072092) {
        float f = 13.0f;
        int n = 64;
        Collection var5 = this.q.s();
        long l = this.e.B();
        for (class04770 class047702 : class047822.method_18456()) {
            class06889 class068892 = class047702.method_73189();
            class06889 class068893 = class06889.y((class00753)class072092);
            double d = Math.sqrt((class068893.M - class068892.M) * (class068893.M - class068892.M) + (class068893.Z - class068892.Z) * (class068893.Z - class068892.Z));
            double d2 = class068892.M + 13.0 / d * (class068893.M - class068892.M);
            double d3 = class068892.Z + 13.0 / d * (class068893.Z - class068892.Z);
            if (!(d <= 64.0) && !var5.contains(class047702)) continue;
            class047702.field_13987.method_14364((class00381)new class08073(class04909.lc, class04911.field_15254, d2, class047702.method_23318(), d3, 64.0f, 1.0f, l));
        }
    }

    public void N(class04782 class047822, class04882 class048822, boolean bl) {
        Set<class04882> var4 = this.w.get(class048822.NO());
        if (var4 != null && var4.remove((Object)class048822)) {
            if (bl) {
                this.g -= class048822.method_6032();
            }
            class048822.N((class04877)null);
            this.j();
            this.R(class047822);
        }
    }

    public void N(class04782 class047822) {
        this.N((CallbackInfo)null);
        if (this.u()) {
            return;
        }
        if (this.c == class04875.field_19026) {
            int n;
            boolean bl;
            boolean bl2 = this.J;
            this.J = class047822.E(this.Q);
            if (class047822.y() == class07086.field_5801) {
                this.W();
                return;
            }
            if (bl2 != this.J) {
                this.q.u(this.J);
            }
            if (!this.J) {
                return;
            }
            if (!class047822.method_19500(this.Q)) {
                this.L(class047822);
            }
            if (!class047822.method_19500(this.Q)) {
                if (this.o > 0) {
                    this.c = class04875.field_19028;
                } else {
                    this.W();
                }
            }
            ++this.Y;
            if (this.Y >= 48000L) {
                this.W();
                return;
            }
            int n2 = this.P();
            if (n2 == 0 && this.n()) {
                if (this.V > 0) {
                    bl = this.a.isPresent();
                    int n3 = n = !bl && this.V % 5 == 0 ? 1 : 0;
                    if (bl && !class047822.method_37118(this.a.get())) {
                        n = 1;
                    }
                    if (n != 0) {
                        this.a = this.u(class047822);
                    }
                    if (this.V == 300 || this.V % 20 == 0) {
                        this.y(class047822);
                    }
                    --this.V;
                    this.q.N(class04995.N((float)((float)(300 - this.V) / 300.0f), (float)0.0f, (float)1.0f));
                } else if (this.V == 0 && this.o > 0) {
                    this.V = 300;
                    this.q.N(v);
                    return;
                }
            }
            if (this.Y % 20L == 0L) {
                this.y(class047822);
                this.i(class047822);
                if (n2 > 0) {
                    if (n2 <= 2) {
                        this.q.N((class00392)v.L().i(" - ").y((class00392)class00392.N((String)P, (Object[])new Object[]{n2})));
                    } else {
                        this.q.N(v);
                    }
                } else {
                    this.q.N(v);
                }
            }
            if (class07529.f) {
                this.q.N((class00392)v.L().i(" wave: ").i("" + this.o).y(class05220.l).i("Raiders alive: ").i("" + this.P()).y(class05220.l).i("" + this.m()).i(" / ").i("" + this.g).i(" Is bonus? ").i("" + (this.G() && this.l())).i(" Status: ").i(this.c.method_15434()));
            }
            bl = false;
            n = 0;
            while (this.w()) {
                class07209 class072092 = this.a.orElseGet(() -> this.N(class047822, 20));
                if (class072092 != null) {
                    this.O = true;
                    this.y(class047822, class072092);
                    if (!bl) {
                        this.N(class047822, class072092);
                        bl = true;
                    }
                } else {
                    ++n;
                }
                if (n <= 5) continue;
                this.W();
                break;
            }
            if (this.Z() && !this.n() && n2 == 0) {
                if (this.K < 40) {
                    ++this.K;
                } else {
                    this.c = class04875.field_19027;
                    for (UUID uUID : this.k) {
                        class07049 class070492 = class047822.method_66347(uUID);
                        if (!(class070492 instanceof class07438)) continue;
                        class07438 class074382 = (class07438)class070492;
                        if (class070492.method_7325()) continue;
                        class074382.method_6092(new class07055(class07047.I, 48000, this.I - 1, false, false, true));
                        if (!(class074382 instanceof class04770)) continue;
                        class04770 class047702 = (class04770)class074382;
                        class047702.method_7281(class01235.NO);
                        class06912.K.N(class047702);
                    }
                }
            }
            this.R(class047822);
        } else if (this.N()) {
            ++this.X;
            if (this.X >= 600) {
                this.W();
                return;
            }
            if (this.X % 20 == 0) {
                this.y(class047822);
                this.q.u(true);
                if (this.i()) {
                    this.q.N(0.0f);
                    this.q.N(n);
                } else {
                    this.q.N(t);
                }
            }
        }
    }

    public static class06584 N(class02055<class00412> class020552) {
        class06584 class065842 = new class06584((class07310)class06570.li);
        class02708 class027082 = new class02701().N(class020552, class04444.w, class06563.field_7955).N(class020552, class04444.R, class06563.field_7967).N(class020552, class04444.z, class06563.field_7944).N(class020552, class04444.g, class06563.field_7967).N(class020552, class04444.U, class06563.field_7963).N(class020552, class04444.Y, class06563.field_7967).N(class020552, class04444.d, class06563.field_7967).N(class020552, class04444.g, class06563.field_7963).N();
        class065842.N(class02484.Nv, (Object)class027082);
        class065842.N(class02484.v, (Object)class08562.L.N(class02484.Nv, true));
        class065842.N(class02484.U, (Object)m);
        class065842.N(class02484.m, (Object)class06495.field_8907);
        return class065842;
    }

    private void N(class07209 class072092) {
        this.Q = class072092;
    }

    private int N(class04847 class048472, int n, boolean bl) {
        return bl ? class048472.field_16628[this.H] : class048472.field_16628[n];
    }

    private int N(class04847 class048472, class06069 class060692, int n, class07052 class070522, boolean bl) {
        int n2;
        class07086 class070862 = class070522.N();
        boolean bl2 = class070862 == class07086.field_5805;
        boolean bl3 = class070862 == class07086.field_5802;
        switch (class048472.ordinal()) {
            case 3: {
                if (!bl2 && n > 2 && n != 4) {
                    n2 = 1;
                    break;
                }
                return 0;
            }
            case 0: 
            case 2: {
                if (bl2) {
                    n2 = class060692.y(2);
                    break;
                }
                if (bl3) {
                    n2 = 1;
                    break;
                }
                n2 = 2;
                break;
            }
            case 4: {
                n2 = !bl2 && bl ? 1 : 0;
                break;
            }
            default: {
                return 0;
            }
        }
        return n2 > 0 ? class060692.y(n2 + 1) : 0;
    }

    public void N(int n) {
        this.I = n;
    }

    public int N(class07086 class070862) {
        return switch (class070862) {
            default -> throw new MatchException(null, null);
            case class07086.field_5801 -> 0;
            case class07086.field_5805 -> 3;
            case class07086.field_5802 -> 5;
            case class07086.field_5807 -> 7;
        };
    }

    public void N(int n, class04882 class048822) {
        this.d.put(n, class048822);
        class048822.method_5673(class07085.field_6169, class04877.N((class02055<class00412>)class048822.method_56673().L(class04227.NF)));
        class048822.N(class07085.field_6169, 2.0f);
    }

    public boolean N(class04770 class047702) {
        class07055 class070552 = class047702.method_6112(class07047.q);
        if (class070552 == null) {
            return false;
        }
        this.I += class070552.i() + 1;
        this.I = class04995.N((int)this.I, (int)0, (int)this.U());
        if (!this.L()) {
            class047702.method_7281(class01235.NQ);
            class06912.V.N(class047702);
        }
        return true;
    }

    public void W() {
        this.J = false;
        this.q.z();
        this.c = class04875.field_19029;
    }

    private void R(class04782 class047822) {
        class047822.method_19495().method_80();
    }

    public boolean R() {
        return this.c == class04875.field_19028;
    }

    private boolean G() {
        return this.I > 1;
    }
}

