package fat.releon.mixins.client.screen.chat;

import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import l.Helper124;
import l.Helper396;
import net.minecraft.client.gui.screen.ChatInputSuggestor;
import net.minecraft.client.gui.screen.ChatInputSuggestor.SuggestionWindow;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.text.OrderedText;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ChatInputSuggestor.class})
public class ChatInputSuggestorMixin {
   @Shadow
   @Final
   TextFieldWidget textField;
   @Shadow
   @Final
   private List<OrderedText> messages;
   @Shadow
   private ParseResults<?> parse;
   @Shadow
   private CompletableFuture<Suggestions> pendingSuggestions;
   @Shadow
   private SuggestionWindow window;
   @Shadow
   boolean completingSuggestions;

   public ChatInputSuggestorMixin() {
   }

   @Inject(
      method = {"refresh"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preUpdateSuggestion(CallbackInfo var1) {
      String var2 = this.textField.getText().substring(0, Math.min(this.textField.getText().length(), this.textField.getCursor()));
      Helper396 var3 = new Helper396(var2);
      Helper124.method1026(var3);
      if (var3.method581()) {
         var1.cancel();
      } else {
         if (var3.completions != null) {
            var1.cancel();
            this.parse = null;
            if (this.completingSuggestions) {
               return;
            }

            this.textField.setSuggestion(null);
            this.window = null;
            this.messages.clear();
            if (var3.completions.length == 0) {
               this.pendingSuggestions = Suggestions.empty();
            } else {
               StringRange var4 = StringRange.between(var2.lastIndexOf(" ") + 1, var2.length());
               List var5 = Stream.of(var3.completions).map(var1x -> new Suggestion(var4, var1x)).collect(Collectors.toList());
               Suggestions var6 = new Suggestions(var4, var5);
               this.pendingSuggestions = new CompletableFuture<>();
               this.pendingSuggestions.complete(var6);
            }

            ((ChatInputSuggestor)(Object)this).show(true);
         }
      }
   }
}
