package org.freedesktop.dbus.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

// $VF: Compiled from LoggingHelper.java
public final class LoggingHelper {
   public static void logIf(boolean _enabled, Runnable _loggerCall) {
      if (_enabled) {
         _loggerCall.run();
      }
   }

   public static String arraysVeryDeepString(Object[] _array) {
      return _array == null ? null : String.join(", ", arraysVeryDeepStringRecursive(_array));
   }

   private static List<String> arraysVeryDeepStringRecursive(Object[] _array) {
      if (_array == null) {
         return null;
      }

      List<String> result = new ArrayList();

      for (Object object : _array) {
         if (object == null) {
            result.add("(null)");
         } else if (object.getClass().isArray()) {
            if (object.getClass().getComponentType().isPrimitive()) {
               result.add(convertToString(object));
            } else {
               result.add(convertToString(arraysVeryDeepStringRecursive((Object[])object)));
            }
         } else if (object instanceof Collection<?> col) {
            result.add(convertToString(arraysVeryDeepStringRecursive(col.toArray())));
         } else {
            result.add(convertToString(object));
         }
      }

      return result;
   }

   static String convertToString(Object _obj) {
      if (_obj == null) {
         return null;
      }

      if (_obj.getClass().isArray() && _obj.getClass().getComponentType().isPrimitive()) {
         if (_obj.getClass().getComponentType() == boolean.class) {
            return Arrays.toString((boolean[])_obj);
         }

         if (_obj.getClass().getComponentType() == char.class) {
            return Arrays.toString((char[])_obj);
         }

         if (_obj.getClass().getComponentType() == int.class) {
            return Arrays.toString((int[])_obj);
         }

         if (_obj.getClass().getComponentType() == float.class) {
            return Arrays.toString((float[])_obj);
         }

         if (_obj.getClass().getComponentType() == double.class) {
            return Arrays.toString((double[])_obj);
         }

         if (_obj.getClass().getComponentType() == byte.class) {
            return Arrays.toString((byte[])_obj);
         }

         if (_obj.getClass().getComponentType() == long.class) {
            return Arrays.toString((long[])_obj);
         }
      }

      return Objects.toString(_obj);
   }

   private LoggingHelper() {
   }
}
