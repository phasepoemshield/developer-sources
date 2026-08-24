package moscow.rockstar.module.player;

import java.util.Comparator;
import java.util.List;
import moscow.rockstar.Rockstar;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.systems.event.impl.window.KeyPressEvent;
import moscow.rockstar.systems.event.impl.window.MouseEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.systems.notifications.NotificationType;
import moscow.rockstar.config.settings.BindSetting;
import moscow.rockstar.config.settings.BooleanSetting;
import moscow.rockstar.util.inventory.EnchantmentUtility;
import moscow.rockstar.util.inventory.InventoryUtility;
import moscow.rockstar.util.inventory.ItemSlot;
import moscow.rockstar.util.inventory.group.SlotGroups;
import moscow.rockstar.util.inventory.slots.ArmorSlot;
import moscow.rockstar.util.mixins.ArmorItemAddition;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.equipment.EquipmentType;

@ModuleInfo(name = "Boots Swap", category = ModuleCategory.PLAYER, desc = "Автоматическая смена ботинок на более прочные")
public class BootsSwap extends BaseModule {
   private final BooleanSetting automatic = new BooleanSetting(this, "Автоматически");
   private final BindSetting swapKey = new BindSetting(this, "Клавиша смены");
   private final EventListener<ClientPlayerTickEvent> onTick = event -> {
      if (this.automatic.isEnabled() && mc.player != null && mc.player.isTouchingWater()) {
         this.swapToBouncyBoots();
      }
   };
   private final EventListener<KeyPressEvent> onKey = event -> {
      if (event.getAction() == 1 && this.swapKey.isKey(event.getKey())) {
         this.swapBoots();
      }
   };
   private final EventListener<MouseEvent> onMouse = event -> {
      if (event.getAction() == 1 && this.swapKey.isKey(event.getButton())) {
         this.swapToRegularBoots();
      }
   };

   private void swapBoots() {
      boolean wearingBouncy = this.isBouncyBoots(InventoryUtility.getBootsSlot().itemStack());
      ItemSlot target = this.findBestBoots(!wearingBouncy);
      if (target == null) {
         return;
      }

      InventoryUtility.moveToArmor(target, 0);
      this.notifyEquipped(wearingBouncy ? "Обычные ботинки" : "Попрыгун");
   }

   private void swapToBouncyBoots() {
      if (this.isBouncyBoots(InventoryUtility.getBootsSlot().itemStack())) {
         return;
      }

      ItemSlot target = this.findBestBoots(true);
      if (target != null) {
         InventoryUtility.moveToArmor(target, 0);
         this.notifyEquipped("Попрыгун");
      }
   }

   private void swapToRegularBoots() {
      if (!this.isBouncyBoots(InventoryUtility.getBootsSlot().itemStack())) {
         return;
      }

      ItemSlot target = this.findBestBoots(false);
      if (target != null) {
         InventoryUtility.moveToArmor(target, 0);
         this.notifyEquipped("Обычные ботинки");
      }
   }

   private ItemSlot findBestBoots(boolean bouncy) {
      List<ItemSlot> boots = SlotGroups.inventory()
         .and(SlotGroups.hotbar())
         .findItems(this::isBootsStack)
         .stream()
         .filter(slot -> slot != null && this.isBouncyBoots(slot.itemStack()) == bouncy)
         .map(slot -> (ItemSlot)slot)
         .toList();
      if (boots.isEmpty()) {
         return null;
      }

      return boots.stream().max(Comparator.comparingInt(slot -> this.getBootScore(slot.itemStack()))).orElse(null);
   }

   private boolean isBootsStack(ItemStack stack) {
      return stack.getItem() instanceof ArmorItem armorItem && ((ArmorItemAddition)armorItem).rockstar$getType() == EquipmentType.BOOTS;
   }

   private int getBootScore(ItemStack stack) {
      if (!(stack.getItem() instanceof ArmorItem)) {
         return 0;
      }

      int protection = EnchantmentUtility.getEnchantmentLevel(stack, Enchantments.PROTECTION);
      return stack.getMaxDamage() + protection * 3;
   }

   private boolean isBouncyBoots(ItemStack stack) {
      if (stack == null || stack.isEmpty()) {
         return false;
      }

      String name = stack.getName().getString();
      if (name.contains("Попрыгун")) {
         return true;
      }

      return EnchantmentUtility.getEnchantmentLevel(stack, Enchantments.FEATHER_FALLING) > 0 && name.toLowerCase().contains("попрыг");
   }

   private void notifyEquipped(String label) {
      Rockstar.getInstance().getNotificationManager().addNotification(NotificationType.SUCCESS, "Надеты: " + label);
   }
}
