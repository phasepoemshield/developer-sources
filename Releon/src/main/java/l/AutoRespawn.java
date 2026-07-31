package l;

import baritone.api.event.events.PacketEvent;
import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.PositionAndOnGround;
import net.minecraft.network.packet.s2c.play.DeathMessageS2CPacket;

public class AutoRespawn extends Helper242 {
   private final Setting5 modeSetting = new Setting5("Режим", "Выберите, что будет использоваться").method2381("ФанТайм возврат", "Обычный");

   public AutoRespawn() {
      super("AutoRespawn", "AutoRespawn", Helper269.PLAYER);
      this.setup(new Helper264[]{this.modeSetting});
   }

   @Helper104
   public void method1788(PacketEvent var1) {
      Packet packet = Objects.requireNonNull(var1.getPacket());

      if (packet instanceof DeathMessageS2CPacket
         && Helper128.method1050().equals("lobby")
         && this.modeSetting.method2385("ФанТайм возврат")) {
         mc.player.networkHandler.sendPacket(new PositionAndOnGround(1448.0, 1337.0, 228.0, false, false));
         mc.player.requestRespawn();
         mc.player.closeScreen();
      }
   }

   @Helper104
   public void method1789(Event14 var1) {
      if (this.modeSetting.method2385("Обычный")) {
         mc.player.requestRespawn();
         mc.setScreen(null);
      }
   }
}
