package jnr.ffi.provider.converters;

import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;

// $VF: Compiled from BoxedFloatArrayParameterConverter.java
@ToNativeConverter.NoContext
@ToNativeConverter.Cacheable
public class BoxedFloatArrayParameterConverter implements ToNativeConverter<Float[], float[]> {
   private static final ToNativeConverter<Float[], float[]> INOUT = new BoxedFloatArrayParameterConverter.Out(3);
   private static final ToNativeConverter<Float[], float[]> OUT = new BoxedFloatArrayParameterConverter.Out(1);
   private final int parameterFlags;
   private static final ToNativeConverter<Float[], float[]> IN = new BoxedFloatArrayParameterConverter(2);

   BoxedFloatArrayParameterConverter(int parameterFlags) {
      this.parameterFlags = parameterFlags;
   }

   public float[] toNative(Float[] array, ToNativeContext context) {
      if (array == null) {
         return null;
      }

      float[] primitive = new float[array.length];
      if (ParameterFlags.isIn(this.parameterFlags)) {
         for (int i = 0; i < array.length; i++) {
            primitive[i] = array[i] != null ? array[i] : 0.0F;
         }
      }

      return primitive;
   }

   @Override
   public Class<float[]> nativeType() {
      return float[].class;
   }

   public static ToNativeConverter<Float[], float[]> getInstance(ToNativeContext toNativeContext) {
      int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
      return ParameterFlags.isOut(parameterFlags) ? (ParameterFlags.isIn(parameterFlags) ? INOUT : OUT) : IN;
   }

   // $VF: Compiled from BoxedFloatArrayParameterConverter.java
   public static final class Out extends BoxedFloatArrayParameterConverter implements ToNativeConverter.PostInvocation<Float[], float[]> {
      public void postInvoke(Float[] context, float[] primitive, ToNativeContext array) {
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
