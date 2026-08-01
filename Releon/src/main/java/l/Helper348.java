package l;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BundleItem;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.collection.DefaultedList;

public class Helper348 {
   private static final int MAX_SHULKERS = 3;
   private Setting3 autoStorage;
   private Helper333 storageTimer = Helper333.method3308();
   private Helper333 storageActionTimer = Helper333.method3308();
   private Helper333 auctionEnterTimer = Helper333.method3308();
   private Helper333 postStorageTimer = Helper333.method3308();
   private boolean storageActive = false;
   private int storageStep = 0;
   private int storageAttempts = 0;
   private boolean waitingForAuctionClose = false;
   private boolean searchingShulker = false;
   private boolean buyingShulker = false;
   private int currentShulkerIndex = 0;
   private List<Integer> shulkerSlots = new ArrayList<>();
   private boolean reachedMaxShulkers = false;
   private boolean canStartStorage = false;
   private boolean storageCompleted = false;

   public Helper348(Setting3 var1) {
      this.autoStorage = var1;
   }

   public void method3429() {
      this.storageTimer.method3309();
      this.storageActionTimer.method3309();
      this.auctionEnterTimer.method3309();
      this.postStorageTimer.method3309();
   }

   public void method3430() {
      this.storageActive = false;
      this.storageStep = 0;
      this.storageAttempts = 0;
      this.waitingForAuctionClose = false;
      this.searchingShulker = false;
      this.buyingShulker = false;
      this.currentShulkerIndex = 0;
      this.shulkerSlots.clear();
      this.reachedMaxShulkers = false;
      this.canStartStorage = false;
      this.storageCompleted = false;
   }

   public void method3431(MinecraftClient var1, boolean var2) {
      if (this.autoStorage.method2200()) {
         if (!this.reachedMaxShulkers) {
            if (this.canStartStorage) {
               if (!this.storageActive) {
                  int var3 = this.method3453(var1);
                  if (var3 <= 9 && this.method3456(var1)) {
                     this.method3432();
                  }
               } else if (this.storageActionTimer.method3315(300L)) {
                  this.method3433(var1);
               }
            }
         }
      }
   }

   private void method3432() {
      this.storageActive = true;
      this.storageStep = 0;
      this.storageAttempts = 0;
      this.waitingForAuctionClose = false;
      this.searchingShulker = false;
      this.buyingShulker = false;
      this.currentShulkerIndex = 0;
      this.shulkerSlots.clear();
      this.storageCompleted = false;
      this.storageTimer.method3309();
      this.storageActionTimer.method3309();
   }

   private void method3433(MinecraftClient var1) {
      switch (this.storageStep) {
         case 0:
            this.method3434(var1);
            break;
         case 1:
            this.method3435(var1);
            break;
         case 2:
            this.method3437(var1);
            break;
         case 15:
            this.method3436();
            break;
         case 20:
            this.method3438(var1);
            break;
         case 21:
            this.method3440(var1);
            break;
         case 22:
            this.method3441(var1);
            break;
         case 23:
            this.method3442(var1);
            break;
         case 24:
            this.method3443(var1);
            break;
         case 25:
            this.method3444(var1);
            break;
         case 26:
            this.method3445(var1);
            break;
         case 100:
            this.method3446(var1);
            break;
         case 101:
            this.method3447(var1);
            break;
         case 102:
            this.method3448();
            break;
         case 103:
            this.method3449(var1);
            break;
         case 104:
            this.method3450(var1);
            break;
         case 105:
            this.method3451();
            break;
         case 201:
            this.method3439(var1);
      }
   }

   private void method3434(MinecraftClient var1) {
      if (var1.currentScreen instanceof GenericContainerScreen) {
         var1.player.closeHandledScreen();
         this.waitingForAuctionClose = true;
         this.storageAttempts = 0;
         this.storageTimer.method3309();
         this.storageStep = 1;
      } else {
         this.storageStep = 2;
      }

      this.storageActionTimer.method3309();
   }

   private void method3435(MinecraftClient var1) {
      if (!(var1.currentScreen instanceof GenericContainerScreen)) {
         this.waitingForAuctionClose = false;
         this.storageTimer.method3309();
         this.storageStep = 15;
      } else if (this.storageTimer.method3315(5000L)) {
         this.waitingForAuctionClose = false;
         this.storageTimer.method3309();
         this.storageStep = 15;
      } else {
         this.storageAttempts++;
         if (this.storageAttempts > 3) {
            var1.player.closeHandledScreen();
            this.storageTimer.method3309();
         }
      }

      this.storageActionTimer.method3309();
   }

   private void method3436() {
      if (this.storageTimer.method3315(500L)) {
         this.storageStep = 2;
      }

      this.storageActionTimer.method3309();
   }

   private void method3437(MinecraftClient var1) {
      this.currentShulkerIndex = 0;
      this.shulkerSlots.clear();

      for (int var2 = 0; var2 < 36; var2++) {
         if (this.isShulkerBox(var1.player.getInventory().getStack(var2))) {
            this.shulkerSlots.add(var2);
         }
      }

      if (this.shulkerSlots.isEmpty()) {
         this.storageStep = 100;
      } else {
         this.storageStep = 20;
      }

      this.storageActionTimer.method3309();
   }

   private void method3438(MinecraftClient var1) {
      if (var1.currentScreen == null) {
         var1.setScreen(new InventoryScreen(var1.player));
         this.storageTimer.method3309();
         this.storageStep = 21;
      } else if (var1.currentScreen instanceof InventoryScreen) {
         this.storageTimer.method3309();
         this.storageStep = 21;
      } else {
         var1.player.closeHandledScreen();
         this.storageTimer.method3309();
         this.storageStep = 201;
      }

      this.storageActionTimer.method3309();
   }

   private void method3439(MinecraftClient var1) {
      if (this.storageTimer.method3315(500L)) {
         var1.setScreen(new InventoryScreen(var1.player));
         this.storageTimer.method3309();
         this.storageStep = 21;
      }

      this.storageActionTimer.method3309();
   }

   private void method3440(MinecraftClient var1) {
      if (!(var1.currentScreen instanceof InventoryScreen)) {
         if (this.storageTimer.method3315(2000L)) {
            if (var1.currentScreen != null) {
               var1.player.closeHandledScreen();
            }

            this.storageTimer.method3309();
            this.storageStep = 201;
         }

         this.storageActionTimer.method3309();
      } else {
         if (this.storageTimer.method3315(800L)) {
            this.storageTimer.method3309();
            this.storageStep = 22;
         }

         this.storageActionTimer.method3309();
      }
   }

   private void method3441(MinecraftClient var1) {
      if (!(var1.currentScreen instanceof InventoryScreen)) {
         this.storageStep = 20;
         this.storageActionTimer.method3309();
      } else {
         if (this.storageTimer.method3315(300L)) {
            if (this.currentShulkerIndex >= this.shulkerSlots.size()) {
               if (!this.method3456(var1)) {
                  this.method3452(var1);
               } else {
                  this.storageStep = 100;
               }
            } else {
               int var2 = this.shulkerSlots.get(this.currentShulkerIndex);
               int var3 = this.method3457(var2);
               if (var3 == -1) {
                  this.currentShulkerIndex++;
                  this.storageTimer.method3309();
                  return;
               }

               var1.interactionManager.clickSlot(var1.player.currentScreenHandler.syncId, var3, 1, SlotActionType.PICKUP, var1.player);
               this.storageTimer.method3309();
               this.storageStep = 23;
            }
         }

         this.storageActionTimer.method3309();
      }
   }

   private void method3442(MinecraftClient var1) {
      if (var1.currentScreen instanceof ShulkerBoxScreen) {
         this.storageTimer.method3309();
         this.storageStep = 24;
      } else if (this.storageTimer.method3315(2000L)) {
         this.currentShulkerIndex++;
         this.storageTimer.method3309();
         this.storageStep = 22;
      }

      this.storageActionTimer.method3309();
   }

   private void method3443(MinecraftClient var1) {
      if (!(var1.currentScreen instanceof ShulkerBoxScreen)) {
         this.currentShulkerIndex++;
         this.storageTimer.method3309();
         this.storageStep = 22;
         this.storageActionTimer.method3309();
      } else {
         if (this.storageTimer.method3315(500L)) {
            this.storageStep = 25;
         }

         this.storageActionTimer.method3309();
      }
   }

   private void method3444(MinecraftClient var1) {
      if (!(var1.currentScreen instanceof ShulkerBoxScreen var2)) {
         this.currentShulkerIndex++;
         this.storageTimer.method3309();
         this.storageStep = 22;
         this.storageActionTimer.method3309();
      } else {
         DefaultedList var9 = var2.getScreenHandler().slots;
         if (this.method3455(var9)) {
            this.currentShulkerIndex++;
            this.storageTimer.method3309();
            this.storageStep = 26;
            this.storageActionTimer.method3309();
         } else {
            boolean var4 = false;

            for (int var5 = 27; var5 < var9.size(); var5++) {
               Slot var6 = (Slot)var9.get(var5);
               ItemStack var7 = var6.getStack();
               if (!var7.isEmpty() && !this.isShulkerBox(var7) && !this.isBag(var7)) {
                  int var8 = var2.getScreenHandler().syncId;
                  var1.interactionManager.clickSlot(var8, var6.id, 0, SlotActionType.QUICK_MOVE, var1.player);
                  var4 = true;
                  this.storageTimer.method3309();
                  break;
               }
            }

            if (!var4) {
               this.currentShulkerIndex++;
               this.storageTimer.method3309();
               this.storageStep = 26;
            }

            this.storageActionTimer.method3309();
         }
      }
   }

   private void method3445(MinecraftClient var1) {
      if (this.storageTimer.method3315(300L)) {
         if (this.currentShulkerIndex >= this.shulkerSlots.size()) {
            if (!this.method3456(var1)) {
               if (var1.currentScreen instanceof ShulkerBoxScreen) {
                  var1.player.closeHandledScreen();
               }

               this.method3452(var1);
            } else {
               if (var1.currentScreen instanceof ShulkerBoxScreen) {
                  var1.player.closeHandledScreen();
               }

               this.storageTimer.method3309();
               this.storageStep = 100;
            }
         } else {
            int var2 = this.shulkerSlots.get(this.currentShulkerIndex);
            int var3 = this.method3457(var2);
            if (var3 == -1) {
               this.currentShulkerIndex++;
               this.storageTimer.method3309();
               return;
            }

            var1.interactionManager.clickSlot(var1.player.currentScreenHandler.syncId, var3, 1, SlotActionType.PICKUP, var1.player);
            this.storageTimer.method3309();
            this.storageStep = 23;
         }
      }

      this.storageActionTimer.method3309();
   }

   private void method3446(MinecraftClient var1) {
      int var2 = this.method3454(var1);
      if (var2 >= 3) {
         if (var1.currentScreen != null) {
            var1.player.closeHandledScreen();
         }

         this.reachedMaxShulkers = true;
         this.method3452(var1);
      } else {
         if (var1.currentScreen != null) {
            var1.player.closeHandledScreen();
         }

         this.storageTimer.method3309();
         this.storageStep = 101;
      }

      this.storageActionTimer.method3309();
   }

   private void method3447(MinecraftClient var1) {
      if (this.storageTimer.method3315(500L)) {
         if (!this.searchingShulker) {
            Helper357.method3572(var1.player, "/ah search Шалкер пустой");
            this.searchingShulker = true;
            this.storageTimer.method3309();
         }

         if (var1.currentScreen instanceof GenericContainerScreen) {
            this.storageTimer.method3309();
            this.storageStep = 102;
         } else if (this.storageTimer.method3315(6000L)) {
            this.searchingShulker = false;
            this.storageStep = 101;
         }
      }

      this.storageActionTimer.method3309();
   }

   private void method3448() {
      if (this.storageTimer.method3315(3000L)) {
         this.storageStep = 103;
      }

      this.storageActionTimer.method3309();
   }

   private void method3449(MinecraftClient var1) {
      if (var1.currentScreen instanceof GenericContainerScreen var2) {
         DefaultedList var10 = var2.getScreenHandler().slots;
         Slot var4 = null;
         int var5 = 100001;

         for (int var6 = 0; var6 <= 44; var6++) {
            Slot var7 = (Slot)var10.get(var6);
            ItemStack var8 = var7.getStack();
            if (this.isShulkerBox(var8)) {
               int var9 = Helper303.method2998(var8);
               if (var9 > 0 && var9 <= 100000 && var9 < var5) {
                  var4 = var7;
                  var5 = var9;
               }
            }
         }

         if (var4 != null) {
            int var11 = var2.getScreenHandler().syncId;
            var1.interactionManager.clickSlot(var11, var4.id, 0, SlotActionType.QUICK_MOVE, var1.player);
            this.buyingShulker = true;
            this.storageTimer.method3309();
            this.storageStep = 104;
         } else {
            int var12 = var2.getScreenHandler().syncId;
            var1.interactionManager.clickSlot(var12, 49, 0, SlotActionType.QUICK_MOVE, var1.player);
            this.storageTimer.method3309();
         }
      }

      this.storageActionTimer.method3309();
   }

   private void method3450(MinecraftClient var1) {
      if (this.storageTimer.method3315(2500L)) {
         if (var1.currentScreen instanceof GenericContainerScreen) {
            var1.player.closeHandledScreen();
         }

         this.storageTimer.method3309();
         this.storageStep = 105;
      }

      this.storageActionTimer.method3309();
   }

   private void method3451() {
      if (this.storageTimer.method3315(1000L)) {
         this.searchingShulker = false;
         this.buyingShulker = false;
         this.storageStep = 2;
      }

      this.storageActionTimer.method3309();
   }

   private void method3452(MinecraftClient var1) {
      this.storageActive = false;
      this.storageCompleted = true;
      this.postStorageTimer.method3309();
      this.canStartStorage = false;
      this.storageStep = 0;
   }

   private int method3453(MinecraftClient var1) {
      int var2 = 0;

      for (int var3 = 9; var3 < 36; var3++) {
         if (var1.player.getInventory().getStack(var3).isEmpty()) {
            var2++;
         }
      }

      return var2;
   }

   private boolean isShulkerBox(ItemStack var1) {
      if (var1.isEmpty()) {
         return false;
      } else {
         return var1.getItem() instanceof BlockItem var2 ? var2.getBlock() instanceof ShulkerBoxBlock : false;
      }
   }

   private boolean isBag(ItemStack var1) {
      return var1.isEmpty() ? false : var1.getItem() instanceof BundleItem;
   }

   private int method3454(MinecraftClient var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < 36; var3++) {
         ItemStack var4 = var1.player.getInventory().getStack(var3);
         if (this.isShulkerBox(var4)) {
            var2++;
         }
      }

      return var2;
   }

   private boolean method3455(List<Slot> var1) {
      for (int var2 = 0; var2 < 27; var2++) {
         if (var2 < var1.size() && ((Slot)var1.get(var2)).getStack().isEmpty()) {
            return false;
         }
      }

      return true;
   }

   private boolean method3456(MinecraftClient var1) {
      for (int var2 = 9; var2 < 36; var2++) {
         ItemStack var3 = var1.player.getInventory().getStack(var2);
         if (!var3.isEmpty() && !this.isShulkerBox(var3) && !this.isBag(var3)) {
            return true;
         }
      }

      return false;
   }

   private int method3457(int var1) {
      if (var1 >= 0 && var1 < 9) {
         return var1 + 36;
      } else {
         return var1 >= 9 && var1 < 36 ? var1 : -1;
      }
   }

   public boolean method3458() {
      return this.storageActive;
   }

   public void method3459() {
      this.auctionEnterTimer.method3309();
   }

   public void method3460() {
      if (this.autoStorage.method2200() && !this.canStartStorage && this.auctionEnterTimer.method3315(5000L)) {
         this.canStartStorage = true;
      }
   }

   public boolean method3461(MinecraftClient var1, Helper333 var2, Helper333 var3) {
      if (this.storageCompleted && this.postStorageTimer.method3315(1500L)) {
         this.storageCompleted = false;
         this.canStartStorage = false;
         var2.method3309();
         var3.method3309();
         if (!(var1.currentScreen instanceof GenericContainerScreen)) {
            Helper357.method3572(var1.player, "/ah");
         }

         return true;
      } else {
         return false;
      }
   }

   public Helper333 method3462() {
      return this.postStorageTimer;
   }

   public void method3463() {
      this.storageCompleted = false;
   }

   public void method3464() {
      this.canStartStorage = false;
   }

   public boolean method3465() {
      return this.reachedMaxShulkers;
   }

   public void method3466() {
      this.reachedMaxShulkers = false;
      this.canStartStorage = false;
   }
}
