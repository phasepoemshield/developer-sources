/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.render.GuiRenderer
 *  net.minecraft.client.gui.render.state.GuiRenderState
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.fog.FogRenderer
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.gui.render.GuiRenderer;
import net.minecraft.client.gui.render.state.GuiRenderState;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.fog.FogRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={GameRenderer.class})
public interface GameRendererAccessor {
    @Accessor(value="field_59965")
    public GuiRenderer rain$getGuiRenderer();

    @Accessor(value="field_60793")
    public FogRenderer rain$getFogRenderer();

    @Accessor(value="field_59966")
    public GuiRenderState rain$getGuiState();
}

