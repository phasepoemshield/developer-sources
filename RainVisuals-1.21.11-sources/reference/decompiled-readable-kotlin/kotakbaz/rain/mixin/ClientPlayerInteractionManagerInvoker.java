package kotakbaz.rain.mixin;

import net.minecraft.client.network.ClientPlayerInteractionManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

// $VF: Compiled from ClientPlayerInteractionManagerInvoker.java
@Mixin(ClientPlayerInteractionManager.class)
public interface ClientPlayerInteractionManagerInvoker {
   @Invoker("method_2911")
   void rain$syncSelectedSlot();
}
