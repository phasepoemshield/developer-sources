/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public class FileTime
extends Struct {
    public final Struct.Unsigned32 dwHighDateTime;
    public final Struct.Unsigned32 dwLowDateTime = new Struct.Unsigned32(this);

    FileTime(Runtime runtime) {
        super(runtime);
        this.dwHighDateTime = new Struct.Unsigned32(this);
    }
}

