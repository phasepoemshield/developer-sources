/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.inventory;

import java.util.UUID;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.ui.inventory.InventoryPreset;
import kotakbaz.rain.ui.inventory.InventorySnapshot;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00158\u0006\u00a2\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\u00158\u0006\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\u00a8\u0006\u001e"}, d2={"Loxxxde/\u062b\u063a;", "", "Loxxxde/\u062f\u064a;", "preset", "<init>", "(Lkotakbaz/rain/ui/inventory/InventoryPreset;)V", "Ljava/util/UUID;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Loxxxde/\u0651;", "snapshot", "Loxxxde/\u0651;", "getSnapshot", "()Lkotakbaz/rain/ui/inventory/InventorySnapshot;", "Loxxxde/\u0631\u064a;", "selectionAnimation", "Loxxxde/\u0631\u064a;", "getSelectionAnimation", "()Lkotakbaz/rain/client/util/animations/AnimationUtil;", "deleteRevealAnimation", "getDeleteRevealAnimation", "deleteHoverAnimation", "getDeleteHoverAnimation", "rain-visuals"})
public final class InventoryCard {
    @NotNull
    private final InventorySnapshot snapshot;
    @NotNull
    private final AnimationUtil deleteRevealAnimation;
    @NotNull
    private final AnimationUtil deleteHoverAnimation;
    @NotNull
    private final String name;
    @NotNull
    private final AnimationUtil selectionAnimation;
    @NotNull
    private final UUID id;

    @NotNull
    public final AnimationUtil getDeleteRevealAnimation() {
        return this.deleteRevealAnimation;
    }

    @NotNull
    public final AnimationUtil getDeleteHoverAnimation() {
        return this.deleteHoverAnimation;
    }

    @NotNull
    public final AnimationUtil getSelectionAnimation() {
        return this.selectionAnimation;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public InventoryCard(@NotNull InventoryPreset preset) {
        Intrinsics.checkNotNullParameter(preset, "preset");
        this.id = preset.getId();
        this.name = preset.getName();
        this.snapshot = preset.getSnapshot();
        this.selectionAnimation = new AnimationUtil(0.0f, 1, null);
        this.deleteRevealAnimation = new AnimationUtil(0.0f, 1, null);
        this.deleteHoverAnimation = new AnimationUtil(0.0f, 1, null);
    }

    @NotNull
    public final UUID getId() {
        return this.id;
    }

    @NotNull
    public final InventorySnapshot getSnapshot() {
        return this.snapshot;
    }
}

