/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.PlayerEntity
 */
package kotakbaz.rain.event.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.entity.player.PlayerEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u00020\u000eH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u00020\u0011H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007\u00a8\u0006\u0016"}, d2={"Loxxxde/\u0631\u0643;", "", "Lnet/minecraft/class_1657;", "player", "<init>", "(Lnet/minecraft/class_1657;)V", "component1", "()Lnet/minecraft/class_1657;", "copy", "(Lnet/minecraft/class_1657;)Lkotakbaz/rain/event/events/TotemPopEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lnet/minecraft/class_1657;", "getPlayer", "rain-visuals"})
public final class TotemPopEvent {
    @NotNull
    private final PlayerEntity player;

    public TotemPopEvent(@NotNull PlayerEntity player) {
        Intrinsics.checkNotNullParameter(player, "player");
        this.player = player;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotemPopEvent)) {
            return false;
        }
        TotemPopEvent totemPopEvent = (TotemPopEvent)other;
        if (!Intrinsics.areEqual(this.player, totemPopEvent.player)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.player.hashCode();
    }

    public static /* synthetic */ TotemPopEvent copy$default(TotemPopEvent totemPopEvent, PlayerEntity playerEntity, int n, Object object) {
        if ((n & 1) != 0) {
            playerEntity = totemPopEvent.player;
        }
        return totemPopEvent.copy(playerEntity);
    }

    @NotNull
    public final PlayerEntity component1() {
        return this.player;
    }

    @NotNull
    public final TotemPopEvent copy(@NotNull PlayerEntity player) {
        Intrinsics.checkNotNullParameter(player, "player");
        return new TotemPopEvent(player);
    }

    @NotNull
    public String toString() {
        return "TotemPopEvent(player=" + this.player + ")";
    }

    @NotNull
    public final PlayerEntity getPlayer() {
        return this.player;
    }
}

