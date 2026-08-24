package jnr.ffi.mapper;

import java.util.HashMap;
import java.util.Map;

// $VF: Compiled from TypeMapper.java
public interface TypeMapper {
   FromNativeConverter getFromNativeConverter(Class var1);

   ToNativeConverter getToNativeConverter(Class var1);

   // $VF: Compiled from TypeMapper.java
   final class Builder {
      private final Map<Class, FromNativeConverter<?, ?>> fromNativeConverterMap;
      private final Map<Class, ToNativeConverter<?, ?>> toNativeConverterMap = new HashMap<>();

      public Builder() {
         this.fromNativeConverterMap = new HashMap<>();
      }

      public TypeMapper build() {
         return new SimpleTypeMapper(this.toNativeConverterMap, this.fromNativeConverterMap);
      }

      public <T> TypeMapper.Builder map(Class<? extends T> javaType, DataConverter<? extends T, ?> dataConverter) {
         this.toNativeConverterMap.put(javaType, dataConverter);
         this.fromNativeConverterMap.put(javaType, dataConverter);
         return this;
      }

      public <T> TypeMapper.Builder map(Class<? extends T> javaType, ToNativeConverter<? extends T, ?> toNativeConverter) {
         this.toNativeConverterMap.put(javaType, toNativeConverter);
         return this;
      }

      public <T> TypeMapper.Builder map(Class<? extends T> javaType, FromNativeConverter<? extends T, ?> fromNativeConverter) {
         this.fromNativeConverterMap.put(javaType, fromNativeConverter);
         return this;
      }
   }
}
