/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 */
package oxxxde;

import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotakbaz.rain.client.draggable.animation.Easing;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.ui.menu.misc.TextScroller;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;
import oxxxde.\u0628\u062f;
import oxxxde.\u0635\u064f;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 J2\u00020\u0001:\u0002JKB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007JW\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\f\u00a2\u0006\u0004\b\u0017\u0010\u0018Jg\u0010 \u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b \u0010!J?\u0010$\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b$\u0010%J7\u0010'\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b'\u0010(J7\u0010,\u001a\u00020\f2\u0006\u0010)\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b,\u0010-J7\u00102\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b6\u00107R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u00107R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u00108\u001a\u0004\b<\u0010:\"\u0004\b=\u00107R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0005\u00108\u001a\u0004\b>\u0010:\"\u0004\b?\u00107R0\u0010B\u001a\u001e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020#0@j\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020#`A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bI\u00108\u00a8\u0006L"}, d2={"Loxxxde/\u0628\u0642;", "", "", "durationMs", "pauseMs", "fadeTransitionMs", "<init>", "(JJJ)V", "Loxxxde/\u062c\u064b;", "font", "", "text", "", "x", "y", "size", "Ljava/awt/Color;", "color", "width", "", "hovered", "uiScale", "", "draw", "(Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FZF)V", "drawX", "drawY", "clipX", "widthLimit", "bothSidesFade", "scrollFadeBlend", "safeScale", "drawSingle", "(Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFZFF)V", "nowMs", "Loxxxde/\u0638;", "getState", "(Ljava/lang/String;FFFFJ)Lkotakbaz/rain/ui/menu/misc/TextScroller$ScrollState;", "", "stateKey", "(Ljava/lang/String;FFFF)I", "state", "cycleDistance", "nowNs", "updateOffset", "(Lkotakbaz/rain/ui/menu/misc/TextScroller$ScrollState;ZFJF)F", "textWidth", "clipMinX", "clipMaxX", "padding", "intersects", "(FFFFF)Z", "toTransformedX", "(F)F", "cleanupStates", "(J)V", "J", "getDurationMs", "()J", "setDurationMs", "getPauseMs", "setPauseMs", "getFadeTransitionMs", "setFadeTransitionMs", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "states", "Ljava/util/HashMap;", "Lorg/joml/Vector3f;", "scratchPos", "Lorg/joml/Vector3f;", "paddingBetweenTexts", "F", "lastCleanupMs", "Companion", "ScrollState", "rain-visuals"})
public final class \u0628\u0642 {
    @NotNull
    private final Vector3f scratchPos;
    private long lastCleanupMs;
    private long fadeTransitionMs;
    private long durationMs;
    @Deprecated
    public static final long STATE_TTL_MS = 15000L;
    @Deprecated
    public static final float EPSILON = 0.001f;
    @Deprecated
    public static final long CLEANUP_INTERVAL_MS = 2000L;
    @Deprecated
    public static final long RETURN_ANIMATION_MS = 220L;
    @NotNull
    private final HashMap<Integer, TextScroller.ScrollState> states;
    @NotNull
    private static final \u0635\u064f Companion = new \u0635\u064f(null);
    private float paddingBetweenTexts;
    private long pauseMs;

    private final boolean intersects(float drawX, float textWidth, float clipMinX, float clipMaxX, float padding) {
        return drawX < clipMaxX + padding && drawX + textWidth > clipMinX - padding;
    }

    public /* synthetic */ \u0628\u0642(long l, long l2, long l3, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 1) != 0) {
            l = 3000L;
        }
        if ((n & 2) != 0) {
            l2 = 0L;
        }
        if ((n & 4) != 0) {
            l3 = 0L;
        }
        this(l, l2, l3);
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    /*
     * WARNING - void declaration
     */
    private final float updateOffset(TextScroller.ScrollState state, boolean hovered, float cycleDistance, long nowNs, float safeScale) {
        void var2_2;
        void var1_1;
        float f;
        long prevNs = state.getLastUpdateNs();
        state.setLastUpdateNs(nowNs);
        state.setWrappedThisFrame(false);
        if (cycleDistance <= 0.0f) {
            state.setOffset(0.0f);
            state.setHovered(hovered);
            return 0.0f;
        }
        float deltaSec = prevNs == 0L ? 0.0f : Math.max(0.0f, (float)(nowNs - prevNs) / 1.0E9f);
        float cycleDurationSec = RangesKt.coerceAtLeast((float)this.durationMs * safeScale, 1.0f) / 1000.0f;
        float scrollSpeed = cycleDurationSec <= 0.0f ? cycleDistance : cycleDistance / cycleDurationSec;
        if (hovered) {
            if (!state.getHovered()) {
                state.getReturnAnimation().snap(state.getOffset());
                if (this.pauseMs > 0L && state.getOffset() <= 0.001f) {
                    state.setPauseUntilNs(nowNs + this.pauseMs * 1000000L);
                }
            }
            if (nowNs >= state.getPauseUntilNs()) {
                state.setPauseUntilNs(0L);
                state.setOffset(state.getOffset() + scrollSpeed * deltaSec);
                while (state.getOffset() >= cycleDistance) {
                    state.setOffset(state.getOffset() - cycleDistance);
                    state.setWrappedThisFrame(true);
                    if (this.pauseMs <= 0L) continue;
                    state.setOffset(0.0f);
                    state.setPauseUntilNs(nowNs + this.pauseMs * 1000000L);
                    break;
                }
            }
        } else {
            if (state.getHovered()) {
                state.getReturnAnimation().snap(state.getOffset());
                state.getReturnAnimation().run(0.0, 220L, Easing.SINE_OUT);
            }
            state.getReturnAnimation().update();
            state.setOffset(state.getReturnAnimation().get());
            if (Math.abs(state.getOffset()) < 0.001f) {
                state.setOffset(0.0f);
            }
        }
        if (state.getOffset() <= 0.001f) {
            f = 0.0f;
        } else if (this.fadeTransitionMs <= 0L) {
            f = 1.0f;
        } else {
            void var13_11;
            void var12_10;
            float fadeDistance = RangesKt.coerceAtLeast(scrollSpeed * (float)this.fadeTransitionMs / 1000.0f, 0.001f);
            float fadeIn = state.getOffset() / fadeDistance;
            float f2 = RangesKt.coerceAtLeast(cycleDistance - state.getOffset(), 0.0f) / var12_10;
            f = RangesKt.coerceIn(Math.min((float)var13_11, f2), 0.0f, 1.0f);
        }
        state.setLeftFadeBlend(f);
        var1_1.setHovered((boolean)var2_2);
        return var1_1.getOffset();
    }

    public final long getPauseMs() {
        return this.pauseMs;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private final void drawSingle(Font font, String text, float drawX, float drawY, float size, Color color, float clipX, float widthLimit, boolean bothSidesFade, float scrollFadeBlend, float safeScale) {
        float fadeMax;
        float fadeMin = this.toTransformedX(clipX);
        if (fadeMin > (fadeMax = this.toTransformedX(clipX + widthLimit))) {
            float swap = fadeMin;
            fadeMin = fadeMax;
            fadeMax = swap;
        }
        float fadeRange = fadeMax - fadeMin;
        float minFadeWidth = 3.0f * safeScale;
        float maxFadeWidth = 10.0f * safeScale;
        float baseFadeWidth = Math.max(minFadeWidth, Math.min(fadeRange * 0.14f, maxFadeWidth));
        float leftFadeWidth = bothSidesFade ? baseFadeWidth * scrollFadeBlend : 0.0f;
        Font font2 = bothSidesFade ? font.setFade(fadeMin, fadeMax, leftFadeWidth, baseFadeWidth) : font.setFade(fadeMin, fadeMax, 0.0f, baseFadeWidth);
        try {
            Font.drawText$default(font, text, drawX, drawY, size, color, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
            font.resetFade();
        }
        catch (Throwable throwable) {
            void var1_1;
            var1_1.resetFade();
            throw throwable;
        }
    }

    private final int stateKey(String text, float clipX, float y, float width, float size) {
        int result = text.hashCode();
        result = 31 * result + Float.floatToIntBits(clipX);
        result = 31 * result + Float.floatToIntBits(y);
        result = 31 * result + Float.floatToIntBits(width);
        result = 31 * result + Float.floatToIntBits(size);
        return result;
    }

    /*
     * WARNING - void declaration
     */
    private final TextScroller.ScrollState getState(String text, float clipX, float y, float width, float size, long nowMs) {
        Object v;
        void $this$getOrPut$iv;
        int key = this.stateKey(text, clipX, y, width, size);
        Map map = this.states;
        Integer key$iv = key;
        boolean $i$f$getOrPut = false;
        Object value$iv = $this$getOrPut$iv.get(key$iv);
        if (value$iv == null) {
            void var14_13;
            boolean bl = false;
            TextScroller.ScrollState answer$iv = new TextScroller.ScrollState();
            $this$getOrPut$iv.put(key$iv, answer$iv);
            v = var14_13;
        } else {
            v = value$iv;
        }
        TextScroller.ScrollState state = (TextScroller.ScrollState)v;
        state.setLastSeenMs(nowMs);
        return state;
    }

    public static /* synthetic */ void draw$default(\u0628\u0642 \u0628\u06422, Font font, String string, float f, float f2, float f3, Color color, float f4, boolean bl, float f5, int n, Object object) {
        if ((n & 0x100) != 0) {
            f5 = 1.0f;
        }
        \u0628\u06422.draw(font, string, f, f2, f3, color, f4, bl, f5);
    }

    private final float toTransformedX(float x) {
        this.scratchPos.set(x, 0.0f, 0.0f);
        \u0628\u062f.INSTANCE.transformPosition(this.scratchPos);
        return this.scratchPos.x;
    }

    public final void setFadeTransitionMs(long l) {
        this.fadeTransitionMs = l;
    }

    public final void setDurationMs(long l) {
        this.durationMs = l;
    }

    public \u0628\u0642() {
        this(0L, 0L, 0L, 7, null);
    }

    public \u0628\u0642(long durationMs, long pauseMs, long fadeTransitionMs) {
        this.durationMs = durationMs;
        this.pauseMs = pauseMs;
        this.fadeTransitionMs = fadeTransitionMs;
        this.states = new HashMap();
        this.scratchPos = new Vector3f();
        this.paddingBetweenTexts = 12.0f;
    }

    public final long getFadeTransitionMs() {
        return this.fadeTransitionMs;
    }

    public final void setPauseMs(long l) {
        this.pauseMs = l;
    }

    private final void cleanupStates(long nowMs) {
        if (this.states.isEmpty()) {
            return;
        }
        if (nowMs - this.lastCleanupMs < 2000L) {
            return;
        }
        this.lastCleanupMs = nowMs;
        Iterator<Map.Entry<Integer, TextScroller.ScrollState>> iterator2 = this.states.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<Integer, TextScroller.ScrollState> entry;
            Intrinsics.checkNotNullExpressionValue(iterator2.next(), "next(...)");
            if (nowMs - entry.getValue().getLastSeenMs() <= 15000L) continue;
            iterator2.remove();
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void draw(@NotNull Font font, @NotNull String text, float x, float y, float size, @NotNull Color color, float width, boolean hovered, float uiScale) {
        void var14_13;
        float textWidth;
        block12: {
            block11: {
                block10: {
                    block9: {
                        Intrinsics.checkNotNullParameter(font, "font");
                        Intrinsics.checkNotNullParameter(text, "text");
                        Intrinsics.checkNotNullParameter(color, "color");
                        if (((CharSequence)text).length() == 0) break block9;
                        if (!(width <= 0.0f)) break block10;
                    }
                    return;
                }
                textWidth = Font.getWidth$default(font, text, size, 0.0f, 4, null);
                if (textWidth <= width) break block11;
                if (!(width <= 0.0f)) break block12;
            }
            font.resetFade();
            Font.drawText$default(font, text, x, y, size, color, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
            return;
        }
        float safeScale = RangesKt.coerceAtLeast(uiScale, 0.01f);
        long nowNs = System.nanoTime();
        long nowMs = nowNs / 1000000L;
        float cycleDistance = textWidth + Math.max(size, this.paddingBetweenTexts * safeScale);
        TextScroller.ScrollState state = this.getState(text, x, y, width, size, nowMs);
        float offset = this.updateOffset(state, hovered, cycleDistance, nowNs, safeScale);
        float scrollFadeBlend = state.getLeftFadeBlend();
        boolean applyBothSidesFade = scrollFadeBlend > 0.001f;
        float clipMinX = x;
        float clipMaxX = x + width;
        float visibilityPadding = Math.max(size, this.paddingBetweenTexts * safeScale);
        float firstX = x - offset;
        if (this.intersects(firstX, textWidth, clipMinX, clipMaxX, visibilityPadding)) {
            this.drawSingle(font, text, firstX, y, size, color, x, width, applyBothSidesFade, scrollFadeBlend, safeScale);
        }
        if (hovered) {
            float secondX;
            if (cycleDistance > 0.0f && this.intersects(secondX = firstX + cycleDistance, textWidth, clipMinX, clipMaxX, visibilityPadding)) {
                void var11_11;
                void var19_17;
                void var20_18;
                void var7_7;
                void var3_3;
                void var6_6;
                void var5_5;
                void var25_23;
                this.drawSingle(font, text, (float)var25_23, y, (float)var5_5, (Color)var6_6, (float)var3_3, (float)var7_7, (boolean)var20_18, (float)var19_17, (float)var11_11);
            }
        }
        this.cleanupStates((long)var14_13);
    }
}

