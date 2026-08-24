/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.posix.FileStat;

public interface NanosecondFileStat
extends FileStat {
    public long cTimeNanoSecs();

    public long aTimeNanoSecs();

    public long mTimeNanoSecs();
}

