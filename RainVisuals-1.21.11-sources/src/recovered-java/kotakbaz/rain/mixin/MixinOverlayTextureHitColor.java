/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  net.minecraft.client.render.OverlayTexture
 *  net.minecraft.client.texture.NativeImage
 *  net.minecraft.client.texture.NativeImageBackedTexture
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import com.mojang.blaze3d.textures.GpuTextureView;
import java.awt.Color;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.\u0631\u0625;

@Mixin(value={OverlayTexture.class})
public abstract class MixinOverlayTextureHitColor {
    @Shadow
    @Final
    private NativeImageBackedTexture texture;
    @Unique
    private int rain$lastColorRgb;
    @Unique
    private boolean rain$customEnabled;
    @Unique
    private boolean rain$lastSmooth;
    @Unique
    private static final int rain$VANILLA_HURT_COLOR = -1291911168;

    @Unique
    private static int rain$packColor(int red, int green, int blue, int alpha) {
        int overlayAlpha = 255 - alpha;
        return overlayAlpha << 24 | red << 16 | green << 8 | blue;
    }

    @Inject(method={"method_76037"}, at={@At(value="HEAD")})
    private void rain$refreshHitColorTexture(CallbackInfoReturnable<GpuTextureView> cir) {
        int colorRgb;
        boolean enabled = \u0631\u0625.INSTANCE.isEnabled();
        Color color = enabled ? \u0631\u0625.INSTANCE.getColor() : null;
        boolean smooth = enabled && \u0631\u0625.INSTANCE.isSmoothEnabled();
        int n = colorRgb = color != null ? color.getRGB() : 0;
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
        NativeImage image = this.texture.getImage();
        if (image == null) {
            return;
        }
        for (int y = 0; y < 8; ++y) {
            for (int x = 0; x < 16; ++x) {
                int hurtColor;
                if (color == null) {
                    hurtColor = -1291911168;
                } else {
                    int alpha = smooth ? Math.round((float)color.getAlpha() * ((float)x / 15.0f)) : color.getAlpha();
                    hurtColor = MixinOverlayTextureHitColor.rain$packColor(color.getRed(), color.getGreen(), color.getBlue(), alpha);
                }
                image.setColorArgb(x, y, hurtColor);
            }
        }
        this.texture.upload();
    }
}

