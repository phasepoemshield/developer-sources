/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10042
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package kotakbaz.rain.mixin;

import net.minecraft.class_10042;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_10042.class})
public interface LivingEntityRenderStateAccessor {
    @Accessor(value="field_53446")
    public float rain$getBodyYaw();

    @Accessor(value="field_53446")
    public void rain$setBodyYaw(float var1);
}

