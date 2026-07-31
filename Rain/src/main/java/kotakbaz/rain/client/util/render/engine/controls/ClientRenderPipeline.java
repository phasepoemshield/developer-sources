/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.engine.controls;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010\u00a8\u0006\u0011"}, d2={"Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "", "<init>", "(Ljava/lang/String;I)V", "WINDOW_TEXT", "WINDOW_SPECIAL", "WINDOW_RECT", "GUI_TEXT", "GUI_SPECIAL", "GUI_RECT", "HUD_TEXT", "HUD_SPECIAL", "HUD_RECT", "HIGH", "MEDIUM", "LOW", "WORLD", "rain-visuals"})
public final class ClientRenderPipeline
extends Enum<ClientRenderPipeline> {
    public static final /* enum */ ClientRenderPipeline WINDOW_TEXT = new ClientRenderPipeline();
    public static final /* enum */ ClientRenderPipeline WINDOW_SPECIAL = new ClientRenderPipeline();
    public static final /* enum */ ClientRenderPipeline WINDOW_RECT = new ClientRenderPipeline();
    public static final /* enum */ ClientRenderPipeline GUI_TEXT = new ClientRenderPipeline();
    public static final /* enum */ ClientRenderPipeline GUI_SPECIAL = new ClientRenderPipeline();
    public static final /* enum */ ClientRenderPipeline GUI_RECT = new ClientRenderPipeline();
    public static final /* enum */ ClientRenderPipeline HUD_TEXT = new ClientRenderPipeline();
    public static final /* enum */ ClientRenderPipeline HUD_SPECIAL = new ClientRenderPipeline();
    public static final /* enum */ ClientRenderPipeline HUD_RECT = new ClientRenderPipeline();
    public static final /* enum */ ClientRenderPipeline HIGH = new ClientRenderPipeline();
    public static final /* enum */ ClientRenderPipeline MEDIUM = new ClientRenderPipeline();
    public static final /* enum */ ClientRenderPipeline LOW = new ClientRenderPipeline();
    public static final /* enum */ ClientRenderPipeline WORLD = new ClientRenderPipeline();
    private static final /* synthetic */ ClientRenderPipeline[] $VALUES;
    private static final /* synthetic */ EnumEntries $ENTRIES;

    public static ClientRenderPipeline[] values() {
        return (ClientRenderPipeline[])$VALUES.clone();
    }

    public static ClientRenderPipeline valueOf(String value2) {
        return Enum.valueOf(ClientRenderPipeline.class, value2);
    }

    @NotNull
    public static EnumEntries<ClientRenderPipeline> getEntries() {
        return $ENTRIES;
    }

    static {
        $VALUES = clientRenderPipelineArray = new ClientRenderPipeline[]{ClientRenderPipeline.WINDOW_TEXT, ClientRenderPipeline.WINDOW_SPECIAL, ClientRenderPipeline.WINDOW_RECT, ClientRenderPipeline.GUI_TEXT, ClientRenderPipeline.GUI_SPECIAL, ClientRenderPipeline.GUI_RECT, ClientRenderPipeline.HUD_TEXT, ClientRenderPipeline.HUD_SPECIAL, ClientRenderPipeline.HUD_RECT, ClientRenderPipeline.HIGH, ClientRenderPipeline.MEDIUM, ClientRenderPipeline.LOW, ClientRenderPipeline.WORLD};
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }
}

