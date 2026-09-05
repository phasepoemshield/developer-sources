package ru.metaculture.protection;

import java.util.Objects;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import org.joml.Matrix4f;

public final class uUnnuUn extends VunUNUNVUnv {
   private final class_310 UuUVuuUu;
   private final class_757 C00OOC00oO;
   private final VUVnuvunnvuV uUnuvNvvNU;
   private final float vVvUvVVuuNvV;

   public uUnnuUn(class_310 var1, class_757 var2, VUVnuvunnvuV var3, float var4) {
      this.UuUVuuUu = Objects.requireNonNull(var1, "client");
      this.C00OOC00oO = Objects.requireNonNull(var2, "gameRenderer");
      this.uUnuvNvvNU = Objects.requireNonNull(var3, "worldRenderer");
      this.vVvUvVVuuNvV = var4;
   }

   public class_310 uUnuvNvvNU() {
      return this.UuUVuuUu;
   }

   public class_757 vVvUvVVuuNvV() {
      return this.C00OOC00oO;
   }

   public VUVnuvunnvuV uNNnnnuuuN() {
      return this.uUnuvNvvNU;
   }

   public class_4587 nuUnNvnuUu() {
      return this.uUnuvNvvNU.C00OOC00oO();
   }

   public Matrix4f VVuuUN() {
      return this.uUnuvNvvNU.uUnuvNvvNU();
   }

   public Matrix4f vNUvnnVnUvu() {
      return this.uUnuvNvvNU.uNNnnnuuuN();
   }

   public float uVUuuVnNVU() {
      return this.vVvUvVVuuNvV;
   }
}
