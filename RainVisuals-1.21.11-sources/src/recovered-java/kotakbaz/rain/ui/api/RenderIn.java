/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.api;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Loxxxde/\u0630\u062b;", "", "<init>", "(Ljava/lang/String;I)V", "HUD", "GUI", "WINDOW", "rain-visuals"})
public final class RenderIn
extends Enum<RenderIn> {
    public static final /* enum */ RenderIn HUD = new RenderIn();
    private static final /* synthetic */ RenderIn[] $VALUES;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* enum */ RenderIn WINDOW;
    public static final /* enum */ RenderIn GUI;

    @NotNull
    public static EnumEntries<RenderIn> getEntries() {
        return $ENTRIES;
    }

    public static RenderIn valueOf(String value) {
        return Enum.valueOf(RenderIn.class, value);
    }

    public static RenderIn[] values() {
        return (RenderIn[])$VALUES.clone();
    }

    private static final /* synthetic */ RenderIn[] $values() {
        RenderIn[] renderInArray = new RenderIn[3];
        renderInArray[0] = HUD;
        renderInArray[1] = GUI;
        renderInArray[2] = WINDOW;
        return renderInArray;
    }

    static {
        GUI = new RenderIn();
        WINDOW = new RenderIn();
        $VALUES = RenderIn.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }
}

