/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.NoFluidModule;
import net.minecraft.block.enums.CameraSubmersionType;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.fog.FogRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={FogRenderer.class})
public class MixinNoFluidFogRenderer {
    @Inject(method={"method_71652"}, at={@At(value="RETURN")}, cancellable=true)
    private void rain$clearFluidFog(Camera camera, boolean thickFog, CallbackInfoReturnable<CameraSubmersionType> cir) {
        boolean clearLava;
        CameraSubmersionType current = (CameraSubmersionType)cir.getReturnValue();
        boolean clearWater = current == CameraSubmersionType.WATER && NoFluidModule.INSTANCE.shouldClearWaterFog();
        boolean bl = clearLava = current == CameraSubmersionType.LAVA && NoFluidModule.INSTANCE.shouldClearLavaFog();
        if (!clearWater && !clearLava) {
            return;
        }
        cir.setReturnValue((Object)(thickFog ? CameraSubmersionType.DIMENSION_OR_BOSS : CameraSubmersionType.ATMOSPHERIC));
    }
}

