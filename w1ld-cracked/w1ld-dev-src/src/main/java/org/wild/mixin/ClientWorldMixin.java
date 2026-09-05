package org.wild.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import ru.metaculture.protection.NvnVUnVuVU;

@Mixin({class_638.class})
public abstract class ClientWorldMixin {
   @ModifyReturnValue(
      method = {"getCloudsColor(F)I"},
      at = {@At("RETURN")}
   )
   private int wild$modifyStardustCloudColor(int var1, float var2) {
      return NvnVUnVuVU.UuUVuuUu(var1);
   }
}
