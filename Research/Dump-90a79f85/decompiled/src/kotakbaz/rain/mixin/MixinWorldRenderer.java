/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_761
 *  net.minecraft.class_9779
 *  net.minecraft.class_9922
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector4f
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import kotakbaz.rain.client.waypoint.c_0;
import kotakbaz.rain.event.a;
import kotakbaz.rain.event.events.B;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_761;
import net.minecraft.class_9779;
import net.minecraft.class_9922;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_761.class})
public class MixinWorldRenderer {
    public MixinWorldRenderer() {
        super();
    }

    @Inject(method={"method_22710"}, at={@At(value="RETURN")})
    private void rain$onRender(class_9922 allocator, class_9779 tickCounter, boolean renderBlockOutline, class_4184 camera, Matrix4f positionMatrix, Matrix4f projectionMatrix, GpuBufferSlice fog, Vector4f fogColor, boolean shouldRenderSky, CallbackInfo ci) {
        c_0.INSTANCE.captureProjectionMatrices(new Matrix4f((Matrix4fc)positionMatrix), new Matrix4f((Matrix4fc)projectionMatrix));
        class_4587 matrices = new class_4587();
        matrices.method_34425((Matrix4fc)new Matrix4f((Matrix4fc)positionMatrix));
        a.INSTANCE.post(new B(matrices, tickCounter.method_60637(false)));
    }
}

