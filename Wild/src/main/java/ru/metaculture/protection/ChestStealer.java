package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Random;
import net.minecraft.client.gui.screen.ingame.Generic3x3ContainerScreen;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.Generic3x3ContainerScreenHandler;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.math.Box;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "ChestStealer",
   O000000000 = "Лутает предметы с сундуков",
   O0000000000 = Category.Player
)
public class ChestStealer extends Module {
   public static BooleanSetting O000000000O = new BooleanSetting("Убирать игроков", false);
   public final ModeSetting O000000000O0 = new ModeSetting("Режим работы", "Обычный", "Обычный", "FunTime Event");
   private static final int O000000000O00 = 9;
   private static final double O000000000O000 = 0.5;
   private static final double O000000000O00O = 1.0;
   private final Random O000000000O0O = new Random();

   public ChestStealer() {
      this.O00000000(new Setting[]{O000000000O, this.O000000000O0});
   }

   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      if (!O0000O00O00O0.O00000000()) {
         if (O000000000O.O0000000000()) {
            this.O00000000(0.5);

            for (Entity var3 : O0000000000.world.getEntities()) {
               if (var3 instanceof PlayerEntity var4 && var4 != O0000000000.player) {
                  double var5 = var3.getX();
                  double var7 = var3.getY();
                  double var9 = var3.getZ();
                  var3.setBoundingBox(new Box(var5 - 1.0E-5, var7, var9 - 1.0E-5, var5 + 1.0E-5, var7 + var3.getHeight(), var9 + 1.0E-5));
               }
            }
         } else {
            this.O00000000(1.0);
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.currentScreen instanceof GenericContainerScreen var2) {
         GenericContainerScreenHandler var6 = (GenericContainerScreenHandler)var2.getScreenHandler();
         if (var6 instanceof GenericContainerScreenHandler) {
            this.O00000000(var2.getTitle().getString(), var6, var6.getRows() * 9);
         }
      } else if (O0000000000.currentScreen instanceof Generic3x3ContainerScreen var3) {
         Generic3x3ContainerScreenHandler var8 = (Generic3x3ContainerScreenHandler)var3.getScreenHandler();
         if (var8 instanceof Generic3x3ContainerScreenHandler) {
            this.O00000000(var3.getTitle().getString(), var8, 9);
         }
      }
   }

   private void O00000000(String string, ScreenHandler screenHandler, int i) {
      ArrayList var4 = new ArrayList();
      String var5 = this.O000000000O0.O0000000000();
      switch (var5) {
         case "Обычный":
            for (int var12 = 0; var12 < i; var12++) {
               if (!screenHandler.getSlot(var12).getStack().isEmpty()) {
                  var4.add(var12);
               }
            }
            break;
         case "FunTime Event":
            for (int var11 = 0; var11 < i; var11++) {
               ItemStack var14 = screenHandler.getSlot(var11).getStack();
               if (!var14.isEmpty()) {
                  Item var15 = var14.getItem();
                  if (var15 == Items.NAUTILUS_SHELL || var15 == Items.GUNPOWDER || var15 == Items.WHITE_DYE || var15 == Items.LIGHT_GRAY_DYE) {
                     var4.add(var11);
                  }
               }
            }
            break;
         case "FunTime AIRDrop":
            if (this.O00000000(string)) {
               boolean var7 = false;

               for (int var8 = 0; var8 < i; var8++) {
                  ItemStack var9 = screenHandler.getSlot(var8).getStack();
                  if (var9.getItem() == Items.BLAZE_POWDER && var9.getName().getString().contains("[★] Предмет еще не остыл")) {
                     var7 = true;
                     break;
                  }
               }

               if (!var7) {
                  for (int var13 = 0; var13 < i; var13++) {
                     if (!screenHandler.getSlot(var13).getStack().isEmpty()) {
                        var4.add(var13);
                     }
                  }
               }
            }
      }

      if (!var4.isEmpty()) {
         int var10 = (Integer)var4.get(this.O000000000O0O.nextInt(var4.size()));
         O0000000000.interactionManager.clickSlot(screenHandler.syncId, var10, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
      }
   }

   private boolean O00000000(String string) {
      String var2 = string.toLowerCase().replaceAll("§.", "").trim();
      return var2.equals("бочка")
         || var2.equals("раздатчик")
         || var2.equals("dispenser")
         || var2.equals("barrel")
         || var2.equals("аир-дроп")
         || var2.equals("аир дроп")
         || var2.equals("air-drop")
         || var2.equals("air drop")
         || var2.equals("airdrop");
   }

   private void O00000000(double d) {
      double var3 = (Double)O0000000000.options.getEntityDistanceScaling().getValue();
      if (Math.abs(var3 - d) > 0.001) {
         O0000000000.options.getEntityDistanceScaling().setValue(d);
      }
   }

   @Override
   public void O000000000() {
      super.O000000000();
      this.O00000000(1.0);
   }
}
