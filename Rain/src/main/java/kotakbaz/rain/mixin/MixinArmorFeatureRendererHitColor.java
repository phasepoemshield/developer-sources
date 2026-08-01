/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.client.render.hitcolor.A;
import net.minecraft.client.render.entity.equipment.EquipmentRenderer;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={ArmorFeatureRenderer.class})
public abstract class MixinArmorFeatureRendererHitColor
implements A {
    @Shadow
    @Final
    private EquipmentRenderer field_54183;

    @Override
    public void rain$setOverlayCoords(int overlayCoords) {
        EquipmentRenderer equipmentRenderer = this.field_54183;
        if (equipmentRenderer instanceof A) {
            A overlayAware = (A)equipmentRenderer;
            overlayAware.rain$setOverlayCoords(overlayCoords);
        }
    }
}

