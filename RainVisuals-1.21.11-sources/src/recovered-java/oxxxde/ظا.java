/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.input.Input
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package oxxxde;

import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2={"Loxxxde/\u0638\u0627;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u0633\u062d;", "event", "", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lnet/minecraft/class_746;", "player", "", "shouldSprint", "(Lnet/minecraft/class_746;)Z", "rain-visuals"})
public final class \u0638\u0627
extends Module {
    @NotNull
    public static final \u0638\u0627 INSTANCE = new \u0638\u0627();

    /*
     * WARNING - void declaration
     */
    private final boolean shouldSprint(ClientPlayerEntity player) {
        void var2_2;
        block14: {
            block13: {
                block12: {
                    block11: {
                        block10: {
                            block9: {
                                if (player.isSneaking()) break block9;
                                if (!player.isUsingItem()) break block10;
                            }
                            return false;
                        }
                        if (player.isTouchingWater()) break block11;
                        if (!player.isInLava()) break block12;
                    }
                    return false;
                }
                if (player.hasVehicle()) break block13;
                if (!player.isGliding()) break block14;
            }
            return false;
        }
        Input input = player.input;
        Intrinsics.checkNotNullExpressionValue(input, "input");
        Input $this$hasForwardMovement$iv = input;
        boolean bl = false;
        return var2_2.hasForwardMovement() && player.getHungerManager().getFoodLevel() > 6;
    }

    private \u0638\u0627() {
        super("AutoSprint", \u0638\u0646.getPLAYER(), "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u0441\u043f\u0440\u0438\u043d\u0442 \u043f\u0440\u0438 \u0445\u043e\u0434\u044c\u0431\u0435");
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        if (this.shouldSprint(player)) {
            player.setSprinting(true);
        }
    }
}

