package ru.metaculture.protection;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.class_1041;
import net.minecraft.class_11405;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_429;
import net.minecraft.class_437;
import net.minecraft.class_526;
import net.minecraft.class_751;
import net.minecraft.class_766;
import org.lwjgl.opengl.GL11;
import ru.metaculture.profile.Profile;

public final class VvVVnnNNNuV extends class_437 implements uNVUuVuNNUvn {
   public static final String UuUVuuUu = "Made with soul by Aleksei Ezhov & fr1zy1337";
   public static final String C00OOC00oO = "WILD";
   public static final String uUnuvNvvNU = "w";
   public static final String vVvUvVVuuNvV = "W";
   public static final float uNNnnnuuuN = 0.83F;
   public static final float nuUnNvnuUu = 0.08F;
   public static final float VVuuUN = 0.3F;
   public static final float vNUvnnVnUvu = 0.0188F;
   public static final float uVUuuVnNVU = 0.0F;
   public static final float vuuuNvNuv = 0.98F;
   public static final float nvUVNnuu = -0.62F;
   private static final float UuuNnUvUuv = 0.047F;
   private static final float nUUVuvU = 0.7296875F;
   private static final OO0OCoOC UnUNVVVNuv = OO0OCoOC.UuUVuuUu();
   private static final int vNVuvnUUnuUn = 14;
   private static final class_2960 UvnvNVnnnnNU = class_2960.method_60656("textures/gui/title/background/panorama");
   private static final uUuuvNuvVn[] uVUVnuvnuVuv = uUuuvNuvVn.values();
   static final int NVNnnvnuunNv = uVUVnuvnuVuv.length;
   static final String[] uVunuUNVVUUV = new String[]{"Low", "Balanced", "High", "Ultra"};
   private static final float[] UNnVVNvvnVvU = new float[]{0.55F, 0.72F, 0.86F, 1.0F};
   private static final float[] uNnUnnuNUnNu = new float[]{0.0F, 0.0F, 1.0F, 1.0F};
   private static final float[] NnUuNNU = new float[]{0.0F, 0.0F, 1.0F, 1.0F};
   private static final String nNvNUVU = "c";
   private static final float UnUNuUU = 54.0F;
   private static final float uUVuVvuNUvnu = 14.0F;
   private static final float UvUvUNuvNU = 15.0F;
   private static final float c0oOOCcCoC0 = 19.5F;
   private static final float VVnVNnunVvu = 72.0F;
   private static final float unNNVVNnvvV = 264.0F;
   private static final float NuunnvnN = 424.0F;
   private static final float NVUunUNUN = 0.226F;
   private static final float UUVNuUNUvUnV = 24.0F;
   private static final float vuvnUnVnUNnV = 2.0F;
   private static final float nnuUVNUuvvVU = 3.2F;
   private static final float nVVUuvuNnUN = 3.4F;
   private static final float nNnVnUNVV = 0.0135F;
   private static final float nuunNvv = 2.2F;
   private static final float uUVVvVVNvvn = 0.052F;
   private static final float vvUVNVvvNUv = 0.62F;
   private static final float UuNnnVnuNNV = 48.0F;
   private static final float uUVvnUuNvvN = 0.32F;
   private static final float UUuUnNVNuuv = 0.32F;
   private static final float NVuNUuVnVUN = 20.0F;
   private static final float NVuunNnvvvVu = 4.0F;
   private static final float vNnNuuvVn = 22.0F;
   private static final float VUuuVUnun = 14.5F;
   private static final float vVVuuVVv = 40.0F;
   private static final float VuunNUUUvu = 40.0F;
   private static final float NNUUNUuVNNVn = 18.0F;
   private static final float VvVvnNUnvuvV = 13.0F;
   private static final float ccOO0COcoco0 = 14.0F;
   private static final float NUVvUUVuVNVv = 0.32F;
   private static final float nNuVunNUVu = 34.0F;
   private static final float UNvvunVVn = 0.34F;
   private static final float UnvuVuVnNuvu = 20.0F;
   private static final float UvNNVUVNVuvV = 14.5F;
   private static final float NnunUUnU = 40.0F;
   private static final float nvuVvuNnNUnv = 0.42F;
   private static final float NnVnNVN = 0.66F;
   private static final float vnvvNvUnVv = 150.0F;
   private static final float OCOocoOoOO = 34.0F;
   private static final float o0Ooc0COOoc = 6.0F;
   private static final float nvvnUnUn = 8.0F;
   private static final float UnUUVuVunvVu = 12.0F;
   private static final float nnvuvUNuUnN = 18.0F;
   private static final float UVnuVUUVnnU = 11.0F;
   private static final float VunnVNvNV = 4.0F;
   private static final int NvUVUvVVnUu = 8;
   private static final float unnUnUNVnN = 12.0F;
   private static final float NnuUnUNnu = 340.0F;
   private static final float UnnnvvU = 520.0F;
   private static final float VUUnuVvVu = 52.0F;
   private static final float VvVuvUvvNNVv = 24.0F;
   private static final float UnnNNvuvvUU = 1.0F;
   private static final float VNNnnVUuvv = 0.46F;
   private static final float vUvUvUNNuNvn = 1.45F;
   static final String[] uuVuUuuVVNvN = new String[]{
      "Half-scale nebula, glass blur and particles off",
      "Soft nebula, light glass blur, cursor trail",
      "Full nebula motion, particles, film grain",
      "Native-resolution nebula, every glass pass"
   };
   private static final float VvuUUUNNNv = 13.0F;
   private static final float uuuVnuvnnNnU = 20.5F;
   private static final float nNunUnVN = 1.1F;
   private static final float VnVuuvVvnNv = 32.0F;
   private static final float vuvvuVuVv = 0.47F;
   private static final float uunNUuunVU = 92.0F;
   private static final float NvnuuuvnVV = 1.12F;
   private static final float NnUVNnuvUv = 0.148F;
   private static final float UuuuNNunN = 102.0F;
   private static final float NNVNuUvVn = 186.0F;
   private static final float vuNnuUnu = 4.2F;
   private static final float uuvvuNvuUNVV = 0.66F;
   private static final float uVvunVUNuUvu = 2.6F;
   private static final float NVNnnvVnvV = 26.0F;
   private static final float vUNuuvvnVnv = 0.18F;
   private static final float unnnNUNnVu = 0.078F;
   private static final float NvnnUUuVvNU = 0.042F;
   private static final float vVvuUVnV = 0.06F;
   private static final float nvuUVvuuN = 0.55F;
   private static final float CC0COO = 150.0F;
   private static final float uNnNUNvuVnu = 14.0F;
   private static final float VnnnvUunNvuu = 0.22F;
   private static final float VuuUVVu = 0.62F;
   private static final float nUNnuUNnV = 0.34F;
   private static final float VuNVnvNNuNnn = 0.88F;
   private static final float uvVuuuvvVU = 0.55F;
   private static final float NNnvvunuVNUn = 9.0F;
   private static final float nVuuUnnUUVU = (float) (Math.PI * 2.0 / 3.0);
   private static final float nUununvNvvn = 0.62F;
   private static final float NuvunVvnnN = 0.78F;
   private static final float vuvnnvuNVvu = 2.25F;
   private static final float NVvnvnn = 0.35F;
   private static final float vUvVUNnN = 0.42F;
   private static final float NUuVnnuUnvu = 128.0F;
   private static final float vnuNNVvVVuN = 0.6F;
   private static final float Oco0Oococc = 0.55F;
   private static final float uNUnUuUnvnnU = 9.0F;
   private static final float OoccOc0CO = 4.35F;
   private static final float UvuVvvVuUuuu = 0.3719F;
   private static float NUUVUvvuNNVU;
   private static float VUNvNUuNVnn = -1.0F;
   private final OoCO0O0oc0c UNNunNuUNVuU = new OoCO0O0oc0c();
   private final class_766 NuUuUvUUvU = new class_766(new class_751(UvnvNVnnnnNU));
   private final VvuuVNVUn.NVnVnNnN VUVvNvvVUN = new VvuuVNVUn.NVnVnNnN();
   private final VvuuVNVUn.NVnVnNnN UvvNuvUNNNUv = new VvuuVNVUn.NVnVnNnN();
   private boolean NunUUVVVuu;
   private boolean uNUnuUUvvuU;
   private volatile boolean vvVVVvVNVVVN;
   private final VvVVnnNNNuV.VUUnVnVNNU[] uUuuVvVunVVu = new VvVVnnNNNuV.VUUnVnVNNU[]{
      new VvVVnnNNNuV.VUUnVnVNNU("Singleplayer", VvVVnnNNNuV.NVnVnNnN.SINGLEPLAYER),
      new VvVVnnNNNuV.VUUnVnVNNU("Multiplayer", VvVVnnNNNuV.NVnVnNnN.MULTIPLAYER),
      new VvVVnnNNNuV.VUUnVnVNNU("Alt Manager", VvVVnnNNNuV.NVnVnNnN.ALT_MANAGER),
      new VvVVnnNNNuV.VUUnVnVNNU("Options", VvVVnnNNNuV.NVnVnNnN.OPTIONS),
      new VvVVnnNNNuV.VUUnVnVNNU("Quit", VvVVnnNNNuV.NVnVnNnN.QUIT)
   };
   private final VvVVnnNNNuV.uuVnUuun[] NuUvUNN = new VvVVnnNNNuV.uuVnUuun[14];
   private final VvVVnnNNNuV.VUuUUNnnuvuv vunuUUVVUv = new VvVVnnNNNuV.VUuUUNnnuvuv(this.uUuuVvVunVVu.length, 14);
   private final VvVVnnNNNuV.nUVVnVNu uuuNUnuvvNNv = new VvVVnnNNNuV.nUVVnVNu();
   final VvVVnnNNNuV.nNVUVnuUnU unUVnu = new VvVVnnNNNuV.nNVUVnuUnU();
   private final nUuuVnUnNvn NvNUuuuvUvu = new nUuuVnUnNvn(vuVvuunNvVv.uUnuvNvvNU);
   private final nUuuVnUnNvn nNVVUnuVVVuV = new nUuuVnUnNvn(vuVvuunNvVv.uUnuvNvvNU);
   final nUuuVnUnNvn vnVuunuNN = new nUuuVnUnNvn(vuVvuunNvVv.UuUVuuUu);
   final nUuuVnUnNvn UvUNuNvvNVNv = new nUuuVnUnNvn(vuVvuunNvVv.UuUVuuUu);
   private final nUuuVnUnNvn vNnNNNuVVnUv = new nUuuVnUnNvn(vuVvuunNvVv.C00OOC00oO);
   private final nUuuVnUnNvn UVUnUvUNU = new nUuuVnUnNvn(vuVvuunNvVv.C00OOC00oO);
   private final nUuuVnUnNvn UvUnnnn = new nUuuVnUnNvn(vuVvuunNvVv.NVNnnvnuunNv);
   private final nUuuVnUnNvn occOCoc0OcO = new nUuuVnUnNvn(vuVvuunNvVv.uVUVnuvnuVuv);
   private final nUuuVnUnNvn VnvunuuvUNu = new nUuuVnUnNvn(vuVvuunNvVv.uVUVnuvnuVuv);
   private final nUuuVnUnNvn nuVuunUn = new nUuuVnUnNvn(vuVvuunNvVv.uVunuUNVVUUV);
   private final nUuuVnUnNvn NvNvVNUv = new nUuuVnUnNvn(vuVvuunNvVv.UNnVVNvvnVvU);
   private final nUuuVnUnNvn vNUUvuuVU = new nUuuVnUnNvn(vuVvuunNvVv.UvnvNVnnnnNU);
   private final nUuuVnUnNvn unNuVNVUnV = new nUuuVnUnNvn(vuVvuunNvVv.nNvNUVU);
   private final nUuuVnUnNvn UvNNNUvNnUUV = new nUuuVnUnNvn(vuVvuunNvVv.nNvNUVU);
   private float vVuNvnVUvvv;
   private float OCCc0co0OOC;
   private long unUvvVVVVUu;
   private long nnUunUnNUN;
   private long UNuUVVuUuU;
   private float NunnVUUuvUV;
   private float nVUNnUuU;
   float VNvuVnvnun;
   float unVVnuunNU;
   private float vVnuVVvVNuNu;
   private float uNVvVvUuuuU;
   private boolean nvnUvvnUUN;
   private boolean uuuvuUUNVVUN;
   private boolean VnUvVu;
   private boolean NvUVuUNUUNvv;
   private int NnvVNVnn = -6357021;
   private int O0ooccOc0 = -11341636;
   private NvVNvUvunNNu nvuVnuvUVvVu = NvVNvUvunNNu.AURORA;
   private boolean coOocCcoOc0;
   private float uvNnUuvvNU;
   private float UuUUvvVunV;
   private float VuNNvnVVUUn;
   private float UnVvNNuNu;
   private float vuNunNnvnunv;
   private float UVVNUnVnNV;
   private float vnUUvvnUVUu;
   private float vNVvnNNnVV;
   private float UvnnnuuNvUvv;
   private float uVUUnuunuv = -1.0F;
   private float vvNvvuUUUVvv;
   private float nvvVNNnnUvVN;
   private float uUuvNUN;
   private float VnuUuUVUnnNn;
   private float vnvUUNNVvU;
   private float nVVunnNVNvN;
   private float NNNVNvNuVvuN;
   private float UUuNVVnNnu;
   private String UvUvNUvnv = "";
   private String UVnUNuNvu = "";
   private String VNUnNnvu = "";
   private int VvNnVUvunnU = -1;
   private float nUUunvNnNNuu;
   private float UUVVuvnvunv;
   private float nNNvNuVvn;
   private float nUUnuUVnUNN;
   private float unUNnVvVVvVN;

   public VvVVnnNNNuV() {
      super(class_2561.method_43470("Wild"));

      for (int var1 = 0; var1 < this.NuUvUNN.length; var1++) {
         this.NuUvUNN[var1] = new VvVVnnNNNuV.uuVnUuun();
      }
   }

   protected void method_25426() {
      super.method_25426();
      this.unUvvVVVVUu = System.nanoTime();
      this.nnUunUnNUN = this.unUvvVVVVUu;
      this.UNuUVVuUuU = this.unUvvVVVVUu;
      this.NunnVUUuvUV = 0.0F;
      this.nVUNnUuU = 0.0F;
      this.NvNUuuuvUvu.UuUVuuUu(0.0F);
      this.nNVVUnuVVVuV.UuUVuuUu(0.0F);
      this.nvnUvvnUUN = false;
      this.uuuvuUUNVVUN = false;
      this.VnUvVu = false;
      this.NvUVuUNUUNvv = false;
      this.NvNvVNUv.UuUVuuUu(0.0F);
      this.unNuVNVUnV.UuUVuuUu(0.0F);
      this.UvNNNUvNnUUV.UuUVuuUu(0.0F);
      this.vVuNvnVUvvv = 0.0F;
      this.OCCc0co0OOC = 0.0F;
      this.vNUUvuuVU.UuUVuuUu(0.0F);
      this.VuNNvnVVUUn = 0.0F;
      this.UvUnnnn.UuUVuuUu(VVuuUN());
      int var1 = this.nuUnNvnuUu();
      this.occOCoc0OcO.UuUVuuUu(UNnVVNvvnVvU[var1]);
      this.VnvunuuvUNu.UuUVuuUu(uNnUnnuNUnNu[var1]);
      this.nuVuunUn.UuUVuuUu(NnUuNNU[var1]);
      this.uuuNUnuvvNNv.UuUVuuUu(var1);
      this.unUVnu.UuUVuuUu();

      for (VvVVnnNNNuV.VUUnVnVNNU var5 : this.uUuuVvVunVVu) {
         var5.UuUVuuUu();
      }

      for (VvVVnnNNNuV.uuVnUuun var9 : this.NuUvUNN) {
         var9.vVvUvVVuuNvV = 0.0F;
         var9.uUnuvNvvNU = -100.0F;
      }
   }

   public void method_25394(class_332 var1, int var2, int var3, float var4) {
      if (!this.vvVVVvVNVVVN) {
         this.UuUVuuUu(var1);
      }

      this.UuUVuuUu(var2, var3, false);
   }

   private void UuUVuuUu(class_332 var1) {
      if (var1 != null && this.field_22787 != null && this.field_22789 > 0 && this.field_22790 > 0) {
         if (this.uNUnuUUvvuU) {
            var1.method_25296(0, 0, this.field_22789, this.field_22790, C00OOC00oO(this.NnvVNVnn, 255), C00OOC00oO(this.O0ooccOc0, 255));
         } else {
            try {
               if (!this.NunUUVVVuu) {
                  this.field_22787.method_1531().method_65876(UvnvNVnnnnNU, new class_11405(UvnvNVnnnnNU));
                  this.NunUUVVVuu = true;
               }

               this.NuUuUvUUvU.method_3317(var1, this.field_22789, this.field_22790, true);
               var1.method_25296(0, 0, this.field_22789, this.field_22790, C00OOC00oO(this.NnvVNVnn, 70), C00OOC00oO(this.O0ooccOc0, 110));
            } catch (Throwable var3) {
               this.uNUnuUUvvuU = true;
               VNNUVUuN.UuUVuuUu("MainMenuPanorama", this, "panorama fallback failed", var3);
               var1.method_25296(0, 0, this.field_22789, this.field_22790, C00OOC00oO(this.NnvVNVnn, 255), C00OOC00oO(this.O0ooccOc0, 255));
            }
         }
      }
   }

   @Override
   public void UuUVuuUu(int var1, int var2, float var3) {
      this.UuUVuuUu(var1, var2, true);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(int var1, int var2, boolean var3) {
      class_1041 var4 = this.field_22787 == null ? null : this.field_22787.method_22683();
      if (var4 != null && !var4.method_65966() && var4.method_4489() > 0 && var4.method_4506() > 0) {
         long var5 = OoCO0O0oc0c.UuUVuuUu(class_310.method_1551(), var4.method_4489(), var4.method_4506());
         if (var5 < 0L) {
            if (var3) {
               this.vvVVVvVNVVVN = false;
            }
         } else {
            int var7 = OoCO0O0oc0c.UuUVuuUu(var5);
            int var8 = OoCO0O0oc0c.C00OOC00oO(var5);
            long var9 = System.nanoTime();
            float var11 = Math.max(0.001F, Math.min(0.05F, (float)(var9 - this.nnUunUnNUN) / 1.0E9F));
            this.nnUunUnNUN = var9;
            this.NunnVUUuvUV = (float)(var9 - this.unUvvVVVVUu) / 1.0E9F;
            this.vnvUUNNVvU = LocalTime.now().toSecondOfDay() / 3600.0F;
            this.C00OOC00oO();
            this.UuUVuuUu(var4, var1, var2, var9);
            this.C00OOC00oO(var7, var8, var11);
            this.uUnuvNvvNU();
            this.vVvUvVVuuNvV(var11);
            boolean var12 = Menu.UuUVuuUu(Menu.NVuunNnvvvVu);
            float var13 = var12 ? (this.vnVuunuNN.UuUVuuUu() / Math.max(1.0F, (float)var7) - 0.5F) * 2.0F : 0.0F;
            float var14 = var12 ? (this.UvUNuNvvNVNv.UuUVuuUu() / Math.max(1.0F, (float)var8) - 0.5F) * 2.0F : 0.0F;
            this.uvNnUuvvNU = this.NvNUuuuvUvu.UuUVuuUu(var13, var11);
            this.UuUUvvVunV = this.nNVVUnuVVVuV.UuUVuuUu(var14, var11);
            this.UuUVuuUu(var7, var8, this.uvNnUuvvNU, this.UuUUvvVunV, var11);
            if (var3) {
               int var15 = GL11.glGetInteger(36006);
               nuuvUNvn.UuUVuuUu(var15);
               this.UuUVuuUu(var7, var8, var15, this.uvNnUuvvNU, this.UuUUvvVunV, var9);
               VvuuVNVUn.C00OOC00oO(this.VUVvNvvVUN);

               boolean var16;
               try {
                  var16 = this.UNNunNuUNVuU.UuUVuuUu(this.vunuUUVVUv);
               } finally {
                  VvuuVNVUn.uUnuvNvvNU(this.VUVvNvvVUN);
               }

               this.vvVVVvVNVVVN = var16;
               this.vVvUvVVuuNvV();
               if (this.vunuUUVVUv.uUnuvNvvNU() > 0) {
                  VvuuVNVUn.C00OOC00oO(this.VUVvNvvVUN);
                  boolean var21 = false /* VF: Semaphore variable */;

                  try {
                     var21 = true;
                     this.UNNunNuUNVuU.C00OOC00oO(this.vunuUUVVUv);
                     var21 = false;
                  } finally {
                     if (var21) {
                        VvuuVNVUn.uUnuvNvvNU(this.VUVvNvvVUN);
                     }
                  }

                  VvuuVNVUn.uUnuvNvvNU(this.VUVvNvvVUN);
                  this.uNNnnnuuuN();
               }
            }
         }
      } else {
         if (var3) {
            this.vvVVVvVNVVVN = false;
         }
      }
   }

   public void method_25420(class_332 var1, int var2, int var3, float var4) {
   }

   public void method_52752(class_332 var1) {
   }

   public boolean method_25402(double var1, double var3, int var5) {
      if (var5 == 0 && this.field_22787 != null && this.field_22787.method_22683() != null) {
         float var6 = UuUVuuUu(this.field_22787.method_22683(), var1);
         float var7 = C00OOC00oO(this.field_22787.method_22683(), var3);
         if (this.unUVnu.vVvUvVVuuNvV(var6, var7)) {
            return true;
         } else if (this.uuuNUnuvvNNv.UuUVuuUu(var6, var7)) {
            this.uuuNUnuvvNNv.uVunuUNVVUUV = true;
            this.C00OOC00oO(this.uuuNUnuvvNNv.UuUVuuUu(var6));
            return true;
         } else {
            for (VvVVnnNNNuV.VUUnVnVNNU var11 : this.uUuuVvVunVVu) {
               if (var11.UuUVuuUu(var6, var7)) {
                  var11.vVvUvVVuuNvV.UuUVuuUu(1.0F);
                  var11.uNNnnnuuuN.UuUVuuUu(1.0F);
                  var11.nvUVNnuu = 0.0F;
                  this.UuUVuuUu(var11.C00OOC00oO);
                  return true;
               }
            }

            return true;
         }
      } else {
         return super.method_25402(var1, var3, var5);
      }
   }

   public boolean method_25403(double var1, double var3, int var5, double var6, double var8) {
      if (var5 == 0 && this.uuuNUnuvvNNv.uVunuUNVVUUV && this.field_22787 != null && this.field_22787.method_22683() != null) {
         this.C00OOC00oO(this.uuuNUnuvvNNv.UuUVuuUu(UuUVuuUu(this.field_22787.method_22683(), var1)));
         return true;
      } else {
         return super.method_25403(var1, var3, var5, var6, var8);
      }
   }

   public boolean method_25406(double var1, double var3, int var5) {
      if (var5 == 0 && this.uuuNUnuvvNNv.uVunuUNVVUUV) {
         this.uuuNUnuvvNNv.uVunuUNVVUUV = false;
         vNUvnnVnUvu();
         return true;
      } else {
         return super.method_25406(var1, var3, var5);
      }
   }

   public boolean method_25401(double var1, double var3, double var5, double var7) {
      if (this.field_22787 != null && this.field_22787.method_22683() != null && var7 != 0.0) {
         float var9 = UuUVuuUu(this.field_22787.method_22683(), var1);
         float var10 = C00OOC00oO(this.field_22787.method_22683(), var3);
         if (this.unUVnu.UuUVuuUu(var9, var10, var7)) {
            return true;
         }

         if (this.uuuNUnuvvNNv.UuUVuuUu(var9, var10)) {
            int var11 = vVvUvVVuuNvV(this.nuUnNvnuUu() + (var7 > 0.0 ? 1 : -1));
            if (this.C00OOC00oO(var11)) {
               vNUvnnVnUvu();
            }

            return true;
         }
      }

      return super.method_25401(var1, var3, var5, var7);
   }

   public boolean method_25404(int var1, int var2, int var3) {
      return this.unUVnu.UuUVuuUu(var1) ? true : super.method_25404(var1, var2, var3);
   }

   public boolean method_25400(char var1, int var2) {
      return this.unUVnu.UuUVuuUu(var1) ? true : super.method_25400(var1, var2);
   }

   public boolean method_25421() {
      return false;
   }

   public boolean method_25422() {
      return false;
   }

   public void method_25432() {
      this.UNNunNuUNVuU.close();
      super.method_25432();
   }

   public void UuUVuuUu(int var1, int var2) {
      try {
         this.UNNunNuUNVuU.UuUVuuUu(var1, var2);
      } catch (Throwable var4) {
      }
   }

   private boolean C00OOC00oO(int var1) {
      int var2 = vVvUvVVuuNvV(var1);
      if (var2 == this.nuUnNvnuUu()) {
         return false;
      } else {
         Menu.UuUVuuUu(var2);
         this.uuuNUnuvvNNv.uUnuvNvvNU.UuUVuuUu(1.0F);
         return true;
      }
   }

   private void C00OOC00oO() {
      NvVNvUvunNNu var1 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null
         ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO()
         : NvVNvUvunNNu.AURORA;
      this.nvuVnuvUVvVu = var1;
      this.coOocCcoOc0 = UnUNVVVNuv.uUnuvNvvNU(var1);
      this.NnvVNVnn = UnUNVVVNuv.vVvUvVVuuNvV(var1);
      this.O0ooccOc0 = UnUNVVVNuv.uNNnnnuuuN(var1);
   }

   private void UuUVuuUu(class_1041 var1, int var2, int var3, long var4) {
      float var6 = UuUVuuUu(var1, (double)var2);
      float var7 = C00OOC00oO(var1, (double)var3);
      if (!this.nvnUvvnUUN) {
         this.nvnUvvnUUN = true;
         this.VNvuVnvnun = var6;
         this.unVVnuunNU = var7;
      } else {
         float var8 = uUnuvNvvNU(var6 - this.VNvuVnvnun, var7 - this.unVVnuunNU);
         this.VNvuVnvnun = var6;
         this.unVVnuunNU = var7;
         if (var8 > 1.5F) {
            this.UNuUVVuUuU = var4;
         }

         this.NvUVuUNUUNvv = this.VNvuVnvnun > -1.0F
            && this.unVVnuunNU > -1.0F
            && this.VNvuVnvnun < var1.method_4489() + 1.0F
            && this.unVVnuunNU < var1.method_4506() + 1.0F;
      }
   }

   private void C00OOC00oO(int var1, int var2, float var3) {
      if (!this.uuuvuUUNVVUN) {
         this.vnVuunuNN.UuUVuuUu(this.VNvuVnvnun);
         this.UvUNuNvvNVNv.UuUVuuUu(this.unVVnuunNU);
         this.vNnNNNuVVnUv.UuUVuuUu(0.0F);
         this.UVUnUvUNU.UuUVuuUu(0.0F);
         this.uuuvuUUNVVUN = true;
      } else {
         this.vnVuunuNN.UuUVuuUu(this.VNvuVnvnun, var3);
         this.UvUNuNvvNVNv.UuUVuuUu(this.unVVnuunNU, var3);
         float var4 = C00OOC00oO(this.vnVuunuNN.C00OOC00oO() / Math.max(1.0F, (float)var1), -1.8F, 1.8F);
         float var5 = C00OOC00oO(this.UvUNuNvvNVNv.C00OOC00oO() / Math.max(1.0F, (float)var2), -1.8F, 1.8F);
         this.vNnNNNuVVnUv.UuUVuuUu(var4, var3);
         this.UVUnUvUNU.UuUVuuUu(var5, var3);
         this.NvNvVNUv.UuUVuuUu(this.NvUVuUNUUNvv ? 1.0F : 0.0F, var3);
      }
   }

   private void vVvUvVVuuNvV(float var1) {
      int var2 = this.nuUnNvnuUu();
      this.occOCoc0OcO.UuUVuuUu(UNnVVNvvnVvU[var2], var1);
      this.VnvunuuvUNu.UuUVuuUu(uNnUnnuNUnNu[var2], var1);
      boolean var3 = cCOo0cOcO.uUnuvNvvNU();
      this.nuVuunUn.UuUVuuUu(var3 ? NnUuNNU[var2] : 0.0F, var1);
      this.UvUnnnn.UuUVuuUu(VVuuUN(), var1);
      this.nVUNnUuU = this.nVUNnUuU + var1 * this.UvUnnnn.UuUVuuUu();
      this.OCCc0co0OOC = C00OOC00oO(this.UvNNNUvNnUUV.UuUVuuUu(this.NunnVUUuvUV >= 0.06F ? 1.0F : 0.0F, var1), 0.0F, 1.0F);
      this.vVuNvnVUvvv = C00OOC00oO(this.unNuVNVUnV.UuUVuuUu(this.NunnVUUuvUV >= 0.55F ? 1.0F : 0.0F, var1), 0.0F, 1.0F);
   }

   private void uUnuvNvvNU() {
      if (cCOo0cOcO.uUnuvNvvNU() && Menu.UuUVuuUu(Menu.NVuNUuVnVUN)) {
         float var1 = this.vnVuunuNN.UuUVuuUu();
         float var2 = this.UvUNuNvvNVNv.UuUVuuUu();
         if (!this.VnUvVu) {
            this.vVnuVVvVNuNu = var1;
            this.uNVvVvUuuuU = var2;
            this.VnUvVu = true;
            this.UuUVuuUu(var1, var2, 0.36F);
         } else {
            float var3 = uUnuvNvvNU(var1 - this.vVnuVVvVNuNu, var2 - this.uNVvVvUuuuU);
            if (var3 > 5.5F) {
               this.UuUVuuUu(var1, var2, C00OOC00oO(var3 / 180.0F, 0.12F, 0.54F));
               this.vVnuVVvVNuNu = var1;
               this.uNVvVvUuuuU = var2;
            }
         }
      }
   }

   private void UuUVuuUu(float var1, float var2, float var3) {
      int var4 = 0;
      float var5 = -1.0F;

      for (int var6 = 0; var6 < this.NuUvUNN.length; var6++) {
         float var7 = this.NunnVUUuvUV - this.NuUvUNN[var6].uUnuvNvvNU;
         if (this.NuUvUNN[var6].vVvUvVVuuNvV <= 0.0F) {
            var4 = var6;
            break;
         }

         if (var7 > var5) {
            var5 = var7;
            var4 = var6;
         }
      }

      this.NuUvUNN[var4].UuUVuuUu = var1;
      this.NuUvUNN[var4].C00OOC00oO = var2;
      this.NuUvUNN[var4].uUnuvNvvNU = this.NunnVUUuvUV;
      this.NuUvUNN[var4].vVvUvVVuuNvV = var3;
   }

   private void UuUVuuUu(int var1, int var2, float var3, float var4, float var5) {
      float var6 = C00OOC00oO((float)var1, (float)var2);
      float var7 = C00OOC00oO(var1 * 0.226F, 264.0F * var6, 424.0F * var6);
      float var8 = 54.0F * var6;
      float var9 = 14.0F * var6;
      float var10 = this.uUuuVvVunVVu.length * var8 + (this.uUuuVvVunVVu.length - 1) * var9;
      float var11 = var1 * 0.5F + var3 * 2.1F * var6;
      float var12 = UuUVuuUu(var2) * 1.12F;
      float var13 = 92.0F * var6;
      float var14 = var12 + var13 + var10;
      float var15 = var2 * 0.47F - var14 * 0.5F;
      float var16 = var15 + var12 * 0.5F;
      float var17 = var15 + var12 + var13 + var4 * 1.25F * var6;
      float var18 = Math.min(15.0F * var6, var8 * 0.5F);
      float var19 = 24.0F * var6;
      float var20 = uUnuvNvvNU(this.vNnNNNuVVnUv.UuUVuuUu(), this.UVUnUvUNU.UuUVuuUu());

      for (int var21 = 0; var21 < this.uUuuVvVunVVu.length; var21++) {
         VvVVnnNNNuV.VUUnVnVNNU var22 = this.uUuuVvVunVVu[var21];
         var22.UnUNuUU = var7;
         var22.uUVuVvuNUvnu = var8;
         var22.UNnVVNvvnVvU = var11 - var7 * 0.5F;
         var22.uNnUnnuNUnNu = var17 + var21 * (var8 + var9);
         var22.UvUvUNuvNU = var18;
         boolean var23 = this.NunnVUUuvUV >= 0.18F + var21 * 0.078F;
         float var24 = var22.uVUVnuvnuVuv.UuUVuuUu(var23 ? 1.0F : 0.0F, var5);
         var22.nVVUuvuNnUN = C00OOC00oO(var24, 0.0F, 1.0F);
         var22.nNnVnUNVV = (1.0F - var24) * 26.0F * var6;
         float var25 = UuUVuuUu(
            this.VNvuVnvnun, this.unVVnuunNU, var22.UNnVVNvvnVvU, var22.uNnUnnuNUnNu + var22.nNnVnUNVV, var22.UnUNuUU, var22.uUVuVvuNUvnu, var22.UvUvUNuvNU
         );
         boolean var26 = var25 <= 0.0F;
         float var27 = 1.0F - vuuuNvNuv(C00OOC00oO(Math.max(0.0F, var25) / Math.max(1.0F, var19), 0.0F, 1.0F));
         var22.vNUvnnVnUvu = var22.vNUvnnVnUvu ? var25 <= 2.0F * var6 : var26;
         float var28 = var22.vNUvnnVnUvu ? 1.0F : 0.0F;
         var22.c0oOOCcCoC0 = C00OOC00oO(var22.UvnvNVnnnnNU.UuUVuuUu(var28, var5), 0.0F, 1.0F);
         var22.vuuuNvNuv = var22.VVuuUN.UuUVuuUu(var28, var5);
         if (var22.vNUvnnVnUvu && !var22.uVUuuVnNVU) {
            var22.nvUVNnuu = 0.0F;
         }

         var22.uVUuuVnNVU = var22.vNUvnnVnUvu;
         var22.nvUVNnuu = var22.vNUvnnVnUvu ? Math.min(1.0F, var22.nvUVNnuu + var5 / 0.62F) : 1.0F;
         var22.VVnVNnunVvu = var22.uUnuvNvvNU.UuUVuuUu(var27, var5);
         var22.unNNVVNnvvV = var22.vVvUvVVuuNvV.UuUVuuUu(0.0F, var5);
         var22.NuunnvnN = var22.uNNnnnuuuN.UuUVuuUu(0.0F, var5);
         float var29 = C00OOC00oO((this.vnVuunuNN.UuUVuuUu() - var22.UNnVVNvvnVvU) / Math.max(1.0F, var22.UnUNuUU), 0.0F, 1.0F);
         float var30 = C00OOC00oO((this.UvUNuNvvNVNv.UuUVuuUu() - var22.uNnUnnuNUnNu) / Math.max(1.0F, var22.uUVuVvuNUvnu), 0.0F, 1.0F);
         var22.UUVNuUNUvUnV = var22.UuuNnUvUuv.UuUVuuUu(var29, var5);
         var22.vuvnUnVnUNnV = var22.nUUVuvU.UuUVuuUu(var30, var5);
         float var31 = C00OOC00oO((this.vnVuunuNN.UuUVuuUu() - (var22.UNnVVNvvnVvU + var22.UnUNuUU * 0.5F)) / Math.max(1.0F, var22.UnUNuUU), -3.2F, 3.2F);
         float var32 = C00OOC00oO(
            (this.UvUNuNvvNVNv.UuUVuuUu() - (var22.uNnUnnuNUnNu + var22.nNnVnUNVV + var22.uUVuVvuNUvnu * 0.5F)) / Math.max(1.0F, var22.uUVuVvuNUvnu),
            -3.2F,
            3.2F
         );
         var22.NVNnnvnuunNv = var22.UnUNVVVNuv.UuUVuuUu(var31, var5);
         var22.uVunuUNVVUUV = var22.vNVuvnUUnuUn.UuUVuuUu(var32, var5);
         float var33 = 1.0F - (1.0F - Math.min(var24, 1.0F)) * 0.042F;
         float var34 = var33 + var22.VVnVNnunVvu * 0.0135F - var22.unNNVVNnvvV * 0.052F;
         var22.NVUunUNUN = var22.nuUnNvnuUu.UuUVuuUu(var34, var5);
         float var35 = (var22.UUVNuUNUvUnV - 0.5F) * 4.0F * var6 * var22.VVnVNnunVvu;
         float var36 = (var22.vuvnUnVnUNnV - 0.5F) * 2.2F * var6 * var22.VVnVNnunVvu - var22.vuuuNvNuv * 3.4F * var6 + var22.unNNVVNnvvV * 2.2F * var6;
         var22.NnUuNNU = var22.UNnVVNvvnVvU + var35;
         var22.nNvNUVU = var22.uNnUnnuNUnNu + var36;
         var22.nnuUVNUuvvVU = C00OOC00oO(var20 * 0.7F * var22.VVnVNnunVvu + Math.abs(var22.nuUnNvnuUu.C00OOC00oO()) * 0.02F, 0.0F, 1.0F);
      }

      this.UuUVuuUu(var1, var2, var6, var3, var4, var16);
      this.nVVunnNVNvN = var1 * 0.5F;
      this.NNNVNvNuVvuN = 65.6F * var6;
      this.UUuNVVnNnu = UuUVuuUu(20.5F, var6);
      this.nuUnNvnuUu(var6);
      this.VuNNvnVVUUn = this.vNUUvuuVU.UuUVuuUu(this.uNNnnnuuuN(var6), var5);
      float var37 = C00OOC00oO(this.vNnNNNuVVnUv.UuUVuuUu() * 0.62F, -1.0F, 1.0F);
      this.vnUUvvnUVUu = var37 * this.vNVvnNNnVV * 0.34F;
      this.uuuNUnuvvNNv.UuUVuuUu(this, var1, var2, var6, var5);
      this.unUVnu.UuUVuuUu(this, var1, var2, var6, var5);
   }

   private void UuUVuuUu(int var1, int var2, float var3, float var4, float var5, float var6) {
      float var7 = UuUVuuUu(var2);
      float var8 = C00OOC00oO(Math.min(var1, var2) * 0.148F, 102.0F * var3, 186.0F * var3);
      float var9 = var8 * 4.2F;
      float var10 = var1 * 0.5F + var4 * 1.65F * var3;
      float var11 = Math.max(var8 * 0.34F + 32.0F * var3, var6) + var5 * 0.95F * var3 + var7 * 0.0F;
      this.nvvVNNnnUvVN = var10 - var9 * 0.5F;
      this.uUuvNUN = var11 - var9 * 0.5F;
      this.VnuUuUVUnnNn = var9;
      float var12 = var11 - var8 * 0.5F;
      float var13 = uUnuvNvvNU(var7) * 0.5F;
      if (var7 != this.uVUUnuunuv) {
         VuuUvnvnuu var14 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu);
         this.vvNvvuUUUVvv = var14 == null ? var7 * 3.4F : var14.UuUVuuUu("Made with soul by Aleksei Ezhov & fr1zy1337", var13);
         this.uVUUnuunuv = var7;
      }

      float var16 = this.vvNvvuUUUVvv;
      float var15 = var12 + var8 * 0.5F + C00OOC00oO(var7) * 0.5F + var7 * 0.98F;
      this.UnVvNNuNu = var10 + var4 * 2.15F * var3 * -0.62F;
      this.UVVNUnVnNV = var15;
      this.vuNunNnvnunv = var15 - var13 * 0.26F;
      this.vNVvnNNnVV = var16 * 0.5F;
      this.UvnnnuuNvUvv = Math.max(var13 * 0.9F, 13.0F * var3);
   }

   private float uNNnnnuuuN(float var1) {
      if (this.NvUVuUNUUNvv && !(this.vNVvnNNnVV <= 0.0F)) {
         float var2 = Math.abs(this.VNvuVnvnun - this.UnVvNNuNu) - this.vNVvnNNnVV;
         float var3 = Math.abs(this.unVVnuunNU - this.vuNunNnvnunv) - this.UvnnnuuNvUvv;
         float var4 = uUnuvNvvNU(Math.max(var2, 0.0F), Math.max(var3, 0.0F)) + Math.min(Math.max(var2, var3), 0.0F);
         if (var4 <= 0.0F) {
            return 1.0F;
         } else {
            float var5 = Math.max(1.0F, 150.0F * var1);
            return 1.0F - vuuuNvNuv(C00OOC00oO(var4 / var5, 0.0F, 1.0F));
         }
      } else {
         return 0.0F;
      }
   }

   private void UuUVuuUu(int var1, int var2, int var3, float var4, float var5, long var6) {
      float var8 = Math.max(0.0F, (float)(var6 - this.UNuUVVuUuU) / 1.0E9F);
      float var9 = C00OOC00oO(uUnuvNvvNU(this.vNnNNNuVVnUv.UuUVuuUu(), this.UVUnUvUNU.UuUVuuUu()), 0.0F, 3.0F);
      float var10 = Math.max((float)Math.exp(-var8 * 1.45F), C00OOC00oO(var9 * 0.3F, 0.0F, 1.0F));
      float var11 = C00OOC00oO((float)var1, (float)var2);
      float var12 = this.uuuNUnuvvNNv.uUnuvNvvNU.UuUVuuUu();
      VvVVnnNNNuV.VUuUUNnnuvuv var13 = this.vunuUUVVUv;
      var13.UuUVuuUu(var1, var2, var3, this.NunnVUUuvUV, this.nVUNnUuU);
      var13.uVUuuVnNVU(this.uUuuVvVunVVu.length);

      for (int var14 = 0; var14 < this.uUuuVvVunVVu.length; var14++) {
         VvVVnnNNNuV.VUUnVnVNNU var15 = this.uUuuVvVunVVu[var14];
         var12 = Math.max(var12, var15.NuunnvnN);
         var13.UuUVuuUu(var14)
            .UuUVuuUu(
               var15.UuUVuuUu,
               var15.NnUuNNU,
               var15.nNvNUVU + var15.nNnVnUNVV,
               var15.UnUNuUU,
               var15.uUVuVvuNUvnu,
               var15.UvUvUNuvNU,
               var15.c0oOOCcCoC0,
               var15.VVnVNnunVvu,
               var15.unNNVVNnvvV,
               var15.nVVUuvuNnUN,
               var15.NuunnvnN,
               72.0F * var11,
               var15.NVUunUNUN,
               var15.UUVNuUNUvUnV,
               var15.vuvnUnVnUNnV,
               var15.nnuUVNUuvvVU
            );
         var13.UuUVuuUu(var14).UuUVuuUu(var15.NVNnnvnuunNv, var15.uVunuUNVVUUV);
         var13.UuUVuuUu(var14).UuUVuuUu(var15.nvUVNnuu);
      }

      for (int var17 = 0; var17 < 14; var17++) {
         VvVVnnNNNuV.uuVnUuun var19 = this.NuUvUNN[var17];
         float var16 = Math.max(0.0F, this.NunnVUUuvUV - var19.uUnuvNvvNU);
         var13.vuuuNvNuv(var17)
            .UuUVuuUu(
               var19.UuUVuuUu / Math.max(1.0F, (float)var1), var19.C00OOC00oO / Math.max(1.0F, (float)var2), var16, var16 > 3.1F ? 0.0F : var19.vVvUvVVuuNvV
            );
      }

      var13.vNUvnnVnUvu()
         .UuUVuuUu(
            this.nvvVNNnnUvVN,
            this.uUuvNUN,
            this.VnuUuUVUnnNn,
            this.VnuUuUVUnnNn,
            0.5F - 0.5F * (float)Math.cos(this.NunnVUUuvUV * (float) (Math.PI * 2.0 / 3.0))
         );
      this.uuuNUnuvvNNv.UuUVuuUu(var13.vuuuNvNuv, this.vVuNvnVUvvv);
      float var18 = vuuuNvNuv(this.OCCc0co0OOC);
      if (this.nNNvNuVvn > 0.5F && var18 > 0.004F) {
         var13.vVvUvVVuuNvV().UuUVuuUu(this.nUUunvNnNNuu, this.UUVVuvnvunv, this.nNNvNuVvn, this.nNNvNuVvn * 4.35F, this.unUNnVvVVvVN, var18, var18, 0.3719F);
         var13.vVvUvVVuuNvV().UuUVuuUu(this.vnVuunuNN.UuUVuuUu() - this.nUUunvNnNNuu, this.UvUNuNvvNVNv.UuUVuuUu() - this.UUVVuvnvunv);
      } else {
         var13.vVvUvVVuuNvV().UuUVuuUu();
      }

      var13.vVvUvVVuuNvV(6);
      var13.VVuuUN(4);
      int var20 = this.unUVnu.UuUVuuUu(var13, 0, this.vVuNvnVUvvv, (float)var1, (float)var2);
      var13.vNUvnnVnUvu(this.unUVnu.UuUVuuUu(var13, this.vVuNvnVUvvv, var1, var2));
      if (this.uuuNUnuvvNNv.UuuNnUvUuv > 0.004F) {
         VvVVnnNNNuV.nUNvUnnVN var21 = var13.uUnuvNvvNU(var20++);
         var21.UuUVuuUu(
            this.uuuNUnuvvNNv.nUUVuvU,
            this.uuuNUnuvvNNv.UnUNVVVNuv,
            this.uuuNUnuvvNNv.vNVuvnUUnuUn,
            this.uuuNUnuvvNNv.UvnvNVnnnnNU,
            Math.min(this.uuuNUnuvvNNv.UvnvNVnnnnNU * 0.32F, 20.0F * var11),
            34.0F * var11,
            this.vVuNvnVUvvv * this.uuuNUnuvvNNv.UuuNnUvUuv,
            0.0F,
            0.0F,
            1.0F,
            1.0F
         );
         var21.UuUVuuUu(0.0F, -this.uuuNUnuvvNNv.UvnvNVnnnnNU * 2.4F);
         var21.C00OOC00oO(0.66F);
      }

      var13.uNNnnnuuuN(var20);
      var13.UuUVuuUu(
         this.vnVuunuNN.UuUVuuUu(), this.UvUNuNvvNVNv.UuUVuuUu(), this.vNnNNNuVVnUv.UuUVuuUu(), this.UVUnUvUNU.UuUVuuUu(), var9, this.NvNvVNUv.UuUVuuUu()
      );
      var13.UuUVuuUu(this.NnvVNVnn, this.O0ooccOc0);
      var13.C00OOC00oO(-var4 * 0.0014F, -var5 * 0.0011F, var4 * 1.75F * var11, var5 * 1.35F * var11, var4 * 2.15F * var11, var5 * 1.72F * var11);
      var13.uUnuvNvvNU(var10, this.occOCoc0OcO.UuUVuuUu(), this.VnvunuuvUNu.UuUVuuUu(), this.nuVuunUn.UuUVuuUu(), this.OCCc0co0OOC, var12);
      var13.UuUVuuUu(this.VuNNvnVVUUn, this.vnUUvvnUVUu);
      var13.UuUVuuUu(
         this.nvuVnuvUVvVu == NvVNvUvunNNu.SAKURA_BREEZE,
         this.nvuVnuvUVvVu == NvVNvUvunNNu.VERNAL_SOLSTICE,
         this.nvuVnuvUVvVu == NvVNvUvunNNu.MIDNIGHT_AZURE,
         this.coOocCcoOc0
      );
      var13.UuUVuuUu(this.vnvUUNNVvU);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void vVvUvVVuuNvV() {
      try {
         ru.metaculture.protection.NVnVnNnN.uVUuuVnNVU();
         UnVNvNnU var1 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu();
         if (var1 == null) {
            return;
         }

         VvuuVNVUn.C00OOC00oO(this.UvvNuvUNNNUv);
         boolean var2 = VuuUvnvnuu.C00OOC00oO(true);
         boolean var14 = false /* VF: Semaphore variable */;

         try {
            var14 = true;
            var1.UuUVuuUu(this.vunuUUVVUv.UuuNnUvUuv, this.vunuUUVVUv.nUUVuvU);
            float var3 = C00OOC00oO((float)this.vunuUUVVUv.UuuNnUvUuv, (float)this.vunuUUVVUv.nUUVuvU);
            int var4 = this.coOocCcoOc0
               ? (this.vunuUUVVUv.VUuuVUnun ? UuUVuuUu(0.0196F, 0.0667F, 0.0196F, 1.0F) : UuUVuuUu(0.1F, 0.1F, 0.1F, 1.0F))
               : UuUVuuUu(1.0F, 1.0F, 1.0F, 0.92F);
            this.C00OOC00oO(var1, 1.0F);

            for (int var5 = 0; var5 < this.vunuUUVVUv.UuUVuuUu(); var5++) {
               VvVVnnNNNuV.nvnNNunvv var6 = this.vunuUUVVUv.UuUVuuUu(var5);
               float var7 = vuuuNvNuv(var6.vuuuNvNuv);
               float var8 = UuUVuuUu(19.5F, var3) * var6.nUUVuvU;
               float var9 = var6.C00OOC00oO + var6.vVvUvVVuuNvV * 0.5F;
               float var10 = var6.uUnuvNvvNU + var6.uNNnnnuuuN * 0.5F + var8 * 0.17F;
               var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, Math.round(var9), Math.round(var10), var8, var6.UuUVuuUu, UuUVuuUu(var4, var7), "c");
            }

            this.UuUVuuUu(var1, 1.0F);
            this.uuuNUnuvvNNv.UuUVuuUu(var1, this.vunuUUVVUv.vuuuNvNuv, var3, this.coOocCcoOc0, this.NnvVNVnn, this.O0ooccOc0, 1.0F);
            float var17 = this.vunuUUVVUv.vuuuNvNuv.uVUuuVnNVU();
            this.unUVnu.vnvvNvUnVv = this.uVUuuVnNVU(0.0F);
            this.unUVnu.UuUVuuUu(var1, var17, this.coOocCcoOc0);
            if (this.uuuNUnuvvNNv.UuuNnUvUuv > 0.004F) {
               float var18 = var17 * this.uuuNUnuvvNNv.UuuNnUvUuv;
               int var19 = this.coOocCcoOc0 ? UuUVuuUu(0.14F, 0.13F, 0.18F, var18) : UuUVuuUu(0.9F, 0.92F, 0.99F, var18);
               var1.UuUVuuUu(
                  vNvnnVvvVUu.UuUVuuUu,
                  Math.round(this.uuuNUnuvvNNv.nUUVuvU + this.uuuNUnuvvNNv.vNVuvnUUnuUn * 0.5F),
                  Math.round(this.uuuNUnuvvNNv.UnUNVVVNuv + this.uuuNUnuvvNNv.UvnvNVnnnnNU * 0.5F + this.uuuNUnuvvNNv.uVUVnuvnuVuv * 0.17F),
                  this.uuuNUnuvvNNv.uVUVnuvnuVuv,
                  uuVuUuuVVNvN[this.uuuNUnuvvNNv.NVNnnvnuunNv],
                  var19,
                  "c"
               );
            }

            var1.C00OOC00oO();
            var14 = false;
         } finally {
            if (var14) {
               VuuUvnvnuu.C00OOC00oO(var2);
               VvuuVNVUn.uUnuvNvvNU(this.UvvNuvUNNNUv);
            }
         }

         VuuUvnvnuu.C00OOC00oO(var2);
         VvuuVNVUn.uUnuvNvvNU(this.UvvNuvUNNNUv);
      } catch (Throwable var16) {
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void uNNnnnuuuN() {
      try {
         ru.metaculture.protection.NVnVnNnN.uVUuuVnNVU();
         UnVNvNnU var1 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu();
         if (var1 == null) {
            return;
         }

         VvuuVNVUn.C00OOC00oO(this.UvvNuvUNNNUv);
         boolean var2 = VuuUvnvnuu.C00OOC00oO(true);
         boolean var6 = false /* VF: Semaphore variable */;

         try {
            var6 = true;
            var1.UuUVuuUu(this.vunuUUVVUv.UuuNnUvUuv, this.vunuUUVVUv.nUUVuvU);
            this.unUVnu.vnvvNvUnVv = this.uVUuuVnNVU(0.0F);
            this.unUVnu.C00OOC00oO(var1, this.vunuUUVVUv.vuuuNvNuv.uVUuuVnNVU(), this.coOocCcoOc0);
            var1.C00OOC00oO();
            var6 = false;
         } finally {
            if (var6) {
               VuuUvnvnuu.C00OOC00oO(var2);
               VvuuVNVUn.uUnuvNvvNU(this.UvvNuvUNNNUv);
            }
         }

         VuuUvnvnuu.C00OOC00oO(var2);
         VvuuVNVUn.uUnuvNvvNU(this.UvvNuvUNNNUv);
      } catch (Throwable var8) {
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(UnVNvNnU var1, float var2) {
      float var3 = this.vunuUUVVUv.uUVvnUuNvvN() * var2;
      if (!(var3 <= 0.004F) && !(this.VnuUuUVUnnNn <= 0.0F)) {
         VuuUvnvnuu var4 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu);
         if (var4 != null) {
            float var5 = UuUVuuUu(this.vunuUUVVUv.nUUVuvU);
            float var6 = uUnuvNvvNU(var5);
            float var7 = var6 * 0.5F;
            float var8 = var4.UuUVuuUu("Made with soul by Aleksei Ezhov & fr1zy1337", var7);
            float var9 = Math.round(this.UnVvNNuNu - var8 * 0.5F);
            float var10 = Math.round(this.UVVNUnVnNV);
            float var11 = this.VNvuVnvnun + this.vnUUvvnUVUu;
            float var12 = Math.max(var8 * 0.22F, 8.0F);
            float var13 = vuuuNvNuv(this.vunuUUVVUv.vvUVNVvvNUv());
            boolean var14 = VuuUvnvnuu.C00OOC00oO(false);
            boolean var25 = false /* VF: Semaphore variable */;

            try {
               var25 = true;

               for (int var15 = 0; var15 < "Made with soul by Aleksei Ezhov & fr1zy1337".length(); var15++) {
                  char var16 = "Made with soul by Aleksei Ezhov & fr1zy1337".charAt(var15);
                  if (var16 != ' ') {
                     float var17 = var4.UuUVuuUu("Made with soul by Aleksei Ezhov & fr1zy1337".substring(0, var15), var7);
                     float var18 = var9 + var17 + var4.UuUVuuUu(String.valueOf(var16), var7) * 0.5F;
                     float var19 = (float)Math.exp(-vNUvnnVnUvu((var18 - var11) / var12));
                     float var20 = var19 * var3 * var13;
                     if (!(var20 <= 0.006F)) {
                        int var21 = this.uVUuuVnNVU(
                           "Made with soul by Aleksei Ezhov & fr1zy1337".length() > 1
                              ? (float)var15 / ("Made with soul by Aleksei Ezhov & fr1zy1337".length() - 1)
                              : 0.0F
                        );
                        int var22 = uUnuvNvvNU(var21, uUnuvNvvNU(var21, -1, 0.55F), C00OOC00oO(var19 * 1.15F, 0.0F, 1.0F));
                        var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var9 + var17, var10, var6, String.valueOf(var16), UuUVuuUu(var22, var20), "l");
                     }
                  }
               }

               var25 = false;
            } finally {
               if (var25) {
                  VuuUvnvnuu.C00OOC00oO(var14);
               }
            }

            VuuUvnvnuu.C00OOC00oO(var14);
         }
      }
   }

   private void nuUnNvnuUu(float var1) {
      if (this.UUuNVVnNnu <= 0.0F) {
         this.nNNvNuVvn = 0.0F;
      } else {
         LocalTime var2 = LocalTime.now();
         int var3 = var2.getHour() * 60 + var2.getMinute();
         String var4 = Profile.getUsername();
         if (var4 == null || var4.isBlank()) {
            var4 = this.field_22787 != null && this.field_22787.method_1548() != null ? this.field_22787.method_1548().method_1676() : null;
         }

         String var5 = var4 == null ? "" : var4.trim();
         if (var3 != this.VvNnVUvunnU || !var5.equals(this.UVnUNuNvu)) {
            this.VvNnVUvunnU = var3;
            this.UVnUNuNvu = var5;
            this.UvUvNUvnv = uUnuvNvvNU(var2.getHour()) + (this.UVnUNuNvu.isEmpty() ? "!" : ", ");
            this.VNUnNnvu = this.UVnUNuNvu.isEmpty() ? "" : "!";
         }

         this.unUNnVvVVvVN = VVuuUN(var2.toSecondOfDay() / 3600.0F);
         float var6 = this.UUuNVVnNnu * 0.5F;
         float var7 = vuuuNvNuv(this.OCCc0co0OOC);
         float var8 = this.NNNVNvNuVvuN + (1.0F - var7) * 9.0F * var1;
         VuuUvnvnuu var9 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.C00OOC00oO);
         boolean var10 = !this.UVnUNuNvu.isEmpty() && UuUVuuUu(this.UVnUNuNvu);
         nUVnuvUu var11 = var10 ? vNvnnVvvVUu.vVvUvVVuuNvV : vNvnnVvvVUu.C00OOC00oO;
         VuuUvnvnuu var12 = UnVNvNnU.UuUVuuUu(var11);
         float var13 = var9 == null ? var6 * this.UvUvNUvnv.length() * 0.52F : var9.UuUVuuUu(this.UvUvNUvnv, var6);
         float var14 = var12 != null && !this.UVnUNuNvu.isEmpty() ? var12.UuUVuuUu(this.UVnUNuNvu, var6) : 0.0F;
         float var15 = var9 != null && !this.VNUnNnvu.isEmpty() ? var9.UuUVuuUu(this.VNUnNnvu, var6) : 0.0F;
         float var16 = var6 * 0.62F;
         float var17 = var6 * 0.78F;
         float var18 = var16 * 2.0F + var17 + var13 + var14 + var15;
         float var19 = this.nVVunnNVNvN - var18 * 0.5F;
         this.nNNvNuVvn = var16;
         this.nUUunvNnNNuu = var19 + var16;
         this.UUVVuvnvunv = var8 - var6 * 0.36F;
         this.nUUnuUVnUNN = var19 + var16 * 2.0F + var17;
      }
   }

   private static float VVuuUN(float var0) {
      float var1 = var0 % 24.0F;
      if (var1 >= 8.0F && var1 < 17.0F) {
         return 1.0F;
      } else if (var1 >= 21.0F || var1 < 4.0F) {
         return 0.0F;
      } else {
         return var1 >= 4.0F && var1 < 8.0F
            ? vuuuNvNuv(C00OOC00oO((var1 - 4.0F) / 4.0F, 0.0F, 1.0F))
            : vuuuNvNuv(C00OOC00oO((21.0F - var1) / 4.0F, 0.0F, 1.0F));
      }
   }

   private void C00OOC00oO(UnVNvNnU var1, float var2) {
      float var3 = vuuuNvNuv(this.vunuUUVVUv.vvUVNVvvNUv());
      float var4 = var3 * var2;
      if (!(var4 <= 0.004F) && !(this.UUuNVVnNnu <= 0.0F)) {
         float var5 = C00OOC00oO((float)this.vunuUUVVUv.UuuNnUvUuv, (float)this.vunuUUVVUv.nUUVuvU);
         float var6 = this.NNNVNvNuVvuN + (1.0F - var3) * 9.0F * var5;
         boolean var7 = !this.UVnUNuNvu.isEmpty() && UuUVuuUu(this.UVnUNuNvu);
         nUVnuvUu var8 = var7 ? vNvnnVvvVUu.vVvUvVVuuNvV : vNvnnVvvVUu.C00OOC00oO;
         VuuUvnvnuu var9 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.C00OOC00oO);
         VuuUvnvnuu var10 = UnVNvNnU.UuUVuuUu(var8);
         float var11 = this.UUuNVVnNnu * 0.5F;
         float var12 = var9 == null ? var11 * this.UvUvNUvnv.length() * 0.52F : var9.UuUVuuUu(this.UvUvNUvnv, var11);
         float var13 = var10 != null && !this.UVnUNuNvu.isEmpty() ? var10.UuUVuuUu(this.UVnUNuNvu, var11) : 0.0F;
         int var14 = this.coOocCcoOc0 ? UuUVuuUu(0.16F, 0.16F, 0.21F, 1.0F) : UuUVuuUu(0.88F, 0.9F, 0.98F, 1.0F);
         float var15 = var4 * 0.82F;
         float var16 = this.nUUnuUVnUNN;
         var1.UuUVuuUu(vNvnnVvvVUu.C00OOC00oO, Math.round(var16), Math.round(var6), this.UUuNVVnNnu, this.UvUvNUvnv, UuUVuuUu(var14, var15), "l");
         var16 += var12;
         if (!this.UVnUNuNvu.isEmpty()) {
            int var17 = this.coOocCcoOc0 ? uUnuvNvvNU(this.uVUuuVnNVU(0.3F), -15066590, 0.42F) : this.uVUuuVnNVU(0.3F);
            var1.UuUVuuUu(var8, Math.round(var16), Math.round(var6), this.UUuNVVnNnu, this.UVnUNuNvu, UuUVuuUu(var17, var4), "l");
            var16 += var13;
            var1.UuUVuuUu(vNvnnVvvVUu.C00OOC00oO, Math.round(var16), Math.round(var6), this.UUuNVVnNnu, this.VNUnNnvu, UuUVuuUu(var14, var15), "l");
         }
      }
   }

   private static String uUnuvNvvNU(int var0) {
      if (var0 >= 6 && var0 < 12) {
         return "Доброе утро";
      } else if (var0 >= 12 && var0 < 18) {
         return "Добрый день";
      } else {
         return var0 >= 18 && var0 < 22 ? "Добрый вечер" : "Доброй ночи";
      }
   }

   private static float vNUvnnVnUvu(float var0) {
      return var0 * var0;
   }

   private int uVUuuVnNVU(float var1) {
      float var2 = C00OOC00oO(var1, 0.0F, 1.0F);
      float var3 = uNNnnnuuuN(this.NnvVNVnn) + (uNNnnnuuuN(this.O0ooccOc0) - uNNnnnuuuN(this.NnvVNVnn)) * var2;
      float var4 = nuUnNvnuUu(this.NnvVNVnn) + (nuUnNvnuUu(this.O0ooccOc0) - nuUnNvnuUu(this.NnvVNVnn)) * var2;
      float var5 = VVuuUN(this.NnvVNVnn) + (VVuuUN(this.O0ooccOc0) - VVuuUN(this.NnvVNVnn)) * var2;
      float var6 = Math.max(var3, Math.max(var4, var5));
      float var7 = var6 > 1.0E-4F ? Math.max(1.0F, 0.88F / var6) : 1.0F;
      return UuUVuuUu(var3 * var7, var4 * var7, var5 * var7, 1.0F);
   }

   private static int uUnuvNvvNU(int var0, int var1, float var2) {
      float var3 = C00OOC00oO(var2, 0.0F, 1.0F);
      int var4 = Math.round((var0 >> 16 & 0xFF) + ((var1 >> 16 & 0xFF) - (var0 >> 16 & 0xFF)) * var3);
      int var5 = Math.round((var0 >> 8 & 0xFF) + ((var1 >> 8 & 0xFF) - (var0 >> 8 & 0xFF)) * var3);
      int var6 = Math.round((var0 & 0xFF) + ((var1 & 0xFF) - (var0 & 0xFF)) * var3);
      return 0xFF000000 | var4 << 16 | var5 << 8 | var6;
   }

   int nuUnNvnuUu() {
      return vVvUvVVuuNvV(Math.round(Menu.UnUNuUU.vVvUvVVuuNvV));
   }

   static int vVvUvVVuuNvV(int var0) {
      return Math.max(0, Math.min(NVNnnvnuunNv - 1, var0));
   }

   private static float VVuuUN() {
      return C00OOC00oO(Menu.vnvvNvUnVv.uUnuvNvvNU(), 0.0F, 1.5F);
   }

   private static void vNUvnnVnUvu() {
      if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
         ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
      }
   }

   public static float UuUVuuUu(int var0) {
      return Math.max(22.0F, (float)Math.round(var0 * 0.047F));
   }

   public static float UuUVuuUu(float var0) {
      return var0 / 0.375F;
   }

   public static float UuUVuuUu(VuuUvnvnuu var0, float var1) {
      if (var0 == null) {
         return 0.0F;
      } else {
         int var2 = Math.max(0, "WILD".length() - 1);
         return var0.UuUVuuUu("WILD", var1) + 0.08F * var1 * var2;
      }
   }

   static float UuUVuuUu(float var0, float var1) {
      return Math.max(var0 * var1, 13.0F) * 2.0F;
   }

   private static boolean UuUVuuUu(String var0) {
      for (int var1 = 0; var1 < var0.length(); var1++) {
         if (var0.charAt(var1) > '~') {
            return false;
         }
      }

      return true;
   }

   public static float C00OOC00oO(float var0) {
      if (var0 == VUNvNUuNVnn && NUUVUvvuNNVU > 0.0F) {
         return NUUVUvvuNNVU;
      } else {
         float var1 = UuUVuuUu(var0) * 0.5F;
         VuuUvnvnuu var2 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV);
         float var3 = var2 == null ? 0.0F : var2.C00OOC00oO("W", var1);
         if (!(var3 > 0.0F)) {
            return 0.7296875F * var1;
         } else {
            NUUVUvvuNNVU = var3;
            VUNvNUuNVnn = var0;
            return var3;
         }
      }
   }

   public static float uUnuvNvvNU(float var0) {
      return Math.max(28.0F, var0 * 0.46F);
   }

   private void UuUVuuUu(VvVVnnNNNuV.NVnVnNnN var1) {
      class_310 var2 = this.field_22787 == null ? class_310.method_1551() : this.field_22787;
      if (var2 != null) {
         switch (var1) {
            case SINGLEPLAYER:
               var2.execute(() -> var2.method_1507(new class_526(this)));
               break;
            case MULTIPLAYER:
               var2.execute(() -> var2.method_1507(new uNuVuVnNnu(this)));
               break;
            case ALT_MANAGER:
               var2.execute(() -> var2.method_1507(new NuvVVvUU(this)));
               break;
            case OPTIONS:
               var2.execute(() -> var2.method_1507(new class_429(this, var2.field_1690)));
               break;
            case QUIT:
               var2.execute(var2::method_1592);
         }
      }
   }

   private static float UuUVuuUu(class_1041 var0, double var1) {
      return (float)(var1 * var0.method_4489() / Math.max(1.0, (double)var0.method_4486()));
   }

   private static float C00OOC00oO(class_1041 var0, double var1) {
      return (float)(var1 * var0.method_4506() / Math.max(1.0, (double)var0.method_4502()));
   }

   private static float C00OOC00oO(float var0, float var1) {
      float var2 = C00OOC00oO(Menu.c0oOOCcCoC0.uUnuvNvvNU() / 0.86F, 0.72F, 1.46F);
      return C00OOC00oO(Math.min(var0 / 1920.0F, var1 / 1080.0F) * 1.16F * var2, 0.66F, 2.6F);
   }

   static float UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = var2 + var4 * 0.5F;
      float var8 = var3 + var5 * 0.5F;
      float var9 = var4 * 0.5F - var6;
      float var10 = var5 * 0.5F - var6;
      float var11 = Math.abs(var0 - var7) - var9;
      float var12 = Math.abs(var1 - var8) - var10;
      float var13 = Math.max(var11, 0.0F);
      float var14 = Math.max(var12, 0.0F);
      return (float)Math.sqrt(var13 * var13 + var14 * var14) + Math.min(Math.max(var11, var12), 0.0F) - var6;
   }

   private static float uUnuvNvvNU(float var0, float var1) {
      return (float)Math.sqrt(var0 * var0 + var1 * var1);
   }

   static float vuuuNvNuv(float var0) {
      float var1 = C00OOC00oO(var0, 0.0F, 1.0F);
      return var1 * var1 * var1 * (var1 * (var1 * 6.0F - 15.0F) + 10.0F);
   }

   static float C00OOC00oO(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   static float uNNnnnuuuN(int var0) {
      return (var0 >> 16 & 0xFF) / 255.0F;
   }

   static float nuUnNvnuUu(int var0) {
      return (var0 >> 8 & 0xFF) / 255.0F;
   }

   static float VVuuUN(int var0) {
      return (var0 & 0xFF) / 255.0F;
   }

   private static int C00OOC00oO(int var0, int var1) {
      int var2 = Math.max(0, Math.min(255, var1));
      return var0 & 16777215 | var2 << 24;
   }

   static int UuUVuuUu(int var0, float var1) {
      return C00OOC00oO(var0, Math.round(C00OOC00oO(var1, 0.0F, 1.0F) * 255.0F));
   }

   static int UuUVuuUu(float var0, float var1, float var2, float var3) {
      int var4 = Math.round(C00OOC00oO(var0, 0.0F, 1.0F) * 255.0F);
      int var5 = Math.round(C00OOC00oO(var1, 0.0F, 1.0F) * 255.0F);
      int var6 = Math.round(C00OOC00oO(var2, 0.0F, 1.0F) * 255.0F);
      int var7 = Math.round(C00OOC00oO(var3, 0.0F, 1.0F) * 255.0F);
      return var7 << 24 | var4 << 16 | var5 << 8 | var6;
   }

   static enum NVnVnNnN {
      SINGLEPLAYER,
      MULTIPLAYER,
      ALT_MANAGER,
      OPTIONS,
      QUIT;
   }

   static final class VUUnVnVNNU {
      final String UuUVuuUu;
      final VvVVnnNNNuV.NVnVnNnN C00OOC00oO;
      final nUuuVnUnNvn uUnuvNvvNU = new nUuuVnUnNvn(vuVvuunNvVv.uNNnnnuuuN);
      final nUuuVnUnNvn vVvUvVVuuNvV = new nUuuVnUnNvn(vuVvuunNvVv.VVuuUN);
      final nUuuVnUnNvn uNNnnnuuuN = new nUuuVnUnNvn(vuVvuunNvVv.nvUVNnuu);
      final nUuuVnUnNvn nuUnNvnuUu = new nUuuVnUnNvn(vuVvuunNvVv.uVUuuVnNVU);
      final nUuuVnUnNvn VVuuUN = new nUuuVnUnNvn(vuVvuunNvVv.vNUvnnVnUvu);
      boolean vNUvnnVnUvu;
      boolean uVUuuVnNVU;
      float vuuuNvNuv;
      float nvUVNnuu = 1.0F;
      final nUuuVnUnNvn UuuNnUvUuv = new nUuuVnUnNvn(vuVvuunNvVv.UuuNnUvUuv);
      final nUuuVnUnNvn nUUVuvU = new nUuuVnUnNvn(vuVvuunNvVv.UuuNnUvUuv);
      final nUuuVnUnNvn UnUNVVVNuv = new nUuuVnUnNvn(vuVvuunNvVv.uNnUnnuNUnNu);
      final nUuuVnUnNvn vNVuvnUUnuUn = new nUuuVnUnNvn(vuVvuunNvVv.uNnUnnuNUnNu);
      final nUuuVnUnNvn UvnvNVnnnnNU = new nUuuVnUnNvn(vuVvuunNvVv.vVvUvVVuuNvV);
      final nUuuVnUnNvn uVUVnuvnuVuv = new nUuuVnUnNvn(vuVvuunNvVv.vuuuNvNuv);
      float NVNnnvnuunNv;
      float uVunuUNVVUUV = -1.6F;
      float UNnVVNvvnVvU;
      float uNnUnnuNUnNu;
      float NnUuNNU;
      float nNvNUVU;
      float UnUNuUU;
      float uUVuVvuNUvnu;
      float UvUvUNuvNU;
      float c0oOOCcCoC0;
      float VVnVNnunVvu;
      float unNNVVNnvvV;
      float NuunnvnN;
      float NVUunUNUN = 1.0F;
      float UUVNuUNUvUnV = 0.5F;
      float vuvnUnVnUNnV = 0.5F;
      float nnuUVNUuvvVU;
      float nVVUuvuNnUN;
      float nNnVnUNVV;

      VUUnVnVNNU(String var1, VvVVnnNNNuV.NVnVnNnN var2) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
      }

      void UuUVuuUu() {
         this.c0oOOCcCoC0 = 0.0F;
         this.VVnVNnunVvu = 0.0F;
         this.unNNVVNnvvV = 0.0F;
         this.NuunnvnN = 0.0F;
         this.nVVUuvuNnUN = 0.0F;
         this.nNnVnUNVV = 0.0F;
         this.NVUunUNUN = 1.0F;
         this.UUVNuUNUvUnV = 0.5F;
         this.vuvnUnVnUNnV = 0.5F;
         this.nnuUVNUuvvVU = 0.0F;
         this.vNUvnnVnUvu = false;
         this.uVUuuVnNVU = false;
         this.vuuuNvNuv = 0.0F;
         this.nvUVNnuu = 1.0F;
         this.VVuuUN.UuUVuuUu(0.0F);
         this.NVNnnvnuunNv = 0.0F;
         this.uVunuUNVVUUV = -1.6F;
         this.UnUNVVVNuv.UuUVuuUu(0.0F);
         this.vNVuvnUUnuUn.UuUVuuUu(-1.6F);
         this.UvnvNVnnnnNU.UuUVuuUu(0.0F);
         this.uVUVnuvnuVuv.UuUVuuUu(0.0F);
         this.uUnuvNvvNU.UuUVuuUu(0.0F);
         this.vVvUvVVuuNvV.UuUVuuUu(0.0F);
         this.uNNnnnuuuN.UuUVuuUu(0.0F);
         this.nuUnNvnuUu.UuUVuuUu(1.0F);
         this.UuuNnUvUuv.UuUVuuUu(0.5F);
         this.nUUVuvU.UuUVuuUu(0.5F);
      }

      boolean UuUVuuUu(float var1, float var2) {
         float var3 = this.UnUNuUU * 0.5F * this.NVUunUNUN;
         float var4 = this.uUVuVvuNUvnu * 0.5F * this.NVUunUNUN;
         float var5 = this.NnUuNNU + this.UnUNuUU * 0.5F;
         float var6 = this.nNvNUVU + this.nNnVnUNVV + this.uUVuVvuNUvnu * 0.5F;
         return VvVVnnNNNuV.UuUVuuUu(var1, var2, var5 - var3, var6 - var4, var3 * 2.0F, var4 * 2.0F, this.UvUvUNuvNU * this.NVUunUNUN) <= 0.0F;
      }
   }

   static enum VUVvVuvuN {
      VERSION,
      MORE,
      INSTALL;
   }

   public static final class VUnuUnnuNvVu {
      private float UuUVuuUu;
      private float C00OOC00oO;
      private float uUnuvNvvNU;
      private float vVvUvVVuuNvV;
      private float uNNnnnuuuN;

      public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
      }

      public float UuUVuuUu() {
         return this.UuUVuuUu;
      }

      public float C00OOC00oO() {
         return this.C00OOC00oO;
      }

      public float uUnuvNvvNU() {
         return this.uUnuvNvvNU;
      }

      public float vVvUvVVuuNvV() {
         return this.vVvUvVVuuNvV;
      }

      public float uNNnnnuuuN() {
         return this.uNNnnnuuuN;
      }
   }

   public static final class VUuUUNnnuvuv {
      private VvVVnnNNNuV.nvnNNunvv[] UuUVuuUu;
      private VvVVnnNNNuV.nUNvUnnVN[] C00OOC00oO = new VvVVnnNNNuV.nUNvUnnVN[0];
      private int uUnuvNvvNU;
      private VvVVnnNNNuV.nUNvUnnVN[] vVvUvVVuuNvV = new VvVVnnNNNuV.nUNvUnnVN[0];
      private int uNNnnnuuuN;
      private final VvVVnnNNNuV.uunvUUVnuNn nuUnNvnuUu = new VvVVnnNNNuV.uunvUUVnuNn();
      private final VvVVnnNNNuV.nvUnvV VVuuUN = new VvVVnnNNNuV.nvUnvV();
      private final VvVVnnNNNuV.vvnuuvnUNvN[] vNUvnnVnUvu;
      private final VvVVnnNNNuV.VUnuUnnuNvVu uVUuuVnNVU = new VvVVnnNNNuV.VUnuUnnuNvVu();
      final VvVVnnNNNuV.VvunVVUvUNnv vuuuNvNuv = new VvVVnnNNNuV.VvunVVUvUNnv();
      private int nvUVNnuu;
      int UuuNnUvUuv;
      int nUUVuvU;
      private int UnUNVVVNuv;
      private float vNVuvnUUnuUn;
      private float UvnvNVnnnnNU;
      private float uVUVnuvnuVuv;
      private float NVNnnvnuunNv;
      private float uVunuUNVVUUV;
      private float UNnVVNvvnVvU;
      private float uNnUnnuNUnNu;
      private float NnUuNNU;
      private float nNvNUVU;
      private float UnUNuUU;
      private float uUVuVvuNUvnu;
      private float UvUvUNuvNU;
      private float c0oOOCcCoC0;
      private float VVnVNnunVvu;
      private float unNNVVNnvvV;
      private float NuunnvnN;
      private float NVUunUNUN;
      private float UUVNuUNUvUnV;
      private float vuvnUnVnUNnV;
      private float nnuUVNUuvvVU;
      private float nVVUuvuNnUN;
      private float nNnVnUNVV;
      private float nuunNvv;
      private float uUVVvVVNvvn = 1.0F;
      private float vvUVNVvvNUv;
      private float UuNnnVnuNNV;
      private float uUVvnUuNvvN;
      private float UUuUnNVNuuv;
      private float NVuNUuVnVUN;
      private float NVuunNnvvvVu;
      private boolean vNnNuuvVn;
      boolean VUuuVUnun;
      private boolean vVVuuVVv;
      private boolean VuunNUUUvu;
      private float NNUUNUuVNNVn;

      public VUuUUNnnuvuv(int var1, int var2) {
         this.UuUVuuUu = new VvVVnnNNNuV.nvnNNunvv[var1];

         for (int var3 = 0; var3 < var1; var3++) {
            this.UuUVuuUu[var3] = new VvVVnnNNNuV.nvnNNunvv();
         }

         this.vNUvnnVnUvu = new VvVVnnNNNuV.vvnuuvnUNvN[var2];

         for (int var4 = 0; var4 < var2; var4++) {
            this.vNUvnnVnUvu[var4] = new VvVVnnNNNuV.vvnuuvnUNvN();
         }

         this.nvUVNnuu = var1;
      }

      public VvVVnnNNNuV.nvnNNunvv UuUVuuUu(int var1) {
         this.C00OOC00oO(var1 + 1);
         return this.UuUVuuUu[var1];
      }

      public void C00OOC00oO(int var1) {
         if (var1 > this.UuUVuuUu.length) {
            int var2 = Math.max(var1, this.UuUVuuUu.length * 2);
            VvVVnnNNNuV.nvnNNunvv[] var3 = new VvVVnnNNNuV.nvnNNunvv[var2];
            System.arraycopy(this.UuUVuuUu, 0, var3, 0, this.UuUVuuUu.length);

            for (int var4 = this.UuUVuuUu.length; var4 < var2; var4++) {
               var3[var4] = new VvVVnnNNNuV.nvnNNunvv();
            }

            this.UuUVuuUu = var3;
         }
      }

      public int UuUVuuUu() {
         return this.nvUVNnuu;
      }

      public VvVVnnNNNuV.nUNvUnnVN uUnuvNvvNU(int var1) {
         this.vVvUvVVuuNvV(var1 + 1);
         return this.C00OOC00oO[var1];
      }

      public void vVvUvVVuuNvV(int var1) {
         if (var1 > this.C00OOC00oO.length) {
            int var2 = Math.max(var1, Math.max(4, this.C00OOC00oO.length * 2));
            VvVVnnNNNuV.nUNvUnnVN[] var3 = new VvVVnnNNNuV.nUNvUnnVN[var2];
            System.arraycopy(this.C00OOC00oO, 0, var3, 0, this.C00OOC00oO.length);

            for (int var4 = this.C00OOC00oO.length; var4 < var2; var4++) {
               var3[var4] = new VvVVnnNNNuV.nUNvUnnVN();
            }

            this.C00OOC00oO = var3;
         }
      }

      public int C00OOC00oO() {
         return this.uUnuvNvvNU;
      }

      public void uNNnnnuuuN(int var1) {
         this.uUnuvNvvNU = Math.max(0, Math.min(this.C00OOC00oO.length, var1));
      }

      public VvVVnnNNNuV.nUNvUnnVN nuUnNvnuUu(int var1) {
         this.VVuuUN(var1 + 1);
         return this.vVvUvVVuuNvV[var1];
      }

      public void VVuuUN(int var1) {
         if (var1 > this.vVvUvVVuuNvV.length) {
            int var2 = Math.max(var1, Math.max(4, this.vVvUvVVuuNvV.length * 2));
            VvVVnnNNNuV.nUNvUnnVN[] var3 = new VvVVnnNNNuV.nUNvUnnVN[var2];
            System.arraycopy(this.vVvUvVVuuNvV, 0, var3, 0, this.vVvUvVVuuNvV.length);

            for (int var4 = this.vVvUvVVuuNvV.length; var4 < var2; var4++) {
               var3[var4] = new VvVVnnNNNuV.nUNvUnnVN();
            }

            this.vVvUvVVuuNvV = var3;
         }
      }

      public int uUnuvNvvNU() {
         return this.uNNnnnuuuN;
      }

      public void vNUvnnVnUvu(int var1) {
         this.uNNnnnuuuN = Math.max(0, Math.min(this.vVvUvVVuuNvV.length, var1));
      }

      public VvVVnnNNNuV.uunvUUVnuNn vVvUvVVuuNvV() {
         return this.nuUnNvnuUu;
      }

      public VvVVnnNNNuV.nvUnvV uNNnnnuuuN() {
         return this.VVuuUN;
      }

      public void uVUuuVnNVU(int var1) {
         this.nvUVNnuu = Math.max(0, Math.min(this.UuUVuuUu.length, var1));
      }

      public VvVVnnNNNuV.vvnuuvnUNvN vuuuNvNuv(int var1) {
         return this.vNUvnnVnUvu[var1];
      }

      public void UuUVuuUu(int var1, int var2, int var3, float var4, float var5) {
         this.UuuNnUvUuv = var1;
         this.nUUVuvU = var2;
         this.UnUNVVVNuv = var3;
         this.vNVuvnUUnuUn = var4;
         this.UvnvNVnnnnNU = var5;
      }

      public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6) {
         this.uVUVnuvnuVuv = var1;
         this.NVNnnvnuunNv = var2;
         this.uVunuUNVVUUV = var1 / Math.max(1.0F, (float)this.UuuNnUvUuv);
         this.UNnVVNvvnVvU = var2 / Math.max(1.0F, (float)this.nUUVuvU);
         this.uNnUnnuNUnNu = var3;
         this.NnUuNNU = var4;
         this.nNvNUVU = var5;
         this.UnUNuUU = var6;
      }

      public void UuUVuuUu(int var1, int var2) {
         this.uUVuVvuNUvnu = VvVVnnNNNuV.uNNnnnuuuN(var1);
         this.UvUvUNuvNU = VvVVnnNNNuV.nuUnNvnuUu(var1);
         this.c0oOOCcCoC0 = VvVVnnNNNuV.VVuuUN(var1);
         this.VVnVNnunVvu = VvVVnnNNNuV.uNNnnnuuuN(var2);
         this.unNNVVNnvvV = VvVVnnNNNuV.nuUnNvnuUu(var2);
         this.NuunnvnN = VvVVnnNNNuV.VVuuUN(var2);
      }

      public void C00OOC00oO(float var1, float var2, float var3, float var4, float var5, float var6) {
         this.NVUunUNUN = var1;
         this.UUVNuUNUvUnV = var2;
         this.vuvnUnVnUNnV = var3;
         this.nnuUVNUuvvVU = var4;
         this.nVVUuvuNnUN = var5;
         this.nNnVnUNVV = var6;
      }

      public void uUnuvNvvNU(float var1, float var2, float var3, float var4, float var5, float var6) {
         this.nuunNvv = var1;
         this.uUVVvVVNvvn = VvVVnnNNNuV.C00OOC00oO(var2, 0.35F, 1.0F);
         this.vvUVNVvvNUv = VvVVnnNNNuV.C00OOC00oO(var3, 0.0F, 1.0F);
         this.UuNnnVnuNNV = VvVVnnNNNuV.C00OOC00oO(var4, 0.0F, 1.0F);
         this.uUVvnUuNvvN = var5;
         this.UUuUnNVNuuv = VvVVnnNNNuV.C00OOC00oO(var6, 0.0F, 1.0F);
      }

      public void UuUVuuUu(float var1, float var2) {
         this.NVuNUuVnVUN = VvVVnnNNNuV.C00OOC00oO(var1, 0.0F, 1.0F);
         this.NVuunNnvvvVu = var2;
      }

      public float nuUnNvnuUu() {
         return this.NVuunNnvvvVu;
      }

      public void UuUVuuUu(boolean var1, boolean var2, boolean var3, boolean var4) {
         this.vNnNuuvVn = var1;
         this.VUuuVUnun = var2;
         this.vVVuuVVv = var3;
         this.VuunNUUUvu = var4;
      }

      public void UuUVuuUu(float var1) {
         this.NNUUNUuVNNVn = var1;
      }

      public float VVuuUN() {
         return this.NNUUNUuVNNVn;
      }

      public VvVVnnNNNuV.VUnuUnnuNvVu vNUvnnVnUvu() {
         return this.uVUuuVnNVU;
      }

      public VvVVnnNNNuV.VvunVVUvUNnv uVUuuVnNVU() {
         return this.vuuuNvNuv;
      }

      public int vuuuNvNuv() {
         return this.UuuNnUvUuv;
      }

      public int nvUVNnuu() {
         return this.nUUVuvU;
      }

      public int UuuNnUvUuv() {
         return this.UnUNVVVNuv;
      }

      public float nUUVuvU() {
         return this.vNVuvnUUnuUn;
      }

      public float UnUNVVVNuv() {
         return this.UvnvNVnnnnNU;
      }

      public float vNVuvnUUnuUn() {
         return this.uVUVnuvnuVuv;
      }

      public float UvnvNVnnnnNU() {
         return this.NVNnnvnuunNv;
      }

      public float uVUVnuvnuVuv() {
         return this.uVunuUNVVUUV;
      }

      public float NVNnnvnuunNv() {
         return this.UNnVVNvvnVvU;
      }

      public float uVunuUNVVUUV() {
         return this.uNnUnnuNUnNu;
      }

      public float UNnVVNvvnVvU() {
         return this.NnUuNNU;
      }

      public float uNnUnnuNUnNu() {
         return this.nNvNUVU;
      }

      public float NnUuNNU() {
         return this.UnUNuUU;
      }

      public float nNvNUVU() {
         return this.uUVuVvuNUvnu;
      }

      public float UnUNuUU() {
         return this.UvUvUNuvNU;
      }

      public float uUVuVvuNUvnu() {
         return this.c0oOOCcCoC0;
      }

      public float UvUvUNuvNU() {
         return this.VVnVNnunVvu;
      }

      public float c0oOOCcCoC0() {
         return this.unNNVVNnvvV;
      }

      public float VVnVNnunVvu() {
         return this.NuunnvnN;
      }

      public float unNNVVNnvvV() {
         return this.NVUunUNUN;
      }

      public float NuunnvnN() {
         return this.UUVNuUNUvUnV;
      }

      public float NVUunUNUN() {
         return this.vuvnUnVnUNnV;
      }

      public float UUVNuUNUvUnV() {
         return this.nnuUVNUuvvVU;
      }

      public float vuvnUnVnUNnV() {
         return this.nVVUuvuNnUN;
      }

      public float nnuUVNUuvvVU() {
         return this.nNnVnUNVV;
      }

      public float nVVUuvuNnUN() {
         return this.nuunNvv;
      }

      public float nNnVnUNVV() {
         return this.uUVVvVVNvvn;
      }

      public float nuunNvv() {
         return this.vvUVNVvvNUv;
      }

      public float uUVVvVVNvvn() {
         return this.UuNnnVnuNNV;
      }

      public float vvUVNVvvNUv() {
         return this.uUVvnUuNvvN;
      }

      public float UuNnnVnuNNV() {
         return this.UUuUnNVNuuv;
      }

      public float uUVvnUuNvvN() {
         return this.NVuNUuVnVUN;
      }

      public boolean UUuUnNVNuuv() {
         return this.vNnNuuvVn;
      }

      public boolean NVuNUuVnVUN() {
         return this.VUuuVUnun;
      }

      public boolean NVuunNnvvvVu() {
         return this.vVVuuVVv;
      }

      public boolean vNnNuuvVn() {
         return this.VuunNUUUvu;
      }
   }

   public static final class VvunVVUvUNnv {
      float UuUVuuUu;
      float C00OOC00oO;
      float uUnuvNvvNU;
      float vVvUvVVuuNvV;
      float uNNnnnuuuN;
      float nuUnNvnuUu;
      float VVuuUN;
      float vNUvnnVnUvu;
      float uVUuuVnNVU = 0.5F;
      float vuuuNvNuv = 0.5F;
      float nvUVNnuu;
      float UuuNnUvUuv;
      float nUUVuvU;
      float UnUNVVVNuv;
      float vNVuvnUUnuUn;
      float UvnvNVnnnnNU;
      float uVUVnuvnuVuv;
      float NVNnnvnuunNv;

      public float UuUVuuUu() {
         return this.uVUVnuvnuVuv;
      }

      public float C00OOC00oO() {
         return this.UuUVuuUu;
      }

      public float uUnuvNvvNU() {
         return this.C00OOC00oO;
      }

      public float vVvUvVVuuNvV() {
         return this.uUnuvNvvNU;
      }

      public float uNNnnnuuuN() {
         return this.vVvUvVVuuNvV;
      }

      public float nuUnNvnuUu() {
         return this.uNNnnnuuuN;
      }

      public float VVuuUN() {
         return this.nuUnNvnuUu;
      }

      public float vNUvnnVnUvu() {
         return this.VVuuUN;
      }

      public float uVUuuVnNVU() {
         return this.vNUvnnVnUvu;
      }

      public float vuuuNvNuv() {
         return this.uVUuuVnNVU;
      }

      public float nvUVNnuu() {
         return this.vuuuNvNuv;
      }

      public float UuuNnUvUuv() {
         return this.nvUVNnuu;
      }

      public float nUUVuvU() {
         return this.UuuNnUvUuv;
      }

      public float UnUNVVVNuv() {
         return this.nUUVuvU;
      }

      public float vNVuvnUUnuUn() {
         return this.UnUNVVVNuv;
      }

      public float UvnvNVnnnnNU() {
         return this.vNVuvnUUnuUn;
      }

      public float uVUVnuvnuVuv() {
         return this.UvnvNVnnnnNU;
      }

      public float NVNnnvnuunNv() {
         return this.NVNnnvnuunNv;
      }
   }

   static final class nNVUVnuUnU {
      private final nUuuVnUnNvn UuUVuuUu = new nUuuVnUnNvn(vuVvuunNvVv.UnUNuUU);
      private final nUuuVnUnNvn C00OOC00oO = new nUuuVnUnNvn(vuVvuunNvVv.UnUNuUU);
      private final nUuuVnUnNvn uUnuvNvvNU = new nUuuVnUnNvn(vuVvuunNvVv.vNVuvnUUnuUn);
      private final nUuuVnUnNvn vVvUvVVuuNvV = new nUuuVnUnNvn(vuVvuunNvVv.vNVuvnUUnuUn);
      private final nUuuVnUnNvn uNNnnnuuuN = new nUuuVnUnNvn(vuVvuunNvVv.uUVuVvuNUvnu);
      private final nUuuVnUnNvn nuUnNvnuUu = new nUuuVnUnNvn(vuVvuunNvVv.uUVuVvuNUvnu);
      private final nUuuVnUnNvn VVuuUN = new nUuuVnUnNvn(vuVvuunNvVv.uUVuVvuNUvnu);
      private final nUuuVnUnNvn vNUvnnVnUvu = new nUuuVnUnNvn(vuVvuunNvVv.uNnUnnuNUnNu);
      private final nUuuVnUnNvn uVUuuVnNVU = new nUuuVnUnNvn(vuVvuunNvVv.uNnUnnuNUnNu);
      private final List<VvVVnnNNNuV.vUvuUvvVvvnN> vuuuNvNuv = new ArrayList<>();
      private final List<VvVVnnNNNuV.vUvuUvvVvvnN> nvUVNnuu = new ArrayList<>();
      private final StringBuilder UuuNnUvUuv = new StringBuilder();
      private List<UnvVVnnVNN.NVnVnNnN> nUUVuvU = List.of();
      private boolean UnUNVVVNuv;
      boolean vNVuvnUUnuUn;
      private boolean UvnvNVnnnnNU;
      private String uVUVnuvnuVuv = "1.21.8";
      private String NVNnnvnuunNv = "";
      private float uVunuUNVVUUV;
      private float UNnVVNvvnVvU;
      private float uNnUnnuNUnNu;
      private float NnUuNNU;
      private float nNvNUVU;
      private float UnUNuUU;
      private float uUVuVvuNUvnu;
      private float UvUvUNuvNU;
      private float c0oOOCcCoC0;
      private float VVnVNnunVvu;
      private float unNNVVNnvvV;
      private float NuunnvnN;
      private float NVUunUNUN;
      private float UUVNuUNUvUnV;
      private float vuvnUnVnUNnV;
      private float nnuUVNUuvvVU;
      private float nVVUuvuNnUN;
      private float nNnVnUNVV;
      private float nuunNvv;
      private float uUVVvVVNvvn;
      private float vvUVNVvvNUv;
      private float UuNnnVnuNNV;
      private float uUVvnUuNvvN;
      private float UUuUnNVNuuv;
      private float NVuNUuVnVUN;
      private int NVuunNnvvvVu;
      private int vNnNuuvVn;
      private int VUuuVUnun = -1;
      private float vVVuuVVv;
      private float VuunNUUUvu;
      private float NNUUNUuVNNVn;
      private float VvVvnNUnvuvV;
      private float ccOO0COcoco0;
      private float NUVvUUVuVNVv;
      private float nNuVunNUVu;
      private float UNvvunVVn;
      private float UnvuVuVnNuvu;
      private float UvNNVUVNVuvV;
      private float NnunUUnU;
      private float nvuVvuNnNUnv;
      private float NnVnNVN;
      int vnvvNvUnVv = -1;

      void UuUVuuUu() {
         this.vNVuvnUUnuUn = false;
         this.UvnvNVnnnnNU = false;
         this.VUuuVUnun = -1;
         this.vNnNuuvVn = 0;
         this.uVunuUNVVUUV = 0.0F;
         this.UuuNnUvUuv.setLength(0);
         this.UuUVuuUu.UuUVuuUu(0.0F);
         this.C00OOC00oO.UuUVuuUu(0.0F);
         this.uUnuvNvvNU.UuUVuuUu(0.0F);
         this.vVvUvVVuuNvV.UuUVuuUu(0.0F);
         this.uNNnnnuuuN.UuUVuuUu(0.0F);
         this.nuUnNvnuUu.UuUVuuUu(0.0F);
         this.VVuuUN.UuUVuuUu(0.0F);
         this.vNUvnnVnUvu.UuUVuuUu(0.0F);
         this.uVUuuVnNVU.UuUVuuUu(0.0F);
         this.UNvvunVVn = 0.0F;
         this.UnvuVuVnNuvu = 0.0F;
         this.nUUVuvU = List.of();
         this.vuuuNvNuv.clear();
         this.nvUVNnuu.clear();
         this.UNnVVNvvnVvU = 0.0F;
      }

      private List<VvVVnnNNNuV.vUvuUvvVvvnN> C00OOC00oO() {
         return this.UvnvNVnnnnNU ? this.nvUVNnuu : this.vuuuNvNuv;
      }

      private void uUnuvNvvNU() {
         this.UnUNVVVNuv = UnvVVnnVNN.UuUVuuUu();
         this.uVUVnuvnuVuv = this.UnUNVVVNuv ? UnvVVnnVNN.VVuuUN() : UnvVVnnVNN.vVvUvVVuuNvV();
         this.vuuuNvNuv.clear();
         if (!this.UnUNVVVNuv) {
            this.NVNnnvnuunNv = this.uVUVnuvnuVuv;
            String var4 = UnvVVnnVNN.C00OOC00oO() ? "Обновить ViaFabricPlus" : NnnVVUvUNNV.C00OOC00oO();
            this.vuuuNvNuv.add(new VvVVnnNNNuV.vUvuUvvVvvnN(var4, NnnVVUvUNNV.vVvUvVVuuNvV(), VvVVnnNNNuV.VUVvVuvuN.INSTALL, null));
            this.UNnVVNvvnVvU = 0.0F;
         } else {
            this.nUUVuvU = UnvVVnnVNN.uNNnnnuuuN();
            UnvVVnnVNN.NVnVnNnN var1 = UnvVVnnVNN.nuUnNvnuUu();
            this.NVNnnvnuunNv = var1 == null ? this.uVUVnuvnuVuv : var1.label();

            for (UnvVVnnVNN.NVnVnNnN var3 : UnvVVnnVNN.UuUVuuUu(this.nUUVuvU, var1, 8)) {
               this.vuuuNvNuv.add(new VvVVnnNNNuV.vUvuUvvVvvnN(var3.label(), var3.autoDetect() ? "auto" : null, VvVVnnNNNuV.VUVvVuvuN.VERSION, var3));
            }

            this.vuuuNvNuv.add(new VvVVnnNNNuV.vUvuUvvVvvnN("Все версии…", String.valueOf(this.nUUVuvU.size()), VvVVnnNNNuV.VUVvVuvuN.MORE, null));
            this.UNnVVNvvnVvU = 0.0F;
         }
      }

      private void vVvUvVVuuNvV() {
         this.nvUVNnuu.clear();
         String var1 = this.UuuNnUvUuv.toString().trim().toLowerCase(Locale.ROOT);

         for (UnvVVnnVNN.NVnVnNnN var3 : this.nUUVuvU) {
            if (var1.isEmpty() || var3.label().toLowerCase(Locale.ROOT).contains(var1)) {
               this.nvUVNnuu.add(new VvVVnnNNNuV.vUvuUvvVvvnN(var3.label(), UuUVuuUu(var3.group()), VvVVnnNNNuV.VUVvVuvuN.VERSION, var3));
            }
         }

         this.vNnNuuvVn = 0;
         this.VVuuUN.UuUVuuUu(0.0F);
      }

      private static String UuUVuuUu(String var0) {
         return switch (var0) {
            case "RELEASE", "RELEASE_INITIAL" -> "Release";
            case "SPECIAL" -> "Special";
            case "CLASSIC" -> "Classic";
            case "ALPHA_INITIAL", "ALPHA_LATER" -> "Alpha";
            case "BETA_INITIAL", "BETA_LATER" -> "Beta";
            default -> "";
         };
      }

      void UuUVuuUu(VvVVnnNNNuV var1, int var2, int var3, float var4, float var5) {
         VuuUvnvnuu var6 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu);
         this.c0oOOCcCoC0 = VvVVnnNNNuV.UuUVuuUu(14.5F, var4);
         this.VVnVNnunVvu = VvVVnnNNNuV.UuUVuuUu(12.0F, var4);
         this.UvUvUNuvNU = 40.0F * var4;
         this.uVunuUNVVUUV -= var5;
         if (this.uVunuUNVVUUV <= 0.0F) {
            this.uVunuUNVVUUV = this.UnUNVVVNuv ? 0.75F : 0.35F;
            this.uUnuvNvvNU();
            if (this.UvnvNVnnnnNU) {
               this.vVvUvVVuuNvV();
            }
         }

         this.unNNVVNnvvV = 20.0F * var4;
         if (this.UNnVVNvvnVvU <= 0.0F && var6 != null) {
            float var7 = this.unNNVVNnvvV * 1.25F;
            float var8 = 0.0F;

            for (VvVVnnNNNuV.vUvuUvvVvvnN var10 : this.vuuuNvNuv) {
               float var11 = var6.UuUVuuUu(var10.label(), this.c0oOOCcCoC0 * 0.5F);
               if (var10.note() != null && !var10.note().isEmpty()) {
                  var11 += var7 + var6.UuUVuuUu(var10.note(), this.VVnVNnunVvu * 0.5F);
               }

               var8 = Math.max(var8, var11);
            }

            this.UNnVVNvvnVvU = var8;
         }

         this.nvuVvuNnNUnv = 11.0F * var4;
         this.NnVnNVN = 4.0F * var4;
         float var15 = var6 == null ? 62.0F * var4 : var6.UuUVuuUu(this.uVUVnuvnuVuv, this.c0oOOCcCoC0 * 0.5F);
         this.UnUNuUU = Math.max(48.0F * var4, this.c0oOOCcCoC0 * 1.1F);
         this.nNvNUVU = Math.max(150.0F * var4, var15 + this.unNNVVNnvvV * 2.0F + this.nvuVvuNnNUnv * 2.0F + this.unNNVVNnvvV * 0.55F);
         this.uUVuVvuNUvnu = this.UnUNuUU * 0.32F;
         this.uNnUnnuNUnNu = var2 - 32.0F * var4 - this.nNvNUVU;
         this.NnUuNNU = var3 - 32.0F * var4 - this.UnUNuUU;
         this.UvNNVUVNVuvV = this.nNvNUVU - this.unNNVVNnvvV - this.nvuVvuNnNUnv;
         this.NnunUUnU = this.UnUNuUU * 0.5F;
         this.nNnVnUNVV = Math.max(34.0F * var4, this.c0oOOCcCoC0 * 1.3F);
         this.nuunNvv = 6.0F * var4;
         this.nVVUuvuNnUN = 8.0F * var4;
         this.nnuUVNUuvvVU = Math.min(18.0F * var4, this.nNnVnUNVV * 0.72F);
         this.UUVNuUNUvUnV = Math.max(this.nNvNUVU, this.UNnVVNvvnVvU + (this.unNNVVNnvvV + this.nuunNvv) * 2.0F);
         this.vuvnUnVnUNnV = this.vuuuNvNuv.size() * this.nNnVnUNVV + this.nVVUuvuNnUN * 2.0F;
         this.NuunnvnN = this.uNnUnnuNUnNu + this.nNvNUVU - this.UUVNuUNUvUnV;
         this.NVUunUNUN = this.NnUuNNU - 12.0F * var4 - this.vuvnUnVnUNnV;
         this.UuNnnVnuNNV = VvVVnnNNNuV.C00OOC00oO(var2 * 0.34F, 340.0F * var4, 520.0F * var4);
         this.NVuNUuVnVUN = 52.0F * var4;
         float var16 = var3 - 32.0F * var4 * 4.0F;
         this.NVuunNnvvvVu = Math.max(
            3, (int)Math.floor((Math.min(var3 * 0.62F, var16) - this.NVuNUuVnVUN - this.nVVUuvuNnUN * 2.0F) / Math.max(1.0F, this.nNnVnUNVV))
         );
         this.NVuunNnvvvVu = Math.min(this.NVuunNnvvvVu, Math.max(3, this.nvUVNnuu.size()));
         this.uUVvnUuNvvN = this.NVuNUuVnVUN + this.NVuunNnvvvVu * this.nNnVnUNVV + this.nVVUuvuNnUN * 2.0F;
         this.uUVVvVVNvvn = var2 * 0.5F - this.UuNnnVnuNNV * 0.5F;
         this.vvUVNVvvNUv = var3 * 0.5F - this.uUVvnUuNvvN * 0.5F;
         this.UUuUnNVNuuv = Math.min(24.0F * var4, this.uUVvnUuNvvN * 0.2F);
         int var17 = Math.max(0, this.C00OOC00oO().size() - this.uNNnnnuuuN());
         this.vNnNuuvVn = Math.max(0, Math.min(var17, this.vNnNuuvVn));
         float var18 = var1.VNvuVnvnun;
         float var19 = var1.unVVnuunNU;
         boolean var12 = this.UuUVuuUu(var18, var19);
         this.VUuuVUnun = this.vNVuvnUUnuUn ? this.uUnuvNvvNU(var18, var19) : -1;
         this.VvVvnNUnvuvV = this.uUnuvNvvNU.UuUVuuUu(!var12 && !this.vNVuvnUUnuUn ? 0.0F : 1.0F, var5);
         this.ccOO0COcoco0 = this.vVvUvVVuuNvV.UuUVuuUu(var12 ? 1.0F : (this.vNVuvnUUnuUn ? 0.55F : 0.0F), var5);
         this.VuunNUUUvu = this.UuUVuuUu.UuUVuuUu(this.vNVuvnUUnuUn && !this.UvnvNVnnnnNU ? 1.0F : 0.0F, var5);
         this.NNUUNUuVNNVn = this.C00OOC00oO.UuUVuuUu(this.UvnvNVnnnnNU ? 1.0F : 0.0F, var5);
         this.NUVvUUVuVNVv = this.uNNnnnuuuN.UuUVuuUu(this.VUuuVUnun >= 0 ? 1.0F : 0.0F, var5);
         this.vVVuuVVv = this.VVuuUN.UuUVuuUu(this.vNnNuuvVn * this.nNnVnUNVV, var5);
         float var13 = this.UvnvNVnnnnNU ? this.vvUVNVvvNUv + this.NVuNUuVnVUN + this.nVVUuvuNnUN : this.NVUunUNUN + this.nVVUuvuNnUN;
         float var14 = this.VUuuVUnun >= 0 ? var13 + (this.VUuuVUnun * this.nNnVnUNVV - this.vVVuuVVv) : this.nNuVunNUVu;
         this.nNuVunNUVu = this.nuUnNvnuUu.UuUVuuUu(var14, var5);
         this.UNvvunVVn = this.vNUvnnVnUvu
            .UuUVuuUu(
               VvVVnnNNNuV.C00OOC00oO((var1.vnVuunuNN.UuUVuuUu() - (this.uNnUnnuNUnNu + this.nNvNUVU * 0.5F)) / Math.max(1.0F, this.nNvNUVU), -3.2F, 3.2F),
               var5
            );
         this.UnvuVuVnNuvu = this.uVUuuVnNVU
            .UuUVuuUu(
               VvVVnnNNNuV.C00OOC00oO((var1.UvUNuNvvNVNv.UuUVuuUu() - (this.NnUuNNU + this.UnUNuUU * 0.5F)) / Math.max(1.0F, this.UnUNuUU), -3.2F, 3.2F), var5
            );
      }

      private int uNNnnnuuuN() {
         return this.UvnvNVnnnnNU ? this.NVuunNnvvvVu : this.vuuuNvNuv.size();
      }

      private boolean UuUVuuUu(float var1, float var2) {
         return this.nNvNUVU > 0.0F && VvVVnnNNNuV.UuUVuuUu(var1, var2, this.uNnUnnuNUnNu, this.NnUuNNU, this.nNvNUVU, this.UnUNuUU, this.uUVuVvuNUvnu) <= 0.0F;
      }

      private boolean C00OOC00oO(float var1, float var2) {
         if (!this.vNVuvnUUnuUn) {
            return false;
         } else {
            return this.UvnvNVnnnnNU
               ? VvVVnnNNNuV.UuUVuuUu(var1, var2, this.uUVVvVVNvvn, this.vvUVNVvvNUv, this.UuNnnVnuNNV, this.uUVvnUuNvvN, this.UUuUnNVNuuv) <= 0.0F
               : this.UUVNuUNUvUnV > 0.0F
                  && this.vuvnUnVnUNnV > 0.0F
                  && VvVVnnNNNuV.UuUVuuUu(var1, var2, this.NuunnvnN, this.NVUunUNUN, this.UUVNuUNUvUnV, this.vuvnUnVnUNnV, this.nnuUVNUuvvVU) <= 0.0F;
         }
      }

      private int uUnuvNvvNU(float var1, float var2) {
         if (!this.C00OOC00oO(var1, var2)) {
            return -1;
         } else {
            float var3 = this.UvnvNVnnnnNU ? this.vvUVNVvvNUv + this.NVuNUuVnVUN + this.nVVUuvuNnUN : this.NVUunUNUN + this.nVVUuvuNnUN;
            float var4 = (this.UvnvNVnnnnNU ? this.vvUVNVvvNUv + this.uUVvnUuNvvN : this.NVUunUNUN + this.vuvnUnVnUNnV) - this.nVVUuvuNnUN;
            if (!(var2 < var3) && !(var2 >= var4)) {
               float var5 = var2 - var3 + this.vVVuuVVv;
               int var6 = (int)Math.floor(var5 / Math.max(1.0F, this.nNnVnUNVV));
               var6 = Math.min(var6, this.vNnNuuvVn + Math.max(1, this.uNNnnnuuuN()) - 1);
               return var6 >= 0 && var6 < this.C00OOC00oO().size() ? var6 : -1;
            } else {
               return -1;
            }
         }
      }

      private void nuUnNvnuUu() {
         this.vNVuvnUUnuUn = false;
         this.UvnvNVnnnnNU = false;
         this.VUuuVUnun = -1;
         this.UuuNnUvUuv.setLength(0);
      }

      private boolean UuUVuuUu(VvVVnnNNNuV.vUvuUvvVvvnN var1) {
         switch (var1.kind()) {
            case VERSION:
               if (UnvVVnnVNN.UuUVuuUu(var1.version())) {
                  this.NVNnnvnuunNv = var1.label();
                  this.uVUVnuvnuVuv = var1.label();
               }

               this.nuUnNvnuUu();
               this.uVunuUNVVUUV = 0.0F;
               break;
            case MORE:
               this.UvnvNVnnnnNU = true;
               this.vVvUvVVuuNvV();
               break;
            case INSTALL:
               if (UnvVVnnVNN.C00OOC00oO()) {
                  NnnVVUvUNNV.nuUnNvnuUu();
               } else {
                  NnnVVUvUNNV.uNNnnnuuuN();
               }

               this.uVunuUNVVUUV = 0.0F;
         }

         return true;
      }

      boolean vVvUvVVuuNvV(float var1, float var2) {
         if (this.vNVuvnUUnuUn) {
            int var3 = this.uUnuvNvvNU(var1, var2);
            if (var3 >= 0) {
               return this.UuUVuuUu(this.C00OOC00oO().get(var3));
            } else if (this.C00OOC00oO(var1, var2)) {
               return true;
            } else if (this.UvnvNVnnnnNU) {
               this.UvnvNVnnnnNU = false;
               return true;
            } else {
               this.nuUnNvnuUu();
               return true;
            }
         } else if (this.UuUVuuUu(var1, var2)) {
            this.vNVuvnUUnuUn = true;
            this.UvnvNVnnnnNU = false;
            this.uUnuvNvvNU();
            this.vNnNuuvVn = 0;
            this.VVuuUN.UuUVuuUu(0.0F);
            return true;
         } else {
            return false;
         }
      }

      boolean UuUVuuUu(float var1, float var2, double var3) {
         if (!this.vNVuvnUUnuUn) {
            return false;
         } else if (!this.C00OOC00oO(var1, var2)) {
            return true;
         } else {
            int var5 = Math.max(0, this.C00OOC00oO().size() - Math.max(1, this.uNNnnnuuuN()));
            this.vNnNuuvVn = Math.max(0, Math.min(var5, this.vNnNuuvVn + (var3 > 0.0 ? -1 : 1)));
            return true;
         }
      }

      boolean UuUVuuUu(int var1) {
         if (!this.vNVuvnUUnuUn) {
            return false;
         } else if (var1 == 256) {
            if (this.UvnvNVnnnnNU) {
               this.UvnvNVnnnnNU = false;
            } else {
               this.nuUnNvnuUu();
            }

            return true;
         } else if (this.UvnvNVnnnnNU && var1 == 259) {
            if (this.UuuNnUvUuv.length() > 0) {
               this.UuuNnUvUuv.setLength(this.UuuNnUvUuv.length() - 1);
               this.vVvUvVVuuNvV();
            }

            return true;
         } else {
            return false;
         }
      }

      boolean UuUVuuUu(char var1) {
         if (this.vNVuvnUUnuUn && this.UvnvNVnnnnNU && var1 >= ' ') {
            if (this.UuuNnUvUuv.length() < 24) {
               this.UuuNnUvUuv.append(var1);
               this.vVvUvVVuuNvV();
            }

            return true;
         } else {
            return false;
         }
      }

      int UuUVuuUu(VvVVnnNNNuV.VUuUUNnnuvuv var1, int var2, float var3, float var4, float var5) {
         VvVVnnNNNuV.nUNvUnnVN var6 = var1.uUnuvNvvNU(var2++);
         var6.UuUVuuUu(
            this.uNnUnnuNUnNu,
            this.NnUuNNU,
            this.nNvNUVU,
            this.UnUNuUU,
            this.uUVuVvuNUvnu,
            this.UvUvUNuvNU,
            var3,
            this.VvVvnNUnvuvV,
            this.ccOO0COcoco0,
            1.0F,
            1.0F
         );
         var6.UuUVuuUu(this.UNvvunVVn * this.nNvNUVU, this.UnvuVuVnNuvu * this.UnUNuUU);
         var6.UuUVuuUu(this.UvNNVUVNVuvV, this.NnunUUnU, this.nvuVvuNnNUnv, this.NnVnNVN, this.VuunNUUUvu, 0.55F + 0.45F * this.VvVvnNUnvuvV);
         var6.C00OOC00oO(0.42F * (1.0F - this.VuunNUUUvu * 0.55F));
         return var2;
      }

      int UuUVuuUu(VvVVnnNNNuV.VUuUUNnnuvuv var1, float var2, float var3, float var4) {
         int var5 = 0;
         float var6 = Math.max(this.VuunNUUUvu * 0.46F, this.NNUUNUuVNNVn * 1.0F);
         float var7 = VvVVnnNNNuV.C00OOC00oO(Math.max(this.VuunNUUUvu, this.NNUUNUuVNNVn) * 1.45F, 0.0F, 1.0F);
         if (var6 > 0.004F) {
            VvVVnnNNNuV.nUNvUnnVN var8 = var1.nuUnNvnuUu(var5++);
            var8.UuUVuuUu(-4.0F, -4.0F, var3 + 8.0F, var4 + 8.0F, 0.0F, 0.0F, var2, 0.0F, var6, 1.0F, 1.0F);
            var8.UuUVuuUu(var7);
         }

         if (this.VuunNUUUvu > 0.004F) {
            VvVVnnNNNuV.nUNvUnnVN var9 = var1.nuUnNvnuUu(var5++);
            var9.UuUVuuUu(
               this.NuunnvnN,
               this.NVUunUNUN,
               this.UUVNuUNUvUnV,
               this.vuvnUnVnUNnV,
               this.nnuUVNUuvvVU,
               this.UvUvUNuvNU,
               var2,
               this.VvVvnNUnvuvV,
               0.0F,
               this.VuunNUUUvu,
               -1.0F
            );
            var9.UuUVuuUu(this.UNvvunVVn * this.UUVNuUNUvUnV, -this.vuvnUnVnUNnV * 2.4F);
            var9.uUnuvNvvNU(this.VuunNUUUvu);
            var9.C00OOC00oO(this.VuunNUUUvu);
            if (!this.UvnvNVnnnnNU && (this.VUuuVUnun >= 0 || this.NUVvUUVuVNVv > 0.004F)) {
               var9.C00OOC00oO(
                  this.nuunNvv,
                  this.nNuVunNUVu - this.NVUunUNUN,
                  this.UUVNuUNUvUnV - this.nuunNvv * 2.0F,
                  this.nNnVnUNVV,
                  this.nNnVnUNVV * 0.32F,
                  this.NUVvUUVuVNVv
               );
            }
         }

         if (this.NNUUNUuVNNVn > 0.004F) {
            VvVVnnNNNuV.nUNvUnnVN var10 = var1.nuUnNvnuUu(var5++);
            var10.UuUVuuUu(
               this.uUVVvVVNvvn,
               this.vvUVNVvvNUv,
               this.UuNnnVnuNNV,
               this.uUVvnUuNvvN,
               this.UUuUnNVNuuv,
               this.UvUvUNuvNU,
               var2 * this.NNUUNUuVNNVn,
               1.0F,
               0.0F,
               1.0F,
               1.0F
            );
            var10.UuUVuuUu(0.0F, -this.uUVvnUuNvvN * 2.4F);
            var10.uUnuvNvvNU(this.NNUUNUuVNNVn);
            var10.C00OOC00oO(this.NNUUNUuVNNVn);
            if (this.UvnvNVnnnnNU && (this.VUuuVUnun >= 0 || this.NUVvUUVuVNVv > 0.004F)) {
               var10.C00OOC00oO(
                  this.nuunNvv,
                  this.nNuVunNUVu - this.vvUVNVvvNUv,
                  this.UuNnnVnuNNV - this.nuunNvv * 2.0F,
                  this.nNnVnUNVV,
                  this.nNnVnUNVV * 0.32F,
                  this.NUVvUUVuVNVv
               );
            }
         }

         return var5;
      }

      void UuUVuuUu(UnVNvNnU var1, float var2, boolean var3) {
         if (!(var2 <= 0.004F)) {
            int var4 = var3 ? VvVVnnNNNuV.UuUVuuUu(0.16F, 0.15F, 0.2F, 1.0F) : VvVVnnNNNuV.UuUVuuUu(0.86F, 0.88F, 0.96F, 1.0F);
            int var5 = var3 ? VvVVnnNNNuV.UuUVuuUu(0.06F, 0.05F, 0.09F, 1.0F) : VvVVnnNNNuV.UuUVuuUu(1.0F, 1.0F, 1.0F, 1.0F);
            float var6 = this.NnUuNNU + this.UnUNuUU * 0.5F + this.c0oOOCcCoC0 * 0.17F;
            float var7 = this.UvNNVUVNVuvV - this.nvuVvuNnNUnv * 0.8F;
            var1.UuUVuuUu(
               vNvnnVvvVUu.UuUVuuUu,
               Math.round(this.uNnUnnuNUnNu + (this.unNNVVNnvvV + var7) * 0.5F),
               Math.round(var6),
               this.c0oOOCcCoC0,
               this.uVUVnuvnuVuv,
               VvVVnnNNNuV.UuUVuuUu(this.VvVvnNUnvuvV > 0.35F ? var5 : var4, var2),
               "c"
            );
         }
      }

      void C00OOC00oO(UnVNvNnU var1, float var2, boolean var3) {
         if (!(var2 <= 0.004F)) {
            int var4 = var3 ? VvVVnnNNNuV.UuUVuuUu(0.16F, 0.15F, 0.2F, 1.0F) : VvVVnnNNNuV.UuUVuuUu(0.86F, 0.88F, 0.96F, 1.0F);
            int var5 = var3 ? VvVVnnNNNuV.UuUVuuUu(0.06F, 0.05F, 0.09F, 1.0F) : VvVVnnNNNuV.UuUVuuUu(1.0F, 1.0F, 1.0F, 1.0F);
            int var6 = var3 ? VvVVnnNNNuV.UuUVuuUu(0.42F, 0.41F, 0.46F, 1.0F) : VvVVnnNNNuV.UuUVuuUu(0.58F, 0.6F, 0.7F, 1.0F);
            if (this.VuunNUUUvu > 0.004F && !this.UvnvNVnnnnNU) {
               this.UuUVuuUu(
                  var1,
                  var2 * this.VuunNUUUvu,
                  this.NuunnvnN,
                  this.NVUunUNUN + this.nVVUuvuNnUN,
                  this.NVUunUNUN + this.vuvnUnVnUNnV - this.nVVUuvuNnUN,
                  this.UUVNuUNUvUnV,
                  this.vuuuNvNuv,
                  var4,
                  var5,
                  var6,
                  var3,
                  this.NVUunUNUN + this.vuvnUnVnUNnV - this.vuvnUnVnUNnV * this.VuunNUUUvu
               );
            }

            if (this.NNUUNUuVNNVn > 0.004F) {
               float var7 = var2 * this.NNUUNUuVNNVn;
               float var8 = this.vvUVNVvvNUv + this.NVuNUuVnVUN * 0.58F + this.c0oOOCcCoC0 * 0.17F;
               var1.UuUVuuUu(
                  vNvnnVvvVUu.UuUVuuUu,
                  Math.round(this.uUVVvVVNvvn + this.unNNVVNnvvV),
                  Math.round(var8),
                  this.c0oOOCcCoC0,
                  "Версия протокола",
                  VvVVnnNNNuV.UuUVuuUu(var5, var7),
                  "l"
               );
               String var9 = this.UuuNnUvUuv.length() == 0 ? "начните печатать для поиска" : this.UuuNnUvUuv.toString();
               var1.UuUVuuUu(
                  vNvnnVvvVUu.UuUVuuUu,
                  Math.round(this.uUVVvVVNvvn + this.UuNnnVnuNNV - this.unNNVVNnvvV),
                  Math.round(var8),
                  this.VVnVNnunVvu,
                  var9,
                  VvVVnnNNNuV.UuUVuuUu(this.UuuNnUvUuv.length() == 0 ? var6 : var5, var7),
                  "r"
               );
               this.UuUVuuUu(
                  var1,
                  var7,
                  this.uUVVvVVNvvn,
                  this.vvUVNVvvNUv + this.NVuNUuVnVUN + this.nVVUuvuNnUN,
                  this.vvUVNVvvNUv + this.uUVvnUuNvvN - this.nVVUuvuNnUN,
                  this.UuNnnVnuNNV,
                  this.nvUVNnuu,
                  var4,
                  var5,
                  var6,
                  var3,
                  this.vvUVNVvvNUv
               );
            }
         }
      }

      private void UuUVuuUu(
         UnVNvNnU var1,
         float var2,
         float var3,
         float var4,
         float var5,
         float var6,
         List<VvVVnnNNNuV.vUvuUvvVvvnN> var7,
         int var8,
         int var9,
         int var10,
         boolean var11,
         float var12
      ) {
         int var13 = this.vnvvNvUnVv;

         for (int var14 = 0; var14 < var7.size(); var14++) {
            float var15 = var4 + var14 * this.nNnVnUNVV - this.vVVuuVVv;
            float var16 = var15 + this.nNnVnUNVV * 0.5F;
            if (!(var16 < var4 - this.nNnVnUNVV) && !(var16 > var5 + this.nNnVnUNVV)) {
               float var17 = VvVVnnNNNuV.C00OOC00oO(Math.min(var16 - var4, var5 - var16) / Math.max(1.0F, this.nNnVnUNVV * 0.5F), 0.0F, 1.0F);
               float var18 = VvVVnnNNNuV.C00OOC00oO((var16 - var12) / Math.max(1.0F, this.nNnVnUNVV * 0.8F), 0.0F, 1.0F);
               float var19 = var2 * VvVVnnNNNuV.vuuuNvNuv(var17) * var18;
               if (!(var19 <= 0.004F)) {
                  VvVVnnNNNuV.vUvuUvvVvvnN var20 = (VvVVnnNNNuV.vUvuUvvVvvnN)var7.get(var14);
                  boolean var21 = var20.kind() == VvVVnnNNNuV.VUVvVuvuN.VERSION && var20.label().equals(this.NVNnnvnuunNv);
                  boolean var22 = var14 == this.VUuuVUnun;

                  int var23 = switch (var20.kind()) {
                     case VERSION -> var21 ? var13 : (var22 ? var9 : var8);
                     case MORE, INSTALL -> var22 ? var9 : var8;
                  };
                  float var24 = !var22 && !var21 ? 0.86F : 1.0F;
                  var1.UuUVuuUu(
                     vNvnnVvvVUu.UuUVuuUu,
                     Math.round(var3 + this.nuunNvv + this.unNNVVNnvvV * 0.75F),
                     Math.round(var16 + this.c0oOOCcCoC0 * 0.17F),
                     this.c0oOOCcCoC0,
                     var20.label(),
                     VvVVnnNNNuV.UuUVuuUu(var23, var19 * var24),
                     "l"
                  );
                  if (var20.note() != null && !var20.note().isEmpty() && !"Release".equals(var20.note())) {
                     var1.UuUVuuUu(
                        vNvnnVvvVUu.UuUVuuUu,
                        Math.round(var3 + var6 - this.nuunNvv - this.unNNVVNnvvV * 0.75F),
                        Math.round(var16 + this.VVnVNnunVvu * 0.17F),
                        this.VVnVNnunVvu,
                        var20.note(),
                        VvVVnnNNNuV.UuUVuuUu(var10, var19 * 0.9F),
                        "r"
                     );
                  }
               }
            }
         }
      }
   }

   public static final class nUNvUnnVN {
      private float UuUVuuUu;
      private float C00OOC00oO;
      private float uUnuvNvvNU;
      private float vVvUvVVuuNvV;
      private float uNNnnnuuuN;
      private float nuUnNvnuUu;
      private float VVuuUN;
      private float vNUvnnVnUvu;
      private float uVUuuVnNVU;
      private float vuuuNvNuv = 1.0F;
      private float nvUVNnuu = 1.0F;
      private float UuuNnUvUuv;
      private float nUUVuvU;
      private float UnUNVVVNuv;
      private float vNVuvnUUnuUn;
      private float UvnvNVnnnnNU;
      private float uVUVnuvnuVuv;
      private float NVNnnvnuunNv;
      private float uVunuUNVVUUV;
      private float UNnVVNvvnVvU;
      private float uNnUnnuNUnNu;
      private float NnUuNNU;
      private float nNvNUVU;
      private float UnUNuUU = 1.0F;
      private float uUVuVvuNUvnu;
      private float UvUvUNuvNU;
      private float c0oOOCcCoC0;
      private float VVnVNnunVvu = 1.0F;

      public void UuUVuuUu(float var1) {
         this.UvUvUNuvNU = var1;
      }

      public void C00OOC00oO(float var1) {
         this.VVnVNnunVvu = var1;
      }

      public float UuUVuuUu() {
         return this.VVnVNnunVvu;
      }

      public void uUnuvNvvNU(float var1) {
         this.c0oOOCcCoC0 = var1;
      }

      public float C00OOC00oO() {
         return this.c0oOOCcCoC0;
      }

      public float uUnuvNvvNU() {
         return this.UvUvUNuvNU;
      }

      public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6) {
         this.UNnVVNvvnVvU = var1;
         this.uNnUnnuNUnNu = var2;
         this.NnUuNNU = var3;
         this.nNvNUVU = var4;
         this.UnUNuUU = var5;
         this.uUVuVvuNUvnu = var6;
      }

      public float vVvUvVVuuNvV() {
         return this.UNnVVNvvnVvU;
      }

      public float uNNnnnuuuN() {
         return this.uNnUnnuNUnNu;
      }

      public float nuUnNvnuUu() {
         return this.NnUuNNU;
      }

      public float VVuuUN() {
         return this.nNvNUVU;
      }

      public float vNUvnnVnUvu() {
         return this.UnUNuUU;
      }

      public float uVUuuVnNVU() {
         return this.uUVuVvuNUvnu;
      }

      public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
         this.nuUnNvnuUu = var6;
         this.VVuuUN = var7;
         this.vNUvnnVnUvu = var8;
         this.uVUuuVnNVU = var9;
         this.vuuuNvNuv = var10;
         this.nvUVNnuu = var11;
         this.UuuNnUvUuv = 0.0F;
         this.nUUVuvU = 0.0F;
         this.UnUNVVVNuv = 0.0F;
         this.vNVuvnUUnuUn = 0.0F;
         this.UvnvNVnnnnNU = 0.0F;
         this.uVUVnuvnuVuv = 0.0F;
         this.NVNnnvnuunNv = 0.0F;
         this.uVunuUNVVUUV = 0.0F;
         this.UNnVVNvvnVvU = 0.0F;
         this.uNnUnnuNUnNu = 0.0F;
         this.NnUuNNU = 0.0F;
         this.nNvNUVU = 0.0F;
         this.UnUNuUU = 1.0F;
         this.uUVuVvuNUvnu = 0.0F;
         this.UvUvUNuvNU = 0.0F;
         this.c0oOOCcCoC0 = 0.0F;
         this.VVnVNnunVvu = 1.0F;
      }

      public void UuUVuuUu(float var1, float var2) {
         this.UuuNnUvUuv = var1;
         this.nUUVuvU = var2;
      }

      public void C00OOC00oO(float var1, float var2, float var3, float var4, float var5, float var6) {
         this.UnUNVVVNuv = var1;
         this.vNVuvnUUnuUn = var2;
         this.UvnvNVnnnnNU = var3;
         this.uVUVnuvnuVuv = var4;
         this.NVNnnvnuunNv = var5;
         this.uVunuUNVVUUV = var6;
      }

      public float vuuuNvNuv() {
         return this.UuUVuuUu;
      }

      public float nvUVNnuu() {
         return this.C00OOC00oO;
      }

      public float UuuNnUvUuv() {
         return this.uUnuvNvvNU;
      }

      public float nUUVuvU() {
         return this.vVvUvVVuuNvV;
      }

      public float UnUNVVVNuv() {
         return this.uNNnnnuuuN;
      }

      public float vNVuvnUUnuUn() {
         return this.nuUnNvnuUu;
      }

      public float UvnvNVnnnnNU() {
         return this.VVuuUN;
      }

      public float uVUVnuvnuVuv() {
         return this.vNUvnnVnUvu;
      }

      public float NVNnnvnuunNv() {
         return this.uVUuuVnNVU;
      }

      public float uVunuUNVVUUV() {
         return this.vuuuNvNuv;
      }

      public float UNnVVNvvnVvU() {
         return this.nvUVNnuu;
      }

      public float uNnUnnuNUnNu() {
         return this.UuuNnUvUuv;
      }

      public float NnUuNNU() {
         return this.nUUVuvU;
      }

      public float nNvNUVU() {
         return this.UnUNVVVNuv;
      }

      public float UnUNuUU() {
         return this.vNVuvnUUnuUn;
      }

      public float uUVuVvuNUvnu() {
         return this.UvnvNVnnnnNU;
      }

      public float UvUvUNuvNU() {
         return this.uVUVnuvnuVuv;
      }

      public float c0oOOCcCoC0() {
         return this.NVNnnvnuunNv;
      }

      public float VVnVNnunVvu() {
         return this.uVunuUNVVUUV;
      }
   }

   static final class nUVVnVNu {
      private final nUuuVnUnNvn UuUVuuUu = new nUuuVnUnNvn(vuVvuunNvVv.nUUVuvU);
      private final nUuuVnUnNvn C00OOC00oO = new nUuuVnUnNvn(vuVvuunNvVv.vNVuvnUUnuUn);
      final nUuuVnUnNvn uUnuvNvvNU = new nUuuVnUnNvn(vuVvuunNvVv.nvUVNnuu);
      private final nUuuVnUnNvn vVvUvVVuuNvV = new nUuuVnUnNvn(vuVvuunNvVv.vNVuvnUUnuUn);
      private final nUuuVnUnNvn uNNnnnuuuN = new nUuuVnUnNvn(vuVvuunNvVv.UuuNnUvUuv);
      private final nUuuVnUnNvn nuUnNvnuUu = new nUuuVnUnNvn(vuVvuunNvVv.UuuNnUvUuv);
      private final nUuuVnUnNvn VVuuUN = new nUuuVnUnNvn(vuVvuunNvVv.UvUvUNuvNU);
      private final float[] vNUvnnVnUvu;
      private final float[] uVUuuVnNVU;
      private final float[] vuuuNvNuv;
      private float nvUVNnuu;
      float UuuNnUvUuv;
      float nUUVuvU;
      float UnUNVVVNuv;
      float vNVuvnUUnuUn;
      float UvnvNVnnnnNU;
      float uVUVnuvnuVuv;
      int NVNnnvnuunNv;
      boolean uVunuUNVVUUV;
      private boolean UNnVVNvvnVvU;
      private int uNnUnnuNUnNu;
      private float NnUuNNU;
      private float nNvNUVU;
      private float UnUNuUU;
      private float uUVuVvuNUvnu;
      private float UvUvUNuvNU;
      private float c0oOOCcCoC0;
      private float VVnVNnunVvu;
      private float unNNVVNnvvV;
      private float NuunnvnN;
      private float NVUunUNUN;
      private float UUVNuUNUvUnV;

      nUVVnVNu() {
         this.vNUvnnVnUvu = new float[VvVVnnNNNuV.NVNnnvnuunNv];
         this.uVUuuVnNVU = new float[VvVVnnNNNuV.NVNnnvnuunNv];
         this.vuuuNvNuv = new float[VvVVnnNNNuV.NVNnnvnuunNv];
         this.uNnUnnuNUnNu = -1;
      }

      void UuUVuuUu(int var1) {
         this.uVunuUNVVUUV = false;
         this.UNnVVNvvnVvU = false;
         this.uNnUnnuNUnNu = -1;
         this.UuUVuuUu.UuUVuuUu(var1);
         this.VVuuUN.UuUVuuUu(0.0F);
         this.nvUVNnuu = 0.0F;
         this.UuuNnUvUuv = 0.0F;
         this.NVNnnvnuunNv = var1;
         this.C00OOC00oO.UuUVuuUu(0.0F);
         this.uUnuvNvvNU.UuUVuuUu(0.0F);
         this.vVvUvVVuuNvV.UuUVuuUu(0.0F);
         this.uNNnnnuuuN.UuUVuuUu(0.5F);
         this.nuUnNvnuUu.UuUVuuUu(0.5F);
      }

      void UuUVuuUu(VvVVnnNNNuV var1, int var2, int var3, float var4, float var5) {
         VuuUvnvnuu var6 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu);
         this.VVnVNnunVvu = VvVVnnNNNuV.UuUVuuUu(14.5F, var4);
         this.c0oOOCcCoC0 = 4.0F * var4;
         this.UUVNuUNUvUnV = 40.0F * var4;
         float var7 = 22.0F * var4;
         float var8 = 0.0F;

         for (int var9 = 0; var9 < VvVVnnNNNuV.NVNnnvnuunNv; var9++) {
            this.vuuuNvNuv[var9] = var6 == null ? 56.0F * var4 : var6.UuUVuuUu(VvVVnnNNNuV.uVunuUNVVUUV[var9], this.VVnVNnunVvu * 0.5F);
            var8 = Math.max(var8, this.vuuuNvNuv[var9]);
         }

         float var18 = var8 + var7 * 2.0F;
         float var10 = this.c0oOOCcCoC0 * 2.0F;

         for (int var11 = 0; var11 < VvVVnnNNNuV.NVNnnvnuunNv; var11++) {
            this.uVUuuVnNVU[var11] = var18;
            var10 += var18;
         }

         this.uUVuVvuNUvnu = Math.max(48.0F * var4, this.VVnVNnunVvu * 1.1F);
         this.UnUNuUU = var10;
         this.UvUvUNuvNU = this.uUVuVvuNUvnu * 0.32F;
         this.NnUuNNU = 32.0F * var4;
         this.nNvNUVU = var3 - this.uUVuVvuNUvnu - 32.0F * var4;
         float var19 = this.NnUuNNU + this.c0oOOCcCoC0;

         for (int var12 = 0; var12 < VvVVnnNNNuV.NVNnnvnuunNv; var12++) {
            this.vNUvnnVnUvu[var12] = var19 + this.uVUuuVnNVU[var12] * 0.5F;
            var19 += this.uVUuuVnNVU[var12];
         }

         float var20 = var1.VNvuVnvnun;
         float var13 = var1.unVVnuunNU;
         this.UNnVVNvvnVvU = this.UuUVuuUu(var20, var13) && !var1.unUVnu.vNVuvnUUnuUn;
         int var14 = this.uNnUnnuNUnNu;
         this.uNnUnnuNUnNu = this.UNnVVNvvnVvU ? this.UuUVuuUu(var20) : -1;
         if (this.uNnUnnuNUnNu == var14 && this.uNnUnnuNUnNu >= 0) {
            this.nvUVNnuu += var5;
         } else {
            this.nvUVNnuu = 0.0F;
         }

         this.UuuNnUvUuv = this.VVuuUN.UuUVuuUu(this.uNnUnnuNUnNu >= 0 && this.nvUVNnuu >= 0.34F ? 1.0F : 0.0F, var5);
         this.UvnvNVnnnnNU = 40.0F * var4;
         this.uVUVnuvnuVuv = VvVVnnNNNuV.UuUVuuUu(13.0F, var4);
         this.NVNnnvnuunNv = VvVVnnNNNuV.vVvUvVVuuNvV(this.uNnUnnuNUnNu >= 0 ? this.uNnUnnuNUnNu : this.NVNnnvnuunNv);
         float var15 = var6 == null ? 220.0F * var4 : var6.UuUVuuUu(VvVVnnNNNuV.uuVuUuuVVNvN[this.NVNnnvnuunNv], this.uVUVnuvnuVuv * 0.5F);
         this.vNVuvnUUnuUn = var15 + 36.0F * var4;
         float var16 = 32.0F * var4 * 0.5F;
         this.nUUVuvU = VvVVnnNNNuV.C00OOC00oO(
            this.vNUvnnVnUvu[this.NVNnnvnuunNv] - this.vNVuvnUUnuUn * 0.5F, var16, Math.max(var16, var2 - this.vNVuvnUUnuUn - var16)
         );
         this.UnUNVVVNuv = this.nNvNUVU - 14.0F * var4 - this.UvnvNVnnnnNU;
         int var17 = var1.nuUnNvnuUu();
         this.unNNVVNnvvV = this.C00OOC00oO.UuUVuuUu(this.UNnVVNvvnVvU ? 1.0F : 0.0F, var5);
         this.uUnuvNvvNU.UuUVuuUu(0.0F, var5);
         this.NuunnvnN = this.UuUVuuUu.UuUVuuUu(var17, var5);
         this.NVUunUNUN = this.vVvUvVVuuNvV.UuUVuuUu(!this.UNnVVNvvnVvU && !this.uVunuUNVVUUV ? 0.0F : 1.0F, var5);
         this.uNNnnnuuuN.UuUVuuUu(VvVVnnNNNuV.C00OOC00oO((var1.vnVuunuNN.UuUVuuUu() - this.NnUuNNU) / Math.max(1.0F, this.UnUNuUU), 0.0F, 1.0F), var5);
         this.nuUnNvnuUu.UuUVuuUu(VvVVnnNNNuV.C00OOC00oO((var1.UvUNuNvvNVNv.UuUVuuUu() - this.nNvNUVU) / Math.max(1.0F, this.uUVuVvuNUvnu), 0.0F, 1.0F), var5);
      }

      void UuUVuuUu(VvVVnnNNNuV.VvunVVUvUNnv var1, float var2) {
         var1.UuUVuuUu = this.NnUuNNU;
         var1.C00OOC00oO = this.nNvNUVU;
         var1.uUnuvNvvNU = this.UnUNuUU;
         var1.vVvUvVVuuNvV = this.uUVuVvuNUvnu;
         var1.uNNnnnuuuN = this.UvUvUNuvNU;
         var1.nuUnNvnuUu = this.unNNVVNnvvV;
         var1.VVuuUN = this.uUnuvNvvNU.UuUVuuUu();
         var1.vNUvnnVnUvu = var2;
         var1.uVUuuVnNVU = this.uNNnnnuuuN.UuUVuuUu();
         var1.vuuuNvNuv = this.nuUnNvnuUu.UuUVuuUu();
         var1.NVNnnvnuunNv = this.UUVNuUNUvUnV;
         float var3 = VvVVnnNNNuV.C00OOC00oO(this.NuunnvnN, -0.35F, VvVVnnNNNuV.NVNnnvnuunNv - 1 + 0.35F);
         int var4 = Math.max(0, Math.min(VvVVnnNNNuV.NVNnnvnuunNv - 2, (int)Math.floor(var3)));
         float var5 = var3 - var4;
         float var6 = this.vNUvnnVnUvu[var4] + (this.vNUvnnVnUvu[var4 + 1] - this.vNUvnnVnUvu[var4]) * var5;
         float var7 = this.uVUuuVnNVU[var4] + (this.uVUuuVnNVU[var4 + 1] - this.uVUuuVnNVU[var4]) * VvVVnnNNNuV.C00OOC00oO(var5, 0.0F, 1.0F);
         float var8 = (float)Math.tanh(this.UuUVuuUu.C00OOC00oO() / 9.0F);
         float var9 = 1.0F + 0.2F * Math.abs(var8);
         float var10 = 1.0F / (1.0F + (var9 - 1.0F) * 0.65F);
         float var11 = this.uUVuVvuNUvnu - this.c0oOOCcCoC0 * 2.0F;
         var1.nUUVuvU = var7 * var9 - this.c0oOOCcCoC0 * 0.5F;
         var1.UnUNVVVNuv = var11 * var10;
         var1.uVUVnuvnuVuv = var1.UnUNVVVNuv * 0.32F;
         var1.nvUVNnuu = var6 - var8 * var11 * 0.1F - var1.nUUVuvU * 0.5F - this.NnUuNNU;
         var1.UuuNnUvUuv = this.c0oOOCcCoC0 + var11 * (1.0F - var10) * 0.5F;
         var1.vNVuvnUUnuUn = this.NVUunUNUN;
         var1.UvnvNVnnnnNU = VvVVnnNNNuV.C00OOC00oO(var8, -1.0F, 1.0F);
      }

      void UuUVuuUu(UnVNvNnU var1, VvVVnnNNNuV.VvunVVUvUNnv var2, float var3, boolean var4, int var5, int var6, float var7) {
         float var8 = var2.vNUvnnVnUvu * var7;
         if (!(var8 <= 0.001F)) {
            float var9 = var2.C00OOC00oO + var2.vVvUvVVuuNvV * 0.5F + this.VVnVNnunVvu * 0.17F;
            float var10 = var2.UuUVuuUu + var2.nvUVNnuu + var2.nUUVuvU * 0.5F;

            for (int var11 = 0; var11 < VvVVnnNNNuV.NVNnnvnuunNv; var11++) {
               float var12 = this.vNUvnnVnUvu[var11];
               float var13 = 1.0F
                  - VvVVnnNNNuV.C00OOC00oO(Math.abs(this.vNUvnnVnUvu[var11] - var10) / Math.max(1.0F, this.uVUuuVnNVU[var11] * 0.7F), 0.0F, 1.0F);
               var13 = VvVVnnNNNuV.vuuuNvNuv(var13);
               float var14 = var11 == this.uNnUnnuNUnNu ? var2.nuUnNvnuUu : 0.0F;
               float var15 = (0.52F + var14 * 0.28F) * (1.0F - var13) + 1.0F * var13;
               int var16 = var4 ? VvVVnnNNNuV.UuUVuuUu(0.12F, 0.12F, 0.15F, var15 * var8) : VvVVnnNNNuV.UuUVuuUu(0.88F, 0.9F, 0.97F, var15 * var8);
               int var17 = var4 ? VvVVnnNNNuV.UuUVuuUu(0.08F, 0.07F, 0.12F, var8) : VvVVnnNNNuV.UuUVuuUu(1.0F, 1.0F, 1.0F, var8);
               int var18 = var13 > 0.5F ? var17 : var16;
               var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, Math.round(var12), Math.round(var9), this.VVnVNnunVvu, VvVVnnNNNuV.uVunuUNVVUUV[var11], var18, "c");
            }
         }
      }

      boolean UuUVuuUu(float var1, float var2) {
         float var3 = 6.0F;
         return this.UnUNuUU > 0.0F
            && VvVVnnNNNuV.UuUVuuUu(var1, var2, this.NnUuNNU, this.nNvNUVU - var3, this.UnUNuUU, this.uUVuVvuNUvnu + var3 * 2.0F, this.UvUvUNuvNU) <= 0.0F;
      }

      int UuUVuuUu(float var1) {
         int var2 = 0;
         float var3 = Float.MAX_VALUE;

         for (int var4 = 0; var4 < VvVVnnNNNuV.NVNnnvnuunNv; var4++) {
            float var5 = Math.abs(var1 - this.vNUvnnVnUvu[var4]);
            if (var5 < var3) {
               var3 = var5;
               var2 = var4;
            }
         }

         return var2;
      }
   }

   public static final class nvUnvV {
      private float UuUVuuUu;
      private float C00OOC00oO;
      private float uUnuvNvvNU;
      private float vVvUvVVuuNvV;
      private float uNNnnnuuuN;
      private float nuUnNvnuUu;
      private float VVuuUN;
      private float vNUvnnVnUvu;
      private float uVUuuVnNVU;

      public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
         this.nuUnNvnuUu = var6;
         this.VVuuUN = var7;
      }

      public void UuUVuuUu(float var1, float var2) {
         this.vNUvnnVnUvu = var1;
         this.uVUuuVnNVU = var2;
      }

      public float UuUVuuUu() {
         return this.UuUVuuUu;
      }

      public float C00OOC00oO() {
         return this.C00OOC00oO;
      }

      public float uUnuvNvvNU() {
         return this.uUnuvNvvNU;
      }

      public float vVvUvVVuuNvV() {
         return this.vVvUvVVuuNvV;
      }

      public float uNNnnnuuuN() {
         return this.uNNnnnuuuN;
      }

      public float nuUnNvnuUu() {
         return this.nuUnNvnuUu;
      }

      public float VVuuUN() {
         return this.VVuuUN;
      }

      public float vNUvnnVnUvu() {
         return this.vNUvnnVnUvu;
      }

      public float uVUuuVnNVU() {
         return this.uVUuuVnNVU;
      }
   }

   public static final class nvnNNunvv {
      String UuUVuuUu = "";
      float C00OOC00oO;
      float uUnuvNvvNU;
      float vVvUvVVuuNvV;
      float uNNnnnuuuN;
      private float nuUnNvnuUu;
      private float VVuuUN;
      private float vNUvnnVnUvu;
      private float uVUuuVnNVU;
      float vuuuNvNuv;
      private float nvUVNnuu;
      private float UuuNnUvUuv;
      float nUUVuvU = 1.0F;
      private float UnUNVVVNuv = 0.5F;
      private float vNVuvnUUnuUn = 0.5F;
      private float UvnvNVnnnnNU;
      private float uVUVnuvnuVuv;
      private float NVNnnvnuunNv;
      private boolean uVunuUNVVUUV;
      private float UNnVVNvvnVvU = 1.0F;
      private float uNnUnnuNUnNu;

      public void UuUVuuUu(
         String var1,
         float var2,
         float var3,
         float var4,
         float var5,
         float var6,
         float var7,
         float var8,
         float var9,
         float var10,
         float var11,
         float var12,
         float var13,
         float var14,
         float var15,
         float var16
      ) {
         this.UuUVuuUu = var1 == null ? "" : var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
         this.nuUnNvnuUu = var6;
         this.VVuuUN = var7;
         this.vNUvnnVnUvu = var8;
         this.uVUuuVnNVU = var9;
         this.vuuuNvNuv = var10;
         this.nvUVNnuu = var11;
         this.UuuNnUvUuv = var12;
         this.nUUVuvU = var13;
         this.UnUNVVVNuv = var14;
         this.vNVuvnUUnuUn = var15;
         this.UvnvNVnnnnNU = var16;
         this.uVUVnuvnuVuv = 0.0F;
         this.NVNnnvnuunNv = 0.0F;
         this.uVunuUNVVUUV = false;
         this.UNnVVNvvnVvU = 1.0F;
         this.uNnUnnuNUnNu = 0.0F;
      }

      public void UuUVuuUu(float var1, float var2) {
         this.uVUVnuvnuVuv = var1;
         this.NVNnnvnuunNv = var2;
         this.uVunuUNVVUUV = true;
      }

      public void UuUVuuUu(float var1) {
         this.UNnVVNvvnVvU = var1;
      }

      public void C00OOC00oO(float var1) {
         this.uNnUnnuNUnNu = var1;
      }

      public float UuUVuuUu() {
         return this.uNnUnnuNUnNu;
      }

      public float C00OOC00oO() {
         return this.UNnVVNvvnVvU;
      }

      public boolean uUnuvNvvNU() {
         return this.uVunuUNVVUUV;
      }

      public float vVvUvVVuuNvV() {
         return this.uVUVnuvnuVuv;
      }

      public float uNNnnnuuuN() {
         return this.NVNnnvnuunNv;
      }

      public String nuUnNvnuUu() {
         return this.UuUVuuUu;
      }

      public float VVuuUN() {
         return this.C00OOC00oO;
      }

      public float vNUvnnVnUvu() {
         return this.uUnuvNvvNU;
      }

      public float uVUuuVnNVU() {
         return this.vVvUvVVuuNvV;
      }

      public float vuuuNvNuv() {
         return this.uNNnnnuuuN;
      }

      public float nvUVNnuu() {
         return this.nuUnNvnuUu;
      }

      public float UuuNnUvUuv() {
         return this.VVuuUN;
      }

      public float nUUVuvU() {
         return this.vNUvnnVnUvu;
      }

      public float UnUNVVVNuv() {
         return this.uVUuuVnNVU;
      }

      public float vNVuvnUUnuUn() {
         return this.vuuuNvNuv;
      }

      public float UvnvNVnnnnNU() {
         return this.nvUVNnuu;
      }

      public float uVUVnuvnuVuv() {
         return this.UuuNnUvUuv;
      }

      public float NVNnnvnuunNv() {
         return this.nUUVuvU;
      }

      public float uVunuUNVVUUV() {
         return this.UnUNVVVNuv;
      }

      public float UNnVVNvvnVvU() {
         return this.vNVuvnUUnuUn;
      }

      public float uNnUnnuNUnNu() {
         return this.UvnvNVnnnnNU;
      }
   }

   static final class uuVnUuun {
      float UuUVuuUu;
      float C00OOC00oO;
      float uUnuvNvvNU = -100.0F;
      float vVvUvVVuuNvV;
   }

   public static final class uunvUUVnuNn {
      private float UuUVuuUu;
      private float C00OOC00oO;
      private float uUnuvNvvNU;
      private float vVvUvVVuuNvV;
      private float uNNnnnuuuN;
      private float nuUnNvnuUu;
      private float VVuuUN;
      private float vNUvnnVnUvu;
      private float uVUuuVnNVU;
      private float vuuuNvNuv;

      public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
         this.nuUnNvnuUu = var6;
         this.VVuuUN = var7;
         this.vNUvnnVnUvu = var8;
      }

      public void UuUVuuUu(float var1, float var2) {
         this.uVUuuVnNVU = var1;
         this.vuuuNvNuv = var2;
      }

      public void UuUVuuUu() {
         this.uUnuvNvvNU = 0.0F;
         this.nuUnNvnuUu = 0.0F;
      }

      public float C00OOC00oO() {
         return this.UuUVuuUu;
      }

      public float uUnuvNvvNU() {
         return this.C00OOC00oO;
      }

      public float vVvUvVVuuNvV() {
         return this.uUnuvNvvNU;
      }

      public float uNNnnnuuuN() {
         return this.vVvUvVVuuNvV;
      }

      public float nuUnNvnuUu() {
         return this.uNNnnnuuuN;
      }

      public float VVuuUN() {
         return this.nuUnNvnuUu;
      }

      public float vNUvnnVnUvu() {
         return this.VVuuUN;
      }

      public float uVUuuVnNVU() {
         return this.vNUvnnVnUvu;
      }

      public float vuuuNvNuv() {
         return this.uVUuuVnNVU;
      }

      public float nvUVNnuu() {
         return this.vuuuNvNuv;
      }
   }

   record vUvuUvvVvvnN(String label, String note, VvVVnnNNNuV.VUVvVuvuN kind, UnvVVnnVNN.NVnVnNnN version) {
   }

   public static final class vvnuuvnUNvN {
      private float UuUVuuUu;
      private float C00OOC00oO;
      private float uUnuvNvvNU = 100.0F;
      private float vVvUvVVuuNvV;

      public void UuUVuuUu(float var1, float var2, float var3, float var4) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
      }

      public float UuUVuuUu() {
         return this.UuUVuuUu;
      }

      public float C00OOC00oO() {
         return this.C00OOC00oO;
      }

      public float uUnuvNvvNU() {
         return this.uUnuvNvvNU;
      }

      public float vVvUvVVuuNvV() {
         return this.vVvUvVVuuNvV;
      }
   }
}
