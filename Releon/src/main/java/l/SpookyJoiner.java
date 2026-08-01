package l;

import fat.releon.Releon;
import java.util.Locale;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;

public class SpookyJoiner extends Helper242 {
   private static final int OPEN_COMPASS_DELAY_TICKS = 5;
   private static final int RETRY_DELAY_TICKS = 6;
   private boolean hadCompass;
   private int compassCooldown;

   public SpookyJoiner() {
      super("SpookyJoiner", "SpookyJoiner", Helper269.PLAYER);
   }

   @Override
   public void activate() {
      super.activate();
      if (!this.method2602()) {
         this.method2603();
      } else {
         this.hadCompass = this.method2599();
         this.compassCooldown = 0;
      }
   }

   @Override
   public void deactivate() {
      this.hadCompass = false;
      this.compassCooldown = 0;
      super.deactivate();
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null) {
         boolean var2 = this.method2599();
         if (this.hadCompass && !var2) {
            this.method2603();
         } else {
            this.hadCompass = var2;
            if (this.compassCooldown > 0) {
               this.compassCooldown--;
            } else {
               Screen var3 = mc.currentScreen;
               if (var3 instanceof GenericContainerScreen var4) {
                  GenericContainerScreenHandler var5 = var4.getScreenHandler();
                  boolean var6 = false;

                  for (Slot var8 : var5.slots) {
                     ItemStack var9 = var8.getStack();
                     if (var9.getItem() == Items.NETHERITE_SWORD) {
                        Helper66.method703(var8.id, 0, SlotActionType.PICKUP, false);
                        this.compassCooldown = 6;
                        var6 = true;
                        break;
                     }
                  }

                  if (!var6) {
                     Helper66.method701(false);
                     this.compassCooldown = 6;
                  }
               } else if (var3 != null) {
                  Helper66.method701(false);
                  this.compassCooldown = 6;
               } else {
                  if (var3 == null) {
                     this.method2601();
                     this.compassCooldown = 5;
                  }

                  if (this.method2600()) {
                     this.method2603();
                  }
               }
            }
         }
      }
   }

   private boolean method2599() {
      if (mc.player == null) {
         return false;
      } else {
         for (int var1 = 0; var1 < mc.player.getInventory().size(); var1++) {
            if (mc.player.getInventory().getStack(var1).getItem() == Items.COMPASS) {
               return true;
            }
         }

         return mc.player.getOffHandStack().getItem() == Items.COMPASS;
      }
   }

   private boolean method2600() {
      if (mc.player == null) {
         return false;
      } else {
         for (int var1 = 0; var1 < mc.player.getInventory().size(); var1++) {
            if (mc.player.getInventory().getStack(var1).getItem() == Items.EMERALD) {
               return true;
            }
         }

         return mc.player.getOffHandStack().getItem() == Items.EMERALD;
      }
   }

   private void method2601() {
      if (mc.player != null && mc.interactionManager != null) {
         int var1 = Helper66.method716(var0 -> mc.player.getInventory().getStack(var0).getItem() == Items.COMPASS);
         if (var1 != -1) {
            Helper66.method696(var1);
            mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
         } else if (mc.player.getOffHandStack().getItem() == Items.COMPASS) {
            mc.interactionManager.interactItem(mc.player, Hand.OFF_HAND);
         } else {
            Helper66.method721();
            if (mc.player.getMainHandStack().getItem() == Items.COMPASS) {
               mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
            }
         }
      }
   }

   private boolean method2602() {
      if (Helper128.method1056()) {
         return true;
      } else if (mc.getNetworkHandler() != null && mc.getNetworkHandler().getServerInfo() != null) {
         String var1 = mc.getNetworkHandler().getServerInfo().address;
         return var1 != null && var1.toLowerCase(Locale.ROOT).contains("spookytime");
      } else {
         return false;
      }
   }

   private void method2603() {
      if (this.state) {
         this.state = false;
         this.getAnimation().method5004(0.0).method4993();
         Releon.method71().method15().method1018(this);
      }
   }
}
