package org.zenith.core;

import org.zenith.setting.Setting;

import org.zenith.render.RectBatch;

import org.zenith.setting.BooleanSetting2;



public record CloudRelationWrapDto(CloudRelationDto RectBatch) implements CloudResponse {

   @Override
   public String type() {
      return "friends.request.received";
   }

   public CloudRelationDto BooleanSetting2() {
      return this.RectBatch;
   }
}
