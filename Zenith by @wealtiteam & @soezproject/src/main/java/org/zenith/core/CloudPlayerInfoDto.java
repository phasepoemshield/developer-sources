package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.module.Arrows;
import org.zenith.module.BetterMinecraft;
import org.zenith.module.BlockESP;
import org.zenith.module.CameraTweaks;
import org.zenith.module.Cape;


import java.util.List;
import java.util.Objects;
import java.util.UUID;

public record CloudPlayerInfoDto(UUID Arrows, CloudBadgeDto BetterMinecraft, long BlockESP, List<String> CameraTweaks, CloudPermissionsDto Cape) implements CloudResponse {

   public CloudPlayerInfoDto(UUID Arrows, CloudBadgeDto BetterMinecraft, long BlockESP, List<String> CameraTweaks, CloudPermissionsDto Cape) {
      Objects.requireNonNull(Arrows, "sessionId");
      Objects.requireNonNull(BetterMinecraft, "user");
      CameraTweaks = List.copyOf(CameraTweaks);
      Objects.requireNonNull(Cape, "cosmetics");
      this.Arrows = Arrows;
      this.BetterMinecraft = BetterMinecraft;
      this.BlockESP = BlockESP;
      this.CameraTweaks = CameraTweaks;
      this.Cape = Cape;
   }

   @Override
   public String type() {
      return "auth.success";
   }

   public UUID sessionId() {
      return this.Arrows;
   }

   public CloudBadgeDto TargetInterpolator() {
      return this.BetterMinecraft;
   }

   public long TrajectoryDataset() {
      return this.BlockESP;
   }

   public List<String> MovementSimulator() {
      return this.CameraTweaks;
   }

   public CloudPermissionsDto MotionSampleStore() {
      return this.Cape;
   }
}
