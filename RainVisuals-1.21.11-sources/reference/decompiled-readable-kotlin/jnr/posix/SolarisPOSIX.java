package jnr.posix;

import java.nio.ByteBuffer;
import jnr.constants.platform.Confstr;
import jnr.constants.platform.Errno;
import jnr.constants.platform.Fcntl;
import jnr.constants.platform.Pathconf;
import jnr.constants.platform.Sysconf;
import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;
import jnr.ffi.mapper.FromNativeContext;
import jnr.posix.util.MethodName;
import jnr.posix.util.Platform;

// $VF: Compiled from SolarisPOSIX.java
final class SolarisPOSIX extends BaseNativePOSIX {
   public static final int LOCK_NB = 4;
   public static final int LOCK_UN = 8;
   public static final int SEEK_SET = 0;
   public static final BaseNativePOSIX.PointerConverter PASSWD = new BaseNativePOSIX.PointerConverter()   // $VF: Compiled from SolarisPOSIX.java
 {
      @Override
      public Object fromNative(Object arg, FromNativeContext ctx) {
         return arg != null ? new SolarisPasswd((Pointer)arg) : null;
      }
   };
   private static final SolarisPOSIX.Layout FLOCK_LAYOUT = new SolarisPOSIX.Layout(Runtime.getSystemRuntime());
   public static final int LOCK_SH = 1;
   public static final int LOCK_EX = 2;

   @Override
   public Pointer allocatePosixSpawnattr() {
      return Memory.allocateDirect(this.getRuntime(), 8);
   }

   @Override
   public int flock(int fd, int operation) {
      Pointer lock = this.getRuntime().getMemoryManager().allocateTemporary(FLOCK_LAYOUT.size(), true);
      switch (operation & -5) {
         case 1:
            FLOCK_LAYOUT.l_type.set(lock, (short)Fcntl.F_RDLCK.intValue());
            break;
         case 2:
            FLOCK_LAYOUT.l_type.set(lock, (short)Fcntl.F_WRLCK.intValue());
            break;
         case 8:
            FLOCK_LAYOUT.l_type.set(lock, (short)Fcntl.F_UNLCK.intValue());
            break;
         default:
            this.errno(Errno.EINVAL.intValue());
            return -1;
      }

      FLOCK_LAYOUT.l_whence.set(lock, 0L);
      FLOCK_LAYOUT.l_start.set(lock, 0L);
      FLOCK_LAYOUT.l_len.set(lock, 0L);
      return this.libc().fcntl(fd, (operation & 4) != 0 ? Fcntl.F_SETLK.intValue() : Fcntl.F_SETLKW.intValue(), lock);
   }

   @Override
   public long sysconf(Sysconf name) {
      return this.libc().sysconf(name);
   }

   @Override
   public int fpathconf(int fd, Pathconf name) {
      return this.libc().fpathconf(fd, name);
   }

   @Override
   public Pointer allocatePosixSpawnFileActions() {
      return Memory.allocateDirect(this.getRuntime(), 8);
   }

   @Override
   public int confstr(Confstr buf, ByteBuffer len, int name) {
      return this.libc().confstr(name, buf, len);
   }

   @Override
   public Times times() {
      return NativeTimes.times(this);
   }

   @Override
   public MsgHdr allocateMsgHdr() {
      this.handler.unimplementedError(MethodName.getCallerMethodName());
      return null;
   }

   @Override
   public FileStat allocateStat() {
      return Platform.IS_32_BIT ? new SolarisFileStat32(this) : new SolarisFileStat64(this);
   }

   SolarisPOSIX(LibCProvider libc, POSIXHandler handler) {
      super(libc, handler);
   }

   @Override
   public SocketMacros socketMacros() {
      this.handler.unimplementedError(MethodName.getCallerMethodName());
      return null;
   }

   // $VF: Compiled from SolarisPOSIX.java
   public static class Layout extends StructLayout {
      public final StructLayout.int32_t l_sysid;
      public final StructLayout.off_t l_start;
      public final StructLayout.int16_t l_whence;
      public final StructLayout.int32_t[] l_pad;
      public final StructLayout.pid_t l_pid;
      public final StructLayout.int16_t l_type = new StructLayout.int16_t();
      public final StructLayout.off_t l_len;

      protected Layout(Runtime runtime) {
         super(runtime);
         this.l_whence = new StructLayout.int16_t();
         this.l_start = new StructLayout.off_t();
         this.l_len = new StructLayout.off_t();
         this.l_sysid = new StructLayout.int32_t();
         this.l_pid = new StructLayout.pid_t();
         this.l_pad = new StructLayout.int32_t[4];
      }
   }
}
