package org.wild.mixin;

import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.world.dimension.DimensionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import ru.metaculture.protection.FullBright;
import ru.metaculture.protection.WildClient;

@Mixin({LightmapTextureManager.class})
public class LightmapTextureManagerMixin {
   @Redirect(
      method = {"update"},
      at = @At(
         value = "INVOKE",
         target = "Ljava/lang/Double;floatValue()F",
         ordinal = 1
      )
   )
   private float getGammaValue(Double double_) {
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         FullBright var2 = WildClient.O00000000.O000000000.O00000000(FullBright.class);
         if (var2 != null && var2.O0000000000000) {
            if (var2.O0000000000O0()) {
               return 200.0F;
            }

            if (var2.O0000000000O00()) {
               return var2.O000000000O();
            }

            if (var2.O0000000000O0O()) {
               return var2.O0000000000OOO();
            }
         }
      }

      return double_.floatValue();
   }

   @Redirect(
      method = {"update"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/dimension/DimensionType;ambientLight()F"
      )
   )
   private float getAmbientFloor(DimensionType dimensionType) {
      float var2 = dimensionType.ambientLight();
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         FullBright var3 = WildClient.O00000000.O000000000.O00000000(FullBright.class);
         if (var3 != null && var3.O0000000000000 && var3.O0000000000O0O()) {
            return Math.max(var2, var3.O0000000000OO0());
         }
      }

      return var2;
   }
}
