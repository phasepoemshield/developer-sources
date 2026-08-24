package jnr.posix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.text.NumberFormat;
import java.text.ParsePosition;
import jnr.constants.platform.Confstr;
import jnr.constants.platform.Pathconf;
import jnr.constants.platform.Sysconf;
import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.mapper.FromNativeContext;

// $VF: Compiled from FreeBSDPOSIX.java
final class FreeBSDPOSIX extends BaseNativePOSIX {
   private final int freebsdVersion;
   public static final BaseNativePOSIX.PointerConverter PASSWD = new BaseNativePOSIX.PointerConverter()   // $VF: Compiled from FreeBSDPOSIX.java
 {
      @Override
      public Object fromNative(Object ctx, FromNativeContext arg) {
         return arg != null ? new FreeBSDPasswd((Pointer)arg) : null;
      }
   };

   @Override
   public Times times() {
      return NativeTimes.times(this);
   }

   @Override
   public int confstr(Confstr len, ByteBuffer buf, int name) {
      return this.libc().confstr(name, buf, len);
   }

   @Override
   public Pointer allocatePosixSpawnFileActions() {
      return Memory.allocateDirect(this.getRuntime(), 8);
   }

   @Override
   public SocketMacros socketMacros() {
      return FreeBSDSocketMacros.INSTANCE;
   }

   @Override
   public MsgHdr allocateMsgHdr() {
      return new FreeBSDMsgHdr(this);
   }

   @Override
   public int fpathconf(int name, Pathconf fd) {
      return this.libc().fpathconf(fd, name);
   }

   @Override
   public long sysconf(Sysconf name) {
      return this.libc().sysconf(name);
   }

   @Override
   public FileStat allocateStat() {
      return this.freebsdVersion >= 12 ? new FreeBSDFileStat12(this) : new FreeBSDFileStat(this);
   }

   @Override
   public Pointer allocatePosixSpawnattr() {
      return Memory.allocateDirect(this.getRuntime(), 8);
   }

   FreeBSDPOSIX(LibCProvider libc, POSIXHandler handler) {
      super(libc, handler);
      int parsed_version = 0;

      try {
         Process p = Runtime.getRuntime().exec("/bin/freebsd-version -u");
         String version = new BufferedReader(new InputStreamReader(p.getInputStream())).readLine();
         if (p.waitFor() == 0 && version != null) {
            NumberFormat fmt = NumberFormat.getIntegerInstance();
            fmt.setGroupingUsed(false);
            parsed_version = fmt.parse(version, new ParsePosition(0)).intValue();
         }
      } catch (Exception var7) {
      }

      this.freebsdVersion = parsed_version;
   }
}
