/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_638
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.guard.mixin;

import kotakbaz.rain.guard.b_0;
import net.minecraft.class_310;
import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_310.class})
public abstract class GuardMinecraftClientMixin {
    public GuardMinecraftClientMixin() {
        super();
    }

    @Inject(method={"method_1574"}, at={@At(value="HEAD")})
    private void rain$guardMeshTick(CallbackInfo ci) {
        b_0.pulse(1, "1.21.8");
    }

    @Inject(method={"method_18097"}, at={@At(value="HEAD")})
    private void rain$guardMeshWorld(class_638 world, CallbackInfo ci) {
        b_0.probe(2, "1.21.8");
    }
}

