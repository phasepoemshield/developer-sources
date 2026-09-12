package Nursultan;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class09951 {
   public static String y(Class<?> var0, String var1) {
      for (Field var5 : var0.getDeclaredFields()) {
         class09956 var6 = var5.getAnnotation(class09956.class);
         if (var6 != null && (var6.N().equals(var1) || var6.y().equals(var1))) {
            return var5.getName();
         }
      }

      throw new IllegalStateException("Could not find field mapping for " + var1 + " in class " + var0.getName());
   }

   public static String N(Class<?> var0, String var1) {
      for (Method var5 : var0.getDeclaredMethods()) {
         class09956 var6 = var5.getAnnotation(class09956.class);
         if (var6 != null && (var6.N().equals(var1) || var6.y().equals(var1))) {
            return var5.getName();
         }
      }

      throw new IllegalStateException("Could not find mapping for " + var1 + " in class " + var0.getName());
   }
}
