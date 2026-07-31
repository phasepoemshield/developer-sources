package ru.metaculture.protection;

import java.awt.Color;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleAccess(
   O0000000000 = {"lichoday"}
)
@ModuleRegister(
   O00000000 = "WorldTweaks",
   O0000000000 = Category.Visuals,
   O000000000 = "Кинематографичная атмосфера: ветер, туман, тонировка неба",
   O00000000000 = {O0000000OO0OOO.NEW}
)
public final class WorldTweaks extends Module {
   public final NumberSetting O000000000O = new NumberSetting("Wind Speed", 0.72F, 0.0F, 2.0F, 0.01F, false);
   public final NumberSetting O000000000O0 = new NumberSetting("Wind Direction", 35.0F, 0.0F, 360.0F, 1.0F, false);
   public final NumberSetting O000000000O00 = new NumberSetting("Fog Density", 0.032F, 0.0F, 0.1F, 0.001F, false);
   public final NumberSetting O000000000O000 = new NumberSetting("Horizon Dissolve", 0.82F, 0.0F, 1.0F, 0.01F, true);
   public final NumberSetting O000000000O00O = new NumberSetting("Sky Lift", 0.64F, 0.0F, 1.0F, 0.01F, true);
   public final NumberSetting O000000000O0O = new NumberSetting("Edge Softness", 0.72F, 0.0F, 1.0F, 0.01F, true);
   public final O0000000OOOO O000000000O0O0 = new O0000000OOOO("Atmosphere Tint", 6978453);

   public WorldTweaks() {
      this.O00000000(
         new Setting[]{
            this.O000000000O, this.O000000000O0, this.O000000000O00, this.O000000000O000, this.O000000000O00O, this.O000000000O0O, this.O000000000O0O0
         }
      );
   }

   public static boolean O0000000000O0() {
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         WorldTweaks var0 = WildClient.O00000000.O000000000.O00000000(WorldTweaks.class);
         return var0 != null && var0.O0000000000000;
      } else {
         return false;
      }
   }

   @EventHandler(
      O00000000 = 0
   )
   public void O00000000(O0000000OO0O0 o0000000OO0O0) {
      if (o0000000OO0O0 != null
         && o0000000OO0O0.O0000000000() != null
         && o0000000OO0O0.O0000000000().world != null
         && o0000000OO0O0.O0000000000().player != null
         && o0000000OO0O0.O000000000000() != null) {
         O0000O0O00O000.W403 var2 = new O0000O0O00O000.W403();
         Color var3 = this.O000000000O0O0.O0000000000();
         float var4 = (float)Math.toRadians(this.O000000000O0.O0000000000());
         var2.O00000000 = this.O000000000O.O0000000000();
         var2.O000000000 = (float)Math.cos(var4);
         var2.O0000000000 = 0.0F;
         var2.O00000000000 = (float)Math.sin(var4);
         var2.O000000000000 = this.O000000000O00.O0000000000();
         var2.O0000000000000 = this.O000000000O000.O0000000000();
         var2.O000000000000O = this.O000000000O00O.O0000000000();
         var2.O00000000000O = this.O000000000O0O.O0000000000();
         var2.O00000000000O0 = var3.getRed() / 255.0F;
         var2.O00000000000OO = var3.getGreen() / 255.0F;
         var2.O0000000000O = var3.getBlue() / 255.0F;
         var2.O0000000000OO = ((float)o0000000OO0O0.O0000000000().world.getTime() + o0000000OO0O0.O00000000000O0()) * 0.05F;
         O0000O0O00O000.O00000000()
            .O00000000(
               o0000000OO0O0.O0000000000(), o0000000OO0O0.O000000000000().O00000000(), o0000000OO0O0.O000000000000O(), o0000000OO0O0.O00000000000O(), var2
            );
      }
   }
}
