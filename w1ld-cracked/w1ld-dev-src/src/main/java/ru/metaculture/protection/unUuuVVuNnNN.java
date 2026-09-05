package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public final class unUuuVVuNnNN {
   public static final String UuUVuuUu = "HUD_HotKeys";
   public static final String C00OOC00oO = "HUD_Inventory";
   public static final String uUnuvNvvNU = "HUD_Potions";
   public static final String vVvUvVVuuNvV = "HUD_CoolDowns";
   public static final String uNNnnnuuuN = "HUD_Info";
   public static final String nuUnNvnuUu = "HUD_WaterMark";
   public static final String VVuuUN = "HUD_ArrayList";
   public static final String vNUvnnVnUvu = "HUD_TargetHUD";
   public static final String uVUuuVnNVU = "hud_armor";
   public static final String vuuuNvNuv = "HUD_HotBar";
   public static final String nvUVNnuu = "HUD_Notifications";
   public static final String UuuNnUvUuv = "HUD_AutoBuyInfo";
   public static final String nUUVuvU = "HUD_AIStatus";
   public static final String UnUNVVVNuv = "HUD_MusicPlayer";
   public static final String vNVuvnUUnuUn = "HUD_ServerHelper";
   static final String[] UvnvNVnnnnNU = new String[]{
      "HUD_HotKeys",
      "HUD_Inventory",
      "HUD_Potions",
      "HUD_CoolDowns",
      "HUD_Info",
      "HUD_WaterMark",
      "HUD_ArrayList",
      "HUD_TargetHUD",
      "hud_armor",
      "HUD_HotBar",
      "HUD_Notifications",
      "HUD_AutoBuyInfo",
      "HUD_AIStatus",
      "HUD_MusicPlayer",
      "HUD_ServerHelper"
   };
   private static final Gson uVUVnuvnuVuv = new GsonBuilder().setPrettyPrinting().create();
   private static unUuuVVuNnNN.nvnNNunvv NVNnnvnuunNv;
   private static boolean uVunuUNVVUUV;

   private unUuuVVuNnNN() {
   }

   public static synchronized unUuuVVuNnNN.NVnVnNnN UuUVuuUu() {
      return UuUVuuUu("HUD_HotKeys");
   }

   public static synchronized unUuuVVuNnNN.NVnVnNnN C00OOC00oO() {
      return UuUVuuUu("HUD_Inventory");
   }

   public static synchronized unUuuVVuNnNN.NVnVnNnN uUnuvNvvNU() {
      return UuUVuuUu("HUD_Potions");
   }

   public static synchronized unUuuVVuNnNN.NVnVnNnN UuUVuuUu(String var0) {
      nuUnNvnuUu();
      String var1 = uUnuvNvvNU(var0);
      unUuuVVuNnNN.NVnVnNnN var2 = NVNnnvnuunNv.uUnuvNvvNU.get(var1);
      if (var2 == null) {
         var2 = unUuuVVuNnNN.NVnVnNnN.UuUVuuUu(var1);
         NVNnnvnuunNv.uUnuvNvvNU.put(var1, var2);
      }

      var2.C00OOC00oO();
      return var2;
   }

   public static synchronized void vVvUvVVuuNvV() {
      C00OOC00oO("HUD_HotKeys");
   }

   public static synchronized void C00OOC00oO(String var0) {
      nuUnNvnuUu();
      String var1 = uUnuvNvvNU(var0);
      NVNnnvnuunNv.uUnuvNvvNU.put(var1, unUuuVVuNnNN.NVnVnNnN.UuUVuuUu(var1));
      nNuUNVu.UuUVuuUu().C00OOC00oO(var1);
      uNNnnnuuuN();
      if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
         ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
      }
   }

   public static synchronized void uNNnnnuuuN() {
      nuUnNvnuUu();
      File var0 = VVuuUN();
      if (var0 != null) {
         try {
            File var1 = var0.getParentFile();
            if (var1 != null && !var1.exists()) {
               var1.mkdirs();
            }

            try (FileWriter var2 = new FileWriter(var0)) {
               uVUVnuvnuVuv.toJson(NVNnnvnuunNv, var2);
            }
         } catch (Throwable var7) {
         }
      }
   }

   private static void nuUnNvnuUu() {
      if (!uVunuUNVVUUV) {
         uVunuUNVVUUV = true;
         NVNnnvnuunNv = new unUuuVVuNnNN.nvnNNunvv();
         File var0 = VVuuUN();
         if (var0 != null && var0.exists()) {
            try (FileReader var1 = new FileReader(var0)) {
               unUuuVVuNnNN.nvnNNunvv var2 = (unUuuVVuNnNN.nvnNNunvv)uVUVnuvnuVuv.fromJson(var1, unUuuVVuNnNN.nvnNNunvv.class);
               if (var2 != null) {
                  NVNnnvnuunNv = var2;
               }
            } catch (Throwable var6) {
               NVNnnvnuunNv = new unUuuVVuNnNN.nvnNNunvv();
            }

            NVNnnvnuunNv.UuUVuuUu();
         } else {
            NVNnnvnuunNv.UuUVuuUu();
         }
      }
   }

   private static File VVuuUN() {
      return ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu != null
         ? new File(ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu, "hud-layouts.json")
         : null;
   }

   static float UuUVuuUu(float var0, float var1, float var2) {
      return !Float.isFinite(var0) ? var1 : Math.max(var1, Math.min(var2, var0));
   }

   private static String uUnuvNvvNU(String var0) {
      for (String var4 : UvnvNVnnnnNU) {
         if (var4.equals(var0)) {
            return var4;
         }
      }

      return "HUD_HotKeys";
   }

   public static final class NVnVnNnN {
      public float UuUVuuUu = 14.0F;
      public float C00OOC00oO = 11.0F;
      public float uUnuvNvvNU = 7.0F;
      public float vVvUvVVuuNvV = 7.0F;
      public float uNNnnnuuuN = 7.0F;
      public float nuUnNvnuUu = 6.0F;
      public float VVuuUN = 4.0F;
      public float vNUvnnVnUvu = 7.0F;
      public float uVUuuVnNVU = 5.0F;
      public float vuuuNvNuv = 32.0F;
      public float nvUVNnuu = 22.0F;
      public float UuuNnUvUuv = 28.0F;
      public float nUUVuvU = 22.0F;
      public float UnUNVVVNuv = 0.0F;
      public float vNVuvnUUnuUn = 2.0F;
      public unUuuVVuNnNN.VvunVVUvUNnv UvnvNVnnnnNU = new unUuuVVuNnNN.VvunVVUvUNnv(17.0F, 29.0F, false);
      public unUuuVVuNnNN.VvunVVUvUNnv uVUVnuvnuVuv = new unUuuVVuNnNN.VvunVVUvUNnv(-34.0F, 29.5F, true);
      public unUuuVVuNnNN.VvunVVUvUNnv NVNnnvnuunNv = new unUuuVVuNnNN.VvunVVUvUNnv(0.0F, 0.0F, false);
      public unUuuVVuNnNN.VvunVVUvUNnv uVunuUNVVUUV = new unUuuVVuNnNN.VvunVVUvUNnv(0.0F, 0.0F, false);

      public static unUuuVVuNnNN.NVnVnNnN UuUVuuUu() {
         return UuUVuuUu("HUD_HotKeys");
      }

      public static unUuuVVuNnNN.NVnVnNnN UuUVuuUu(String var0) {
         unUuuVVuNnNN.NVnVnNnN var1 = new unUuuVVuNnNN.NVnVnNnN();
         if ("HUD_Inventory".equals(var0)) {
            var1.UvnvNVnnnnNU = new unUuuVVuNnNN.VvunVVUvUNnv(17.0F, 29.0F, false);
            var1.uVUVnuvnuVuv = new unUuuVVuNnNN.VvunVVUvUNnv(-34.0F, 30.0F, true);
            var1.uUnuvNvvNU = 9.0F;
            var1.vVvUvVVuuNvV = 9.0F;
            var1.UuuNnUvUuv = 26.0F;
            var1.nUUVuvU = 28.0F;
         } else if ("HUD_Potions".equals(var0)) {
            var1.UvnvNVnnnnNU = new unUuuVVuNnNN.VvunVVUvUNnv(17.0F, 29.0F, false);
            var1.uVUVnuvnuVuv = new unUuuVVuNnNN.VvunVVUvUNnv(-34.0F, 28.5F, true);
            var1.nUUVuvU = 24.0F;
         } else if ("HUD_WaterMark".equals(var0)) {
            var1.vuuuNvNuv = 32.0F;
            var1.nvUVNnuu = 32.0F;
            var1.UuuNnUvUuv = 24.0F;
            var1.nUUVuvU = 26.0F;
            var1.UuUVuuUu = 14.0F;
            var1.vNUvnnVnUvu = 7.0F;
            var1.uVUuuVnNVU = 5.0F;
         } else if ("HUD_ArrayList".equals(var0)) {
            var1.UuUVuuUu = 15.0F;
            var1.C00OOC00oO = 15.0F;
            var1.uUnuvNvvNU = 15.0F;
            var1.vVvUvVVuuNvV = 15.0F;
            var1.nuUnNvnuUu = 15.0F;
            var1.vNUvnnVnUvu = 4.0F;
            var1.uVUuuVnNVU = 0.0F;
            var1.vuuuNvNuv = 0.0F;
            var1.nvUVNnuu = 32.0F;
         } else if ("HUD_TargetHUD".equals(var0)) {
            var1.UuUVuuUu = 15.0F;
            var1.C00OOC00oO = 12.0F;
            var1.uUnuvNvvNU = 10.0F;
            var1.vVvUvVVuuNvV = 10.0F;
            var1.uNNnnnuuuN = 10.0F;
            var1.nvUVNnuu = 24.0F;
            var1.nUUVuvU = 28.0F;
         } else if ("HUD_HotBar".equals(var0) || "hud_armor".equals(var0)) {
            var1.UuUVuuUu = 10.0F;
            var1.uUnuvNvvNU = 5.0F;
            var1.VVuuUN = 4.0F;
            var1.vNUvnnVnUvu = 5.0F;
            var1.uVUuuVnNVU = 3.0F;
         }

         return var1;
      }

      public void C00OOC00oO() {
         this.UuUVuuUu = unUuuVVuNnNN.UuUVuuUu(this.UuUVuuUu, 0.0F, 32.0F);
         this.C00OOC00oO = unUuuVVuNnNN.UuUVuuUu(this.C00OOC00oO, 0.0F, 28.0F);
         this.uUnuvNvvNU = unUuuVVuNnNN.UuUVuuUu(this.uUnuvNvvNU, 0.0F, 24.0F);
         this.vVvUvVVuuNvV = unUuuVVuNnNN.UuUVuuUu(this.vVvUvVVuuNvV, 0.0F, 24.0F);
         this.uNNnnnuuuN = unUuuVVuNnNN.UuUVuuUu(this.uNNnnnuuuN, 0.0F, 24.0F);
         this.nuUnNvnuUu = unUuuVVuNnNN.UuUVuuUu(this.nuUnNvnuUu, 0.0F, 22.0F);
         this.VVuuUN = unUuuVVuNnNN.UuUVuuUu(this.VVuuUN, 0.0F, 14.0F);
         this.vNUvnnVnUvu = unUuuVVuNnNN.UuUVuuUu(this.vNUvnnVnUvu, 2.0F, 18.0F);
         this.uVUuuVnNVU = unUuuVVuNnNN.UuUVuuUu(this.uVUuuVnNVU, 0.0F, 18.0F);
         this.vuuuNvNuv = unUuuVVuNnNN.UuUVuuUu(this.vuuuNvNuv, 0.0F, 48.0F);
         this.nvUVNnuu = unUuuVVuNnNN.UuUVuuUu(this.nvUVNnuu, 14.0F, 42.0F);
         this.UuuNnUvUuv = unUuuVVuNnNN.UuUVuuUu(this.UuuNnUvUuv, 14.0F, 38.0F);
         this.nUUVuvU = unUuuVVuNnNN.UuUVuuUu(this.nUUVuvU, 12.0F, 38.0F);
         this.UnUNVVVNuv = unUuuVVuNnNN.UuUVuuUu(this.UnUNVVVNuv, -24.0F, 90.0F);
         this.vNVuvnUUnuUn = unUuuVVuNnNN.UuUVuuUu(this.vNVuvnUUnuUn, 0.0F, 7.0F);
         if (this.UvnvNVnnnnNU == null) {
            this.UvnvNVnnnnNU = new unUuuVVuNnNN.VvunVVUvUNnv(17.0F, 29.0F, false);
         }

         if (this.uVUVnuvnuVuv == null) {
            this.uVUVnuvnuVuv = new unUuuVVuNnNN.VvunVVUvUNnv(-34.0F, 29.5F, true);
         }

         if (this.NVNnnvnuunNv == null) {
            this.NVNnnvnuunNv = new unUuuVVuNnNN.VvunVVUvUNnv(0.0F, 0.0F, false);
         }

         if (this.uVunuUNVVUUV == null) {
            this.uVunuUNVVUUV = new unUuuVVuNnNN.VvunVVUvUNnv(0.0F, 0.0F, false);
         }

         this.UvnvNVnnnnNU.UuUVuuUu = unUuuVVuNnNN.UuUVuuUu(this.UvnvNVnnnnNU.UuUVuuUu, -80.0F, 260.0F);
         this.UvnvNVnnnnNU.C00OOC00oO = unUuuVVuNnNN.UuUVuuUu(this.UvnvNVnnnnNU.C00OOC00oO, -40.0F, 180.0F);
         this.uVUVnuvnuVuv.UuUVuuUu = unUuuVVuNnNN.UuUVuuUu(this.uVUVnuvnuVuv.UuUVuuUu, -220.0F, 80.0F);
         this.uVUVnuvnuVuv.C00OOC00oO = unUuuVVuNnNN.UuUVuuUu(this.uVUVnuvnuVuv.C00OOC00oO, -40.0F, 180.0F);
         this.NVNnnvnuunNv.UuUVuuUu = unUuuVVuNnNN.UuUVuuUu(this.NVNnnvnuunNv.UuUVuuUu, -100.0F, 140.0F);
         this.NVNnnvnuunNv.C00OOC00oO = unUuuVVuNnNN.UuUVuuUu(this.NVNnnvnuunNv.C00OOC00oO, -60.0F, 140.0F);
         this.uVunuUNVVUUV.UuUVuuUu = unUuuVVuNnNN.UuUVuuUu(this.uVunuUNVVUUV.UuUVuuUu, -100.0F, 140.0F);
         this.uVunuUNVVUUV.C00OOC00oO = unUuuVVuNnNN.UuUVuuUu(this.uVunuUNVVUUV.C00OOC00oO, -60.0F, 140.0F);
      }
   }

   public static final class VvunVVUvUNnv {
      public float UuUVuuUu;
      public float C00OOC00oO;
      public boolean uUnuvNvvNU;

      public VvunVVUvUNnv() {
      }

      public VvunVVUvUNnv(float var1, float var2, boolean var3) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
      }
   }

   static final class nvnNNunvv {
      public int UuUVuuUu = 1;
      public unUuuVVuNnNN.NVnVnNnN C00OOC00oO;
      public Map<String, unUuuVVuNnNN.NVnVnNnN> uUnuvNvvNU = new HashMap<>();

      void UuUVuuUu() {
         if (this.uUnuvNvvNU == null) {
            this.uUnuvNvvNU = new HashMap<>();
         }

         if (this.C00OOC00oO != null) {
            this.uUnuvNvvNU.putIfAbsent("HUD_HotKeys", this.C00OOC00oO);
            this.C00OOC00oO = null;
         }

         for (String var4 : unUuuVVuNnNN.UvnvNVnnnnNU) {
            this.uUnuvNvvNU.putIfAbsent(var4, unUuuVVuNnNN.NVnVnNnN.UuUVuuUu(var4));
         }

         for (unUuuVVuNnNN.NVnVnNnN var6 : this.uUnuvNvvNU.values()) {
            if (var6 != null) {
               var6.C00OOC00oO();
            }
         }
      }
   }
}
