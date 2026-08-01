package sg.mx;

import java.util.List;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.gui.hud.ChatHudLine.Visible;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ChatHud.class)
public interface ChatHudAccessor {
   @Accessor("visibleMessages")
   List<Visible> getVisible();

   @Accessor("scrolledLines")
   int getScrolled();

   @Accessor("hasUnreadNewMessages")
   boolean hasUnreadNewMessages();
}
