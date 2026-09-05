package ru.metaculture.protection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.lwjgl.opengl.GL20;

public final class uUvVUVnVNV implements AutoCloseable {
   private final Map<String, uUvVUVnVNV.NVnVnNnN> UuUVuuUu = new LinkedHashMap<>();
   private final Map<String, String> C00OOC00oO = new HashMap<>();

   public uUvVUVnVNV.NVnVnNnN UuUVuuUu(String var1, String var2, String var3) {
      uUvVUVnVNV.NVnVnNnN var4 = this.UuUVuuUu.get(var1);
      if (var4 != null) {
         return var4;
      } else {
         String var5 = this.C00OOC00oO.get(var1);
         if (var5 != null) {
            throw new IllegalStateException("Shader '" + var1 + "' previously failed: " + var5);
         } else {
            try {
               uUvVUVnVNV.NVnVnNnN var6 = new uUvVUVnVNV.NVnVnNnN(vVvUNNUVVnNn.UuUVuuUu(var2, var3));
               this.UuUVuuUu.put(var1, var6);
               return var6;
            } catch (Throwable var8) {
               this.C00OOC00oO.put(var1, String.valueOf(var8.getMessage()));
               VUUUNuNNn.C00OOC00oO("shader-manager", "cached failure for '" + var1 + "', no further GL attempts: " + var8);
               throw var8 instanceof RuntimeException var7 ? var7 : new IllegalStateException("Shader '" + var1 + "' failed", var8);
            }
         }
      }
   }

   public uUvVUVnVNV.NVnVnNnN C00OOC00oO(String var1, String var2, String var3) {
      uUvVUVnVNV.NVnVnNnN var4 = this.UuUVuuUu.get(var1);
      if (var4 != null) {
         return var4;
      } else if (this.C00OOC00oO.containsKey(var1)) {
         return null;
      } else {
         try {
            return this.UuUVuuUu(var1, var2, var3);
         } catch (Throwable var6) {
            return null;
         }
      }
   }

   @Override
   public void close() {
      for (uUvVUVnVNV.NVnVnNnN var2 : this.UuUVuuUu.values()) {
         var2.close();
      }

      this.UuUVuuUu.clear();
      this.C00OOC00oO.clear();
   }

   public void UuUVuuUu() {
   }

   public static final class NVnVnNnN implements AutoCloseable {
      private final vVvUNNUVVnNn UuUVuuUu;
      private final Map<String, uUvVUVnVNV.nvnNNunvv> C00OOC00oO = new HashMap<>();

      NVnVnNnN(vVvUNNUVVnNn var1) {
         this.UuUVuuUu = var1;
      }

      public void UuUVuuUu() {
         GL20.glUseProgram(this.UuUVuuUu.uUnuvNvvNU());
      }

      public void UuUVuuUu(String var1, int var2) {
         uUvVUVnVNV.nvnNNunvv var3 = this.UuUVuuUu(var1);
         if (var3.UuUVuuUu >= 0 && var3.UuUVuuUu(0, var2, 0.0F, 0.0F, 0.0F, 0.0F)) {
            GL20.glUniform1i(var3.UuUVuuUu, var2);
         }
      }

      public void UuUVuuUu(String var1, float var2) {
         uUvVUVnVNV.nvnNNunvv var3 = this.UuUVuuUu(var1);
         if (var3.UuUVuuUu >= 0 && var3.UuUVuuUu(1, 0, var2, 0.0F, 0.0F, 0.0F)) {
            GL20.glUniform1f(var3.UuUVuuUu, var2);
         }
      }

      public void UuUVuuUu(String var1, float var2, float var3) {
         uUvVUVnVNV.nvnNNunvv var4 = this.UuUVuuUu(var1);
         if (var4.UuUVuuUu >= 0 && var4.UuUVuuUu(2, 0, var2, var3, 0.0F, 0.0F)) {
            GL20.glUniform2f(var4.UuUVuuUu, var2, var3);
         }
      }

      public void UuUVuuUu(String var1, float var2, float var3, float var4) {
         uUvVUVnVNV.nvnNNunvv var5 = this.UuUVuuUu(var1);
         if (var5.UuUVuuUu >= 0 && var5.UuUVuuUu(3, 0, var2, var3, var4, 0.0F)) {
            GL20.glUniform3f(var5.UuUVuuUu, var2, var3, var4);
         }
      }

      public void UuUVuuUu(String var1, float var2, float var3, float var4, float var5) {
         uUvVUVnVNV.nvnNNunvv var6 = this.UuUVuuUu(var1);
         if (var6.UuUVuuUu >= 0 && var6.UuUVuuUu(4, 0, var2, var3, var4, var5)) {
            GL20.glUniform4f(var6.UuUVuuUu, var2, var3, var4, var5);
         }
      }

      private uUvVUVnVNV.nvnNNunvv UuUVuuUu(String var1) {
         uUvVUVnVNV.nvnNNunvv var2 = this.C00OOC00oO.get(var1);
         if (var2 == null) {
            var2 = new uUvVUVnVNV.nvnNNunvv(this.UuUVuuUu.UuUVuuUu(var1));
            this.C00OOC00oO.put(var1, var2);
         }

         return var2;
      }

      @Override
      public void close() {
         this.UuUVuuUu.C00OOC00oO();
         this.C00OOC00oO.clear();
      }
   }

   static final class nvnNNunvv {
      final int UuUVuuUu;
      private int C00OOC00oO = -1;
      private int uUnuvNvvNU;
      private float vVvUvVVuuNvV;
      private float uNNnnnuuuN;
      private float nuUnNvnuUu;
      private float VVuuUN;

      nvnNNunvv(int var1) {
         this.UuUVuuUu = var1;
      }

      boolean UuUVuuUu(int var1, int var2, float var3, float var4, float var5, float var6) {
         if (this.C00OOC00oO == var1
            && this.uUnuvNvvNU == var2
            && Float.floatToIntBits(this.vVvUvVVuuNvV) == Float.floatToIntBits(var3)
            && Float.floatToIntBits(this.uNNnnnuuuN) == Float.floatToIntBits(var4)
            && Float.floatToIntBits(this.nuUnNvnuUu) == Float.floatToIntBits(var5)
            && Float.floatToIntBits(this.VVuuUN) == Float.floatToIntBits(var6)) {
            return false;
         } else {
            this.C00OOC00oO = var1;
            this.uUnuvNvvNU = var2;
            this.vVvUvVVuuNvV = var3;
            this.uNNnnnuuuN = var4;
            this.nuUnNvnuUu = var5;
            this.VVuuUN = var6;
            return true;
         }
      }
   }
}
