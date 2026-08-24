/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix.windows;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public class WindowsFileTime
extends Struct {
    final Struct.Unsigned32 highDateTime;
    final Struct.Unsigned32 lowDateTime = new Struct.Unsigned32();

    public int getLowDateTime() {
        return this.lowDateTime.intValue();
    }

    public long getLongValue() {
        return this.getHighDateTime() << 32 + this.getLowDateTime();
    }

    public WindowsFileTime(Runtime runtime) {
        super(runtime);
        this.highDateTime = new Struct.Unsigned32();
    }

    public int getHighDateTime() {
        return this.highDateTime.intValue();
    }
}

