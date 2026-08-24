/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.render.state.GuiRenderState
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.RenderTickCounter
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.mixin.GuiRenderStateAccessor;
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
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u062d\u0644;
import oxxxde.\u0630\u062e;
import oxxxde.\u0634\u0622;
import oxxxde.\u0634\u062c;
import oxxxde.\u0635\u0635;
import oxxxde.\u0637\u0626;
import oxxxde.\u0638\u0642;

@Mixin(value={GameRenderer.class})
public class MixinGameRenderer {
    @Shadow
    @Final
    private GuiRenderState guiState;
    @Unique
    private boolean rain$renderedInventoryManagerGui;

    @Inject(method={"method_3192"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_11228;method_70890(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V", shift=At.Shift.AFTER)})
    public void renderGuiOnly(RenderTickCounter tickCounter, boolean tick, CallbackInfo ci) {
        if (!this.rain$renderedInventoryManagerGui && this.rain$shouldRenderGuiPass()) {
            \u0630\u062e.INSTANCE.hookRender(tickCounter.getTickProgress(false), ClientRenderPipeline.GUI_RECT, ClientRenderPipeline.GUI_SPECIAL, ClientRenderPipeline.GUI_TEXT, ClientRenderPipeline.WINDOW_RECT, ClientRenderPipeline.WINDOW_SPECIAL, ClientRenderPipeline.WINDOW_TEXT);
        }
        this.rain$renderedInventoryManagerGui = false;
    }

    @Unique
    private boolean rain$shouldRenderGuiPass() {
        MinecraftClient client = MinecraftClient.getInstance();
        return \u0635\u0635.INSTANCE.getCustomScreen() != null || client.currentScreen != null || client.getOverlay() != null || \u0634\u0622.hasPendingWork() || \u0637\u0626.hasPending() || \u0638\u0642.hasQueuedGuiOrWindow();
    }

    @Inject(method={"method_3192"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_11228;method_70890(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V", shift=At.Shift.BEFORE)})
    public void renderHudAndBelow(RenderTickCounter tickCounter, boolean tick, CallbackInfo ci) {
        float partialTick = tickCounter.getTickProgress(false);
        \u0630\u062e.INSTANCE.hookRender(partialTick, ClientRenderPipeline.LOW, ClientRenderPipeline.MEDIUM, ClientRenderPipeline.HIGH, ClientRenderPipeline.HUD_RECT, ClientRenderPipeline.HUD_SPECIAL, ClientRenderPipeline.HUD_TEXT);
        boolean bl = this.rain$renderedInventoryManagerGui = \u0635\u0635.INSTANCE.getCustomScreen() == \u0634\u062c.INSTANCE;
        if (!this.rain$renderedInventoryManagerGui) {
            return;
        }
        this.guiState.clear();
        ((GuiRenderStateAccessor)this.guiState).rain$setLastElementBounds(null);
        \u0630\u062e.INSTANCE.hookRender(partialTick, ClientRenderPipeline.GUI_RECT, ClientRenderPipeline.GUI_SPECIAL, ClientRenderPipeline.GUI_TEXT, ClientRenderPipeline.WINDOW_RECT, ClientRenderPipeline.WINDOW_SPECIAL, ClientRenderPipeline.WINDOW_TEXT);
        if (\u0635\u0635.INSTANCE.getCustomScreen() == \u0634\u062c.INSTANCE) {
            int mouseX = \u062d\u0644.INSTANCE.mouseX();
            int mouseY = \u062d\u0644.INSTANCE.mouseY();
            DrawContext graphics = new DrawContext(MinecraftClient.getInstance(), this.guiState, mouseX, mouseY);
            \u0634\u062c.INSTANCE.renderSavedInventoryItems(graphics, mouseX, mouseY);
        }
    }
}

