/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.Camera
 *  net.minecraft.entity.Entity
 *  net.minecraft.world.World
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArgs
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import oxxxde.\u062d\u0634;

@Mixin(value={Camera.class})
public abstract class MixinPerspectiveCamera {
    @Shadow
    private float yaw;
    @Shadow
    private float pitch;

    @Inject(method={"method_19321"}, at={@At(value="HEAD")})
    private void rain$updatePerspectiveState(World area, Entity focusedEntity, boolean thirdPerson, boolean inverseView, float tickDelta, CallbackInfo info) {
        if (!\u062d\u0634.INSTANCE.isPerspectiveActive()) {
            return;
        }
        this.pitch = \u062d\u0634.INSTANCE.cameraPitch();
        this.yaw = \u062d\u0634.INSTANCE.cameraYaw();
    }

    @ModifyArgs(method={"method_19321"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_4184;method_19325(FF)V"))
    private void rain$fixPerspectiveRotation(Args args2) {
        if (!\u062d\u0634.INSTANCE.isPerspectiveActive()) {
            return;
        }
        args2.set(0, (Object)Float.valueOf(\u062d\u0634.INSTANCE.cameraYaw()));
        args2.set(1, (Object)Float.valueOf(\u062d\u0634.INSTANCE.cameraPitch()));
    }
}

