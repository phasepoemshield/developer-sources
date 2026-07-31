/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10042
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.client.render.hitcolor.a_0;
import net.minecraft.class_10042;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value={class_10042.class})
public class MixinLivingEntityRenderStateHitColor
implements a_0 {
    @Unique
    private int rain$entityId = Integer.MIN_VALUE;

    public MixinLivingEntityRenderStateHitColor() {
        super();
    }

    @Override
    public int rain$getEntityId() {
        return this.rain$entityId;
    }

    @Override
    public void rain$setEntityId(int entityId) {
        this.rain$entityId = entityId;
    }
}

