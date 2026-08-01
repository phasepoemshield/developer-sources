package ru.metaculture.protection;

import java.util.Objects;
import lombok.Generated;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket.Mode;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import net.minecraft.util.Hand;

public class O000000O0O00O0 extends O000000O0O0000 implements MinecraftAccessor {
   public static final O000000O0O00O0 O00000000 = new O000000O0O00O0();
   public boolean O000000000;
   public boolean O0000000000 = true;

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      Packet var10000 = o0000000O000OO.O00000000000();
      Objects.requireNonNull(var10000);
      Object var2 = var10000;
      switch (var2) {
         case PlayerActionC2SPacket var4 when var4.getAction().equals(Action.RELEASE_USE_ITEM):
            this.O0000000000 = true;
            break;
         case ClientStatusC2SPacket var5 when var5.getMode().equals(Mode.PERFORM_RESPAWN):
            this.O0000000000 = true;
            break;
         case PlayerRespawnS2CPacket var6:
            this.O0000000000 = true;
            break;
         case GameJoinS2CPacket var7:
            this.O0000000000 = true;
            break;
         default:
      }
   }

   public void O00000000(Hand hand) {
      if (this.O0000000000) {
         a_.interactionManager.interactItem(a_.player, hand);
         this.O0000000000 = false;
      }

      this.O000000000 = true;
   }

   @Generated
   public void O00000000(boolean bl) {
      this.O000000000 = bl;
   }

   @Generated
   public void O000000000(boolean bl) {
      this.O0000000000 = bl;
   }

   @Generated
   public boolean O00000000() {
      return this.O000000000;
   }

   @Generated
   public boolean O000000000() {
      return this.O0000000000;
   }
}
