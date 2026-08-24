package org.zenith.core;

import org.zenith.rotation.Rotation;

import org.zenith.util.WorldUtils;

import org.zenith.hud.HudElementMessages;
import org.zenith.rotation.RotationSnapStrategy;

import java.util.Objects;

public record CloudSessionExtDto(CloudSessionDto WorldUtils, String DrawContextSink, long GameService) {

   public CloudSessionExtDto(CloudSessionDto WorldUtils, String DrawContextSink, long GameService) {
      Objects.requireNonNull(WorldUtils, "ticket");
      Objects.requireNonNull(DrawContextSink, "sha256");
      this.WorldUtils = WorldUtils;
      this.DrawContextSink = DrawContextSink;
      this.GameService = GameService;
   }

   public CloudSessionDto HudTabList() {
      return this.WorldUtils;
   }

   public String RotationSnapStrategy() {
      return this.DrawContextSink;
   }

   public long HudElementMessages() {
      return this.GameService;
   }
}
