/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.PerspectiveModule;
import kotakbaz.rain.module.modules.render.ZoomModule;
import net.minecraft.client.Mouse;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={Mouse.class})
public class MixinPerspectiveMouse {
    @Redirect(method={"method_1606"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_746;method_5872(DD)V"))
    private void rain$redirectLookUpdate(ClientPlayerEntity player, double cursorDeltaX, double cursorDeltaY) {
        double adjustedX = ZoomModule.INSTANCE.adjustMouseSensitivity(cursorDeltaX);
        double adjustedY = ZoomModule.INSTANCE.adjustMouseSensitivity(cursorDeltaY);
        if (PerspectiveModule.INSTANCE.isPerspectiveActive()) {
            PerspectiveModule.INSTANCE.rotateCamera(adjustedX, adjustedY);
            return;
        }
        player.changeLookDirection(adjustedX, adjustedY);
    }
}

