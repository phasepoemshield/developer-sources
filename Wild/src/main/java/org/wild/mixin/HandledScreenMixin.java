package org.wild.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.gui.screen.ingame.RecipeBookScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ShulkerBoxScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.wild.mixin.acceser.HandledScreenAccessor;
import ru.metaculture.protection.AhHelper;
import ru.metaculture.protection.Animations;
import ru.metaculture.protection.AutoBuy;
import ru.metaculture.protection.LockSlots;
import ru.metaculture.protection.O00000OO00;
import ru.metaculture.protection.UnHook;
import ru.metaculture.protection.WildClient;

@Mixin({HandledScreen.class})
public abstract class HandledScreenMixin extends Screen {
   @Shadow
   protected int x;
   @Shadow
   protected int y;
   @Shadow
   protected int backgroundWidth;
   @Shadow
   protected int backgroundHeight;
   @Unique
   private static final int WILD_AUTOPARSE_CONTROL_WIDTH = 110;
   @Unique
   private static final int WILD_AUTOPARSE_CONTROL_HEIGHT = 20;
   @Unique
   private static final int WILD_AUTOPARSE_CONTROL_GAP = 4;
   @Unique
   private ButtonWidget wild$autoParseButton;
   @Unique
   private O00000OO00 wild$parseDiscountSlider;
   @Unique
   private static final int WILD_QUICK_BUTTON_HEIGHT = 20;
   @Unique
   private static final int WILD_QUICK_BUTTON_GAP = 4;
   @Unique
   private ButtonWidget wild$dropInventoryButton;
   @Unique
   private ButtonWidget wild$takeAllButton;
   @Unique
   private ButtonWidget wild$depositAllButton;
   @Unique
   private ButtonWidget wild$dropContainerButton;

   protected HandledScreenMixin(Text text) {
      super(text);
   }

   @Unique
   private boolean litka$shouldAnimate(Animations o00000O00O) {
      return o00000O00O != null && o00000O00O.O00000000(this);
   }

   @Unique
   private boolean litka$isRecipeBookScreen() {
      return (Object)this instanceof RecipeBookScreen;
   }

   @Unique
   private void litka$applyScale(DrawContext drawContext, Animations o00000O00O) {
      float var3 = o00000O00O.O000000000(this);
      drawContext.getMatrices().pushMatrix();
      float var4 = drawContext.getScaledWindowWidth() / 2.0F;
      float var5 = drawContext.getScaledWindowHeight() / 2.0F;
      drawContext.getMatrices().translate(var4, var5);
      drawContext.getMatrices().scale(var3, var3);
      drawContext.getMatrices().translate(-var4, -var5);
   }

   @Inject(
      method = {"renderBackground"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/screen/ingame/HandledScreen;drawBackground(Lnet/minecraft/client/gui/DrawContext;FII)V"
      )}
   )
   private void litka$preDrawBackground(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      Animations var6 = WildClient.O00000000.O000000000.O00000000(Animations.class);
      if (this.litka$shouldAnimate(var6)) {
         this.litka$applyScale(drawContext, var6);
      }
   }

   @Inject(
      method = {"renderBackground"},
      at = {@At("TAIL")}
   )
   private void litka$postDrawBackground(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      Animations var6 = WildClient.O00000000.O000000000.O00000000(Animations.class);
      if (this.litka$shouldAnimate(var6)) {
         drawContext.getMatrices().popMatrix();
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
   private void litka$preRenderForeground(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      Animations var6 = WildClient.O00000000.O000000000.O00000000(Animations.class);
      if (!this.litka$isRecipeBookScreen() && this.litka$shouldAnimate(var6)) {
         this.litka$applyScale(drawContext, var6);
      }
   }

   @Inject(
      method = {"renderMain"},
      at = {@At("TAIL")}
   )
   private void litka$postRenderForeground(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      Animations var6 = WildClient.O00000000.O000000000.O00000000(Animations.class);
      if (!this.litka$isRecipeBookScreen() && this.litka$shouldAnimate(var6)) {
         drawContext.getMatrices().popMatrix();
      }
   }

   @Inject(
      method = {"close"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void litka$animateClose(CallbackInfo callbackInfo) {
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         Animations var2 = WildClient.O00000000.O000000000.O00000000(Animations.class);
         if (this.litka$shouldAnimate(var2) && !var2.O000000000O0O()) {
            var2.O0000000000(this);
            callbackInfo.cancel();
         }
      }
   }

   @Inject(
      method = {"removed"},
      at = {@At("HEAD")}
   )
   private void litka$onClose(CallbackInfo callbackInfo) {
      Animations var2 = WildClient.O00000000.O000000000.O00000000(Animations.class);
      if (var2 != null) {
         var2.O000000000O0O0();
      }

      AhHelper.O000000000O000.clear();
   }

   @Inject(
      method = {"drawSlot"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void litka$onDrawSlot(DrawContext drawContext, Slot slot, CallbackInfo callbackInfo) {
      if (AhHelper.O00000000((HandledScreen<?>)(Object)this, slot)) {
         callbackInfo.cancel();
      } else {
         if (AhHelper.O000000000O0.O0000000000() && AhHelper.O000000000O000.contains(slot.id)) {
            int var4 = slot.x;
            int var5 = slot.y;
            drawContext.fill(var4, var5, var4 + 16, var5 + 16, 1610678016);
         }
      }
   }

   @Inject(
      method = {"onMouseClick(Lnet/minecraft/screen/slot/Slot;IILnet/minecraft/screen/slot/SlotActionType;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$blockFilteredAuctionSlotClick(Slot slot, int i, int j, SlotActionType slotActionType, CallbackInfo callbackInfo) {
      if (AhHelper.O00000000((HandledScreen<?>)(Object)this, slot)) {
         callbackInfo.cancel();
      } else {
         if (this.wild$isLockedHotbarThrow(slot, slotActionType)) {
            callbackInfo.cancel();
         }
      }
   }

   @Inject(
      method = {"onMouseClick(Lnet/minecraft/screen/slot/Slot;Lnet/minecraft/screen/slot/SlotActionType;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$blockFilteredAuctionQuickMove(Slot slot, SlotActionType slotActionType, CallbackInfo callbackInfo) {
      if (AhHelper.O00000000((HandledScreen<?>)(Object)this, slot)) {
         callbackInfo.cancel();
      }
   }

   @Inject(
      method = {"getSlotAt"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void wild$excludeFilteredAuctionSlot(double d, double e, CallbackInfoReturnable<Slot> callbackInfoReturnable) {
      Slot var6 = (Slot)callbackInfoReturnable.getReturnValue();
      if (AhHelper.O00000000((HandledScreen<?>)(Object)this, var6)) {
         callbackInfoReturnable.setReturnValue(null);
      }
   }

   @Inject(
      method = {"drawMouseoverTooltip"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$hideFilteredAuctionTooltip(DrawContext drawContext, int i, int j, CallbackInfo callbackInfo) {
      if (this.wild$isFilteredFocusedSlot()) {
         callbackInfo.cancel();
      }
   }

   @Inject(
      method = {"drawSlotHighlightBack"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$hideFilteredAuctionBackHighlight(DrawContext drawContext, CallbackInfo callbackInfo) {
      if (this.wild$isFilteredFocusedSlot()) {
         callbackInfo.cancel();
      }
   }

   @Inject(
      method = {"drawSlotHighlightFront"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$hideFilteredAuctionFrontHighlight(DrawContext drawContext, CallbackInfo callbackInfo) {
      if (this.wild$isFilteredFocusedSlot()) {
         callbackInfo.cancel();
      }
   }

   @Unique
   private boolean wild$isFilteredFocusedSlot() {
      Slot var1 = ((HandledScreenAccessor)(Object)this).litka$getFocusedSlot();
      return AhHelper.O00000000((HandledScreen<?>)(Object)this, var1);
   }

   @Inject(
      method = {"init"},
      at = {@At("TAIL")}
   )
   private void wild$initAutoParseControls(CallbackInfo callbackInfo) {
      if (!UnHook.O000000000O0) {
         AutoBuy var2 = this.wild$getAutoBuy();
         if (var2 != null && this.wild$isAuctionContainer()) {
            int var3 = this.x + this.backgroundWidth + 4;
            int var4 = this.y;
            int var5 = var4 + 20 + 4;
            this.wild$autoParseButton = ButtonWidget.builder(this.wild$autoParseText(var2), buttonWidget -> {
               var2.O000000000O0OO();
               buttonWidget.setMessage(this.wild$autoParseText(var2));
               if (this.wild$parseDiscountSlider != null) {
                  this.wild$parseDiscountSlider.O00000000();
               }
            }).dimensions(var3, var4, 110, 20).build();
            this.addDrawableChild(this.wild$autoParseButton);
            this.wild$parseDiscountSlider = new O00000OO00(var2, var3, var5, 110, 20);
            this.addDrawableChild(this.wild$parseDiscountSlider);
         }
      }
   }

   @Inject(
      method = {"init"},
      at = {@At("TAIL")}
   )
   private void wild$initQuickContainerControls(CallbackInfo callbackInfo) {
      if (!UnHook.O000000000O0) {
         if ((Object)this instanceof InventoryScreen) {
            byte var5 = 124;
            int var6 = this.x + this.backgroundWidth / 2 - var5 / 2;
            int var7 = this.wild$controlsY();
            this.wild$dropInventoryButton = ButtonWidget.builder(Text.literal("Выбросить все"), buttonWidget -> this.wild$dropInventoryItems())
               .dimensions(var6, var7, var5, 20)
               .build();
            this.addDrawableChild(this.wild$dropInventoryButton);
         } else if (this.wild$isQuickContainer() && !this.wild$isAuctionContainer()) {
            byte var2 = 82;
            int var3 = this.x + this.backgroundWidth + 4;
            int var4 = this.y;
            this.wild$takeAllButton = ButtonWidget.builder(Text.literal("Забрать все"), buttonWidget -> this.wild$takeAllFromContainer())
               .dimensions(var3, var4, var2, 20)
               .build();
            this.wild$depositAllButton = ButtonWidget.builder(Text.literal("Сложить"), buttonWidget -> this.wild$depositAllToContainer())
               .dimensions(var3, var4 + 20 + 4, var2, 20)
               .build();
            this.wild$dropContainerButton = ButtonWidget.builder(Text.literal("Выбросить все"), buttonWidget -> this.wild$dropAllFromContainer())
               .dimensions(var3, var4 + 48, var2, 20)
               .build();
            this.addDrawableChild(this.wild$takeAllButton);
            this.addDrawableChild(this.wild$depositAllButton);
            this.addDrawableChild(this.wild$dropContainerButton);
         }
      }
   }

   @Inject(
      method = {"tick"},
      at = {@At("TAIL")}
   )
   private void wild$tickAutoParseControls(CallbackInfo callbackInfo) {
      AutoBuy var2 = this.wild$getAutoBuy();
      boolean var3 = !UnHook.O000000000O0 && var2 != null && this.wild$isAuctionContainer();
      if (this.wild$autoParseButton != null) {
         this.wild$autoParseButton.visible = var3;
         this.wild$autoParseButton.active = var3;
         if (var3) {
            this.wild$autoParseButton.setMessage(this.wild$autoParseText(var2));
         }
      }

      if (this.wild$parseDiscountSlider != null) {
         this.wild$parseDiscountSlider.visible = var3;
         this.wild$parseDiscountSlider.active = var3;
         if (var3) {
            this.wild$parseDiscountSlider.O00000000();
         }
      }

      boolean var4 = !UnHook.O000000000O0;
      if (this.wild$dropInventoryButton != null) {
         this.wild$dropInventoryButton.visible = var4;
         this.wild$dropInventoryButton.active = var4;
      }

      if (this.wild$takeAllButton != null) {
         this.wild$takeAllButton.visible = var4;
         this.wild$takeAllButton.active = var4;
      }

      if (this.wild$depositAllButton != null) {
         this.wild$depositAllButton.visible = var4;
         this.wild$depositAllButton.active = var4;
      }

      if (this.wild$dropContainerButton != null) {
         this.wild$dropContainerButton.visible = var4;
         this.wild$dropContainerButton.active = var4;
      }
   }

   @Unique
   private AutoBuy wild$getAutoBuy() {
      return WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null ? WildClient.O00000000.O000000000.O00000000(AutoBuy.class) : null;
   }

   @Unique
   private boolean wild$isAuctionContainer() {
      if ((Object)this instanceof GenericContainerScreen var1) {
         AutoBuy var2 = this.wild$getAutoBuy();
         return var2 != null && var2.O000000000O00O.O000000000("HolyWorld") ? var2.O00000000(var1) : AhHelper.O00000000(var1);
      } else {
         return false;
      }
   }

   @Unique
   private Text wild$autoParseText(AutoBuy o000000OO00O0O) {
      return Text.literal("AutoParse: " + (o000000OO00O0O.O000000000O0O.O0000000000() ? "ON" : "OFF"));
   }

   @Unique
   private int wild$controlsY() {
      int var1 = this.y - 20 - 4;
      return var1 >= 4 ? var1 : this.y + this.backgroundHeight + 4;
   }

   @Unique
   private int wild$centeredControlsX(int i) {
      int var2 = this.x + this.backgroundWidth / 2 - i / 2;
      int var3 = this.width - i - 4;
      return Math.max(4, Math.min(var2, var3));
   }

   @Unique
   private void wild$dropInventoryItems() {
      ScreenHandler var1 = this.wild$screenHandler();
      if (this.wild$canInteract(var1)) {
         for (Slot var3 : var1.slots) {
            if (this.wild$isPlayerInventorySlot(var3) && var3.hasStack() && var3.canTakeItems(this.client.player)) {
               this.client.interactionManager.clickSlot(var1.syncId, var3.id, 1, SlotActionType.THROW, this.client.player);
            }
         }
      }
   }

   @Unique
   private void wild$takeAllFromContainer() {
      ScreenHandler var1 = this.wild$screenHandler();
      if (this.wild$canInteract(var1) && this.wild$isQuickContainer(var1)) {
         int var2 = this.wild$containerSlotCount(var1);

         for (int var3 = 0; var3 < var2; var3++) {
            Slot var4 = var1.getSlot(var3);
            if (var4.hasStack() && var4.canTakeItems(this.client.player)) {
               this.client.interactionManager.clickSlot(var1.syncId, var3, 0, SlotActionType.QUICK_MOVE, this.client.player);
            }
         }
      }
   }

   @Unique
   private void wild$depositAllToContainer() {
      ScreenHandler var1 = this.wild$screenHandler();
      if (this.wild$canInteract(var1)) {
         for (Slot var3 : var1.slots) {
            if (this.wild$isPlayerInventorySlot(var3) && var3.hasStack()) {
               this.client.interactionManager.clickSlot(var1.syncId, var3.id, 0, SlotActionType.QUICK_MOVE, this.client.player);
            }
         }
      }
   }

   @Unique
   private void wild$dropAllFromContainer() {
      ScreenHandler var1 = this.wild$screenHandler();
      if (this.wild$canInteract(var1) && this.wild$isQuickContainer(var1)) {
         int var2 = this.wild$containerSlotCount(var1);

         for (int var3 = 0; var3 < var2; var3++) {
            Slot var4 = var1.getSlot(var3);
            if (var4.hasStack() && var4.canTakeItems(this.client.player)) {
               this.client.interactionManager.clickSlot(var1.syncId, var3, 1, SlotActionType.THROW, this.client.player);
            }
         }
      }
   }

   @Unique
   private boolean wild$canInteract(ScreenHandler screenHandler) {
      return this.client != null && this.client.player != null && this.client.interactionManager != null && screenHandler != null;
   }

   @Unique
   private boolean wild$isLockedHotbarThrow(Slot slot, SlotActionType slotActionType) {
      if (slotActionType != SlotActionType.THROW || !this.wild$isPlayerInventorySlot(slot)) {
         return false;
      } else if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         LockSlots var3 = WildClient.O00000000.O000000000.O00000000(LockSlots.class);
         return var3 != null && var3.O0000000000000 && var3.O00000000(slot.getIndex());
      } else {
         return false;
      }
   }

   @Unique
   private boolean wild$isPlayerInventorySlot(Slot slot) {
      return slot != null && this.client != null && this.client.player != null && slot.inventory == this.client.player.getInventory();
   }

   @Unique
   private ScreenHandler wild$screenHandler() {
      return ((HandledScreen)(Object)this).getScreenHandler();
   }

   @Unique
   private boolean wild$isQuickContainer() {
      return this.wild$isQuickContainer(this.wild$screenHandler());
   }

   @Unique
   private boolean wild$isQuickContainer(ScreenHandler screenHandler) {
      return screenHandler instanceof GenericContainerScreenHandler || screenHandler instanceof ShulkerBoxScreenHandler;
   }

   @Unique
   private int wild$containerSlotCount(ScreenHandler screenHandler) {
      int var2;
      if (screenHandler instanceof GenericContainerScreenHandler var3) {
         var2 = var3.getRows();
      } else {
         if (!(screenHandler instanceof ShulkerBoxScreenHandler)) {
            return 0;
         }

         var2 = 3;
      }

      int var4 = screenHandler.slots.size();
      return Math.max(0, Math.min(var2 * 9, var4));
   }
}
