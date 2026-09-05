package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class c0O00CcoCc0c {
   private final List<c0O00CcoCc0c.NVnVnNnN> UuUVuuUu = new ArrayList<>();
   private final List<c0O00CcoCc0c.NVnVnNnN> C00OOC00oO = Collections.unmodifiableList(this.UuUVuuUu);

   public List<c0O00CcoCc0c.NVnVnNnN> UuUVuuUu() {
      return this.C00OOC00oO;
   }

   public int C00OOC00oO() {
      return this.UuUVuuUu.size();
   }

   public c0O00CcoCc0c.NVnVnNnN UuUVuuUu(UUID var1) {
      for (int var2 = 0; var2 < this.UuUVuuUu.size(); var2++) {
         c0O00CcoCc0c.NVnVnNnN var3 = this.UuUVuuUu.get(var2);
         if (var3.id().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   public long UuUVuuUu(c0O00CcoCc0c.NVnVnNnN var1, long var2) {
      return !var1.playing() ? var1.positionMs() : var1.positionMs() + Math.max(0L, var2 - var1.stampMs());
   }

   void UuUVuuUu(List<c0O00CcoCc0c.NVnVnNnN> var1) {
      this.UuUVuuUu.clear();
      this.UuUVuuUu.addAll(var1);
   }

   void uUnuvNvvNU() {
      this.UuUVuuUu.clear();
   }

   public record NVnVnNnN(
      UUID id,
      UUID owner,
      String source,
      double x,
      double y,
      double z,
      float yaw,
      float width,
      float height,
      boolean playing,
      long positionMs,
      long stampMs,
      float volume
   ) {
   }
}
