/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package kotakbaz.rain.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(targets={"net/minecraft/class_1796$class_1797"})
public interface ItemCooldownEntryAccessor {
    @Accessor(value="comp_3083")
    public int rain$getStartTick();

    @Accessor(value="comp_3084")
    public int rain$getEndTick();
}

