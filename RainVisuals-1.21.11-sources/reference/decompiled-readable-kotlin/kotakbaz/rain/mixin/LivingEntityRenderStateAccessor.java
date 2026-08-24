package kotakbaz.rain.mixin;

import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

// $VF: Compiled from LivingEntityRenderStateAccessor.java
@Mixin(LivingEntityRenderState.class)
public interface LivingEntityRenderStateAccessor {
   @Accessor("field_53446")
   void rain$setBodyYaw(float var1);

   @Accessor("field_53446")
   float rain$getBodyYaw();
}
