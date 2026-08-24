/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.engine.controls;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010\u00a8\u0006\u0011"}, d2={"Loxxxde/\u0635\u0624;", "", "<init>", "(Ljava/lang/String;I)V", "WINDOW_TEXT", "WINDOW_SPECIAL", "WINDOW_RECT", "GUI_TEXT", "GUI_SPECIAL", "GUI_RECT", "HUD_TEXT", "HUD_SPECIAL", "HUD_RECT", "HIGH", "MEDIUM", "LOW", "WORLD", "rain-visuals"})
public final class ClientRenderPipeline
extends Enum<ClientRenderPipeline> {
    public static final /* enum */ ClientRenderPipeline WINDOW_SPECIAL;
    public static final /* enum */ ClientRenderPipeline WORLD;
    public static final /* enum */ ClientRenderPipeline GUI_TEXT;
    public static final /* enum */ ClientRenderPipeline HUD_SPECIAL;
    public static final /* enum */ ClientRenderPipeline LOW;
    public static final /* enum */ ClientRenderPipeline GUI_SPECIAL;
    private static final /* synthetic */ ClientRenderPipeline[] $VALUES;
    public static final /* enum */ ClientRenderPipeline MEDIUM;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* enum */ ClientRenderPipeline WINDOW_RECT;
    public static final /* enum */ ClientRenderPipeline HUD_RECT;
    public static final /* enum */ ClientRenderPipeline GUI_RECT;
    public static final /* enum */ ClientRenderPipeline HIGH;
    public static final /* enum */ ClientRenderPipeline HUD_TEXT;
    public static final /* enum */ ClientRenderPipeline WINDOW_TEXT;

    public static ClientRenderPipeline[] values() {
        return (ClientRenderPipeline[])$VALUES.clone();
    }

    @NotNull
    public static EnumEntries<ClientRenderPipeline> getEntries() {
        return $ENTRIES;
    }

    public static ClientRenderPipeline valueOf(String value) {
        return Enum.valueOf(ClientRenderPipeline.class, value);
    }

    static {
        WINDOW_TEXT = new ClientRenderPipeline();
        WINDOW_SPECIAL = new ClientRenderPipeline();
        WINDOW_RECT = new ClientRenderPipeline();
        GUI_TEXT = new ClientRenderPipeline();
        GUI_SPECIAL = new ClientRenderPipeline();
        GUI_RECT = new ClientRenderPipeline();
        HUD_TEXT = new ClientRenderPipeline();
        HUD_SPECIAL = new ClientRenderPipeline();
        HUD_RECT = new ClientRenderPipeline();
        HIGH = new ClientRenderPipeline();
        MEDIUM = new ClientRenderPipeline();
        LOW = new ClientRenderPipeline();
        WORLD = new ClientRenderPipeline();
        $VALUES = ClientRenderPipeline.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }

    private static final /* synthetic */ ClientRenderPipeline[] $values() {
        ClientRenderPipeline[] clientRenderPipelineArray = new ClientRenderPipeline[13];
        clientRenderPipelineArray[0] = WINDOW_TEXT;
        clientRenderPipelineArray[1] = WINDOW_SPECIAL;
        clientRenderPipelineArray[2] = WINDOW_RECT;
        clientRenderPipelineArray[3] = GUI_TEXT;
        clientRenderPipelineArray[4] = GUI_SPECIAL;
        clientRenderPipelineArray[5] = GUI_RECT;
        clientRenderPipelineArray[6] = HUD_TEXT;
        clientRenderPipelineArray[7] = HUD_SPECIAL;
        clientRenderPipelineArray[8] = HUD_RECT;
        clientRenderPipelineArray[9] = HIGH;
        clientRenderPipelineArray[10] = MEDIUM;
        clientRenderPipelineArray[11] = LOW;
        clientRenderPipelineArray[12] = WORLD;
        return clientRenderPipelineArray;
    }
}

