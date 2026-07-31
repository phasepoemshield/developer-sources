/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.engine.dispatcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.client.render.main.vertex.format.a_0;
import kotakbaz.rain.client.util.render.engine.Renderable;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.engine.dispatcher.RenderBatch;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f\"\u00020\u0004\u00a2\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0011\u0010\u0003R&\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2={"Lkotakbaz/rain/client/util/render/engine/dispatcher/RenderDispatcher;", "", "<init>", "()V", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "pipeline", "Lkotakbaz/rain/client/util/render/engine/Renderable;", "renderer", "state", "Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;", "getBuilder", "(Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;Lkotakbaz/rain/client/util/render/engine/Renderable;Ljava/lang/Object;)Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;", "", "pipelines", "", "flushPipelines", "([Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)V", "flushAll", "", "", "Lkotakbaz/rain/client/util/render/engine/dispatcher/RenderBatch;", "queues", "Ljava/util/Map;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nRenderDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderDispatcher.kt\nkotakbaz/rain/client/util/render/engine/dispatcher/RenderDispatcher\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,64:1\n37#2,2:65\n*S KotlinDebug\n*F\n+ 1 RenderDispatcher.kt\nkotakbaz/rain/client/util/render/engine/dispatcher/RenderDispatcher\n*L\n61#1:65,2\n*E\n"})
public final class RenderDispatcher {
    @NotNull
    private final Map<ClientRenderPipeline, List<RenderBatch>> queues = new EnumMap(ClientRenderPipeline.class);

    public RenderDispatcher() {
        for (ClientRenderPipeline pipe : ClientRenderPipeline.getEntries()) {
            this.queues.put(pipe, new ArrayList());
        }
    }

    @Nullable
    public final kotakbaz.rain.client.render.main.vertex.mesh.a_0 getBuilder(@NotNull ClientRenderPipeline pipeline, @NotNull Renderable renderer, @Nullable Object state2) {
        Intrinsics.checkNotNullParameter((Object)pipeline, "pipeline");
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        List<RenderBatch> list = this.queues.get((Object)pipeline);
        Intrinsics.checkNotNull(list);
        List<RenderBatch> queue = list;
        if (!queue.isEmpty()) {
            boolean sameOrCompatibleOwner;
            RenderBatch lastBatch = CollectionsKt.last(queue);
            boolean bl = sameOrCompatibleOwner = lastBatch.getOwner() == renderer || lastBatch.getOwner().canBatchWith(renderer) && renderer.canBatchWith(lastBatch.getOwner());
            if (sameOrCompatibleOwner && renderer.isBatchCompatible(lastBatch.getState(), state2)) {
                return lastBatch.getBuilder();
            }
        }
        kotakbaz.rain.client.render.main.vertex.a_0 a_02 = renderer.drawMode();
        if (a_02 == null) {
            return null;
        }
        kotakbaz.rain.client.render.main.vertex.a_0 drawMode = a_02;
        a_0 a_03 = renderer.vertexFormat();
        if (a_03 == null) {
            return null;
        }
        a_0 vertexFormat = a_03;
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 newBuilder = ChromaRenderer.borrowMeshBuilder(drawMode, vertexFormat);
        RenderBatch newBatch = new RenderBatch(renderer, newBuilder, state2);
        queue.add(newBatch);
        return newBuilder;
    }

    public final void flushPipelines(ClientRenderPipeline ... pipelines) {
        Intrinsics.checkNotNullParameter(pipelines, "pipelines");
        for (ClientRenderPipeline pipe : pipelines) {
            List<RenderBatch> queue;
            Intrinsics.checkNotNull(this.queues.get((Object)pipe));
            for (RenderBatch batch : queue) {
                batch.flush();
            }
            queue.clear();
        }
    }

    public final void flushAll() {
        Collection $this$toTypedArray$iv = ClientRenderPipeline.getEntries();
        boolean $i$f$toTypedArray = false;
        Collection thisCollection$iv = $this$toTypedArray$iv;
        ClientRenderPipeline[] clientRenderPipelineArray = thisCollection$iv.toArray(new ClientRenderPipeline[0]);
        this.flushPipelines(Arrays.copyOf(clientRenderPipelineArray, clientRenderPipelineArray.length));
    }
}

