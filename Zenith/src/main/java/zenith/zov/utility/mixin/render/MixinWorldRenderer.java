package zenith.zov.utility.mixin.render;

import net.minecraft.client.gl.PostEffectProcessor;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.render.FrameGraphBuilder;
import net.minecraft.client.render.Fog;
import net.minecraft.client.render.DefaultFramebufferSet;
import net.minecraft.client.gl.PostEffectProcessor.SnowGolemPumpkinFeatureRenderer1;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.IdentifierHolder;
import zenith.longHolder_8;

@Mixin({WorldRenderer.class})
public abstract class MixinWorldRenderer {
   @Shadow
   @Final
   private MinecraftClient client;
   @Shadow
   @Final
   private DefaultFramebufferSet framebufferSet;

   @Redirect(
      method = {"render"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gl/PostEffectProcessor;render(Lnet/minecraft/client/render/FrameGraphBuilder;IILnet/minecraft/client/gl/PostEffectProcessor$FramebufferSet;)V",
         ordinal = 0
      )
   )
   private void zenith$renderShaderEspOutline(PostEffectProcessor PostEffectProcessor, FrameGraphBuilder FrameGraphBuilder, int i, int j, SnowGolemPumpkinFeatureRenderer1 SnowGolemPumpkinFeatureRenderer1) {
      if (!IdentifierHolder.StringHolder_8(FrameGraphBuilder, i, j, SnowGolemPumpkinFeatureRenderer1)) {
         PostEffectProcessor.render(FrameGraphBuilder, i, j, SnowGolemPumpkinFeatureRenderer1);
      }
   }

   @Inject(
      method = {"renderSky(Lnet/minecraft/client/render/FrameGraphBuilder;Lnet/minecraft/client/render/Camera;FLnet/minecraft/client/render/Fog;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/RenderPass;setRenderer(Ljava/lang/Runnable;)V",
         shift = Shift.AFTER
      )}
   )
   private void zenith$renderShaderFogOnSky(FrameGraphBuilder FrameGraphBuilder, Camera Camera, float f, Fog Fog, CallbackInfo callbackinfo) {
      int i = this.client.getFramebuffer().textureWidth;
      int j = this.client.getFramebuffer().textureHeight;
      longHolder_8.StringHolder_8(FrameGraphBuilder, i, j, this.framebufferSet, Camera);
   }
}
