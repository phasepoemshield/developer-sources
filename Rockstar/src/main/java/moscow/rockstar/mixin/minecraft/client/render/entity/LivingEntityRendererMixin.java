package moscow.rockstar.mixin.minecraft.client.render.entity;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import moscow.rockstar.Rockstar;
import moscow.rockstar.module.visuals.ESP;
import moscow.rockstar.util.mixins.EntityRenderStateAddition;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntityRenderer.class)
public abstract class LivingEntityRendererMixin {

   @Unique
   private Entity rockstar$renderingEntity;

   @Inject(
      method = "render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
      at = @At("HEAD")
   )
   private void rockstar$captureEntity(LivingEntityRenderState state, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, CallbackInfo ci) {
      this.rockstar$renderingEntity = ((EntityRenderStateAddition)state).rockstar$getEntity();
   }

   @WrapOperation(
      method = "render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/entity/model/EntityModel;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;III)V")
   )
   private void rockstar$colorBodyRender(EntityModel<?> model, MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color, Operation<Void> original) {
      Entity entity = this.rockstar$renderingEntity;
      if (entity == null) {
         original.call(model, matrices, vertexConsumer, light, overlay, color);
         return;
      }

      if (entity instanceof PlayerEntity && entity == MinecraftClient.getInstance().player && MinecraftClient.getInstance().options.getPerspective().isFirstPerson()) {
         original.call(model, matrices, vertexConsumer, light, overlay, color);
         return;
      }

      ESP esp = Rockstar.getInstance().getModuleManager().getModule(ESP.class);
      if (!esp.shouldRenderModelChams(entity)) {
         original.call(model, matrices, vertexConsumer, light, overlay, color);
         return;
      }

      original.call(model, matrices, vertexConsumer, esp.getModelChamsLight(light), overlay, esp.getModelChamsColor(entity));
   }
}
