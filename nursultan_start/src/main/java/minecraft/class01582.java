/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.concurrent.TimeUnit;

class class01582 {
    private static final int N = 500;
    private static final List<GarbageCollectorMXBean> y = ManagementFactory.getGarbageCollectorMXBeans();
    private long L = 0L;
    private long u = -1L;
    private long i = -1L;
    private long R = 0L;

    class01582() {
    }

    long N(long l) {
        long l2 = System.currentTimeMillis();
        if (l2 - this.L < 500L) {
            return this.R;
        }
        long l3 = class01582.N();
        if (this.L != 0L && l3 == this.i) {
            double d = (double)TimeUnit.SECONDS.toMillis(1L) / (double)(l2 - this.L);
            long l4 = l - this.u;
            this.R = Math.round((double)l4 * d);
        }
        this.L = l2;
        this.u = l;
        this.i = l3;
        return this.R;
    }

    private static long N() {
        long l = 0L;
        for (GarbageCollectorMXBean garbageCollectorMXBean : y) {
            l += garbageCollectorMXBean.getCollectionCount();
        }
        return l;
    }
}

