package jnr.unixsocket;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import jnr.constants.platform.ProtocolFamily;
import jnr.ffi.Platform;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;

// $VF: Compiled from SockAddrUnix.java
abstract class SockAddrUnix extends Struct {
   private java.lang.String cachedPath;
   private static transient Platform.OS currentOS = Platform.getNativePlatform().getOS();
   public static final int ADDR_LENGTH = 108;
   public static final int HEADER_LENGTH = 2;

   final void setFamily(ProtocolFamily family) {
      this.getFamilyField().set(family.intValue());
   }

   final ProtocolFamily getFamily() {
      return ProtocolFamily.valueOf(this.getFamilyField().intValue());
   }

   void updatePath(int len) {
      if (currentOS == Platform.OS.LINUX) {
         this.cachedPath = len == 2 ? "" : this.getPath(len + -2);
      } else {
         this.cachedPath = this.getPathField().get();
         int slen = len + -2;
         if (slen <= 0) {
            this.cachedPath = "";
         } else if (slen < this.getPathField().length() && slen < this.cachedPath.length()) {
            this.cachedPath = this.cachedPath.substring(0, slen);
         }
      }
   }

   protected abstract Struct.UTF8String getPathField();

   static SockAddrUnix create() {
      return Platform.getNativePlatform().isBSD() ? new SockAddrUnix.BSDSockAddrUnix() : new SockAddrUnix.DefaultSockAddrUnix();
   }

   int getHeaderLength() {
      return 2;
   }

   private static final int strlen(Struct.UTF8String str) {
      int end = str.getMemory().indexOf(str.offset(), (byte)0);
      return end >= 0 ? end : str.length();
   }

   int length() {
      return currentOS == Platform.OS.LINUX && null != this.cachedPath ? 2 + this.cachedPath.length() : 2 + strlen(this.getPathField());
   }

   void setPath(java.lang.String path) {
      this.cachedPath = path;
      this.getPathField().set(this.cachedPath);
   }

   final java.lang.String getPath() {
      if (null == this.cachedPath) {
         this.cachedPath = this.getPathField().get();
      }

      return this.cachedPath;
   }

   SockAddrUnix() {
      super(Runtime.getSystemRuntime());
   }

   int getMaximumLength() {
      return 2 + this.getPathField().length();
   }

   final java.lang.String getPath(int len) {
      Struct.UTF8String str = this.getPathField();
      byte[] ba = new byte[str.length()];
      str.getMemory().get(str.offset(), ba, 0, len);
      if (0 != ba[0]) {
         len--;
      }

      return new java.lang.String(Arrays.copyOf(ba, len), StandardCharsets.UTF_8);
   }

   protected abstract Struct.NumberField getFamilyField();

   // $VF: Compiled from SockAddrUnix.java
   static final class BSDSockAddrUnix extends SockAddrUnix {
      public final Struct.UTF8String sun_addr;
      public final Struct.Unsigned8 sun_len = new Struct.Unsigned8();
      public final Struct.Unsigned8 sun_family = new Struct.Unsigned8();

      BSDSockAddrUnix() {
         this.sun_addr = new Struct.UTF8String(108);
      }

      @Override
      protected Struct.UTF8String getPathField() {
         return this.sun_addr;
      }

      @Override
      public void setPath(java.lang.String path) {
         super.setPath(path);
         this.sun_len.set(Integer.valueOf(path.length()));
      }

      @Override
      protected Struct.NumberField getFamilyField() {
         return this.sun_family;
      }
   }

   // $VF: Compiled from SockAddrUnix.java
   static final class DefaultSockAddrUnix extends SockAddrUnix {
      public final Struct.UTF8String sun_addr;
      public final Struct.Unsigned16 sun_family = new Struct.Unsigned16();

      DefaultSockAddrUnix() {
         this.sun_addr = new Struct.UTF8String(108);
      }

      @Override
      protected Struct.UTF8String getPathField() {
         return this.sun_addr;
      }

      @Override
      protected Struct.NumberField getFamilyField() {
         return this.sun_family;
      }
   }
}
