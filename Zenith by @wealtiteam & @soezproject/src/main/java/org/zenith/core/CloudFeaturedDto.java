package org.zenith.core;

import org.zenith.setting.Setting;

import org.zenith.render.RenderCommandQueue;
import org.zenith.util.ColorUtils;

import org.zenith.setting.BooleanSetting2;
import org.zenith.setting.NumberSetting;





public record CloudFeaturedDto(String ColorUtils, CloudRelationDto RenderCommandQueue) implements CloudResponse {

   @Override
   public String type() {
      return "friends.request.created";
   }

   public String NumberSetting() {
      return this.ColorUtils;
   }

   public CloudRelationDto BooleanSetting2() {
      return this.RenderCommandQueue;
   }
}
