/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

public interface Times {
    public long cutime();

    public long cstime();

    public long stime();

    public long utime();
}

