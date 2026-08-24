/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTexture
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.render.state.GuiRenderState
 *  net.minecraft.client.gui.screen.ChatScreen
 *  net.minecraft.client.network.AbstractClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.texture.AbstractTexture
 *  net.minecraft.client.texture.GlTexture
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.scoreboard.ReadableScoreboardScore
 *  net.minecraft.scoreboard.ScoreHolder
 *  net.minecraft.scoreboard.Scoreboard
 *  net.minecraft.scoreboard.ScoreboardCriterion
 *  net.minecraft.scoreboard.ScoreboardDisplaySlot
 *  net.minecraft.scoreboard.ScoreboardObjective
 *  net.minecraft.text.Text
 *  net.minecraft.util.Identifier
 *  org.joml.Vector4f
 */
package oxxxde;

import com.mojang.blaze3d.textures.GpuTexture;
import java.awt.Color;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import kotakbaz.rain.client.draggable.Draggable;
import kotakbaz.rain.client.draggable.animation.AnimationUtil;
import kotakbaz.rain.client.draggable.animation.Easing;
import kotakbaz.rain.client.util.render.display.TextureRectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.event.events.OverlayRenderEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.mixin.GameRendererAccessor;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.render.state.GuiRenderState;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.scoreboard.ReadableScoreboardScore;
import net.minecraft.scoreboard.ScoreHolder;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardCriterion;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector4f;
import oxxxde.\u0628\u062d;
import oxxxde.\u0628\u0642;
import oxxxde.\u062c\u0625;
import oxxxde.\u0630\u0631;
import oxxxde.\u0631\u064e;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0637\u063a;
import oxxxde.\u0638\u0646;
import oxxxde.\u0638\u064b;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\f\u0010\u0003J\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u001c\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ?\u0010!\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b(\u0010)J7\u0010+\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020.2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b1\u00102J'\u00106\u001a\u00020\u000f2\u0006\u00104\u001a\u0002032\u0006\u0010*\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u00020\u00182\u0006\u00108\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\rH\u0002\u00a2\u0006\u0004\bB\u0010AJ\u0017\u0010E\u001a\u00020=2\u0006\u0010D\u001a\u00020CH\u0002\u00a2\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\bG\u0010\u0003R\u0014\u0010H\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020J8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010N\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bN\u0010IR\u0014\u0010O\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bO\u0010IR\u0014\u0010P\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bP\u0010IR\u0014\u0010Q\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bQ\u0010IR\u0014\u0010R\u001a\u00020.8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bT\u0010IR\u0014\u0010U\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bU\u0010IR\u0014\u0010V\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bV\u0010IR\u0014\u0010W\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bW\u0010IR\u0014\u0010X\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bX\u0010IR\u0014\u0010Y\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bY\u0010IR\u0014\u0010Z\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bZ\u0010IR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\ba\u0010`R\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bf\u0010gR\u001f\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0014\u00a2\u0006\u0002\bh0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010iR\u0018\u0010j\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010m\u001a\u00020l8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010o\u001a\u00020=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010q\u001a\u00020.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bq\u0010SR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010u\u001a\u00020.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bu\u0010S\u00a8\u0006v"}, d2={"Loxxxde/\u062b\u0623;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u0633\u062d;", "event", "", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Loxxxde/\u062b\u0622;", "onOverlayRender", "(Lkotakbaz/rain/event/events/OverlayRenderEvent;)V", "onDisable", "Lnet/minecraft/class_1657;", "target", "", "animation", "renderHud", "(Lnet/minecraft/class_1657;F)V", "", "Lnet/minecraft/class_1799;", "equipment", "x", "y", "Ljava/awt/Color;", "emptyColor", "itemSize", "itemGap", "drawEquipment", "([Lnet/minecraft/class_1799;FFLjava/awt/Color;FFF)V", "Lnet/minecraft/class_332;", "context", "stack", "drawItemSprite", "(Lnet/minecraft/class_332;Lnet/minecraft/class_1799;FFFF)V", "hudAnimation", "equipmentAnimation", "(F)F", "createItemDrawContext", "()Lnet/minecraft/class_332;", "updateEquipment", "(Lnet/minecraft/class_1657;)V", "size", "drawHead", "(Lnet/minecraft/class_1657;FFFF)V", "health", "", "healthText", "(F)Ljava/lang/String;", "targetName", "(Lnet/minecraft/class_1657;)Ljava/lang/String;", "Loxxxde/\u062c\u064b;", "font", "containerHeight", "centeredTopOffset", "(Lkotakbaz/rain/client/util/render/font/Font;FF)F", "color", "factor", "withAlpha", "(Ljava/awt/Color;F)Ljava/awt/Color;", "player", "", "isUsableTarget", "(Lnet/minecraft/class_1657;)Z", "healthProgress", "(Lnet/minecraft/class_1657;)F", "displayedHealth", "Lnet/minecraft/class_266;", "objective", "isHealthObjective", "(Lnet/minecraft/class_266;)Z", "clearDraggableBounds", "BASE_WIDTH", "F", "", "SHOW_ANIMATION_MILLIS", "J", "HEALTH_ANIMATION_MILLIS", "BASE_EQUIPMENT_ITEM_SIZE", "BASE_EQUIPMENT_ITEM_GAP", "ITEM_RENDER_SIZE", "EQUIPMENT_FADE_OUT_CUTOFF", "EMPTY_ITEM_ICON", "Ljava/lang/String;", "SKIN_TEXTURE_SIZE", "FACE_SCALE", "FACE_SIZE_UV", "FACE_U", "HAT_U", "FACE_START_V", "FACE_HEIGHT_V", "Loxxxde/\u0638\u0630;", "draggable", "Loxxxde/\u0638\u0630;", "Loxxxde/\u0633\u0637;", "showAnimation", "Loxxxde/\u0633\u0637;", "healthAnimation", "Loxxxde/\u0628\u0642;", "nameScroller", "Loxxxde/\u0628\u0642;", "Lorg/joml/Vector4f;", "sideRound", "Lorg/joml/Vector4f;", "Lkotlin/jvm/internal/EnhancedNullability;", "[Lnet/minecraft/class_1799;", "displayTarget", "Lnet/minecraft/class_1657;", "", "cachedHealthBits", "I", "cachedHealthInitialized", "Z", "cachedHealthText", "Lnet/minecraft/class_2561;", "cachedNameComponent", "Lnet/minecraft/class_2561;", "cachedNameText", "rain-visuals"})
public final class \u062b\u0623
extends Module {
    @NotNull
    public static final \u062b\u0623 INSTANCE = new \u062b\u0623();
    @NotNull
    private static final ItemStack[] equipment;
    private static final float BASE_EQUIPMENT_ITEM_SIZE = 10.0f;
    private static final float FACE_SIZE_UV = 0.125f;
    private static final float HAT_U = 0.625f;
    private static final float FACE_START_V = 0.25f;
    private static final float BASE_EQUIPMENT_ITEM_GAP = 1.0f;
    private static final float FACE_U = 0.125f;
    @NotNull
    private static final Draggable draggable;
    private static final long SHOW_ANIMATION_MILLIS = 180L;
    @NotNull
    private static final AnimationUtil healthAnimation;
    private static final float FACE_SCALE = 0.015625f;
    @NotNull
    private static final AnimationUtil showAnimation;
    @NotNull
    private static final String EMPTY_ITEM_ICON = "i";
    @NotNull
    private static final Vector4f sideRound;
    private static int cachedHealthBits;
    private static boolean cachedHealthInitialized;
    private static final float EQUIPMENT_FADE_OUT_CUTOFF = 0.18f;
    @NotNull
    private static String cachedHealthText;
    private static final long HEALTH_ANIMATION_MILLIS = 400L;
    private static final float BASE_WIDTH = 115.0f;
    @Nullable
    private static Text cachedNameComponent;
    private static final float SKIN_TEXTURE_SIZE = 64.0f;
    private static final float ITEM_RENDER_SIZE = 16.0f;
    private static final float FACE_HEIGHT_V = -0.125f;
    @NotNull
    private static String cachedNameText;
    @Nullable
    private static PlayerEntity displayTarget;
    @NotNull
    private static final \u0628\u0642 nameScroller;

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        Object object;
        Intrinsics.checkNotNullParameter(event, "event");
        \u0638\u064b.INSTANCE.update();
        PlayerEntity playerEntity = \u0638\u064b.INSTANCE.currentTarget();
        if (playerEntity != null) {
            PlayerEntity playerEntity2;
            PlayerEntity p0 = playerEntity2 = playerEntity;
            boolean bl = false;
            object = this.isUsableTarget(p0) ? playerEntity2 : null;
        } else {
            object = null;
        }
        PlayerEntity liveTarget = object;
        ClientPlayerEntity previewTarget = \u0636\u0643.getMc().currentScreen instanceof ChatScreen ? \u0636\u0643.getMc().player : null;
        PlayerEntity playerEntity3 = liveTarget;
        PlayerEntity playerEntity4 = playerEntity3;
        if (playerEntity3 == null) {
            playerEntity4 = (PlayerEntity)previewTarget;
        }
        PlayerEntity targetForState = playerEntity4;
        PlayerEntity previousTarget = displayTarget;
        if (targetForState != null) {
            displayTarget = targetForState;
            float healthProgress = this.healthProgress(targetForState);
            if (!Intrinsics.areEqual(previousTarget, targetForState)) {
                healthAnimation.snap(healthProgress);
            } else {
                healthAnimation.run(healthProgress, 400L, Easing.SINE_OUT, true);
            }
        }
        showAnimation.run(targetForState != null ? 1.0 : 0.0, 180L, Easing.SINE_OUT, true);
        if (targetForState == null) {
            if (showAnimation.get() <= 0.0f) {
                displayTarget = null;
                healthAnimation.snap(0.0);
            }
        }
    }

    private final void clearDraggableBounds() {
        draggable.setWidth(0.0f);
        draggable.setHeight(0.0f);
    }

    /*
     * WARNING - void declaration
     */
    private final float displayedHealth(PlayerEntity player) {
        void var1_1;
        ScoreboardObjective scoreboardObjective;
        Scoreboard scoreboard;
        block5: {
            Object v4;
            block3: {
                block4: {
                    ScoreboardObjective scoreboardObjective2;
                    ScoreboardObjective belowName;
                    scoreboard = \u0637\u062b.getScoreboard(player);
                    ScoreboardObjective scoreboardObjective3 = belowName = scoreboard.getObjectiveForSlot(ScoreboardDisplaySlot.BELOW_NAME);
                    scoreboardObjective = scoreboardObjective3;
                    if (scoreboardObjective3 == null) break block4;
                    ScoreboardObjective p0 = scoreboardObjective2 = scoreboardObjective;
                    boolean bl = false;
                    Object object = this.isHealthObjective(p0) ? scoreboardObjective2 : null;
                    scoreboardObjective = object;
                    if (object != null) break block5;
                }
                Collection collection = scoreboard.getObjectives();
                Intrinsics.checkNotNullExpressionValue(collection, "getObjectives(...)");
                Iterable $this$firstOrNull$iv = collection;
                boolean $i$f$firstOrNull = false;
                for (Object element$iv : $this$firstOrNull$iv) {
                    void var10_8;
                    ScoreboardObjective it = (ScoreboardObjective)element$iv;
                    boolean bl = false;
                    if (!Intrinsics.areEqual(it.getCriterion(), ScoreboardCriterion.HEALTH)) continue;
                    v4 = var10_8;
                    break block3;
                }
                v4 = null;
            }
            if ((scoreboardObjective = (ScoreboardObjective)v4) == null) {
                return player.getHealth();
            }
        }
        ScoreboardObjective objective = scoreboardObjective;
        ReadableScoreboardScore readableScoreboardScore = scoreboard.getScore((ScoreHolder)player, objective);
        return readableScoreboardScore != null ? (float)readableScoreboardScore.getScore() : var1_1.getHealth();
    }

    private final void updateEquipment(PlayerEntity target) {
        \u062b\u0623.equipment[0] = target.getMainHandStack();
        \u062b\u0623.equipment[1] = target.getOffHandStack();
        \u062b\u0623.equipment[2] = target.getEquippedStack(EquipmentSlot.HEAD);
        \u062b\u0623.equipment[3] = target.getEquippedStack(EquipmentSlot.CHEST);
        \u062b\u0623.equipment[4] = target.getEquippedStack(EquipmentSlot.LEGS);
        \u062b\u0623.equipment[5] = target.getEquippedStack(EquipmentSlot.FEET);
    }

    private final float centeredTopOffset(Font font, float size, float containerHeight) {
        return (containerHeight - font.getMetrics().getLineHeight() * size) * 0.5f;
    }

    /*
     * WARNING - void declaration
     */
    private final void drawHead(PlayerEntity target, float x, float y, float size, float animation) {
        void var5_5;
        AbstractClientPlayerEntity player = target instanceof AbstractClientPlayerEntity ? (AbstractClientPlayerEntity)target : null;
        if (player == null) {
            Font.drawCenteredText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT), "?", x + size / 2.0f, y, size * 0.65f, this.withAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), animation), 0.0f, 32, null);
            return;
        }
        Identifier identifier = player.getSkin().body().id();
        Intrinsics.checkNotNullExpressionValue(identifier, "id(...)");
        Identifier skin = identifier;
        AbstractTexture abstractTexture = \u0636\u0643.getMc().getTextureManager().getTexture(skin);
        Intrinsics.checkNotNullExpressionValue(abstractTexture, "getTexture(...)");
        GpuTexture gpuTexture = \u0637\u062b.getGlTextureView(abstractTexture).texture();
        GlTexture glTexture = gpuTexture instanceof GlTexture ? (GlTexture)gpuTexture : null;
        if (glTexture == null) {
            return;
        }
        int textureId = glTexture.getGlId();
        float round = size * 0.2f;
        TextureRectRenderer textureRectRenderer = \u0630\u0631.INSTANCE.getTEXTURE_RECT().priority(ClientRenderPipeline.HUD_SPECIAL).texture(textureId).pixelated(64.0f);
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        textureRectRenderer.draw(x, y, size, size, color, round, 0.0f, 0.125f, 0.25f, 0.125f, -0.125f, animation);
        TextureRectRenderer textureRectRenderer2 = \u0630\u0631.INSTANCE.getTEXTURE_RECT().priority(ClientRenderPipeline.HUD_SPECIAL).texture(textureId).pixelated(64.0f);
        Color color2 = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color2, "WHITE");
        textureRectRenderer2.draw(x, y, size, size, color2, round, 0.0f, 0.625f, 0.25f, 0.125f, -0.125f, (float)var5_5);
    }

    /*
     * WARNING - void declaration
     */
    private final void drawEquipment(ItemStack[] equipment, float x, float y, Color emptyColor, float animation, float itemSize, float itemGap) {
        if (animation <= 0.01f) {
            return;
        }
        float crossSize = itemSize * 0.7f;
        DrawContext itemContext = null;
        int index = 0;
        int n = equipment.length;
        while (index < n) {
            void var10_10;
            ItemStack stack;
            Intrinsics.checkNotNullExpressionValue(equipment[index], "get(...)");
            float slotX = x + (float)index * (itemSize + itemGap);
            if (stack.isEmpty()) {
                Font.drawCenteredText$default(\u0631\u064e.INSTANCE.getICON().priority(ClientRenderPipeline.HUD_TEXT), EMPTY_ITEM_ICON, slotX + itemSize * 0.5f, y + this.centeredTopOffset(\u0631\u064e.INSTANCE.getICON(), crossSize, itemSize), crossSize, emptyColor, 0.0f, 32, null);
            } else {
                DrawContext drawContext = itemContext;
                if (drawContext == null) {
                    void var16_16;
                    DrawContext drawContext2;
                    DrawContext it = drawContext2 = this.createItemDrawContext();
                    boolean bl = false;
                    itemContext = var16_16;
                    drawContext = drawContext2;
                }
                DrawContext context = drawContext;
                this.drawItemSprite(context, stack, slotX, y, animation, itemSize);
            }
            ++var10_10;
        }
    }

    private final float healthProgress(PlayerEntity player) {
        return RangesKt.coerceIn(this.displayedHealth(player) / RangesKt.coerceAtLeast(player.getMaxHealth(), 1.0f), 0.0f, 1.0f);
    }

    private static final void drawItemSprite$lambda$0(DrawContext $context, ItemStack $stack) {
        $context.drawItem($stack, 0, 0);
    }

    private final String targetName(PlayerEntity target) {
        Text text = target.getName();
        Intrinsics.checkNotNullExpressionValue(text, "getName(...)");
        Text component = text;
        if (component != cachedNameComponent) {
            cachedNameComponent = component;
            String string = component.getString();
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            cachedNameText = string;
        }
        return cachedNameText;
    }

    static {
        draggable = INSTANCE.draggable(INSTANCE.getName(), 200.0f, 200.0f);
        showAnimation = new AnimationUtil();
        healthAnimation = new AnimationUtil();
        nameScroller = new \u0628\u0642(0L, 3000L, 250L, 1, null);
        sideRound = new Vector4f();
        ItemStack[] itemStackArray = new ItemStack[6];
        itemStackArray[0] = ItemStack.EMPTY;
        itemStackArray[1] = ItemStack.EMPTY;
        itemStackArray[2] = ItemStack.EMPTY;
        itemStackArray[3] = ItemStack.EMPTY;
        itemStackArray[4] = ItemStack.EMPTY;
        itemStackArray[5] = ItemStack.EMPTY;
        equipment = itemStackArray;
        cachedHealthText = "0.0";
        cachedNameText = "";
    }

    @Override
    public void onDisable() {
        displayTarget = null;
        showAnimation.snap(0.0);
        healthAnimation.snap(0.0);
        this.clearDraggableBounds();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isHealthObjective(ScoreboardObjective objective) {
        if (Intrinsics.areEqual(objective.getCriterion(), ScoreboardCriterion.HEALTH)) {
            return true;
        }
        String string = objective.getName();
        Intrinsics.checkNotNullExpressionValue(string, "getName(...)");
        String string2 = string;
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String string3 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string3, "toLowerCase(...)");
        String name = string3;
        String string4 = objective.getDisplayName().getString();
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String string5 = string4;
        Locale locale2 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale2, "ROOT");
        String string6 = string5.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(string6, "toLowerCase(...)");
        String displayName = string6;
        if (StringsKt.contains$default((CharSequence)name, "health", false, 2, null)) return true;
        if (Intrinsics.areEqual(name, "hp")) return true;
        if (StringsKt.contains$default((CharSequence)displayName, "health", false, 2, null)) return true;
        if (StringsKt.contains$default((CharSequence)displayName, "hp", false, 2, null)) return true;
        if (StringsKt.contains$default((CharSequence)displayName, "\u0445\u043f", false, 2, null)) return true;
        if (StringsKt.contains$default((CharSequence)displayName, "\u0437\u0434\u043e\u0440\u043e\u0432", false, 2, null)) return true;
        if (StringsKt.contains$default((CharSequence)displayName, "\u2764", false, 2, null)) return true;
        if (!StringsKt.contains$default((CharSequence)string2, "\u2665", false, 2, null)) return false;
        return true;
    }

    private final boolean isUsableTarget(PlayerEntity player) {
        return !player.isRemoved() && player.isAlive() && !player.isInvisible();
    }

    private \u062b\u0623() {
        super("TargetHUD", \u0638\u0646.getHUD(), "\u0418\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044f \u043e \u0432\u0430\u0448\u0435\u0439 \u0446\u0435\u043b\u0438");
    }

    private final DrawContext createItemDrawContext() {
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNull(gameRenderer, "null cannot be cast to non-null type kotakbaz.rain.mixin.GameRendererAccessor");
        GuiRenderState guiState = ((GameRendererAccessor)gameRenderer).rain$getGuiState();
        return new DrawContext(\u0636\u0643.getMc(), guiState, \u0636\u0643.getMc().getWindow().getScaledWidth(), \u0636\u0643.getMc().getWindow().getScaledHeight());
    }

    private final Color withAlpha(Color color, float factor) {
        return \u0628\u062d.INSTANCE.setAlpha(color, (float)color.getAlpha() / 255.0f * factor);
    }

    private final String healthText(float health) {
        block3: {
            int bits;
            block2: {
                bits = Float.floatToRawIntBits(health);
                if (!cachedHealthInitialized) break block2;
                if (cachedHealthBits == bits) break block3;
            }
            cachedHealthInitialized = true;
            cachedHealthBits = bits;
            Locale locale = Locale.US;
            String string = "%.1f";
            Object[] objectArray = new Object[1];
            objectArray[0] = Float.valueOf(health);
            String string2 = String.format(locale, string, Arrays.copyOf(objectArray, objectArray.length));
            Intrinsics.checkNotNullExpressionValue(string2, "format(...)");
            cachedHealthText = string2;
        }
        return cachedHealthText;
    }

    /*
     * WARNING - void declaration
     */
    private final void renderHud(PlayerEntity target, float animation) {
        void var23_23;
        void var22_22;
        void var2_2;
        void var30_30;
        void var26_26;
        void var25_25;
        float textTop;
        float x = draggable.getX();
        float y = draggable.getY();
        this.updateEquipment(target);
        float width = \u0637\u063a.INSTANCE.scaled(115.0f);
        float gap = \u0637\u063a.INSTANCE.margin();
        float headSize = \u0637\u063a.INSTANCE.scaled(27.0f);
        float height = headSize + gap * 1.5f;
        draggable.setWidth(width);
        draggable.setHeight(height);
        float sideWidth = height;
        float round = height * 0.25f;
        sideRound.set(round, 0.0f, round, 0.0f);
        float offset = gap * 0.9f;
        float healthBarHeight = \u0637\u063a.INSTANCE.scaled(3.0f);
        float healthBarRound = healthBarHeight * 0.2f;
        float startX = x + sideWidth + offset;
        float healthBarWidth = width - sideWidth - offset * 2.0f;
        float textSize = \u0637\u063a.INSTANCE.scaled(7.0f);
        float healthUnitSize = textSize * 0.7f;
        float healthUnitGap = \u0637\u063a.INSTANCE.scaled(1.0f);
        float textY = textTop = y + offset;
        float healthBarY = textTop + \u0631\u064e.INSTANCE.getGS_MEDIUM().getHeight(textSize) + gap * 0.6f;
        float equipmentItemSize = \u0637\u063a.INSTANCE.scaled(10.0f);
        float equipmentItemGap = \u0637\u063a.INSTANCE.scaled(1.0f);
        float equipmentWidth = (float)equipment.length * equipmentItemSize + (float)RangesKt.coerceAtLeast(equipment.length - 1, 0) * equipmentItemGap;
        float equipmentX = startX + RangesKt.coerceAtLeast(healthBarWidth - equipmentWidth, 0.0f) * 0.5f;
        float equipmentY = healthBarY + healthBarHeight + gap * 0.45f;
        Color panelColor = this.withAlpha(\u0637\u063a.INSTANCE.getPANEL_COLOR(), animation);
        Color sideColor = this.withAlpha(\u0637\u063a.INSTANCE.getHEADER_COLOR(), animation);
        Color textColor = this.withAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), animation);
        Color secondaryColor = this.withAlpha(\u0637\u063a.INSTANCE.getVALUE_COLOR(), animation);
        Color healthBackColor = \u0628\u062d.INSTANCE.setAlpha(\u0637\u063a.INSTANCE.getHEADER_COLOR(), 0.35f * animation);
        Color healthColor = this.withAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), animation);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(panelColor).mix(0.9f).round(round).draw(x, y, width, height);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(sideColor).mix(0.9f).round(sideRound).draw(x, y, sideWidth, height);
        this.drawHead(target, x + gap / 1.2f, y + (height - headSize) / 2.0f, headSize, animation);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(healthBackColor).mix(0.9f).round(healthBarRound).draw(startX, healthBarY, healthBarWidth, healthBarHeight);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(healthColor).mix(0.9f).round(healthBarRound).draw(startX, healthBarY, healthBarWidth * RangesKt.coerceIn(healthAnimation.get(), 0.0f, 1.0f), healthBarHeight);
        String healthText = this.healthText(this.displayedHealth(target));
        String healthUnitText = "hp";
        float healthWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), healthText, textSize, 0.0f, 4, null);
        float healthUnitWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_REGULAR(), healthUnitText, healthUnitSize, 0.0f, 4, null);
        float totalHealthWidth = healthWidth + healthUnitGap + healthUnitWidth;
        float healthX = startX + healthBarWidth - totalHealthWidth - \u0637\u063a.INSTANCE.scaled(1.0f);
        float healthUnitY = textY + (textSize - healthUnitSize);
        float nameWidth = RangesKt.coerceAtLeast(healthBarWidth - totalHealthWidth - gap * 0.5f, 0.0f);
        \u0628\u0642.draw$default(nameScroller, \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT), this.targetName(target), startX, textY, textSize, textColor, nameWidth, true, 0.0f, 256, null);
        Font.drawText$default(\u0631\u064e.INSTANCE.getGS_REGULAR().priority(ClientRenderPipeline.HUD_TEXT), healthText, healthX + \u0637\u063a.INSTANCE.scaled(1.0f), textY, textSize, textColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        Font.drawText$default(\u0631\u064e.INSTANCE.getGS_REGULAR().priority(ClientRenderPipeline.HUD_TEXT), healthUnitText, healthX + healthWidth + healthUnitGap, healthUnitY, healthUnitSize, secondaryColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        this.drawEquipment(equipment, (float)var25_25, (float)var26_26, (Color)var30_30, (float)var2_2, (float)var22_22, (float)var23_23);
    }

    private final void drawItemSprite(DrawContext context, ItemStack stack, float x, float y, float animation, float itemSize) {
        if (animation <= 0.01f) {
            return;
        }
        float itemScale = itemSize / 16.0f;
        context.getMatrices().pushMatrix();
        context.getMatrices().translate(x, y);
        context.getMatrices().scale(itemScale, itemScale);
        \u062c\u0625.withAlpha(this.equipmentAnimation(animation), () -> \u062b\u0623.drawItemSprite$lambda$0(context, stack));
        context.getMatrices().popMatrix();
    }

    private final float equipmentAnimation(float hudAnimation) {
        if (showAnimation.getToValue() > 0.0) {
            return hudAnimation;
        }
        return RangesKt.coerceIn((hudAnimation - 0.18f) / 0.82f, 0.0f, 1.0f);
    }

    /*
     * WARNING - void declaration
     */
    @Commando
    public final void onOverlayRender(@NotNull OverlayRenderEvent event) {
        void var3_5;
        PlayerEntity target;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean preview = \u0636\u0643.getMc().currentScreen instanceof ChatScreen;
        if (preview && displayTarget == null) {
            ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
            if (clientPlayerEntity != null) {
                ClientPlayerEntity player = clientPlayerEntity;
                boolean bl = false;
                displayTarget = (PlayerEntity)player;
                healthAnimation.snap(INSTANCE.healthProgress((PlayerEntity)player));
                showAnimation.run(1.0, 180L, Easing.SINE_OUT, true);
            }
        }
        showAnimation.update();
        healthAnimation.update();
        float animation = RangesKt.coerceIn(showAnimation.get(), 0.0f, 1.0f);
        PlayerEntity playerEntity = displayTarget;
        if (playerEntity == null) {
            playerEntity = (PlayerEntity)(preview ? \u0636\u0643.getMc().player : null);
        }
        if ((target = playerEntity) == null) {
            if (!preview) {
                this.clearDraggableBounds();
            }
            return;
        }
        if (animation <= 0.01f) {
            if (!preview) {
                this.clearDraggableBounds();
                return;
            }
        }
        this.renderHud(target, preview ? RangesKt.coerceAtLeast(animation, 0.01f) : var3_5);
    }
}

