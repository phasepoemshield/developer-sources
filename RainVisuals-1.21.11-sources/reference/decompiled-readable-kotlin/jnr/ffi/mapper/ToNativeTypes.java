package jnr.ffi.mapper;

// $VF: Compiled from ToNativeTypes.java
public final class ToNativeTypes {
   public static ToNativeType create(ToNativeConverter converter) {
      if (converter == null) {
         return null;
      } else {
         return converter.getClass().isAnnotationPresent(ToNativeConverter.Cacheable.class)
            ? new ToNativeTypes.Cacheable(converter)
            : new ToNativeTypes.UnCacheable(converter);
      }
   }

   // $VF: Compiled from ToNativeTypes.java
   @ToNativeType.Cacheable
   static class Cacheable extends AbstractToNativeType {
      public Cacheable(ToNativeConverter converter) {
         super(converter);
      }
   }

   // $VF: Compiled from ToNativeTypes.java
   static class UnCacheable extends AbstractToNativeType {
      public UnCacheable(ToNativeConverter converter) {
         super(converter);
      }
   }
}
