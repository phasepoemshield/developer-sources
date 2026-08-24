package jnr.ffi.byref;

// $VF: Compiled from AbstractNumberReference.java
public abstract class AbstractNumberReference<T extends Number> extends Number implements ByReference<T> {
   T value;

   @Override
   public final int intValue() {
      return this.value.intValue();
   }

   @Override
   public final long longValue() {
      return this.value.longValue();
   }

   @Override
   public final short shortValue() {
      return this.value.byteValue();
   }

   @Override
   public final float floatValue() {
      return this.value.floatValue();
   }

   @Override
   public final double doubleValue() {
      return this.value.doubleValue();
   }

   protected AbstractNumberReference(T value) {
      this.value = value;
   }

   protected static <T extends Number> T checkNull(T value) {
      if (value == null) {
         throw new NullPointerException("reference value cannot be null");
      } else {
         return value;
      }
   }

   @Override
   public final byte byteValue() {
      return this.value.byteValue();
   }

   public T getValue() {
      return this.value;
   }
}
