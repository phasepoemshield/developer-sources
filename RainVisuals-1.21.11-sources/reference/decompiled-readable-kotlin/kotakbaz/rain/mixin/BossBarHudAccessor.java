package kotakbaz.rain.mixin;

import java.util.Map;
import java.util.UUID;
import net.minecraft.client.gui.hud.BossBarHud;
import net.minecraft.client.gui.hud.ClientBossBar;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

// $VF: Compiled from BossBarHudAccessor.java
@Mixin(BossBarHud.class)
public interface BossBarHudAccessor {
   @Accessor("field_2060")
   Map<UUID, ClientBossBar> rain$getBossBars();
}
