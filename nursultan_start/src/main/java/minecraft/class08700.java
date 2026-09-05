/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11345
 *  com.mojang.jtracy.TracyClient
 *  minecraft.class04643
 *  minecraft.class04687
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class11345;
import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import minecraft.class04643;
import minecraft.class04687;
import minecraft.class08714;
import org.jspecify.annotations.Nullable;

public final class class08700 {
    private static final ThreadLocal<class08714> N = ThreadLocal.withInitial(class08714::new);
    private static final ThreadLocal<@Nullable class04643> y = new ThreadLocal();
    private static final AtomicInteger L = new AtomicInteger();

    private static class04643 L(class04643 class046432) {
        return class04643.N((class04643)class08700.L(), (class04643)class046432);
    }

    private static class04643 L() {
        if (TracyClient.isAvailable()) {
            return N.get();
        }
        return class04687.N;
    }

    private class08700() {
    }

    private static void y() {
        class04643 class046432 = y.get();
        if (class046432 == null) {
            throw new IllegalStateException("Profiler was not active");
        }
        y.remove();
        L.decrementAndGet();
        class046432.y();
    }

    private static void y(class04643 class046432) {
        if (y.get() != null) {
            throw new IllegalStateException("Profiler is already active");
        }
        class04643 class046433 = class08700.L(class046432);
        y.set(class046433);
        L.incrementAndGet();
        class046433.N();
    }

    public static class11345 N(class04643 class046432) {
        class08700.y(class046432);
        return class08700::y;
    }

    public static class04643 N() {
        if (L.get() == 0) {
            return class08700.L();
        }
        return Objects.requireNonNullElseGet(y.get(), class08700::L);
    }
}

