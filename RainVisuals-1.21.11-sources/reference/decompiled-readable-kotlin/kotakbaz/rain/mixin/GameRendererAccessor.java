package kotakbaz.rain.mixin;

import net.minecraft.client.gui.render.GuiRenderer;
import net.minecraft.client.gui.render.state.GuiRenderState;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.fog.FogRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

// $VF: Compiled from GameRendererAccessor.java
@Mixin(GameRenderer.class)
public interface GameRendererAccessor {
   @Accessor("field_59965")
   GuiRenderer rain$getGuiRenderer();

   @Accessor("field_60793")
   FogRenderer rain$getFogRenderer();

   @Accessor("field_59966")
   GuiRenderState rain$getGuiState();
}
