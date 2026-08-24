package jnr.ffi.mapper;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// $VF: Compiled from ToNativeConverter.java
public interface ToNativeConverter<J, N> {
   N toNative(J var1, ToNativeContext var2);

   Class<N> nativeType();

   // $VF: Compiled from ToNativeConverter.java
   @Target(ElementType.TYPE)
   @Retention(RetentionPolicy.RUNTIME)
   @interface Cacheable {
   }

   // $VF: Compiled from ToNativeConverter.java
   @Retention(RetentionPolicy.RUNTIME)
   @Target({ElementType.TYPE, ElementType.METHOD})
   @interface NoContext {
   }

   // $VF: Compiled from ToNativeConverter.java
   interface PostInvocation<J, N> extends ToNativeConverter<J, N> {
      void postInvoke(J var1, N var2, ToNativeContext var3);
   }

   // $VF: Compiled from ToNativeConverter.java
   @Retention(RetentionPolicy.RUNTIME)
   @Target(ElementType.METHOD)
   @interface ToNative {
      Class nativeType();
   }
}
