package pulse.modules.utilities;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Formatting;
import pulse.events.ClientTickEvent;
import pulse.events.PacketEvent;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.BooleanSetting;
import pulse.util.ElapsedTimer;

@ModuleInfo(a = "Auto Reissue", b = "Tracks auction reissue cooldowns.", c = ModuleCategory.UTILITIES)
public class AutoReissue extends ClientModule {
    private final BooleanSetting autoReissue = new BooleanSetting("Auto Reissue", true);
    private final BooleanSetting showCooldownOverlay = new BooleanSetting("Show Cooldown Overlay", true);
    public boolean overlayActive = false;
    public ElapsedTimer timer = new ElapsedTimer();
    public int durationMs = 15000;
    private long lastClickMs;

    @EventHandler
    public void a(PacketEvent packetEvent) {
        if (packetEvent.e() != PacketEvent.MessageDirection.RECEIVE) {
            return;
        }
        if (!(packetEvent.d() instanceof GameMessageS2CPacket)) {
            return;
        }
        String msg = Formatting.strip(((GameMessageS2CPacket) packetEvent.d()).content().getString());
        if (msg == null) {
            return;
        }
        String lower = msg.toLowerCase();
        if (lower.contains("перевыставить") || lower.contains("повторно выставить") || lower.contains("подождите") && lower.contains("сек")) {
            this.overlayActive = this.showCooldownOverlay.k().booleanValue();
            this.timer.b();
            this.durationMs = parseDurationMs(lower);
        }
        if (lower.contains("предмет успешно") || lower.contains("выставлен на аукцион")) {
            this.overlayActive = false;
        }
    }

    @EventHandler
    public void a(ClientTickEvent clientTickEvent) {
        if (this.overlayActive && this.timer.a(this.durationMs)) {
            this.overlayActive = false;
        }
        if (!this.autoReissue.k().booleanValue() || c.player == null || c.interactionManager == null) {
            return;
        }
        if (!(c.currentScreen instanceof HandledScreen<?>)) {
            return;
        }
        if (System.currentTimeMillis() - this.lastClickMs < 250L) {
            return;
        }
        HandledScreen<?> screen = (HandledScreen<?>) c.currentScreen;
        String title = screen.getTitle().getString().toLowerCase();
        if (!(title.contains("аукцион") || title.contains("хранилище") || title.contains("auction"))) {
            return;
        }
        int syncId = screen.getScreenHandler().syncId;
        int clockSlot = findClockSlot(screen);
        if (clockSlot == -1) {
            return;
        }
        if (this.overlayActive && !this.timer.a(this.durationMs)) {
            return;
        }
        c.interactionManager.clickSlot(syncId, clockSlot, 0, SlotActionType.PICKUP, (PlayerEntity) c.player);
        this.lastClickMs = System.currentTimeMillis();
        this.overlayActive = this.showCooldownOverlay.k().booleanValue();
        this.timer.b();
    }

    private int findClockSlot(HandledScreen<?> screen) {
        var slots = screen.getScreenHandler().slots;
        for (int i = 0; i < slots.size(); i++) {
            ItemStack stack = slots.get(i).getStack();
            if (!stack.isEmpty() && stack.getItem() == Items.CLOCK) {
                return i;
            }
        }
        return -1;
    }

    private int parseDurationMs(String lower) {
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(\\d+)\\s*сек").matcher(lower);
        if (matcher.find()) {
            try {
                return Math.max(1000, Integer.parseInt(matcher.group(1)) * 1000);
            } catch (NumberFormatException ignored) {
            }
        }
        return 15000;
    }

    @Override
    public void f() {
        super.f();
        this.overlayActive = false;
        this.timer.b();
    }
}
