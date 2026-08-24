package eu.donyka.discord.enums;

import lombok.Generated;

// $VF: Compiled from OpCode.java
public enum OpCode {
   FRAME(1),
   PING(3),
   PONG(4),
   HANDSHAKE(0),
   CLOSE(2);

   private final int id;

   OpCode(int id) {
      this.id = id;
   }

   @Generated
   public int getId() {
      return this.id;
   }
}
