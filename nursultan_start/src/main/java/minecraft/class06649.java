/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10641
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class02334
 *  minecraft.class05487
 *  minecraft.class07209
 *  minecraft.class07211
 *  net.caffeinemc.mods.lithium.common.world.block_pattern_matching.BlockPatternExtended
 *  net.caffeinemc.mods.lithium.common.world.block_pattern_matching.BlockSearch
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10641;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.function.Predicate;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class02334;
import minecraft.class05487;
import minecraft.class06646;
import minecraft.class06653;
import minecraft.class07209;
import minecraft.class07211;
import net.caffeinemc.mods.lithium.common.world.block_pattern_matching.BlockPatternExtended;
import net.caffeinemc.mods.lithium.common.world.block_pattern_matching.BlockSearch;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06649
implements BlockPatternExtended {
    private final Predicate<class06646>[][][] N;
    private final int y;
    private final int L;
    private final int u;
    private class00891 i;
    private int R;

    public int L() {
        return this.u;
    }

    public class06649(Predicate<class06646>[][][] predicateArray) {
        this.N = predicateArray;
        this.y = predicateArray.length;
        if (this.y > 0) {
            this.L = predicateArray[0].length;
            this.u = this.L > 0 ? predicateArray[0][0].length : 0;
        } else {
            this.L = 0;
            this.u = 0;
        }
    }

    public Predicate<class06646>[][][] u() {
        return this.N;
    }

    public int y() {
        return this.L;
    }

    public @Nullable class06653 N(class05487 class054872, class07209 class072092) {
        LoadingCache<class07209, class06646> var3 = class06649.N(class054872, false);
        int n = Math.max(Math.max(this.u, this.L), this.y);
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class054872, class072092, callbackInfoReturnable, n);
        if (callbackInfoReturnable.isCancelled()) {
            return (class06653)callbackInfoReturnable.getReturnValue();
        }
        for (class07209 class072093 : class07209.method_10097((class07209)class072092, (class07209)class072092.method_10069(n - 1, n - 1, n - 1))) {
            for (class07211 class072112 : class07211.values()) {
                for (class07211 class072113 : class07211.values()) {
                    class06653 class066532;
                    if (class072113 == class072112 || class072113 == class072112.b() || (class066532 = this.N(class072093, class072112, class072113, var3)) == null) continue;
                    return class066532;
                }
            }
        }
        return null;
    }

    public static LoadingCache<class07209, class06646> N(class05487 class054872, boolean bl) {
        return CacheBuilder.newBuilder().build((CacheLoader)new class10641(class054872, bl));
    }

    protected static class07209 N(class07209 class072092, class07211 class072112, class07211 class072113, int n, int n2, int n3) {
        if (class072112 == class072113 || class072112 == class072113.b()) {
            throw new IllegalArgumentException("Invalid forwards & up combination");
        }
        class00753 class007532 = new class00753(class072112.P(), class072112.s(), class072112.T());
        class00753 class007533 = new class00753(class072113.P(), class072113.s(), class072113.T());
        class00753 class007534 = class007532.method_10259(class007533);
        return class072092.method_10069(class007533.method_10263() * -n2 + class007534.method_10263() * n + class007532.method_10263() * n3, class007533.method_10264() * -n2 + class007534.method_10264() * n + class007532.method_10264() * n3, class007533.method_10260() * -n2 + class007534.method_10260() * n + class007532.method_10260() * n3);
    }

    private void N(class05487 class054872, class07209 class072092, CallbackInfoReturnable callbackInfoReturnable, int n) {
        if (this.i != null) {
            class07209 class072093 = class072092.method_10069(2 * n - 1, 2 * n - 1, 2 * n - 1);
            class02334 class023342 = class02334.N((class07209)class072092.method_10069(-n, -n, -n), (class07209)class072093);
            if (!BlockSearch.hasAtLeast((class05487)class054872, (class02334)class023342, (class00891)this.i, (int)this.R)) {
                callbackInfoReturnable.setReturnValue(null);
            }
        }
    }

    public int N() {
        return this.y;
    }

    public @Nullable class06653 N(class05487 class054872, class07209 class072092, class07211 class072112, class07211 class072113) {
        LoadingCache<class07209, class06646> var5 = class06649.N(class054872, false);
        return this.N(class072092, class072112, class072113, var5);
    }

    private @Nullable class06653 N(class07209 class072092, class07211 class072112, class07211 class072113, LoadingCache<class07209, class06646> loadingCache) {
        for (int i = 0; i < this.u; ++i) {
            for (int j = 0; j < this.L; ++j) {
                for (int k = 0; k < this.y; ++k) {
                    if (this.N[k][j][i].test((class06646)loadingCache.getUnchecked((Object)class06649.N(class072092, class072112, class072113, i, j, k)))) continue;
                    return null;
                }
            }
        }
        return new class06653(class072092, class072112, class072113, loadingCache, this.u, this.L, this.y);
    }

    public void lithium$setRequiredBlock(class00891 class008912, int n) {
        this.i = class008912;
        this.R = n;
    }
}

