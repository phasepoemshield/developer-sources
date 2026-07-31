package sg.mx;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.destra.core.DestraClient;
import ru.destra.core.ModuleManager;
import ru.destra.module.FreeLookModule;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(Entity.class)
public class EntityMixin {
   private static final double Рэ;
   private static final double РЩ;

   @Inject(method = "isLogicalSideForUpdatingMovement", at = @At("HEAD"), cancellable = true)
   private void isLogicalSideForUpdatingMovement(CallbackInfoReturnable<Boolean> var1) {
      if ((Entity)this instanceof ClientPlayerEntity) {
         var1.setReturnValue(true);
      }
   }

   @ModifyExpressionValue(method = "move", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;isControlledByPlayer()Z"))
   private boolean fixFallDistanceCalculation(boolean var1) {
      return this == MinecraftClient.getInstance().player ? false : var1;
   }

   @Inject(method = "changeLookDirection", at = @At("HEAD"), cancellable = true)
   private void onTurn(double var1, double var3, CallbackInfo var5) {
      if (DestraClient.getInstance() != null
         && DestraClient.getInstance().getModuleManager() != null
         && DestraClient.getInstance().getModuleManager().freeLook != null
         && DestraClient.getInstance().getModuleManager().freeLook.Д()
         && FreeLookModule.isFreeLooking) {
         double var6 = var3 * Рэ;
         double var8 = var1 * РЩ;
         FreeLookModule.applyMouseDelta(var8, var6);
         var5.cancel();
      }
   }

   @Inject(method = "isGlowing", at = @At("HEAD"), cancellable = true)
   public void asd(CallbackInfoReturnable<Boolean> var1) {
      DestraClient var2 = DestraClient.getInstance();
      if (var2 != null && var2.getModuleManager() != null) {
         ModuleManager var3 = var2.getModuleManager();
         boolean var4 = var3.renderTweaks != null && var3.renderTweaks.Д() && var3.renderTweaks.щТ.isEnabled();
         boolean var5 = var3.chams != null && var3.chams.Д();
         if (var4 || var5) {
            var1.setReturnValue(false);
         }
      }
   }

   static {
      VMBridge.identifyClass(EntityMixin.class, "eCfsQeNS");
   }
}
