/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09883
 *  Nursultan.class09886
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  it.unimi.dsi.fastutil.longs.Long2FloatOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00500
 *  minecraft.class00554
 *  minecraft.class00674
 *  minecraft.class00734
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class01217
 *  minecraft.class01260
 *  minecraft.class01284
 *  minecraft.class03556
 *  minecraft.class04057
 *  minecraft.class04643
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05474
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class05989
 *  minecraft.class06069
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07302
 *  minecraft.class07305
 *  minecraft.class07307
 *  minecraft.class07438
 *  minecraft.class07536
 *  minecraft.class08005
 *  minecraft.class08036
 *  minecraft.class08050
 *  minecraft.class08700
 *  net.caffeinemc.mods.lithium.common.util.Pos$ChunkCoord
 *  net.caffeinemc.mods.lithium.common.util.Pos$SectionYIndex
 *  net.caffeinemc.mods.lithium.common.world.explosions.ClipContextAccess
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09883;
import Nursultan.class09886;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import it.unimi.dsi.fastutil.longs.Long2FloatOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class00674;
import minecraft.class00734;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01217;
import minecraft.class01260;
import minecraft.class01284;
import minecraft.class03556;
import minecraft.class04057;
import minecraft.class04643;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05474;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class05989;
import minecraft.class06069;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07302;
import minecraft.class07305;
import minecraft.class07307;
import minecraft.class07438;
import minecraft.class07536;
import minecraft.class08005;
import minecraft.class08036;
import minecraft.class08050;
import minecraft.class08700;
import net.caffeinemc.mods.lithium.common.util.Pos;
import net.caffeinemc.mods.lithium.common.world.explosions.ClipContextAccess;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02756
implements class07307 {
    private static final class01284 N = new class01284();
    private static final int y = 16;
    private static final float L = 2.0f;
    private final boolean u;
    private final class07302 i;
    private final class04782 R;
    private final class06889 M;
    private final @Nullable class07049 B;
    private final float Z;
    private final class07072 z;
    private final class01284 U;
    private final Map<class08036, class06889> E;
    private static final HashSet W = new HashSet(0);
    private final class07218 m = new class07218();
    private int P = Integer.MIN_VALUE;
    private int s = Integer.MIN_VALUE;
    private class08050 T;
    private boolean b;
    private LongOpenHashSet j;
    private Long2ReferenceOpenHashMap v;
    private Long2FloatOpenHashMap n;
    private int t;
    private int G;
    private static final class06183 l = class06183.N(null, null, null);

    public @Nullable class07438 L() {
        return class07307.N((class07049)this.B);
    }

    private static BiFunction L(class07049 class070492) {
        return new class09883(class070492);
    }

    private int L(List list) {
        return this.j.size();
    }

    public boolean M() {
        if (this.i != class07302.field_47331) {
            return false;
        }
        if (this.B != null && this.B.method_5864() == class07078.n) {
            return (Boolean)this.R.method_64395().N(class07305.I);
        }
        return true;
    }

    private void P() {
        if (this.Z < 1.0E-5f) {
            return;
        }
        float f = this.Z * 2.0f;
        int n = class04995.N((double)(this.M.M - (double)f - 1.0));
        int n2 = class04995.N((double)(this.M.M + (double)f + 1.0));
        int n3 = class04995.N((double)(this.M.B - (double)f - 1.0));
        int n4 = class04995.N((double)(this.M.B + (double)f + 1.0));
        int n5 = class04995.N((double)(this.M.Z - (double)f - 1.0));
        int n6 = class04995.N((double)(this.M.Z + (double)f + 1.0));
        for (class07049 class070492 : this.R.N_70(this.B, new class00734((double)n, (double)n3, (double)n5, (double)n2, (double)n4, (double)n6))) {
            class08036 class080362;
            double d;
            float f2;
            double d2;
            if (class070492.method_5659((class07307)this) || (d2 = Math.sqrt(class070492.method_5707(this.M)) / (double)f) > 1.0) continue;
            class06889 class068892 = (class070492 instanceof class00674 ? class070492.method_73189() : class070492.method_33571()).u(this.M).u();
            boolean bl = this.U.N((class07307)this, class070492);
            float f3 = this.U.N(class070492);
            float f4 = f2 = bl || f3 != 0.0f ? class02756.N(this.M, class070492) : 0.0f;
            if (bl) {
                class070492.method_64397(this.R, this.z, this.U.N((class07307)this, class070492, f2));
            }
            if (class070492 instanceof class07438) {
                class07438 class074382 = (class07438)class070492;
                d = class074382.method_45325(class05298.U);
            } else {
                d = 0.0;
            }
            double d3 = d;
            double d4 = (1.0 - d2) * (double)f2 * (double)f3 * (1.0 - d3);
            class06889 class068893 = class068892.L(d4);
            class070492.method_60491(class068893);
            if (class070492.method_5864().N(class01217.q) && class070492 instanceof class08005) {
                ((class08005)class070492).L(this.z.u());
            } else if (!(!(class070492 instanceof class08036) || (class080362 = (class08036)class070492).method_7325() || class080362.method_68878() && class080362.method_31549().y)) {
                this.E.put(class080362, class068893);
            }
            class070492.method_56918(this.B);
        }
    }

    public class02756(class04782 class047822, @Nullable class07049 class070492, @Nullable class07072 class070722, @Nullable class01284 class012842, class06889 class068892, float f, boolean bl, class07302 class073022) {
        this.E = new HashMap<class08036, class06889>();
        this.R = class047822;
        this.B = class070492;
        this.Z = f;
        this.M = class068892;
        this.u = bl;
        this.i = class073022;
        this.z = class070722 == null ? class047822.method_48963().N((class07307)this) : class070722;
        this.U = class012842 == null ? this.y(class070492) : class012842;
        this.N(class047822, class070492, class070722, class012842, class068892, f, bl, class073022, null);
    }

    public boolean B() {
        boolean bl;
        boolean bl2 = (Boolean)this.R.method_64395().N(class07305.I);
        boolean bl3 = bl = this.B == null || this.B.method_5864() != class07078.n && this.B.method_5864() != class07078.ya;
        if (bl2) {
            return bl;
        }
        return this.i.N() && bl;
    }

    public int Z() {
        this.R.N(this.B, (class03556)class01194.G, this.M);
        List<class07209> var1 = this.m();
        this.P();
        if (this.s()) {
            class04643 class046432 = class08700.N();
            class046432.N("explosion_blocks");
            this.N(var1);
            class046432.L();
        }
        if (this.u) {
            this.y(var1);
        }
        List<class07209> var3 = var1;
        return this.L(var3);
    }

    public float i() {
        return this.Z;
    }

    private boolean s() {
        return this.i != class07302.field_40878;
    }

    private List<class07209> m() {
        HashSet hashSet = this.W();
        if (hashSet == null) {
            throw new NullPointerException("@Redirect constructor handler net/minecraft/class_9892::skipNewHashSet returned null for java.util.HashSet");
        }
        HashSet hashSet2 = hashSet;
        int n = 16;
        for (int i = 0; i < this.N(16); ++i) {
            for (int j = 0; j < 16; ++j) {
                block2: for (int k = 0; k < 16; ++k) {
                    if (i != 0 && i != 15 && j != 0 && j != 15 && k != 0 && k != 15) continue;
                    double d = (float)i / 15.0f * 2.0f - 1.0f;
                    double d2 = (float)j / 15.0f * 2.0f - 1.0f;
                    double d3 = (float)k / 15.0f * 2.0f - 1.0f;
                    double d4 = Math.sqrt(d * d + d2 * d2 + d3 * d3);
                    d /= d4;
                    d2 /= d4;
                    d3 /= d4;
                    double d5 = this.M.M;
                    double d6 = this.M.B;
                    double d7 = this.M.Z;
                    float f = 0.3f;
                    for (float f2 = this.Z * (0.7f + this.R.field_9229.z() * 0.6f); f2 > 0.0f; f2 -= 0.22500001f) {
                        class07209 class072092 = class07209.method_49637((double)d5, (double)d6, (double)d7);
                        class00500 class005002 = this.R.method_8320(class072092);
                        class04688 class046882 = this.R.method_8316(class072092);
                        if (!this.R.method_24794(class072092)) continue block2;
                        Optional var25 = this.U.N((class07307)this, (class07290)this.R, class072092, class005002, class046882);
                        if (var25.isPresent()) {
                            f2 -= (((Float)var25.get()).floatValue() + 0.3f) * 0.3f;
                        }
                        if (f2 > 0.0f && this.U.N((class07307)this, (class07290)this.R, class072092, class005002, f2)) {
                            hashSet2.add(class072092);
                        }
                        d5 += d * (double)0.3f;
                        d6 += d2 * (double)0.3f;
                        d7 += d3 * (double)0.3f;
                    }
                }
            }
        }
        ObjectArrayList objectArrayList = new ObjectArrayList((Collection)hashSet2);
        this.N(new CallbackInfoReturnable("", false, (Object)objectArrayList));
        return objectArrayList;
    }

    public class07072 U() {
        return this.z;
    }

    public Map<class08036, class06889> z() {
        return this.E;
    }

    public @Nullable class07049 u() {
        return this.B;
    }

    private class01284 y(@Nullable class07049 class070492) {
        return class070492 == null ? N : new class01260(class070492);
    }

    public class07302 y() {
        return this.i;
    }

    private void y(List<class07209> list) {
        for (class07209 class072092 : list) {
            if (this.R.field_9229.y(3) != 0 || !this.R.method_8320(class072092).P() || !this.R.method_8320(class072092.method_10074()).t()) continue;
            this.R.method_8501(class072092, class05989.y((class07290)this.R, (class07209)class072092));
        }
    }

    public boolean E() {
        return this.Z < 2.0f || !this.s();
    }

    private float N(float f, int n, int n2, int n3, LongOpenHashSet longOpenHashSet) {
        Optional var15;
        class00554 class005542;
        long l = class07209.method_10064((int)n, (int)n2, (int)n3);
        float f2 = this.n.get(l);
        if (f2 >= 0.0f) {
            this.N(f, f2, l, (class00500)this.v.get(l), n, n2, n3, longOpenHashSet);
            return f2;
        }
        class07218 class072182 = this.m.N(n, n2, n3);
        int n4 = Pos.ChunkCoord.fromBlockCoord((int)n);
        int n5 = Pos.ChunkCoord.fromBlockCoord((int)n3);
        if (this.P != n4 || this.s != n5) {
            this.T = this.R.method_8497(n4, n5);
            this.P = n4;
            this.s = n5;
        }
        class08050 class080502 = this.T;
        class00500 class005002 = class00869.N.W();
        float f3 = 0.0f;
        if (class080502 != null && (class005542 = class080502.u()[Pos.SectionYIndex.fromBlockCoord((class05474)class080502, (int)n2)]) != null && !class005542.L() && (class005002 = class005542.N(n & 0xF, n2 & 0xF, n3 & 0xF)).i() != class00869.N) {
            class04688 class046882 = class005002.Y();
            var15 = this.U.N((class07307)this, (class07290)this.R, (class07209)class072182, class005002, class046882);
        } else {
            var15 = this.U.N((class07307)this, (class07290)this.R, (class07209)class072182, class00869.N.W(), class04684.N.M());
        }
        if (var15.isPresent()) {
            f3 = (((Float)var15.get()).floatValue() + 0.3f) * 0.3f;
        }
        this.v.put(l, (Object)class005002);
        this.n.put(l, f3);
        this.N(f, f3, l, class005002, n, n2, n3, longOpenHashSet);
        return f3;
    }

    private void N(float f, float f2, long l, class00500 class005002, int n, int n2, int n3, LongOpenHashSet longOpenHashSet) {
        float f3 = f - f2;
        if (f3 > 0.0f) {
            class07218 class072182;
            this.j.add(l);
            if ((this.b || !class005002.P()) && this.U.N((class07307)this, (class07290)this.R, (class07209)(class072182 = this.m.N(n, n2, n3)), class005002, f3)) {
                longOpenHashSet.add(l);
            }
        }
    }

    private void N(class06069 class060692, double d, double d2, double d3, LongOpenHashSet longOpenHashSet) {
        double d4 = Math.sqrt(d * d + d2 * d2 + d3 * d3);
        double d5 = d / d4 * 0.3;
        double d6 = d2 / d4 * 0.3;
        double d7 = d3 / d4 * 0.3;
        float f = this.Z * (0.7f + class060692.z() * 0.6f);
        double d8 = this.M.N();
        double d9 = this.M.y();
        double d10 = this.M.L();
        int n = Integer.MIN_VALUE;
        int n2 = Integer.MIN_VALUE;
        int n3 = Integer.MIN_VALUE;
        float f2 = 0.0f;
        int n4 = this.t;
        int n5 = this.G;
        while (f > 0.0f) {
            float f3;
            int n6 = class04995.N((double)d8);
            int n7 = class04995.N((double)d9);
            int n8 = class04995.N((double)d10);
            if (n != n6 || n2 != n7 || n3 != n8) {
                if (n7 < n4 || n7 > n5 || n6 < -30000000 || n8 < -30000000 || n6 >= 30000000 || n8 >= 30000000) {
                    return;
                }
                f3 = this.N(f, n6, n7, n8, longOpenHashSet);
                n = n6;
                n2 = n7;
                n3 = n8;
                f2 = f3;
            } else {
                f3 = f2;
            }
            f -= f3;
            f -= 0.22500001f;
            d8 += d5;
            d9 += d6;
            d10 += d7;
        }
    }

    private void N(List<class07209> list) {
        ArrayList arrayList = new ArrayList();
        class07536.L(list, (class06069)this.R.field_9229);
        for (class07209 class072093 : list) {
            this.R.method_8320(class072093).N(this.R, class072093, (class07307)this, (T class065842, U class072092) -> class02756.N(arrayList, class065842, class072092));
        }
        for (class07209 class072093 : arrayList) {
            class00891.N_21((class07299)this.R, (class07209)class072093.N, (class06584)class072093.y);
        }
    }

    private static class06183 N(class07299 class072992, class05862 class058623, LocalRef localRef) {
        return (class06183)class07290.N((class06889)class058623.y(), (class06889)class058623.N(), (Object)class058623, (BiFunction)((BiFunction)localRef.get()), class058622 -> l);
    }

    private static class05862 N(class06889 class068892, class06889 class068893, class05849 class058492, class05835 class058352, class07049 class070492, LocalRef localRef) {
        class05862 class058622 = (class05862)localRef.get();
        if (class058622 == null) {
            class058622 = new class05862(class068892, class068893, class058492, class058352, class070492);
            localRef.set((Object)class058622);
        } else {
            ((ClipContextAccess)class058622).lithium$setFrom(class068892);
        }
        return class058622;
    }

    private static void N(class06889 class068892, class07049 class070492, CallbackInfoReturnable callbackInfoReturnable, LocalRef localRef) {
        localRef.set((Object)class02756.L(class070492));
    }

    private void N(class04782 class047822, class07049 class070492, class07072 class070722, class01284 class012842, class06889 class068892, float f, boolean bl, class07302 class073022, CallbackInfo callbackInfo) {
        this.t = this.R.method_31607();
        this.G = this.R.method_31600();
        boolean bl2 = this.u;
        if (!bl2 && this.R.method_27983() == class07299.field_25181 && this.R.method_40134().N(class04057.L)) {
            float f2 = 8 + (int)(6.0f * this.Z);
            boolean bl3 = false;
            boolean bl4 = false;
            if ((double)f2 > Math.abs(this.M.M - (double)bl3) && (double)f2 > Math.abs(this.M.Z - (double)bl4)) {
                bl2 = true;
            }
        }
        this.b = bl2;
        this.j = new LongOpenHashSet();
        this.v = new Long2ReferenceOpenHashMap();
        this.n = new Long2FloatOpenHashMap();
        this.n.defaultReturnValue(-1.0f);
    }

    private static void N(List<class09886> list, class06584 class065842, class07209 class072092) {
        Iterator<class09886> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().N(class065842);
            if (!class065842.R()) continue;
            return;
        }
        list.add(new class09886(class072092, class065842));
    }

    public class04782 N() {
        return this.R;
    }

    public void N(CallbackInfoReturnable callbackInfoReturnable) {
        LongOpenHashSet longOpenHashSet = new LongOpenHashSet(0);
        class06069 class060692 = this.R.field_9229;
        for (int i = 0; i < 16; ++i) {
            boolean bl = i == 0 || i == 15;
            double d = (float)i / 15.0f * 2.0f - 1.0f;
            for (int j = 0; j < 16; ++j) {
                boolean bl2 = j == 0 || j == 15;
                double d2 = (float)j / 15.0f * 2.0f - 1.0f;
                int n = bl || bl2 ? 1 : 15;
                for (int k = 0; k < 16; k += n) {
                    double d3 = (float)k / 15.0f * 2.0f - 1.0f;
                    this.N(class060692, d, d2, d3, longOpenHashSet);
                }
            }
        }
        List list = (List)callbackInfoReturnable.getReturnValue();
        LongIterator longIterator = longOpenHashSet.iterator();
        while (longIterator.hasNext()) {
            list.add(class07209.method_10092((long)longIterator.nextLong()));
        }
        this.v = null;
        this.n = null;
    }

    public static float N(class06889 class068892, class07049 class070492) {
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init(null);
        LocalRefImpl localRefImpl2 = new LocalRefImpl();
        localRefImpl2.init(null);
        class02756.N(class068892, class070492, null, (LocalRef)localRefImpl2);
        class00734 class007342 = class070492.method_5829();
        double d = 1.0 / ((class007342.u - class007342.N) * 2.0 + 1.0);
        double d2 = 1.0 / ((class007342.i - class007342.y) * 2.0 + 1.0);
        double d3 = 1.0 / ((class007342.R - class007342.L) * 2.0 + 1.0);
        double d4 = (1.0 - Math.floor(1.0 / d) * d) / 2.0;
        double d5 = (1.0 - Math.floor(1.0 / d3) * d3) / 2.0;
        if (d < 0.0 || d2 < 0.0 || d3 < 0.0) {
            return 0.0f;
        }
        int n = 0;
        int n2 = 0;
        for (double d6 = 0.0; d6 <= 1.0; d6 += d) {
            for (double d7 = 0.0; d7 <= 1.0; d7 += d2) {
                for (double d8 = 0.0; d8 <= 1.0; d8 += d3) {
                    double d9 = class04995.u((double)d6, (double)class007342.N, (double)class007342.u);
                    double d10 = class04995.u((double)d7, (double)class007342.y, (double)class007342.i);
                    double d11 = class04995.u((double)d8, (double)class007342.L, (double)class007342.R);
                    class06889 class068893 = new class06889(d9 + d4, d10, d11 + d5);
                    class05862 class058622 = class02756.N(class068893, class068892, class05849.field_17558, class05835.field_1348, class070492, (LocalRef)localRefImpl);
                    if (class058622 == null) {
                        throw new NullPointerException("@Redirect constructor handler net/minecraft/class_9892::reuseClipContext returned null for net.minecraft.class_3959");
                    }
                    if (class02756.N(class070492.method_73183(), class058622, (LocalRef)localRefImpl2).N() == class07113.field_1333) {
                        ++n;
                    }
                    ++n2;
                }
            }
        }
        return (float)n / (float)n2;
    }

    public int N(int n) {
        return 0;
    }

    public HashSet W() {
        return W;
    }

    public class06889 R() {
        return this.M;
    }
}

