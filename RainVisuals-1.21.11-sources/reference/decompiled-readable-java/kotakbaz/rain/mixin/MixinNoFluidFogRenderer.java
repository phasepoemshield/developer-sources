/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.enums.CameraSubmersionType
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.render.fog.FogRenderer
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import net.minecraft.block.enums.CameraSubmersionType;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.fog.FogRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.\u0634\u0635;

@Mixin(value={FogRenderer.class})
public class MixinNoFluidFogRenderer {
    @Inject(method={"method_71652"}, at={@At(value="RETURN")}, cancellable=true)
    private void rain$clearFluidFog(Camera camera, CallbackInfoReturnable<CameraSubmersionType> cir) {
        boolean clearLava;
        CameraSubmersionType current = (CameraSubmersionType)cir.getReturnValue();
        boolean clearWater = current == CameraSubmersionType.WATER && \u0634\u0635.INSTANCE.shouldClearWaterFog();
        boolean bl = clearLava = current == CameraSubmersionType.LAVA && \u0634\u0635.INSTANCE.shouldClearLavaFog();
        if (!clearWater && !clearLava) {
            return;
        }
        cir.setReturnValue((Object)CameraSubmersionType.ATMOSPHERIC);
    }
}

