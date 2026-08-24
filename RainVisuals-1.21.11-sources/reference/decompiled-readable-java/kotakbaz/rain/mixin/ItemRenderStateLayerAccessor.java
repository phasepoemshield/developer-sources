/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.RenderLayer
 *  net.minecraft.client.render.item.ItemRenderState$LayerRenderState
 *  net.minecraft.client.render.model.json.Transformation
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.item.ItemRenderState;
import net.minecraft.client.render.model.json.Transformation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={ItemRenderState.LayerRenderState.class})
public interface ItemRenderStateLayerAccessor {
    @Accessor(value="field_56967")
    public Transformation rain$getTransform();

    @Accessor(value="field_55347")
    public RenderLayer rain$getRenderLayer();
}

