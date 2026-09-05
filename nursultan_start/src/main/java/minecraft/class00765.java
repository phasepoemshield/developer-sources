/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01146
 *  minecraft.class03222
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04330
 *  minecraft.class04995
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07529
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00780;
import minecraft.class01146;
import minecraft.class03222;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04330;
import minecraft.class04995;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07529;
import org.jspecify.annotations.Nullable;

public abstract class class00765
implements class04330 {
    public static final Codec<class00765> N = class04206.r.T().dispatchStable(class00765::N, Function.identity());
    private final Supplier<Set<class03556<class00780>>> y = Suppliers.memoize(() -> (Set)this.y().distinct().collect(ImmutableSet.toImmutableSet()));

    public Set<class03556<class00780>> L() {
        Supplier<Set<class03556<class00780>>> var1 = this.y;
        return (Set)this.N(var1);
    }

    protected abstract Stream<class03556<class00780>> y();

    public void N(List<String> list, class07209 class072092, class03222 class032222) {
    }

    private Object N(Supplier supplier) {
        return this.N((Set)supplier.get());
    }

    protected Set N(Set set) {
        return set;
    }

    public Set<class03556<class00780>> N(int n, int n2, int n3, int n4, class03222 class032222) {
        int n5 = class01146.N((int)(n - n4));
        int n6 = class01146.N((int)(n2 - n4));
        int n7 = class01146.N((int)(n3 - n4));
        int n8 = class01146.N((int)(n + n4));
        int n9 = class01146.N((int)(n2 + n4));
        int n10 = class01146.N((int)(n3 + n4));
        int n11 = n8 - n5 + 1;
        int n12 = n9 - n6 + 1;
        int n13 = n10 - n7 + 1;
        HashSet hashSet = Sets.newHashSet();
        for (int i = 0; i < n13; ++i) {
            for (int j = 0; j < n11; ++j) {
                for (int k = 0; k < n12; ++k) {
                    int n14 = n5 + j;
                    int n15 = n6 + k;
                    int n16 = n7 + i;
                    hashSet.add(this.method_38109(n14, n15, n16, class032222));
                }
            }
        }
        return hashSet;
    }

    protected abstract MapCodec<? extends class00765> N();

    public @Nullable Pair<class07209, class03556<class00780>> N(class07209 class072092, int n, int n2, int n3, Predicate<class03556<class00780>> predicate, class03222 class032222, class05487 class054872) {
        Set set = this.L().stream().filter(predicate).collect(Collectors.toUnmodifiableSet());
        if (set.isEmpty()) {
            return null;
        }
        int n4 = Math.floorDiv(n, n2);
        int[] nArray = class04995.y((int)class072092.method_10264(), (int)(class054872.method_31607() + 1), (int)(class054872.method_31600() + 1), (int)n3).toArray();
        for (class07218 class072182 : class07209.method_30512((class07209)class07209.field_10980, (int)n4, (class07211)class07211.field_11034, (class07211)class07211.field_11035)) {
            int n5 = class072092.method_10263() + class072182.method_10263() * n2;
            int n6 = class072092.method_10260() + class072182.method_10260() * n2;
            int n7 = class01146.N((int)n5);
            int n8 = class01146.N((int)n6);
            for (int n9 : nArray) {
                int n10 = class01146.N((int)n9);
                class03556<class00780> var22 = this.method_38109(n7, n10, n8, class032222);
                if (!set.contains(var22)) continue;
                return Pair.of((Object)new class07209(n5, n9, n6), var22);
            }
        }
        return null;
    }

    public @Nullable Pair<class07209, class03556<class00780>> N(int n, int n2, int n3, int n4, int n5, Predicate<class03556<class00780>> predicate, class06069 class060692, boolean bl, class03222 class032222) {
        int n6;
        int n7 = class01146.N((int)n);
        int n8 = class01146.N((int)n3);
        int n9 = class01146.N((int)n4);
        int n10 = class01146.N((int)n2);
        Pair pair = null;
        int n11 = 0;
        int n12 = n6 = bl ? 0 : n9;
        while (n6 <= n9) {
            int n13;
            int n14 = n13 = class07529.Nl || class07529.NG ? 0 : -n6;
            while (n13 <= n6) {
                boolean bl2 = Math.abs(n13) == n6;
                for (int i = -n6; i <= n6; i += n5) {
                    int n15;
                    class03556<class00780> var23;
                    int n16;
                    if (bl) {
                        int n17 = n16 = Math.abs(i) == n6 ? 1 : 0;
                        if (n16 == 0 && !bl2) continue;
                    }
                    if (!predicate.test(var23 = this.method_38109(n16 = n7 + i, n10, n15 = n8 + n13, class032222))) continue;
                    if (pair == null || class060692.y(n11 + 1) == 0) {
                        class07209 class072092 = new class07209(class01146.L((int)n16), n2, class01146.L((int)n15));
                        if (bl) {
                            return Pair.of((Object)class072092, var23);
                        }
                        pair = Pair.of((Object)class072092, var23);
                    }
                    ++n11;
                }
                n13 += n5;
            }
            n6 += n5;
        }
        return pair;
    }

    public @Nullable Pair<class07209, class03556<class00780>> N(int n, int n2, int n3, int n4, Predicate<class03556<class00780>> predicate, class06069 class060692, class03222 class032222) {
        return this.N(n, n2, n3, n4, 1, predicate, class060692, false, class032222);
    }

    public abstract class03556<class00780> method_38109(int var1, int var2, int var3, class03222 var4);
}

