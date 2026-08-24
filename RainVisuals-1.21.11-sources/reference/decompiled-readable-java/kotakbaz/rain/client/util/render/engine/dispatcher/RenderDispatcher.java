/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.engine.dispatcher;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.client.render.main.vertex.mesh.MeshBuilder;
import kotakbaz.rain.client.util.render.engine.Renderable;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.engine.dispatcher.RenderBatch;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u062a\u064c;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f\"\u00020\u0004\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f\u00a2\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0015\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017R&\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u00a8\u0006!"}, d2={"Loxxxde/\u0628\u0626;", "", "<init>", "()V", "Loxxxde/\u0635\u0624;", "pipeline", "Loxxxde/\u0637\u0621;", "renderer", "state", "Loxxxde/\u0627\u0646;", "getBuilder", "(Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;Lkotakbaz/rain/client/util/render/engine/Renderable;Ljava/lang/Object;)Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;", "", "pipelines", "", "flushPipelines", "([Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)V", "flushPipelineArray", "", "hasQueued", "(Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Z", "flushAll", "flushPipeline", "(Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)V", "", "", "Loxxxde/\u0633\u0644;", "queues", "Ljava/util/Map;", "Ljava/util/ArrayDeque;", "batchPool", "Ljava/util/ArrayDeque;", "Companion", "rain-visuals"})
public final class RenderDispatcher {
    @Deprecated
    public static final int MAX_POOLED_BATCHES = 64;
    @NotNull
    private final ArrayDeque<RenderBatch> batchPool;
    @NotNull
    private final Map<ClientRenderPipeline, List<RenderBatch>> queues = new EnumMap(ClientRenderPipeline.class);
    @NotNull
    private static final \u062a\u064c Companion = new \u062a\u064c(null);

    public final boolean hasQueued(@NotNull ClientRenderPipeline pipeline) {
        Intrinsics.checkNotNullParameter((Object)pipeline, "pipeline");
        List<RenderBatch> list = this.queues.get((Object)pipeline);
        return list != null ? !((Collection)list).isEmpty() : false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void flushPipelineArray(@NotNull ClientRenderPipeline[] pipelines) {
        Intrinsics.checkNotNullParameter(pipelines, "pipelines");
        ChromaRenderer.beginDrawScope();
        try {
            int n = pipelines.length;
            for (int i = 0; i < n; ++i) {
                ClientRenderPipeline pipe = pipelines[i];
                this.flushPipeline(pipe);
            }
        }
        finally {
            ChromaRenderer.endDrawScope();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void flushAll() {
        ChromaRenderer.beginDrawScope();
        try {
            for (ClientRenderPipeline pipeline : ClientRenderPipeline.getEntries()) {
                this.flushPipeline(pipeline);
            }
        }
        finally {
            ChromaRenderer.endDrawScope();
        }
    }

    private final void flushPipeline(ClientRenderPipeline pipeline) {
        List<RenderBatch> list = this.queues.get((Object)pipeline);
        Intrinsics.checkNotNull(list);
        List<RenderBatch> queue = list;
        Iterator<RenderBatch> iterator2 = queue.iterator();
        while (iterator2.hasNext()) {
            RenderBatch batch = iterator2.next();
            batch.flush();
            batch.reset();
            if (this.batchPool.size() >= 64) continue;
            this.batchPool.addLast(batch);
        }
        queue.clear();
    }

    public RenderDispatcher() {
        this.batchPool = new ArrayDeque();
        for (ClientRenderPipeline pipe : ClientRenderPipeline.getEntries()) {
            this.queues.put(pipe, new ArrayList());
        }
    }

    public final void flushPipelines(ClientRenderPipeline ... pipelines) {
        Intrinsics.checkNotNullParameter(pipelines, "pipelines");
        this.flushPipelineArray(pipelines);
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public final MeshBuilder getBuilder(@NotNull ClientRenderPipeline pipeline, @NotNull Renderable renderer, @Nullable Object state) {
        block8: {
            Intrinsics.checkNotNullParameter((Object)pipeline, "pipeline");
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            v0 = this.queues.get((Object)pipeline);
            Intrinsics.checkNotNull(v0);
            queue = v0;
            if (queue.isEmpty()) break block8;
            lastBatch = CollectionsKt.last(queue);
            lastOwner = lastBatch.getOwner();
            if (lastOwner == renderer) ** GOTO lbl-1000
            if (lastOwner != null) {
                if (lastOwner.canBatchWith(renderer)) {
                    ** if (!renderer.canBatchWith((Renderable)lastOwner)) goto lbl-1000
                }
            }
            ** GOTO lbl-1000
lbl-1000:
            // 2 sources

            {
                v1 = true;
                ** GOTO lbl23
            }
lbl-1000:
            // 2 sources

            {
                v1 = false;
            }
lbl23:
            // 2 sources

            sameOrCompatibleOwner = v1;
            if (sameOrCompatibleOwner) {
                if (renderer.isBatchCompatible(lastBatch.getState(), state)) {
                    return lastBatch.getBuilder();
                }
            }
        }
        v2 = renderer.drawMode();
        if (v2 == null) {
            return null;
        }
        drawMode = v2;
        v3 = renderer.vertexFormat();
        if (v3 == null) {
            return null;
        }
        vertexFormat = v3;
        newBuilder = ChromaRenderer.borrowMeshBuilder(drawMode, vertexFormat);
        v4 = this.batchPool.isEmpty() ? new RenderBatch() : this.batchPool.removeLast();
        Intrinsics.checkNotNull(newBuilder);
        newBatch = v4.set(renderer, newBuilder, state);
        var4_4.add(var8_9);
        return var7_8;
    }
}

