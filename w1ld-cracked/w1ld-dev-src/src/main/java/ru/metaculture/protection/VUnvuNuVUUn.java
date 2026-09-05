package ru.metaculture.protection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public final class VUnvuNuVUUn {
   private final String UuUVuuUu;
   private final String C00OOC00oO;
   private float uUnuvNvvNU;
   private float vVvUvVVuuNvV;
   private float uNNnnnuuuN;
   private final Map<String, Float> nuUnNvnuUu = new LinkedHashMap<>();
   private final Map<String, String> VVuuUN = new LinkedHashMap<>();

   public VUnvuNuVUUn(String var1, String var2, float var3, float var4) {
      this.UuUVuuUu = Objects.requireNonNull(var1, "id");
      this.C00OOC00oO = Objects.requireNonNull(var2, "kind");
      this.uUnuvNvvNU = var3;
      this.vVvUvVVuuNvV = var4;
      this.uNNnnnuuuN = 188.0F;
   }

   public String UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public String C00OOC00oO() {
      return this.C00OOC00oO;
   }

   public float uUnuvNvvNU() {
      return this.uUnuvNvvNU;
   }

   public float vVvUvVVuuNvV() {
      return this.vVvUvVVuuNvV;
   }

   public void UuUVuuUu(float var1, float var2) {
      this.uUnuvNvvNU = var1;
      this.vVvUvVVuuNvV = var2;
   }

   public float uNNnnnuuuN() {
      return this.uNNnnnuuuN;
   }

   public void UuUVuuUu(float var1) {
      this.uNNnnnuuuN = Math.max(132.0F, var1);
   }

   public Map<String, Float> nuUnNvnuUu() {
      return this.nuUnNvnuUu;
   }

   public Map<String, String> VVuuUN() {
      return this.VVuuUN;
   }

   public float UuUVuuUu(String var1, float var2) {
      Float var3 = this.nuUnNvnuUu.get(var1);
      return var3 != null && Float.isFinite(var3) ? var3 : var2;
   }

   public void C00OOC00oO(String var1, float var2) {
      if (var1 != null && Float.isFinite(var2)) {
         this.nuUnNvnuUu.put(var1, var2);
      }
   }

   public String UuUVuuUu(String var1, String var2) {
      String var3 = this.VVuuUN.get(var1);
      return var3 != null && !var3.isBlank() ? var3 : var2;
   }

   public void C00OOC00oO(String var1, String var2) {
      if (var1 != null) {
         this.VVuuUN.put(var1, var2 == null ? "" : var2);
      }
   }
}
