package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.module.Criticals;
import org.zenith.module.Reach;


import java.util.List;

public record CloudLogsDto(long long105, List<CloudLogEntryDto> list48) implements CloudResponse {

   public CloudLogsDto(long long105, List<CloudLogEntryDto> list48) {
      list48 = List.copyOf(list48);
      this.long105 = long105;
      this.list48 = list48;
   }

   @Override
   public String type() {
      return "player.state.batch";
   }

   public long Criticals() {
      return this.long105;
   }

   public List<CloudLogEntryDto> Reach() {
      return this.list48;
   }
}
