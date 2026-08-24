/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.hud.BossBarHud
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  org.joml.Vector4f
 */
package oxxxde;

import java.awt.Color;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import kotakbaz.rain.client.draggable.animation.AnimationUtil;
import kotakbaz.rain.client.draggable.animation.Easing;
import kotakbaz.rain.client.util.render.display.BlurredRectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.event.events.OverlayRenderEvent;
import kotakbaz.rain.mixin.BossBarHudAccessor;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.hud.WatermarkModule;
import kotakbaz.rain.module.setting.ModeSetting;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gui.hud.BossBarHud;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector4f;
import oxxxde.\u0628\u062d;
import oxxxde.\u0630\u062c;
import oxxxde.\u0630\u0631;
import oxxxde.\u0631\u063a;
import oxxxde.\u0631\u064e;
import oxxxde.\u0635\u0650;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u063a;
import oxxxde.\u0638\u0646;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0006\u008e\u0001\u008f\u0001\u0090\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t\u00a2\u0006\u0004\b\f\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u001c\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u000fJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002\u00a2\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b%\u0010\u000fJ'\u0010)\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b+\u0010\u0003J/\u00101\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b1\u00102J'\u00106\u001a\u00020\r2\f\u00104\u001a\b\u0012\u0004\u0012\u00020,032\b\b\u0002\u00105\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b6\u00107J5\u0010:\u001a\u00020\u00062\f\u00104\u001a\b\u0012\u0004\u0012\u00020,032\u0006\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b:\u0010;J'\u0010?\u001a\u00020\r2\u0006\u0010=\u001a\u00020<2\u0006\u0010.\u001a\u00020\r2\u0006\u0010>\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\r2\u0006\u0010-\u001a\u00020,H\u0002\u00a2\u0006\u0004\bA\u0010BJ\u001f\u0010F\u001a\u00020C2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020\rH\u0002\u00a2\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\bH\u0010\u0003J\u000f\u0010I\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\bI\u0010\u0003R\u0014\u0010K\u001a\u00020J8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020J8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010N\u001a\u00020J8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bN\u0010LR\u0014\u0010O\u001a\u00020J8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bO\u0010LR\u0014\u0010P\u001a\u00020J8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bP\u0010LR\u0014\u0010Q\u001a\u00020\r8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020\r8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bS\u0010RR\u0014\u0010T\u001a\u00020\r8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bT\u0010RR\u0014\u0010V\u001a\u00020U8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020U8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bX\u0010WR\u0014\u0010Y\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b[\u0010ZR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b_\u0010^R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bd\u0010eR\u001c\u0010h\u001a\n g*\u0004\u0018\u00010f0f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010j\u001a\u00020C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010l\u001a\u00020C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bl\u0010kR\u0016\u0010m\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bm\u0010ZR\u0016\u0010n\u001a\u00020J8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bn\u0010LR\u0016\u0010o\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bo\u0010ZR\u0016\u0010p\u001a\u00020J8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bp\u0010LR\u0016\u0010q\u001a\u00020U8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bq\u0010WR\u0016\u0010r\u001a\u00020J8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\br\u0010LR\u0016\u0010s\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bs\u0010RR!\u0010x\u001a\b\u0012\u0004\u0012\u00020,038BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR!\u0010{\u001a\b\u0012\u0004\u0012\u00020,038BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\by\u0010u\u001a\u0004\bz\u0010wR!\u0010~\u001a\b\u0012\u0004\u0012\u00020,038BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b|\u0010u\u001a\u0004\b}\u0010wR#\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020,038BX\u0082\u0084\u0002\u00a2\u0006\r\n\u0004\b\u007f\u0010u\u001a\u0005\b\u0080\u0001\u0010wR$\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020,038BX\u0082\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0082\u0001\u0010u\u001a\u0005\b\u0083\u0001\u0010wR$\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020,038BX\u0082\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0085\u0001\u0010u\u001a\u0005\b\u0086\u0001\u0010wR$\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020,038BX\u0082\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0088\u0001\u0010u\u001a\u0005\b\u0089\u0001\u0010wR\u0017\u0010\u008b\u0001\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\b\n\u0010\u008d\u0001R\u0015\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\b\f\u0010\u008d\u0001\u00a8\u0006\u0091\u0001"}, d2={"Loxxxde/\u062a\u0623;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u062b\u0622;", "event", "", "onRender", "(Lkotakbaz/rain/event/events/OverlayRenderEvent;)V", "Loxxxde/\u0637;", "currentBounds", "()Lkotakbaz/rain/module/modules/hud/WatermarkModule$Bounds;", "currentLogoBounds", "", "anchorTopY", "()F", "x", "y", "height", "alpha", "drawDivider", "(FFFF)V", "", "getPing", "()I", "Ljava/util/UUID;", "sessionUuid", "()Ljava/util/UUID;", "animatedTopY", "desiredTopY", "bossBarBottom", "totalBossBars", "visibleBossBarCount", "(I)I", "Loxxxde/\u0638\u0644;", "buildLayout", "()Lkotakbaz/rain/module/modules/hud/WatermarkModule$WatermarkLayout;", "updatePositionProgress", "from", "to", "progress", "lerp", "(FFF)F", "refreshDynamicText", "Loxxxde/\u0639\u0628;", "part", "size", "topOffset", "spacingAfter", "configurePart", "(Lkotakbaz/rain/module/modules/hud/WatermarkModule$WatermarkPart;FFF)V", "", "parts", "limit", "measure", "([Lkotakbaz/rain/module/modules/hud/WatermarkModule$WatermarkPart;I)F", "startX", "topY", "drawParts", "([Lkotakbaz/rain/module/modules/hud/WatermarkModule$WatermarkPart;FFF)V", "Loxxxde/\u062c\u064b;", "font", "containerHeight", "centeredTopOffset", "(Lkotakbaz/rain/client/util/render/font/Font;FF)F", "partWidth", "(Lkotakbaz/rain/module/modules/hud/WatermarkModule$WatermarkPart;)F", "Ljava/awt/Color;", "color", "factor", "withAlpha", "(Ljava/awt/Color;F)Ljava/awt/Color;", "onEnable", "onDisable", "", "CLIENT_ICON", "Ljava/lang/String;", "USER_ICON", "PING_ICON", "FPS_ICON", "TIME_ICON", "BOSS_BAR_START_Y", "F", "BOSS_BAR_STEP", "BOSS_BAR_HEIGHT", "", "BOSS_BAR_ANIMATION_MILLIS", "J", "POSITION_ANIMATION_MILLIS", "POSITION_CENTER", "I", "POSITION_LEFT", "Loxxxde/\u0633\u0637;", "bossBarOffsetAnimation", "Loxxxde/\u0633\u0637;", "positionAnimation", "Loxxxde/\u0638\u064a;", "position", "Loxxxde/\u0638\u064a;", "Lorg/joml/Vector4f;", "leftLogoRound", "Lorg/joml/Vector4f;", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "timeFormatter", "Ljava/time/format/DateTimeFormatter;", "dividerColor", "Ljava/awt/Color;", "normalHeaderColor", "cachedFps", "cachedFpsText", "cachedPing", "cachedPingText", "cachedMinute", "cachedTimeText", "positionAnimationTarget", "leftParts$delegate", "Lkotlin/Lazy;", "getLeftParts", "()[Lkotakbaz/rain/module/modules/hud/WatermarkModule$WatermarkPart;", "leftParts", "centerParts$delegate", "getCenterParts", "centerParts", "rightParts$delegate", "getRightParts", "rightParts", "roleParts$delegate", "getRoleParts", "roleParts", "pingParts$delegate", "getPingParts", "pingParts", "fpsParts$delegate", "getFpsParts", "fpsParts", "timeParts$delegate", "getTimeParts", "timeParts", "layout", "Loxxxde/\u0638\u0644;", "Loxxxde/\u0637;", "Bounds", "WatermarkPart", "WatermarkLayout", "rain-visuals"})
public final class \u062a\u0623
extends Module {
    @NotNull
    private static final String CLIENT_ICON = "a";
    private static final int POSITION_CENTER = 0;
    @NotNull
    private static final Lazy rightParts$delegate;
    @NotNull
    private static final WatermarkModule.Bounds currentBounds;
    @NotNull
    public static final \u062a\u0623 INSTANCE;
    @NotNull
    private static final Lazy timeParts$delegate;
    @NotNull
    private static final String PING_ICON = "k";
    private static int cachedPing;
    @NotNull
    private static final ModeSetting position;
    @NotNull
    private static final String FPS_ICON = "j";
    @NotNull
    private static final AnimationUtil bossBarOffsetAnimation;
    @NotNull
    private static final String USER_ICON = "w";
    private static final int POSITION_LEFT = 1;
    @NotNull
    private static final Color normalHeaderColor;
    private static int cachedFps;
    private static final float BOSS_BAR_START_Y = 12.0f;
    @NotNull
    private static final Color dividerColor;
    @NotNull
    private static final String TIME_ICON = "l";
    private static float positionAnimationTarget;
    private static long cachedMinute;
    @NotNull
    private static final Lazy roleParts$delegate;
    @NotNull
    private static final Lazy centerParts$delegate;
    private static final long BOSS_BAR_ANIMATION_MILLIS = 180L;
    private static final DateTimeFormatter timeFormatter;
    private static final long POSITION_ANIMATION_MILLIS = 240L;
    private static final float BOSS_BAR_STEP = 19.0f;
    @NotNull
    private static String cachedPingText;
    private static final float BOSS_BAR_HEIGHT = 10.0f;
    @NotNull
    private static final Lazy pingParts$delegate;
    @NotNull
    private static final Lazy leftParts$delegate;
    @NotNull
    private static final Lazy fpsParts$delegate;
    @NotNull
    private static String cachedTimeText;
    @NotNull
    private static final Vector4f leftLogoRound;
    @NotNull
    private static final AnimationUtil positionAnimation;
    @NotNull
    private static String cachedFpsText;
    @NotNull
    private static final WatermarkModule.Bounds currentLogoBounds;
    @NotNull
    private static final WatermarkModule.WatermarkLayout layout;

    private static final WatermarkModule.WatermarkPart[] roleParts_delegate$lambda$0() {
        WatermarkModule.WatermarkPart[] watermarkPartArray = new WatermarkModule.WatermarkPart[2];
        watermarkPartArray[0] = INSTANCE.getLeftParts()[0];
        watermarkPartArray[1] = INSTANCE.getLeftParts()[1];
        return watermarkPartArray;
    }

    static /* synthetic */ float measure$default(\u062a\u0623 \u062a\u06232, WatermarkModule.WatermarkPart[] watermarkPartArray, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = watermarkPartArray.length;
        }
        return \u062a\u06232.measure(watermarkPartArray, n);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void onEnable() {
        void var1_1;
        bossBarOffsetAnimation.snap(this.desiredTopY());
        float target = position.getSelectedIndex() == 1 ? 1.0f : 0.0f;
        positionAnimation.snap(target);
        positionAnimationTarget = var1_1;
    }

    /*
     * WARNING - void declaration
     */
    private final float partWidth(WatermarkModule.WatermarkPart part) {
        void var1_1;
        block3: {
            int sizeBits;
            block2: {
                sizeBits = Float.floatToRawIntBits(part.getSize());
                if (!Intrinsics.areEqual(part.getMeasuredText(), part.getText())) break block2;
                if (part.getMeasuredSizeBits() == sizeBits) break block3;
            }
            part.setMeasuredText(part.getText());
            part.setMeasuredSizeBits(sizeBits);
            part.setMeasuredWidth(Font.getWidth$default(part.getFont(), part.getText(), part.getSize(), 0.0f, 4, null));
        }
        return var1_1.getMeasuredWidth();
    }

    /*
     * WARNING - void declaration
     */
    @Commando
    public final void onRender(@NotNull OverlayRenderEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        WatermarkModule.WatermarkLayout layout = this.buildLayout();
        float alpha = RangesKt.coerceIn(1.0f - \u0630\u062c.INSTANCE.getTabProgress() * (1.0f - layout.getLeftProgress()), 0.0f, 1.0f);
        if (alpha <= 0.0f) {
            return;
        }
        Color panelColor = this.withAlpha(\u0637\u063a.INSTANCE.getPANEL_COLOR(), alpha);
        Color headerColor = alpha >= 0.999f ? normalHeaderColor : this.withAlpha(\u0637\u063a.INSTANCE.getHEADER_COLOR(), alpha * 0.9f);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(panelColor).mix(0.9f).round(\u0637\u063a.INSTANCE.scaled(6.0f)).draw(layout.getX(), layout.getY(), layout.getWidth(), layout.getHeight());
        BlurredRectRenderer blurredRectRenderer = \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(headerColor).mix(0.9f);
        Vector4f vector4f = leftLogoRound.set(\u0637\u063a.INSTANCE.scaled(6.0f) * layout.getLeftProgress(), 0.0f, \u0637\u063a.INSTANCE.scaled(6.0f) * layout.getLeftProgress(), 0.0f);
        Intrinsics.checkNotNullExpressionValue(vector4f, "set(...)");
        blurredRectRenderer.round(vector4f).draw(layout.getCenterBackgroundX(), layout.getY(), layout.getCenterWidth(), layout.getHeight());
        this.drawParts(this.getCenterParts(), layout.getCenterX(), layout.getY(), alpha);
        float centeredContentAlpha = alpha * (1.0f - layout.getLeftProgress());
        if (centeredContentAlpha > 0.001f) {
            this.drawParts(this.getLeftParts(), layout.getLeftX(), layout.getY(), centeredContentAlpha);
            this.drawParts(this.getRightParts(), layout.getRightX(), layout.getY(), centeredContentAlpha);
            float leftDividerX = layout.getLeftX() + this.measure(this.getLeftParts(), 2) + \u0637\u063a.INSTANCE.scaled(4.5f);
            this.drawDivider(leftDividerX, layout.getY(), layout.getHeight(), centeredContentAlpha);
            float f = layout.getRightX() + this.measure(this.getRightParts(), 3) + \u0637\u063a.INSTANCE.scaled(4.5f);
            this.drawDivider(f, layout.getY(), layout.getHeight(), centeredContentAlpha);
        }
        float leftContentAlpha = alpha * layout.getLeftProgress();
        if (leftContentAlpha > 0.001f) {
            void var7_7;
            void var2_2;
            this.drawParts(this.getRoleParts(), layout.getRoleX(), layout.getY(), leftContentAlpha);
            this.drawParts(this.getFpsParts(), layout.getFpsX(), layout.getY(), leftContentAlpha);
            this.drawParts(this.getPingParts(), layout.getPingX(), layout.getY(), leftContentAlpha);
            this.drawParts(this.getTimeParts(), layout.getTimeX(), layout.getY(), leftContentAlpha);
            this.drawDivider(layout.getRoleX() + \u062a\u0623.measure$default(this, this.getRoleParts(), 0, 2, null) + \u0637\u063a.INSTANCE.scaled(4.5f), layout.getY(), layout.getHeight(), leftContentAlpha);
            this.drawDivider(layout.getFpsX() + \u062a\u0623.measure$default(this, this.getFpsParts(), 0, 2, null) + \u0637\u063a.INSTANCE.scaled(4.5f), var2_2.getY(), var2_2.getHeight(), (float)var7_7);
            this.drawDivider(var2_2.getPingX() + \u062a\u0623.measure$default(this, this.getPingParts(), 0, 2, null) + \u0637\u063a.INSTANCE.scaled(4.5f), var2_2.getY(), var2_2.getHeight(), (float)var7_7);
        }
    }

    private final float desiredTopY() {
        float baseY = \u0637\u063a.INSTANCE.scaled(5.0f);
        return Math.max(baseY, this.bossBarBottom() + \u0637\u063a.INSTANCE.scaled(4.0f));
    }

    private static final WatermarkModule.WatermarkPart[] rightParts_delegate$lambda$0() {
        WatermarkModule.WatermarkPart[] watermarkPartArray = new WatermarkModule.WatermarkPart[5];
        watermarkPartArray[0] = new WatermarkModule.WatermarkPart(FPS_ICON, \u0631\u064e.INSTANCE.getICON(), 0.0f, \u0637\u063a.INSTANCE.getTITLE_COLOR(), 0.0f, 0.0f);
        watermarkPartArray[1] = new WatermarkModule.WatermarkPart(cachedFpsText, \u0631\u064e.INSTANCE.getGS_MEDIUM(), 0.0f, \u0637\u063a.INSTANCE.getTITLE_COLOR(), 0.0f, 0.0f);
        watermarkPartArray[2] = new WatermarkModule.WatermarkPart("fps", \u0631\u064e.INSTANCE.getGS_REGULAR(), 0.0f, \u0637\u063a.INSTANCE.getVALUE_COLOR(), 0.0f, 0.0f);
        watermarkPartArray[3] = new WatermarkModule.WatermarkPart(TIME_ICON, \u0631\u064e.INSTANCE.getICON(), 0.0f, \u0637\u063a.INSTANCE.getTITLE_COLOR(), 0.0f, 0.0f);
        watermarkPartArray[4] = new WatermarkModule.WatermarkPart(cachedTimeText, \u0631\u064e.INSTANCE.getGS_MEDIUM(), 0.0f, \u0637\u063a.INSTANCE.getTITLE_COLOR(), 0.0f, 0.0f);
        return watermarkPartArray;
    }

    /*
     * WARNING - void declaration
     */
    private final void drawParts(WatermarkModule.WatermarkPart[] parts, float startX, float topY, float alpha) {
        float cursor = startX;
        int index = 0;
        int n = parts.length;
        while (index < n) {
            void var6_6;
            WatermarkModule.WatermarkPart part = parts[index];
            Font.drawText$default(part.getFont().priority(ClientRenderPipeline.HUD_TEXT), part.getText(), cursor, topY + part.getTopOffset(), part.getSize(), this.withAlpha(part.getColor(), alpha), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
            cursor += this.partWidth(part);
            if (index != ArraysKt.getLastIndex(parts)) {
                cursor += part.getSpacingAfter();
            }
            ++var6_6;
        }
    }

    private final WatermarkModule.WatermarkPart[] getTimeParts() {
        Lazy lazy = timeParts$delegate;
        return (WatermarkModule.WatermarkPart[])lazy.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private final float measure(WatermarkModule.WatermarkPart[] parts, int limit) {
        void var3_3;
        float width = 0.0f;
        int lastIndex = limit + -1;
        for (int index = 0; index < limit; ++index) {
            WatermarkModule.WatermarkPart part = parts[index];
            width += this.partWidth(part);
            if (index == lastIndex) continue;
            width += part.getSpacingAfter();
        }
        return (float)var3_3;
    }

    private final float lerp(float from, float to, float progress) {
        return from + (to - from) * progress;
    }

    private final WatermarkModule.WatermarkPart[] getLeftParts() {
        Lazy lazy = leftParts$delegate;
        return (WatermarkModule.WatermarkPart[])lazy.getValue();
    }

    private final WatermarkModule.WatermarkPart[] getRightParts() {
        Lazy lazy = rightParts$delegate;
        return (WatermarkModule.WatermarkPart[])lazy.getValue();
    }

    private final WatermarkModule.WatermarkPart[] getCenterParts() {
        Lazy lazy = centerParts$delegate;
        return (WatermarkModule.WatermarkPart[])lazy.getValue();
    }

    @Override
    public void onDisable() {
        bossBarOffsetAnimation.snap(this.desiredTopY());
    }

    private final void configurePart(WatermarkModule.WatermarkPart part, float size, float topOffset, float spacingAfter) {
        part.setSize(size);
        part.setTopOffset(topOffset);
        part.setSpacingAfter(spacingAfter);
    }

    static {
        INSTANCE = new \u062a\u0623();
        bossBarOffsetAnimation = new AnimationUtil();
        positionAnimation = new AnimationUtil();
        String[] stringArray = new String[2];
        stringArray[0] = "\u041f\u043e \u0446\u0435\u043d\u0442\u0440\u0443";
        stringArray[1] = "\u0421\u043b\u0435\u0432\u0430";
        position = Module.mode$default(INSTANCE, "\u041f\u043e\u0437\u0438\u0446\u0438\u044f", CollectionsKt.listOf(stringArray), 0, null, 12, null);
        leftLogoRound = new Vector4f();
        timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        dividerColor = new Color(255, 255, 255, 100);
        normalHeaderColor = new Color(\u0637\u063a.INSTANCE.getHEADER_COLOR().getRed(), \u0637\u063a.INSTANCE.getHEADER_COLOR().getGreen(), \u0637\u063a.INSTANCE.getHEADER_COLOR().getBlue(), RangesKt.coerceIn((int)((float)\u0637\u063a.INSTANCE.getHEADER_COLOR().getAlpha() * 0.9f), 0, 255));
        cachedFps = Integer.MIN_VALUE;
        cachedFpsText = "0";
        cachedPing = Integer.MIN_VALUE;
        cachedPingText = "--";
        cachedMinute = Long.MIN_VALUE;
        cachedTimeText = "--:--";
        positionAnimationTarget = Float.NaN;
        leftParts$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, \u062a\u0623::leftParts_delegate$lambda$0);
        centerParts$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, \u062a\u0623::centerParts_delegate$lambda$0);
        rightParts$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, \u062a\u0623::rightParts_delegate$lambda$0);
        roleParts$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, \u062a\u0623::roleParts_delegate$lambda$0);
        pingParts$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, \u062a\u0623::pingParts_delegate$lambda$0);
        fpsParts$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, \u062a\u0623::fpsParts_delegate$lambda$0);
        timeParts$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, \u062a\u0623::timeParts_delegate$lambda$0);
        layout = new WatermarkModule.WatermarkLayout(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 16383, null);
        currentBounds = new WatermarkModule.Bounds(0.0f, 0.0f, 0.0f, 0.0f);
        currentLogoBounds = new WatermarkModule.Bounds(0.0f, 0.0f, 0.0f, 0.0f);
    }

    private final UUID sessionUuid() {
        Object object;
        Object object2 = this;
        try {
            \u062a\u0623 $this$sessionUuid_u24lambda_u240 = object2;
            boolean bl = false;
            object = Result.constructor-impl(\u0636\u0643.getMc().getSession().getUuidOrNull());
        }
        catch (Throwable throwable) {
            object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
        object2 = object;
        return (UUID)(Result.isFailure-impl(object2) ? null : object2);
    }

    private final WatermarkModule.WatermarkPart[] getPingParts() {
        Lazy lazy = pingParts$delegate;
        return (WatermarkModule.WatermarkPart[])lazy.getValue();
    }

    private final float updatePositionProgress() {
        float target = position.getSelectedIndex() == 1 ? 1.0f : 0.0f;
        if (!(Math.abs(positionAnimationTarget) <= Float.MAX_VALUE)) {
            positionAnimation.snap(target);
            positionAnimationTarget = target;
        } else if (!(positionAnimationTarget == target)) {
            positionAnimation.run(target, 240L, Easing.SINE_OUT);
            positionAnimationTarget = target;
        }
        positionAnimation.update();
        return RangesKt.coerceIn(positionAnimation.get(), 0.0f, 1.0f);
    }

    private final WatermarkModule.WatermarkPart[] getRoleParts() {
        Lazy lazy = roleParts$delegate;
        return (WatermarkModule.WatermarkPart[])lazy.getValue();
    }

    private final int getPing() {
        Object object = \u0636\u0643.getMc().player;
        if ((object == null || (object = object.getUuid()) == null) && (object = this.sessionUuid()) == null) {
            return -1;
        }
        Object playerUuid = object;
        ClientPlayNetworkHandler clientPlayNetworkHandler = \u0636\u0643.getMc().getNetworkHandler();
        return clientPlayNetworkHandler != null && (clientPlayNetworkHandler = clientPlayNetworkHandler.getPlayerListEntry((UUID)playerUuid)) != null ? RangesKt.coerceAtLeast(clientPlayNetworkHandler.getLatency(), 0) : -1;
    }

    public final float anchorTopY() {
        return this.animatedTopY();
    }

    private final Color withAlpha(Color color, float factor) {
        if (factor >= 0.999f) {
            return color;
        }
        return \u0628\u062d.INSTANCE.multiplyAlpha(color, factor);
    }

    private \u062a\u0623() {
        super("Watermark", \u0638\u0646.getHUD(), "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u0435 \u043f\u043e\u043b\u0435\u0437\u043d\u043e\u0439 \u0438\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u0438");
    }

    private final WatermarkModule.WatermarkPart[] getFpsParts() {
        Lazy lazy = fpsParts$delegate;
        return (WatermarkModule.WatermarkPart[])lazy.getValue();
    }

    private final float centeredTopOffset(Font font, float size, float containerHeight) {
        return (containerHeight - font.getMetrics().getLineHeight() * size) * 0.5f;
    }

    /*
     * WARNING - void declaration
     */
    private final WatermarkModule.WatermarkLayout buildLayout() {
        void var22_22;
        void var16_16;
        void var30_30;
        void var31_31;
        void var2_2;
        this.refreshDynamicText();
        float margin = \u0637\u063a.INSTANCE.margin();
        float height = \u0637\u063a.INSTANCE.headerTextSize() + margin * 2.2f;
        float y = this.animatedTopY();
        float valueSize = \u0637\u063a.INSTANCE.scaled(7.0f);
        float unitSize = \u0637\u063a.INSTANCE.scaled(5.0f);
        float sideIconSize = \u0637\u063a.INSTANCE.scaled(7.0f);
        float centerTextSize = \u0637\u063a.INSTANCE.scaled(12.0f);
        float centerIconSize = centerTextSize * 0.8f;
        float valueY = this.centeredTopOffset(\u0631\u064e.INSTANCE.getGS_MEDIUM(), valueSize, height);
        float unitY = this.centeredTopOffset(\u0631\u064e.INSTANCE.getGS_REGULAR(), unitSize, height) + \u0637\u063a.INSTANCE.scaled(1.0f);
        float sideIconY = this.centeredTopOffset(\u0631\u064e.INSTANCE.getICON(), sideIconSize, height);
        float centerIconY = this.centeredTopOffset(\u0631\u064e.INSTANCE.getICON(), centerIconSize, height);
        this.configurePart(this.getLeftParts()[0], sideIconSize, sideIconY, \u0637\u063a.INSTANCE.scaled(3.2f));
        this.configurePart(this.getLeftParts()[1], valueSize, valueY, \u0637\u063a.INSTANCE.scaled(10.0f));
        this.configurePart(this.getLeftParts()[2], sideIconSize, sideIconY, \u0637\u063a.INSTANCE.scaled(3.2f));
        this.configurePart(this.getLeftParts()[3], valueSize, valueY, \u0637\u063a.INSTANCE.scaled(0.5f));
        this.configurePart(this.getLeftParts()[4], unitSize, unitY, 0.0f);
        this.configurePart(this.getCenterParts()[0], centerIconSize, centerIconY, 0.0f);
        this.configurePart(this.getRightParts()[0], sideIconSize, sideIconY, \u0637\u063a.INSTANCE.scaled(3.2f));
        this.configurePart(this.getRightParts()[1], valueSize, valueY, \u0637\u063a.INSTANCE.scaled(0.5f));
        this.configurePart(this.getRightParts()[2], unitSize, unitY, \u0637\u063a.INSTANCE.scaled(10.0f));
        this.configurePart(this.getRightParts()[3], sideIconSize, sideIconY, \u0637\u063a.INSTANCE.scaled(3.2f));
        this.configurePart(this.getRightParts()[4], valueSize, valueY, 0.0f);
        float leftWidth = \u062a\u0623.measure$default(this, this.getLeftParts(), 0, 2, null);
        float rightWidth = \u062a\u0623.measure$default(this, this.getRightParts(), 0, 2, null);
        float centerIconWidth = \u062a\u0623.measure$default(this, this.getCenterParts(), 0, 2, null);
        float centerWidth = centerIconWidth + margin * 2.0f;
        float roleWidth = \u062a\u0623.measure$default(this, this.getRoleParts(), 0, 2, null);
        float pingWidth = \u062a\u0623.measure$default(this, this.getPingParts(), 0, 2, null);
        float fpsWidth = \u062a\u0623.measure$default(this, this.getFpsParts(), 0, 2, null);
        float timeWidth = \u062a\u0623.measure$default(this, this.getTimeParts(), 0, 2, null);
        float groupGap = \u0637\u063a.INSTANCE.scaled(10.0f);
        float leftProgress = this.updatePositionProgress();
        float centeredWidth = margin * 2.0f + leftWidth + rightWidth + centerWidth + margin * 4.0f;
        float leftWidthTotal = centerWidth + roleWidth + fpsWidth + pingWidth + timeWidth + groupGap * 3.0f + margin * 3.0f;
        float centeredX = (float)\u0636\u0643.getMc().getWindow().getScaledWidth() / 2.0f - centerWidth / 2.0f - leftWidth - margin * 3.0f;
        float leftXTarget = \u0637\u063a.INSTANCE.scaled(5.0f);
        float x = this.lerp(centeredX, leftXTarget, leftProgress);
        float width = this.lerp(centeredWidth, leftWidthTotal, leftProgress);
        float centeredLogoOffset = leftWidth + margin * 3.0f;
        float centerBackgroundX = x + this.lerp(centeredLogoOffset, 0.0f, leftProgress);
        float centerX = centerBackgroundX + centerWidth / 2.0f - centerIconWidth / 2.5f;
        layout.setLeftX(x + margin * 1.5f);
        layout.setRightX(x + centeredLogoOffset + centerWidth + margin * 1.5f);
        layout.setRoleX(x + centerWidth + margin * 1.5f);
        layout.setFpsX(layout.getRoleX() + roleWidth + groupGap);
        layout.setPingX(layout.getFpsX() + fpsWidth + groupGap);
        layout.setTimeX(layout.getPingX() + pingWidth + groupGap);
        layout.setX(x);
        layout.setY(y);
        layout.setWidth(width);
        layout.setHeight((float)var2_2);
        layout.setCenterX((float)var31_31);
        layout.setCenterBackgroundX((float)var30_30);
        layout.setCenterWidth((float)var16_16);
        layout.setLeftProgress((float)var22_22);
        return layout;
    }

    private static final WatermarkModule.WatermarkPart[] leftParts_delegate$lambda$0() {
        WatermarkModule.WatermarkPart[] watermarkPartArray = new WatermarkModule.WatermarkPart[5];
        watermarkPartArray[0] = new WatermarkModule.WatermarkPart(USER_ICON, \u0631\u064e.INSTANCE.getICON(), 0.0f, \u0637\u063a.INSTANCE.getTITLE_COLOR(), 0.0f, 0.0f);
        String string = \u0631\u063a.getRole();
        Intrinsics.checkNotNullExpressionValue(string, "getRole(...)");
        watermarkPartArray[1] = new WatermarkModule.WatermarkPart(string, \u0631\u064e.INSTANCE.getGS_MEDIUM(), 0.0f, \u0637\u063a.INSTANCE.getTITLE_COLOR(), 0.0f, 0.0f);
        watermarkPartArray[2] = new WatermarkModule.WatermarkPart(PING_ICON, \u0631\u064e.INSTANCE.getICON(), 0.0f, \u0637\u063a.INSTANCE.getTITLE_COLOR(), 0.0f, 0.0f);
        watermarkPartArray[3] = new WatermarkModule.WatermarkPart(cachedPingText, \u0631\u064e.INSTANCE.getGS_MEDIUM(), 0.0f, \u0637\u063a.INSTANCE.getTITLE_COLOR(), 0.0f, 0.0f);
        watermarkPartArray[4] = new WatermarkModule.WatermarkPart("ms", \u0631\u064e.INSTANCE.getGS_REGULAR(), 0.0f, \u0637\u063a.INSTANCE.getVALUE_COLOR(), 0.0f, 0.0f);
        return watermarkPartArray;
    }

    @NotNull
    public final WatermarkModule.Bounds currentBounds() {
        WatermarkModule.WatermarkLayout layout = this.buildLayout();
        currentBounds.setX(layout.getX());
        currentBounds.setY(layout.getY());
        currentBounds.setWidth(layout.getWidth());
        currentBounds.setHeight(layout.getHeight());
        return currentBounds;
    }

    @NotNull
    public final WatermarkModule.Bounds currentLogoBounds() {
        WatermarkModule.WatermarkLayout layout = this.buildLayout();
        currentLogoBounds.setX(layout.getCenterBackgroundX());
        currentLogoBounds.setY(layout.getY());
        currentLogoBounds.setWidth(layout.getCenterWidth());
        currentLogoBounds.setHeight(layout.getHeight());
        return currentLogoBounds;
    }

    private final float animatedTopY() {
        float baseY = \u0637\u063a.INSTANCE.scaled(5.0f);
        float targetY = this.desiredTopY();
        bossBarOffsetAnimation.run(targetY, 180L, Easing.SINE_OUT, true);
        bossBarOffsetAnimation.update();
        return Math.max(baseY, bossBarOffsetAnimation.get());
    }

    private final float bossBarBottom() {
        if (\u0635\u0650.INSTANCE.isEnabled() && ((Boolean)\u0635\u0650.INSTANCE.getNoBossBar().getValue()).booleanValue()) {
            return 0.0f;
        }
        BossBarHud bossBarHud = \u0636\u0643.getMc().inGameHud.getBossBarHud();
        BossBarHudAccessor bossBarHudAccessor = bossBarHud instanceof BossBarHudAccessor ? (BossBarHudAccessor)bossBarHud : null;
        Object object = bossBarHudAccessor;
        if (bossBarHudAccessor == null || (object = object.rain$getBossBars()) == null) {
            return 0.0f;
        }
        Object bossBars = object;
        if (bossBars.isEmpty()) {
            return 0.0f;
        }
        int visibleBars = this.visibleBossBarCount(bossBars.size());
        if (visibleBars <= 0) {
            return 0.0f;
        }
        return 12.0f + (float)(visibleBars + -1) * 19.0f + 10.0f;
    }

    /*
     * WARNING - void declaration
     */
    private final int visibleBossBarCount(int totalBossBars) {
        void var3_3;
        if (totalBossBars <= 0) {
            return 0;
        }
        int heightLimit = \u0636\u0643.getMc().getWindow().getScaledHeight() / 3;
        int nextBarY = 12;
        for (int visible = 0; visible < totalBossBars; ++visible) {
            if ((nextBarY += 19) < heightLimit) continue;
            break;
        }
        return (int)var3_3;
    }

    private final void drawDivider(float x, float y, float height, float alpha) {
        float dividerWidth = \u0637\u063a.INSTANCE.scaled(1.2f);
        float heightA = height / 3.5f;
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(this.withAlpha(dividerColor, alpha)).mix(0.9f).round(0.0f).draw(x, y + height / 2.0f - heightA / 2.0f, dividerWidth, heightA);
    }

    private static final WatermarkModule.WatermarkPart[] timeParts_delegate$lambda$0() {
        WatermarkModule.WatermarkPart[] watermarkPartArray = new WatermarkModule.WatermarkPart[2];
        watermarkPartArray[0] = INSTANCE.getRightParts()[3];
        watermarkPartArray[1] = INSTANCE.getRightParts()[4];
        return watermarkPartArray;
    }

    private static final WatermarkModule.WatermarkPart[] pingParts_delegate$lambda$0() {
        WatermarkModule.WatermarkPart[] watermarkPartArray = new WatermarkModule.WatermarkPart[3];
        watermarkPartArray[0] = INSTANCE.getLeftParts()[2];
        watermarkPartArray[1] = INSTANCE.getLeftParts()[3];
        watermarkPartArray[2] = INSTANCE.getLeftParts()[4];
        return watermarkPartArray;
    }

    private static final WatermarkModule.WatermarkPart[] fpsParts_delegate$lambda$0() {
        WatermarkModule.WatermarkPart[] watermarkPartArray = new WatermarkModule.WatermarkPart[3];
        watermarkPartArray[0] = INSTANCE.getRightParts()[0];
        watermarkPartArray[1] = INSTANCE.getRightParts()[1];
        watermarkPartArray[2] = INSTANCE.getRightParts()[2];
        return watermarkPartArray;
    }

    private static final WatermarkModule.WatermarkPart[] centerParts_delegate$lambda$0() {
        WatermarkModule.WatermarkPart[] watermarkPartArray = new WatermarkModule.WatermarkPart[1];
        watermarkPartArray[0] = new WatermarkModule.WatermarkPart(CLIENT_ICON, \u0631\u064e.INSTANCE.getICON(), 0.0f, \u0637\u063a.INSTANCE.getTITLE_COLOR(), 0.0f, 0.0f);
        return watermarkPartArray;
    }

    private final void refreshDynamicText() {
        long minute;
        int fps = RangesKt.coerceAtLeast(\u0636\u0643.getMc().getCurrentFps(), 0);
        if (fps != cachedFps) {
            cachedFps = fps;
            cachedFpsText = String.valueOf(fps);
            this.getRightParts()[1].setText(cachedFpsText);
        }
        int ping = this.getPing();
        if (ping != cachedPing) {
            cachedPing = ping;
            cachedPingText = ping >= 0 ? String.valueOf(ping) : "--";
            this.getLeftParts()[3].setText(cachedPingText);
        }
        if ((minute = System.currentTimeMillis() / 60000L) != cachedMinute) {
            cachedMinute = minute;
            String string = LocalTime.now().format(timeFormatter);
            Intrinsics.checkNotNullExpressionValue(string, "format(...)");
            cachedTimeText = string;
            this.getRightParts()[4].setText(cachedTimeText);
        }
    }
}

