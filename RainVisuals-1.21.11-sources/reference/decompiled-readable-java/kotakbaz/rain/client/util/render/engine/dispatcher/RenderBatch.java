/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.engine.dispatcher;

import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.client.render.main.vertex.mesh.MeshBuilder;
import kotakbaz.rain.client.util.render.engine.Renderable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0627\u0650;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\u0003J\r\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0004\b\r\u0010\u0003R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R(\u0010\b\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2={"Loxxxde/\u0633\u0644;", "", "<init>", "()V", "Loxxxde/\u0637\u0621;", "owner", "Loxxxde/\u0627\u0646;", "builder", "state", "set", "(Lkotakbaz/rain/client/util/render/engine/Renderable;Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;Ljava/lang/Object;)Lkotakbaz/rain/client/util/render/engine/dispatcher/RenderBatch;", "", "flush", "reset", "value", "Loxxxde/\u0637\u0621;", "getOwner", "()Lkotakbaz/rain/client/util/render/engine/Renderable;", "Loxxxde/\u0627\u0646;", "getBuilder", "()Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;", "Ljava/lang/Object;", "getState", "()Ljava/lang/Object;", "rain-visuals"})
public final class RenderBatch {
    @Nullable
    private Object state;
    @Nullable
    private MeshBuilder builder;
    @Nullable
    private Renderable owner;

    @Nullable
    public final Renderable getOwner() {
        return this.owner;
    }

    @NotNull
    public final RenderBatch set(@NotNull Renderable owner, @NotNull MeshBuilder builder, @Nullable Object state) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.owner = owner;
        this.builder = builder;
        this.state = state;
        return this;
    }

    @Nullable
    public final MeshBuilder getBuilder() {
        return this.builder;
    }

    @Nullable
    public final Object getState() {
        return this.state;
    }

    public final void reset() {
        this.owner = null;
        this.builder = null;
        this.state = null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void flush() {
        MeshBuilder meshBuilder = this.builder;
        if (meshBuilder == null) {
            return;
        }
        MeshBuilder currentBuilder = meshBuilder;
        Renderable renderable = this.owner;
        if (renderable == null) {
            return;
        }
        Renderable currentOwner = renderable;
        try {
            \u0627\u0650 mesh;
            \u0627\u0650 \u0627\u06502 = mesh = currentBuilder.buildNullable();
            if (\u0627\u06502 != null) {
                \u0627\u0650 it = \u0627\u06502;
                boolean bl = false;
                currentOwner.renderBatch(mesh, this.state);
            }
        }
        finally {
            ChromaRenderer.recycleMeshBuilder(currentBuilder);
        }
    }
}

