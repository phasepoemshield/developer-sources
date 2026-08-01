package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "InvMove",
   O000000000 = "Позволяет ходить с открытым инвентарём и меню клиента",
   O0000000000 = Category.Movement
)
public class InvMove extends Module {
   public static ModeSetting O000000000O = new ModeSetting("Режим", "Grim", "Grim", "Vanilla", "FunTime");
   public static NumberSetting O000000000O0 = new NumberSetting("Задержка закрытия", 100.0F, 0.0F, 300.0F, 10.0F, false);
   private final List<Packet<?>> O000000000O000 = new ArrayList<>();
   public boolean O000000000O00 = false;
   private boolean O000000000O00O = false;
   private boolean O000000000O0O = false;
   private long O000000000O0O0 = 0L;
   private static long O000000000O0OO = 0L;

   public InvMove() {
      this.O00000000(new Setting[]{O000000000O, O000000000O0});
   }

   @EventHandler
   public void O00000000(O0000000O0O0O0 o0000000O0O0O0) {
      if (this.O000000000O00) {
         O0000O00O00O.O00000000().O00000000("GuiMove");
      } else {
         O0000O00O00O.O00000000().O000000000("GuiMove");
      }

      if (this.O000000000O00O && System.currentTimeMillis() >= this.O000000000O0O0) {
         this.O000000000O00O = false;
         this.O0000000000OO();
         this.O000000000O00 = false;
      }

      if (O0000000000.player != null) {
         if (O000000000O.O000000000("Vanilla")) {
            this.O000000000O00();
         } else if (O000000000O.O000000000("Grim")) {
            this.O000000000O0();
         } else if (O000000000O.O000000000("FunTime")) {
            if (!O0000O00O000OO.O00000000() && !this.O000000000O000.isEmpty() && O0000000000.currentScreen instanceof InventoryScreen) {
               this.O0000000000O00();
            }

            this.O000000000O000();
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (o0000000O000OO.O0000000000() && !this.O000000000O0O && O0000000000.currentScreen instanceof InventoryScreen) {
         if (!(o0000000O000OO.O00000000000() instanceof CloseHandledScreenC2SPacket)
            || !O000000000O.O000000000("FunTime")
            || this.O000000000O000.isEmpty() && !O0000O00O000OO.O00000000()) {
            if (o0000000O000OO.O00000000000() instanceof ClickSlotC2SPacket var2) {
               O000000000O();
               if (!O000000000O.O000000000("Grim") || !O0000000000.player.isSprinting() && !O0000000000.player.isJumping()) {
                  if (O000000000O.O000000000("FunTime") && O0000O00O000OO.O00000000() && (!this.O000000000O000.isEmpty() || this.O00000000(var2))) {
                     this.O000000000O000.add(var2);
                     o0000000O000OO.O000000000();
                  }
               } else {
                  this.O000000000O000.add(var2);
                  o0000000O000OO.O000000000();
               }
            }
         } else {
            o0000000O000OO.O000000000();
            this.O000000000O0O0 = System.currentTimeMillis() + this.O0000000000OOO();
            this.O000000000O00O = true;
            this.O000000000O00 = true;
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000OO0 o0000000OO0) {
      if (O0000000000.currentScreen instanceof InventoryScreen) {
         if (O000000000O.O000000000("Grim")) {
            if (!O0000000000.player.isSprinting()) {
               this.O0000000000OO0();
               return;
            }

            o0000000OO0.O000000000();
            this.O000000000O00 = false;
            this.O000000000O0O0 = System.currentTimeMillis() + this.O0000000000OOO();
            this.O000000000O00O = true;
         } else if (O000000000O.O000000000("FunTime")) {
            if (this.O000000000O000.isEmpty() && !O0000O00O000OO.O00000000()) {
               this.O0000000000OO0();
               this.O000000000O00 = false;
               this.O000000000O00O = false;
            } else {
               o0000000OO0.O000000000();
               this.O000000000O0O0 = System.currentTimeMillis() + this.O0000000000OOO();
               this.O000000000O00O = true;
               this.O000000000O00 = true;
            }
         }
      }
   }

   private void O0000000000O00() {
      if (!this.O000000000O000.isEmpty()) {
         O000000000O();
         this.O000000000O0O = true;

         try {
            for (Packet var2 : this.O000000000O000) {
               if (O0000000000.getNetworkHandler() != null) {
                  O0000000000.getNetworkHandler().sendPacket(var2);
               }
            }
         } finally {
            this.O000000000O0O = false;
            this.O000000000O000.clear();
         }
      }
   }

   private void O0000000000O0O() {
      if (O0000000000.player != null) {
         O0000000000.player.closeScreen();
      }
   }

   private void O0000000000OO() {
      this.O0000000000O00();
      this.O0000000000OO0();
      this.O0000000000O0O();
   }

   private void O0000000000OO0() {
      if (O0000000000.player != null && O0000000000.interactionManager != null) {
         ScreenHandler var1 = O0000000000.player.currentScreenHandler;
         if (var1 != null && !var1.getCursorStack().isEmpty()) {
            int var2 = this.O00000000(var1);
            if (var2 != -1) {
               boolean var3 = this.O000000000O0O;
               this.O000000000O0O = true;

               try {
                  O000000000O();
                  O0000000000.interactionManager.clickSlot(var1.syncId, var2, 0, SlotActionType.PICKUP, O0000000000.player);
               } finally {
                  this.O000000000O0O = var3;
               }
            }
         }
      }
   }

   private int O00000000(ScreenHandler screenHandler) {
      ItemStack var2 = screenHandler.getCursorStack();
      int var3 = -1;

      for (Slot var5 : screenHandler.slots) {
         if (var5.inventory == O0000000000.player.getInventory()) {
            ItemStack var6 = var5.getStack();
            if (var6.isEmpty()) {
               if (var3 == -1) {
                  var3 = var5.id;
               }
            } else if (ItemStack.areItemsAndComponentsEqual(var6, var2) && var6.getCount() + var2.getCount() <= var6.getMaxCount()) {
               return var5.id;
            }
         }
      }

      return var3;
   }

   private long O0000000000OOO() {
      return (long)O000000000O0.O0000000000();
   }

   private boolean O00000000(ClickSlotC2SPacket clickSlotC2SPacket) {
      return !clickSlotC2SPacket.modifiedStacks().isEmpty();
   }

   private static void O000000000O() {
      O000000000O0OO = System.currentTimeMillis();
   }

   public static boolean O0000000000O0() {
      return O0000000000.currentScreen instanceof InventoryScreen && System.currentTimeMillis() - O000000000O0OO < 350L;
   }

   private void O000000000O0() {
      KeyBinding[] var1 = new KeyBinding[]{
         O0000000000.options.forwardKey,
         O0000000000.options.backKey,
         O0000000000.options.leftKey,
         O0000000000.options.rightKey,
         O0000000000.options.jumpKey,
         O0000000000.options.sprintKey
      };
      if (this.O000000000O00O()) {
         this.O000000000O00 = false;
         this.O00000000(var1);
      } else if (this.O000000000O00O) {
         this.O000000000O00 = true;
      } else {
         if (!(O0000000000.currentScreen instanceof InventoryScreen)) {
            this.O000000000O00 = false;
         }

         if (O0000000000.currentScreen instanceof InventoryScreen) {
            this.O00000000(var1);
         }
      }
   }

   private void O000000000O00() {
      if (!(O0000000000.currentScreen instanceof InventoryScreen) && !this.O000000000O00O()) {
         this.O000000000O00 = false;
      }

      KeyBinding[] var1 = new KeyBinding[]{
         O0000000000.options.forwardKey,
         O0000000000.options.backKey,
         O0000000000.options.leftKey,
         O0000000000.options.rightKey,
         O0000000000.options.jumpKey,
         O0000000000.options.sprintKey
      };
      if (O0000000000.currentScreen instanceof InventoryScreen || this.O000000000O00O()) {
         this.O000000000O00 = false;
         this.O00000000(var1);
      }
   }

   private void O000000000O000() {
      KeyBinding[] var1 = new KeyBinding[]{
         O0000000000.options.forwardKey,
         O0000000000.options.backKey,
         O0000000000.options.leftKey,
         O0000000000.options.rightKey,
         O0000000000.options.jumpKey,
         O0000000000.options.sprintKey
      };
      if (this.O000000000O00O()) {
         this.O000000000O00 = false;
         this.O00000000(var1);
      } else if (this.O000000000O00O) {
         this.O000000000O00 = true;
      } else {
         if (!(O0000000000.currentScreen instanceof InventoryScreen)) {
            this.O000000000O00 = false;
         }

         if (O0000000000.currentScreen instanceof InventoryScreen) {
            this.O00000000(var1);
         }
      }
   }

   private boolean O000000000O00O() {
      return O0000000000.currentScreen instanceof ClickGuiScreen || O0000000000.currentScreen instanceof ModernClickGuiScreen;
   }

   private void O00000000(KeyBinding[] keyBindings) {
      long var2 = MinecraftClient.getInstance().getWindow().getHandle();
      ModernClickGuiScreen var4 = O0000000000.currentScreen instanceof ModernClickGuiScreen ? (ModernClickGuiScreen)O0000000000.currentScreen : null;
      boolean var5 = var4 != null && var4.O00000000().O0000000000000();

      for (KeyBinding var9 : keyBindings) {
         if (var5) {
            var9.setPressed(false);
         } else {
            int var10 = var9.getDefaultKey().getCode();
            boolean var11 = InputUtil.isKeyPressed(var2, var10);
            var9.setPressed(var11);
         }
      }
   }

   @Override
   public void O000000000() {
      this.O000000000O00 = false;
      this.O000000000O00O = false;
      this.O000000000O0O = false;
      O0000O00O00O.O00000000().O000000000("GuiMove");
      this.O000000000O000.clear();
      super.O000000000();
   }
}
