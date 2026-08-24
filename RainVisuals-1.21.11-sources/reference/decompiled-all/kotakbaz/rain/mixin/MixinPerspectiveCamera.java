package kotakbaz.rain.mixin;

import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import oxxxde.حش;

// $VF: Compiled from MixinPerspectiveCamera.java
@Mixin(Camera.class)
public abstract class MixinPerspectiveCamera {
   @Shadow
   private float yaw;
   @Shadow
   private float pitch;

   @Inject(method = "method_19321", at = @At("HEAD"))
   private void rain$updatePerspectiveState(World thirdPerson, Entity inverseView, boolean tickDelta, boolean info, float area, CallbackInfo focusedEntity) {
      if (حش.INSTANCE.isPerspectiveActive()) {
         this.pitch = حش.INSTANCE.cameraPitch();
         this.yaw = حش.INSTANCE.cameraYaw();
      }
   }

   @ModifyArgs(method = "method_19321", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_4184;method_19325(FF)V"))
   private void rain$fixPerspectiveRotation(Args args) {
      if (حش.INSTANCE.isPerspectiveActive()) {
         args.set(0, حش.INSTANCE.cameraYaw());
         args.set(1, حش.INSTANCE.cameraPitch());
      }
   }
}
