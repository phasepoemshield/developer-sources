/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 */
package kotakbaz.rain.client.util.render.display;

import java.awt.Color;
import kotakbaz.rain.client.render.main.vertex.mesh.MeshBuilder;
import kotakbaz.rain.client.util.color.QuadColor;
import kotakbaz.rain.client.util.render.engine.Renderable;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector4f;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH$\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0004\u00a2\u0006\u0004\b\u0018\u0010\u0019JG\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0004\u00a2\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00138\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u00178\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u00178\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010%\u00a8\u0006-"}, d2={"Loxxxde/\u062c\u0628;", "Loxxxde/\u0637\u0621;", "<init>", "()V", "Loxxxde/\u0627\u0646;", "builder", "", "x", "y", "width", "height", "radius", "", "index", "", "extra", "", "uploadVertex", "(Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;FFFFFI[F)V", "Loxxxde/\u0635\u0624;", "pipeline", "priority", "(Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/RectRenderer;", "Lorg/joml/Vector4f;", "calcSmoothness", "(FFFF)Lorg/joml/Vector4f;", "buildQuad", "(Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;FFFFLorg/joml/Vector4f;[F)V", "currentPipeline", "Loxxxde/\u0635\u0624;", "getCurrentPipeline", "()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "setCurrentPipeline", "(Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)V", "cachedRadius", "Lorg/joml/Vector4f;", "getCachedRadius", "()Lorg/joml/Vector4f;", "Loxxxde/\u0633\u0629;", "cachedColor", "Loxxxde/\u0633\u0629;", "getCachedColor", "()Lkotakbaz/rain/client/util/color/QuadColor;", "cachedCoords", "getCachedCoords", "rain-visuals"})
public abstract class RectRenderer
extends Renderable {
    @NotNull
    private final Vector4f cachedCoords;
    @NotNull
    private ClientRenderPipeline currentPipeline = ClientRenderPipeline.LOW;
    @NotNull
    private final QuadColor cachedColor;
    @NotNull
    private final Vector4f cachedRadius = new Vector4f();

    @NotNull
    protected final ClientRenderPipeline getCurrentPipeline() {
        return this.currentPipeline;
    }

    public RectRenderer() {
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        this.cachedColor = new QuadColor(color);
        this.cachedCoords = new Vector4f();
    }

    @NotNull
    protected final Vector4f calcSmoothness(float x, float y, float width, float height) {
        Vector4f vector4f = this.cachedCoords.set(x, y, width, height);
        Intrinsics.checkNotNullExpressionValue(vector4f, "set(...)");
        return vector4f;
    }

    @NotNull
    protected final Vector4f getCachedRadius() {
        return this.cachedRadius;
    }

    protected final void setCurrentPipeline(@NotNull ClientRenderPipeline clientRenderPipeline) {
        Intrinsics.checkNotNullParameter((Object)clientRenderPipeline, "<set-?>");
        this.currentPipeline = clientRenderPipeline;
    }

    @NotNull
    protected final Vector4f getCachedCoords() {
        return this.cachedCoords;
    }

    @NotNull
    protected final QuadColor getCachedColor() {
        return this.cachedColor;
    }

    protected final void buildQuad(@NotNull MeshBuilder builder, float x, float y, float width, float height, @NotNull Vector4f radius, @NotNull float[] extra) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(radius, "radius");
        Intrinsics.checkNotNullParameter(extra, "extra");
        this.uploadVertex(builder, x, y, width, height, radius.x, 0, extra);
        this.uploadVertex(builder, x, y + height, width, height, radius.z, 1, extra);
        this.uploadVertex(builder, x + width, y + height, width, height, radius.w, 2, extra);
        this.uploadVertex(builder, x + width, y, width, height, radius.y, 3, extra);
    }

    @NotNull
    public final RectRenderer priority(@NotNull ClientRenderPipeline pipeline) {
        Intrinsics.checkNotNullParameter((Object)pipeline, "pipeline");
        this.currentPipeline = pipeline;
        return this;
    }

    protected abstract void uploadVertex(@NotNull MeshBuilder var1, float var2, float var3, float var4, float var5, float var6, int var7, @NotNull float[] var8);
}

