package com.kenai.jffi;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// $VF: Compiled from Init.java
final class Init {
   private static volatile boolean loaded = false;
   static final String stubLoaderClassName = Init.class.getPackage().getName() + ".internal.StubLoader";

   private Init() {
   }

   private static UnsatisfiedLinkError newLoadError(Throwable cause) {
      UnsatisfiedLinkError error = new UnsatisfiedLinkError(cause.getLocalizedMessage());
      error.initCause(cause);
      return error;
   }

   static void load() {
      if (!loaded) {
         List<Throwable> failureCauses = new ArrayList<>();

         for (ClassLoader pw : getClassLoaders()) {
            try {
               Class<?> throwable = Class.forName(stubLoaderClassName, true, pw);
               Method t = throwable.getDeclaredMethod("isLoaded");
               loaded = loaded | Boolean.class.cast(t.invoke(throwable));
               if (!loaded) {
                  Method getFailureCause = throwable.getDeclaredMethod("getFailureCause");
                  throw (Throwable)Throwable.class.cast(getFailureCause.invoke(throwable));
               }
            } catch (IllegalAccessException var7) {
               failureCauses.add(var7);
            } catch (InvocationTargetException var8) {
               failureCauses.add(var8);
            } catch (ClassNotFoundException var9) {
               failureCauses.add(var9);
            } catch (Throwable var10) {
               if (var10 instanceof UnsatisfiedLinkError) {
                  throw (UnsatisfiedLinkError)var10;
               }

               throw newLoadError(var10);
            }
         }

         if (!loaded && !failureCauses.isEmpty()) {
            StringWriter var11 = new StringWriter();
            PrintWriter var12 = new PrintWriter(var11);

            for (Throwable var14 : failureCauses) {
               var14.printStackTrace(var12);
            }

            throw new UnsatisfiedLinkError(var11.toString());
         }
      }
   }

   private static List<ClassLoader> getClassLoaders() {
      List<ClassLoader> loaders = new ArrayList<>();

      try {
         loaders.add(ClassLoader.getSystemClassLoader());
      } catch (SecurityException var4) {
      }

      try {
         loaders.add(Thread.currentThread().getContextClassLoader());
      } catch (SecurityException var3) {
      }

      loaders.add(Init.class.getClassLoader());
      int nullCount = 0;
      Iterator<ClassLoader> it = loaders.iterator();

      while (it.hasNext()) {
         if (it.next() == null) {
            if (++nullCount > 1) {
               it.remove();
            }
         }
      }

      return Collections.unmodifiableList(loaders);
   }
}
