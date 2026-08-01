/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={EntityRenderer.class})
public interface EntityRendererAccessor {
    @Invoker(value="method_62425")
    public EntityRenderState rain$invokeGetAndUpdateRenderState(Entity var1, float var2);
}

