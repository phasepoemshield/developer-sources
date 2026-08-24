/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.entity.LivingEntity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.event.events.JumpEvent;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u0631\u0638;

@Mixin(value={LivingEntity.class})
public class MixinLivingEntity {
    @Inject(method={"method_6043"}, at={@At(value="HEAD")})
    public void hookJumpEvent(CallbackInfo ci) {
        if (this != MinecraftClient.getInstance().player) {
            return;
        }
        \u0631\u0638.INSTANCE.post(new JumpEvent());
    }
}

