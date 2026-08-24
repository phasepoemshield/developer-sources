/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.render.SkyRendering
 *  net.minecraft.client.render.state.SkyRenderState
 *  net.minecraft.client.world.ClientWorld
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.render.Camera;
import net.minecraft.client.render.SkyRendering;
import net.minecraft.client.render.state.SkyRenderState;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u0628\u0624;

@Mixin(value={SkyRendering.class})
public class MixinCustomFogClientWorld {
    @Inject(method={"method_74926"}, at={@At(value="RETURN")})
    private void rain$modifySkyColor(ClientWorld level, float tickProgress, Camera camera, SkyRenderState state, CallbackInfo ci) {
        state.skyColor = \u0628\u0624.INSTANCE.fogSkyArgb(state.skyColor);
    }
}

