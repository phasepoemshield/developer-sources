package l;

import java.util.Comparator;
import java.util.function.Predicate;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;

public class AutoBootsSwap extends Helper242 {
   private final Setting5 firstItem = new Setting5("Основной предмет", "Выберите первый тип ботинок")
      .method2381("Netherite Boots", "Diamond Boots", "Iron Boots", "Golden Boots", "Chainmail Boots", "Leather Boots")
      .method2383("Netherite Boots");
   private final Setting5 secondItem = new Setting5("Вторичный предмет", "Выберите второй тип ботинок")
      .method2381("Netherite Boots", "Diamond Boots", "Iron Boots", "Golden Boots", "Chainmail Boots", "Leather Boots")
      .method2383("Diamond Boots");
   private final Setting9 bind = new Setting9("Кнопка использования предмета", "Использует элемент при нажатии");
   private Helper393 swapPhase = Helper393.READY;
   private Slot targetSlot = null;
   private long actionStartTime = 0L;
   private boolean playerFullyStopped = false;
   private boolean wasForwardPressed;
   private boolean wasBackPressed;
   private boolean wasLeftPressed;
   private boolean wasRightPressed;
   private boolean wasJumpPressed;
   private boolean keysOverridden = false;

   public AutoBootsSwap() {
      super("AutoBootsSwap", "Auto Boots Swap", Helper269.COMBAT);
      this.setup(new Helper264[]{this.firstItem, this.secondItem, this.bind});
   }

   @Helper104
   public void method3971(Event17 var1) {
      if (var1.method3903(this.bind.getKey())) {
         this.method3972();
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (this.swapPhase != Helper393.READY) {
         this.method3974();
      }
   }

   private void method3972() {
      if (this.swapPhase == Helper393.READY) {
         Slot var1 = this.method3977(var0 -> var0.id >= 36 && var0.id <= 44);
         if (var1 == null) {
            var1 = this.method3977(var0 -> var0.id >= 0 && var0.id <= 35);
         }

         if (var1 != null) {
            this.method3973(var1);
         }
      }
   }

   private void method3973(Slot var1) {
      this.targetSlot = var1;
      if (this.targetSlot != null) {
         long var2 = mc.getWindow().getHandle();
         this.wasForwardPressed = InputUtil.isKeyPressed(var2, mc.options.forwardKey.getDefaultKey().getCode());
         this.wasBackPressed = InputUtil.isKeyPressed(var2, mc.options.backKey.getDefaultKey().getCode());
         this.wasLeftPressed = InputUtil.isKeyPressed(var2, mc.options.leftKey.getDefaultKey().getCode());
         this.wasRightPressed = InputUtil.isKeyPressed(var2, mc.options.rightKey.getDefaultKey().getCode());
         this.wasJumpPressed = InputUtil.isKeyPressed(var2, mc.options.jumpKey.getDefaultKey().getCode());
         this.swapPhase = Helper393.SLOWING_DOWN;
         this.actionStartTime = System.currentTimeMillis();
         this.playerFullyStopped = false;
         this.keysOverridden = false;
      }
   }

   private void method3974() {
      if (mc.player != null && mc.currentScreen == null) {
         long var1 = System.currentTimeMillis() - this.actionStartTime;
         switch (this.swapPhase) {
            case SLOWING_DOWN:
               mc.player.input.movementForward = 0.0F;
               mc.player.input.movementSideways = 0.0F;
               if (mc.player.isSprinting()) {
                  mc.player.setSprinting(false);
                  AutoSprint.tickStop = 5;
               }

               if (!this.keysOverridden) {
                  mc.options.forwardKey.setPressed(false);
                  mc.options.backKey.setPressed(false);
                  mc.options.leftKey.setPressed(false);
                  mc.options.rightKey.setPressed(false);
                  mc.options.jumpKey.setPressed(false);
                  this.keysOverridden = true;
               }

               if (var1 > 1L) {
                  this.swapPhase = Helper393.WAITING_STOP;
               }
               break;
            case WAITING_STOP:
               mc.player.input.movementForward = 0.0F;
               mc.player.input.movementSideways = 0.0F;
               double var9 = Math.abs(mc.player.getVelocity().x);
               double var10 = Math.abs(mc.player.getVelocity().z);
               double var11 = Math.abs(mc.player.getVelocity().y);
               if (var9 < 0.005 && var10 < 0.005 && var11 < 0.005 || var1 > 20L) {
                  this.playerFullyStopped = true;
                  this.swapPhase = Helper393.SWAP;
               }
               break;
            case SWAP:
               if (this.playerFullyStopped) {
                  if (this.targetSlot != null) {
                     Helper66.method687(this.targetSlot, 8, false, false);
                  }

                  this.swapPhase = Helper393.SPEEDING_UP;
                  this.actionStartTime = System.currentTimeMillis();
                  if (this.keysOverridden) {
                     this.method3975();
                  }
               }
               break;
            case SPEEDING_UP:
               long var3 = System.currentTimeMillis() - this.actionStartTime;
               float var5 = Math.min(1.0F, (float)var3 / 20.0F);
               if (mc.player.input != null) {
                  boolean var6 = InputUtil.isKeyPressed(mc.getWindow().getHandle(), mc.options.forwardKey.getDefaultKey().getCode());
                  float var7 = var6 ? 1.0F : 0.0F;
                  mc.player.input.movementForward = this.method3976(mc.player.input.movementForward, var7 * var5, 0.4F);
                  if (var5 > 0.4F && var6 && !mc.player.isSprinting()) {
                     mc.player.setSprinting(true);
                  }
               }

               if (var3 > 25L) {
                  this.swapPhase = Helper393.FINISHED;
               }
               break;
            case FINISHED:
               this.method3978();
         }
      } else {
         this.method3978();
      }
   }

   private void method3975() {
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

   private float method3976(float var1, float var2, float var3) {
      return var1 + (var2 - var1) * var3;
   }

   private Slot method3977(Predicate<Slot> var1) {
      Predicate<Slot> var2 = var1x -> var1x.id != 8 && var1.test(var1x);
      Item var3 = this.method3979(this.firstItem.method2386());
      Item var4 = this.method3979(this.secondItem.method2386());
      Item var5 = mc.player.getInventory().getArmorStack(0).getItem();
      String var6 = mc.player.getInventory().getArmorStack(0).getName().getString();
      if (var5 == var3) {
         Slot var7 = Helper66.method709(
            var4,
            Comparator.comparing((Slot var0) -> var0.getStack().hasEnchantments()),
            var2.and(var2x -> var2x.getStack().getItem() == var4 && !var2x.getStack().getName().getString().equals(var6))
         );
         if (var7 != null) {
            return var7;
         }
      }

      if (var5 == var4) {
         Slot var9 = Helper66.method709(
            var3,
            Comparator.comparing((Slot var0) -> var0.getStack().hasEnchantments()),
            var2.and(var2x -> var2x.getStack().getItem() == var3 && !var2x.getStack().getName().getString().equals(var6))
         );
         if (var9 != null) {
            return var9;
         }
      }

      if (var5 != var3 && var5 != var4) {
         Slot var10 = Helper66.method709(
            var3,
            Comparator.comparing((Slot var0) -> var0.getStack().hasEnchantments()),
            var2.and(var2x -> var2x.getStack().getItem() == var3 && !var2x.getStack().getName().getString().equals(var6))
         );
         if (var10 != null) {
            return var10;
         }

         Slot var8 = Helper66.method709(
            var4,
            Comparator.comparing((Slot var0) -> var0.getStack().hasEnchantments()),
            var2.and(var2x -> var2x.getStack().getItem() == var4 && !var2x.getStack().getName().getString().equals(var6))
         );
         if (var8 != null) {
            return var8;
         }
      }

      return null;
   }

   private void method3978() {
      if (this.keysOverridden) {
         this.method3975();
      }

      this.swapPhase = Helper393.READY;
      this.targetSlot = null;
      this.playerFullyStopped = false;
   }

   private Item method3979(String var1) {
      return switch (var1) {
         case "Netherite Boots" -> Items.NETHERITE_BOOTS;
         case "Diamond Boots" -> Items.DIAMOND_BOOTS;
         case "Iron Boots" -> Items.IRON_BOOTS;
         case "Golden Boots" -> Items.GOLDEN_BOOTS;
         case "Chainmail Boots" -> Items.CHAINMAIL_BOOTS;
         case "Leather Boots" -> Items.LEATHER_BOOTS;
         default -> Items.AIR;
      };
   }

   public Setting5 method3980() {
      return this.firstItem;
   }

   public Setting5 method3981() {
      return this.secondItem;
   }

   public Setting9 method3982() {
      return this.bind;
   }

   public Helper393 method3983() {
      return this.swapPhase;
   }

   public Slot method3984() {
      return this.targetSlot;
   }

   public long method3985() {
      return this.actionStartTime;
   }

   public boolean method3986() {
      return this.playerFullyStopped;
   }

   public boolean method3987() {
      return this.wasForwardPressed;
   }

   public boolean method3988() {
      return this.wasBackPressed;
   }

   public boolean method3989() {
      return this.wasLeftPressed;
   }

   public boolean method3990() {
      return this.wasRightPressed;
   }

   public boolean method3991() {
      return this.wasJumpPressed;
   }

   public boolean method3992() {
      return this.keysOverridden;
   }
}
