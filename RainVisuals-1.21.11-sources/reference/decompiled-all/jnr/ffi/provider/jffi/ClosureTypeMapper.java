package jnr.ffi.provider.jffi;

import jnr.ffi.Struct;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.FromNativeType;
import jnr.ffi.mapper.FromNativeTypes;
import jnr.ffi.mapper.SignatureType;
import jnr.ffi.mapper.SignatureTypeMapper;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.mapper.ToNativeType;
import jnr.ffi.mapper.ToNativeTypes;
import jnr.ffi.provider.converters.EnumConverter;
import jnr.ffi.provider.converters.StringResultConverter;
import jnr.ffi.provider.converters.StructByReferenceToNativeConverter;

// $VF: Compiled from ClosureTypeMapper.java
final class ClosureTypeMapper implements SignatureTypeMapper {
   private ToNativeConverter getToNativeConverter(SignatureType type, ToNativeContext context) {
      if (Enum.class.isAssignableFrom(type.getDeclaredType())) {
         return EnumConverter.getInstance(type.getDeclaredType().asSubclass(Enum.class));
      } else {
         return Struct.class.isAssignableFrom(type.getDeclaredType()) ? StructByReferenceToNativeConverter.getInstance(context) : null;
      }
   }

   private FromNativeConverter getFromNativeConverter(SignatureType context, FromNativeContext type) {
      if (Enum.class.isAssignableFrom(type.getDeclaredType())) {
         return EnumConverter.getInstance(type.getDeclaredType().asSubclass(Enum.class));
      } else {
         return CharSequence.class.isAssignableFrom(type.getDeclaredType()) ? StringResultConverter.getInstance(context) : null;
      }
   }

   @Override
   public FromNativeType getFromNativeType(SignatureType type, FromNativeContext context) {
      return FromNativeTypes.create(this.getFromNativeConverter(type, context));
   }

   @Override
   public ToNativeType getToNativeType(SignatureType context, ToNativeContext type) {
      return ToNativeTypes.create(this.getToNativeConverter(type, context));
   }
}
