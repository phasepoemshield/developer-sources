package jnr.posix;

import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.posix.util.WindowsHelpers;

// $VF: Compiled from WString.java
public final class WString {
   private final byte[] bytes;
   static final Runtime runtime = Runtime.getSystemRuntime();
   public static final ToNativeConverter<WString, Pointer> Converter = new ToNativeConverter<WString, Pointer>()   // $VF: Compiled from WString.java
 {
      @Override
      public Class<Pointer> nativeType() {
         return Pointer.class;
      }

      public Pointer toNative(WString context, ToNativeContext value) {
         if (value == null) {
            return null;
         }

         Pointer memory = Memory.allocateDirect(WString.runtime, value.bytes.length + 1, true);
         memory.put(0L, value.bytes, 0, value.bytes.length);
         return memory;
      }
   };

   public static byte[] path(String path, boolean longPathExtensionNeeded) {
      if (longPathExtensionNeeded && path.length() > 240) {
         if (path.startsWith("//")) {
            path = "//?/UNC/" + path.substring(2);
         } else if (path.startsWith("\\\\")) {
            path = "\\\\?\\UNC\\" + path.substring(2);
         } else if (WindowsHelpers.isDriveLetterPath(path)) {
            if (path.contains("/")) {
               path = "//?/" + path;
            } else {
               path = "\\\\?\\" + path;
            }
         }
      }

      return WindowsHelpers.toWPath(path);
   }

   WString(String string) {
      this.bytes = WindowsHelpers.toWString(string);
   }

   public static WString path(String path) {
      return new WString(path(path, false));
   }

   private WString(byte[] bytes) {
      this.bytes = bytes;
   }
}
