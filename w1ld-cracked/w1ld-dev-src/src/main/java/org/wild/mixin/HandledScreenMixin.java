package org.wild.mixin;

import net.minecraft.class_10260;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1733;
import net.minecraft.class_1735;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_4185;
import net.minecraft.class_437;
import net.minecraft.class_465;
import net.minecraft.class_476;
import net.minecraft.class_490;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.wild.mixin.acceser.HandledScreenAccessor;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.nVUunVNnNN;
import ru.metaculture.protection.nVvVVUun;
import ru.metaculture.protection.nuVVnuUuuNnu;
import ru.metaculture.protection.uVuVNVuuN;
import ru.metaculture.protection.uuVUVN;
import ru.metaculture.protection.vVVuUNnVVUN;

@Mixin({class_465.class})
public abstract class HandledScreenMixin extends class_437 {
   @Shadow
   protected int field_2776;
   @Shadow
   protected int field_2800;
   @Shadow
   protected int field_2792;
   @Shadow
   protected int field_2779;
   @Unique
   private static final int WILD_AUTOPARSE_CONTROL_WIDTH = 110;
   @Unique
   private static final int WILD_AUTOPARSE_CONTROL_HEIGHT = 20;
   @Unique
   private static final int WILD_AUTOPARSE_CONTROL_GAP = 4;
   @Unique
   private class_4185 wild$autoParseButton;
   @Unique
   private nuVVnuUuuNnu wild$parseDiscountSlider;
   @Unique
   private static final int WILD_QUICK_BUTTON_HEIGHT = 20;
   @Unique
   private static final int WILD_QUICK_BUTTON_GAP = 4;
   @Unique
   private class_4185 wild$dropInventoryButton;
   @Unique
   private class_4185 wild$takeAllButton;
   @Unique
   private class_4185 wild$depositAllButton;
   @Unique
   private class_4185 wild$dropContainerButton;

   protected HandledScreenMixin(class_2561 var1) {
      super(var1);
   }

   @Unique
   private boolean litka$shouldAnimate(nVvVVUun var1) {
      return var1 != null && var1.UuUVuuUu(this);
   }

   @Unique
   private boolean litka$isRecipeBookScreen() {
      return this instanceof class_10260;
   }

   @Unique
   private void litka$applyScale(class_332 var1, nVvVVUun var2) {
      float var3 = var2.C00OOC00oO(this);
      var1.method_51448().pushMatrix();
      float var4 = var1.method_51421() / 2.0F;
      float var5 = var1.method_51443() / 2.0F;
      var1.method_51448().translate(var4, var5);
      var1.method_51448().scale(var3, var3);
      var1.method_51448().translate(-var4, -var5);
   }

   @Inject(
      method = {"renderBackground"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/screen/ingame/HandledScreen;drawBackground(Lnet/minecraft/client/gui/DrawContext;FII)V"
      )}
   )
   private void litka$preDrawBackground(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         nVvVVUun var6 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(nVvVVUun.class);
         if (this.litka$shouldAnimate(var6)) {
            this.litka$applyScale(var1, var6);
         }
      }
   }

   @Inject(
      method = {"renderBackground"},
      at = {@At("TAIL")}
   )
   private void litka$postDrawBackground(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         nVvVVUun var6 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(nVvVVUun.class);
         if (this.litka$shouldAnimate(var6)) {
            var1.method_51448().popMatrix();
         }
      }
   }

   @Inject(
      method = {"renderMain"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/screen/Screen;render(Lnet/minecraft/client/gui/DrawContext;IIF)V",
         shift = Shift.AFTER
      )}
   )
   private void litka$preRenderForeground(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         nVvVVUun var6 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(nVvVVUun.class);
         if (!this.litka$isRecipeBookScreen() && this.litka$shouldAnimate(var6)) {
            this.litka$applyScale(var1, var6);
         }
      }
   }

   @Inject(
      method = {"renderMain"},
      at = {@At("TAIL")}
   )
   private void litka$postRenderForeground(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         nVvVVUun var6 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(nVvVVUun.class);
         if (!this.litka$isRecipeBookScreen() && this.litka$shouldAnimate(var6)) {
            var1.method_51448().popMatrix();
         }
      }
   }

   @Inject(
      method = {"close"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void litka$animateClose(CallbackInfo var1) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
            nVvVVUun var2 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(nVvVVUun.class);
            if (this.litka$shouldAnimate(var2) && !var2.nNvNUVU()) {
               var2.uUnuvNvvNU(this);
               var1.cancel();
            }
         }
      }
   }

   @Inject(
      method = {"removed"},
      at = {@At("HEAD")}
   )
   private void litka$onClose(CallbackInfo var1) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         nVvVVUun var2 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(nVvVVUun.class);
         if (var2 != null) {
            var2.UnUNuUU();
         }

         vVVuUNnVVUN.uNnUnnuNUnNu.clear();
      }
   }

   @Inject(
      method = {"drawSlot"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void litka$onDrawSlot(class_332 var1, class_1735 var2, CallbackInfo var3) {
      if (vVVuUNnVVUN.UuUVuuUu((class_465<?>)this, var2)) {
         var3.cancel();
      } else {
         if (vVVuUNnVVUN.uVunuUNVVUUV.uUnuvNvvNU() && vVVuUNnVVUN.uNnUnnuNUnNu.contains(var2.field_7874)) {
            int var4 = var2.field_7873;
            int var5 = var2.field_7872;
            var1.method_25294(var4, var5, var4 + 16, var5 + 16, 1610678016);
         }
      }
   }

   @Inject(
      method = {"onMouseClick(Lnet/minecraft/screen/slot/Slot;IILnet/minecraft/screen/slot/SlotActionType;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$blockFilteredAuctionSlotClick(class_1735 var1, int var2, int var3, class_1713 var4, CallbackInfo var5) {
      if (vVVuUNnVVUN.UuUVuuUu((class_465<?>)this, var1)) {
         var5.cancel();
      } else {
         if (this.wild$isLockedHotbarThrow(var1, var4)) {
            var5.cancel();
         }
      }
   }

   @Inject(
      method = {"onMouseClick(Lnet/minecraft/screen/slot/Slot;Lnet/minecraft/screen/slot/SlotActionType;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$blockFilteredAuctionQuickMove(class_1735 var1, class_1713 var2, CallbackInfo var3) {
      if (vVVuUNnVVUN.UuUVuuUu((class_465<?>)this, var1)) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"getSlotAt"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void wild$excludeFilteredAuctionSlot(double var1, double var3, CallbackInfoReturnable<class_1735> var5) {
      class_1735 var6 = (class_1735)var5.getReturnValue();
      if (vVVuUNnVVUN.UuUVuuUu((class_465<?>)this, var6)) {
         var5.setReturnValue(null);
      }
   }

   @Inject(
      method = {"drawMouseoverTooltip"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$hideFilteredAuctionTooltip(class_332 var1, int var2, int var3, CallbackInfo var4) {
      if (this.wild$isFilteredFocusedSlot()) {
         var4.cancel();
      }
   }

   @Inject(
      method = {"drawSlotHighlightBack"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$hideFilteredAuctionBackHighlight(class_332 var1, CallbackInfo var2) {
      if (this.wild$isFilteredFocusedSlot()) {
         var2.cancel();
      }
   }

   @Inject(
      method = {"drawSlotHighlightFront"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$hideFilteredAuctionFrontHighlight(class_332 var1, CallbackInfo var2) {
      if (this.wild$isFilteredFocusedSlot()) {
         var2.cancel();
      }
   }

   @Unique
   private boolean wild$isFilteredFocusedSlot() {
      class_1735 var1 = ((HandledScreenAccessor)this).litka$getFocusedSlot();
      return vVVuUNnVVUN.UuUVuuUu((class_465<?>)this, var1);
   }

   @Inject(
      method = {"init"},
      at = {@At("TAIL")}
   )
   private void wild$initAutoParseControls(CallbackInfo var1) {
      if (!uVuVNVuuN.uVunuUNVVUUV) {
         uuVUVN var2 = this.wild$getAutoBuy();
         if (var2 != null && this.wild$isAuctionContainer()) {
            int var3 = this.field_2776 + this.field_2792 + 4;
            int var4 = this.field_2800;
            int var5 = var4 + 20 + 4;
            this.wild$autoParseButton = class_4185.method_46430(this.wild$autoParseText(var2), var2x -> {
               var2.uUVuVvuNUvnu();
               var2x.method_25355(this.wild$autoParseText(var2));
               if (this.wild$parseDiscountSlider != null) {
                  this.wild$parseDiscountSlider.UuUVuuUu();
               }
            }).method_46434(var3, var4, 110, 20).method_46431();
            this.method_37063(this.wild$autoParseButton);
            this.wild$parseDiscountSlider = new nuVVnuUuuNnu(var2, var3, var5, 110, 20);
            this.method_37063(this.wild$parseDiscountSlider);
         }
      }
   }

   @Inject(
      method = {"init"},
      at = {@At("TAIL")}
   )
   private void wild$initQuickContainerControls(CallbackInfo var1) {
      if (!uVuVNVuuN.uVunuUNVVUUV) {
         if (this instanceof class_490) {
            byte var5 = 124;
            int var6 = this.field_2776 + this.field_2792 / 2 - var5 / 2;
            int var7 = this.wild$controlsY();
            this.wild$dropInventoryButton = class_4185.method_46430(class_2561.method_43470("Выбросить все"), var1x -> this.wild$dropInventoryItems())
               .method_46434(var6, var7, var5, 20)
               .method_46431();
            this.method_37063(this.wild$dropInventoryButton);
         } else if (this.wild$isQuickContainer() && !this.wild$isAuctionContainer()) {
            byte var2 = 82;
            int var3 = this.field_2776 + this.field_2792 + 4;
            int var4 = this.field_2800;
            this.wild$takeAllButton = class_4185.method_46430(class_2561.method_43470("Забрать все"), var1x -> this.wild$takeAllFromContainer())
               .method_46434(var3, var4, var2, 20)
               .method_46431();
            this.wild$depositAllButton = class_4185.method_46430(class_2561.method_43470("Сложить"), var1x -> this.wild$depositAllToContainer())
               .method_46434(var3, var4 + 20 + 4, var2, 20)
               .method_46431();
            this.wild$dropContainerButton = class_4185.method_46430(class_2561.method_43470("Выбросить все"), var1x -> this.wild$dropAllFromContainer())
               .method_46434(var3, var4 + 48, var2, 20)
               .method_46431();
            this.method_37063(this.wild$takeAllButton);
            this.method_37063(this.wild$depositAllButton);
            this.method_37063(this.wild$dropContainerButton);
         }
      }
   }

   @Inject(
      method = {"tick"},
      at = {@At("TAIL")}
   )
   private void wild$tickAutoParseControls(CallbackInfo var1) {
      uuVUVN var2 = this.wild$getAutoBuy();
      boolean var3 = !uVuVNVuuN.uVunuUNVVUUV && var2 != null && this.wild$isAuctionContainer();
      if (this.wild$autoParseButton != null) {
         this.wild$autoParseButton.field_22764 = var3;
         this.wild$autoParseButton.field_22763 = var3;
         if (var3) {
            this.wild$autoParseButton.method_25355(this.wild$autoParseText(var2));
         }
      }

      if (this.wild$parseDiscountSlider != null) {
         this.wild$parseDiscountSlider.field_22764 = var3;
         this.wild$parseDiscountSlider.field_22763 = var3;
         if (var3) {
            this.wild$parseDiscountSlider.UuUVuuUu();
         }
      }

      boolean var4 = !uVuVNVuuN.uVunuUNVVUUV;
      if (this.wild$dropInventoryButton != null) {
         this.wild$dropInventoryButton.field_22764 = var4;
         this.wild$dropInventoryButton.field_22763 = var4;
      }

      if (this.wild$takeAllButton != null) {
         this.wild$takeAllButton.field_22764 = var4;
         this.wild$takeAllButton.field_22763 = var4;
      }

      if (this.wild$depositAllButton != null) {
         this.wild$depositAllButton.field_22764 = var4;
         this.wild$depositAllButton.field_22763 = var4;
      }

      if (this.wild$dropContainerButton != null) {
         this.wild$dropContainerButton.field_22764 = var4;
         this.wild$dropContainerButton.field_22763 = var4;
      }
   }

   @Unique
   private uuVUVN wild$getAutoBuy() {
      if (!NVnVnNnN.vNUvnnVnUvu()) {
         return null;
      } else {
         return NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null ? NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(uuVUVN.class) : null;
      }
   }

   @Unique
   private boolean wild$isAuctionContainer() {
      if (this instanceof class_476 var1) {
         uuVUVN var2 = this.wild$getAutoBuy();
         return var2 != null && var2.NnUuNNU.C00OOC00oO("HolyWorld") ? var2.UuUVuuUu(var1) : vVVuUNnVVUN.UuUVuuUu(var1);
      } else {
         return false;
      }
   }

   @Unique
   private class_2561 wild$autoParseText(uuVUVN var1) {
      return class_2561.method_43470("AutoParse: " + (var1.nNvNUVU.uUnuvNvvNU() ? "ON" : "OFF"));
   }

   @Unique
   private int wild$controlsY() {
      int var1 = this.field_2800 - 20 - 4;
      return var1 >= 4 ? var1 : this.field_2800 + this.field_2779 + 4;
   }

   @Unique
   private int wild$centeredControlsX(int var1) {
      int var2 = this.field_2776 + this.field_2792 / 2 - var1 / 2;
      int var3 = this.field_22789 - var1 - 4;
      return Math.max(4, Math.min(var2, var3));
   }

   @Unique
   private void wild$dropInventoryItems() {
      class_1703 var1 = this.wild$screenHandler();
      if (this.wild$canInteract(var1)) {
         for (class_1735 var3 : var1.field_7761) {
            if (this.wild$isPlayerInventorySlot(var3) && var3.method_7681() && var3.method_7674(this.field_22787.field_1724)) {
               this.field_22787.field_1761.method_2906(var1.field_7763, var3.field_7874, 1, class_1713.field_7795, this.field_22787.field_1724);
            }
         }
      }
   }

   @Unique
   private void wild$takeAllFromContainer() {
      class_1703 var1 = this.wild$screenHandler();
      if (this.wild$canInteract(var1) && this.wild$isQuickContainer(var1)) {
         int var2 = this.wild$containerSlotCount(var1);

         for (int var3 = 0; var3 < var2; var3++) {
            class_1735 var4 = var1.method_7611(var3);
            if (var4.method_7681() && var4.method_7674(this.field_22787.field_1724)) {
               this.field_22787.field_1761.method_2906(var1.field_7763, var3, 0, class_1713.field_7794, this.field_22787.field_1724);
            }
         }
      }
   }

   @Unique
   private void wild$depositAllToContainer() {
      class_1703 var1 = this.wild$screenHandler();
      if (this.wild$canInteract(var1)) {
         for (class_1735 var3 : var1.field_7761) {
            if (this.wild$isPlayerInventorySlot(var3) && var3.method_7681()) {
               this.field_22787.field_1761.method_2906(var1.field_7763, var3.field_7874, 0, class_1713.field_7794, this.field_22787.field_1724);
            }
         }
      }
   }

   @Unique
   private void wild$dropAllFromContainer() {
      class_1703 var1 = this.wild$screenHandler();
      if (this.wild$canInteract(var1) && this.wild$isQuickContainer(var1)) {
         int var2 = this.wild$containerSlotCount(var1);

         for (int var3 = 0; var3 < var2; var3++) {
            class_1735 var4 = var1.method_7611(var3);
            if (var4.method_7681() && var4.method_7674(this.field_22787.field_1724)) {
               this.field_22787.field_1761.method_2906(var1.field_7763, var3, 1, class_1713.field_7795, this.field_22787.field_1724);
            }
         }
      }
   }

   @Unique
   private boolean wild$canInteract(class_1703 var1) {
      return this.field_22787 != null && this.field_22787.field_1724 != null && this.field_22787.field_1761 != null && var1 != null;
   }

   @Unique
   private boolean wild$isLockedHotbarThrow(class_1735 var1, class_1713 var2) {
      if (!NVnVnNnN.vNUvnnVnUvu()) {
         return false;
      } else if (var2 != class_1713.field_7795 || !this.wild$isPlayerInventorySlot(var1)) {
         return false;
      } else if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
         nVUunVNnNN var3 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(nVUunVNnNN.class);
         return var3 != null && var3.nuUnNvnuUu && var3.UuUVuuUu(var1.method_34266());
      } else {
         return false;
      }
   }

   @Unique
   private boolean wild$isPlayerInventorySlot(class_1735 var1) {
      return var1 != null && this.field_22787 != null && this.field_22787.field_1724 != null && var1.field_7871 == this.field_22787.field_1724.method_31548();
   }

   @Unique
   private class_1703 wild$screenHandler() {
      return ((class_465)this).method_17577();
   }

   @Unique
   private boolean wild$isQuickContainer() {
      return this.wild$isQuickContainer(this.wild$screenHandler());
   }

   @Unique
   private boolean wild$isQuickContainer(class_1703 var1) {
      return var1 instanceof class_1707 || var1 instanceof class_1733;
   }

   @Unique
   private int wild$containerSlotCount(class_1703 var1) {
      int var2;
      if (var1 instanceof class_1707 var3) {
         var2 = var3.method_17388();
      } else {
         if (!(var1 instanceof class_1733)) {
            return 0;
         }

         var2 = 3;
      }

      int var4 = var1.field_7761.size();
      return Math.max(0, Math.min(var2 * 9, var4));
   }
}
