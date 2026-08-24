package kotakbaz.rain.mixin;

import java.util.ArrayList;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.ثو;
import oxxxde.ل;

// $VF: Compiled from MixinPvpSafeGameMenuScreen.java
@Mixin(GameMenuScreen.class)
public abstract class MixinPvpSafeGameMenuScreen {
   @Unique
   private boolean rain$disabledByPvpSafe;

   @Inject(method = "method_25426", at = @At("RETURN"))
   private void rain$updateButtonOnInit(CallbackInfo ci) {
      this.rain$removeFiguraPauseWidgets();
      this.rain$updateExitButton();
   }

   @Unique
   private void rain$updateExitButton() {
      ButtonWidget exitButton = ((GameMenuScreenAccessor)this).rain$getExitButton();
      if (exitButton != null) {
         boolean shouldBlock = ثو.INSTANCE.shouldBlockDisconnectButton();
         if (shouldBlock) {
            exitButton.active = false;
            this.rain$disabledByPvpSafe = true;
         } else {
            if (this.rain$disabledByPvpSafe) {
               exitButton.active = true;
               this.rain$disabledByPvpSafe = false;
            }
         }
      }
   }

   @Unique
   private void rain$removeFiguraPauseWidgets() {
      GameMenuScreen screen = (GameMenuScreen)this;

      for (Element child : new ArrayList(screen.children())) {
         if (ل.isFiguraPauseWidget(child)) {
            ((ScreenWidgetInvoker)this).rain$invokeRemoveWidget(child);
         }
      }
   }

   @Inject(method = "method_25393", at = @At("TAIL"))
   private void rain$updateButtonOnTick(CallbackInfo ci) {
      this.rain$removeFiguraPauseWidgets();
      this.rain$updateExitButton();
   }

   @Inject(method = "method_25394", at = @At("HEAD"))
   private void rain$removeFiguraButtonBeforeRender(DrawContext delta, int mouseY, int ci, float graphics, CallbackInfo mouseX) {
      this.rain$removeFiguraPauseWidgets();
   }
}
