package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AspectRation",
   O000000000 = "Изменяет разрешение экрана",
   O0000000000 = Category.Visuals
)
public class AspectRatio extends Module {
   public static final ModeSetting O000000000O = new ModeSetting(
      "Соотношение экрана", "16:9", "16:9", "4:3", "1:1", "16:10", "21:9", "32:9", "5:4", "2:1", "Кастомное"
   );
   public static final NumberSetting O000000000O0 = new NumberSetting("Кастомое значние", 2.0F, 1.0F, 3.0F, 0.1F, false)
      .O00000000(() -> !O000000000O.O000000000("Кастомное"));

   public AspectRatio() {
      this.O00000000(new Setting[]{O000000000O, O000000000O0});
   }

   public static float O0000000000O0() {
      O0000O000OOO var0 = new O0000O000OOO(O0000000000);
      if (!WildClient.O00000000.O000000000.O000000000(AspectRatio.class).O0000000000000) {
         return 0.0F;
      } else {
         float var1 = (float)var0.O0000000000() / var0.O00000000000();
         String var3 = O000000000O.O0000000000();

         float var2 = switch (var3) {
            case "16:9" -> 1.7777778F;
            case "4:3" -> 1.3333334F;
            case "1:1" -> 1.0F;
            case "16:10" -> 1.6F;
            case "21:9" -> 2.3333333F;
            case "32:9" -> 3.5555556F;
            case "5:4" -> 1.25F;
            case "2:1" -> 2.0F;
            default -> O000000000O0.O0000000000();
         };
         return var2 - var1;
      }
   }
}
