package sg.mx;

import java.util.UUID;
import net.minecraft.client.gui.hud.ClientBossBar;
import net.minecraft.entity.boss.BossBar.Color;
import net.minecraft.entity.boss.BossBar.Style;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(ClientBossBar.class)
public interface ClientBossBarAccessor {
   @Invoker("<init>")
   static ClientBossBar createClientBossBar(UUID var0, Text var1, float var2, Color var3, Style var4, boolean var5, boolean var6, boolean var7) {
      throw new AssertionError();
   }
}
