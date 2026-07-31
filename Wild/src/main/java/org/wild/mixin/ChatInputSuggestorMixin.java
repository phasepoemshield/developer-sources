package org.wild.mixin;

import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import net.minecraft.client.gui.screen.ChatInputSuggestor;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.Command;
import ru.metaculture.protection.UnHook;
import ru.metaculture.protection.WildClient;

@Mixin({ChatInputSuggestor.class})
public abstract class ChatInputSuggestorMixin {
   @Shadow
   @Final
   TextFieldWidget textField;
   @Shadow
   private CompletableFuture<Suggestions> pendingSuggestions;

   @Shadow
   public abstract void show(boolean bl);

   @Inject(
      method = {"refresh"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRefresh(CallbackInfo callbackInfo) {
      if (!UnHook.O000000000O0) {
         String var2 = this.textField.getText();
         String var3 = WildClient.O00000000.O000000000OO();
         if (var2.startsWith(var3)) {
            int var4 = this.textField.getCursor();
            String var5 = var2.substring(0, var4);
            int var6 = var5.lastIndexOf(32) + 1;
            if (var6 < 0) {
               var6 = 0;
            }

            SuggestionsBuilder var7 = new SuggestionsBuilder(var5, var6);
            String var8 = var5.substring(var3.length());
            String[] var9 = var8.split(" ", -1);
            String var10 = var9[0];
            if (var9.length <= 1) {
               for (Command var16 : WildClient.O00000000.O000000000O0O0().O00000000()) {
                  if (var16.O00000000().toLowerCase().startsWith(var10.toLowerCase())) {
                     var7.suggest(var3 + var16.O00000000(), Text.literal(var16.O000000000()));
                  }
               }
            } else {
               for (Command var12 : WildClient.O00000000.O000000000O0O0().O00000000()) {
                  if (var12.O00000000().equalsIgnoreCase(var10)) {
                     for (String var14 : var12.O00000000(var9)) {
                        var7.suggest(var14);
                     }
                  }
               }
            }

            this.pendingSuggestions = var7.buildFuture();
            this.show(false);
            callbackInfo.cancel();
         }
      }
   }

   @Shadow
   public abstract void setWindowActive(boolean bl);

   @Inject(
      method = {"refresh"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void litka$hideSuggestionsOnUnhook(CallbackInfo callbackInfo) {
      if (UnHook.O000000000O0) {
         String var2 = this.textField.getText();
         String var3 = WildClient.O00000000.O000000000OO();
         if (var2 != null && (var2.startsWith(var3) || var2.startsWith("#"))) {
            this.setWindowActive(false);
            callbackInfo.cancel();
         }
      }
   }
}
