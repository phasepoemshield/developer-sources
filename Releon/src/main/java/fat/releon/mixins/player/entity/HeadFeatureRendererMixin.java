package fat.releon.mixins.player.entity;

import l.Cosmetic;
import l.ChinaHat;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.feature.HeadFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.ModelWithHead;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({HeadFeatureRenderer.class})
public abstract class HeadFeatureRendererMixin<S extends LivingEntityRenderState, M extends EntityModel<S> & ModelWithHead> extends FeatureRenderer<S, M> {
   public HeadFeatureRendererMixin(FeatureRendererContext<S, M> var1) {
      super(var1);
   }

   @Inject(
      method = {"render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/state/LivingEntityRenderState;FF)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void releon$renderChinaHat(MatrixStack var1, VertexConsumerProvider var2, int var3, S var4, float var5, float var6, CallbackInfo var7) {
      if (var4 instanceof PlayerEntityRenderState var8) {
         MinecraftClient var9 = MinecraftClient.getInstance();
         if (var9.world != null) {
            if (var9.world.getEntityById(var8.id) instanceof PlayerEntity var11) {
               Cosmetic var12 = Cosmetic.method1873();
               if (var12 != null && var12.isState() && var12.method1878(var11)) {
                  var7.cancel();
               } else {
                  ChinaHat var13 = ChinaHat.method2242();
                  if (var13 != null && var13.isState()) {
                     var13.method2233(var1, var2, var11, this.getContextModel());
                  }
               }
            }
         }
      }
   }
}
