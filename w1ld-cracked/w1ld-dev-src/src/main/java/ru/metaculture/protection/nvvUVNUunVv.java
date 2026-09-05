package ru.metaculture.protection;

import net.minecraft.class_310;
import net.minecraft.class_320;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class nvvUVNUunVv extends UNUuvUN {
   public nvvUVNUunVv() {
      super("irc", "Отправка сообщения в глобальный IRC чат", ".irc <сообщение>");
   }

   @Compile
   @Override
   public void C00OOC00oO(String[] var1) {
      if (var1.length == 0) {
         vVnvuVVUunuv.UuUVuuUu("§cНеверный формат. Используйте: .irc <сообщение>");
      } else {
         StringBuilder var2 = new StringBuilder();

         for (String var6 : var1) {
            var2.append(var6).append(" ");
         }

         String var12 = var2.toString().trim();
         NVnVnNnN var13 = NVnVnNnN.UuUVuuUu;
         vUUvvNUVNvNU var14 = var13 == null ? null : var13.c0oOOCcCoC0();
         if (var14 == null) {
            vVnvuVVUunuv.UuUVuuUu("§c[IRC] Вы не подключены к серверу IRC. Сообщение не отправлено.");
         } else {
            NVnVnNnN var15 = NVnVnNnN.UuUVuuUu;
            vUUvvNUVNvNU var7 = var15 == null ? null : var15.c0oOOCcCoC0();
            if (var7 != null && var7.isOpen()) {
               String var8 = null;
               class_310 var9 = a_;
               if (var9 != null) {
                  class_320 var10 = var9.method_1548();
                  if (var10 != null) {
                     var8 = var10.method_1676();
                  }
               }

               NVnVnNnN var16 = NVnVnNnN.UuUVuuUu;
               vUUvvNUVNvNU var11 = var16 == null ? null : var16.c0oOOCcCoC0();
               if (var11 != null) {
                  var11.UuUVuuUu(var8, var12);
               }
            } else {
               vVnvuVVUunuv.UuUVuuUu("§c[IRC] Вы не подключены к серверу IRC. Сообщение не отправлено.");
            }
         }
      }
   }

   static {
      Loader.initialize();
   }
}
