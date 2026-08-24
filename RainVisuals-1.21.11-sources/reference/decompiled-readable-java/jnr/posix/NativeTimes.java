/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;
import jnr.posix.BaseNativePOSIX;
import jnr.posix.NativePOSIX;
import jnr.posix.Times;

public final class NativeTimes
implements Times {
    private static final Layout layout = new Layout(Runtime.getSystemRuntime());
    final Pointer memory;

    @Override
    public long cstime() {
        return NativeTimes.layout.tms_cstime.get(this.memory);
    }

    @Override
    public long cutime() {
        return NativeTimes.layout.tms_cutime.get(this.memory);
    }

    /*
     * WARNING - void declaration
     */
    static NativeTimes times(BaseNativePOSIX posix) {
        void var1_1;
        NativeTimes tms = new NativeTimes(posix);
        return posix.libc().times(tms) == -1L ? null : var1_1;
    }

    @Override
    public long utime() {
        return NativeTimes.layout.tms_utime.get(this.memory);
    }

    NativeTimes(NativePOSIX posix) {
        this.memory = Memory.allocate(posix.getRuntime(), layout.size());
    }

    @Override
    public long stime() {
        return NativeTimes.layout.tms_stime.get(this.memory);
    }

    static final class Layout
    extends StructLayout {
        public final StructLayout.clock_t tms_utime = new StructLayout.clock_t();
        public final StructLayout.clock_t tms_cstime;
        public final StructLayout.clock_t tms_stime = new StructLayout.clock_t();
        public final StructLayout.clock_t tms_cutime = new StructLayout.clock_t();

        Layout(Runtime runtime) {
            super(runtime);
            this.tms_cstime = new StructLayout.clock_t();
        }
    }
}

