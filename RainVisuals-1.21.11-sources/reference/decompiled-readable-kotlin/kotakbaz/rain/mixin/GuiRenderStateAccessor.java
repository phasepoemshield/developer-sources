package kotakbaz.rain.mixin;

import net.minecraft.client.gui.ScreenRect;
import net.minecraft.client.gui.render.state.GuiRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

// $VF: Compiled from GuiRenderStateAccessor.java
@Mixin(GuiRenderState.class)
public interface GuiRenderStateAccessor {
   @Accessor("field_60455")
   void rain$setLastElementBounds(ScreenRect var1);
}
