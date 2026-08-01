package fat.releon.mixins.player.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import l.Helper124;
import l.Helper160;
import l.Helper351;
import l.Helper368;
import l.Helper369;
import l.Event12;
import l.Helper392;
import l.Event22;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.border.WorldBorder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Entity.class})
public abstract class EntityMixin implements Helper160 {
   @Shadow
   private Box boundingBox;
   @Shadow
   public float yaw;
   @Unique
   private final MinecraftClient client = MinecraftClient.getInstance();

   public EntityMixin() {
   }

   @Redirect(
      method = {"updateVelocity"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/Entity;movementInputToVelocity(Lnet/minecraft/util/math/Vec3d;FF)Lnet/minecraft/util/math/Vec3d;"
      )
   )
   public Vec3d hookVelocity(Vec3d var1, float var2, float var3) {
      if ((Object)this == mc.player) {
         Event22 var4 = new Event22(var1, var2, var3, Entity.movementInputToVelocity(var1, var2, var3));
         Helper124.method1026(var4);
         return var4.method4080();
      } else {
         return Entity.movementInputToVelocity(var1, var2, var3);
      }
   }

   @Inject(
      method = {"updateVelocity"},
      at = {@At("TAIL")}
   )
   private void releon$movePost(float var1, Vec3d var2, CallbackInfo var3) {
      if ((Object)this == mc.player) {
         Helper124.method1026(new Event12(var1, var2));
      }
   }

   @Inject(
      method = {"getBoundingBox"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public final void getBoundingBox(CallbackInfoReturnable<Box> var1) {
      Helper392 var2 = new Helper392(this.boundingBox, (Entity)(Object)this);
      Helper124.method1026(var2);
      var1.setReturnValue(var2.getBox());
   }

   @ModifyVariable(
      method = {"getRotationVector(FF)Lnet/minecraft/util/math/Vec3d;"},
      at = @At("HEAD"),
      ordinal = 0,
      argsOnly = true
   )
   private float modifyPitch(float var1) {
      return (Object)this instanceof ClientPlayerEntity && Helper351.INSTANCE.method3486() ? Helper351.INSTANCE.method3485() : var1;
   }

   @ModifyVariable(
      method = {"getRotationVector(FF)Lnet/minecraft/util/math/Vec3d;"},
      at = @At("HEAD"),
      ordinal = 1,
      argsOnly = true
   )
   private float modifyYaw(float var1) {
      return (Object)this instanceof ClientPlayerEntity && Helper351.INSTANCE.method3486() ? Helper351.INSTANCE.method3484() : var1;
   }

   @ModifyExpressionValue(
      method = {"move"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/Entity;isControlledByPlayer()Z"
      )}
   )
   public boolean isControlledByPlayerHook(boolean var1) {
      return (Object)this == mc.player ? false : var1;
   }

   @Redirect(
      method = {"findCollisionsForMovement(Lnet/minecraft/entity/Entity;Lnet/minecraft/world/World;Ljava/util/List;Lnet/minecraft/util/math/Box;)Ljava/util/List;"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/border/WorldBorder;canCollide(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Box;)Z"
      )
   )
   private static boolean hookWorldBorderCollision(WorldBorder var0, Entity var1, Box var2) {
      if (var1 == MinecraftClient.getInstance().player) {
         Helper369 var3 = new Helper369(Helper368.WORLD_BORDER);
         Helper124.method1026(var3);
         if (var3.method581()) {
            return false;
         }
      }

      return var0.canCollide(var1, var2);
   }
}
