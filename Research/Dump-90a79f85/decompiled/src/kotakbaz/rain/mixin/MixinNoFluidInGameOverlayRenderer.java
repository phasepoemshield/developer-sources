/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_3611
 *  net.minecraft.class_4603
 *  net.minecraft.class_6862
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.d_0;
import net.minecraft.class_3611;
import net.minecraft.class_4603;
import net.minecraft.class_6862;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={class_4603.class})
public class MixinNoFluidInGameOverlayRenderer {
    public MixinNoFluidInGameOverlayRenderer() {
        super();
    }

    @Redirect(method={"method_23067"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_746;method_5777(Lnet/minecraft/class_6862;)Z"))
    private boolean rain$skipUnderwaterOverlay(class_746 player, class_6862<class_3611> tag) {
        if (d_0.INSTANCE.shouldClearWaterOverlay()) {
            return false;
        }
        return player.method_5777(tag);
    }
}

