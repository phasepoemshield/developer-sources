/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.PlayerSkinDrawer
 *  net.minecraft.client.gui.hud.PlayerListHud
 *  net.minecraft.client.network.PlayerListEntry
 *  net.minecraft.text.OrderedText
 *  net.minecraft.text.Text
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.math.MathHelper
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.PlayerSkinDrawer;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.\u062d\u063a;
import oxxxde.\u0630\u062c;
import oxxxde.\u0631\u0627;
import oxxxde.\u0637\u0626;

@Mixin(value={PlayerListHud.class})
public class MixinPlayerListHud {
    @Unique
    private int rain$fadeColor(int color) {
        float alpha = this.rain$tabAlpha();
        if (alpha >= 0.999f) {
            return color;
        }
        int fadedAlpha = MathHelper.clamp((int)Math.round((float)(color >>> 24 & 0xFF) * alpha), (int)0, (int)255);
        return color & 0xFFFFFF | fadedAlpha << 24;
    }

    @Redirect(method={"method_1919"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_7532;method_44445(Lnet/minecraft/class_332;Lnet/minecraft/class_2960;IIIZZI)V"))
    private void rain$fadeTabSkin(DrawContext context, Identifier texture, int x, int y, int size, boolean hatVisible, boolean upsideDown, int color) {
        PlayerSkinDrawer.draw((DrawContext)context, (Identifier)texture, (int)x, (int)y, (int)size, (boolean)hatVisible, (boolean)upsideDown, (int)this.rain$fadeColor(color));
    }

    @Unique
    private float rain$tabAlpha() {
        return \u0630\u062c.INSTANCE.isEnabled() && (Boolean)\u0630\u062c.INSTANCE.getSmoothTab().getValue() != false ? \u0630\u062c.INSTANCE.getTabProgress() : 1.0f;
    }

    @Redirect(method={"method_1919", "method_1922", "method_45590"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_27535(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;III)V"))
    private void rain$fadeTabText(DrawContext context, TextRenderer renderer, Text text, int x, int y, int color) {
        int fadedColor = this.rain$fadeColor(color);
        if (\u0631\u0627.isMarked(text)) {
            \u0637\u0626.enqueueA((float)x + 4.0f, y, 9.0f, this.rain$fadeColor(-1));
        }
        context.drawTextWithShadow(renderer, text, x, y, fadedColor);
    }

    @Inject(method={"method_1918"}, at={@At(value="RETURN")}, cancellable=true)
    private void rain$addSocialMarker(PlayerListEntry playerInfo, CallbackInfoReturnable<Text> cir) {
        Text displayName = (Text)cir.getReturnValue();
        if (displayName == null || \u0631\u0627.isMarked(displayName) || !\u062d\u063a.INSTANCE.isRainUser(playerInfo.getProfile().id())) {
            return;
        }
        cir.setReturnValue((Object)\u0631\u0627.markForTab(displayName));
    }

    @Redirect(method={"method_1919"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_35720(Lnet/minecraft/class_327;Lnet/minecraft/class_5481;III)V"))
    private void rain$fadeTabOrderedText(DrawContext context, TextRenderer renderer, OrderedText text, int x, int y, int color) {
        context.drawTextWithShadow(renderer, text, x, y, this.rain$fadeColor(color));
    }

    @Redirect(method={"method_1919"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_25294(IIIII)V"))
    private void rain$fadeTabFill(DrawContext context, int x1, int y1, int x2, int y2, int color) {
        context.fill(x1, y1, x2, y2, this.rain$fadeColor(color));
    }

    @Redirect(method={"method_1923", "method_45590"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_52706(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_2960;IIII)V"))
    private void rain$fadeTabTexture(DrawContext context, RenderPipeline pipeline, Identifier texture, int x, int y, int width, int height) {
        context.drawGuiTexture(pipeline, texture, x, y, width, height, this.rain$tabAlpha());
    }
}

