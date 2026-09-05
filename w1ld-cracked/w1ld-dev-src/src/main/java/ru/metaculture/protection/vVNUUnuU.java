package ru.metaculture.protection;

import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class vVNUUnuU extends UNUuvUN {
   private final o0CO000c0 UuUVuuUu;

   public vVNUUnuU(o0CO000c0 var1) {
      super("help", "Показывает список всех команд", ".help");
      this.UuUVuuUu = var1;
   }

   @Compile
   @Override
   public void C00OOC00oO(String[] var1) {
      vVnvuVVUunuv.UuUVuuUu("§bДоступные команды:");

      for (UNUuvUN var3 : this.UuUVuuUu.UuUVuuUu()) {
         vVnvuVVUunuv.UuUVuuUu("§7" + var3.uUnuvNvvNU() + " §8- §f" + var3.C00OOC00oO());
      }
   }

   static {
      Loader.initialize();
   }
}
