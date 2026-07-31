/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import java.util.List;
import java.util.Objects;
import kotakbaz.rain.mixin.TextFieldWidgetAccessor;
import kotakbaz.rain.module.modules.player.PasHiderModule;
import kotakbaz.rain.module.modules.render.BetterHudModule;
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

@Mixin(value={ChatScreen.class})
public abstract class MixinChatScreen
extends Screen {
    @Unique
    private static final int RAIN_PASSWORD_MASK_Y_OFFSET = -1;
    @Shadow
    protected TextFieldWidget field_2382;
    @Unique
    private long rain$chatOpenAnimationStart = -1L;
    @Unique
    private int rain$chatRenderOffset = 0;

    protected MixinChatScreen(Text title) {
        super(title);
    }

    @Inject(method={"method_25426"}, at={@At(value="TAIL")})
    private void rain$initChatAnimation(CallbackInfo ci) {
        this.rain$chatOpenAnimationStart = System.currentTimeMillis();
    }

    @Inject(method={"method_25394"}, at={@At(value="HEAD")})
    private void rain$offsetChatInput(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (this.field_2382 == null) {
            return;
        }
        this.rain$chatRenderOffset = this.rain$getChatAnimationOffset();
        if (this.rain$chatRenderOffset != 0) {
            this.field_2382.setY(this.field_2382.getY() + this.rain$chatRenderOffset);
        }
    }

    @Redirect(method={"method_25394"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_25294(IIIII)V"))
    private void rain$animateChatInputBackground(DrawContext context, int x1, int y1, int x2, int y2, int color) {
        int offset = this.rain$getChatAnimationOffset();
        context.fill(x1, y1 + offset, x2, y2 + offset, color);
    }

    @Inject(method={"method_25394"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_437;method_25394(Lnet/minecraft/class_332;IIF)V", shift=At.Shift.AFTER)})
    private void rain$renderPasswordPanels(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (!PasHiderModule.INSTANCE.shouldMask() || this.field_2382 == null || this.textRenderer == null) {
            return;
        }
        String text = this.field_2382.getText();
        if (text == null || text.isEmpty()) {
            return;
        }
        List<int[]> ranges = PasHiderModule.INSTANCE.findSensitiveRanges(text);
        if (ranges.isEmpty()) {
            return;
        }
        int firstCharacterIndex = ((TextFieldWidgetAccessor)this.field_2382).rain$getFirstCharacterIndex();
        if (firstCharacterIndex >= text.length()) {
            return;
        }
        int innerWidth = this.field_2382.getInnerWidth();
        int visibleLength = this.textRenderer.trimToWidth(text.substring(firstCharacterIndex), innerWidth).length();
        int visibleEnd = firstCharacterIndex + visibleLength;
        int baseX = this.field_2382.getX() + (this.field_2382.drawsBackground() ? 4 : 0);
        int n2 = this.field_2382.getY();
        int n3 = this.field_2382.getHeight();
        Objects.requireNonNull(this.textRenderer);
        int top = n2 + (n3 - 9) / 2 + -1;
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

    @Inject(method={"method_25394"}, at={@At(value="RETURN")})
    private void rain$restoreChatInput(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (this.field_2382 != null && this.rain$chatRenderOffset != 0) {
            this.field_2382.setY(this.field_2382.getY() - this.rain$chatRenderOffset);
        }
        this.rain$chatRenderOffset = 0;
    }

    @Unique
    private boolean rain$shouldAnimateChat() {
        return BetterHudModule.INSTANCE.isEnabled() && (Boolean)BetterHudModule.INSTANCE.getAnimateChat().getValue() != false;
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
        double progress2 = Math.min((double)(now - this.rain$chatOpenAnimationStart) / 160.0, 1.0);
        double eased = 1.0 - Math.pow(1.0 - progress2, 2.0);
        return (int)Math.round((1.0 - eased) * 14.0);
    }
}

