package org.wild.mixin;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.ColorHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.Chams;
import ru.metaculture.protection.ChinaHat;
import ru.metaculture.protection.DeadEffect;
import ru.metaculture.protection.NameTags;
import ru.metaculture.protection.O0000O00OO000;
import ru.metaculture.protection.PrismaticChamsRenderer;
import ru.metaculture.protection.SeeInvisibles;
import ru.metaculture.protection.WildClient;

@Mixin({LivingEntityRenderer.class})
public abstract class MixinLivingEntityRenderer {
   @Shadow
   protected EntityModel<? super LivingEntityRenderState> model;
   @Unique
   private PlayerEntityRenderState wild$lastPlayerState;

   @Inject(
      method = {"getRenderLayer"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$usePrismaticChams(
      LivingEntityRenderState livingEntityRenderState, boolean bl, boolean bl2, boolean bl3, CallbackInfoReturnable<RenderLayer> callbackInfoReturnable
   ) {
      if (!O0000O00OO000.O00000000().O00000000000O0()) {
         Chams var6 = Chams.O000000000O();
         if (var6 != null && var6.O00000000(livingEntityRenderState)) {
            callbackInfoReturnable.setReturnValue(PrismaticChamsRenderer.O00000000(var6));
         }
      }
   }

   @Inject(
      method = {"shouldRenderFeatures"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$skipFeaturesForPrismaticChams(LivingEntityRenderState livingEntityRenderState, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
      if (O0000O00OO000.O00000000().O00000000000OO()) {
         callbackInfoReturnable.setReturnValue(false);
      } else if (!O0000O00OO000.O00000000().O00000000000O0()) {
         Chams var3 = Chams.O000000000O();
         if (var3 != null && var3.O000000000(livingEntityRenderState)) {
            callbackInfoReturnable.setReturnValue(false);
         }
      }
   }

   @Inject(
      method = {"getShadowRadius(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;)F"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$hidePrismaticChamsShadow(LivingEntityRenderState livingEntityRenderState, CallbackInfoReturnable<Float> callbackInfoReturnable) {
      if (!O0000O00OO000.O00000000().O00000000000O0()) {
         Chams var3 = Chams.O000000000O();
         if (var3 != null && var3.O0000000000(livingEntityRenderState)) {
            callbackInfoReturnable.setReturnValue(0.0F);
         }
      }
   }

   @Redirect(
      method = {"render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/VertexConsumerProvider;getBuffer(Lnet/minecraft/client/render/RenderLayer;)Lnet/minecraft/client/render/VertexConsumer;"
      )
   )
   private VertexConsumer wild$captureBaseLayer(
      VertexConsumerProvider vertexConsumerProvider,
      RenderLayer renderLayer,
      LivingEntityRenderState livingEntityRenderState,
      MatrixStack matrixStack,
      VertexConsumerProvider vertexConsumerProvider2,
      int i
   ) {
      VertexConsumer var7 = vertexConsumerProvider.getBuffer(renderLayer);
      Chams var8 = Chams.O000000000O();
      return var8 != null && var8.O00000000(livingEntityRenderState) ? var7 : O0000O00OO000.O00000000().O00000000(var7, renderLayer, livingEntityRenderState);
   }

   @Redirect(
      method = {"render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/model/EntityModel;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;III)V"
      )
   )
   private void redirectModelRender(
      EntityModel<LivingEntityRenderState> entityModel,
      MatrixStack matrixStack,
      VertexConsumer vertexConsumer,
      int i,
      int j,
      int k,
      LivingEntityRenderState livingEntityRenderState,
      MatrixStack matrixStack2,
      VertexConsumerProvider vertexConsumerProvider,
      int l
   ) {
      if (O0000O00OO000.O00000000().O00000000000O0()) {
         entityModel.render(matrixStack, vertexConsumer, i, j, k);
         this.wild$lastPlayerState = null;
      } else {
         Chams var12 = Chams.O000000000O();
         if (var12 != null && var12.O00000000(livingEntityRenderState)) {
            float var17 = var12.O00000000000(livingEntityRenderState);
            PrismaticChamsRenderer.O00000000000();
            if (var12.O0000000000O0O()) {
               this.wild$renderChamsPass(
                  entityModel, matrixStack, vertexConsumerProvider, livingEntityRenderState, i, j, k, PrismaticChamsRenderer.O0000000000(), 1.0F, var17
               );
               this.wild$renderChamsPass(
                  entityModel, matrixStack, vertexConsumerProvider, livingEntityRenderState, i, j, k, PrismaticChamsRenderer.O000000000(), 0.0F, var17
               );
            } else {
               RenderLayer var18 = var12.O0000000000OO() ? PrismaticChamsRenderer.O000000000() : PrismaticChamsRenderer.O0000000000();
               float var15 = var12.O0000000000OO() ? 0.0F : 1.0F;
               this.wild$renderChamsPass(entityModel, matrixStack, vertexConsumerProvider, livingEntityRenderState, i, j, k, var18, var15, var17);
            }

            if (livingEntityRenderState instanceof PlayerEntityRenderState var19 && (Object)entityModel instanceof PlayerEntityModel var21) {
               DeadEffect.O00000000(var19, var21, matrixStack, vertexConsumerProvider, i, j);
            }

            this.wild$lastPlayerState = livingEntityRenderState instanceof PlayerEntityRenderState var20 ? var20 : null;
         } else {
            entityModel.render(matrixStack, vertexConsumer, i, j, this.wild$applySeeInvisiblesAlpha(livingEntityRenderState, k));
            if (livingEntityRenderState instanceof PlayerEntityRenderState var13 && (Object)entityModel instanceof PlayerEntityModel var14) {
               DeadEffect.O00000000(var13, var14, matrixStack, vertexConsumerProvider, i, j);
            }

            this.wild$lastPlayerState = livingEntityRenderState instanceof PlayerEntityRenderState var16 ? var16 : null;
         }
      }
   }

   @Unique
   private int wild$applySeeInvisiblesAlpha(LivingEntityRenderState livingEntityRenderState, int i) {
      if (livingEntityRenderState instanceof PlayerEntityRenderState && livingEntityRenderState.invisible) {
         SeeInvisibles var3 = WildClient.O00000000.O000000000.O00000000(SeeInvisibles.class);
         return var3 != null && var3.O0000000000000 ? ColorHelper.withAlpha(Math.round(var3.O000000000O.O0000000000() * 255.0F), i) : i;
      } else {
         return i;
      }
   }

   @Redirect(
      method = {"render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/feature/FeatureRenderer;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/state/EntityRenderState;FF)V"
      )
   )
   private void wild$captureFeatureRender(
      FeatureRenderer<?, ?> featureRenderer,
      MatrixStack matrixStack,
      VertexConsumerProvider vertexConsumerProvider,
      int i,
      EntityRenderState entityRenderState,
      float f,
      float g
   ) {
      if (entityRenderState instanceof LivingEntityRenderState var8) {
         O0000O00OO000.O00000000().O00000000(featureRenderer, matrixStack, vertexConsumerProvider, i, var8, f, g);
      } else {
         ((FeatureRenderer)featureRenderer).render(matrixStack, vertexConsumerProvider, i, entityRenderState, f, g);
      }
   }

   @Inject(
      method = {"render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/util/math/MatrixStack;pop()V"
      )}
   )
   private void wild$capturePlayerModelOverlays(
      LivingEntityRenderState livingEntityRenderState, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, CallbackInfo callbackInfo
   ) {
      try {
         if (O0000O00OO000.O00000000().O00000000000O0()) {
            this.wild$lastPlayerState = null;
            return;
         }

         PlayerEntityRenderState var6 = this.wild$lastPlayerState;
         this.wild$lastPlayerState = null;
         if (var6 == null || !(livingEntityRenderState instanceof PlayerEntityRenderState var7) || var7 != var6) {
            return;
         }

         if (!((Object)this.model instanceof PlayerEntityModel var9)) {
            return;
         }

         NameTags.O00000000(var6, var9, matrixStack);
         Chams var10 = Chams.O000000000O();
         if (var10 == null || !var10.O000000000(livingEntityRenderState)) {
            ChinaHat.O00000000(var6, var9, matrixStack, vertexConsumerProvider, i);
            return;
         }
      } catch (Throwable var14) {
         return;
      } finally {
         O0000O00OO000.O00000000().O00000000(livingEntityRenderState);
      }
   }

   @Unique
   private void wild$renderChamsPass(
      EntityModel<LivingEntityRenderState> entityModel,
      MatrixStack matrixStack,
      VertexConsumerProvider vertexConsumerProvider,
      LivingEntityRenderState livingEntityRenderState,
      int i,
      int j,
      int k,
      RenderLayer renderLayer,
      float f,
      float g
   ) {
      Chams var11 = Chams.O000000000O();
      if (var11 != null) {
         PrismaticChamsRenderer.O00000000(var11, livingEntityRenderState, f, g);
         VertexConsumer var12 = O0000O00OO000.O00000000().O00000000(vertexConsumerProvider.getBuffer(renderLayer), renderLayer, livingEntityRenderState);
         entityModel.render(matrixStack, var12, i, j, ColorHelper.withAlpha(255, k));
         if (vertexConsumerProvider instanceof Immediate var13) {
            var13.draw(renderLayer);
         }
      }
   }
}
