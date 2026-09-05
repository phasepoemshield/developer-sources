package ru.metaculture.protection;

import net.minecraft.class_310;
import net.minecraft.class_437;
import net.minecraft.class_465;

public final class VuUNvNNvvnV {
   private VuUNvNNvvnV() {
   }

   public static <T extends class_437> T UuUVuuUu(class_310 var0, class_437 var1, Class<T> var2) {
      if (var0 != null && var2.isInstance(var0.field_1755)) {
         return (T)var2.cast(var0.field_1755);
      } else {
         return (T)(var2.isInstance(var1) && UuUVuuUu(var0, var1) ? var2.cast(var1) : null);
      }
   }

   public static boolean UuUVuuUu(class_310 var0, class_437 var1) {
      return var0 != null && var0.field_1724 != null && var1 instanceof class_465 var2 ? var0.field_1724.field_7512 == var2.method_17577() : false;
   }

   public static boolean UuUVuuUu(class_310 var0) {
      return var0 != null && var0.field_1724 != null && var0.field_1724.field_7512 != var0.field_1724.field_7498;
   }

   public static boolean C00OOC00oO(class_310 var0, class_437 var1) {
      if (var0 != null) {
         if (var0.field_1755 != null) {
            return true;
         }

         if (UuUVuuUu(var0, var1)) {
            return true;
         }
      }

      return false;
   }
}
