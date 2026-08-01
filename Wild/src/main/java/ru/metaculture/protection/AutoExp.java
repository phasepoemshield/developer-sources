package ru.metaculture.protection;

import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import org.lwjgl.glfw.GLFW;
import org.wild.mixin.acceser.ClientPlayerInteractionManagerAccessor;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoExp",
   O000000000 = "Автоматически использует пузырьки опыта",
   O0000000000 = Category.Player
)
public class AutoExp extends Module {
   private final KeybindSetting O000000000O = new KeybindSetting("Клавиша опыта", -1, true);
   private final NumberSetting O000000000O0 = new NumberSetting("Задержка", 80.0F, 20.0F, 300.0F, 10.0F, false);
   private final BooleanSetting O000000000O00 = new BooleanSetting("Только изношенное", false);
   private final NumberSetting O000000000O000 = new NumberSetting("Прочность до", 95.0F, 5.0F, 100.0F, 5.0F, false)
      .O00000000(() -> !this.O000000000O00.O0000000000());
   private final O0000O00O0000 O000000000O00O = new O0000O00O0000();
   private int O000000000O0O = 0;
   private int O000000000O0O0 = 0;
   private int O000000000O0OO = -1;
   private int O000000000OO = -1;
   private Hand O000000000OO0 = Hand.MAIN_HAND;

   public AutoExp() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0, this.O000000000O00, this.O000000000O000});
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player == null || O0000000000.interactionManager == null || this.O000000000O.O0000000000() == -1) {
         this.O0000000000OOO();
      } else if (this.O000000000O0O > 0) {
         if (this.O000000000O0O0 > 0) {
            this.O000000000O();
            this.O000000000O0O0--;
         } else {
            this.O0000000000O00();
         }
      } else if (this.O000000000O00() && this.O000000000O00O.O000000000000((long)this.O000000000O0.O0000000000())) {
         if (!this.O000000000O00.O0000000000() || this.O000000000O00O()) {
            this.O0000000000O0();
         }
      }
   }

   private void O0000000000O0() {
      this.O000000000OO = O0000000000.player.getInventory().getSelectedSlot();
      if (O0000000000.player.getOffHandStack().isOf(Items.EXPERIENCE_BOTTLE)) {
         this.O000000000OO0 = Hand.OFF_HAND;
         this.O000000000O0O = O0000000000.currentScreen instanceof InventoryScreen ? 1 : 2;
      } else {
         int var1 = this.O000000000O000();
         if (var1 != -1) {
            this.O000000000O0OO = var1;
            this.O000000000OO0 = Hand.MAIN_HAND;
            this.O000000000O0O = O0000000000.currentScreen instanceof InventoryScreen ? 1 : (var1 < 9 ? 2 : 4);
         }
      }
   }

   private void O0000000000O00() {
      if (O0000000000.player != null && O0000000000.interactionManager != null) {
         switch (this.O000000000O0O) {
            case 1:
               O0000000000.player.closeHandledScreen();
               this.O000000000O0O = this.O000000000O0OO >= 9 ? 4 : 2;
               this.O000000000O0O0 = 2;
               break;
            case 2:
               this.O000000000O();
               this.O0000000000O0O();
               this.O000000000O0O = 3;
               this.O000000000O0O0 = 1;
               break;
            case 3:
               this.O0000000000OO();
               break;
            case 4:
               this.O000000000O();
               this.O000000000O0();
               O0000000000.interactionManager
                  .clickSlot(O0000000000.player.playerScreenHandler.syncId, this.O000000000O0OO, this.O000000000OO, SlotActionType.SWAP, O0000000000.player);
               O0000000000.player.closeHandledScreen();
               this.O000000000O0O = 5;
               this.O000000000O0O0 = 2;
               break;
            case 5:
               this.O000000000O();
               this.O0000000000O0O();
               this.O000000000O0O = 6;
               this.O000000000O0O0 = 2;
               break;
            case 6:
               this.O000000000O();
               this.O000000000O0();
               O0000000000.interactionManager
                  .clickSlot(O0000000000.player.playerScreenHandler.syncId, this.O000000000O0OO, this.O000000000OO, SlotActionType.SWAP, O0000000000.player);
               O0000000000.player.closeHandledScreen();
               this.O0000000000OO0();
               break;
            default:
               this.O0000000000OOO();
         }
      } else {
         this.O0000000000OOO();
      }
   }

   private void O0000000000O0O() {
      if (this.O000000000OO0 == Hand.MAIN_HAND && this.O000000000O0OO >= 0 && this.O000000000O0OO < 9) {
         O0000000000.player.getInventory().setSelectedSlot(this.O000000000O0OO);
      }

      O0000000000.interactionManager.interactItem(O0000000000.player, this.O000000000OO0);
      O0000000000.player.swingHand(this.O000000000OO0);
   }

   private void O0000000000OO() {
      if (this.O000000000OO0 == Hand.MAIN_HAND && this.O000000000O0OO >= 0 && this.O000000000O0OO < 9 && this.O000000000OO != this.O000000000O0OO) {
         O0000000000.player.getInventory().setSelectedSlot(this.O000000000OO);
         ((ClientPlayerInteractionManagerAccessor)O0000000000.interactionManager).invokeSyncSelectedSlot();
      }

      this.O0000000000OO0();
   }

   private void O0000000000OO0() {
      this.O000000000O00O.O00000000();
      this.O0000000000OOO();
   }

   private void O0000000000OOO() {
      this.O000000000O0O = 0;
      this.O000000000O0O0 = 0;
      this.O000000000O0OO = -1;
      this.O000000000OO = -1;
      this.O000000000OO0 = Hand.MAIN_HAND;
   }

   private void O000000000O() {
      Sprint.O000000000O000 = 2;
      O0000000000.options.sprintKey.setPressed(false);
      if (O0000000000.player.isSprinting()) {
         O0000000000.player.setSprinting(false);
         if (O0000000000.getNetworkHandler() != null) {
            O0000000000.getNetworkHandler().sendPacket(new ClientCommandC2SPacket(O0000000000.player, Mode.STOP_SPRINTING));
         }
      }
   }

   private void O000000000O0() {
      if (O0000000000.getNetworkHandler() != null) {
         O0000000000.getNetworkHandler().sendPacket(new ClientCommandC2SPacket(O0000000000.player, Mode.OPEN_INVENTORY));
      }
   }

   private boolean O000000000O00() {
      if (O0000000000.currentScreen == null) {
         return KeybindSetting.O000000000(this.O000000000O.O0000000000());
      } else if (O0000000000.currentScreen instanceof InventoryScreen && O0000000000.getWindow() != null) {
         long var1 = O0000000000.getWindow().getHandle();
         int var3 = this.O000000000O.O0000000000();
         if (var3 >= 0) {
            return InputUtil.isKeyPressed(var1, var3);
         } else {
            return var3 <= -100 ? GLFW.glfwGetMouseButton(var1, -var3 - 100) == 1 : false;
         }
      } else {
         return false;
      }
   }

   private int O000000000O000() {
      for (int var1 = 0; var1 < 36; var1++) {
         ItemStack var2 = O0000000000.player.getInventory().getStack(var1);
         if (!var2.isEmpty() && var2.isOf(Items.EXPERIENCE_BOTTLE)) {
            return var1;
         }
      }

      return -1;
   }

   private boolean O000000000O00O() {
      for (int var1 = 0; var1 < O0000000000.player.getInventory().size(); var1++) {
         if (this.O00000000(O0000000000.player.getInventory().getStack(var1))) {
            return true;
         }
      }

      return this.O00000000(O0000000000.player.getOffHandStack());
   }

   private boolean O00000000(ItemStack itemStack) {
      if (!itemStack.isEmpty() && itemStack.isDamageable()) {
         int var2 = itemStack.getMaxDamage();
         if (var2 <= 0) {
            return false;
         } else {
            int var3 = var2 - itemStack.getDamage();
            float var4 = var3 * 100.0F / var2;
            return var4 <= this.O000000000O000.O0000000000();
         }
      } else {
         return false;
      }
   }

   @Override
   public void O000000000() {
      this.O0000000000OOO();
      super.O000000000();
   }
}
