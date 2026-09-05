/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10285
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00554
 *  minecraft.class00751
 *  minecraft.class00765
 *  minecraft.class00780
 *  minecraft.class00803
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01146
 *  minecraft.class01376
 *  minecraft.class01607
 *  minecraft.class01837
 *  minecraft.class02999
 *  minecraft.class03001
 *  minecraft.class03322
 *  minecraft.class03421
 *  minecraft.class03430
 *  minecraft.class03460
 *  minecraft.class03556
 *  minecraft.class03866
 *  minecraft.class03874
 *  minecraft.class03875
 *  minecraft.class03882
 *  minecraft.class03904
 *  minecraft.class04043
 *  minecraft.class04084
 *  minecraft.class04227
 *  minecraft.class04330
 *  minecraft.class04995
 *  minecraft.class05324
 *  minecraft.class05474
 *  minecraft.class05517
 *  minecraft.class05943
 *  minecraft.class05946
 *  minecraft.class05967
 *  minecraft.class06051
 *  minecraft.class06057
 *  minecraft.class06069
 *  minecraft.class06075
 *  minecraft.class06080
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07321
 *  minecraft.class07361
 *  minecraft.class07376
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07829
 *  minecraft.class07830
 *  minecraft.class07836
 *  minecraft.class07841
 *  minecraft.class08050
 *  minecraft.class08088
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10285;
import com.google.common.base.Suppliers;
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.OptionalInt;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import java.util.function.Supplier;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class00751;
import minecraft.class00765;
import minecraft.class00780;
import minecraft.class00803;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01146;
import minecraft.class01376;
import minecraft.class01607;
import minecraft.class01837;
import minecraft.class02999;
import minecraft.class03001;
import minecraft.class03322;
import minecraft.class03421;
import minecraft.class03430;
import minecraft.class03460;
import minecraft.class03556;
import minecraft.class03866;
import minecraft.class03874;
import minecraft.class03875;
import minecraft.class03882;
import minecraft.class03904;
import minecraft.class04043;
import minecraft.class04084;
import minecraft.class04227;
import minecraft.class04330;
import minecraft.class04995;
import minecraft.class05324;
import minecraft.class05474;
import minecraft.class05517;
import minecraft.class05943;
import minecraft.class05946;
import minecraft.class05967;
import minecraft.class06051;
import minecraft.class06057;
import minecraft.class06069;
import minecraft.class06075;
import minecraft.class06080;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07321;
import minecraft.class07361;
import minecraft.class07376;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07829;
import minecraft.class07830;
import minecraft.class07836;
import minecraft.class07841;
import minecraft.class08050;
import minecraft.class08088;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public final class class04865
extends class08088 {
    public static final MapCodec<class04865> u = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00765.N.fieldOf("biome_source").forGetter(class048652 -> class048652.y), (App)class05943.y.fieldOf("settings").forGetter(class048652 -> class048652.R)).apply(instance, instance.stable(class04865::new)));
    private static final class00500 i = class00869.N.W();
    private final class03556<class05943> R;
    private final Supplier<class03421> M;
    private int B = Integer.MIN_VALUE;

    public int M() {
        return ((class05943)this.R.N()).R().L();
    }

    public class04865(class00765 class007652, class03556<class05943> class035562) {
        super(class007652);
        this.R = class035562;
        this.M = Suppliers.memoize(() -> class04865.N((class05943)class035562.N()));
    }

    public class03556<class05943> B() {
        return this.R;
    }

    public int i() {
        return ((class05943)this.R.N()).R().u();
    }

    protected MapCodec<? extends class08088> y() {
        return u;
    }

    private void y(class03001 class030012, class04084 class040842, class05324 class053242, class08050 class080503) {
        class01837 class018372 = class080503.N_20(class080502 -> this.N((class08050)class080502, class053242, class030012, class040842));
        class04330 class043302 = class02999.N((class04330)class030012.N((class04330)this.y), (class08050)class080503);
        class080503.N(class043302, class018372.N(class040842.N(), ((class05943)this.R.N()).U()));
    }

    private static /* synthetic */ class03430 N(class03430 class034302, int n, class03430 class034303, class03430 class034304, int n2, int n3, int n4) {
        if (class07529.Nd) {
            return class034302;
        }
        if (n3 < Math.min(-54, n)) {
            return class034303;
        }
        return class034304;
    }

    public CompletableFuture<class08050> N(class04084 class040842, class03001 class030012, class05324 class053242, class08050 class080502) {
        return CompletableFuture.supplyAsync(() -> {
            this.y(class030012, class040842, class053242, class080502);
            return class080502;
        }, class07536.B().N("init_biomes"));
    }

    private static class03421 N(class05943 class059432) {
        class03430 class034302 = new class03430(-54, class00869.V.W());
        int n = class059432.E();
        class03430 class034303 = new class03430(n, class059432.B());
        return (arg_0, arg_1, arg_2) -> class04865.N(new class03430(class07376.i * 2, class00869.N.W()), n, class034302, class034303, arg_0, arg_1, arg_2);
    }

    public void N(List<String> list, class04084 class040842, class07209 class072092) {
        DecimalFormat decimalFormat = new DecimalFormat("0.000", DecimalFormatSymbols.getInstance(Locale.ROOT));
        class03866 class038662 = class040842.N();
        class10285 class102852 = new class10285(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
        double d = class038662.z().N((class03875)class102852);
        list.add("NoiseRouter T: " + decimalFormat.format(class038662.i().N((class03875)class102852)) + " V: " + decimalFormat.format(class038662.R().N((class03875)class102852)) + " C: " + decimalFormat.format(class038662.M().N((class03875)class102852)) + " E: " + decimalFormat.format(class038662.B().N((class03875)class102852)) + " D: " + decimalFormat.format(class038662.Z().N((class03875)class102852)) + " W: " + decimalFormat.format(d) + " PV: " + decimalFormat.format(class03882.N((float)((float)d))) + " PS: " + decimalFormat.format(class038662.U().N((class03875)class102852)) + " N: " + decimalFormat.format(class038662.E().N((class03875)class102852)));
    }

    private OptionalInt N(class05474 class054742, class04084 class040842, int n, int n2, @Nullable MutableObject<class01376> mutableObject, @Nullable Predicate<class00500> predicate) {
        class00500[] class00500Array;
        class05967 class059672 = ((class05943)this.R.N()).R().N(class054742);
        int n3 = class059672.N();
        int n4 = class059672.L();
        int n5 = class04995.y((int)n4, (int)n3);
        int n6 = class04995.y((int)class059672.u(), (int)n3);
        if (n6 <= 0) {
            return OptionalInt.empty();
        }
        if (mutableObject == null) {
            class00500Array = null;
        } else {
            class00500Array = new class00500[class059672.u()];
            mutableObject.setValue((Object)new class01376(n4, class00500Array));
        }
        int n7 = class059672.y();
        int n8 = Math.floorDiv(n, n7);
        int n9 = Math.floorDiv(n2, n7);
        int n10 = Math.floorMod(n, n7);
        int n11 = Math.floorMod(n2, n7);
        int n12 = n8 * n7;
        int n13 = n9 * n7;
        double d = (double)n10 / (double)n7;
        double d2 = (double)n11 / (double)n7;
        class01837 class018372 = new class01837(1, class040842, n12, n13, class059672, (class03874)class03904.field_37076, (class05943)this.R.N(), this.M.get(), class03001.N());
        class018372.R();
        class018372.N(0);
        for (int i = n6 - 1; i >= 0; --i) {
            class018372.y(i, 0);
            for (int j = n3 - 1; j >= 0; --j) {
                class00500 class005002;
                int n14 = (n5 + i) * n3 + j;
                double d3 = (double)j / (double)n3;
                class018372.N(n14, d3);
                class018372.y(n, d);
                class018372.L(n2, d2);
                class00500 class005003 = class018372.N();
                class00500 class005004 = class005002 = class005003 == null ? ((class05943)this.R.N()).M() : class005003;
                if (class00500Array != null) {
                    int n15 = i * n3 + j;
                    class00500Array[n15] = class005002;
                }
                if (predicate == null || !predicate.test(class005002)) continue;
                class018372.M();
                return OptionalInt.of(n14 + 1);
            }
        }
        class018372.M();
        return OptionalInt.empty();
    }

    public void N(class01607 class016072, class05324 class053242, class04084 class040842, class08050 class080502) {
        if (class07529.N((class07321)class080502.R()) || class07529.Nk) {
            return;
        }
        class06057 class060572 = new class06057((class08088)this, (class05474)class016072);
        this.N(class080502, class060572, class040842, class053242, class016072.method_22385(), (class00751<class00780>)class016072.method_30349().L(class04227.NA), class03001.N((class01607)class016072));
    }

    public void N(class08050 class080503, class06057 class060572, class04084 class040842, class05324 class053242, class05517 class055172, class00751<class00780> class007512, class03001 class030012) {
        class01837 class018372 = class080503.N_20(class080502 -> this.N((class08050)class080502, class053242, class030012, class040842));
        class05943 class059432 = (class05943)this.R.N();
        class040842.L().N(class040842, class055172, class007512, class059432.m(), class060572, class080503, class018372, class059432.z());
    }

    public class01376 N(int n, int n2, class05474 class054742, class04084 class040842) {
        MutableObject mutableObject = new MutableObject();
        this.N(class054742, class040842, n, n2, (MutableObject<class01376>)mutableObject, null);
        return (class01376)mutableObject.get();
    }

    public int N(int n, int n2, class07830 class078302, class05474 class054742, class04084 class040842) {
        return this.N(class054742, class040842, n, n2, null, class078302.u()).orElse(class054742.method_31607());
    }

    public boolean N(class05946<class05943> class059462) {
        return this.R.N(class059462);
    }

    public void N(class01607 class016072) {
        if (((class05943)this.R.N()).N()) {
            return;
        }
        class07321 class073212 = class016072.L();
        class03556 class035562 = class016072.i(class073212.W().method_33096(class016072.method_31600()));
        class07836 class078362 = new class07836((class06069)new class06075(class04043.N()));
        class078362.N(class016072.method_8412(), class073212.i(), class073212.R());
        class00803.N((class01001)class016072, (class03556)class035562, (class07321)class073212, (class06069)class078362);
    }

    private class01837 N(class08050 class080502, class05324 class053242, class03001 class030012, class04084 class040842) {
        return class01837.N((class08050)class080502, (class04084)class040842, (class03874)class06051.N((class05324)class053242, (class07321)class080502.R()), (class05943)((class05943)this.R.N()), (class03421)this.M.get(), (class03001)class030012);
    }

    private class00500 N(class01837 class018372, int n, int n2, int n3, class00500 class005002) {
        int n4;
        if (class07529.Nv && n3 >= 0 && n3 % 4 == 0 && n2 == (n4 = class018372.N(n, n3) + 8)) {
            class005002 = n4 < this.R() ? class00869.Zc.W() : class00869.TM.W();
        }
        return class005002;
    }

    public void N(class01607 class016072, long l, class04084 class040842, class05517 class055172, class05324 class053242, class08050 class080503) {
        if (class07529.NY) {
            return;
        }
        class05517 class055173 = class055172.N((n, n2, n3) -> this.y.method_38109(n, n2, n3, class040842.y()));
        class07836 class078362 = new class07836((class06069)new class06075(class04043.N()));
        int n4 = 8;
        class07321 class073212 = class080503.R();
        class01837 class018372 = class080503.N_20(class080502 -> this.N((class08050)class080502, class053242, class03001.N((class01607)class016072), class040842));
        class03460 class034602 = class018372.Z();
        class06080 class060802 = new class06080(this, class016072.method_30349(), class080503.w(), class018372, class040842, ((class05943)this.R.N()).z());
        class03322 class033222 = ((class07361)class080503).g();
        for (int i = -8; i <= 8; ++i) {
            for (int j = -8; j <= 8; ++j) {
                class07321 class073213 = new class07321(class073212.B + i, class073212.Z + j);
                Iterable iterable = class016072.method_8392(class073213.B, class073213.Z).N(() -> this.N(this.y.method_38109(class01146.N((int)class073213.i()), 0, class01146.N((int)class073213.R()), class040842.y()))).N();
                int n5 = 0;
                Iterator iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    class07829 class078292 = (class07829)((class03556)iterator.next()).N();
                    class078362.L(l + (long)n5, class073213.B, class073213.Z);
                    if (class078292.N((class06069)class078362)) {
                        class078292.N(class060802, class080503, arg_0 -> ((class05517)class055173).N(arg_0), (class06069)class078362, class034602, class073213, class033222);
                    }
                    ++n5;
                }
            }
        }
    }

    public CompletableFuture<class08050> N(class03001 class030012, class04084 class040842, class05324 class053242, class08050 class080502) {
        class05967 class059672 = ((class05943)this.R.N()).R().N(class080502.w());
        int n = class059672.L();
        int n2 = class04995.y((int)n, (int)class059672.N());
        int n3 = class04995.y((int)class059672.u(), (int)class059672.N());
        if (n3 <= 0) {
            return CompletableFuture.completedFuture(class080502);
        }
        return CompletableFuture.supplyAsync(() -> {
            Object object;
            int n4 = class080502.method_31602(n3 * class059672.N() - 1 + n);
            int n5 = class080502.method_31602(n);
            HashSet hashSet = Sets.newHashSet();
            for (int i = n4; i >= n5; --i) {
                object = class080502.y(i);
                object.N();
                hashSet.add(object);
            }
            try {
                class08050 class080503 = this.N(class030012, class053242, class040842, class080502, n2, n3);
                return class080503;
            }
            finally {
                object = hashSet.iterator();
                while (object.hasNext()) {
                    ((class00554)object.next()).y();
                }
            }
        }, class07536.B().N("wgen_fill_noise"));
    }

    private class08050 N(class03001 class030012, class05324 class053242, class04084 class040842, class08050 class080503, int n, int n2) {
        class01837 class018372 = class080503.N_20(class080502 -> this.N((class08050)class080502, class053242, class030012, class040842));
        class07841 class078412 = class080503.N(class07830.field_13195);
        class07841 class078413 = class080503.N(class07830.field_13194);
        class07321 class073212 = class080503.R();
        int n3 = class073212.i();
        int n4 = class073212.R();
        class03460 class034602 = class018372.Z();
        class018372.R();
        class07218 class072182 = new class07218();
        int n5 = class018372.z();
        int n6 = class018372.U();
        int n7 = 16 / n5;
        int n8 = 16 / n5;
        for (int i = 0; i < n7; ++i) {
            class018372.N(i);
            for (int j = 0; j < n8; ++j) {
                int n9 = class080503.method_32890() - 1;
                class00554 class005542 = class080503.y(n9);
                for (int k = n2 - 1; k >= 0; --k) {
                    class018372.y(k, j);
                    for (int i2 = n6 - 1; i2 >= 0; --i2) {
                        int n10 = (n + k) * n6 + i2;
                        int n11 = n10 & 0xF;
                        int n12 = class080503.method_31602(n10);
                        if (n9 != n12) {
                            n9 = n12;
                            class005542 = class080503.y(n12);
                        }
                        double d = (double)i2 / (double)n6;
                        class018372.N(n10, d);
                        for (int i3 = 0; i3 < n5; ++i3) {
                            int n13 = n3 + i * n5 + i3;
                            int n14 = n13 & 0xF;
                            double d2 = (double)i3 / (double)n5;
                            class018372.y(n13, d2);
                            for (int i4 = 0; i4 < n5; ++i4) {
                                int n15 = n4 + j * n5 + i4;
                                int n16 = n15 & 0xF;
                                double d3 = (double)i4 / (double)n5;
                                class018372.L(n15, d3);
                                class00500 class005002 = class018372.N();
                                if (class005002 == null) {
                                    class005002 = ((class05943)this.R.N()).M();
                                }
                                if ((class005002 = this.N(class018372, n13, n10, n15, class005002)) == class04865.i || class07529.N((class07321)class080503.R())) continue;
                                class005542.N(n14, n11, n16, class005002, false);
                                class078412.N(n14, n10, n16, class005002);
                                class078413.N(n14, n10, n16, class005002);
                                if (!class034602.N() || class005002.Y().W()) continue;
                                class072182.N(n13, n10, n15);
                                class080503.u((class07209)class072182);
                            }
                        }
                    }
                }
            }
            class018372.B();
        }
        class018372.M();
        return class080503;
    }

    public int R() {
        if (this.B == Integer.MIN_VALUE) {
            this.B = ((class05943)this.R.N()).E();
        }
        return this.B;
    }
}

