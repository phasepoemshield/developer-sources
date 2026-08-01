package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.SlotActionType;

public class AutoSell extends Helper242 {
   private final Setting2 delayTicks = new Setting2("Скорость выставления", "Задержка между выставлениями в тиках").method2086(1.0F).method2079(1, 20);
   private final Setting6 priceText = new Setting6("Цена", "Цена для команды /ah sell").method2407("10kk").method2409(24);
   private final Setting8 sellItems = new Setting8("Продавать", "Выбор предметов для автоматической продажи")
      .method2585(
         "Тотем",
         "Незерит шлем",
         "Незерит нагрудник",
         "Незерит поножи",
         "Незерит ботинки",
         "Незерит меч",
         "Незерит кирка",
         "Зачарованное яблоко",
         "Голова игрока",
         "Шалкер",
         "Незерит слиток",
         "Голова дракона",
         "Элитры",
         "Снежок",
         "Взрывное зелье",
         "Отмычка",
         "Незеритовый лом",
         "Маяк",
         "Яйцо Жителя"
      )
      .method2586(
         "Тотем",
         "Незерит шлем",
         "Незерит нагрудник",
         "Незерит поножи",
         "Незерит ботинки",
         "Незерит меч",
         "Незерит кирка",
         "Зачарованное яблоко",
         "Голова игрока",
         "Шалкер",
         "Незерит слиток",
         "Голова дракона",
         "Элитры",
         "Снежок",
         "Взрывное зелье",
         "Отмычка",
         "Незеритовый лом",
         "Маяк",
         "Яйцо Жителя"
      );
   private final Set<Item> valuableItems = new HashSet<>(
      Arrays.asList(
         Items.TOTEM_OF_UNDYING,
         Items.NETHERITE_HELMET,
         Items.NETHERITE_CHESTPLATE,
         Items.NETHERITE_LEGGINGS,
         Items.NETHERITE_BOOTS,
         Items.NETHERITE_SWORD,
         Items.NETHERITE_PICKAXE,
         Items.ENCHANTED_GOLDEN_APPLE,
         Items.PLAYER_HEAD,
         Items.SHULKER_BOX,
         Items.NETHERITE_INGOT,
         Items.DRAGON_HEAD,
         Items.ELYTRA,
         Items.SNOWBALL,
         Items.SPLASH_POTION,
         Items.TRIPWIRE_HOOK,
         Items.NETHERITE_SCRAP,
         Items.BEACON,
         Items.VILLAGER_SPAWN_EGG
      )
   );
   private final Map<Item, String> itemNames = new HashMap<>();
   private int sellDelay;

   public AutoSell() {
      super("AutoSell", "Auto Sell", Helper269.MISC);
      this.method4129();
      this.setup(new Helper264[]{this.delayTicks, this.priceText, this.sellItems});
   }

   @Override
   public void activate() {
      super.activate();
      this.sellDelay = 0;
   }

   @Override
   public void deactivate() {
      super.deactivate();
      this.sellDelay = 0;
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null) {
         if (mc.currentScreen == null) {
            if (this.sellDelay > 0) {
               this.sellDelay--;
            } else {
               int var2 = this.method4126();
               if (var2 != -1) {
                  this.method4127(var2);
                  String var3 = this.method4128(this.priceText.method2403());
                  mc.player.networkHandler.sendChatMessage("/ah sell " + var3);
                  this.sellDelay = (int)this.delayTicks.method2082();
               }
            }
         }
      }
   }

   private int method4126() {
      for (int var1 = 0; var1 < 36; var1++) {
         Item var2 = mc.player.getInventory().getStack(var1).getItem();
         String var3 = this.itemNames.get(var2);
         if (!mc.player.getInventory().getStack(var1).isEmpty() && this.valuableItems.contains(var2) && var3 != null && this.sellItems.method2588(var3)) {
            return var1;
         }
      }

      return -1;
   }

   private void method4127(int var1) {
      int var2 = mc.player.getInventory().selectedSlot;
      if (var1 < 9) {
         mc.player.getInventory().selectedSlot = var1;
      } else {
         mc.interactionManager.clickSlot(mc.player.playerScreenHandler.syncId, var1, var2, SlotActionType.SWAP, mc.player);
      }
   }

   private String method4128(String var1) {
      return var1 != null && !var1.isBlank() ? var1.trim().replace("/", "") : "10kk";
   }

   private void method4129() {
      this.itemNames.put(Items.TOTEM_OF_UNDYING, "Тотем");
      this.itemNames.put(Items.NETHERITE_HELMET, "Незерит шлем");
      this.itemNames.put(Items.NETHERITE_CHESTPLATE, "Незерит нагрудник");
      this.itemNames.put(Items.NETHERITE_LEGGINGS, "Незерит поножи");
      this.itemNames.put(Items.NETHERITE_BOOTS, "Незерит ботинки");
      this.itemNames.put(Items.NETHERITE_SWORD, "Незерит меч");
      this.itemNames.put(Items.NETHERITE_PICKAXE, "Незерит кирка");
      this.itemNames.put(Items.ENCHANTED_GOLDEN_APPLE, "Зачарованное яблоко");
      this.itemNames.put(Items.PLAYER_HEAD, "Голова игрока");
      this.itemNames.put(Items.SHULKER_BOX, "Шалкер");
      this.itemNames.put(Items.NETHERITE_INGOT, "Незерит слиток");
      this.itemNames.put(Items.DRAGON_HEAD, "Голова дракона");
      this.itemNames.put(Items.ELYTRA, "Элитры");
      this.itemNames.put(Items.SNOWBALL, "Снежок");
      this.itemNames.put(Items.SPLASH_POTION, "Взрывное зелье");
      this.itemNames.put(Items.TRIPWIRE_HOOK, "Отмычка");
      this.itemNames.put(Items.NETHERITE_SCRAP, "Трапка");
      this.itemNames.put(Items.BEACON, "Маяк");
      this.itemNames.put(Items.VILLAGER_SPAWN_EGG, "Яйцр призыва крестьянина");
   }
}
