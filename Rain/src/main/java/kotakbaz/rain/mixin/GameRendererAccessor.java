/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.gui.render.state.GuiRenderState;
import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={GameRenderer.class})
public interface GameRendererAccessor {
    @Accessor(value="field_59966")
    public GuiRenderState rain$getGuiState();
}

