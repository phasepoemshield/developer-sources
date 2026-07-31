package org.wild.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.Event;
import ru.metaculture.protection.EventManager;
import ru.metaculture.protection.GrimGlide;
import ru.metaculture.protection.NoDelay;
import ru.metaculture.protection.O0000000O0OO00;
import ru.metaculture.protection.O0000000O0OOO0;
import ru.metaculture.protection.Removals;
import ru.metaculture.protection.SwingAnimation;
import ru.metaculture.protection.WildClient;

@Mixin({LivingEntity.class})
public abstract class LivingEntityMixin {
   @Unique
   private final MinecraftClient client = MinecraftClient.getInstance();

   @Shadow
   public abstract boolean hasStatusEffect(RegistryEntry<StatusEffect> registryEntry);

   @Shadow
   @Nullable
   public abstract StatusEffectInstance getStatusEffect(RegistryEntry<StatusEffect> registryEntry);

   @Inject(
      method = {"jump"},
      at = {@At("HEAD")}
   )
   public void jumpYo(CallbackInfo callbackInfo) {
      LivingEntity var2 = (LivingEntity)(Object)this;
      if (var2 instanceof ClientPlayerEntity) {
         EventManager.O00000000((Event)(new O0000000O0OO00()));
      }
   }

   @Inject(
      method = {"hasStatusEffect"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onHasStatusEffect(RegistryEntry<StatusEffect> registryEntry, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
      LivingEntity var3 = (LivingEntity)(Object)this;
      if (var3 instanceof ClientPlayerEntity && Removals.O00000000(registryEntry)) {
         callbackInfoReturnable.setReturnValue(false);
      }
   }

   @Inject(
      method = {"getStatusEffect"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onGetStatusEffect(RegistryEntry<StatusEffect> registryEntry, CallbackInfoReturnable<StatusEffectInstance> callbackInfoReturnable) {
      LivingEntity var3 = (LivingEntity)(Object)this;
      if (var3 instanceof ClientPlayerEntity && Removals.O00000000(registryEntry)) {
         callbackInfoReturnable.setReturnValue(null);
      }
   }

   @Inject(
      method = {"getHandSwingDuration"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void swingProgressHook(CallbackInfoReturnable<Integer> callbackInfoReturnable) {
      LivingEntity var2 = (LivingEntity)(Object)this;
      if (var2 instanceof ClientPlayerEntity) {
         if (WildClient.O000000000OO0()) {
            if (this.client != null && this.client.player != null) {
               if (var2 == this.client.player) {
                  if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
                     SwingAnimation var3 = (SwingAnimation)WildClient.O00000000.O000000000.O000000000(SwingAnimation.class);
                     if (var3 != null && var3.O0000000000000) {
                        if (!SwingAnimation.O000000000O.O000000000("Off")) {
                           if (SwingAnimation.O0000000000O0()) {
                              float var4 = SwingAnimation.O000000000O0.O0000000000();
                              if (!(var4 <= 0.0F)) {
                                 int var5 = 6;
                                 if (StatusEffectUtil.hasHaste(var2)) {
                                    var5 = Math.max(1, var5 - (1 + StatusEffectUtil.getHasteAmplifier(var2)));
                                 } else if (this.hasStatusEffect(StatusEffects.MINING_FATIGUE)) {
                                    StatusEffectInstance var6 = this.getStatusEffect(StatusEffects.MINING_FATIGUE);
                                    if (var6 != null) {
                                       var5 += (1 + var6.getAmplifier()) * 2;
                                    }
                                 }

                                 int var7 = Math.max(1, (int)(var5 / var4));
                                 callbackInfoReturnable.setReturnValue(var7);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ModifyConstant(
      method = {"tickMovement"},
      constant = {@Constant(
         intValue = 10
      )}
   )
   private int modifyJumpTicks(int i) {
      LivingEntity var2 = (LivingEntity)(Object)this;
      if (var2 instanceof ClientPlayerEntity) {
         NoDelay var3 = WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null
            ? (NoDelay)WildClient.O00000000.O000000000.O000000000(NoDelay.class)
            : null;
         if (var3 != null && var3.O0000000000000 && NoDelay.O000000000O.O0000000000()) {
            return (int)NoDelay.O000000000O0O.O0000000000();
         }
      }

      return i;
   }

   @Inject(
      method = {"calcGlidingVelocity"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void wild$onCalcGlidingVelocity(Vec3d vec3d, CallbackInfoReturnable<Vec3d> callbackInfoReturnable) {
      LivingEntity var3 = (LivingEntity)(Object)this;
      if (var3 instanceof ClientPlayerEntity) {
         if (WildClient.O000000000OO0() && WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
            GrimGlide var4 = WildClient.O00000000.O000000000.O00000000(GrimGlide.class);
            if (var4 != null && var4.O0000000000000) {
               O0000000O0OOO0 var5 = new O0000000O0OOO0(vec3d.multiply(0.99F, 0.98F, 0.99F));
               EventManager.O00000000((Event)var5);
               callbackInfoReturnable.setReturnValue(var5.O0000000000());
            }
         }
      }
   }
}
