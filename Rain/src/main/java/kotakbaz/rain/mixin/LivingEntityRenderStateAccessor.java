/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={LivingEntityRenderState.class})
public interface LivingEntityRenderStateAccessor {
    @Accessor(value="field_53446")
    public float rain$getBodyYaw();

    @Accessor(value="field_53446")
    public void rain$setBodyYaw(float var1);
}

