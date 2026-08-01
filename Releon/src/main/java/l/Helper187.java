package l;

import fat.releon.Releon;
import java.util.Objects;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket.Mode;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import net.minecraft.util.Hand;

public class Helper187 implements Helper160 {
   public static final Helper187 INSTANCE = new Helper187();
   public boolean useItem;
   public boolean releaseItem = true;

   public Helper187() {
      Releon.method71().method15().method1016(this);
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      Packet var10000 = var1.method3895();
      Objects.requireNonNull(var10000);
      Object var2 = var10000;
      switch (var2) {
         case PlayerActionC2SPacket var4 when var4.getAction().equals(Action.RELEASE_USE_ITEM):
            this.releaseItem = true;
            break;
         case ClientStatusC2SPacket var5 when var5.getMode().equals(Mode.PERFORM_RESPAWN):
            this.releaseItem = true;
            break;
         case PlayerRespawnS2CPacket var6:
            this.releaseItem = true;
            break;
         case GameJoinS2CPacket var7:
            this.releaseItem = true;
            break;
         default:
      }
   }

   public void method1614(Hand var1) {
      if (this.releaseItem) {
         mc.interactionManager.interactItem(mc.player, var1);
         this.releaseItem = false;
      }

      this.useItem = true;
   }

   public void method1615(boolean var1) {
      this.useItem = var1;
   }

   public void method1616(boolean var1) {
      this.releaseItem = var1;
   }

   public boolean method1617() {
      return this.useItem;
   }

   public boolean method1618() {
      return this.releaseItem;
   }
}
