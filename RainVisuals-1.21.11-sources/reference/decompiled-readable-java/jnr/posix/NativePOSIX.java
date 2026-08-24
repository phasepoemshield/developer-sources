/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.posix.POSIX;
import jnr.posix.SocketMacros;

public abstract class NativePOSIX
implements POSIX {
    public Pointer allocatePosixSpawnFileActions() {
        return Memory.allocateDirect(this.getRuntime(), 128);
    }

    public Pointer allocatePosixSpawnattr() {
        return Memory.allocateDirect(this.getRuntime(), 128);
    }

    Runtime getRuntime() {
        return Runtime.getRuntime(this.libc());
    }

    public abstract SocketMacros socketMacros();
}

