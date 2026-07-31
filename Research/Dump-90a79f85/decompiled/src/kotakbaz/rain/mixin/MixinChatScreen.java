/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_332
 *  net.minecraft.class_342
 *  net.minecraft.class_408
 *  net.minecraft.class_437
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import java.util.List;
import java.util.Objects;
import kotakbaz.rain.mixin.TextFieldWidgetAccessor;
import kotakbaz.rain.module.modules.player.o_0;
import kotakbaz.rain.module.modules.render.k_0;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_342;
import net.minecraft.class_408;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_408.class})
public abstract class MixinChatScreen
extends class_437 {
    @Unique
    private static final int RAIN_PASSWORD_MASK_Y_OFFSET = -1;
    @Shadow
    protected class_342 field_2382;
    @Unique
    private long rain$chatOpenAnimationStart = -1L;
    @Unique
    private int rain$chatRenderOffset = 0;

    protected MixinChatScreen(class_2561 title) {
        super(title);
    }

    @Inject(method={"method_25426"}, at={@At(value="TAIL")})
    private void rain$initChatAnimation(CallbackInfo ci) {
        this.rain$chatOpenAnimationStart = System.currentTimeMillis();
    }

    @Inject(method={"method_25394"}, at={@At(value="HEAD")})
    private void rain$offsetChatInput(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (this.field_2382 == null) {
            return;
        }
        this.rain$chatRenderOffset = this.rain$getChatAnimationOffset();
        if (this.rain$chatRenderOffset != 0) {
            this.field_2382.method_46419(this.field_2382.method_46427() + this.rain$chatRenderOffset);
        }
    }

    @Redirect(method={"method_25394"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_25294(IIIII)V"))
    private void rain$animateChatInputBackground(class_332 context, int x1, int y1, int x2, int y2, int color) {
        int offset = this.rain$getChatAnimationOffset();
        context.method_25294(x1, y1 + offset, x2, y2 + offset, color);
    }

    @Inject(method={"method_25394"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_437;method_25394(Lnet/minecraft/class_332;IIF)V", shift=At.Shift.AFTER)})
    private void rain$renderPasswordPanels(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (!o_0.INSTANCE.shouldMask() || this.field_2382 == null || this.field_22793 == null) {
            return;
        }
        String text = this.field_2382.method_1882();
        if (text == null || text.isEmpty()) {
            return;
        }
        List<int[]> ranges = o_0.INSTANCE.findSensitiveRanges(text);
        if (ranges.isEmpty()) {
            return;
        }
        int firstCharacterIndex = ((TextFieldWidgetAccessor)this.field_2382).rain$getFirstCharacterIndex();
        if (firstCharacterIndex >= text.length()) {
            return;
        }
        int innerWidth = this.field_2382.method_1859();
        int visibleLength = this.field_22793.method_27523(text.substring(firstCharacterIndex), innerWidth).length();
        int visibleEnd = firstCharacterIndex + visibleLength;
        int baseX = this.field_2382.method_46426() + (this.field_2382.method_1851() ? 4 : 0);
        int n = this.field_2382.method_46427();
        int n2 = this.field_2382.method_25364();
        Objects.requireNonNull(this.field_22793);
        int top = n + (n2 - 9) / 2 + -1;
        Objects.requireNonNull(this.field_22793);
        int bottom = top + 9;
        for (int[] range : ranges) {
            if (range == null || range.length < 2) continue;
            int start = Math.max(range[0], firstCharacterIndex);
            int end = Math.min(range[1], visibleEnd);
            if (end <= start) continue;
            for (int index = start; index < end; ++index) {
                int x1 = baseX + this.field_22793.method_1727(text.substring(firstCharacterIndex, index));
                int x2 = baseX + this.field_22793.method_1727(text.substring(firstCharacterIndex, index + 1));
                if (x2 <= x1) continue;
                context.method_25294(x1, top, x2, bottom, -16777216);
            }
        }
    }

    @Inject(method={"method_25394"}, at={@At(value="RETURN")})
    private void rain$restoreChatInput(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (this.field_2382 != null && this.rain$chatRenderOffset != 0) {
            this.field_2382.method_46419(this.field_2382.method_46427() - this.rain$chatRenderOffset);
        }
        this.rain$chatRenderOffset = 0;
    }

    @Unique
    private boolean rain$shouldAnimateChat() {
        return k_0.INSTANCE.isEnabled() && (Boolean)k_0.INSTANCE.getAnimateChat().getValue() != false;
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

