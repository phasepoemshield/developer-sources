package fun.wonderful.client.modules.impl.movement;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventCloseInv;
import fun.wonderful.api.events.implement.EventPacket;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.player.MoveUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.impl.movement.Sprint;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import fun.wonderful.client.ui.MenuPanel;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.gui.screen.ingame.SignEditScreen;

public class InventoryWalk
extends Module {
    public static InventoryWalk INSTANCE = new InventoryWalk();
    public ModeSetting mode = new ModeSetting("Обход", "Обычный", "Обычный", "Grim", "ReallyWorld");
    public ModeSetting grimVersion = new ModeSetting("Версия свапа", "1.21.4", "1.21.4", "1.16.5").visible(() -> this.mode.is("Grim"));
    private final BooleanSetting disableOnSearch = new BooleanSetting("Выключать при поиске", true);
    public int tick = 0;
    private final List<ClickSlotC2SPacket> pendingPackets = new ArrayList<ClickSlotC2SPacket>();
    private CloseHandledScreenC2SPacket pendingClosePacket = null;
    private boolean sprintPaused = false;
    private boolean waitingToClose = false;
    private int delayedFlushTicks = -1;
    private boolean flushingPackets = false;
    private final List<Object> rwPackets = new ArrayList<Object>();
    private final List<ClickSlotC2SPacket> rwPickupBuffer = new ArrayList<ClickSlotC2SPacket>();
    private long rwPickupTimerMs;
    private long rwPacketSendTimerMs;
    private int rwPickupCount;
    private boolean rwNeedSlowdown;
    private int rwTicksSlowed;

    public InventoryWalk() {
        super("InventoryWalk", "Ходьба с открытым инвентарём", Module.ModuleCategory.MOVEMENT);
        this.addSettings(this.mode, this.grimVersion, this.disableOnSearch);
    }

    @EventLink
    public void onUpdate(EventUpdate event) {
        if (InventoryWalk.mc.player == null) {
            return;
        }
        KeyBinding[] pressedKeys = new KeyBinding[]{InventoryWalk.mc.options.forwardKey, InventoryWalk.mc.options.backKey, InventoryWalk.mc.options.leftKey, InventoryWalk.mc.options.rightKey, InventoryWalk.mc.options.jumpKey, InventoryWalk.mc.options.sprintKey};
        if (this.shouldDisableMovementForSearch()) {
            this.releaseKeyBindings(pressedKeys);
            return;
        }
        if (this.isServerWalkMode()) {
            this.tickServerWalk();
            if (InventoryWalk.mc.currentScreen instanceof ChatScreen || InventoryWalk.mc.currentScreen instanceof SignEditScreen) {
                return;
            }
            this.updateKeyBindings(pressedKeys);
            return;
        }
        if (this.mode.is("Grim") && this.grimVersion.is("1.21.4") && this.waitingToClose && !MoveUtils.isMoving()) {
            this.flushQueuedPackets(true);
            this.waitingToClose = false;
            this.tick = 3;
        }
        if (this.mode.is("Grim") && this.grimVersion.is("1.16.5") && this.delayedFlushTicks >= 0) {
            if (this.delayedFlushTicks == 0) {
                this.flushQueuedPackets(true);
                this.delayedFlushTicks = -1;
                this.tick = 1;
            } else {
                --this.delayedFlushTicks;
            }
        }
        if (this.tick == 0 && !this.pendingPackets.isEmpty() && InventoryWalk.mc.currentScreen == null && !this.waitingToClose) {
            this.sendPendingPackets();
        }
        if (this.tick != 0) {
            for (KeyBinding keyBinding : pressedKeys) {
                keyBinding.setPressed(false);
            }
            --this.tick;
            if (this.tick == 0 && this.sprintPaused) {
                this.sprintPaused = false;
                Sprint.popPause();
            }
            return;
        }
        if (InventoryWalk.mc.currentScreen instanceof ChatScreen || InventoryWalk.mc.currentScreen instanceof SignEditScreen) {
            return;
        }
        if (this.mode.is("Grim") && InventoryWalk.mc.currentScreen instanceof HandledScreen && !(InventoryWalk.mc.currentScreen instanceof InventoryScreen)) {
            return;
        }
        if (this.waitingToClose) {
            for (KeyBinding keyBinding : pressedKeys) {
                keyBinding.setPressed(false);
            }
            return;
        }
        this.updateKeyBindings(pressedKeys);
    }

    private boolean shouldDisableMovementForSearch() {
        return this.disableOnSearch.isState() && InventoryWalk.mc.currentScreen instanceof MenuPanel && MenuPanel.isSearchActive();
    }

    private void releaseKeyBindings(KeyBinding[] pressedKeys) {
        for (KeyBinding keyBinding : pressedKeys) {
            keyBinding.setPressed(false);
        }
    }

    private void updateKeyBindings(KeyBinding[] pressedKeys) {
        for (KeyBinding keyBinding : pressedKeys) {
            boolean isKeyPressed = InputUtil.isKeyPressed((long)mc.getWindow().getHandle(), (int)keyBinding.getDefaultKey().getCode());
            keyBinding.setPressed(isKeyPressed);
        }
    }

    private boolean isServerWalkMode() {
        return this.mode.is("ReallyWorld");
    }

    private void tickServerWalk() {
        if (InventoryWalk.mc.world == null) {
            return;
        }
        if (this.rwNeedSlowdown) {
            InventoryWalk.mc.player.setVelocity(InventoryWalk.mc.player.getVelocity().x * 0.7, InventoryWalk.mc.player.getVelocity().y, InventoryWalk.mc.player.getVelocity().z * 0.7);
            ++this.rwTicksSlowed;
            if (this.rwTicksSlowed > 5) {
                this.rwNeedSlowdown = false;
                this.rwTicksSlowed = 0;
            }
        }
    }

    @EventLink
    public void onPacket(EventPacket event) {
        if (event.getType() != EventPacket.Type.SEND || this.flushingPackets) {
            return;
        }
        Packet<?> packet = event.getPacket();
        if (this.isServerWalkMode() && MoveUtils.isMoving() && (InventoryWalk.mc.currentScreen instanceof InventoryScreen || InventoryWalk.mc.currentScreen instanceof HandledScreen)) {
            if (packet instanceof ClickSlotC2SPacket) {
                this.rwNeedSlowdown = true;
                this.rwTicksSlowed = 0;
            }
            return;
        }
        if (!(this.mode.is("Grim") && MoveUtils.isMoving() && InventoryWalk.mc.currentScreen instanceof InventoryScreen)) {
            return;
        }
        if (packet instanceof ClickSlotC2SPacket) {
            ClickSlotC2SPacket clickPacket = (ClickSlotC2SPacket)packet;
            this.pendingPackets.add(clickPacket);
            event.cancel();
            return;
        }
        if (packet instanceof CloseHandledScreenC2SPacket) {
            CloseHandledScreenC2SPacket closePacket;
            this.pendingClosePacket = closePacket = (CloseHandledScreenC2SPacket)packet;
            if (this.grimVersion.is("1.16.5")) {
                this.delayedFlushTicks = 1;
                this.waitingToClose = false;
            } else {
                this.waitingToClose = true;
            }
            this.pauseSprint();
            event.cancel();
        }
    }

    @EventLink
    public void onCloseInv(EventCloseInv eventCloseInv) {
        if (this.isServerWalkMode()) {
            this.flushPickupBuffer();
            this.flushAllRwPackets();
            this.rwNeedSlowdown = false;
            this.rwTicksSlowed = 0;
            this.rwPickupCount = 0;
            return;
        }
        if (this.mode.is("Grim") && this.grimVersion.is("1.16.5") && MoveUtils.isMoving() && InventoryWalk.mc.currentScreen instanceof InventoryScreen) {
            this.pendingClosePacket = new CloseHandledScreenC2SPacket(eventCloseInv.windowId);
            this.delayedFlushTicks = 1;
            this.pauseSprint();
            this.tick = 1;
            eventCloseInv.cancel();
            return;
        }
        if (this.mode.is("Grim") && !this.waitingToClose) {
            this.pauseSprint();
            this.tick = 1;
        }
    }

    private void pauseSprint() {
        if (this.sprintPaused) {
            return;
        }
        Sprint.pushPause(0L);
        this.sprintPaused = true;
    }

    private void sendPendingPackets() {
        if (InventoryWalk.mc.player == null || mc.getNetworkHandler() == null) {
            this.pendingPackets.clear();
            return;
        }
        this.flushingPackets = true;
        try {
            for (ClickSlotC2SPacket packet : this.pendingPackets) {
                mc.getNetworkHandler().sendPacket((Packet)packet);
            }
        }
        finally {
            this.flushingPackets = false;
        }
        this.pendingPackets.clear();
    }

    private void flushQueuedPackets(boolean includeClose) {
        if (InventoryWalk.mc.player == null || mc.getNetworkHandler() == null) {
            this.pendingPackets.clear();
            this.pendingClosePacket = null;
            return;
        }
        this.sendPendingPackets();
        if (includeClose && this.pendingClosePacket != null) {
            this.flushingPackets = true;
            try {
                mc.getNetworkHandler().sendPacket((Packet)(Object)this.pendingClosePacket);
            }
            finally {
                this.flushingPackets = false;
            }
            this.pendingClosePacket = null;
        }
    }

    private void flushPickupBuffer() {
        if (this.rwPickupBuffer.isEmpty() || InventoryWalk.mc.player == null || mc.getNetworkHandler() == null) {
            this.rwPickupBuffer.clear();
            this.rwPickupCount = 0;
            return;
        }
        this.flushingPackets = true;
        try {
            ArrayList<ClickSlotC2SPacket> toSend = new ArrayList<ClickSlotC2SPacket>(this.rwPickupBuffer);
            this.rwPickupBuffer.clear();
            this.rwPickupCount = 0;
            for (ClickSlotC2SPacket p2 : toSend) {
                mc.getNetworkHandler().sendPacket((Packet)p2);
            }
        }
        finally {
            this.flushingPackets = false;
        }
    }

    private void sendSingleRwPacket() {
        if (this.rwPackets.isEmpty() || InventoryWalk.mc.player == null || mc.getNetworkHandler() == null) {
            return;
        }
        this.flushingPackets = true;
        try {
            Object p2 = this.rwPackets.remove(0);
            if (p2 instanceof Packet) {
                Packet netPacket = (Packet)p2;
                mc.getNetworkHandler().sendPacket(netPacket);
            }
        }
        finally {
            this.flushingPackets = false;
        }
    }

    private void flushAllRwPackets() {
        if (this.rwPackets.isEmpty() || InventoryWalk.mc.player == null || mc.getNetworkHandler() == null) {
            this.rwPackets.clear();
            return;
        }
        this.flushingPackets = true;
        try {
            ArrayList<Object> toSend = new ArrayList<Object>(this.rwPackets);
            this.rwPackets.clear();
            for (Object e2 : toSend) {
                if (!(e2 instanceof Packet)) continue;
                Packet netPacket = (Packet)e2;
                mc.getNetworkHandler().sendPacket(netPacket);
            }
        }
        finally {
            this.flushingPackets = false;
        }
        this.rwNeedSlowdown = false;
        this.rwTicksSlowed = 0;
    }

    public static void stopTick(int ticks) {
        InventoryWalk inventoryWalk = ModuleClass.inventoryWalk;
        if (inventoryWalk != null && inventoryWalk.isEnable()) {
            inventoryWalk.tick = Math.max(inventoryWalk.tick, ticks);
        }
    }

    @Override
    public void onDisable() {
        super.onDisable();
        this.flushQueuedPackets(true);
        this.flushPickupBuffer();
        this.flushAllRwPackets();
        if (this.sprintPaused) {
            this.sprintPaused = false;
            Sprint.popPause();
        }
        this.waitingToClose = false;
        this.delayedFlushTicks = -1;
        this.flushingPackets = false;
        this.tick = 0;
        this.rwNeedSlowdown = false;
        this.rwTicksSlowed = 0;
        this.rwPickupCount = 0;
    }
}