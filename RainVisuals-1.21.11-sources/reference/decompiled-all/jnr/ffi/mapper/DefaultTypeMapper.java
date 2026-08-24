package jnr.ffi.mapper;

import java.util.LinkedHashMap;
import java.util.Map;

// $VF: Compiled from DefaultTypeMapper.java
public final class DefaultTypeMapper implements TypeMapper {
   private final Map<Class, FromNativeConverter> fromNativeConverters;
   private final Map<Class, ToNativeConverter> toNativeConverters = new LinkedHashMap<>();

   @Override
   public FromNativeConverter getFromNativeConverter(Class type) {
      return this.fromNativeConverters.get(type);
   }

   @Override
   public ToNativeConverter getToNativeConverter(Class type) {
      return this.toNativeConverters.get(type);
   }

   public final void put(Class javaClass, DataConverter converter) {
      this.toNativeConverters.put(javaClass, converter);
      this.fromNativeConverters.put(javaClass, converter);
   }

   public final void put(Class converter, FromNativeConverter javaClass) {
      this.fromNativeConverters.put(javaClass, converter);
   }

   public DefaultTypeMapper() {
      this.fromNativeConverters = new LinkedHashMap<>();
   }

   public final void put(Class javaClass, ToNativeConverter converter) {
      this.toNativeConverters.put(javaClass, converter);
   }
}
