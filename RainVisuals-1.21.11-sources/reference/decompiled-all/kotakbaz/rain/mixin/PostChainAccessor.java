package kotakbaz.rain.mixin;

import java.util.List;
import net.minecraft.client.gl.PostEffectPass;
import net.minecraft.client.gl.PostEffectProcessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

// $VF: Compiled from PostChainAccessor.java
@Mixin(PostEffectProcessor.class)
public interface PostChainAccessor {
   @Accessor("field_1497")
   List<PostEffectPass> rain$getPasses();
}
