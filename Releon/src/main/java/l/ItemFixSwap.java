package l;

import java.util.Objects;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.util.Hand;

public class ItemFixSwap extends Helper242 {
   private boolean lockActive = false;
   private int lockSlot = -1;
   private int deferredSlot = -1;
   private int lastSentSlot = -1;
   private ItemStack renderStack = null;
   private boolean pendingWorldApply = false;
   private Object lastWorldRef = null;
   private int lastServerSlot = -1;

   public ItemFixSwap() {
      super("ItemFixSwap", "ItemFixSwap", Helper269.PLAYER);
   }

   @Helper104
   public void method2220(Event6 var1) {
      if (this.lockActive
         && var1.method3670() == Hand.MAIN_HAND
         && mc.player != null
         && Objects.equals(mc.player, var1.method3668())
         && this.renderStack != null) {
         var1.method3672(this.renderStack);
      }
   }

   @Helper104
   public void method2221(Helper399 var1) {
      if (mc.player != null) {
         ;
      }
   }

   @Helper104
   public void method2222(Helper428 var1) {
      if (this.method2223()) {
         var1.method582();
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (this.lastWorldRef != mc.world) {
         this.lastWorldRef = mc.world;
         if (mc.world != null) {
            this.pendingWorldApply = true;
            this.lastSentSlot = -1;
            this.lastServerSlot = mc.player != null ? mc.player.getInventory().selectedSlot : 0;
         }
      }

      if (mc.world != null && mc.player != null) {
         if (this.pendingWorldApply) {
            if (this.lastServerSlot == -1) {
               this.lastServerSlot = mc.player.getInventory().selectedSlot;
            }

            if (this.deferredSlot != -1) {
               this.method2226(this.deferredSlot, true);
            } else {
               this.method2225(true);
            }

            this.pendingWorldApply = false;
         }

         boolean var2 = this.method2224();
         int var3 = mc.player.getInventory().selectedSlot;
         if (var2) {
            if (!this.lockActive) {
               this.lockActive = true;
               this.lockSlot = this.method2228(var3);
               this.renderStack = mc.player.getMainHandStack().copy();
               this.method2227(this.lockSlot, true);
            } else if (var3 != this.lockSlot) {
               this.deferredSlot = this.method2228(var3);
               mc.player.getInventory().selectedSlot = this.lockSlot;
            }
         } else if (this.lockActive) {
            this.lockActive = false;
            if (this.deferredSlot != -1 && this.deferredSlot != this.lockSlot) {
               this.method2226(this.deferredSlot, true);
               Helper66.method700();
            } else {
               mc.player.getInventory().selectedSlot = this.lastServerSlot;
            }

            this.lockSlot = -1;
            this.deferredSlot = -1;
            this.renderStack = null;
         }
      }
   }

   private boolean method2223() {
      return this.lockActive || this.method2224();
   }

   private boolean method2224() {
      return mc.player != null && mc.player.isUsingItem() && mc.player.getActiveHand() == Hand.MAIN_HAND;
   }

   private void method2225(boolean var1) {
      if (mc.player != null) {
         int var2 = this.method2228(mc.player.getInventory().selectedSlot);
         if (var1 || this.lastSentSlot != var2) {
            this.method2227(var2, true);
         }
      }
   }

   private void method2226(int var1, boolean var2) {
      if (mc.player != null) {
         var1 = this.method2228(var1);
         mc.player.getInventory().selectedSlot = var1;
         this.method2227(var1, true);
      }
   }

   private void method2227(int var1, boolean var2) {
      if (mc.player != null && mc.player.networkHandler != null) {
         if (var2 || this.lastSentSlot != var1) {
            mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(var1));
            this.lastSentSlot = var1;
            this.lastServerSlot = var1;
         }
      }
   }

   private int method2228(int var1) {
      if (var1 < 0) {
         return 0;
      } else {
         return var1 > 8 ? 8 : var1;
      }
   }
}
