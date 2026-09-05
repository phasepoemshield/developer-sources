/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1761
 *  net.minecraft.class_5321
 *  net.minecraft.class_7706
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package ruhack.phobia.a;

import net.minecraft.class_1761;
import net.minecraft.class_5321;
import net.minecraft.class_7706;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_7706.class})
public interface ar {
    @Accessor(value="INVENTORY")
    public static class_5321<class_1761> meteor$getInventory() {
        throw new AssertionError();
    }
}
