/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.engine.controls;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Loxxxde/\u062f\u064d;", "", "<init>", "(Ljava/lang/String;I)V", "BASIC", "TEXTURED", "rain-visuals"})
public final class RectGroup
extends Enum<RectGroup> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RectGroup[] $VALUES;
    public static final /* enum */ RectGroup BASIC = new RectGroup();
    public static final /* enum */ RectGroup TEXTURED = new RectGroup();

    static {
        $VALUES = RectGroup.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }

    private static final /* synthetic */ RectGroup[] $values() {
        RectGroup[] rectGroupArray = new RectGroup[2];
        rectGroupArray[0] = BASIC;
        rectGroupArray[1] = TEXTURED;
        return rectGroupArray;
    }

    public static RectGroup valueOf(String value) {
        return Enum.valueOf(RectGroup.class, value);
    }

    @NotNull
    public static EnumEntries<RectGroup> getEntries() {
        return $ENTRIES;
    }

    public static RectGroup[] values() {
        return (RectGroup[])$VALUES.clone();
    }
}

