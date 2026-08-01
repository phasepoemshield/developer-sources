package fat.releon.mixins.player.inventory;

import l.SelfDestruct;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GenericContainerScreen.class})
public abstract class GenericContainerScreenMixin extends HandledScreen<GenericContainerScreenHandler> {
   private ButtonWidget takeAllButton;
   private ButtonWidget dropAllButton;
   private ButtonWidget storeAllButton;
   private boolean buttonsAdded = false;

   public GenericContainerScreenMixin(GenericContainerScreenHandler var1, PlayerInventory var2, Text var3) {
      super(var1, var2, var3);
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   private void onRender(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (!SelfDestruct.unhooked) {
         MinecraftClient var6 = MinecraftClient.getInstance();
         String var7 = this.getTitle().getString();
         if (!this.buttonsAdded) {
            this.addButtons(var6, var7);
            this.buttonsAdded = true;
         }
      }
   }

   private void addButtons(MinecraftClient var1, String var2) {
      int var3 = (this.width + this.backgroundWidth) / 2;
      int var4 = (this.height - this.backgroundHeight) / 2;
      this.dropAllButton = ButtonWidget.builder(Text.literal("Выбросить"), var2x -> this.dropAll(var1)).dimensions(var3, var4, 80, 20).build();
      this.takeAllButton = ButtonWidget.builder(Text.literal("Взять всё"), var2x -> this.takeAll(var1)).dimensions(var3, var4 + 22, 80, 20).build();
      this.storeAllButton = ButtonWidget.builder(Text.literal("Сложить всё"), var2x -> this.storeAll(var1)).dimensions(var3, var4 + 44, 80, 20).build();
      this.addDrawableChild(this.dropAllButton);
      this.addDrawableChild(this.takeAllButton);
      this.addDrawableChild(this.storeAllButton);
   }

   private void takeAll(MinecraftClient var1) {
      ClientPlayerEntity var2 = var1.player;
      if (var2 != null && var2.currentScreenHandler != null) {
         for (Slot var4 : var2.currentScreenHandler.slots) {
            if (var4.inventory != var2.getInventory() && var4.hasStack()) {
               var1.interactionManager.clickSlot(var2.currentScreenHandler.syncId, var4.id, 0, SlotActionType.QUICK_MOVE, var2);
            }
         }
      }
   }

   private void dropAll(MinecraftClient var1) {
      ClientPlayerEntity var2 = var1.player;
      if (var2 != null && var2.currentScreenHandler != null) {
         for (Slot var4 : var2.currentScreenHandler.slots) {
            if (var4.inventory != var2.getInventory() && var4.hasStack()) {
               var1.interactionManager.clickSlot(var2.currentScreenHandler.syncId, var4.id, 1, SlotActionType.THROW, var2);
            }
         }
      }
   }

   private void storeAll(MinecraftClient var1) {
      ClientPlayerEntity var2 = var1.player;
      if (var2 != null && var2.currentScreenHandler != null) {
         for (Slot var4 : var2.currentScreenHandler.slots) {
            if (var4.inventory == var2.getInventory() && var4.hasStack()) {
               var1.interactionManager.clickSlot(var2.currentScreenHandler.syncId, var4.id, 0, SlotActionType.QUICK_MOVE, var2);
            }
         }
      }
   }
}
