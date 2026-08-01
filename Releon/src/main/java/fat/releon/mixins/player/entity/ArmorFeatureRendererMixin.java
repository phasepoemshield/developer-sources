package fat.releon.mixins.player.entity;

import l.Cosmetic;
import l.Helper309;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.state.BipedEntityRenderState;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ArmorFeatureRenderer.class})
public abstract class ArmorFeatureRendererMixin<S extends BipedEntityRenderState, M extends BipedEntityModel<S>> extends FeatureRenderer<S, M> {
   public ArmorFeatureRendererMixin(FeatureRendererContext<S, M> var1) {
      super(var1);
   }

   @Inject(
      method = {"render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/state/BipedEntityRenderState;FF)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void releon$cancelArmorRenderForCosmetic(MatrixStack var1, VertexConsumerProvider var2, int var3, S var4, float var5, float var6, CallbackInfo var7) {
      MinecraftClient var8 = MinecraftClient.getInstance();
      Cosmetic var9 = Cosmetic.method1873();
      if (var8.world != null && var8.player != null && var9 != null && var9.isState()) {
         if (var4 instanceof PlayerEntityRenderState var10) {
            PlayerEntity var11 = (PlayerEntity)var8.world.getEntityById(var10.id);
            if (var11 != null) {
               boolean var12 = var11 == var8.player;
               boolean var13 = Helper309.method3075(var11);
               if (var12 || var13 && var9.method1878(var11)) {
                  var7.cancel();
               }
            }
         }
      }
   }
}
