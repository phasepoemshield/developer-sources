package org.zenith.core;

import org.zenith.render.RoundedRectBatch;

import org.zenith.event.Event18Ext5;


public record CloudFriendDto(CloudBadgeDto RoundedRectBatch, boolean FillShader) {

   public CloudBadgeDto TargetInterpolator() {
      return this.RoundedRectBatch;
   }

   public boolean Event18Ext5() {
      return this.FillShader;
   }
}
