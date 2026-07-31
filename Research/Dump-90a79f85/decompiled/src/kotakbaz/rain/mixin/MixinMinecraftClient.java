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
package kotakbaz.rain.mixin;

import kotakbaz.rain.Rain;
import kotakbaz.rain.client.discord.a;
import kotakbaz.rain.module.A;
import net.minecraft.class_310;
import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_310.class})
public class MixinMinecraftClient {
    public MixinMinecraftClient() {
        super();
    }

    @Inject(method={"method_20539"}, at={@At(value="HEAD")}, cancellable=true)
    public void onOpenGameMenu(boolean pauseOnly, CallbackInfo ci) {
        if (Rain.INSTANCE.getCustomScreen() != null) {
            ci.cancel();
        }
    }

    @Inject(method={"method_18097"}, at={@At(value="TAIL")})
    private void rain$syncAvailabilityOnWorldChange(class_638 world, CallbackInfo ci) {
        A.INSTANCE.syncAvailabilityStates();
    }

    @Inject(method={"close"}, at={@At(value="HEAD")})
    private void rain$shutdownDiscordRpc(CallbackInfo ci) {
        a.shutdown();
    }
}

