package jnr.ffi.mapper;

// $VF: Compiled from SignatureTypeMapperAdapter.java
public class SignatureTypeMapperAdapter implements SignatureTypeMapper {
   private final TypeMapper typeMapper;

   @Override
   public FromNativeType getFromNativeType(SignatureType context, FromNativeContext type) {
      return FromNativeTypes.create(this.typeMapper.getFromNativeConverter(type.getDeclaredType()));
   }

   @Override
   public ToNativeType getToNativeType(SignatureType type, ToNativeContext context) {
      return ToNativeTypes.create(this.typeMapper.getToNativeConverter(type.getDeclaredType()));
   }

   public SignatureTypeMapperAdapter(TypeMapper typeMapper) {
      this.typeMapper = typeMapper;
   }
}
