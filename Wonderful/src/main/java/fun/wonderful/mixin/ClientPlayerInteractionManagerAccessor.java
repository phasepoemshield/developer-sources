package fun.wonderful.mixin;

import net.minecraft.client.network.ClientPlayerInteractionManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={ClientPlayerInteractionManager.class})
public interface ClientPlayerInteractionManagerAccessor {
    @Invoker(value="syncSelectedSlot")
    public void wonderful$syncSelectedSlot();
}