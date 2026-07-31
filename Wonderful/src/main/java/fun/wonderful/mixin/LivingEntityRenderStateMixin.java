package fun.wonderful.mixin;

import fun.wonderful.client.modules.impl.render.SeeInvisiblesRenderState;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value={LivingEntityRenderState.class})
public class LivingEntityRenderStateMixin
implements SeeInvisiblesRenderState {
    @Unique
    private boolean wonderful$seeInvisiblesTarget;

    @Override
    public boolean wonderful$isSeeInvisiblesTarget() {
        return this.wonderful$seeInvisiblesTarget;
    }

    @Override
    public void wonderful$setSeeInvisiblesTarget(boolean value) {
        this.wonderful$seeInvisiblesTarget = value;
    }
}