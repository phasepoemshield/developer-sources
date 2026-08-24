package jnr.ffi.provider.converters;

import jnr.ffi.mapper.DataConverter;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.util.EnumMapper;

// $VF: Compiled from EnumConverter.java
@ToNativeConverter.NoContext
@FromNativeConverter.NoContext
@ToNativeConverter.Cacheable
@FromNativeConverter.Cacheable
public final class EnumConverter implements DataConverter<Enum, Integer> {
   private final EnumMapper mapper;

   @Override
   public Class<Integer> nativeType() {
      return Integer.class;
   }

   public Enum fromNative(Integer nativeValue, FromNativeContext context) {
      return this.mapper.valueOf(nativeValue);
   }

   public static EnumConverter getInstance(Class<? extends Enum> enumClass) {
      return new EnumConverter(enumClass);
   }

   private EnumConverter(Class<? extends Enum> enumClass) {
      this.mapper = EnumMapper.getInstance(enumClass);
   }

   public Integer toNative(Enum value, ToNativeContext context) {
      return this.mapper.integerValue(value);
   }
}
