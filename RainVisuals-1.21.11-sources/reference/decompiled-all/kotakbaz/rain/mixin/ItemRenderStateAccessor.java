package kotakbaz.rain.mixin;

import net.minecraft.client.render.item.ItemRenderState;
import net.minecraft.client.render.item.ItemRenderState.LayerRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

// $VF: Compiled from ItemRenderStateAccessor.java
@Mixin(ItemRenderState.class)
public interface ItemRenderStateAccessor {
   @Invoker("method_65610")
   LayerRenderState rain$callGetFirstLayer();
}
