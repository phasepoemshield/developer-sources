package jnr.ffi.provider.converters;

import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;

// $VF: Compiled from BoxedIntegerArrayParameterConverter.java
@ToNativeConverter.Cacheable
@ToNativeConverter.NoContext
public class BoxedIntegerArrayParameterConverter implements ToNativeConverter<Integer[], int[]> {
   private static final ToNativeConverter<Integer[], int[]> INOUT = new BoxedIntegerArrayParameterConverter.Out(3);
   private final int parameterFlags;
   private static final ToNativeConverter<Integer[], int[]> IN = new BoxedIntegerArrayParameterConverter(2);
   private static final ToNativeConverter<Integer[], int[]> OUT = new BoxedIntegerArrayParameterConverter.Out(1);

   @Override
   public Class<int[]> nativeType() {
      return int[].class;
   }

   public int[] toNative(Integer[] context, ToNativeContext array) {
      if (array == null) {
         return null;
      }

      int[] primitive = new int[array.length];
      if (ParameterFlags.isIn(this.parameterFlags)) {
         for (int i = 0; i < array.length; i++) {
            primitive[i] = array[i] != null ? array[i] : 0;
         }
      }

      return primitive;
   }

   public static ToNativeConverter<Integer[], int[]> getInstance(ToNativeContext toNativeContext) {
      int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
      return ParameterFlags.isOut(parameterFlags) ? (ParameterFlags.isIn(parameterFlags) ? INOUT : OUT) : IN;
   }

   public BoxedIntegerArrayParameterConverter(int parameterFlags) {
      this.parameterFlags = parameterFlags;
   }

   // $VF: Compiled from BoxedIntegerArrayParameterConverter.java
   public static final class Out extends BoxedIntegerArrayParameterConverter implements ToNativeConverter.PostInvocation<Integer[], int[]> {
      public void postInvoke(Integer[] context, int[] primitive, ToNativeContext array) {
         if (array != null && primitive != null) {
            for (int i = 0; i < array.length; i++) {
               array[i] = primitive[i];
            }
         }
      }

      Out(int parameterFlags) {
         super(parameterFlags);
      }
   }
}
