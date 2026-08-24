package kotakbaz.rain.mixin;

import com.mojang.blaze3d.buffers.GpuBuffer;
import java.util.Map;
import net.minecraft.client.gl.PostEffectPass;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

// $VF: Compiled from PostPassAccessor.java
@Mixin(PostEffectPass.class)
public interface PostPassAccessor {
   @Accessor("field_60123")
   Map<String, GpuBuffer> rain$getCustomUniforms();
}
