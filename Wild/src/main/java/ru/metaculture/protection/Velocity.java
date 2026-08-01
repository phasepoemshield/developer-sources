package ru.metaculture.protection;

import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "Velocity",
   O000000000 = "Убирает откидывание",
   O0000000000 = Category.Combat,
   O00000000000 = {O0000000OO0OOO.RISKY, O0000000OO0OOO.MATRIX, O0000000OO0OOO.GRIM}
)
public class Velocity extends Module {
   public static ModeSetting O000000000O = new ModeSetting("Обход", "Vanilla", "Vanilla", "Lag", "Funtime");

   public Velocity() {
      this.O00000000(new Setting[]{O000000000O});
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (!O0000O00O00O0.O00000000()) {
         if (O000000000O.O000000000("Vanilla")
            && o0000000O000OO.O00000000000() instanceof EntityVelocityUpdateS2CPacket var2
            && var2.getEntityId() == O0000000000.player.getId()) {
            o0000000O000OO.O000000000();
         }

         if (O000000000O.O000000000("Funtime")
            && o0000000O000OO.O00000000000() instanceof EntityVelocityUpdateS2CPacket var4
            && var4.getEntityId() == O0000000000.player.getId()
            && O0000000000.player.inPowderSnow) {
            o0000000O000OO.O000000000();
         }

         if (O000000000O.O000000000("Lag")) {
            if (o0000000O000OO.O00000000000() instanceof EntityVelocityUpdateS2CPacket var5 && var5.getEntityId() == O0000000000.player.getId()) {
               o0000000O000OO.O000000000();
            }

            if (o0000000O000OO.O0000000000()) {
               o0000000O000OO.O000000000();
            }
         }
      }
   }
}
