package ru.metaculture.protection;

import java.io.File;
import java.lang.reflect.Method;
import net.minecraft.class_156;
import net.minecraft.class_310;

public final class uuNnVVUUUN {
   private uuNnVVUUUN() {
   }

   public static File UuUVuuUu() {
      try {
         Class var0 = Class.forName("org.lwjgl.util.tinyfd.TinyFileDialogs");
         Class var1 = Class.forName("org.lwjgl.PointerBuffer");
         Method var2 = var0.getMethod("tinyfd_openFileDialog", CharSequence.class, CharSequence.class, var1, CharSequence.class, boolean.class);
         if (var2.invoke(null, "Импорт аватара Figura", "", null, "Figura avatar (.zip)", false) instanceof CharSequence var4 && var4.length() > 0) {
            File var5 = new File(var4.toString());
            return var5.exists() ? var5 : null;
         }
      } catch (Throwable var6) {
      }

      return null;
   }

   public static void C00OOC00oO() {
      try {
         File var0 = vnvnVnV.UuUVuuUu().C00OOC00oO();
         if (!var0.exists()) {
            var0.mkdirs();
         }

         class_156.method_668().method_672(var0);
      } catch (Throwable var1) {
      }

      class_310 var2 = class_310.method_1551();
      if (var2 != null) {
      }
   }
}
