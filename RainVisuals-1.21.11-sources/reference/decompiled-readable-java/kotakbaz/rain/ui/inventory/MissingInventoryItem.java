/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemStack
 */
package kotakbaz.rain.ui.inventory;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u00020\u0004H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0012\u0010\u000bJ\u0011\u0010\u0014\u001a\u00020\u0013H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b\u00a8\u0006\u001a"}, d2={"Loxxxde/\u0637\u0641;", "", "Lnet/minecraft/class_1799;", "stack", "", "count", "<init>", "(Lnet/minecraft/class_1799;I)V", "component1", "()Lnet/minecraft/class_1799;", "component2", "()I", "copy", "(Lnet/minecraft/class_1799;I)Lkotakbaz/rain/ui/inventory/MissingInventoryItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lnet/minecraft/class_1799;", "getStack", "I", "getCount", "rain-visuals"})
public final class MissingInventoryItem {
    @NotNull
    private final ItemStack stack;
    private final int count;

    public final int component2() {
        return this.count;
    }

    public int hashCode() {
        int result = this.stack.hashCode();
        result = result * 31 + Integer.hashCode(this.count);
        return result;
    }

    @NotNull
    public String toString() {
        return "MissingInventoryItem(stack=" + this.stack + ", count=" + this.count + ")";
    }

    public MissingInventoryItem(@NotNull ItemStack stack, int count) {
        Intrinsics.checkNotNullParameter(stack, "stack");
        this.stack = stack;
        this.count = count;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final ItemStack getStack() {
        return this.stack;
    }

    @NotNull
    public final MissingInventoryItem copy(@NotNull ItemStack stack, int count) {
        Intrinsics.checkNotNullParameter(stack, "stack");
        return new MissingInventoryItem(stack, count);
    }

    @NotNull
    public final ItemStack component1() {
        return this.stack;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissingInventoryItem)) {
            return false;
        }
        MissingInventoryItem missingInventoryItem = (MissingInventoryItem)other;
        if (!Intrinsics.areEqual(this.stack, missingInventoryItem.stack)) {
            return false;
        }
        if (this.count != missingInventoryItem.count) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ MissingInventoryItem copy$default(MissingInventoryItem missingInventoryItem, ItemStack itemStack, int n, int n2, Object object) {
        if ((n2 & 1) != 0) {
            itemStack = missingInventoryItem.stack;
        }
        if ((n2 & 2) != 0) {
            n = missingInventoryItem.count;
        }
        return missingInventoryItem.copy(itemStack, n);
    }
}

