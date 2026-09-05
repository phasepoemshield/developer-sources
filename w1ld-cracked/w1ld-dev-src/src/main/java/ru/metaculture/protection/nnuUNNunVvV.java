package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class nnuUNNunVvV {
   private static final Gson UuUVuuUu = new GsonBuilder().setPrettyPrinting().create();
   private static final nnuUNNunVvV C00OOC00oO = new nnuUNNunVvV();
   private final List<nnuUNNunVvV.NVnVnNnN> uUnuvNvvNU = new ArrayList<>();
   private boolean vVvUvVVuuNvV;

   private nnuUNNunVvV() {
   }

   public static nnuUNNunVvV UuUVuuUu() {
      return C00OOC00oO;
   }

   public synchronized List<nnuUNNunVvV.NVnVnNnN> C00OOC00oO() {
      this.uUnuvNvvNU();
      return List.copyOf(this.uUnuvNvvNU);
   }

   public synchronized nnuUNNunVvV.NVnVnNnN UuUVuuUu(String var1, NNUnuvVvUv var2) {
      this.uUnuvNvvNU();
      String var3 = vVvUvVVuuNvV(var1);
      if (!var3.isEmpty() && var2 != null) {
         long var4 = System.currentTimeMillis();
         nnuUNNunVvV.NVnVnNnN var6 = new nnuUNNunVvV.NVnVnNnN(UUID.randomUUID().toString(), var3, var2.uNNnnnuuuN(), var4, var4);
         this.uUnuvNvvNU.add(0, var6);
         this.vVvUvVVuuNvV();
         return var6;
      } else {
         return null;
      }
   }

   public synchronized nnuUNNunVvV.NVnVnNnN UuUVuuUu(String var1, String var2, NNUnuvVvUv var3) {
      this.uUnuvNvvNU();
      String var4 = vVvUvVVuuNvV(var2);
      if (var1 != null && !var4.isEmpty() && var3 != null) {
         for (int var5 = 0; var5 < this.uUnuvNvvNU.size(); var5++) {
            nnuUNNunVvV.NVnVnNnN var6 = this.uUnuvNvvNU.get(var5);
            if (var6.id().equals(var1)) {
               nnuUNNunVvV.NVnVnNnN var7 = new nnuUNNunVvV.NVnVnNnN(var6.id(), var4, var3.uNNnnnuuuN(), var6.createdAt(), System.currentTimeMillis());
               this.uUnuvNvvNU.set(var5, var7);
               this.uNNnnnuuuN();
               this.vVvUvVVuuNvV();
               return var7;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public synchronized boolean UuUVuuUu(String var1) {
      nnuUNNunVvV.NVnVnNnN var2 = this.uUnuvNvvNU(var1);
      return var2 != null && NNUnuvVvUv.C00OOC00oO(var2.key());
   }

   public synchronized boolean C00OOC00oO(String var1) {
      this.uUnuvNvvNU();
      boolean var2 = this.uUnuvNvvNU.removeIf(var1x -> var1x.id().equals(var1));
      if (var2) {
         this.vVvUvVVuuNvV();
      }

      return var2;
   }

   public synchronized nnuUNNunVvV.NVnVnNnN uUnuvNvvNU(String var1) {
      this.uUnuvNvvNU();
      if (var1 == null) {
         return null;
      } else {
         for (nnuUNNunVvV.NVnVnNnN var3 : this.uUnuvNvvNU) {
            if (var3.id().equals(var1)) {
               return var3;
            }
         }

         return null;
      }
   }

   private void uUnuvNvvNU() {
      if (!this.vVvUvVVuuNvV) {
         File var1 = nuUnNvnuUu();
         if (var1 != null) {
            this.vVvUvVVuuNvV = true;
            if (var1.isFile()) {
               try {
                  String var2 = Files.readString(var1.toPath(), StandardCharsets.UTF_8);
                  nnuUNNunVvV.nvnNNunvv var3 = (nnuUNNunVvV.nvnNNunvv)UuUVuuUu.fromJson(var2, nnuUNNunVvV.nvnNNunvv.class);
                  if (var3 == null || var3.presets == null) {
                     return;
                  }

                  for (nnuUNNunVvV.NVnVnNnN var5 : var3.presets) {
                     nnuUNNunVvV.NVnVnNnN var6 = UuUVuuUu(var5);
                     if (var6 != null && this.uUnuvNvvNU.stream().noneMatch(var1x -> var1x.id().equals(var6.id()))) {
                        this.uUnuvNvvNU.add(var6);
                     }
                  }

                  this.uNNnnnuuuN();
               } catch (Throwable var7) {
               }
            }
         }
      }
   }

   private void vVvUvVVuuNvV() {
      File var1 = nuUnNvnuUu();
      if (var1 != null) {
         try {
            File var2 = var1.getParentFile();
            if (var2 != null) {
               Files.createDirectories(var2.toPath());
            }

            Files.writeString(var1.toPath(), UuUVuuUu.toJson(new nnuUNNunVvV.nvnNNunvv(1, this.uUnuvNvvNU)), StandardCharsets.UTF_8);
         } catch (Throwable var3) {
         }
      }
   }

   private void uNNnnnuuuN() {
      this.uUnuvNvvNU.sort(Comparator.comparingLong(nnuUNNunVvV.NVnVnNnN::updatedAt).reversed());
   }

   private static nnuUNNunVvV.NVnVnNnN UuUVuuUu(nnuUNNunVvV.NVnVnNnN var0) {
      if (var0 != null && var0.key() != null && !var0.key().isBlank()) {
         String var1 = vVvUvVVuuNvV(var0.name());
         if (var1.isEmpty()) {
            return null;
         } else {
            String var2 = var0.id() != null && !var0.id().isBlank() ? var0.id() : UUID.randomUUID().toString();
            long var3 = Math.max(0L, var0.createdAt());
            long var5 = Math.max(var3, var0.updatedAt());
            return new nnuUNNunVvV.NVnVnNnN(var2, var1, var0.key().trim(), var3, var5);
         }
      } else {
         return null;
      }
   }

   private static String vVvUvVVuuNvV(String var0) {
      if (var0 == null) {
         return "";
      } else {
         String var1 = var0.replaceAll("\\p{Cntrl}", "").trim().replaceAll("\\s{2,}", " ");
         return var1.length() > 40 ? var1.substring(0, 40).trim() : var1;
      }
   }

   private static File nuUnNvnuUu() {
      return ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu != null
         ? new File(ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu, "custom-rotation-presets.json")
         : null;
   }

   public record NVnVnNnN(String id, String name, String key, long createdAt, long updatedAt) {
   }

   record nvnNNunvv(int version, List<nnuUNNunVvV.NVnVnNnN> presets) {
   }
}
