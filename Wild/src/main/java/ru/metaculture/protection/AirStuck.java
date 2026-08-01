package ru.metaculture.protection;

import net.minecraft.client.render.Camera;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.Full;
import net.minecraft.util.math.Vec3d;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AirStuck",
   O0000000000 = Category.Movement,
   O000000000 = "Позволяет застывать в воздухе",
   O00000000000 = {O0000000OO0OOO.RISKY, O0000000OO0OOO.PATCHED, O0000000OO0OOO.GRIM}
)
public class AirStuck extends Module {
   public final BooleanSetting O000000000O = new BooleanSetting("Обход Grim", true);
   private Vec3d O000000000O0 = null;
   private boolean O000000000O00 = false;

   public AirStuck() {
      this.O00000000(new Setting[]{this.O000000000O});
   }

   @Override
   public void O00000000() {
      super.O00000000();
      if (O0000000000.player != null) {
         this.O000000000O0 = O0000000000.player.getPos();
      }

      this.O000000000O00 = false;
   }

   @Override
   public void O000000000() {
      this.O000000000O0 = null;
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && this.O000000000O0 != null) {
         O0000000000.player.setVelocity(0.0, 0.0, 0.0);
         O0000000000.player.setPosition(this.O000000000O0);
         O0000000000.player.lastX = this.O000000000O0.x;
         O0000000000.player.lastY = this.O000000000O0.y;
         O0000000000.player.lastZ = this.O000000000O0.z;
         O0000000000.player.fallDistance = 0.0;
      }
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (O0000000000.player != null && O0000000000.gameRenderer != null && !this.O000000000O00) {
         if (o0000000O000OO.O00000000000() instanceof PlayerMoveC2SPacket && this.O000000000O0 != null) {
            if (this.O000000000O.O0000000000()) {
               o0000000O000OO.O000000000();
            } else {
               o0000000O000OO.O000000000();
               Camera var2 = O0000000000.gameRenderer.getCamera();
               this.O000000000O00 = true;
               O0000000000.getNetworkHandler()
                  .sendPacket(new Full(this.O000000000O0.x, this.O000000000O0.y, this.O000000000O0.z, var2.getYaw(), var2.getPitch(), false, false));
               this.O000000000O00 = false;
            }
         }
      }
   }
}
