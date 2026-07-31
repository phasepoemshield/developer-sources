/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1922
 *  net.minecraft.class_4184
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArgs
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.G;
import net.minecraft.class_1297;
import net.minecraft.class_1922;
import net.minecraft.class_4184;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={class_4184.class})
public abstract class MixinPerspectiveCamera {
    @Shadow
    private float field_18717;
    @Shadow
    private float field_18718;

    public MixinPerspectiveCamera() {
        super();
    }

    @Inject(method={"method_19321"}, at={@At(value="HEAD")})
    private void rain$updatePerspectiveState(class_1922 area, class_1297 focusedEntity, boolean thirdPerson, boolean inverseView, float tickDelta, CallbackInfo info) {
        if (!G.INSTANCE.isPerspectiveActive()) {
            return;
        }
        this.field_18717 = G.INSTANCE.cameraPitch();
        this.field_18718 = G.INSTANCE.cameraYaw();
    }

    @ModifyArgs(method={"method_19321"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_4184;method_19325(FF)V"))
    private void rain$fixPerspectiveRotation(Args args) {
        if (!G.INSTANCE.isPerspectiveActive()) {
            return;
        }
        args.set(0, (Object)Float.valueOf(G.INSTANCE.cameraYaw()));
        args.set(1, (Object)Float.valueOf(G.INSTANCE.cameraPitch()));
    }
}

