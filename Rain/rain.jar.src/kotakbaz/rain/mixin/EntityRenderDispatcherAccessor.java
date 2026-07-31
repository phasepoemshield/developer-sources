/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={EntityRenderDispatcher.class})
public interface EntityRenderDispatcherAccessor {
    @Accessor(value="field_4681")
    public boolean rain$getRenderShadows();
}

