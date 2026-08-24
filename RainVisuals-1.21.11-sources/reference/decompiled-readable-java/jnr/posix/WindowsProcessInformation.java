/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.posix.HANDLE;

public class WindowsProcessInformation
extends Struct {
    final Struct.Unsigned32 dwThreadId;
    final Struct.Pointer hThread;
    final Struct.Unsigned32 dwProcessId;
    final Struct.Pointer hProcess = new Struct.Pointer(this);

    public HANDLE getProcess() {
        return new HANDLE(this.hProcess.get());
    }

    public HANDLE getThread() {
        return new HANDLE(this.hThread.get());
    }

    public WindowsProcessInformation(Runtime runtime) {
        super(runtime);
        this.hThread = new Struct.Pointer(this);
        this.dwProcessId = new Struct.Unsigned32(this);
        this.dwThreadId = new Struct.Unsigned32(this);
    }

    public int getPid() {
        return this.dwProcessId.intValue();
    }
}

