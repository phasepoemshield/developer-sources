/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.RateLimiter
 *  minecraft.class00392
 *  minecraft.class05153
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.util.concurrent.RateLimiter;
import java.lang.invoke.LambdaMetafactory;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import minecraft.class00392;
import minecraft.class05153;
import minecraft.class05400;
import org.jspecify.annotations.Nullable;

public class class05423 {
    private final float N;
    private final AtomicReference<@Nullable class05400> y = new AtomicReference();

    public class05423(Duration duration) {
        this.N = 1000.0f / (float)duration.toMillis();
    }

    public void N(class05153 class051532, class00392 class003922) {
        if (this.y.updateAndGet((UnaryOperator<class05400>)(UnaryOperator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, N(minecraft.class00392 minecraft.class05400 ), (Lminecraft/class05400;)Lminecraft/class05400;)((class05423)this, (class00392)class003922)).y.tryAcquire(1)) {
            class051532.u(class003922);
        }
    }

    private /* synthetic */ class05400 N(class00392 class003922, class05400 class054002) {
        if (class054002 == null || !class003922.equals((Object)class054002.N)) {
            return new class05400(class003922, RateLimiter.create((double)this.N));
        }
        return class054002;
    }
}

