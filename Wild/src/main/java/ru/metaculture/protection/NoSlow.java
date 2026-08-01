package ru.metaculture.protection;

import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.consume.UseAction;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "NoSlow",
   O000000000 = "Убирает замедление при использовании предметов",
   O0000000000 = Category.Movement,
   O00000000000 = {O0000000OO0OOO.RISKY, O0000000OO0OOO.GRIM}
)
public class NoSlow extends Module {
   private static final Logger O000000000O00O = LogManager.getLogger("NoSlow");
   private static final int O000000000O0O = 1;
   private static final String O000000000O0O0 = "NoSlow_FT-Snow_Crossbow";
   private static boolean O000000000O0OO;
   private static ItemStack O000000000OO = ItemStack.EMPTY;
   public static ModeSetting O000000000O = new ModeSetting("Режим", "Grim", "Grim", "Grim Tick", "Grim V2", "FT");
   public static BooleanSetting O000000000O0 = new BooleanSetting("Арбалет", true).O00000000(() -> !O000000000O.O000000000("FT"));
   public static BooleanSetting O000000000O00 = new BooleanSetting("Точный стоп", true)
      .O00000000(() -> !O000000000O.O000000000("FT-Snow") || !O000000000O0.O0000000000());
   public static NumberSetting O000000000O000 = new NumberSetting("Задержка свапа", 70.0F, 0.0F, 250.0F, 5.0F, false)
      .O00000000(() -> !O000000000O.O000000000("FT-Snow") || !O000000000O0.O0000000000() || !O000000000O00.O0000000000());
   private float O000000000OO0 = 0.0F;
   private int O000000000OO00 = -1;
   private int O000000000OO0O;
   private boolean O000000000OOO;
   private final O0000O00O0000 O000000000OOO0 = new O0000O00O0000();
   private NoSlow.W121 O000000000OOOO = NoSlow.W121.IDLE;

   public NoSlow() {
      this.O00000000(new Setting[]{O000000000O});
   }

   @EventHandler
   public void O00000000(O0000000O0O0O0 o0000000O0O0O0) {
      if (O0000000000.player != null) {
         if (O000000000O.O000000000("Grim Tick") || O000000000O.O000000000("Grim V2")) {
            if (O0000000000.player.isUsingItem()) {
               this.O000000000OO0++;
            } else {
               this.O000000000OO0 = 0.0F;
            }
         }
      }
   }

   @EventHandler(
      O00000000 = 0
   )
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player == null) {
         this.O000000000("player-missing");
      } else {
         if (O000000000O.O000000000("FT-Snow") && O000000000O0.O0000000000() && O000000000O00.O0000000000()) {
            this.O0000000000O0();
         } else {
            this.O000000000O0OO();
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000OO00 o0000000OO00) {
      if (O0000000000.player != null) {
         if (O000000000O.O000000000("Grim")) {
            if (O0000000000.player.getActiveHand() == Hand.MAIN_HAND) {
               O0000000000.interactionManager.interactItem(O0000000000.player, Hand.OFF_HAND);
            } else {
               O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
            }

            o0000000OO00.O000000000();
         }

         if (O000000000O.O000000000("FT")) {
            if (O0000000000.player.isUsingItem() && O0000000000.player.getActiveItem().getItem() instanceof CrossbowItem) {
               o0000000OO00.O000000000();
            }

            if (this.O000000000O0()) {
               o0000000OO00.O000000000();
            }
         }

         if (O000000000O.O000000000("Grim V2") && O0000000000.player.isUsingItem() && !O0000000000.player.hasVehicle() && this.O000000000OO0 >= 1.3F) {
            o0000000OO00.O000000000();
            this.O000000000OO0 = 0.26F;
         }

         if (O000000000O.O000000000("Grim Tick") && O0000000000.player.isUsingItem() && !O0000000000.player.hasVehicle() && this.O000000000OO0 >= 1.2F) {
            o0000000OO00.O000000000();
            this.O000000000OO0 = 0.0F;
         }
      }
   }

   private void O0000000000O0() {
      if (O0000000000.interactionManager != null && O0000000000.player != null) {
         if (this.O000000000OOOO != NoSlow.W121.IDLE) {
            this.O0000000000O00();
         } else {
            if (this.O000000000O00() && !O0000000000.player.getOffHandStack().isOf(Items.CROSSBOW) && O0000O00O000OO.O00000000()) {
               this.O0000000000OO();
            }
         }
      }
   }

   private void O0000000000O00() {
      if (O0000000000.player != null && O0000000000.interactionManager != null) {
         switch (this.O000000000OOOO) {
            case IDLE:
            default:
               break;
            case PRE_SWAP_STOP:
               this.O000000000O0O();
               if (!this.O000000000O()) {
                  return;
               }

               this.O00000000000(this.O000000000OO00);
               if (!O0000000000.player.getOffHandStack().isOf(Items.CROSSBOW)) {
                  this.O00000000("swap-failed-after-stop", this.O000000000OO00);
                  this.O0000000000("swap-failed-after-stop");
                  return;
               }

               this.O00000000("swapped-to-offhand", this.O000000000OO00);
               this.O0000000000OO0();
               break;
            case EATING:
               this.O0000000000O0O();
               break;
            case PRE_RESTORE_STOP:
               this.O000000000O0O();
               if (!this.O000000000O()) {
                  return;
               }

               if (O0000000000.player.getOffHandStack().isOf(Items.CROSSBOW)) {
                  this.O00000000000(this.O000000000OO00);
                  this.O00000000("back-swapped-after-stop", this.O000000000OO00);
               } else if (this.O000000000(this.O000000000OO00)) {
                  this.O00000000("crossbow-already-at-origin", this.O000000000OO00);
               } else {
                  this.O00000000("back-swap-missing-crossbow", this.O000000000OO00);
               }

               this.O0000000000("restore-finished");
         }
      } else {
         this.O0000000000("client-state-missing");
      }
   }

   private void O0000000000O0O() {
      if (this.O000000000O00()) {
         if (!this.O000000000OOO) {
            this.O000000000O0O0();
            this.O00000000("eating-confirmed-unlock", this.O000000000OO00);
         }

         this.O000000000OOO = true;
         this.O000000000OO0O = 0;
      } else {
         if (!this.O000000000OOO) {
            this.O000000000O0O();
         }

         this.O000000000OO();
         if (!this.O000000000OOO && this.O000000000O000()) {
            if (this.O000000000OO0O++ < 1) {
               this.O0000000000OO0();
               this.O00000000("restart-eating", this.O000000000OO00);
            } else {
               this.O00000000("eating-did-not-start");
            }
         } else {
            this.O00000000(this.O000000000OOO ? "eating-finished" : "eating-cancelled");
         }
      }
   }

   private void O0000000000OO() {
      int var1 = this.O000000000O00O();
      if (var1 == -1) {
         this.O00000000("no-crossbow-found", -1);
      } else {
         O000000000OO00();
         this.O000000000OO0();
         this.O000000000OO00 = var1;
         this.O000000000OOOO = NoSlow.W121.PRE_SWAP_STOP;
         this.O0000000000OOO();
         this.O000000000OOO = false;
         this.O000000000OO0O = 0;
         this.O000000000O0O();
         this.O00000000("pre-swap-stop", var1);
      }
   }

   private void O0000000000OO0() {
      if (!this.O000000000O000()) {
         this.O00000000("main-hand-food-missing");
      } else {
         O0000000000.options.useKey.setPressed(true);
         O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
         this.O000000000O0O0();
         this.O000000000OOOO = NoSlow.W121.EATING;
         this.O00000000("start-eating", this.O000000000OO00);
      }
   }

   private void O00000000(String string) {
      this.O000000000OO0();
      this.O000000000OOOO = NoSlow.W121.PRE_RESTORE_STOP;
      this.O0000000000OOO();
      this.O000000000O0O();
      this.O00000000("pre-back-swap-stop:" + string, this.O000000000OO00);
   }

   private void O0000000000OOO() {
      this.O000000000OOO0.O00000000();
   }

   private boolean O000000000O() {
      return O000000000O00.O0000000000() && this.O000000000OOO0.O00000000000O((long)O000000000O000.O0000000000());
   }

   private boolean O000000000O0() {
      return !this.O000000000O00() ? false : this.O000000000OOOO != NoSlow.W121.IDLE || O0000000000.player.getOffHandStack().isOf(Items.CROSSBOW);
   }

   private boolean O000000000O00() {
      if (O0000000000.player != null && O0000000000.player.isUsingItem() && O0000000000.player.getActiveHand() == Hand.MAIN_HAND) {
         ItemStack var1 = O0000000000.player.getActiveItem();
         return !var1.isEmpty() && var1.getUseAction() == UseAction.EAT;
      } else {
         return false;
      }
   }

   private boolean O000000000O000() {
      if (O0000000000.player == null) {
         return false;
      } else {
         ItemStack var1 = O0000000000.player.getMainHandStack();
         return !var1.isEmpty() && var1.getUseAction() == UseAction.EAT;
      }
   }

   private int O000000000O00O() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (this.O00000000(var1)) {
            return this.O0000000000(var1);
         }
      }

      for (int var2 = 9; var2 < 36; var2++) {
         if (this.O00000000(var2)) {
            return this.O0000000000(var2);
         }
      }

      return -1;
   }

   private boolean O00000000(int i) {
      return O0000000000.player != null && i >= 0 && i < 36 && O0000000000.player.getInventory().getStack(i).isOf(Items.CROSSBOW);
   }

   private boolean O000000000(int i) {
      return i >= 36 && i <= 44 ? this.O00000000(i - 36) : i >= 9 && i < 36 && this.O00000000(i);
   }

   private int O0000000000(int i) {
      return i < 9 ? i + 36 : i;
   }

   private void O00000000000(int i) {
      if (O0000000000.player != null && O0000000000.interactionManager != null) {
         O0000000000.interactionManager.clickSlot(O0000000000.player.playerScreenHandler.syncId, i, 40, SlotActionType.SWAP, O0000000000.player);
      }
   }

   private void O000000000O0O() {
      if (O0000000000.player != null && O0000000000.world != null) {
         O0000O00O00O.O00000000().O00000000("NoSlow_FT-Snow_Crossbow");
         Sprint.O000000000O000 = Math.max(Sprint.O000000000O000, 1);
         O0000000000.options.useKey.setPressed(false);
      }
   }

   private void O000000000O0O0() {
      if (O0000000000.player != null && O0000000000.world != null) {
         O0000O00O00O.O00000000().O000000000("NoSlow_FT-Snow_Crossbow");
      } else {
         O0000O00O00O.O00000000().O00000000.remove("NoSlow_FT-Snow_Crossbow");
      }
   }

   private void O000000000O0OO() {
      this.O000000000("restore-requested");
   }

   private void O000000000(String string) {
      this.O000000000OO();
      if (this.O000000000OOOO != NoSlow.W121.IDLE && this.O000000000OO00 != -1) {
         if (O0000000000.player != null && O0000000000.interactionManager != null && O0000000000.player.getOffHandStack().isOf(Items.CROSSBOW)) {
            this.O00000000000(this.O000000000OO00);
            this.O00000000(string, this.O000000000OO00);
         } else {
            this.O00000000(string + ":offhand-not-crossbow", this.O000000000OO00);
         }

         this.O0000000000(string);
      } else {
         this.O0000000000(string);
      }
   }

   private void O0000000000(String string) {
      if (this.O000000000OOOO != NoSlow.W121.IDLE || this.O000000000OO00 != -1) {
         this.O00000000("reset:" + string, this.O000000000OO00);
      }

      this.O000000000O0O0();
      O000000000OO0O();
      this.O000000000OO00 = -1;
      this.O000000000OO0O = 0;
      this.O000000000OOO = false;
      this.O000000000OOO0.O00000000();
      this.O000000000OOOO = NoSlow.W121.IDLE;
   }

   private void O000000000OO() {
      if (O0000000000.player != null && O0000000000.interactionManager != null && this.O000000000OOOO != NoSlow.W121.IDLE) {
         if (O0000000000.player.isUsingItem() && O0000000000.player.getActiveHand() == Hand.OFF_HAND) {
            if (O0000000000.player.getActiveItem().isOf(Items.CROSSBOW)) {
               this.O00000000("stop-offhand-crossbow-use", this.O000000000OO00);
               this.O000000000OO0();
            }
         }
      }
   }

   private void O000000000OO0() {
      if (O0000000000.player != null && O0000000000.interactionManager != null && O0000000000.player.isUsingItem()) {
         O0000000000.interactionManager.stopUsingItem(O0000000000.player);
         O0000000000.player.stopUsingItem();
      }
   }

   private static void O000000000OO00() {
      if (O0000000000.player != null) {
         O000000000OO = O0000000000.player.getOffHandStack().copy();
         O000000000O0OO = true;
      }
   }

   private static void O000000000OO0O() {
      O000000000O0OO = false;
      O000000000OO = ItemStack.EMPTY;
   }

   public static ItemStack O00000000(ItemStack itemStack) {
      if (!O000000000O0OO) {
         return itemStack;
      } else {
         return O000000000OO == null ? ItemStack.EMPTY : O000000000OO;
      }
   }

   private void O00000000(String string, int i) {
      O000000000O00O.info(
         "",
         new Object[]{
            string,
            this.O000000000OOOO,
            i,
            O000000000O00.O0000000000(),
            this.O000000000OOO0.O0000000000000(),
            (long)O000000000O000.O0000000000(),
            O0000000000.player != null && O0000000000.player.isUsingItem(),
            O0000000000.player != null ? O0000000000.player.getActiveHand() : null,
            O0000000000.player != null ? O0000000000.player.getMainHandStack().getItem() : null,
            O0000000000.player != null ? O0000000000.player.getOffHandStack().getItem() : null,
            O000000000O0OO,
            O000000000OO != null ? O000000000OO.getItem() : null,
            O0000000000.options != null && O0000000000.options.useKey.isPressed()
         }
      );
   }

   @Override
   public void O000000000() {
      this.O000000000("module-disabled");
      super.O000000000();
   }

   static enum W121 {
      IDLE,
      PRE_SWAP_STOP,
      EATING,
      PRE_RESTORE_STOP;
   }
}
