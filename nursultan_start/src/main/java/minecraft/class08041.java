/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  minecraft.class00392
 *  minecraft.class00608
 *  minecraft.class00672
 *  minecraft.class00717
 *  minecraft.class00734
 *  minecraft.class01001
 *  minecraft.class01226
 *  minecraft.class01235
 *  minecraft.class01289
 *  minecraft.class01329
 *  minecraft.class02063
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class02796
 *  minecraft.class03289
 *  minecraft.class03529
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class03794
 *  minecraft.class03927
 *  minecraft.class04000
 *  minecraft.class04011
 *  minecraft.class04051
 *  minecraft.class04206
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04391
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class04877
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05340
 *  minecraft.class05346
 *  minecraft.class05354
 *  minecraft.class05355
 *  minecraft.class05359
 *  minecraft.class05367
 *  minecraft.class05368
 *  minecraft.class05369
 *  minecraft.class05378
 *  minecraft.class05645
 *  minecraft.class05649
 *  minecraft.class05660
 *  minecraft.class05663
 *  minecraft.class05666
 *  minecraft.class05672
 *  minecraft.class05708
 *  minecraft.class05772
 *  minecraft.class05774
 *  minecraft.class05781
 *  minecraft.class05946
 *  minecraft.class06113
 *  minecraft.class06171
 *  minecraft.class06289
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07052
 *  minecraft.class07055
 *  minecraft.class07057
 *  minecraft.class07072
 *  minecraft.class07075
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07086
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07316
 *  minecraft.class07324
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07482
 *  minecraft.class07529
 *  minecraft.class08234
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08700
 *  net.fabricmc.fabric.impl.content.registry.VillagerInteractionRegistriesImpl
 *  net.fabricmc.fabric.mixin.content.registry.VillagerAccessor
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import minecraft.class00392;
import minecraft.class00608;
import minecraft.class00672;
import minecraft.class00717;
import minecraft.class00734;
import minecraft.class01001;
import minecraft.class01226;
import minecraft.class01235;
import minecraft.class01289;
import minecraft.class01329;
import minecraft.class02063;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class02796;
import minecraft.class03289;
import minecraft.class03529;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class03794;
import minecraft.class03927;
import minecraft.class04000;
import minecraft.class04011;
import minecraft.class04051;
import minecraft.class04206;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04391;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class04877;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05340;
import minecraft.class05346;
import minecraft.class05354;
import minecraft.class05355;
import minecraft.class05359;
import minecraft.class05367;
import minecraft.class05368;
import minecraft.class05369;
import minecraft.class05378;
import minecraft.class05645;
import minecraft.class05649;
import minecraft.class05660;
import minecraft.class05663;
import minecraft.class05666;
import minecraft.class05672;
import minecraft.class05708;
import minecraft.class05772;
import minecraft.class05774;
import minecraft.class05781;
import minecraft.class05946;
import minecraft.class06113;
import minecraft.class06171;
import minecraft.class06289;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07052;
import minecraft.class07055;
import minecraft.class07057;
import minecraft.class07072;
import minecraft.class07075;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07086;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07316;
import minecraft.class07324;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07482;
import minecraft.class07529;
import minecraft.class08036;
import minecraft.class08047;
import minecraft.class08234;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08700;
import net.fabricmc.fabric.impl.content.registry.VillagerInteractionRegistriesImpl;
import net.fabricmc.fabric.mixin.content.registry.VillagerAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class08041
extends class06171
implements class01329,
class05645,
VillagerAccessor {
    private static final Logger B = LogUtils.getLogger();
    private static final class02131<class05666> Z = class03289.N(class08041.class, (class04383)class02154.v);
    public static final int N = 12;
    public static Map<class06581, Integer> y = ImmutableMap.of((Object)class06570.bu, (Object)4, (Object)class06570.Gj, (Object)1, (Object)class06570.Gb, (Object)1, (Object)class06570.lw, (Object)1);
    private static final int X = 2;
    private static final int a = 10;
    private static final int p = 1200;
    private static final int F = 24000;
    private static final int A = 10;
    private static final int f = 5;
    private static final long C = 24000L;
    public static final float L = 0.5f;
    private static final int S = 0;
    private static final byte x = 0;
    private static final int D = 0;
    private static final int h = 0;
    private static final int r = 0;
    private static final boolean NN = false;
    private int Ny;
    private boolean NL;
    private @Nullable class08036 NE;
    private boolean NW;
    private int Nm = 0;
    private final class05774 NP = new class05774();
    private long Ns;
    private long NT = 0L;
    private int Nb = 0;
    private long Nj = 0L;
    private int Nv = 0;
    private long Nn;
    private boolean Nt = false;
    private static final ImmutableList<class05378<?>> NG = ImmutableList.of((Object)class05378.y, (Object)class05378.L, (Object)class05378.u, (Object)class05378.i, (Object)class05378.M, (Object)class05378.B, (Object)class05378.Z, (Object)class05378.z, (Object)class05378.U, (Object)class05378.E, (Object)class05378.H, (Object)class05378.yN, (Object[])new class05378[]{class05378.m, class05378.P, class05378.b, class05378.j, class05378.n, class05378.G, class05378.l, class05378.d, class05378.w, class05378.Y, class05378.R, class05378.O, class05378.g, class05378.I, class05378.q, class05378.K, class05378.V, class05378.J});
    private static final ImmutableList<class05340<? extends class05355<? super class08041>>> Nl = ImmutableList.of((Object)class05340.L, (Object)class05340.u, (Object)class05340.y, (Object)class05340.i, (Object)class05340.R, (Object)class05340.M, (Object)class05340.B, (Object)class05340.Z, (Object)class05340.z);
    public static final Map<class05378<class06289>, BiPredicate<class08041, class03556<class05369>>> u = ImmutableMap.of((Object)class05378.y, (class080412, class035562) -> class035562.N(class03927.m), (Object)class05378.L, (class080412, class035562) -> ((class05672)class080412.t().y().N()).y().test(class035562), (Object)class05378.u, (class080412, class035562) -> class05672.N.test(class035562), (Object)class05378.i, (class080412, class035562) -> class035562.N(class03927.P));

    public boolean w() {
        return this.NX() >= 24;
    }

    public void L(class04782 class047822) {
        class01289<class08041> var2 = this.method_18868();
        var2.y(class047822, (class07438)this);
        ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1 = var2.B();
        this.N(this.method_18868());
    }

    private void L(class07049 class070492) {
        class07299 class072992 = this.method_73183();
        if (!(class072992 instanceof class04782)) {
            return;
        }
        class04782 class047822 = (class04782)class072992;
        Optional var3 = ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.L(class05378.B);
        if (var3.isEmpty()) {
            return;
        }
        ((class04051)var3.get()).y(class01329.class::isInstance).forEach(class074382 -> class047822.method_19496(class05354.u, class070492, (class01329)class074382));
    }

    private boolean No() {
        return this.Nv == 0 || this.Nv < 2 && this.method_73183().N() > this.Nj + 2400L;
    }

    protected void M() {
        super.M();
        if (this.method_73183() instanceof class04782) {
            this.L((class04782)this.method_73183());
        }
    }

    public boolean Q() {
        return this.n().N_60(class065842 -> class065842.N(class01226.LB));
    }

    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.NQ);
        super.method_66649(class026662);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(Z, (Object)class08041.G());
    }

    public void method_5773() {
        super.method_5773();
        if (this.I() > 0) {
            this.M(this.I() - 1);
        }
        this.Na();
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("VillagerData", class05666.L, (Object)this.t());
        class083292.N("FoodLevel", (byte)this.Nm);
        class083292.N("Gossips", class05774.N, (Object)this.NP);
        class083292.N("Xp", this.Nb);
        class083292.N("LastRestock", this.Nj);
        class083292.N("LastGossipDecay", this.NT);
        class083292.N("RestocksToday", this.Nv);
        if (this.Nt) {
            class083292.N("AssignProfessionWhenSpawned", true);
        }
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.NQ) {
            return (T)class08041.method_66651(class024772, (Object)this.t().N());
        }
        return (T)super.method_58694(class024772);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.field_6011.N(Z, (Object)class082992.N("VillagerData", class05666.L).orElseGet(class08041::G));
        this.Nm = class082992.N("FoodLevel", (byte)0);
        this.NP.L();
        class082992.N("Gossips", class05774.N).ifPresent(arg_0 -> ((class05774)this.NP).N(arg_0));
        this.Nb = class082992.N("Xp", 0);
        this.Nj = class082992.N("LastRestock", 0L);
        this.NT = class082992.N("LastGossipDecay", 0L);
        if (this.method_73183() instanceof class04782) {
            this.L((class04782)this.method_73183());
        }
        this.Nv = class082992.N("RestocksToday", 0);
        this.Nt = class082992.N("AssignProfessionWhenSpawned", false);
    }

    public void method_5800(class04782 class047822, class00672 class006722) {
        if (class047822.y() != class07086.field_5801) {
            B.info("Villager {} was struck by lightning {}.", (Object)this, (Object)class006722);
            if ((class08047)this.N(class07078.yp, class08234.N((class07079)this, (boolean)false, (boolean)false), class080472 -> {
                class080472.N((class01001)class047822, class047822.method_8404(class080472.method_24515()), class06113.field_16468, null);
                class080472.NW();
                this.NV();
            }) == null) {
                super.method_5800(class047822, class006722);
            }
        } else {
            super.method_5800(class047822, class006722);
        }
    }

    public void method_5711(byte by) {
        if (by == 12) {
            this.N((class07126)class07107.f);
        } else if (by == 13) {
            this.N((class07126)class07107.N);
        } else if (by == 14) {
            this.N((class07126)class07107.F);
        } else if (by == 42) {
            this.N((class07126)class07107.NT);
        } else {
            super.method_5711(by);
        }
    }

    protected class00392 method_23315() {
        return ((class05672)this.t().y().N()).N();
    }

    public class08041(class07078<? extends class08041> class070782, class07299 class072992) {
        this(class070782, class072992, (class05946<class05660>)class05660.L);
    }

    public class08041(class07078<? extends class08041> class070782, class07299 class072992, class03556<class05660> class035562) {
        super(class070782, class072992);
        this.f().y(true);
        this.f().N(true);
        this.f().N(48.0f);
        this.L(true);
        this.N(this.t().N(class035562).y((class02063)class072992.method_30349(), class05672.y));
    }

    public class08041(class07078<? extends class08041> class070782, class07299 class072992, class05946<class05660> class059462) {
        this(class070782, class072992, (class03556<class05660>)class072992.method_30349().i(class059462));
    }

    private void B(int n) {
        this.Nm -= n;
    }

    public static class05300 B() {
        return class07079.H().N(class05298.l, 0.5);
    }

    protected void i(class04782 class047822) {
        Int2ObjectMap int2ObjectMap;
        class05666 class056662 = this.t();
        class05946 var3 = class056662.y().i().orElse(null);
        if (var3 == null) {
            return;
        }
        if (this.method_73183().method_45162().y(class03794.y)) {
            Int2ObjectMap var5 = (Int2ObjectMap)class05649.L.get(var3);
            Int2ObjectMap var4 = var5 != null ? var5 : (Int2ObjectMap)class05649.N.get(var3);
        } else {
            int2ObjectMap = (Int2ObjectMap)class05649.N.get(var3);
        }
        if (int2ObjectMap == null || int2ObjectMap.isEmpty()) {
            return;
        }
        class05663[] class05663Array = (class05663[])int2ObjectMap.get(class056662.L());
        if (class05663Array == null) {
            return;
        }
        class07316 class073162 = this.y();
        this.N(class047822, class073162, class05663Array, 2);
        if (class07529.NR && class056662.L() < int2ObjectMap.size()) {
            this.R(class047822);
        }
    }

    private void i(class08036 class080362) {
        this.R(class080362);
        this.N(class080362);
        this.N(class080362, this.method_5476(), this.t().L());
    }

    protected @Nullable class04891 s() {
        if (this.method_6113()) {
            return null;
        }
        if (this.o()) {
            return class04909.gs;
        }
        return class04909.gU;
    }

    public void l() {
        this.method_56078(((class05672)this.t().y().N()).R());
    }

    public void d() {
        this.NH();
        this.B(12);
    }

    public boolean m() {
        return true;
    }

    public class05666 t() {
        return (class05666)this.field_6011.N(Z);
    }

    public void v() {
        this.NK();
        Iterator var1 = this.y().iterator();
        while (var1.hasNext()) {
            ((class07324)var1.next()).z();
        }
        this.NI();
        this.Nj = this.method_73183().N();
        ++this.Nv;
    }

    public boolean q() {
        return this.Nm + this.NX() >= 12 && !this.method_6113() && this.K() == 0;
    }

    public int u() {
        return this.Nb;
    }

    public boolean u(class04782 class047822) {
        long l = this.Nj + 12000L;
        long l2 = this.method_73183().N();
        boolean bl = l2 > l;
        long l3 = class047822.method_75003();
        boolean bl2 = this.Nn > 0L && l3 > this.Nn;
        this.Nn = l3;
        if (bl |= bl2) {
            this.Nj = l2;
            this.Np();
        }
        return this.No() && this.NJ();
    }

    public int u(class08036 class080362) {
        return this.NP.N(class080362.method_5667(), (T class053462) -> true);
    }

    public void y(int n) {
        this.Nb = n;
    }

    private boolean y(long l) {
        return ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.L(class05378.q).filter(l2 -> l - l2 < 24000L).isPresent();
    }

    public void y(class07316 class073162) {
        this.R = class073162;
    }

    public boolean y(class04782 class047822, class06584 class065842) {
        class06581 class065812 = class065842.B();
        class06584 class065843 = class065842;
        class03530 var5 = class01226.LZ;
        return (this.N(class065843, var5, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_1799, net.minecraft.class_6862]");
            return ((class06584)objectArray[0]).N((class03530)objectArray[1]);
        }) || ((class05672)this.t().y().N()).u().contains((Object)class065812)) && this.n().L(class065842);
    }

    protected void y(class07324 class073242) {
        int n = 3 + this.field_5974.y(4);
        this.Nb += class073242.T();
        this.NE = this.N();
        if (this.Nc()) {
            this.Ny = 40;
            this.NL = true;
            n += 5;
        }
        if (class073242.n()) {
            this.method_73183().method_8649((class07049)new class07057(this.method_73183(), this.method_23317(), this.method_23318() + 0.5, this.method_23321(), n));
        }
    }

    public boolean E() {
        return this.Nt;
    }

    public void N(class05354 class053542, class07049 class070492) {
        if (class053542 == class05354.N) {
            this.NP.N(class070492.method_5667(), class05346.field_18427, 20);
            this.NP.N(class070492.method_5667(), class05346.field_18426, 25);
        } else if (class053542 == class05354.i) {
            this.NP.N(class070492.method_5667(), class05346.field_18428, 2);
        } else if (class053542 == class05354.L) {
            this.NP.N(class070492.method_5667(), class05346.field_18425, 25);
        } else if (class053542 == class05354.u) {
            this.NP.N(class070492.method_5667(), class05346.field_18424, 25);
        }
    }

    public void N(class04782 class047822, class08041 class080412, long l) {
        if (l >= this.Ns && l < this.Ns + 1200L || l >= class080412.Ns && l < class080412.Ns + 1200L) {
            return;
        }
        this.NP.N(class080412.NP, this.field_5974, 10);
        this.Ns = l;
        class080412.Ns = l;
        this.N(class047822, l, 5);
    }

    public void N(class04782 class047822, long l, int n) {
        if (!this.N(l)) {
            return;
        }
        class00734 class007342 = this.method_5829().L(10.0, 10.0, 10.0);
        List var6 = class047822.N(class08041.class, class007342);
        if (var6.stream().filter(class080412 -> class080412.N(l)).limit(5L).toList().size() < n) {
            return;
        }
        if (class04011.N((class07078)class07078.Nn, (class06113)class06113.field_16471, (class04782)class047822, (class07209)this.method_24515(), (int)10, (int)8, (int)6, (class04000)class04000.N, (boolean)false).isEmpty()) {
            return;
        }
        var6.forEach(class05708::y);
    }

    public boolean N(long l) {
        if (!this.y(this.method_73183().N())) {
            return false;
        }
        return !((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(class05378.J);
    }

    private boolean N(class06584 class065842, class03530 class035302, Operation operation) {
        return VillagerInteractionRegistriesImpl.getCollectableRegistry().contains(class065842.B()) || (Boolean)operation.call(new Object[]{class065842, class035302}) != false;
    }

    public static /* synthetic */ void N(Map map) {
        y = map;
    }

    public void N(class05774 class057742) {
        this.NP.N(class057742);
    }

    private void N(class01289<class08041> class012892) {
        class03556 var2 = this.t().y();
        if (this.method_6109()) {
            class012892.N(class00608.A);
            class012892.N(class05359.u, class05772.N((float)0.5f));
        } else {
            class012892.N(class00608.F);
            class012892.N(class05359.L, class05772.y((class03556)var2, (float)0.5f), (Set)ImmutableSet.of((Object)Pair.of((Object)class05378.L, (Object)class05367.field_18456)));
        }
        class012892.N(class05359.N, class05772.N((class03556)var2, (float)0.5f));
        class012892.N(class05359.R, class05772.u((class03556)var2, (float)0.5f), (Set)ImmutableSet.of((Object)Pair.of((Object)class05378.i, (Object)class05367.field_18456)));
        class012892.N(class05359.i, class05772.L((class03556)var2, (float)0.5f));
        class012892.N(class05359.y, class05772.i((class03556)var2, (float)0.5f));
        class012892.N(class05359.M, class05772.R((class03556)var2, (float)0.5f));
        class012892.N(class05359.Z, class05772.M((class03556)var2, (float)0.5f));
        class012892.N(class05359.B, class05772.B((class03556)var2, (float)0.5f));
        class012892.N(class05359.z, class05772.Z((class03556)var2, (float)0.5f));
        class012892.N((Set)ImmutableSet.of((Object)class05359.N));
        class012892.y(class05359.y);
        class012892.N(class05359.y);
        class012892.N(this.method_73183().method_75728(), this.method_73183().N(), this.method_73189());
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        if (class061132 == class06113.field_16466) {
            this.N(this.t().y((class02063)class010012.method_30349(), class05672.y));
        }
        if (class061132 == class06113.field_16462 || class061132 == class06113.field_16465 || class06113.N((class06113)class061132) || class061132 == class06113.field_16470) {
            this.N(this.t().N((class02063)class010012.method_30349(), class05660.N((class03556)class010012.i(this.method_24515()))));
        }
        if (class061132 == class06113.field_16474) {
            this.Nt = true;
        }
        return super.N(class010012, class070522, class061132, class074462);
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        if (!class080362.method_5998(class070502).N(class06570.tW) && this.method_5805() && !this.o() && !this.method_6113()) {
            if (this.method_6109()) {
                this.NO();
                return class07082.N;
            }
            if (!this.method_73183().method_8608()) {
                boolean bl = this.y().isEmpty();
                if (class070502 == class07050.field_5808) {
                    if (bl) {
                        this.NO();
                    }
                    class080362.method_7281(class01235.C);
                }
                if (bl) {
                    return class07082.L;
                }
                this.i(class080362);
            }
            return class07082.N;
        }
        return super.N(class080362, class070502);
    }

    public void N(class05666 class056662) {
        if (!this.t().y().equals((Object)class056662.y())) {
            this.R = null;
        }
        this.field_6011.N(Z, (Object)class056662);
    }

    public void N(class05378<class06289> class053782) {
        if (!(this.method_73183() instanceof class04782)) {
            return;
        }
        class02796 class027962 = ((class04782)this.method_73183()).method_8503();
        ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.L(class053782).ifPresent(class062892 -> {
            class04782 class047822 = class027962.N(class062892.N());
            if (class047822 == null) {
                return;
            }
            class05368 class053682 = class047822.method_19494();
            Optional var6 = class053682.L(class062892.y());
            BiPredicate<class08041, class03556<class05369>> var7 = u.get(class053782);
            if (var6.isPresent() && var7.test(this, (class03556<class05369>)((class03556)var6.get()))) {
                class053682.y(class062892.y());
                class047822.method_74535().y(class062892.y());
            }
        });
    }

    public void N(@Nullable class08036 class080362) {
        boolean bl = this.N() != null && class080362 == null;
        super.N(class080362);
        if (bl) {
            this.W();
        }
    }

    public boolean N(double d) {
        return false;
    }

    protected void N(class04782 class047822) {
        class04877 class048772;
        class04643 class046432 = class08700.N();
        class046432.N("villagerBrain");
        this.method_18868().N(class047822, (class07438)this);
        class046432.L();
        if (this.Nt) {
            this.Nt = false;
        }
        if (!this.o() && this.Ny > 0) {
            --this.Ny;
            if (this.Ny <= 0) {
                if (this.NL) {
                    this.R(class047822);
                    this.NL = false;
                }
                this.method_6092(new class07055(class07047.z, 200, 0));
            }
        }
        if (this.NE != null) {
            class047822.method_19496(class05354.i, (class07049)this.NE, (class01329)this);
            class047822.method_8421((class07049)this, (byte)14);
            this.NE = null;
        }
        if (!this.Nt() && this.field_5974.y(100) == 0 && (class048772 = class047822.method_19502(this.method_24515())) != null && class048772.T() && !class048772.N()) {
            class047822.method_8421((class07049)this, (byte)42);
        }
        if (this.t().y().N(class05672.y) && this.o()) {
            this.W();
        }
        super.N(class047822);
    }

    public @Nullable class08041 y(class04782 class047822, class07077 class070772) {
        class03556 var3;
        double d = this.field_5974.U();
        if (d < 0.5) {
            class03529 class035292 = class047822.method_30349().i(class05660.N((class03556)class047822.i(this.method_24515())));
        } else {
            var3 = d < 0.75 ? this.t().N() : ((class08041)class070772).t().N();
        }
        class08041 class080412 = new class08041((class07078<? extends class08041>)class07078.ye, (class07299)class047822, (class03556<class05660>)var3);
        class080412.N((class01001)class047822, class047822.method_8404(class080412.method_24515()), class06113.field_16466, null);
        return class080412;
    }

    protected void N(class04782 class047822, class00717 class007172) {
        class04391.N((class04782)class047822, (class07079)this, (class04391)this, (class00717)class007172);
    }

    protected void W() {
        super.W();
        this.Ng();
    }

    private void R(class08036 class080362) {
        int n = this.u(class080362);
        if (n != 0) {
            for (class07324 class073242 : this.y()) {
                class073242.N(-class04995.y((float)((float)n * class073242.s())));
            }
        }
        if (class080362.method_6059(class07047.I)) {
            class07055 class070552 = class080362.method_6112(class07047.I);
            int n2 = class070552.i();
            for (class07324 class073243 : this.y()) {
                int n3 = (int)Math.floor((0.3 + 0.0625 * (double)n2) * (double)class073243.N().c());
                class073243.N(-Math.max(n3, 1));
            }
        }
    }

    private void R(class04782 class047822) {
        this.N(this.t().N(this.t().L() + 1));
        this.i(class047822);
    }

    public class05774 O() {
        return this.NP;
    }

    public static class05666 G() {
        return new class05666((class03556)class04206.l.y(class05660.L), (class03556)class04206.d.y(class05672.y), 1);
    }

    public boolean Y() {
        return this.NX() < 12;
    }

    private void NO() {
        this.M(40);
        if (!this.method_73183().method_8608()) {
            this.method_56078(class04909.gP);
        }
    }

    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.NQ) {
            class03556 var3 = (class03556)class08041.method_66651((class02477)class02484.NQ, t);
            this.N(this.t().N(var3));
            return true;
        }
        return super.method_66654(class024772, t);
    }

    private void NK() {
        Iterator var1 = this.y().iterator();
        while (var1.hasNext()) {
            ((class07324)var1.next()).M();
        }
    }

    private void NH() {
        if (!this.Ne() || this.NX() == 0) {
            return;
        }
        for (int i = 0; i < this.n().method_5439(); ++i) {
            Integer n;
            class06584 class065842 = this.n().method_5438(i);
            if (class065842.R() || (n = y.get(class065842.B())) == null) continue;
            for (int j = class065842.c(); j > 0; --j) {
                this.Nm += n.intValue();
                this.n().method_5434(i, 1);
                if (this.Ne()) continue;
                return;
            }
        }
    }

    private boolean Nc() {
        int n = this.t().L();
        return class05666.u((int)n) && this.Nb >= class05666.L((int)n);
    }

    private void Np() {
        this.Nq();
        this.Nv = 0;
    }

    private boolean Ne() {
        return this.Nm < 12;
    }

    private int NX() {
        class07075 class070752 = this.n();
        return y.entrySet().stream().mapToInt(entry -> class070752.N_61((class06581)entry.getKey()) * (Integer)entry.getValue()).sum();
    }

    private void Ng() {
        if (this.method_73183().method_8608()) {
            return;
        }
        Iterator var1 = this.y().iterator();
        while (var1.hasNext()) {
            ((class07324)var1.next()).m();
        }
    }

    private boolean NJ() {
        Iterator var1 = this.y().iterator();
        while (var1.hasNext()) {
            if (!((class07324)var1.next()).v()) continue;
            return true;
        }
        return false;
    }

    private void NI() {
        class07316 class073162 = this.y();
        class08036 class080362 = this.N();
        if (class080362 != null && !class073162.isEmpty()) {
            class080362.method_17354(((class07482)class080362.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b, class073162, this.t().L(), this.u(), this.i(), this.m());
        }
    }

    private void NV() {
        this.N((class05378<class06289>)class05378.y);
        this.N((class05378<class06289>)class05378.L);
        this.N((class05378<class06289>)class05378.u);
        this.N((class05378<class06289>)class05378.i);
    }

    private void Nq() {
        int n = 2 - this.Nv;
        if (n > 0) {
            Iterator var2 = this.y().iterator();
            while (var2.hasNext()) {
                ((class07324)var2.next()).z();
            }
        }
        for (int i = 0; i < n; ++i) {
            this.NK();
        }
        this.NI();
    }

    private void Na() {
        long l = this.method_73183().N();
        if (this.NT == 0L) {
            this.NT = l;
            return;
        }
        if (l < this.NT + 24000L) {
            return;
        }
        this.NP.y();
        this.NT = l;
    }

    public class05781<class08041> method_28306() {
        return class01289.N(NG, Nl);
    }

    public class04891 method_6002() {
        return class04909.gW;
    }

    public class01289<class08041> method_18868() {
        return super.method_18868();
    }

    public void method_18403(class07209 class072092) {
        super.method_18403(class072092);
        ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(class05378.q, (Object)this.method_73183().N());
        ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.y(class05378.m);
        ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.y(class05378.I);
    }

    public void method_6015(@Nullable class07438 class074382) {
        if (class074382 != null && this.method_73183() instanceof class04782) {
            ((class04782)this.method_73183()).method_19496(class05354.L, (class07049)class074382, (class01329)this);
            if (this.method_5805() && class074382 instanceof class08036) {
                this.method_73183().method_8421((class07049)this, (byte)13);
            }
        }
        super.method_6015(class074382);
    }

    public void method_6078(class07072 class070722) {
        B.info("Villager {} died, message: '{}'", (Object)this, (Object)class070722.N((class07438)this).getString());
        class07049 class070492 = class070722.u();
        if (class070492 != null) {
            this.L(class070492);
        }
        this.NV();
        super.method_6078(class070722);
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.gm;
    }

    public void method_18400() {
        super.method_18400();
        ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(class05378.K, (Object)this.method_73183().N());
    }

    public class01289<?> method_18867(Dynamic<?> dynamic) {
        class01289 var2 = this.method_28306().N(dynamic);
        this.N((class01289<class08041>)var2);
        return var2;
    }
}

