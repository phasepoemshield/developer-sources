package fun.nexisdlc.mixins.render;

import com.llamalad7.mixinextras.sugar.Local;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.world.EventFog;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.fog.FogData;
import net.minecraft.client.render.fog.FogRenderer;
import net.minecraft.client.world.ClientWorld;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FogRenderer.class)
public class FogRendererMixin {
    @Inject(
            method = "getFogColor(Lnet/minecraft/client/render/Camera;FLnet/minecraft/client/world/ClientWorld;IF)Lorg/joml/Vector4f;",
            at = @At("RETURN"),
            cancellable = true
    )
    private void nullform$getFogColor(Camera camera, float tickProgress, ClientWorld world, int viewDistance, float skyDarkness, CallbackInfoReturnable<Vector4f> cir) {
        EventFog event = new EventFog();
        Nexis.getEventBus().post(event);
        if (!event.isCancelled()) {
            return;
        }

        int color = event.getColor();
        cir.setReturnValue(new Vector4f(redf(color), greenf(color), bluef(color), alphaf(color)));
    }

    @Inject(
            method = "applyFog(Lnet/minecraft/client/render/Camera;ILnet/minecraft/client/render/RenderTickCounter;FLnet/minecraft/client/world/ClientWorld;)Lorg/joml/Vector4f;",
            at = @At(
                    value = "INVOKE",
                    target = "Lcom/mojang/blaze3d/systems/GpuDevice;createCommandEncoder()Lcom/mojang/blaze3d/systems/CommandEncoder;"
            )
    )
    private void nullform$applyFogDistance(Camera camera, int viewDistance, RenderTickCounter tickCounter, float skyDarkness, ClientWorld world,
                                           CallbackInfoReturnable<Vector4f> cir, @Local FogData fogData) {
        EventFog event = new EventFog();
        Nexis.getEventBus().post(event);
        if (!event.isCancelled()) {
            return;
        }

        float distance = Math.max(0.1f, event.getDistance());
        float start = Math.max(0.0f, distance - Math.max(4.0f, distance / 10.0f));
        fogData.environmentalStart = 0.0f;
        fogData.environmentalEnd = distance;
        fogData.renderDistanceStart = start;
        fogData.renderDistanceEnd = distance;
        fogData.skyEnd = distance;
        fogData.cloudEnd = distance;
    }

    private static float redf(int color) {
        return ((color >> 16) & 0xFF) / 255.0f;
    }

    private static float greenf(int color) {
        return ((color >> 8) & 0xFF) / 255.0f;
    }

    private static float bluef(int color) {
        return (color & 0xFF) / 255.0f;
    }

    private static float alphaf(int color) {
        return ((color >> 24) & 0xFF) / 255.0f;
    }
}
