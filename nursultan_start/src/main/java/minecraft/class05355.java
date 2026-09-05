/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01328
 *  minecraft.class04782
 *  minecraft.class05298
 *  minecraft.class06069
 *  minecraft.class07438
 *  net.caffeinemc.mods.lithium.mixin.ai.useless_sensors.SensorAccessor
 */
package minecraft;

import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiPredicate;
import minecraft.class01328;
import minecraft.class04782;
import minecraft.class05298;
import minecraft.class05378;
import minecraft.class06069;
import minecraft.class07438;
import net.caffeinemc.mods.lithium.mixin.ai.useless_sensors.SensorAccessor;

public abstract class class05355<E extends class07438>
implements SensorAccessor {
    private static final class06069 N = class06069.i();
    private static final int y = 20;
    private static final int L = 16;
    private static final class01328 u = class01328.y().N(16.0);
    private static final class01328 i = class01328.y().N(16.0).i();
    private static final class01328 R = class01328.N().N(16.0);
    private static final class01328 M = class01328.N().N(16.0).i();
    private static final class01328 B = class01328.N().N(16.0).u();
    private static final class01328 Z = class01328.N().N(16.0).u().i();
    private final int z;
    private long U;

    public static boolean L(class04782 class047822, class07438 class074382, class07438 class074383) {
        if (class074382.method_18868().y(class05378.s, (Object)class074383)) {
            return Z.N(class047822, class074382, class074383);
        }
        return B.N(class047822, class074382, class074383);
    }

    public class05355(int n) {
        this.z = n;
        this.U = N.y(n);
    }

    public class05355() {
        this(20);
    }

    public static boolean y(class04782 class047822, class07438 class074382, class07438 class074383) {
        if (class074382.method_18868().y(class05378.s, (Object)class074383)) {
            return M.N(class047822, class074382, class074383);
        }
        return R.N(class047822, class074382, class074383);
    }

    public final void y(class04782 class047822, E e) {
        if (--this.U <= 0L) {
            this.U = this.z;
            this.N(e);
            this.N(class047822, e);
        }
    }

    static <T, U> BiPredicate<T, U> N(int n, BiPredicate<T, U> biPredicate) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        return (object, object2) -> {
            if (biPredicate.test(object, object2)) {
                atomicInteger.set(n);
                return true;
            }
            return atomicInteger.decrementAndGet() >= 0;
        };
    }

    private void N(E e) {
        double d = e.method_45325(class05298.P);
        u.N(d);
        i.N(d);
        R.N(d);
        M.N(d);
        B.N(d);
        Z.N(d);
    }

    protected abstract void N(class04782 var1, E var2);

    public abstract Set<class05378<?>> N();

    public static boolean N(class04782 class047822, class07438 class074382, class07438 class074383) {
        if (class074382.method_18868().y(class05378.s, (Object)class074383)) {
            return i.N(class047822, class074382, class074383);
        }
        return u.N(class047822, class074382, class074383);
    }

    public static BiPredicate<class04782, class07438> N(class07438 class074382, int n) {
        return class05355.N(n, (class047822, class074383) -> class05355.y(class047822, class074382, class074383));
    }

    public /* synthetic */ long getLastSenseTime() {
        return this.U;
    }

    public /* synthetic */ int getSenseInterval() {
        return this.z;
    }

    public /* synthetic */ void setLastSenseTime(long l) {
        this.U = l;
    }
}

