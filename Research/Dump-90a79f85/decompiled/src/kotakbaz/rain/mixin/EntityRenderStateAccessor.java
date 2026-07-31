/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10017
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package kotakbaz.rain.mixin;

import net.minecraft.class_10017;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_10017.class})
public interface EntityRenderStateAccessor {
    @Accessor(value="field_53338")
    public class_243 rain$getNameLabelPos();

    @Accessor(value="field_53337")
    public class_2561 rain$getDisplayName();

    @Accessor(value="field_53334")
    public boolean rain$isSneaking();
}

