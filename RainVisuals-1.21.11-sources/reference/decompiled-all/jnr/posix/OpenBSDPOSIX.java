package jnr.posix;

import java.nio.ByteBuffer;
import jnr.constants.platform.Confstr;
import jnr.constants.platform.Pathconf;
import jnr.constants.platform.Sysconf;
import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.Struct;
import jnr.ffi.mapper.FromNativeContext;
import jnr.posix.util.MethodName;

// $VF: Compiled from OpenBSDPOSIX.java
final class OpenBSDPOSIX extends BaseNativePOSIX {
   public static final BaseNativePOSIX.PointerConverter PASSWD = new BaseNativePOSIX.PointerConverter()   // $VF: Compiled from OpenBSDPOSIX.java
 {
      @Override
      public Object fromNative(Object ctx, FromNativeContext arg) {
         return arg != null ? new OpenBSDPasswd((Pointer)arg) : null;
      }
   };

   @Override
   public int fpathconf(int name, Pathconf fd) {
      return this.libc().fpathconf(fd, name);
   }

   @Override
   public FileStat allocateStat() {
      return new OpenBSDFileStat(this);
   }

   @Override
   public int utimes(String path, long[] atimeval, long[] mtimeval) {
      Timeval[] times = null;
      if (atimeval != null && mtimeval != null) {
         times = Struct.arrayOf(this.getRuntime(), OpenBSDTimeval.class, 2);
         times[0].setTime(atimeval);
         times[1].setTime(mtimeval);
      }

      return this.libc().utimes(path, times);
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

   OpenBSDPOSIX(LibCProvider handler, POSIXHandler libc) {
      super(libc, handler);
   }

   @Override
   public SocketMacros socketMacros() {
      this.handler.unimplementedError(MethodName.getCallerMethodName());
      return null;
   }
}
