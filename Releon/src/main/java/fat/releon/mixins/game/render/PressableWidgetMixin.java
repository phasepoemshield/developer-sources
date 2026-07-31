package fat.releon.mixins.game.render;

import l.Helper72;
import l.BetterMinecraft;
import l.SelfDestruct;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.client.gui.widget.PressableWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({PressableWidget.class})
public abstract class PressableWidgetMixin extends ClickableWidget {
   @Unique
   private static final Helper72 RENDER = new Helper72();

   public PressableWidgetMixin(int var1, int var2, int var3, int var4, Text var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Inject(
      method = {"renderWidget"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRenderWidget(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (!SelfDestruct.unhooked) {
         if (BetterMinecraft.method2760().isState() && BetterMinecraft.method2760().method2761().method2200()) {
            var5.cancel();
            Helper72.method779(
               var1, this.getX(), this.getY(), this.getWidth(), this.getHeight(), this.active, this.getMessage() != null ? this.getMessage().getString() : ""
            );
         }
      }
   }
}
