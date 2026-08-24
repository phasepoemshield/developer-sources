/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.posix.Times;

final class JavaTimes
implements Times {
    static final long HZ = 1000L;
    private static final long startTime = System.currentTimeMillis();

    @Override
    public long cutime() {
        return 0L;
    }

    @Override
    public long stime() {
        return 0L;
    }

    @Override
    public long utime() {
        return Math.max(System.currentTimeMillis() - startTime, 1L);
    }

    JavaTimes() {
    }

    @Override
    public long cstime() {
        return 0L;
    }
}

