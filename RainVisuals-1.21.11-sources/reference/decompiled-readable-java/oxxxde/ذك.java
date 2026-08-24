/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket
 *  net.minecraft.util.PlayerInput
 *  ru.ocz.protection.annotation.Compile
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import kotakbaz.rain.event.events.AttackEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket;
import net.minecraft.util.PlayerInput;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0627\u064f;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.annotation.Compile;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001c"}, d2={"Loxxxde/\u0630\u0643;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u0630\u0645;", "event", "onAttack", "(Lkotakbaz/rain/event/events/AttackEvent;)V", "Loxxxde/\u0633\u062d;", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "startSneakBurst", "resetState", "", "isSneakKeyPressed", "()Z", "sneaking", "applySneakState", "(Z)V", "", "SNEAK_TICKS", "I", "sneakTicksLeft", "restorePending", "Z", "rain-visuals"})
@RecompileFormat
public final class \u0630\u0643
extends Module {
    private static final int SNEAK_TICKS = 2;
    private static boolean restorePending;
    private static int sneakTicksLeft;
    @NotNull
    public static final \u0630\u0643 INSTANCE;

    @Commando
    @Compile
    public final void onUpdate(@NotNull PlayerUpdateEvent playerUpdateEvent) {
        Intrinsics.checkNotNullParameter(playerUpdateEvent, "event");
        if (\u0636\u0643.getMc().player == null) {
            return;
        }
        if (sneakTicksLeft > 0) {
            this.applySneakState(true);
            --sneakTicksLeft;
            return;
        }
        if (!restorePending) {
            return;
        }
        this.applySneakState(this.isSneakKeyPressed());
        restorePending = false;
    }

    private \u0630\u0643() {
        super("ShiftTap", \u0638\u0646.getPLAYER(), "\u0410\u0432\u0442\u043e-\u0448\u0438\u0444\u0442 \u043f\u0440\u0438 \u0443\u0434\u0430\u0440\u0430\u0445 \u043f\u043e \u0446\u0435\u043b\u0438");
    }

    @Override
    public void onEnable() {
        this.resetState();
    }

    private final void startSneakBurst() {
        if (\u0636\u0643.getMc().player == null) {
            return;
        }
        sneakTicksLeft = 2;
        restorePending = true;
        this.applySneakState(true);
    }

    @Override
    public void onDisable() {
        sneakTicksLeft = 0;
        restorePending = false;
        this.applySneakState(this.isSneakKeyPressed());
    }

    @Commando
    public final void onAttack(@NotNull AttackEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.startSneakBurst();
    }

    static {
        INSTANCE = new \u0630\u0643();
        \u0627\u064f.moduleOnFuntime$default(\u0627\u064f.INSTANCE, INSTANCE, null, 2, null);
    }

    private final boolean isSneakKeyPressed() {
        return \u0636\u0643.getMc().options.sneakKey.isPressed();
    }

    private final void resetState() {
        sneakTicksLeft = 0;
        restorePending = false;
    }

    private final void applySneakState(boolean sneaking) {
        block1: {
            ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
            if (clientPlayerEntity == null) {
                return;
            }
            ClientPlayerEntity player = clientPlayerEntity;
            PlayerInput playerInput = player.input.playerInput;
            Intrinsics.checkNotNullExpressionValue(playerInput, "keyPresses");
            PlayerInput current = playerInput;
            PlayerInput updated = new PlayerInput(current.forward(), current.backward(), current.left(), current.right(), current.jump(), sneaking, current.sprint());
            player.input.playerInput = updated;
            player.setSneaking(sneaking);
            ClientPlayNetworkHandler clientPlayNetworkHandler = \u0636\u0643.getMc().getNetworkHandler();
            if (clientPlayNetworkHandler == null) break block1;
            clientPlayNetworkHandler.sendPacket((Packet)new PlayerInputC2SPacket(updated));
        }
    }
}

