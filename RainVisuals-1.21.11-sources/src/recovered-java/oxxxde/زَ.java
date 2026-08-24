/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 */
package oxxxde;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gui.DrawContext;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0628\u0641;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0005\u0010\u0003J'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007\u00a2\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2={"Loxxxde/\u0632\u064e;", "", "<init>", "()V", "", "fadeIn", "Lnet/minecraft/class_332;", "context", "", "width", "height", "render", "(Lnet/minecraft/class_332;II)V", "MAX_ALPHA", "I", "", "DURATION_MS", "F", "", "startMs", "J", "", "active", "Z", "rain-visuals"})
public final class \u0632\u064e {
    private static final float DURATION_MS = 260.0f;
    private static long startMs;
    private static boolean active;
    public static final int MAX_ALPHA = 210;
    @NotNull
    public static final \u0632\u064e INSTANCE;

    @JvmStatic
    public static final void render(@NotNull DrawContext context, int width, int height) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!active) {
            return;
        }
        float progress = RangesKt.coerceIn((float)(System.currentTimeMillis() - startMs) / 260.0f, 0.0f, 1.0f);
        int alpha = (int)((float)210 * (1.0f - \u0628\u0641.INSTANCE.standardDecelerate(progress)));
        if (alpha <= 0) {
            active = false;
            return;
        }
        context.fill(0, 0, width, height, alpha << 24);
    }

    @JvmStatic
    public static final void fadeIn() {
        startMs = System.currentTimeMillis();
        active = true;
    }

    static {
        INSTANCE = new \u0632\u064e();
    }

    private \u0632\u064e() {
    }
}

