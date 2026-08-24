package jnr.ffi.provider.converters;

import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;

// $VF: Compiled from Long32ArrayParameterConverter.java
@ToNativeConverter.NoContext
@ToNativeConverter.Cacheable
public class Long32ArrayParameterConverter implements ToNativeConverter<long[], int[]> {
   private final int parameterFlags;
   private static final Long32ArrayParameterConverter OUT = new Long32ArrayParameterConverter.Out(1);
   private static final Long32ArrayParameterConverter IN = new Long32ArrayParameterConverter(2);
   private static final Long32ArrayParameterConverter INOUT = new Long32ArrayParameterConverter.Out(3);

   @Override
   public Class<int[]> nativeType() {
      return int[].class;
   }

   private Long32ArrayParameterConverter(int parameterFlags) {
      this.parameterFlags = parameterFlags;
   }

   public int[] toNative(long[] context, ToNativeContext array) {
      if (array == null) {
         return null;
      }

      int[] primitive = new int[array.length];
      if (ParameterFlags.isIn(this.parameterFlags)) {
         for (int i = 0; i < array.length; i++) {
            primitive[i] = (int)array[i];
         }
      }

      return primitive;
   }

   public static ToNativeConverter<long[], int[]> getInstance(ToNativeContext toNativeContext) {
      int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
      return ParameterFlags.isOut(parameterFlags) ? (ParameterFlags.isIn(parameterFlags) ? INOUT : OUT) : IN;
   }

   // $VF: Compiled from Long32ArrayParameterConverter.java
   public static final class Out extends Long32ArrayParameterConverter implements ToNativeConverter.PostInvocation<long[], int[]> {
      Out(int parameterFlags) {
         super(parameterFlags);
      }

      public void postInvoke(long[] context, int[] primitive, ToNativeContext array) {
         if (array != null && primitive != null) {
            for (int i = 0; i < array.length; i++) {
               array[i] = primitive[i];
            }
         }
      }
   }
}
