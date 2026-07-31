package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.math.time.StopWatch;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.SlotActionType;

@FunctionAdd(name = "FastLeave", alias = "Fast Leave", category = Category.Player,
        description = "Быстрый выход с арены через /darena и нажатие на слот")
public class FastLeave extends Function {

    private enum Phase {IDLE, SEND_COMMAND, WAITING_GUI, CLICK_SLOT, POST_CLICK}

    private Phase phase = Phase.IDLE;
    private final StopWatch waitTimer = new StopWatch();
    private static final long MAX_WAIT_MS = 3000;

    @EventHandler
    public void onUpdate(UpdateEvent e) {
        if (nullCheck()) return;

        int SLOT_ID = 24;

        switch (phase) {
            case IDLE -> {
            }
            case SEND_COMMAND -> {
                if (mc.player.networkHandler != null) {
                    mc.player.networkHandler.sendChatCommand("darena");
                }
                phase = Phase.WAITING_GUI;
                waitTimer.reset();
            }
            case WAITING_GUI -> {
                if (waitTimer.isReached(MAX_WAIT_MS)) {
                    phase = Phase.IDLE;
                    setState(false);
                    return;
                }
                if (mc.currentScreen != null && mc.player.currentScreenHandler instanceof GenericContainerScreenHandler) {
                    phase = Phase.CLICK_SLOT;
                }
            }
            case CLICK_SLOT -> {
                if (mc.player.currentScreenHandler instanceof GenericContainerScreenHandler container && mc.interactionManager != null) {
                    int targetSlot = SLOT_ID;
                    mc.interactionManager.clickSlot(container.syncId, targetSlot, 0, SlotActionType.PICKUP, mc.player);
                }
                phase = Phase.POST_CLICK;
                waitTimer.reset();
            }
            case POST_CLICK -> {
                if (waitTimer.isReached(5)) {
                    phase = Phase.IDLE;
                    setState(false);
                }
            }
        }
    }

    @Override
    public void onEnable() {
        super.onEnable();
        phase = Phase.SEND_COMMAND;
    }

    @Override
    public void onDisable() {
        super.onDisable();
        phase = Phase.IDLE;
    }
}
