package l;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import net.minecraft.util.Identifier;

public final class Helper210 {
   private static final String HEART_TYPE_CLASS = "net.minecraft.client.gui.hud.InGameHud$HeartType";
   private static final String NORMAL = "NORMAL";
   private static final String[] EFFECT_TYPES = new String[]{"POISONED", "WITHERED", "FROZEN"};

   private Helper210() {
   }

   public static void method1805() {
      try {
         Class var0 = Class.forName("net.minecraft.client.gui.hud.InGameHud$HeartType");
         if (!var0.isEnum()) {
            return;
         }

         Class var1 = var0.asSubclass(Enum.class);
         Enum var2 = Enum.valueOf(var1, "NORMAL");

         for (String var6 : EFFECT_TYPES) {
            Enum var7 = Enum.valueOf(var1, var6);
            method1806(var0, var2, var7);
         }
      } catch (Throwable var8) {
      }
   }

   private static void method1806(Class<?> var0, Object var1, Object var2) {
      try {
         for (Field var6 : var0.getDeclaredFields()) {
            if (!Modifier.isStatic(var6.getModifiers()) && var6.getType() == Identifier.class) {
               var6.setAccessible(true);
               var6.set(var2, var6.get(var1));
            }
         }
      } catch (IllegalAccessException var7) {
         var7.printStackTrace();
      }
   }
}
