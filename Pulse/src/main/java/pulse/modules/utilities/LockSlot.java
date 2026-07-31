package pulse.modules.utilities;

import java.util.Objects;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MiningToolItem;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.BooleanSetting;
import pulse.settings.ModeSetting;
import pulse.events.DropItemEvent;

@ModuleInfo(a = "Lock Slot", b = "Prevents dropping items from selected hotbar slots.", c = ModuleCategory.UTILITIES)
public class LockSlot extends ClientModule {
    private final BooleanSetting lockHotbarSlots = new BooleanSetting("Lock Hotbar Slots", true);
    private final ModeSetting slots;
    private final BooleanSetting lockOnlyValuableItems;

    public LockSlot() {
        ModeSetting modeSetting = new ModeSetting("Slots", new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"}, new int[0]);
        BooleanSetting booleanSetting = this.lockHotbarSlots;
        Objects.requireNonNull(booleanSetting);
        this.slots = modeSetting.a(booleanSetting::k);
        this.lockOnlyValuableItems = new BooleanSetting("Only Valuable Items", false);
    }

    @EventHandler
    public void a(DropItemEvent dropItemEvent) {
        if (!this.lockHotbarSlots.a()) {
            return;
        }
        int slot = dropItemEvent.slot();
        if (slot < 0 || slot > 8) {
            return;
        }
        if (!this.slots.a(slot)) {
            return;
        }
        if (this.lockOnlyValuableItems.a()) {
            if (c == null || c.player == null) {
                return;
            }
            ItemStack stack = c.player.getInventory().getStack(slot);
            if (stack.isEmpty() || !isValuable(stack)) {
                return;
            }
        }
        dropItemEvent.a();
    }

    private static boolean isValuable(ItemStack stack) {
        if (stack.getItem() instanceof ArmorItem || stack.getItem() instanceof MiningToolItem) {
            return true;
        }
        if (stack.getItem() == Items.TOTEM_OF_UNDYING || stack.getItem() == Items.ELYTRA
            || stack.getItem() == Items.SHIELD || stack.getItem() == Items.CROSSBOW
            || stack.getItem() == Items.BOW || stack.getItem() == Items.TRIDENT
            || stack.getItem() == Items.ENDER_PEARL || stack.getItem() == Items.CHORUS_FRUIT
            || stack.getItem() == Items.GOLDEN_APPLE || stack.getItem() == Items.ENCHANTED_GOLDEN_APPLE) {
            return true;
        }
        return stack.hasEnchantments();
    }
}