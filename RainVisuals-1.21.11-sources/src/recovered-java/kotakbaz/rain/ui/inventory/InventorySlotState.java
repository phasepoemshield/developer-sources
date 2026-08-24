/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.inventory;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2={"Loxxxde/\u0631\u064d;", "", "<init>", "(Ljava/lang/String;I)V", "CORRECT", "MISSING", "MISPLACED", "CONFLICT", "rain-visuals"})
public final class InventorySlotState
extends Enum<InventorySlotState> {
    private static final /* synthetic */ InventorySlotState[] $VALUES;
    public static final /* enum */ InventorySlotState CONFLICT;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* enum */ InventorySlotState CORRECT;
    public static final /* enum */ InventorySlotState MISPLACED;
    public static final /* enum */ InventorySlotState MISSING;

    @NotNull
    public static EnumEntries<InventorySlotState> getEntries() {
        return $ENTRIES;
    }

    static {
        CORRECT = new InventorySlotState();
        MISSING = new InventorySlotState();
        MISPLACED = new InventorySlotState();
        CONFLICT = new InventorySlotState();
        $VALUES = InventorySlotState.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }

    public static InventorySlotState[] values() {
        return (InventorySlotState[])$VALUES.clone();
    }

    public static InventorySlotState valueOf(String value) {
        return Enum.valueOf(InventorySlotState.class, value);
    }

    private static final /* synthetic */ InventorySlotState[] $values() {
        InventorySlotState[] inventorySlotStateArray = new InventorySlotState[4];
        inventorySlotStateArray[0] = CORRECT;
        inventorySlotStateArray[1] = MISSING;
        inventorySlotStateArray[2] = MISPLACED;
        inventorySlotStateArray[3] = CONFLICT;
        return inventorySlotStateArray;
    }
}

