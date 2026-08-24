/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.posix.Timeval;

public final class OpenBSDTimeval
extends Timeval {
    public final Struct.Signed64 tv_sec = new Struct.Signed64(this);
    public final Struct.SignedLong tv_usec = new Struct.SignedLong(this);

    @Override
    public long usec() {
        return this.tv_usec.get();
    }

    @Override
    public void sec(long sec) {
        this.tv_sec.set(sec);
    }

    public OpenBSDTimeval(Runtime runtime) {
        super(runtime);
    }

    @Override
    public void usec(long usec) {
        this.tv_usec.set(usec);
    }

    @Override
    public long sec() {
        return this.tv_sec.get();
    }

    @Override
    public void setTime(long[] timeval) {
        assert (timeval.length == 2);
        this.tv_sec.set(timeval[0]);
        this.tv_usec.set(timeval[1]);
    }
}

