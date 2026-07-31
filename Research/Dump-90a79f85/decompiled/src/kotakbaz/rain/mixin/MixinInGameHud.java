/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  net.minecraft.class_10799
 *  net.minecraft.class_1297
 *  net.minecraft.class_1306
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_2561
 *  net.minecraft.class_266
 *  net.minecraft.class_268
 *  net.minecraft.class_269
 *  net.minecraft.class_270
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_327
 *  net.minecraft.class_329
 *  net.minecraft.class_332
 *  net.minecraft.class_3532
 *  net.minecraft.class_355
 *  net.minecraft.class_5250
 *  net.minecraft.class_5348
 *  net.minecraft.class_8646
 *  net.minecraft.class_9011
 *  net.minecraft.class_9022
 *  net.minecraft.class_9025
 *  net.minecraft.class_9779
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
import kotakbaz.rain.module.modules.hud.D;
import kotakbaz.rain.module.modules.hud.G;
import kotakbaz.rain.module.modules.player.C;
import kotakbaz.rain.module.modules.player.J;
import kotakbaz.rain.module.modules.player.g_0;
import kotakbaz.rain.module.modules.render.k_0;
import kotakbaz.rain.module.modules.render.l_0;
import kotakbaz.rain.module.modules.render.s_0;
import kotakbaz.rain.module.modules.render.x_0;
import net.minecraft.class_10799;
import net.minecraft.class_1297;
import net.minecraft.class_1306;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import net.minecraft.class_266;
import net.minecraft.class_268;
import net.minecraft.class_269;
import net.minecraft.class_270;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_355;
import net.minecraft.class_5250;
import net.minecraft.class_5348;
import net.minecraft.class_8646;
import net.minecraft.class_9011;
import net.minecraft.class_9022;
import net.minecraft.class_9025;
import net.minecraft.class_9779;
import org.joml.Matrix3x2fStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_329.class})
public abstract class MixinInGameHud {
    @Unique
    private static final int RAIN_SCOREBOARD_CORNER_RADIUS = 8;
    @Unique
    private static final Comparator<class_9011> RAIN_SCOREBOARD_ENTRY_COMPARATOR = Comparator.comparingInt(class_9011::comp_2128).reversed().thenComparing(class_9011::comp_2127, String.CASE_INSENSITIVE_ORDER);
    private boolean rain$scoreboardScaled = false;
    @Unique
    private float rain$animatedHotbarSlot = -1.0f;
    @Unique
    private long rain$lastHotbarAnimationUpdate = 0L;
    @Unique
    private float rain$tabProgress = 0.0f;
    @Unique
    private long rain$lastTabAnimationUpdate = 0L;
    @Shadow
    @Final
    private class_310 field_2035;
    @Shadow
    @Final
    private class_355 field_2015;

    public MixinInGameHud() {
        super();
    }

    @Shadow
    public abstract class_327 method_1756();

    @Inject(method={"method_1762"}, at={@At(value="HEAD")})
    private void rain$renderItemHighliterHotbarBackground(class_332 context, int x2, int y, class_9779 tickCounter, class_1657 player, class_1799 stack, int seed, CallbackInfo ci) {
        x_0.INSTANCE.renderHighlight(context, stack, x2, y);
    }

    @Inject(method={"method_37298"}, at={@At(value="HEAD")})
    private void rain$renderCrosshairHp(class_332 context, class_1657 player, int x2, int y, int lines, int regeneratingHeartIndex, float maxHealth, int lastHealth, int health, int absorption, boolean blinking, CallbackInfo ci) {
        g_0.INSTANCE.render(context);
    }

    @Inject(method={"method_1753"}, at={@At(value="HEAD")})
    private void rain$renderArmorHudLikeOldRain(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
        this.rain$updateTabProgress();
        G.INSTANCE.renderInGameHud(context);
        D.INSTANCE.renderInGameHud(context);
    }

    @Inject(method={"method_1753"}, at={@At(value="RETURN")})
    private void rain$renderSmoothTab(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
        if (!this.rain$shouldAnimateTab() || this.rain$tabProgress <= 0.0f || this.field_2035.field_1724 == null || this.field_2035.field_1687 == null) {
            return;
        }
        class_269 scoreboard = this.field_2035.field_1687.method_8428();
        class_266 objective = scoreboard.method_1189(class_8646.field_45156);
        boolean show = this.rain$shouldShowPlayerList(objective);
        if (!show && this.rain$tabProgress < 0.01f) {
            return;
        }
        Matrix3x2fStack matrices = context.method_51448();
        matrices.pushMatrix();
        matrices.translate(0.0f, (1.0f - this.rain$tabProgress) * -10.0f);
        this.field_2015.method_1919(context, context.method_51421(), scoreboard, objective);
        matrices.popMatrix();
    }

    @Inject(method={"method_55804"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$cancelVanillaSmoothTab(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
        if (this.rain$shouldAnimateTab()) {
            ci.cancel();
        }
    }

    @Inject(method={"method_1759"}, at={@At(value="RETURN")})
    private void rain$renderCooldownsLikeOldRain(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
        if (this.field_2035.field_1724 == null) {
            return;
        }
        C.INSTANCE.renderHotbarCooldowns(context, (class_1657)this.field_2035.field_1724);
    }

    @Redirect(method={"method_1759"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1657;method_6068()Lnet/minecraft/class_1306;"))
    private class_1306 rain$keepChangeHandOffhandLeft(class_1657 player) {
        if (J.INSTANCE.shouldKeepLeftOffhandSlotInHud()) {
            return class_1306.field_6183;
        }
        return player.method_6068();
    }

    @Inject(method={"method_1765"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$cancelStatusEffects(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
        if (s_0.INSTANCE.isEnabled() && ((Boolean)s_0.INSTANCE.getNoStatusEffects().getValue()).booleanValue()) {
            ci.cancel();
        }
    }

    @Inject(method={"method_1735"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$cancelVignette(class_332 context, class_1297 cameraEntity, CallbackInfo ci) {
        if (s_0.INSTANCE.isEnabled() && ((Boolean)s_0.INSTANCE.getRemoveVignette().getValue()).booleanValue()) {
            ci.cancel();
        }
    }

    @Inject(method={"method_70837"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$cancelBossBarHud(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
        if (s_0.INSTANCE.isEnabled() && ((Boolean)s_0.INSTANCE.getNoBossBar().getValue()).booleanValue()) {
            ci.cancel();
        }
    }

    @Redirect(method={"method_1759"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_52706(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_2960;IIII)V", ordinal=1))
    private void rain$renderAnimatedHotbarSelection(class_332 context, RenderPipeline pipeline, class_2960 texture, int x2, int y, int width2, int height) {
        if (pipeline != class_10799.field_56883 || this.field_2035.field_1724 == null) {
            context.method_52706(pipeline, texture, x2, y, width2, height);
            return;
        }
        int selectedSlot = this.field_2035.field_1724.method_31548().method_67532();
        float animatedSlot = this.rain$getAnimatedHotbarSlot(selectedSlot);
        int animatedX = class_3532.method_15375((float)((float)x2 + (animatedSlot - (float)selectedSlot) * 20.0f));
        context.method_52706(pipeline, texture, animatedX, y, width2, height);
    }

    @Inject(method={"method_1757"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$scoreboardHead(class_332 context, class_266 objective, CallbackInfo ci) {
        this.rain$scoreboardScaled = false;
        if (!l_0.INSTANCE.isEnabled()) {
            return;
        }
        if (((Boolean)l_0.INSTANCE.getNoScoreboard().getValue()).booleanValue()) {
            ci.cancel();
            return;
        }
        this.rain$scoreboardScaled = this.rain$pushScoreboardScale(context);
    }

    @Unique
    private boolean rain$pushScoreboardScale(class_332 context) {
        float scale = ((Float)l_0.INSTANCE.getScoreboardScale().getValue()).floatValue();
        if (scale == 1.0f) {
            return false;
        }
        Matrix3x2fStack matrices = context.method_51448();
        float screenWidth = context.method_51421();
        float screenHeight = context.method_51443();
        float offsetX = screenWidth * (1.0f - scale);
        float offsetY = screenHeight * (1.0f - scale) * 0.5f;
        matrices.pushMatrix();
        matrices.translate(offsetX, offsetY);
        matrices.scale(scale, scale);
        return true;
    }

    @Inject(method={"method_1757"}, at={@At(value="RETURN")})
    private void rain$scoreboardTail(class_332 context, class_266 objective, CallbackInfo ci) {
        if (!this.rain$scoreboardScaled) {
            return;
        }
        context.method_51448().popMatrix();
        this.rain$scoreboardScaled = false;
    }

    @Unique
    private void rain$renderRoundedScoreboard(class_332 context, class_266 objective) {
        int titleWidth;
        class_269 scoreboard = objective.method_1117();
        class_9022 numberFormat = objective.method_55380((class_9022)class_9025.field_47567);
        class_327 textRenderer = this.method_1756();
        List<class_9011> entries = scoreboard.method_1184(objective).stream().filter(entry -> !entry.method_55385()).sorted(RAIN_SCOREBOARD_ENTRY_COMPARATOR).limit(15L).toList();
        class_2561 title = objective.method_1114();
        int scoreboardWidth = titleWidth = textRenderer.method_27525((class_5348)title);
        int colonWidth = textRenderer.method_1727(":");
        class_2561[] names = new class_2561[entries.size()];
        class_2561[] scores = new class_2561[entries.size()];
        int[] scoreWidths = new int[entries.size()];
        for (int i = 0; i < entries.size(); ++i) {
            class_9011 entry2 = entries.get(i);
            class_268 team = scoreboard.method_1164(entry2.comp_2127());
            class_5250 name = class_268.method_1142((class_270)team, (class_2561)entry2.method_55387());
            class_5250 score = entry2.method_55386(numberFormat);
            int scoreWidth = textRenderer.method_27525((class_5348)score);
            names[i] = name;
            scores[i] = score;
            scoreWidths[i] = scoreWidth;
            scoreboardWidth = Math.max(scoreboardWidth, textRenderer.method_27525((class_5348)name) + (scoreWidth > 0 ? colonWidth + scoreWidth : 0));
        }
        Objects.requireNonNull(textRenderer);
        int lineHeight = 9;
        int entryCount = entries.size();
        int entriesHeight = entryCount * lineHeight;
        int bottom = context.method_51443() / 2 + entriesHeight / 3;
        int left = context.method_51421() - scoreboardWidth - 3;
        int right = context.method_51421() - 3 + 2;
        int bodyTop = bottom - entriesHeight;
        int titleTop = bodyTop - lineHeight - 1;
        int titleBottom = bodyTop - 1;
        int backgroundColor = this.field_2035.field_1690.method_19345(0.3f);
        int titleBackgroundColor = this.field_2035.field_1690.method_19345(0.4f);
        this.rain$drawScoreboardRoundedFill(context, left - 2, titleTop, right, bottom, backgroundColor, true, true);
        this.rain$drawScoreboardRoundedFill(context, left - 2, titleTop, right, titleBottom, titleBackgroundColor, true, false);
        context.method_51439(textRenderer, title, left + scoreboardWidth / 2 - titleWidth / 2, titleTop, -1, false);
        boolean hideNumbers = (Boolean)l_0.INSTANCE.getNoNumber().getValue();
        for (int i = 0; i < entryCount; ++i) {
            int y = bottom - (entryCount - i) * lineHeight;
            context.method_51439(textRenderer, names[i], left, y, -1, false);
            if (hideNumbers) continue;
            context.method_51439(textRenderer, scores[i], right - scoreWidths[i], y, -1, false);
        }
    }

    @Unique
    private void rain$drawScoreboardRoundedFill(class_332 context, int x1, int y1, int x2, int y2, int color, boolean topLeft, boolean bottomLeft) {
        int width2 = x2 - x1;
        int height = y2 - y1;
        if (width2 <= 0 || height <= 0) {
            return;
        }
        int radius = Math.min(8, width2 / 2);
        if ((radius = Math.min(radius, topLeft && bottomLeft ? height / 2 : height)) <= 1) {
            context.method_25294(x1, y1, x2, y2, color);
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
            context.method_25294(x1 + offset, y1 + y, x2, y1 + y + 1, color);
        }
    }

    @Unique
    private int rain$scoreboardCornerOffset(int radius, int distanceFromEdge) {
        double edgeDistance = (double)(radius - distanceFromEdge) - 0.5;
        double inside = Math.sqrt(Math.max(0.0, (double)(radius * radius) - edgeDistance * edgeDistance));
        return class_3532.method_15340((int)((int)Math.ceil((double)radius - inside)), (int)0, (int)radius);
    }

    @Redirect(method={"method_1757"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_51439(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;IIIZ)V"), require=0)
    private void rain$redirectScoreText(class_332 context, class_327 textRenderer, class_2561 text, int x2, int y, int color, boolean shadow) {
        if (this.shouldHideScoreText(text.getString())) {
            return;
        }
        context.method_51439(textRenderer, text, x2, y, color, shadow);
    }

    private boolean shouldHideScoreText(String rawText) {
        if (!l_0.INSTANCE.isEnabled() || !((Boolean)l_0.INSTANCE.getNoNumber().getValue()).booleanValue()) {
            return false;
        }
        String stripped = rawText.replaceAll("(?i)\u00a7[0-9A-FK-OR]", "").trim();
        return !stripped.isEmpty() && stripped.matches("-?\\d+");
    }

    @Unique
    private boolean rain$shouldAnimateHotbar() {
        return k_0.INSTANCE.isEnabled() && (Boolean)k_0.INSTANCE.getAnimateHotbar().getValue() != false;
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
        float factor = class_3532.method_15363((float)(deltaSeconds * 20.0f), (float)0.0f, (float)1.0f);
        this.rain$animatedHotbarSlot += ((float)targetSlot - this.rain$animatedHotbarSlot) * factor;
        if (Math.abs((float)targetSlot - this.rain$animatedHotbarSlot) < 0.01f) {
            this.rain$animatedHotbarSlot = targetSlot;
        }
        return this.rain$animatedHotbarSlot;
    }

    @Unique
    private boolean rain$shouldAnimateTab() {
        return k_0.INSTANCE.isEnabled() && (Boolean)k_0.INSTANCE.getSmoothTab().getValue() != false;
    }

    @Unique
    private void rain$updateTabProgress() {
        long now = System.nanoTime();
        class_266 objective = this.field_2035.field_1687 == null ? null : this.field_2035.field_1687.method_8428().method_1189(class_8646.field_45156);
        boolean show = this.rain$shouldShowPlayerList(objective);
        if (this.rain$lastTabAnimationUpdate == 0L) {
            this.rain$lastTabAnimationUpdate = now;
        }
        float deltaSeconds = Math.min((float)(now - this.rain$lastTabAnimationUpdate) / 1.0E9f, 0.05f);
        this.rain$lastTabAnimationUpdate = now;
        float speed = deltaSeconds * 14.0f;
        this.rain$tabProgress = class_3532.method_15363((float)(this.rain$tabProgress + (show ? speed : -speed)), (float)0.0f, (float)1.0f);
        k_0.INSTANCE.setTabProgress(this.rain$tabProgress);
    }

    @Unique
    private boolean rain$shouldShowPlayerList(class_266 objective) {
        return this.field_2035.field_1724 != null && this.field_2035.field_1690.field_1907.method_1434() && (!this.field_2035.method_1542() || this.field_2035.field_1724.field_3944.method_45732().size() > 1 || objective != null);
    }
}

