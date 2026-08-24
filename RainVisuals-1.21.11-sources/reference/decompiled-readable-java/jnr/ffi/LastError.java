/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi;

import jnr.ffi.Runtime;

public final class LastError {
    private LastError() {
    }

    public static void setLastError(Runtime runtime, int error) {
        runtime.setLastError(error);
    }

    public static int getLastError(Runtime runtime) {
        return runtime.getLastError();
    }
}

