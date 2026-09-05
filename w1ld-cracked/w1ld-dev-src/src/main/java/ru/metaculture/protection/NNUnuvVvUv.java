package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public final class NNUnuvVvUv {
   public static final String[] UuUVuuUu = new String[]{"Multipoint", "Center", "Eyes", "Closest"};
   public static final String[] C00OOC00oO = new String[]{"Cycle", "Closest", "Random"};
   public static final String[] uUnuvNvvNU = new String[]{"Smooth", "Static", "Locked"};
   public static final String[] vVvUvVVuuNvV = new String[]{"FunTime", "Spooky", "Holy", "Matrix", "Smooth", "Snap"};
   public static final String uNNnnnuuuN = "Custom";
   public static final int nuUnNvnuUu = 12;
   private static final Gson uUVvnUuNvvN = new GsonBuilder().setPrettyPrinting().create();
   private static NNUnuvVvUv UUuUnNVNuuv;
   @SerializedName("name")
   public String VVuuUN = "FunTime";
   @SerializedName("engine")
   public String vNUvnnVnUvu = "FunTime";
   @SerializedName("preset")
   public String uVUuuVnNVU = "FunTime";
   @SerializedName("pointMode")
   public String vuuuNvNuv = "Multipoint";
   @SerializedName("yawSpeedMin")
   public float nvUVNnuu = 35.0F;
   @SerializedName("yawSpeedMax")
   public float UuuNnUvUuv = 55.0F;
   @SerializedName("pitchSpeedMin")
   public float nUUVuvU = 6.0F;
   @SerializedName("pitchSpeedMax")
   public float UnUNVVVNuv = 12.0F;
   @SerializedName("attackYawSpeed")
   public float vNVuvnUUnuUn = 65.0F;
   @SerializedName("attackPitchSpeed")
   public float UvnvNVnnnnNU = 22.0F;
   @SerializedName("yawRandom")
   public float uVUVnuvnuVuv = 4.0F;
   @SerializedName("pitchRandom")
   public float NVNnnvnuunNv = 3.0F;
   @SerializedName("oscillateX")
   public float uVunuUNVVUUV = 0.2F;
   @SerializedName("oscillateY")
   public float UNnVVNvvnVvU = 0.12F;
   @SerializedName("oscillateSpeed")
   public float uNnUnnuNUnNu = 1.0F;
   @SerializedName("sidePointOffset")
   public float NnUuNNU = 0.0F;
   @SerializedName("returnSpeed")
   public float nNvNUVU = 30.0F;
   @SerializedName("moveHead")
   public boolean UnUNuUU = false;
   @SerializedName("multipointMode")
   public String uUVuVvuNUvnu = "Cycle";
   @SerializedName("pointDwell")
   public float UvUvUNuvNU = 0.9F;
   @SerializedName("pitchFollow")
   public String c0oOOCcCoC0 = "Smooth";
   @SerializedName("yawOffset")
   public float VVnVNnunVvu = 0.0F;
   @SerializedName("pitchOffset")
   public float unNNVVNnvvV = 0.0F;
   @SerializedName("pitchMin")
   public float NuunnvnN = -90.0F;
   @SerializedName("pitchMax")
   public float NVUunUNUN = 90.0F;
   @SerializedName("headLead")
   public float UUVNuUNUvUnV = 0.0F;
   @SerializedName("overlayLerp")
   public float vuvnUnVnUNnV = 0.35F;
   @SerializedName("overlayAimSpeed")
   public float nnuUVNUuvvVU = 1.0F;
   @SerializedName("pointSwitchSpeed")
   public float nVVUuvuNnUN = 1.0F;
   @SerializedName("lookAway")
   public boolean nNnVnUNVV = false;
   @SerializedName("lookAwayAngle")
   public float nuunNvv = 80.0F;
   @SerializedName("lookAwayInterval")
   public float uUVVvVVNvvn = 5.0F;
   @SerializedName("points")
   public List<NNUnuvVvUv.NVnVnNnN> vvUVNVvvNUv = new ArrayList<>();
   public static final String UuNnnVnuNNV = "WILD-ROT:";

   private NNUnuvVvUv() {
   }

   public static synchronized NNUnuvVvUv UuUVuuUu() {
      if (UUuUnNVNuuv == null) {
         UUuUnNVNuuv = vuuuNvNuv();
      }

      UUuUnNVNuuv.C00OOC00oO();
      return UUuUnNVNuuv;
   }

   public synchronized void C00OOC00oO() {
      this.VVuuUN();
      if (this.vuuuNvNuv == null || !UuUVuuUu(UuUVuuUu, this.vuuuNvNuv)) {
         this.vuuuNvNuv = "Multipoint";
      }

      if (this.uUVuVvuNUvnu == null || !UuUVuuUu(C00OOC00oO, this.uUVuVvuNUvnu)) {
         this.uUVuVvuNUvnu = "Cycle";
      }

      if (this.c0oOOCcCoC0 == null || !UuUVuuUu(uUnuvNvvNU, this.c0oOOCcCoC0)) {
         this.c0oOOCcCoC0 = "Smooth";
      }

      if (this.vvUVNVvvNUv == null) {
         this.vvUVNVvvNUv = new ArrayList<>();
      }

      while (this.vvUVNVvvNUv.size() > 12) {
         this.vvUVNVvvNUv.remove(this.vvUVNVvvNUv.size() - 1);
      }

      for (NNUnuvVvUv.NVnVnNnN var2 : this.vvUVNVvvNUv) {
         var2.UuUVuuUu = UuUVuuUu(var2.UuUVuuUu, -0.5F, 0.5F);
         var2.C00OOC00oO = UuUVuuUu(var2.C00OOC00oO, 0.0F, 1.0F);
      }

      this.nvUVNnuu = UuUVuuUu(this.nvUVNnuu, 0.0F, 200.0F);
      this.UuuNnUvUuv = UuUVuuUu(this.UuuNnUvUuv, 0.0F, 200.0F);
      if (this.UuuNnUvUuv < this.nvUVNnuu) {
         this.UuuNnUvUuv = this.nvUVNnuu;
      }

      this.nUUVuvU = UuUVuuUu(this.nUUVuvU, 0.0F, 200.0F);
      this.UnUNVVVNuv = UuUVuuUu(this.UnUNVVVNuv, 0.0F, 200.0F);
      if (this.UnUNVVVNuv < this.nUUVuvU) {
         this.UnUNVVVNuv = this.nUUVuvU;
      }

      this.vNVuvnUUnuUn = UuUVuuUu(this.vNVuvnUUnuUn, 0.0F, 240.0F);
      this.UvnvNVnnnnNU = UuUVuuUu(this.UvnvNVnnnnNU, 0.0F, 240.0F);
      this.uVUVnuvnuVuv = UuUVuuUu(this.uVUVnuvnuVuv, 0.0F, 20.0F);
      this.NVNnnvnuunNv = UuUVuuUu(this.NVNnnvnuunNv, 0.0F, 20.0F);
      this.uVunuUNVVUUV = UuUVuuUu(this.uVunuUNVVUUV, 0.0F, 1.0F);
      this.UNnVVNvvnVvU = UuUVuuUu(this.UNnVVNvvnVvU, 0.0F, 1.0F);
      this.uNnUnnuNUnNu = UuUVuuUu(this.uNnUnnuNUnNu, 0.2F, 3.0F);
      this.NnUuNNU = UuUVuuUu(this.NnUuNNU, 0.0F, 0.6F);
      this.nNvNUVU = UuUVuuUu(this.nNvNUVU, 5.0F, 120.0F);
      this.UvUvUNuvNU = UuUVuuUu(this.UvUvUNuvNU, 0.1F, 3.0F);
      this.VVnVNnunVvu = UuUVuuUu(this.VVnVNnunVvu, -30.0F, 30.0F);
      this.unNNVVNnvvV = UuUVuuUu(this.unNNVVNnvvV, -30.0F, 30.0F);
      this.NuunnvnN = UuUVuuUu(this.NuunnvnN, -90.0F, 0.0F);
      this.NVUunUNUN = UuUVuuUu(this.NVUunUNUN, 0.0F, 90.0F);
      this.UUVNuUNUvUnV = UuUVuuUu(this.UUVNuUNUvUnV, 0.0F, 0.6F);
      this.vuvnUnVnUNnV = UuUVuuUu(this.vuvnUnVnUNnV, 0.05F, 1.0F);
      this.nnuUVNUuvvVU = UuUVuuUu(this.nnuUVNUuvvVU, 0.2F, 3.0F);
      this.nVVUuvuNnUN = UuUVuuUu(this.nVVUuvuNnUN, 0.1F, 3.0F);
      this.nuunNvv = UuUVuuUu(this.nuunNvv, 0.0F, 90.0F);
      this.uUVVvVVNvvn = UuUVuuUu(this.uUVVvVVNvvn, 1.5F, 15.0F);
   }

   public synchronized void UuUVuuUu(float var1, float var2) {
      if (this.vvUVNVvvNUv.size() < 12) {
         this.vvUVNVvvNUv.add(new NNUnuvVvUv.NVnVnNnN(UuUVuuUu(var1, -0.5F, 0.5F), UuUVuuUu(var2, 0.0F, 1.0F)));
         nuUnNvnuUu();
      }
   }

   public synchronized void uUnuvNvvNU() {
      this.vvUVNVvvNUv.clear();
      nuUnNvnuUu();
   }

   public synchronized void UuUVuuUu(NNUnuvVvUv.NVnVnNnN var1) {
      this.vvUVNVvvNUv.remove(var1);
      nuUnNvnuUu();
   }

   private static boolean UuUVuuUu(String[] var0, String var1) {
      for (String var5 : var0) {
         if (var5.equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public synchronized void UuUVuuUu(String var1) {
      switch (var1) {
         case "FunTime":
            this.vuuuNvNuv = "Multipoint";
            this.nvUVNnuu = 35.0F;
            this.UuuNnUvUuv = 55.0F;
            this.nUUVuvU = 5.0F;
            this.UnUNVVVNuv = 10.0F;
            this.vNVuvnUUnuUn = 65.0F;
            this.UvnvNVnnnnNU = 22.0F;
            this.uVUVnuvnuVuv = 4.3F;
            this.NVNnnvnuunNv = 3.6F;
            this.uVunuUNVVUUV = 0.2F;
            this.UNnVVNvvnVvU = 0.13F;
            this.uNnUnnuNUnNu = 1.0F;
            this.NnUuNNU = 0.0F;
            this.nNvNUVU = 30.0F;
            break;
         case "Spooky":
            this.vuuuNvNuv = "Multipoint";
            this.nvUVNnuu = 40.0F;
            this.UuuNnUvUuv = 60.0F;
            this.nUUVuvU = 10.0F;
            this.UnUNVVVNuv = 21.0F;
            this.vNVuvnUUnuUn = 60.0F;
            this.UvnvNVnnnnNU = 25.0F;
            this.uVUVnuvnuVuv = 3.0F;
            this.NVNnnvnuunNv = 6.0F;
            this.uVunuUNVVUUV = 0.12F;
            this.UNnVVNvvnVvU = 0.05F;
            this.uNnUnnuNUnNu = 1.2F;
            this.NnUuNNU = 0.0F;
            this.nNvNUVU = 30.0F;
            break;
         case "Holy":
            this.vuuuNvNuv = "Center";
            this.nvUVNnuu = 50.0F;
            this.UuuNnUvUuv = 70.0F;
            this.nUUVuvU = 10.0F;
            this.UnUNVVVNuv = 20.0F;
            this.vNVuvnUUnuUn = 70.0F;
            this.UvnvNVnnnnNU = 24.0F;
            this.uVUVnuvnuVuv = 2.0F;
            this.NVNnnvnuunNv = 2.0F;
            this.uVunuUNVVUUV = 0.2F;
            this.UNnVVNvvnVvU = 0.3F;
            this.uNnUnnuNUnNu = 0.7F;
            this.NnUuNNU = 0.0F;
            this.nNvNUVU = 30.0F;
            break;
         case "Matrix":
            this.vuuuNvNuv = "Eyes";
            this.nvUVNnuu = 38.0F;
            this.UuuNnUvUuv = 43.0F;
            this.nUUVuvU = 3.0F;
            this.UnUNVVVNuv = 5.0F;
            this.vNVuvnUUnuUn = 43.0F;
            this.UvnvNVnnnnNU = 6.0F;
            this.uVUVnuvnuVuv = 3.0F;
            this.NVNnnvnuunNv = 4.0F;
            this.uVunuUNVVUUV = 0.4F;
            this.UNnVVNvvnVvU = 0.02F;
            this.uNnUnnuNUnNu = 1.4F;
            this.NnUuNNU = 0.0F;
            this.nNvNUVU = 30.0F;
            break;
         case "Smooth":
            this.vuuuNvNuv = "Center";
            this.nvUVNnuu = 18.0F;
            this.UuuNnUvUuv = 26.0F;
            this.nUUVuvU = 4.0F;
            this.UnUNVVVNuv = 8.0F;
            this.vNVuvnUUnuUn = 30.0F;
            this.UvnvNVnnnnNU = 12.0F;
            this.uVUVnuvnuVuv = 0.5F;
            this.NVNnnvnuunNv = 0.5F;
            this.uVunuUNVVUUV = 0.0F;
            this.UNnVVNvvnVvU = 0.0F;
            this.uNnUnnuNUnNu = 1.0F;
            this.NnUuNNU = 0.0F;
            this.nNvNUVU = 20.0F;
            break;
         case "Snap":
            this.vuuuNvNuv = "Closest";
            this.nvUVNnuu = 120.0F;
            this.UuuNnUvUuv = 180.0F;
            this.nUUVuvU = 80.0F;
            this.UnUNVVVNuv = 120.0F;
            this.vNVuvnUUnuUn = 200.0F;
            this.UvnvNVnnnnNU = 160.0F;
            this.uVUVnuvnuVuv = 1.0F;
            this.NVNnnvnuunNv = 1.0F;
            this.uVunuUNVVUUV = 0.0F;
            this.UNnVVNvvnVvU = 0.0F;
            this.uNnUnnuNUnNu = 1.0F;
            this.NnUuNNU = 0.0F;
            this.nNvNUVU = 40.0F;
         case "Custom":
      }

      this.VVuuUN = var1;
      if ("Custom".equals(var1)) {
         this.vNUvnnVnUvu = "Custom";
         this.uVUuuVnNVU = "Custom";
      } else if (UuUVuuUu(vVvUvVVuuNvV, var1)) {
         this.vNUvnnVnUvu = var1;
         this.uVUuuVnNVU = var1;
      } else {
         this.vNUvnnVnUvu = "Custom";
         this.uVUuuVnNVU = "Custom";
      }

      this.C00OOC00oO();
      nuUnNvnuUu();
   }

   private synchronized void VVuuUN() {
      String var1 = vVvUvVVuuNvV(this.uVUuuVnNVU);
      if (var1 == null) {
         var1 = vVvUvVVuuNvV(this.VVuuUN);
      }

      if (var1 == null) {
         var1 = vVvUvVVuuNvV(this.vNUvnnVnUvu);
      }

      if (var1 != null) {
         this.uVUuuVnNVU = var1;
         this.VVuuUN = var1;
         this.vNUvnnVnUvu = var1;
      } else if (this.vNUvnnVnUvu()) {
         this.VVuuUN = "Custom";
         this.vNUvnnVnUvu = "Custom";
         this.uVUuuVnNVU = "Custom";
      } else {
         if (this.vNUvnnVnUvu == null || this.vNUvnnVnUvu.isBlank()) {
            this.vNUvnnVnUvu = "Custom";
         }

         if (!"Custom".equals(this.vNUvnnVnUvu) && !UuUVuuUu(vVvUvVVuuNvV, this.vNUvnnVnUvu)) {
            this.vNUvnnVnUvu = "Custom";
         }

         if (this.VVuuUN == null || this.VVuuUN.isBlank()) {
            this.VVuuUN = this.vNUvnnVnUvu;
         }

         if (this.uVUuuVnNVU == null || this.uVUuuVnNVU.isBlank()) {
            this.uVUuuVnNVU = "Custom".equals(this.vNUvnnVnUvu) ? "Custom" : this.vNUvnnVnUvu;
         }
      }
   }

   private boolean vNUvnnVnUvu() {
      return "Custom".equalsIgnoreCase(uUnuvNvvNU(this.uVUuuVnNVU))
         || "Custom".equalsIgnoreCase(uUnuvNvvNU(this.VVuuUN))
         || "custom".equalsIgnoreCase(uUnuvNvvNU(this.VVuuUN));
   }

   private static String uUnuvNvvNU(String var0) {
      return var0 == null ? "" : var0.trim();
   }

   private static String vVvUvVVuuNvV(String var0) {
      if (var0 != null && !var0.isBlank()) {
         String var1 = var0.trim();
         if (!"Custom".equalsIgnoreCase(var1) && !"custom".equalsIgnoreCase(var1)) {
            for (String var5 : vVvUvVVuuNvV) {
               if (var5.equalsIgnoreCase(var1)) {
                  return var5;
               }
            }

            return null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public synchronized void vVvUvVVuuNvV() {
      this.UuUVuuUu("FunTime");
      this.vvUVNVvvNUv.clear();
      this.uUVuVvuNUvnu = "Cycle";
      this.UvUvUNuvNU = 0.9F;
      this.nVVUuvuNnUN = 1.0F;
      this.UnUNuUU = false;
      this.uVUuuVnNVU();
      this.C00OOC00oO();
      nuUnNvnuUu();
   }

   private synchronized void uVUuuVnNVU() {
      this.c0oOOCcCoC0 = "Smooth";
      this.VVnVNnunVvu = 0.0F;
      this.unNNVVNnvvV = 0.0F;
      this.NuunnvnN = -90.0F;
      this.NVUunUNUN = 90.0F;
      this.UUVNuUNUvUnV = 0.0F;
      this.vuvnUnVnUNnV = 0.35F;
      this.nnuUVNUuvvVU = 1.0F;
      this.nNnVnUNVV = false;
      this.nuunNvv = 80.0F;
      this.uUVVvVVNvvn = 5.0F;
   }

   public synchronized String uNNnnnuuuN() {
      this.C00OOC00oO();
      String var1 = uUVvnUuNvvN.toJson(this);
      String var2 = Base64.getUrlEncoder().withoutPadding().encodeToString(var1.getBytes(StandardCharsets.UTF_8));
      return "WILD-ROT:" + var2;
   }

   public static synchronized boolean C00OOC00oO(String var0) {
      if (var0 == null) {
         return false;
      } else {
         String var1 = var0.trim();
         if (var1.startsWith("WILD-ROT:")) {
            var1 = var1.substring("WILD-ROT:".length());
         }

         var1 = var1.trim();
         if (var1.isEmpty()) {
            return false;
         } else {
            try {
               byte[] var2 = Base64.getUrlDecoder().decode(var1);
               String var3 = new String(var2, StandardCharsets.UTF_8);
               NNUnuvVvUv var4 = (NNUnuvVvUv)uUVvnUuNvvN.fromJson(var3, NNUnuvVvUv.class);
               if (var4 == null) {
                  return false;
               } else {
                  NNUnuvVvUv var5 = UuUVuuUu();
                  var5.UuUVuuUu(var4);
                  var5.C00OOC00oO();
                  nuUnNvnuUu();
                  return true;
               }
            } catch (Throwable var6) {
               return false;
            }
         }
      }
   }

   private synchronized void UuUVuuUu(NNUnuvVvUv var1) {
      this.VVuuUN = var1.VVuuUN;
      this.vNUvnnVnUvu = var1.vNUvnnVnUvu;
      this.uVUuuVnNVU = var1.uVUuuVnNVU;
      this.vuuuNvNuv = var1.vuuuNvNuv;
      this.nvUVNnuu = var1.nvUVNnuu;
      this.UuuNnUvUuv = var1.UuuNnUvUuv;
      this.nUUVuvU = var1.nUUVuvU;
      this.UnUNVVVNuv = var1.UnUNVVVNuv;
      this.vNVuvnUUnuUn = var1.vNVuvnUUnuUn;
      this.UvnvNVnnnnNU = var1.UvnvNVnnnnNU;
      this.uVUVnuvnuVuv = var1.uVUVnuvnuVuv;
      this.NVNnnvnuunNv = var1.NVNnnvnuunNv;
      this.uVunuUNVVUUV = var1.uVunuUNVVUUV;
      this.UNnVVNvvnVvU = var1.UNnVVNvvnVvU;
      this.uNnUnnuNUnNu = var1.uNnUnnuNUnNu;
      this.NnUuNNU = var1.NnUuNNU;
      this.nNvNUVU = var1.nNvNUVU;
      this.UnUNuUU = var1.UnUNuUU;
      this.uUVuVvuNUvnu = var1.uUVuVvuNUvnu;
      this.UvUvUNuvNU = var1.UvUvUNuvNU;
      this.c0oOOCcCoC0 = var1.c0oOOCcCoC0;
      this.VVnVNnunVvu = var1.VVnVNnunVvu;
      this.unNNVVNnvvV = var1.unNNVVNnvvV;
      this.NuunnvnN = var1.NuunnvnN;
      this.NVUunUNUN = var1.NVUunUNUN;
      this.UUVNuUNUvUnV = var1.UUVNuUNUvUnV;
      this.vuvnUnVnUNnV = var1.vuvnUnVnUNnV;
      this.nnuUVNUuvvVU = var1.nnuUVNUuvvVU;
      this.nVVUuvuNnUN = var1.nVVUuvuNnUN;
      this.nNnVnUNVV = var1.nNnVnUNVV;
      this.nuunNvv = var1.nuunNvv;
      this.uUVVvVVNvvn = var1.uUVVvVVNvvn;
      this.vvUVNVvvNUv = new ArrayList<>();
      if (var1.vvUVNVvvNUv != null) {
         for (NNUnuvVvUv.NVnVnNnN var3 : var1.vvUVNVvvNUv) {
            if (var3 != null) {
               this.vvUVNVvvNUv.add(new NNUnuvVvUv.NVnVnNnN(var3.UuUVuuUu, var3.C00OOC00oO));
            }
         }
      }
   }

   public static synchronized void nuUnNvnuUu() {
      if (UUuUnNVNuuv != null) {
         File var0 = nvUVNnuu();
         if (var0 != null) {
            try {
               File var1 = var0.getParentFile();
               if (var1 != null && !var1.exists()) {
                  var1.mkdirs();
               }

               try (FileWriter var2 = new FileWriter(var0)) {
                  uUVvnUuNvvN.toJson(UUuUnNVNuuv, var2);
               }
            } catch (Throwable var7) {
            }
         }
      }
   }

   private static NNUnuvVvUv vuuuNvNuv() {
      File var0 = nvUVNnuu();
      if (var0 != null && var0.exists()) {
         try {
            NNUnuvVvUv var3;
            try (FileReader var7 = new FileReader(var0)) {
               NNUnuvVvUv var2 = (NNUnuvVvUv)uUVvnUuNvvN.fromJson(var7, NNUnuvVvUv.class);
               if (var2 == null) {
                  return new NNUnuvVvUv();
               }

               var3 = var2;
            }

            return var3;
         } catch (Throwable var6) {
            return new NNUnuvVvUv();
         }
      } else {
         NNUnuvVvUv var1 = new NNUnuvVvUv();
         var1.C00OOC00oO();
         return var1;
      }
   }

   private static File nvUVNnuu() {
      return ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu != null
         ? new File(ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu, "custom-rotation.json")
         : null;
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return !Float.isFinite(var0) ? var1 : Math.max(var1, Math.min(var2, var0));
   }

   public static final class NVnVnNnN {
      @SerializedName("x")
      public float UuUVuuUu;
      @SerializedName("y")
      public float C00OOC00oO;

      public NVnVnNnN() {
      }

      public NVnVnNnN(float var1, float var2) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
      }
   }
}
