/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.hud.ChatHud
 *  net.minecraft.client.gui.hud.ChatHudLine
 *  net.minecraft.client.gui.hud.ChatHudLine$Visible
 *  net.minecraft.client.gui.hud.MessageIndicator
 *  net.minecraft.network.message.MessageSignatureData
 *  net.minecraft.text.Text
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Coerce
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotakbaz.rain.mixin.ChatComponentAccessor;
import kotakbaz.rain.module.modules.render.WayPointModule;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.gui.hud.ChatHudLine;
import net.minecraft.client.gui.hud.MessageIndicator;
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
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u0627\u0630;
import oxxxde.\u062c;
import oxxxde.\u0630\u062c;
import oxxxde.\u0631\u062c;
import oxxxde.\u0634\u0621;
import oxxxde.\u0634\u0627;

@Mixin(value={ChatHud.class})
public class MixinChatHud {
    @Shadow
    @Final
    private List<ChatHudLine.Visible> visibleMessages;
    @Unique
    private boolean rain$suppressVisibleAnimations = false;
    @Final
    @Shadow
    private MinecraftClient client;
    @Unique
    private final Map<ChatHudLine.Visible, Long> rain$visibleLineAnimations = new IdentityHashMap<ChatHudLine.Visible, Long>();
    @Shadow
    private int scrolledLines;
    @Unique
    private boolean rain$rewritingAntiFloodMessage = false;
    @Unique
    private ChatHudLine.Visible rain$currentAnimatedLine;
    @Unique
    private ChatHudLine.Visible rain$visibleHeadBeforeAdd;
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @WrapOperation(method={"method_71990"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_338$class_11511;accept(Lnet/minecraft/class_303$class_7590;IF)V")})
    private void rain$withAnimatedLineOffset(@Coerce Object consumer, ChatHudLine.Visible visible, int index, float alpha, Operation<Void> original) {
        int previousOffset = \u0627\u0630.getLineOffset();
        \u0627\u0630.setLineOffset(this.rain$getVisibleLineOffset(visible));
        try {
            original.call(new Object[]{consumer, visible, index, Float.valueOf(alpha)});
        }
        finally {
            \u0627\u0630.setLineOffset(previousOffset);
        }
    }

    @Unique
    private int rain$getVisibleLineCount() {
        return ChatHud.getHeight((double)((Double)this.client.options.getChatHeightFocused().getValue())) / this.rain$getChatLineHeight();
    }

    @Unique
    private String rain$getHoveredMessageText(int hoveredMessageIndex) {
        int messageStart;
        for (messageStart = hoveredMessageIndex; messageStart > 0 && !this.visibleMessages.get(messageStart).endOfEntry(); --messageStart) {
        }
        for (int messageEnd = messageStart + 1; messageEnd < this.visibleMessages.size() && !this.visibleMessages.get(messageEnd).endOfEntry(); ++messageEnd) {
        }
        StringBuilder text = new StringBuilder();
        for (int index = messageEnd - 1; index >= messageStart; --index) {
            text.append(this.rain$getVisibleMessageText(this.visibleMessages.get(index)));
        }
        return text.toString();
    }

    @Unique
    private int rain$getChatWidth() {
        return ChatHud.getWidth((double)((Double)this.client.options.getChatWidth().getValue()));
    }

    @Inject(method={"method_44813"}, at={@At(value="RETURN")})
    private void rain$enableRefreshAnimations(CallbackInfo ci) {
        this.rain$suppressVisibleAnimations = false;
        this.rain$visibleHeadBeforeAdd = null;
        this.rain$currentAnimatedLine = null;
        this.rain$currentAnimatedLineOffset = 0;
    }

    private Text rain$maskText(Text message) {
        if (!\u0634\u0627.INSTANCE.shouldMask()) {
            return message;
        }
        String masked = \u0634\u0627.INSTANCE.maskIfSensitive(message.getString());
        if (masked == null || masked.equals(message.getString())) {
            return message;
        }
        return Text.literal((String)masked).setStyle(message.getStyle());
    }

    @Inject(method={"method_75804"}, at={@At(value="HEAD")})
    private void rain$prepareRender(DrawContext context, TextRenderer font, int currentTick, int mouseX, int mouseY, boolean hidden, boolean focused, CallbackInfo ci) {
        if (!this.rain$shouldAnimateChat() && !this.rain$visibleLineAnimations.isEmpty()) {
            this.rain$visibleLineAnimations.clear();
        }
    }

    @Unique
    private int rain$getVisibleLineOffset(ChatHudLine.Visible visible) {
        if (!this.rain$shouldAnimateChat() || visible == null) {
            return 0;
        }
        Long start = this.rain$visibleLineAnimations.get(visible);
        if (start == null) {
            return 0;
        }
        double progress = Math.min((double)(System.nanoTime() - start) / 2.4E8, 1.0);
        double eased = 1.0 - Math.pow(1.0 - progress, 2.0);
        if (progress >= 1.0) {
            this.rain$visibleLineAnimations.remove(visible);
        }
        double scale = Math.max(this.rain$getChatScale(), 0.01);
        double renderedChatWidth = Math.ceil((double)this.rain$getChatWidth() / scale);
        double startOffset = -(renderedChatWidth + 8.0);
        return (int)Math.round((1.0 - eased) * startOffset);
    }

    @Inject(method={"method_75804"}, at={@At(value="TAIL")})
    private void rain$renderHoveredTranslation(DrawContext context, TextRenderer font, int currentTick, int mouseX, int mouseY, boolean focused, boolean insertionClickMode, CallbackInfo ci) {
        if (!focused || !\u0634\u0621.INSTANCE.isEnabled()) {
            return;
        }
        double scale = this.rain$getChatScale();
        double chatX = (double)mouseX / scale - 4.0;
        int chatWidth = (int)Math.ceil((double)this.rain$getChatWidth() / scale);
        if (chatX < -4.0 || chatX > (double)chatWidth + 4.0) {
            return;
        }
        double chatY = ((double)(context.getScaledWindowHeight() - mouseY) - 40.0) / (scale * (double)this.rain$getChatLineHeight());
        int visibleLines = Math.min(this.rain$getVisibleLineCount(), this.visibleMessages.size());
        if (chatY < 0.0 || chatY >= (double)visibleLines) {
            return;
        }
        int messageIndex = (int)Math.floor(chatY) + this.scrolledLines;
        if (messageIndex < 0 || messageIndex >= this.visibleMessages.size()) {
            return;
        }
        String source = this.rain$getHoveredMessageText(messageIndex);
        String translation = \u0634\u0621.INSTANCE.getHoveredTranslation(source);
        if (translation == null) {
            this.rain$drawTranslation(context, font, mouseX, mouseY, "\u041f\u0435\u0440\u0435\u0432\u043e\u0434\u0438\u0442\u0441\u044f...");
        } else if (!translation.isBlank()) {
            this.rain$drawTranslation(context, font, mouseX, mouseY, translation);
        }
    }

    @Inject(method={"method_1815"}, at={@At(value="HEAD")})
    private void rain$captureVisibleHead(ChatHudLine line, CallbackInfo ci) {
        if (!this.rain$shouldAnimateChat() || this.rain$suppressVisibleAnimations) {
            this.rain$visibleHeadBeforeAdd = null;
            return;
        }
        this.rain$visibleHeadBeforeAdd = this.visibleMessages.isEmpty() ? null : this.visibleMessages.get(0);
    }

    @Unique
    private void rain$drawTranslation(DrawContext context, TextRenderer font, int mouseX, int mouseY, String translation) {
        context.drawTooltip(font, (Text)Text.literal((String)translation), mouseX, mouseY);
    }

    @Unique
    private double rain$getChatScale() {
        return (Double)this.client.options.getChatScale().getValue();
    }

    @Unique
    private String rain$getVisibleMessageText(ChatHudLine.Visible visibleMessage) {
        StringBuilder text = new StringBuilder();
        visibleMessage.content().accept((index, style, codePoint) -> {
            text.appendCodePoint(codePoint);
            return true;
        });
        return text.toString();
    }

    @Inject(method={"method_1815"}, at={@At(value="RETURN")})
    private void rain$trackAnimatedVisibleLines(ChatHudLine line, CallbackInfo ci) {
        if (!this.rain$shouldAnimateChat() || this.rain$suppressVisibleAnimations) {
            return;
        }
        long now = System.nanoTime();
        for (ChatHudLine.Visible visible : this.visibleMessages) {
            if (visible == this.rain$visibleHeadBeforeAdd) break;
            this.rain$visibleLineAnimations.putIfAbsent(visible, now);
        }
        this.rain$visibleHeadBeforeAdd = null;
        this.rain$cleanupVisibleAnimations();
    }

    @ModifyVariable(method={"method_44811"}, at=@At(value="HEAD"), argsOnly=true)
    private Text rain$maskSignedMessage(Text message) {
        return this.rain$maskText(message);
    }

    @Inject(method={"method_1808"}, at={@At(value="INVOKE", target="Ljava/util/List;clear()V", ordinal=0, shift=At.Shift.AFTER)}, cancellable=true)
    private void rain$preserveChatHistory(boolean clearHistory, CallbackInfo ci) {
        if (\u0631\u062c.INSTANCE.shouldKeepHistory(clearHistory)) {
            ci.cancel();
        }
    }

    @ModifyVariable(method={"method_1803"}, at=@At(value="HEAD"), argsOnly=true)
    private String rain$maskHistory(String message) {
        if (!\u0634\u0627.INSTANCE.shouldMask()) {
            return message;
        }
        return \u0634\u0627.INSTANCE.maskForHistory(message);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Inject(method={"method_44811"}, at={@At(value="HEAD")}, cancellable=true)
    private void onChatMessage(Text message, MessageSignatureData signature, MessageIndicator indicator, CallbackInfo ci) {
        Text collapsed;
        if (!this.rain$rewritingAntiFloodMessage && (collapsed = \u0631\u062c.INSTANCE.processIncomingMessage(message)) != null) {
            ChatComponentAccessor accessor = (ChatComponentAccessor)((Object)this);
            List<ChatHudLine> messages = accessor.rain$getAllMessages();
            if (!messages.isEmpty()) {
                messages.remove(0);
            }
            accessor.rain$refreshTrimmedMessages();
            this.rain$rewritingAntiFloodMessage = true;
            try {
                ((ChatHud)this).addMessage(collapsed, signature, indicator);
            }
            finally {
                this.rain$rewritingAntiFloodMessage = false;
            }
            ci.cancel();
            return;
        }
        \u062c.INSTANCE.checkForMention(message);
        WayPointModule.INSTANCE.handleIncomingMessage(message);
    }

    @Inject(method={"method_1808"}, at={@At(value="HEAD")})
    private void rain$clearLineAnimations(boolean clearHistory, CallbackInfo ci) {
        \u0631\u062c.INSTANCE.onChatCleared();
        this.rain$visibleLineAnimations.clear();
        this.rain$visibleHeadBeforeAdd = null;
        this.rain$currentAnimatedLine = null;
        this.rain$currentAnimatedLineOffset = 0;
        this.rain$suppressVisibleAnimations = false;
    }

    @Unique
    private boolean rain$shouldAnimateChat() {
        return \u0630\u062c.INSTANCE.isEnabled() && (Boolean)\u0630\u062c.INSTANCE.getAnimateChat().getValue() != false;
    }

    @Unique
    private void rain$cleanupVisibleAnimations() {
        Iterator<Map.Entry<ChatHudLine.Visible, Long>> iterator2 = this.rain$visibleLineAnimations.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<ChatHudLine.Visible, Long> entry = iterator2.next();
            if (this.visibleMessages.contains(entry.getKey())) continue;
            iterator2.remove();
        }
    }

    @ModifyVariable(method={"method_1812"}, at=@At(value="HEAD"), argsOnly=true)
    private Text rain$maskSingleMessage(Text message) {
        return this.rain$maskText(message);
    }

    @Inject(method={"method_44813"}, at={@At(value="HEAD")})
    private void rain$disableRefreshAnimations(CallbackInfo ci) {
        this.rain$suppressVisibleAnimations = true;
        this.rain$visibleLineAnimations.clear();
    }
}

