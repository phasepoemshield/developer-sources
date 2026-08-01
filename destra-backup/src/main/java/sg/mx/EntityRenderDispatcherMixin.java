package sg.mx;

import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.world.WorldView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.core.Module;
import ru.destra.misc.TargetEntityProvider;
import ru.destra.module.ChamsModule;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(EntityRenderDispatcher.class)
public class EntityRenderDispatcherMixin {
   private static final String шОТ;

   @Inject(method = "renderHitbox", at = @At("HEAD"), cancellable = true)
   private static void destra$cancelVanillaHitboxWhenCustomEnabled(
      MatrixStack var0, VertexConsumer var1, Entity var2, float var3, float var4, float var5, float var6, CallbackInfo var7
   ) {
      if (destra$isCustomHitboxEnabled()) {
         var7.cancel();
      }
   }

   private static boolean destra$isCustomHitboxEnabled() {
      DestraClient var0 = DestraClient.getInstance();
      if (var0 != null && var0.getModuleManager() != null && var0.getModuleManager().modules != null) {
         for (Module var2 : var0.getModuleManager().modules) {
            if (var2 != null && шОТ.equalsIgnoreCase(var2.Д())) {
               return var2.Д();
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Inject(method = "renderShadow", at = @At("HEAD"), cancellable = true)
   private static void destra$disableShadowForChams(
      MatrixStack var0, VertexConsumerProvider var1, EntityRenderState var2, float var3, float var4, WorldView var5, float var6, CallbackInfo var7
   ) {
      DestraClient var8 = DestraClient.getInstance();
      if (var8 != null && var8.getModuleManager() != null && var8.getModuleManager().chams != null) {
         ChamsModule var9 = var8.getModuleManager().chams;
         Entity var10 = TargetEntityProvider.getTarget();
         if (var9.Д() && var10 != null && var9.isValidChamTarget(var10)) {
            var7.cancel();
         }
      }
   }

   static {
      VMBridge.identifyClass(EntityRenderDispatcherMixin.class, "nHv4FdXR");
   }
}
