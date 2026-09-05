/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  minecraft.class00753
 *  minecraft.class00758
 *  minecraft.class00780
 *  minecraft.class01146
 *  minecraft.class01210
 *  minecraft.class01607
 *  minecraft.class03027
 *  minecraft.class03032
 *  minecraft.class03036
 *  minecraft.class03292
 *  minecraft.class03556
 *  minecraft.class03875
 *  minecraft.class04042
 *  minecraft.class04330
 *  minecraft.class04995
 *  minecraft.class05041
 *  minecraft.class05056
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class07321
 *  minecraft.class07361
 *  minecraft.class07529
 *  minecraft.class07830
 *  minecraft.class08050
 *  org.apache.commons.lang3.mutable.MutableDouble
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import minecraft.class00753;
import minecraft.class00758;
import minecraft.class00780;
import minecraft.class01146;
import minecraft.class01210;
import minecraft.class01607;
import minecraft.class03002;
import minecraft.class03015;
import minecraft.class03023;
import minecraft.class03027;
import minecraft.class03032;
import minecraft.class03036;
import minecraft.class03292;
import minecraft.class03556;
import minecraft.class03875;
import minecraft.class04042;
import minecraft.class04330;
import minecraft.class04995;
import minecraft.class05041;
import minecraft.class05056;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class07321;
import minecraft.class07361;
import minecraft.class07529;
import minecraft.class07830;
import minecraft.class08050;
import org.apache.commons.lang3.mutable.MutableDouble;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public class class03001 {
    private static final class03001 N = new class03015(new Long2ObjectOpenHashMap(), new Long2ObjectOpenHashMap());
    private static final class05041 y = class05041.y((class06069)new class04042(42L), (class05056)class03023.N);
    private static final int L = class01146.u((int)7) - 1;
    private static final int u = class01146.i((int)(L + 3));
    private static final int i = 2;
    private static final int R = class01146.i((int)5);
    private static final double M = 8.0;
    private final Long2ObjectOpenHashMap<class03032> B;
    private final Long2ObjectOpenHashMap<class03032> Z;

    class03001(Long2ObjectOpenHashMap<class03032> long2ObjectOpenHashMap, Long2ObjectOpenHashMap<class03032> long2ObjectOpenHashMap2) {
        this.B = long2ObjectOpenHashMap;
        this.Z = long2ObjectOpenHashMap2;
    }

    public boolean y() {
        return this.B.isEmpty() && this.Z.isEmpty();
    }

    private static double N(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = Math.abs(d) - d4;
        double d8 = Math.abs(d2) - d5;
        double d9 = Math.abs(d3) - d6;
        return class04995.M((double)Math.max(0.0, d7), (double)Math.max(0.0, d8), (double)Math.max(0.0, d9));
    }

    public static class03001 N() {
        return N;
    }

    public double N(class03875 class038752, double d) {
        int n;
        int n2;
        int n3 = class01146.N((int)class038752.y());
        double d2 = this.N(n3, n2 = class038752.L() / 8, n = class01146.N((int)class038752.u()), class03032::y);
        if (d2 != Double.MAX_VALUE) {
            return d2;
        }
        MutableDouble mutableDouble = new MutableDouble(0.0);
        MutableDouble mutableDouble2 = new MutableDouble(0.0);
        MutableDouble mutableDouble3 = new MutableDouble(Double.POSITIVE_INFINITY);
        this.Z.forEach((l, class030322) -> class030322.N(class01146.u((int)class07321.N((long)l)), class01146.u((int)class07321.y((long)l)), n2 - 1, n2 + 1, (n4, n5, n6, d) -> {
            double d2 = class04995.M((double)(n3 - n4), (double)((n2 - n5) * 2), (double)(n - n6));
            if (d2 > 2.0) {
                return;
            }
            if (d2 < mutableDouble3.doubleValue()) {
                mutableDouble3.setValue(d2);
            }
            double d3 = 1.0 / (d2 * d2 * d2 * d2);
            mutableDouble2.add(d * d3);
            mutableDouble.add(d3);
        }));
        if (mutableDouble3.doubleValue() == Double.POSITIVE_INFINITY) {
            return d;
        }
        double d3 = mutableDouble2.doubleValue() / mutableDouble.doubleValue();
        return class04995.u((double)class04995.N((double)(mutableDouble3.doubleValue() / 3.0), (double)0.0, (double)1.0), (double)d3, (double)d);
    }

    private double N(int n, int n2, int n3, class03036 class030362) {
        int n4 = class01146.i((int)n);
        int n5 = class01146.i((int)n3);
        boolean bl = (n & 3) == 0;
        boolean bl2 = (n3 & 3) == 0;
        double d = this.N(class030362, n4, n5, n, n2, n3);
        if (d == Double.MAX_VALUE) {
            if (bl && bl2) {
                d = this.N(class030362, n4 - 1, n5 - 1, n, n2, n3);
            }
            if (d == Double.MAX_VALUE) {
                if (bl) {
                    d = this.N(class030362, n4 - 1, n5, n, n2, n3);
                }
                if (d == Double.MAX_VALUE && bl2) {
                    d = this.N(class030362, n4, n5 - 1, n, n2, n3);
                }
            }
        }
        return d;
    }

    private double N(class03036 class030362, int n, int n2, int n3, int n4, int n5) {
        class03032 class030322 = (class03032)this.B.get(class07321.u((int)n, (int)n2));
        if (class030322 != null) {
            return class030362.get(class030322, n3 - class01146.u((int)n), n4, n5 - class01146.u((int)n2));
        }
        return Double.MAX_VALUE;
    }

    public class04330 N(class04330 class043302) {
        return (n, n2, n3, class032222) -> {
            class03556<class00780> class035562 = this.N(n, n2, n3);
            if (class035562 == null) {
                return class043302.method_38109(n, n2, n3, class032222);
            }
            return class035562;
        };
    }

    private static double N(double d) {
        double d2 = 1.0;
        double d3 = d + 0.5;
        double d4 = class04995.L((double)d3, (double)8.0);
        return 1.0 * (32.0 * (d3 - 128.0) - 3.0 * (d3 - 120.0) * d4 + 3.0 * d4 * d4) / (128.0 * (32.0 - 3.0 * d4));
    }

    public class03027 N(int n, int n2) {
        int n3;
        int n4 = class01146.N((int)n);
        double d = this.N(n4, 0, n3 = class01146.N((int)n2), class03032::N);
        if (d != Double.MAX_VALUE) {
            return new class03027(0.0, class03001.N(d));
        }
        MutableDouble mutableDouble = new MutableDouble(0.0);
        MutableDouble mutableDouble2 = new MutableDouble(0.0);
        MutableDouble mutableDouble3 = new MutableDouble(Double.POSITIVE_INFINITY);
        this.B.forEach((l, class030322) -> class030322.N(class01146.u((int)class07321.N((long)l)), class01146.u((int)class07321.y((long)l)), (n3, n4, d) -> {
            double d2 = class04995.M((float)(n4 - n3), (float)(n3 - n4));
            if (d2 > (double)L) {
                return;
            }
            if (d2 < mutableDouble3.doubleValue()) {
                mutableDouble3.setValue(d2);
            }
            double d3 = 1.0 / (d2 * d2 * d2 * d2);
            mutableDouble2.add(d * d3);
            mutableDouble.add(d3);
        }));
        if (mutableDouble3.doubleValue() == Double.POSITIVE_INFINITY) {
            return new class03027(1.0, 0.0);
        }
        double d2 = mutableDouble2.doubleValue() / mutableDouble.doubleValue();
        double d3 = class04995.N((double)(mutableDouble3.doubleValue() / (double)(L + 1)), (double)0.0, (double)1.0);
        d3 = 3.0 * d3 * d3 - 2.0 * d3 * d3 * d3;
        return new class03027(d3, class03001.N(d2));
    }

    public static class03001 N(@Nullable class01607 class016072) {
        if (class07529.NI || class016072 == null) {
            return N;
        }
        class07321 class073212 = class016072.L();
        if (!class016072.N(class073212, u)) {
            return N;
        }
        Long2ObjectOpenHashMap long2ObjectOpenHashMap = new Long2ObjectOpenHashMap();
        Long2ObjectOpenHashMap long2ObjectOpenHashMap2 = new Long2ObjectOpenHashMap();
        int n = class04995.Z((int)(u + 1));
        for (int i = -u; i <= u; ++i) {
            for (int j = -u; j <= u; ++j) {
                int n2;
                int n3;
                class03032 class030322;
                if (i * i + j * j > n || (class030322 = class03032.N((class01607)class016072, (int)(n3 = class073212.B + i), (int)(n2 = class073212.Z + j))) == null) continue;
                long2ObjectOpenHashMap.put(class07321.u((int)n3, (int)n2), (Object)class030322);
                if (i < -R || i > R || j < -R || j > R) continue;
                long2ObjectOpenHashMap2.put(class07321.u((int)n3, (int)n2), (Object)class030322);
            }
        }
        if (long2ObjectOpenHashMap.isEmpty() && long2ObjectOpenHashMap2.isEmpty()) {
            return N;
        }
        return new class03001((Long2ObjectOpenHashMap<class03032>)long2ObjectOpenHashMap, (Long2ObjectOpenHashMap<class03032>)long2ObjectOpenHashMap2);
    }

    private static class03002 N(@Nullable class00758 class007582, class03032 class030322) {
        double d = 0.0;
        double d2 = 0.0;
        if (class007582 != null) {
            for (class07211 class072112 : class007582.N()) {
                d += (double)(class072112.P() * 16);
                d2 += (double)(class072112.T() * 16);
            }
        }
        double d3 = d;
        double d4 = d2;
        double d8 = (double)class030322.y().method_31605() / 2.0;
        double d9 = (double)class030322.y().method_31607() + d8;
        return (d5, d6, d7) -> class03001.N(d5 - 8.0 - d3, d6 - d9, d7 - 8.0 - d4, 8.0, d8, 8.0);
    }

    public static class03002 N(@Nullable class03032 class030323, Map<class00758, class03032> map) {
        ArrayList arrayList = Lists.newArrayList();
        if (class030323 != null) {
            arrayList.add(class03001.N(null, class030323));
        }
        map.forEach((class007582, class030322) -> arrayList.add(class03001.N(class007582, class030322)));
        return (d, d2, d3) -> {
            double d4 = Double.POSITIVE_INFINITY;
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                double d5 = ((class03002)iterator.next()).getDistance(d, d2, d3);
                if (!(d5 < d4)) continue;
                d4 = d5;
            }
            return d4;
        };
    }

    public static void N_37(class05974 class059742, class07361 class073612) {
        if (class07529.NI) {
            return;
        }
        class07321 class073212 = class073612.R();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (class00758 class007582 : class00758.values()) {
            int n4;
            int n5 = class073212.B + class007582.y();
            class03032 class030322 = class059742.method_8392(n5, n4 = class073212.Z + class007582.L()).v();
            if (class030322 == null) continue;
            builder.put((Object)class007582, (Object)class030322);
        }
        ImmutableMap immutableMap = builder.build();
        if (!class073612.j() && immutableMap.isEmpty()) {
            return;
        }
        class03002 class030022 = class03001.N(class073612.v(), (Map<class00758, class03032>)immutableMap);
        class03292 class032922 = (n, n2, n3) -> {
            double d;
            double d2;
            double d3 = (double)n + 0.5 + y.N((double)n, (double)n2, (double)n3) * 4.0;
            return class030022.getDistance(d3, d2 = (double)n2 + 0.5 + y.N((double)n2, (double)n3, (double)n) * 4.0, d = (double)n3 + 0.5 + y.N((double)n3, (double)n, (double)n2) * 4.0) < 4.0;
        };
        class073612.g().N(class032922);
    }

    private static void N(class08050 class080502, class07209 class072092) {
        if (class080502.method_8320(class072092).N(class01210.H)) {
            class080502.u(class072092);
        }
        if (!class080502.method_8316(class072092).W()) {
            class080502.u(class072092);
        }
    }

    public static void N(class01607 class016072, class08050 class080502) {
        if (class07529.NI) {
            return;
        }
        class07321 class073212 = class080502.R();
        boolean bl = class080502.j();
        class07218 class072182 = new class07218();
        class07209 class072092 = new class07209(class073212.i(), 0, class073212.R());
        class03032 class030322 = class080502.v();
        if (class030322 == null) {
            return;
        }
        int n = class030322.y().method_31607();
        int n2 = class030322.y().method_31600();
        if (bl) {
            for (int i = 0; i < 16; ++i) {
                for (int j = 0; j < 16; ++j) {
                    class03001.N(class080502, (class07209)class072182.N((class00753)class072092, i, n - 1, j));
                    class03001.N(class080502, (class07209)class072182.N((class00753)class072092, i, n, j));
                    class03001.N(class080502, (class07209)class072182.N((class00753)class072092, i, n2, j));
                    class03001.N(class080502, (class07209)class072182.N((class00753)class072092, i, n2 + 1, j));
                }
            }
        }
        for (class07211 class072112 : class07221.field_11062) {
            if (class016072.method_8392(class073212.B + class072112.P(), class073212.Z + class072112.T()).j() == bl) continue;
            int n3 = class072112 == class07211.field_11034 ? 15 : 0;
            int n4 = class072112 == class07211.field_11039 ? 0 : 15;
            int n5 = class072112 == class07211.field_11035 ? 15 : 0;
            int n6 = class072112 == class07211.field_11043 ? 0 : 15;
            for (int i = n3; i <= n4; ++i) {
                for (int j = n5; j <= n6; ++j) {
                    int n7 = Math.min(n2, class080502.N(class07830.field_13197, i, j)) + 1;
                    for (int k = n; k < n7; ++k) {
                        class03001.N(class080502, (class07209)class072182.N((class00753)class072092, i, k, j));
                    }
                }
            }
        }
    }

    private @Nullable class03556<class00780> N(int n, int n2, int n3) {
        MutableDouble mutableDouble = new MutableDouble(Double.POSITIVE_INFINITY);
        MutableObject mutableObject = new MutableObject();
        this.B.forEach((l, class030322) -> class030322.N(class01146.u((int)class07321.N((long)l)), n2, class01146.u((int)class07321.y((long)l)), (n3, n4, class035562) -> {
            double d = class04995.M((float)(n - n3), (float)(n3 - n4));
            if (d > (double)L) {
                return;
            }
            if (d < mutableDouble.doubleValue()) {
                mutableObject.setValue((Object)class035562);
                mutableDouble.setValue(d);
            }
        }));
        if (mutableDouble.doubleValue() == Double.POSITIVE_INFINITY) {
            return null;
        }
        double d = y.N((double)n, 0.0, (double)n3) * 12.0;
        if (class04995.N((double)((mutableDouble.doubleValue() + d) / (double)(L + 1)), (double)0.0, (double)1.0) > 0.5) {
            return null;
        }
        return (class03556)mutableObject.get();
    }
}

