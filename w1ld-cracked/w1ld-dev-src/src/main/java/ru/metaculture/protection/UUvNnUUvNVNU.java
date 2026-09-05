package ru.metaculture.protection;

import java.util.List;
import java.util.Locale;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class UUvNnUUvNVNU extends UNUuvUN {
   public UUvNnUUvNVNU() {
      super("automine", "Управление AutoMine", ".automine save");
      this.UuUVuuUu("save", List::of);
   }

   @Compile
   @Override
   public void C00OOC00oO(String[] var1) {
      if (var1.length == 0) {
         vVnvuVVUunuv.UuUVuuUu("§cИспользование: " + this.UuUVuuUu());
      } else {
         String var2 = var1[0];
         Locale var3 = Locale.ROOT;
         String var4 = var2 == null ? null : var2.toLowerCase(var3);
         if (var4 != null && "save".equals(var4)) {
            uVvnVvvUVUv var5 = NVnVnNnN.UuUVuuUu.C00OOC00oO;
            if (!(var5 instanceof uVvnVvvUVUv)) {
               vVnvuVVUunuv.UuUVuuUu("§cМенеджер модулей не инициализирован.");
            } else {
               uVvnVvvUVUv var6 = NVnVnNnN.UuUVuuUu.C00OOC00oO;
               if (var6 == null) {
                  vVnvuVVUunuv.UuUVuuUu("§cAutoMine не найден.");
               } else {
                  AutoMine var7 = var6.UuUVuuUu(AutoMine.class);
                  if (var7 == null) {
                     vVnvuVVUunuv.UuUVuuUu("§cAutoMine не найден.");
                  } else {
                     var7.UuuNnUvUuv();
                  }
               }
            }
         } else {
            vVnvuVVUunuv.UuUVuuUu("§cИспользование: " + this.UuUVuuUu());
         }
      }
   }

   static {
      Loader.initialize();
   }
}
