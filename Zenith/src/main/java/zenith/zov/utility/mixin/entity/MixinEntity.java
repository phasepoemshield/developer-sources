package zenith.zov.utility.mixin.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import project.weye.metadata.Transpile;
import zenith.ZenithInternal018;
import zenith.AntiInvisible;
import zenith.ZenithClient;
import zenith.ZenithInternal076;
import zenith.Shaderesp;

@Mixin({Entity.class})
public abstract class MixinEntity implements ZenithInternal076 {
   @Shadow
   private float pitch;
   @Shadow
   public float prevPitch;
   @Shadow
   public float prevYaw;

   @Shadow
   public abstract void setPitch(float f);

   @Shadow
   public abstract void setYaw(float f);

   @Shadow
   public abstract float getYaw();

   @Shadow
   public abstract float getPitch();

   @Shadow
   public abstract String getNameForScoreboard();

   @ModifyExpressionValue(
      method = {"move"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/Entity;isControlledByPlayer()Z"
      )}
   )
   public boolean fixFalldistanceValue(boolean flag) {
      return this == l11I1I1ll1Illll1I1l1111l1II.player ? false : flag;
   }

   @Inject(
      method = {"isInvisible"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void bypassSpeed(CallbackInfoReturnable<Boolean> callbackinforeturnable) {
      if (AntiInvisible.l1ll1lIl1llllll1.Spider()
         && (
            this == l11I1I1ll1Illll1I1l1111l1II.player
               || ZenithClient.getInstance().StringHolder_26().StringHolder_15(this.getNameForScoreboard())
         )) {
         callbackinforeturnable.setReturnValue(false);
      }
   }

   @Redirect(
      method = {"updateVelocity"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/Entity;getYaw()F"
      )
   )
   @Transpile
   public float movementCorrection(Entity Entity) {
      return Entity instanceof ClientPlayerEntity
            && ZenithClient.getInstance().ZenithInternal057().I111Ill1lIllIIIl() != null
         ? ZenithClient.getInstance().ZenithInternal057().I111Ill1lIllIIIl().AutoBrewing()
         : Entity.getYaw();
   }

   @Inject(
      method = {"onRemoved"},
      at = {@At("TAIL")}
   )
   private void onRemoved(CallbackInfo callbackinfo) {
      if (this instanceof PlayerEntity PlayerEntity) {
         ZenithInternal018.StringHolder_27(PlayerEntity.getId());
      }
   }

   @Inject(
      method = {"isGlowing"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void zenith$shaderEspGlowing(CallbackInfoReturnable<Boolean> callbackinforeturnable) {
      Shaderesp ll1i1illiii111l1llliill = Shaderesp.IIlIII1I1Il1I111IlIl1lII;
      Entity Entity = (Entity)this;
      if (ll1i1illiii111l1llliill != null && ll1i1illiii111l1llliill.Spider() && ll1i1illiii111l1llliill.ZenithInternal042(Entity)) {
         callbackinforeturnable.setReturnValue(true);
      }
   }
}
