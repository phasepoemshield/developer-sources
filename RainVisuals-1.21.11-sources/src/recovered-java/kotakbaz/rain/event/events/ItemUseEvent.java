/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.Hand
 */
package kotakbaz.rain.event.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2={"Loxxxde/\u062c\u0645;", "", "Lnet/minecraft/class_1657;", "player", "Lnet/minecraft/class_1268;", "hand", "Lnet/minecraft/class_1269;", "actionResult", "<init>", "(Lnet/minecraft/class_1657;Lnet/minecraft/class_1268;Lnet/minecraft/class_1269;)V", "Lnet/minecraft/class_1657;", "getPlayer", "()Lnet/minecraft/class_1657;", "Lnet/minecraft/class_1268;", "getHand", "()Lnet/minecraft/class_1268;", "Lnet/minecraft/class_1269;", "getActionResult", "()Lnet/minecraft/class_1269;", "rain-visuals"})
public final class ItemUseEvent {
    @NotNull
    private final PlayerEntity player;
    @NotNull
    private final Hand hand;
    @NotNull
    private final ActionResult actionResult;

    @NotNull
    public final PlayerEntity getPlayer() {
        return this.player;
    }

    @NotNull
    public final ActionResult getActionResult() {
        return this.actionResult;
    }

    @NotNull
    public final Hand getHand() {
        return this.hand;
    }

    public ItemUseEvent(@NotNull PlayerEntity player, @NotNull Hand hand, @NotNull ActionResult actionResult) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(hand, "hand");
        Intrinsics.checkNotNullParameter(actionResult, "actionResult");
        this.player = player;
        this.hand = hand;
        this.actionResult = actionResult;
    }
}

