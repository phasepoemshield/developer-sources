package ru.metaculture.protection;

import java.util.Objects;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_746;

public final class vVvVNUVuuUuu extends VunUNUNVUnv {
   private final class_310 UuUVuuUu;
   private final class_746 C00OOC00oO;
   private final class_638 uUnuvNvvNU;

   public vVvVNUVuuUuu(class_310 var1, class_746 var2, class_638 var3) {
      this.UuUVuuUu = Objects.requireNonNull(var1, "client");
      this.C00OOC00oO = Objects.requireNonNull(var2, "player");
      this.uUnuvNvvNU = Objects.requireNonNull(var3, "world");
   }

   public class_310 uUnuvNvvNU() {
      return this.UuUVuuUu;
   }

   public class_746 vVvUvVVuuNvV() {
      return this.C00OOC00oO;
   }

   public class_638 uNNnnnuuuN() {
      return this.uUnuvNvvNU;
   }
}
