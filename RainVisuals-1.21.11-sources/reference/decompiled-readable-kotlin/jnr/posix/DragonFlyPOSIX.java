package jnr.posix;

import java.nio.ByteBuffer;
import jnr.constants.platform.Confstr;
import jnr.constants.platform.Pathconf;
import jnr.constants.platform.Sysconf;
import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.mapper.FromNativeContext;
import jnr.posix.util.MethodName;

// $VF: Compiled from DragonFlyPOSIX.java
final class DragonFlyPOSIX extends BaseNativePOSIX {
   public static final BaseNativePOSIX.PointerConverter PASSWD = new BaseNativePOSIX.PointerConverter()   // $VF: Compiled from DragonFlyPOSIX.java
 {
      @Override
      public Object fromNative(Object arg, FromNativeContext ctx) {
         return arg != null ? new DragonFlyPasswd((Pointer)arg) : null;
      }
   };

   @Override
   public Pointer allocatePosixSpawnattr() {
      return Memory.allocateDirect(this.getRuntime(), 8);
   }

   @Override
   public int fpathconf(int name, Pathconf fd) {
      return this.libc().fpathconf(fd, name);
   }

   @Override
   public Times times() {
      return NativeTimes.times(this);
   }

   DragonFlyPOSIX(LibCProvider handler, POSIXHandler libc) {
      super(libc, handler);
   }

   @Override
   public int confstr(Confstr name, ByteBuffer buf, int len) {
      return this.libc().confstr(name, buf, len);
   }

   @Override
   public FileStat allocateStat() {
      return new DragonFlyFileStat(this);
   }

   @Override
   public Pointer allocatePosixSpawnFileActions() {
      return Memory.allocateDirect(this.getRuntime(), 8);
   }

   @Override
   public long sysconf(Sysconf name) {
      return this.libc().sysconf(name);
   }

   @Override
   public SocketMacros socketMacros() {
      this.handler.unimplementedError(MethodName.getCallerMethodName());
      return null;
   }

   @Override
   public MsgHdr allocateMsgHdr() {
      this.handler.unimplementedError(MethodName.getCallerMethodName());
      return null;
   }
}
