package jnr.ffi.mapper;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// $VF: Compiled from CachingTypeMapper.java
public final class CachingTypeMapper extends AbstractSignatureTypeMapper implements SignatureTypeMapper {
   private final SignatureTypeMapper mapper;
   private volatile Map<SignatureType, FromNativeType> fromNativeTypeMap;
   private static final CachingTypeMapper.InvalidType UNCACHEABLE_TYPE = new CachingTypeMapper.InvalidType();
   private static final CachingTypeMapper.InvalidType NO_TYPE = new CachingTypeMapper.InvalidType();
   private volatile Map<SignatureType, ToNativeType> toNativeTypeMap = Collections.emptyMap();

   private synchronized FromNativeType lookupAndCacheFromNativeType(SignatureType signature, FromNativeContext context) {
      FromNativeType fromNativeType = this.fromNativeTypeMap.get(signature);
      if (fromNativeType == null) {
         fromNativeType = this.mapper.getFromNativeType(signature, context);
         FromNativeType typeForCaching = fromNativeType;
         if (fromNativeType == null) {
            typeForCaching = NO_TYPE;
         } else if (!fromNativeType.getClass().isAnnotationPresent(FromNativeType.Cacheable.class)) {
            typeForCaching = UNCACHEABLE_TYPE;
         }

         Map<SignatureType, FromNativeType> m = new HashMap(this.fromNativeTypeMap.size() + 1);
         m.putAll(this.fromNativeTypeMap);
         m.put(signature, typeForCaching);
         this.fromNativeTypeMap = Collections.unmodifiableMap(m);
      }

      return fromNativeType != NO_TYPE ? fromNativeType : null;
   }

   @Override
   public FromNativeType getFromNativeType(SignatureType context, FromNativeContext type) {
      FromNativeType fromNativeType = this.fromNativeTypeMap.get(type);
      if (fromNativeType == UNCACHEABLE_TYPE) {
         return this.mapper.getFromNativeType(type, context);
      } else if (fromNativeType == NO_TYPE) {
         return null;
      } else {
         return fromNativeType != null ? fromNativeType : this.lookupAndCacheFromNativeType(type, context);
      }
   }

   private synchronized ToNativeType lookupAndCacheToNativeType(SignatureType context, ToNativeContext signature) {
      ToNativeType toNativeType = this.toNativeTypeMap.get(signature);
      if (toNativeType == null) {
         toNativeType = this.mapper.getToNativeType(signature, context);
         ToNativeType typeForCaching = toNativeType;
         if (toNativeType == null) {
            typeForCaching = NO_TYPE;
         } else if (!toNativeType.getClass().isAnnotationPresent(ToNativeType.Cacheable.class)) {
            typeForCaching = UNCACHEABLE_TYPE;
         }

         Map<SignatureType, ToNativeType> m = new HashMap(this.toNativeTypeMap.size() + 1);
         m.putAll(this.toNativeTypeMap);
         m.put(signature, typeForCaching);
         this.toNativeTypeMap = Collections.unmodifiableMap(m);
      }

      return toNativeType != NO_TYPE ? toNativeType : null;
   }

   @Override
   public ToNativeType getToNativeType(SignatureType context, ToNativeContext type) {
      ToNativeType toNativeType = this.toNativeTypeMap.get(type);
      if (toNativeType == UNCACHEABLE_TYPE) {
         return this.mapper.getToNativeType(type, context);
      } else if (toNativeType == NO_TYPE) {
         return null;
      } else {
         return toNativeType != null ? toNativeType : this.lookupAndCacheToNativeType(type, context);
      }
   }

   public CachingTypeMapper(SignatureTypeMapper mapper) {
      this.fromNativeTypeMap = Collections.emptyMap();
      this.mapper = mapper;
   }

   // $VF: Compiled from CachingTypeMapper.java
   private static final class InvalidType implements FromNativeType, ToNativeType {
      @Override
      public ToNativeConverter getToNativeConverter() {
         return null;
      }

      private InvalidType() {
      }

      @Override
      public FromNativeConverter getFromNativeConverter() {
         return null;
      }
   }
}
