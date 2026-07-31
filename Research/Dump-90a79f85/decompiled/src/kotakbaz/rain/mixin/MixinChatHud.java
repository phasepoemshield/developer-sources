/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_303
 *  net.minecraft.class_303$class_7590
 *  net.minecraft.class_327
 *  net.minecraft.class_332
 *  net.minecraft.class_338
 *  net.minecraft.class_5481
 *  net.minecraft.class_7469
 *  net.minecraft.class_7591
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotakbaz.rain.module.modules.player.m_0;
import kotakbaz.rain.module.modules.player.o_0;
import kotakbaz.rain.module.modules.render.k_0;
import net.minecraft.class_2561;
import net.minecraft.class_303;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_338;
import net.minecraft.class_5481;
import net.minecraft.class_7469;
import net.minecraft.class_7591;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_338.class})
public class MixinChatHud {
    @Shadow
    @Final
    private List<class_303.class_7590> field_2064;
    @Unique
    private final Map<class_303.class_7590, Long> rain$visibleLineAnimations = new IdentityHashMap<class_303.class_7590, Long>();
    @Unique
    private class_303.class_7590 rain$visibleHeadBeforeAdd;
    @Unique
    private class_303.class_7590 rain$currentAnimatedLine;
    @Unique
    private int rain$currentAnimatedLineOffset = 0;
    @Unique
    private boolean rain$suppressVisibleAnimations = false;

    public MixinChatHud() {
        super();
    }

    @Inject(method={"method_44811"}, at={@At(value="HEAD")})
    private void onChatMessage(class_2561 message, class_7469 signature, class_7591 indicator, CallbackInfo ci) {
        m_0.INSTANCE.checkForMention(message);
        kotakbaz.rain.module.modules.render.o_0.INSTANCE.handleIncomingMessage(message);
    }

    @Inject(method={"method_1805"}, at={@At(value="HEAD")})
    private void rain$prepareRender(class_332 context, int currentTick, int mouseX, int mouseY, boolean focused, CallbackInfo ci) {
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
    private void rain$captureVisibleHead(class_303 line, CallbackInfo ci) {
        if (!this.rain$shouldAnimateChat() || this.rain$suppressVisibleAnimations) {
            this.rain$visibleHeadBeforeAdd = null;
            return;
        }
        this.rain$visibleHeadBeforeAdd = this.field_2064.isEmpty() ? null : this.field_2064.get(0);
    }

    @Inject(method={"method_1815"}, at={@At(value="RETURN")})
    private void rain$trackAnimatedVisibleLines(class_303 line, CallbackInfo ci) {
        if (!this.rain$shouldAnimateChat() || this.rain$suppressVisibleAnimations) {
            return;
        }
        long now = System.nanoTime();
        for (class_303.class_7590 visible : this.field_2064) {
            if (visible == this.rain$visibleHeadBeforeAdd) break;
            this.rain$visibleLineAnimations.putIfAbsent(visible, now);
        }
        this.rain$visibleHeadBeforeAdd = null;
        this.rain$cleanupVisibleAnimations();
    }

    @Inject(method={"method_71991"}, at={@At(value="HEAD")})
    private void rain$captureTextLine(int lineY, class_332 context, float textOpacity, int x, int y, int currentMessageIndex, class_303.class_7590 visible, int lineHeight, float chatOpacity, CallbackInfo ci) {
        this.rain$currentAnimatedLine = visible;
        this.rain$currentAnimatedLineOffset = this.rain$getVisibleLineOffset(visible);
    }

    @Redirect(method={"method_71991"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_35720(Lnet/minecraft/class_327;Lnet/minecraft/class_5481;III)V"))
    private void rain$animateChatText(class_332 context, class_327 textRenderer, class_5481 text, int x, int y, int color) {
        context.method_35720(textRenderer, text, x + this.rain$currentAnimatedLineOffset, y, color);
    }

    @Inject(method={"method_71992"}, at={@At(value="HEAD")})
    private void rain$captureBackgroundLine(class_332 context, int width2, float backgroundOpacity, float textOpacity, int currentMessageIndex, int hoveredMessageIndex, int x, int yTop, int yBottom, class_303.class_7590 visible, int lineHeight, float chatOpacity, CallbackInfo ci) {
        this.rain$currentAnimatedLine = visible;
        this.rain$currentAnimatedLineOffset = this.rain$getVisibleLineOffset(visible);
    }

    @Redirect(method={"method_71992"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_25294(IIIII)V", ordinal=0))
    private void rain$animateChatBackground(class_332 context, int x1, int y1, int x2, int y2, int color) {
        int offset = this.rain$currentAnimatedLineOffset;
        context.method_25294(x1 + offset, y1, x2 + offset, y2, color);
    }

    @Redirect(method={"method_71992"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_25294(IIIII)V", ordinal=1))
    private void rain$animateChatIndicatorBar(class_332 context, int x1, int y1, int x2, int y2, int color) {
        int offset = this.rain$currentAnimatedLineOffset;
        context.method_25294(x1 + offset, y1, x2 + offset, y2, color);
    }

    @ModifyVariable(method={"method_1812"}, at=@At(value="HEAD"), argsOnly=true)
    private class_2561 rain$maskSingleMessage(class_2561 message) {
        return this.rain$maskText(message);
    }

    @ModifyVariable(method={"method_44811"}, at=@At(value="HEAD"), argsOnly=true)
    private class_2561 rain$maskSignedMessage(class_2561 message) {
        return this.rain$maskText(message);
    }

    @ModifyVariable(method={"method_1803"}, at=@At(value="HEAD"), argsOnly=true)
    private String rain$maskHistory(String message) {
        if (!o_0.INSTANCE.shouldMask()) {
            return message;
        }
        return o_0.INSTANCE.maskForHistory(message);
    }

    private class_2561 rain$maskText(class_2561 message) {
        if (!o_0.INSTANCE.shouldMask()) {
            return message;
        }
        String masked = o_0.INSTANCE.maskIfSensitive(message.getString());
        if (masked == null || masked.equals(message.getString())) {
            return message;
        }
        return class_2561.method_43470((String)masked).method_10862(message.method_10866());
    }

    @Unique
    private boolean rain$shouldAnimateChat() {
        return k_0.INSTANCE.isEnabled() && (Boolean)k_0.INSTANCE.getAnimateChat().getValue() != false;
    }

    @Unique
    private int rain$getVisibleLineOffset(class_303.class_7590 visible) {
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
        Iterator<Map.Entry<class_303.class_7590, Long>> iterator2 = this.rain$visibleLineAnimations.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<class_303.class_7590, Long> entry = iterator2.next();
            if (this.field_2064.contains(entry.getKey())) continue;
            iterator2.remove();
        }
    }
}

