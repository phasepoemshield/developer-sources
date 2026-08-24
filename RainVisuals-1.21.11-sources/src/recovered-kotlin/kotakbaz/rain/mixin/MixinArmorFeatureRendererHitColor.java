package kotakbaz.rain.mixin;

import net.minecraft.client.render.entity.equipment.EquipmentRenderer;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import oxxxde.صً;

// $VF: Compiled from MixinArmorFeatureRendererHitColor.java
@Mixin(ArmorFeatureRenderer.class)
public abstract class MixinArmorFeatureRendererHitColor implements صً {
   @Shadow
   @Final
   private EquipmentRenderer equipmentRenderer;

   @Override
   public void rain$setOverlayCoords(int overlayCoords) {
      if (this.equipmentRenderer instanceof صً overlayAware) {
         overlayAware.rain$setOverlayCoords(overlayCoords);
      }
   }
}
