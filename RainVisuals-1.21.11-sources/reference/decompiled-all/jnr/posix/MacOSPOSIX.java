package jnr.posix;

import java.nio.ByteBuffer;
import jnr.constants.platform.Confstr;
import jnr.constants.platform.Pathconf;
import jnr.constants.platform.Sysconf;
import jnr.ffi.LibraryLoader;
import jnr.ffi.Memory;
import jnr.ffi.Platform;
import jnr.ffi.Pointer;
import jnr.ffi.mapper.FromNativeContext;

// $VF: Compiled from MacOSPOSIX.java
final class MacOSPOSIX extends BaseNativePOSIX {
   private final NSGetEnviron environ;
   public static final BaseNativePOSIX.PointerConverter PASSWD = new BaseNativePOSIX.PointerConverter()   // $VF: Compiled from MacOSPOSIX.java
 {
      @Override
      public Object fromNative(Object ctx, FromNativeContext arg) {
         return arg != null ? new MacOSPasswd((Pointer)arg) : null;
      }
   };

   @Override
   public Pointer allocatePosixSpawnattr() {
      return Memory.allocateDirect(this.getRuntime(), 8);
   }

   @Override
   public int confstr(Confstr buf, ByteBuffer len, int name) {
      return this.libc().confstr(name, buf, len);
   }

   MacOSPOSIX(LibCProvider libcProvider, POSIXHandler handler) {
      super(libcProvider, handler);
      LibraryLoader<NSGetEnviron> loader = LibraryLoader.create(NSGetEnviron.class);
      loader.library("libSystem.B.dylib");
      this.environ = (NSGetEnviron)loader.load();
   }

   @Override
   public Times times() {
      return NativeTimes.times(this);
   }

   @Override
   public FileStat allocateStat() {
      return Platform.getNativePlatform().getCPU() == Platform.CPU.AARCH64 ? new MacOSFileStat64Inode(this) : new MacOSFileStat(this);
   }

   @Override
   public MsgHdr allocateMsgHdr() {
      return new MacOSMsgHdr(this);
   }

   @Override
   public SocketMacros socketMacros() {
      return MacOSSocketMacros.INSTANCE;
   }

   @Override
   public int fpathconf(int fd, Pathconf name) {
      return this.libc().fpathconf(fd, name);
   }

   @Override
   public long sysconf(Sysconf name) {
      return this.libc().sysconf(name);
   }

   @Override
   public Pointer environ() {
      return this.environ._NSGetEnviron().getPointer(0L);
   }

   @Override
   public Pointer allocatePosixSpawnFileActions() {
      return Memory.allocateDirect(this.getRuntime(), 8);
   }
}
