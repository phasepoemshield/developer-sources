package l;

import antidaunleak.api.annotation.Native;
import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.util.math.Vec3d;

public class AirStuck extends Helper242 {
   public AirStuck() {
      super("AirStuck", "Air Stuck", Helper269.MOVEMENT);
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginMutation
   )
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null) {
         this.method4527();
      }
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginMutation
   )
   public void method4526(Helper387 var1) {
      if (mc.player != null && mc.world != null && var1.method3901()) {
         this.method4527();
         var1.method3900(Vec3d.ZERO);
         var1.method582();
      }
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginMutation
   )
   public void onPacket(Helper386 var1) {
      if (mc.player != null && mc.world != null) {
         this.method4527();
         Packet packet = Objects.requireNonNull(var1.method3895());
         if (packet instanceof PlayerMoveC2SPacket && var1.method3894()) {
            var1.method582();
         }
      }
   }

   private void method4527() {
      mc.player.setVelocity(Vec3d.ZERO);
      mc.player.setSprinting(false);
   }
}
