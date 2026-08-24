/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.item.ItemRenderState
 *  net.minecraft.client.render.item.ItemRenderState$LayerRenderState
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.render.item.ItemRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={ItemRenderState.class})
public interface ItemRenderStateAccessor {
    @Invoker(value="method_65610")
    public ItemRenderState.LayerRenderState rain$callGetFirstLayer();
}

