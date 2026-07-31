package fun.nexisdlc.modules.impl.combat.aura;

import fun.nexisdlc.client.utils.player.PlayerInventoryUtil;
import fun.nexisdlc.mixins.accessors.ClientPlayerInteractionManagerAccessor;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public final class AuraShieldBreaker {
    private AuraShieldBreaker() {
    }

    public static int prepareSlot(MinecraftClient mc, LivingEntity attackTarget, boolean enabled) {
        if (mc.player == null || !shouldUseShieldBreaker(attackTarget, enabled)) return -1;

        int axeSlot = findAxeSlotInHotbar(mc);
        if (axeSlot == -1) return -1;

        int originalSlot = mc.player.getInventory().getSelectedSlot();
        if (axeSlot == originalSlot) return -1;

        setSelectedSlotSynced(mc, axeSlot);
        return originalSlot;
    }

    public static void restoreSlot(MinecraftClient mc, int slot) {
        if (slot == -1) return;
        setSelectedSlotSynced(mc, slot);
    }

    public static boolean isUsingShield(MinecraftClient mc) {
        return mc.player != null
                && mc.player.isUsingItem()
                && mc.player.getActiveItem().isOf(Items.SHIELD);
    }

    public static void releaseShieldForAttack(MinecraftClient mc) {
        if (mc.player == null || mc.interactionManager == null || !isUsingShield(mc)) return;
        mc.interactionManager.stopUsingItem(mc.player);
    }

    private static boolean shouldUseShieldBreaker(LivingEntity attackTarget, boolean enabled) {
        if (!enabled) return false;
        if (!(attackTarget instanceof PlayerEntity player) || !player.isBlocking()) return false;

        return player.getActiveItem().isOf(Items.SHIELD)
                || player.getMainHandStack().isOf(Items.SHIELD)
                || player.getOffHandStack().isOf(Items.SHIELD);
    }

    private static int findAxeSlotInHotbar(MinecraftClient mc) {
        if (mc.player == null) return -1;

        int bestSlot = -1;
        int bestPriority = -1;
        for (int slot = 0; slot < 9; slot++) {
            ItemStack stack = mc.player.getInventory().getStack(slot);
            int priority = axePriority(stack);
            if (priority > bestPriority) {
                bestPriority = priority;
                bestSlot = slot;
            }
        }
        return bestSlot;
    }

    private static int axePriority(ItemStack stack) {
        if (stack.isOf(Items.NETHERITE_AXE)) return 6;
        if (stack.isOf(Items.DIAMOND_AXE)) return 5;
        if (stack.isOf(Items.IRON_AXE)) return 4;
        if (stack.isOf(Items.STONE_AXE)) return 3;
        if (stack.isOf(Items.GOLDEN_AXE)) return 2;
        if (stack.isOf(Items.WOODEN_AXE)) return 1;
        return -1;
    }

    private static void setSelectedSlotSynced(MinecraftClient mc, int slot) {
        if (mc.player == null || slot < 0 || slot > 8) return;

        PlayerInventoryUtil.setSelectedSlotInstant(slot);
        syncSelectedSlot(mc);
    }

    public static void syncSelectedSlot(MinecraftClient mc) {
        if (mc.interactionManager instanceof ClientPlayerInteractionManagerAccessor accessor) {
            accessor.nexis$syncSelectedSlot();
        }
    }
}
