package fat.releon.mixins.player.inventory;

import l.SelfDestruct;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({InventoryScreen.class})
public abstract class InventoryScreenMixin {
   public InventoryScreenMixin() {
   }

   @Inject(
      method = {"init"},
      at = {@At("TAIL")}
   )
   private void addDropAllButton(CallbackInfo var1) {
      if (!SelfDestruct.unhooked) {
         MinecraftClient var2 = MinecraftClient.getInstance();
         InventoryScreen var3 = (InventoryScreen)(Object)this;
         int var4 = var3.width / 2 - 40;
         int var5 = var3.height / 2 - 120;
         ButtonWidget var6 = ButtonWidget.builder(Text.of("Выкинуть всё"), var2x -> this.dropAllItems(var2)).position(var4, var5).size(80, 20).build();
         var3.addDrawableChild(var6);
      }
   }

   private void dropAllItems(MinecraftClient var1) {
      ClientPlayerEntity var2 = var1.player;
      if (var2 != null && var2.currentScreenHandler != null) {
         for (int var3 = 9; var3 < 36; var3++) {
            ItemStack var4 = var2.getInventory().getStack(var3);
            if (!var4.isEmpty()) {
               var1.interactionManager.clickSlot(var2.currentScreenHandler.syncId, var3, 1, SlotActionType.THROW, var2);
            }
         }

         for (int var5 = 0; var5 < 9; var5++) {
            ItemStack var6 = var2.getInventory().getStack(var5);
            if (!var6.isEmpty()) {
               var1.interactionManager.clickSlot(var2.currentScreenHandler.syncId, var5 + 36, 1, SlotActionType.THROW, var2);
            }
         }
      }
   }
}
