/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.engine.controls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotakbaz.rain.client.util.render.engine.a_0;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.engine.dispatcher.RenderDispatcher;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0004\b\u000b\u0010\u0003J!\u0010\u000e\u001a\u00020\u00072\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0004\"\u00020\f\u00a2\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2={"Lkotakbaz/rain/client/util/render/engine/controls/LayerControl;", "", "<init>", "()V", "", "Lkotakbaz/rain/client/util/render/engine/Renderable;", "renderable", "", "loadShaders", "([Lkotakbaz/rain/client/util/render/engine/Renderable;)V", "loadRender", "flushAll", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "pipelines", "flushPipelines", "([Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)V", "", "renderers", "Ljava/util/List;", "Lkotakbaz/rain/client/util/render/engine/dispatcher/RenderDispatcher;", "dispatcher", "Lkotakbaz/rain/client/util/render/engine/dispatcher/RenderDispatcher;", "getDispatcher", "()Lkotakbaz/rain/client/util/render/engine/dispatcher/RenderDispatcher;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nLayerControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerControl.kt\nkotakbaz/rain/client/util/render/engine/controls/LayerControl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,26:1\n1915#2,2:27\n*S KotlinDebug\n*F\n+ 1 LayerControl.kt\nkotakbaz/rain/client/util/render/engine/controls/LayerControl\n*L\n15#1:27,2\n*E\n"})
public final class LayerControl {
    @NotNull
    public static final LayerControl INSTANCE = new LayerControl();
    @NotNull
    private static final List<a_0> renderers = new ArrayList();
    @NotNull
    private static final RenderDispatcher dispatcher = new RenderDispatcher();

    private LayerControl() {
        super();
    }

    @NotNull
    public final RenderDispatcher getDispatcher() {
        return dispatcher;
    }

    public final void loadShaders(a_0 ... renderable) {
        Intrinsics.checkNotNullParameter(renderable, "renderable");
        CollectionsKt.addAll((Collection)renderers, renderable);
    }

    public final void loadRender() {
        Iterable $this$forEach$iv = renderers;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            a_0 it = (a_0)element$iv;
            boolean bl = false;
            it.load();
        }
    }

    public final void flushAll() {
        dispatcher.flushAll();
    }

    public final void flushPipelines(ClientRenderPipeline ... pipelines) {
        Intrinsics.checkNotNullParameter(pipelines, "pipelines");
        dispatcher.flushPipelines(Arrays.copyOf(pipelines, pipelines.length));
    }
}

