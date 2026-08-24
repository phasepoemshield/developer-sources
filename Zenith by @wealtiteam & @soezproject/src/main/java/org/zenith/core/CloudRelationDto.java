package org.zenith.core;

import org.zenith.setting.Setting;

import org.zenith.hud.ScrollHandler;
import org.zenith.hud.SearchBox;
import org.zenith.util.ScoreboardUtils;

import org.zenith.event.Event05;
import org.zenith.event.EventHookPacketProcess2;

import org.zenith.setting.ModeSetting;
import org.zenith.setting.ModeSetting3;



import java.util.UUID;

public record CloudRelationDto(UUID ConvolveKernel, CloudBadgeDto ScoreboardUtils, CloudBadgeDto AvatarRenderer, String ScrollHandler, long SearchBox) {

   public UUID Event05() {
      return this.ConvolveKernel;
   }

   public CloudBadgeDto ModeSetting3() {
      return this.ScoreboardUtils;
   }

   public CloudBadgeDto ModeSetting() {
      return this.AvatarRenderer;
   }

   public String ThemeColorCycler() {
      return this.ScrollHandler;
   }

   public long EventHookPacketProcess2() {
      return this.SearchBox;
   }
}
