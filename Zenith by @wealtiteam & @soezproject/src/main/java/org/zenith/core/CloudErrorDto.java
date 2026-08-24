package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.module.AntiInvisible;
import org.zenith.module.XrayBypass;


public record CloudErrorDto(String XrayBypass, String AntiInvisible) implements CloudResponse {

   @Override
   public String type() {
      return "auth.failure";
   }

   public String PlayerStateService() {
      return this.XrayBypass;
   }

   public String message() {
      return this.AntiInvisible;
   }
}
