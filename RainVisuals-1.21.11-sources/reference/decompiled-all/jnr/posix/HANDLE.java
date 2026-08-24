package jnr.posix;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.mapper.DataConverter;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.ToNativeContext;

// $VF: Compiled from HANDLE.java
public final class HANDLE {
   public static final DataConverter<HANDLE, Pointer> Converter = new DataConverter<HANDLE, Pointer>()   // $VF: Compiled from HANDLE.java
 {
      public Pointer toNative(HANDLE context, ToNativeContext value) {
         return value != null ? value.pointer : null;
      }

      public HANDLE fromNative(Pointer nativeValue, FromNativeContext context) {
         return nativeValue != null ? new HANDLE(nativeValue) : null;
      }

      @Override
      public Class<Pointer> nativeType() {
         return Pointer.class;
      }
   };
   public static final long INVALID_HANDLE_VALUE = -1L;
   private final Pointer pointer;

   public final boolean isValid() {
      return this.pointer.address() != (-1L & Runtime.getSystemRuntime().addressMask());
   }

   public HANDLE(Pointer pointer) {
      this.pointer = pointer;
   }

   public static HANDLE valueOf(long value) {
      return new HANDLE(Runtime.getSystemRuntime().getMemoryManager().newPointer(value));
   }

   public static HANDLE valueOf(Pointer value) {
      return new HANDLE(value);
   }

   public final Pointer toPointer() {
      return this.pointer;
   }
}
