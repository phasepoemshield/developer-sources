/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotakbaz.rain.client.util.render.engine.Renderable;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.engine.dispatcher.RenderDispatcher;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0004\b\u000b\u0010\u0003J!\u0010\u000e\u001a\u00020\u00072\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0004\"\u00020\f\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00072\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0004\u00a2\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0007\u00a2\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001c"}, d2={"Loxxxde/\u0638\u0642;", "", "<init>", "()V", "", "Loxxxde/\u0637\u0621;", "renderable", "", "loadShaders", "([Lkotakbaz/rain/client/util/render/engine/Renderable;)V", "loadRender", "flushAll", "Loxxxde/\u0635\u0624;", "pipelines", "flushPipelines", "([Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)V", "flushPipelineArray", "", "hasQueuedGuiOrWindow", "()Z", "", "renderers", "Ljava/util/List;", "Loxxxde/\u0628\u0626;", "dispatcher", "Loxxxde/\u0628\u0626;", "getDispatcher", "()Lkotakbaz/rain/client/util/render/engine/dispatcher/RenderDispatcher;", "rain-visuals"})
public final class \u0638\u0642 {
    @NotNull
    private static final RenderDispatcher dispatcher;
    @NotNull
    public static final \u0638\u0642 INSTANCE;
    @NotNull
    private static final List<Renderable> renderers;

    public final void flushPipelineArray(@NotNull ClientRenderPipeline[] pipelines) {
        Intrinsics.checkNotNullParameter(pipelines, "pipelines");
        dispatcher.flushPipelineArray(pipelines);
    }

    static {
        INSTANCE = new \u0638\u0642();
        renderers = new ArrayList();
        dispatcher = new RenderDispatcher();
    }

    private \u0638\u0642() {
    }

    public final void flushAll() {
        dispatcher.flushAll();
    }

    public final void loadRender() {
        Iterable $this$forEach$iv = renderers;
        boolean $i$f$forEach = false;
        Iterator iterator2 = $this$forEach$iv.iterator();
        while (iterator2.hasNext()) {
            Object element$iv = iterator2.next();
            Renderable it = (Renderable)element$iv;
            boolean bl = false;
            it.load();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @JvmStatic
    public static final boolean hasQueuedGuiOrWindow() {
        if (dispatcher.hasQueued(ClientRenderPipeline.GUI_RECT)) return true;
        if (dispatcher.hasQueued(ClientRenderPipeline.GUI_SPECIAL)) return true;
        if (dispatcher.hasQueued(ClientRenderPipeline.GUI_TEXT)) return true;
        if (dispatcher.hasQueued(ClientRenderPipeline.WINDOW_RECT)) return true;
        if (dispatcher.hasQueued(ClientRenderPipeline.WINDOW_SPECIAL)) return true;
        if (!dispatcher.hasQueued(ClientRenderPipeline.WINDOW_TEXT)) return false;
        return true;
    }

    @NotNull
    public final RenderDispatcher getDispatcher() {
        return dispatcher;
    }

    public final void loadShaders(Renderable ... renderable) {
        Intrinsics.checkNotNullParameter(renderable, "renderable");
        CollectionsKt.addAll((Collection)renderers, renderable);
    }

    public final void flushPipelines(ClientRenderPipeline ... pipelines) {
        Intrinsics.checkNotNullParameter(pipelines, "pipelines");
        dispatcher.flushPipelineArray(pipelines);
    }
}

