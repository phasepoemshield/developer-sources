package l;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket.Mode;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import net.minecraft.util.math.Box;

public class Blink extends Helper242 {
   private final List<Packet<?>> packets = new CopyOnWriteArrayList<>();
   private Box box;
   public static int tickStop = -1;
   private int flushCooldown = 0;
   private Helper339 timer = new Helper339();

   public Blink() {
      super("Blink", Helper269.MOVEMENT);
      this.setup(new Helper264[0]);
   }

   @Override
   public void activate() {
      this.box = mc.player.getBoundingBox();
   }

   @Override
   public void deactivate() {
      this.packets.forEach(Helper38::method525);
      this.packets.clear();
   }

   @Helper104
   public void tick(Event8 var1) {
      if (!Helper38.method549()) {
         tickStop--;
         if (tickStop >= 0 && !this.packets.isEmpty()) {
            this.box = mc.player.getBoundingBox();
            this.packets.forEach(Helper38::method525);
            this.packets.clear();
         }
      }
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (!Helper38.method549()) {
         Packet var10000 = var1.method3895();
         Objects.requireNonNull(var10000);
         Object var2 = var10000;
         switch (var2) {
            case PlayerRespawnS2CPacket var4:
               this.setState(false);
               break;
            case GameJoinS2CPacket var5:
               this.setState(false);
               break;
            case ClientStatusC2SPacket var6 when var6.getMode().equals(Mode.PERFORM_RESPAWN):
               this.setState(false);
               break;
            default:
               if (var1.method3894() && tickStop < 0) {
                  this.packets.add(var1.method3895());
                  var1.method582();
               }
         }
      }
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
      if (this.box != null) {
         Helper183.method1545(this.box, Helper133.method1162(), 1.0F);
      }
   }
}
