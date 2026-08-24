package kotakbaz.rain.mixin;

import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.render.state.GuiRenderState;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderTickCounter;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.حل;
import oxxxde.ذخ;
import oxxxde.شآ;
import oxxxde.شج;
import oxxxde.صص;
import oxxxde.طئ;
import oxxxde.ظق;

// $VF: Compiled from MixinGameRenderer.java
@Mixin(GameRenderer.class)
public class MixinGameRenderer {
   @Shadow
   @Final
   private GuiRenderState guiState;
   @Unique
   private boolean rain$renderedInventoryManagerGui;

   @Inject(
      method = "method_3192",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/class_11228;method_70890(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V", shift = Shift.AFTER)
   )
   public void renderGuiOnly(RenderTickCounter tickCounter, boolean tick, CallbackInfo ci) {
      if (!this.rain$renderedInventoryManagerGui && this.rain$shouldRenderGuiPass()) {
         ذخ.INSTANCE
            .hookRender(
               tickCounter.getTickProgress(false),
               ClientRenderPipeline.GUI_RECT,
               ClientRenderPipeline.GUI_SPECIAL,
               ClientRenderPipeline.GUI_TEXT,
               ClientRenderPipeline.WINDOW_RECT,
               ClientRenderPipeline.WINDOW_SPECIAL,
               ClientRenderPipeline.WINDOW_TEXT
            );
      }

      this.rain$renderedInventoryManagerGui = false;
   }

   @Unique
   private boolean rain$shouldRenderGuiPass() {
      MinecraftClient client = MinecraftClient.getInstance();
      return صص.INSTANCE.getCustomScreen() != null
         || client.currentScreen != null
         || client.getOverlay() != null
         || شآ.hasPendingWork()
         || طئ.hasPending()
         || ظق.hasQueuedGuiOrWindow();
   }

   @Inject(
      method = "method_3192",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/class_11228;method_70890(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V", shift = Shift.BEFORE)
   )
   public void renderHudAndBelow(RenderTickCounter ci, boolean tick, CallbackInfo tickCounter) {
      float partialTick = tickCounter.getTickProgress(false);
      ذخ.INSTANCE
         .hookRender(
            partialTick,
            ClientRenderPipeline.LOW,
            ClientRenderPipeline.MEDIUM,
            ClientRenderPipeline.HIGH,
            ClientRenderPipeline.HUD_RECT,
            ClientRenderPipeline.HUD_SPECIAL,
            ClientRenderPipeline.HUD_TEXT
         );
      this.rain$renderedInventoryManagerGui = صص.INSTANCE.getCustomScreen() == شج.INSTANCE;
      if (this.rain$renderedInventoryManagerGui) {
         this.guiState.clear();
         ((GuiRenderStateAccessor)this.guiState).rain$setLastElementBounds(null);
         ذخ.INSTANCE
            .hookRender(
               partialTick,
               ClientRenderPipeline.GUI_RECT,
               ClientRenderPipeline.GUI_SPECIAL,
               ClientRenderPipeline.GUI_TEXT,
               ClientRenderPipeline.WINDOW_RECT,
               ClientRenderPipeline.WINDOW_SPECIAL,
               ClientRenderPipeline.WINDOW_TEXT
            );
         if (صص.INSTANCE.getCustomScreen() == شج.INSTANCE) {
            int mouseX = حل.INSTANCE.mouseX();
            int mouseY = حل.INSTANCE.mouseY();
            DrawContext graphics = new DrawContext(MinecraftClient.getInstance(), this.guiState, mouseX, mouseY);
            شج.INSTANCE.renderSavedInventoryItems(graphics, mouseX, mouseY);
         }
      }
   }
}
