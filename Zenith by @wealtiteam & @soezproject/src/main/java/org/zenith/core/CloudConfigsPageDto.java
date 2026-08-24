package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.managers.MotorIntentModel;

import org.zenith.hud.HudElementMessage;
import org.zenith.render.BoxShaderRenderer;

import org.zenith.module.BlockOverLay;
import org.zenith.module.Predictions;
import org.zenith.module.WorldParticles;
import org.zenith.module.WorldTweaks;


import java.util.List;

public record CloudConfigsPageDto(String WorldParticles, int WorldTweaks, List<CloudConfigDetailsDto> BlockOverLay, boolean BoxShaderRenderer, Integer Predictions) implements CloudResponse {

   public CloudConfigsPageDto(String WorldParticles, int WorldTweaks, List<CloudConfigDetailsDto> BlockOverLay, boolean BoxShaderRenderer, Integer Predictions) {
      BlockOverLay = List.copyOf(BlockOverLay);
      this.WorldParticles = WorldParticles;
      this.WorldTweaks = WorldTweaks;
      this.BlockOverLay = BlockOverLay;
      this.BoxShaderRenderer = BoxShaderRenderer;
      this.Predictions = Predictions;
   }

   @Override
   public String type() {
      return "config.catalog";
   }

   public String GmmModel() {
      return this.WorldParticles;
   }

   public int MotorIntentModel() {
      return this.WorldTweaks;
   }

   public List<CloudConfigDetailsDto> configs() {
      return this.BlockOverLay;
   }

   public boolean hasMore() {
      return this.BoxShaderRenderer;
   }

   public Integer HudElementMessage() {
      return this.Predictions;
   }
}
