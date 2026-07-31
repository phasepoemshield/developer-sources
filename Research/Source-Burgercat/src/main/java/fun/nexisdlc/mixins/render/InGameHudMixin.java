package fun.nexisdlc.mixins.render;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.modules.impl.render.Crosshair;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.modules.impl.render.NoRender;
import fun.nexisdlc.ui.hud.*;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.gui.hud.InGameHud.BarType;
import net.minecraft.client.gui.hud.bar.Bar;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardEntry;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.Team;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Comparator;
import java.util.List;

@Mixin(InGameHud.class)
public abstract class InGameHudMixin {
    @Shadow
    @Final
    private MinecraftClient client;

    @Shadow
    @Final
    private static Comparator<ScoreboardEntry> SCOREBOARD_ENTRY_COMPARATOR;

    @Shadow
    public abstract TextRenderer getTextRenderer();


    @Inject(
            method = "renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V",
            at = @At("HEAD"),
            cancellable = true
    )
    private void injectRenderScoreboardSidebar(DrawContext context, ScoreboardObjective objective, CallbackInfo ci) {
        ScoreBoardRenderer.render(context, objective, getTextRenderer(), SCOREBOARD_ENTRY_COMPARATOR);

        boolean customEnabled = Nexis.getFunctionManager().getAnInterface() != null
                && Interface.elements.getByName("Кастом скорборд").get();

        if (customEnabled) {
            ci.cancel();
            return;
        }

        if (NoRender.isEnabled("Цифры в скорборде")) {
            renderVanillaNoScores(context, objective);
            ci.cancel();
        }
    }

    @Unique
    private void renderVanillaNoScores(DrawContext context, ScoreboardObjective objective) {
        Scoreboard scoreboard = objective.getScoreboard();

        List<ScoreboardEntry> entries = scoreboard.getScoreboardEntries(objective).stream()
                .filter(e -> !e.hidden())
                .sorted(SCOREBOARD_ENTRY_COMPARATOR)
                .limit(15)
                .toList();

        if (entries.isEmpty()) return;

        TextRenderer tr = getTextRenderer();
        Text title = objective.getDisplayName();
        int titleWidth = tr.getWidth(title);
        int maxWidth = titleWidth;

        List<Text> names = new java.util.ArrayList<>();
        for (ScoreboardEntry entry : entries) {
            Team team = scoreboard.getScoreHolderTeam(entry.owner());
            Text name = Team.decorateName(team, entry.name());
            names.add(name);
            maxWidth = Math.max(maxWidth, tr.getWidth(name));
        }

        int m = entries.size();
        int n = m * 9;
        int o = context.getScaledWindowHeight() / 2 + n / 3;
        int q = context.getScaledWindowWidth() - maxWidth - 3;
        int r = context.getScaledWindowWidth() - 3 + 2;
        int u = o - m * 9;

        int bgDark = client.options.getTextBackgroundColor(0.3F);
        int bgLight = client.options.getTextBackgroundColor(0.4F);

        context.fill(q - 2, u - 9 - 1, r, u - 1, bgLight);
        context.fill(q - 2, u - 1, r, o, bgDark);

        context.drawText(tr, title, q + maxWidth / 2 - titleWidth / 2, u - 9, -1, false);

        for (int v = 0; v < m; v++) {
            int w = o - (m - v) * 9;
            context.drawText(tr, names.get(v), q, w, -1, false);
        }
    }

    @Inject(method = "render", at = @At(value = "HEAD"))
    public void hookTestRender(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        ClientContainer.getNexisInstance().testRender.setDrawContext(context);
    }

    @Inject(method = "render", at = @At("RETURN"))
    public void hookTestRenderPost(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        ClientContainer.getNexisInstance().testRender.runTasks();
    }

    @Inject(method = "renderNauseaOverlay", at = @At("HEAD"), cancellable = true)
    private void cancelNausea(DrawContext context, float distortion, CallbackInfo ci) {
        if (NoRender.isEnabled("Плохие эффекты")) {
            ci.cancel();
        }
    }

    @Inject(method = "renderStatusEffectOverlay", at = @At("HEAD"), cancellable = true)
    private void renderStatusEffectOverlayCustom(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        if (Nexis.getFunctionManager().getAnInterface().isState() && Interface.elements.getByName("Эффекты").get()) {
            ci.cancel();
        }
    }

    @Inject(method = "renderCrosshair", at = @At("HEAD"), cancellable = true)
    private void renderCrosshair(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        Crosshair c = Nexis.getFunctionManager().getCrosshair();
        if (c != null && c.isState()) {
            ci.cancel();
        }
    }

    @Inject(method = "renderHotbar", at = @At("HEAD"), cancellable = true)
    private void cancelVanillaHotbar(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        if (CustomHotbarHud.shouldUseCustomHotbar()) {
            ci.cancel();
        }
    }

    @Inject(method = "renderStatusBars", at = @At("HEAD"), cancellable = true)
    private void cancelVanillaStatusBars(DrawContext context, CallbackInfo ci) {
        if (CustomHotbarHud.shouldRenderCustomArmor()
                || CustomHotbarHud.shouldRenderCustomHearts()
                || CustomHotbarHud.shouldRenderCustomFood()) {
            ci.cancel();
        }
    }

    @Inject(method = "shouldShowExperienceBar", at = @At("HEAD"), cancellable = true)
    private void cancelVanillaExperienceBar(CallbackInfoReturnable<Boolean> cir) {
        if (CustomHotbarHud.shouldUseCustomHotbar()) {
            cir.setReturnValue(false);
        }
    }

    @Inject(method = "getCurrentBarType", at = @At("HEAD"), cancellable = true)
    private void cancelVanillaCurrentBar(CallbackInfoReturnable<BarType> cir) {
        if (CustomHotbarHud.shouldUseCustomHotbar()) {
            cir.setReturnValue(BarType.EMPTY);
        }
    }

    @Redirect(
            method = "renderMainHud",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/gui/hud/bar/Bar;drawExperienceLevel(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/font/TextRenderer;I)V"
            )
    )
    private void cancelVanillaExperienceLevel(DrawContext context, TextRenderer textRenderer, int level) {
        if (!CustomHotbarHud.shouldUseCustomHotbar()) {
            Bar.drawExperienceLevel(context, textRenderer, level);
        }
    }

    @Inject(method = "renderOverlayMessage", at = @At("HEAD"), cancellable = true)
    private void cancelVanillaActionBar(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        if (CustomActionBarHud.shouldUseCustomActionBar()) {
            ci.cancel();
        }
    }

    @Inject(method = "renderHeldItemTooltip", at = @At("HEAD"), cancellable = true)
    private void cancelVanillaHeldItemTooltip(DrawContext context, CallbackInfo ci) {
        if (CustomHeldItemTooltipHud.shouldUseCustomHeldItemTooltip()) {
            ci.cancel();
        }
    }

    @Inject(method = "renderTitleAndSubtitle", at = @At("HEAD"), cancellable = true)
    private void cancelVanillaTitle(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        if (CustomTitleHud.shouldUseCustomTitle()) {
            ci.cancel();
        }
    }
}
