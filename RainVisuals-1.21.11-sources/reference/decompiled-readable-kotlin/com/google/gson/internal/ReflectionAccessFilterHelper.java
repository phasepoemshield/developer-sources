package com.google.gson.internal;

import com.google.gson.ReflectionAccessFilter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.List;

// $VF: Compiled from ReflectionAccessFilterHelper.java
public class ReflectionAccessFilterHelper {
   public static ReflectionAccessFilter.FilterResult getFilterResult(List<ReflectionAccessFilter> reflectionFilters, Class<?> c) {
      for (ReflectionAccessFilter filter : reflectionFilters) {
         ReflectionAccessFilter.FilterResult result = filter.check(c);
         if (result != ReflectionAccessFilter.FilterResult.INDECISIVE) {
            return result;
         }
      }

      return ReflectionAccessFilter.FilterResult.ALLOW;
   }

   private static boolean isJavaType(String className) {
      return className.startsWith("java.") || className.startsWith("javax.");
   }

   private static boolean isAndroidType(String className) {
      return className.startsWith("android.") || className.startsWith("androidx.") || isJavaType(className);
   }

   private ReflectionAccessFilterHelper() {
   }

   public static boolean isAndroidType(Class<?> c) {
      return isAndroidType(c.getName());
   }

   public static boolean isJavaType(Class<?> c) {
      return isJavaType(c.getName());
   }

   public static boolean canAccess(AccessibleObject accessibleObject, Object object) {
      return ReflectionAccessFilterHelper.AccessChecker.INSTANCE.canAccess(accessibleObject, object);
   }

   public static boolean isAnyPlatformType(Class<?> c) {
      String className = c.getName();
      return isAndroidType(className) || className.startsWith("kotlin.") || className.startsWith("kotlinx.") || className.startsWith("scala.");
   }

   // $VF: Compiled from ReflectionAccessFilterHelper.java
   private abstract static class AccessChecker {
      public static final ReflectionAccessFilterHelper.AccessChecker INSTANCE;

      public abstract boolean canAccess(AccessibleObject var1, Object var2);

      private AccessChecker() {
      }

      static {
         ReflectionAccessFilterHelper.AccessChecker accessChecker = null;
         if (JavaVersion.isJava9OrLater()) {
            try {
               final Method canAccessMethod = AccessibleObject.class.getDeclaredMethod("canAccess", Object.class);
               accessChecker = new ReflectionAccessFilterHelper.AccessChecker()               // $VF: Compiled from ReflectionAccessFilterHelper.java
 {
                  @Override
                  public boolean canAccess(AccessibleObject accessibleObject, Object object) {
                     try {
                        return (Boolean)canAccessMethod.invoke(accessibleObject, object);
                     } catch (Exception var4) {
                        throw new RuntimeException("Failed invoking canAccess", var4);
                     }
                  }
               };
            } catch (NoSuchMethodException var2) {
            }
         }

         if (accessChecker == null) {
            accessChecker = new ReflectionAccessFilterHelper.AccessChecker()            // $VF: Compiled from ReflectionAccessFilterHelper.java
 {
               @Override
               public boolean canAccess(AccessibleObject object, Object accessibleObject) {
                  return true;
               }
            };
         }

         INSTANCE = accessChecker;
      }
   }
}
