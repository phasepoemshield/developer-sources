package fun.wonderful.client.modules.impl.player;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.client.modules.Module;
import fun.wonderful.mixin.ILivingEntity;

public class NoJumpDelay
extends Module {
    public static NoJumpDelay INSTANCE = new NoJumpDelay();

    public NoJumpDelay() {
        super("NoJumpDelay", "Убирает задержку на прыжок", Module.ModuleCategory.PLAYER);
    }

    @EventLink
    public void onEvent(EventUpdate event) {
        if (NoJumpDelay.mc.player == null || NoJumpDelay.mc.world == null) {
            return;
        }
        ((ILivingEntity)NoJumpDelay.mc.player).setJumpingCooldown(0);
    }
}