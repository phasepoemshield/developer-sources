/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_312
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.G;
import kotakbaz.rain.module.modules.render.b_0;
import net.minecraft.class_312;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={class_312.class})
public class MixinPerspectiveMouse {
    public MixinPerspectiveMouse() {
        super();
    }

    @Redirect(method={"method_1606"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_746;method_5872(DD)V"))
    private void rain$redirectLookUpdate(class_746 player, double cursorDeltaX, double cursorDeltaY) {
        double adjustedX = b_0.INSTANCE.adjustMouseSensitivity(cursorDeltaX);
        double adjustedY = b_0.INSTANCE.adjustMouseSensitivity(cursorDeltaY);
        if (G.INSTANCE.isPerspectiveActive()) {
            G.INSTANCE.rotateCamera(adjustedX, adjustedY);
            return;
        }
        player.method_5872(adjustedX, adjustedY);
    }
}

