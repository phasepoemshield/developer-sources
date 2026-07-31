/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  net.minecraft.class_2561
 *  net.minecraft.class_2960
 *  net.minecraft.class_327
 *  net.minecraft.class_332
 *  net.minecraft.class_3532
 *  net.minecraft.class_355
 *  net.minecraft.class_5481
 *  net.minecraft.class_7532
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package kotakbaz.rain.mixin;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import kotakbaz.rain.module.modules.render.k_0;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_355;
import net.minecraft.class_5481;
import net.minecraft.class_7532;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={class_355.class})
public class MixinPlayerListHud {
    public MixinPlayerListHud() {
        super();
    }

    @Redirect(method={"method_1919"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_25294(IIIII)V"))
    private void rain$fadeTabFill(class_332 context, int x1, int y1, int x2, int y2, int color) {
        context.method_25294(x1, y1, x2, y2, this.rain$fadeColor(color));
    }

    @Redirect(method={"method_1919"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_35720(Lnet/minecraft/class_327;Lnet/minecraft/class_5481;III)V"))
    private void rain$fadeTabOrderedText(class_332 context, class_327 renderer, class_5481 text, int x2, int y, int color) {
        context.method_35720(renderer, text, x2, y, this.rain$fadeColor(color));
    }

    @Redirect(method={"method_1919", "method_1922", "method_45590"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_27535(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;III)V"))
    private void rain$fadeTabText(class_332 context, class_327 renderer, class_2561 text, int x2, int y, int color) {
        context.method_27535(renderer, text, x2, y, this.rain$fadeColor(color));
    }

    @Redirect(method={"method_1923", "method_45590"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_52706(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_2960;IIII)V"))
    private void rain$fadeTabTexture(class_332 context, RenderPipeline pipeline, class_2960 texture, int x2, int y, int width2, int height) {
        context.method_71501(pipeline, texture, x2, y, width2, height, this.rain$tabAlpha());
    }

    @Redirect(method={"method_1919"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_7532;method_44445(Lnet/minecraft/class_332;Lnet/minecraft/class_2960;IIIZZI)V"))
    private void rain$fadeTabSkin(class_332 context, class_2960 texture, int x2, int y, int size, boolean hatVisible, boolean upsideDown, int color) {
        class_7532.method_44445((class_332)context, (class_2960)texture, (int)x2, (int)y, (int)size, (boolean)hatVisible, (boolean)upsideDown, (int)this.rain$fadeColor(color));
    }

    @Unique
    private int rain$fadeColor(int color) {
        float alpha2 = this.rain$tabAlpha();
        if (alpha2 >= 0.999f) {
            return color;
        }
        int fadedAlpha = class_3532.method_15340((int)Math.round((float)(color >>> 24 & 0xFF) * alpha2), (int)0, (int)255);
        return color & 0xFFFFFF | fadedAlpha << 24;
    }

    @Unique
    private float rain$tabAlpha() {
        return k_0.INSTANCE.isEnabled() && (Boolean)k_0.INSTANCE.getSmoothTab().getValue() != false ? k_0.INSTANCE.getTabProgress() : 1.0f;
    }
}

