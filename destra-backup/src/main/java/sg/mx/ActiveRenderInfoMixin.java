package sg.mx;

import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.module.FreeLookModule;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(Camera.class)
public abstract class ActiveRenderInfoMixin {
   @Shadow
   private float pitch;
   @Shadow
   private float yaw;
   @Shadow
   private Entity focusedEntity;
   @Shadow
   private boolean ready;
   @Shadow
   private BlockView area;
   @Shadow
   private boolean thirdPerson;
   @Shadow
   private float cameraY;
   @Shadow
   private float lastCameraY;
   private static final float ж诶;
   private static final float жП;
   private static final float ж2;
   private static final float жХ;

   @Shadow
   protected abstract void setPos(Vec3d var1);

   @Shadow
   protected abstract void setRotation(float var1, float var2);

   @Shadow
   protected abstract float clipToSpace(float var1);

   @Shadow
   protected abstract void moveBy(float var1, float var2, float var3);

   @Inject(method = "update", at = @At("HEAD"), cancellable = true)
   private void onSetup(BlockView var1, Entity var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
      if (DestraClient.getInstance().getModuleManager().freeLook.Д() && FreeLookModule.isFreeLooking) {
         this.ready = true;
         this.area = var1;
         this.focusedEntity = var2;
         this.thirdPerson = var3;
         this.setRotation(FreeLookModule.lerpYaw(var5), FreeLookModule.lerpPitch(var5));
         this.setPos(
            new Vec3d(
               MathHelper.lerp(var5, var2.prevX, var2.getX()),
               MathHelper.lerp(var5, var2.prevY, var2.getY()) + MathHelper.lerp(var5, this.lastCameraY, this.cameraY),
               MathHelper.lerp(var5, var2.prevZ, var2.getZ())
            )
         );
         if (var3) {
            if (var4) {
               this.setRotation(this.yaw + ж诶, -this.pitch);
            }

            this.moveBy(-this.clipToSpace(жП), 0.0F, 0.0F);
         } else if (var2 instanceof LivingEntity && ((LivingEntity)var2).isSleeping()) {
            Direction var7 = ((LivingEntity)var2).getSleepingDirection();
            this.setRotation(var7 != null ? var7.getPositiveHorizontalDegrees() - ж2 : 0.0F, 0.0F);
            this.moveBy(0.0F, жХ, 0.0F);
         }

         var6.cancel();
      }
   }

   static {
      VMBridge.identifyClass(ActiveRenderInfoMixin.class, "0PXEWxPG");
   }
}
