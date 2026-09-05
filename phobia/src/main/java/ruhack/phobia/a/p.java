/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_638
 *  net.minecraft.class_638$class_5271
 *  net.minecraft.class_7202
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package ruhack.phobia.a;

import net.minecraft.class_638;
import net.minecraft.class_7202;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_638.class})
public interface p {
    @Accessor(value="field_37951")
    public class_7202 phobia$getPendingUpdateManager();

    @Accessor(value="field_24430")
    public class_638.class_5271 phobia$getClientWorldProperties();
}

