package kotakbaz.rain.mixin;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.util.Comparator;
import java.util.List;
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
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardEntry;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.Team;
import net.minecraft.scoreboard.number.NumberFormat;
import net.minecraft.scoreboard.number.StyledNumberFormat;
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
import oxxxde.بآ;
import oxxxde.تع;
import oxxxde.ثر;
import oxxxde.ثك;
import oxxxde.خص;
import oxxxde.ذج;
import oxxxde.شك;
import oxxxde.صب;
import oxxxde.صِ;
import oxxxde.ضق;

// $VF: Compiled from MixinInGameHud.java
@Mixin(InGameHud.class)
public abstract class MixinInGameHud {
   @Unique
   private float rain$tabProgress;
   @Unique
   private static final int RAIN_SCOREBOARD_CORNER_RADIUS = 8;
   @Unique
   private static final Comparator<ScoreboardEntry> RAIN_SCOREBOARD_ENTRY_COMPARATOR = Comparator.<ScoreboardEntry>comparingInt(ScoreboardEntry::value)
      .reversed()
      .thenComparing(ScoreboardEntry::owner, String.CASE_INSENSITIVE_ORDER);
   @Unique
   private long rain$lastHotbarAnimationUpdate;
   @Final
   @Shadow
   private PlayerListHud playerListHud;
   private boolean rain$scoreboardScaled = false;
   @Unique
   private float rain$animatedHotbarSlot = -1.0F;
   @Unique
   private long rain$lastTabAnimationUpdate;
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

      float deltaSeconds = Math.min((float)(now - this.rain$lastTabAnimationUpdate) / 1.0E9F, 0.05F);
      this.rain$lastTabAnimationUpdate = now;
      float speed = deltaSeconds * 14.0F;
      this.rain$tabProgress = MathHelper.clamp(this.rain$tabProgress + (show ? speed : -speed), 0.0F, 1.0F);
      ذج.INSTANCE.setTabProgress(this.rain$tabProgress);
   }

   @Redirect(method = "method_1759", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_1657;method_6068()Lnet/minecraft/class_1306;"))
   private Arm rain$keepChangeHandOffhandLeft(PlayerEntity player) {
      return ضق.INSTANCE.shouldKeepLeftOffhandSlotInHud() ? Arm.RIGHT : player.getMainArm();
   }

   @Inject(method = "method_37298", at = @At("HEAD"))
   private void rain$renderCrosshairHp(
      DrawContext health,
      PlayerEntity x,
      int blinking,
      int lastHealth,
      int regeneratingHeartIndex,
      int player,
      float y,
      int context,
      int absorption,
      int maxHealth,
      boolean ci,
      CallbackInfo lines
   ) {
      شك.INSTANCE.render(context);
   }

   @Unique
   private float rain$getAnimatedHotbarSlot(int targetSlot) {
      long now = System.nanoTime();
      if (!this.rain$shouldAnimateHotbar()) {
         this.rain$animatedHotbarSlot = targetSlot;
         this.rain$lastHotbarAnimationUpdate = now;
         return targetSlot;
      }

      if (this.rain$animatedHotbarSlot < 0.0F) {
         this.rain$animatedHotbarSlot = targetSlot;
         this.rain$lastHotbarAnimationUpdate = now;
         return targetSlot;
      }

      float deltaSeconds = Math.min((float)(now - this.rain$lastHotbarAnimationUpdate) / 1.0E9F, 0.05F);
      this.rain$lastHotbarAnimationUpdate = now;
      float factor = MathHelper.clamp(deltaSeconds * 20.0F, 0.0F, 1.0F);
      this.rain$animatedHotbarSlot = this.rain$animatedHotbarSlot + (targetSlot - this.rain$animatedHotbarSlot) * factor;
      if (Math.abs(targetSlot - this.rain$animatedHotbarSlot) < 0.01F) {
         this.rain$animatedHotbarSlot = targetSlot;
      }

      return this.rain$animatedHotbarSlot;
   }

   @Inject(method = "method_1753", at = @At("RETURN"))
   private void rain$renderSmoothTab(DrawContext tickCounter, RenderTickCounter context, CallbackInfo ci) {
      if (this.rain$shouldAnimateTab() && !(this.rain$tabProgress <= 0.0F) && this.client.player != null && this.client.world != null) {
         Scoreboard scoreboard = this.client.world.getScoreboard();
         ScoreboardObjective objective = scoreboard.getObjectiveForSlot(ScoreboardDisplaySlot.LIST);
         boolean show = this.rain$shouldShowPlayerList(objective);
         if (show || !(this.rain$tabProgress < 0.01F)) {
            Matrix3x2fStack matrices = context.getMatrices();
            matrices.pushMatrix();
            matrices.translate(0.0F, (1.0F - this.rain$tabProgress) * -10.0F);
            this.playerListHud.render(context, context.getScaledWindowWidth(), scoreboard, objective);
            matrices.popMatrix();
         }
      }
   }

   @Unique
   private boolean rain$pushScoreboardScale(DrawContext context) {
      float scale = صب.INSTANCE.getScoreboardScale().getValue();
      if (scale == 1.0F) {
         return false;
      }

      Matrix3x2fStack matrices = context.getMatrices();
      float screenWidth = context.getScaledWindowWidth();
      float screenHeight = context.getScaledWindowHeight();
      float offsetX = screenWidth * (1.0F - scale);
      float offsetY = screenHeight * (1.0F - scale) * 0.5F;
      matrices.pushMatrix();
      matrices.translate(offsetX, offsetY);
      matrices.scale(scale, scale);
      return true;
   }

   @Inject(method = "method_1759", at = @At("RETURN"))
   private void rain$renderCooldownsLikeOldRain(DrawContext tickCounter, RenderTickCounter ci, CallbackInfo context) {
      if (this.client.player != null) {
         تع.INSTANCE.renderHotbarCooldowns(context, this.client.player);
      }
   }

   @Inject(method = "method_1762", at = @At("HEAD"))
   private void rain$renderItemHighliterHotbarBackground(
      DrawContext ci, int tickCounter, int y, RenderTickCounter seed, PlayerEntity context, ItemStack x, int player, CallbackInfo stack
   ) {
      ثر.INSTANCE.renderHighlight(context, stack, x, y);
   }

   @Inject(method = "method_1753", at = @At("RETURN"))
   private void rain$renderFuntimeTrapTimer(DrawContext tickCounter, RenderTickCounter context, CallbackInfo ci) {
      ثك.INSTANCE.renderTrapTimer(context);
   }

   @Shadow
   public abstract TextRenderer getTextRenderer();

   @Unique
   private boolean rain$shouldAnimateHotbar() {
      return ذج.INSTANCE.isEnabled() && ذج.INSTANCE.getAnimateHotbar().getValue();
   }

   @Inject(method = "method_1757", at = @At("RETURN"))
   private void rain$scoreboardTail(DrawContext objective, ScoreboardObjective context, CallbackInfo ci) {
      if (this.rain$scoreboardScaled) {
         context.getMatrices().popMatrix();
         this.rain$scoreboardScaled = false;
      }
   }

   @Redirect(
      method = "method_1759",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_332;method_52706(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_2960;IIII)V",
         ordinal = 1
      )
   )
   private void rain$renderAnimatedHotbarSelection(DrawContext y, RenderPipeline context, Identifier x, int texture, int pipeline, int height, int width) {
      if (pipeline == RenderPipelines.GUI_TEXTURED && this.client.player != null) {
         int selectedSlot = this.client.player.getInventory().getSelectedSlot();
         float animatedSlot = this.rain$getAnimatedHotbarSlot(selectedSlot);
         int animatedX = MathHelper.floor(x + (animatedSlot - selectedSlot) * 20.0F);
         context.drawGuiTexture(pipeline, texture, animatedX, y, width, height);
      } else {
         context.drawGuiTexture(pipeline, texture, x, y, width, height);
      }
   }

   @Redirect(
      method = "method_1757",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/class_332;method_51439(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;IIIZ)V"),
      require = 0
   )
   private void rain$redirectScoreText(DrawContext y, TextRenderer text, Text context, int color, int textRenderer, int shadow, boolean x) {
      if (!this.shouldHideScoreText(text.getString())) {
         context.drawText(textRenderer, text, x, y, color, shadow);
      }
   }

   @Unique
   private int rain$scoreboardCornerOffset(int distanceFromEdge, int radius) {
      double edgeDistance = radius - distanceFromEdge - 0.5;
      double inside = Math.sqrt(Math.max(0.0, radius * radius - edgeDistance * edgeDistance));
      return MathHelper.clamp((int)Math.ceil(radius - inside), 0, radius);
   }

   @Inject(method = "method_70837", at = @At("HEAD"), cancellable = true)
   private void rain$cancelBossBarHud(DrawContext ci, RenderTickCounter context, CallbackInfo tickCounter) {
      if (صِ.INSTANCE.isEnabled() && صِ.INSTANCE.getNoBossBar().getValue()) {
         ci.cancel();
      }
   }

   @Inject(method = "method_1753", at = @At("HEAD"))
   private void rain$renderArmorHudLikeOldRain(DrawContext context, RenderTickCounter ci, CallbackInfo tickCounter) {
      this.rain$updateTabProgress();
      خص.INSTANCE.renderInGameHud(context);
   }

   @Unique
   private boolean rain$shouldShowPlayerList(ScoreboardObjective objective) {
      return this.client.player != null
         && this.client.options.playerListKey.isPressed()
         && (!this.client.isInSingleplayer() || this.client.player.networkHandler.getListedPlayerListEntries().size() > 1 || objective != null);
   }

   @Unique
   private void rain$drawScoreboardRoundedFill(DrawContext x1, int y1, int y2, int color, int context, int bottomLeft, boolean topLeft, boolean x2) {
      int width = x2 - x1;
      int height = y2 - y1;
      if (width > 0 && height > 0) {
         int radius = Math.min(8, width / 2);
         radius = Math.min(radius, topLeft && bottomLeft ? height / 2 : height);
         if (radius <= 1) {
            context.fill(x1, y1, x2, y2, color);
         } else {
            for (int y = 0; y < height; y++) {
               int offset = 0;
               if (topLeft && y < radius) {
                  offset = Math.max(offset, this.rain$scoreboardCornerOffset(radius, y));
               }

               if (bottomLeft && height - 1 - y < radius) {
                  offset = Math.max(offset, this.rain$scoreboardCornerOffset(radius, height - 1 - y));
               }

               if (x1 + offset < x2) {
                  context.fill(x1 + offset, y1 + y, x2, y1 + y + 1, color);
               }
            }
         }
      }
   }

   public MixinInGameHud() {
      this.rain$lastHotbarAnimationUpdate = 0L;
      this.rain$tabProgress = 0.0F;
      this.rain$lastTabAnimationUpdate = 0L;
   }

   @Inject(method = "method_55804", at = @At("HEAD"), cancellable = true)
   private void rain$cancelVanillaSmoothTab(DrawContext ci, RenderTickCounter context, CallbackInfo tickCounter) {
      if (this.rain$shouldAnimateTab()) {
         ci.cancel();
      }
   }

   @Unique
   private boolean rain$shouldAnimateTab() {
      return ذج.INSTANCE.isEnabled() && ذج.INSTANCE.getSmoothTab().getValue();
   }

   @Unique
   private void rain$renderRoundedScoreboard(DrawContext objective, ScoreboardObjective context) {
      Scoreboard scoreboard = objective.getScoreboard();
      NumberFormat numberFormat = objective.getNumberFormatOr(StyledNumberFormat.RED);
      TextRenderer textRenderer = this.getTextRenderer();
      List<ScoreboardEntry> entries = scoreboard.getScoreboardEntries(objective)
         .stream()
         .filter(entry -> !entry.hidden())
         .sorted(RAIN_SCOREBOARD_ENTRY_COMPARATOR)
         .limit(15L)
         .toList();
      Text title = objective.getDisplayName();
      int titleWidth = textRenderer.getWidth(title);
      int scoreboardWidth = titleWidth;
      int colonWidth = textRenderer.getWidth(":");
      Text[] names = new Text[entries.size()];
      Text[] scores = new Text[entries.size()];
      int[] scoreWidths = new int[entries.size()];

      for (int i = 0; i < entries.size(); i++) {
         ScoreboardEntry entry = entries.get(i);
         Team team = scoreboard.getScoreHolderTeam(entry.owner());
         Text name = Team.decorateName(team, entry.name());
         Text score = entry.formatted(numberFormat);
         int scoreWidth = textRenderer.getWidth(score);
         names[i] = name;
         scores[i] = score;
         scoreWidths[i] = scoreWidth;
         scoreboardWidth = Math.max(scoreboardWidth, textRenderer.getWidth(name) + (scoreWidth > 0 ? colonWidth + scoreWidth : 0));
      }

      int lineHeight = 9;
      int entryCount = entries.size();
      int entriesHeight = entryCount * lineHeight;
      int bottom = context.getScaledWindowHeight() / 2 + entriesHeight / 3;
      int left = context.getScaledWindowWidth() - scoreboardWidth - 3;
      int right = context.getScaledWindowWidth() - 3 + 2;
      int bodyTop = bottom - entriesHeight;
      int titleTop = bodyTop - lineHeight - 1;
      int titleBottom = bodyTop - 1;
      int backgroundColor = this.rain$textBackgroundColor(0.3F);
      int titleBackgroundColor = this.rain$textBackgroundColor(0.4F);
      this.rain$drawScoreboardRoundedFill(context, left - 2, titleTop, right, bottom, backgroundColor, true, true);
      this.rain$drawScoreboardRoundedFill(context, left - 2, titleTop, right, titleBottom, titleBackgroundColor, true, false);
      context.drawText(textRenderer, title, left + scoreboardWidth / 2 - titleWidth / 2, titleTop, -1, false);
      boolean hideNumbers = صب.INSTANCE.getNoNumber().getValue();

      for (int i = 0; i < entryCount; i++) {
         int y = bottom - (entryCount - i) * lineHeight;
         context.drawText(textRenderer, names[i], left, y, -1, false);
         if (!hideNumbers) {
            context.drawText(textRenderer, scores[i], right - scoreWidths[i], y, -1, false);
         }
      }
   }

   private boolean shouldHideScoreText(String rawText) {
      if (صب.INSTANCE.isEnabled() && صب.INSTANCE.getNoNumber().getValue()) {
         String stripped = rawText.replaceAll("(?i)§[0-9A-FK-OR]", "").trim();
         return !stripped.isEmpty() && stripped.matches("-?\\d+");
      } else {
         return false;
      }
   }

   @Inject(method = "method_1735", at = @At("HEAD"), cancellable = true)
   private void rain$cancelVignette(DrawContext ci, Entity cameraEntity, CallbackInfo context) {
      if (صِ.INSTANCE.isEnabled() && صِ.INSTANCE.getRemoveVignette().getValue()) {
         ci.cancel();
      }
   }

   @Inject(method = "method_1757", at = @At("HEAD"), cancellable = true)
   private void rain$scoreboardHead(DrawContext context, ScoreboardObjective objective, CallbackInfo ci) {
      this.rain$scoreboardScaled = false;
      if (صب.INSTANCE.isEnabled()) {
         if (صب.INSTANCE.getNoScoreboard().getValue()) {
            ci.cancel();
         } else {
            this.rain$scoreboardScaled = this.rain$pushScoreboardScale(context);
         }
      }
   }

   @Unique
   private int rain$textBackgroundColor(float opacity) {
      int alpha = (int)((Double)this.client.options.getTextBackgroundOpacity().getValue() * opacity * 255.0);
      return MathHelper.clamp(alpha, 0, 255) << 24;
   }

   @Inject(method = "method_1765", at = @At("HEAD"), cancellable = true)
   private void rain$cancelStatusEffects(DrawContext ci, RenderTickCounter tickCounter, CallbackInfo context) {
      if (بآ.INSTANCE.isEnabled() || صِ.INSTANCE.isEnabled() && صِ.INSTANCE.getNoStatusEffects().getValue()) {
         ci.cancel();
      }
   }
}
