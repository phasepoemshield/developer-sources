/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public class WindowsSecurityAttributes
extends Struct {
    public final Struct.Unsigned32 length = new Struct.Unsigned32(this);
    public final Struct.Pointer securityDescriptor = new Struct.Pointer(this);
    public final Struct.WBOOL inheritHandle = new Struct.WBOOL(this);

    public boolean getInheritHandle() {
        return this.inheritHandle.get();
    }

    public long getLength() {
        return this.length.get();
    }

    public WindowsSecurityAttributes(Runtime runtime) {
        super(runtime);
        this.length.set(Struct.size(this));
        this.inheritHandle.set(true);
    }
}

