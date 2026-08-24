/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.posix.Timespec;

public final class DefaultNativeTimespec
extends Timespec {
    public final Struct.SignedLong tv_nsec;
    public final Struct.SignedLong tv_sec = new Struct.SignedLong(this);

    @Override
    public void sec(long sec) {
        this.tv_sec.set(sec);
    }

    public DefaultNativeTimespec(Runtime runtime) {
        super(runtime);
        this.tv_nsec = new Struct.SignedLong(this);
    }

    @Override
    public long nsec() {
        return this.tv_nsec.get();
    }

    @Override
    public void nsec(long usec) {
        this.tv_nsec.set(usec);
    }

    @Override
    public void setTime(long[] timespec) {
        assert (timespec.length == 2);
        this.tv_sec.set(timespec[0]);
        this.tv_nsec.set(timespec[1]);
    }

    @Override
    public long sec() {
        return this.tv_sec.get();
    }
}

