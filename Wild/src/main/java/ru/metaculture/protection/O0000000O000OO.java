package ru.metaculture.protection;

import lombok.Generated;
import net.minecraft.network.packet.Packet;

public class O0000000O000OO extends Event {
   private Packet<?> O00000000;
   private O0000000O000OO.W24 O000000000;

   public boolean O0000000000() {
      return this.O000000000.equals(O0000000O000OO.W24.SEND);
   }

   @Generated
   public Packet<?> O00000000000() {
      return this.O00000000;
   }

   @Generated
   public O0000000O000OO.W24 O000000000000() {
      return this.O000000000;
   }

   @Generated
   public void O00000000(Packet<?> packet) {
      this.O00000000 = packet;
   }

   @Generated
   public void O00000000(O0000000O000OO.W24 o00000000) {
      this.O000000000 = o00000000;
   }

   @Generated
   public O0000000O000OO(Packet<?> packet, O0000000O000OO.W24 o00000000) {
      this.O00000000 = packet;
      this.O000000000 = o00000000;
   }

   public static enum W24 {
      SEND,
      RECEIVE;
   }
}
