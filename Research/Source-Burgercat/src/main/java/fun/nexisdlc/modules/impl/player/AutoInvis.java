package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PotionItem;
import net.minecraft.item.SplashPotionItem;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.util.Hand;

@FunctionAdd(name = "AutoInvis", alias = "Auto Invis", category = Category.Player, description = "Автоматически обновляет невидимость")
public class AutoInvis extends Function {
    private static final int TRIGGER_TICKS = 200;
    private static final long RETRY_DELAY_MS = 3000L;
    private final ModeSetting mode = new ModeSetting("Режим", "Кидать", "Кидать", "Запивать");
    private long nextAttemptAtMs;
    private int restoreSlot = -1;
    private boolean drinking;

    public AutoInvis() {
        addSettings(mode);
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (nullCheck() || mc.interactionManager == null || mc.currentScreen != null) return;

        if (drinking) {
            if (!mc.player.isUsingItem()) {
                restoreSlot();
                drinking = false;
                nextAttemptAtMs = System.currentTimeMillis() + RETRY_DELAY_MS;
            }
            return;
        }

        if (mc.player.isUsingItem() || getInvisibilityTicksRemaining() >= TRIGGER_TICKS || System.currentTimeMillis() < nextAttemptAtMs) return;

        if (mode.is("Запивать")) {
            int slot = findPotion(false);
            if (slot == -1) return;
            restoreSlot = mc.player.getInventory().getSelectedSlot();
            mc.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(slot));
            mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
            drinking = true;
            return;
        }

        int slot = findPotion(true);
        if (slot == -1) return;
        int previousSlot = mc.player.getInventory().getSelectedSlot();
        float yaw = mc.player.getYaw();
        float pitch = 90f;
        mc.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(slot));
        mc.getNetworkHandler().sendPacket(new PlayerMoveC2SPacket.LookAndOnGround(yaw, pitch, mc.player.isOnGround(), mc.player.horizontalCollision));
        PlayerUtils.sendSequencedPacket(id -> new PlayerInteractItemC2SPacket(Hand.MAIN_HAND, id, yaw, pitch));
        mc.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(previousSlot));
        nextAttemptAtMs = System.currentTimeMillis() + RETRY_DELAY_MS;
    }

    private int getInvisibilityTicksRemaining() {
        StatusEffectInstance effect = mc.player.getStatusEffect(StatusEffects.INVISIBILITY);
        return effect == null ? 0 : effect.getDuration();
    }

    private int findPotion(boolean splash) {
        for (int i = 0; i < 9; i++) {
            ItemStack stack = mc.player.getInventory().getStack(i);
            boolean type = splash ? stack.getItem() instanceof SplashPotionItem : stack.getItem() instanceof PotionItem;
            if (type && hasInvisibilityEffect(stack)) return i;
        }
        return -1;
    }

    private boolean hasInvisibilityEffect(ItemStack stack) {
        PotionContentsComponent contents = stack.getOrDefault(DataComponentTypes.POTION_CONTENTS, PotionContentsComponent.DEFAULT);
        for (StatusEffectInstance effect : contents.getEffects()) {
            if (effect.getEffectType() == StatusEffects.INVISIBILITY) return true;
        }
        return false;
    }

    private void restoreSlot() {
        if (restoreSlot >= 0 && mc.player != null && mc.getNetworkHandler() != null) {
            mc.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(restoreSlot));
        }
        restoreSlot = -1;
    }

    @Override
    public void onDisable() {
        restoreSlot();
        drinking = false;
        nextAttemptAtMs = 0L;
        super.onDisable();
    }
}
