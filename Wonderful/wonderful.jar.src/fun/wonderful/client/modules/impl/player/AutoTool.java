package fun.wonderful.client.modules.impl.player;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.utils.player.InventoryUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.block.Blocks;
import net.minecraft.util.hit.HitResult;
import net.minecraft.network.packet.Packet;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.registry.RegistryKey;

public class AutoTool
extends Module {
    public static AutoTool INSTANCE = new AutoTool();
    private final BooleanSetting packet = new BooleanSetting("Пакетный", false);
    private final BooleanSetting silent = new BooleanSetting("Видно только для других людей", false);
    private int previousSlot = -1;

    public AutoTool() {
        super("AutoTool", "При копании берет лучший предмет", Module.ModuleCategory.PLAYER);
        this.addSettings(this.packet, this.silent);
    }

    @EventLink
    public void onEvent(EventUpdate event) {
        if (AutoTool.mc.player == null || AutoTool.mc.world == null || AutoTool.mc.interactionManager == null || AutoTool.mc.player.isCreative()) {
            this.previousSlot = -1;
            return;
        }
        if (AutoTool.mc.interactionManager.isBreakingBlock()) {
            int toolSlot;
            if (this.previousSlot == -1) {
                this.previousSlot = AutoTool.mc.player.getInventory().selectedSlot;
            }
            if ((toolSlot = this.findOptimalTool()) != -1) {
                this.switchToSlot(toolSlot);
            }
        } else if (this.previousSlot != -1) {
            this.switchToSlot(this.previousSlot);
            this.previousSlot = -1;
        }
    }

    private void switchToSlot(int slot) {
        if (slot < 0 || slot > 8) {
            return;
        }
        if (AutoTool.mc.player.getInventory().selectedSlot == slot) {
            return;
        }
        if (this.silent.isState()) {
            mc.getNetworkHandler().sendPacket((Packet)new UpdateSelectedSlotC2SPacket(slot));
        } else if (this.packet.isState()) {
            AutoTool.mc.player.getInventory().selectedSlot = slot;
            mc.getNetworkHandler().sendPacket((Packet)new UpdateSelectedSlotC2SPacket(slot));
        } else {
            AutoTool.mc.player.getInventory().selectedSlot = slot;
        }
    }

    private int findOptimalTool() {
        int shearsSlot;
        HitResult hitResult = AutoTool.mc.crosshairTarget;
        if (!(hitResult instanceof BlockHitResult)) {
            return -1;
        }
        BlockHitResult blockHitResult = (BlockHitResult)hitResult;
        BlockState blockState = AutoTool.mc.world.getBlockState(blockHitResult.getBlockPos());
        if (blockState.isOf(Blocks.COBWEB) && (shearsSlot = this.findBestShearsSlot()) != -1) {
            return shearsSlot;
        }
        return this.findBestToolSlot(blockState);
    }

    private int findBestShearsSlot() {
        int bestSlot = -1;
        int bestEfficiency = -1;
        for (int i2 = 0; i2 < 9; ++i2) {
            int efficiency;
            ItemStack stack = AutoTool.mc.player.getInventory().getStack(i2);
            if (!stack.isOf(Items.SHEARS) || (efficiency = InventoryUtils.getEnchantmentLevel(stack, (RegistryKey<Enchantment>)Enchantments.EFFICIENCY)) <= bestEfficiency) continue;
            bestEfficiency = efficiency;
            bestSlot = i2;
        }
        return bestSlot;
    }

    private int findBestToolSlot(BlockState blockState) {
        int bestSlot = -1;
        float bestSpeed = 1.0f;
        for (int i2 = 0; i2 < 9; ++i2) {
            float speed = AutoTool.mc.player.getInventory().getStack(i2).getMiningSpeedMultiplier(blockState);
            if (!(speed > bestSpeed)) continue;
            bestSpeed = speed;
            bestSlot = i2;
        }
        return bestSlot;
    }

    @Override
    public void onDisable() {
        this.previousSlot = -1;
        super.onDisable();
    }
}