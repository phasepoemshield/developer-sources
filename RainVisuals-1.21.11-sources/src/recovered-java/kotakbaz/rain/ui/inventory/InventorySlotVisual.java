/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemStack
 */
package kotakbaz.rain.ui.inventory;

import kotakbaz.rain.ui.inventory.InventorySlotState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bH\u00c6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u0006H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001c\u001a\u00020\u001bH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013\u00a8\u0006&"}, d2={"Loxxxde/\u0633\u0642;", "", "Loxxxde/\u0631\u064d;", "state", "Lnet/minecraft/class_1799;", "expected", "", "destination", "", "available", "<init>", "(Lkotakbaz/rain/ui/inventory/InventorySlotState;Lnet/minecraft/class_1799;Ljava/lang/Integer;Z)V", "component1", "()Lkotakbaz/rain/ui/inventory/InventorySlotState;", "component2", "()Lnet/minecraft/class_1799;", "component3", "()Ljava/lang/Integer;", "component4", "()Z", "copy", "(Lkotakbaz/rain/ui/inventory/InventorySlotState;Lnet/minecraft/class_1799;Ljava/lang/Integer;Z)Lkotakbaz/rain/ui/inventory/InventorySlotVisual;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Loxxxde/\u0631\u064d;", "getState", "Lnet/minecraft/class_1799;", "getExpected", "Ljava/lang/Integer;", "getDestination", "Z", "getAvailable", "rain-visuals"})
public final class InventorySlotVisual {
    @NotNull
    private final ItemStack expected;
    @NotNull
    private final InventorySlotState state;
    private final boolean available;
    @Nullable
    private final Integer destination;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InventorySlotVisual)) {
            return false;
        }
        InventorySlotVisual inventorySlotVisual = (InventorySlotVisual)other;
        if (this.state != inventorySlotVisual.state) {
            return false;
        }
        if (!Intrinsics.areEqual(this.expected, inventorySlotVisual.expected)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.destination, inventorySlotVisual.destination)) {
            return false;
        }
        if (this.available != inventorySlotVisual.available) {
            return false;
        }
        return true;
    }

    @Nullable
    public final Integer getDestination() {
        return this.destination;
    }

    @NotNull
    public final InventorySlotState component1() {
        return this.state;
    }

    @NotNull
    public final ItemStack component2() {
        return this.expected;
    }

    @NotNull
    public String toString() {
        return "InventorySlotVisual(state=" + this.state + ", expected=" + this.expected + ", destination=" + this.destination + ", available=" + this.available + ")";
    }

    public InventorySlotVisual(@NotNull InventorySlotState state, @NotNull ItemStack expected, @Nullable Integer destination, boolean available) {
        Intrinsics.checkNotNullParameter((Object)state, "state");
        Intrinsics.checkNotNullParameter(expected, "expected");
        this.state = state;
        this.expected = expected;
        this.destination = destination;
        this.available = available;
    }

    @NotNull
    public final ItemStack getExpected() {
        return this.expected;
    }

    public static /* synthetic */ InventorySlotVisual copy$default(InventorySlotVisual inventorySlotVisual, InventorySlotState inventorySlotState, ItemStack itemStack, Integer n, boolean bl, int n2, Object object) {
        if ((n2 & 1) != 0) {
            inventorySlotState = inventorySlotVisual.state;
        }
        if ((n2 & 2) != 0) {
            itemStack = inventorySlotVisual.expected;
        }
        if ((n2 & 4) != 0) {
            n = inventorySlotVisual.destination;
        }
        if ((n2 & 8) != 0) {
            bl = inventorySlotVisual.available;
        }
        return inventorySlotVisual.copy(inventorySlotState, itemStack, n, bl);
    }

    public final boolean getAvailable() {
        return this.available;
    }

    public final boolean component4() {
        return this.available;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        void var1_1;
        int result = this.state.hashCode();
        result = result * 31 + this.expected.hashCode();
        result = result * 31 + (this.destination == null ? 0 : ((Object)this.destination).hashCode());
        result = result * 31 + Boolean.hashCode(this.available);
        return (int)var1_1;
    }

    public /* synthetic */ InventorySlotVisual(InventorySlotState inventorySlotState, ItemStack itemStack, Integer n, boolean bl, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 4) != 0) {
            n = null;
        }
        if ((n2 & 8) != 0) {
            bl = false;
        }
        this(inventorySlotState, itemStack, n, bl);
    }

    @Nullable
    public final Integer component3() {
        return this.destination;
    }

    @NotNull
    public final InventorySlotState getState() {
        return this.state;
    }

    @NotNull
    public final InventorySlotVisual copy(@NotNull InventorySlotState state, @NotNull ItemStack expected, @Nullable Integer destination, boolean available) {
        Intrinsics.checkNotNullParameter((Object)state, "state");
        Intrinsics.checkNotNullParameter(expected, "expected");
        return new InventorySlotVisual(state, expected, destination, available);
    }
}

