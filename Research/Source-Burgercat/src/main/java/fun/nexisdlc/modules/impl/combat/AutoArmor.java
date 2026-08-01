package fun.nexisdlc.modules.impl.combat;

import fun.nexisdlc.client.events.impl.client.TickEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.player.PlayerInventoryUtil;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;

import java.util.Comparator;

@FunctionAdd(name = "AutoArmor", alias = "Auto Armor", category = Category.Combat, description = "Автоматически надевает лучшую броню")
public class AutoArmor extends Function {
    private static final Comparator<ArmorRank> ARMOR_PRIORITY = Comparator
            .comparingInt(ArmorRank::defense)
            .thenComparingInt(ArmorRank::materialTier)
            .thenComparingInt(ArmorRank::protectionEnchant)
            .thenComparingDouble(ArmorRank::durabilityFactor)
            .thenComparingInt(ArmorRank::remainingDurability);
    private static final String MODE_LEGIT = "Легитный";
    private static final String MODE_RAGE = "Рейдж";
    private final ModeSetting mode = new ModeSetting("Режим", MODE_LEGIT, MODE_LEGIT, MODE_RAGE);

    public AutoArmor() {
        addSettings(mode);
    }

    @EventHandler
    public void onTick(TickEvent e) {
        boolean rage = mode.is(MODE_RAGE);

        if (nullCheck() || (!rage ? (mc.currentScreen != null) : false) || mc.player.isCreative()) {
            return;
        }

        if (!rage) {
            if (tryEquip(EquipmentSlot.HEAD, false)) return;
            if (tryEquip(EquipmentSlot.CHEST, false)) return;
            if (tryEquip(EquipmentSlot.LEGS, false)) return;
            tryEquip(EquipmentSlot.FEET, false);
            return;
        }

        tryEquip(EquipmentSlot.HEAD, true);
        tryEquip(EquipmentSlot.CHEST, true);
        tryEquip(EquipmentSlot.LEGS, true);
        tryEquip(EquipmentSlot.FEET, true);
    }

    private boolean tryEquip(EquipmentSlot equipmentSlot, boolean instant) {
        ItemStack equipped = mc.player.getEquippedStack(equipmentSlot);
        ArmorRank equippedRank = equipped.isEmpty() ? new ArmorRank(-1, -1, -1, -1.0D, -1) : scoreArmor(equipped);

        Slot bestSlot = PlayerInventoryUtil.slots()
                .filter(slot -> slot.id >= 9 && slot.id <= 44)
                .filter(slot -> isArmorForSlot(slot.getStack(), equipmentSlot))
                .max(Comparator.comparing(slot -> scoreArmor(slot.getStack()), ARMOR_PRIORITY))
                .orElse(null);

        if (bestSlot == null) {
            return false;
        }
        ArmorRank bestRank = scoreArmor(bestSlot.getStack());
        if (!equipped.isEmpty() && ARMOR_PRIORITY.compare(bestRank, equippedRank) <= 0) {
            return false;
        }

        int armorSlotId = armorSlotId(equipmentSlot);
        if (armorSlotId != -1) {
            if (instant) {
                instantSwap(bestSlot.id, armorSlotId);
            } else {
                PlayerInventoryUtil.swapItemsPhased(bestSlot.id, armorSlotId, true);
            }
            return true;
        }
        return false;
    }

    private static void instantSwap(int fromSlotId, int armorSlotId) {
        PlayerInventoryUtil.clickSlot(fromSlotId, 0, SlotActionType.PICKUP);
        PlayerInventoryUtil.clickSlot(armorSlotId, 0, SlotActionType.PICKUP);
        PlayerInventoryUtil.clickSlot(fromSlotId, 0, SlotActionType.PICKUP);
        PlayerInventoryUtil.updateSlots();
    }

    private static boolean isArmorForSlot(ItemStack stack, EquipmentSlot equipmentSlot) {
        String id = itemId(stack);
        return switch (equipmentSlot) {
            case HEAD -> id.endsWith("_helmet") || id.endsWith("turtle_helmet");
            case CHEST -> id.endsWith("_chestplate");
            case LEGS -> id.endsWith("_leggings");
            case FEET -> id.endsWith("_boots");
            default -> false;
        };
    }

    private static ArmorRank scoreArmor(ItemStack stack) {
        String id = itemId(stack);
        if (!(id.endsWith("_helmet")
                || id.endsWith("turtle_helmet")
                || id.endsWith("_chestplate")
                || id.endsWith("_leggings")
                || id.endsWith("_boots"))) {
            return new ArmorRank(-1, -1, -1, -1.0D, -1);
        }

        int defense = baseDefenseScore(id);
        int materialTier = materialScore(id);
        int protectionEnchant = protectionEnchantLevel(stack);
        int maxDamage = stack.getMaxDamage();
        int remainingDurability = maxDamage > 0 ? maxDamage - stack.getDamage() : 0;
        double durabilityFactor = maxDamage > 0 ? (double) remainingDurability / (double) maxDamage : 0.0D;

        return new ArmorRank(defense, materialTier, protectionEnchant, durabilityFactor, remainingDurability);
    }

    private static int protectionEnchantLevel(ItemStack stack) {
        ItemEnchantmentsComponent enchantments = stack.get(DataComponentTypes.ENCHANTMENTS);
        if (enchantments == null) {
            return 0;
        }

        for (RegistryEntry<Enchantment> enchantment : enchantments.getEnchantments()) {
            if (enchantment.matchesKey(Enchantments.PROTECTION)) {
                return enchantments.getLevel(enchantment);
            }
        }
        return 0;
    }

    private static String itemId(ItemStack stack) {
        return Registries.ITEM.getId(stack.getItem()).toString();
    }

    private static int materialScore(String id) {
        if (id.contains("netherite")) return 6;
        if (id.contains("diamond")) return 5;
        if (id.contains("iron")) return 4;
        if (id.contains("chainmail")) return 3;
        if (id.contains("golden")) return 2;
        if (id.contains("leather")) return 1;
        if (id.contains("turtle")) return 4;
        return 0;
    }

    private static int baseDefenseScore(String id) {
        if (id.endsWith("turtle_helmet")) return 2;

        boolean helmet = id.endsWith("_helmet");
        boolean chestplate = id.endsWith("_chestplate");
        boolean leggings = id.endsWith("_leggings");
        boolean boots = id.endsWith("_boots");

        if (!(helmet || chestplate || leggings || boots)) {
            return 0;
        }

        if (id.contains("netherite")) {
            if (helmet) return 4;
            if (chestplate) return 9;
            if (leggings) return 7;
            return 4;
        }
        if (id.contains("diamond")) {
            if (helmet) return 3;
            if (chestplate) return 8;
            if (leggings) return 6;
            return 3;
        }
        if (id.contains("iron")) {
            if (helmet) return 2;
            if (chestplate) return 6;
            if (leggings) return 5;
            return 2;
        }
        if (id.contains("chainmail")) {
            if (helmet) return 2;
            if (chestplate) return 5;
            if (leggings) return 4;
            return 1;
        }
        if (id.contains("golden")) {
            if (helmet) return 2;
            if (chestplate) return 5;
            if (leggings) return 3;
            return 1;
        }
        if (id.contains("leather")) {
            if (helmet) return 1;
            if (chestplate) return 3;
            if (leggings) return 2;
            return 1;
        }

        return materialScore(id);
    }

    private static int armorSlotId(EquipmentSlot equipmentSlot) {
        return switch (equipmentSlot) {
            case HEAD -> 5;
            case CHEST -> 6;
            case LEGS -> 7;
            case FEET -> 8;
            default -> -1;
        };
    }

    private record ArmorRank(int defense, int materialTier, int protectionEnchant, double durabilityFactor, int remainingDurability) {
    }
}
