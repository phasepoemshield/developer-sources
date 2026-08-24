/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTexture
 *  net.minecraft.client.gui.screen.ChatScreen
 *  net.minecraft.client.texture.AbstractTexture
 *  net.minecraft.client.texture.GlTexture
 *  net.minecraft.util.Identifier
 *  org.joml.Vector4f
 */
package oxxxde;

import com.mojang.blaze3d.textures.GpuTexture;
import java.awt.Color;
import kotakbaz.rain.client.draggable.Draggable;
import kotakbaz.rain.client.draggable.animation.AnimationUtil;
import kotakbaz.rain.client.draggable.animation.Easing;
import kotakbaz.rain.client.util.media.a;
import kotakbaz.rain.client.util.render.display.TextureRectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.event.events.OverlayRenderEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.hud.MediaPlayerInfoModule;
import kotakbaz.rain.module.modules.hud.WatermarkModule;
import kotakbaz.rain.module.setting.ModeSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector4f;
import oxxxde.\u0628\u062d;
import oxxxde.\u0628\u0642;
import oxxxde.\u0628\u064d;
import oxxxde.\u062a\u0623;
import oxxxde.\u062c\u0650;
import oxxxde.\u0630\u062c;
import oxxxde.\u0630\u0631;
import oxxxde.\u0631\u064e;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0637\u063a;
import oxxxde.\u0638\u0646;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0006\u0082\u0001\u0083\u0001\u0084\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJO\u0010#\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0002\u00a2\u0006\u0004\b)\u0010*J_\u0010/\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b/\u00100J%\u00104\u001a\u00020\u000e2\u0006\u00101\u001a\u00020'2\u0006\u00102\u001a\u00020'2\u0006\u00103\u001a\u00020'\u00a2\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b6\u00107J\u0019\u00109\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b9\u0010\u0011J\u000f\u0010;\u001a\u00020:H\u0002\u00a2\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020:H\u0002\u00a2\u0006\u0004\b=\u0010<J!\u0010@\u001a\u00020:2\b\u0010>\u001a\u0004\u0018\u00010:2\u0006\u0010?\u001a\u00020:H\u0002\u00a2\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020:H\u0002\u00a2\u0006\u0004\bB\u0010<J\u0017\u0010E\u001a\u00020:2\u0006\u0010D\u001a\u00020CH\u0002\u00a2\u0006\u0004\bE\u0010FJ'\u0010J\u001a\u00020\u00122\u0006\u0010H\u001a\u00020G2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010I\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\bJ\u0010KJ\u001f\u0010O\u001a\u00020L2\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\bS\u0010\u0003R\u0014\u0010T\u001a\u00020C8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020C8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bV\u0010UR\u0014\u0010W\u001a\u00020'8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020'8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bY\u0010XR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bc\u0010bR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bj\u0010iR\u0014\u0010k\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bk\u0010iR\u0014\u0010l\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010p\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bp\u0010oR\u0014\u0010q\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bq\u0010oR\u0014\u0010r\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\br\u0010oR\u0014\u0010s\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bs\u0010oR\u0014\u0010t\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bt\u0010oR\u0016\u0010u\u001a\u00020C8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bu\u0010UR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010y\u001a\u00020v8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\by\u0010xR\u0014\u0010z\u001a\u00020v8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bz\u0010xR\u0014\u0010{\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010}\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010\u007f\u001a\u00020C8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u007f\u0010UR\u0019\u0010\u0080\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u00a8\u0006\u0085\u0001"}, d2={"Loxxxde/\u0628\u0637;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u062b\u0622;", "event", "", "onOverlayRender", "(Lkotakbaz/rain/event/events/OverlayRenderEvent;)V", "onEnable", "onDisable", "Loxxxde/\u0630\u0652;", "attachedBounds", "()Lkotakbaz/rain/module/modules/hud/MediaPlayerInfoModule$Bounds;", "", "preview", "renderHud", "(Z)V", "", "width", "height", "Loxxxde/\u062f\u0636;", "resolvePosition", "(FF)Lkotakbaz/rain/module/modules/hud/MediaPlayerInfoModule$HudPosition;", "x", "y", "size", "alpha", "drawArtwork", "(FFFF)V", "barWidth", "gap", "minHeight", "maxHeight", "playing", "drawBars", "(FFFFFFFZ)V", "", "time", "", "index", "animatedEnergy", "(DI)F", "drawerHeight", "drawerOverlap", "drawerLift", "progress", "renderChatDrawer", "(FFFFFFFFFZ)V", "mouseX", "mouseY", "button", "onChatClick", "(III)Z", "currentDrawerProgress", "(Z)F", "force", "maybeRefreshTrackInfo", "", "currentTitle", "()Ljava/lang/String;", "currentArtist", "value", "fallback", "sanitize", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "remainingTimeText", "", "totalSeconds", "formatTrackTime", "(J)Ljava/lang/String;", "Loxxxde/\u062c\u064b;", "font", "containerHeight", "centeredTopOffset", "(Lkotakbaz/rain/client/util/render/font/Font;FF)F", "Ljava/awt/Color;", "color", "factor", "withAlpha", "(Ljava/awt/Color;F)Ljava/awt/Color;", "tabAlpha", "()F", "clearControlBounds", "REFRESH_INTERVAL_MS", "J", "CHAT_DRAWER_ANIMATION_MILLIS", "MODE_FREE", "I", "MODE_STATIC", "Loxxxde/\u0638\u0630;", "draggable", "Loxxxde/\u0638\u0630;", "Loxxxde/\u0638\u064a;", "mode", "Loxxxde/\u0638\u064a;", "Loxxxde/\u0628\u0642;", "titleScroller", "Loxxxde/\u0628\u0642;", "artistScroller", "Loxxxde/\u0633\u0637;", "chatDrawerAnimation", "Loxxxde/\u0633\u0637;", "Lorg/joml/Vector4f;", "topPanelRound", "Lorg/joml/Vector4f;", "artworkRound", "drawerRound", "hudPosition", "Loxxxde/\u062f\u0636;", "inactiveTitleColor", "Ljava/awt/Color;", "inactiveArtistColor", "inactiveBarsColor", "playingBarsTrackColor", "inactiveBarsTrackColor", "artworkPlaceholderColor", "lastRefreshAt", "Loxxxde/\u0628\u064d;", "previousControlBounds", "Loxxxde/\u0628\u064d;", "playPauseControlBounds", "nextControlBounds", "renderedBounds", "Loxxxde/\u0630\u0652;", "controlBoundsActive", "Z", "cachedRemainingSeconds", "cachedRemainingText", "Ljava/lang/String;", "HudPosition", "Bounds", "ClickBounds", "rain-visuals"})
public final class \u0628\u0637
extends Module {
    @NotNull
    private static final Color inactiveTitleColor;
    @NotNull
    private static final Vector4f topPanelRound;
    @NotNull
    private static final Color artworkPlaceholderColor;
    @NotNull
    private static String cachedRemainingText;
    private static final long CHAT_DRAWER_ANIMATION_MILLIS = 180L;
    private static final int MODE_FREE = 0;
    @NotNull
    private static final Color inactiveBarsColor;
    private static long cachedRemainingSeconds;
    @NotNull
    public static final \u0628\u0637 INSTANCE;
    private static long lastRefreshAt;
    @NotNull
    private static final Color playingBarsTrackColor;
    @NotNull
    private static final ModeSetting mode;
    @NotNull
    private static final Vector4f artworkRound;
    @NotNull
    private static final Color inactiveArtistColor;
    @NotNull
    private static final Color inactiveBarsTrackColor;
    @NotNull
    private static final \u0628\u0642 titleScroller;
    @NotNull
    private static final MediaPlayerInfoModule.Bounds renderedBounds;
    private static final int MODE_STATIC = 1;
    @NotNull
    private static final MediaPlayerInfoModule.HudPosition hudPosition;
    private static final long REFRESH_INTERVAL_MS = 400L;
    @NotNull
    private static final \u0628\u0642 artistScroller;
    @NotNull
    private static final AnimationUtil chatDrawerAnimation;
    @NotNull
    private static final Vector4f drawerRound;
    private static boolean controlBoundsActive;
    @NotNull
    private static final Draggable draggable;
    @NotNull
    private static final \u0628\u064d previousControlBounds;
    @NotNull
    private static final \u0628\u064d playPauseControlBounds;
    @NotNull
    private static final \u0628\u064d nextControlBounds;

    /*
     * WARNING - void declaration
     */
    private final void renderHud(boolean preview) {
        float artistMeasuredWidth;
        float margin = \u0637\u063a.INSTANCE.margin();
        float width = \u0637\u063a.INSTANCE.scaled(111.0f);
        float height = \u0637\u063a.INSTANCE.headerTextSize() + margin * 2.2f;
        float alpha = this.tabAlpha();
        if (alpha <= 0.0f) {
            this.clearControlBounds();
            draggable.setWidth(0.0f);
            draggable.setHeight(0.0f);
            renderedBounds.clear();
            return;
        }
        MediaPlayerInfoModule.HudPosition position = this.resolvePosition(width, height);
        float x = position.getX();
        float y = position.getY();
        float drawerProgress = this.currentDrawerProgress(preview);
        float panelCorner = \u0637\u063a.INSTANCE.scaled(6.0f);
        topPanelRound.set(panelCorner, panelCorner, panelCorner * (1.0f - drawerProgress), panelCorner * (1.0f - drawerProgress));
        float drawerOverlap = \u0637\u063a.INSTANCE.scaled(4.0f);
        float drawerLift = \u0637\u063a.INSTANCE.scaled(2.0f);
        float drawerHeight = height + drawerOverlap + drawerLift;
        float occupiedHeight = height + RangesKt.coerceAtLeast(drawerHeight - drawerOverlap - drawerLift, 0.0f) * drawerProgress;
        renderedBounds.set(x, y, width, occupiedHeight);
        float artSize = height - margin * 1.45f;
        float gap = \u0637\u063a.INSTANCE.scaled(5.0f);
        float artX = x + margin / 1.5f;
        float artY = y + (height - artSize) / 2.0f;
        float barsWidth = \u0637\u063a.INSTANCE.scaled(18.0f);
        float barsGap = \u0637\u063a.INSTANCE.scaled(1.8f);
        float barWidth = \u0637\u063a.INSTANCE.scaled(2.0f);
        float maxBarHeight = artSize - margin / 2.0f;
        float minBarHeight = \u0637\u063a.INSTANCE.scaled(2.2f);
        float titleSize = \u0637\u063a.INSTANCE.scaled(6.0f);
        float artistSize = \u0637\u063a.INSTANCE.scaled(6.0f);
        float textX = artX + artSize + gap;
        float textRight = x + width - barsWidth - \u0637\u063a.INSTANCE.scaled(5.0f);
        float textWidth = RangesKt.coerceAtLeast(textRight - textX, \u0637\u063a.INSTANCE.scaled(20.0f));
        boolean playing = a.getPlaing();
        Color titleColor = this.withAlpha(playing ? \u0637\u063a.INSTANCE.getTITLE_COLOR() : inactiveTitleColor, alpha);
        Color artistColor = this.withAlpha(playing ? \u0637\u063a.INSTANCE.getVALUE_COLOR() : inactiveArtistColor, alpha);
        String rawArtist = this.currentArtist();
        float artistGap = StringsKt.isBlank(rawArtist) ? 0.0f : margin / 1.5f;
        String titleText = this.currentTitle();
        Font titleFont = \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT);
        Font artistFont = \u0631\u064e.INSTANCE.getGS_REGULAR().priority(ClientRenderPipeline.HUD_TEXT);
        float availableSharedWidth = RangesKt.coerceAtLeast(textWidth - artistGap, 0.0f);
        float halfSharedWidth = availableSharedWidth / 2.0f;
        float titleMeasuredWidth = Font.getWidth$default(titleFont, titleText, titleSize, 0.0f, 4, null);
        float f = StringsKt.isBlank(rawArtist) ? 0.0f : (artistMeasuredWidth = Font.getWidth$default(artistFont, rawArtist, artistSize, 0.0f, 4, null));
        boolean titleWantsMore = titleMeasuredWidth > halfSharedWidth;
        boolean artistWantsMore = artistMeasuredWidth > halfSharedWidth;
        float titleWidth = RangesKt.coerceAtMost(StringsKt.isBlank(rawArtist) ? textWidth : (titleWantsMore && artistWantsMore ? halfSharedWidth : (artistMeasuredWidth <= 0.0f ? textWidth : (titleWantsMore ? RangesKt.coerceAtLeast(availableSharedWidth - artistMeasuredWidth, \u0637\u063a.INSTANCE.scaled(12.0f)) : RangesKt.coerceAtLeast(titleMeasuredWidth, \u0637\u063a.INSTANCE.scaled(12.0f))))), textWidth);
        float titleTop = y + this.centeredTopOffset(\u0631\u064e.INSTANCE.getGS_MEDIUM(), titleSize, height) - \u0637\u063a.INSTANCE.scaled(0.1f);
        float artistTop = y + this.centeredTopOffset(\u0631\u064e.INSTANCE.getGS_REGULAR(), artistSize, height);
        this.clearControlBounds();
        if (drawerProgress > 0.001f) {
            this.renderChatDrawer(x, y, width, height, drawerHeight, drawerOverlap, drawerLift, drawerProgress, alpha, playing);
        }
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(this.withAlpha(\u0637\u063a.INSTANCE.getPANEL_COLOR(), alpha)).mix(0.9f).round(topPanelRound).draw(x, y, width, height);
        float artworkCorner = \u0637\u063a.INSTANCE.scaled(6.0f);
        float artworkSideCorner = \u0637\u063a.INSTANCE.scaled(4.5f);
        artworkRound.set(artworkCorner, artworkSideCorner, artworkCorner, artworkSideCorner);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(this.withAlpha(\u0637\u063a.INSTANCE.getHEADER_COLOR(), alpha)).mix(0.9f).round(artworkRound).draw(artX, artY, artSize, artSize);
        this.drawArtwork(artX, artY, artSize, alpha);
        boolean titleFits = titleMeasuredWidth <= titleWidth;
        if (titleFits) {
            Font.drawText$default(titleFont, titleText, textX, titleTop, titleSize, titleColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        } else {
            \u0628\u0642.draw$default(titleScroller, titleFont, titleText, textX, titleTop, titleSize, titleColor, titleWidth, true, 0.0f, 256, null);
        }
        boolean bl = !StringsKt.isBlank(rawArtist);
        if (bl) {
            void var49_49;
            float artistX = titleFits ? textX + titleMeasuredWidth + artistGap : textX + titleWidth + artistGap;
            float f2 = RangesKt.coerceAtLeast(textRight - var49_49, 0.0f);
            \u0628\u0642.draw$default(artistScroller, artistFont, rawArtist, (float)var49_49, artistTop, artistSize, artistColor, f2, true, 0.0f, 256, null);
        }
        this.drawBars(x + width - barsWidth, artY + margin / 4.0f, barWidth, barsGap, minBarHeight, maxBarHeight, alpha, playing);
        if (mode.getSelectedIndex() == 0) {
            void var9_9;
            void var12_12;
            void var11_11;
            void var13_13;
            void var4_4;
            draggable.setWidth(width);
            draggable.setHeight((float)(var4_4 + RangesKt.coerceAtLeast((float)(var13_13 - var11_11 - var12_12), 0.0f) * var9_9));
        } else {
            draggable.setWidth(0.0f);
            draggable.setHeight(0.0f);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Commando
    public final void onOverlayRender(@NotNull OverlayRenderEvent event) {
        void var2_2;
        Intrinsics.checkNotNullParameter(event, "event");
        \u0628\u0637.maybeRefreshTrackInfo$default(this, false, 1, null);
        boolean preview = \u0636\u0643.getMc().currentScreen instanceof ChatScreen;
        if (\u0636\u0643.getMc().player == null) {
            if (!preview) {
                draggable.setWidth(0.0f);
                draggable.setHeight(0.0f);
                renderedBounds.clear();
                return;
            }
        }
        this.renderHud((boolean)var2_2);
    }

    public final boolean onChatClick(int mouseX, int mouseY, int button) {
        if (button != 0) {
            return false;
        }
        if (!this.isEnabled()) {
            return false;
        }
        if (!(\u0636\u0643.getMc().currentScreen instanceof ChatScreen)) {
            return false;
        }
        float x = mouseX;
        float y = mouseY;
        if (controlBoundsActive && previousControlBounds.contains(x, y)) {
            a.previousTrack();
            return true;
        }
        if (controlBoundsActive && playPauseControlBounds.contains(x, y)) {
            a.playpauseTrack();
            return true;
        }
        if (controlBoundsActive && nextControlBounds.contains(x, y)) {
            a.nextTrack();
            return true;
        }
        return false;
    }

    static {
        INSTANCE = new \u0628\u0637();
        draggable = INSTANCE.draggable(INSTANCE.getName(), 210.0f, 120.0f);
        String[] stringArray = new String[2];
        stringArray[0] = "\u0421\u0432\u043e\u0431\u043e\u0434\u043d\u044b\u0439";
        stringArray[1] = "\u0421\u0442\u0430\u0442\u0438\u0447\u043d\u044b\u0439";
        mode = Module.mode$default(INSTANCE, "\u0420\u0435\u0436\u0438\u043c", CollectionsKt.listOf(stringArray), 0, null, 12, null);
        titleScroller = new \u0628\u0642(0L, 0L, 0L, 7, null);
        artistScroller = new \u0628\u0642(0L, 0L, 0L, 7, null);
        chatDrawerAnimation = new AnimationUtil();
        topPanelRound = new Vector4f();
        artworkRound = new Vector4f();
        drawerRound = new Vector4f();
        hudPosition = new MediaPlayerInfoModule.HudPosition(0.0f, 0.0f, 3, null);
        inactiveTitleColor = \u0628\u062d.INSTANCE.setAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), 0.72f);
        inactiveArtistColor = \u0628\u062d.INSTANCE.setAlpha(\u0637\u063a.INSTANCE.getVALUE_COLOR(), 0.82f);
        inactiveBarsColor = \u0628\u062d.INSTANCE.setAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), 0.45f);
        playingBarsTrackColor = \u0628\u062d.INSTANCE.setAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), 0.16f);
        inactiveBarsTrackColor = \u0628\u062d.INSTANCE.setAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), 0.08f);
        artworkPlaceholderColor = \u0628\u062d.INSTANCE.setAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), 0.12f);
        previousControlBounds = new \u0628\u064d(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        playPauseControlBounds = new \u0628\u064d(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        nextControlBounds = new \u0628\u064d(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        renderedBounds = new MediaPlayerInfoModule.Bounds(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        cachedRemainingSeconds = Long.MIN_VALUE;
        cachedRemainingText = "-0:00";
    }

    private final void drawArtwork(float x, float y, float size, float alpha) {
        Identifier textureId = a.getTextureId();
        if (textureId != null && a.getTextureWidth() > 0 && a.getTextureHeight() > 0) {
            AbstractTexture abstractTexture = \u0636\u0643.getMc().getTextureManager().getTexture(textureId);
            Intrinsics.checkNotNullExpressionValue(abstractTexture, "getTexture(...)");
            GpuTexture gpuTexture = \u0637\u062b.getGlTextureView(abstractTexture).texture();
            GlTexture glTexture = gpuTexture instanceof GlTexture ? (GlTexture)gpuTexture : null;
            if (glTexture != null) {
                TextureRectRenderer textureRectRenderer = \u0630\u0631.INSTANCE.getTEXTURE_RECT().priority(ClientRenderPipeline.HUD_SPECIAL).texture(glTexture.getGlId());
                Color color = Color.WHITE;
                Intrinsics.checkNotNullExpressionValue(color, "WHITE");
                textureRectRenderer.draw(x, y, size, size, color, size * 0.2f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, alpha);
                return;
            }
        }
        Color placeholderColor = this.withAlpha(artworkPlaceholderColor, alpha);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(placeholderColor).mix(0.9f).round(\u0637\u063a.INSTANCE.scaled(4.0f)).draw(x + \u0637\u063a.INSTANCE.scaled(2.0f), y + \u0637\u063a.INSTANCE.scaled(2.0f), size - \u0637\u063a.INSTANCE.scaled(4.0f), size - \u0637\u063a.INSTANCE.scaled(4.0f));
        Font.drawCenteredText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT), "M", x + size / 2.0f, y + this.centeredTopOffset(\u0631\u064e.INSTANCE.getGS_MEDIUM(), \u0637\u063a.INSTANCE.scaled(6.5f), size) - \u0637\u063a.INSTANCE.scaled(0.5f), \u0637\u063a.INSTANCE.scaled(6.5f), this.withAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), alpha), 0.0f, 32, null);
    }

    @Override
    public void onEnable() {
        this.maybeRefreshTrackInfo(true);
        chatDrawerAnimation.snap(\u0636\u0643.getMc().currentScreen instanceof ChatScreen ? 1.0 : 0.0);
    }

    private \u0628\u0637() {
        super("MediaPlayerInfo", \u0638\u0646.getHUD(), "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0435\u0442 \u0438\u043d\u0444\u043e \u043e\u0442 \u0438\u0433\u0440\u0430\u044e\u0449\u0435\u0439 \u043f\u0435\u0441\u043d\u0435");
    }

    private final Color withAlpha(Color color, float factor) {
        if (factor >= 0.999f) {
            return color;
        }
        return \u0628\u062d.INSTANCE.setAlpha(color, (float)color.getAlpha() / 255.0f * factor);
    }

    private final float currentDrawerProgress(boolean preview) {
        chatDrawerAnimation.run(preview ? 1.0 : 0.0, 180L, Easing.SINE_OUT, true);
        chatDrawerAnimation.update();
        return RangesKt.coerceIn(chatDrawerAnimation.get(), 0.0f, 1.0f);
    }

    private final float animatedEnergy(double time, int index) {
        double waveA = Math.sin(time * 6.2 + (double)index * 0.9);
        double waveB = Math.sin(time * 9.4 + (double)index * 1.7 + 1.3);
        double waveC = Math.sin(time * 12.8 + (double)index * 2.1 + 2.6);
        double mixed = Math.abs(waveA * 0.55 + waveB * 0.3 + waveC * 0.15);
        return RangesKt.coerceIn((float)(0.18 + mixed * 0.82), 0.0f, 1.0f);
    }

    private final String currentTitle() {
        return this.sanitize(a.getTrackTitle(), "\u041d\u0435\u0442 \u0442\u0440\u0435\u043a\u0430");
    }

    /*
     * WARNING - void declaration
     */
    private final void renderChatDrawer(float x, float y, float width, float height, float drawerHeight, float drawerOverlap, float drawerLift, float progress, float alpha, boolean playing) {
        void var22_22;
        void var25_25;
        void var57_57;
        void var35_35;
        void var38_38;
        void var16_16;
        void var42_42;
        void var15_15;
        void var58_58;
        void var59_59;
        float drawerX = x;
        float drawerY = y + height - drawerOverlap - drawerLift;
        float drawerWidth = RangesKt.coerceAtLeast(width, 0.0f);
        float visibleHeight = drawerHeight * progress;
        if (drawerWidth <= 0.0f || visibleHeight <= 0.5f) {
            return;
        }
        float drawerBodyTop = drawerY + drawerOverlap + drawerLift;
        float drawerBodyHeight = RangesKt.coerceAtLeast(drawerHeight - drawerOverlap - drawerLift, 0.0f);
        Color drawerBaseColor = this.withAlpha(\u0637\u063a.INSTANCE.getPANEL_COLOR(), progress * alpha);
        Color drawerTintColor = this.withAlpha(\u0637\u063a.INSTANCE.getHEADER_COLOR(), progress * alpha * 0.9f);
        float drawerCorner = \u0637\u063a.INSTANCE.scaled(5.0f);
        drawerRound.set(drawerCorner * (1.0f - progress), drawerCorner * (1.0f - progress), drawerCorner, drawerCorner);
        Color trackColor = this.withAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), 0.12f * progress * alpha);
        Color progressColor = this.withAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), 0.92f * progress * alpha);
        Color titleColor = playing ? this.withAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), progress * alpha) : this.withAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), 0.72f * progress * alpha);
        Color secondaryColor = playing ? this.withAlpha(\u0637\u063a.INSTANCE.getVALUE_COLOR(), progress * alpha) : this.withAlpha(\u0637\u063a.INSTANCE.getVALUE_COLOR(), 0.82f * progress * alpha);
        float timeSize = \u0637\u063a.INSTANCE.scaled(5.1f);
        float controlSize = \u0637\u063a.INSTANCE.scaled(5.6f);
        float innerPadding = \u0637\u063a.INSTANCE.scaled(6.0f);
        float contentShift = (1.0f - progress) * \u0637\u063a.INSTANCE.scaled(4.0f);
        Font timeFont = \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT);
        Font controlFont = \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT);
        Font iconControlFont = \u0631\u064e.INSTANCE.getICON().priority(ClientRenderPipeline.HUD_TEXT);
        String leftText = a.getTrackTime();
        String rightText = this.remainingTimeText();
        String previousText = "m";
        String playPauseText = playing ? "o" : "p";
        String nextText = "n";
        Font previousFont = iconControlFont;
        Font playPauseFont = iconControlFont;
        Font nextFont = iconControlFont;
        float controlGap = \u0637\u063a.INSTANCE.scaled(3.0f);
        float previousWidth = Font.getWidth$default(previousFont, previousText, controlSize, 0.0f, 4, null);
        float playPauseWidth = Font.getWidth$default(playPauseFont, playPauseText, controlSize, 0.0f, 4, null);
        float nextWidth = Font.getWidth$default(nextFont, nextText, controlSize, 0.0f, 4, null);
        float controlsWidth = previousWidth + playPauseWidth + nextWidth + controlGap * 2.0f;
        float controlsX = drawerX + drawerWidth - innerPadding - controlsWidth;
        float rightWidth = Font.getWidth$default(timeFont, rightText, timeSize, 0.0f, 4, null);
        float rightX = controlsX - \u0637\u063a.INSTANCE.scaled(6.0f) - rightWidth;
        float leftX = drawerX + innerPadding;
        Intrinsics.checkNotNull(leftText);
        float leftWidth = Font.getWidth$default(timeFont, leftText, timeSize, 0.0f, 4, null);
        float progressX = leftX + leftWidth + \u0637\u063a.INSTANCE.scaled(6.0f);
        float progressRight = RangesKt.coerceAtLeast(rightX - \u0637\u063a.INSTANCE.scaled(6.0f), progressX);
        float progressWidth = RangesKt.coerceAtLeast(progressRight - progressX, \u0637\u063a.INSTANCE.scaled(12.0f));
        float progressBarHeight = \u0637\u063a.INSTANCE.scaled(1.8f);
        float progressY = drawerBodyTop + drawerBodyHeight / 2.0f - progressBarHeight / 2.0f + contentShift;
        float textY = drawerBodyTop + this.centeredTopOffset(\u0631\u064e.INSTANCE.getGS_MEDIUM(), timeSize, drawerBodyHeight) + contentShift;
        float previousY = drawerBodyTop + this.centeredTopOffset(\u0631\u064e.INSTANCE.getICON(), controlSize, drawerBodyHeight) + contentShift;
        float playPauseY = drawerBodyTop + this.centeredTopOffset(\u0631\u064e.INSTANCE.getICON(), controlSize, drawerBodyHeight) + contentShift;
        float nextY = drawerBodyTop + this.centeredTopOffset(\u0631\u064e.INSTANCE.getICON(), controlSize, drawerBodyHeight) + contentShift;
        float controlPadding = \u0637\u063a.INSTANCE.scaled(2.5f);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(drawerBaseColor).mix(0.9f).round(drawerRound).draw(drawerX, drawerY, drawerWidth, visibleHeight);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(drawerTintColor).mix(0.9f).round(drawerRound).draw(drawerX, drawerY, drawerWidth, visibleHeight);
        \u062c\u0650.INSTANCE.start(drawerX, drawerY, drawerWidth, visibleHeight);
        Font.drawText$default(timeFont, leftText, leftX, textY, timeSize, titleColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        Font.drawText$default(timeFont, rightText, rightX, textY, timeSize, secondaryColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(trackColor).mix(0.9f).round(progressBarHeight / 2.0f).draw(progressX, progressY, progressWidth, progressBarHeight);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(progressColor).mix(0.9f).round(progressBarHeight / 2.0f).draw(progressX, progressY, progressWidth * RangesKt.coerceIn(a.getProgress(), 0.0f, 1.0f), progressBarHeight);
        float controlX = controlsX;
        previousControlBounds.set(controlX - controlPadding, drawerBodyTop, previousWidth + controlPadding * 2.0f, drawerBodyHeight);
        Font.drawText$default(previousFont, previousText, controlX, previousY, controlSize, titleColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        playPauseControlBounds.set((controlX += previousWidth + controlGap) - controlPadding, drawerBodyTop, playPauseWidth + controlPadding * 2.0f, drawerBodyHeight);
        Font.drawText$default(playPauseFont, playPauseText, controlX, playPauseY, controlSize, titleColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        controlX += playPauseWidth + controlGap;
        nextControlBounds.set((float)(var59_59 - var58_58), (float)var15_15, (float)(var42_42 + var58_58 * 2.0f), (float)var16_16);
        Font.drawText$default((Font)var38_38, (String)var35_35, (float)var59_59, (float)var57_57, (float)var25_25, (Color)var22_22, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        controlBoundsActive = true;
        \u062c\u0650.INSTANCE.end();
    }

    private final String formatTrackTime(long totalSeconds) {
        long minutes = totalSeconds / 60L;
        long seconds = totalSeconds % 60L;
        return minutes + ":" + (seconds < 10L ? "0" : "") + seconds;
    }

    @Nullable
    public final MediaPlayerInfoModule.Bounds attachedBounds() {
        block3: {
            block2: {
                if (!this.isEnabled()) break block2;
                if (mode.getSelectedIndex() != 1) break block2;
                if (!(renderedBounds.getHeight() <= 0.0f)) break block3;
            }
            return null;
        }
        return renderedBounds;
    }

    private final void clearControlBounds() {
        controlBoundsActive = false;
    }

    private final float tabAlpha() {
        return RangesKt.coerceIn(1.0f - \u0630\u062c.INSTANCE.getTabProgress(), 0.0f, 1.0f);
    }

    private final void drawBars(float x, float y, float barWidth, float gap, float minHeight, float maxHeight, float alpha, boolean playing) {
        double time = (double)System.nanoTime() / 1.0E9;
        Color baseColor = this.withAlpha(playing ? \u0637\u063a.INSTANCE.getTITLE_COLOR() : inactiveBarsColor, alpha);
        Color trackColor = this.withAlpha(playing ? playingBarsTrackColor : inactiveBarsTrackColor, alpha);
        for (int index = 0; index < 5; ++index) {
            float energy = playing ? this.animatedEnergy(time, index) : 0.18f + (float)index * 0.03f;
            float barHeight = minHeight + (maxHeight - minHeight) * energy;
            float barX = x + (float)index * barWidth;
            float trackY = y;
            float barY = y + (maxHeight - barHeight);
            \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(trackColor).mix(0.9f).round(barWidth / 2.0f).draw(barX, trackY, barWidth, maxHeight);
            \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(baseColor).mix(0.9f).round(barWidth / 2.0f).draw(barX, barY, barWidth, barHeight);
        }
    }

    private final float centeredTopOffset(Font font, float size, float containerHeight) {
        return (containerHeight - font.getMetrics().getLineHeight() * size) * 0.5f;
    }

    private final MediaPlayerInfoModule.HudPosition resolvePosition(float width, float height) {
        if (mode.getSelectedIndex() != 1) {
            hudPosition.setX(draggable.getX());
            hudPosition.setY(draggable.getY());
            return hudPosition;
        }
        float screenWidth = \u0636\u0643.getMc().getWindow().getScaledWidth();
        float screenHeight = \u0636\u0643.getMc().getWindow().getScaledHeight();
        float minX = 3.0f;
        float minY = 3.0f;
        float maxX = RangesKt.coerceAtLeast(screenWidth - width - minX, minX);
        float maxY = RangesKt.coerceAtLeast(screenHeight - height - minY, minY);
        if (\u062a\u0623.INSTANCE.isEnabled()) {
            WatermarkModule.Bounds logoBounds = \u062a\u0623.INSTANCE.currentLogoBounds();
            hudPosition.setX(RangesKt.coerceIn(logoBounds.getCenterX() - width / 2.0f, minX, maxX));
            hudPosition.setY(RangesKt.coerceIn(logoBounds.getY() + logoBounds.getHeight() + \u0637\u063a.INSTANCE.scaled(4.0f), minY, maxY));
        } else {
            hudPosition.setX(RangesKt.coerceIn((screenWidth - width) / 2.0f, minX, maxX));
            hudPosition.setY(RangesKt.coerceIn(\u062a\u0623.INSTANCE.anchorTopY(), minY, maxY));
        }
        return hudPosition;
    }

    /*
     * WARNING - void declaration
     */
    private final String sanitize(String value, String fallback) {
        void var1_1;
        if (value == null) {
            return fallback;
        }
        if (StringsKt.isBlank(value)) {
            return fallback;
        }
        if (StringsKt.equals(value, "null", true)) {
            void var2_2;
            return var2_2;
        }
        return var1_1;
    }

    private final String currentArtist() {
        return this.sanitize(a.getArtist(), "\u041c\u0435\u0434\u0438\u0430 \u0441\u0435\u0441\u0441\u0438\u044f \u043d\u0435\u0430\u043a\u0442\u0438\u0432\u043d\u0430");
    }

    @Override
    public void onDisable() {
        draggable.setWidth(0.0f);
        draggable.setHeight(0.0f);
        renderedBounds.clear();
        chatDrawerAnimation.snap(0.0);
        this.clearControlBounds();
    }

    private final String remainingTimeText() {
        long duration = RangesKt.coerceAtLeast(a.getDuration(), 0L);
        long position = RangesKt.coerceAtLeast(a.getPosition(), 0L);
        long remaining = RangesKt.coerceAtLeast(duration - position, 0L);
        if (remaining != cachedRemainingSeconds) {
            cachedRemainingSeconds = remaining;
            cachedRemainingText = "-" + this.formatTrackTime(remaining);
        }
        return cachedRemainingText;
    }

    static /* synthetic */ void maybeRefreshTrackInfo$default(\u0628\u0637 \u0628\u06372, boolean bl, int n, Object object) {
        if ((n & 1) != 0) {
            bl = false;
        }
        \u0628\u06372.maybeRefreshTrackInfo(bl);
    }

    private final void maybeRefreshTrackInfo(boolean force) {
        long now = System.currentTimeMillis();
        if (!force && now - lastRefreshAt < 400L) {
            return;
        }
        lastRefreshAt = now;
        a.updateTrackInfo();
    }
}

