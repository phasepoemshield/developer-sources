package org.wild.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_10219;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.UUNUvvnnnVVn;
import ru.metaculture.protection.UVUuvNVUuVvN;
import ru.metaculture.protection.nUNuvunv;
import ru.metaculture.protection.uvuvNuUnNVuu;
import ru.metaculture.protection.vVnvuVuVvnun;

@Mixin({RenderSystem.class})
public class RenderSystemMixin {
   @Inject(
      method = {"flipFrame(JLnet/minecraft/client/util/tracy/TracyFrameCapturer;)V"},
      at = {@At("HEAD")}
   )
   private static void flipFrame(long var0, class_10219 var2, CallbackInfo var3) {
      NVnVnNnN.nvUVNnuu();
   }

   @Inject(
      method = {"flipFrame(JLnet/minecraft/client/util/tracy/TracyFrameCapturer;)V"},
      at = {@At("TAIL")}
   )
   private static void wild$clearChamsUniforms(long var0, class_10219 var2, CallbackInfo var3) {
      nUNuvunv.uNNnnnuuuN();
      uvuvNuUnNVuu.nuUnNvnuUu();
      UUNUvvnnnVVn.uUnuvNvvNU();
      int var4 = UVUuvNVUuVvN.vVvUvVVuuNvV();
      if (var4 != 0) {
         vVnvuVuVvnun.UuUVuuUu().UuUVuuUu("RenderSystem.flipFrame", var4);
      }
   }
}
