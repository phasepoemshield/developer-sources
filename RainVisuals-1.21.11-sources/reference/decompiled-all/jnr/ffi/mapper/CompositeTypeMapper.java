package jnr.ffi.mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

// $VF: Compiled from CompositeTypeMapper.java
public final class CompositeTypeMapper implements SignatureTypeMapper {
   private final Collection<SignatureTypeMapper> signatureTypeMappers;

   public CompositeTypeMapper(Collection<SignatureTypeMapper> signatureTypeMappers) {
      this.signatureTypeMappers = Collections.unmodifiableList(new ArrayList<>(signatureTypeMappers));
   }

   @Override
   public ToNativeType getToNativeType(SignatureType context, ToNativeContext type) {
      for (SignatureTypeMapper m : this.signatureTypeMappers) {
         ToNativeType toNativeType = m.getToNativeType(type, context);
         if (toNativeType != null) {
            return toNativeType;
         }
      }

      return null;
   }

   @Override
   public FromNativeType getFromNativeType(SignatureType type, FromNativeContext context) {
      for (SignatureTypeMapper m : this.signatureTypeMappers) {
         FromNativeType fromNativeType = m.getFromNativeType(type, context);
         if (fromNativeType != null) {
            return fromNativeType;
         }
      }

      return null;
   }

   public CompositeTypeMapper(SignatureTypeMapper... signatureTypeMappers) {
      this.signatureTypeMappers = Collections.unmodifiableList(Arrays.asList((SignatureTypeMapper[])signatureTypeMappers.clone()));
   }
}
