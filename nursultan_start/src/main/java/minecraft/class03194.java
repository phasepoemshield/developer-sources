/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00807
 *  minecraft.class00869
 *  minecraft.class01207
 *  minecraft.class01210
 *  minecraft.class01455
 *  minecraft.class01476
 *  minecraft.class01805
 *  minecraft.class03647
 *  minecraft.class04887
 *  minecraft.class05163
 *  minecraft.class05894
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class06665
 *  minecraft.class06890
 *  minecraft.class07131
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07739
 *  minecraft.class08092
 */
package minecraft;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.BiConsumer;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00807;
import minecraft.class00869;
import minecraft.class01207;
import minecraft.class01210;
import minecraft.class01455;
import minecraft.class01476;
import minecraft.class01805;
import minecraft.class03647;
import minecraft.class04887;
import minecraft.class05163;
import minecraft.class05894;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class06665;
import minecraft.class06890;
import minecraft.class07131;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07739;
import minecraft.class08092;

public class class03194
extends class06391<class01476> {
    private static final int NE = 19;

    public static boolean L(class04887 class048872, class07209 class072092) {
        return class048872.method_16358(class072092, class005002 -> class005002.P() || class005002.N(class01210.Lg));
    }

    public class03194(Codec<class01476> codec) {
        super(codec);
    }

    public static boolean y(class04887 class048872, class07209 class072092) {
        return class048872.method_16358(class072092, class005002 -> class005002.P() || class005002.N(class01210.H));
    }

    private static void y(class00807 class008072, class07209 class072092, class00500 class005002) {
        class008072.method_8652(class072092, class005002, 19);
    }

    public static List<class07209> N(class05894 class058942) {
        ArrayList arrayList = Lists.newArrayList();
        ObjectArrayList var2 = class058942.i();
        ObjectArrayList var3 = class058942.L();
        if (var2.isEmpty()) {
            arrayList.addAll(var3);
        } else if (!var3.isEmpty() && ((class07209)var2.get(0)).method_10264() == ((class07209)var3.get(0)).method_10264()) {
            arrayList.addAll(var3);
            arrayList.addAll(var2);
        } else {
            arrayList.addAll(var2);
        }
        return arrayList;
    }

    public static boolean N(class04887 class048872, class07209 class072092) {
        return class048872.method_16358(class072092, class005002 -> class005002.N(class00869.Rc));
    }

    public final boolean N(class06058<class01476> class060582) {
        class05974 class059742 = class060582.y();
        class06069 class060692 = class060582.u();
        class07209 class072093 = class060582.i();
        class01476 class014762 = (class01476)class060582.R();
        HashSet hashSet = Sets.newHashSet();
        HashSet hashSet2 = Sets.newHashSet();
        HashSet hashSet3 = Sets.newHashSet();
        HashSet hashSet4 = Sets.newHashSet();
        BiConsumer<class07209, class00500> biConsumer = (class072092, class005002) -> {
            hashSet.add(class072092.method_10062());
            class059742.method_8652(class072092, class005002, 19);
        };
        BiConsumer<class07209, class00500> biConsumer2 = (class072092, class005002) -> {
            hashSet2.add(class072092.method_10062());
            class059742.method_8652(class072092, class005002, 19);
        };
        class01805 class018052 = new class01805(this, (Set)hashSet3, class059742);
        BiConsumer<class07209, class00500> biConsumer3 = (class072092, class005002) -> {
            hashSet4.add(class072092.method_10062());
            class059742.method_8652(class072092, class005002, 19);
        };
        if (!this.N(class059742, class060692, class072093, biConsumer, biConsumer2, (class01455)class018052, class014762) || hashSet2.isEmpty() && hashSet3.isEmpty()) {
            return false;
        }
        if (!class014762.z.isEmpty()) {
            class05894 class058942 = new class05894((class04887)class059742, biConsumer3, class060692, (Set)hashSet2, (Set)hashSet3, (Set)hashSet);
            class014762.z.forEach(class014742 -> class014742.N(class058942));
        }
        return class05163.N((Iterable)Iterables.concat((Iterable)hashSet, (Iterable)hashSet2, (Iterable)hashSet3, (Iterable)hashSet4)).map(class051632 -> {
            class07739 class077392 = class03194.N((class07284)class059742, class051632, (Set<class07209>)hashSet2, (Set<class07209>)hashSet4, hashSet);
            class01207.N((class07284)class059742, (int)3, (class07739)class077392, (int)class051632.B(), (int)class051632.Z(), (int)class051632.z());
            return true;
        }).orElse(false);
    }

    protected void N(class00807 class008072, class07209 class072092, class00500 class005002) {
        class03194.y(class008072, class072092, class005002);
    }

    private int N(class04887 class048872, int n, class07209 class072092, class01476 class014762) {
        class07218 class072182 = new class07218();
        for (int i = 0; i <= n + 1; ++i) {
            int n2 = class014762.Z.N(n, i);
            for (int j = -n2; j <= n2; ++j) {
                for (int k = -n2; k <= n2; ++k) {
                    class072182.N((class00753)class072092, j, i, k);
                    if (class014762.u.y(class048872, (class07209)class072182) && (class014762.U || !class03194.N(class048872, (class07209)class072182))) continue;
                    return i - 2;
                }
            }
        }
        return n;
    }

    private boolean N(class05974 class059742, class06069 class060692, class07209 class072092, BiConsumer<class07209, class00500> biConsumer, BiConsumer<class07209, class00500> biConsumer2, class01455 class014552, class01476 class014762) {
        int n = class014762.u.N(class060692);
        int n2 = class014762.M.N(class060692, n, class014762);
        int n3 = n - n2;
        int n4 = class014762.M.N(class060692, n3);
        class07209 class072093 = class014762.B.map(class036472 -> class036472.N(class072092, class060692)).orElse(class072092);
        int n5 = Math.min(class072092.method_10264(), class072093.method_10264());
        int n6 = Math.max(class072092.method_10264(), class072093.method_10264()) + n + 1;
        if (n5 < class059742.method_31607() + 1 || n6 > class059742.method_31600() + 1) {
            return false;
        }
        OptionalInt optionalInt = class014762.Z.L();
        int n7 = this.N((class04887)class059742, n, class072093, class014762);
        if (n7 < n && (optionalInt.isEmpty() || n7 < optionalInt.getAsInt())) {
            return false;
        }
        if (class014762.B.isPresent() && !((class03647)class014762.B.get()).N((class04887)class059742, biConsumer, class060692, class072092, class072093, class014762)) {
            return false;
        }
        class014762.u.N((class04887)class059742, biConsumer2, class060692, n7, class072093, class014762).forEach(class014672 -> class014762.M.N((class04887)class059742, class014552, class060692, class014762, n7, class014672, n2, n4));
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private static class07739 N(class07284 var0, class05163 var1_1, Set<class07209> var2_2, Set<class07209> var3_3, Set<class07209> var4_4) {
        var5_5 = new class06890(var1_1.u(), var1_1.i(), var1_1.R());
        var6_6 = 7;
        var7_7 = Lists.newArrayList();
        for (var8_8 = 0; var8_8 < 7; ++var8_8) {
            var7_7.add(Sets.newHashSet());
        }
        for (class07209 var9_10 : Lists.newArrayList((Iterable)Sets.union(var3_3, var4_4))) {
            if (!var1_1.y((class00753)var9_10)) continue;
            var5_5.method_1049(var9_10.method_10263() - var1_1.B(), var9_10.method_10264() - var1_1.Z(), var9_10.method_10260() - var1_1.z());
        }
        var8_9 = new class07218();
        var9_11 = 0;
        ((Set)var7_7.get(0)).addAll(var2_2);
        block2: while (true) {
            if (var9_11 < 7 && ((Set)var7_7.get(var9_11)).isEmpty()) {
                ++var9_11;
                continue;
            }
            if (var9_11 >= 7) break;
            var10_12 = ((Set)var7_7.get(var9_11)).iterator();
            var11_13 = (class07209)var10_12.next();
            var10_12.remove();
            if (!var1_1.y((class00753)var11_13)) continue;
            if (var9_11 != 0) {
                var12_14 = var0.method_8320(var11_13);
                class03194.y((class00807)var0, var11_13, (class00500)var12_14.y((class08092)class06665.NJ, (Comparable)Integer.valueOf(var9_11)));
            }
            var5_5.method_1049(var11_13.method_10263() - var1_1.B(), var11_13.method_10264() - var1_1.Z(), var11_13.method_10260() - var1_1.z());
            var12_14 = class07211.values();
            var13_15 = var12_14.length;
            var14_16 = 0;
            while (true) {
                if (var14_16 < var13_15) ** break;
                continue block2;
                var15_17 = var12_14[var14_16];
                var8_9.N((class00753)var11_13, var15_17);
                if (var1_1.y((class00753)var8_9) && !var5_5.method_1063(var16_18 = var8_9.method_10263() - var1_1.B(), var17_19 = var8_9.method_10264() - var1_1.Z(), var18_20 = var8_9.method_10260() - var1_1.z()) && !(var20_21 = class07131.T((class00500)var0.method_8320((class07209)var8_9))).isEmpty() && (var21_22 = Math.min(var20_21.getAsInt(), var9_11 + 1)) < 7) {
                    ((Set)var7_7.get(var21_22)).add(var8_9.method_10062());
                    var9_11 = Math.min(var9_11, var21_22);
                }
                ++var14_16;
            }
            break;
        }
        return var5_5;
    }
}

