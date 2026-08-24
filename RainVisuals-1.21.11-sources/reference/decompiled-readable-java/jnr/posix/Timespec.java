/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public abstract class Timespec
extends Struct {
    public abstract void setTime(long[] var1);

    public abstract long sec();

    public abstract void sec(long var1);

    public Timespec(Runtime runtime) {
        super(runtime);
    }

    public abstract long nsec();

    public abstract void nsec(long var1);
}

