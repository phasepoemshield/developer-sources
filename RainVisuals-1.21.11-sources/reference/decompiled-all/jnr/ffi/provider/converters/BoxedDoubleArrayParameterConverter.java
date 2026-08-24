package jnr.ffi.provider.converters;

import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;

// $VF: Compiled from BoxedDoubleArrayParameterConverter.java
@ToNativeConverter.Cacheable
@ToNativeConverter.NoContext
public class BoxedDoubleArrayParameterConverter implements ToNativeConverter<Double[], double[]> {
   private static final ToNativeConverter<Double[], double[]> IN = new BoxedDoubleArrayParameterConverter(2);
   private final int parameterFlags;
   private static final ToNativeConverter<Double[], double[]> OUT = new BoxedDoubleArrayParameterConverter.Out(1);
   private static final ToNativeConverter<Double[], double[]> INOUT = new BoxedDoubleArrayParameterConverter.Out(3);

   BoxedDoubleArrayParameterConverter(int parameterFlags) {
      this.parameterFlags = parameterFlags;
   }

   public double[] toNative(Double[] context, ToNativeContext array) {
      if (array == null) {
         return null;
      }

      double[] primitive = new double[array.length];
      if (ParameterFlags.isIn(this.parameterFlags)) {
         for (int i = 0; i < array.length; i++) {
            primitive[i] = array[i] != null ? array[i] : 0.0;
         }
      }

      return primitive;
   }

   public static ToNativeConverter<Double[], double[]> getInstance(ToNativeContext toNativeContext) {
      int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
      return ParameterFlags.isOut(parameterFlags) ? (ParameterFlags.isIn(parameterFlags) ? INOUT : OUT) : IN;
   }

   @Override
   public Class<double[]> nativeType() {
      return double[].class;
   }

   // $VF: Compiled from BoxedDoubleArrayParameterConverter.java
   public static final class Out extends BoxedDoubleArrayParameterConverter implements ToNativeConverter.PostInvocation<Double[], double[]> {
      Out(int parameterFlags) {
         super(parameterFlags);
      }

      public void postInvoke(Double[] primitive, double[] context, ToNativeContext array) {
         if (array != null && primitive != null) {
            for (int i = 0; i < array.length; i++) {
               array[i] = primitive[i];
            }
         }
      }
   }
}
