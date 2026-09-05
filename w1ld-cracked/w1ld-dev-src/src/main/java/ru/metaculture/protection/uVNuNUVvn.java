package ru.metaculture.protection;

import java.util.function.Supplier;
import net.minecraft.class_3675;
import org.lwjgl.glfw.GLFW;

public class uVNuNUVvn extends nvUuvVvuuN {
   public int vVvUvVVuuNvV;
   public String uNNnnnuuuN;
   public boolean nuUnNvnuUu;
   public boolean VVuuUN;
   private final int vNUvnnVnUvu;
   private final boolean uVUuuVnNVU;

   public uVNuNUVvn(String var1, int var2, boolean var3) {
      this.UuUVuuUu = var1;
      this.vVvUvVVuuNvV = var2;
      this.nuUnNvnuUu = var3;
      this.vNUvnnVnUvu = var2;
      this.uVUuuVnNVU = var3;
   }

   public uVNuNUVvn(String var1, int var2) {
      this(var1, var2, false);
   }

   public int uUnuvNvvNU() {
      return this.vVvUvVVuuNvV;
   }

   public void UuUVuuUu(int var1) {
      this.vVvUvVVuuNvV = var1;
   }

   public uVNuNUVvn UuUVuuUu(Supplier<Boolean> var1) {
      this.C00OOC00oO = var1;
      return this;
   }

   @Override
   public void C00OOC00oO() {
      this.vVvUvVVuuNvV = this.vNUvnnVnUvu;
      this.nuUnNvnuUu = this.uVUuuVnNVU;
      this.VVuuUN = false;
   }

   public static boolean C00OOC00oO(int var0) {
      if (O000c0oocoo.a_.field_1755 != null) {
         return false;
      } else {
         long var1 = O000c0oocoo.a_.method_22683().method_4490();
         if (var0 >= 0) {
            return class_3675.method_15987(var1, var0);
         } else if (var0 <= -100) {
            int var3 = -var0 - 100;
            return GLFW.glfwGetMouseButton(var1, var3) == 1;
         } else {
            return false;
         }
      }
   }
}
