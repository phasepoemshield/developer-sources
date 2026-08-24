package org.zenith.core;

import org.zenith.managers.BotEntity;
import org.zenith.module.Module;

import org.zenith.render.ParticleRenderer;
import org.zenith.render.ParticleTextures;

import org.zenith.setting.BooleanSetting;
import org.zenith.setting.Setting;
import org.zenith.setting.StringSetting;




import java.util.List;

public record CloudServerStatsDto(String BotFollowEntity, long BotEntity, long SpinMarker, long BotGotoEntity, int PositionProvider, long ParticleRenderer, List<String> ParticleTextures) implements CloudResponse {

   public CloudServerStatsDto(String BotFollowEntity, long BotEntity, long SpinMarker, long BotGotoEntity, int PositionProvider, long ParticleRenderer, List<String> ParticleTextures) {
      ParticleTextures = List.copyOf(ParticleTextures);
      this.BotFollowEntity = BotFollowEntity;
      this.BotEntity = BotEntity;
      this.SpinMarker = SpinMarker;
      this.BotGotoEntity = BotGotoEntity;
      this.PositionProvider = PositionProvider;
      this.ParticleRenderer = ParticleRenderer;
      this.ParticleTextures = ParticleTextures;
   }

   @Override
   public String type() {
      return "connection.welcome";
   }

   public String serverVersion() {
      return this.BotFollowEntity;
   }

   public long Module() {
      return this.BotEntity;
   }

   public long ModuleInfo() {
      return this.SpinMarker;
   }

   public long Setting() {
      return this.BotGotoEntity;
   }

   public int BooleanSetting() {
      return this.PositionProvider;
   }

   public long StringSetting() {
      return this.ParticleRenderer;
   }

   public List<String> MenuEaseB() {
      return this.ParticleTextures;
   }
}
