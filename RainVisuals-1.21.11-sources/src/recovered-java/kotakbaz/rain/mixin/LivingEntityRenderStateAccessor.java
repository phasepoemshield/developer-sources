/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.entity.state.LivingEntityRenderState
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={LivingEntityRenderState.class})
public interface LivingEntityRenderStateAccessor {
    @Accessor(value="field_53446")
    public void rain$setBodyYaw(float var1);

    @Accessor(value="field_53446")
    public float rain$getBodyYaw();
}

