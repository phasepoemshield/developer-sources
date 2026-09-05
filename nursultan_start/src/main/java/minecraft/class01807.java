/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09527
 *  Nursultan.class09534
 *  minecraft.class00551
 *  minecraft.class00566
 *  minecraft.class00567
 *  minecraft.class00750
 *  minecraft.class04995
 *  minecraft.class06617
 *  minecraft.class06621
 *  minecraft.class07373
 *  net.caffeinemc.mods.lithium.common.world.chunk.LithiumHashPalette
 *  net.caffeinemc.mods.lithium.mixin.util.accessors.StrategyAccessor
 */
package minecraft;

import Nursultan.class09527;
import Nursultan.class09534;
import minecraft.class00551;
import minecraft.class00566;
import minecraft.class00567;
import minecraft.class00750;
import minecraft.class01822;
import minecraft.class04995;
import minecraft.class06617;
import minecraft.class06621;
import minecraft.class07373;
import net.caffeinemc.mods.lithium.common.world.chunk.LithiumHashPalette;
import net.caffeinemc.mods.lithium.mixin.util.accessors.StrategyAccessor;

public abstract class class01807<T>
implements StrategyAccessor {
    public static final class07373 N = class01822::N;
    public static final class07373 y = class00566::N;
    private static final class07373 W = class00567::N;
    public static final class06617 L = new class06621(N, 0);
    public static final class06617 u = new class06621(y, 1);
    public static final class06617 i = new class06621(y, 2);
    public static final class06617 R = new class06621(y, 3);
    public static final class06617 M = new class06621(y, 4);
    public static final class06617 B = new class06621(W, 5);
    public static final class06617 Z = new class06621(W, 6);
    public static final class06617 z = new class06621(W, 7);
    public static final class06617 U = new class06621(W, 8);
    private final class00750<T> m;
    private final class00551<T> P;
    protected final int E;
    private final int s;
    private final int T;
    private static final class07373 b = LithiumHashPalette::create;
    public static final class06617 j = new class06621(b, 3);
    public static final class06617 v = new class06621(b, 4);
    public static final class06617 n = new class06621(b, 5);
    public static final class06617 t = new class06621(b, 6);
    public static final class06617 G = new class06621(b, 7);
    public static final class06617 l = new class06621(b, 8);

    public class00551<T> L() {
        return this.P;
    }

    private static int L(int n) {
        return class04995.R((int)n);
    }

    public class01807(class00750<T> class007502, int n) {
        this.m = class007502;
        this.P = new class00551(class007502);
        this.E = class01807.L(class007502.L());
        this.s = n;
        this.T = 1 << n * 3;
    }

    protected class06617 y(int n) {
        int n2 = class01807.L(n);
        return this.N(n2);
    }

    public static <T> class01807<T> y(class00750<T> class007502) {
        return new class09534(class007502, 2);
    }

    public class00750<T> y() {
        return this.m;
    }

    public static <T> class01807<T> N(class00750<T> class007502) {
        return new class09527(class007502, 4);
    }

    public int N() {
        return this.T;
    }

    public int N(int n, int n2, int n3) {
        return (n2 << this.s | n3) << this.s | n;
    }

    protected abstract class06617 N(int var1);

    public /* synthetic */ class06617 lithium$getConfigurationForPaletteSize(int n) {
        return this.y(n);
    }
}

