package kotakbaz.rain.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import net.minecraft.client.gui.screen.ChatInputSuggestor;
import net.minecraft.client.gui.widget.TextFieldWidget;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.دإ;

// $VF: Compiled from MixinChatInputSuggestor.java
@Mixin(ChatInputSuggestor.class)
public abstract class MixinChatInputSuggestor {
   @Shadow
   private ParseResults<?> parse;
   @Shadow
   private CompletableFuture<Suggestions> pendingSuggestions;
   @Final
   @Shadow
   TextFieldWidget textField;

   @Shadow
   public abstract void show(boolean var1);

   @Inject(method = "method_23934", at = @At(value = "INVOKE", target = "Lcom/mojang/brigadier/StringReader;canRead()Z", remap = false), cancellable = true)
   private void onRefresh(CallbackInfo ci, @Local StringReader reader) {
      String prefix = دإ.INSTANCE.getPrefix();
      if (reader.canRead(prefix.length()) && reader.getString().startsWith(prefix, reader.getCursor())) {
         reader.setCursor(reader.getCursor() + prefix.length());
         ParseResults<?> parseResults = دإ.INSTANCE.parse(reader);
         if (parseResults != null) {
            this.parse = parseResults;
            int cursor = this.textField.getCursor();
            if (cursor >= prefix.length()) {
               this.pendingSuggestions = دإ.INSTANCE.suggest(this.parse, cursor);
               this.pendingSuggestions.thenRun(() -> {
                  if (this.pendingSuggestions.isDone()) {
                     this.show(false);
                  }
               });
            }

            ci.cancel();
         }
      }
   }
}
