package sg.mx;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.gui.hud.ChatHudLine;
import net.minecraft.client.gui.hud.MessageIndicator;
import net.minecraft.network.message.MessageSignatureData;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.gui.ScreenAnimationManager;
import ru.destra.hud.ChatHudRenderer;
import ru.destra.module.ChatHelperModule;
import ru.destra.render.ChatRenderMode;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(ChatHud.class)
public abstract class ChatHudMixin {
   @Unique
   private static final Pattern DESTRA_DUPLICATE_SUFFIX_PATTERN = Pattern.compile(ChatHudMixin.шсЬ);
   @Shadow
   @Final
   private MinecraftClient client;
   @Shadow
   @Final
   private List<ChatHudLine> messages;
   @Unique
   private List<ChatHudLine> destra$preservedMessages;
   private static final float шсЦ;
   private static final String шсЬ;

   @Shadow
   protected abstract void refresh();

   @Inject(method = "render", at = @At("HEAD"), cancellable = true)
   private void destra$renderCachedChat(DrawContext var1, int var2, int var3, int var4, boolean var5, CallbackInfo var6) {
      if (!ChatHudRenderer.isRedrawRequested()) {
         ChatHud var7 = (ChatHud)this;
         ChatRenderMode var8 = ChatHudRenderer.beginFrame(var7, (ChatHudAccessor)this, var5);
         if (var8 != ChatRenderMode.VANILLA) {
            if (var8 == ChatRenderMode.CAPTURE && ChatHudRenderer.beginCapture(var1)) {
               try {
                  ChatHudRenderer.markNeedsRedraw();
                  var7.render(var1, var2, var3, var4, var5);
               } finally {
                  ChatHudRenderer.clearNeedsRedraw();
                  ChatHudRenderer.finishCapture(var1);
               }
            }

            if (ChatHudRenderer.isCacheReady()) {
               float var9 = ScreenAnimationManager.getChatAnimSmoothed();
               if (var9 > шсЦ) {
                  ChatHudRenderer.renderChatOverlay(var1, var9);
                  var6.cancel();
               }
            }
         }
      }
   }

   @ModifyVariable(method = "addMessage", at = @At("HEAD"), argsOnly = true)
   private Text destra$patchChatMessage(Text var1) {
      return this.patchChatText(var1);
   }

   @ModifyVariable(method = "addMessage", at = @At("HEAD"), argsOnly = true)
   private Text destra$patchChatMessageSigned(Text var1) {
      return this.patchChatText(var1);
   }

   @ModifyConstant(method = "addVisibleMessage", constant = @Constant(intValue = 100))
   private int destra$expandVisibleChatLimit(int var1) {
      return this.destra$getChatLimit();
   }

   @ModifyConstant(method = "addMessage", constant = @Constant(intValue = 100))
   private int destra$expandStoredChatLimit(int var1) {
      return this.destra$getChatLimit();
   }

   @Inject(method = "addMessage", at = @At("HEAD"), cancellable = true)
   private void destra$mergeDuplicateMessages(Text var1, MessageSignatureData var2, MessageIndicator var3, CallbackInfo var4) {
      ChatHelperModule var5 = this.destra$getChatHelper();
      if (var1 != null && var5 != null && var5.Д() && var5.fixDuplicates.isEnabled()) {
         String var6 = this.destra$normalizeMessage(var1);
         if (!var6.isEmpty() && !this.messages.isEmpty()) {
            ChatHudLine var7 = this.messages.get(0);
            String var8 = this.destra$stripDuplicateSuffix(this.destra$normalizeMessage(var7.content()));
            if (var6.equals(var8)) {
               int var9 = this.destra$extractDuplicateCount(var7.content()) + 1;
               MutableText var10 = var1.copy();
               var10.append(Text.literal(" x" + var9).setStyle(Style.EMPTY.withColor(Formatting.GRAY)));
               ChatHudLine var11 = new ChatHudLine(this.client.inGameHud.getTicks(), var10, var2, var3);
               this.messages.set(0, var11);
               this.refresh();
               var4.cancel();
            }
         }
      }
   }

   @Inject(method = "clear", at = @At("HEAD"))
   private void destra$preserveChatHistory(boolean var1, CallbackInfo var2) {
      ChatHudRenderer.invalidateCache();
      ChatHelperModule var3 = this.destra$getChatHelper();
      if (var3 != null && var3.Д() && var3.saveHistory.isEnabled() && !this.messages.isEmpty()) {
         int var4 = Math.min(this.destra$getChatLimit(), this.messages.size());
         this.destra$preservedMessages = new ArrayList<>(this.messages.subList(0, var4));
      } else {
         this.destra$preservedMessages = null;
      }
   }

   @Inject(method = "clear", at = @At("RETURN"))
   private void destra$restoreChatHistory(boolean var1, CallbackInfo var2) {
      ChatHudRenderer.invalidateCache();
      if (this.destra$preservedMessages != null && !this.destra$preservedMessages.isEmpty()) {
         this.messages.clear();
         this.messages.addAll(this.destra$preservedMessages.subList(0, Math.min(this.destra$preservedMessages.size(), this.destra$getChatLimit())));
         this.refresh();
         this.destra$preservedMessages = null;
      } else {
         this.destra$preservedMessages = null;
      }
   }

   @Inject(method = "reset", at = @At("HEAD"))
   private void destra$resetDuplicateMessagesState(CallbackInfo var1) {
      ChatHudRenderer.invalidateCache();
   }

   @Inject(method = "refresh", at = @At("RETURN"))
   private void destra$invalidateChatCacheOnRefresh(CallbackInfo var1) {
      ChatHudRenderer.invalidateCache();
   }

   @Inject(method = "addMessage", at = @At("RETURN"))
   private void destra$invalidateChatCacheOnMessage(ChatHudLine var1, CallbackInfo var2) {
      ChatHudRenderer.invalidateCache();
   }

   @Inject(method = "removeMessage", at = @At("RETURN"))
   private void destra$invalidateChatCacheOnRemove(MessageSignatureData var1, CallbackInfo var2) {
      ChatHudRenderer.invalidateCache();
   }

   @Inject(method = "resetScroll", at = @At("RETURN"))
   private void destra$invalidateChatCacheOnResetScroll(CallbackInfo var1) {
      ChatHudRenderer.invalidateCache();
   }

   @Inject(method = "scroll", at = @At("RETURN"))
   private void destra$invalidateChatCacheOnScroll(int var1, CallbackInfo var2) {
      ChatHudRenderer.invalidateCache();
   }

   @Unique
   private Text patchChatText(Text var1) {
      if (var1 == null) {
         return null;
      }

      DestraClient var2 = DestraClient.getInstance();
      if (var2 != null && var2.getModuleManager() != null && var2.getModuleManager().streamerMode != null) {
         boolean[] var3 = new boolean[]{false};
         MutableText var4 = Text.empty();
         var1.visit((var3x, var4x) -> {
            String var5x = var2.getModuleManager().streamerMode.sanitizeText(var4x);
            if (var5x == null) {
               var5x = var4x;
            }

            if (!var5x.equals(var4x)) {
               var3[0] = true;
            }

            var4.append(Text.literal(var5x).setStyle(var3x));
            return Optional.empty();
         }, Style.EMPTY);
         if (var3[0]) {
            return var4;
         }

         String var5 = var1.getString();
         String var6 = var2.getModuleManager().streamerMode.sanitizeText(var5);
         return (Text)(var6 != null && !var6.equals(var5) ? Text.literal(var6).setStyle(var1.getStyle()) : var1);
      } else {
         return var1;
      }
   }

   @Unique
   private ChatHelperModule destra$getChatHelper() {
      DestraClient var1 = DestraClient.getInstance();
      return var1 != null && var1.getModuleManager() != null ? var1.getModuleManager().chatHelper : null;
   }

   @Unique
   private int destra$getChatLimit() {
      ChatHelperModule var1 = this.destra$getChatHelper();
      return var1 != null && var1.Д() ? var1._у/* $VF was: 0у */() : 100;
   }

   @Unique
   private String destra$normalizeMessage(Text var1) {
      return var1 == null ? "" : var1.getString().trim();
   }

   @Unique
   private String destra$stripDuplicateSuffix(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         Matcher var2 = DESTRA_DUPLICATE_SUFFIX_PATTERN.matcher(var1);
         return !var2.matches() ? var1 : var2.group(1).trim();
      } else {
         return "";
      }
   }

   @Unique
   private int destra$extractDuplicateCount(Text var1) {
      String var2 = this.destra$normalizeMessage(var1);
      Matcher var3 = DESTRA_DUPLICATE_SUFFIX_PATTERN.matcher(var2);
      if (!var3.matches()) {
         return 1;
      }

      try {
         return Math.max(1, Integer.parseInt(var3.group(2)));
      } catch (NumberFormatException var5) {
         return 1;
      }
   }

   static {
      VMBridge.identifyClass(ChatHudMixin.class, "daeucuNV");
   }
}
