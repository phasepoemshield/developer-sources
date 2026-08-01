/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotakbaz.rain.module.modules.player.PasHiderModule;
import kotakbaz.rain.module.modules.player.PingInChatModule;
import kotakbaz.rain.module.modules.render.BetterHudModule;
import kotakbaz.rain.module.modules.render.WayPointModule;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.gui.hud.ChatHudLine;
import net.minecraft.client.gui.hud.MessageIndicator;
import net.minecraft.network.message.MessageSignatureData;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ChatHud.class})
public class MixinChatHud {
    @Shadow
    @Final
    private List<ChatHudLine.Visible> field_2064;
    @Unique
    private final Map<ChatHudLine.Visible, Long> rain$visibleLineAnimations = new IdentityHashMap<ChatHudLine.Visible, Long>();
    @Unique
    private ChatHudLine.Visible rain$visibleHeadBeforeAdd;
    @Unique
    private ChatHudLine.Visible rain$currentAnimatedLine;
    @Unique
    private int rain$currentAnimatedLineOffset = 0;
    @Unique
    private boolean rain$suppressVisibleAnimations = false;

    @Inject(method={"method_44811"}, at={@At(value="HEAD")})
    private void onChatMessage(Text message, MessageSignatureData signature, MessageIndicator indicator, CallbackInfo ci) {
        PingInChatModule.INSTANCE.checkForMention(message);
        WayPointModule.INSTANCE.handleIncomingMessage(message);
    }

    @Inject(method={"method_1805"}, at={@At(value="HEAD")})
    private void rain$prepareRender(DrawContext context, int currentTick, int mouseX, int mouseY, boolean focused, CallbackInfo ci) {
        if (!this.rain$shouldAnimateChat() && !this.rain$visibleLineAnimations.isEmpty()) {
            this.rain$visibleLineAnimations.clear();
        }
    }

    @Inject(method={"method_1808"}, at={@At(value="HEAD")})
    private void rain$clearLineAnimations(boolean clearHistory, CallbackInfo ci) {
        this.rain$visibleLineAnimations.clear();
        this.rain$visibleHeadBeforeAdd = null;
        this.rain$currentAnimatedLine = null;
        this.rain$currentAnimatedLineOffset = 0;
        this.rain$suppressVisibleAnimations = false;
    }

    @Inject(method={"method_44813"}, at={@At(value="HEAD")})
    private void rain$disableRefreshAnimations(CallbackInfo ci) {
        this.rain$suppressVisibleAnimations = true;
        this.rain$visibleLineAnimations.clear();
    }

    @Inject(method={"method_44813"}, at={@At(value="RETURN")})
    private void rain$enableRefreshAnimations(CallbackInfo ci) {
        this.rain$suppressVisibleAnimations = false;
        this.rain$visibleHeadBeforeAdd = null;
        this.rain$currentAnimatedLine = null;
        this.rain$currentAnimatedLineOffset = 0;
    }

    @Inject(method={"method_1815"}, at={@At(value="HEAD")})
    private void rain$captureVisibleHead(ChatHudLine line, CallbackInfo ci) {
        if (!this.rain$shouldAnimateChat() || this.rain$suppressVisibleAnimations) {
            this.rain$visibleHeadBeforeAdd = null;
            return;
        }
        this.rain$visibleHeadBeforeAdd = this.field_2064.isEmpty() ? null : this.field_2064.get(0);
    }

    @Inject(method={"method_1815"}, at={@At(value="RETURN")})
    private void rain$trackAnimatedVisibleLines(ChatHudLine line, CallbackInfo ci) {
        if (!this.rain$shouldAnimateChat() || this.rain$suppressVisibleAnimations) {
            return;
        }
        long now = System.nanoTime();
        for (ChatHudLine.Visible visible : this.field_2064) {
            if (visible == this.rain$visibleHeadBeforeAdd) break;
            this.rain$visibleLineAnimations.putIfAbsent(visible, now);
        }
        this.rain$visibleHeadBeforeAdd = null;
        this.rain$cleanupVisibleAnimations();
    }

    @Inject(method={"method_71991"}, at={@At(value="HEAD")})
    private void rain$captureTextLine(int lineY, DrawContext context, float textOpacity, int x2, int y, int currentMessageIndex, ChatHudLine.Visible visible, int lineHeight, float chatOpacity, CallbackInfo ci) {
        this.rain$currentAnimatedLine = visible;
        this.rain$currentAnimatedLineOffset = this.rain$getVisibleLineOffset(visible);
    }

    @Redirect(method={"method_71991"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_35720(Lnet/minecraft/class_327;Lnet/minecraft/class_5481;III)V"))
    private void rain$animateChatText(DrawContext context, TextRenderer textRenderer, OrderedText text, int x2, int y, int color) {
        context.drawTextWithShadow(textRenderer, text, x2 + this.rain$currentAnimatedLineOffset, y, color);
    }

    @Inject(method={"method_71992"}, at={@At(value="HEAD")})
    private void rain$captureBackgroundLine(DrawContext context, int width2, float backgroundOpacity, float textOpacity, int currentMessageIndex, int hoveredMessageIndex, int x2, int yTop, int yBottom, ChatHudLine.Visible visible, int lineHeight, float chatOpacity, CallbackInfo ci) {
        this.rain$currentAnimatedLine = visible;
        this.rain$currentAnimatedLineOffset = this.rain$getVisibleLineOffset(visible);
    }

    @Redirect(method={"method_71992"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_25294(IIIII)V", ordinal=0))
    private void rain$animateChatBackground(DrawContext context, int x1, int y1, int x2, int y2, int color) {
        int offset = this.rain$currentAnimatedLineOffset;
        context.fill(x1 + offset, y1, x2 + offset, y2, color);
    }

    @Redirect(method={"method_71992"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_25294(IIIII)V", ordinal=1))
    private void rain$animateChatIndicatorBar(DrawContext context, int x1, int y1, int x2, int y2, int color) {
        int offset = this.rain$currentAnimatedLineOffset;
        context.fill(x1 + offset, y1, x2 + offset, y2, color);
    }

    @ModifyVariable(method={"method_1812"}, at=@At(value="HEAD"), argsOnly=true)
    private Text rain$maskSingleMessage(Text message) {
        return this.rain$maskText(message);
    }

    @ModifyVariable(method={"method_44811"}, at=@At(value="HEAD"), argsOnly=true)
    private Text rain$maskSignedMessage(Text message) {
        return this.rain$maskText(message);
    }

    @ModifyVariable(method={"method_1803"}, at=@At(value="HEAD"), argsOnly=true)
    private String rain$maskHistory(String message) {
        if (!PasHiderModule.INSTANCE.shouldMask()) {
            return message;
        }
        return PasHiderModule.INSTANCE.maskForHistory(message);
    }

    private Text rain$maskText(Text message) {
        if (!PasHiderModule.INSTANCE.shouldMask()) {
            return message;
        }
        String masked = PasHiderModule.INSTANCE.maskIfSensitive(message.getString());
        if (masked == null || masked.equals(message.getString())) {
            return message;
        }
        return Text.literal((String)masked).setStyle(message.getStyle());
    }

    @Unique
    private boolean rain$shouldAnimateChat() {
        return BetterHudModule.INSTANCE.isEnabled() && (Boolean)BetterHudModule.INSTANCE.getAnimateChat().getValue() != false;
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
        double progress2 = Math.min((double)(System.nanoTime() - start) / 1.8E8, 1.0);
        double eased = 1.0 - Math.pow(1.0 - progress2, 2.0);
        if (progress2 >= 1.0) {
            this.rain$visibleLineAnimations.remove(visible);
        }
        return (int)Math.round((1.0 - eased) * -18.0);
    }

    @Unique
    private void rain$cleanupVisibleAnimations() {
        Iterator<Map.Entry<ChatHudLine.Visible, Long>> iterator2 = this.rain$visibleLineAnimations.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<ChatHudLine.Visible, Long> entry = iterator2.next();
            if (this.field_2064.contains(entry.getKey())) continue;
            iterator2.remove();
        }
    }
}

