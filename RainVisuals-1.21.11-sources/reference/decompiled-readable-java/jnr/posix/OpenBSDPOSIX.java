/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import java.nio.ByteBuffer;
import jnr.constants.platform.Confstr;
import jnr.constants.platform.Pathconf;
import jnr.constants.platform.Sysconf;
import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.ffi.mapper.FromNativeContext;
import jnr.posix.BaseNativePOSIX;
import jnr.posix.FileStat;
import jnr.posix.LibCProvider;
import jnr.posix.MsgHdr;
import jnr.posix.NativeTimes;
import jnr.posix.OpenBSDFileStat;
import jnr.posix.OpenBSDPasswd;
import jnr.posix.OpenBSDTimeval;
import jnr.posix.POSIXHandler;
import jnr.posix.SocketMacros;
import jnr.posix.Times;
import jnr.posix.Timeval;
import jnr.posix.util.MethodName;

final class OpenBSDPOSIX
extends BaseNativePOSIX {
    public static final BaseNativePOSIX.PointerConverter PASSWD = new BaseNativePOSIX.PointerConverter(){

        public Object fromNative(Object arg, FromNativeContext ctx) {
            return arg != null ? new OpenBSDPasswd((Pointer)arg) : null;
        }
    };

    @Override
    public int fpathconf(int fd, Pathconf name) {
        return this.libc().fpathconf(fd, name);
    }

    @Override
    public FileStat allocateStat() {
        return new OpenBSDFileStat(this);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int utimes(String path, long[] atimeval, long[] mtimeval) {
        void var4_4;
        void var1_1;
        Timeval[] times = null;
        if (atimeval != null) {
            if (mtimeval != null) {
                times = (Timeval[])Struct.arrayOf((Runtime)this.getRuntime(), OpenBSDTimeval.class, (int)2);
                times[0].setTime(atimeval);
                times[1].setTime(mtimeval);
            }
        }
        return this.libc().utimes((CharSequence)var1_1, (Timeval[])var4_4);
    }

    @Override
    public MsgHdr allocateMsgHdr() {
        this.handler.unimplementedError(MethodName.getCallerMethodName());
        return null;
    }

    @Override
    public Pointer allocatePosixSpawnFileActions() {
        return Memory.allocateDirect(this.getRuntime(), 8);
    }

    @Override
    public int confstr(Confstr name, ByteBuffer buf, int len) {
        return this.libc().confstr(name, buf, len);
    }

    @Override
    public Pointer allocatePosixSpawnattr() {
        return Memory.allocateDirect(this.getRuntime(), 8);
    }

    @Override
    public Times times() {
        return NativeTimes.times(this);
    }

    @Override
    public long sysconf(Sysconf name) {
        return this.libc().sysconf(name);
    }

    OpenBSDPOSIX(LibCProvider libc, POSIXHandler handler) {
        super(libc, handler);
    }

    @Override
    public SocketMacros socketMacros() {
        this.handler.unimplementedError(MethodName.getCallerMethodName());
        return null;
    }
}

