package fun.nexisdlc.modules.impl.movement;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.client.EventCloseScreen;
import fun.nexisdlc.client.events.impl.client.EventPacket;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.player.ContainerManager;
import fun.nexisdlc.client.utils.player.PlayerInventoryUtil;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.gui.screen.ingame.SignEditScreen;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;
import net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket;
import net.minecraft.network.packet.s2c.play.InventoryS2CPacket;
import net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket;

import java.util.ArrayList;
import java.util.List;

import static fun.nexisdlc.client.utils.player.PlayerUtils.script;

@FunctionAdd(name = "GuiMove", alias = "Gui Walk", category = Category.Movement, description = "Позволяет ходить в инвентаре")
public class GuiMove extends Function {
    private static final int MAX_QUEUED_CLICKS = 24;

    private final List<Packet<?>> packets = new ArrayList<>();
    private int queuedSyncId = -1;
    private boolean flushingPackets;

    public BooleanSetting onlyInventory = new BooleanSetting("Только в инвентаре", true);
    public BooleanSetting bypass$$$ = new BooleanSetting("Обход Grim Lighting", false);
    public BooleanSetting extraBurstDelay = new BooleanSetting("Доп задержка при спаме", false);

    public GuiMove() {
        addSettings(onlyInventory, bypass$$$, extraBurstDelay);
    }

    @EventHandler
    public void onPacket(EventPacket e) {
        if (nullCheck() || mc.getNetworkHandler() == null) {
            clearQueuedClicks();
            return;
        }

        if (isScreenBlocked()) {
            if (mc.currentScreen == null) {
                flushQueuedClicks();
            }
            return;
        }

        if (e.isSend() && e.getPacket() instanceof ClickSlotC2SPacket slot) {
            if (!flushingPackets && PlayerUtils.hasPlayerMovement() && PlayerUtils.shouldSkipExecutionGuiMove()) {
                if (queueClick(slot)) {
                    e.cancel();
                }
            }
            return;
        }

        if (e.isReceive() && !packets.isEmpty() && !Nexis.getFunctionManager().getNoServerDesync().isState()) {
            if (e.getPacket() instanceof InventoryS2CPacket) {
                e.cancel();
            } else if (e.getPacket() instanceof ScreenHandlerSlotUpdateS2CPacket packet && packet.getSyncId() == queuedSyncId) {
                e.cancel();
            }
        }

        if (e.isReceive() && !packets.isEmpty() && e.getPacket() instanceof CloseScreenS2CPacket screen && screen.getSyncId() == queuedSyncId) {
            e.cancel();
        }
    }

    @EventHandler
    public void onTick(UpdateEvent e) {
        if (nullCheck() || mc.getNetworkHandler() == null) {
            clearQueuedClicks();
            PlayerUtils.resetControlledKeys();
            return;
        }

        if (!PlayerUtils.canMove) return;

        if (!isScreenBlocked()) {
            if (!packets.isEmpty() || (mc.player != null && mc.player.currentScreenHandler.getCursorStack().isEmpty())) {
                PlayerUtils.updateMoveKeys();
            }
        } else if (mc.currentScreen == null && !packets.isEmpty()) {
            flushQueuedClicks();
        }
    }

    @EventHandler
    public void onCloseScreen(EventCloseScreen e) {
        if (nullCheck() || mc.getNetworkHandler() == null) {
            clearQueuedClicks();
            PlayerUtils.resetControlledKeys();
            return;
        }

        int queuedClicks = packets.size();
        if (queuedClicks == 0) {
            return;
        }

        int extraDelayTicks = extraBurstDelay.get() ? Math.max(0, queuedClicks - 2) : 0;

        if (bypass$$$.get()) {
            if (e.getScreen() instanceof InventoryScreen) {
                e.cancel();
            }

            script.cleanup().addTickStep(0, () -> {
                e.cancel();
                PlayerUtils.disableMoveKeys();
            }).addTickStep(1 + extraDelayTicks, () -> {
                if (!packets.isEmpty()) {
                    List<Packet<?>> toSend = new ArrayList<>(packets);
                    clearQueuedClicks();

                    PlayerUtils.addTask(() -> sendPacketsWithOptionalDelay(toSend, PlayerInventoryUtil::updateSlots));
                }
            }).addTickStep(2 + extraDelayTicks, () -> {
                e.uncancel();
                PlayerInventoryUtil.closeScreen(true);
                PlayerUtils.enableMoveKeys();
            });
        } else if (!packets.isEmpty()) {
            List<Packet<?>> toSend = new ArrayList<>(packets);
            clearQueuedClicks();

            PlayerUtils.addTask(() -> sendPacketsWithOptionalDelay(toSend, PlayerInventoryUtil::updateSlots));
        }
    }

    private void sendPacketsWithOptionalDelay(List<Packet<?>> toSend, Runnable afterSend) {
        if (toSend.isEmpty() || mc.getNetworkHandler() == null) {
            afterSend.run();
            return;
        }

        if (extraBurstDelay.get() && toSend.size() > 2) {
            int maxTick = 0;
            for (int i = 0; i < toSend.size(); i++) {
                int sendTick = i <= 1 ? 0 : i - 1;
                maxTick = Math.max(maxTick, sendTick);
                Packet<?> packetToSend = toSend.get(i);
                script.addTickStep(sendTick, () -> sendQueuedPacket(packetToSend));
            }
            script.addTickStep(maxTick + 1, afterSend::run);
            return;
        }

        toSend.forEach(this::sendQueuedPacket);
        afterSend.run();
    }

    private boolean queueClick(Packet<?> packet) {
        if (mc.player == null || mc.player.currentScreenHandler == null) {
            return false;
        }

        int syncId = mc.player.currentScreenHandler.syncId;
        if (queuedSyncId != -1 && queuedSyncId != syncId) {
            clearQueuedClicks();
        }
        queuedSyncId = syncId;

        if (packets.size() >= MAX_QUEUED_CLICKS) {
            clearQueuedClicks();
            PlayerUtils.enableMoveKeys();
            return false;
        }

        packets.add(packet);
        return true;
    }

    private void flushQueuedClicks() {
        if (packets.isEmpty()) {
            queuedSyncId = -1;
            return;
        }
        List<Packet<?>> toSend = new ArrayList<>(packets);
        clearQueuedClicks();
        sendPacketsWithOptionalDelay(toSend, PlayerInventoryUtil::updateSlots);
    }

    private void sendQueuedPacket(Packet<?> packet) {
        if (packet == null || mc.getNetworkHandler() == null) {
            return;
        }

        flushingPackets = true;
        try {
            mc.getNetworkHandler().sendPacket(packet);
        } finally {
            flushingPackets = false;
        }
    }

    private boolean isScreenBlocked() {
        return mc.currentScreen instanceof ChatScreen
                || mc.currentScreen instanceof SignEditScreen
                || (onlyInventory.get() && ContainerManager.isContainerScreenWithoutInventory(mc.currentScreen));
    }

    private void clearQueuedClicks() {
        packets.clear();
        queuedSyncId = -1;
    }

    @Override
    public void onDisable() {
        clearQueuedClicks();
        PlayerUtils.resetControlledKeys();
        super.onDisable();
    }
}
