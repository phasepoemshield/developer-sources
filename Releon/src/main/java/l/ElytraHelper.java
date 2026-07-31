package l;

import java.util.List;
import java.util.Objects;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Hand;

public class ElytraHelper extends Helper242 {
   private static final long FIREWORK_PRE_USE_DELAY_MS = 35L;
   final Setting9 elytraSetting = new Setting9("Замена элитр", "Меняет нагрудник на элитры");
   final Setting9 fireworkSetting = new Setting9("Использовать фейерверк", "Меняет и использует фейерверки");
   final Setting3 startSetting = new Setting3("Быстрый старт", "При замене на элитры автоматически взлетает и использует фейерверки").method2201(false);
   final Setting3 recast = new Setting3("Авто взлет", "Автоматически начинает полет").method2201(false);
   final Helper159 script = new Helper159();
   Helper366 elytraPhase = Helper366.READY;
   long actionStartTime = 0L;
   Slot targetSlot = null;
   boolean playerFullyStopped = false;
   boolean wasForwardPressed;
   boolean wasBackPressed;
   boolean wasLeftPressed;
   boolean wasRightPressed;
   boolean wasJumpPressed;
   boolean keysOverridden = false;
   Helper364 fireworkPhase = Helper364.READY;
   Helper365 fireworkMode = Helper365.NONE;
   int savedHotbarSlot = -1;
   int originalHotbarSlot = -1;
   long fireworkActionTimer = 0L;
   Slot pendingFireworkInventorySlot = null;
   boolean fireworkWasForwardPressed;
   boolean fireworkWasBackPressed;
   boolean fireworkWasLeftPressed;
   boolean fireworkWasRightPressed;
   boolean fireworkWasJumpPressed;
   boolean fireworkKeysOverridden = false;

   public ElytraHelper() {
      super("ElytraHelper", "Elytra Helper", Helper269.MISC);
      this.setup(new Helper264[]{this.elytraSetting, this.fireworkSetting, this.startSetting, this.recast});
   }

   @Helper104
   public void onInput(Helper379 var1) {
      if (mc.player.getEquippedStack(EquipmentSlot.CHEST).getItem().equals(Items.ELYTRA) && this.recast.method2200()) {
         if (mc.player.isOnGround()) {
            var1.method3760(true);
         } else if (!mc.player.isGliding()) {
            Helper38.method524();
         }
      }
   }

   @Helper104
   public void method3614(Event17 var1) {
      if (this.script.method1317()) {
         if (var1.method3903(this.elytraSetting.getKey()) && this.elytraPhase == Helper366.READY) {
            this.method3625();
         } else if (var1.method3903(this.fireworkSetting.getKey()) && mc.player.isGliding() && this.fireworkPhase == Helper364.READY) {
            this.method3617();
         }
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      this.script.method1315();
      if (this.elytraPhase != Helper366.READY) {
         this.method3626();
      }

      if (this.fireworkPhase != Helper364.READY) {
         this.method3623();
         this.method3615();
      }
   }

   private void method3615() {
      if (mc.player != null && mc.currentScreen == null) {
         if (System.currentTimeMillis() - this.fireworkActionTimer >= 35L) {
            switch (this.fireworkPhase) {
               case WAIT_BEFORE_USE:
                  switch (this.fireworkMode) {
                     case HOTBAR:
                        this.method3619();
                        break;
                     case INVENTORY:
                        this.method3621();
                        break;
                     default:
                        this.method3616();
                        return;
                  }

                  this.fireworkPhase = Helper364.WAIT_BEFORE_RESTORE;
                  this.fireworkActionTimer = System.currentTimeMillis();
                  break;
               case WAIT_BEFORE_RESTORE:
                  switch (this.fireworkMode) {
                     case HOTBAR:
                        this.method3620();
                        break;
                     case INVENTORY:
                        this.method3622();
                  }

                  this.method3624();
                  this.method3616();
            }
         }
      } else {
         this.method3616();
      }
   }

   private void method3616() {
      if (this.fireworkKeysOverridden) {
         this.method3624();
      }

      if (this.originalHotbarSlot != -1 && mc.player != null) {
         Helper70.method767(this.originalHotbarSlot);
      }

      this.fireworkPhase = Helper364.READY;
      this.fireworkMode = Helper365.NONE;
      this.savedHotbarSlot = -1;
      this.originalHotbarSlot = -1;
      this.fireworkActionTimer = 0L;
      this.pendingFireworkInventorySlot = null;
   }

   private void method3617() {
      Helper35 var1 = Helper70.method760(Items.FIREWORK_ROCKET);
      if (var1.method505()) {
         this.method3618(Helper365.HOTBAR, var1.method504(), null);
      } else {
         Helper35 var2 = Helper70.method761(Items.FIREWORK_ROCKET);
         if (var2.method505()) {
            this.method3618(Helper365.INVENTORY, -1, mc.player.currentScreenHandler.getSlot(var2.method504()));
         } else {
            Helper238.method2186("Нету фейерверков");
         }
      }
   }

   private void method3618(Helper365 var1, int var2, Slot var3) {
      this.fireworkMode = var1;
      this.originalHotbarSlot = mc.player.getInventory().selectedSlot;
      this.savedHotbarSlot = var2;
      this.pendingFireworkInventorySlot = var3;
      this.fireworkWasForwardPressed = mc.options.forwardKey.isPressed();
      this.fireworkWasBackPressed = mc.options.backKey.isPressed();
      this.fireworkWasLeftPressed = mc.options.leftKey.isPressed();
      this.fireworkWasRightPressed = mc.options.rightKey.isPressed();
      this.fireworkWasJumpPressed = mc.options.jumpKey.isPressed();
      this.fireworkKeysOverridden = true;
      this.method3623();
      if (mc.player.isSprinting()) {
         mc.player.setSprinting(false);
      }

      this.fireworkPhase = Helper364.WAIT_BEFORE_USE;
      this.fireworkActionTimer = System.currentTimeMillis();
   }

   private void method3619() {
      if (this.savedHotbarSlot != this.originalHotbarSlot) {
         Helper66.method696(this.savedHotbarSlot);
         mc.player.getInventory().selectedSlot = this.savedHotbarSlot;
      }

      mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
      mc.player.swingHand(Hand.MAIN_HAND);
   }

   private void method3620() {
      if (this.savedHotbarSlot != this.originalHotbarSlot && this.originalHotbarSlot != -1) {
         Helper66.method696(this.originalHotbarSlot);
         mc.player.getInventory().selectedSlot = this.originalHotbarSlot;
      }
   }

   private void method3621() {
      if (this.pendingFireworkInventorySlot != null && this.originalHotbarSlot != -1) {
         Helper66.method692(this.pendingFireworkInventorySlot, this.originalHotbarSlot, false);
         mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
         mc.player.swingHand(Hand.MAIN_HAND);
      }
   }

   private void method3622() {
      if (this.pendingFireworkInventorySlot != null && this.originalHotbarSlot != -1) {
         Helper66.method692(this.pendingFireworkInventorySlot, this.originalHotbarSlot, true);
         Helper66.method696(this.originalHotbarSlot);
         mc.player.getInventory().selectedSlot = this.originalHotbarSlot;
      }
   }

   private void method3623() {
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

   private void method3624() {
      if (this.fireworkKeysOverridden) {
         mc.options.forwardKey.setPressed(this.fireworkWasForwardPressed);
         mc.options.backKey.setPressed(this.fireworkWasBackPressed);
         mc.options.leftKey.setPressed(this.fireworkWasLeftPressed);
         mc.options.rightKey.setPressed(this.fireworkWasRightPressed);
         mc.options.jumpKey.setPressed(this.fireworkWasJumpPressed);
         if (mc.player.input != null) {
            if (this.fireworkWasForwardPressed) {
               mc.player.input.movementForward = 1.0F;
            } else if (this.fireworkWasBackPressed) {
               mc.player.input.movementForward = -1.0F;
            }

            if (this.fireworkWasLeftPressed) {
               mc.player.input.movementSideways = 1.0F;
            } else if (this.fireworkWasRightPressed) {
               mc.player.input.movementSideways = -1.0F;
            }
         }

         this.fireworkKeysOverridden = false;
      }
   }

   private void method3625() {
      this.targetSlot = this.method3630();
      if (this.targetSlot != null) {
         this.wasForwardPressed = InputUtil.isKeyPressed(mc.getWindow().getHandle(), mc.options.forwardKey.getDefaultKey().getCode());
         this.wasBackPressed = InputUtil.isKeyPressed(mc.getWindow().getHandle(), mc.options.backKey.getDefaultKey().getCode());
         this.wasLeftPressed = InputUtil.isKeyPressed(mc.getWindow().getHandle(), mc.options.leftKey.getDefaultKey().getCode());
         this.wasRightPressed = InputUtil.isKeyPressed(mc.getWindow().getHandle(), mc.options.rightKey.getDefaultKey().getCode());
         this.wasJumpPressed = InputUtil.isKeyPressed(mc.getWindow().getHandle(), mc.options.jumpKey.getDefaultKey().getCode());
         this.elytraPhase = Helper366.SLOWING_DOWN;
         this.actionStartTime = System.currentTimeMillis();
         this.playerFullyStopped = false;
         this.keysOverridden = false;
      }
   }

   private void method3626() {
      if (mc.player != null && mc.currentScreen == null) {
         long var1 = System.currentTimeMillis() - this.actionStartTime;
         switch (this.elytraPhase) {
            case SLOWING_DOWN:
               mc.player.input.movementForward = 0.0F;
               mc.player.input.movementSideways = 0.0F;
               if (mc.player.isSprinting()) {
                  mc.player.setSprinting(false);
                  AutoSprint.tickStop = 1;
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
                  this.elytraPhase = Helper366.WAITING_STOP;
               }
               break;
            case WAITING_STOP:
               mc.player.input.movementForward = 0.0F;
               mc.player.input.movementSideways = 0.0F;
               double var9 = Math.abs(mc.player.getVelocity().x);
               double var10 = Math.abs(mc.player.getVelocity().z);
               if (var9 < 0.001 && var10 < 0.001 || var1 > 15L) {
                  this.playerFullyStopped = true;
                  this.elytraPhase = Helper366.SWAP;
               }
               break;
            case SWAP:
               if (this.playerFullyStopped && this.targetSlot != null) {
                  boolean var8 = this.targetSlot.getStack().getItem().equals(Items.ELYTRA);
                  Helper66.method687(this.targetSlot, 6, false, false);
                  if (this.startSetting.method2200() && var8) {
                     Slot var4 = Helper66.method705(Items.FIREWORK_ROCKET);
                     if (var4 != null) {
                        this.script.method1314().method1307(2, () -> {
                           if (mc.player.isOnGround()) {
                              mc.player.jump();
                           }
                        }).method1307(1, () -> {
                           Helper38.method524();
                           Helper66.method694(Items.FIREWORK_ROCKET);
                        });
                     }
                  }

                  this.elytraPhase = Helper366.SPEEDING_UP;
                  this.actionStartTime = System.currentTimeMillis();
                  if (this.keysOverridden) {
                     this.method3627();
                  }
               }
               break;
            case SPEEDING_UP:
               long var3 = System.currentTimeMillis() - this.actionStartTime;
               float var5 = Math.min(1.0F, (float)var3 / 20.0F);
               boolean var6 = InputUtil.isKeyPressed(mc.getWindow().getHandle(), mc.options.forwardKey.getDefaultKey().getCode());
               float var7 = var6 ? 1.0F : 0.0F;
               mc.player.input.movementForward = this.method3628(mc.player.input.movementForward, var7 * var5, 0.4F);
               if (var5 > 0.4F && var6 && !mc.player.isSprinting()) {
                  mc.player.setSprinting(true);
               }

               if (var3 > 25L) {
                  this.elytraPhase = Helper366.FINISHED;
               }
               break;
            case FINISHED:
               this.method3629();
         }
      } else {
         this.method3629();
      }
   }

   private void method3627() {
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

   private float method3628(float var1, float var2, float var3) {
      return var1 + (var2 - var1) * var3;
   }

   private void method3629() {
      if (this.keysOverridden) {
         this.method3627();
      }

      this.elytraPhase = Helper366.READY;
      this.targetSlot = null;
      this.playerFullyStopped = false;
   }

   private Slot method3630() {
      return Objects.requireNonNull(mc.player).getEquippedStack(EquipmentSlot.CHEST).getItem().equals(Items.ELYTRA)
         ? Helper66.method711(
            List.of(
               Items.NETHERITE_CHESTPLATE,
               Items.DIAMOND_CHESTPLATE,
               Items.IRON_CHESTPLATE,
               Items.GOLDEN_CHESTPLATE,
               Items.CHAINMAIL_CHESTPLATE,
               Items.LEATHER_CHESTPLATE
            )
         )
         : Helper66.method705(Items.ELYTRA);
   }
}
