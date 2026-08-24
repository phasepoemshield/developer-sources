package org.zenith.utility.mixin.screen;

import org.zenith.core.CloudResponse;

import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;














import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import net.minecraft.client.gui.screen.ChatInputSuggestor;
import net.minecraft.client.gui.screen.ChatInputSuggestor.SuggestionWindow;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.command.CommandSource;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin({ChatInputSuggestor.class})
public abstract class MixinChatInputSuggestor {
   @Final
   @Shadow
   TextFieldWidget field_21599;
   @Shadow
   boolean field_21614;
   @Shadow
   public ParseResults<CommandSource> field_21610;
   @Shadow
   public CompletableFuture<Suggestions> field_21611;
   @Shadow
   public SuggestionWindow field_21612;

   public MixinChatInputSuggestor() {
   }

   @Shadow
   protected abstract void method_23937();

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
   public void refreshHook(CallbackInfo var1, String var2, StringReader var3) {
      if (var3.canRead(ZenithClient.on23().CloudResponse().getPrefix().length())
         && var3.getString().startsWith(ZenithClient.on23().CloudResponse().getPrefix(), var3.getCursor())) {
         var3.setCursor(var3.getCursor() + 1);
         if (this.field_21610 == null) {
            this.field_21610 = ZenithClient.on23()
               .CloudResponse()
               .getDispatcher()
               .parse(var3, ZenithClient.on23().CloudResponse().getSource());
         }

         int i = this.field_21599.getCursor();
         if (i >= 1 && (this.field_21612 == null || !this.field_21614)) {
            this.field_21611 = ZenithClient.on23().CloudResponse().getDispatcher().getCompletionSuggestions(this.field_21610, i);
            this.field_21611.thenRun(() -> {
               if (this.field_21611.isDone()) {
                  this.method_23937();
               }
            });
         }

         var1.cancel();
      }
   }
}
