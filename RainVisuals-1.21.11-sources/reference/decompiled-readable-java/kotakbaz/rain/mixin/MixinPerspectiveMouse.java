/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Mouse
 *  net.minecraft.client.network.ClientPlayerEntity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.Mouse;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import oxxxde.\u062d\u0634;
import oxxxde.\u0634\u0632;

@Mixin(value={Mouse.class})
public class MixinPerspectiveMouse {
    @Redirect(method={"method_1606"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_746;method_5872(DD)V"))
    private void rain$redirectLookUpdate(ClientPlayerEntity player, double cursorDeltaX, double cursorDeltaY) {
        double adjustedX = \u0634\u0632.INSTANCE.adjustMouseSensitivity(cursorDeltaX);
        double adjustedY = \u0634\u0632.INSTANCE.adjustMouseSensitivity(cursorDeltaY);
        if (\u062d\u0634.INSTANCE.isPerspectiveActive()) {
            \u062d\u0634.INSTANCE.rotateCamera(adjustedX, adjustedY);
            return;
        }
        player.changeLookDirection(adjustedX, adjustedY);
    }
}

