package jnr.ffi.mapper;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// $VF: Compiled from ToNativeType.java
public interface ToNativeType {
   ToNativeConverter getToNativeConverter();

   // $VF: Compiled from ToNativeType.java
   @Target(ElementType.TYPE)
   @Retention(RetentionPolicy.RUNTIME)
   @interface Cacheable {
   }
}
