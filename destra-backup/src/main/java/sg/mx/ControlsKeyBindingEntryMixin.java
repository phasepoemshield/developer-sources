package sg.mx;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Final;
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

@Mixin(targets = "net/minecraft/client/gui/screen/option/ControlsListWidget$KeyBindingEntry")
public abstract class ControlsKeyBindingEntryMixin {
   @Shadow
   @Final
   private Text bindingName;
   @Shadow
   @Final
   private ButtonWidget editButton;
   @Shadow
   @Final
   private ButtonWidget resetButton;
   @Shadow
   private boolean duplicate;
   private static final float РВ;
   private static final float РЧ;
   private static final float ъш;
   private static final float ъщ;
   private static final float ъй;
   private static final float ъБ;
   private static final float ъе;
   private static final float ъи;
   private static final float ъ弟;
   private static final float ъч;
   private static final float ъО;
   private static final float ъЭ;
   private static final float ъь;
   private static final float ъ8;

   @Inject(method = "render", at = @At("HEAD"), cancellable = true)
   private void destra$renderKeyBindingEntry(
      DrawContext var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10, CallbackInfo var11
   ) {
      if (ScreenManager.isCurrentScreenManaged()) {
         int var12 = var3 + (var6 - this.resetButton.getHeight()) / 2;
         int var13 = var4 + var5 - this.resetButton.getWidth();
         int var14 = var13 - 5 - this.editButton.getWidth();
         this.resetButton.setPosition(var13, var12);
         this.editButton.setPosition(var14, var12);
         this.resetButton.render(var1, var7, var8, var10);
         this.editButton.render(var1, var7, var8, var10);
         float var15 = var4 + РВ;
         float var16 = var3 + var6 / 2.0F - ((FontRenderer)FontManager.suisseMediumFont.get()).toPixelSize(РЧ) / 2.0F + ъш;
         float var17 = Math.max(ъщ, var14 - var15 - ъй);
         GuiRenderUtil.х(
            var1,
            (FontRenderer)FontManager.suisseMediumFont.get(),
            this.bindingName.getString(),
            var15,
            var16,
            ColorUtil.packARGB(255, 255, 255, 210),
            ъБ,
            ъе,
            ъи,
            ъ弟,
            var17,
            var15
         );
         if (this.duplicate) {
            GuiRenderUtil.drawRoundedRect(var1, var14 - ъч, var3 + ъО, ъЭ, var6 - ъь, ъ8, ColorUtil.packARGB(255, 75, 75, 220));
         }

         var11.cancel();
      }
   }

   static {
      VMBridge.identifyClass(ControlsKeyBindingEntryMixin.class, "y9hnG5AT");
   }
}
