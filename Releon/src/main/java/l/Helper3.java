package l;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;

public class Helper3 {
   private static final MinecraftClient mc = MinecraftClient.getInstance();
   public static OtherClientPlayerEntity fakePlayer;

   public Helper3() {
   }

   public static boolean method256() {
      return fakePlayer != null;
   }

   public static void method257() {
      if (mc.world != null && mc.player != null) {
         if (fakePlayer == null) {
            fakePlayer = new OtherClientPlayerEntity(mc.world, mc.player.getGameProfile());
            Vec3d var0 = Vec3d.fromPolar(0.0F, mc.player.getYaw());
            Vec3d var1 = mc.player.getPos().add(var0.normalize().multiply(3.0));
            fakePlayer.refreshPositionAndAngles(var1.x, var1.y, var1.z, mc.player.getYaw(), mc.player.getPitch());
            fakePlayer.setCustomName(Text.literal("NeuroFP"));
            fakePlayer.setCustomNameVisible(true);
            mc.world.addEntity(fakePlayer);
         }
      }
   }

   public static void method258() {
      if (mc.world != null && fakePlayer != null) {
         fakePlayer.discard();
         fakePlayer = null;
      }
   }
}
