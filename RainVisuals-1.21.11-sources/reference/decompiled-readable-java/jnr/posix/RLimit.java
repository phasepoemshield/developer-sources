/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public abstract class RLimit
extends Struct {
    public abstract long rlimCur();

    public abstract long rlimMax();

    protected RLimit(Runtime runtime) {
        super(runtime);
    }

    public abstract void init(long var1, long var3);
}

