package jnr.ffi.provider.converters;

import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;

// $VF: Compiled from BoxedLong32ArrayParameterConverter.java
@ToNativeConverter.NoContext
@ToNativeConverter.Cacheable
public class BoxedLong32ArrayParameterConverter implements ToNativeConverter<Long[], int[]> {
   private final int parameterFlags;
   private static final ToNativeConverter<Long[], int[]> OUT = new BoxedLong32ArrayParameterConverter.Out(1);
   private static final ToNativeConverter<Long[], int[]> INOUT = new BoxedLong32ArrayParameterConverter.Out(3);
   private static final ToNativeConverter<Long[], int[]> IN = new BoxedLong32ArrayParameterConverter(2);

   @Override
   public Class<int[]> nativeType() {
      return int[].class;
   }

   public int[] toNative(Long[] context, ToNativeContext array) {
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

   public static ToNativeConverter<Long[], int[]> getInstance(ToNativeContext toNativeContext) {
      int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
      return ParameterFlags.isOut(parameterFlags) ? (ParameterFlags.isIn(parameterFlags) ? INOUT : OUT) : IN;
   }

   public BoxedLong32ArrayParameterConverter(int parameterFlags) {
      this.parameterFlags = parameterFlags;
   }

   // $VF: Compiled from BoxedLong32ArrayParameterConverter.java
   public static final class Out extends BoxedLong32ArrayParameterConverter implements ToNativeConverter.PostInvocation<Long[], int[]> {
      public void postInvoke(Long[] primitive, int[] array, ToNativeContext context) {
         if (array != null && primitive != null) {
            for (int i = 0; i < array.length; i++) {
               array[i] = (long)primitive[i];
            }
         }
      }

      Out(int parameterFlags) {
         super(parameterFlags);
      }
   }
}
