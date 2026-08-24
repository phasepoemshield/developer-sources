package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.module.RotationRecorder;
import org.zenith.module.TargetPearl;


import java.util.List;

public record CloudListsDto(List<String> list52, List<String> list53) implements CloudResponse {

   public CloudListsDto(List<String> list52, List<String> list53) {
      list52 = List.copyOf(list52);
      list53 = List.copyOf(list53);
      this.list52 = list52;
      this.list53 = list53;
   }

   @Override
   public String type() {
      return "player.watch.result";
   }

   public List<String> RotationRecorder() {
      return this.list52;
   }

   public List<String> TargetPearl() {
      return this.list53;
   }
}
