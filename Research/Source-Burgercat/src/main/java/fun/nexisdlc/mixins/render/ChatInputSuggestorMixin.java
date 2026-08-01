package fun.nexisdlc.mixins.render;

import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.events.impl.client.TabCompleteEvent;
import fun.nexisdlc.ui.hud.CustomChatHud;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatInputSuggestor;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.text.OrderedText;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Mixin(ChatInputSuggestor.class)
public class ChatInputSuggestorMixin {
    @Shadow
    @Final
    TextFieldWidget textField;

    @Shadow @Final private List<OrderedText> messages;

    @Shadow private ParseResults<?> parse;

    @Shadow private CompletableFuture<Suggestions> pendingSuggestions;

    @Shadow private ChatInputSuggestor.SuggestionWindow window;

    @Shadow boolean completingSuggestions;

    @Inject(method = "refresh", at = @At("HEAD"), cancellable = true)
    private void preUpdateSuggestion(CallbackInfo ci) {
        if (ClientContainer.isHide()) {
            return;
        }
        String prefix = this.textField.getText().substring(0, Math.min(this.textField.getText().length(), this.textField.getCursor()));

        TabCompleteEvent event = new TabCompleteEvent(prefix);
        NexisClient.getEventBus().post(event);

        if (event.isCancelled()) {
            ci.cancel();
            return;
        }

        if (event.completions != null) {
            ci.cancel();

            this.parse = null;

            if (this.completingSuggestions) {
                return;
            }

            this.textField.setSuggestion(null);
            this.window = null;
            this.messages.clear();

            if (event.completions.length == 0) {
                this.pendingSuggestions = Suggestions.empty();
            } else {
                StringRange range = StringRange.between(prefix.lastIndexOf(" ") + 1, prefix.length());

                List<Suggestion> suggestionList = Stream.of(event.completions)
                        .map(s -> new Suggestion(range, s))
                        .collect(Collectors.toList());

                Suggestions suggestions = new Suggestions(range, suggestionList);

                this.pendingSuggestions = new CompletableFuture<>();
                this.pendingSuggestions.complete(suggestions);
            }
            ((ChatInputSuggestor) (Object) this).show(true);
        }
    }

    @Inject(method = "render", at = @At("HEAD"), cancellable = true)
    private void nexis$cancelVanillaSuggestorRender(DrawContext context, int mouseX, int mouseY, CallbackInfo ci) {
        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc != null && mc.currentScreen instanceof ChatScreen && CustomChatHud.shouldUseCustomChat()) {
            this.messages.clear();
            ci.cancel();
        }
    }

    @Inject(method = "tryRenderWindow", at = @At("HEAD"), cancellable = true)
    private void nexis$cancelVanillaSuggestionWindow(DrawContext context, int mouseX, int mouseY, org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable<Boolean> cir) {
        if (CustomChatHud.shouldUseCustomChat()) {
            cir.setReturnValue(false);
        }
    }

    @Inject(method = "renderMessages", at = @At("HEAD"), cancellable = true)
    private void nexis$cancelVanillaSuggestionMessages(DrawContext context, CallbackInfo ci) {
        if (CustomChatHud.shouldUseCustomChat()) {
            ci.cancel();
        }
    }
}
