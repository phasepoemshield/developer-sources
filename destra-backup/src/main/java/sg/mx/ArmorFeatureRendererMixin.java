package sg.mx;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.equipment.EquipmentRenderer;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.state.BipedEntityRenderState;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.model.CustomModelInstance;
import ru.destra.model.CustomModelManager;
import ru.destra.module.CosmeticModule;
import ru.destra.util.ThreadLocalFlag;

@Mixin(ArmorFeatureRenderer.class)
public abstract class ArmorFeatureRendererMixin {
   @Shadow
   private EquipmentRenderer equipmentRenderer;

   @Inject(method = "render", at = @At("HEAD"), cancellable = true)
   private void destra$hideArmorForCustomModel(
      MatrixStack var1, VertexConsumerProvider var2, int var3, BipedEntityRenderState var4, float var5, float var6, CallbackInfo var7
   ) {
      if (var4 instanceof PlayerEntityRenderState var8) {
         MinecraftClient var9 = MinecraftClient.getInstance();
         if (var9.player != null && var8.id == var9.player.getId()) {
            CustomModelInstance var10 = CustomModelManager.Р().Ъ();
            if (var10 != null && (var10.shouldHideArmor() || this.destra$shouldHideArmorFromModule())) {
               var7.cancel();
            }
         }
      }
   }

   @WrapOperation(
      method = "render",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/feature/ArmorFeatureRenderer;renderArmor(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/EquipmentSlot;ILnet/minecraft/client/render/entity/model/BipedEntityModel;)V"
      )
   )
   private void destra$renderArmorFromCustomPivot(
      ArmorFeatureRenderer<?, ?, ?> var1,
      MatrixStack var2,
      VertexConsumerProvider var3,
      ItemStack var4,
      EquipmentSlot var5,
      int var6,
      BipedEntityModel<?> var7,
      Operation<Void> var8,
      MatrixStack var9,
      VertexConsumerProvider var10,
      int var11,
      BipedEntityRenderState var12,
      float var13,
      float var14
   ) {
      if (var12 instanceof PlayerEntityRenderState var15) {
         MinecraftClient var16 = MinecraftClient.getInstance();
         if (var16.player != null && var15.id == var16.player.getId()) {
            CustomModelInstance var17 = CustomModelManager.Р().Ъ();
            if (var17 != null && var17.必(var4, var5, var7, this.equipmentRenderer, var3, var6)) {
               return;
            }
         }
      }

      var8.call(new Object[]{var1, var2, var3, var4, var5, var6, var7});
   }

   @Inject(method = "render", at = @At("HEAD"))
   private void destra$captureHurtState(
      MatrixStack var1, VertexConsumerProvider var2, int var3, BipedEntityRenderState var4, float var5, float var6, CallbackInfo var7
   ) {
      ThreadLocalFlag.set(var4 != null && var4.hurt);
   }

   @Inject(method = "render", at = @At("RETURN"))
   private void destra$resetHurtState(
      MatrixStack var1, VertexConsumerProvider var2, int var3, BipedEntityRenderState var4, float var5, float var6, CallbackInfo var7
   ) {
      ThreadLocalFlag.set(false);
   }

   private boolean destra$shouldHideArmorFromModule() {
      DestraClient var1 = DestraClient.getInstance();
      if (var1 != null && var1.getModuleManager() != null) {
         CosmeticModule var2 = var1.getModuleManager().cosmetic;
         return var2 != null && var2.isArmorDisabled();
      } else {
         return false;
      }
   }
}
