package jnr.ffi.provider.converters;

import jnr.ffi.NativeLong;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;

// $VF: Compiled from NativeLong32ArrayParameterConverter.java
@ToNativeConverter.NoContext
@ToNativeConverter.Cacheable
public class NativeLong32ArrayParameterConverter implements ToNativeConverter<NativeLong[], int[]> {
   private static final ToNativeConverter<NativeLong[], int[]> IN = new NativeLong32ArrayParameterConverter(2);
   private static final ToNativeConverter<NativeLong[], int[]> INOUT = new NativeLong32ArrayParameterConverter.Out(3);
   private final int parameterFlags;
   private static final ToNativeConverter<NativeLong[], int[]> OUT = new NativeLong32ArrayParameterConverter.Out(1);

   @Override
   public Class<int[]> nativeType() {
      return int[].class;
   }

   public int[] toNative(NativeLong[] context, ToNativeContext array) {
      if (array == null) {
         return null;
      }

      int[] primitive = new int[array.length];
      if (ParameterFlags.isIn(this.parameterFlags)) {
         for (int i = 0; i < array.length; i++) {
            primitive[i] = array[i] != null ? array[i].intValue() : 0;
         }
      }

      return primitive;
   }

   NativeLong32ArrayParameterConverter(int parameterFlags) {
      this.parameterFlags = parameterFlags;
   }

   public static ToNativeConverter<NativeLong[], int[]> getInstance(ToNativeContext toNativeContext) {
      int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
      return ParameterFlags.isOut(parameterFlags) ? (ParameterFlags.isIn(parameterFlags) ? INOUT : OUT) : IN;
   }

   // $VF: Compiled from NativeLong32ArrayParameterConverter.java
   public static final class Out extends NativeLong32ArrayParameterConverter implements ToNativeConverter.PostInvocation<NativeLong[], int[]> {
      public void postInvoke(NativeLong[] context, int[] array, ToNativeContext primitive) {
         if (array != null && primitive != null) {
            for (int i = 0; i < array.length; i++) {
               array[i] = NativeLong.valueOf(primitive[i]);
            }
         }
      }

      Out(int parameterFlags) {
         super(parameterFlags);
      }
   }
}
