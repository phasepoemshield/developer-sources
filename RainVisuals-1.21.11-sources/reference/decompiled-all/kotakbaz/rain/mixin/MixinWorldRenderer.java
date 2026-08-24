package kotakbaz.rain.mixin;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.SkyRendering;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.state.SkyRenderState;
import net.minecraft.client.render.state.WorldRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.memory.ObjectAllocator;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.بة;
import oxxxde.ثا;
import oxxxde.رظ;
import oxxxde.شث;
import oxxxde.عج;

// $VF: Compiled from MixinWorldRenderer.java
@Mixin(WorldRenderer.class)
public class MixinWorldRenderer {
   @Unique
   private float rain$partialTicks;

   @Inject(method = "method_22710", at = @At("RETURN"))
   private void rain$onRender(
      ObjectAllocator projectionMatrix,
      RenderTickCounter camera,
      boolean projectionMatrixForCulling,
      Camera positionMatrix,
      Matrix4f tickCounter,
      Matrix4f shouldRenderSky,
      Matrix4f fog,
      GpuBufferSlice allocator,
      Vector4f ci,
      boolean fogColor,
      CallbackInfo renderBlockOutline
   ) {
      MatrixStack matrices = new MatrixStack();
      matrices.multiplyPositionMatrix(new Matrix4f(positionMatrix));
      رظ.INSTANCE.post(new شث(matrices, tickCounter.getTickProgress(false)));
   }

   @ModifyVariable(method = "method_22710", at = @At("HEAD"), argsOnly = true, ordinal = 0)
   private boolean rain$replaceVanillaBlockOutline(boolean renderBlockOutline) {
      return عج.INSTANCE.shouldReplaceVanillaOutline() ? false : renderBlockOutline;
   }

   @Inject(method = "method_62215", at = @At("HEAD"), cancellable = true)
   private static void rain$renderCustomSky(GpuBufferSlice skyState, SkyRenderState ci, SkyRendering fog, CallbackInfo skyRenderer) {
      if (ثا.INSTANCE.renderSky(skyState)) {
         ci.cancel();
      }
   }

   @Inject(method = "method_72916", at = @At("TAIL"))
   private void rain$onSubmitEntities(MatrixStack matrices, WorldRenderState collector, OrderedRenderCommandQueue ci, CallbackInfo levelRenderState) {
      رظ.INSTANCE.post(new بة(matrices, levelRenderState.cameraRenderState, collector, this.rain$partialTicks));
   }

   @Inject(method = "method_22710", at = @At("HEAD"))
   private void rain$capturePartialTicks(
      ObjectAllocator fogColor,
      RenderTickCounter projectionMatrixForCulling,
      boolean positionMatrix,
      Camera camera,
      Matrix4f projectionMatrix,
      Matrix4f renderBlockOutline,
      Matrix4f allocator,
      GpuBufferSlice fog,
      Vector4f shouldRenderSky,
      boolean tickCounter,
      CallbackInfo ci
   ) {
      this.rain$partialTicks = tickCounter.getTickProgress(false);
   }
}
