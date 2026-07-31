package sg.mx;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.DimensionEffects;
import net.minecraft.client.render.Fog;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.render.DimensionEffects.SkyType;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.module.WorldCustomizerModule;
import ru.destra.render.SkyShaderRenderer;

@Mixin(WorldRenderer.class)
public abstract class WorldRendererSkyShaderMixin {
   @Shadow
   @Final
   private MinecraftClient client;

   /**
    * Cancel vanilla sky when it is disabled or replaced by the custom shader sky.
    * Shader must be drawn here on cancel — AFTER injects inside the cancelled method never run.
    */
   @Inject(method = "method_62215", at = @At("HEAD"), cancellable = true)
   private void destra$cancelSky(Fog fog, SkyType skyType, float tickDelta, DimensionEffects effects, CallbackInfo ci) {
      WorldCustomizerModule customizer = destra$getCustomizer();
      if (customizer == null || this.client.player == null || this.client.world == null || this.client.gameRenderer.isRenderingPanorama()) {
         return;
      }
      if (customizer.й()) {
         ci.cancel();
         return;
      }
      if (customizer.isSkyShaderVisible()) {
         ci.cancel();
         SkyShaderRenderer.renderSky(customizer);
      }
   }

   @Inject(method = "method_62215", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;draw()V", shift = Shift.AFTER))
   private void destra$renderSkyShader(Fog fog, SkyType skyType, float tickDelta, DimensionEffects effects, CallbackInfo ci) {
      // Fallback if HEAD cancel did not run (e.g. unexpected sky path). Normally shader is drawn in destra$cancelSky.
      WorldCustomizerModule customizer = destra$getCustomizer();
      if (customizer != null
         && customizer.isSkyShaderVisible()
         && this.client.player != null
         && this.client.world != null
         && !this.client.gameRenderer.isRenderingPanorama()) {
         SkyShaderRenderer.renderSky(customizer);
      }
   }

   @Inject(method = "method_62215", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/SkyRendering;renderEndSky()V", shift = Shift.AFTER))
   private void destra$renderEndSkyShader(Fog fog, SkyType skyType, float tickDelta, DimensionEffects effects, CallbackInfo ci) {
      WorldCustomizerModule customizer = destra$getCustomizer();
      if (customizer != null
         && customizer.isSkyShaderVisible()
         && this.client.player != null
         && this.client.world != null
         && !this.client.gameRenderer.isRenderingPanorama()) {
         SkyShaderRenderer.renderSky(customizer);
      }
   }

   @Unique
   private static WorldCustomizerModule destra$getCustomizer() {
      return DestraClient.getInstance() != null && DestraClient.getInstance().getModuleManager() != null
         ? DestraClient.getInstance().getModuleManager().worldCustomizer
         : null;
   }
}
