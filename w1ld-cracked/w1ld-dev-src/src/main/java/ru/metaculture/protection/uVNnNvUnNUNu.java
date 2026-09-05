package ru.metaculture.protection;

import java.util.Objects;
import net.minecraft.class_310;

public final class uVNnNvUnNUNu extends VunUNUNVUnv {
   private final class_310 UuUVuuUu;
   private final UnVNvNnU C00OOC00oO;
   private final nUVnuvUu uUnuvNvvNU;
   private final int vVvUvVVuuNvV;
   private final int uNNnnnuuuN;

   public uVNnNvUnNUNu(class_310 var1, UnVNvNnU var2, nUVnuvUu var3, int var4, int var5) {
      this.UuUVuuUu = Objects.requireNonNull(var1, "client");
      this.C00OOC00oO = Objects.requireNonNull(var2, "renderer");
      this.uUnuvNvvNU = Objects.requireNonNull(var3, "defaultFont");
      this.vVvUvVVuuNvV = var4;
      this.uNNnnnuuuN = var5;
   }

   public class_310 uUnuvNvvNU() {
      return this.UuUVuuUu;
   }

   public UnVNvNnU vVvUvVVuuNvV() {
      return this.C00OOC00oO;
   }

   public nUVnuvUu uNNnnnuuuN() {
      return this.uUnuvNvvNU;
   }

   public int nuUnNvnuUu() {
      return this.vVvUvVVuuNvV;
   }

   public int VVuuUN() {
      return this.uNNnnnuuuN;
   }
}
