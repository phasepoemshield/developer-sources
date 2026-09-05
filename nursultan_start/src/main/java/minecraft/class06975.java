/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06605
 *  minecraft.class07536
 */
package minecraft;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import minecraft.class06605;
import minecraft.class07536;

public class class06975 {
    private final long N;
    private final AtomicLong y = new AtomicLong();
    private final AtomicBoolean L = new AtomicBoolean(false);
    private final class06605 u;

    private void L() {
        long l = class07536.L();
        if (this.L.get() && l - this.y.get() >= this.N) {
            this.u.i();
            this.y.set(class07536.L());
        }
        this.L.set(false);
    }

    public class06975(class06605 class066052, int n) {
        this.u = class066052;
        this.N = TimeUnit.SECONDS.toMillis(n);
    }

    public void y() {
        this.L.set(true);
        this.L();
    }

    public void N() {
        this.L();
    }
}

