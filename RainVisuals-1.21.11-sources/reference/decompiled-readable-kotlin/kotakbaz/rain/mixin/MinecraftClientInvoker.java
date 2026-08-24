package kotakbaz.rain.mixin;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

// $VF: Compiled from MinecraftClientInvoker.java
@Mixin(MinecraftClient.class)
public interface MinecraftClientInvoker {
   @Invoker("method_1536")
   boolean rain$doAttack();

   @Invoker("method_1583")
   void rain$doItemUse();
}
