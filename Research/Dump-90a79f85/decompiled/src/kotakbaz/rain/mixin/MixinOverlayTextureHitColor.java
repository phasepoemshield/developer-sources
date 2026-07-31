/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1011
 *  net.minecraft.class_1043
 *  net.minecraft.class_4608
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import java.awt.Color;
import kotakbaz.rain.module.modules.render.X;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_4608;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_4608.class})
public abstract class MixinOverlayTextureHitColor {
    @Unique
    private static final int rain$VANILLA_HURT_COLOR = -1291911168;
    @Shadow
    @Final
    private class_1043 field_21013;
    @Unique
    private boolean rain$customEnabled;
    @Unique
    private int rain$lastColorRgb;
    @Unique
    private boolean rain$lastSmooth;

    public MixinOverlayTextureHitColor() {
        super();
    }

    @Inject(method={"method_23209"}, at={@At(value="HEAD")})
    private void rain$refreshHitColorTexture(CallbackInfo ci) {
        int colorRgb;
        boolean enabled = X.INSTANCE.isEnabled();
        Color color = enabled ? X.INSTANCE.getColor() : null;
        boolean smooth = enabled && X.INSTANCE.isSmoothEnabled();
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
        class_1011 image = this.field_21013.method_4525();
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
                image.method_61941(x2, y, hurtColor);
            }
        }
        this.field_21013.method_4524();
    }

    @Unique
    private static int rain$packColor(int red, int green, int blue, int alpha2) {
        int overlayAlpha = 255 - alpha2;
        return overlayAlpha << 24 | red << 16 | green << 8 | blue;
    }
}

