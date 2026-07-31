/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_4603
 *  net.minecraft.class_5819
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.s_0;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_4603;
import net.minecraft.class_5819;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_4603.class})
public class MixinRenderTweaksInGameOverlayRenderer {
    public MixinRenderTweaksInGameOverlayRenderer() {
        super();
    }

    @Inject(method={"method_70938"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$cancelTotemAnimation(class_1799 stack, class_5819 random, CallbackInfo ci) {
        if (!s_0.INSTANCE.isEnabled()) {
            return;
        }
        if (((Boolean)s_0.INSTANCE.getNoTotemAnimation().getValue()).booleanValue() && stack.method_31574(class_1802.field_8288)) {
            ci.cancel();
        }
    }
}

