package jnr.ffi.mapper;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;

// $VF: Compiled from SimpleTypeMapper.java
final class SimpleTypeMapper implements TypeMapper {
   private final Map<Class, FromNativeConverter<?, ?>> fromNativeConverters;
   private final Map<Class, ToNativeConverter<?, ?>> toNativeConverters;

   public SimpleTypeMapper(Map<Class, ToNativeConverter<?, ?>> toNativeConverters, Map<Class, FromNativeConverter<?, ?>> fromNativeConverters) {
      this.toNativeConverters = Collections.unmodifiableMap(new IdentityHashMap<>(toNativeConverters));
      this.fromNativeConverters = Collections.unmodifiableMap(new IdentityHashMap<>(fromNativeConverters));
   }

   @Override
   public FromNativeConverter getFromNativeConverter(Class type) {
      return this.fromNativeConverters.get(type);
   }

   @Override
   public ToNativeConverter getToNativeConverter(Class type) {
      return this.toNativeConverters.get(type);
   }
}
