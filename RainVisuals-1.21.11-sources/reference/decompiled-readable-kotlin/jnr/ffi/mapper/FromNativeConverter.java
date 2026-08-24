package jnr.ffi.mapper;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// $VF: Compiled from FromNativeConverter.java
public interface FromNativeConverter<J, N> {
   J fromNative(N var1, FromNativeContext var2);

   Class<N> nativeType();

   // $VF: Compiled from FromNativeConverter.java
   @Target(ElementType.TYPE)
   @Retention(RetentionPolicy.RUNTIME)
   @interface Cacheable {
   }

   // $VF: Compiled from FromNativeConverter.java
   @Target(ElementType.METHOD)
   @Retention(RetentionPolicy.RUNTIME)
   @interface FromNative {
      Class nativeType();
   }

   // $VF: Compiled from FromNativeConverter.java
   @Retention(RetentionPolicy.RUNTIME)
   @Target({ElementType.TYPE, ElementType.METHOD})
   @interface NoContext {
   }
}
