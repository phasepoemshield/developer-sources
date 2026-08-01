package fun.wonderful.api.utils.player;

import fun.wonderful.api.QClient;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import lombok.Generated;
import net.minecraft.util.PlayerInput;
import net.minecraft.component.type.EquippableComponent;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.consume.UseAction;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.component.DataComponentTypes;

public final class InventoryUtils
implements QClient {
    public static int getItemSlot(Item input) {
        for (ItemStack stack : InventoryUtils.mc.player.getArmorItems()) {
            if (stack.getItem() != input) continue;
            return -2;
        }
        int slot = -1;
        for (int i2 = 0; i2 < 36; ++i2) {
            ItemStack s2 = InventoryUtils.mc.player.getInventory().getStack(i2);
            if (s2.getItem() != input) continue;
            slot = i2;
            break;
        }
        if (slot < 9 && slot != -1) {
            slot += 36;
        }
        return slot;
    }

    public static int getEnchantmentLevel(ItemStack stack, RegistryKey<Enchantment> enchantmentKey) {
        ItemEnchantmentsComponent enchantments = (ItemEnchantmentsComponent)stack.getOrDefault(DataComponentTypes.ENCHANTMENTS, (Object)ItemEnchantmentsComponent.DEFAULT);
        for (RegistryEntry enchantment : enchantments.getEnchantments()) {
            if (!enchantment.matchesKey(enchantmentKey)) continue;
            return enchantments.getLevel(enchantment);
        }
        return 0;
    }

    public static int findBestElytraSlot() {
        if (InventoryUtils.mc.player == null) {
            return -1;
        }
        int bestSlot = -1;
        double bestScore = -1.0;
        for (int slot = 0; slot < 36; ++slot) {
            int currentDamage;
            int maxDurability;
            double durabilityRatio;
            int mending;
            int unbreaking;
            ItemStack stack = InventoryUtils.mc.player.getInventory().getStack(slot);
            if (stack.getItem() != Items.ELYTRA) continue;
            int protection = InventoryUtils.getEnchantmentLevel(stack, (RegistryKey<Enchantment>)Enchantments.PROTECTION);
            double score = (double)(protection * 100 + (unbreaking = InventoryUtils.getEnchantmentLevel(stack, (RegistryKey<Enchantment>)Enchantments.UNBREAKING)) * 10 + ((mending = InventoryUtils.getEnchantmentLevel(stack, (RegistryKey<Enchantment>)Enchantments.MENDING)) > 0 ? 1 : 0)) + (durabilityRatio = (double)((maxDurability = stack.getMaxDamage()) - (currentDamage = stack.getDamage())) / (double)maxDurability) * 10.0;
            if (!(score > bestScore)) continue;
            bestScore = score;
            bestSlot = slot;
        }
        return bestSlot;
    }

    public static int findBestChestplateSlot() {
        if (InventoryUtils.mc.player == null) {
            return -1;
        }
        int bestSlot = -1;
        double bestScore = -1.0;
        for (int slot = 0; slot < 36; ++slot) {
            double durabilityRatio;
            ItemStack stack = InventoryUtils.mc.player.getInventory().getStack(slot);
            Item class_17922 = stack.getItem();
            if (!(class_17922 instanceof ArmorItem)) continue;
            ArmorItem armor = (ArmorItem)class_17922;
            EquippableComponent equippable = (EquippableComponent)stack.get(DataComponentTypes.EQUIPPABLE);
            if (equippable == null || equippable.slot() != EquipmentSlot.CHEST) continue;
            int protection = InventoryUtils.getEnchantmentLevel(stack, (RegistryKey<Enchantment>)Enchantments.PROTECTION);
            int unbreaking = InventoryUtils.getEnchantmentLevel(stack, (RegistryKey<Enchantment>)Enchantments.UNBREAKING);
            int mending = InventoryUtils.getEnchantmentLevel(stack, (RegistryKey<Enchantment>)Enchantments.MENDING);
            int priority = InventoryUtils.getChestplatePriority((Item)armor);
            int maxDamage = stack.getMaxDamage();
            int damage = stack.getDamage();
            double score = (double)priority * 10000.0 + (double)protection * 100.0 + (double)unbreaking * 10.0 + (double)(mending > 0 ? 1 : 0) + (durabilityRatio = maxDamage == 0 ? 1.0 : (double)(maxDamage - damage) / (double)maxDamage) * 10.0;
            if (!(score > bestScore)) continue;
            bestScore = score;
            bestSlot = slot;
        }
        return bestSlot;
    }

    public static int getChestplatePriority(Item item) {
        if (item == Items.NETHERITE_CHESTPLATE) {
            return 5;
        }
        if (item == Items.DIAMOND_CHESTPLATE) {
            return 4;
        }
        if (item == Items.IRON_CHESTPLATE) {
            return 3;
        }
        if (item == Items.GOLDEN_CHESTPLATE) {
            return 2;
        }
        if (item == Items.CHAINMAIL_CHESTPLATE) {
            return 2;
        }
        if (item == Items.LEATHER_CHESTPLATE) {
            return 1;
        }
        return 0;
    }

    public static int find(Item item, int start, int end) {
        if (InventoryUtils.mc.player != null) {
            for (int i2 = end; i2 >= start; --i2) {
                if (InventoryUtils.mc.player.currentScreenHandler.syncId != 0 && InventoryUtils.mc.player.currentScreenHandler.getSlot(i2).getStack().getItem() == item) {
                    return i2;
                }
                if (InventoryUtils.mc.player.currentScreenHandler.syncId != 0 || InventoryUtils.mc.player.getInventory().getStack(i2).getItem() != item) continue;
                return i2;
            }
        }
        return -1;
    }

    public static void swapAndUseHvH(Item item) {
        int slot = InventoryUtils.find(item, 9, 45);
        int slotHotbar = InventoryUtils.find(item, 0, 8);
        int previousSlot = InventoryUtils.mc.player.getInventory().selectedSlot;
        boolean isUsingItem = InventoryUtils.mc.player.isUsingItem();
        if (InventoryUtils.mc.player.getMainHandStack().getItem() == item) {
            if (!isUsingItem) {
                InventoryUtils.mc.interactionManager.interactItem((PlayerEntity)InventoryUtils.mc.player, Hand.MAIN_HAND);
            }
            return;
        }
        if (InventoryUtils.mc.player.getOffHandStack().getItem() == item) {
            InventoryUtils.mc.interactionManager.interactItem((PlayerEntity)InventoryUtils.mc.player, Hand.OFF_HAND);
            return;
        }
        if (isUsingItem) {
            if (slotHotbar != -1) {
                InventoryUtils.mc.interactionManager.clickSlot(0, 36 + slotHotbar, 40, SlotActionType.SWAP, (PlayerEntity)InventoryUtils.mc.player);
                InventoryUtils.mc.player.networkHandler.sendPacket((Packet)new CloseHandledScreenC2SPacket(0));
                InventoryUtils.mc.interactionManager.interactItem((PlayerEntity)InventoryUtils.mc.player, Hand.OFF_HAND);
                InventoryUtils.mc.interactionManager.clickSlot(0, 36 + slotHotbar, 40, SlotActionType.SWAP, (PlayerEntity)InventoryUtils.mc.player);
                InventoryUtils.mc.player.networkHandler.sendPacket((Packet)new CloseHandledScreenC2SPacket(0));
            } else if (slot != -1) {
                InventoryUtils.mc.interactionManager.clickSlot(0, slot, 40, SlotActionType.SWAP, (PlayerEntity)InventoryUtils.mc.player);
                InventoryUtils.mc.player.networkHandler.sendPacket((Packet)new CloseHandledScreenC2SPacket(0));
                InventoryUtils.mc.interactionManager.interactItem((PlayerEntity)InventoryUtils.mc.player, Hand.OFF_HAND);
                InventoryUtils.mc.interactionManager.clickSlot(0, slot, 40, SlotActionType.SWAP, (PlayerEntity)InventoryUtils.mc.player);
                InventoryUtils.mc.player.networkHandler.sendPacket((Packet)new CloseHandledScreenC2SPacket(0));
            }
            return;
        }
        if (slotHotbar != -1) {
            InventoryUtils.mc.player.networkHandler.sendPacket((Packet)new UpdateSelectedSlotC2SPacket(slotHotbar));
            InventoryUtils.mc.interactionManager.interactItem((PlayerEntity)InventoryUtils.mc.player, Hand.MAIN_HAND);
            InventoryUtils.mc.player.networkHandler.sendPacket((Packet)new UpdateSelectedSlotC2SPacket(previousSlot));
            return;
        }
        if (slot != -1) {
            int slotCorrectable = -1;
            for (int slotNone = 0; slotNone < 8; ++slotNone) {
                ItemStack stack = InventoryUtils.mc.player.getInventory().getStack(slotNone);
                if (stack.isEmpty()) {
                    slotCorrectable = slotNone;
                    break;
                }
                UseAction action = stack.getUseAction();
                if (action != UseAction.NONE) continue;
                slotCorrectable = slotNone;
            }
            boolean wasSprinting = false;
            if (InventoryUtils.mc.player.isSprinting()) {
                InventoryUtils.mc.player.networkHandler.sendPacket((Packet)new PlayerInputC2SPacket(new PlayerInput(false, false, false, false, false, false, false)));
                InventoryUtils.mc.player.setSprinting(false);
                InventoryUtils.mc.player.networkHandler.sendPacket((Packet)new ClientCommandC2SPacket((Entity)InventoryUtils.mc.player, ClientCommandC2SPacket.Mode.STOP_SPRINTING));
                if (!ModuleClass.sprint.isEnable()) {
                    InventoryUtils.mc.options.sprintKey.setPressed(false);
                }
                wasSprinting = true;
            }
            if (slotCorrectable == -1) {
                InventoryUtils.mc.interactionManager.clickSlot(0, slot, 8, SlotActionType.SWAP, (PlayerEntity)InventoryUtils.mc.player);
                InventoryUtils.mc.player.networkHandler.sendPacket((Packet)new CloseHandledScreenC2SPacket(0));
                InventoryUtils.mc.player.networkHandler.sendPacket((Packet)new UpdateSelectedSlotC2SPacket(8));
                InventoryUtils.mc.interactionManager.interactItem((PlayerEntity)InventoryUtils.mc.player, Hand.MAIN_HAND);
                InventoryUtils.mc.player.networkHandler.sendPacket((Packet)new UpdateSelectedSlotC2SPacket(previousSlot));
            } else {
                InventoryUtils.mc.interactionManager.clickSlot(0, slot, slotCorrectable, SlotActionType.SWAP, (PlayerEntity)InventoryUtils.mc.player);
                InventoryUtils.mc.player.networkHandler.sendPacket((Packet)new CloseHandledScreenC2SPacket(0));
                InventoryUtils.mc.player.networkHandler.sendPacket((Packet)new UpdateSelectedSlotC2SPacket(slotCorrectable));
                InventoryUtils.mc.interactionManager.interactItem((PlayerEntity)InventoryUtils.mc.player, Hand.MAIN_HAND);
                InventoryUtils.mc.player.networkHandler.sendPacket((Packet)new UpdateSelectedSlotC2SPacket(previousSlot));
                InventoryUtils.mc.interactionManager.clickSlot(0, slot, slotCorrectable, SlotActionType.SWAP, (PlayerEntity)InventoryUtils.mc.player);
                InventoryUtils.mc.player.networkHandler.sendPacket((Packet)new CloseHandledScreenC2SPacket(0));
            }
            if (wasSprinting) {
                InventoryUtils.mc.player.networkHandler.sendPacket((Packet)new PlayerInputC2SPacket(InventoryUtils.mc.player.input.playerInput));
            }
        }
    }

    @Generated
    private InventoryUtils() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}