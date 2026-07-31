package l;

import java.util.Comparator;
import java.util.Objects;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;

public class AutoTool extends Helper242 {
   private final Helper339 swap = new Helper339();
   private final Helper339 breaking = new Helper339();
   private final Helper159 script = new Helper159();
   private final Helper159 swapBackScript = new Helper159();
   private ItemStack renderStack;
   private BlockPos lastBreakPos;
   private int previousSelectedSlot = -1;

   public AutoTool() {
      super("AutoTool", "AutoTool", Helper269.PLAYER);
   }

   @Helper104
   public void method2612(Event6 var1) {
      if (this.renderStack != null && var1.method3670() == Hand.MAIN_HAND && Objects.equals(mc.player, var1.method3668())) {
         var1.method3672(this.renderStack);
      }
   }

   @Helper104
   public void method2613(Helper399 var1) {
      if (!this.swapBackScript.method1317()) {
         var1.method582();
      }
   }

   @Helper104
   public void method2614(Helper428 var1) {
      if (!this.swapBackScript.method1317()) {
         var1.method582();
      }
   }

   @Helper104
   public void method2615(Event16 var1) {
      if (mc.player != null && mc.world != null) {
         this.breaking.method3358();
         this.lastBreakPos = var1.method3793();
         if (!mc.player.isCreative() && this.swapBackScript.method1317() && this.swap.method3356(350.0)) {
            Slot var2 = this.method2616(this.lastBreakPos);
            Slot var3 = Helper66.method718();
            if (var2 != null && !Objects.equals(var2, var3)) {
               int var4 = this.method2617(var2);
               if (var4 != -1) {
                  if (this.previousSelectedSlot == -1) {
                     this.previousSelectedSlot = mc.player.getInventory().selectedSlot;
                  }

                  Helper66.method696(var4);
                  this.swapBackScript.method1314().method1307(0, () -> {
                     if (this.previousSelectedSlot != -1) {
                        Helper66.method696(this.previousSelectedSlot);
                        this.previousSelectedSlot = -1;
                     }
                  });
               } else {
                  this.renderStack = mc.player.getMainHandStack();
                  Helper66.method690(var2, Hand.MAIN_HAND, true);
                  this.swapBackScript.method1314().method1307(0, () -> Helper66.method691(var2, Hand.MAIN_HAND, true, true));
               }

               this.swap.method3358();
            }
         }
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null) {
         this.script.method1315();
         if (!this.swapBackScript.method1317() && this.swap.method3356(350.0)) {
            Slot var2 = this.lastBreakPos != null ? this.method2616(this.lastBreakPos) : null;
            Slot var3 = Helper66.method718();
            if (Objects.equals(var2, var3) || this.breaking.method3356(100.0)) {
               if (this.previousSelectedSlot != -1) {
                  Helper66.method696(this.previousSelectedSlot);
                  this.previousSelectedSlot = -1;
               }

               this.script.method1314().method1307(4, () -> this.renderStack = null);
               this.swapBackScript.method1315();
               this.swap.method3358();
            }
         }
      }
   }

   private Slot method2616(BlockPos var1) {
      if (mc.player != null && mc.world != null && var1 != null) {
         BlockState var2 = mc.world.getBlockState(var1);
         if (Helper38.method547(var2)) {
            return Helper66.method718();
         } else {
            Slot var3 = null;
            double var4 = 0.0;

            for (int var6 = 0; var6 < 9; var6++) {
               int var7 = mc.player.getInventory().selectedSlot;
               mc.player.getInventory().selectedSlot = var6;
               Slot var8 = Helper66.method718();
               mc.player.getInventory().selectedSlot = var7;
               if (var8 != null && !var8.getStack().isEmpty()) {
                  double var9 = var8.getStack().getMiningSpeedMultiplier(var2);
                  if (var9 > 1.0 && var9 > var4) {
                     var4 = var9;
                     var3 = var8;
                  }
               }
            }

            return var3 != null
               ? var3
               : Helper66.method720()
                  .sorted(Comparator.comparing(var0 -> var0.equals(Helper66.method718())))
                  .filter(var1x -> var1x.getStack().getMiningSpeedMultiplier(var2) > 1.0)
                  .max(Comparator.comparingDouble(var1x -> var1x.getStack().getMiningSpeedMultiplier(var2)))
                  .orElse(null);
         }
      } else {
         return Helper66.method718();
      }
   }

   private int method2617(Slot var1) {
      if (var1 != null && mc.player != null) {
         for (int var2 = 0; var2 < 9; var2++) {
            int var3 = mc.player.getInventory().selectedSlot;
            mc.player.getInventory().selectedSlot = var2;
            Slot var4 = Helper66.method718();
            mc.player.getInventory().selectedSlot = var3;
            if (Objects.equals(var1, var4)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }
}
