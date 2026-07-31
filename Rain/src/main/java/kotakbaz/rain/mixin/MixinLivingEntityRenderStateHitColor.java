/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.client.render.hitcolor.a_0;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value={LivingEntityRenderState.class})
public class MixinLivingEntityRenderStateHitColor
implements a_0 {
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

