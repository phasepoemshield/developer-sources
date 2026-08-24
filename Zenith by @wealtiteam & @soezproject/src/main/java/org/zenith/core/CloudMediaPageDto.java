package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.module.FireWorkESP;
import org.zenith.module.HandFire;
import org.zenith.module.HitParticles;


import java.util.List;

public record CloudMediaPageDto(List<MediaTrackInfo> FireWorkESP, boolean HandFire, CloudViewDto HitParticles) implements CloudResponse {

   public CloudMediaPageDto(List<MediaTrackInfo> FireWorkESP, boolean HandFire, CloudViewDto HitParticles) {
      FireWorkESP = List.copyOf(FireWorkESP);
      this.FireWorkESP = FireWorkESP;
      this.HandFire = HandFire;
      this.HitParticles = HitParticles;
   }

   @Override
   public String type() {
      return "chat.history";
   }

   public List<MediaTrackInfo> ChatTagParser() {
      return this.FireWorkESP;
   }

   public boolean hasMore() {
      return this.HandFire;
   }

   public CloudViewDto ProfileCacheStore() {
      return this.HitParticles;
   }
}
