package sg.mx;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.client.gui.widget.TextWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.font.FontManager;
import ru.destra.font.FontRenderer;
import ru.destra.gui.ScreenManager;
import ru.destra.render.GuiRenderUtil;
import ru.destra.util.ColorUtil;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(TextWidget.class)
public abstract class TextWidgetMixin extends ClickableWidget {
   @Shadow
   private float horizontalAlignment;
   private static final float шиИ;
   private static final float шив;
   private static final float шию;
   private static final float шиг;
   private static final float шиж;

   protected TextWidgetMixin(int var1, int var2, int var3, int var4, Text var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Inject(method = "renderWidget", at = @At("HEAD"), cancellable = true)
   private void destra$renderStyledTextWidget(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (ScreenManager.isCurrentScreenManaged()) {
         String var6 = this.getMessage().getString();
         float var7 = this.getHeight() > 12 ? шиИ : шив;
         float var8 = ((FontRenderer)FontManager.suisseMediumFont.get()).getTextWidth(var6, var7, шию);
         float var9 = this.getX() + (this.getWidth() - var8) * this.horizontalAlignment;
         float var10 = this.getY() + this.getHeight() / 2.0F - ((FontRenderer)FontManager.suisseMediumFont.get()).toPixelSize(var7) / 2.0F + шиг;
         GuiRenderUtil.drawTextWithScale(
            var1,
            this.getHeight() > 12 ? (FontRenderer)FontManager.suisseSbFont.get() : (FontRenderer)FontManager.suisseMediumFont.get(),
            var6,
            var9,
            var10,
            ColorUtil.packARGB(255, 255, 255, this.getHeight() > 12 ? 245 : 205),
            var7,
            шиж
         );
         var5.cancel();
      }
   }

   static {
      VMBridge.identifyClass(TextWidgetMixin.class, "5JQBDjSx");
   }
}
