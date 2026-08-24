package kotakbaz.rain.mixin;

import java.util.List;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.gui.hud.ChatHudLine;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

// $VF: Compiled from ChatComponentAccessor.java
@Mixin(ChatHud.class)
public interface ChatComponentAccessor {
   @Accessor("field_2061")
   List<ChatHudLine> rain$getAllMessages();

   @Invoker("method_44813")
   void rain$refreshTrimmedMessages();
}
