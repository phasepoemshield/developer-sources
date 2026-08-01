package sg.mx;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.widget.EntryListWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.gui.ScreenManager;

@Mixin(EntryListWidget.class)
public abstract class EntryListWidgetMixin {
   @Inject(method = "drawMenuListBackground", at = @At("HEAD"), cancellable = true)
   private void destra$skipVanillaListBackground(DrawContext var1, CallbackInfo var2) {
      if (ScreenManager.isCurrentScreenManaged()) {
         var2.cancel();
      }
   }

   @Inject(method = "drawHeaderAndFooterSeparators", at = @At("HEAD"), cancellable = true)
   private void destra$skipVanillaListSeparators(DrawContext var1, CallbackInfo var2) {
      if (ScreenManager.isCurrentScreenManaged()) {
         var2.cancel();
      }
   }

   @Inject(method = "drawSelectionHighlight", at = @At("HEAD"), cancellable = true)
   private void destra$skipVanillaSelectionHighlight(DrawContext var1, int var2, int var3, int var4, int var5, int var6, CallbackInfo var7) {
      if (ScreenManager.isCurrentScreenManaged()) {
         var7.cancel();
      }
   }
}
