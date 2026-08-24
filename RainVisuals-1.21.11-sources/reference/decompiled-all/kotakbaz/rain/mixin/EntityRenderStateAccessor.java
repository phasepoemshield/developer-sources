package kotakbaz.rain.mixin;

import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

// $VF: Compiled from EntityRenderStateAccessor.java
@Mixin(EntityRenderState.class)
public interface EntityRenderStateAccessor {
   @Accessor("field_53337")
   Text rain$getDisplayName();

   @Accessor("field_53338")
   Vec3d rain$getNameLabelPos();

   @Accessor("field_53334")
   boolean rain$isSneaking();
}
