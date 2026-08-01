package zenith.zov.utility.mixin.screen;

import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import net.minecraft.command.CommandSource;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.screen.ChatInputSuggestor;
import net.minecraft.client.gui.screen.ChatInputSuggestor.LootContextAware4;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import zenith.ZenithClient;

@Mixin({ChatInputSuggestor.class})
public abstract class MixinChatInputSuggestor {
   @Final
   @Shadow
   TextFieldWidget textField;
   @Shadow
   boolean completingSuggestions;
   @Shadow
   private ParseResults<CommandSource> parse;
   @Shadow
   private CompletableFuture<Suggestions> pendingSuggestions;
   @Shadow
   private LootContextAware4 window;

   @Shadow
   protected abstract void showCommandSuggestions();

   @Inject(
      method = {"refresh"},
      at = {@At(
         value = "INVOKE",
         target = "Lcom/mojang/brigadier/StringReader;canRead()Z",
         remap = false
      )},
      cancellable = true,
      locals = LocalCapture.CAPTURE_FAILHARD
   )
   public void refreshHook(CallbackInfo callbackinfo, String s, StringReader stringreader) {
      if (stringreader.canRead(ZenithClient.getInstance().ZenithInternal017().getPrefix().length())
         && stringreader.getString()
            .startsWith(ZenithClient.getInstance().ZenithInternal017().getPrefix(), stringreader.getCursor())) {
         stringreader.setCursor(stringreader.getCursor() + 1);
         if (this.parse == null) {
            this.parse = ZenithClient.getInstance()
               .ZenithInternal017()
               .getDispatcher()
               .parse(stringreader, ZenithClient.getInstance().ZenithInternal017().getSource());
         }

         int i = this.textField.getCursor();
         if (i >= 1 && (this.window == null || !this.completingSuggestions)) {
            this.pendingSuggestions = ZenithClient.getInstance()
               .ZenithInternal017()
               .getDispatcher()
               .getCompletionSuggestions(this.parse, i);
            this.pendingSuggestions.thenRun(() -> {
               if (this.pendingSuggestions.isDone()) {
                  this.showCommandSuggestions();
               }
            });
         }

         callbackinfo.cancel();
      }
   }
}
