package moscow.rockstar.module.combat;

import java.util.ArrayList;
import java.util.List;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.SliderSetting;
import moscow.rockstar.util.inventory.InventoryUtility;
import moscow.rockstar.util.inventory.group.SlotGroup;
import moscow.rockstar.util.inventory.group.SlotGroups;
import moscow.rockstar.util.inventory.slots.HotbarSlot;
import moscow.rockstar.util.inventory.slots.InventorySlot;
import moscow.rockstar.util.time.Timer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;

@ModuleInfo(name = "Auto Soup", category = ModuleCategory.COMBAT, desc = "Автоматическое поедание супа для восстановления здоровья")
public class AutoSoup extends BaseModule {
   private int previousSlot = -1;
   private int soupSlot = -1;
   private int actionTicks = -1;
   private final SliderSetting health = new SliderSetting(this, "Здоровье для поедания")
      .step(1.0F)
      .min(1.0F)
      .max(20.0F)
      .currentValue(10.0F);
   private final Timer cooldown = new Timer();
   private final EventListener<ClientPlayerTickEvent> onTick = event -> {
      if (mc.player == null || mc.interactionManager == null) {
         return;
      }

      if (this.actionTicks >= 0) {
         if (this.actionTicks == 2) {
            InventoryUtility.selectHotbarSlot(this.soupSlot);
         } else if (this.actionTicks == 1) {
            mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
         } else if (this.actionTicks == 0) {
            mc.player.dropSelectedItem(true);
            InventoryUtility.selectHotbarSlot(this.previousSlot);
         }

         this.actionTicks--;
         return;
      }

      if (mc.player.getHealth() >= this.health.getCurrentValue() || !this.cooldown.finished(300L)) {
         return;
      }

      HotbarSlot hotbarSoup = SlotGroups.hotbar().findItem(Items.MUSHROOM_STEW);
      if (hotbarSoup != null) {
         this.previousSlot = mc.player.getInventory().selectedSlot;
         this.soupSlot = hotbarSoup.getSlotId();
         InventoryUtility.selectHotbarSlot(this.soupSlot);
         this.actionTicks = 1;
      } else {
         List<InventorySlot> soups = this.findInventorySoups();
         List<HotbarSlot> emptyHotbar = this.findEmptyHotbarSlots();
         if (!soups.isEmpty() && !emptyHotbar.isEmpty()) {
            int moves = Math.min(Math.min(soups.size(), emptyHotbar.size()), 8);
            for (int i = 0; i < moves; i++) {
               InventoryUtility.moveItem(soups.get(i), emptyHotbar.get(i));
            }

            this.previousSlot = mc.player.getInventory().selectedSlot;
            this.soupSlot = emptyHotbar.getFirst().getSlotId();
            this.actionTicks = 2;
         }
      }

      this.cooldown.reset();
   };

   private List<InventorySlot> findInventorySoups() {
      return new ArrayList<>(SlotGroups.inventory().findItems(Items.MUSHROOM_STEW));
   }

   private List<HotbarSlot> findEmptyHotbarSlots() {
      return new ArrayList<>(SlotGroups.hotbar().findItems(ItemStack::isEmpty));
   }
}
