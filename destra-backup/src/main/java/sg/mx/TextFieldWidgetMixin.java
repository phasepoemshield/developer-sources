package sg.mx;

import java.util.Objects;
import java.util.function.Function;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.gui.GuiDrawHelper;
import ru.destra.gui.ScreenManager;
import ru.destra.render.GuiRenderUtil;
import ru.destra.util.ColorUtil;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(TextFieldWidget.class)
public abstract class TextFieldWidgetMixin {
   @Unique
   private static final String DESTRA_HIDDEN_LABEL = "Скрыто";
   @Final
   @Shadow
   private TextRenderer textRenderer;
   private static final float ВI;
   private static final float ВТ;
   private static final float Вц;
   private static final float ВЫ;
   private static final String ВШ;

   @Unique
   private boolean destra$shouldHide() {
      TextFieldWidget var1 = (TextFieldWidget)this;
      return DestraClient.devMode && MinecraftClient.getInstance().currentScreen instanceof ChatScreen && var1.getText() != null && !var1.getText().isEmpty();
   }

   @Inject(method = "renderWidget", at = @At("HEAD"), cancellable = true)
   private void destra$renderHiddenOverlay(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (this.destra$shouldHide()) {
         TextFieldWidget var6 = (TextFieldWidget)this;
         float var7 = var6.drawsBackground() ? 0.0F : 2.0F;
         float var8 = var6.getX() - var7;
         float var9 = var6.getY() - 2.0F;
         float var10 = Math.max(1.0F, var6.getWidth() + var7 * 2.0F);
         float var11 = Math.max(1.0F, var6.getHeight() + ВI);
         var1.getMatrices().push();
         var1.getMatrices().translate(0.0F, 0.0F, ВТ);
         GuiRenderUtil.drawBlurUniform(var1, var8, var9, var10, var11, Вц, 0.0F, ColorUtil.packARGB(0, 0, 0, 150));
         GuiRenderUtil.drawRoundedRect(var1, var8, var9, var10, var11, 0.0F, ColorUtil.packARGB(8, 8, 8, 190));
         int var12 = Math.round(var8 + var10 / 2.0F);
         Objects.requireNonNull(this.textRenderer);
         int var13 = Math.round(var9 + (var11 - ВЫ) / 2.0F);
         var1.drawCenteredTextWithShadow(this.textRenderer, ВШ, var12, var13, -1);
         var1.getMatrices().pop();
         var5.cancel();
      }
   }

   @Redirect(
      method = "renderWidget",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/DrawContext;drawGuiTexture(Ljava/util/function/Function;Lnet/minecraft/util/Identifier;IIII)V")
   )
   private void destra$drawStyledTextFieldBackground(
      DrawContext var1, Function<Identifier, RenderLayer> var2, Identifier var3, int var4, int var5, int var6, int var7
   ) {
      if (!ScreenManager.isCurrentScreenManaged()) {
         var1.drawGuiTexture(var2, var3, var4, var5, var6, var7);
      } else {
         TextFieldWidget var8 = (TextFieldWidget)this;
         GuiDrawHelper.м(var1, var4, var5, var6, var7, var8.isFocused(), var8.isActive());
      }
   }

   static {
      VMBridge.identifyClass(TextFieldWidgetMixin.class, "CZcvqOSo");
   }
}
