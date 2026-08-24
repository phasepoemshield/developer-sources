package org.zenith.core;

import org.zenith.rotation.Rotation;
import org.zenith.setting.Setting;

import org.zenith.render.HandShaderManager;
import org.zenith.render.RawShaderProgram;
import org.zenith.rotation.RoundedRectEasing;

import org.zenith.setting.StringSetting2;



public record CloudFeatureDto(String RawShaderProgram, boolean HandShaderManager) implements CloudResponse {

   @Override
   public String type() {
      return "friends.removed";
   }

   public String RoundedRectEasing() {
      return this.RawShaderProgram;
   }

   public boolean StringSetting2() {
      return this.HandShaderManager;
   }
}
