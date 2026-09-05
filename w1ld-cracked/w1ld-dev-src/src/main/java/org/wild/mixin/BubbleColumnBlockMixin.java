package org.wild.mixin;

import net.minecraft.class_1937;
import net.minecraft.class_2258;
import net.minecraft.class_2394;
import net.minecraft.class_2398;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import ru.metaculture.protection.uuUnvvnNUU;

@Mixin({class_2258.class})
public class BubbleColumnBlockMixin {
   @Redirect(
      method = {"randomDisplayTick"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/World;addImportantParticleClient(Lnet/minecraft/particle/ParticleEffect;DDDDDD)V"
      )
   )
   private void litka$noSoulSandBubbles(class_1937 var1, class_2394 var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      if (!this.shouldSkip(var2)) {
         var1.method_8494(var2, var3, var5, var7, var9, var11, var13);
      }
   }

   private boolean shouldSkip(class_2394 var1) {
      return var1 != class_2398.field_11238 ? false : uuUnvvnNUU.UuUVuuUu(var1);
   }
}
