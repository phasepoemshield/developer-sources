package ru.metaculture.protection;

import java.util.List;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class nvNUVUNNnu extends UNUuvUN {
   public nvNUVUNNnu() {
      super("prefix", "Изменение префикса команд", ".prefix set <symbol>");
      this.UuUVuuUu("set", List::of);
   }

   @Compile
   @Override
   public void C00OOC00oO(String[] var1) {
      if (var1.length >= 2 && var1[0] != null && var1[0].equalsIgnoreCase("set")) {
         String var4 = var1[1];
         if (var4 != null && var4.length() > 1) {
            vVnvuVVUunuv.UuUVuuUu("§cПрефикс должен быть одним символом!");
         } else {
            NVnVnNnN var3 = NVnVnNnN.UuUVuuUu;
            if (var3 != null) {
               var3.UuUVuuUu(var4);
            }

            vVnvuVVUunuv.UuUVuuUu("§aПрефикс успешно изменен на: §f" + var4);
         }
      } else {
         String var2 = this.UuUVuuUu();
         vVnvuVVUunuv.UuUVuuUu("§cИспользование: " + var2);
      }
   }

   static {
      Loader.initialize();
   }
}
