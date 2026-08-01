package l;

import antidaunleak.api.annotation.Native;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.InputUtil;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.math.Box;

public class AutoTotem extends Helper242 {
   private static final MinecraftClient MC = MinecraftClient.getInstance();
   private static final long EQUIP_ATTEMPT_COOLDOWN_MS = 250L;
   private final Setting2 healthThreshold = new Setting2("Порог здоровья", "Минимальное здоровье для экипировки тотема")
      .method2086(4.5F)
      .method2078(1.0F, 20.0F);
   private final Setting2 elytraHealth = new Setting2("Здоровье на элитре", "Минимальное здоровье при полете").method2086(8.5F).method2078(1.0F, 20.0F);
   private final Setting2 crystalDistance = new Setting2("Дистанция кристала ", "").method2086(4.0F).method2078(1.0F, 6.0F);
   private final Setting2 crystalHeight = new Setting2("Высота кристала", "").method2086(2.5F).method2078(0.5F, 8.0F);
   private final Setting3 checkFallDistance = new Setting3("Учитывать падение", "Экипировать тотем при большом падении").method2201(true);
   private final boolean saveTaliks = true;
   private final boolean returnItem = true;
   private int savedSlot = -1;
   private int totemSlot = -1;
   private long actionStartTime = 0L;
   private boolean keysOverridden = false;
   private boolean wasForwardPressed;
   private boolean wasBackPressed;
   private boolean wasLeftPressed;
   private boolean wasRightPressed;
   private boolean wasJumpPressed;
   private boolean playerFullyStopped = false;
   private Helper391 phase = Helper391.READY;
   private ItemStack previousOffhandStack = ItemStack.EMPTY;
   private int previousOffhandSourceSlot = -1;
   private boolean needsReturn = false;
   private long lastEquipAttemptMs = 0L;

   public AutoTotem() {
      super("AutoTotem", "Auto Totem", Helper269.COMBAT);
      this.setup(new Helper264[]{this.healthThreshold, this.elytraHealth, this.crystalDistance, this.crystalHeight, this.checkFallDistance});
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (MC.player == null || MC.world == null) {
         this.method3960();
      } else if (this.phase != Helper391.READY) {
         this.method3944();
      } else {
         boolean var2 = this.method3940();
         if (var2) {
            long var3 = System.currentTimeMillis();
            if (var3 - this.lastEquipAttemptMs >= 250L) {
               this.method3938(true);
            }
         }

         if (this.phase == Helper391.READY && !var2 && this.needsReturn && !this.previousOffhandStack.isEmpty()) {
            if (MC.player.getOffHandStack().getItem() == Items.TOTEM_OF_UNDYING) {
               this.method3942();
            } else {
               this.method3959();
            }
         }
      }
   }

   @Native(
      type = Native.Type.VMProtectBeginUltra
   )
   private void method3938(boolean var1) {
      if (this.phase == Helper391.READY) {
         if (!this.method3953(var1)) {
            if (MC.currentScreen == null) {
               this.lastEquipAttemptMs = System.currentTimeMillis();
               this.savedSlot = MC.player.getInventory().selectedSlot;
               Helper35 var2 = var1 ? this.method3939() : this.method3947();
               if (var2.method505()) {
                  this.totemSlot = var2.method504();
                  this.previousOffhandStack = MC.player.getOffHandStack().copy();
                  this.previousOffhandSourceSlot = var2.method504();
                  this.needsReturn = !this.previousOffhandStack.isEmpty();
                  this.method3941();
               }
            }
         }
      }
   }

   private Helper35 method3939() {
      Helper35 var1 = Helper70.method762(this::method3948);
      if (var1.method505()) {
         return var1;
      } else {
         Helper35 var2 = Helper70.method756(this::method3948);
         return var2.method505() ? var2 : this.method3947();
      }
   }

   private boolean method3940() {
      if (MC.player == null) {
         return false;
      } else {
         float var1 = MC.player.getHealth();
         return MC.player.isGliding() ? var1 <= this.elytraHealth.method2082() : var1 <= this.healthThreshold.method2082();
      }
   }

   @Native(
      type = Native.Type.VMProtectBeginMutation
   )
   private void method3941() {
      this.method3943();
      this.phase = Helper391.SLOWING_DOWN;
      this.actionStartTime = System.currentTimeMillis();
      this.playerFullyStopped = false;
      this.keysOverridden = false;
   }

   private void method3942() {
      this.method3943();
      this.phase = Helper391.RETURN_SLOWING_DOWN;
      this.actionStartTime = System.currentTimeMillis();
      this.playerFullyStopped = false;
      this.keysOverridden = false;
   }

   private void method3943() {
      long var1 = MC.getWindow().getHandle();
      this.wasForwardPressed = InputUtil.isKeyPressed(var1, MC.options.forwardKey.getDefaultKey().getCode());
      this.wasBackPressed = InputUtil.isKeyPressed(var1, MC.options.backKey.getDefaultKey().getCode());
      this.wasLeftPressed = InputUtil.isKeyPressed(var1, MC.options.leftKey.getDefaultKey().getCode());
      this.wasRightPressed = InputUtil.isKeyPressed(var1, MC.options.rightKey.getDefaultKey().getCode());
      this.wasJumpPressed = InputUtil.isKeyPressed(var1, MC.options.jumpKey.getDefaultKey().getCode());
   }

   private void method3944() {
      if (MC.player != null && MC.currentScreen == null) {
         long var1 = System.currentTimeMillis() - this.actionStartTime;
         switch (this.phase) {
            case READY:
            default:
               break;
            case SLOWING_DOWN:
               this.method3945();
               if (var1 > 1L) {
                  this.phase = Helper391.SWAP_TOTEM;
                  this.actionStartTime = System.currentTimeMillis();
               }
               break;
            case SWAP_TOTEM:
               if (var1 <= 25L) {
                  return;
               }

               if (this.totemSlot < 0) {
                  this.method3960();
                  return;
               }

               int var8 = this.method3958(this.totemSlot);
               if (MC.interactionManager != null && MC.player.playerScreenHandler != null) {
                  MC.interactionManager.clickSlot(MC.player.playerScreenHandler.syncId, var8, 40, SlotActionType.SWAP, MC.player);
               }

               this.phase = Helper391.AWAIT_SWITCH;
               this.actionStartTime = System.currentTimeMillis();
               break;
            case AWAIT_SWITCH:
               if (this.method3952() || var1 > 50L) {
                  this.phase = Helper391.RESTORE_SLOT;
                  this.actionStartTime = System.currentTimeMillis();
               }
               break;
            case RESTORE_SLOT:
               if (var1 <= 25L) {
                  return;
               }

               Helper70.method767(this.savedSlot);
               if (this.keysOverridden) {
                  this.method3955();
               }

               this.actionStartTime = System.currentTimeMillis();
               this.phase = Helper391.SPEEDING_UP;
               break;
            case RETURN_SLOWING_DOWN:
               this.method3945();
               if (var1 > 1L) {
                  this.phase = Helper391.RETURN_ITEM;
                  this.actionStartTime = System.currentTimeMillis();
               }
               break;
            case RETURN_ITEM:
               if (var1 <= 25L) {
                  return;
               }

               if (this.method3956()) {
                  this.method3959();
                  if (this.keysOverridden) {
                     this.method3955();
                  }

                  this.actionStartTime = System.currentTimeMillis();
                  this.phase = Helper391.SPEEDING_UP;
               } else {
                  this.method3960();
               }
               break;
            case SPEEDING_UP:
               long var3 = System.currentTimeMillis() - this.actionStartTime;
               float var5 = Math.min(1.0F, (float)var3 / 20.0F);
               if (MC.player.input != null) {
                  boolean var6 = InputUtil.isKeyPressed(MC.getWindow().getHandle(), MC.options.forwardKey.getDefaultKey().getCode());
                  float var7 = var6 ? 1.0F : 0.0F;
                  MC.player.input.movementForward = this.method3946(MC.player.input.movementForward, var7 * var5, 0.4F);
                  if (var5 > 0.4F && var6 && !MC.player.isSprinting()) {
                     MC.player.setSprinting(true);
                  }
               }

               if (var3 > 25L) {
                  this.phase = Helper391.FINISH;
               }
               break;
            case FINISH:
               this.method3960();
         }
      } else {
         this.method3960();
      }
   }

   private void method3945() {
      MC.player.input.movementForward = 0.0F;
      MC.player.input.movementSideways = 0.0F;
      if (MC.player.isSprinting()) {
         MC.player.setSprinting(false);
      }

      if (!this.keysOverridden) {
         MC.options.forwardKey.setPressed(false);
         MC.options.backKey.setPressed(false);
         MC.options.leftKey.setPressed(false);
         MC.options.rightKey.setPressed(false);
         MC.options.jumpKey.setPressed(false);
         this.keysOverridden = true;
      }
   }

   private float method3946(float var1, float var2, float var3) {
      return var1 + (var2 - var1) * var3;
   }

   private Helper35 method3947() {
      Helper35 var1 = Helper70.method762(this::method3948);
      if (var1.method505()) {
         return var1;
      } else {
         Helper35 var2 = Helper70.method756(this::method3948);
         if (var2.method505()) {
            return var2;
         } else {
            Helper35 var3 = Helper70.method762(this::method3949);
            if (var3.method505()) {
               return var3;
            } else {
               Helper35 var4 = Helper70.method756(this::method3949);
               if (var4.method505()) {
                  return var4;
               } else {
                  Helper35 var5 = Helper70.method760(Items.TOTEM_OF_UNDYING);
                  return var5.method505() ? var5 : Helper70.method761(Items.TOTEM_OF_UNDYING);
               }
            }
         }
      }
   }

   private boolean method3948(ItemStack var1) {
      return this.method3949(var1) && !var1.hasEnchantments();
   }

   private boolean method3949(ItemStack var1) {
      return var1.getItem() == Items.TOTEM_OF_UNDYING && !this.method3950(var1);
   }

   private boolean method3950(ItemStack var1) {
      if (var1.getItem() != Items.TOTEM_OF_UNDYING) {
         return false;
      } else {
         NbtComponent var2 = var1.get(DataComponentTypes.CUSTOM_DATA);
         if (var2 == null) {
            return false;
         } else {
            NbtCompound var3 = var2.copyNbt();
            String var4 = var3.getString("don-item").toLowerCase(Locale.ROOT);
            return var4.contains("sphere");
         }
      }
   }

   private double method3951() {
      double var1 = Double.MAX_VALUE;
      if (MC.player != null && MC.world != null) {
         double var3 = this.crystalDistance.method2082();
         double var5 = this.crystalHeight.method2082();
         Box var7 = MC.player.getBoundingBox().expand(var3, var5, var3);
         List<EndCrystalEntity> var8 = MC.world.getEntitiesByClass(EndCrystalEntity.class, var7, var0 -> true);
         double var9 = MC.player.getY();

         for (EndCrystalEntity var12 : var8) {
            double var13 = Math.abs(var12.getY() - var9);
            if (!(var13 > var5)) {
               double var15 = var12.getX() - MC.player.getX();
               double var17 = var12.getZ() - MC.player.getZ();
               double var19 = Math.hypot(var15, var17);
               if (var19 < var1) {
                  var1 = var19;
               }
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   private boolean method3952() {
      return MC.player.getOffHandStack().getItem() == Items.TOTEM_OF_UNDYING;
   }

   private boolean method3953(boolean var1) {
      if (!this.method3952()) {
         return false;
      } else if (!var1) {
         return true;
      } else {
         ItemStack var2 = MC.player.getOffHandStack();
         return this.method3948(var2) ? true : !this.method3954();
      }
   }

   private boolean method3954() {
      return Helper70.method756(this::method3948).method505();
   }

   private void method3955() {
      long var1 = MC.getWindow().getHandle();
      boolean var3 = InputUtil.isKeyPressed(var1, MC.options.forwardKey.getDefaultKey().getCode());
      boolean var4 = InputUtil.isKeyPressed(var1, MC.options.backKey.getDefaultKey().getCode());
      boolean var5 = InputUtil.isKeyPressed(var1, MC.options.leftKey.getDefaultKey().getCode());
      boolean var6 = InputUtil.isKeyPressed(var1, MC.options.rightKey.getDefaultKey().getCode());
      boolean var7 = InputUtil.isKeyPressed(var1, MC.options.jumpKey.getDefaultKey().getCode());
      MC.options.forwardKey.setPressed(this.wasForwardPressed && var3);
      MC.options.backKey.setPressed(this.wasBackPressed && var4);
      MC.options.leftKey.setPressed(this.wasLeftPressed && var5);
      MC.options.rightKey.setPressed(this.wasRightPressed && var6);
      MC.options.jumpKey.setPressed(this.wasJumpPressed && var7);
      this.keysOverridden = false;
   }

   private boolean method3956() {
      if (this.previousOffhandStack == null || this.previousOffhandStack.isEmpty()) {
         return false;
      } else if (MC.player != null && MC.player.playerScreenHandler != null && MC.interactionManager != null) {
         if (MC.player.getOffHandStack().getItem() != Items.TOTEM_OF_UNDYING) {
            return false;
         } else {
            int var1 = this.method3958(this.previousOffhandSourceSlot);
            if (var1 != -1 && this.method3957(MC.player.playerScreenHandler.getSlot(var1).getStack())) {
               MC.interactionManager.clickSlot(MC.player.playerScreenHandler.syncId, var1, 40, SlotActionType.SWAP, MC.player);
               return true;
            } else {
               Helper35 var2 = Helper70.method756(this::method3957);
               if (!var2.method505()) {
                  var2 = Helper70.method756(var1x -> !var1x.isEmpty() && var1x.getItem() == this.previousOffhandStack.getItem());
               }

               if (!var2.method505()) {
                  return false;
               } else {
                  int var3 = this.method3958(var2.method504());
                  if (var3 == -1) {
                     return false;
                  } else {
                     MC.interactionManager.clickSlot(MC.player.playerScreenHandler.syncId, var3, 40, SlotActionType.SWAP, MC.player);
                     return true;
                  }
               }
            }
         }
      } else {
         return false;
      }
   }

   private boolean method3957(ItemStack var1) {
      return var1 != null && !var1.isEmpty() && this.previousOffhandStack != null && !this.previousOffhandStack.isEmpty()
         ? ItemStack.areItemsAndComponentsEqual(var1, this.previousOffhandStack)
         : false;
   }

   private int method3958(int var1) {
      if (var1 < 0) {
         return -1;
      } else {
         return var1 <= 8 ? var1 + 36 : var1;
      }
   }

   private void method3959() {
      this.previousOffhandStack = ItemStack.EMPTY;
      this.previousOffhandSourceSlot = -1;
      this.needsReturn = false;
   }

   private void method3960() {
      if (this.keysOverridden) {
         this.method3955();
      }

      this.totemSlot = -1;
      this.savedSlot = -1;
      this.actionStartTime = 0L;
      this.phase = Helper391.READY;
      this.playerFullyStopped = false;
   }

   @Override
   public void deactivate() {
      this.method3960();
      this.method3959();
      super.deactivate();
   }
}
