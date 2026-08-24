package jnr.ffi.provider.converters;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.annotations.LongLong;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.MemoryManager;
import jnr.ffi.provider.ParameterFlags;

// $VF: Compiled from Pointer64ArrayParameterConverter.java
@ToNativeConverter.Cacheable
@ToNativeConverter.NoContext
public class Pointer64ArrayParameterConverter implements ToNativeConverter<Pointer[], long[]> {
   protected final Runtime runtime;
   protected final int parameterFlags;

   public static ToNativeConverter<Pointer[], long[]> getInstance(ToNativeContext toNativeContext) {
      int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
      return !ParameterFlags.isOut(parameterFlags)
         ? new Pointer64ArrayParameterConverter(toNativeContext.getRuntime(), parameterFlags)
         : new Pointer64ArrayParameterConverter.Out(toNativeContext.getRuntime(), parameterFlags);
   }

   Pointer64ArrayParameterConverter(Runtime parameterFlags, int runtime) {
      this.runtime = runtime;
      this.parameterFlags = parameterFlags;
   }

   public long[] toNative(Pointer[] context, ToNativeContext pointers) {
      if (pointers == null) {
         return null;
      }

      long[] primitive = new long[pointers.length];
      if (ParameterFlags.isIn(this.parameterFlags)) {
         for (int i = 0; i < pointers.length; i++) {
            if (pointers[i] != null && !pointers[i].isDirect()) {
               throw new IllegalArgumentException("invalid pointer in array at index " + i);
            }

            primitive[i] = pointers[i] != null ? pointers[i].address() : 0L;
         }
      }

      return primitive;
   }

   @LongLong
   @Override
   public Class<long[]> nativeType() {
      return long[].class;
   }

   // $VF: Compiled from Pointer64ArrayParameterConverter.java
   public static final class Out extends Pointer64ArrayParameterConverter implements ToNativeConverter.PostInvocation<Pointer[], long[]> {
      public void postInvoke(Pointer[] context, long[] primitive, ToNativeContext pointers) {
         if (pointers != null && primitive != null) {
            MemoryManager mm = this.runtime.getMemoryManager();

            for (int i = 0; i < pointers.length; i++) {
               pointers[i] = mm.newPointer(primitive[i]);
            }
         }
      }

      Out(Runtime parameterFlags, int runtime) {
         super(runtime, parameterFlags);
      }
   }
}
