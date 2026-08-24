package moscow.rockstar.mixin.minecraft.client.gui.overlay;

import moscow.rockstar.Rockstar;
import moscow.rockstar.module.visuals.Beautifully;
import moscow.rockstar.module.visuals.Removals;
import net.minecraft.block.enums.CameraSubmersionType;
import net.minecraft.client.render.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Camera.class)
public abstract class CameraMixin {
   @Inject(method = "getSubmersionType", at = @At("HEAD"), cancellable = true)
   private void getSubmergedFluidState(CallbackInfoReturnable<CameraSubmersionType> ci) {
      Removals removals = Rockstar.getInstance().getModuleManager().getModule(Removals.class);
      if (removals.isEnabled() && removals.getWater().isSelected()) {
         ci.setReturnValue(CameraSubmersionType.NONE);
      }
   }

   @Inject(method = "clipToSpace", at = @At("RETURN"), cancellable = true)
   private void onClipToSpace(float desiredCameraDistance, CallbackInfoReturnable<Float> info) {
      Removals removals = Rockstar.getInstance().getModuleManager().getModule(Removals.class);
      if (removals.getClip().isSelected() && removals.isEnabled()) {
         info.setReturnValue(desiredCameraDistance);
         return;
      }

      Beautifully beautifully = Rockstar.getInstance().getModuleManager().getModule(Beautifully.class);
      if (beautifully != null && beautifully.isSmoothF5Enabled()) {
         float anim = beautifully.getSmoothAnimation().getValue();
         info.setReturnValue(info.getReturnValueF() * anim);
      }
   }
}
