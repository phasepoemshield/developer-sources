/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00140
 *  minecraft.class00167
 *  minecraft.class01894
 *  minecraft.class02028
 *  minecraft.class03702
 *  minecraft.class04673
 *  minecraft.class08388
 *  minecraft.class08496
 *  minecraft.class08510
 *  minecraft.class08512
 *  minecraft.class08529
 *  minecraft.class08534
 *  minecraft.class08838
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.Function;
import minecraft.class00140;
import minecraft.class00167;
import minecraft.class01894;
import minecraft.class02028;
import minecraft.class03702;
import minecraft.class04673;
import minecraft.class08251;
import minecraft.class08388;
import minecraft.class08496;
import minecraft.class08510;
import minecraft.class08512;
import minecraft.class08529;
import minecraft.class08534;
import minecraft.class08838;
import org.jspecify.annotations.Nullable;

class class08250
implements class08529 {
    private static final class08251<Boolean> R = class08250.N(0);
    private static final class08251<class00140> M = class08250.N(1);
    private static final class08251<class08534> B = class08250.N(2);
    private static final class08251<class03702> Z = class08250.N(3);
    private static final class08251<class08838> z = class08250.N(4);
    private static final class08251<class08388> U = class08250.N(5);
    private static final class08251<class08496> E = class08250.N(6);
    private static final int W = 7;
    private final class01894 m;
    boolean N;
    @Nullable class08250 y;
    final class00167 L;
    private final AtomicReferenceArray<@Nullable Object> P = new AtomicReferenceArray(7);
    private final Map<class04673, class08496> s = new ConcurrentHashMap<class04673, class08496>();

    public String L() {
        return this.m.toString();
    }

    public class08534 M() {
        return this.N_88(B, class08529::u);
    }

    class08250(class01894 class018942, class00167 class001672, boolean bl) {
        this.m = class018942;
        this.L = class001672;
        this.N = bl;
    }

    public class08838 B() {
        return this.N_88(z, class08529::N);
    }

    public class00140 i() {
        return this.N_88(M, class08529::L);
    }

    public boolean u() {
        return this.N_88(R, class08529::y);
    }

    private class08496 y(class08838 class088382, class02028 class020282, class04673 class046732) {
        class08496 class084962 = this.N(E);
        if (class084962 != null) {
            return class084962;
        }
        return this.N(E, this.M().bake(class088382, class020282, class046732, (class08512)this));
    }

    public @Nullable class08529 y() {
        return this.y;
    }

    public class08496 N(class08838 class088382, class02028 class020282, class04673 class046733) {
        if (class046733 == class08510.N) {
            return this.y(class088382, class020282, class046733);
        }
        return (class08496)this.s.computeIfAbsent(class046733, class046732 -> this.M().bake(class088382, class020282, class046732, (class08512)this));
    }

    public class08388 N(class08838 class088382, class02028 class020282) {
        class08388 class083882 = this.N(U);
        if (class083882 != null) {
            return class083882;
        }
        return this.N(U, class08529.N((class08838)class088382, (class02028)class020282, (class08512)this));
    }

    public class00167 N() {
        return this.L;
    }

    private static <T> class08251<T> N(int n) {
        Objects.checkIndex(n, 7);
        return new class08251(n);
    }

    private <T> T N(class08251<T> class082512, T t) {
        T t2 = this.P.compareAndExchange(class082512.N(), null, t);
        if (t2 == null) {
            return t;
        }
        return t2;
    }

    private <T> @Nullable T N(class08251<T> class082512) {
        return (T)this.P.get(class082512.N());
    }

    private <T> T N_88(class08251<T> class082512, Function<class08529, T> function) {
        T t = this.N(class082512);
        if (t != null) {
            return t;
        }
        return this.N(class082512, function.apply(this));
    }

    public class03702 R() {
        return this.N_88(Z, class08529::i);
    }
}

