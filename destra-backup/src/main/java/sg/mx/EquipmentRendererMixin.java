package sg.mx;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexConsumers;
import net.minecraft.client.render.entity.equipment.EquipmentRenderer;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import ru.destra.core.DestraClient;
import ru.destra.module.HitColorModule;
import ru.destra.module.RenderTweaksModule;
import ru.destra.render.ChamsRenderer;
import ru.destra.util.ThreadLocalFlag;

@Mixin(EquipmentRenderer.class)
public abstract class EquipmentRendererMixin {
   @Unique
   private static final Identifier DESTRA_ARMOR_TRIMS_ATLAS_TEXTURE = Identifier.ofVanilla("trims/models/armor/trim_atlas");

   @Redirect(
      method = "render",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/RenderLayer;getArmorCutoutNoCull(Lnet/minecraft/util/Identifier;)Lnet/minecraft/client/render/RenderLayer;")
   )
   private RenderLayer destra$useEntityLayerForHurtArmor(Identifier var1) {
      return destra$shouldColorArmor() ? RenderLayer.getEntityCutoutNoCull(var1) : RenderLayer.getArmorCutoutNoCull(var1);
   }

   @Redirect(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/TexturedRenderLayers;getArmorTrims(Z)Lnet/minecraft/client/render/RenderLayer;"))
   private RenderLayer destra$useEntityLayerForHurtArmorTrim(boolean var1) {
      if (destra$shouldColorArmor()) {
         return var1 ? RenderLayer.getEntityDecal(DESTRA_ARMOR_TRIMS_ATLAS_TEXTURE) : RenderLayer.getEntityCutoutNoCull(DESTRA_ARMOR_TRIMS_ATLAS_TEXTURE);
      } else {
         return TexturedRenderLayers.getArmorTrims(var1);
      }
   }

   @Redirect(method = "render", at = @At(value = "FIELD", target = "Lnet/minecraft/client/render/OverlayTexture;DEFAULT_UV:I"))
   private int destra$useHurtOverlayUvForArmor() {
      return destra$shouldColorArmor() ? OverlayTexture.packUv(0, 3) : OverlayTexture.DEFAULT_UV;
   }

   @WrapOperation(
      method = "render",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/item/ItemRenderer;getArmorGlintConsumer(Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/client/render/RenderLayer;Z)Lnet/minecraft/client/render/VertexConsumer;"
      )
   )
   private VertexConsumer destra$captureArmorBase(VertexConsumerProvider var1, RenderLayer var2, boolean var3, Operation<VertexConsumer> var4) {
      return destra$unionArmorMaskConsumer(var2, (VertexConsumer)var4.call(new Object[]{var1, var2, var3}));
   }

   @WrapOperation(
      method = "render",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/VertexConsumerProvider;getBuffer(Lnet/minecraft/client/render/RenderLayer;)Lnet/minecraft/client/render/VertexConsumer;")
   )
   private VertexConsumer destra$captureArmorTrim(VertexConsumerProvider var1, RenderLayer var2, Operation<VertexConsumer> var3) {
      return destra$unionArmorMaskConsumer(var2, (VertexConsumer)var3.call(new Object[]{var1, var2}));
   }

   @Unique
   private static boolean destra$shouldColorArmor() {
      DestraClient var0 = DestraClient.getInstance();
      if (var0 != null && var0.getModuleManager() != null) {
         HitColorModule var1 = var0.getModuleManager().hitColor;
         if (var1 != null && var1.enabled && var1.shouldColorArmor()) {
            RenderTweaksModule var2 = var0.getModuleManager().renderTweaks;
            return var2 != null && var2.shouldHideHurtFlash() ? false : ThreadLocalFlag.get();
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Unique
   private static VertexConsumer destra$unionArmorMaskConsumer(RenderLayer var0, VertexConsumer var1) {
      VertexConsumer var2 = ChamsRenderer.getVertexConsumer(var0);
      return var2 == null ? var1 : VertexConsumers.union(var1, var2);
   }

}
