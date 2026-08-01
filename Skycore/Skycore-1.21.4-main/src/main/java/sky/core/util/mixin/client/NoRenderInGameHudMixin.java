package sky.core.util.mixin.client;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import sky.core.util.NoRenderUtil;

@Mixin(InGameHud.class)
public class NoRenderInGameHudMixin {
    @Inject(method = "renderTitleAndSubtitle", at = @At("HEAD"), cancellable = true)
    private void skycore$hideTitles(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        if (NoRenderUtil.shouldCancel(NoRenderUtil.Type.TITLE)) {
            ci.cancel();
        }
    }

    @Inject(method = "renderScoreboardSidebar", at = @At("HEAD"), cancellable = true)
    private void skycore$hideScoreboardTick(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        if (NoRenderUtil.shouldCancel(NoRenderUtil.Type.SCOREBOARD)) {
            ci.cancel();
        }
    }

    @Inject(
            method = "renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V",
            at = @At("HEAD"),
            cancellable = true
    )
    private void skycore$hideScoreboardObjective(
            DrawContext context,
            net.minecraft.scoreboard.ScoreboardObjective objective,
            CallbackInfo ci
    ) {
        if (NoRenderUtil.shouldCancel(NoRenderUtil.Type.SCOREBOARD)) {
            ci.cancel();
        }
    }

    @Inject(method = "renderVignetteOverlay", at = @At("HEAD"), cancellable = true)
    private void skycore$hideVignette(DrawContext context, Entity entity, CallbackInfo ci) {
        if (NoRenderUtil.shouldCancel(NoRenderUtil.Type.VIGNETTE)) {
            ci.cancel();
        }
    }
}
