package fun.wonderful.client.modules.impl.player;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AutoArmor
extends Module {
    public static AutoArmor INSTANCE = new AutoArmor();
    private final FloatSetting delay = new FloatSetting("Задержка", 25.0f, 1.0f, 1000.0f, 1.0f);
    private long lastEquipTime = 0L;

    public AutoArmor() {
        super("AutoArmor", "Автоматически одевает броню", Module.ModuleCategory.PLAYER);
        this.addSettings(this.delay);
    }

    @EventLink
    public void onEvent(EventUpdate event) {
        if (AutoArmor.mc.player == null || AutoArmor.mc.world == null) {
            return;
        }
        if (this.isMoving()) {
            return;
        }
        long currentTime = System.currentTimeMillis();
        if ((float)(currentTime - this.lastEquipTime) < this.delay.get()) {
            return;
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            ItemStack currentArmor = AutoArmor.mc.player.getInventory().getArmorStack(i2);
            if (!currentArmor.isEmpty()) continue;
            for (int j2 = 0; j2 < 36; ++j2) {
                ArmorItem armorItem;
                Item class_17922;
                ItemStack stack = AutoArmor.mc.player.getInventory().getStack(j2);
                if (stack.isEmpty() || !((class_17922 = stack.getItem()) instanceof ArmorItem) || this.getArmorSlotIndex(armorItem = (ArmorItem)class_17922) != i2) continue;
                int slotToEquip = j2;
                if (j2 < 9) {
                    slotToEquip = j2 + 36;
                }
                AutoArmor.mc.interactionManager.clickSlot(0, slotToEquip, 0, SlotActionType.QUICK_MOVE, (PlayerEntity)AutoArmor.mc.player);
                this.lastEquipTime = currentTime;
                return;
            }
        }
    }

    private boolean isMoving() {
        return AutoArmor.mc.player.input.movementForward != 0.0f || AutoArmor.mc.player.input.movementSideways != 0.0f;
    }

    private int getArmorSlotIndex(ArmorItem armor) {
        String itemName = armor.toString().toLowerCase();
        if (itemName.contains("helmet") || itemName.contains("skull")) {
            return 3;
        }
        if (itemName.contains("chestplate") || itemName.contains("tunic")) {
            return 2;
        }
        if (itemName.contains("leggings") || itemName.contains("pants")) {
            return 1;
        }
        if (itemName.contains("boots") || itemName.contains("shoes")) {
            return 0;
        }
        return 0;
    }
}