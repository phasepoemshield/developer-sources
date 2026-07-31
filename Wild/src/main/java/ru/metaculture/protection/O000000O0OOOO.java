package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public final class O000000O0OOOO {
   private static final Gson O0000000000O0 = new GsonBuilder().create();
   public int O00000000;
   public int O000000000;
   public int O0000000000;
   public float O00000000000;
   public float O000000000000;
   public float O0000000000000;
   public float O000000000000O;
   public float O00000000000O;
   public O000000O0OOOO0 O00000000000O0;
   public float[][] O00000000000OO;
   public float[][] O0000000000O;

   public O000000O0OOOO() {
   }

   public O000000O0OOOO(int i, int j, int k, O000000O0OOOO0 o000000O0OOOO0, float[][] fs, float[][] gs) {
      this.O00000000 = i;
      this.O000000000 = j;
      this.O0000000000 = k;
      this.O00000000000O0 = o000000O0OOOO0;
      this.O00000000000OO = fs;
      this.O0000000000O = gs;
   }

   public boolean O00000000(int i, int j) {
      return this.O00000000000O0 != null
         && this.O00000000000O0.O00000000(i, j)
         && this.O00000000 == i
         && this.O000000000 == j
         && this.O00000000000OO != null
         && this.O0000000000O != null;
   }

   public float O000000000(int i, int j) {
      return O00000000(this.O00000000000OO, i, j);
   }

   public float O0000000000(int i, int j) {
      return O00000000(this.O0000000000O, i, j);
   }

   public int O00000000(int i) {
      return this.O00000000000OO != null && i >= 0 && i < this.O00000000000OO.length && this.O00000000000OO[i] != null ? this.O00000000000OO[i].length : 0;
   }

   private static float O00000000(float[][] fs, int i, int j) {
      if (fs != null && i >= 0 && i < fs.length) {
         float[] var3 = fs[i];
         return var3 != null && var3.length != 0 ? var3[Math.floorMod(j, var3.length)] : 0.0F;
      } else {
         return 0.0F;
      }
   }

   public boolean O00000000(Path path) {
      try {
         Files.createDirectories(path.getParent());

         try (BufferedWriter var2 = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            O0000000000O0.toJson(this, var2);
         }

         return true;
      } catch (Throwable var7) {
         return false;
      }
   }

   public static O000000O0OOOO O000000000(Path path) {
      try {
         if (!Files.isRegularFile(path)) {
            return null;
         } else {
            O000000O0OOOO var2;
            try (BufferedReader var1 = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
               var2 = (O000000O0OOOO)O0000000000O0.fromJson(var1, O000000O0OOOO.class);
            }

            return var2;
         }
      } catch (Throwable var6) {
         return null;
      }
   }
}
