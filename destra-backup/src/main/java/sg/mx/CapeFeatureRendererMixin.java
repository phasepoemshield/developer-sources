package sg.mx;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.CapeFeatureRenderer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.misc.CapeConfig;
import ru.destra.model.CustomModelInstance;
import ru.destra.model.CustomModelManager;
import ru.destra.module.CapeModule;
import ru.destra.module.CosmeticModule;

@Mixin(CapeFeatureRenderer.class)
public class CapeFeatureRendererMixin {
   @Inject(method = "render", at = @At("HEAD"), cancellable = true)
   private void destra$cancelVanillaCapeWhenPhysicsEnabled(
      MatrixStack var1, VertexConsumerProvider var2, int var3, PlayerEntityRenderState var4, float var5, float var6, CallbackInfo var7
   ) {
      if (this.destra$shouldHideCapeFromCustomModel(var4)) {
         var7.cancel();
      } else if (CapeConfig.shouldUseCustomRendering()) {
         MinecraftClient var8 = MinecraftClient.getInstance();
         if (var8.player != null) {
            if (DestraClient.getInstance() != null && DestraClient.getInstance().getModuleManager() != null) {
               if (var4.id == var8.player.getId()) {
                  var7.cancel();
               }
            }
         }
      }
   }

   @WrapOperation(
      method = "render",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/entity/model/BipedEntityModel;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;II)V")
   )
   private void destra$tintVanillaCape(
      BipedEntityModel<?> var1,
      MatrixStack var2,
      VertexConsumer var3,
      int var4,
      int var5,
      Operation<Void> var6,
      MatrixStack var7,
      VertexConsumerProvider var8,
      int var9,
      PlayerEntityRenderState var10,
      float var11,
      float var12
   ) {
      int var13 = this.destra$getCapeColor(var10);
      if (var13 == -1) {
         var6.call(new Object[]{var1, var2, var3, var4, var5});
      } else {
         var1.render(var2, var3, var4, var5, var13);
      }
   }

   private int destra$getCapeColor(PlayerEntityRenderState var1) {
      MinecraftClient var2 = MinecraftClient.getInstance();
      if (var2.player != null && var1 != null && var1.id == var2.player.getId()) {
         DestraClient var3 = DestraClient.getInstance();
         if (var3 != null && var3.getModuleManager() != null) {
            CapeModule var4 = var3.getModuleManager().cape;
            return var4 != null && var4.Д() && var4.customColor.isEnabled() ? var4.getCapeColor(0) : -1;
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   private boolean destra$shouldHideCapeFromCustomModel(PlayerEntityRenderState var1) {
      MinecraftClient var2 = MinecraftClient.getInstance();
      if (var2.player != null && var1 != null && var1.id == var2.player.getId()) {
         CustomModelInstance var3 = CustomModelManager.Р().Ъ();
         return var3 != null && (var3.shouldHideCape() || this.destra$shouldHideCapeFromModule());
      } else {
         return false;
      }
   }

   private boolean destra$shouldHideCapeFromModule() {
      DestraClient var1 = DestraClient.getInstance();
      if (var1 != null && var1.getModuleManager() != null) {
         CosmeticModule var2 = var1.getModuleManager().cosmetic;
         return var2 != null && var2.isCapeDisabled();
      } else {
         return false;
      }
   }
}
