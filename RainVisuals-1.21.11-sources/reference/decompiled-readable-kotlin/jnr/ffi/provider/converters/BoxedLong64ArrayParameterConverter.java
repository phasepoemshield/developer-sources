package jnr.ffi.provider.converters;

import jnr.ffi.annotations.LongLong;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;

// $VF: Compiled from BoxedLong64ArrayParameterConverter.java
@ToNativeConverter.NoContext
@ToNativeConverter.Cacheable
public class BoxedLong64ArrayParameterConverter implements ToNativeConverter<Long[], long[]> {
   private static final ToNativeConverter<Long[], long[]> IN = new BoxedLong64ArrayParameterConverter(2);
   private final int parameterFlags;
   private static final ToNativeConverter<Long[], long[]> INOUT = new BoxedLong64ArrayParameterConverter.Out(3);
   private static final ToNativeConverter<Long[], long[]> OUT = new BoxedLong64ArrayParameterConverter.Out(1);

   @LongLong
   @Override
   public Class<long[]> nativeType() {
      return long[].class;
   }

   public static ToNativeConverter<Long[], long[]> getInstance(ToNativeContext toNativeContext) {
      int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
      return ParameterFlags.isOut(parameterFlags) ? (ParameterFlags.isIn(parameterFlags) ? INOUT : OUT) : IN;
   }

   public BoxedLong64ArrayParameterConverter(int parameterFlags) {
      this.parameterFlags = parameterFlags;
   }

   public long[] toNative(Long[] array, ToNativeContext context) {
      if (array == null) {
         return null;
      }

      long[] primitive = new long[array.length];
      if (ParameterFlags.isIn(this.parameterFlags)) {
         for (int i = 0; i < array.length; i++) {
            primitive[i] = array[i] != null ? array[i] : 0L;
         }
      }

      return primitive;
   }

   // $VF: Compiled from BoxedLong64ArrayParameterConverter.java
   public static final class Out extends BoxedLong64ArrayParameterConverter implements ToNativeConverter.PostInvocation<Long[], long[]> {
      public void postInvoke(Long[] context, long[] primitive, ToNativeContext array) {
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
