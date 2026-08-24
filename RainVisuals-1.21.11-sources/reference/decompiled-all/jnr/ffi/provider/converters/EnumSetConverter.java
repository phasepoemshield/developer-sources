package jnr.ffi.provider.converters;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
import java.util.Set;
import jnr.ffi.mapper.DataConverter;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.SignatureType;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.util.EnumMapper;

// $VF: Compiled from EnumSetConverter.java
@FromNativeConverter.Cacheable
@ToNativeConverter.Cacheable
public final class EnumSetConverter implements DataConverter<Set<? extends Enum>, Integer> {
   private final EnumMapper enumMapper;
   private final Class<? extends Enum> enumClass;
   private final EnumSet<? extends Enum> allValues;

   @Override
   public Class<Integer> nativeType() {
      return Integer.class;
   }

   public static ToNativeConverter<Set<? extends Enum>, Integer> getToNativeConverter(SignatureType toNativeContext, ToNativeContext type) {
      return getInstance(type.getGenericType());
   }

   private EnumSetConverter(Class<? extends Enum> enumClass) {
      this.enumClass = enumClass;
      this.enumMapper = EnumMapper.getInstance(enumClass);
      this.allValues = EnumSet.allOf(enumClass);
   }

   public Integer toNative(Set<? extends Enum> value, ToNativeContext context) {
      int intValue = 0;

      for (Enum e : value) {
         intValue |= this.enumMapper.intValue(e);
      }

      return intValue;
   }

   private static EnumSetConverter getInstance(Type parameterizedType) {
      if (!(parameterizedType instanceof ParameterizedType)) {
         return null;
      }

      if (((ParameterizedType)parameterizedType).getActualTypeArguments().length < 1) {
         return null;
      }

      Type enumType = ((ParameterizedType)parameterizedType).getActualTypeArguments()[0];
      return enumType instanceof Class && Enum.class.isAssignableFrom((Class<?>)enumType)
         ? new EnumSetConverter(((Class)enumType).asSubclass(Enum.class))
         : null;
   }

   public static FromNativeConverter<Set<? extends Enum>, Integer> getFromNativeConverter(SignatureType fromNativeContext, FromNativeContext type) {
      return getInstance(type.getGenericType());
   }

   public Set fromNative(Integer context, FromNativeContext nativeValue) {
      EnumSet enums = EnumSet.noneOf(this.enumClass);

      for (Enum e : this.allValues) {
         int enumValue = this.enumMapper.intValue(e);
         if ((nativeValue & enumValue) == enumValue) {
            enums.add(e);
         }
      }

      return enums;
   }
}
