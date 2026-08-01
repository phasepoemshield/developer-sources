package l;

import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Hand;

public class ClickPearl extends Helper242 {
   private static final long PRE_THROW_DELAY_MS = 35L;
   private final Setting9 keySetting = new Setting9("Кнопка", "Кнопка для броска перки");
   private boolean throwPearl;
   private long lastUseTime;
   private long actionTimer;
   private long stopMovementUntil;
   private int previousSlot = -1;
   private int pendingHotbarSlot = -1;
   private Slot pendingInventorySlot;
   private boolean keysOverridden;
   private boolean wasForwardPressed;
   private boolean wasBackPressed;
   private boolean wasLeftPressed;
   private boolean wasRightPressed;
   private boolean wasJumpPressed;
   private Helper374 throwState = Helper374.IDLE;
   private Helper375 throwMode = Helper375.NONE;

   public ClickPearl() {
      super("ClickPearl", "Click Pearl", Helper269.MISC);
      this.setup(new Helper264[]{this.keySetting});
   }

   @Helper104
   public void method3679(Event17 var1) {
      if (var1.method3903(this.keySetting.getKey())) {
         this.throwPearl = true;
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player == null || mc.world == null) {
         this.method3689();
      } else if (this.throwState != Helper374.IDLE) {
         this.method3687();
         this.method3681();
      } else if (this.throwPearl && mc.currentScreen == null) {
         if (System.currentTimeMillis() - this.lastUseTime >= 200L) {
            this.throwPearl = false;
            if (!mc.player.getItemCooldownManager().isCoolingDown(Items.ENDER_PEARL.getDefaultStack())) {
               if (mc.player.getOffHandStack().getItem() == Items.ENDER_PEARL) {
                  this.method3680(Helper375.OFFHAND, -1, null);
               } else {
                  Helper35 var2 = Helper70.method760(Items.ENDER_PEARL);
                  if (var2.method505()) {
                     this.method3680(Helper375.HOTBAR, var2.method504(), null);
                  } else {
                     Helper35 var3 = Helper70.method761(Items.ENDER_PEARL);
                     if (var3.method505()) {
                        this.method3680(Helper375.INVENTORY, -1, mc.player.currentScreenHandler.getSlot(var3.method504()));
                     } else {
                        Helper238.method2186("Нету жемчуга");
                     }
                  }
               }
            }
         }
      }
   }

   private void method3680(Helper375 var1, int var2, Slot var3) {
      this.throwMode = var1;
      this.previousSlot = mc.player.getInventory().selectedSlot;
      this.pendingHotbarSlot = var2;
      this.pendingInventorySlot = var3;
      this.wasForwardPressed = mc.options.forwardKey.isPressed();
      this.wasBackPressed = mc.options.backKey.isPressed();
      this.wasLeftPressed = mc.options.leftKey.isPressed();
      this.wasRightPressed = mc.options.rightKey.isPressed();
      this.wasJumpPressed = mc.options.jumpKey.isPressed();
      this.keysOverridden = true;
      this.method3687();
      if (mc.player.isSprinting()) {
         mc.player.setSprinting(false);
      }

      this.throwState = Helper374.WAIT_BEFORE_USE;
      this.actionTimer = System.currentTimeMillis();
      this.stopMovementUntil = this.actionTimer + 35L;
   }

   private void method3681() {
      if (System.currentTimeMillis() - this.actionTimer >= 35L) {
         switch (this.throwState) {
            case WAIT_BEFORE_USE:
               switch (this.throwMode) {
                  case OFFHAND:
                     this.method3682();
                     break;
                  case HOTBAR:
                     this.method3683();
                     break;
                  case INVENTORY:
                     this.method3685();
                     break;
                  default:
                     this.method3689();
                     return;
               }

               this.lastUseTime = System.currentTimeMillis();
               this.throwState = Helper374.WAIT_BEFORE_RESTORE;
               this.actionTimer = System.currentTimeMillis();
               this.stopMovementUntil = this.actionTimer + 35L;
               break;
            case WAIT_BEFORE_RESTORE:
               switch (this.throwMode) {
                  case HOTBAR:
                     this.method3684();
                     break;
                  case INVENTORY:
                     this.method3686();
               }

               this.method3688();
               this.method3689();
         }
      }
   }

   private void method3682() {
      mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
      mc.player.swingHand(Hand.OFF_HAND);
   }

   private void method3683() {
      if (this.pendingHotbarSlot != this.previousSlot) {
         Helper66.method696(this.pendingHotbarSlot);
         mc.player.getInventory().selectedSlot = this.pendingHotbarSlot;
      }

      mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
      mc.player.swingHand(Hand.MAIN_HAND);
   }

   private void method3684() {
      if (this.pendingHotbarSlot != this.previousSlot && this.previousSlot != -1) {
         Helper66.method696(this.previousSlot);
         mc.player.getInventory().selectedSlot = this.previousSlot;
      }
   }

   private void method3685() {
      if (this.pendingInventorySlot != null && this.previousSlot != -1) {
         Helper66.method692(this.pendingInventorySlot, this.previousSlot, false);
         mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
         mc.player.swingHand(Hand.MAIN_HAND);
      }
   }

   private void method3686() {
      if (this.pendingInventorySlot != null && this.previousSlot != -1) {
         Helper66.method692(this.pendingInventorySlot, this.previousSlot, true);
         Helper66.method696(this.previousSlot);
         mc.player.getInventory().selectedSlot = this.previousSlot;
      }
   }

   private void method3687() {
      mc.options.forwardKey.setPressed(false);
      mc.options.backKey.setPressed(false);
      mc.options.leftKey.setPressed(false);
      mc.options.rightKey.setPressed(false);
      mc.options.jumpKey.setPressed(false);
      if (mc.player.input != null) {
         mc.player.input.movementForward = 0.0F;
         mc.player.input.movementSideways = 0.0F;
      }

      if (mc.player.isSprinting()) {
         mc.player.setSprinting(false);
      }
   }

   private void method3688() {
      if (this.keysOverridden) {
         mc.options.forwardKey.setPressed(this.wasForwardPressed);
         mc.options.backKey.setPressed(this.wasBackPressed);
         mc.options.leftKey.setPressed(this.wasLeftPressed);
         mc.options.rightKey.setPressed(this.wasRightPressed);
         mc.options.jumpKey.setPressed(this.wasJumpPressed);
         if (mc.player.input != null) {
            if (this.wasForwardPressed) {
               mc.player.input.movementForward = 1.0F;
            } else if (this.wasBackPressed) {
               mc.player.input.movementForward = -1.0F;
            }

            if (this.wasLeftPressed) {
               mc.player.input.movementSideways = 1.0F;
            } else if (this.wasRightPressed) {
               mc.player.input.movementSideways = -1.0F;
            }
         }

         this.keysOverridden = false;
      }
   }

   private void method3689() {
      this.throwState = Helper374.IDLE;
      this.throwMode = Helper375.NONE;
      this.actionTimer = 0L;
      this.stopMovementUntil = 0L;
      this.previousSlot = -1;
      this.pendingHotbarSlot = -1;
      this.pendingInventorySlot = null;
      this.keysOverridden = false;
   }

   @Override
   public void deactivate() {
      this.throwPearl = false;
      this.lastUseTime = 0L;
      this.method3688();
      this.method3689();
      super.deactivate();
   }
}
