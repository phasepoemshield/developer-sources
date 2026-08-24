package eu.donyka.discord.enums;

import lombok.Generated;

// $VF: Compiled from ErrorCode.java
public enum ErrorCode {
   USER_LOGOUT(1000),
   UNKNOWN(-1),
   PIPE_CLOSED(1),
   SUCCESS(0),
   READ_CORRUPT(2);

   private final int id;

   ErrorCode(int id) {
      this.id = id;
   }

   @Generated
   public int getId() {
      return this.id;
   }
}
