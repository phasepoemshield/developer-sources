package l;

import antidaunleak.api.annotation.Native;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.consume.UseAction;
import net.minecraft.network.packet.Packet;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class NoSlow extends Helper242 {
   private static final long PRE_SWAP_DELAY_MS = 65L;
   private final Helper339 notifWatch = new Helper339();
   private final Helper159 script = new Helper159();
   private boolean finish;
   private boolean skyTimeTriggered;
   private boolean wasUsingFood;
   private boolean swappedCrossbowToOffhand;
   private int crossbowRestoreSlot = -1;
   private int crossbowUseTicks;
   private int pendingCrossbowSlot = -1;
   private long crossbowSwapStartTime;
   private boolean foodCrossbowReadyForNoSlow;
   private boolean restoringCrossbowToInventory;
   private boolean movementKeysOverridden;
   private boolean wasForwardPressed;
   private boolean wasBackPressed;
   private boolean wasLeftPressed;
   private boolean wasRightPressed;
   private boolean wasJumpPressed;
   private Helper261 crossbowSwapPhase = Helper261.READY;
   public final Setting5 itemMode = new Setting5("Мод", "Выберите режим обхода")
      .method2381("FunTimeАрбалет", "SkyTime", "FunTime Snow", "SpookyTime", "FunTime");
   private final Setting2 spookyDelayTicks = new Setting2("Spooky Delay", "SpookyTime tick delay")
      .method2086(1.0F)
      .method2078(0.0F, 6.0F)
      .method2081(() -> this.itemMode.method2385("SpookyTime"));
   private final Setting3 packetDebug = new Setting3("Packet Debug", "Показывает в чате пакеты, которые отправляет NoSlow").method2201(false);
   private int ticks = 0;

   public static NoSlow method2681() {
      return Helper222.method1979(NoSlow.class);
   }

   public NoSlow() {
      super("NoSlow", "No Slow", Helper269.MOVEMENT);
      this.setup(new Helper264[]{this.itemMode, this.spookyDelayTicks, this.packetDebug});
   }

   @Helper104
   public void method2682(Event8 var1) {
      this.method2689();
      if (mc.player != null && mc.player.isUsingItem()) {
         this.ticks++;
         if (this.swappedCrossbowToOffhand) {
            this.crossbowUseTicks++;
         }
      } else {
         if (this.swappedCrossbowToOffhand && this.crossbowUseTicks > 4) {
            this.method2690();
            this.wasUsingFood = false;
         } else if (!this.swappedCrossbowToOffhand) {
            this.wasUsingFood = false;
         }

         if (this.crossbowSwapPhase == Helper261.READY && !this.restoringCrossbowToInventory) {
            this.method2692();
         }

         this.ticks = 0;
      }

      if (mc.player == null || mc.options == null || !mc.options.useKey.isPressed()) {
         this.skyTimeTriggered = false;
      }
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginUltra
   )
   public void method2683(Helper429 var1) {
      Hand var2 = mc.player.getActiveHand();
      Hand var3 = var2.equals(Hand.MAIN_HAND) ? Hand.OFF_HAND : Hand.MAIN_HAND;
      switch (var1.method4391()) {
         case 1:
            String var4 = this.itemMode.method2386();
            switch (var4) {
               case "FunTimeАрбалет":
                  ItemStack var10 = mc.player.getMainHandStack();
                  ItemStack var11 = mc.player.getOffHandStack();
                  boolean var12 = var10.getItem() instanceof CrossbowItem || var11.getItem() instanceof CrossbowItem;
                  if (var12 && this.ticks > 0.0F && mc.player.getItemUseTime() > 0) {
                     mc.player.setSprinting(true);
                     var1.method582();
                  }

                  return;
               case "FunTime":
                  if (!this.method2687()) {
                     var1.method582();
                     return;
                  }

                  ItemStack var9 = mc.player.getMainHandStack();
                  ItemStack var7 = mc.player.getOffHandStack();
                  boolean var8 = var9.getItem() instanceof CrossbowItem || var7.getItem() instanceof CrossbowItem;
                  if (var8 && this.foodCrossbowReadyForNoSlow && this.ticks > 0.0F && mc.player.getItemUseTime() > 0) {
                     mc.player.setSprinting(true);
                     var1.method582();
                  }

                  return;
               case "FunTime Snow":
                  if (this.ticks > 2 && mc.player.getItemUseTime() > 2) {
                     this.ticks = 1;
                     var1.method582();
                  }

                  if (this.method2686()) {
                     this.method2685(8.0F);
                  }

                  return;
               case "SkyTime":
                  if (this.ticks > 0 && mc.player.getItemUseTime() > 0) {
                     mc.player.setSprinting(true);
                     var1.method582();
                  }

                  return;
               case "SpookyTime":
                  int var6 = Math.round(this.spookyDelayTicks.method2082());
                  if (this.ticks > var6 && mc.player.getItemUseTime() > 1) {
                     this.ticks = 0;
                     var1.method582();
                  }

                  return;
               default:
                  return;
            }
         case 2:
            while (!this.script.method1317()) {
               this.script.method1315();
            }
      }
   }

   private boolean method2684() {
      BlockPos var1 = mc.player.getBlockPos();
      return this.method2696(var1) || this.method2696(var1.down()) || this.method2696(var1.up());
   }

   private void method2685(float var1) {
      float var2 = mc.player.getYaw();
      float var3 = mc.player.forwardSpeed;
      float var4 = mc.player.sidewaysSpeed;
      float var5 = var1 / 3.0F;
      ItemStack var6 = mc.player.getActiveItem();
      if (mc.player.isUsingItem() && !var6.isEmpty() && var6.getUseAction() == UseAction.EAT) {
         var5 *= 0.35F;
      }

      UseAction var7 = var6.getUseAction();
      if (mc.player.isUsingItem() && !var6.isEmpty() && (var7 == UseAction.EAT || var7 == UseAction.DRINK)) {
         var5 *= 0.35F;
      }

      double var8 = 0.0;
      double var10 = 0.0;
      if (var3 != 0.0F || var4 != 0.0F) {
         float var12 = var2 * (float) (Math.PI / 180.0);
         var8 = -MathHelper.sin(var12) * var5 * var3 + MathHelper.cos(var12) * var5 * var4;
         var10 = MathHelper.cos(var12) * var5 * var3 + MathHelper.sin(var12) * var5 * var4;
      }

      mc.player.setVelocity(var8, mc.player.getVelocity().y, var10);
   }

   private boolean method2686() {
      if (mc.player != null && mc.player.isUsingItem()) {
         ItemStack var1 = mc.player.getActiveItem();
         if (var1.isEmpty()) {
            return false;
         } else {
            UseAction var2 = var1.getUseAction();
            return var2 == UseAction.EAT || var2 == UseAction.DRINK;
         }
      } else {
         return false;
      }
   }

   private boolean method2687() {
      if (mc.player != null && mc.interactionManager != null && this.method2686()) {
         if (mc.player.getActiveHand() == Hand.OFF_HAND || mc.player.getOffHandStack().getItem() instanceof CrossbowItem) {
            this.foodCrossbowReadyForNoSlow = true;
            mc.player.setSprinting(true);
            return true;
         } else if (this.foodCrossbowReadyForNoSlow) {
            return true;
         } else if (this.crossbowSwapPhase != Helper261.READY) {
            return false;
         } else {
            int var1 = this.method2694();
            if (var1 == -1) {
               return true;
            } else {
               this.wasUsingFood = true;
               this.pendingCrossbowSlot = var1;
               this.crossbowRestoreSlot = var1;
               this.crossbowUseTicks = 0;
               this.foodCrossbowReadyForNoSlow = false;
               this.method2688();
               mc.player.setSprinting(true);
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private void method2688() {
      if (mc.options != null && mc.getWindow() != null) {
         long var1 = mc.getWindow().getHandle();
         this.wasForwardPressed = InputUtil.isKeyPressed(var1, mc.options.forwardKey.getDefaultKey().getCode());
         this.wasBackPressed = InputUtil.isKeyPressed(var1, mc.options.backKey.getDefaultKey().getCode());
         this.wasLeftPressed = InputUtil.isKeyPressed(var1, mc.options.leftKey.getDefaultKey().getCode());
         this.wasRightPressed = InputUtil.isKeyPressed(var1, mc.options.rightKey.getDefaultKey().getCode());
         this.wasJumpPressed = InputUtil.isKeyPressed(var1, mc.options.jumpKey.getDefaultKey().getCode());
         this.crossbowSwapPhase = Helper261.WAITING_STOP;
         this.crossbowSwapStartTime = System.currentTimeMillis();
         this.movementKeysOverridden = false;
      }
   }

   private void method2689() {
      if (this.crossbowSwapPhase != Helper261.READY) {
         if (mc.player != null
            && mc.interactionManager != null
            && mc.options != null
            && mc.getWindow() != null
            && this.pendingCrossbowSlot != -1
            && mc.currentScreen == null) {
            mc.player.input.movementForward = 0.0F;
            mc.player.input.movementSideways = 0.0F;
            if (mc.player.isSprinting()) {
               mc.player.setSprinting(false);
            }

            if (!this.movementKeysOverridden) {
               mc.options.forwardKey.setPressed(false);
               mc.options.backKey.setPressed(false);
               mc.options.leftKey.setPressed(false);
               mc.options.rightKey.setPressed(false);
               mc.options.jumpKey.setPressed(false);
               this.movementKeysOverridden = true;
            }

            if (System.currentTimeMillis() - this.crossbowSwapStartTime >= 65L) {
               mc.interactionManager
                  .clickSlot(mc.player.currentScreenHandler.syncId, this.method2695(this.pendingCrossbowSlot), 40, SlotActionType.SWAP, mc.player);
               if (this.restoringCrossbowToInventory) {
                  this.swappedCrossbowToOffhand = false;
                  this.foodCrossbowReadyForNoSlow = false;
                  this.crossbowRestoreSlot = -1;
                  this.crossbowUseTicks = 0;
                  this.restoringCrossbowToInventory = false;
               } else {
                  this.swappedCrossbowToOffhand = true;
                  this.foodCrossbowReadyForNoSlow = true;
               }

               this.pendingCrossbowSlot = -1;
               this.crossbowSwapPhase = Helper261.READY;
               this.method2693();
            }
         } else {
            this.method2692();
         }
      }
   }

   private void method2690() {
      if (this.swappedCrossbowToOffhand) {
         if (mc.player == null || mc.interactionManager == null || this.crossbowRestoreSlot == -1) {
            this.method2691();
         } else if (!(mc.player.getOffHandStack().getItem() instanceof CrossbowItem)) {
            this.method2691();
         } else if (this.crossbowSwapPhase == Helper261.READY) {
            this.pendingCrossbowSlot = this.crossbowRestoreSlot;
            this.restoringCrossbowToInventory = true;
            this.foodCrossbowReadyForNoSlow = false;
            this.method2688();
         }
      }
   }

   private void method2691() {
      this.swappedCrossbowToOffhand = false;
      this.crossbowRestoreSlot = -1;
      this.crossbowUseTicks = 0;
      this.method2692();
   }

   private void method2692() {
      this.pendingCrossbowSlot = -1;
      this.foodCrossbowReadyForNoSlow = false;
      this.restoringCrossbowToInventory = false;
      this.crossbowSwapPhase = Helper261.READY;
      this.method2693();
   }

   private void method2693() {
      if (this.movementKeysOverridden && mc.options != null && mc.getWindow() != null) {
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
         this.movementKeysOverridden = false;
      }
   }

   private int method2694() {
      for (int var1 = 0; var1 < 36; var1++) {
         if (mc.player.getInventory().getStack(var1).getItem() instanceof CrossbowItem) {
            return var1;
         }
      }

      return -1;
   }

   private int method2695(int var1) {
      return var1 >= 0 && var1 <= 8 ? 36 + var1 : var1;
   }

   private boolean method2696(BlockPos var1) {
      Block var2 = mc.world.getBlockState(var1).getBlock();
      return var2 == Blocks.SNOW;
   }

   private void method2697(Packet<?> var1, String var2) {
      mc.player.networkHandler.sendPacket(var1);
      this.method2698(var1, var2);
   }

   private void method2698(Packet<?> var1, String var2) {
      if (this.packetDebug.method2200() && mc.player != null) {
         String var3 = String.format(
            "NoSlow/%s -> %s [%s] | useTicks=%d | hand=%s | sprint=%s",
            this.itemMode.method2386(),
            var1.getClass().getSimpleName(),
            var2,
            mc.player.getItemUseTime(),
            String.valueOf(mc.player.getActiveHand()),
            mc.player.isSprinting()
         );
         this.method906(var3);
      }
   }
}
