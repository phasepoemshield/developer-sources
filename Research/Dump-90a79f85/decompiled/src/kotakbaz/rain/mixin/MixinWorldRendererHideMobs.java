/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1308
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_761
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.s_0;
import net.minecraft.class_1297;
import net.minecraft.class_1308;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_761;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_761.class})
public class MixinWorldRendererHideMobs {
    public MixinWorldRendererHideMobs() {
        super();
    }

    @Inject(method={"method_22977"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$hideMobs(class_1297 entity, double cameraX, double cameraY, double cameraZ, float tickProgress, class_4587 matrices, class_4597 vertexConsumers, CallbackInfo ci) {
        if (!s_0.INSTANCE.isEnabled()) {
            return;
        }
        if (((Boolean)s_0.INSTANCE.getHideMobs().getValue()).booleanValue() && entity instanceof class_1308) {
            ci.cancel();
        }
    }
}

