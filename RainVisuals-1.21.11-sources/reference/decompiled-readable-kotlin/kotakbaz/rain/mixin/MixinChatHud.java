package kotakbaz.rain.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotakbaz.rain.module.modules.render.WayPointModule;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.gui.hud.ChatHudLine;
import net.minecraft.client.gui.hud.MessageIndicator;
import net.minecraft.client.gui.hud.ChatHudLine.Visible;
import net.minecraft.network.message.MessageSignatureData;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Coerce;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.اذ;
import oxxxde.ج;
import oxxxde.ذج;
import oxxxde.رج;
import oxxxde.شء;
import oxxxde.شا;

// $VF: Compiled from MixinChatHud.java
@Mixin(ChatHud.class)
public class MixinChatHud {
   @Shadow
   @Final
   private List<Visible> visibleMessages;
   @Unique
   private boolean rain$suppressVisibleAnimations;
   @Final
   @Shadow
   private MinecraftClient client;
   @Unique
   private final Map<Visible, Long> rain$visibleLineAnimations = new IdentityHashMap<>();
   @Shadow
   private int scrolledLines;
   @Unique
   private boolean rain$rewritingAntiFloodMessage;
   @Unique
   private Visible rain$currentAnimatedLine;
   @Unique
   private Visible rain$visibleHeadBeforeAdd;
   @Unique
   private int rain$currentAnimatedLineOffset = 0;
   @Unique
   private static final double RAIN_CHAT_MESSAGE_ANIMATION_NANOS = 2.4E8;
   @Unique
   private static final int RAIN_CHAT_BACKGROUND_RIGHT_PADDING = 8;

   @Unique
   private int rain$getChatLineHeight() {
      return (int)(9.0 * ((Double)this.client.options.getChatLineSpacing().getValue() + 1.0));
   }

   @WrapOperation(
      method = "method_71990",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/class_338$class_11511;accept(Lnet/minecraft/class_303$class_7590;IF)V")
   )
   private void rain$withAnimatedLineOffset(@Coerce Object consumer, Visible index, int visible, float original, Operation<Void> alpha) {
      int previousOffset = اذ.getLineOffset();
      اذ.setLineOffset(this.rain$getVisibleLineOffset(visible));

      try {
         original.call(new Object[]{consumer, visible, index, alpha});
      } finally {
         اذ.setLineOffset(previousOffset);
      }
   }

   @Unique
   private int rain$getVisibleLineCount() {
      return ChatHud.getHeight((Double)this.client.options.getChatHeightFocused().getValue()) / this.rain$getChatLineHeight();
   }

   @Unique
   private String rain$getHoveredMessageText(int hoveredMessageIndex) {
      int messageStart = hoveredMessageIndex;

      while (messageStart > 0 && !this.visibleMessages.get(messageStart).endOfEntry()) {
         messageStart--;
      }

      int messageEnd = messageStart + 1;

      while (messageEnd < this.visibleMessages.size() && !this.visibleMessages.get(messageEnd).endOfEntry()) {
         messageEnd++;
      }

      StringBuilder text = new StringBuilder();

      for (int index = messageEnd - 1; index >= messageStart; index--) {
         text.append(this.rain$getVisibleMessageText(this.visibleMessages.get(index)));
      }

      return text.toString();
   }

   @Unique
   private int rain$getChatWidth() {
      return ChatHud.getWidth((Double)this.client.options.getChatWidth().getValue());
   }

   @Inject(method = "method_44813", at = @At("RETURN"))
   private void rain$enableRefreshAnimations(CallbackInfo ci) {
      this.rain$suppressVisibleAnimations = false;
      this.rain$visibleHeadBeforeAdd = null;
      this.rain$currentAnimatedLine = null;
      this.rain$currentAnimatedLineOffset = 0;
   }

   private Text rain$maskText(Text message) {
      if (!شا.INSTANCE.shouldMask()) {
         return message;
      }

      String masked = شا.INSTANCE.maskIfSensitive(message.getString());
      return (Text)(masked != null && !masked.equals(message.getString()) ? Text.literal(masked).setStyle(message.getStyle()) : message);
   }

   @Inject(method = "method_75804", at = @At("HEAD"))
   private void rain$prepareRender(
      DrawContext hidden, TextRenderer context, int mouseX, int font, int ci, boolean focused, boolean currentTick, CallbackInfo mouseY
   ) {
      if (!this.rain$shouldAnimateChat() && !this.rain$visibleLineAnimations.isEmpty()) {
         this.rain$visibleLineAnimations.clear();
      }
   }

   @Unique
   private int rain$getVisibleLineOffset(Visible visible) {
      if (this.rain$shouldAnimateChat() && visible != null) {
         Long start = this.rain$visibleLineAnimations.get(visible);
         if (start == null) {
            return 0;
         }

         double progress = Math.min((System.nanoTime() - start) / 2.4E8, 1.0);
         double eased = 1.0 - Math.pow(1.0 - progress, 2.0);
         if (progress >= 1.0) {
            this.rain$visibleLineAnimations.remove(visible);
         }

         double scale = Math.max(this.rain$getChatScale(), 0.01);
         double renderedChatWidth = Math.ceil(this.rain$getChatWidth() / scale);
         double startOffset = -(renderedChatWidth + 8.0);
         return (int)Math.round((1.0 - eased) * startOffset);
      } else {
         return 0;
      }
   }

   @Inject(method = "method_75804", at = @At("TAIL"))
   private void rain$renderHoveredTranslation(
      DrawContext ci, TextRenderer font, int focused, int mouseX, int insertionClickMode, boolean mouseY, boolean context, CallbackInfo currentTick
   ) {
      if (focused && شء.INSTANCE.isEnabled()) {
         double scale = this.rain$getChatScale();
         double chatX = mouseX / scale - 4.0;
         int chatWidth = (int)Math.ceil(this.rain$getChatWidth() / scale);
         if (!(chatX < -4.0) && !(chatX > chatWidth + 4.0)) {
            double chatY = (context.getScaledWindowHeight() - mouseY - 40.0) / (scale * this.rain$getChatLineHeight());
            int visibleLines = Math.min(this.rain$getVisibleLineCount(), this.visibleMessages.size());
            if (!(chatY < 0.0) && !(chatY >= visibleLines)) {
               int messageIndex = (int)Math.floor(chatY) + this.scrolledLines;
               if (messageIndex >= 0 && messageIndex < this.visibleMessages.size()) {
                  String source = this.rain$getHoveredMessageText(messageIndex);
                  String translation = شء.INSTANCE.getHoveredTranslation(source);
                  if (translation == null) {
                     this.rain$drawTranslation(context, font, mouseX, mouseY, "Переводится...");
                  } else if (!translation.isBlank()) {
                     this.rain$drawTranslation(context, font, mouseX, mouseY, translation);
                  }
               }
            }
         }
      }
   }

   @Inject(method = "method_1815", at = @At("HEAD"))
   private void rain$captureVisibleHead(ChatHudLine line, CallbackInfo ci) {
      if (this.rain$shouldAnimateChat() && !this.rain$suppressVisibleAnimations) {
         this.rain$visibleHeadBeforeAdd = this.visibleMessages.isEmpty() ? null : this.visibleMessages.get(0);
      } else {
         this.rain$visibleHeadBeforeAdd = null;
      }
   }

   @Unique
   private void rain$drawTranslation(DrawContext font, TextRenderer mouseY, int translation, int context, String mouseX) {
      context.drawTooltip(font, Text.literal(translation), mouseX, mouseY);
   }

   @Unique
   private double rain$getChatScale() {
      return (Double)this.client.options.getChatScale().getValue();
   }

   @Unique
   private String rain$getVisibleMessageText(Visible visibleMessage) {
      StringBuilder text = new StringBuilder();
      visibleMessage.content().accept((index, style, codePoint) -> {
         text.appendCodePoint(codePoint);
         return true;
      });
      return text.toString();
   }

   @Inject(method = "method_1815", at = @At("RETURN"))
   private void rain$trackAnimatedVisibleLines(ChatHudLine line, CallbackInfo ci) {
      if (this.rain$shouldAnimateChat() && !this.rain$suppressVisibleAnimations) {
         long now = System.nanoTime();

         for (Visible visible : this.visibleMessages) {
            if (visible == this.rain$visibleHeadBeforeAdd) {
               break;
            }

            this.rain$visibleLineAnimations.putIfAbsent(visible, now);
         }

         this.rain$visibleHeadBeforeAdd = null;
         this.rain$cleanupVisibleAnimations();
      }
   }

   @ModifyVariable(method = "method_44811", at = @At("HEAD"), argsOnly = true)
   private Text rain$maskSignedMessage(Text message) {
      return this.rain$maskText(message);
   }

   @Inject(method = "method_1808", at = @At(value = "INVOKE", target = "Ljava/util/List;clear()V", ordinal = 0, shift = Shift.AFTER), cancellable = true)
   private void rain$preserveChatHistory(boolean ci, CallbackInfo clearHistory) {
      if (رج.INSTANCE.shouldKeepHistory(clearHistory)) {
         ci.cancel();
      }
   }

   @ModifyVariable(method = "method_1803", at = @At("HEAD"), argsOnly = true)
   private String rain$maskHistory(String message) {
      return !شا.INSTANCE.shouldMask() ? message : شا.INSTANCE.maskForHistory(message);
   }

   @Inject(method = "method_44811", at = @At("HEAD"), cancellable = true)
   private void onChatMessage(Text indicator, MessageSignatureData message, MessageIndicator signature, CallbackInfo ci) {
      if (!this.rain$rewritingAntiFloodMessage) {
         Text collapsed = رج.INSTANCE.processIncomingMessage(message);
         if (collapsed != null) {
            ChatComponentAccessor accessor = (ChatComponentAccessor)this;
            List<ChatHudLine> messages = accessor.rain$getAllMessages();
            if (!messages.isEmpty()) {
               messages.remove(0);
            }

            accessor.rain$refreshTrimmedMessages();
            this.rain$rewritingAntiFloodMessage = true;

            try {
               ((ChatHud)this).addMessage(collapsed, signature, indicator);
            } finally {
               this.rain$rewritingAntiFloodMessage = false;
            }

            ci.cancel();
            return;
         }
      }

      ج.INSTANCE.checkForMention(message);
      WayPointModule.INSTANCE.handleIncomingMessage(message);
   }

   @Inject(method = "method_1808", at = @At("HEAD"))
   private void rain$clearLineAnimations(boolean clearHistory, CallbackInfo ci) {
      رج.INSTANCE.onChatCleared();
      this.rain$visibleLineAnimations.clear();
      this.rain$visibleHeadBeforeAdd = null;
      this.rain$currentAnimatedLine = null;
      this.rain$currentAnimatedLineOffset = 0;
      this.rain$suppressVisibleAnimations = false;
   }

   public MixinChatHud() {
      this.rain$suppressVisibleAnimations = false;
      this.rain$rewritingAntiFloodMessage = false;
   }

   @Unique
   private boolean rain$shouldAnimateChat() {
      return ذج.INSTANCE.isEnabled() && ذج.INSTANCE.getAnimateChat().getValue();
   }

   @Unique
   private void rain$cleanupVisibleAnimations() {
      Iterator<Entry<Visible, Long>> iterator = this.rain$visibleLineAnimations.entrySet().iterator();

      while (iterator.hasNext()) {
         Entry<Visible, Long> entry = iterator.next();
         if (!this.visibleMessages.contains(entry.getKey())) {
            iterator.remove();
         }
      }
   }

   @ModifyVariable(method = "method_1812", at = @At("HEAD"), argsOnly = true)
   private Text rain$maskSingleMessage(Text message) {
      return this.rain$maskText(message);
   }

   @Inject(method = "method_44813", at = @At("HEAD"))
   private void rain$disableRefreshAnimations(CallbackInfo ci) {
      this.rain$suppressVisibleAnimations = true;
      this.rain$visibleLineAnimations.clear();
   }
}
