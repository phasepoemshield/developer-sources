package jnr.ffi.mapper;

// $VF: Compiled from FromNativeTypes.java
public final class FromNativeTypes {
   public static FromNativeType create(FromNativeConverter converter) {
      if (converter == null) {
         return null;
      } else {
         return converter.getClass().isAnnotationPresent(FromNativeConverter.Cacheable.class)
            ? new FromNativeTypes.Cacheable(converter)
            : new FromNativeTypes.UnCacheable(converter);
      }
   }

   // $VF: Compiled from FromNativeTypes.java
   @FromNativeType.Cacheable
   static class Cacheable extends AbstractFromNativeType {
      public Cacheable(FromNativeConverter converter) {
         super(converter);
      }
   }

   // $VF: Compiled from FromNativeTypes.java
   static class UnCacheable extends AbstractFromNativeType {
      public UnCacheable(FromNativeConverter converter) {
         super(converter);
      }
   }
}
