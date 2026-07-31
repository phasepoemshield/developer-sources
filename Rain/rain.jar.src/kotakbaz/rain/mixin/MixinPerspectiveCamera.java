/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.PerspectiveModule;
import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={Camera.class})
public abstract class MixinPerspectiveCamera {
    @Shadow
    private float field_18717;
    @Shadow
    private float field_18718;

    @Inject(method={"method_19321"}, at={@At(value="HEAD")})
    private void rain$updatePerspectiveState(BlockView area, Entity focusedEntity, boolean thirdPerson, boolean inverseView, float tickDelta, CallbackInfo info) {
        if (!PerspectiveModule.INSTANCE.isPerspectiveActive()) {
            return;
        }
        this.field_18717 = PerspectiveModule.INSTANCE.cameraPitch();
        this.field_18718 = PerspectiveModule.INSTANCE.cameraYaw();
    }

    @ModifyArgs(method={"method_19321"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_4184;method_19325(FF)V"))
    private void rain$fixPerspectiveRotation(Args args) {
        if (!PerspectiveModule.INSTANCE.isPerspectiveActive()) {
            return;
        }
        args.set(0, (Object)Float.valueOf(PerspectiveModule.INSTANCE.cameraYaw()));
        args.set(1, (Object)Float.valueOf(PerspectiveModule.INSTANCE.cameraPitch()));
    }
}

