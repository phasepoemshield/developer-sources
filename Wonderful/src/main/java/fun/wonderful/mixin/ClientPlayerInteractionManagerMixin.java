package fun.wonderful.mixin;

import fun.wonderful.api.events.EventInvoker;
import fun.wonderful.api.events.implement.EventAttackEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ClientPlayerInteractionManager.class})
public abstract class ClientPlayerInteractionManagerMixin {
    @Inject(method={"attackEntity"}, at={@At(value="HEAD")}, cancellable=true)
    public void attackEntity(PlayerEntity player, Entity target, CallbackInfo ci) {
        try {
            if (player != null && target != null) {
                EventAttackEntity event = new EventAttackEntity(player, target);
                EventInvoker.invoke(event);
                if (event.isCancelled()) {
                    ci.cancel();
                }
            }
        }
        catch (Exception exception) {
            
        }
    }
}