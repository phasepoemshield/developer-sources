package org.zenith.core;

import org.zenith.managers.MotorIntentModel;
import org.zenith.managers.Pathfinder;

import org.zenith.hud.HudElementMessage;
import org.zenith.util.AimUtils;
import org.zenith.util.TimerSpeed;

import java.util.List;

public record CloudUsersPageDto(int TimerSpeed, List<CloudUserDto> BaritoneBridge, boolean Pathfinder, Integer AimUtils) implements CloudResponse {

   public CloudUsersPageDto(int TimerSpeed, List<CloudUserDto> BaritoneBridge, boolean Pathfinder, Integer AimUtils) {
      BaritoneBridge = List.copyOf(BaritoneBridge);
      this.TimerSpeed = TimerSpeed;
      this.BaritoneBridge = BaritoneBridge;
      this.Pathfinder = Pathfinder;
      this.AimUtils = AimUtils;
   }

   @Override
   public String type() {
      return "config.list";
   }

   public int MotorIntentModel() {
      return this.TimerSpeed;
   }

   public List<CloudUserDto> configs() {
      return this.BaritoneBridge;
   }

   public boolean hasMore() {
      return this.Pathfinder;
   }

   public Integer HudElementMessage() {
      return this.AimUtils;
   }
}
