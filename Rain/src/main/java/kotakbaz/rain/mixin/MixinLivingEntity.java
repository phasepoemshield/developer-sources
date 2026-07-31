/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.event.EventManager;
import kotakbaz.rain.event.events.JumpEvent;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={LivingEntity.class})
public class MixinLivingEntity {
    @Inject(method={"method_6043"}, at={@At(value="HEAD")})
    public void hookJumpEvent(CallbackInfo ci) {
        if (this != MinecraftClient.getInstance().player) {
            return;
        }
        EventManager.INSTANCE.post(new JumpEvent());
    }
}

