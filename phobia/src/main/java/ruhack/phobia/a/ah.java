/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_465
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package ruhack.phobia.a;

import net.minecraft.class_465;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_465.class})
public interface ah {
    @Accessor(value="field_2776")
    public int phobia$getX();

    @Accessor(value="field_2800")
    public int phobia$getY();

    @Accessor(value="field_2792")
    public int phobia$getBackgroundWidth();

    @Accessor(value="field_2779")
    public int phobia$getBackgroundHeight();
}

