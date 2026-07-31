package fat.releon.mixins.game.world;

import l.BlockOverlay;
import l.WorldTweaks;
import net.minecraft.client.option.CloudRenderMode;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Fog;
import net.minecraft.client.render.FrameGraphBuilder;
import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.profiler.Profiler;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({WorldRenderer.class})
public abstract class WorldRendererMixin {
   public WorldRendererMixin() {
   }

   @Shadow
   protected abstract void renderMain(
      FrameGraphBuilder var1,
      Frustum var2,
      Camera var3,
      Matrix4f var4,
      Matrix4f var5,
      Fog var6,
      boolean var7,
      boolean var8,
      RenderTickCounter var9,
      Profiler var10
   );

   @Redirect(
      method = {"render"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/WorldRenderer;renderMain(Lnet/minecraft/client/render/FrameGraphBuilder;Lnet/minecraft/client/render/Frustum;Lnet/minecraft/client/render/Camera;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lnet/minecraft/client/render/Fog;ZZLnet/minecraft/client/render/RenderTickCounter;Lnet/minecraft/util/profiler/Profiler;)V"
      )
   )
   private void onRender(
      WorldRenderer var1,
      FrameGraphBuilder var2,
      Frustum var3,
      Camera var4,
      Matrix4f var5,
      Matrix4f var6,
      Fog var7,
      boolean var8,
      boolean var9,
      RenderTickCounter var10,
      Profiler var11
   ) {
      this.renderMain(var2, var3, var4, var5, var6, var7, !BlockOverlay.method2005().isState(), var9, var10, var11);
   }

   @Inject(
      method = {"renderClouds"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hideAmbienceClouds(
      FrameGraphBuilder var1, Matrix4f var2, Matrix4f var3, CloudRenderMode var4, Vec3d var5, float var6, int var7, float var8, CallbackInfo var9
   ) {
      WorldTweaks var10 = WorldTweaks.method2811();
      if (var10 != null && var10.isState() && var10.modeSetting.method2588("No Clouds")) {
         var9.cancel();
      }
   }
}
