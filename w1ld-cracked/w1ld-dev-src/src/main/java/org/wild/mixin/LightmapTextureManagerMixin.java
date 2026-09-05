package org.wild.mixin;

import net.minecraft.class_2874;
import net.minecraft.class_765;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.nUnVNUN;
import ru.metaculture.protection.uVvvNVuUV;

@Mixin({class_765.class})
public class LightmapTextureManagerMixin {
   @Redirect(
      method = {"update"},
      at = @At(
         value = "INVOKE",
         target = "Ljava/lang/Double;floatValue()F",
         ordinal = 1
      )
   )
   private float getGammaValue(Double var1) {
      if (!NVnVnNnN.vNUvnnVnUvu()) {
         return var1.floatValue();
      } else if (nUnVNUN.nUUVuvU()) {
         return 200.0F;
      } else {
         if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
            uVvvNVuUV var2 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(uVvvNVuUV.class);
            if (var2 != null && var2.nuUnNvnuUu) {
               if (var2.UuuNnUvUuv()) {
                  return 200.0F;
               }

               if (var2.nUUVuvU()) {
                  return var2.NVNnnvnuunNv();
               }

               if (var2.UnUNVVVNuv()) {
                  return var2.uVUVnuvnuVuv();
               }
            }
         }

         return var1.floatValue();
      }
   }

   @Redirect(
      method = {"update"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/dimension/DimensionType;ambientLight()F"
      )
   )
   private float getAmbientFloor(class_2874 var1) {
      float var2 = var1.comp_656();
      if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
         uVvvNVuUV var3 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(uVvvNVuUV.class);
         if (var3 != null && var3.nuUnNvnuUu && var3.UnUNVVVNuv()) {
            return Math.max(var2, var3.UvnvNVnnnnNU());
         }
      }

      return var2;
   }
}
