/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import java.nio.ByteBuffer;
import jnr.constants.platform.Confstr;
import jnr.constants.platform.Fcntl;
import jnr.constants.platform.Pathconf;
import jnr.constants.platform.Sysconf;
import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.mapper.FromNativeContext;
import jnr.posix.AixFileStat;
import jnr.posix.AixFlock;
import jnr.posix.AixPasswd;
import jnr.posix.AixTimeval;
import jnr.posix.BaseNativePOSIX;
import jnr.posix.FileStat;
import jnr.posix.Flock;
import jnr.posix.LibCProvider;
import jnr.posix.MsgHdr;
import jnr.posix.NativeTimes;
import jnr.posix.POSIXHandler;
import jnr.posix.SocketMacros;
import jnr.posix.Times;
import jnr.posix.Timeval;
import jnr.posix.util.MethodName;

final class AixPOSIX
extends BaseNativePOSIX {
    public static final BaseNativePOSIX.PointerConverter PASSWD = new BaseNativePOSIX.PointerConverter(){

        public Object fromNative(Object arg, FromNativeContext ctx) {
            return arg != null ? new AixPasswd((Pointer)arg) : null;
        }
    };

    @Override
    public SocketMacros socketMacros() {
        this.handler.unimplementedError(MethodName.getCallerMethodName());
        return null;
    }

    @Override
    public FileStat allocateStat() {
        return new AixFileStat(this);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int flock(int fd, int operation) {
        void var5_5;
        void var3_3;
        int cmd = Fcntl.F_SETLKW.intValue();
        short type = 0;
        if ((operation & FlockFlags.LOCK_SH.intValue()) != 0) {
            type = (short)Fcntl.F_RDLCK.intValue();
        } else if ((operation & FlockFlags.LOCK_EX.intValue()) != 0) {
            type = (short)Fcntl.F_WRLCK.intValue();
        } else if ((operation & FlockFlags.LOCK_UN.intValue()) != 0) {
            type = (short)Fcntl.F_UNLCK.intValue();
        }
        if ((operation & FlockFlags.LOCK_NB.intValue()) != 0) {
            cmd = Fcntl.F_SETLK.intValue();
        }
        Flock flock = this.allocateFlock();
        flock.type(type);
        flock.whence((short)0);
        flock.start(0L);
        flock.len(0L);
        return this.libc().fcntl(fd, (int)var3_3, (Flock)var5_5);
    }

    @Override
    public Pointer allocatePosixSpawnattr() {
        return Memory.allocateDirect(this.getRuntime(), 60);
    }

    AixPOSIX(LibCProvider libc, POSIXHandler handler) {
        super(libc, handler);
    }

    @Override
    public Times times() {
        return NativeTimes.times(this);
    }

    public Flock allocateFlock() {
        return new AixFlock(this.getRuntime());
    }

    @Override
    public Timeval allocateTimeval() {
        return new AixTimeval(this.getRuntime());
    }

    @Override
    public int confstr(Confstr name, ByteBuffer buf, int len) {
        return this.libc().confstr(name, buf, len);
    }

    @Override
    public Pointer allocatePosixSpawnFileActions() {
        return Memory.allocateDirect(this.getRuntime(), 4);
    }

    @Override
    public MsgHdr allocateMsgHdr() {
        this.handler.unimplementedError(MethodName.getCallerMethodName());
        return null;
    }

    @Override
    public long sysconf(Sysconf name) {
        return this.libc().sysconf(name);
    }

    @Override
    public int fpathconf(int fd, Pathconf name) {
        return this.libc().fpathconf(fd, name);
    }

    private static final class FlockFlags
    extends Enum<FlockFlags> {
        public static final /* enum */ FlockFlags LOCK_NB;
        private static final /* synthetic */ FlockFlags[] $VALUES;
        public static final /* enum */ FlockFlags LOCK_EX;
        private final int value;
        public static final /* enum */ FlockFlags LOCK_UN;
        public static final /* enum */ FlockFlags LOCK_SH;

        private FlockFlags(int value) {
            this.value = value;
        }

        static {
            LOCK_SH = new FlockFlags(1);
            LOCK_EX = new FlockFlags(2);
            LOCK_NB = new FlockFlags(4);
            LOCK_UN = new FlockFlags(8);
            $VALUES = FlockFlags.$values();
        }

        public final int intValue() {
            return this.value;
        }

        public static FlockFlags[] values() {
            return (FlockFlags[])$VALUES.clone();
        }

        public static FlockFlags valueOf(String name) {
            return Enum.valueOf(FlockFlags.class, name);
        }

        private static /* synthetic */ FlockFlags[] $values() {
            FlockFlags[] flockFlagsArray = new FlockFlags[4];
            flockFlagsArray[0] = LOCK_SH;
            flockFlagsArray[1] = LOCK_EX;
            flockFlagsArray[2] = LOCK_NB;
            flockFlagsArray[3] = LOCK_UN;
            return flockFlagsArray;
        }
    }
}

