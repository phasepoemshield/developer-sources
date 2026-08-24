package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.module.Criticals;
import org.zenith.module.FakeLag;


import java.util.List;

public record CloudStatsDto(long long103, List<CloudStatEntryDto> list47) implements CloudResponse {

   public CloudStatsDto(long long103, List<CloudStatEntryDto> list47) {
      list47 = List.copyOf(list47);
      this.long103 = long103;
      this.list47 = list47;
   }

   @Override
   public String type() {
      return "player.inventory.batch";
   }

   public long Criticals() {
      return this.long103;
   }

   public List<CloudStatEntryDto> FakeLag() {
      return this.list47;
   }
}
