package org.zenith.core;

import org.zenith.setting.Setting;

import org.zenith.render.ShapeRenderer;

import org.zenith.event.Event05;
import org.zenith.event.EventHookPacketProcess2;

import org.zenith.setting.BooleanSetting3;



import java.util.List;
import java.util.UUID;

public record CloudBadgesDto(UUID ShapeRenderer, List<CloudBadgeDto> ShaderWrapper, long LineShader) implements CloudResponse {

   public CloudBadgesDto(UUID ShapeRenderer, List<CloudBadgeDto> ShaderWrapper, long LineShader) {
      ShaderWrapper = List.copyOf(ShaderWrapper);
      this.ShapeRenderer = ShapeRenderer;
      this.ShaderWrapper = ShaderWrapper;
      this.LineShader = LineShader;
   }

   @Override
   public String type() {
      return "friends.added";
   }

   public UUID Event05() {
      return this.ShapeRenderer;
   }

   public List<CloudBadgeDto> BooleanSetting3() {
      return this.ShaderWrapper;
   }

   public long EventHookPacketProcess2() {
      return this.LineShader;
   }
}
