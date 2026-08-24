/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public abstract class Flock
extends Struct {
    public abstract void start(long var1);

    public abstract int pid();

    public abstract void type(short var1);

    public abstract short whence();

    public abstract void pid(int var1);

    public abstract long len();

    public abstract short type();

    public Flock(Runtime runtime) {
        super(runtime);
    }

    public abstract long start();

    public abstract void whence(short var1);

    public abstract void len(long var1);
}

