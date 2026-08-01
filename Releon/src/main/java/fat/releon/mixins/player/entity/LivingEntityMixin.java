package fat.releon.mixins.player.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import l.Helper124;
import l.Helper336;
import l.Helper351;
import l.Helper352;
import l.Helper368;
import l.Helper369;
import l.Helper372;
import l.Event19;
import l.Helper434;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({LivingEntity.class})
public abstract class LivingEntityMixin {
   @Shadow
   public float bodyYaw;

   public LivingEntityMixin() {
   }

   @Shadow
   public abstract boolean hasStatusEffect(RegistryEntry<StatusEffect> var1);

   @Shadow
   @Nullable
   public abstract StatusEffectInstance getStatusEffect(RegistryEntry<StatusEffect> var1);

   @Shadow
   public abstract boolean isInSwimmingPose();

   @Unique
   private static MinecraftClient client() {
      return MinecraftClient.getInstance();
   }

   @Inject(
      method = {"isPushable"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void isPushable(CallbackInfoReturnable<Boolean> var1) {
      Helper369 var2 = new Helper369(Helper368.COLLISION);
      Helper124.method1026(var2);
      if (var2.method581()) {
         var1.setReturnValue(false);
      }
   }

   @Redirect(
      method = {"calcGlidingVelocity"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;getPitch()F"
      )
   )
   private float hookModifyFallFlyingPitch(LivingEntity var1) {
      if ((Object)this != MinecraftClient.getInstance().player) {
         return var1.getPitch();
      } else {
         Helper351 var2 = Helper351.INSTANCE;
         Helper336 var3 = var2.method3483();
         Helper352 var4 = var2.method3499();
         return var3 != null && var4 != null && var4.method3547() && !var4.method3548() ? var3.method3334() : var1.getPitch();
      }
   }

   @Redirect(
      method = {"calcGlidingVelocity"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;getRotationVector()Lnet/minecraft/util/math/Vec3d;"
      )
   )
   private Vec3d hookModifyFallFlyingRotationVector(LivingEntity var1) {
      if ((Object)this != MinecraftClient.getInstance().player) {
         return var1.getRotationVector();
      } else {
         Helper351 var2 = Helper351.INSTANCE;
         Helper336 var3 = var2.method3483();
         Helper352 var4 = var2.method3499();
         return var3 != null && var4 != null && var4.method3547() && !var4.method3548() ? var3.method3329() : var1.getRotationVector();
      }
   }

   @Inject(
      method = {"jump"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void jump(CallbackInfo var1) {
      if ((Object)this instanceof ClientPlayerEntity var2) {
         Helper372 var3 = new Helper372(var2);
         Helper124.method1026(var3);
         if (var3.method581()) {
            var1.cancel();
         }
      }
   }

   @ModifyExpressionValue(
      method = {"jump"},
      at = {@At(
         value = "NEW",
         target = "(DDD)Lnet/minecraft/util/math/Vec3d;"
      )}
   )
   private Vec3d hookFixRotation(Vec3d var1) {
      MinecraftClient var2 = client();
      if (var2 != null && var2.player != null && (Object)this == var2.player) {
         float var3 = Helper351.INSTANCE.method3496().method3333() * (float) (Math.PI / 180.0);
         return new Vec3d(-MathHelper.sin(var3) * 0.2F, 0.0, MathHelper.cos(var3) * 0.2F);
      } else {
         return var1;
      }
   }

   @ModifyExpressionValue(
      method = {"calcGlidingVelocity"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;getPitch()F"
      )}
   )
   private float hookModifyFallFlyingPitch(float var1) {
      MinecraftClient var2 = client();
      return var2 != null && var2.player != null && (Object)this == var2.player ? Helper351.INSTANCE.method3496().method3334() : var1;
   }

   @ModifyExpressionValue(
      method = {"calcGlidingVelocity"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;getRotationVector()Lnet/minecraft/util/math/Vec3d;"
      )}
   )
   private Vec3d hookModifyFallFlyingRotationVector(Vec3d var1) {
      MinecraftClient var2 = client();
      return var2 != null && var2.player != null && (Object)this == var2.player ? Helper351.INSTANCE.method3496().method3329() : var1;
   }

   @Inject(
      method = {"getHandSwingDuration"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void swingProgressHook(CallbackInfoReturnable<Integer> var1) {
      MinecraftClient var2 = client();
      if (var2 != null && var2.player != null && (Object)this == var2.player) {
         Helper434 var3 = new Helper434();
         Helper124.method1026(var3);
         if (var3.method581()) {
            float var4 = var3.method4521();
            if (StatusEffectUtil.hasHaste(var2.player)) {
               var4 *= 6 - (1 + StatusEffectUtil.getHasteAmplifier(var2.player));
            } else {
               var4 *= this.hasStatusEffect(StatusEffects.MINING_FATIGUE) ? 6 + (1 + this.getStatusEffect(StatusEffects.MINING_FATIGUE).getAmplifier()) * 2 : 6;
            }

            var1.setReturnValue((int)var4);
         }
      }
   }

   @Inject(
      method = {"onDeath"},
      at = {@At("HEAD")}
   )
   private void onDeath(DamageSource var1, CallbackInfo var2) {
      LivingEntity var3 = (LivingEntity)(Object)this;
      Event19 var4 = new Event19(var3, var1);
      Helper124.method1026(var4);
   }

   @Inject(
      method = {"handleStatus"},
      at = {@At("HEAD")}
   )
   private void handleStatus(byte var1, CallbackInfo var2) {
      if (var1 == 3) {
         LivingEntity var3 = (LivingEntity)(Object)this;
         Event19 var4 = new Event19(var3, null);
         Helper124.method1026(var4);
      }
   }
}
