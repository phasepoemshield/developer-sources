/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10197
 *  net.minecraft.class_970
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.client.render.hitcolor.A;
import net.minecraft.class_10197;
import net.minecraft.class_970;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={class_970.class})
public abstract class MixinArmorFeatureRendererHitColor
implements A {
    @Shadow
    @Final
    private class_10197 field_54183;

    public MixinArmorFeatureRendererHitColor() {
        super();
    }

    @Override
    public void rain$setOverlayCoords(int overlayCoords) {
        class_10197 class_101972 = this.field_54183;
        if (class_101972 instanceof A) {
            A overlayAware = (A)class_101972;
            overlayAware.rain$setOverlayCoords(overlayCoords);
        }
    }
}

