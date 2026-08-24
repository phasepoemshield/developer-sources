/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.engine;

import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.client.render.main.builders.GlProgramBuilder;
import kotakbaz.rain.client.render.main.program.GlProgram;
import kotakbaz.rain.client.render.main.program.a;
import kotakbaz.rain.client.render.main.vertex.DrawMode;
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat;
import kotakbaz.rain.client.render.main.vertex.mesh.IMesh;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u062d\u0622;
import oxxxde.\u0631\u0633;
import oxxxde.\u0632\u062b;
import oxxxde.\u0633\u064a;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u0007\u0010\u0006J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH&\u00a2\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH&\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&\u00a2\u0006\u0004\b\u000f\u0010\u0003J#\u0010\u0013\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0000H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ/\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000e\u00a2\u0006\u0004\b\"\u0010\u0003J\u0017\u0010%\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010#\u00a2\u0006\u0004\b%\u0010&R$\u0010'\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010&\u00a8\u0006-"}, d2={"Loxxxde/\u0637\u0621;", "", "<init>", "()V", "", "name", "()Ljava/lang/String;", "shader", "Loxxxde/\u0634\u0645;", "drawMode", "()Lkotakbaz/rain/client/render/main/vertex/DrawMode;", "Loxxxde/\u0633\u0627;", "vertexFormat", "()Lkotakbaz/rain/client/render/main/vertex/format/VertexFormat;", "", "load", "oldState", "newState", "", "isBatchCompatible", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "other", "canBatchWith", "(Lkotakbaz/rain/client/util/render/engine/Renderable;)Z", "Loxxxde/\u0637\u0623;", "mesh", "state", "renderBatch", "(Lkotakbaz/rain/client/render/main/vertex/mesh/IMesh;Ljava/lang/Object;)V", "fsh", "vsh", "Loxxxde/\u062d\u062e;", "createShaderBuilder", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotakbaz/rain/client/render/main/builders/GlProgramBuilder;", "initMatrix", "Loxxxde/\u062e\u0631;", "globalProgram", "setGlobalProgram", "(Lkotakbaz/rain/client/render/main/program/GlProgram;)V", "glProgram", "Loxxxde/\u062e\u0631;", "getGlProgram", "()Lkotakbaz/rain/client/render/main/program/GlProgram;", "setGlProgram", "Companion", "rain-visuals"})
public abstract class Renderable {
    @NotNull
    private static final String SHADER_CORE_PATH;
    @NotNull
    public static final \u0633\u064a Companion;
    @NotNull
    private static final String SHADER_PATH;
    @NotNull
    private static final String SHADER_INCLUDE_PATH;
    @Nullable
    private GlProgram glProgram;

    public void renderBatch(@Nullable IMesh mesh, @Nullable Object state) {
        this.setGlobalProgram(this.glProgram);
        this.initMatrix();
        ChromaRenderer.draw(mesh);
    }

    public final void initMatrix() {
        ChromaRenderer.initMatrix();
    }

    @NotNull
    public final GlProgramBuilder<?> createShaderBuilder(@Nullable String name, @Nullable String fsh, @Nullable String vsh) {
        a[] aArray = new a[1];
        aArray[0] = ChromaRenderer.matrixSnippet;
        GlProgramBuilder<String> glProgramBuilder = \u0631\u0633.IN_JAR.createProgramBuilder(aArray).name(name).shader(\u0631\u0633.IN_JAR.createGlslFileEntry(name + "-vertex", SHADER_CORE_PATH + vsh + ".vsh"), \u062d\u0622.Vertex).shader(\u0631\u0633.IN_JAR.createGlslFileEntry(name + "-fragment", SHADER_CORE_PATH + fsh + ".fsh"), \u062d\u0622.Fragment);
        Intrinsics.checkNotNullExpressionValue(glProgramBuilder, "shader(...)");
        return glProgramBuilder;
    }

    @Nullable
    public abstract VertexFormat vertexFormat();

    @NotNull
    public abstract String shader();

    public boolean isBatchCompatible(@Nullable Object oldState, @Nullable Object newState) {
        return Intrinsics.areEqual(oldState, newState);
    }

    public static final /* synthetic */ String access$getSHADER_PATH$cp() {
        return SHADER_PATH;
    }

    @NotNull
    public abstract String name();

    public final void setGlobalProgram(@Nullable GlProgram globalProgram) {
        ChromaRenderer.setGlobalProgram(globalProgram);
    }

    public abstract void load();

    public boolean canBatchWith(@NotNull Renderable other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this == other;
    }

    @Nullable
    public abstract DrawMode drawMode();

    public final void setGlProgram(@Nullable GlProgram glProgram) {
        this.glProgram = glProgram;
    }

    @Nullable
    public final GlProgram getGlProgram() {
        return this.glProgram;
    }

    static {
        Companion = new \u0633\u064a(null);
        SHADER_PATH = "assets/" + \u0632\u062b.getCLIENT_ID() + "/shaders/";
        SHADER_CORE_PATH = SHADER_PATH + "core/";
        SHADER_INCLUDE_PATH = SHADER_PATH + "include/";
    }

    public static final /* synthetic */ String access$getSHADER_INCLUDE_PATH$cp() {
        return SHADER_INCLUDE_PATH;
    }

    public static final /* synthetic */ String access$getSHADER_CORE_PATH$cp() {
        return SHADER_CORE_PATH;
    }
}

