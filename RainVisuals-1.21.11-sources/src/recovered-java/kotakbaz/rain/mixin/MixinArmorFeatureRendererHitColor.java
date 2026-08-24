/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.entity.equipment.EquipmentRenderer
 *  net.minecraft.client.render.entity.feature.ArmorFeatureRenderer
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.render.entity.equipment.EquipmentRenderer;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import oxxxde.\u0635\u064b;

@Mixin(value={ArmorFeatureRenderer.class})
public abstract class MixinArmorFeatureRendererHitColor
implements \u0635\u064b {
    @Shadow
    @Final
    private EquipmentRenderer equipmentRenderer;

    @Override
    public void rain$setOverlayCoords(int overlayCoords) {
        EquipmentRenderer equipmentRenderer = this.equipmentRenderer;
        if (equipmentRenderer instanceof \u0635\u064b) {
            \u0635\u064b overlayAware = (\u0635\u064b)equipmentRenderer;
            overlayAware.rain$setOverlayCoords(overlayCoords);
        }
    }
}

