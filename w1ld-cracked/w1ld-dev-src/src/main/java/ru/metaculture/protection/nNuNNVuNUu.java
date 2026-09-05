package ru.metaculture.protection;

import java.util.Objects;

public final class nNuNNVuNUu {
   private final String UuUVuuUu;
   private final String C00OOC00oO;
   private final String uUnuvNvvNU;
   private final String vVvUvVVuuNvV;

   public nNuNNVuNUu(String var1, String var2, String var3, String var4) {
      this.UuUVuuUu = Objects.requireNonNull(var1, "fromNodeId");
      this.C00OOC00oO = Objects.requireNonNull(var2, "fromPinId");
      this.uUnuvNvvNU = Objects.requireNonNull(var3, "toNodeId");
      this.vVvUvVVuuNvV = Objects.requireNonNull(var4, "toPinId");
   }

   public String UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public String C00OOC00oO() {
      return this.C00OOC00oO;
   }

   public String uUnuvNvvNU() {
      return this.uUnuvNvvNU;
   }

   public String vVvUvVVuuNvV() {
      return this.vVvUvVVuuNvV;
   }

   public String uNNnnnuuuN() {
      return this.UuUVuuUu + "." + this.C00OOC00oO;
   }

   public String nuUnNvnuUu() {
      return this.uUnuvNvvNU + "." + this.vVvUvVVuuNvV;
   }
}
