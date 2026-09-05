package ru.metaculture.protection;

import java.time.Instant;
import java.util.Objects;
import net.minecraft.class_310;

public final class CC0coCCooCoc extends VunUNUNVUnv {
   private final class_310 UuUVuuUu;
   private final Instant C00OOC00oO;

   public CC0coCCooCoc(class_310 var1) {
      this(var1, Instant.now());
   }

   public CC0coCCooCoc(class_310 var1, Instant var2) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = Objects.requireNonNull(var2, "timestamp");
   }

   public class_310 uUnuvNvvNU() {
      return this.UuUVuuUu;
   }

   public Instant vVvUvVVuuNvV() {
      return this.C00OOC00oO;
   }
}
