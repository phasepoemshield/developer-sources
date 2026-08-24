/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.inventory;

import java.util.List;
import java.util.Map;
import kotakbaz.rain.ui.inventory.InventorySlotVisual;
import kotakbaz.rain.ui.inventory.MissingInventoryItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\u000eJ6\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\u0003H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u00020\u0017H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e\u00a8\u0006\u001e"}, d2={"Loxxxde/\u0633\u062e;", "", "", "", "Loxxxde/\u0633\u0642;", "visuals", "", "Loxxxde/\u0637\u0641;", "missingItems", "<init>", "(Ljava/util/Map;Ljava/util/List;)V", "component1", "()Ljava/util/Map;", "component2", "()Ljava/util/List;", "copy", "(Ljava/util/Map;Ljava/util/List;)Lkotakbaz/rain/ui/inventory/InventoryAnalysis;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getVisuals", "Ljava/util/List;", "getMissingItems", "rain-visuals"})
public final class InventoryAnalysis {
    @NotNull
    private final Map<Integer, InventorySlotVisual> visuals;
    @NotNull
    private final List<MissingInventoryItem> missingItems;

    @NotNull
    public final List<MissingInventoryItem> getMissingItems() {
        return this.missingItems;
    }

    @NotNull
    public final InventoryAnalysis copy(@NotNull Map<Integer, InventorySlotVisual> visuals, @NotNull List<MissingInventoryItem> missingItems) {
        Intrinsics.checkNotNullParameter(visuals, "visuals");
        Intrinsics.checkNotNullParameter(missingItems, "missingItems");
        return new InventoryAnalysis(visuals, missingItems);
    }

    public int hashCode() {
        int result = ((Object)this.visuals).hashCode();
        result = result * 31 + ((Object)this.missingItems).hashCode();
        return result;
    }

    public static /* synthetic */ InventoryAnalysis copy$default(InventoryAnalysis inventoryAnalysis, Map map, List list, int n, Object object) {
        if ((n & 1) != 0) {
            map = inventoryAnalysis.visuals;
        }
        if ((n & 2) != 0) {
            list = inventoryAnalysis.missingItems;
        }
        return inventoryAnalysis.copy(map, list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InventoryAnalysis)) {
            return false;
        }
        InventoryAnalysis inventoryAnalysis = (InventoryAnalysis)other;
        if (!Intrinsics.areEqual(this.visuals, inventoryAnalysis.visuals)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.missingItems, inventoryAnalysis.missingItems)) {
            return false;
        }
        return true;
    }

    public InventoryAnalysis(@NotNull Map<Integer, InventorySlotVisual> visuals, @NotNull List<MissingInventoryItem> missingItems) {
        Intrinsics.checkNotNullParameter(visuals, "visuals");
        Intrinsics.checkNotNullParameter(missingItems, "missingItems");
        this.visuals = visuals;
        this.missingItems = missingItems;
    }

    @NotNull
    public final Map<Integer, InventorySlotVisual> getVisuals() {
        return this.visuals;
    }

    @NotNull
    public String toString() {
        return "InventoryAnalysis(visuals=" + this.visuals + ", missingItems=" + this.missingItems + ")";
    }

    @NotNull
    public final Map<Integer, InventorySlotVisual> component1() {
        return this.visuals;
    }

    @NotNull
    public final List<MissingInventoryItem> component2() {
        return this.missingItems;
    }
}

