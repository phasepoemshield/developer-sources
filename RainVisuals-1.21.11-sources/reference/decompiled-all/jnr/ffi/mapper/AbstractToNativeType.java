package jnr.ffi.mapper;

// $VF: Compiled from AbstractToNativeType.java
public abstract class AbstractToNativeType implements ToNativeType {
   private final ToNativeConverter converter;

   AbstractToNativeType(ToNativeConverter converter) {
      this.converter = converter;
   }

   @Override
   public ToNativeConverter getToNativeConverter() {
      return this.converter;
   }
}
