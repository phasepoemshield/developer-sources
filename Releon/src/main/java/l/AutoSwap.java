package l;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Hand;

public class AutoSwap extends Helper242 {
   private static final Comparator<Slot> ENCHANTED_FIRST = Comparator.comparingInt(var0 -> var0.getStack().hasEnchantments() ? 1 : 0);
   final Setting5 autoMode = new Setting5("Авто режим", "Автоматический триггер свапа").method2381("Нет", "При атаке").method2383("Нет");
   final Setting5 swapMode = new Setting5("Режим свапа", "Режим логики свапа").method2381("Двойной", "Тройной").method2383("Двойной");
   final Setting9 bind = new Setting9("Клавиша использования", "Свап предмета по нажатию клавиши");
   final Setting5 firstItem = new Setting5("Первый предмет", "Выбери первый предмет для свапа.")
      .method2381("Тотем бессмертия", "Голова игрока", "Золотое яблоко", "Щит")
      .method2383("Тотем бессмертия");
   final Setting5 secondItem = new Setting5("Второй предмет", "Выбери второй предмет для свапа.")
      .method2381("Тотем бессмертия", "Голова игрока", "Золотое яблоко", "Щит")
      .method2383("Золотое яблоко");
   final Setting5 thirdItem = new Setting5("Третий предмет", "Выбери третий предмет для тройного режима.")
      .method2381("Тотем бессмертия", "Голова игрока", "Золотое яблоко", "Щит")
      .method2383("Щит")
      .method2382(() -> this.swapMode.method2385("Тройной"));
   Helper432 swapPhase = Helper432.READY;
   Slot targetSlot = null;
   ItemStack rememberedTotemStack = ItemStack.EMPTY;
   boolean wasForwardPressed;
   boolean wasBackPressed;
   boolean wasLeftPressed;
   boolean wasRightPressed;
   boolean wasJumpPressed;
   boolean keysOverridden = false;
   Helper431[] wheelSlots = new Helper431[3];
   Integer selectingSlotIndex = null;

   public AutoSwap() {
      super("AutoSwap", "Auto Swap", Helper269.COMBAT);
      this.setup(new Helper264[]{this.autoMode, this.swapMode, this.firstItem, this.secondItem, this.thirdItem, this.bind});
   }

   @Helper104
   public void method4454(Event17 var1) {
      if (var1.method3903(this.bind.getKey())) {
         if (this.swapMode.method2385("Тройной")) {
            if (mc != null && mc.currentScreen == null) {
               mc.setScreen(new Widget22(this));
            }
         } else {
            this.method4456();
         }
      }
   }

   @Helper104
   public void method4455(Helper401 var1) {
      if (mc.player != null && this.autoMode.method2386().equals("При атаке")) {
         if (!this.swapMode.method2385("Тройной")) {
            if (this.swapPhase == Helper432.READY) {
               if (mc.player.getAttackCooldownProgress(0.0F) >= 0.9F) {
                  this.method4456();
               }
            }
         }
      }
   }

   @Helper104
   public void onRotationUpdate(Event28 var1) {
      if (var1.method4225() == 0 && this.swapPhase != Helper432.READY) {
         this.method4458();
      }
   }

   private void method4456() {
      if (this.swapPhase == Helper432.READY) {
         Slot var1 = this.method4461();
         if (var1 != null) {
            this.method4457(var1);
         }
      }
   }

   private void method4457(Slot var1) {
      this.targetSlot = var1;
      if (this.targetSlot != null) {
         this.method4468();
         long var2 = mc.getWindow().getHandle();
         this.wasForwardPressed = InputUtil.isKeyPressed(var2, mc.options.forwardKey.getDefaultKey().getCode());
         this.wasBackPressed = InputUtil.isKeyPressed(var2, mc.options.backKey.getDefaultKey().getCode());
         this.wasLeftPressed = InputUtil.isKeyPressed(var2, mc.options.leftKey.getDefaultKey().getCode());
         this.wasRightPressed = InputUtil.isKeyPressed(var2, mc.options.rightKey.getDefaultKey().getCode());
         this.wasJumpPressed = InputUtil.isKeyPressed(var2, mc.options.jumpKey.getDefaultKey().getCode());
         this.swapPhase = Helper432.STOPPING;
         this.keysOverridden = false;
      }
   }

   private void method4458() {
      if (mc.player != null && mc.currentScreen == null) {
         switch (this.swapPhase) {
            case STOPPING:
               this.method4459();
               this.swapPhase = Helper432.SWAPPING;
               break;
            case SWAPPING:
               this.method4459();
               if (this.targetSlot == null) {
                  this.method4470();
                  return;
               }

               Helper66.method690(this.targetSlot, Hand.OFF_HAND, false);
               if (this.keysOverridden) {
                  this.method4460();
               }

               this.swapPhase = Helper432.RESUMING;
               break;
            case RESUMING:
               this.method4470();
         }
      } else {
         this.method4470();
      }
   }

   private void method4459() {
      mc.player.input.movementForward = 0.0F;
      mc.player.input.movementSideways = 0.0F;
      mc.player.setSprinting(false);
      AutoSprint.tickStop = Math.max(AutoSprint.tickStop, 1);
      if (!this.keysOverridden) {
         mc.options.forwardKey.setPressed(false);
         mc.options.backKey.setPressed(false);
         mc.options.leftKey.setPressed(false);
         mc.options.rightKey.setPressed(false);
         mc.options.jumpKey.setPressed(false);
         this.keysOverridden = true;
      }
   }

   private void method4460() {
      long var1 = mc.getWindow().getHandle();
      boolean var3 = InputUtil.isKeyPressed(var1, mc.options.forwardKey.getDefaultKey().getCode());
      boolean var4 = InputUtil.isKeyPressed(var1, mc.options.backKey.getDefaultKey().getCode());
      boolean var5 = InputUtil.isKeyPressed(var1, mc.options.leftKey.getDefaultKey().getCode());
      boolean var6 = InputUtil.isKeyPressed(var1, mc.options.rightKey.getDefaultKey().getCode());
      boolean var7 = InputUtil.isKeyPressed(var1, mc.options.jumpKey.getDefaultKey().getCode());
      mc.options.forwardKey.setPressed(this.wasForwardPressed && var3);
      mc.options.backKey.setPressed(this.wasBackPressed && var4);
      mc.options.leftKey.setPressed(this.wasLeftPressed && var5);
      mc.options.rightKey.setPressed(this.wasRightPressed && var6);
      mc.options.jumpKey.setPressed(this.wasJumpPressed && var7);
      this.keysOverridden = false;
   }

   private Slot method4461() {
      return this.swapMode.method2385("Тройной") ? this.method4463() : this.method4462();
   }

   private Slot method4462() {
      Item var1 = this.method4471(this.firstItem.method2386());
      Item var2 = this.method4471(this.secondItem.method2386());
      Item var3 = mc.player.getOffHandStack().getItem();
      String var4 = mc.player.getOffHandStack().getName().getString();
      Predicate<Slot> var5 = var0 -> var0.id != 45;
      Slot var6 = this.method4465(var1, var2, var3, var4, var5, 36, 44);
      return var6 != null ? var6 : this.method4465(var1, var2, var3, var4, var5, 0, 35);
   }

   private Slot method4463() {
      Item var1 = this.method4471(this.firstItem.method2386());
      Item var2 = this.method4471(this.secondItem.method2386());
      Item var3 = this.method4471(this.thirdItem.method2386());
      Item var4 = mc.player.getOffHandStack().getItem();
      String var5 = mc.player.getOffHandStack().getName().getString();
      List var6 = List.of(var1, var2, var3);
      int var7 = var6.indexOf(var4);

      for (int var8 = 1; var8 <= var6.size(); var8++) {
         int var9 = var7 == -1 ? var8 - 1 : (var7 + var8) % var6.size();
         Item var10 = (Item)var6.get(var9);
         if (var10 != Items.AIR) {
            Slot var11 = this.method4464(var10, var5);
            if (var11 != null) {
               return var11;
            }
         }
      }

      return null;
   }

   private Slot method4464(Item var1, String var2) {
      Predicate<Slot> var3 = var0 -> var0.id != 45;
      Predicate<Slot> var4 = var2x -> var2x.getStack().getItem() == var1 && !var2x.getStack().getName().getString().equals(var2);
      if (var1 == Items.TOTEM_OF_UNDYING) {
         Slot var6 = this.method4466(var3.and(var0 -> var0.id >= 36 && var0.id <= 44), var2);
         return var6 != null ? var6 : this.method4466(var3.and(var0 -> var0.id >= 0 && var0.id <= 35), var2);
      } else {
         Slot var5 = Helper66.method709(var1, ENCHANTED_FIRST, var3.and(var0 -> var0.id >= 36 && var0.id <= 44).and(var4));
         return var5 != null ? var5 : Helper66.method709(var1, ENCHANTED_FIRST, var3.and(var0 -> var0.id >= 0 && var0.id <= 35).and(var4));
      }
   }

   private Slot method4465(Item var1, Item var2, Item var3, String var4, Predicate<Slot> var5, int var6, int var7) {
      Predicate<Slot> var8 = var2x -> var2x.id >= var6 && var2x.id <= var7;
      Predicate<Slot> var9 = var5.and(var8);
      if (var3 == var1) {
         return var2 == Items.TOTEM_OF_UNDYING
            ? this.method4466(var9, var4)
            : Helper66.method709(
               var2, ENCHANTED_FIRST, var9.and(var2x -> var2x.getStack().getItem() == var2 && !var2x.getStack().getName().getString().equals(var4))
            );
      } else if (var3 == var2) {
         return var1 == Items.TOTEM_OF_UNDYING
            ? this.method4466(var9, var4)
            : Helper66.method709(
               var1, ENCHANTED_FIRST, var9.and(var2x -> var2x.getStack().getItem() == var1 && !var2x.getStack().getName().getString().equals(var4))
            );
      } else {
         if (var1 == Items.TOTEM_OF_UNDYING) {
            Slot var10 = this.method4466(var9, var4);
            if (var10 != null) {
               return var10;
            }
         }

         Slot var11 = Helper66.method709(
            var1, ENCHANTED_FIRST, var9.and(var2x -> var2x.getStack().getItem() == var1 && !var2x.getStack().getName().getString().equals(var4))
         );
         if (var11 != null) {
            return var11;
         } else {
            return var2 == Items.TOTEM_OF_UNDYING
               ? this.method4466(var9, var4)
               : Helper66.method709(
                  var2, ENCHANTED_FIRST, var9.and(var2x -> var2x.getStack().getItem() == var2 && !var2x.getStack().getName().getString().equals(var4))
               );
         }
      }
   }

   private Slot method4466(Predicate<Slot> var1, String var2) {
      Predicate<Slot> var3 = var1.and(var0 -> var0.getStack().getItem() == Items.TOTEM_OF_UNDYING).and(var1x -> !var1x.getStack().getName().getString().equals(var2));
      Slot var4 = this.method4469(var3);
      if (var4 != null && this.method4467(var4.getStack())) {
         return var4;
      } else {
         Slot var5 = Helper66.method709(Items.TOTEM_OF_UNDYING, ENCHANTED_FIRST, var3.and(var1x -> this.method4467(var1x.getStack())));
         if (var5 != null) {
            return var5;
         } else {
            return var4 != null ? var4 : Helper66.method709(Items.TOTEM_OF_UNDYING, ENCHANTED_FIRST, var3);
         }
      }
   }

   private boolean method4467(ItemStack var1) {
      return var1.getItem() == Items.TOTEM_OF_UNDYING && var1.hasEnchantments();
   }

   private void method4468() {
      if (mc.player != null) {
         ItemStack var1 = mc.player.getOffHandStack();
         if (var1.getItem() == Items.TOTEM_OF_UNDYING) {
            this.rememberedTotemStack = var1.copy();
         }
      }
   }

   private Slot method4469(Predicate<Slot> var1) {
      return this.rememberedTotemStack.isEmpty()
         ? null
         : Helper66.method707(var1.and(var1x -> ItemStack.areItemsAndComponentsEqual(var1x.getStack(), this.rememberedTotemStack)));
   }

   private void method4470() {
      if (this.keysOverridden) {
         this.method4460();
      }

      this.swapPhase = Helper432.READY;
      this.targetSlot = null;
   }

   private Item method4471(String var1) {
      return switch (var1) {
         case "Тотем бессмертия" -> Items.TOTEM_OF_UNDYING;
         case "Голова игрока" -> Items.PLAYER_HEAD;
         case "Золотое яблоко" -> Items.GOLDEN_APPLE;
         case "Щит" -> Items.SHIELD;
         default -> Items.AIR;
      };
   }

   public void method4472(int var1, Item var2, String var3) {
      if (var1 >= 0 && var1 < this.wheelSlots.length) {
         this.wheelSlots[var1] = new Helper431(var2, var3);
         Helper211.method1807("[AutoSwap] setWheelSlotItem: index=" + var1 + ", item=" + var2 + ", name=" + var3);
      }
   }

   public void method4473(int var1) {
      this.selectingSlotIndex = var1;
      if (mc != null && mc.player != null) {
         mc.setScreen(new Widget30(this, var1));
         Helper211.method1807("[AutoSwap] Open select screen for wheel slot " + var1);
      }
   }

   public Item method4474(int var1) {
      return var1 >= 0 && var1 < this.wheelSlots.length && this.wheelSlots[var1] != null ? this.wheelSlots[var1].item : null;
   }

   public ItemStack method4475(int var1) {
      if (var1 >= 0 && var1 < this.wheelSlots.length) {
         Helper431 var2 = this.wheelSlots[var1];
         if (var2 != null && var2.item != null && var2.item != Items.AIR) {
            if (mc != null && mc.player != null) {
               PlayerInventory var3 = mc.player.getInventory();

               for (int var4 = 0; var4 < var3.size(); var4++) {
                  ItemStack var5 = var3.getStack(var4);
                  if (!var5.isEmpty() && var5.getItem() == var2.item && var5.getName().getString().equals(var2.itemName)) {
                     return var5;
                  }
               }

               return ItemStack.EMPTY;
            } else {
               return ItemStack.EMPTY;
            }
         } else {
            return ItemStack.EMPTY;
         }
      } else {
         return ItemStack.EMPTY;
      }
   }

   public void method4476(ItemStack var1) {
      if (var1 != null && !var1.isEmpty() && mc != null && mc.player != null) {
         if (this.swapPhase == Helper432.READY) {
            Item var2 = var1.getItem();
            String var3 = var1.getName().getString();
            Slot var4 = null;

            for (Slot var6 : Helper66.method720().filter(var0 -> var0.id != 46 && var0.id != 45).toList()) {
               ItemStack var7 = var6.getStack();
               if (!var7.isEmpty() && var7.getItem() == var2 && var7.getName().getString().equals(var3)) {
                  var4 = var6;
                  break;
               }
            }

            if (var4 != null) {
               this.method4457(var4);
            } else {
               Helper211.method1810("[AutoSwap] Item for wheel swap not found in inventory: " + var3);
            }
         }
      }
   }
}
