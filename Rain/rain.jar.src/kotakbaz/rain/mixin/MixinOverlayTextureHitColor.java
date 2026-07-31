/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import java.awt.Color;
import kotakbaz.rain.module.modules.render.HitColorModule;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={OverlayTexture.class})
public abstract class MixinOverlayTextureHitColor {
    @Unique
    private static final int rain$VANILLA_HURT_COLOR = -1291911168;
    @Shadow
    @Final
    private NativeImageBackedTexture field_21013;
    @Unique
    private boolean rain$customEnabled;
    @Unique
    private int rain$lastColorRgb;
    @Unique
    private boolean rain$lastSmooth;

    @Inject(method={"method_23209"}, at={@At(value="HEAD")})
    private void rain$refreshHitColorTexture(CallbackInfo ci) {
        int colorRgb;
        boolean enabled = HitColorModule.INSTANCE.isEnabled();
        Color color = enabled ? HitColorModule.INSTANCE.getColor() : null;
        boolean smooth = enabled && HitColorModule.INSTANCE.isSmoothEnabled();
        int n2 = colorRgb = color != null ? color.getRGB() : 0;
        if (!(this.rain$customEnabled != enabled || this.rain$lastSmooth != smooth || enabled && this.rain$lastColorRgb != colorRgb)) {
            return;
        }
        this.rain$rebuildOverlay(color, smooth);
        this.rain$customEnabled = enabled;
        this.rain$lastColorRgb = colorRgb;
        this.rain$lastSmooth = smooth;
    }

    @Unique
    private void rain$rebuildOverlay(Color color, boolean smooth) {
        NativeImage image = this.field_21013.getImage();
        if (image == null) {
            return;
        }
        for (int y = 0; y < 8; ++y) {
            for (int x2 = 0; x2 < 16; ++x2) {
                int hurtColor;
                if (color == null) {
                    hurtColor = -1291911168;
                } else {
                    int alpha2 = smooth ? Math.round((float)color.getAlpha() * ((float)x2 / 15.0f)) : color.getAlpha();
                    hurtColor = MixinOverlayTextureHitColor.rain$packColor(color.getRed(), color.getGreen(), color.getBlue(), alpha2);
                }
                image.setColorArgb(x2, y, hurtColor);
            }
        }
        this.field_21013.upload();
    }

    @Unique
    private static int rain$packColor(int red, int green, int blue, int alpha2) {
        int overlayAlpha = 255 - alpha2;
        return overlayAlpha << 24 | red << 16 | green << 8 | blue;
    }
}

