/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09524
 *  Nursultan.class09525
 *  Nursultan.class09526
 *  Nursultan.class09528
 *  Nursultan.class09530
 *  Nursultan.class09531
 *  Nursultan.class09533
 *  Nursultan.class10285
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.longs.Long2IntMap
 *  it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap
 *  java.lang.MatchException
 *  minecraft.class00500
 *  minecraft.class00893
 *  minecraft.class01146
 *  minecraft.class01296
 *  minecraft.class01818
 *  minecraft.class01823
 *  minecraft.class03001
 *  minecraft.class03027
 *  minecraft.class03222
 *  minecraft.class03229
 *  minecraft.class03421
 *  minecraft.class03460
 *  minecraft.class03865
 *  minecraft.class03866
 *  minecraft.class03867
 *  minecraft.class03874
 *  minecraft.class03875
 *  minecraft.class03877
 *  minecraft.class03884
 *  minecraft.class03885
 *  minecraft.class03886
 *  minecraft.class03897
 *  minecraft.class03904
 *  minecraft.class03909
 *  minecraft.class03912
 *  minecraft.class04084
 *  minecraft.class04995
 *  minecraft.class05474
 *  minecraft.class05943
 *  minecraft.class05967
 *  minecraft.class07321
 *  minecraft.class08050
 *  net.fabricmc.fabric.impl.biome.MultiNoiseSamplerHooks
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09524;
import Nursultan.class09525;
import Nursultan.class09526;
import Nursultan.class09528;
import Nursultan.class09530;
import Nursultan.class09531;
import Nursultan.class09533;
import Nursultan.class10285;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import minecraft.class00500;
import minecraft.class00893;
import minecraft.class01146;
import minecraft.class01296;
import minecraft.class01818;
import minecraft.class01823;
import minecraft.class01828;
import minecraft.class01836;
import minecraft.class03001;
import minecraft.class03027;
import minecraft.class03222;
import minecraft.class03229;
import minecraft.class03421;
import minecraft.class03460;
import minecraft.class03865;
import minecraft.class03866;
import minecraft.class03867;
import minecraft.class03874;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03884;
import minecraft.class03885;
import minecraft.class03886;
import minecraft.class03897;
import minecraft.class03904;
import minecraft.class03909;
import minecraft.class03912;
import minecraft.class04084;
import minecraft.class04995;
import minecraft.class05474;
import minecraft.class05943;
import minecraft.class05967;
import minecraft.class07321;
import minecraft.class08050;
import net.fabricmc.fabric.impl.biome.MultiNoiseSamplerHooks;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01837
implements class03875,
class03912 {
    public final int N;
    public final int y;
    public final int L;
    private final int v;
    private final int n;
    final int u;
    final int i;
    public final List<class09526> R;
    public final List<class09531> M;
    private final Map<class03877, class03877> t = new HashMap<class03877, class03877>();
    private final Long2IntMap G = new Long2IntOpenHashMap();
    private final class03460 l;
    private final class03877 d;
    private final class01828 w;
    private final class03001 k;
    private final class01836 Y;
    private final class01836 Q;
    private final class03874 O;
    private long g = class07321.L;
    private class03027 I = new class03027(1.0, 0.0);
    final int B;
    public final int Z;
    public final int z;
    public boolean U;
    public boolean E;
    private int J;
    public int W;
    private int o;
    public int m;
    public int P;
    public int s;
    public long T;
    public long b;
    public int j;
    private final class03912 q = new class09525(this);
    private long K;

    public int L() {
        return this.W + this.P;
    }

    public void L(int n, double d) {
        this.s = n - this.o;
        ++this.T;
        Iterator<class09526> var4 = this.R.iterator();
        while (var4.hasNext()) {
            var4.next().L(d);
        }
    }

    public class03027 L(int n, int n2) {
        class03027 class030272;
        long l = class07321.u((int)n, (int)n2);
        if (this.g == l) {
            return this.I;
        }
        this.g = l;
        this.I = class030272 = this.k.N(n, n2);
        return class030272;
    }

    public void M() {
        if (!this.U) {
            throw new IllegalStateException("Staring interpolation twice");
        }
        this.U = false;
    }

    public class01837(int n, class04084 class040842, int n2, int n3, class05967 class059672, class03874 class038742, class05943 class059432, class03421 class034212, class03001 class030012) {
        int n4;
        int n5;
        this.Z = class059672.y();
        this.z = class059672.N();
        this.N = n;
        this.y = class04995.y((int)class059672.u(), (int)this.z);
        this.L = class04995.y((int)class059672.L(), (int)this.z);
        this.v = Math.floorDiv(n2, this.Z);
        this.n = Math.floorDiv(n3, this.Z);
        this.R = Lists.newArrayList();
        this.M = Lists.newArrayList();
        this.u = class01146.N((int)n2);
        this.i = class01146.N((int)n3);
        this.B = class01146.N((int)(n * this.Z));
        this.k = class030012;
        this.O = class038742;
        this.Y = new class01836(this, (class03877)new class09528(this), false);
        this.Q = new class01836(this, (class03877)new class09533(this), false);
        if (!class030012.y()) {
            for (int i = 0; i <= this.B; ++i) {
                int n6 = this.u + i;
                n5 = class01146.L((int)n6);
                for (n4 = 0; n4 <= this.B; ++n4) {
                    int n7 = class01146.L((int)(this.i + n4));
                    class03027 class030272 = class030012.N(n5, n7);
                    this.Y.N[i + n4 * this.Y.y] = class030272.N();
                    this.Q.N[i + n4 * this.Q.y] = class030272.y();
                }
            }
        } else {
            Arrays.fill(this.Y.N, 1.0);
            Arrays.fill(this.Q.N, 0.0);
        }
        class03866 class038662 = class040842.N();
        class03866 class038663 = class038662.N(this::N);
        this.d = class038663.U();
        if (!class059432.y()) {
            this.l = class03460.N((class03421)class034212);
        } else {
            n5 = class01296.N((int)n2);
            n4 = class01296.N((int)n3);
            this.l = class03460.N((class01837)this, (class07321)new class07321(n5, n4), (class03866)class038663, (class01818)class040842.u(), (int)class059672.L(), (int)class059672.u(), (class03421)class034212);
        }
        ArrayList<class01828> arrayList = new ArrayList<class01828>();
        class03877 class038772 = class03865.i((class03877)class03865.N((class03877)class038663.E(), (class03877)class03904.field_37076)).N(this::N);
        arrayList.add(class038752 -> this.l.N(class038752, class038772.N(class038752)));
        if (class059432.L()) {
            arrayList.add(class03867.N((class03877)class038663.W(), (class03877)class038663.m(), (class03877)class038663.P(), (class01818)class040842.i()));
        }
        this.w = new class01823(arrayList.toArray(new class01828[0]));
        this.N(n, class040842, n2, n3, class059672, class038742, class059432, class034212, class030012, null);
    }

    public void B() {
        this.R.forEach(class09526::W);
    }

    public class03460 Z() {
        return this.l;
    }

    public class03001 i() {
        return this.k;
    }

    public int U() {
        return this.z;
    }

    public int z() {
        return this.Z;
    }

    public int u() {
        return this.o + this.s;
    }

    private class03877 y(class03877 class038772) {
        if (class038772 instanceof class03897) {
            class03897 class038972 = (class03897)class038772;
            return switch (class038972.i()) {
                default -> throw new MatchException(null, null);
                case class03909.field_36562 -> new class09526(this, class038972.u());
                case class03909.field_36563 -> new class01836(this, class038972.u(), true);
                case class03909.field_36564 -> new class09530(class038972.u());
                case class03909.field_36565 -> new class09524(this, class038972.u());
                case class03909.field_36566 -> new class09531(this, class038972.u());
            };
        }
        if (this.k != class03001.N()) {
            if (class038772 == class03884.field_36549) {
                return this.Y;
            }
            if (class038772 == class03886.field_36551) {
                return this.Q;
            }
        }
        if (class038772 == class03904.field_37076) {
            return this.O;
        }
        if (class038772 instanceof class03885) {
            class03885 class038852 = (class03885)class038772;
            return (class03877)class038852.u().N();
        }
        return class038772;
    }

    public int y() {
        return this.J + this.m;
    }

    public void y(int n, int n2) {
        for (class09526 class095262 : this.R) {
            class095262.N(n, n2);
        }
        this.E = true;
        this.W = (n + this.L) * this.z;
        this.o = (this.n + n2) * this.Z;
        ++this.b;
        for (class09531 class095312 : this.M) {
            class095312.N.N(class095312.y, (class03912)this);
        }
        ++this.b;
        this.E = false;
    }

    public void y(int n, double d) {
        this.m = n - this.J;
        Iterator<class09526> var4 = this.R.iterator();
        while (var4.hasNext()) {
            var4.next().y(d);
        }
    }

    public class01837 L(int n) {
        int n2 = Math.floorMod(n, this.Z);
        int n3 = Math.floorDiv(n, this.Z);
        int n4 = Math.floorMod(n3, this.Z);
        int n5 = this.z - 1 - Math.floorDiv(n3, this.Z);
        this.m = n4;
        this.P = n5;
        this.s = n2;
        this.j = n;
        return this;
    }

    private void N(class03866 class038662, List list, CallbackInfoReturnable callbackInfoReturnable) {
        ((MultiNoiseSamplerHooks)callbackInfoReturnable.getReturnValue()).fabric_setSeed(this.K);
    }

    protected class03877 N(class03877 class038772) {
        return this.t.computeIfAbsent(class038772, this::y);
    }

    private void N(int n, class04084 class040842, int n2, int n3, class05967 class059672, class03874 class038742, class05943 class059432, class03421 class034212, class03001 class030012, CallbackInfo callbackInfo) {
        this.K = ((MultiNoiseSamplerHooks)class040842.y()).fabric_getSeed();
    }

    private void N(boolean bl, int n) {
        this.J = n * this.Z;
        this.m = 0;
        for (int i = 0; i < this.N + 1; ++i) {
            int n2 = this.n + i;
            this.o = n2 * this.Z;
            this.s = 0;
            ++this.b;
            for (class09526 class095262 : this.R) {
                double[] dArray = (bl ? class095262.N : class095262.y)[i];
                class095262.N(dArray, this.q);
            }
        }
        ++this.b;
    }

    private int N(long l) {
        int n = class00893.N((long)l);
        int n2 = class00893.y((long)l);
        return class04995.N((double)this.d.N((class03875)new class10285(n, 0, n2)));
    }

    public int N(int n, int n2) {
        int n3 = class01146.L((int)class01146.N((int)n));
        int n4 = class01146.L((int)class01146.N((int)n2));
        return this.G.computeIfAbsent(class00893.N((int)n3, (int)n4), this::N);
    }

    public int N(int n, int n2, int n3, int n4) {
        int n5 = Integer.MIN_VALUE;
        for (int i = n2; i <= n4; i += 4) {
            for (int j = n; j <= n3; j += 4) {
                int n6 = this.N(j, i);
                if (n6 <= n5) continue;
                n5 = n6;
            }
        }
        return n5;
    }

    public @Nullable class00500 N() {
        return this.w.calculate(this);
    }

    public class03222 N(class03866 class038662, List<class03229> list) {
        class03222 class032222 = new class03222(class038662.i().N(this::N), class038662.R().N(this::N), class038662.M().N(this::N), class038662.B().N(this::N), class038662.Z().N(this::N), class038662.z().N(this::N), list);
        this.N(class038662, list, new CallbackInfoReturnable("", false, (Object)class032222));
        return class032222;
    }

    public static class01837 N(class08050 class080502, class04084 class040842, class03874 class038742, class05943 class059432, class03421 class034212, class03001 class030012) {
        class05967 class059672 = class059432.R().N((class05474)class080502);
        class07321 class073212 = class080502.R();
        int n = 16 / class059672.y();
        return new class01837(n, class040842, class073212.i(), class073212.R(), class059672, class038742, class059432, class034212, class030012);
    }

    public void N(int n, double d) {
        this.P = n - this.W;
        Iterator<class09526> var4 = this.R.iterator();
        while (var4.hasNext()) {
            var4.next().N(d);
        }
    }

    public void N(int n) {
        this.N(false, this.v + n + 1);
        this.J = (this.v + n) * this.Z;
    }

    public void N(double[] dArray, class03877 class038772) {
        this.j = 0;
        for (int i = this.z - 1; i >= 0; --i) {
            this.P = i;
            for (int j = 0; j < this.Z; ++j) {
                this.m = j;
                int n = 0;
                while (n < this.Z) {
                    this.s = n++;
                    dArray[this.j++] = class038772.N((class03875)this);
                }
            }
        }
    }

    public void R() {
        if (this.U) {
            throw new IllegalStateException("Staring interpolation twice");
        }
        this.U = true;
        this.T = 0L;
        this.N(true, this.v);
    }
}

