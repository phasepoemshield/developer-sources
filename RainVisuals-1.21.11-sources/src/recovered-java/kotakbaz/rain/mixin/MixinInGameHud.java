/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gl.RenderPipelines
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.hud.InGameHud
 *  net.minecraft.client.gui.hud.PlayerListHud
 *  net.minecraft.client.render.RenderTickCounter
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.scoreboard.AbstractTeam
 *  net.minecraft.scoreboard.Scoreboard
 *  net.minecraft.scoreboard.ScoreboardDisplaySlot
 *  net.minecraft.scoreboard.ScoreboardEntry
 *  net.minecraft.scoreboard.ScoreboardObjective
 *  net.minecraft.scoreboard.Team
 *  net.minecraft.scoreboard.number.NumberFormat
 *  net.minecraft.scoreboard.number.StyledNumberFormat
 *  net.minecraft.text.MutableText
 *  net.minecraft.text.StringVisitable
 *  net.minecraft.text.Text
 *  net.minecraft.util.Arm
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.math.MathHelper
 *  org.joml.Matrix3x2fStack
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import kotakbaz.rain.module.modules.hud.TargetHudModule;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.scoreboard.AbstractTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardEntry;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.Team;
import net.minecraft.scoreboard.number.NumberFormat;
import net.minecraft.scoreboard.number.StyledNumberFormat;
import net.minecraft.text.MutableText;
import net.minecraft.text.StringVisitable;
import net.minecraft.text.Text;
import net.minecraft.util.Arm;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import org.joml.Matrix3x2fStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u062a\u0639;
import oxxxde.\u062b\u0631;
import oxxxde.\u062b\u0643;
import oxxxde.\u062e\u0635;
import oxxxde.\u0630\u062c;
import oxxxde.\u0634\u0643;
import oxxxde.\u0635\u0628;
import oxxxde.\u0635\u0650;
import oxxxde.\u0636\u0642;

@Mixin(value={InGameHud.class})
public abstract class MixinInGameHud {
    @Unique
    private float rain$tabProgress = 0.0f;
    @Unique
    private static final int RAIN_SCOREBOARD_CORNER_RADIUS = 8;
    @Unique
    private static final Comparator<ScoreboardEntry> RAIN_SCOREBOARD_ENTRY_COMPARATOR = Comparator.comparingInt(ScoreboardEntry::value).reversed().thenComparing(ScoreboardEntry::owner, String.CASE_INSENSITIVE_ORDER);
    @Unique
    private long rain$lastHotbarAnimationUpdate = 0L;
    @Final
    @Shadow
    private PlayerListHud playerListHud;
    private boolean rain$scoreboardScaled = false;
    @Unique
    private float rain$animatedHotbarSlot = -1.0f;
    @Unique
    private long rain$lastTabAnimationUpdate = 0L;
    @Final
    @Shadow
    private MinecraftClient client;

    @Unique
    private void rain$updateTabProgress() {
        long now = System.nanoTime();
        ScoreboardObjective objective = this.client.world == null ? null : this.client.world.getScoreboard().getObjectiveForSlot(ScoreboardDisplaySlot.LIST);
        boolean show = this.rain$shouldShowPlayerList(objective);
        if (this.rain$lastTabAnimationUpdate == 0L) {
            this.rain$lastTabAnimationUpdate = now;
        }
        float deltaSeconds = Math.min((float)(now - this.rain$lastTabAnimationUpdate) / 1.0E9f, 0.05f);
        this.rain$lastTabAnimationUpdate = now;
        float speed = deltaSeconds * 14.0f;
        this.rain$tabProgress = MathHelper.clamp((float)(this.rain$tabProgress + (show ? speed : -speed)), (float)0.0f, (float)1.0f);
        \u0630\u062c.INSTANCE.setTabProgress(this.rain$tabProgress);
    }

    @Redirect(method={"method_1759"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1657;method_6068()Lnet/minecraft/class_1306;"))
    private Arm rain$keepChangeHandOffhandLeft(PlayerEntity player) {
        if (\u0636\u0642.INSTANCE.shouldKeepLeftOffhandSlotInHud()) {
            return Arm.RIGHT;
        }
        return player.getMainArm();
    }

    @Inject(method={"method_37298"}, at={@At(value="HEAD")})
    private void rain$renderCrosshairHp(DrawContext context, PlayerEntity player, int x, int y, int lines, int regeneratingHeartIndex, float maxHealth, int lastHealth, int health, int absorption, boolean blinking, CallbackInfo ci) {
        \u0634\u0643.INSTANCE.render(context);
    }

    @Unique
    private float rain$getAnimatedHotbarSlot(int targetSlot) {
        long now = System.nanoTime();
        if (!this.rain$shouldAnimateHotbar()) {
            this.rain$animatedHotbarSlot = targetSlot;
            this.rain$lastHotbarAnimationUpdate = now;
            return targetSlot;
        }
        if (this.rain$animatedHotbarSlot < 0.0f) {
            this.rain$animatedHotbarSlot = targetSlot;
            this.rain$lastHotbarAnimationUpdate = now;
            return targetSlot;
        }
        float deltaSeconds = Math.min((float)(now - this.rain$lastHotbarAnimationUpdate) / 1.0E9f, 0.05f);
        this.rain$lastHotbarAnimationUpdate = now;
        float factor = MathHelper.clamp((float)(deltaSeconds * 20.0f), (float)0.0f, (float)1.0f);
        this.rain$animatedHotbarSlot += ((float)targetSlot - this.rain$animatedHotbarSlot) * factor;
        if (Math.abs((float)targetSlot - this.rain$animatedHotbarSlot) < 0.01f) {
            this.rain$animatedHotbarSlot = targetSlot;
        }
        return this.rain$animatedHotbarSlot;
    }

    @Inject(method={"method_1753"}, at={@At(value="RETURN")})
    private void rain$renderSmoothTab(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        if (!this.rain$shouldAnimateTab() || this.rain$tabProgress <= 0.0f || this.client.player == null || this.client.world == null) {
            return;
        }
        Scoreboard scoreboard = this.client.world.getScoreboard();
        ScoreboardObjective objective = scoreboard.getObjectiveForSlot(ScoreboardDisplaySlot.LIST);
        boolean show = this.rain$shouldShowPlayerList(objective);
        if (!show && this.rain$tabProgress < 0.01f) {
            return;
        }
        Matrix3x2fStack matrices = context.getMatrices();
        matrices.pushMatrix();
        matrices.translate(0.0f, (1.0f - this.rain$tabProgress) * -10.0f);
        this.playerListHud.render(context, context.getScaledWindowWidth(), scoreboard, objective);
        matrices.popMatrix();
    }

    @Unique
    private boolean rain$pushScoreboardScale(DrawContext context) {
        float scale = ((Float)\u0635\u0628.INSTANCE.getScoreboardScale().getValue()).floatValue();
        if (scale == 1.0f) {
            return false;
        }
        Matrix3x2fStack matrices = context.getMatrices();
        float screenWidth = context.getScaledWindowWidth();
        float screenHeight = context.getScaledWindowHeight();
        float offsetX = screenWidth * (1.0f - scale);
        float offsetY = screenHeight * (1.0f - scale) * 0.5f;
        matrices.pushMatrix();
        matrices.translate(offsetX, offsetY);
        matrices.scale(scale, scale);
        return true;
    }

    @Inject(method={"method_1759"}, at={@At(value="RETURN")})
    private void rain$renderCooldownsLikeOldRain(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        if (this.client.player == null) {
            return;
        }
        \u062a\u0639.INSTANCE.renderHotbarCooldowns(context, (PlayerEntity)this.client.player);
    }

    @Inject(method={"method_1762"}, at={@At(value="HEAD")})
    private void rain$renderItemHighliterHotbarBackground(DrawContext context, int x, int y, RenderTickCounter tickCounter, PlayerEntity player, ItemStack stack, int seed, CallbackInfo ci) {
        \u062b\u0631.INSTANCE.renderHighlight(context, stack, x, y);
    }

    @Inject(method={"method_1753"}, at={@At(value="RETURN")})
    private void rain$renderFuntimeTrapTimer(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        \u062b\u0643.INSTANCE.renderTrapTimer(context);
    }

    @Shadow
    public abstract TextRenderer getTextRenderer();

    @Unique
    private boolean rain$shouldAnimateHotbar() {
        return \u0630\u062c.INSTANCE.isEnabled() && (Boolean)\u0630\u062c.INSTANCE.getAnimateHotbar().getValue() != false;
    }

    @Inject(method={"method_1757"}, at={@At(value="RETURN")})
    private void rain$scoreboardTail(DrawContext context, ScoreboardObjective objective, CallbackInfo ci) {
        if (!this.rain$scoreboardScaled) {
            return;
        }
        context.getMatrices().popMatrix();
        this.rain$scoreboardScaled = false;
    }

    @Redirect(method={"method_1759"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_52706(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_2960;IIII)V", ordinal=1))
    private void rain$renderAnimatedHotbarSelection(DrawContext context, RenderPipeline pipeline, Identifier texture, int x, int y, int width, int height) {
        if (pipeline != RenderPipelines.GUI_TEXTURED || this.client.player == null) {
            context.drawGuiTexture(pipeline, texture, x, y, width, height);
            return;
        }
        int selectedSlot = this.client.player.getInventory().getSelectedSlot();
        float animatedSlot = this.rain$getAnimatedHotbarSlot(selectedSlot);
        int animatedX = MathHelper.floor((float)((float)x + (animatedSlot - (float)selectedSlot) * 20.0f));
        context.drawGuiTexture(pipeline, texture, animatedX, y, width, height);
    }

    @Redirect(method={"method_1757"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_51439(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;IIIZ)V"), require=0)
    private void rain$redirectScoreText(DrawContext context, TextRenderer textRenderer, Text text, int x, int y, int color, boolean shadow) {
        if (this.shouldHideScoreText(text.getString())) {
            return;
        }
        context.drawText(textRenderer, text, x, y, color, shadow);
    }

    @Unique
    private int rain$scoreboardCornerOffset(int radius, int distanceFromEdge) {
        double edgeDistance = (double)(radius - distanceFromEdge) - 0.5;
        double inside = Math.sqrt(Math.max(0.0, (double)(radius * radius) - edgeDistance * edgeDistance));
        return MathHelper.clamp((int)((int)Math.ceil((double)radius - inside)), (int)0, (int)radius);
    }

    @Inject(method={"method_70837"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$cancelBossBarHud(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        if (\u0635\u0650.INSTANCE.isEnabled() && ((Boolean)\u0635\u0650.INSTANCE.getNoBossBar().getValue()).booleanValue()) {
            ci.cancel();
        }
    }

    @Inject(method={"method_1753"}, at={@At(value="HEAD")})
    private void rain$renderArmorHudLikeOldRain(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        this.rain$updateTabProgress();
        \u062e\u0635.INSTANCE.renderInGameHud(context);
    }

    @Unique
    private boolean rain$shouldShowPlayerList(ScoreboardObjective objective) {
        return this.client.player != null && this.client.options.playerListKey.isPressed() && (!this.client.isInSingleplayer() || this.client.player.networkHandler.getListedPlayerListEntries().size() > 1 || objective != null);
    }

    @Unique
    private void rain$drawScoreboardRoundedFill(DrawContext context, int x1, int y1, int x2, int y2, int color, boolean topLeft, boolean bottomLeft) {
        int width = x2 - x1;
        int height = y2 - y1;
        if (width <= 0 || height <= 0) {
            return;
        }
        int radius = Math.min(8, width / 2);
        if ((radius = Math.min(radius, topLeft && bottomLeft ? height / 2 : height)) <= 1) {
            context.fill(x1, y1, x2, y2, color);
            return;
        }
        for (int y = 0; y < height; ++y) {
            int offset = 0;
            if (topLeft && y < radius) {
                offset = Math.max(offset, this.rain$scoreboardCornerOffset(radius, y));
            }
            if (bottomLeft && height - 1 - y < radius) {
                offset = Math.max(offset, this.rain$scoreboardCornerOffset(radius, height - 1 - y));
            }
            if (x1 + offset >= x2) continue;
            context.fill(x1 + offset, y1 + y, x2, y1 + y + 1, color);
        }
    }

    @Inject(method={"method_55804"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$cancelVanillaSmoothTab(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        if (this.rain$shouldAnimateTab()) {
            ci.cancel();
        }
    }

    @Unique
    private boolean rain$shouldAnimateTab() {
        return \u0630\u062c.INSTANCE.isEnabled() && (Boolean)\u0630\u062c.INSTANCE.getSmoothTab().getValue() != false;
    }

    @Unique
    private void rain$renderRoundedScoreboard(DrawContext context, ScoreboardObjective objective) {
        int titleWidth;
        Scoreboard scoreboard = objective.getScoreboard();
        NumberFormat numberFormat = objective.getNumberFormatOr((NumberFormat)StyledNumberFormat.RED);
        TextRenderer textRenderer = this.getTextRenderer();
        List<ScoreboardEntry> entries = scoreboard.getScoreboardEntries(objective).stream().filter(entry -> !entry.hidden()).sorted(RAIN_SCOREBOARD_ENTRY_COMPARATOR).limit(15L).toList();
        Text title = objective.getDisplayName();
        int scoreboardWidth = titleWidth = textRenderer.getWidth((StringVisitable)title);
        int colonWidth = textRenderer.getWidth(":");
        Text[] names = new Text[entries.size()];
        Text[] scores = new Text[entries.size()];
        int[] scoreWidths = new int[entries.size()];
        for (int i = 0; i < entries.size(); ++i) {
            ScoreboardEntry entry2 = entries.get(i);
            Team team = scoreboard.getScoreHolderTeam(entry2.owner());
            MutableText name = Team.decorateName((AbstractTeam)team, (Text)entry2.name());
            MutableText score = entry2.formatted(numberFormat);
            int scoreWidth = textRenderer.getWidth((StringVisitable)score);
            names[i] = name;
            scores[i] = score;
            scoreWidths[i] = scoreWidth;
            scoreboardWidth = Math.max(scoreboardWidth, textRenderer.getWidth((StringVisitable)name) + (scoreWidth > 0 ? colonWidth + scoreWidth : 0));
        }
        Objects.requireNonNull(textRenderer);
        int lineHeight = 9;
        int entryCount = entries.size();
        int entriesHeight = entryCount * lineHeight;
        int bottom = context.getScaledWindowHeight() / 2 + entriesHeight / 3;
        int left = context.getScaledWindowWidth() - scoreboardWidth - 3;
        int right = context.getScaledWindowWidth() - 3 + 2;
        int bodyTop = bottom - entriesHeight;
        int titleTop = bodyTop - lineHeight - 1;
        int titleBottom = bodyTop - 1;
        int backgroundColor = this.rain$textBackgroundColor(0.3f);
        int titleBackgroundColor = this.rain$textBackgroundColor(0.4f);
        this.rain$drawScoreboardRoundedFill(context, left - 2, titleTop, right, bottom, backgroundColor, true, true);
        this.rain$drawScoreboardRoundedFill(context, left - 2, titleTop, right, titleBottom, titleBackgroundColor, true, false);
        context.drawText(textRenderer, title, left + scoreboardWidth / 2 - titleWidth / 2, titleTop, -1, false);
        boolean hideNumbers = (Boolean)\u0635\u0628.INSTANCE.getNoNumber().getValue();
        for (int i = 0; i < entryCount; ++i) {
            int y = bottom - (entryCount - i) * lineHeight;
            context.drawText(textRenderer, names[i], left, y, -1, false);
            if (hideNumbers) continue;
            context.drawText(textRenderer, scores[i], right - scoreWidths[i], y, -1, false);
        }
    }

    private boolean shouldHideScoreText(String rawText) {
        if (!\u0635\u0628.INSTANCE.isEnabled() || !((Boolean)\u0635\u0628.INSTANCE.getNoNumber().getValue()).booleanValue()) {
            return false;
        }
        String stripped = rawText.replaceAll("(?i)\u00a7[0-9A-FK-OR]", "").trim();
        return !stripped.isEmpty() && stripped.matches("-?\\d+");
    }

    @Inject(method={"method_1735"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$cancelVignette(DrawContext context, Entity cameraEntity, CallbackInfo ci) {
        if (\u0635\u0650.INSTANCE.isEnabled() && ((Boolean)\u0635\u0650.INSTANCE.getRemoveVignette().getValue()).booleanValue()) {
            ci.cancel();
        }
    }

    @Inject(method={"method_1757"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$scoreboardHead(DrawContext context, ScoreboardObjective objective, CallbackInfo ci) {
        this.rain$scoreboardScaled = false;
        if (!\u0635\u0628.INSTANCE.isEnabled()) {
            return;
        }
        if (((Boolean)\u0635\u0628.INSTANCE.getNoScoreboard().getValue()).booleanValue()) {
            ci.cancel();
            return;
        }
        this.rain$scoreboardScaled = this.rain$pushScoreboardScale(context);
    }

    @Unique
    private int rain$textBackgroundColor(float opacity) {
        int alpha = (int)((Double)this.client.options.getTextBackgroundOpacity().getValue() * (double)opacity * 255.0);
        return MathHelper.clamp((int)alpha, (int)0, (int)255) << 24;
    }

    @Inject(method={"method_1765"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$cancelStatusEffects(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        if (TargetHudModule.INSTANCE.isEnabled() || \u0635\u0650.INSTANCE.isEnabled() && ((Boolean)\u0635\u0650.INSTANCE.getNoStatusEffects().getValue()).booleanValue()) {
            ci.cancel();
        }
    }
}

