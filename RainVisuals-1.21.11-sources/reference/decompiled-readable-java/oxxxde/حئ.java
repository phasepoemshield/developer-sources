/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.List;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.ui.api.RenderIn;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0637\u064c;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\f\u00a8\u0006\u000f"}, d2={"Loxxxde/\u062d\u0626;", "", "<init>", "()V", "Loxxxde/\u0630\u062b;", "renderIn", "", "Loxxxde/\u0635\u0624;", "getPipelines", "(Lkotakbaz/rain/ui/api/RenderIn;)Ljava/util/List;", "", "HUD_PIPELINES", "[Loxxxde/\u0635\u0624;", "GUI_PIPELINES", "WINDOW_PIPELINES", "rain-visuals"})
public final class \u062d\u0626 {
    @NotNull
    private static final ClientRenderPipeline[] HUD_PIPELINES;
    @NotNull
    private static final ClientRenderPipeline[] GUI_PIPELINES;
    @NotNull
    public static final \u062d\u0626 INSTANCE;
    @NotNull
    private static final ClientRenderPipeline[] WINDOW_PIPELINES;

    @NotNull
    public final List<ClientRenderPipeline> getPipelines(@NotNull RenderIn renderIn) {
        Intrinsics.checkNotNullParameter((Object)renderIn, "renderIn");
        return switch (\u0637\u064c.$EnumSwitchMapping$0[renderIn.ordinal()]) {
            case 1 -> ArraysKt.asList(HUD_PIPELINES);
            case 2 -> ArraysKt.asList(GUI_PIPELINES);
            case 3 -> ArraysKt.asList(WINDOW_PIPELINES);
            default -> throw new NoWhenBranchMatchedException();
        };
    }

    private \u062d\u0626() {
    }

    static {
        INSTANCE = new \u062d\u0626();
        ClientRenderPipeline[] clientRenderPipelineArray = new ClientRenderPipeline[3];
        clientRenderPipelineArray[0] = ClientRenderPipeline.HUD_RECT;
        clientRenderPipelineArray[1] = ClientRenderPipeline.HUD_SPECIAL;
        clientRenderPipelineArray[2] = ClientRenderPipeline.HUD_TEXT;
        HUD_PIPELINES = clientRenderPipelineArray;
        clientRenderPipelineArray = new ClientRenderPipeline[3];
        clientRenderPipelineArray[0] = ClientRenderPipeline.GUI_RECT;
        clientRenderPipelineArray[1] = ClientRenderPipeline.GUI_SPECIAL;
        clientRenderPipelineArray[2] = ClientRenderPipeline.GUI_TEXT;
        GUI_PIPELINES = clientRenderPipelineArray;
        clientRenderPipelineArray = new ClientRenderPipeline[3];
        clientRenderPipelineArray[0] = ClientRenderPipeline.WINDOW_RECT;
        clientRenderPipelineArray[1] = ClientRenderPipeline.WINDOW_SPECIAL;
        clientRenderPipelineArray[2] = ClientRenderPipeline.WINDOW_TEXT;
        WINDOW_PIPELINES = clientRenderPipelineArray;
    }
}

