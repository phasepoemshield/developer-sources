/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class03416
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import minecraft.class03374;
import minecraft.class03375;
import minecraft.class03382;
import minecraft.class03416;
import org.slf4j.Logger;

public class class03377 {
    static final Logger N = LogUtils.getLogger();
    final Executor y;
    final TimeUnit L;
    final class03382 u;

    public class03377(Executor executor, TimeUnit timeUnit, class03382 class033822) {
        this.y = executor;
        this.L = timeUnit;
        this.u = class033822;
    }

    public <T> class03416<T> N(String string, Callable<T> callable, Duration duration, class03375 class033752) {
        long l = this.L.convert(duration);
        if (l == 0L) {
            throw new IllegalArgumentException("Period of " + String.valueOf(duration) + " too short for selected resolution of " + String.valueOf((Object)this.L));
        }
        return new class03416(this, string, callable, l, class033752);
    }

    public class03374 N() {
        return new class03374(this);
    }
}

