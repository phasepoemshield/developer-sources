/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.menu.misc;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.draggable.animation.AnimationUtil;
import kotakbaz.rain.client.draggable.animation.Easing;
import kotakbaz.rain.client.util.render.engine.controls.MatrixControl;
import kotakbaz.rain.client.util.render.font.E;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 C2\u00020\u0001:\u0002CDB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005JW\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\n\u00a2\u0006\u0004\b\u0015\u0010\u0016Jg\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ?\u0010\"\u001a\u00020!2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\"\u0010#J7\u0010%\u001a\u00020$2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b%\u0010&J7\u0010*\u001a\u00020\n2\u0006\u0010'\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b*\u0010+J7\u00100\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b4\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0003\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010\u0005R0\u0010;\u001a\u001e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020!09j\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020!`:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bB\u00105\u00a8\u0006E"}, d2={"Lkotakbaz/rain/ui/menu/misc/TextScroller;", "", "", "durationMs", "<init>", "(J)V", "Lkotakbaz/rain/client/util/render/font/Font;", "font", "", "text", "", "x", "y", "size", "Ljava/awt/Color;", "color", "width", "", "hovered", "uiScale", "", "draw", "(Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FZF)V", "drawX", "drawY", "clipX", "widthLimit", "bothSidesFade", "scrollFadeBlend", "safeScale", "drawSingle", "(Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFZFF)V", "nowMs", "Lkotakbaz/rain/ui/menu/misc/TextScroller$ScrollState;", "getState", "(Ljava/lang/String;FFFFJ)Lkotakbaz/rain/ui/menu/misc/TextScroller$ScrollState;", "", "stateKey", "(Ljava/lang/String;FFFF)I", "state", "cycleDistance", "nowNs", "updateOffset", "(Lkotakbaz/rain/ui/menu/misc/TextScroller$ScrollState;ZFJF)F", "textWidth", "clipMinX", "clipMaxX", "padding", "intersects", "(FFFFF)Z", "toTransformedX", "(F)F", "cleanupStates", "J", "getDurationMs", "()J", "setDurationMs", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "states", "Ljava/util/HashMap;", "Lorg/joml/Vector3f;", "scratchPos", "Lorg/joml/Vector3f;", "paddingBetweenTexts", "F", "lastCleanupMs", "Companion", "ScrollState", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nTextScroller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextScroller.kt\nkotakbaz/rain/ui/menu/misc/TextScroller\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,212:1\n383#2,7:213\n*S KotlinDebug\n*F\n+ 1 TextScroller.kt\nkotakbaz/rain/ui/menu/misc/TextScroller\n*L\n116#1:213,7\n*E\n"})
public final class TextScroller {
    @NotNull
    private static final Companion Companion;
    private long durationMs;
    @NotNull
    private final HashMap<Integer, ScrollState> states;
    @NotNull
    private final Vector3f scratchPos;
    private float paddingBetweenTexts;
    private long lastCleanupMs;
    @Deprecated
    public static final long STATE_TTL_MS = 15000L;
    @Deprecated
    public static final long CLEANUP_INTERVAL_MS = 2000L;
    @Deprecated
    public static final long RETURN_ANIMATION_MS = 220L;
    @Deprecated
    public static final float EPSILON = 0.001f;
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    public TextScroller(long durationMs) {
        this.durationMs = durationMs;
        this.states = new HashMap();
        this.scratchPos = new Vector3f();
        this.paddingBetweenTexts = 12.0f;
    }

    public /* synthetic */ TextScroller(long l2, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        int n3 = C[0];
        n3 -= C[1];
        if ((n2 & (n3 -= C[2])) != 0) {
            l2 = 3000L;
        }
        this(l2);
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public final void setDurationMs(long l2) {
        this.durationMs = l2;
    }

    public final void draw(@NotNull E font, @NotNull String text, float x2, float y, float size, @NotNull Color color, float width2, boolean hovered, float uiScale) {
        float f2;
        int n2;
        float f3;
        int n3;
        long l2 = -6493344775977618777L;
        long l3 = -4436562258220731468L;
        int n4 = C[3];
        n4 += C[4];
        Intrinsics.checkNotNullParameter(font, (String)a[n4 -= C[5]]);
        int n5 = C[6];
        n5 += C[7];
        Intrinsics.checkNotNullParameter(text, (String)a[n5 += C[8]]);
        int n6 = C[9];
        n6 ^= C[10];
        Intrinsics.checkNotNullParameter(color, (String)a[n6 ^= C[11]]);
        if (((CharSequence)text).length() == 0) {
            int n7 = C[12];
            n7 ^= C[13];
            n3 = n7 += C[14];
        } else {
            int n8 = C[15];
            n8 += C[16];
            n3 = n8 -= C[17];
        }
        if (n3 != 0 || width2 <= 0.0f) {
            return;
        }
        int n9 = C[18];
        n9 ^= C[19];
        float f4 = E.getWidth$default(font, text, size, 0.0f, n9 += C[20], null);
        if (f4 <= width2 || width2 <= 0.0f) {
            font.resetFade();
            int n10 = C[21];
            n10 ^= C[22];
            int n11 = C[24];
            n11 -= C[25];
            E.drawText$default(font, text, x2, y, size, color, 0.0f, 0.0f, 0.0f, n10 -= C[23], 0.0f, n11 += C[26], null);
            return;
        }
        float f5 = RangesKt.coerceAtLeast(uiScale, 0.01f);
        long l4 = System.nanoTime();
        long l5 = l4 / 1000000L;
        float f6 = f4 + Math.max(size, this.paddingBetweenTexts * f5);
        ScrollState scrollState = this.getState(text, x2, y, width2, size, l5);
        float f7 = this.updateOffset(scrollState, hovered, f6, l4, f5);
        float f8 = f3 = scrollState.getWrappedThisFrame() || f7 > 0.001f ? 1.0f : 0.0f;
        if (scrollState.getWrappedThisFrame() || f7 > 0.001f) {
            int n12 = C[27];
            n12 -= C[28];
            n2 = n12 ^= C[29];
        } else {
            int n13 = C[30];
            n13 += C[31];
            n2 = n13 -= C[32];
        }
        int n14 = C[33];
        n14 ^= C[34];
        long l6 = l3;
        int n15 = C[36];
        n15 -= C[37];
        l3 = l6 ^ ((long)n2 << (n14 -= C[35]) ^ l6) & -1L << (n15 += C[38]);
        float f9 = x2;
        float f10 = x2 + width2;
        float f11 = Math.max(size, this.paddingBetweenTexts * f5);
        float f12 = x2 - f7;
        if (this.intersects(f12, f4, f9, f10, f11)) {
            int n16 = C[39];
            n16 ^= C[40];
            this.drawSingle(font, text, f12, y, size, color, x2, width2, (boolean)(l3 >>> (n16 += C[41])), f3, f5);
        }
        if (hovered && f6 > 0.0f && this.intersects(f2 = f12 + f6, f4, f9, f10, f11)) {
            int n17 = C[42];
            n17 ^= C[43];
            this.drawSingle(font, text, f2, y, size, color, x2, width2, (boolean)(l3 >>> (n17 += C[44])), f3, f5);
        }
        this.cleanupStates(l5);
    }

    public static /* synthetic */ void draw$default(TextScroller textScroller, E e2, String string, float f2, float f3, float f4, Color color, float f5, boolean bl, float f6, int n2, Object object) {
        int n3 = C[45];
        n3 += C[46];
        if ((n2 & (n3 ^= C[47])) != 0) {
            f6 = 1.0f;
        }
        textScroller.draw(e2, string, f2, f3, f4, color, f5, bl, f6);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void drawSingle(E font, String text, float drawX, float drawY, float size, Color color, float clipX, float widthLimit, boolean bothSidesFade, float scrollFadeBlend, float safeScale) {
        float f2;
        float f3;
        float f4 = this.toTransformedX(clipX);
        if (f4 > (f3 = this.toTransformedX(clipX + widthLimit))) {
            f2 = f4;
            f4 = f3;
            f3 = f2;
        }
        f2 = f3 - f4;
        float f5 = 3.0f * safeScale;
        float f6 = 10.0f * safeScale;
        float f7 = Math.max(f5, Math.min(f2 * 0.14f, f6));
        float f8 = bothSidesFade ? f7 * scrollFadeBlend : 0.0f;
        E e2 = bothSidesFade ? font.setFade(f4, f3, f8, f7) : font.setFade(f4, f3, 0.0f, f7);
        try {
            int n2 = C[48];
            n2 += C[49];
            int n3 = C[51];
            n3 ^= C[52];
            E.drawText$default(font, text, drawX, drawY, size, color, 0.0f, 0.0f, 0.0f, n2 ^= C[50], 0.0f, n3 ^= C[53], null);
        }
        finally {
            font.resetFade();
        }
    }

    private final ScrollState getState(String text, float clipX, float y, float width2, float size, long nowMs) {
        Object object;
        long l2 = 374940279055424085L;
        long l3 = 2953607094832016675L;
        int n2 = C[54];
        n2 -= C[55];
        long l4 = l3;
        int n3 = C[57];
        n3 ^= C[58];
        l3 = l4 ^ ((long)this.stateKey(text, clipX, y, width2, size) << (n2 += C[56]) ^ l4) & -1L << (n3 -= C[59]);
        Map map = this.states;
        int n4 = C[60];
        n4 += C[61];
        Integer n5 = (int)(l3 >>> (n4 += C[62]));
        long l5 = l2;
        int n6 = C[63];
        n6 ^= C[64];
        l2 = l5 ^ (0L ^ l5) & -1L << (n6 -= C[65]);
        Object v = map.get(n5);
        if (v == null) {
            long l6 = l2;
            int n7 = C[66];
            n7 ^= C[67];
            l2 = l6 ^ (0L ^ l6) & -1L >>> (n7 -= C[68]);
            ScrollState scrollState = new ScrollState();
            map.put(n5, scrollState);
            object = scrollState;
        } else {
            object = v;
        }
        ScrollState scrollState = (ScrollState)object;
        scrollState.setLastSeenMs(nowMs);
        return scrollState;
    }

    private final int stateKey(String text, float clipX, float y, float width2, float size) {
        long l2 = 1115241203943904340L;
        long l3 = 6825860440493101928L;
        long l4 = 8222954310917458238L;
        long l5 = -6941840363011653229L;
        long l6 = 6787563500213169725L;
        int n2 = C[69];
        n2 -= C[70];
        long l7 = l6;
        int n3 = C[72];
        n3 -= C[73];
        l6 = l7 ^ ((long)text.hashCode() << (n2 ^= C[71]) ^ l7) & -1L << (n3 -= C[74]);
        int n4 = C[75];
        n4 -= C[76];
        n4 -= C[77];
        int n5 = C[78];
        n5 -= C[79];
        n5 -= C[80];
        int n6 = C[81];
        n6 -= C[82];
        long l8 = l6;
        int n7 = C[84];
        n7 ^= C[85];
        l6 = l8 ^ ((long)(n4 * (int)(l6 >>> n5) + Float.floatToIntBits(clipX)) << (n6 -= C[83]) ^ l8) & -1L << (n7 += C[86]);
        int n8 = C[87];
        n8 ^= C[88];
        n8 -= C[89];
        int n9 = C[90];
        n9 += C[91];
        n9 ^= C[92];
        int n10 = C[93];
        n10 += C[94];
        long l9 = l6;
        int n11 = C[96];
        n11 += C[97];
        l6 = l9 ^ ((long)(n8 * (int)(l6 >>> n9) + Float.floatToIntBits(y)) << (n10 ^= C[95]) ^ l9) & -1L << (n11 ^= C[98]);
        int n12 = C[99];
        n12 ^= C[100];
        n12 += C[101];
        int n13 = C[102];
        n13 ^= C[103];
        n13 += C[104];
        int n14 = C[105];
        n14 ^= C[106];
        long l10 = l6;
        int n15 = C[108];
        n15 -= C[109];
        l6 = l10 ^ ((long)(n12 * (int)(l6 >>> n13) + Float.floatToIntBits(width2)) << (n14 -= C[107]) ^ l10) & -1L << (n15 += C[110]);
        int n16 = C[111];
        n16 -= C[112];
        int n17 = C[113];
        n17 += C[114];
        n17 += C[115];
        int n18 = C[116];
        n18 ^= C[117];
        long l11 = l6;
        int n19 = C[119];
        n19 += C[120];
        l6 = l11 ^ ((long)(n16 * (int)(l6 >>> n17) + Float.floatToIntBits(size)) << (n18 ^= C[118]) ^ l11) & -1L << (n19 += C[121]);
        int n20 = C[122];
        n20 ^= C[123];
        return (int)(l6 >>> (n20 ^= C[124]));
    }

    private final float updateOffset(ScrollState state2, boolean hovered, float cycleDistance, long nowNs, float safeScale) {
        float f2;
        long l2 = state2.getLastUpdateNs();
        state2.setLastUpdateNs(nowNs);
        boolean bl = C[125];
        bl += C[126];
        state2.setWrappedThisFrame(bl -= C[127]);
        if (cycleDistance <= 0.0f) {
            state2.setOffset(0.0f);
            state2.setHovered(hovered);
            return 0.0f;
        }
        float f3 = l2 == 0L ? 0.0f : Math.max(0.0f, (float)(nowNs - l2) / 1.0E9f);
        float f4 = RangesKt.coerceAtLeast((float)this.durationMs * safeScale, 1.0f) / 1000.0f;
        float f5 = f2 = f4 <= 0.0f ? cycleDistance : cycleDistance / f4;
        if (hovered) {
            if (!state2.getHovered()) {
                state2.getReturnAnimation().snap(state2.getOffset());
            }
            state2.setOffset(state2.getOffset() + f2 * f3);
            while (state2.getOffset() >= cycleDistance) {
                state2.setOffset(state2.getOffset() - cycleDistance);
                boolean bl2 = C[128];
                bl2 -= C[129];
                state2.setWrappedThisFrame(bl2 += C[130]);
            }
        } else {
            if (state2.getHovered()) {
                state2.getReturnAnimation().snap(state2.getOffset());
                state2.getReturnAnimation().run(0.0, 220L, Easing.b);
            }
            state2.getReturnAnimation().update();
            state2.setOffset(state2.getReturnAnimation().get());
            if (Math.abs(state2.getOffset()) < 0.001f) {
                state2.setOffset(0.0f);
            }
        }
        state2.setHovered(hovered);
        return state2.getOffset();
    }

    private final boolean intersects(float drawX, float textWidth, float clipMinX, float clipMaxX, float padding) {
        int n2;
        if (drawX < clipMaxX + padding && drawX + textWidth > clipMinX - padding) {
            int n3 = C[131];
            n3 ^= C[132];
            n2 = n3 ^= C[133];
        } else {
            int n4 = C[134];
            n4 += C[135];
            n2 = n4 -= C[136];
        }
        return n2 != 0;
    }

    private final float toTransformedX(float x2) {
        this.scratchPos.set(x2, 0.0f, 0.0f);
        MatrixControl.b.transformPosition(this.scratchPos);
        return this.scratchPos.x;
    }

    private final void cleanupStates(long nowMs) {
        if (this.states.isEmpty()) {
            return;
        }
        if (nowMs - this.lastCleanupMs < 2000L) {
            return;
        }
        this.lastCleanupMs = nowMs;
        Iterator<Map.Entry<Integer, ScrollState>> iterator2 = this.states.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<Integer, ScrollState> entry;
            int n2 = C[137];
            n2 ^= C[138];
            Intrinsics.checkNotNullExpressionValue(iterator2.next(), (String)a[n2 += C[139]]);
            if (nowMs - entry.getValue().getLastSeenMs() <= 15000L) continue;
            iterator2.remove();
        }
    }

    public TextScroller() {
        int n2 = C[140];
        n2 -= C[141];
        this(0L, n2 += C[142], null);
    }

    static {
        TextScroller.b();
        long l2 = 5857864278443490201L;
        long l3 = -8874379709705702651L;
        long l4 = 2982835386173689703L;
        long l5 = -8506562358094914811L;
        long l6 = 4461328887697732410L;
        long l7 = 1116217131617121752L;
        long l8 = 7313171562338219309L;
        long l9 = 5840094159110761217L;
        long l10 = -7116984927820623853L;
        long l11 = 4654010405011246295L;
        long l12 = -188391387769390713L;
        long l13 = -5495027187552147778L;
        long l14 = 4450104088816303424L;
        long l15 = -5220560484660512105L;
        int n2 = C[143];
        n2 += C[144];
        a = new Object[n2 -= C[145]];
        long l16 = l15;
        int n3 = C[146];
        n3 ^= C[147];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= C[148]);
        Object[] objectArray = new Object[C[149]];
        objectArray[TextScroller.C[150]] = A;
        objectArray[TextScroller.C[151]] = C[152];
        int n4 = C[153];
        Object object = TextScroller.A()[C[154]];
        if (object == null) {
            char[] cArray = "\u63ed\u63e7\u63ea\u62a7\u63f5\u63ed\u63e9\u7ddd\u7c05\u7ddd\u7c12\u7c12\u7c08\u7c01\u7f42\u63f1\u7c01\u63f2\u63e9\u7f3d\u62c0\u7c20\u7c0a\u63eb\u62b6\u7c0d\u62ab\u62a8\u63ec\u62a4\u7f3d\u62a7\u62ab\u7c0a\u7c00\u7c20\u63f1\u63eb\u63f0\u7c10\u63f3\u63e5\u63f1\u7c0b\u62ac\u63eb\u7c0b\u63f5\u7c00\u63fe\u62ab\u7c10\u7c00\u7c0a\u7c13\u7c02\u62a8\u63f1\u7c23\u62ac\u7c03\u7c07\u63f6\u63f5".toCharArray();
            for (int i2 = C[155]; i2 < C[156]; ++i2) {
                int n5 = cArray[i2];
                n5 ^= C[157];
                n5 ^= C[158];
                n5 -= C[159];
                n5 ^= C[160];
                n5 -= C[161];
                n5 += C[162];
                n5 ^= C[163];
                n5 -= C[164];
                n5 -= C[165];
                n5 -= C[166];
                n5 += C[167];
                n5 ^= C[168];
                n5 ^= C[169];
                n5 += C[170];
                cArray[i2] = (char)(n5 += C[171]);
            }
            object = TextScroller.A()[TextScroller.C[172]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)TextScroller.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = C[173];
        n6 -= C[174];
        l6 = l17 ^ (0x1E00000000L ^ l17) & -1L << (n6 += C[175]);
        long l18 = l13;
        int n7 = C[176];
        n7 += C[177];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += C[178]);
        while (true) {
            int n8 = C[179];
            n8 ^= C[180];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= C[181]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = C[182];
            n10 ^= C[183];
            int n11 = C[185];
            n11 ^= C[186];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= C[184])) & -1L >>> (n11 ^= C[187]);
            long l20 = l9;
            int n12 = C[188];
            n12 ^= C[189];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= C[190]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = C[191];
            n14 ^= C[192];
            int n15 = C[194];
            n15 += C[195];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= C[193])) & -1L >>> (n15 ^= C[196]);
            int n16 = C[197];
            n16 ^= C[198];
            long l22 = l10;
            int n17 = C[200];
            n17 ^= C[201];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += C[199]) ^ l22) & -1L << (n17 -= C[202]);
            int n18 = C[203];
            n18 += C[204];
            n18 += C[205];
            int n19 = C[206];
            n19 += C[207];
            long l23 = l12;
            int n20 = C[209];
            n20 += C[210];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= C[208]))) ^ l23) & -1L >>> (n20 ^= C[211]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = C[212];
            n21 -= C[213];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= C[214]);
            while (true) {
                int n22 = C[215];
                n22 -= C[216];
                if ((int)(l14 >>> (n22 ^= C[217])) >= (int)l12) break;
                int n23 = C[218];
                n23 ^= C[219];
                int n24 = C[221];
                n24 -= C[222];
                cArray2[(int)(l14 >>> (n23 -= TextScroller.C[220]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= C[223]))];
                l14 += 0x100000000L;
            }
            int n25 = C[224];
            n25 ^= C[225];
            int n26 = (int)(l15 >>> (n25 += C[226]));
            l15 += 0x100000000L;
            TextScroller.a[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = C[227];
            n27 += C[228];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= C[229]);
        }
        Companion = new Companion(null);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[C[230]];
        String string = (String)object[C[231]];
        object = object[C[232]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[233]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[234]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[236] ^ C[237]];
                byArray[TextScroller.C[238] ^ TextScroller.C[239]] = C[240] ^ C[241];
                byArray[TextScroller.C[242] ^ TextScroller.C[243]] = C[244] ^ C[245];
                byArray[TextScroller.C[246] ^ TextScroller.C[247]] = C[248] ^ C[249];
                byArray[TextScroller.C[250] ^ TextScroller.C[251]] = C[252] ^ C[253];
                byArray[TextScroller.C[254] ^ TextScroller.C[255]] = C[256] ^ C[257];
                byArray[TextScroller.C[258] ^ TextScroller.C[259]] = C[260] ^ C[261];
                byArray[TextScroller.C[262] ^ TextScroller.C[263]] = C[264] ^ C[265];
                byArray[TextScroller.C[266] ^ TextScroller.C[267]] = C[268] ^ C[269];
                byArray[TextScroller.C[270] ^ TextScroller.C[271]] = C[272] ^ C[273];
                byArray[TextScroller.C[274] ^ TextScroller.C[275]] = C[276] ^ C[277];
                byArray[TextScroller.C[278] ^ TextScroller.C[279]] = C[280] ^ C[281];
                byArray[TextScroller.C[282] ^ TextScroller.C[283]] = C[284] ^ C[285];
                byArray[TextScroller.C[286] ^ TextScroller.C[287]] = C[288] ^ C[289];
                byArray[TextScroller.C[290] ^ TextScroller.C[291]] = C[292] ^ C[293];
                byArray[TextScroller.C[294] ^ TextScroller.C[295]] = C[296] ^ C[297];
                byArray[TextScroller.C[298] ^ TextScroller.C[299]] = C[300] ^ C[301];
                objectArray2[TextScroller.C[235]] = byArray;
            }
            byte[] byArray = (byte[])object3[C[302]];
            if (b == null) {
                byte[] byArray2 = new byte[C[303] ^ C[304]];
                byArray2[TextScroller.C[305] ^ TextScroller.C[306]] = C[307] ^ C[308];
                byArray2[TextScroller.C[309] ^ TextScroller.C[310]] = C[311] ^ C[312];
                byArray2[TextScroller.C[313] ^ TextScroller.C[314]] = C[315] ^ C[316];
                byArray2[TextScroller.C[317] ^ TextScroller.C[318]] = C[319] ^ C[320];
                byArray2[TextScroller.C[321] ^ TextScroller.C[322]] = C[323] ^ C[324];
                byArray2[TextScroller.C[325] ^ TextScroller.C[326]] = C[327] ^ C[328];
                byArray2[TextScroller.C[329] ^ TextScroller.C[330]] = C[331] ^ C[332];
                byArray2[TextScroller.C[333] ^ TextScroller.C[334]] = C[335] ^ C[336];
                byArray2[TextScroller.C[337] ^ TextScroller.C[338]] = C[339] ^ C[340];
                byArray2[TextScroller.C[341] ^ TextScroller.C[342]] = C[343] ^ C[344];
                byArray2[TextScroller.C[345] ^ TextScroller.C[346]] = C[347] ^ C[348];
                byArray2[TextScroller.C[349] ^ TextScroller.C[350]] = C[351] ^ C[352];
                byArray2[TextScroller.C[353] ^ TextScroller.C[354]] = C[355] ^ C[356];
                byArray2[TextScroller.C[357] ^ TextScroller.C[358]] = C[359] ^ C[360];
                byArray2[TextScroller.C[361] ^ TextScroller.C[362]] = C[363] ^ C[364];
                byArray2[TextScroller.C[365] ^ TextScroller.C[366]] = C[367] ^ C[368];
                byArray2[TextScroller.C[369] ^ TextScroller.C[370]] = C[371] ^ C[372];
                byArray2[TextScroller.C[373] ^ TextScroller.C[374]] = C[375] ^ C[376];
                byArray2[TextScroller.C[377] ^ TextScroller.C[378]] = C[379] ^ C[380];
                byArray2[TextScroller.C[381] ^ TextScroller.C[382]] = C[383] ^ C[384];
                byArray2[TextScroller.C[385] ^ TextScroller.C[386]] = C[387] ^ C[388];
                byArray2[TextScroller.C[389] ^ TextScroller.C[390]] = C[391] ^ C[392];
                byArray2[TextScroller.C[393] ^ TextScroller.C[394]] = C[395] ^ C[396];
                byArray2[TextScroller.C[397] ^ TextScroller.C[398]] = C[399] ^ 0xD0C3;
                byArray2[0x3ABB ^ 0x3AB2] = 0xFFFFC55E ^ 0x3AB2;
                byArray2[0x237B ^ 0x237D] = 0xFFFFDC89 ^ 0x237D;
                byArray2[0x533B ^ 0x5321] = 0x5344 ^ 0x5321;
                byArray2[0x69C8 ^ 0x69D1] = 0xFFFF9677 ^ 0x69D1;
                byArray2[0x6050 ^ 0x6053] = 0xFFFF9FB8 ^ 0x6053;
                byArray2[0x2EC5 ^ 0x2ECB] = 0x2E80 ^ 0x2ECB;
                byArray2[0xFC23 ^ 0xFC32] = 0xFC34 ^ 0xFC32;
                byArray2[0x5505 ^ 0x5519] = 0xFFFFAAA0 ^ 0x5519;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = TextScroller.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u9530\u95fe\u9515\u95e4\u95e2\u952e\u9531\u90b7\u90d4\u90b8\u9518\u90bb\u909f\u909d\u94cd\u9518\u95ff\u952f".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= 0xFC30;
                        n3 += 41731;
                        n3 ^= 0x7255;
                        n3 += 9558;
                        n3 ^= 0x4767;
                        n3 += 11896;
                        n3 += 18296;
                        n3 ^= 0x5EC9;
                        n3 += 60490;
                        n3 -= 44411;
                        n3 += 57020;
                        cArray[i2] = (char)(n3 -= 8621);
                    }
                    object4 = TextScroller.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[7] = 41;
                byArray4[15] = -21;
                byArray4[3] = -45;
                byArray4[8] = 53;
                byArray4[14] = -55;
                byArray4[6] = -125;
                byArray4[0] = -42;
                byArray4[13] = -110;
                byArray4[9] = 117;
                byArray4[11] = 25;
                byArray4[2] = 32;
                byArray4[1] = -127;
                byArray4[12] = 51;
                byArray4[4] = -88;
                byArray4[5] = 60;
                byArray4[10] = 91;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 10, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = TextScroller.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u5b3a\u5b56\u5b64".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 26336;
                        n4 += 27538;
                        n4 += 39651;
                        n4 -= 56500;
                        n4 += 57862;
                        n4 += 32970;
                        n4 += 55036;
                        n4 += 29100;
                        n4 ^= 0x293C;
                        n4 ^= 0x557E;
                        n4 ^= 0x4A0E;
                        cArray[i3] = (char)(n4 -= 65438);
                    }
                    object5 = TextScroller.A()[2] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = TextScroller.A()[3];
            if (object6 == null) {
                char[] cArray = "\u328b\u3287\u3251\u3615\u3281\u3256\u3281\u3615\u3258\u3279\u3281\u3251\u3277\u3258\u326b\u3264\u3264\u3263\u325a\u327d".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 58960;
                    n5 ^= 0x8232;
                    n5 += 45443;
                    n5 += 31859;
                    n5 -= 52597;
                    n5 ^= 0xA815;
                    n5 += 6151;
                    n5 ^= 0xA607;
                    n5 -= 24312;
                    n5 += 9528;
                    n5 += 23661;
                    cArray[i4] = (char)(n5 ^= 0x5B0F);
                }
                object6 = TextScroller.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)b), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = c;
        if (c == null) {
            c = new Object[4];
            objectArray = c;
        }
        return objectArray;
    }

    public static void b() {
        C = new int[0x741B ^ 0x758B];
        TextScroller.C[0xC165 ^ 0xC1FF] = 0xC1FF ^ 0xC1FF;
        TextScroller.C[0x2E5C ^ 0x2FDD] = 0xE9A2 ^ 0x2FDD;
        TextScroller.C[0xC286 ^ 0xC2C5] = 0xC297 ^ 0xC2C5;
        TextScroller.C[0x8315 ^ 0x835F] = 0x8340 ^ 0x835F;
        TextScroller.C[0x7696 ^ 0x778C] = 0xC7CB ^ 0x778C;
        TextScroller.C[0xC9E5 ^ 0xC9F7] = 0xC9FC ^ 0xC9F7;
        TextScroller.C[0xC651 ^ 0xC6B1] = 0xFFFF3963 ^ 0xC6B1;
        TextScroller.C[0xFEAC ^ 0xFEC8] = 0xFFFF0174 ^ 0xFEC8;
        TextScroller.C[0xA3B1 ^ 0xA3F0] = 0xFFFF5C40 ^ 0xA3F0;
        TextScroller.C[0x87A7 ^ 0x86C3] = 0xEAB ^ 0x86C3;
        TextScroller.C[0x4747 ^ 0x4733] = 0x4711 ^ 0x4733;
        TextScroller.C[0x48D ^ 0x5AC] = 0x1035F ^ 0x5AC;
        TextScroller.C[0x8AC0 ^ 0x8B83] = 0xFFFF9E11 ^ 0x8B83;
        TextScroller.C[0x3711 ^ 0x3754] = 0x377A ^ 0x3754;
        TextScroller.C[0x10E8B ^ 0x10E74] = 0x11DC7 ^ 0x10E74;
        TextScroller.C[0xCB65 ^ 0xCBC3] = 0x9AD5 ^ 0xCBC3;
        TextScroller.C[0x5123 ^ 0x5127] = 0xFFFFAEED ^ 0x5127;
        TextScroller.C[0x4A0D ^ 0x4AC9] = 0xFFFFB529 ^ 0x4AC9;
        TextScroller.C[0x1F6D ^ 0x1F46] = 0x1F2B ^ 0x1F46;
        TextScroller.C[0x9AC ^ 0x9D4] = 0x9D0 ^ 0x9D4;
        TextScroller.C[0xD83A ^ 0xD866] = 0xD87D ^ 0xD866;
        TextScroller.C[0xCF57 ^ 0xCF41] = 0xFFFF30B8 ^ 0xCF41;
        TextScroller.C[0x6B60 ^ 0x6A6E] = 0xF8F9 ^ 0x6A6E;
        TextScroller.C[0x4C6 ^ 0x596] = 0xBE55 ^ 0x596;
        TextScroller.C[0xED4B ^ 0xEDB1] = 0xC801 ^ 0xEDB1;
        TextScroller.C[0xE4E1 ^ 0xE451] = 0xFFFF1BF1 ^ 0xE451;
        TextScroller.C[0x426D ^ 0x4338] = 0xEE4F ^ 0x4338;
        TextScroller.C[0xC02E ^ 0xC10B] = 0x7053 ^ 0xC10B;
        TextScroller.C[0xD430 ^ 0xD537] = 0xB017 ^ 0xD537;
        TextScroller.C[0x67B9 ^ 0x6769] = 0xFFFF98A0 ^ 0x6769;
        TextScroller.C[0x3554 ^ 0x344B] = 0x132B8 ^ 0x344B;
        TextScroller.C[0x1C58 ^ 0x1CDD] = 0x1CE0 ^ 0x1CDD;
        TextScroller.C[0x730B ^ 0x73ED] = 0x73EC ^ 0x73ED;
        TextScroller.C[0xFA5 ^ 0xF97] = 0xFFFFF075 ^ 0xF97;
        TextScroller.C[0xBD95 ^ 0xBD5C] = 0xFFFF42A1 ^ 0xBD5C;
        TextScroller.C[0x2B49 ^ 0x2B05] = 0x2B3C ^ 0x2B05;
        TextScroller.C[0x34E7 ^ 0x34C2] = 0x34C0 ^ 0x34C2;
        TextScroller.C[0x51E ^ 0x445] = 0xB34C ^ 0x445;
        TextScroller.C[0x1445 ^ 0x1544] = 0x6F7 ^ 0x1544;
        TextScroller.C[0x116 ^ 0x2C] = 0x5BC ^ 0x2C;
        TextScroller.C[0xC66B ^ 0xC6D0] = 0xFFFF3961 ^ 0xC6D0;
        TextScroller.C[0xC59A ^ 0xC516] = 0xFFFF3AAF ^ 0xC516;
        TextScroller.C[0x6E89 ^ 0x6F9F] = 0x348E ^ 0x6F9F;
        TextScroller.C[0x348F ^ 0x35C4] = 0x8F0C ^ 0x35C4;
        TextScroller.C[0x10A1 ^ 0x105C] = 0x35E2 ^ 0x105C;
        TextScroller.C[0x5D0B ^ 0x5D33] = 0xFFFFA2E6 ^ 0x5D33;
        TextScroller.C[0x1B4A ^ 0x1A4F] = 0xB71A ^ 0x1A4F;
        TextScroller.C[0xFFD4 ^ 0xFF26] = 0x6E9E ^ 0xFF26;
        TextScroller.C[0xC98B ^ 0xC8AC] = 0x4FB7 ^ 0xC8AC;
        TextScroller.C[0xA816 ^ 0xA840] = 0xA879 ^ 0xA840;
        TextScroller.C[0x8A44 ^ 0x8AF0] = 0xFFFF757D ^ 0x8AF0;
        TextScroller.C[0x23C ^ 0x2DE] = 0xFFFFFD6A ^ 0x2DE;
        TextScroller.C[0x543F ^ 0x549D] = 0xAB15 ^ 0x549D;
        TextScroller.C[0xF9AE ^ 0xF992] = 0xFFFF06C0 ^ 0xF992;
        TextScroller.C[0x8168 ^ 0x81EE] = 0x81BA ^ 0x81EE;
        TextScroller.C[0x7121 ^ 0x7066] = 0xE85B ^ 0x7066;
        TextScroller.C[0xC7E7 ^ 0xC6F5] = 0x9B94 ^ 0xC6F5;
        TextScroller.C[0x696F ^ 0x69C2] = 0xFFFF963C ^ 0x69C2;
        TextScroller.C[0xD7F1 ^ 0xD746] = 0xD771 ^ 0xD746;
        TextScroller.C[0x3EE ^ 0x3DB] = 0xFFFFFC4D ^ 0x3DB;
        TextScroller.C[0x216A ^ 0x2145] = 0x2143 ^ 0x2145;
        TextScroller.C[0xE997 ^ 0xE8A6] = 0x5BFF ^ 0xE8A6;
        TextScroller.C[0xB1CD ^ 0xB1C2] = 0xFFFF4E0D ^ 0xB1C2;
        TextScroller.C[0xE548 ^ 0xE53A] = 0xE52C ^ 0xE53A;
        TextScroller.C[0xF994 ^ 0xF956] = 0xF946 ^ 0xF956;
        TextScroller.C[0x7BD4 ^ 0x7B7A] = 0x7B48 ^ 0x7B7A;
        TextScroller.C[0x79FE ^ 0x78F4] = 0x52E4 ^ 0x78F4;
        TextScroller.C[0x3B99 ^ 0x3AA9] = 0x4A72 ^ 0x3AA9;
        TextScroller.C[0xA211 ^ 0xA287] = 0xA287 ^ 0xA287;
        TextScroller.C[0x10697 ^ 0x10787] = 0x1952A ^ 0x10787;
        TextScroller.C[0x5B88 ^ 0x5AF3] = 0xA65D ^ 0x5AF3;
        TextScroller.C[0xCC45 ^ 0xCCB2] = 0x8531 ^ 0xCCB2;
        TextScroller.C[0xDC80 ^ 0xDC41] = 0xFFFF23F5 ^ 0xDC41;
        TextScroller.C[0xF9FB ^ 0xF98E] = 0xF98F ^ 0xF98E;
        TextScroller.C[0x4743 ^ 0x47FA] = 0x47CF ^ 0x47FA;
        TextScroller.C[0x10D98 ^ 0x10D66] = 0x11ED6 ^ 0x10D66;
        TextScroller.C[0xAEAC ^ 0xAEB3] = 0xFFFF516E ^ 0xAEB3;
        TextScroller.C[0x697C ^ 0x6948] = 0x692F ^ 0x6948;
        TextScroller.C[0xE101 ^ 0xE176] = 0xFFFF1EA5 ^ 0xE176;
        TextScroller.C[0xCCF0 ^ 0xCDD0] = 0xFFFE349B ^ 0xCDD0;
        TextScroller.C[0x507 ^ 0x564] = 0x501 ^ 0x564;
        TextScroller.C[0x4F8 ^ 0x401] = 0x4D82 ^ 0x401;
        TextScroller.C[0x7607 ^ 0x7645] = 0xFFFF89AC ^ 0x7645;
        TextScroller.C[0xBCC0 ^ 0xBD8E] = 0x64D ^ 0xBD8E;
        TextScroller.C[0x4D25 ^ 0x4D8E] = 0x5DB3 ^ 0x4D8E;
        TextScroller.C[0xF4DC ^ 0xF5E8] = 0x46A9 ^ 0xF5E8;
        TextScroller.C[0x53CE ^ 0x5292] = 0xE5C5 ^ 0x5292;
        TextScroller.C[0x3B74 ^ 0x3B16] = 0x3B1F ^ 0x3B16;
        TextScroller.C[0xF62 ^ 0xFDC] = 0xFE3 ^ 0xFDC;
        TextScroller.C[0xD554 ^ 0xD524] = 0xFFFF2AC8 ^ 0xD524;
        TextScroller.C[0x2724 ^ 0x27CD] = 0x27CC ^ 0x27CD;
        TextScroller.C[0x1754 ^ 0x16DB] = 0xFFFF39B6 ^ 0x16DB;
        TextScroller.C[0x10805 ^ 0x10979] = 0x1F5E5 ^ 0x10979;
        TextScroller.C[0xD71B ^ 0xD7E0] = 0xF25E ^ 0xD7E0;
        TextScroller.C[0xB563 ^ 0xB544] = 0xFFFF4AB8 ^ 0xB544;
        TextScroller.C[0x16A9 ^ 0x1690] = 0xFFFFE931 ^ 0x1690;
        TextScroller.C[0x8773 ^ 0x8709] = 0xFFFF78D5 ^ 0x8709;
        TextScroller.C[0xB7C7 ^ 0xB76B] = 0xB76B ^ 0xB76B;
        TextScroller.C[0xDEEA ^ 0xDE0B] = 0xFFFF21B5 ^ 0xDE0B;
        TextScroller.C[0x37C6 ^ 0x378D] = 0xFFFFC875 ^ 0x378D;
        TextScroller.C[0xFBE3 ^ 0xFB29] = 0xFFFF048A ^ 0xFB29;
        TextScroller.C[0x3E20 ^ 0x3F40] = 0x211A ^ 0x3F40;
        TextScroller.C[0xBC63 ^ 0xBCA6] = 0xFFFF436B ^ 0xBCA6;
        TextScroller.C[0x600A ^ 0x6087] = 0xFFFF9F61 ^ 0x6087;
        TextScroller.C[0xC36F ^ 0xC334] = 0xFFFF3CC8 ^ 0xC334;
        TextScroller.C[0x9A24 ^ 0x9B13] = 0xFFFFDFDA ^ 0x9B13;
        TextScroller.C[0xDE2B ^ 0xDE14] = 0xDE4D ^ 0xDE14;
        TextScroller.C[0x1EEB ^ 0x1EE8] = 0x1E9A ^ 0x1EE8;
        TextScroller.C[0xEA51 ^ 0xEAB4] = 0xEA9C ^ 0xEAB4;
        TextScroller.C[0x533F ^ 0x5383] = 0x539A ^ 0x5383;
        TextScroller.C[0x99E ^ 0x9A0] = 0x9F7 ^ 0x9A0;
        TextScroller.C[0xBFB2 ^ 0xBE35] = 0xD5D9 ^ 0xBE35;
        TextScroller.C[0xECCA ^ 0xEC45] = 0xEC61 ^ 0xEC45;
        TextScroller.C[0x9FFD ^ 0x9ED5] = 0xFFFFE676 ^ 0x9ED5;
        TextScroller.C[0xE01B ^ 0xE152] = 0x5BDE ^ 0xE152;
        TextScroller.C[0x924 ^ 0x915] = 0x963 ^ 0x915;
        TextScroller.C[0x562A ^ 0x5659] = 0x563E ^ 0x5659;
        TextScroller.C[0x968D ^ 0x97F3] = 0x23D5 ^ 0x97F3;
        TextScroller.C[0x57DF ^ 0x5748] = 0x5749 ^ 0x5748;
        TextScroller.C[0x6F09 ^ 0x6F5E] = 0xFFFF9083 ^ 0x6F5E;
        TextScroller.C[0x14B5 ^ 0x153F] = 0x3C23 ^ 0x153F;
        TextScroller.C[0x3FAB ^ 0x3FE5] = 0x3FEA ^ 0x3FE5;
        TextScroller.C[0x1367 ^ 0x1311] = 0x1312 ^ 0x1311;
        TextScroller.C[0xA616 ^ 0xA778] = 0x6787 ^ 0xA778;
        TextScroller.C[0x47A1 ^ 0x4730] = 0xFFFFB8D1 ^ 0x4730;
        TextScroller.C[0x1EE8 ^ 0x1EF2] = 0xFFFFE11C ^ 0x1EF2;
        TextScroller.C[0xCEC6 ^ 0xCE44] = 0xCE2C ^ 0xCE44;
        TextScroller.C[0xBF59 ^ 0xBF80] = 0xBF8F ^ 0xBF80;
        TextScroller.C[0xBC3 ^ 0xBF8] = 0xFFFFF42F ^ 0xBF8;
        TextScroller.C[0x8794 ^ 0x8616] = 0x406D ^ 0x8616;
        TextScroller.C[0x9F87 ^ 0x9F0E] = 0x9F08 ^ 0x9F0E;
        TextScroller.C[0x97BD ^ 0x9729] = 0xFFFF68A1 ^ 0x9729;
        TextScroller.C[0x1444 ^ 0x141E] = 0x1421 ^ 0x141E;
        TextScroller.C[0xCE2C ^ 0xCE7E] = 0xCE31 ^ 0xCE7E;
        TextScroller.C[0x7450 ^ 0x743A] = 0xFFFF8B95 ^ 0x743A;
        TextScroller.C[0x40A5 ^ 0x41D3] = 0xBEC1 ^ 0x41D3;
        TextScroller.C[0xF8D3 ^ 0xF85D] = 0xF873 ^ 0xF85D;
        TextScroller.C[0x7EDF ^ 0x7E80] = 0xFFFF8120 ^ 0x7E80;
        TextScroller.C[0x9CB7 ^ 0x9C70] = 0x9C7D ^ 0x9C70;
        TextScroller.C[0x3A3F ^ 0x3A22] = 0x3A6A ^ 0x3A22;
        TextScroller.C[0x36B3 ^ 0x37AE] = 0x87EC ^ 0x37AE;
        TextScroller.C[0xF68B ^ 0xF6CC] = 0xFFFF0917 ^ 0xF6CC;
        TextScroller.C[0x9A0A ^ 0x9AF6] = 0xFFFF40AB ^ 0x9AF6;
        TextScroller.C[0x522D ^ 0x52C9] = 0x52DB ^ 0x52C9;
        TextScroller.C[0xDE1C ^ 0xDE9B] = 0xFFFF217C ^ 0xDE9B;
        TextScroller.C[0xE97B ^ 0xE87D] = 0x8D51 ^ 0xE87D;
        TextScroller.C[0x1268 ^ 0x1367] = 0x81FF ^ 0x1367;
        TextScroller.C[0xEE68 ^ 0xEEBC] = 0xEEE9 ^ 0xEEBC;
        TextScroller.C[0x9F9A ^ 0x9EBE] = 0xFFFFD04F ^ 0x9EBE;
        TextScroller.C[0xE159 ^ 0xE014] = 0x5BD2 ^ 0xE014;
        TextScroller.C[0x33FC ^ 0x334A] = 0xFFFFCCAE ^ 0x334A;
        TextScroller.C[0x8004 ^ 0x800D] = 0x8059 ^ 0x800D;
        TextScroller.C[0x843D ^ 0x8508] = 0x3E79 ^ 0x8508;
        TextScroller.C[0xC954 ^ 0xC93F] = 0xFFFF368F ^ 0xC93F;
        TextScroller.C[0xE239 ^ 0xE31F] = 0x6409 ^ 0xE31F;
        TextScroller.C[0x8373 ^ 0x831B] = 0x836C ^ 0x831B;
        TextScroller.C[0x109DE ^ 0x10908] = 0x1097B ^ 0x10908;
        TextScroller.C[0xEE68 ^ 0xEE05] = 0xEE27 ^ 0xEE05;
        TextScroller.C[0xFFF4 ^ 0xFFA1] = 0xFFFF0037 ^ 0xFFA1;
        TextScroller.C[0x10147 ^ 0x10174] = 0xFFFEFD65 ^ 0x10174;
        TextScroller.C[0x10919 ^ 0x1080C] = 0x1556B ^ 0x1080C;
        TextScroller.C[0x9C49 ^ 0x9CF4] = 0x9CB2 ^ 0x9CF4;
        TextScroller.C[0xB587 ^ 0xB5D6] = 0xB599 ^ 0xB5D6;
        TextScroller.C[0x100D6 ^ 0x1000D] = 0x1001B ^ 0x1000D;
        TextScroller.C[0x15CD ^ 0x15D9] = 0x1587 ^ 0x15D9;
        TextScroller.C[0x10334 ^ 0x10328] = 0x1031C ^ 0x10328;
        TextScroller.C[0x70EE ^ 0x71FF] = 0xE367 ^ 0x71FF;
        TextScroller.C[0x96EE ^ 0x97D6] = 0x2CAB ^ 0x97D6;
        TextScroller.C[0x2052 ^ 0x208A] = 0xFFFFDF30 ^ 0x208A;
        TextScroller.C[0x40B8 ^ 0x4082] = 0x40D4 ^ 0x4082;
        TextScroller.C[0xB415 ^ 0xB596] = 0x738D ^ 0xB596;
        TextScroller.C[0x106F3 ^ 0x1066E] = 0x1438F ^ 0x1066E;
        TextScroller.C[0x3225 ^ 0x32E5] = 0xFFFFCD21 ^ 0x32E5;
        TextScroller.C[0xC981 ^ 0xC969] = 0xC969 ^ 0xC969;
        TextScroller.C[0xD5B5 ^ 0xD5C9] = 0xFFFF2A2D ^ 0xD5C9;
        TextScroller.C[0x106FE ^ 0x107D1] = 0x1772A ^ 0x107D1;
        TextScroller.C[0x1818 ^ 0x196A] = 0xDC4B ^ 0x196A;
        TextScroller.C[0x41B0 ^ 0x41B1] = 0xFFFFBE6C ^ 0x41B1;
        TextScroller.C[0x4D0C ^ 0x4D72] = 0xFFFFB2FC ^ 0x4D72;
        TextScroller.C[0xC68D ^ 0xC705] = 0xAC83 ^ 0xC705;
        TextScroller.C[0x9BB4 ^ 0x9B57] = 0x9B61 ^ 0x9B57;
        TextScroller.C[0x9EB6 ^ 0x9EEF] = 0xFFFF6121 ^ 0x9EEF;
        TextScroller.C[0xAAF7 ^ 0xABAD] = 0x1CFA ^ 0xABAD;
        TextScroller.C[0x697D ^ 0x695B] = 0xFFFF9687 ^ 0x695B;
        TextScroller.C[0xA04B ^ 0xA178] = 0xFFFFEDA1 ^ 0xA178;
        TextScroller.C[0x6A87 ^ 0x6A55] = 0xFFFF95CE ^ 0x6A55;
        TextScroller.C[0x171B ^ 0x17B1] = 0x724D ^ 0x17B1;
        TextScroller.C[0x2552 ^ 0x2523] = 0xFFFFDA80 ^ 0x2523;
        TextScroller.C[0xBBC6 ^ 0xBB56] = 0xFFFF4497 ^ 0xBB56;
        TextScroller.C[0x9DB0 ^ 0x9CB9] = 0xF999 ^ 0x9CB9;
        TextScroller.C[0x5A7B ^ 0x5A6A] = 0xFFFFA59D ^ 0x5A6A;
        TextScroller.C[0x56EC ^ 0x57D1] = 0xAA36 ^ 0x57D1;
        TextScroller.C[0xAB93 ^ 0xAB4E] = 0xABD9 ^ 0xAB4E;
        TextScroller.C[0xA710 ^ 0xA715] = 0xA72E ^ 0xA715;
        TextScroller.C[0x501 ^ 0x428] = 0x8333 ^ 0x428;
        TextScroller.C[0xD116 ^ 0xD1C1] = 0xFFFF2E28 ^ 0xD1C1;
        TextScroller.C[0x2D6C ^ 0x2D0D] = 0x2D64 ^ 0x2D0D;
        TextScroller.C[0x430F ^ 0x4281] = 0x9242 ^ 0x4281;
        TextScroller.C[0x4F48 ^ 0x4F62] = 0xFFFFB0FE ^ 0x4F62;
        TextScroller.C[0x486F ^ 0x483B] = 0x484A ^ 0x483B;
        TextScroller.C[0xC91 ^ 0xCB8] = 0xCE4 ^ 0xCB8;
        TextScroller.C[0x10678 ^ 0x106F3] = 0xFFFEF96F ^ 0x106F3;
        TextScroller.C[0xB31E ^ 0xB24A] = 0x84F1 ^ 0xB24A;
        TextScroller.C[0x391E ^ 0x3834] = 0x69CE ^ 0x3834;
        TextScroller.C[0x1B99 ^ 0x1BDF] = 0x1BEC ^ 0x1BDF;
        TextScroller.C[0x8B2C ^ 0x8A37] = 0x3A75 ^ 0x8A37;
        TextScroller.C[0xC9AB ^ 0xC986] = 0xC88D ^ 0xC986;
        TextScroller.C[0xA18B ^ 0xA14D] = 0xFFFF5E93 ^ 0xA14D;
        TextScroller.C[0x87D3 ^ 0x874F] = 0x870F ^ 0x874F;
        TextScroller.C[0xF9F1 ^ 0xF996] = 0xF9B6 ^ 0xF996;
        TextScroller.C[0x2097 ^ 0x2078] = 0x91C6 ^ 0x2078;
        TextScroller.C[0x10697 ^ 0x10626] = 0x10645 ^ 0x10626;
        TextScroller.C[0xA354 ^ 0xA369] = 0xA31E ^ 0xA369;
        TextScroller.C[0xB3B1 ^ 0xB3CA] = 0xB3D2 ^ 0xB3CA;
        TextScroller.C[0x6762 ^ 0x6746] = 0x6700 ^ 0x6746;
        TextScroller.C[0xC447 ^ 0xC4A0] = 0xC4A2 ^ 0xC4A0;
        TextScroller.C[0xAFB8 ^ 0xAF07] = 0xAF76 ^ 0xAF07;
        TextScroller.C[0x898A ^ 0x88DB] = 0xBE61 ^ 0x88DB;
        TextScroller.C[0x718C ^ 0x7160] = 0xE86D ^ 0x7160;
        TextScroller.C[0x35EE ^ 0x34F9] = 0x6FE2 ^ 0x34F9;
        TextScroller.C[0x7228 ^ 0x7343] = 0x814 ^ 0x7343;
        TextScroller.C[0x794B ^ 0x7848] = 0xD51D ^ 0x7848;
        TextScroller.C[0x36C ^ 0x3B3] = 0x3DC ^ 0x3B3;
        TextScroller.C[0x1777 ^ 0x177D] = 0x176D ^ 0x177D;
        TextScroller.C[0x732 ^ 0x73F] = 0x75D ^ 0x73F;
        TextScroller.C[0x6409 ^ 0x6504] = 0x4F1D ^ 0x6504;
        TextScroller.C[0x509C ^ 0x51F9] = 0x7EEF ^ 0x51F9;
        TextScroller.C[0x717F ^ 0x7054] = 0x21AA ^ 0x7054;
        TextScroller.C[0x44B5 ^ 0x4496] = 0x44BD ^ 0x4496;
        TextScroller.C[0xF5B8 ^ 0xF4B0] = 0xFFFF6E0F ^ 0xF4B0;
        TextScroller.C[0xAD39 ^ 0xAC02] = 0xA9DC ^ 0xAC02;
        TextScroller.C[0x2445 ^ 0x2499] = 0xFFFFDB41 ^ 0x2499;
        TextScroller.C[0xEBB2 ^ 0xEA84] = 0x51F9 ^ 0xEA84;
        TextScroller.C[0xD306 ^ 0xD3C8] = 0xD3C7 ^ 0xD3C8;
        TextScroller.C[0x5129 ^ 0x50A0] = 0x79AF ^ 0x50A0;
        TextScroller.C[0xCAEA ^ 0xCA83] = 0xCAFC ^ 0xCA83;
        TextScroller.C[0x7713 ^ 0x7679] = 0xD40 ^ 0x7679;
        TextScroller.C[0xDF21 ^ 0xDF80] = 0x47 ^ 0xDF80;
        TextScroller.C[0x6AAD ^ 0x6A7E] = 0xFFFF95D9 ^ 0x6A7E;
        TextScroller.C[0x8972 ^ 0x89C7] = 0xFFFF7666 ^ 0x89C7;
        TextScroller.C[0x3C18 ^ 0x3D36] = 0x3D36 ^ 0x3D36;
        TextScroller.C[0xEBE6 ^ 0xEB12] = 0xFFFF850E ^ 0xEB12;
        TextScroller.C[0x7CE8 ^ 0x7C70] = 0x7C70 ^ 0x7C70;
        TextScroller.C[0x864F ^ 0x864D] = 0xFFFF79BE ^ 0x864D;
        TextScroller.C[0x6E1D ^ 0x6F40] = 0x7101 ^ 0x6F40;
        TextScroller.C[0x3454 ^ 0x3514] = 0xC8E1 ^ 0x3514;
        TextScroller.C[0xB6BF ^ 0xB7B3] = 0xFFFF6259 ^ 0xB7B3;
        TextScroller.C[0xA084 ^ 0xA0E4] = 0xFFFF5F24 ^ 0xA0E4;
        TextScroller.C[0x108B3 ^ 0x108A6] = 0x108CF ^ 0x108A6;
        TextScroller.C[0x1FF9 ^ 0x1F27] = 0x1F6F ^ 0x1F27;
        TextScroller.C[0xB04E ^ 0xB006] = 0xFFFF4FCA ^ 0xB006;
        TextScroller.C[0x51F6 ^ 0x50DB] = 0x125 ^ 0x50DB;
        TextScroller.C[0x64CC ^ 0x65B4] = 0x9AA6 ^ 0x65B4;
        TextScroller.C[0x759C ^ 0x7554] = 0x756A ^ 0x7554;
        TextScroller.C[0x29C5 ^ 0x29B8] = 0x2970 ^ 0x29B8;
        TextScroller.C[0xE4B8 ^ 0xE4AB] = 0xFFFF1B06 ^ 0xE4AB;
        TextScroller.C[0x2990 ^ 0x2941] = 0xFFFFD6AD ^ 0x2941;
        TextScroller.C[0xF268 ^ 0xF30A] = 0x7B62 ^ 0xF30A;
        TextScroller.C[0x21CE ^ 0x2196] = 0x21A6 ^ 0x2196;
        TextScroller.C[0x196C ^ 0x19CB] = 0xC95C ^ 0x19CB;
        TextScroller.C[0xEBC0 ^ 0xEAB4] = 0x2F95 ^ 0xEAB4;
        TextScroller.C[0x1458 ^ 0x1456] = 0xFFFFEB90 ^ 0x1456;
        TextScroller.C[0x95D0 ^ 0x9495] = 0xCBD ^ 0x9495;
        TextScroller.C[0xE239 ^ 0xE23E] = 0xE22B ^ 0xE23E;
        TextScroller.C[0x4F25 ^ 0x4F3C] = 0x4F5D ^ 0x4F3C;
        TextScroller.C[0x1089B ^ 0x10890] = 0x108D4 ^ 0x10890;
        TextScroller.C[0x10920 ^ 0x1081F] = 0x1F59A ^ 0x1081F;
        TextScroller.C[0xA9A5 ^ 0xA8EA] = 0xFFFFEC8E ^ 0xA8EA;
        TextScroller.C[0xDD48 ^ 0xDC31] = 0x20AA ^ 0xDC31;
        TextScroller.C[0x5A29 ^ 0x5AA8] = 0x5AFB ^ 0x5AA8;
        TextScroller.C[0x6BE0 ^ 0x6BF8] = 0x6FAB ^ 0x6BF8;
        TextScroller.C[0xD29B ^ 0xD208] = 0xD21D ^ 0xD208;
        TextScroller.C[0xF733 ^ 0xF665] = 0x5B12 ^ 0xF665;
        TextScroller.C[0xFE1D ^ 0xFF75] = 0xD06C ^ 0xFF75;
        TextScroller.C[0xA482 ^ 0xA482] = 0xFFFF5B53 ^ 0xA482;
        TextScroller.C[0x6427 ^ 0x652C] = 0x4F35 ^ 0x652C;
        TextScroller.C[0x3084 ^ 0x319D] = 0x6A86 ^ 0x319D;
        TextScroller.C[0x833F ^ 0x839B] = 0xEC32 ^ 0x839B;
        TextScroller.C[0xFC8C ^ 0xFDCD] = 0x17CF ^ 0xFDCD;
        TextScroller.C[0x8825 ^ 0x88A6] = 0x88FB ^ 0x88A6;
        TextScroller.C[0x14E5 ^ 0x1568] = 0xC5A0 ^ 0x1568;
        TextScroller.C[0xC097 ^ 0xC1DB] = 0x7B42 ^ 0xC1DB;
        TextScroller.C[0xF652 ^ 0xF731] = 0xFFFF80EE ^ 0xF731;
        TextScroller.C[0x474E ^ 0x4610] = 0x584A ^ 0x4610;
        TextScroller.C[0x10897 ^ 0x109FB] = 0x172C2 ^ 0x109FB;
        TextScroller.C[0xDA8 ^ 0xD08] = 0x33CE ^ 0xD08;
        TextScroller.C[0x83B5 ^ 0x83DB] = 0xFFFF7C00 ^ 0x83DB;
        TextScroller.C[0xB538 ^ 0xB51A] = 0xB54B ^ 0xB51A;
        TextScroller.C[0x1113 ^ 0x1057] = 0xFA48 ^ 0x1057;
        TextScroller.C[0x10D0 ^ 0x11A0] = 0xD15F ^ 0x11A0;
        TextScroller.C[0x650A ^ 0x659F] = 0x659C ^ 0x659F;
        TextScroller.C[0xAECD ^ 0xAEE1] = 0xAECE ^ 0xAEE1;
        TextScroller.C[0xFF5E ^ 0xFE4A] = 0xFFFF5C9A ^ 0xFE4A;
        TextScroller.C[0x963D ^ 0x9663] = 0xFFFF69BF ^ 0x9663;
        TextScroller.C[0x670E ^ 0x671E] = 0x6736 ^ 0x671E;
        TextScroller.C[0x9A3C ^ 0x9B3C] = 0xFFFF7702 ^ 0x9B3C;
        TextScroller.C[0x3564 ^ 0x3545] = 0x355F ^ 0x3545;
        TextScroller.C[0x10EC9 ^ 0x10E31] = 0x147D2 ^ 0x10E31;
        TextScroller.C[0xA9A ^ 0xBFB] = 0x8383 ^ 0xBFB;
        TextScroller.C[0x10843 ^ 0x1093C] = 0x1BD05 ^ 0x1093C;
        TextScroller.C[0x2D5B ^ 0x2C77] = 0x7D84 ^ 0x2C77;
        TextScroller.C[0x6ED5 ^ 0x6EBA] = 0x6EB1 ^ 0x6EBA;
        TextScroller.C[0xF0CB ^ 0xF1B8] = 0x34EC ^ 0xF1B8;
        TextScroller.C[0x98D4 ^ 0x99A5] = 0x5C93 ^ 0x99A5;
        TextScroller.C[0x10817 ^ 0x1089D] = 0x108FC ^ 0x1089D;
        TextScroller.C[0x6A3 ^ 0x6FE] = 0xFFFFF95A ^ 0x6FE;
        TextScroller.C[0x1A08 ^ 0x1AFE] = 0x537F ^ 0x1AFE;
        TextScroller.C[0x31A3 ^ 0x3025] = 0x5BA3 ^ 0x3025;
        TextScroller.C[0x532 ^ 0x51A] = 0x522 ^ 0x51A;
        TextScroller.C[0xCB0E ^ 0xCA57] = 0x7D0A ^ 0xCA57;
        TextScroller.C[0xB4DC ^ 0xB5AB] = 0x4AB8 ^ 0xB5AB;
        TextScroller.C[0x22D2 ^ 0x2223] = 0x939D ^ 0x2223;
        TextScroller.C[0xD09E ^ 0xD1C9] = 0xFFFF831F ^ 0xD1C9;
        TextScroller.C[0xF29B ^ 0xF26E] = 0x63D6 ^ 0xF26E;
        TextScroller.C[0x6273 ^ 0x6268] = 0x6215 ^ 0x6268;
        TextScroller.C[0xF868 ^ 0xF8F3] = 0xF8F3 ^ 0xF8F3;
        TextScroller.C[0x9B92 ^ 0x9BC2] = 0xFFFF6426 ^ 0x9BC2;
        TextScroller.C[0x3311 ^ 0x337D] = 0x331A ^ 0x337D;
        TextScroller.C[0x5625 ^ 0x5727] = 0xFA75 ^ 0x5727;
        TextScroller.C[0x593D ^ 0x59A4] = 0x59A6 ^ 0x59A4;
        TextScroller.C[0x7E7A ^ 0x7F0F] = 0x8015 ^ 0x7F0F;
        TextScroller.C[0xF81B ^ 0xF8EB] = 0xFFFFB6F7 ^ 0xF8EB;
        TextScroller.C[0xDE8F ^ 0xDE10] = 0xEDF3 ^ 0xDE10;
        TextScroller.C[0x10AFF ^ 0x10A6D] = 0xFFFEF5D0 ^ 0x10A6D;
        TextScroller.C[0x10EE9 ^ 0x10EA0] = 0xFFFEF12D ^ 0x10EA0;
        TextScroller.C[0x7B74 ^ 0x7BA1] = 0x7BA3 ^ 0x7BA1;
        TextScroller.C[0x34B5 ^ 0x3530] = 0x5EA9 ^ 0x3530;
        TextScroller.C[0xB525 ^ 0xB5D6] = 0x246E ^ 0xB5D6;
        TextScroller.C[0x1C24 ^ 0x1CA0] = 0x1CC1 ^ 0x1CA0;
        TextScroller.C[0x108DE ^ 0x1087B] = 0x1C370 ^ 0x1087B;
        TextScroller.C[0xA5AB ^ 0xA420] = 0x8D22 ^ 0xA420;
        TextScroller.C[0x15E1 ^ 0x15F6] = 0xFFFFEA66 ^ 0x15F6;
        TextScroller.C[0xA504 ^ 0xA524] = 0xFFFF5AA3 ^ 0xA524;
        TextScroller.C[0x27E0 ^ 0x27D0] = 0xFFFFD8BC ^ 0x27D0;
        TextScroller.C[0xB66F ^ 0xB73C] = 0x81A9 ^ 0xB73C;
        TextScroller.C[0xDC2B ^ 0xDCF1] = 0xFFFF231F ^ 0xDCF1;
        TextScroller.C[0xA395 ^ 0xA2F2] = 0x8DAD ^ 0xA2F2;
        TextScroller.C[0x6F1 ^ 0x63A] = 0xFFFFF969 ^ 0x63A;
        TextScroller.C[0xEC3A ^ 0xED3E] = 0xFFFFBFDE ^ 0xED3E;
        TextScroller.C[0xAFF4 ^ 0xAE92] = 0x818B ^ 0xAE92;
        TextScroller.C[0x10D09 ^ 0x10D3F] = 0x10DB2 ^ 0x10D3F;
        TextScroller.C[0xF985 ^ 0xF9D6] = 0xFFFF0636 ^ 0xF9D6;
        TextScroller.C[0x9C39 ^ 0x9D7F] = 0x549 ^ 0x9D7F;
        TextScroller.C[0x33DB ^ 0x3293] = 0xAAA5 ^ 0x3293;
        TextScroller.C[0x1E2E ^ 0x1E6A] = 0xFFFFE1F1 ^ 0x1E6A;
        TextScroller.C[0x1071E ^ 0x107DD] = 0xFFFEF86D ^ 0x107DD;
        TextScroller.C[0xE7E7 ^ 0xE70C] = 0xE70C ^ 0xE70C;
        TextScroller.C[0x923A ^ 0x9322] = 0xFFFF378E ^ 0x9322;
        TextScroller.C[0x331B ^ 0x3354] = 0x335F ^ 0x3354;
        TextScroller.C[0xEC4C ^ 0xED13] = 0xFFFF0CBA ^ 0xED13;
        TextScroller.C[0x186E ^ 0x182E] = 0xFFFFE7A7 ^ 0x182E;
        TextScroller.C[0x5D5F ^ 0x5DB1] = 0xEC04 ^ 0x5DB1;
        TextScroller.C[0x105CA ^ 0x104F4] = 0x1F901 ^ 0x104F4;
        TextScroller.C[0x34F9 ^ 0x35DB] = 0x8482 ^ 0x35DB;
        TextScroller.C[0x6D2 ^ 0x66A] = 0xFFFFF9B8 ^ 0x66A;
        TextScroller.C[0xADD9 ^ 0xADA6] = 0xADF0 ^ 0xADA6;
        TextScroller.C[0x6E26 ^ 0x6F4F] = 0x147B ^ 0x6F4F;
        TextScroller.C[0x10DA3 ^ 0x10DAB] = 0xFFFEF25E ^ 0x10DAB;
        TextScroller.C[0x4EFE ^ 0x4E31] = 0xFFFFB1EB ^ 0x4E31;
        TextScroller.C[0xE0C1 ^ 0xE1E2] = 0x50BA ^ 0xE1E2;
        TextScroller.C[0xFE20 ^ 0xFE26] = 0xFFFF01DE ^ 0xFE26;
        TextScroller.C[0x106C5 ^ 0x106DB] = 0xFFFEF971 ^ 0x106DB;
        TextScroller.C[0x32FF ^ 0x3233] = 0x3266 ^ 0x3233;
        TextScroller.C[0x4B8 ^ 0x534] = 0x2C28 ^ 0x534;
        TextScroller.C[0x5E33 ^ 0x5F01] = 0xEC40 ^ 0x5F01;
        TextScroller.C[0x2B27 ^ 0x2BAF] = 0x2B94 ^ 0x2BAF;
        TextScroller.C[0x5B91 ^ 0x5B0F] = 0x32EC ^ 0x5B0F;
        TextScroller.C[0x1252 ^ 0x132F] = 0xA71F ^ 0x132F;
        TextScroller.C[0x8E2D ^ 0x8E97] = 0xFFFF7133 ^ 0x8E97;
        TextScroller.C[0xE0CF ^ 0xE067] = 0x72BF ^ 0xE067;
        TextScroller.C[0xDA89 ^ 0xDAC4] = 0xFFFF2564 ^ 0xDAC4;
        TextScroller.C[0xA747 ^ 0xA654] = 0xFB33 ^ 0xA654;
        TextScroller.C[0x440B ^ 0x448B] = 0xFFFFBB67 ^ 0x448B;
        TextScroller.C[0x417 ^ 0x52E] = 0xAA ^ 0x52E;
        TextScroller.C[0xE697 ^ 0xE65A] = 0xE632 ^ 0xE65A;
        TextScroller.C[0xB07C ^ 0xB12E] = 0x8795 ^ 0xB12E;
        TextScroller.C[0x1855 ^ 0x18FC] = 0xCE85 ^ 0x18FC;
        TextScroller.C[0x8A26 ^ 0x8B64] = 0x617B ^ 0x8B64;
        TextScroller.C[0xCD48 ^ 0xCC25] = 0xCD8 ^ 0xCC25;
        TextScroller.C[0x2089 ^ 0x21C3] = 0x9B5A ^ 0x21C3;
        TextScroller.C[0x3E32 ^ 0x3E54] = 0xFFFFC1DD ^ 0x3E54;
        TextScroller.C[0xCE82 ^ 0xCF06] = 0x97D ^ 0xCF06;
        TextScroller.C[0xEC92 ^ 0xEC3D] = 0xEC69 ^ 0xEC3D;
        TextScroller.C[0x14F9 ^ 0x1414] = 0x8D09 ^ 0x1414;
        TextScroller.C[0xEEF7 ^ 0xEE92] = 0xEED4 ^ 0xEE92;
        TextScroller.C[0x270 ^ 0x247] = 0x205 ^ 0x247;
        TextScroller.C[0xB205 ^ 0xB2B6] = 0xB2BA ^ 0xB2B6;
        TextScroller.C[0x941D ^ 0x9521] = 0x90B1 ^ 0x9521;
        TextScroller.C[0x96A0 ^ 0x96AC] = 0x96F5 ^ 0x96AC;
        TextScroller.C[0x83E9 ^ 0x82F5] = 0xFFFFCD20 ^ 0x82F5;
        TextScroller.C[0x28C4 ^ 0x28EA] = 0xFFFFD711 ^ 0x28EA;
        TextScroller.C[0xED40 ^ 0xEC3A] = 0x10A6 ^ 0xEC3A;
        TextScroller.C[0x5E5D ^ 0x5F32] = 0x9F81 ^ 0x5F32;
        TextScroller.C[0x93C0 ^ 0x9240] = 0x2666 ^ 0x9240;
        TextScroller.C[0xBB5B ^ 0xBBB1] = 0xBBB0 ^ 0xBBB1;
        TextScroller.C[0xE1DA ^ 0xE179] = 0x2A31 ^ 0xE179;
        TextScroller.C[0xD497 ^ 0xD425] = 0xD438 ^ 0xD425;
        TextScroller.C[0x70DE ^ 0x70A7] = 0x70EE ^ 0x70A7;
        TextScroller.C[0xD0B8 ^ 0xD1A6] = 0x1D75D ^ 0xD1A6;
        TextScroller.C[0x6A ^ 0x132] = 0xAC45 ^ 0x132;
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2={"Lkotakbaz/rain/ui/menu/misc/TextScroller$Companion;", "", "<init>", "()V", "", "STATE_TTL_MS", "J", "CLEANUP_INTERVAL_MS", "RETURN_ANIMATION_MS", "", "EPSILON", "F", "rain-visuals"})
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 \u00a8\u0006$"}, d2={"Lkotakbaz/rain/ui/menu/misc/TextScroller$ScrollState;", "", "<init>", "()V", "Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "returnAnimation", "Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "getReturnAnimation", "()Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "", "offset", "F", "getOffset", "()F", "setOffset", "(F)V", "", "hovered", "Z", "getHovered", "()Z", "setHovered", "(Z)V", "wrappedThisFrame", "getWrappedThisFrame", "setWrappedThisFrame", "", "lastUpdateNs", "J", "getLastUpdateNs", "()J", "setLastUpdateNs", "(J)V", "lastSeenMs", "getLastSeenMs", "setLastSeenMs", "rain-visuals"})
    private static final class ScrollState {
        @NotNull
        private final AnimationUtil returnAnimation = new AnimationUtil();
        private float offset;
        private boolean hovered;
        private boolean wrappedThisFrame;
        private long lastUpdateNs;
        private long lastSeenMs;

        @NotNull
        public final AnimationUtil getReturnAnimation() {
            return this.returnAnimation;
        }

        public final float getOffset() {
            return this.offset;
        }

        public final void setOffset(float f2) {
            this.offset = f2;
        }

        public final boolean getHovered() {
            return this.hovered;
        }

        public final void setHovered(boolean bl) {
            this.hovered = bl;
        }

        public final boolean getWrappedThisFrame() {
            return this.wrappedThisFrame;
        }

        public final void setWrappedThisFrame(boolean bl) {
            this.wrappedThisFrame = bl;
        }

        public final long getLastUpdateNs() {
            return this.lastUpdateNs;
        }

        public final void setLastUpdateNs(long l2) {
            this.lastUpdateNs = l2;
        }

        public final long getLastSeenMs() {
            return this.lastSeenMs;
        }

        public final void setLastSeenMs(long l2) {
            this.lastSeenMs = l2;
        }
    }
}

