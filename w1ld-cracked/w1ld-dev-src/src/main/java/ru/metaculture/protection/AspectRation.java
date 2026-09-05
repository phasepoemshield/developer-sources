package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AspectRation",
   C00OOC00oO = "Изменяет разрешение экрана",
   uUnuvNvvNU = oOOOo0.Visuals
)
public class AspectRation extends Module {
   public static final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU(
      "Соотношение экрана", "16:9", "16:9", "4:3", "1:1", "16:10", "21:9", "32:9", "5:4", "2:1", "Кастомное"
   );
   public static final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Кастомое значние", 2.0F, 1.0F, 3.0F, 0.1F, false)
      .UuUVuuUu(() -> !NVNnnvnuunNv.C00OOC00oO("Кастомное"));

   public AspectRation() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv, uVunuUNVVUUV});
   }

   public static float UuuNnUvUuv() {
      VuVNuVvVn var0 = new VuVNuVvVn(uUnuvNvvNU);
      if (!NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO(AspectRation.class).nuUnNvnuUu) {
         return 0.0F;
      } else {
         float var1 = (float)var0.uUnuvNvvNU() / var0.vVvUvVVuuNvV();
         String var3 = NVNnnvnuunNv.uUnuvNvvNU();

         float var2 = switch (var3) {
            case "16:9" -> 1.7777778F;
            case "4:3" -> 1.3333334F;
            case "1:1" -> 1.0F;
            case "16:10" -> 1.6F;
            case "21:9" -> 2.3333333F;
            case "32:9" -> 3.5555556F;
            case "5:4" -> 1.25F;
            case "2:1" -> 2.0F;
            default -> uVunuUNVVUUV.uUnuvNvvNU();
         };
         return var2 - var1;
      }
   }
}
