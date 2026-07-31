package fat.releon.mixins.client.screen.ingame;

import l.Helper351;
import l.SelfDestruct;
import net.minecraft.client.gui.hud.DebugHud;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({DebugHud.class})
public abstract class DebugHudMixin {
   public DebugHudMixin() {
   }

   @Redirect(
      method = {"getLeftText"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/Entity;getYaw()F"
      )
   )
   private float redirectYaw(Entity var1) {
      return SelfDestruct.unhooked ? var1.getYaw() : Helper351.INSTANCE.method3483().method3333();
   }

   @Redirect(
      method = {"getLeftText"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/Entity;getPitch()F"
      )
   )
   private float redirectPitch(Entity var1) {
      return SelfDestruct.unhooked ? var1.getPitch() : Helper351.INSTANCE.method3483().method3334();
   }
}
