package kotakbaz.rain.mixin;

import net.minecraft.client.gui.hud.InGameOverlayRenderer;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.registry.tag.TagKey;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import oxxxde.شص;

// $VF: Compiled from MixinNoFluidInGameOverlayRenderer.java
@Mixin(InGameOverlayRenderer.class)
public class MixinNoFluidInGameOverlayRenderer {
   @Redirect(method = "method_23067", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_746;method_5777(Lnet/minecraft/class_6862;)Z"))
   private boolean rain$skipUnderwaterOverlay(ClientPlayerEntity player, TagKey<Fluid> tag) {
      return شص.INSTANCE.shouldClearWaterOverlay() ? false : player.isSubmergedIn(tag);
   }
}
