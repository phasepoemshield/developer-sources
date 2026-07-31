/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import kotakbaz.rain.module.modules.render.BetterHudModule;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.PlayerSkinDrawer;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={PlayerListHud.class})
public class MixinPlayerListHud {
    @Redirect(method={"method_1919"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_25294(IIIII)V"))
    private void rain$fadeTabFill(DrawContext context, int x1, int y1, int x2, int y2, int color) {
        context.fill(x1, y1, x2, y2, this.rain$fadeColor(color));
    }

    @Redirect(method={"method_1919"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_35720(Lnet/minecraft/class_327;Lnet/minecraft/class_5481;III)V"))
    private void rain$fadeTabOrderedText(DrawContext context, TextRenderer renderer, OrderedText text, int x2, int y, int color) {
        context.drawTextWithShadow(renderer, text, x2, y, this.rain$fadeColor(color));
    }

    @Redirect(method={"method_1919", "method_1922", "method_45590"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_27535(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;III)V"))
    private void rain$fadeTabText(DrawContext context, TextRenderer renderer, Text text, int x2, int y, int color) {
        context.drawTextWithShadow(renderer, text, x2, y, this.rain$fadeColor(color));
    }

    @Redirect(method={"method_1923", "method_45590"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_52706(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_2960;IIII)V"))
    private void rain$fadeTabTexture(DrawContext context, RenderPipeline pipeline, Identifier texture, int x2, int y, int width2, int height) {
        context.drawGuiTexture(pipeline, texture, x2, y, width2, height, this.rain$tabAlpha());
    }

    @Redirect(method={"method_1919"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_7532;method_44445(Lnet/minecraft/class_332;Lnet/minecraft/class_2960;IIIZZI)V"))
    private void rain$fadeTabSkin(DrawContext context, Identifier texture, int x2, int y, int size, boolean hatVisible, boolean upsideDown, int color) {
        PlayerSkinDrawer.draw((DrawContext)context, (Identifier)texture, (int)x2, (int)y, (int)size, (boolean)hatVisible, (boolean)upsideDown, (int)this.rain$fadeColor(color));
    }

    @Unique
    private int rain$fadeColor(int color) {
        float alpha2 = this.rain$tabAlpha();
        if (alpha2 >= 0.999f) {
            return color;
        }
        int fadedAlpha = MathHelper.clamp((int)Math.round((float)(color >>> 24 & 0xFF) * alpha2), (int)0, (int)255);
        return color & 0xFFFFFF | fadedAlpha << 24;
    }

    @Unique
    private float rain$tabAlpha() {
        return BetterHudModule.INSTANCE.isEnabled() && (Boolean)BetterHudModule.INSTANCE.getSmoothTab().getValue() != false ? BetterHudModule.INSTANCE.getTabProgress() : 1.0f;
    }
}

