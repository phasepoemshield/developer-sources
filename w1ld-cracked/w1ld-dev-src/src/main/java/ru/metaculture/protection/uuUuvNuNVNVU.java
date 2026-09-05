package ru.metaculture.protection;

import net.minecraft.class_1297;
import org.joml.Vector2f;

public class uuUuvNuNVNVU implements O000c0oocoo {
   public float UuUVuuUu;
   public float C00OOC00oO;

   public uuUuvNuNVNVU(class_1297 var1) {
      this.UuUVuuUu = var1.method_36454();
      this.C00OOC00oO = var1.method_36455();
   }

   public uuUuvNuNVNVU(float var1, float var2) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
   }

   public float UuUVuuUu(uuUuvNuNVNVU var1) {
      float var2 = UuvVnuU.VVuuUN(var1.UuUVuuUu - this.UuUVuuUu);
      float var3 = var1.C00OOC00oO - this.C00OOC00oO;
      return (float)Math.hypot(Math.abs(var2), Math.abs(var3));
   }

   public double C00OOC00oO(uuUuvNuNVNVU var1) {
      double var2 = UuvVnuU.VVuuUN(var1.UuUVuuUu - this.UuUVuuUu);
      double var4 = UuvVnuU.VVuuUN(var1.C00OOC00oO - this.C00OOC00oO);
      return Math.hypot(var2, var4);
   }

   public static Vector2f UuUVuuUu() {
      return new Vector2f(C00OOC00oO(), uUnuvNvvNU());
   }

   public static float C00OOC00oO() {
      return UuvVnuU.VVuuUN(a_.field_1773.method_19418().method_19330() + (a_.field_1773.method_19418().method_19333() ? 180 : 0));
   }

   public static float uUnuvNvvNU() {
      return (a_.field_1773.method_19418().method_19333() ? -1 : 1) * a_.field_1773.method_19418().method_19329();
   }
}
