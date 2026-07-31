package zenith.zov.utility.mixin.screen;

import zenith.hud.*;

import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.Containerhelper;
import zenith.Betterminecraft;
import zenith.GetSlotIdHandler;
import zenith.PatternHolder_2;
import zenith.EventBus;
import zenith.Autoinventory;
import zenith.Event;
import zenith.EventImpl_28;
import zenith.AhHelper;
import zenith.ZenithInternal135;

@Mixin({HandledScreen.class})
public abstract class MixinHandledScreen extends Screen implements ZenithInternal135 {
   @Unique
   @Mutable
   private boolean isAuc;
   @Unique
   @Mutable
   private Slot lowSumSlotId = null;
   @Unique
   @Mutable
   private Slot lowAllSumSlotId = null;
   @Unique
   private long zenith$openedAt = System.currentTimeMillis();
   @Unique
   private long zenith$closedAt;
   @Unique
   private float zenith$closeStartScale = 1.0F;
   @Unique
   private boolean zenith$closingAnimation;
   @Unique
   private boolean zenith$forceClose;
   @Unique
   private boolean zenith$scaleApplied;
   @Shadow
   @Final
   protected ScreenHandler handler;
   @Shadow
   protected int y;
   @Shadow
   protected int x;
   @Shadow
   protected int backgroundWidth;
   @Shadow
   protected int backgroundHeight;
   @Shadow
   @Nullable
   protected Slot focusedSlot;

   protected MixinHandledScreen(Text Text) {
      super(Text);
   }

   @Shadow
   public abstract ScreenHandler getScreenHandler();

   @Inject(
      method = {"init"},
      at = {@At("HEAD")}
   )
   private void zenith$initScaleAnimation(CallbackInfo callbackinfo) {
      this.zenith$openedAt = System.currentTimeMillis();
      this.zenith$closedAt = 0L;
      this.zenith$closeStartScale = 1.0F;
      this.zenith$closingAnimation = false;
      this.zenith$forceClose = false;
      this.zenith$scaleApplied = false;
   }

   @Inject(
      method = {"renderBackground"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/screen/ingame/HandledScreen;drawBackground(Lnet/minecraft/client/gui/DrawContext;FII)V"
      )}
   )
   private void zenith$applyBetterMinecraftScale(DrawContext DrawContext, int i, int j, float f1, CallbackInfo callbackinfo) {
      this.zenith$scaleApplied = false;
      if (this.zenith$shouldAnimateBetterMinecraft()) {
         float f = this.zenith$getScale();
         if (!(Math.abs(f - 1.0F) < 0.001F)) {
            DrawContext.getMatrices().push();
            DrawContext.getMatrices().translate((float)this.width / 2.0F, (float)this.height / 2.0F, 0.0F);
            DrawContext.getMatrices().scale(f, f, 1.0F);
            DrawContext.getMatrices().translate((float)(-this.width) / 2.0F, (float)(-this.height) / 2.0F, 0.0F);
            this.zenith$scaleApplied = true;
         }
      }
   }

   @Inject(
      method = {"close"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void zenith$closeWithBetterMinecraftAnimation(CallbackInfo callbackinfo) {
      if (!this.zenith$forceClose && this.zenith$shouldAnimateBetterMinecraft()) {
         this.zenith$startClosingAnimation();
         callbackinfo.cancel();
      }
   }

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   private void tickScreen(CallbackInfo callbackinfo) {
      if (!this.isAuc && AhHelper.Ill1lII1l1ll1I1lIl1lIl.Spider()) {
         this.isAuc = PatternHolder_2.EventImpl_13(this.handler);
      }

      if (this.isAuc && AhHelper.Ill1lII1l1ll1I1lIl1lIl.Spider()) {
         int i = Integer.MAX_VALUE;
         int j = Integer.MAX_VALUE;

         for (int k = 0; k < 44; k++) {
            Slot Slot = (Slot)this.getScreenHandler().slots.get(k);
            if (!Slot.getStack().isEmpty()) {
               int l = PatternHolder_2.longHolder_6(Slot.getStack());
               if (l < i) {
                  this.lowSumSlotId = Slot;
                  i = l;
               }

               if (l / Slot.getStack().getCount() < j) {
                  j = l / Slot.getStack().getCount();
                  this.lowAllSumSlotId = Slot;
               }
            }
         }
      }
   }

   @Inject(
      method = {"onMouseClick(Lnet/minecraft/screen/slot/Slot;IILnet/minecraft/screen/slot/SlotActionType;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/screen/ingame/HandledScreen;onMouseClick(Lnet/minecraft/screen/slot/Slot;Lnet/minecraft/screen/slot/SlotActionType;)V"
      )},
      cancellable = true
   )
   private void onClick(Slot Slot, int i, int j, SlotActionType SlotActionType, CallbackInfo callbackinfo) {
      GetSlotIdHandler ill1i11lii11111li1ii1l = new GetSlotIdHandler(this.handler.syncId, i, j, SlotActionType);
      EventBus.StringHolder_8((Event)ill1i11lii11111li1ii1l);
      if (ill1i11lii11111li1ii1l.Event()) {
         callbackinfo.cancel();
      }
   }

   @Inject(
      method = {"drawSlot(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/screen/slot/Slot;)V"},
      at = {@At("HEAD")}
   )
   private void onDrawSlotInject(DrawContext DrawContext, Slot Slot, CallbackInfo callbackinfo) {
      if (AhHelper.Ill1lII1l1ll1I1lIl1lIl.Spider()) {
         if (Slot == this.lowSumSlotId) {
            AhHelper.Ill1lII1l1ll1I1lIl1lIl.StringHolder_8(DrawContext, Slot);
         } else if (Slot == this.lowAllSumSlotId) {
            AhHelper.Ill1lII1l1ll1I1lIl1lIl.EventBus(DrawContext, Slot);
         }
      }
   }

   @Inject(
      method = {"init"},
      at = {@At("RETURN")}
   )
   public void injectInit(CallbackInfo callbackinfo) {
      MinecraftClient MinecraftClient = MinecraftClient.getInstance();
      if (Autoinventory.lIIl1Illl1IllIIl11Il1l111I1I.Spider()) {
         this.addDrawableChild(
            ButtonWidget.builder(
                  Text.of("AutoSbor: " + Autoinventory.lIIl1Illl1IllIIl11Il1l111I1I.Spider()),
                  ButtonWidget -> Autoinventory.lIIl1Illl1IllIIl11Il1l111I1I.lI1Il11I1l1III11IIlI1lI1II11I()
               )
               .dimensions(this.width / 2 + 2, this.y, 98, 20)
               .build()
         );
      }

      if (Containerhelper.IIl1lI1111I1lIIll.Spider()) {
         if (this instanceof InventoryScreen) {
            this.addDrawableChild(
               ButtonWidget.builder(
                     Text.of("Выкинуть все"),
                     ButtonWidget -> {
                        for (int i = 0; i < MinecraftClient.player.currentScreenHandler.slots.size(); i++) {
                           ItemStack ItemStack = MinecraftClient.player.currentScreenHandler.getSlot(i).getStack();
                           if (!ItemStack.isEmpty()) {
                              GetSlotIdHandler ill1i11lii11111li1ii1l = new GetSlotIdHandler(
                                 this.handler.syncId, i, ItemStack.getCount(), SlotActionType.THROW
                              );
                              EventBus.StringHolder_8((Event)ill1i11lii11111li1ii1l);
                              if (!ill1i11lii11111li1ii1l.Event()) {
                                 MinecraftClient.interactionManager
                                    .clickSlot(this.handler.syncId, i, ItemStack.getCount(), SlotActionType.THROW, MinecraftClient.player);
                              }
                           }
                        }
                     }
                  )
                  .dimensions(this.x + 5, this.y - 25, this.backgroundWidth - 10, 20)
                  .build()
            );
         } else if (GenericContainerScreen.class.isInstance(this) || ShulkerBoxScreen.class.isInstance(this)) {
            this.addDrawableChild(ButtonWidget.builder(Text.of("Выкинуть"), ButtonWidget -> {
               for (int i = 0; i < this.handler.slots.size() - 36; i++) {
                  ItemStack ItemStack = this.handler.getSlot(i).getStack();
                  if (!ItemStack.isEmpty()) {
                     MinecraftClient.interactionManager.clickSlot(this.handler.syncId, i, ItemStack.getCount(), SlotActionType.THROW, MinecraftClient.player);
                  }
               }
            }).dimensions(this.x, this.y - 25, 56, 20).build());
            this.addDrawableChild(ButtonWidget.builder(Text.of("Сложить"), ButtonWidget -> {
               for (int i = this.handler.slots.size() - 36; i < this.handler.slots.size(); i++) {
                  if (!this.handler.getSlot(i).getStack().isEmpty()) {
                     MinecraftClient.interactionManager.clickSlot(this.handler.syncId, i, 0, SlotActionType.QUICK_MOVE, MinecraftClient.player);
                  }
               }
            }).dimensions(this.x + 56 + 4, this.y - 25, 56, 20).build());
            this.addDrawableChild(ButtonWidget.builder(Text.of("Забрать"), ButtonWidget -> {
               for (int i = 0; i < this.handler.slots.size() - 36; i++) {
                  if (!this.handler.getSlot(i).getStack().isEmpty()) {
                     MinecraftClient.interactionManager.clickSlot(this.handler.syncId, i, 0, SlotActionType.QUICK_MOVE, MinecraftClient.player);
                  }
               }
            }).dimensions(this.x + 56 + 56 + 4 + 4, this.y - 25, 56, 20).build());
         }
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("RETURN")}
   )
   public void render(DrawContext DrawContext, int i, int j, float f, CallbackInfo callbackinfo) {
      EventBus.StringHolder_8((Event)(new EventImpl_28(DrawContext, this.focusedSlot, this.backgroundWidth, this.backgroundHeight)));
      if (!this.zenith$isInventoryScreen()) {
         this.zenith$betterMinecraft$popScaleIfNeeded(DrawContext);
         this.zenith$finishClosingAnimation();
      }
   }

   @Unique
   @Override
   public boolean zenith$betterMinecraft$isClosingAnimation() {
      return this.zenith$closingAnimation && this.zenith$shouldAnimateBetterMinecraft();
   }

   @Unique
   @Override
   public void zenith$betterMinecraft$popScaleIfNeeded(DrawContext DrawContext) {
      if (this.zenith$scaleApplied) {
         DrawContext.getMatrices().pop();
         this.zenith$scaleApplied = false;
      }
   }

   @Unique
   @Override
   public void zenith$betterMinecraft$finishClosingAnimation() {
      this.zenith$finishClosingAnimation();
   }

   @Unique
   private boolean zenith$shouldAnimateBetterMinecraft() {
      return this.zenith$isInventoryScreen() ? Betterminecraft.Il1I11IllIlIll.l1ll1III1IlI11I11llI() : Betterminecraft.Il1I11IllIlIll.ll1lIllIIIl1I1();
   }

   @Unique
   private boolean zenith$isInventoryScreen() {
      return InventoryScreen.class.isInstance(this);
   }

   @Unique
   private float zenith$getScale() {
      return this.zenith$closingAnimation
         ? Betterminecraft.Il1I11IllIlIll.StringHolder_8(this.zenith$closedAt, this.zenith$closeStartScale)
         : Betterminecraft.Il1I11IllIlIll.ConnectThread(this.zenith$openedAt);
   }

   @Unique
   private void zenith$startClosingAnimation() {
      if (!this.zenith$closingAnimation) {
         this.zenith$closeStartScale = this.zenith$getScale();
         this.zenith$closedAt = System.currentTimeMillis();
         this.zenith$closingAnimation = true;
      }
   }

   @Unique
   private void zenith$finishClosingAnimation() {
      if (this.zenith$closingAnimation && Betterminecraft.Il1I11IllIlIll.CallableImpl(this.zenith$closedAt)) {
         this.zenith$forceClose = true;
         this.close();
         this.zenith$forceClose = false;
      }
   }
}
