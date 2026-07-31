/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_310
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.event.a;
import kotakbaz.rain.event.events.g_0;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_1309.class})
public class MixinLivingEntity {
    public MixinLivingEntity() {
        super();
    }

    @Inject(method={"method_6043"}, at={@At(value="HEAD")})
    public void hookJumpEvent(CallbackInfo ci) {
        if (this != class_310.method_1551().field_1724) {
            return;
        }
        a.INSTANCE.post(new g_0());
    }
}

