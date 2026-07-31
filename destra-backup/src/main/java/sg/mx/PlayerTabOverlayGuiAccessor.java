package sg.mx;

import java.util.List;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(PlayerListHud.class)
public interface PlayerTabOverlayGuiAccessor {
   @Accessor("header")
   Text getHeader();

   @Accessor("visible")
   boolean isVisible();

   @Accessor("footer")
   Text getFooter();

   @Invoker("collectPlayerEntries")
   List<PlayerListEntry> invokeCollectPlayerEntries();
}
