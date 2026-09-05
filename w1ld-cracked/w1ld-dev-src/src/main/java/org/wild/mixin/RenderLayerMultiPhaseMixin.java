package org.wild.mixin;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat.class_5595;
import java.util.function.Consumer;
import net.minecraft.class_276;
import net.minecraft.class_9801;
import net.minecraft.class_1921.class_4687;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import ru.metaculture.protection.Oc000Ooc;

@Mixin({class_4687.class})
public abstract class RenderLayerMultiPhaseMixin implements Oc000Ooc {
   @Unique
   private Consumer<RenderPass> renderPassSetup;

   @Override
   public class_4687 withRenderPassSetup(Consumer<RenderPass> var1) {
      this.renderPassSetup = var1;
      return (class_4687)this;
   }

   @Inject(
      method = {"draw"},
      at = {@At(
         value = "INVOKE",
         target = "Lcom/mojang/blaze3d/systems/RenderPass;drawIndexed(IIII)V"
      )},
      locals = LocalCapture.CAPTURE_FAILHARD
   )
   private void applyRenderPassSetup(
      class_9801 var1,
      CallbackInfo var2,
      GpuBufferSlice var3,
      class_9801 var4,
      GpuBuffer var5,
      GpuBuffer var6,
      class_5595 var7,
      class_276 var8,
      GpuTextureView var9,
      GpuTextureView var10,
      RenderPass var11
   ) {
      if (this.renderPassSetup != null) {
         this.renderPassSetup.accept(var11);
      }
   }
}
