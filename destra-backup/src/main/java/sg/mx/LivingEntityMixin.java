package sg.mx;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.destra.core.DestraClient;
import ru.destra.event.JumpEvent;
import ru.destra.misc.ChatCommandSender2;
import ru.destra.misc.FakePlayerEntity;
import ru.destra.module.HandsAnimationModule;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
   @Inject(method = "jump", at = @At("HEAD"), cancellable = true)
   public void adsf(CallbackInfo var1) {
      LivingEntity var2 = (LivingEntity)this;
      MinecraftClient client = MinecraftClient.getInstance();
      if (client != null && var2 == client.player) {
         DestraClient.getInstance().getEventBus().post(new JumpEvent());
      }
   }

   @Inject(method = "getHandSwingDuration", at = @At("HEAD"), cancellable = true)
   private void destra$applyHandsAnimationDuration(CallbackInfoReturnable<Integer> var1) {
      HandsAnimationModule var2 = destra$getHandsAnimation();
      if (var2 != null && var2.Д()) {
         LivingEntity var3 = (LivingEntity)this;
         MinecraftClient client = MinecraftClient.getInstance();
         if (client != null && var3 == client.player) {
            var1.setReturnValue(var2.getAnimationInterval());
         }
      }
   }

   @ModifyExpressionValue(
      method = "tickRiptide",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;getOtherEntities(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Box;)Ljava/util/List;")
   )
   private List<Entity> destra$ignoreFakePlayerDuringRiptide(List<Entity> var1) {
      if (var1.isEmpty()) {
         return var1;
      }

      ArrayList var2 = null;

      for (Entity var4 : var1) {
         if (!(var4 instanceof FakePlayerEntity)) {
            if (var2 != null) {
               var2.add(var4);
            }
         } else if (var2 == null) {
            var2 = new ArrayList(var1.size() - 1);

            for (Entity var6 : var1) {
               if (var6 == var4) {
                  break;
               }

               var2.add(var6);
            }
         }
      }

      return var2 != null ? var2 : var1;
   }

   private static HandsAnimationModule destra$getHandsAnimation() {
      return DestraClient.getInstance() != null && DestraClient.getInstance().getModuleManager() != null
         ? DestraClient.getInstance().getModuleManager().handsAnimation
         : null;
   }
}
