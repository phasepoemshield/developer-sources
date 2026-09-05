package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class nnnvUNUvVUVU {
   private final List<nnnvUNUvVUVU.NVnVnNnN> UuUVuuUu = new ArrayList<>();
   private UUID C00OOC00oO;
   private UUID uUnuvNvvNU;
   private String vVvUvVVuuNvV = "";

   public boolean UuUVuuUu() {
      return this.C00OOC00oO != null;
   }

   public String C00OOC00oO() {
      return this.vVvUvVVuuNvV;
   }

   public UUID uUnuvNvvNU() {
      return this.uUnuvNvvNU;
   }

   public List<nnnvUNUvVUVU.NVnVnNnN> vVvUvVVuuNvV() {
      return Collections.unmodifiableList(this.UuUVuuUu);
   }

   public int uNNnnnuuuN() {
      return this.UuUVuuUu.size();
   }

   public boolean UuUVuuUu(UUID var1) {
      return this.uUnuvNvvNU != null && this.uUnuvNvvNU.equals(var1);
   }

   public nnnvUNUvVUVU.NVnVnNnN UuUVuuUu(String var1) {
      for (nnnvUNUvVUVU.NVnVnNnN var3 : this.UuUVuuUu) {
         if (var3.username().equalsIgnoreCase(var1)) {
            return var3;
         }
      }

      return null;
   }

   void UuUVuuUu(UUID var1, UUID var2, String var3, List<nnnvUNUvVUVU.NVnVnNnN> var4) {
      this.C00OOC00oO = var1;
      this.uUnuvNvvNU = var2;
      this.vVvUvVVuuNvV = var3 == null ? "" : var3;
      this.UuUVuuUu.clear();
      this.UuUVuuUu.addAll(var4);
   }

   void nuUnNvnuUu() {
      this.C00OOC00oO = null;
      this.uUnuvNvvNU = null;
      this.vVvUvVVuuNvV = "";
      this.UuUVuuUu.clear();
   }

   public record NVnVnNnN(UUID uuid, String username) {
   }
}
