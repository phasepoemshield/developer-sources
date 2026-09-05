package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public final class nNnNNuUnU {
   private static final Gson UuuNnUvUuv = new GsonBuilder().create();
   public int UuUVuuUu;
   public int C00OOC00oO;
   public int uUnuvNvvNU;
   public float vVvUvVVuuNvV;
   public float uNNnnnuuuN;
   public float nuUnNvnuUu;
   public float VVuuUN;
   public float vNUvnnVnUvu;
   public OcOOo0COoCoc uVUuuVnNVU;
   public float[][] vuuuNvNuv;
   public float[][] nvUVNnuu;

   public nNnNNuUnU() {
   }

   public nNnNNuUnU(int var1, int var2, int var3, OcOOo0COoCoc var4, float[][] var5, float[][] var6) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
      this.uUnuvNvvNU = var3;
      this.uVUuuVnNVU = var4;
      this.vuuuNvNuv = var5;
      this.nvUVNnuu = var6;
   }

   public boolean UuUVuuUu(int var1, int var2) {
      return this.uVUuuVnNVU != null
         && this.uVUuuVnNVU.UuUVuuUu(var1, var2)
         && this.UuUVuuUu == var1
         && this.C00OOC00oO == var2
         && this.vuuuNvNuv != null
         && this.nvUVNnuu != null;
   }

   public float C00OOC00oO(int var1, int var2) {
      return UuUVuuUu(this.vuuuNvNuv, var1, var2);
   }

   public float uUnuvNvvNU(int var1, int var2) {
      return UuUVuuUu(this.nvUVNnuu, var1, var2);
   }

   public int UuUVuuUu(int var1) {
      return this.vuuuNvNuv != null && var1 >= 0 && var1 < this.vuuuNvNuv.length && this.vuuuNvNuv[var1] != null ? this.vuuuNvNuv[var1].length : 0;
   }

   private static float UuUVuuUu(float[][] var0, int var1, int var2) {
      if (var0 != null && var1 >= 0 && var1 < var0.length) {
         float[] var3 = var0[var1];
         return var3 != null && var3.length != 0 ? var3[Math.floorMod(var2, var3.length)] : 0.0F;
      } else {
         return 0.0F;
      }
   }

   public boolean UuUVuuUu(Path var1) {
      try {
         Files.createDirectories(var1.getParent());

         try (BufferedWriter var2 = Files.newBufferedWriter(var1, StandardCharsets.UTF_8)) {
            UuuNnUvUuv.toJson(this, var2);
         }

         return true;
      } catch (Throwable var7) {
         return false;
      }
   }

   public static nNnNNuUnU C00OOC00oO(Path var0) {
      try {
         if (!Files.isRegularFile(var0)) {
            return null;
         } else {
            nNnNNuUnU var2;
            try (BufferedReader var1 = Files.newBufferedReader(var0, StandardCharsets.UTF_8)) {
               var2 = (nNnNNuUnU)UuuNnUvUuv.fromJson(var1, nNnNNuUnU.class);
            }

            return var2;
         }
      } catch (Throwable var6) {
         return null;
      }
   }
}
