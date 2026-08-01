package l;

import antidaunleak.api.annotation.Native;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;
import net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket;
import net.minecraft.screen.slot.SlotActionType;

public class GuiMove extends Helper242 {
   private final List<Packet<?>> packets = new ArrayList<>();
   private Helper430 movePhase = Helper430.READY;
   private long actionStartTime = 0L;
   private boolean playerFullyStopped = false;
   private boolean wasForwardPressed;
   private boolean wasBackPressed;
   private boolean wasLeftPressed;
   private boolean wasRightPressed;
   private boolean wasJumpPressed;
   private boolean keysOverridden = false;
   private boolean inventoryOpened = false;
   private boolean packetsHeld = false;

   public GuiMove() {
      super("GuiMove", "Gui Move", Helper269.MOVEMENT);
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      Packet packet = Objects.requireNonNull(var1.method3895());

      if (packet instanceof ClickSlotC2SPacket clickSlot) {
         if (this.method4424(clickSlot)) {
            this.packets.add(clickSlot);
            var1.method582();
            this.packetsHeld = true;
         }
      } else if (packet instanceof CloseScreenS2CPacket closeScreen && closeScreen.getSyncId() == 0) {
         var1.method582();
      }
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginUltra
   )
   public void onTick(Event8 var1) {
      this.method4417();
   }

   private void method4417() {
      boolean var1 = mc.currentScreen != null;
      if (var1 && !this.inventoryOpened && this.movePhase == Helper430.READY) {
         this.method4418();
         this.inventoryOpened = true;
      }

      if (!var1 && this.inventoryOpened) {
         if (this.packetsHeld && this.movePhase == Helper430.ALLOW_MOVEMENT) {
            this.movePhase = Helper430.SLOWING_DOWN;
            this.actionStartTime = System.currentTimeMillis();
         } else if (!this.packetsHeld) {
            this.method4422();
         }

         this.inventoryOpened = false;
      } else {
         if (this.movePhase != Helper430.READY) {
            this.method4419();
         }
      }
   }

   private void method4418() {
      this.wasForwardPressed = InputUtil.isKeyPressed(mc.getWindow().getHandle(), mc.options.forwardKey.getDefaultKey().getCode());
      this.wasBackPressed = InputUtil.isKeyPressed(mc.getWindow().getHandle(), mc.options.backKey.getDefaultKey().getCode());
      this.wasLeftPressed = InputUtil.isKeyPressed(mc.getWindow().getHandle(), mc.options.leftKey.getDefaultKey().getCode());
      this.wasRightPressed = InputUtil.isKeyPressed(mc.getWindow().getHandle(), mc.options.rightKey.getDefaultKey().getCode());
      this.wasJumpPressed = InputUtil.isKeyPressed(mc.getWindow().getHandle(), mc.options.jumpKey.getDefaultKey().getCode());
      this.movePhase = Helper430.ALLOW_MOVEMENT;
      this.keysOverridden = false;
      this.packetsHeld = false;
   }

   private void method4419() {
      long var1 = System.currentTimeMillis() - this.actionStartTime;
      switch (this.movePhase) {
         case SLOWING_DOWN:
            if (mc.player != null && mc.player.input != null) {
               mc.player.input.movementForward = 0.0F;
               mc.player.input.movementSideways = 0.0F;
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
               this.movePhase = Helper430.SEND_PACKETS;
               this.actionStartTime = System.currentTimeMillis();
            }
            break;
         case ALLOW_MOVEMENT:
            if (mc.currentScreen != null && !(mc.currentScreen instanceof ChatScreen)) {
               Helper59.method663();
            }
            break;
         case SPEEDING_UP:
            long var3 = System.currentTimeMillis() - this.actionStartTime;
            float var5 = Math.min(1.0F, (float)var3 / 1.0F);
            if (this.keysOverridden) {
               this.method4420();
            }

            if (mc.player != null && mc.player.input != null) {
               boolean var6 = InputUtil.isKeyPressed(mc.getWindow().getHandle(), mc.options.forwardKey.getDefaultKey().getCode());
               float var7 = var6 ? 1.0F : 0.0F;
               mc.player.input.movementForward = this.method4421(mc.player.input.movementForward, var7 * var5, 0.4F);
               if (var5 > 0.5F && var6 && !mc.player.isSprinting()) {
                  mc.player.setSprinting(false);
               }
            }

            if (var3 > 1L) {
               this.movePhase = Helper430.FINISHED;
            }
            break;
         case SEND_PACKETS:
            if (!this.packets.isEmpty()) {
               this.packets.forEach(Helper38::method525);
               this.packets.clear();
               Helper66.method700();
            }

            this.packetsHeld = false;
            this.movePhase = Helper430.SPEEDING_UP;
            this.actionStartTime = System.currentTimeMillis();
            break;
         case FINISHED:
            this.method4422();
      }
   }

   private void method4420() {
      boolean var1 = InputUtil.isKeyPressed(mc.getWindow().getHandle(), mc.options.forwardKey.getDefaultKey().getCode());
      boolean var2 = InputUtil.isKeyPressed(mc.getWindow().getHandle(), mc.options.backKey.getDefaultKey().getCode());
      boolean var3 = InputUtil.isKeyPressed(mc.getWindow().getHandle(), mc.options.leftKey.getDefaultKey().getCode());
      boolean var4 = InputUtil.isKeyPressed(mc.getWindow().getHandle(), mc.options.rightKey.getDefaultKey().getCode());
      boolean var5 = InputUtil.isKeyPressed(mc.getWindow().getHandle(), mc.options.jumpKey.getDefaultKey().getCode());
      mc.options.forwardKey.setPressed(this.wasForwardPressed && var1);
      mc.options.backKey.setPressed(this.wasBackPressed && var2);
      mc.options.leftKey.setPressed(this.wasLeftPressed && var3);
      mc.options.rightKey.setPressed(this.wasRightPressed && var4);
      mc.options.jumpKey.setPressed(this.wasJumpPressed && var5);
      this.keysOverridden = false;
   }

   private float method4421(float var1, float var2, float var3) {
      return var1 + (var2 - var1) * var3;
   }

   private void method4422() {
      if (this.keysOverridden) {
         this.method4420();
      }

      this.movePhase = Helper430.READY;
      this.playerFullyStopped = false;
      this.inventoryOpened = false;
      this.packetsHeld = false;
      this.packets.clear();
   }

   @Helper104
   public void method4423(Helper371 var1) {
      SlotActionType var2 = var1.method3651();
      if (!this.method4425(var1.method3649(), var1.method3650(), var2)) {
         if ((this.packetsHeld || Helper165.method1351())
            && (var1.method3650() == 1 && !var2.equals(SlotActionType.SWAP) && !var2.equals(SlotActionType.THROW) || var2.equals(SlotActionType.PICKUP_ALL))) {
            var1.method582();
         }
      }
   }

   private boolean method4424(ClickSlotC2SPacket var1) {
      if (!Helper59.method664()) {
         return false;
      } else {
         return this.packetsHeld || !this.method4425(var1.getSlot(), var1.getButton(), var1.getActionType()) && !this.method4426(var1)
            ? this.packetsHeld || Helper165.method1351()
            : false;
      }
   }

   private boolean method4425(int var1, int var2, SlotActionType var3) {
      return var1 == 45;
   }

   private boolean method4426(ClickSlotC2SPacket var1) {
      if (var1.getActionType() != SlotActionType.PICKUP) {
         return false;
      } else if (this.method4427(var1.getStack()) || var1.getModifiedStacks().values().stream().anyMatch(this::method4427)) {
         return true;
      } else if (mc.player != null && mc.player.currentScreenHandler != null) {
         int var2 = var1.getSlot();
         return var2 >= 0 && var2 < mc.player.currentScreenHandler.slots.size()
            ? this.method4427(mc.player.currentScreenHandler.getSlot(var2).getStack())
            : false;
      } else {
         return false;
      }
   }

   private boolean method4427(ItemStack var1) {
      return var1 != null && var1.isOf(Items.TNT);
   }

   @Helper104
   public void method4428(Helper405 var1) {
      if (this.packetsHeld && this.movePhase == Helper430.ALLOW_MOVEMENT) {
         this.movePhase = Helper430.SLOWING_DOWN;
         this.actionStartTime = System.currentTimeMillis();
      }
   }

   public List<Packet<?>> getPackets() {
      return this.packets;
   }

   public Helper430 method4429() {
      return this.movePhase;
   }

   public long method4430() {
      return this.actionStartTime;
   }

   public boolean method4431() {
      return this.playerFullyStopped;
   }

   public boolean method4432() {
      return this.wasForwardPressed;
   }

   public boolean method4433() {
      return this.wasBackPressed;
   }

   public boolean method4434() {
      return this.wasLeftPressed;
   }

   public boolean method4435() {
      return this.wasRightPressed;
   }

   public boolean method4436() {
      return this.wasJumpPressed;
   }

   public boolean method4437() {
      return this.keysOverridden;
   }

   public boolean method4438() {
      return this.inventoryOpened;
   }

   public boolean method4439() {
      return this.packetsHeld;
   }
}
