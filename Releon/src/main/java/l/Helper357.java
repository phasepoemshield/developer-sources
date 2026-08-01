package l;

import java.time.Instant;
import java.util.BitSet;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.network.message.LastSeenMessageList.Acknowledgment;
import net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket;

public class Helper357 {
   private static MinecraftClient mc = MinecraftClient.getInstance();

   public Helper357() {
   }

   public static void method3572(ClientPlayerEntity var0, String var1) {
      if (var0 != null && var0.networkHandler != null) {
         var0.networkHandler.sendPacket(new ChatMessageC2SPacket(var1, Instant.now(), 0L, null, new Acknowledgment(0, new BitSet())));
      }
   }

   public static void method3573(String var0) {
      if (mc.player != null && mc.player.networkHandler != null) {
         mc.player.networkHandler.sendPacket(new ChatMessageC2SPacket(var0, Instant.now(), 0L, null, new Acknowledgment(0, new BitSet())));
         Helper330.method3268(true);
         Helper330.method3270(System.currentTimeMillis());
      }
   }

   public static void method3574() {
      if (mc.player != null && mc.player.networkHandler != null) {
         mc.player.networkHandler.sendPacket(new ChatMessageC2SPacket("/ah", Instant.now(), 0L, null, new Acknowledgment(0, new BitSet())));
      }
   }
}
