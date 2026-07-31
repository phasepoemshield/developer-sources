/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.ModuleCustomFog;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={ClientWorld.class})
public class MixinCustomFogClientWorld {
    @Inject(method={"method_23777"}, at={@At(value="RETURN")}, cancellable=true)
    private void rain$modifySkyColor(Vec3d cameraPos, float tickProgress, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue((Object)ModuleCustomFog.INSTANCE.fogSkyArgb((Integer)cir.getReturnValue()));
    }
}

