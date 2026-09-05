package ru.metaculture.protection;

import java.util.List;
import java.util.Objects;

public final class uuUnNVuuVUu {
   private final String UuUVuuUu;
   private final String C00OOC00oO;
   private final String uUnuvNvvNU;
   private final float vVvUvVVuuNvV;
   private final List<NUuvnUuVU> uNNnnnuuuN;
   private final List<NUuvnUuVU> nuUnNvnuUu;
   private final VnNnvvVUN VVuuUN;
   private final boolean vNUvnnVnUvu;

   public uuUnNVuuVUu(String var1, String var2, String var3, float var4, List<NUuvnUuVU> var5, List<NUuvnUuVU> var6, VnNnvvVUN var7) {
      this(var1, var2, var3, var4, var5, var6, var7, UuUVuuUu(var3, var6));
   }

   public uuUnNVuuVUu(String var1, String var2, String var3, float var4, List<NUuvnUuVU> var5, List<NUuvnUuVU> var6, VnNnvvVUN var7, boolean var8) {
      this.UuUVuuUu = Objects.requireNonNull(var1, "id");
      this.C00OOC00oO = Objects.requireNonNull(var2, "title");
      this.uUnuvNvvNU = Objects.requireNonNull(var3, "category");
      this.vVvUvVVuuNvV = Math.max(132.0F, var4);
      this.uNNnnnuuuN = List.copyOf(var5);
      this.nuUnNvnuUu = List.copyOf(var6);
      this.VVuuUN = Objects.requireNonNull(var7, "emitter");
      this.vNUvnnVnUvu = var8;
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

   public float vVvUvVVuuNvV() {
      return this.vVvUvVVuuNvV;
   }

   public List<NUuvnUuVU> uNNnnnuuuN() {
      return this.uNNnnnuuuN;
   }

   public List<NUuvnUuVU> nuUnNvnuUu() {
      return this.nuUnNvnuUu;
   }

   public VnNnvvVUN VVuuUN() {
      return this.VVuuUN;
   }

   public boolean vNUvnnVnUvu() {
      return this.vNUvnnVnUvu;
   }

   public NUuvnUuVU UuUVuuUu(String var1) {
      for (NUuvnUuVU var3 : this.uNNnnnuuuN) {
         if (var3.id().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   public NUuvnUuVU C00OOC00oO(String var1) {
      for (NUuvnUuVU var3 : this.nuUnNvnuUu) {
         if (var3.id().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   private static boolean UuUVuuUu(String var0, List<NUuvnUuVU> var1) {
      return var1 != null && !var1.isEmpty();
   }
}
