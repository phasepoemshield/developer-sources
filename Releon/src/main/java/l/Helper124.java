package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Helper124 {
   private static final Map<Class<? extends Helper41>, List<Helper123>> REGISTRY_MAP = new ConcurrentHashMap<>();
   private static final Logger LOGGER = LogManager.getLogger("releon-event");

   public Helper124() {
   }

   public void method1016(Object var1) {
      for (Method var5 : var1.getClass().getDeclaredMethods()) {
         if (!method1024(var5)) {
            this.method1020(var5, var1);
         }
      }
   }

   public void method1017(Object var1, Class<? extends Helper41> var2) {
      for (Method var6 : var1.getClass().getDeclaredMethods()) {
         if (!method1025(var6, var2)) {
            this.method1020(var6, var1);
         }
      }
   }

   public void method1018(Object var1) {
      for (List<Helper123> var3 : REGISTRY_MAP.values()) {
         var3.removeIf(var1x -> var1x.method1013().equals(var1));
      }

      method1022(true);
   }

   public void method1019(Object var1, Class<? extends Helper41> var2) {
      List<Helper123> var3 = REGISTRY_MAP.get(var2);
      if (var3 != null) {
         var3.removeIf(var1x -> var1x.method1013().equals(var1));
         method1022(true);
      }
   }

   private void method1020(Method var1, Object var2) {
      Class var3 = var1.getParameterTypes()[0];
      Helper123 var4 = new Helper123(var2, var1, var1.getAnnotation(Helper104.class).method932());
      if (!var4.method1014().isAccessible()) {
         var4.method1014().setAccessible(true);
      }

      List<Helper123> var5 = REGISTRY_MAP.computeIfAbsent(var3, var0 -> new CopyOnWriteArrayList<>());
      if (!var5.contains(var4)) {
         var5.add(var4);
         method1023(var3);
      }
   }

   public void method1021(Class<? extends Helper41> var1) {
      REGISTRY_MAP.remove(var1);
   }

   public static void method1022(boolean var0) {
      if (!var0) {
         REGISTRY_MAP.clear();
      } else {
         REGISTRY_MAP.entrySet().removeIf(var0x -> var0x.getValue().isEmpty());
      }
   }

   private static void method1023(Class<? extends Helper41> var0) {
      CopyOnWriteArrayList var1 = new CopyOnWriteArrayList();

      for (byte var5 : Helper113.VALUE_ARRAY) {
         for (Helper123 var7 : REGISTRY_MAP.get(var0)) {
            if (var7.method1015() == var5) {
               var1.add(var7);
            }
         }
      }

      REGISTRY_MAP.put(var0, var1);
   }

   private static boolean method1024(Method var0) {
      return var0.getParameterTypes().length != 1 || !var0.isAnnotationPresent(Helper104.class);
   }

   private static boolean method1025(Method var0, Class<? extends Helper41> var1) {
      return method1024(var0) || !var0.getParameterTypes()[0].equals(var1);
   }

   public static Helper41 method1026(Helper41 var0) {
      List<Helper123> var1 = REGISTRY_MAP.get(var0.getClass());
      if (var1 != null) {
         if (var0 instanceof Event1 var2) {
            for (Helper123 var4 : var1) {
               method1027(var4, var0);
               if (var2.method580()) {
                  break;
               }
            }
         } else {
            for (Helper123 var8 : var1) {
               try {
                  method1027(var8, var0);
               } catch (Exception var6) {
                  var6.printStackTrace();
               }
            }
         }
      }

      return var0;
   }

   private static void method1027(Helper123 var0, Helper41 var1) {
      try {
         var0.method1014().invoke(var0.method1013(), var1);
      } catch (IllegalAccessException var7) {
         String var14 = "Illegal access to method. ";
         var14 = var14 + "Method: " + var0.method1014().getName() + ", ";
         var14 = var14 + "Argument: " + var1.toString() + ", ";
         var14 = var14 + "Log: " + var7.fillInStackTrace();
         LOGGER.error(var14);
      } catch (IllegalArgumentException var8) {
         String var10 = "Illegal arguments passed to method. ";
         var10 = var10 + "Method: " + var0.method1014().getName() + ", ";
         var10 = var10 + "Argument: " + var1.toString() + ", ";
         var10 = var10 + "Log: " + var8.getCause();
         LOGGER.error(var10);
      } catch (InvocationTargetException var9) {
         Throwable var3 = var9.getCause();
         Helper456 var4 = new Helper456();
         if (var3 instanceof Exception5 var5) {
            var4.method281(Text.literal("[" + var5.method2323() + "] " + Formatting.RED + var5.getMessage()));
         } else {
            String var6 = "Exception occurred within invoked method. ";
            var6 = var6 + "Method: " + var0.method1014().getName() + ", ";
            var6 = var6 + "Argument: " + var1.toString() + ", ";
            var6 = var6 + "Log: " + var9.getCause();
            LOGGER.error(var6);
         }
      }
   }
}
