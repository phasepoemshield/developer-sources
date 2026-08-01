package sg.mx;

import net.minecraft.client.gl.Framebuffer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Framebuffer.class)
public interface FBAccessor {
   @Accessor("depthAttachment")
   int getFrameBufferId();

   @Accessor("depthAttachment")
   void setFrameBufferId(int var1);
}
