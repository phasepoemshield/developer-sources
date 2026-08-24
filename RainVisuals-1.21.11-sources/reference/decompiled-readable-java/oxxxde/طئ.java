/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.awt.Color;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotakbaz.rain.client.util.render.DeferredGuiIconRenderer;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0631\u064e;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007\u00a2\u0006\u0004\b\u000e\u0010\u0012J!\u0010\u0015\u001a\u00020\r2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0013\"\u00020\u0010\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\r2\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0013\u00a2\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001f"}, d2={"Loxxxde/\u0637\u0626;", "", "<init>", "()V", "", "hasPending", "()Z", "", "x", "y", "size", "", "argb", "", "enqueueA", "(FFFI)V", "Loxxxde/\u0635\u0624;", "pipeline", "(FFFILkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)V", "", "pipelines", "renderQueued", "([Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)V", "renderQueuedFrom", "LOGO_SMOOTHNESS", "F", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Loxxxde/\u062d\u0639;", "pending", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Request", "rain-visuals"})
public final class \u0637\u0626 {
    @NotNull
    public static final \u0637\u0626 INSTANCE = new \u0637\u0626();
    @NotNull
    private static final ConcurrentLinkedQueue<DeferredGuiIconRenderer.Request> pending = new ConcurrentLinkedQueue();
    private static final float LOGO_SMOOTHNESS = 0.5f;

    public final void renderQueuedFrom(@NotNull ClientRenderPipeline[] pipelines) {
        Intrinsics.checkNotNullParameter(pipelines, "pipelines");
        int queuedCount = pending.size();
        for (int i = 0; i < queuedCount; ++i) {
            DeferredGuiIconRenderer.Request request;
            int it = i;
            boolean bl = false;
            if (pending.poll() == null) continue;
            if (!ArraysKt.contains(pipelines, request.getPipeline())) {
                pending.add(request);
                continue;
            }
            Font.drawCenteredText$default(\u0631\u064e.INSTANCE.getLOGO().priority(request.getPipeline()).smoothness(0.5f).spacing(0.0f).resetFade(), "a", request.getX(), request.getY(), request.getSize(), new Color(request.getArgb(), true), 0.0f, 32, null);
        }
    }

    @JvmStatic
    public static final boolean hasPending() {
        return !((Collection)pending).isEmpty();
    }

    @JvmStatic
    public static final void enqueueA(float x, float y, float size, int argb) {
        \u0637\u0626.enqueueA(x, y, size, argb, ClientRenderPipeline.GUI_SPECIAL);
    }

    private \u0637\u0626() {
    }

    public final void renderQueued(ClientRenderPipeline ... pipelines) {
        Intrinsics.checkNotNullParameter(pipelines, "pipelines");
        this.renderQueuedFrom(pipelines);
    }

    @JvmStatic
    public static final void enqueueA(float x, float y, float size, int argb, @NotNull ClientRenderPipeline pipeline) {
        block3: {
            block2: {
                Intrinsics.checkNotNullParameter((Object)pipeline, "pipeline");
                if (size <= 0.0f) break block2;
                if (argb >>> 24 != 0) break block3;
            }
            return;
        }
        pending.add(new DeferredGuiIconRenderer.Request(x, y, size, argb, pipeline));
    }
}

