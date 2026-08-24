package jnr.posix;

import java.nio.ByteBuffer;
import jnr.constants.platform.Confstr;
import jnr.constants.platform.Fcntl;
import jnr.constants.platform.Pathconf;
import jnr.constants.platform.Sysconf;
import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.mapper.FromNativeContext;
import jnr.posix.util.MethodName;

// $VF: Compiled from AixPOSIX.java
final class AixPOSIX extends BaseNativePOSIX {
   public static final BaseNativePOSIX.PointerConverter PASSWD = new BaseNativePOSIX.PointerConverter()   // $VF: Compiled from AixPOSIX.java
 {
      @Override
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

   @Override
   public int flock(int fd, int operation) {
      int cmd = Fcntl.F_SETLKW.intValue();
      short type = 0;
      if ((operation & AixPOSIX.FlockFlags.LOCK_SH.intValue()) != 0) {
         type = (short)Fcntl.F_RDLCK.intValue();
      } else if ((operation & AixPOSIX.FlockFlags.LOCK_EX.intValue()) != 0) {
         type = (short)Fcntl.F_WRLCK.intValue();
      } else if ((operation & AixPOSIX.FlockFlags.LOCK_UN.intValue()) != 0) {
         type = (short)Fcntl.F_UNLCK.intValue();
      }

      if ((operation & AixPOSIX.FlockFlags.LOCK_NB.intValue()) != 0) {
         cmd = Fcntl.F_SETLK.intValue();
      }

      Flock flock = this.allocateFlock();
      flock.type(type);
      flock.whence((short)0);
      flock.start(0L);
      flock.len(0L);
      return this.libc().fcntl(fd, cmd, flock);
   }

   @Override
   public Pointer allocatePosixSpawnattr() {
      return Memory.allocateDirect(this.getRuntime(), 60);
   }

   AixPOSIX(LibCProvider handler, POSIXHandler libc) {
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
   public int confstr(Confstr len, ByteBuffer name, int buf) {
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

   // $VF: Compiled from AixPOSIX.java
   private enum FlockFlags {
      LOCK_NB(4),
      LOCK_EX(2),
      LOCK_UN(8),
      LOCK_SH(1);

      private final int value;

      FlockFlags(int value) {
         this.value = value;
      }

      public final int intValue() {
         return this.value;
      }
   }
}
