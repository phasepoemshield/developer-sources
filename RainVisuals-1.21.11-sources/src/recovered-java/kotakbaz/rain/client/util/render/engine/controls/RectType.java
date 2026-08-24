/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.engine.controls;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2={"Loxxxde/\u0631\u0635;", "", "", "value", "<init>", "(Ljava/lang/String;IB)V", "B", "getValue", "()B", "BASIC", "TEXTURE", "rain-visuals"})
public final class RectType
extends Enum<RectType> {
    private final byte value;
    public static final /* enum */ RectType TEXTURE;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* enum */ RectType BASIC;
    private static final /* synthetic */ RectType[] $VALUES;

    public final byte getValue() {
        return this.value;
    }

    @NotNull
    public static EnumEntries<RectType> getEntries() {
        return $ENTRIES;
    }

    public static RectType valueOf(String value) {
        return Enum.valueOf(RectType.class, value);
    }

    public static RectType[] values() {
        return (RectType[])$VALUES.clone();
    }

    static {
        BASIC = new RectType(0);
        TEXTURE = new RectType(1);
        $VALUES = RectType.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }

    private RectType(byte value) {
        this.value = value;
    }

    private static final /* synthetic */ RectType[] $values() {
        RectType[] rectTypeArray = new RectType[2];
        rectTypeArray[0] = BASIC;
        rectTypeArray[1] = TEXTURE;
        return rectTypeArray;
    }
}

