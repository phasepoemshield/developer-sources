/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09359
 *  com.google.common.collect.Maps
 *  com.google.common.math.DoubleMath
 *  com.google.common.math.IntMath
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  it.unimi.dsi.fastutil.doubles.DoubleArrayList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  java.lang.MatchException
 *  minecraft.class00383
 *  minecraft.class00630
 *  minecraft.class00656
 *  minecraft.class00734
 *  minecraft.class01372
 *  minecraft.class06657
 *  minecraft.class06857
 *  minecraft.class06864
 *  minecraft.class06889
 *  minecraft.class06890
 *  minecraft.class06998
 *  minecraft.class07003
 *  minecraft.class07017
 *  minecraft.class07185
 *  minecraft.class07211
 *  minecraft.class07212
 *  minecraft.class07214
 *  minecraft.class07260
 *  minecraft.class07536
 *  minecraft.class07708
 *  minecraft.class07739
 *  net.caffeinemc.mods.lithium.common.shapes.VoxelShapeAlignedCuboid
 *  net.caffeinemc.mods.lithium.common.shapes.VoxelShapeEmpty
 *  net.caffeinemc.mods.lithium.common.shapes.VoxelShapeMatchesAnywhere
 *  net.caffeinemc.mods.lithium.common.shapes.VoxelShapeSimpleCube
 *  net.caffeinemc.mods.lithium.common.shapes.pairs.LithiumDoublePairList
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09359;
import com.google.common.collect.Maps;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import minecraft.class00383;
import minecraft.class00494;
import minecraft.class00630;
import minecraft.class00656;
import minecraft.class00734;
import minecraft.class01372;
import minecraft.class06657;
import minecraft.class06857;
import minecraft.class06864;
import minecraft.class06889;
import minecraft.class06890;
import minecraft.class06998;
import minecraft.class07003;
import minecraft.class07017;
import minecraft.class07185;
import minecraft.class07211;
import minecraft.class07212;
import minecraft.class07214;
import minecraft.class07260;
import minecraft.class07536;
import minecraft.class07708;
import minecraft.class07739;
import net.caffeinemc.mods.lithium.common.shapes.VoxelShapeAlignedCuboid;
import net.caffeinemc.mods.lithium.common.shapes.VoxelShapeEmpty;
import net.caffeinemc.mods.lithium.common.shapes.VoxelShapeMatchesAnywhere;
import net.caffeinemc.mods.lithium.common.shapes.VoxelShapeSimpleCube;
import net.caffeinemc.mods.lithium.common.shapes.pairs.LithiumDoublePairList;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public final class class00389 {
    public static final double N = 1.0E-7;
    public static final double y = 1.0E-6;
    private static class00494 u = (class00494)class07536.N(() -> {
        class06890 class068902 = new class06890(1, 1, 1);
        class068902.method_1049(0, 0, 0);
        return new class07017((class07739)class068902);
    });
    private static final class06889 i = new class06889(0.5, 0.5, 0.5);
    public static class00494 L = class00389.N(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
    private static class00494 R = new class06864((class07739)new class06890(0, 0, 0), (DoubleList)new DoubleArrayList(new double[]{0.0}), (DoubleList)new DoubleArrayList(new double[]{0.0}), (DoubleList)new DoubleArrayList(new double[]{0.0}));
    private static final class07739 M = new class06890(1, 1, 1);

    public static Map<class07211, class00494> L(class00494 class004942, class06889 class068892) {
        return class00389.L(class004942, class01372.field_23292, class068892);
    }

    public static Map<class07211, class00494> L(class00494 class004942) {
        return class00389.y(class004942, class01372.field_23292, i);
    }

    public static boolean L(class00494 class004942, class00494 class004943) {
        return !class00389.L(class004942, class004943, class07003.M);
    }

    public static boolean L(class00494 class004942, class00494 class004943, class07003 class070032) {
        if (class070032.apply(false, false)) {
            throw (IllegalArgumentException)class07536.y((Throwable)new IllegalArgumentException());
        }
        boolean bl = class004942.method_1110();
        boolean bl2 = class004943.method_1110();
        if (bl || bl2) {
            return class070032.apply(!bl, !bl2);
        }
        if (class004942 == class004943) {
            return class070032.apply(true, true);
        }
        boolean bl3 = class070032.apply(true, false);
        boolean bl4 = class070032.apply(false, true);
        for (class07185 class071852 : class07214.field_10961) {
            if (class004942.method_1105(class071852) < class004943.method_1091(class071852) - 1.0E-7) {
                return bl3 || bl4;
            }
            if (!(class004943.method_1105(class071852) < class004942.method_1091(class071852) - 1.0E-7)) continue;
            return bl3 || bl4;
        }
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class00389.N(class004942, class004943, class070032, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        class00630 class006302 = class00389.N(1, class004942.method_1109(class07185.field_11048), class004943.method_1109(class07185.field_11048), bl3, bl4);
        class00630 class006303 = class00389.N(class006302.size() - 1, class004942.method_1109(class07185.field_11052), class004943.method_1109(class07185.field_11052), bl3, bl4);
        class00630 class006304 = class00389.N((class006302.size() - 1) * (class006303.size() - 1), class004942.method_1109(class07185.field_11051), class004943.method_1109(class07185.field_11051), bl3, bl4);
        return class00389.N(class006302, class006303, class006304, class004942.field_1401, class004943.field_1401, class070032);
    }

    private static double L(class00734 class007342, class00734 class007343, double d) {
        if (class007342.u <= class007343.N || class007342.N >= class007343.u || class007342.i <= class007343.y || class007342.y >= class007343.i) {
            return d;
        }
        if (d > 0.0 && class007342.R <= class007343.L) {
            double d2 = class007343.L - class007342.R;
            if (d2 < d) {
                d = d2;
            }
        } else if (d < 0.0 && class007342.L >= class007343.R) {
            double d3;
            double d4 = class007343.R - class007342.L;
            if (d3 > d) {
                d = d4;
            }
        }
        return d;
    }

    public static Map<class06657, Map<class07211, class00494>> L(class00494 class004942, class01372 class013722) {
        return Map.of(class06657.field_12471, class00389.y(class004942, class013722), class06657.field_12475, class00389.y(class004942, class01372.field_64506.N(class013722)), class06657.field_12473, class00389.y(class004942, class01372.field_64510.N(class01372.field_64508).N(class013722)));
    }

    public static Map<class07211, class00494> L(class00494 class004942, class01372 class013722, class06889 class068892) {
        return Maps.newEnumMap(Map.of(class07211.field_11043, class00389.N(class004942, class013722), class07211.field_11034, class00389.N(class004942, class01372.field_64511.N(class013722), class068892), class07211.field_11035, class00389.N(class004942, class01372.field_64510.N(class013722), class068892), class07211.field_11039, class00389.N(class004942, class01372.field_64509.N(class013722), class068892), class07211.field_11036, class00389.N(class004942, class01372.field_64506.N(class013722), class068892), class07211.field_11033, class00389.N(class004942, class01372.field_64508.N(class013722), class068892)));
    }

    public static Map<class06657, Map<class07211, class00494>> i(class00494 class004942) {
        return class00389.L(class004942, class01372.field_23292);
    }

    public static Map<class07211, class00494> u(class00494 class004942) {
        return class00389.L(class004942, class01372.field_23292, i);
    }

    public static Map<class07185, class00494> y(class00494 class004942) {
        return class00389.y(class004942, i);
    }

    public static Map<class07211, class00494> y(class00494 class004942, class01372 class013722) {
        return class00389.y(class004942, class013722, i);
    }

    public static class00494 y(double d, double d2, double d3, double d4, double d5, double d6) {
        int n;
        int n2;
        if (d4 - d < 1.0E-7 || d5 - d2 < 1.0E-7 || d6 - d3 < 1.0E-7) {
            return R;
        }
        int n3 = class00389.N(d, d4);
        if (n3 < 0 || (n2 = class00389.N(d2, d5)) < 0 || (n = class00389.N(d3, d6)) < 0) {
            return new VoxelShapeSimpleCube(M, d, d2, d3, d4, d5, d6);
        }
        if (n3 == 0 && n2 == 0 && n == 0) {
            return u;
        }
        return new VoxelShapeAlignedCuboid((double)Math.round(d * 8.0) / 8.0, (double)Math.round(d2 * 8.0) / 8.0, (double)Math.round(d3 * 8.0) / 8.0, (double)Math.round(d4 * 8.0) / 8.0, (double)Math.round(d5 * 8.0) / 8.0, (double)Math.round(d6 * 8.0) / 8.0, n3, n2, n);
    }

    public static Map<class07185, class00494> y(class00494 class004942, class06889 class068892) {
        return Maps.newEnumMap(Map.of(class07185.field_11051, class004942, class07185.field_11048, class00389.N(class004942, class01372.field_64511, class068892), class07185.field_11052, class00389.N(class004942, class01372.field_64508, class068892)));
    }

    public static class00494 y() {
        return u;
    }

    public static Map<class07211, class00494> y(class00494 class004942, class01372 class013722, class06889 class068892) {
        return Maps.newEnumMap(Map.of(class07211.field_11043, class00389.N(class004942, class013722), class07211.field_11034, class00389.N(class004942, class01372.field_64511.N(class013722), class068892), class07211.field_11035, class00389.N(class004942, class01372.field_64510.N(class013722), class068892), class07211.field_11039, class00389.N(class004942, class01372.field_64509.N(class013722), class068892)));
    }

    public static boolean y(class00494 class004942, class00494 class004943, class07211 class072112) {
        class00494 class004944;
        if (class004942 == class00389.y() || class004943 == class00389.y()) {
            return true;
        }
        class07185 class071852 = class072112.z();
        class07212 class072122 = class072112.i();
        class00494 class004945 = class072122 == class07212.field_11056 ? class004942 : class004943;
        class00494 class004946 = class004944 = class072122 == class07212.field_11056 ? class004943 : class004942;
        if (!DoubleMath.fuzzyEquals((double)class004945.method_1105(class071852), (double)1.0, (double)1.0E-7)) {
            class004945 = class00389.N();
        }
        if (!DoubleMath.fuzzyEquals((double)class004944.method_1091(class071852), (double)0.0, (double)1.0E-7)) {
            class004944 = class00389.N();
        }
        return !class00389.L(class00389.y(), class00389.y((class00494)new class07260(class004945, class071852, class004945.field_1401.method_1051(class071852) - 1), (class00494)new class07260(class004944, class071852, 0), class07003.P), class07003.i);
    }

    public static boolean y(class00494 class004942, class00494 class004943) {
        if (class004942 == class00389.y() || class004943 == class00389.y()) {
            return true;
        }
        if (class004942.method_1110() && class004943.method_1110()) {
            return false;
        }
        return !class00389.L(class00389.y(), class00389.y(class004942, class004943, class07003.P), class07003.i);
    }

    public static class00494 y(class00494 class004942, class00494 class004943, class07003 class070032) {
        if (class070032.apply(false, false)) {
            throw (IllegalArgumentException)class07536.y((Throwable)new IllegalArgumentException());
        }
        if (class004942 == class004943) {
            return class070032.apply(true, true) ? class004942 : class00389.N();
        }
        boolean bl = class070032.apply(true, false);
        boolean bl2 = class070032.apply(false, true);
        if (class004942.method_1110()) {
            return bl2 ? class004943 : class00389.N();
        }
        if (class004943.method_1110()) {
            return bl ? class004942 : class00389.N();
        }
        class00630 class006302 = class00389.N(1, class004942.method_1109(class07185.field_11048), class004943.method_1109(class07185.field_11048), bl, bl2);
        class00630 class006303 = class00389.N(class006302.size() - 1, class004942.method_1109(class07185.field_11052), class004943.method_1109(class07185.field_11052), bl, bl2);
        class00630 class006304 = class00389.N((class006302.size() - 1) * (class006303.size() - 1), class004942.method_1109(class07185.field_11051), class004943.method_1109(class07185.field_11051), bl, bl2);
        class06890 class068902 = class06890.N((class07739)class004942.field_1401, (class07739)class004943.field_1401, (class00630)class006302, (class00630)class006303, (class00630)class006304, (class07003)class070032);
        if (class006302 instanceof class06998 && class006303 instanceof class06998 && class006304 instanceof class06998) {
            return new class07017((class07739)class068902);
        }
        return new class06864((class07739)class068902, class006302.method_1066(), class006303.method_1066(), class006304.method_1066());
    }

    private static double y(class00734 class007342, class00734 class007343, double d) {
        if (class007342.u <= class007343.N || class007342.N >= class007343.u || class007342.R <= class007343.L || class007342.L >= class007343.R) {
            return d;
        }
        if (d > 0.0 && class007342.i <= class007343.y) {
            double d2 = class007343.y - class007342.i;
            if (d2 < d) {
                d = d2;
            }
        } else if (d < 0.0 && class007342.y >= class007343.i) {
            double d3;
            double d4 = class007343.i - class007342.y;
            if (d3 > d) {
                d = d4;
            }
        }
        return d;
    }

    private static double N(class00734 class007342, class00734 class007343, double d) {
        if (class007342.i <= class007343.y || class007342.y >= class007343.i || class007342.R <= class007343.L || class007342.L >= class007343.R) {
            return d;
        }
        if (d > 0.0 && class007342.u <= class007343.N) {
            double d2 = class007343.N - class007342.u;
            if (d2 < d) {
                d = d2;
            }
        } else if (d < 0.0 && class007342.N >= class007343.u) {
            double d3;
            double d4 = class007343.u - class007342.N;
            if (d3 > d) {
                d = d4;
            }
        }
        return d;
    }

    public static class00494 N(double d, double d2, double d3, double d4, double d5, double d6) {
        if (d > d4 || d2 > d5 || d3 > d6) {
            throw new IllegalArgumentException("The min values need to be smaller or equals to the max values");
        }
        return class00389.y(d, d2, d3, d4, d5, d6);
    }

    public static Map<class07185, class00494> N(class00494 class004942, class06889 class068892) {
        return Maps.newEnumMap(Map.of(class07185.field_11051, class004942, class07185.field_11048, class00389.N(class004942, class01372.field_64511, class068892)));
    }

    private static void N(int n, DoubleList doubleList, DoubleList doubleList2, boolean bl, boolean bl2, CallbackInfoReturnable callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue((Object)new LithiumDoublePairList(doubleList, doubleList2, bl, bl2));
    }

    private static void N(class00494 class004942, class00494 class004943, class07003 class070032, CallbackInfoReturnable callbackInfoReturnable) {
        VoxelShapeMatchesAnywhere.cuboidMatchesAnywhere((class00494)class004942, (class00494)class004943, (class07003)class070032, (CallbackInfoReturnable)callbackInfoReturnable);
    }

    public static class00494 N() {
        return R;
    }

    private static void N(class07185 class071852, class00734 class007342, Iterable iterable, double d, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            Iterator iterator = iterable.iterator();
            while (iterator.hasNext()) {
                for (class00734 class007343 : ((class00494)iterator.next()).method_1090()) {
                    d = switch (class09359.N[class071852.ordinal()]) {
                        default -> throw new MatchException(null, null);
                        case 1 -> class00389.N(class007342, class007343, d);
                        case 2 -> class00389.y(class007342, class007343, d);
                        case 3 -> class00389.L(class007342, class007343, d);
                    };
                }
            }
            callbackInfoReturnable.setReturnValue((Object)d);
        }
    }

    public static boolean N(class00494 class004942, class00494 class004943, class07211 class072112) {
        if (class004942 == class00389.y() && class004943 == class00389.y()) {
            return true;
        }
        if (class004943.method_1110()) {
            return false;
        }
        class07185 class071852 = class072112.z();
        class07212 class072122 = class072112.i();
        class00494 class004944 = class072122 == class07212.field_11056 ? class004942 : class004943;
        class00494 class004945 = class072122 == class07212.field_11056 ? class004943 : class004942;
        class07003 class070032 = class072122 == class07212.field_11056 ? class07003.i : class07003.L;
        return DoubleMath.fuzzyEquals((double)class004944.method_1105(class071852), (double)1.0, (double)1.0E-7) && DoubleMath.fuzzyEquals((double)class004945.method_1091(class071852), (double)0.0, (double)1.0E-7) && !class00389.L((class00494)new class07260(class004944, class071852, class004944.field_1401.method_1051(class071852) - 1), (class00494)new class07260(class004945, class071852, 0), class070032);
    }

    protected static class00630 N(int n, DoubleList doubleList, DoubleList doubleList2, boolean bl, boolean bl2) {
        long l;
        int n2 = doubleList.size() - 1;
        int n3 = doubleList2.size() - 1;
        if (doubleList instanceof class06857 && doubleList2 instanceof class06857 && (long)n * (l = class00389.N(n2, n3)) <= 256L) {
            return new class06998(n2, n3);
        }
        if (doubleList.getDouble(n2) < doubleList2.getDouble(0) - 1.0E-7) {
            return new class00383(doubleList, doubleList2, false);
        }
        if (doubleList2.getDouble(n3) < doubleList.getDouble(0) - 1.0E-7) {
            return new class00383(doubleList2, doubleList, true);
        }
        if (n2 == n3 && Objects.equals(doubleList, doubleList2)) {
            return new class07708(doubleList);
        }
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class00389.N(n, doubleList, doubleList2, bl, bl2, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00630)callbackInfoReturnable.getReturnValue();
        }
        return new class00656(doubleList, doubleList2, bl, bl2);
    }

    public static class00494 N(class00494 class004942, class01372 class013722) {
        return class00389.N(class004942, class013722, i);
    }

    public static class00494 N(class00494 class004942, class01372 class013722, class06889 class068892) {
        if (class013722 == class01372.field_23292) {
            return class004942;
        }
        class07739 class077392 = class004942.field_1401.method_66493(class013722);
        if (class004942 instanceof class07017 && i.equals((Object)class068892)) {
            return new class07017(class077392);
        }
        class07185 class071852 = class013722.L().N(class07185.field_11048);
        class07185 class071853 = class013722.L().N(class07185.field_11052);
        class07185 class071854 = class013722.L().N(class07185.field_11051);
        DoubleList doubleList = class004942.method_1109(class071852);
        DoubleList doubleList2 = class004942.method_1109(class071853);
        DoubleList doubleList3 = class004942.method_1109(class071854);
        boolean bl = class013722.N(class07185.field_11048);
        boolean bl2 = class013722.N(class07185.field_11052);
        boolean bl3 = class013722.N(class07185.field_11051);
        return new class06864(class077392, class00389.N(doubleList, bl, class068892.N(class071852), class068892.M), class00389.N(doubleList2, bl2, class068892.N(class071853), class068892.B), class00389.N(doubleList3, bl3, class068892.N(class071854), class068892.Z));
    }

    public static double N(class07185 class071852, class00734 class007342, Iterable<class00494> iterable, double d) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class00389.N(class071852, class007342, iterable, d, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueD();
        }
        for (class00494 class004942 : iterable) {
            if (Math.abs(d) < 1.0E-7) {
                return 0.0;
            }
            d = class004942.method_1108(class071852, class007342, d);
        }
        return d;
    }

    private static boolean N(class00630 class006302, class00630 class006303, class00630 class006304, class07739 class077392, class07739 class077393, class07003 class070032) {
        return !class006302.method_1065((n, n2, n5) -> class006303.method_1065((n3, n4, n8) -> class006304.method_1065((n5, n6, n7) -> !class070032.apply(class077392.method_1044(n, n3, n5), class077393.method_1044(n2, n4, n6)))));
    }

    public static class00494 N(class00494 class004942, class00494 ... class00494Array) {
        return Arrays.stream(class00494Array).reduce(class004942, class00389::N);
    }

    protected static long N(int n, int n2) {
        return (long)n * (long)(n2 / IntMath.gcd((int)n, (int)n2));
    }

    public static int N(double d, double d2) {
        if (d < -1.0E-7 || d2 > 1.0000001) {
            return -1;
        }
        for (int i = 0; i <= 3; ++i) {
            boolean bl;
            int n = 1 << i;
            double d3 = d * (double)n;
            double d4 = d2 * (double)n;
            boolean bl2 = Math.abs(d3 - (double)Math.round(d3)) < 1.0E-7 * (double)n;
            boolean bl3 = bl = Math.abs(d4 - (double)Math.round(d4)) < 1.0E-7 * (double)n;
            if (!bl2 || !bl) continue;
            return i;
        }
        return -1;
    }

    public static class00494 N(class00494 class004942, class00494 class004943, class07003 class070032) {
        return class00389.y(class004942, class004943, class070032).method_1097();
    }

    public static class00494 N(class00734 class007342) {
        return class00389.y(class007342.N, class007342.y, class007342.L, class007342.u, class007342.i, class007342.R);
    }

    public static Map<class07185, class00494> N(class00494 class004942) {
        return class00389.N(class004942, i);
    }

    public static class00494 N(class00494 class004942, class00494 class004943) {
        return class00389.N(class004942, class004943, class07003.P);
    }

    static DoubleList N(DoubleList doubleList, boolean bl, double d, double d2) {
        if (!bl && d == d2) {
            return doubleList;
        }
        int n = doubleList.size();
        DoubleArrayList doubleArrayList = new DoubleArrayList(n);
        if (bl) {
            for (int i = n - 1; i >= 0; --i) {
                doubleArrayList.add(-(doubleList.getDouble(i) - d) + d2);
            }
        } else {
            for (int i = 0; i >= 0 && i < n; ++i) {
                doubleArrayList.add(doubleList.getDouble(i) - d + d2);
            }
        }
        return doubleArrayList;
    }

    static {
        M.method_1049(0, 0, 0);
        L = new VoxelShapeSimpleCube(M, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        u = new VoxelShapeSimpleCube(M, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        R = new VoxelShapeEmpty((class07739)new class06890(0, 0, 0));
    }
}

