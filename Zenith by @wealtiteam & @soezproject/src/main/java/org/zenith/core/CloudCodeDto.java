package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.module.Category;

import org.zenith.util.CooldownTimer;

public record CloudCodeDto(int CooldownTimer, String BooleanValue) implements CloudResponse {

   @Override
   public String type() {
      return "connection.close";
   }

   public int code() {
      return this.CooldownTimer;
   }

   public String Category() {
      return this.BooleanValue;
   }
}
