/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.entity.state.LivingEntityRenderState
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import oxxxde.\u0636\u0630;

@Mixin(value={LivingEntityRenderState.class})
public class MixinLivingEntityRenderStateHitColor
implements \u0636\u0630 {
    @Unique
    private int rain$entityId = Integer.MIN_VALUE;

    @Override
    public int rain$getEntityId() {
        return this.rain$entityId;
    }

    @Override
    public void rain$setEntityId(int entityId) {
        this.rain$entityId = entityId;
    }
}

