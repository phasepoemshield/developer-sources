/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.Click
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.screen.ChatScreen
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.widget.TextFieldWidget
 *  net.minecraft.text.Text
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import java.util.List;
import java.util.Objects;
import kotakbaz.rain.mixin.TextFieldWidgetAccessor;
import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.\u0630\u062c;
import oxxxde.\u0632\u0623;
import oxxxde.\u0634\u0627;

@Mixin(value={ChatScreen.class})
public abstract class MixinChatScreen
extends Screen {
    @Shadow
    protected TextFieldWidget chatField;
    @Unique
    private long rain$chatOpenAnimationStart = -1L;
    @Unique
    private static final int RAIN_PASSWORD_MASK_Y_OFFSET = -1;
    @Unique
    private int rain$chatRenderOffset = 0;

    protected MixinChatScreen(Text title) {
        super(title);
    }

    @Inject(method={"method_25394"}, at={@At(value="HEAD")})
    private void rain$offsetChatInput(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (this.chatField == null) {
            return;
        }
        this.rain$chatRenderOffset = this.rain$getChatAnimationOffset();
        if (this.rain$chatRenderOffset != 0) {
            this.chatField.setY(this.chatField.getY() + this.rain$chatRenderOffset);
        }
    }

    @Inject(method={"method_25394"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_437;method_25394(Lnet/minecraft/class_332;IIF)V", shift=At.Shift.AFTER)})
    private void rain$renderPasswordPanels(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (!\u0634\u0627.INSTANCE.shouldMask() || this.chatField == null || this.textRenderer == null) {
            return;
        }
        String text = this.chatField.getText();
        if (text == null || text.isEmpty()) {
            return;
        }
        List<int[]> ranges = \u0634\u0627.INSTANCE.findSensitiveRanges(text);
        if (ranges.isEmpty()) {
            return;
        }
        int firstCharacterIndex = ((TextFieldWidgetAccessor)this.chatField).rain$getFirstCharacterIndex();
        if (firstCharacterIndex >= text.length()) {
            return;
        }
        int innerWidth = this.chatField.getInnerWidth();
        int visibleLength = this.textRenderer.trimToWidth(text.substring(firstCharacterIndex), innerWidth).length();
        int visibleEnd = firstCharacterIndex + visibleLength;
        int baseX = this.chatField.getX() + (this.chatField.drawsBackground() ? 4 : 0);
        int n = this.chatField.getY();
        int n2 = this.chatField.getHeight();
        Objects.requireNonNull(this.textRenderer);
        int top = n + (n2 - 9) / 2 + -1;
        Objects.requireNonNull(this.textRenderer);
        int bottom = top + 9;
        for (int[] range : ranges) {
            if (range == null || range.length < 2) continue;
            int start = Math.max(range[0], firstCharacterIndex);
            int end = Math.min(range[1], visibleEnd);
            if (end <= start) continue;
            for (int index = start; index < end; ++index) {
                int x1 = baseX + this.textRenderer.getWidth(text.substring(firstCharacterIndex, index));
                int x2 = baseX + this.textRenderer.getWidth(text.substring(firstCharacterIndex, index + 1));
                if (x2 <= x1) continue;
                context.fill(x1, top, x2, bottom, -16777216);
            }
        }
    }

    @Inject(method={"method_25426"}, at={@At(value="TAIL")})
    private void rain$initChatAnimation(CallbackInfo ci) {
        this.rain$chatOpenAnimationStart = System.currentTimeMillis();
    }

    @Inject(method={"method_25401"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$resizeViewModelItem(double mouseX, double mouseY, double horizontalAmount, double verticalAmount, CallbackInfoReturnable<Boolean> cir) {
        if (\u0632\u0623.INSTANCE.scrollChatItem(mouseX, mouseY, verticalAmount, this.width, this.height)) {
            cir.setReturnValue((Object)true);
        }
    }

    @Inject(method={"method_25432"}, at={@At(value="TAIL")})
    private void rain$stopViewModelDrag(CallbackInfo ci) {
        \u0632\u0623.INSTANCE.endChatDrag();
    }

    @Inject(method={"method_25394"}, at={@At(value="RETURN")})
    private void rain$restoreChatInput(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (this.chatField != null && this.rain$chatRenderOffset != 0) {
            this.chatField.setY(this.chatField.getY() - this.rain$chatRenderOffset);
        }
        this.rain$chatRenderOffset = 0;
    }

    @Unique
    private int rain$getChatAnimationOffset() {
        if (!this.rain$shouldAnimateChat()) {
            return 0;
        }
        long now = System.currentTimeMillis();
        if (this.rain$chatOpenAnimationStart < 0L) {
            this.rain$chatOpenAnimationStart = now;
        }
        double progress = Math.min((double)(now - this.rain$chatOpenAnimationStart) / 160.0, 1.0);
        double eased = 1.0 - Math.pow(1.0 - progress, 2.0);
        return (int)Math.round((1.0 - eased) * 14.0);
    }

    public boolean mouseReleased(Click event) {
        boolean handled = event.button() == 0 && \u0632\u0623.INSTANCE.endChatDrag();
        return handled || super.mouseReleased(event);
    }

    @Redirect(method={"method_25394"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_25294(IIIII)V"))
    private void rain$animateChatInputBackground(DrawContext context, int x1, int y1, int x2, int y2, int color) {
        int offset = this.rain$getChatAnimationOffset();
        context.fill(x1, y1 + offset, x2, y2 + offset, color);
    }

    @Inject(method={"method_25402"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$startViewModelDrag(Click event, boolean doubled, CallbackInfoReturnable<Boolean> cir) {
        if (event.button() == 0 && \u0632\u0623.INSTANCE.beginChatDrag(event.x(), event.y(), this.width, this.height)) {
            cir.setReturnValue((Object)true);
        }
    }

    @Unique
    private boolean rain$shouldAnimateChat() {
        return \u0630\u062c.INSTANCE.isEnabled() && (Boolean)\u0630\u062c.INSTANCE.getAnimateChat().getValue() != false;
    }

    public boolean mouseDragged(Click event, double deltaX, double deltaY) {
        if (event.button() == 0 && \u0632\u0623.INSTANCE.dragChatItem(event.x(), event.y(), this.width, this.height)) {
            return true;
        }
        return super.mouseDragged(event, deltaX, deltaY);
    }
}

