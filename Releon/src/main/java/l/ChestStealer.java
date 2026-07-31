package l;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.SlotActionType;

public class ChestStealer extends Helper242 {
   private static final String[] LOOT_ITEMS = new String[]{
      "Totem",
      "Netherite Helmet",
      "Netherite Chestplate",
      "Netherite Leggings",
      "Netherite Boots",
      "Netherite Sword",
      "Netherite Pickaxe",
      "Enchanted Golden Apple",
      "Player Head",
      "Shulker Box",
      "Netherite Ingot",
      "Dragon Head",
      "Elytra",
      "Snowball",
      "Splash Potion",
      "Tripwire Hook",
      "Netherite Scrap",
      "Beacon",
      "Villager Spawn Egg"
   };
   private final Helper339 lootWatch = new Helper339();
   private final Map<Item, String> itemNames = new HashMap<>();
   private final Setting5 modeSetting = new Setting5("Type", "Select the chest loot mode")
      .method2381("FunTime", "Default", "Warden")
      .method2383("Warden");
   private final Setting2 delaySetting = new Setting2("Delay", "Delay between slot transfers")
      .method2086(100.0F)
      .method2079(0, 1000)
      .method2081(() -> this.modeSetting.method2385("Default"));
   private final Setting3 whiteListSetting = new Setting3("WhiteList", "Loot only selected items").method2201(false);
   private final Setting8 funTimeWhitelist = new Setting8("FunTime Loot", "Loot only selected items in FunTime mode")
      .method2585(LOOT_ITEMS)
      .method2586()
      .method2587(() -> this.whiteListSetting.method2200() && this.modeSetting.method2385("FunTime"));
   private final Setting8 defaultWhitelist = new Setting8("Default Loot", "Loot only selected items in Default mode")
      .method2585(LOOT_ITEMS)
      .method2586()
      .method2587(() -> this.whiteListSetting.method2200() && this.modeSetting.method2385("Default"));
   private final Setting8 wardenWhitelist = new Setting8("Warden Loot", "Loot only selected items in Warden mode")
      .method2585(LOOT_ITEMS)
      .method2586()
      .method2587(() -> this.whiteListSetting.method2200() && this.modeSetting.method2385("Warden"));

   public ChestStealer() {
      super("ChestStealer", "Chest Stealer", Helper269.MISC);
      this.method4549();
      this.setup(
         new Helper264[]{this.modeSetting, this.delaySetting, this.whiteListSetting, this.funTimeWhitelist, this.defaultWhitelist, this.wardenWhitelist}
      );
   }

   @Override
   public void activate() {
      this.method4550();
   }

   @Override
   public void deactivate() {
      this.method4550();
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null && mc.interactionManager != null) {
         if (mc.player.currentScreenHandler instanceof GenericContainerScreenHandler var2) {
            this.method4543(var2);
         }
      }
   }

   private void method4543(GenericContainerScreenHandler var1) {
      String var2 = this.modeSetting.method2386();
      switch (var2) {
         case "Warden":
            this.method4545(var1);
            break;
         case "Default":
            if (this.delaySetting.method2082() <= 0.0F) {
               this.method4545(var1);
            } else if (this.lootWatch.method3357(this.delaySetting.method2082())) {
               this.method4544(var1);
            }
            break;
         case "FunTime":
            if (this.delaySetting.method2082() <= 0.0F) {
               this.method4545(var1);
            } else if (this.lootWatch.method3357(200.0)) {
               this.method4544(var1);
            }
      }
   }

   private void method4544(GenericContainerScreenHandler var1) {
      for (int var2 = 0; var2 < var1.getRows() * 9; var2++) {
         if (var1.getSlot(var2).hasStack() && this.method4547(var1.getSlot(var2).getStack())) {
            Helper66.method703(var2, 0, SlotActionType.QUICK_MOVE, true);
            break;
         }
      }

      this.method4546(var1);
   }

   private void method4545(GenericContainerScreenHandler var1) {
      for (int var2 = 0; var2 < var1.getRows() * 9; var2++) {
         if (var1.getSlot(var2).hasStack() && this.method4547(var1.getSlot(var2).getStack())) {
            Helper66.method703(var2, 0, SlotActionType.QUICK_MOVE, true);
         }
      }

      this.method4546(var1);
   }

   private void method4546(GenericContainerScreenHandler var1) {
      for (int var2 = 0; var2 < var1.getRows() * 9; var2++) {
         if (var1.getSlot(var2).hasStack() && this.method4547(var1.getSlot(var2).getStack())) {
            return;
         }
      }

      Helper66.method701(false);
   }

   private boolean method4547(ItemStack var1) {
      if (var1 == null || var1.isEmpty()) {
         return false;
      } else if (!this.whiteListSetting.method2200()) {
         return true;
      } else {
         Setting8 var2 = this.method4548();
         List var3 = var2.method2590();
         if (var3 != null && !var3.isEmpty()) {
            String var4 = this.itemNames.get(var1.getItem());
            return var4 != null && var2.method2588(var4);
         } else {
            return true;
         }
      }
   }

   private Setting8 method4548() {
      String var1 = this.modeSetting.method2386();

      return switch (var1) {
         case "FunTime" -> this.funTimeWhitelist;
         case "Default" -> this.defaultWhitelist;
         case "Warden" -> this.wardenWhitelist;
         default -> this.wardenWhitelist;
      };
   }

   private void method4549() {
      this.itemNames.put(Items.TOTEM_OF_UNDYING, "Totem");
      this.itemNames.put(Items.NETHERITE_HELMET, "Netherite Helmet");
      this.itemNames.put(Items.NETHERITE_CHESTPLATE, "Netherite Chestplate");
      this.itemNames.put(Items.NETHERITE_LEGGINGS, "Netherite Leggings");
      this.itemNames.put(Items.NETHERITE_BOOTS, "Netherite Boots");
      this.itemNames.put(Items.NETHERITE_SWORD, "Netherite Sword");
      this.itemNames.put(Items.NETHERITE_PICKAXE, "Netherite Pickaxe");
      this.itemNames.put(Items.ENCHANTED_GOLDEN_APPLE, "Enchanted Golden Apple");
      this.itemNames.put(Items.PLAYER_HEAD, "Player Head");
      this.itemNames.put(Items.SHULKER_BOX, "Shulker Box");
      this.itemNames.put(Items.NETHERITE_INGOT, "Netherite Ingot");
      this.itemNames.put(Items.DRAGON_HEAD, "Dragon Head");
      this.itemNames.put(Items.ELYTRA, "Elytra");
      this.itemNames.put(Items.SNOWBALL, "Snowball");
      this.itemNames.put(Items.SPLASH_POTION, "Splash Potion");
      this.itemNames.put(Items.TRIPWIRE_HOOK, "Tripwire Hook");
      this.itemNames.put(Items.NETHERITE_SCRAP, "Netherite Scrap");
      this.itemNames.put(Items.BEACON, "Beacon");
      this.itemNames.put(Items.VILLAGER_SPAWN_EGG, "Villager Spawn Egg");
   }

   private void method4550() {
      this.lootWatch.method3358();
   }
}
