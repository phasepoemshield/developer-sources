package org.wild.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_9919;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Environment(EnvType.CLIENT)
@Mixin({class_9919.class})
public abstract class InactivityFpsLimiterMixin {
   @Shadow
   private int field_52732;

   @ModifyConstant(
      method = {"update"},
      constant = {@Constant(
         intValue = 60
      )}
   )
   private int replaceMenuFps(int var1) {
      return this.field_52732;
   }
}
