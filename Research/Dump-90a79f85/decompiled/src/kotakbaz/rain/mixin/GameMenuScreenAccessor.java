/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4185
 *  net.minecraft.class_433
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package kotakbaz.rain.mixin;

import net.minecraft.class_4185;
import net.minecraft.class_433;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_433.class})
public interface GameMenuScreenAccessor {
    @Accessor(value="field_40792")
    public class_4185 rain$getExitButton();
}

