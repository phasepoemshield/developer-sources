package org.wild.mixin;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.NameTags;
import ru.metaculture.protection.O0000O00OO000;
import ru.metaculture.protection.O0000O00OO000O;
import ru.metaculture.protection.ProtectInfo;
import ru.metaculture.protection.WildClient;

@Mixin({EntityRenderer.class})
public abstract class EntityRendererMixin<S extends EntityRenderState> {
   @Inject(
      method = {"updateRenderState"},
      at = {@At("TAIL")}
   )
   private void wild$attachEntityId(Entity entity, S entityRenderState, float f, CallbackInfo callbackInfo) {
      ((O0000O00OO000O)entityRenderState).wild$setEntityId(entity.getId());
   }

   @Inject(
      method = {"renderLabelIfPresent"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderLabelIfPresent(
      S entityRenderState, Text text, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, CallbackInfo callbackInfo
   ) {
      NameTags var7 = WildClient.O00000000.O000000000.O00000000(NameTags.class);
      if (var7 != null && var7.O00000000((int)(entityRenderState.width * 100.0F))) {
         callbackInfo.cancel();
      }
   }

   @ModifyVariable(
      method = {"renderLabelIfPresent"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0
   )
   private Text litka$maskNametag(Text text) {
      return ProtectInfo.O00000000(text);
   }

   @Inject(
      method = {"renderLabelIfPresent"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void skipLabelDuringCapture(
      EntityRenderState entityRenderState, Text text, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, CallbackInfo callbackInfo
   ) {
      if (O0000O00OO000.O00000000().O00000000000O0()) {
         callbackInfo.cancel();
      }
   }
}
