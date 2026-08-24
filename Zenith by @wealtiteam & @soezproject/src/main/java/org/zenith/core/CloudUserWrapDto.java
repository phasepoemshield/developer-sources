package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.module.Trails;


public record CloudUserWrapDto(CloudUserDto Trails) implements CloudResponse {

   @Override
   public String type() {
      return "config.access.granted";
   }

   public CloudUserDto HudHotbarPanel() {
      return this.Trails;
   }
}
