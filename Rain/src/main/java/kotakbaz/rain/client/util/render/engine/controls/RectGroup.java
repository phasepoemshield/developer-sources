/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.engine.controls;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lkotakbaz/rain/client/util/render/engine/controls/RectGroup;", "", "<init>", "(Ljava/lang/String;I)V", "BASIC", "TEXTURED", "rain-visuals"})
public final class RectGroup
extends Enum<RectGroup> {
    public static final /* enum */ RectGroup BASIC = new RectGroup();
    public static final /* enum */ RectGroup TEXTURED = new RectGroup();
    private static final /* synthetic */ RectGroup[] $VALUES;
    private static final /* synthetic */ EnumEntries $ENTRIES;

    public static RectGroup[] values() {
        return (RectGroup[])$VALUES.clone();
    }

    public static RectGroup valueOf(String value2) {
        return Enum.valueOf(RectGroup.class, value2);
    }

    @NotNull
    public static EnumEntries<RectGroup> getEntries() {
        return $ENTRIES;
    }

    static {
        $VALUES = rectGroupArray = new RectGroup[]{RectGroup.BASIC, RectGroup.TEXTURED};
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }
}

