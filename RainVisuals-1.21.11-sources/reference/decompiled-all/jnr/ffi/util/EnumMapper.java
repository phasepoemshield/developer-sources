package jnr.ffi.util;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.ToNativeConverter;

// $VF: Compiled from EnumMapper.java
@FromNativeConverter.NoContext
@ToNativeConverter.NoContext
public final class EnumMapper {
   private final int[] intValues;
   private final Class<? extends Enum> enumClass;
   private final Map<Number, Enum> reverseLookupMap = new HashMap<>();

   private Enum badValue(int value) {
      try {
         return Enum.valueOf(this.enumClass, "__UNKNOWN_NATIVE_VALUE");
      } catch (IllegalArgumentException ex) {
         throw new IllegalArgumentException("No known Enum mapping for value " + value + " of type " + this.enumClass.getName());
      }
   }

   private static Number reflectedNumberValue(Enum m, Method e) {
      try {
         return (Number)m.invoke(e);
      } catch (Throwable var3) {
         throw new RuntimeException(var3);
      }
   }

   private static Method getNumberValueMethod(Class numberClass, Class c) {
      try {
         Method t = c.getDeclaredMethod(numberClass.getSimpleName() + "Value");
         return t != null && numberClass == t.getReturnType() ? t : null;
      } catch (Throwable var3) {
         return null;
      }
   }

   private Enum reverseLookup(int value) {
      Enum e = this.reverseLookupMap.get(value);
      return e != null ? e : this.badValue(value);
   }

   public final Integer integerValue(Enum value) {
      if (value.getClass() != this.enumClass) {
         throw new IllegalArgumentException("enum class mismatch, " + value.getClass());
      } else {
         return this.intValues[value.ordinal()];
      }
   }

   private static synchronized EnumMapper addMapper(Class<? extends Enum> enumClass) {
      EnumMapper mapper = new EnumMapper(enumClass);
      Map<Class<? extends Enum>, EnumMapper> tmp = new IdentityHashMap<>(EnumMapper.StaticDataHolder.MAPPERS);
      tmp.put(enumClass, mapper);
      EnumMapper.StaticDataHolder.MAPPERS = tmp;
      return mapper;
   }

   public static EnumMapper getInstance(Class<? extends Enum> enumClass) {
      EnumMapper mapper = EnumMapper.StaticDataHolder.MAPPERS.get(enumClass);
      return mapper != null ? mapper : addMapper(enumClass);
   }

   public Enum valueOf(int value) {
      return this.reverseLookup(value);
   }

   private EnumMapper(Class<? extends Enum> enumClass) {
      this.enumClass = enumClass;
      EnumSet<? extends Enum> enums = EnumSet.allOf(enumClass);
      this.intValues = new int[enums.size()];
      Method intValueMethod = getNumberValueMethod(enumClass, int.class);

      for (Enum e : enums) {
         Number value;
         if (intValueMethod != null) {
            value = reflectedNumberValue(e, intValueMethod);
         } else {
            value = e.ordinal();
         }

         this.intValues[e.ordinal()] = value.intValue();
         this.reverseLookupMap.put(value, e);
      }
   }

   public final int intValue(Enum value) {
      return this.integerValue(value);
   }

   // $VF: Compiled from EnumMapper.java
   public interface IntegerEnum {
      int intValue();
   }

   // $VF: Compiled from EnumMapper.java
   private static final class StaticDataHolder {
      private static volatile Map<Class<? extends Enum>, EnumMapper> MAPPERS = Collections.emptyMap();
   }
}
