package kotakbaz.rain.mixin;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.item.ItemRenderState.LayerRenderState;
import net.minecraft.client.render.model.json.Transformation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

// $VF: Compiled from ItemRenderStateLayerAccessor.java
@Mixin(LayerRenderState.class)
public interface ItemRenderStateLayerAccessor {
   @Accessor("field_56967")
   Transformation rain$getTransform();

   @Accessor("field_55347")
   RenderLayer rain$getRenderLayer();
}
