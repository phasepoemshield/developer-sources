package org.zenith.core;

import org.zenith.rotation.Rotation;
import org.zenith.setting.Setting;

import org.zenith.render.BlurRenderer;
import org.zenith.rotation.RoundedRectEasing;

import org.zenith.setting.StringSetting2;



public record CloudStatusDto(String ImageEncoder, boolean BlurRenderer) implements CloudResponse {

   @Override
   public String type() {
      return "friends.remove.completed";
   }

   public String RoundedRectEasing() {
      return this.ImageEncoder;
   }

   public boolean StringSetting2() {
      return this.BlurRenderer;
   }
}
