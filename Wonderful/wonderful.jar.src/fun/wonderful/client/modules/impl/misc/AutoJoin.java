package fun.wonderful.client.modules.impl.misc;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventPacket;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.utils.chat.ChatUtils;
import fun.wonderful.api.utils.math.TimerUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import fun.wonderful.client.ui.MenuPanel;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import ru.ocz.protection.annotation.Compile;

public final class AutoJoin
extends Module {
    public static AutoJoin INSTANCE = new AutoJoin();
    private static final long CLICK_DELAY_MS = 30L;
    private static final int NEXT_PAGE_SLOT = 44;
    private static final int MAX_PAGE_SWITCHES = 5;
    private static final String MODE_REALLY_WORLD = "ReallyWorld";
    private static final String MODE_CAKE_WORLD = "CakeWorld";
    private final ModeSetting mode = new ModeSetting("Режим", "ReallyWorld", "ReallyWorld", "CakeWorld");
    private final FloatSetting grief = new FloatSetting("Гриф", 5.0f, 1.0f, 64.0f, 1.0f);
    private final TimerUtils clickTimer = new TimerUtils();
    private final TimerUtils compassTimer = new TimerUtils();
    private boolean joining;
    private int pageSwitches;
    private int targetGrief;

    public AutoJoin() {
        super("AutoJoin", "Автоматически заходит на выбранный гриф", Module.ModuleCategory.MISC);
        this.addSettings(this.mode, this.grief);
    }

    public void startJoinTo(int griefId) {
        this.grief.setValue(griefId);
        if (!this.isEnable()) {
            this.toggle();
            return;
        }
        this.startJoin();
    }

    public boolean isJoining() {
        return this.joining;
    }

    @Override
    public void onEnable() {
        super.onEnable();
        this.startJoin();
    }

    @Override
    public void onDisable() {
        this.joining = false;
        this.pageSwitches = 0;
        super.onDisable();
    }

    @EventLink
    @Compile
    public native void onUpdate(EventUpdate var1);

    @EventLink
    public void onPacket(EventPacket event) {
        if (!this.joining || event.getType() != EventPacket.Type.RECEIVE) {
            return;
        }
        if (event.getPacket() instanceof GameJoinS2CPacket) {
            ChatUtils.sendMessage("Вход на гриф #" + this.targetGrief + ": успешно");
            this.joining = false;
            this.pageSwitches = 0;
            this.setEnabled(false);
            return;
        }
        if (AutoJoin.mc.player == null || AutoJoin.mc.world == null) {
            return;
        }
        Packet<?> class_25962 = event.getPacket();
        if (!(class_25962 instanceof GameMessageS2CPacket)) {
            return;
        }
        GameMessageS2CPacket packet = (GameMessageS2CPacket)class_25962;
        String message = packet.comp_763().getString();
        if (message.contains("Подождите несколько секунд перед повторным подключением")) {
            event.cancel();
            return;
        }
        if (message.contains("К сожалению сервер переполнен")) {
            event.cancel();
            ChatUtils.sendMessage("Вход на гриф #" + this.targetGrief + ": неудачно");
            return;
        }
        this.openServerSelector(false);
    }

    private void startJoin() {
        this.joining = true;
        this.pageSwitches = 0;
        this.targetGrief = Math.round(this.grief.get());
        this.clickTimer.reset();
        this.compassTimer.reset();
        Screen class_4372 = AutoJoin.mc.currentScreen;
        if (class_4372 instanceof MenuPanel) {
            MenuPanel panel = (MenuPanel)class_4372;
            panel.close();
        }
        if (AutoJoin.mc.player != null && AutoJoin.mc.world != null) {
            this.openServerSelector(true);
        }
    }

    private void openServerSelector(boolean force) {
        if (!force && !this.compassTimer.finished(30L)) {
            return;
        }
        if (AutoJoin.mc.currentScreen instanceof MenuPanel) {
            return;
        }
        if (AutoJoin.mc.player == null || AutoJoin.mc.interactionManager == null || mc.getNetworkHandler() == null) {
            return;
        }
        int previousSlot = AutoJoin.mc.player.getInventory().selectedSlot;
        int slot = this.findCompassSlot();
        if (slot == -1) {
            return;
        }
        this.pageSwitches = 0;
        AutoJoin.mc.player.getInventory().selectedSlot = slot;
        mc.getNetworkHandler().sendPacket((Packet)new UpdateSelectedSlotC2SPacket(slot));
        AutoJoin.mc.interactionManager.interactItem((PlayerEntity)AutoJoin.mc.player, Hand.MAIN_HAND);
        AutoJoin.mc.player.getInventory().selectedSlot = previousSlot;
        mc.getNetworkHandler().sendPacket((Packet)new UpdateSelectedSlotC2SPacket(previousSlot));
        this.compassTimer.reset();
    }

    private int findCompassSlot() {
        if (AutoJoin.mc.player == null) {
            return -1;
        }
        for (int i2 = 0; i2 < 9; ++i2) {
            if (AutoJoin.mc.player.getInventory().getStack(i2).getItem() != Items.COMPASS) continue;
            return i2;
        }
        return -1;
    }

    private void handleServerMenu() {
        Slot nextPageSlot;
        Screen class_4372 = AutoJoin.mc.currentScreen;
        if (!(class_4372 instanceof GenericContainerScreen)) {
            return;
        }
        GenericContainerScreen screen = (GenericContainerScreen)class_4372;
        if (!this.clickTimer.finished(30L)) {
            return;
        }
        String title = screen.getTitle().getString();
        ScreenHandler handler = screen.getScreenHandler();
        if (this.mode.is(MODE_CAKE_WORLD)) {
            this.handleCakeWorldMenu(handler);
            return;
        }
        if (title.contains("Выбор сервера")) {
            this.clickSlot(handler, 21);
            this.pageSwitches = 0;
            this.clickTimer.reset();
            return;
        }
        if (this.clickTargetGriefIfVisible(handler)) {
            return;
        }
        if (this.targetGrief > 36 && this.pageSwitches < 5 && (nextPageSlot = this.getSlot(handler, 44)) != null && nextPageSlot.hasStack()) {
            this.clickSlot(handler, 44);
            ++this.pageSwitches;
            this.clickTimer.reset();
        }
    }

    private void handleCakeWorldMenu(ScreenHandler handler) {
        Slot nextPageSlot;
        if (this.clickTargetGriefIfVisible(handler)) {
            return;
        }
        int craftingTableSlot = this.findCraftingTableSlot(handler);
        if (craftingTableSlot != -1) {
            this.clickSlot(handler, craftingTableSlot);
            this.pageSwitches = 0;
            this.clickTimer.reset();
            return;
        }
        if (this.targetGrief > 36 && this.pageSwitches < 5 && (nextPageSlot = this.getSlot(handler, 44)) != null && nextPageSlot.hasStack()) {
            this.clickSlot(handler, 44);
            ++this.pageSwitches;
            this.clickTimer.reset();
        }
    }

    private int findCraftingTableSlot(ScreenHandler handler) {
        for (int slot = 0; slot < handler.slots.size(); ++slot) {
            Slot containerSlot = handler.getSlot(slot);
            if (containerSlot == null || !containerSlot.hasStack() || containerSlot.getStack().getItem() != Items.CRAFTING_TABLE) continue;
            return slot;
        }
        return -1;
    }

    private boolean clickTargetGriefIfVisible(ScreenHandler handler) {
        String targetName = "ГРИФ #" + this.targetGrief + " (1.16.5+)";
        String targetPrefix = "ГРИФ #" + this.targetGrief;
        for (int slot = 0; slot < handler.slots.size(); ++slot) {
            String itemName;
            Slot containerSlot = handler.getSlot(slot);
            if (containerSlot == null || !containerSlot.hasStack() || !(itemName = containerSlot.getStack().getName().getString()).equalsIgnoreCase(targetName) && !itemName.toUpperCase().contains(targetPrefix)) continue;
            this.clickSlot(handler, slot);
            this.pageSwitches = 0;
            this.clickTimer.reset();
            return true;
        }
        return false;
    }

    private void clickSlot(ScreenHandler handler, int slot) {
        if (AutoJoin.mc.player == null || AutoJoin.mc.interactionManager == null) {
            return;
        }
        if (slot < 0 || slot >= handler.slots.size()) {
            return;
        }
        AutoJoin.mc.interactionManager.clickSlot(handler.syncId, slot, 0, SlotActionType.PICKUP, (PlayerEntity)AutoJoin.mc.player);
    }

    private Slot getSlot(ScreenHandler handler, int slot) {
        if (slot < 0 || slot >= handler.slots.size()) {
            return null;
        }
        return handler.getSlot(slot);
    }
}