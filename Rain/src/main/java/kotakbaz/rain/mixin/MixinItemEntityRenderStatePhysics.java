/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.client.render.item.a;
import net.minecraft.client.render.entity.state.ItemEntityRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value={ItemEntityRenderState.class})
public class MixinItemEntityRenderStatePhysics
implements a {
    @Unique
    private boolean rain$isBlock;
    @Unique
    private boolean rain$additionalOffset;
    @Unique
    private float rain$xRot;
    @Unique
    private float rain$yRot;

    @Override
    public boolean rain$isBlock() {
        return this.rain$isBlock;
    }

    @Override
    public void rain$setBlock(boolean value2) {
        this.rain$isBlock = value2;
    }

    @Override
    public boolean rain$hasAdditionalOffset() {
        return this.rain$additionalOffset;
    }

    @Override
    public void rain$setAdditionalOffset(boolean value2) {
        this.rain$additionalOffset = value2;
    }

    @Override
    public float rain$getXRot() {
        return this.rain$xRot;
    }

    @Override
    public void rain$setXRot(float value2) {
        this.rain$xRot = value2;
    }

    @Override
    public float rain$getYRot() {
        return this.rain$yRot;
    }

    @Override
    public void rain$setYRot(float value2) {
        this.rain$yRot = value2;
    }
}

