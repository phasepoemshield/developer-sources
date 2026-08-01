package sg.mx;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.client.gui.widget.ScrollableWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.gui.GuiDrawHelper;
import ru.destra.gui.ScreenManager;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(ScrollableWidget.class)
public abstract class ScrollableWidgetMixin extends ClickableWidget {
   private static final float щчм;

   protected ScrollableWidgetMixin(int var1, int var2, int var3, int var4, Text var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Shadow
   protected abstract boolean overflows();

   @Shadow
   protected abstract int getScrollbarX();

   @Shadow
   protected abstract int getScrollbarThumbY();

   @Shadow
   protected abstract int getScrollbarThumbHeight();

   @Inject(method = "drawScrollbar", at = @At("HEAD"), cancellable = true)
   private void destra$drawStyledScrollbar(DrawContext var1, CallbackInfo var2) {
      if (ScreenManager.isCurrentScreenManaged() && this.overflows()) {
         GuiDrawHelper.м(var1, this.getScrollbarX(), this.getY(), щчм, this.getHeight(), this.getScrollbarThumbY(), this.getScrollbarThumbHeight());
         var2.cancel();
      }
   }

   static {
      VMBridge.identifyClass(ScrollableWidgetMixin.class, "e7grF7RY");
   }
}
