package org.wild.mixin;

import net.minecraft.class_1657;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.NUvnVVNvvu;
import ru.metaculture.protection.NnVUvuvVUnv;
import ru.metaculture.protection.O000c0oocoo;
import ru.metaculture.protection.VunUNUNVUnv;

@Mixin({class_1657.class})
public abstract class PlayerEntityMixin implements O000c0oocoo {
   @Inject(
      method = {"attack"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/player/PlayerEntity;setSprinting(Z)V",
         shift = Shift.AFTER
      )}
   )
   public void attackHook(CallbackInfo var1) {
      NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)(new NnVUvuvVUnv()));
   }
}
