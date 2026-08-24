package jnr.ffi.mapper;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// $VF: Compiled from FromNativeType.java
public interface FromNativeType {
   FromNativeConverter getFromNativeConverter();

   // $VF: Compiled from FromNativeType.java
   @Target(ElementType.TYPE)
   @Retention(RetentionPolicy.RUNTIME)
   @interface Cacheable {
   }
}
