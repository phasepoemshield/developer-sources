/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03222
 *  minecraft.class03556
 *  minecraft.class04995
 *  minecraft.class05487
 *  minecraft.class05527
 *  minecraft.class06069
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class00765;
import minecraft.class00780;
import minecraft.class03222;
import minecraft.class03556;
import minecraft.class04995;
import minecraft.class05487;
import minecraft.class05527;
import minecraft.class06069;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public class class00782
extends class00765
implements class05527 {
    public static final MapCodec<class00782> y = class00780.L.fieldOf("biome").xmap(class00782::new, class007822 -> class007822.L).stable();
    private final class03556<class00780> L;

    public class00782(class03556<class00780> class035562) {
        this.L = class035562;
    }

    @Override
    protected Stream<class03556<class00780>> y() {
        return Stream.of(this.L);
    }

    @Override
    public @Nullable Pair<class07209, class03556<class00780>> N(class07209 class072092, int n, int n2, int n3, Predicate<class03556<class00780>> predicate, class03222 class032222, class05487 class054872) {
        return predicate.test(this.L) ? Pair.of((Object)class072092.method_33096(class04995.N((int)class072092.method_10264(), (int)(class054872.method_31607() + 1), (int)(class054872.method_31600() + 1))), this.L) : null;
    }

    @Override
    public Set<class03556<class00780>> N(int n, int n2, int n3, int n4, class03222 class032222) {
        return Sets.newHashSet(Set.of(this.L));
    }

    @Override
    public @Nullable Pair<class07209, class03556<class00780>> N(int n, int n2, int n3, int n4, int n5, Predicate<class03556<class00780>> predicate, class06069 class060692, boolean bl, class03222 class032222) {
        if (predicate.test(this.L)) {
            if (bl) {
                return Pair.of((Object)new class07209(n, n2, n3), this.L);
            }
            return Pair.of((Object)new class07209(n - n4 + class060692.y(n4 * 2 + 1), n2, n3 - n4 + class060692.y(n4 * 2 + 1)), this.L);
        }
        return null;
    }

    @Override
    protected MapCodec<? extends class00765> N() {
        return y;
    }

    @Override
    public class03556<class00780> method_38109(int n, int n2, int n3, class03222 class032222) {
        return this.L;
    }

    public class03556<class00780> method_16359(int n, int n2, int n3) {
        return this.L;
    }
}

