package jnr.ffi.mapper;

// $VF: Compiled from AbstractFromNativeType.java
public abstract class AbstractFromNativeType implements FromNativeType {
   private final FromNativeConverter converter;

   AbstractFromNativeType(FromNativeConverter converter) {
      this.converter = converter;
   }

   @Override
   public FromNativeConverter getFromNativeConverter() {
      return this.converter;
   }
}
