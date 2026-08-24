package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.hud.HudElementValue;

import org.zenith.module.ShaderESP;


public record CloudConfigDetailsDto(CloudUserDto PostProcessPass, CloudConfigMetaDto ShaderESP, CloudTagDto FrameGraphPass, long likeCount, boolean liked) {

   public CloudConfigDetailsDto(
      CloudUserDto PostProcessPass, CloudConfigMetaDto ShaderESP, CloudTagDto FrameGraphPass, long likeCount, boolean liked
   ) {
      if (likeCount < 0L) {
         throw new IllegalArgumentException("likeCount must be non-negative");
      } else {
         this.PostProcessPass = PostProcessPass;
         this.ShaderESP = ShaderESP;
         this.FrameGraphPass = FrameGraphPass;
         this.likeCount = likeCount;
         this.liked = liked;
      }
   }

   public CloudUserDto HudHotbarPanel() {
      return this.PostProcessPass;
   }

   public CloudConfigMetaDto HudElementValue() {
      return this.ShaderESP;
   }

   public CloudTagDto HudInfoBoxSecondary() {
      return this.FrameGraphPass;
   }

   public long HudSelectedItemPanel() {
      return this.likeCount;
   }

   public boolean HudArmorPanel() {
      return this.liked;
   }
}
