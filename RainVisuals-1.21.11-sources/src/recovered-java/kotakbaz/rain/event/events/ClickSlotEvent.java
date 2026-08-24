/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.screen.slot.SlotActionType
 */
package kotakbaz.rain.event.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.screen.slot.SlotActionType;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0633\u0636;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u0012"}, d2={"Loxxxde/\u062a\u063a;", "Loxxxde/\u0633\u0636;", "Lnet/minecraft/class_1713;", "slotActionType", "", "slot", "button", "syncId", "<init>", "(Lnet/minecraft/class_1713;III)V", "Lnet/minecraft/class_1713;", "getSlotActionType", "()Lnet/minecraft/class_1713;", "I", "getSlot", "()I", "getButton", "getSyncId", "rain-visuals"})
public final class ClickSlotEvent
extends \u0633\u0636 {
    @NotNull
    private final SlotActionType slotActionType;
    private final int syncId;
    private final int slot;
    private final int button;

    @NotNull
    public final SlotActionType getSlotActionType() {
        return this.slotActionType;
    }

    public final int getButton() {
        return this.button;
    }

    public final int getSlot() {
        return this.slot;
    }

    public final int getSyncId() {
        return this.syncId;
    }

    public ClickSlotEvent(@NotNull SlotActionType slotActionType, int slot, int button, int syncId) {
        Intrinsics.checkNotNullParameter(slotActionType, "slotActionType");
        this.slotActionType = slotActionType;
        this.slot = slot;
        this.button = button;
        this.syncId = syncId;
    }
}

