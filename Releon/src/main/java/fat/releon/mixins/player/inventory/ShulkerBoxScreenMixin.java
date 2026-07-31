package fat.releon.mixins.player.inventory;

import l.SelfDestruct;
import l.Helper54;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BundleItem;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ShulkerBoxScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ShulkerBoxScreen.class})
public abstract class ShulkerBoxScreenMixin extends HandledScreen<ShulkerBoxScreenHandler> {
   private ButtonWidget takeAllButton;
   private ButtonWidget dropAllButton;
   private ButtonWidget storeAllButton;
   private boolean buttonsAdded = false;
   @Unique
   private static final Helper54 BACKGROUND_RENDER = new Helper54();

   public ShulkerBoxScreenMixin(ShulkerBoxScreenHandler var1, PlayerInventory var2, Text var3) {
      super(var1, var2, var3);
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   private void onRender(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (!SelfDestruct.unhooked) {
         MinecraftClient var6 = MinecraftClient.getInstance();
         if (!this.buttonsAdded) {
            this.addButtons(var6);
            this.buttonsAdded = true;
         }
      }
   }

   private void addButtons(MinecraftClient var1) {
      int var2 = (this.width + this.backgroundWidth) / 2;
      int var3 = (this.height - this.backgroundHeight) / 2;
      this.dropAllButton = ButtonWidget.builder(Text.literal("Выбросить"), var2x -> this.dropAll(var1)).dimensions(var2, var3, 80, 20).build();
      this.takeAllButton = ButtonWidget.builder(Text.literal("Взять всё"), var2x -> this.takeAll(var1)).dimensions(var2, var3 + 22, 80, 20).build();
      this.storeAllButton = ButtonWidget.builder(Text.literal("Сложить всё"), var2x -> this.storeAll(var1)).dimensions(var2, var3 + 44, 80, 20).build();
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
            if (var4.inventory == var2.getInventory() && var4.hasStack() && !this.isShulkerBox(var4.getStack()) && !this.isBag(var4.getStack())) {
               var1.interactionManager.clickSlot(var2.currentScreenHandler.syncId, var4.id, 0, SlotActionType.QUICK_MOVE, var2);
            }
         }
      }
   }

   @Unique
   private boolean isShulkerBox(ItemStack var1) {
      if (var1.isEmpty()) {
         return false;
      } else {
         return var1.getItem() instanceof BlockItem var2 ? var2.getBlock() instanceof ShulkerBoxBlock : false;
      }
   }

   @Unique
   private boolean isBag(ItemStack var1) {
      return var1.isEmpty() ? false : var1.getItem() instanceof BundleItem;
   }
}
