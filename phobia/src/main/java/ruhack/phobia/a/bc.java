/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_846$class_851
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 */
package ruhack.phobia.a;

import net.minecraft.class_846;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import ruhack.phobia.nh;

@Mixin(value={class_846.class_851.class})
public class bc
implements nh {
    @Unique
    private float animation = 100.0f;

    @Override
    public float getAnimation() {
        return this.animation;
    }

    @Override
    public void setAnimation(float value) {
        this.animation = value;
    }
}

