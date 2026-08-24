/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.inventory;

import java.util.UUID;
import kotakbaz.rain.ui.inventory.InventorySnapshot;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bH\u00c6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u00020\u001aH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u00020\u0004H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013\u00a8\u0006&"}, d2={"Loxxxde/\u062f\u064a;", "", "Ljava/util/UUID;", "id", "", "name", "Loxxxde/\u0651;", "snapshot", "", "createdAt", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lkotakbaz/rain/ui/inventory/InventorySnapshot;J)V", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/lang/String;", "component3", "()Lkotakbaz/rain/ui/inventory/InventorySnapshot;", "component4", "()J", "copy", "(Ljava/util/UUID;Ljava/lang/String;Lkotakbaz/rain/ui/inventory/InventorySnapshot;J)Lkotakbaz/rain/ui/inventory/InventoryPreset;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/UUID;", "getId", "Ljava/lang/String;", "getName", "Loxxxde/\u0651;", "getSnapshot", "J", "getCreatedAt", "rain-visuals"})
public final class InventoryPreset {
    private final long createdAt;
    @NotNull
    private final String name;
    @NotNull
    private final UUID id;
    @NotNull
    private final InventorySnapshot snapshot;

    @NotNull
    public final InventoryPreset copy(@NotNull UUID id, @NotNull String name, @NotNull InventorySnapshot snapshot, long createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        return new InventoryPreset(id, name, snapshot, createdAt);
    }

    @NotNull
    public final InventorySnapshot component3() {
        return this.snapshot;
    }

    @NotNull
    public final UUID component1() {
        return this.id;
    }

    @NotNull
    public String toString() {
        return "InventoryPreset(id=" + this.id + ", name=" + this.name + ", snapshot=" + this.snapshot + ", createdAt=" + this.createdAt + ")";
    }

    @NotNull
    public final UUID getId() {
        return this.id;
    }

    public InventoryPreset(@NotNull UUID id, @NotNull String name, @NotNull InventorySnapshot snapshot, long createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.id = id;
        this.name = name;
        this.snapshot = snapshot;
        this.createdAt = createdAt;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public int hashCode() {
        int result = this.id.hashCode();
        result = result * 31 + this.name.hashCode();
        result = result * 31 + this.snapshot.hashCode();
        result = result * 31 + Long.hashCode(this.createdAt);
        return result;
    }

    public final long component4() {
        return this.createdAt;
    }

    public static /* synthetic */ InventoryPreset copy$default(InventoryPreset inventoryPreset, UUID uUID, String string, InventorySnapshot inventorySnapshot, long l, int n, Object object) {
        if ((n & 1) != 0) {
            uUID = inventoryPreset.id;
        }
        if ((n & 2) != 0) {
            string = inventoryPreset.name;
        }
        if ((n & 4) != 0) {
            inventorySnapshot = inventoryPreset.snapshot;
        }
        if ((n & 8) != 0) {
            l = inventoryPreset.createdAt;
        }
        return inventoryPreset.copy(uUID, string, inventorySnapshot, l);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InventoryPreset)) {
            return false;
        }
        InventoryPreset inventoryPreset = (InventoryPreset)other;
        if (!Intrinsics.areEqual(this.id, inventoryPreset.id)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.name, inventoryPreset.name)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.snapshot, inventoryPreset.snapshot)) {
            return false;
        }
        if (this.createdAt != inventoryPreset.createdAt) {
            return false;
        }
        return true;
    }

    @NotNull
    public final InventorySnapshot getSnapshot() {
        return this.snapshot;
    }
}

