/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.awt.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0637\u0629;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001!B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001aR8\u0010\u001f\u001a&\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d \u001e*\u0012\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 \u00a8\u0006\""}, d2={"Loxxxde/\u0628\u062d;", "", "<init>", "()V", "Ljava/awt/Color;", "color", "", "normalize", "(Ljava/awt/Color;)[F", "buffer", "", "normalizeInto", "(Ljava/awt/Color;[F)V", "current", "target", "", "delta", "interpolateColor", "(Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;", "alpha", "setAlpha", "(Ljava/awt/Color;F)Ljava/awt/Color;", "factor", "multiplyAlpha", "", "ALPHA_CACHE_SIZE", "I", "ALPHA_CACHE_MASK", "Ljava/lang/ThreadLocal;", "Loxxxde/\u0637\u0629;", "kotlin.jvm.PlatformType", "alphaCache", "Ljava/lang/ThreadLocal;", "AlphaCache", "rain-visuals"})
public final class \u0628\u062d {
    private static final int ALPHA_CACHE_MASK = 2047;
    private static final int ALPHA_CACHE_SIZE = 2048;
    private static final ThreadLocal<\u0637\u0629> alphaCache;
    @NotNull
    public static final \u0628\u062d INSTANCE;

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final float[] normalize(@NotNull Color color) {
        void var1_1;
        Intrinsics.checkNotNullParameter(color, "color");
        float[] fArray = new float[4];
        fArray[0] = (float)color.getRed() / 255.0f;
        fArray[1] = (float)color.getGreen() / 255.0f;
        fArray[2] = (float)color.getBlue() / 255.0f;
        fArray[3] = (float)var1_1.getAlpha() / 255.0f;
        return fArray;
    }

    /*
     * WARNING - void declaration
     */
    public final void normalizeInto(@NotNull Color color, @NotNull float[] buffer) {
        void var1_1;
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer[0] = (float)color.getRed() / 255.0f;
        buffer[1] = (float)color.getGreen() / 255.0f;
        buffer[2] = (float)color.getBlue() / 255.0f;
        buffer[3] = (float)var1_1.getAlpha() / 255.0f;
    }

    @NotNull
    public final Color multiplyAlpha(@NotNull Color color, float factor) {
        Intrinsics.checkNotNullParameter(color, "color");
        int a2 = RangesKt.coerceIn((int)((float)color.getAlpha() * factor), 0, 255);
        return alphaCache.get().get(color, a2);
    }

    private \u0628\u062d() {
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final Color interpolateColor(@NotNull Color current, @NotNull Color target, float delta) {
        void var8_8;
        void var7_7;
        void var6_6;
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(target, "target");
        float t = RangesKt.coerceIn(delta, 0.0f, 1.0f);
        int r = RangesKt.coerceIn((int)((float)current.getRed() + (float)(target.getRed() - current.getRed()) * t), 0, 255);
        int g = RangesKt.coerceIn((int)((float)current.getGreen() + (float)(target.getGreen() - current.getGreen()) * t), 0, 255);
        int b2 = RangesKt.coerceIn((int)((float)current.getBlue() + (float)(target.getBlue() - current.getBlue()) * t), 0, 255);
        int a2 = RangesKt.coerceIn((int)((float)current.getAlpha() + (float)(target.getAlpha() - current.getAlpha()) * t), 0, 255);
        return new Color(r, (int)var6_6, (int)var7_7, (int)var8_8);
    }

    static {
        INSTANCE = new \u0628\u062d();
        alphaCache = ThreadLocal.withInitial(\u0637\u0629::new);
    }

    @NotNull
    public final Color setAlpha(@NotNull Color color, float alpha) {
        Intrinsics.checkNotNullParameter(color, "color");
        int a2 = RangesKt.coerceIn((int)(RangesKt.coerceIn(alpha, 0.0f, 1.0f) * 255.0f), 0, 255);
        return alphaCache.get().get(color, a2);
    }
}

