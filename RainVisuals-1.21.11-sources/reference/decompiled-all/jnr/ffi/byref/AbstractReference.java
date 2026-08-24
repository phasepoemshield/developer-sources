package jnr.ffi.byref;

// $VF: Compiled from AbstractReference.java
public abstract class AbstractReference<T> implements ByReference<T> {
   T value;

   @Override
   public T getValue() {
      return this.value;
   }

   protected AbstractReference(T value) {
      this.value = value;
   }

   protected static <T> T checkNull(T value) {
      if (value == null) {
         throw new NullPointerException("reference value cannot be null");
      } else {
         return value;
      }
   }
}
