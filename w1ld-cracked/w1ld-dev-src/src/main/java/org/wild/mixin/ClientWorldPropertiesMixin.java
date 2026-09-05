package org.wild.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_638.class_5271;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import ru.metaculture.protection.NvnVUnVuVU;

@Environment(EnvType.CLIENT)
@Mixin({class_5271.class})
public abstract class ClientWorldPropertiesMixin {
   @ModifyReturnValue(
      method = {"getTimeOfDay"},
      at = {@At("RETURN")}
   )
   private long hookGetTime(long var1) {
      return !NvnVUnVuVU.uNnUnnuNUnNu() ? var1 : NvnVUnVuVU.UvUvUNuvNU;
   }
}
