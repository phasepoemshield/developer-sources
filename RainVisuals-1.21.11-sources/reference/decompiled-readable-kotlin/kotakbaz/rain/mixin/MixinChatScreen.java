package kotakbaz.rain.mixin;

import java.util.List;
import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.ذج;
import oxxxde.زأ;
import oxxxde.شا;

// $VF: Compiled from MixinChatScreen.java
@Mixin(ChatScreen.class)
public abstract class MixinChatScreen extends Screen {
   @Shadow
   protected TextFieldWidget chatField;
   @Unique
   private long rain$chatOpenAnimationStart = -1L;
   @Unique
   private static final int RAIN_PASSWORD_MASK_Y_OFFSET = -1;
   @Unique
   private int rain$chatRenderOffset = 0;

   protected MixinChatScreen(Text title) {
      super(title);
   }

   @Inject(method = "method_25394", at = @At("HEAD"))
   private void rain$offsetChatInput(DrawContext delta, int mouseX, int context, float mouseY, CallbackInfo ci) {
      if (this.chatField != null) {
         this.rain$chatRenderOffset = this.rain$getChatAnimationOffset();
         if (this.rain$chatRenderOffset != 0) {
            this.chatField.setY(this.chatField.getY() + this.rain$chatRenderOffset);
         }
      }
   }

   @Inject(
      method = "method_25394",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/class_437;method_25394(Lnet/minecraft/class_332;IIF)V", shift = Shift.AFTER)
   )
   private void rain$renderPasswordPanels(DrawContext delta, int context, int mouseX, float mouseY, CallbackInfo ci) {
      if (شا.INSTANCE.shouldMask() && this.chatField != null && this.textRenderer != null) {
         String text = this.chatField.getText();
         if (text != null && !text.isEmpty()) {
            List<int[]> ranges = شا.INSTANCE.findSensitiveRanges(text);
            if (!ranges.isEmpty()) {
               int firstCharacterIndex = ((TextFieldWidgetAccessor)this.chatField).rain$getFirstCharacterIndex();
               if (firstCharacterIndex < text.length()) {
                  int innerWidth = this.chatField.getInnerWidth();
                  int visibleLength = this.textRenderer.trimToWidth(text.substring(firstCharacterIndex), innerWidth).length();
                  int visibleEnd = firstCharacterIndex + visibleLength;
                  int baseX = this.chatField.getX() + (this.chatField.drawsBackground() ? 4 : 0);
                  int top = this.chatField.getY() + (this.chatField.getHeight() - 9) / 2 + -1;
                  int bottom = top + 9;

                  for (int[] range : ranges) {
                     if (range != null && range.length >= 2) {
                        int start = Math.max(range[0], firstCharacterIndex);
                        int end = Math.min(range[1], visibleEnd);
                        if (end > start) {
                           for (int index = start; index < end; index++) {
                              int x1 = baseX + this.textRenderer.getWidth(text.substring(firstCharacterIndex, index));
                              int x2 = baseX + this.textRenderer.getWidth(text.substring(firstCharacterIndex, index + 1));
                              if (x2 > x1) {
                                 context.fill(x1, top, x2, bottom, -16777216);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Inject(method = "method_25426", at = @At("TAIL"))
   private void rain$initChatAnimation(CallbackInfo ci) {
      this.rain$chatOpenAnimationStart = System.currentTimeMillis();
   }

   @Inject(method = "method_25401", at = @At("HEAD"), cancellable = true)
   private void rain$resizeViewModelItem(double horizontalAmount, double mouseX, double verticalAmount, double mouseY, CallbackInfoReturnable<Boolean> cir) {
      if (زأ.INSTANCE.scrollChatItem(mouseX, mouseY, verticalAmount, this.width, this.height)) {
         cir.setReturnValue(true);
      }
   }

   @Inject(method = "method_25432", at = @At("TAIL"))
   private void rain$stopViewModelDrag(CallbackInfo ci) {
      زأ.INSTANCE.endChatDrag();
   }

   @Inject(method = "method_25394", at = @At("RETURN"))
   private void rain$restoreChatInput(DrawContext mouseX, int delta, int context, float ci, CallbackInfo mouseY) {
      if (this.chatField != null && this.rain$chatRenderOffset != 0) {
         this.chatField.setY(this.chatField.getY() - this.rain$chatRenderOffset);
      }

      this.rain$chatRenderOffset = 0;
   }

   @Unique
   private int rain$getChatAnimationOffset() {
      if (!this.rain$shouldAnimateChat()) {
         return 0;
      }

      long now = System.currentTimeMillis();
      if (this.rain$chatOpenAnimationStart < 0L) {
         this.rain$chatOpenAnimationStart = now;
      }

      double progress = Math.min((now - this.rain$chatOpenAnimationStart) / 160.0, 1.0);
      double eased = 1.0 - Math.pow(1.0 - progress, 2.0);
      return (int)Math.round((1.0 - eased) * 14.0);
   }

   public boolean mouseReleased(Click event) {
      boolean handled = event.button() == 0 && زأ.INSTANCE.endChatDrag();
      return handled || super.mouseReleased(event);
   }

   @Redirect(method = "method_25394", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_332;method_25294(IIIII)V"))
   private void rain$animateChatInputBackground(DrawContext y2, int x1, int x2, int context, int y1, int color) {
      int offset = this.rain$getChatAnimationOffset();
      context.fill(x1, y1 + offset, x2, y2 + offset, color);
   }

   @Inject(method = "method_25402", at = @At("HEAD"), cancellable = true)
   private void rain$startViewModelDrag(Click cir, boolean doubled, CallbackInfoReturnable<Boolean> event) {
      if (event.button() == 0 && زأ.INSTANCE.beginChatDrag(event.x(), event.y(), this.width, this.height)) {
         cir.setReturnValue(true);
      }
   }

   @Unique
   private boolean rain$shouldAnimateChat() {
      return ذج.INSTANCE.isEnabled() && ذج.INSTANCE.getAnimateChat().getValue();
   }

   public boolean mouseDragged(Click deltaX, double deltaY, double event) {
      return event.button() == 0 && زأ.INSTANCE.dragChatItem(event.x(), event.y(), this.width, this.height) ? true : super.mouseDragged(event, deltaX, deltaY);
   }
}
