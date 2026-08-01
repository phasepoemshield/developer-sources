package ru.metaculture.protection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class EventManager {
   private static final Map<Class<? extends Event>, EventManager.W23[]> O00000000 = new ConcurrentHashMap<>();
   private static boolean O000000000 = false;
   private static int O0000000000 = 0;

   public static void O00000000(Object object) {
      for (Method var4 : object.getClass().getDeclaredMethods()) {
         if (!O00000000(var4)) {
            O00000000(var4, object);
         }
      }
   }

   public static void O000000000(Object object) {
      for (Entry var2 : O00000000.entrySet()) {
         EventManager.W23[] var3 = (EventManager.W23[])var2.getValue();
         int var4 = 0;

         for (int var5 = 0; var5 < var3.length; var5++) {
            if (!var3[var5].O00000000().equals(object)) {
               var4++;
            }
         }

         if (var4 != var3.length) {
            if (var4 == 0) {
               O00000000.remove(var2.getKey(), var3);
            } else {
               EventManager.W23[] var8 = new EventManager.W23[var4];
               int var6 = 0;

               for (int var7 = 0; var7 < var3.length; var7++) {
                  if (!var3[var7].O00000000().equals(object)) {
                     var8[var6++] = var3[var7];
                  }
               }

               O00000000.put((Class<? extends Event>)var2.getKey(), var8);
            }
         }
      }

      O00000000(true);
   }

   private static void O00000000(Method method, Object object) {
      try {
         Class var2 = method.getParameterTypes()[0];
         EventManager.W23 var3 = new EventManager.W23(object, method, method.getAnnotation(EventHandler.class).O00000000());
         if (!var3.O000000000().isAccessible()) {
            var3.O000000000().setAccessible(true);
         }

         EventManager.W23[] var4 = O00000000.get(var2);
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               if (var4[var5].equals(var3)) {
                  return;
               }
            }

            EventManager.W23[] var7 = new EventManager.W23[var4.length + 1];
            System.arraycopy(var4, 0, var7, 0, var4.length);
            var7[var4.length] = var3;
            O00000000.put(var2, O00000000(var7));
         } else {
            O00000000.put(var2, new EventManager.W23[]{var3});
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   public static void O00000000(boolean bl) {
      if (!bl) {
         O00000000.clear();
      } else {
         for (Entry var2 : O00000000.entrySet()) {
            EventManager.W23[] var3 = (EventManager.W23[])var2.getValue();
            if (var3 == null || var3.length == 0) {
               O00000000.remove(var2.getKey(), var3);
            }
         }
      }
   }

   private static boolean O00000000(Method method) {
      return method.getParameterTypes().length != 1 || !method.isAnnotationPresent(EventHandler.class);
   }

   public static void O00000000() {
   }

   public static Event O00000000(Event o00000000OOOO0) {
      EventManager.W23[] var1 = O00000000.get(o00000000OOOO0.getClass());
      if (var1 != null && var1.length > 0) {
         if (o00000000OOOO0 instanceof O0000000O00 var2) {
            for (int var3 = 0; var3 < var1.length; var3++) {
               O00000000(var1[var3], o00000000OOOO0);
               if (var2.O00000000000()) {
                  break;
               }
            }
         } else {
            for (int var4 = 0; var4 < var1.length; var4++) {
               O00000000(var1[var4], o00000000OOOO0);
            }
         }
      }

      return o00000000OOOO0;
   }

   private static EventManager.W23[] O00000000(EventManager.W23[] o00000000s) {
      Arrays.sort(o00000000s, (o00000000, o000000002) -> Integer.compare(O00000000(o00000000.O0000000000()), O00000000(o000000002.O0000000000())));
      return o00000000s;
   }

   private static int O00000000(byte b) {
      for (int var1 = 0; var1 < O0000000O0000.O0000000000000.length; var1++) {
         if (O0000000O0000.O0000000000000[var1] == b) {
            return var1;
         }
      }

      return O0000000O0000.O0000000000000.length;
   }

   private static void O00000000(EventManager.W23 o00000000, Event o00000000OOOO0) {
      try {
         o00000000.O000000000().invoke(o00000000.O00000000(), o00000000OOOO0);
      } catch (IllegalArgumentException | IllegalAccessException var4) {
         System.err
            .println(
               "[EventManager] Failed to invoke "
                  + o00000000.O000000000().getName()
                  + " on "
                  + o00000000.O00000000().getClass().getSimpleName()
                  + ": "
                  + var4.getMessage()
            );
      } catch (InvocationTargetException var5) {
         Throwable var3 = var5.getCause();
         System.err
            .println(
               "[EventManager] Exception in handler "
                  + o00000000.O000000000().getName()
                  + " on "
                  + o00000000.O00000000().getClass().getSimpleName()
                  + ": "
                  + (var3 != null ? var3.getMessage() : var5.getMessage())
            );
         if (var3 != null) {
            var3.printStackTrace();
         }
      }
   }

   static final class W23 {
      private final Object O00000000;
      private final Method O000000000;
      private final byte O0000000000;

      public W23(Object object, Method method, byte b) {
         this.O00000000 = object;
         this.O000000000 = method;
         this.O0000000000 = b;
      }

      public Object O00000000() {
         return this.O00000000;
      }

      public Method O000000000() {
         return this.O000000000;
      }

      public byte O0000000000() {
         return this.O0000000000;
      }

      @Override
      public boolean equals(Object object) {
         if (this == object) {
            return true;
         } else if (object != null && this.getClass() == object.getClass()) {
            EventManager.W23 var2 = (EventManager.W23)object;
            return this.O0000000000 == var2.O0000000000 && this.O00000000.equals(var2.O00000000) && this.O000000000.equals(var2.O000000000);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.O00000000, this.O000000000, this.O0000000000);
      }
   }
}
