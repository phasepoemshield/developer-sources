package fun.nexisdlc.mixins.render;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.mixins.accessors.ChatHudAccessor;
import fun.nexisdlc.modules.api.FunctionManager;
import fun.nexisdlc.modules.impl.utils.AntiSpamModule;
import fun.nexisdlc.modules.impl.utils.ServerAssistant;
import fun.nexisdlc.ui.hud.CustomChatHud;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.gui.hud.ChatHudLine;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.gui.hud.MessageIndicator;
import net.minecraft.network.message.MessageSignatureData;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Mixin(ChatHud.class)
public class ChatHudMixin {
    @Unique
    private static final int CHAT_FADE_TICKS = 160;
    @Unique
    private static final Pattern NEIXS_SUFFIX_PATTERN = Pattern.compile("^(.*) \\((\\d+)\\)$");

    @Inject(method = "render(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/font/TextRenderer;IIIZZ)V", at = @At("HEAD"), cancellable = true)
    private void nexis$cancelVanillaChat(DrawContext context, TextRenderer textRenderer, int currentTick, int mouseX, int mouseY,
                                         boolean focused, boolean selectText, CallbackInfo ci) {
        if (CustomChatHud.shouldUseCustomChat()) {
            CustomChatHud.markActive((ChatHud) (Object) this);
            ci.cancel();
        }
    }

    @Inject(
            method = "addMessage(Lnet/minecraft/text/Text;Lnet/minecraft/network/message/MessageSignatureData;Lnet/minecraft/client/gui/hud/MessageIndicator;)V",
            at = @At("HEAD"),
            cancellable = true
    )
    private void nexis$mergeSpam(Text message, MessageSignatureData signature, MessageIndicator indicator, CallbackInfo ci) {
        if (message == null) return;

        Text rewritten = ServerAssistant.rewriteBanMessage(message);
        if (rewritten == null) return;
        if (rewritten != message) {
            MinecraftClient client = MinecraftClient.getInstance();
            InGameHud inGameHud = client.inGameHud;
            int currentTicks = inGameHud != null ? inGameHud.getTicks() : 0;

            ChatHudAccessor accessor = (ChatHudAccessor) this;
            List<ChatHudLine> messages = accessor.getMessages();
            messages.add(0, new ChatHudLine(currentTicks, rewritten, signature, indicator));
            accessor.invokeRefresh();
            ci.cancel();
            return;
        }

        FunctionManager manager = Nexis.getFunctionManager();
        if (manager == null || manager.getAntiSpamModule() == null || !manager.getAntiSpamModule().isState()) {
            AntiSpamModule.resetState();
            return;
        }

        AntiSpamModule.ensureServerContext(nexis$getServerContextKey());

        String key = message.getString();
        int count = AntiSpamModule.nextCountFor(key);
        if (count <= 1) return;

        MinecraftClient client = MinecraftClient.getInstance();
        InGameHud inGameHud = client.inGameHud;
        int currentTicks = inGameHud != null ? inGameHud.getTicks() : 0;

        ChatHudAccessor accessor = (ChatHudAccessor) this;
        List<ChatHudLine> messages = accessor.getMessages();
        int index = nexis$findMessageIndex(messages, key, currentTicks);
        MutableText merged = message.copy().append(Text.literal(" (" + count + ")").formatted(Formatting.GRAY));
        if (index >= 0) {
            ChatHudLine oldLine = messages.get(index);
            messages.set(index, new ChatHudLine(oldLine.creationTick(), merged, oldLine.signature(), oldLine.indicator()));
        } else {
            messages.add(0, new ChatHudLine(currentTicks, merged, signature, indicator));
        }
        accessor.invokeRefresh();
        ci.cancel();
    }

    @Inject(method = "clear", at = @At("HEAD"))
    private void nexis$clearAntiSpamState(boolean clearHistory, CallbackInfo ci) {
        AntiSpamModule.resetState();
    }

    @Unique
    private static int nexis$findMessageIndex(List<ChatHudLine> messages, String key, int currentTicks) {
        for (int i = 0; i < messages.size(); i++) {
            ChatHudLine line = messages.get(i);
            if (nexis$isExpired(line, currentTicks)) continue;
            String existing = line.content().getString();
            if (key.equals(existing) || key.equals(nexis$stripCounterSuffix(existing))) {
                return i;
            }
        }
        return -1;
    }

    @Unique
    private static boolean nexis$isExpired(ChatHudLine line, int currentTicks) {
        return currentTicks - line.creationTick() > CHAT_FADE_TICKS;
    }

    @Unique
    private static String nexis$stripCounterSuffix(String text) {
        Matcher matcher = NEIXS_SUFFIX_PATTERN.matcher(text);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return text;
    }

    @Unique
    private static String nexis$getServerContextKey() {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.getCurrentServerEntry() == null || client.getCurrentServerEntry().address == null || client.getCurrentServerEntry().address.isEmpty()) {
            return "singleplayer";
        }
        return client.getCurrentServerEntry().address.toLowerCase();
    }
}
