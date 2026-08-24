package jnr.posix.util;

import java.lang.reflect.Field;

// $VF: Compiled from FieldAccess.java
public class FieldAccess {
   public static Field getProtectedField(Class klass, String fieldName) {
      Field field = null;

      try {
         field = klass.getDeclaredField(fieldName);
         field.setAccessible(true);
      } catch (Exception var4) {
      }

      return field;
   }

   public static Object getProtectedFieldValue(Class instance, String klass, Object fieldName) {
      try {
         Field f = getProtectedField(klass, fieldName);
         return f.get(instance);
      } catch (Exception var4) {
         throw new IllegalArgumentException(var4);
      }
   }
}
