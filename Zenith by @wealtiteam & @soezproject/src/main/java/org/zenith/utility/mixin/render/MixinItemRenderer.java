package org.zenith.utility.mixin.render;

import org.zenith.core.TargetInterpolator;
import org.zenith.module.Module;
import org.zenith.util.Item;

import org.zenith.module.HandFire;

import org.zenith.module.HandFire;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;














import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ItemRenderer.class})
public class MixinItemRenderer {
   public MixinItemRenderer() {
   }

   @Inject(
      method = {"getArmorGlintConsumer(Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/client/render/RenderLayer;Z)Lnet/minecraft/client/render/VertexConsumer;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void noArmorGlintInHandFirePass(VertexConsumerProvider var0, RenderLayer var1, boolean var2, CallbackInfoReturnable<VertexConsumer> var3) {
      if (HandFire.zClass101()) {
         var3.setReturnValue(var0.getBuffer(var1));
      }
   }

   @Inject(
      method = {"getItemGlintConsumer(Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/client/render/RenderLayer;ZZ)Lnet/minecraft/client/render/VertexConsumer;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void noItemGlintInHandFirePass(
      VertexConsumerProvider var0, RenderLayer var1, boolean var2, boolean var3, CallbackInfoReturnable<VertexConsumer> var4
   ) {
      if (HandFire.zClass101()) {
         var4.setReturnValue(var0.getBuffer(var1));
      }
   }
}
