package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.class_1011;
import net.minecraft.class_1041;
import net.minecraft.class_1043;
import net.minecraft.class_10868;
import net.minecraft.class_156;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_410;
import net.minecraft.class_412;
import net.minecraft.class_420;
import net.minecraft.class_422;
import net.minecraft.class_437;
import net.minecraft.class_639;
import net.minecraft.class_641;
import net.minecraft.class_642;
import net.minecraft.class_644;
import net.minecraft.class_642.class_8678;
import net.minecraft.class_642.class_9083;
import org.lwjgl.opengl.GL11;

public final class uNuVuVnNnu extends class_437 implements uNVUuVuNNUvn {
   private static final OO0OCoOC UuUVuuUu = OO0OCoOC.UuUVuuUu();
   private static final int C00OOC00oO = 14;
   private static final long uUnuvNvvNU = 140L;
   private static final long vVvUvVVuuNvV = 70L;
   private static final ThreadFactory uNNnnnuuuN = var0 -> {
      Thread var1 = new Thread(var0, "Wild Server Ping");
      var1.setDaemon(true);
      return var1;
   };
   private final class_437 nuUnNvnuUu;
   private final OoCO0O0oc0c VVuuUN = new OoCO0O0oc0c();
   private final VvVVnnNNNuV.VUuUUNnnuvuv vNUvnnVnUvu = new VvVVnnNNNuV.VUuUUNnnuvuv(24, 14);
   private final VvuuVNVUn.NVnVnNnN uVUuuVnNVU = new VvuuVNVUn.NVnVnNnN();
   private class_644 vuuuNvNuv = new class_644();
   private final List<class_642> nvUVNnuu = new ArrayList<>();
   private final List<uNuVuVnNnu.VvunVVUvUNnv> UuuNnUvUuv = new ArrayList<>();
   private final Map<String, uNuVuVnNnu.nvnNNunvv> nUUVuvU = new HashMap<>();
   private final List<uNuVuVnNnu.VvunVVUvUNnv> UnUNVVVNuv = List.of(
      new uNuVuVnNnu.VvunVVUvUNnv("Join", uNuVuVnNnu.NVnVnNnN.JOIN),
      new uNuVuVnNnu.VvunVVUvUNnv("Direct", uNuVuVnNnu.NVnVnNnN.DIRECT),
      new uNuVuVnNnu.VvunVVUvUNnv("Add", uNuVuVnNnu.NVnVnNnN.ADD),
      new uNuVuVnNnu.VvunVVUvUNnv("Edit", uNuVuVnNnu.NVnVnNnN.EDIT),
      new uNuVuVnNnu.VvunVVUvUNnv("Delete", uNuVuVnNnu.NVnVnNnN.DELETE),
      new uNuVuVnNnu.VvunVVUvUNnv("Proxy", uNuVuVnNnu.NVnVnNnN.PROXY),
      new uNuVuVnNnu.VvunVVUvUNnv("Refresh", uNuVuVnNnu.NVnVnNnN.REFRESH),
      new uNuVuVnNnu.VvunVVUvUNnv("Back", uNuVuVnNnu.NVnVnNnN.BACK)
   );
   private final uNuVuVnNnu.uunvUUVnuNn[] vNVuvnUUnuUn = new uNuVuVnNnu.uunvUUVnuNn[14];
   private final vVnuUUVvvnV UvnvNVnnnnNU = new vVnuUUVvvnV(Cc0cOoOcC0o.uNNnnnuuuN());
   private final vVnuUUVvvnV uVUVnuvnuVuv = new vVnuUUVvvnV(Cc0cOoOcC0o.uNNnnnuuuN());
   private class_641 NVNnnvnuunNv;
   private long uVunuUNVVUUV;
   private long UNnVVNvvnVvU;
   private long uNnUnnuNUnNu;
   private long NnUuNNU;
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
   private boolean nnuUVNUuvvVU;
   private boolean nVVUuvuNnUN;
   private boolean nNnVnUNVV;
   private int nuunNvv;
   private int uUVVvVVNvvn;
   private int vvUVNVvvNUv = -6357021;
   private int UuNnnVnuNNV = -11341636;
   private NvVNvUvunNNu uUVvnUuNvvN = NvVNvUvunNNu.AURORA;
   private boolean UUuUnNVNuuv;
   private int NVuNUuVnVUN = -1;
   private float NVuunNnvvvVu;
   private float vNnNuuvVn;
   private int VUuuVUnun = 5;
   private int vVVuuVVv = -1;
   private String VuunNUUUvu = "Choose a server";
   private volatile ScheduledExecutorService NNUUNUuVNNVn;
   private final AtomicInteger VvVvnNUnvuvV = new AtomicInteger();
   private volatile int ccOO0COcoco0;
   private final AtomicInteger NUVvUUVuVNVv = new AtomicInteger();
   private volatile int nNuVunNUVu;
   private float UNvvunVVn = -100.0F;
   private long UnvuVuVnNuvu;
   private float UvNNVUVNVuvV;
   private float NnunUUnU;
   private float nvuVvuNnNUnv;
   private float NnVnNVN;
   private boolean vnvvNvUnVv;
   private float OCOocoOoOO;
   private float o0Ooc0COOoc;
   private float nvvnUnUn;
   private float UnUUVuVunvVu;
   private float nnvuvUNuUnN;
   private float UVnuVUUVnnU;
   private float VunnVNvNV;
   private boolean NvUVUvVVnUu;
   private final AtomicBoolean unnUnUNVnN = new AtomicBoolean(false);

   public uNuVuVnNnu(class_437 var1) {
      super(class_2561.method_43470("Wild Multiplayer"));
      this.nuUnNvnuUu = var1;

      for (int var2 = 0; var2 < this.vNVuvnUUnuUn.length; var2++) {
         this.vNVuvnUUnuUn[var2] = new uNuVuVnNnu.uunvUUVnuNn();
      }
   }

   protected void method_25426() {
      super.method_25426();
      this.uVunuUNVVUUV = System.nanoTime();
      this.UNnVVNvvnVvU = this.uVunuUNVVUUV;
      this.uNnUnnuNUnNu = this.uVunuUNVVUUV;
      this.nnuUVNUuvvVU = false;
      this.nVVUuvuNnUN = false;
      this.nNnVnUNVV = false;
      this.nuunNvv = 0;
      this.uUVVvVVNvvn = 0;
      this.NVuunNnvvvVu = 0.0F;
      this.vNnNuuvVn = 0.0F;
      this.C00OOC00oO(true);
      this.UvnvNVnnnnNU.UuUVuuUu(0.0F);
      this.uVUVnuvnuVuv.UuUVuuUu(0.0F);

      for (uNuVuVnNnu.VvunVVUvUNnv var2 : this.UuuNnUvUuv) {
         var2.UuUVuuUu();
      }

      for (uNuVuVnNnu.VvunVVUvUNnv var4 : this.UnUNVVVNuv) {
         var4.UuUVuuUu();
      }

      this.C00OOC00oO();
   }

   public void method_25394(class_332 var1, int var2, int var3, float var4) {
      this.UuUVuuUu(var2, var3, var4, false);
   }

   @Override
   public void UuUVuuUu(int var1, int var2, float var3) {
      this.UuUVuuUu(var1, var2, var3, true);
   }

   public void method_25393() {
      super.method_25393();
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(int var1, int var2, float var3, boolean var4) {
      class_1041 var5 = this.field_22787 == null ? null : this.field_22787.method_22683();
      if (var5 != null && !var5.method_65966() && var5.method_4489() > 0 && var5.method_4506() > 0) {
         int var6 = var5.method_4489();
         int var7 = var5.method_4506();
         long var8 = System.nanoTime();
         float var10 = Math.max(0.001F, Math.min(0.05F, (float)(var8 - this.UNnVVNvvnVvU) / 1.0E9F));
         this.UNnVVNvvnVvU = var8;
         this.nNvNUVU = (float)(var8 - this.uVunuUNVVUUV) / 1.0E9F;
         if (this.UuUVuuUu(var5, var6, var7, var1, var2, var8)) {
            var10 = 0.001F;
         }

         this.VVuuUN();
         this.UuUVuuUu(var5, var1, var2, var10, var8);
         this.C00OOC00oO(var6, var7, var10);
         this.vNUvnnVnUvu();
         float var11 = (this.UnUNuUU / Math.max(1.0F, (float)var6) - 0.5F) * 2.0F;
         float var12 = (this.uUVuVvuNUvnu / Math.max(1.0F, (float)var7) - 0.5F) * 2.0F;
         float var13 = this.UvnvNVnnnnNU.UuUVuuUu(var11, var10);
         float var14 = this.uVUVnuvnuVuv.UuUVuuUu(var12, var10);
         this.UuUVuuUu(var6, var7, var13, var14, var10);
         int var15 = GL11.glGetInteger(36006);
         this.UuUVuuUu(var6, var7, var15, var13, var14, var8);
         if (var4) {
            VvuuVNVUn.C00OOC00oO(this.uVUuuVnNVU);
            boolean var18 = false /* VF: Semaphore variable */;

            try {
               var18 = true;
               this.VVuuUN.UuUVuuUu(this.vNUvnnVnUvu);
               var18 = false;
            } finally {
               if (var18) {
                  VvuuVNVUn.uUnuvNvvNU(this.uVUuuVnNVU);
               }
            }

            VvuuVNVUn.uUnuvNvvNU(this.uVUuuVnNVU);
            this.UuUVuuUu(this.vNUvnnVnUvu);
         }
      }
   }

   public void method_25420(class_332 var1, int var2, int var3, float var4) {
   }

   public void method_52752(class_332 var1) {
   }

   public boolean method_25402(double var1, double var3, int var5) {
      if (var5 == 0 && this.field_22787 != null && this.field_22787.method_22683() != null) {
         float var6 = this.UuUVuuUu(this.field_22787.method_22683(), var1);
         float var7 = this.C00OOC00oO(this.field_22787.method_22683(), var3);
         long var8 = System.nanoTime();
         if (this.NvUVUvVVnUu) {
            float var10 = 8.0F;
            if (var6 >= this.o0Ooc0COOoc - var10
               && var6 <= this.o0Ooc0COOoc + this.UnUUVuVunvVu + var10
               && var7 >= this.nvvnUnUn
               && var7 <= this.nvvnUnUn + this.nnvuvUNuUnN) {
               this.vnvvNvUnVv = true;
               if (var7 >= this.UVnuVUUVnnU && var7 <= this.UVnuVUUVnnU + this.VunnVNvNV) {
                  this.OCOocoOoOO = var7 - this.UVnuVUUVnnU;
               } else {
                  this.OCOocoOoOO = this.VunnVNvNV * 0.5F;
               }

               this.UuUVuuUu(var7);
               return true;
            }
         }

         for (uNuVuVnNnu.VvunVVUvUNnv var11 : this.UnUNVVVNuv) {
            if (var11.uUVuVvuNUvnu && var11.UvUvUNuvNU && var11.UuUVuuUu(var6, var7)) {
               var11.UnUNVVVNuv = 1.0F;
               var11.vNVuvnUUnuUn = 1.0F;
               this.UuUVuuUu(var11.uUnuvNvvNU);
               return true;
            }
         }

         for (uNuVuVnNnu.VvunVVUvUNnv var14 : this.UuuNnUvUuv) {
            if (var14.uUVuVvuNUvnu
               && var14.UvUvUNuvNU
               && var14.uUnuvNvvNU == uNuVuVnNnu.NVnVnNnN.SERVER
               && var14.UuUVuuUu(var6, var7)
               && !(var14.NnUuNNU < 0.1F)) {
               if (this.NVuNUuVnVUN == var14.nNvNUVU && this.vVVuuVVv == var14.nNvNUVU && var8 - this.NnUuNNU < 360000000L) {
                  var14.UnUNVVVNuv = 1.0F;
                  var14.vNVuvnUUnuUn = 1.0F;
                  this.UuUVuuUu(uNuVuVnNnu.NVnVnNnN.JOIN);
               } else {
                  this.NVuNUuVnVUN = var14.nNvNUVU;
                  this.VuunNUUUvu = "Ready";
                  var14.vNVuvnUUnuUn = Math.max(var14.vNVuvnUUnuUn, 0.38F);
               }

               this.vVVuuVVv = var14.nNvNUVU;
               this.NnUuNNU = var8;
               this.UnUNVVVNuv();
               return true;
            }
         }

         return true;
      } else {
         return super.method_25402(var1, var3, var5);
      }
   }

   public boolean method_25401(double var1, double var3, double var5, double var7) {
      if (this.nvUVNnuu.size() <= this.VUuuVUnun) {
         return true;
      } else {
         this.UnvuVuVnNuvu = System.nanoTime();
         this.NVuunNnvvvVu -= (float)var7;
         int var9 = Math.max(0, this.nvUVNnuu.size() - Math.max(1, this.VUuuVUnun));
         this.NVuunNnvvvVu = C00OOC00oO(this.NVuunNnvvvVu, 0.0F, (float)var9);
         return true;
      }
   }

   public boolean method_25403(double var1, double var3, int var5, double var6, double var8) {
      if (this.vnvvNvUnVv && this.NvUVUvVVnUu && this.field_22787 != null && this.field_22787.method_22683() != null) {
         this.UuUVuuUu(this.C00OOC00oO(this.field_22787.method_22683(), var3));
         return true;
      } else {
         return super.method_25403(var1, var3, var5, var6, var8);
      }
   }

   public boolean method_25406(double var1, double var3, int var5) {
      if (var5 == 0 && this.vnvvNvUnVv) {
         this.vnvvNvUnVv = false;
         return true;
      } else {
         return super.method_25406(var1, var3, var5);
      }
   }

   private void UuUVuuUu(float var1) {
      float var2 = this.nnvuvUNuUnN - this.VunnVNvNV;
      if (!(var2 <= 0.001F)) {
         float var3 = C00OOC00oO(var1 - this.OCOocoOoOO, this.nvvnUnUn, this.nvvnUnUn + var2);
         float var4 = (var3 - this.nvvnUnUn) / var2;
         int var5 = Math.max(0, this.nvUVNnuu.size() - Math.max(1, this.VUuuVUnun));
         this.UnvuVuVnNuvu = System.nanoTime();
         this.NVuunNnvvvVu = var4 * var5;
      }
   }

   public boolean method_25404(int var1, int var2, int var3) {
      boolean var4 = (var3 & 2) != 0 || (var3 & 8) != 0;
      if (var1 == 256) {
         this.UuUVuuUu(uNuVuVnNnu.NVnVnNnN.BACK);
         return true;
      } else if (var1 == 257 || var1 == 335) {
         this.UuUVuuUu(uNuVuVnNnu.NVnVnNnN.JOIN);
         return true;
      } else if (var4 && var1 == 67) {
         this.nUUVuvU();
         return true;
      } else if (var1 == 82) {
         this.UuUVuuUu(uNuVuVnNnu.NVnVnNnN.REFRESH);
         return true;
      } else if (var1 == 261) {
         this.UuUVuuUu(uNuVuVnNnu.NVnVnNnN.DELETE);
         return true;
      } else if (var1 == 264) {
         if (var4) {
            this.uUnuvNvvNU(1);
         } else {
            this.vVvUvVVuuNvV(1);
         }

         return true;
      } else if (var1 == 265) {
         if (var4) {
            this.uUnuvNvvNU(-1);
         } else {
            this.vVvUvVVuuNvV(-1);
         }

         return true;
      } else {
         return super.method_25404(var1, var2, var3);
      }
   }

   public boolean method_25400(char var1, int var2) {
      if (!this.nvUVNnuu.isEmpty() && var1 > ' ') {
         char var3 = Character.toLowerCase(var1);
         int var4 = this.NVuNUuVnVUN < 0 ? -1 : this.NVuNUuVnVUN;
         int var5 = this.nvUVNnuu.size();

         for (int var6 = 1; var6 <= var5; var6++) {
            int var7 = ((var4 + var6) % var5 + var5) % var5;
            class_642 var8 = this.nvUVNnuu.get(var7);
            String var9 = var8 == null ? "" : UuUVuuUu(var8.field_3752, "");
            if (!var9.isEmpty() && Character.toLowerCase(var9.charAt(0)) == var3) {
               this.NVuNUuVnVUN = var7;
               this.VuunNUUUvu = "Jumped to " + var9;
               this.UnUNVVVNuv();
               return true;
            }
         }

         return true;
      } else {
         return super.method_25400(var1, var2);
      }
   }

   public boolean method_25421() {
      return false;
   }

   public boolean method_25422() {
      return false;
   }

   public void method_25419() {
      this.UuUVuuUu(uNuVuVnNnu.NVnVnNnN.BACK);
   }

   public void method_25432() {
      this.C00OOC00oO(true);
      this.UvnvNVnnnnNU();
      this.VVuuUN.close();
      super.method_25432();
   }

   private void C00OOC00oO() {
      class_310 var1 = this.field_22787 == null ? class_310.method_1551() : this.field_22787;
      if (var1 != null) {
         if (this.unnUnUNVnN.compareAndSet(false, true)) {
            this.C00OOC00oO(true);
            this.UvnvNVnnnnNU();
            this.nvUVNnuu.clear();
            this.VuunNUUUvu = "Loading servers...";
            class_641 var2 = new class_641(var1);
            CompletableFuture.runAsync(() -> {
               try {
                  var2.method_2981();
               } catch (Throwable var2x) {
               }
            }).whenComplete((var3, var4) -> var1.execute(() -> this.UuUVuuUu(var2, var4)));
         }
      }
   }

   private void UuUVuuUu(class_641 var1, Throwable var2) {
      try {
         this.NVNnnvnuunNv = var1;
         this.nvUVNnuu.clear();

         try {
            int var3 = var1 == null ? 0 : var1.method_2984();

            for (int var4 = 0; var4 < var3; var4++) {
               class_642 var5 = var1.method_2982(var4);
               if (var5 != null) {
                  this.nvUVNnuu.add(var5);
               }
            }
         } catch (Throwable var9) {
         }

         if (var2 != null) {
            this.VuunNUUUvu = "Failed to load servers";
         }

         if (this.nvUVNnuu.isEmpty()) {
            this.NVuNUuVnVUN = -1;
            this.NVuunNnvvvVu = 0.0F;
            this.vNnNuuvVn = 0.0F;
            if (var2 == null) {
               this.VuunNUUUvu = "No saved servers";
            }
         } else {
            if (this.NVuNUuVnVUN < 0 || this.NVuNUuVnVUN >= this.nvUVNnuu.size()) {
               this.NVuNUuVnVUN = 0;
            }

            this.NVuunNnvvvVu = C00OOC00oO(this.NVuunNnvvvVu, 0.0F, (float)Math.max(0, this.nvUVNnuu.size() - this.VUuuVUnun));
            this.UnUNVVVNuv();
            if (var2 == null) {
               this.VuunNUUUvu = "Choose a server";
            }

            this.UuUVuuUu(false);
         }
      } finally {
         this.unnUnUNVnN.set(false);
      }
   }

   private void uUnuvNvvNU() {
      if (this.NVNnnvnuunNv != null) {
         try {
            this.NVNnnvnuunNv.method_2987();
         } catch (Throwable var2) {
         }
      }
   }

   private void UuUVuuUu(boolean var1) {
      class_310 var2 = this.field_22787 == null ? class_310.method_1551() : this.field_22787;
      if (var2 != null) {
         int var3 = ++this.nNuVunNUVu;
         this.C00OOC00oO(false);
         ArrayList var4 = new ArrayList<>(this.nvUVNnuu);
         this.VvVvnNUnvuvV.set(0);
         this.ccOO0COcoco0 = var4.size();
         this.NUVvUUVuVNVv.set(0);
         if (var1) {
            this.nuUnNvnuUu();
         }

         this.VuunNUUUvu = var1 ? "Refreshing servers..." : "Pinging servers...";
         this.UuUVuuUu(var2, var4, var3);
      }
   }

   private void UuUVuuUu(class_310 var1, List<class_642> var2, int var3) {
      if (var2.isEmpty()) {
         this.vVvUvVVuuNvV();
      } else {
         class_644 var4 = this.vuuuNvNuv;
         ScheduledExecutorService var5 = Executors.newSingleThreadScheduledExecutor(uNNnnnuuuN);
         this.NNUUNUuVNNVn = var5;
         var5.scheduleWithFixedDelay(() -> this.UuUVuuUu(var1, var4, var2, var3, var5), 140L, 70L, TimeUnit.MILLISECONDS);
      }
   }

   private void UuUVuuUu(class_310 var1, class_644 var2, List<class_642> var3, int var4, ScheduledExecutorService var5) {
      if (var4 == this.nNuVunNUVu && !var5.isShutdown()) {
         try {
            if (this.VvVvnNUnvuvV.get() < var3.size()) {
               int var6 = this.VvVvnNUnvuvV.getAndIncrement();
               class_642 var7 = var6 < var3.size() ? (class_642)var3.get(var6) : null;
               if (var7 == null) {
                  this.VvVvnNUnvuvV.set(var3.size());
               } else {
                  this.UuUVuuUu(var1, var2, var7, var4);
               }
            }

            var2.method_3000();
            if (this.VvVvnNUnvuvV.get() >= this.ccOO0COcoco0 && this.NUVvUUVuVNVv.get() <= 0) {
               var1.execute(this::vVvUvVVuuNvV);
               UuUVuuUu(var2);
               var5.shutdown();
               if (this.NNUUNUuVNNVn == var5) {
                  this.NNUUNUuVNNVn = null;
               }
            }
         } catch (Throwable var8) {
         }
      } else {
         UuUVuuUu(var2);
         var5.shutdown();
      }
   }

   private void UuUVuuUu(class_310 var1, class_644 var2, class_642 var3, int var4) {
      this.NUVvUUVuVNVv.incrementAndGet();

      try {
         var1.execute(() -> this.UuUVuuUu(var3, var4));
         var2.method_3003(var3, () -> var1.execute(() -> this.C00OOC00oO(var3, var4)), () -> var1.execute(() -> this.uUnuvNvvNU(var3, var4)));
      } catch (Throwable var6) {
         var1.execute(() -> this.uUnuvNvvNU(var3, var4));
      }
   }

   private void UuUVuuUu(class_642 var1, int var2) {
      if (var2 == this.nNuVunNUVu) {
         var1.method_55824(class_9083.field_47881);
         var1.field_3753 = class_2561.method_43470("...");
      }
   }

   private void C00OOC00oO(class_642 var1, int var2) {
      if (var2 == this.nNuVunNUVu) {
         CompletableFuture.runAsync(() -> {
            try {
               class_641.method_2986(var1);
            } catch (Throwable var2x) {
            }
         }, class_156.method_18349());
         this.UuUVuuUu(var2);
      }
   }

   private void uUnuvNvvNU(class_642 var1, int var2) {
      if (var2 == this.nNuVunNUVu) {
         var1.field_3758 = -1L;
         var1.method_55824(class_9083.field_47882);
         if (var1.field_3757 == null || var1.field_3757.getString().isBlank()) {
            var1.field_3757 = class_2561.method_43470("Cannot reach server");
         }

         var1.field_3753 = class_2561.method_43470("-");
         this.UuUVuuUu(var2);
      }
   }

   private void UuUVuuUu(int var1) {
      if (var1 == this.nNuVunNUVu) {
         this.NUVvUUVuVNVv.updateAndGet(var0 -> Math.max(0, var0 - 1));
         this.vVvUvVVuuNvV();
      }
   }

   private void vVvUvVVuuNvV() {
      if (this.VvVvnNUnvuvV.get() >= this.ccOO0COcoco0 && this.NUVvUUVuVNVv.get() <= 0) {
         if (!this.nvUVNnuu.isEmpty()) {
            this.VuunNUUUvu = "Servers updated";
         }
      }
   }

   private void C00OOC00oO(boolean var1) {
      if (var1) {
         this.nNuVunNUVu++;
      }

      ScheduledExecutorService var2 = this.NNUUNUuVNNVn;
      this.NNUUNUuVNNVn = null;
      class_644 var3 = this.vuuuNvNuv;
      this.vuuuNvNuv = new class_644();
      this.VvVvnNUnvuvV.set(0);
      this.ccOO0COcoco0 = 0;
      this.NUVvUUVuVNVv.set(0);
      if (var2 != null) {
         var2.shutdownNow();
      }

      CompletableFuture.runAsync(() -> UuUVuuUu(var3), class_156.method_18349());
   }

   private static void UuUVuuUu(class_644 var0) {
      try {
         var0.method_3004();
      } catch (Throwable var2) {
      }
   }

   private void uNNnnnuuuN() {
      if (this.nvUVNnuu.isEmpty()) {
         this.nuUnNvnuUu();
         this.C00OOC00oO();
         this.VuunNUUUvu = "Refreshing servers...";
      } else {
         this.UuUVuuUu(true);
      }
   }

   private void nuUnNvnuUu() {
      this.UNvvunVVn = this.nNvNUVU;

      for (uNuVuVnNnu.VvunVVUvUNnv var2 : this.UuuNnUvUuv) {
         if (var2.uUVuVvuNUvnu) {
            var2.vNVuvnUUnuUn = Math.max(var2.vNVuvnUUnuUn, 0.72F);
            var2.UnUNVVVNuv = Math.max(var2.UnUNVVVNuv, 0.16F);
            var2.UvnvNVnnnnNU = Math.max(var2.UvnvNVnnnnNU, 0.65F);
         }
      }

      for (uNuVuVnNnu.VvunVVUvUNnv var4 : this.UnUNVVVNuv) {
         if (var4.uUnuvNvvNU == uNuVuVnNnu.NVnVnNnN.REFRESH) {
            var4.vNVuvnUUnuUn = Math.max(var4.vNVuvnUUnuUn, 1.0F);
            var4.UnUNVVVNuv = Math.max(var4.UnUNVVVNuv, 0.18F);
            break;
         }
      }
   }

   private void VVuuUN() {
      NvVNvUvunNNu var1 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null
         ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO()
         : NvVNvUvunNNu.AURORA;
      this.uUVvnUuNvvN = var1;
      this.UUuUnNVNuuv = UuUVuuUu.uUnuvNvvNU(var1);
      this.vvUVNVvvNUv = UuUVuuUu.vVvUvVVuuNvV(var1);
      this.UuNnnVnuNNV = UuUVuuUu.uNNnnnuuuN(var1);
   }

   private void UuUVuuUu(class_1041 var1, int var2, int var3, float var4, long var5) {
      float var7 = this.UuUVuuUu(var1, (double)var2);
      float var8 = this.C00OOC00oO(var1, (double)var3);
      if (!this.nnuUVNUuvvVU) {
         this.UnUNuUU = var7;
         this.uUVuVvuNUvnu = var8;
         this.UvUvUNuvNU = 0.0F;
         this.c0oOOCcCoC0 = 0.0F;
         this.nnuUVNUuvvVU = true;
      } else {
         float var9 = var7 - this.UnUNuUU;
         float var10 = var8 - this.uUVuVvuNUvnu;
         float var11 = C00OOC00oO(var9, var10);
         if (var11 > 0.2F) {
            this.UvUvUNuvNU = C00OOC00oO(var9 / Math.max(1.0F, (float)var1.method_4489()) / var4, -3.0F, 3.0F);
            this.c0oOOCcCoC0 = C00OOC00oO(var10 / Math.max(1.0F, (float)var1.method_4506()) / var4, -3.0F, 3.0F);
         } else {
            float var12 = (float)Math.pow(8.0E-4F, var4);
            this.UvUvUNuvNU *= var12;
            this.c0oOOCcCoC0 *= var12;
         }

         this.UnUNuUU = var7;
         this.uUVuVvuNUvnu = var8;
         if (var11 > 1.5F) {
            this.uNnUnnuNUnNu = var5;
         }
      }
   }

   private void C00OOC00oO(int var1, int var2, float var3) {
      if (!this.nVVUuvuNnUN) {
         this.VVnVNnunVvu = this.UnUNuUU;
         this.unNNVVNnvvV = this.uUVuVvuNUvnu;
         this.NuunnvnN = 0.0F;
         this.NVUunUNUN = 0.0F;
         this.nVVUuvuNnUN = true;
      } else {
         float var4 = this.VVnVNnunVvu;
         float var5 = this.unNNVVNnvvV;
         float var6 = C00OOC00oO(this.UnUNuUU - this.VVnVNnunVvu, this.uUVuVvuNUvnu - this.unNNVVNnvvV);
         float var7 = (1.0F - (float)Math.pow(1.8E-5F, var3)) * (0.62F + C00OOC00oO(var6 / 680.0F, 0.0F, 0.32F));
         this.VVnVNnunVvu = this.VVnVNnunVvu + (this.UnUNuUU - this.VVnVNnunVvu) * C00OOC00oO(var7, 0.035F, 0.18F);
         this.unNNVVNnvvV = this.unNNVVNnvvV + (this.uUVuVvuNUvnu - this.unNNVVNnvvV) * C00OOC00oO(var7, 0.035F, 0.18F);
         float var8 = C00OOC00oO((this.VVnVNnunVvu - var4) / Math.max(1.0F, (float)var1) / var3, -1.35F, 1.35F);
         float var9 = C00OOC00oO((this.unNNVVNnvvV - var5) / Math.max(1.0F, (float)var2) / var3, -1.35F, 1.35F);
         float var10 = 1.0F - (float)Math.pow(0.004F, var3);
         this.NuunnvnN = this.NuunnvnN + (var8 - this.NuunnvnN) * var10;
         this.NVUunUNUN = this.NVUunUNUN + (var9 - this.NVUunUNUN) * var10;
      }
   }

   private void vNUvnnVnUvu() {
      if (!this.nNnVnUNVV) {
         this.UUVNuUNUvUnV = this.VVnVNnunVvu;
         this.vuvnUnVnUNnV = this.unNNVVNnvvV;
         this.nNnVnUNVV = true;
         this.UuUVuuUu(this.VVnVNnunVvu, this.unNNVVNnvvV, 0.24F);
      } else {
         float var1 = C00OOC00oO(this.VVnVNnunVvu - this.UUVNuUNUvUnV, this.unNNVVNnvvV - this.vuvnUnVnUNnV);
         if (var1 > 8.5F) {
            this.UuUVuuUu(this.VVnVNnunVvu, this.unNNVVNnvvV, C00OOC00oO(var1 / 240.0F, 0.08F, 0.38F));
            this.UUVNuUNUvUnV = this.VVnVNnunVvu;
            this.vuvnUnVnUNnV = this.unNNVVNnvvV;
         }
      }
   }

   private boolean UuUVuuUu(class_1041 var1, int var2, int var3, int var4, int var5, long var6) {
      if (this.nuunNvv == var2 && this.uUVVvVVNvvn == var3) {
         return false;
      } else {
         this.nuunNvv = var2;
         this.uUVVvVVNvvn = var3;
         float var8 = C00OOC00oO(this.UuUVuuUu(var1, (double)var4), 0.0F, (float)var2);
         float var9 = C00OOC00oO(this.C00OOC00oO(var1, (double)var5), 0.0F, (float)var3);
         this.UnUNuUU = this.VVnVNnunVvu = this.UUVNuUNUvUnV = var8;
         this.uUVuVvuNUvnu = this.unNNVVNnvvV = this.vuvnUnVnUNnV = var9;
         this.UvUvUNuvNU = this.c0oOOCcCoC0 = 0.0F;
         this.NuunnvnN = this.NVUunUNUN = 0.0F;
         this.nnuUVNUuvvVU = true;
         this.nVVUuvuNnUN = true;
         this.nNnVnUNVV = true;
         this.uNnUnnuNUnNu = var6;
         this.vnvvNvUnVv = false;
         this.UvnvNVnnnnNU.UuUVuuUu(0.0F);
         this.uVUVnuvnuVuv.UuUVuuUu(0.0F);
         this.vNnNuuvVn = this.NVuunNnvvvVu;
         this.uVUuuVnNVU();
         this.UuUVuuUu(var8, var9, 0.14F);
         this.UnUNVVVNuv();
         return true;
      }
   }

   private void uVUuuVnNVU() {
      for (uNuVuVnNnu.uunvUUVnuNn var4 : this.vNVuvnUUnuUn) {
         var4.UuUVuuUu = 0.0F;
         var4.C00OOC00oO = 0.0F;
         var4.uUnuvNvvNU = -100.0F;
         var4.vVvUvVVuuNvV = 0.0F;
      }
   }

   private void UuUVuuUu(float var1, float var2, float var3) {
      int var4 = 0;
      float var5 = -1.0F;

      for (int var6 = 0; var6 < this.vNVuvnUUnuUn.length; var6++) {
         float var7 = this.nNvNUVU - this.vNVuvnUUnuUn[var6].uUnuvNvvNU;
         if (this.vNVuvnUUnuUn[var6].vVvUvVVuuNvV <= 0.0F) {
            var4 = var6;
            break;
         }

         if (var7 > var5) {
            var5 = var7;
            var4 = var6;
         }
      }

      this.vNVuvnUUnuUn[var4].UuUVuuUu = var1;
      this.vNVuvnUUnuUn[var4].C00OOC00oO = var2;
      this.vNVuvnUUnuUn[var4].uUnuvNvvNU = this.nNvNUVU;
      this.vNVuvnUUnuUn[var4].vVvUvVVuuNvV = var3;
   }

   private void UuUVuuUu(int var1, int var2, float var3, float var4, float var5) {
      float var6 = UuUVuuUu(var1, var2);
      float var7 = C00OOC00oO(var1 * 0.38F, 520.0F * var6, 760.0F * var6);
      float var8 = C00OOC00oO(var2 * 0.078F, 72.0F * var6, 94.0F * var6);
      float var9 = 14.0F * var6;
      this.VUuuVUnun = Math.max(3, Math.min(6, (int)(var2 * 0.54F / (var8 + var9))));
      if (this.nvUVNnuu.size() < this.VUuuVUnun && !this.nvUVNnuu.isEmpty()) {
         this.VUuuVUnun = Math.max(1, this.nvUVNnuu.size());
      }

      int var10 = Math.max(0, this.nvUVNnuu.size() - Math.max(1, this.VUuuVUnun));
      this.NVuunNnvvvVu = C00OOC00oO(this.NVuunNnvvvVu, 0.0F, (float)var10);
      float var11 = 1.0F - (float)Math.exp(-22.0F * var5);
      this.vNnNuuvVn = this.vNnNuuvVn + (this.NVuunNnvvvVu - this.vNnNuuvVn) * var11;
      if (Float.isNaN(this.vNnNuuvVn)) {
         this.vNnNuuvVn = this.NVuunNnvvvVu;
      }

      float var12 = this.VUuuVUnun * var8 + Math.max(0, this.VUuuVUnun - 1) * var9;
      float var13 = var1 * 0.5F + var3 * 1.65F * var6;
      float var14 = var2 * 0.255F + var4 * 1.05F * var6;
      if (var14 + var12 > var2 * 0.79F) {
         var14 = var2 * 0.79F - var12;
      }

      var14 = Math.max(var2 * 0.18F, var14);
      this.UvNNVUVNVuvV = var13 - var7 * 0.5F;
      this.NnunUUnU = var14;
      this.nvuVvuNnNUnv = var7;
      this.NnVnNVN = var12;
      this.NvUVUvVVnUu = var10 > 0;
      if (this.NvUVUvVVnUu) {
         this.UnUUVuVunvVu = Math.max(4.0F, 5.5F * var6);
         this.o0Ooc0COOoc = var13 + var7 * 0.5F + 16.0F * var6;
         this.nvvnUnUn = var14;
         this.nnvuvUNuUnN = var12;
         float var15 = C00OOC00oO((float)this.VUuuVUnun / this.nvUVNnuu.size(), 0.1F, 1.0F);
         this.VunnVNvNV = Math.max(34.0F * var6, this.nnvuvUNuUnN * var15);
         float var16 = this.nnvuvUNuUnN - this.VunnVNvNV;
         float var17 = var10 == 0 ? 0.0F : this.vNnNuuvVn / var10;
         this.UVnuVUUVnnU = this.nvvnUnUn + var16 * var17;
      }

      int var33 = (int)Math.floor(this.vNnNuuvVn);
      float var34 = this.vNnNuuvVn - var33;
      int var35 = this.nvUVNnuu.isEmpty() ? 1 : Math.min(this.nvUVNnuu.size(), this.VUuuVUnun + 2);

      while (this.UuuNnUvUuv.size() < var35) {
         this.UuuNnUvUuv.add(new uNuVuVnNnu.VvunVVUvUNnv("", uNuVuVnNnu.NVnVnNnN.SERVER));
      }

      for (int var18 = 0; var18 < this.UuuNnUvUuv.size(); var18++) {
         uNuVuVnNnu.VvunVVUvUNnv var19 = this.UuuNnUvUuv.get(var18);
         if (var18 >= var35) {
            var19.uUVuVvuNUvnu = false;
         } else {
            var19.uUVuVvuNUvnu = true;
            var19.uVUuuVnNVU = var7;
            var19.vuuuNvNuv = var8;
            var19.uNNnnnuuuN = var13 - var7 * 0.5F;
            var19.nuUnNvnuUu = var14 + (var18 - var34) * (var8 + var9);
            var19.nvUVNnuu = Math.min(var8 * 0.36F, 20.0F * var6);
            var19.uNnUnnuNUnNu = 58.0F * var6;
            var19.UvUvUNuvNU = !this.nvUVNnuu.isEmpty();
            var19.UvnvNVnnnnNU = this.C00OOC00oO(var18);
            if (this.nvUVNnuu.isEmpty()) {
               var19.UuUVuuUu = "No saved servers";
               var19.C00OOC00oO = "Add a server or connect directly";
               var19.nNvNUVU = -1;
               var19.UnUNuUU = false;
               var19.NnUuNNU = C00OOC00oO(C00OOC00oO((this.nNvNUVU - 0.15F) / 0.92F, 0.0F, 1.0F));
            } else {
               int var20 = var33 + var18;
               class_642 var21 = var20 >= 0 && var20 < this.nvUVNnuu.size() ? this.nvUVNnuu.get(var20) : null;
               var19.nNvNUVU = var20;
               var19.UvUvUNuvNU = var21 != null;
               var19.UuUVuuUu = var21 == null ? "" : UuUVuuUu(var21.field_3752, "Unnamed server");
               var19.C00OOC00oO = var21 == null ? "" : UuUVuuUu(var21.field_3761, "No address");
               var19.UnUNuUU = var20 == this.NVuNUuVnVUN;
               float var22 = var19.nuUnNvnuUu + var8 * 0.5F;
               float var24 = var14 + var12;
               float var25 = var8 * 0.65F;
               float var26 = C00OOC00oO((var22 - var14 + var25) / var25, 0.0F, 1.0F);
               float var27 = C00OOC00oO((var24 + var25 - var22) / var25, 0.0F, 1.0F);
               float var28 = var26 * var27;
               var19.NnUuNNU = C00OOC00oO(C00OOC00oO((this.nNvNUVU - 0.15F - var18 * 0.045F) / 0.92F, 0.0F, 1.0F)) * var28;
               var19.vNVuvnUUnuUn = Math.max(var19.vNVuvnUUnuUn, var19.UvnvNVnnnnNU * 0.34F);
            }

            this.UuUVuuUu(var19, var5, var6);
         }
      }

      float var36 = 10.0F * var6;
      float var37 = C00OOC00oO(var1 * 0.08F, 95.0F * var6, 135.0F * var6);
      float var38 = 42.0F * var6;
      int var39 = Math.min(5, this.UnUNVVVNuv.size());
      int var40 = this.UnUNVVVNuv.size() - var39;
      float var23 = var39 * var37 + (var39 - 1) * var36;
      float var41 = var40 * var37 + (var40 - 1) * var36;
      float var42 = var1 * 0.5F - var23 * 0.5F + var3 * 1.35F * var6;
      float var43 = var1 * 0.5F - var41 * 0.5F + var3 * 1.35F * var6;
      float var44 = Math.min(var2 - var38 * 2.0F - var36 - 28.0F * var6, var14 + var12 + 24.0F * var6 + var4 * 0.45F * var6);

      for (int var45 = 0; var45 < this.UnUNVVVNuv.size(); var45++) {
         uNuVuVnNnu.VvunVVUvUNnv var29 = this.UnUNVVVNuv.get(var45);
         var29.uUVuVvuNUvnu = true;
         var29.uVUuuVnNVU = var37;
         var29.vuuuNvNuv = var38;
         boolean var30 = var45 < var39;
         int var31 = var30 ? var45 : var45 - var39;
         var29.uNNnnnuuuN = (var30 ? var42 : var43) + var31 * (var37 + var36);
         var29.nuUnNvnuUu = var44 + (var30 ? 0.0F : var38 + var36);
         var29.nvUVNnuu = Math.min(var38 * 0.42F, 18.0F * var6);
         var29.uNnUnnuNUnNu = 42.0F * var6;
         var29.NnUuNNU = C00OOC00oO(C00OOC00oO((this.nNvNUVU - 0.38F - var45 * 0.035F) / 0.74F, 0.0F, 1.0F));
         var29.UvUvUNuvNU = this.C00OOC00oO(var29.uUnuvNvvNU);
         var29.UnUNuUU = false;
         var29.UvnvNVnnnnNU = var29.uUnuvNvvNU == uNuVuVnNnu.NVnVnNnN.REFRESH ? this.C00OOC00oO(0) : 0.0F;
         this.UuUVuuUu(var29, var5, var6);
      }
   }

   private float C00OOC00oO(int var1) {
      float var2 = this.nNvNUVU - this.UNvvunVVn - var1 * 0.055F;
      if (!(var2 < 0.0F) && !(var2 > 0.86F)) {
         float var3 = C00OOC00oO(var2 / 0.86F, 0.0F, 1.0F);
         return (float)Math.sin(var3 * Math.PI) * C00OOC00oO(1.0F - var3 * 0.42F);
      } else {
         return 0.0F;
      }
   }

   private void UuUVuuUu(uNuVuVnNnu.VvunVVUvUNnv var1, float var2, float var3) {
      float var4 = UuUVuuUu(this.UnUNuUU, this.uUVuVvuNUvnu, var1.uNNnnnuuuN, var1.nuUnNvnuUu, var1.uVUuuVnNVU, var1.vuuuNvNuv, var1.nvUVNnuu);
      boolean var5 = var4 <= 0.0F;
      float var6 = var1.uUnuvNvvNU == uNuVuVnNnu.NVnVnNnN.SERVER ? 42.0F * var3 : 24.0F * var3;
      float var7 = 1.0F - C00OOC00oO(C00OOC00oO(Math.max(0.0F, var4) / Math.max(1.0F, var6), 0.0F, 1.0F));
      float var8 = var1.UnUNuUU ? 0.42F : 0.0F;
      float var9 = var1.UvUvUNuvNU ? Math.max(var7, var8) : 0.0F;
      float var10 = var1.UvUvUNuvNU && var5 ? 1.0F : var8 * 0.45F;
      var1.UuuNnUvUuv = var1.UuuNnUvUuv + (var10 - var1.UuuNnUvUuv) * (1.0F - (float)Math.pow(1.1E-4F, var2));
      var1.nUUVuvU = var1.nUUVuvU + (var9 - var1.nUUVuvU) * (1.0F - (float)Math.pow(1.6E-4F, var2));
      var1.UnUNVVVNuv = var1.UnUNVVVNuv + (0.0F - var1.UnUNVVVNuv) * (1.0F - (float)Math.pow(1.8E-5F, var2));
      var1.vNVuvnUUnuUn = var1.vNVuvnUUnuUn + (0.0F - var1.vNVuvnUUnuUn) * (1.0F - (float)Math.pow(6.0E-6F, var2));
      float var11 = C00OOC00oO((this.VVnVNnunVvu - var1.uNNnnnuuuN) / Math.max(1.0F, var1.uVUuuVnNVU), 0.0F, 1.0F);
      float var12 = C00OOC00oO((this.unNNVVNnvvV - var1.nuUnNvnuUu) / Math.max(1.0F, var1.vuuuNvNuv), 0.0F, 1.0F);
      float var13 = 1.0F - (float)Math.pow(2.5E-4F, var2);
      var1.NVNnnvnuunNv = var1.NVNnnvnuunNv + (var11 - var1.NVNnnvnuunNv) * var13;
      var1.uVunuUNVVUUV = var1.uVunuUNVVUUV + (var12 - var1.uVunuUNVVUUV) * var13;
      float var14 = 1.0F
         + var1.nUUVuvU * (var1.uUnuvNvvNU == uNuVuVnNnu.NVnVnNnN.SERVER ? 0.034F : 0.042F)
         + (var1.UnUNuUU ? 0.008F : 0.0F)
         + var1.UvnvNVnnnnNU * 0.018F
         - var1.UnUNVVVNuv * 0.065F;
      var1.uVUVnuvnuVuv = var1.vVvUvVVuuNvV.UuUVuuUu(var14, var2);
      float var15 = (1.0F - var1.NnUuNNU) * (var1.uUnuvNvvNU == uNuVuVnNnu.NVnVnNnN.SERVER ? 18.0F : 11.0F) * var3;
      float var16 = (var1.NVNnnvnuunNv - 0.5F) * (var1.uUnuvNvvNU == uNuVuVnNnu.NVnVnNnN.SERVER ? 9.5F : 6.5F) * var3 * var1.nUUVuvU;
      float var17 = (var1.uVunuUNVVUUV - 0.5F) * (var1.uUnuvNvvNU == uNuVuVnNnu.NVnVnNnN.SERVER ? 5.5F : 4.0F) * var3 * var1.nUUVuvU
         - var1.UuuNnUvUuv * 1.2F * var3
         + var15
         - var1.UvnvNVnnnnNU * (var1.uUnuvNvvNU == uNuVuVnNnu.NVnVnNnN.SERVER ? 5.0F : 2.5F) * var3;
      var1.VVuuUN = var1.uNNnnnuuuN + var16;
      var1.vNUvnnVnUvu = var1.nuUnNvnuUu + var17;
      var1.UNnVVNvvnVvU = C00OOC00oO(
         C00OOC00oO(this.NuunnvnN, this.NVUunUNUN) * 0.46F * var1.nUUVuvU + Math.abs(var1.vVvUvVVuuNvV.C00OOC00oO()) * 0.032F + var1.UvnvNVnnnnNU * 0.22F,
         0.0F,
         1.0F
      );
   }

   private void UuUVuuUu(int var1, int var2, int var3, float var4, float var5, long var6) {
      float var8 = Math.max(0.0F, (float)(var6 - this.uNnUnnuNUnNu) / 1.0E9F);
      float var9 = C00OOC00oO(C00OOC00oO(this.NuunnvnN, this.NVUunUNUN), 0.0F, 3.0F);
      float var10 = Math.max((float)Math.exp(-var8 * 1.35F), C00OOC00oO(var9 * 0.28F, 0.0F, 1.0F));
      float var11 = C00OOC00oO(C00OOC00oO(this.nNvNUVU / 0.95F, 0.0F, 1.0F));
      float var12 = UuUVuuUu(var1, var2);
      float var13 = 0.0F;
      int var14 = 0;

      for (uNuVuVnNnu.VvunVVUvUNnv var16 : this.UuuNnUvUuv) {
         if (var16.uUVuVvuNUvnu && !(var16.NnUuNNU <= 0.01F)) {
            var13 = Math.max(var13, var16.vNVuvnUUnuUn);
            this.UuUVuuUu(var14++, var16);
         }
      }

      for (uNuVuVnNnu.VvunVVUvUNnv var20 : this.UnUNVVVNuv) {
         if (var20.uUVuVvuNUvnu) {
            var13 = Math.max(var13, var20.vNVuvnUUnuUn);
            this.UuUVuuUu(var14++, var20);
         }
      }

      this.vNUvnnVnUvu.uVUuuVnNVU(var14);

      for (int var19 = 0; var19 < 14; var19++) {
         uNuVuVnNnu.uunvUUVnuNn var21 = this.vNVuvnUUnuUn[var19];
         float var17 = Math.max(0.0F, this.nNvNUVU - var21.uUnuvNvvNU);
         this.vNUvnnVnUvu
            .vuuuNvNuv(var19)
            .UuUVuuUu(
               var21.UuUVuuUu / Math.max(1.0F, (float)var1), var21.C00OOC00oO / Math.max(1.0F, (float)var2), var17, var17 > 3.1F ? 0.0F : var21.vVvUvVVuuNvV
            );
      }

      this.vNUvnnVnUvu.vNUvnnVnUvu().UuUVuuUu(0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      this.vNUvnnVnUvu.UuUVuuUu(var1, var2, var3, this.nNvNUVU, this.nNvNUVU);
      this.vNUvnnVnUvu.UuUVuuUu(this.VVnVNnunVvu, this.unNNVVNnvvV, this.NuunnvnN, this.NVUunUNUN, var9, 0.0F);
      this.vNUvnnVnUvu.UuUVuuUu(this.vvUVNVvvNUv, this.UuNnnVnuNNV);
      this.vNUvnnVnUvu.C00OOC00oO(-var4 * 0.0011F, -var5 * 9.0E-4F, var4 * 1.25F * var12, var5 * 1.05F * var12, var4 * 1.55F * var12, var5 * 1.35F * var12);
      this.vNUvnnVnUvu.uUnuvNvvNU(var10, var10 > 0.08F ? 1.0F : 0.88F, 0.0F, 0.0F, var11, C00OOC00oO(var13, 0.0F, 1.0F));
      this.vNUvnnVnUvu
         .UuUVuuUu(
            this.uUVvnUuNvvN == NvVNvUvunNNu.SAKURA_BREEZE,
            this.uUVvnUuNvvN == NvVNvUvunNNu.VERNAL_SOLSTICE,
            this.uUVvnUuNvvN == NvVNvUvunNNu.MIDNIGHT_AZURE,
            this.UUuUnNVNuuv
         );
   }

   private void UuUVuuUu(int var1, uNuVuVnNnu.VvunVVUvUNnv var2) {
      float var3 = var2.UvUvUNuvNU ? var2.NnUuNNU : var2.NnUuNNU * 0.62F;
      this.vNUvnnVnUvu
         .UuUVuuUu(var1)
         .UuUVuuUu(
            var2.UuUVuuUu,
            var2.VVuuUN,
            var2.vNUvnnVnUvu,
            var2.uVUuuVnNVU,
            var2.vuuuNvNuv,
            var2.nvUVNnuu,
            var2.UuuNnUvUuv,
            var2.nUUVuvU,
            var2.UnUNVVVNuv,
            var3,
            var2.vNVuvnUUnuUn,
            var2.uNnUnnuNUnNu,
            var2.uVUVnuvnuVuv,
            var2.NVNnnvnuunNv,
            var2.uVunuUNVVUUV,
            var2.UNnVVNvvnVvU
         );
   }

   private void UuUVuuUu(VvVVnnNNNuV.VUuUUNnnuvuv var1) {
      try {
         ru.metaculture.protection.NVnVnNnN.uVUuuVnNVU();
         UnVNvNnU var2 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu();
         if (var2 == null) {
            return;
         }

         VvuuVNVUn.NVnVnNnN var3 = VvuuVNVUn.UuUVuuUu();

         try {
            var2.UuUVuuUu(var1.vuuuNvNuv(), var1.nvUVNnuu());
            float var4 = UuUVuuUu(var1.vuuuNvNuv(), var1.nvUVNnuu());
            float var5 = var1.vuuuNvNuv() * 0.5F + var1.vuvnUnVnUNnV() * 0.16F;
            float var6 = var1.nvUVNnuu() * 0.135F + var1.nnuUVNUuvvVU() * 0.1F;
            float var7 = C00OOC00oO(var1.vvUVNVvvNUv());
            var2.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var5, var6, 38.0F * var4, "Multiplayer", this.uUnuvNvvNU(0.92F * var7), "c");
            String var8 = this.nvUVNnuu.size() == 1 ? "1 saved server" : this.nvUVNnuu.size() + " saved servers";
            var2.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var5, var6 + 28.0F * var4, 25.0F * var4, var8 + "  /  " + this.VuunNUUUvu, this.vVvUvVVuuNvV(0.48F * var7), "c");
            var2.uUnuvNvvNU();
            var2.UuUVuuUu(
               this.UvNNVUVNVuvV - 15.0F * var4,
               this.NnunUUnU - 8.0F * var4,
               this.nvuVvuNnNUnv + 30.0F * var4,
               this.NnVnNVN + 16.0F * var4,
               0.0F,
               0.0F,
               0.0F,
               0.0F
            );

            for (uNuVuVnNnu.VvunVVUvUNnv var10 : this.UuuNnUvUuv) {
               if (var10.uUVuVvuNUvnu && var10.NnUuNNU > 0.01F) {
                  this.UuUVuuUu(var2, var10, var4);
               }
            }

            var2.uUnuvNvvNU();
            var2.nuUnNvnuUu();

            for (uNuVuVnNnu.VvunVVUvUNnv var18 : this.UnUNVVVNuv) {
               if (var18.uUVuVvuNUvnu) {
                  this.C00OOC00oO(var2, var18, var4);
               }
            }

            if (this.NvUVUvVVnUu) {
               float var17 = C00OOC00oO(var1.vvUVNVvvNUv());
               var2.UuUVuuUu(
                  this.o0Ooc0COOoc,
                  this.nvvnUnUn,
                  this.UnUUVuVunvVu,
                  this.nnvuvUNuUnN,
                  this.UnUUVuVunvVu * 0.5F,
                  this.UUuUnNVNuuv ? UuUVuuUu(0.0F, 0.0F, 0.0F, 0.045F * var17) : UuUVuuUu(1.0F, 1.0F, 1.0F, 0.05F * var17)
               );
               int var19 = UuUVuuUu(this.UuNnnVnuNNV, this.vvUVNVvvNUv, 0.5F, (this.vnvvNvUnVv ? 0.75F : 0.45F) * var17);
               var2.UuUVuuUu(this.o0Ooc0COOoc, this.UVnuVUUVnnU, this.UnUUVuVunvVu, this.VunnVNvNV, this.UnUUVuVunvVu * 0.5F, var19);
            }

            var2.C00OOC00oO();
         } finally {
            VvuuVNVUn.uUnuvNvvNU(var3);
         }
      } catch (Throwable var15) {
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, uNuVuVnNnu.VvunVVUvUNnv var2, float var3) {
      float var4 = var2.NnUuNNU * (var2.UvUvUNuvNU ? 1.0F : 0.58F);
      float var5 = 25.0F * var3;
      class_642 var6 = var2.nNvNUVU >= 0 && var2.nNvNUVU < this.nvUVNnuu.size() ? this.nvUVNnuu.get(var2.nNvNUVU) : null;
      float var7 = Math.min(var2.vuuuNvNuv * 0.62F, 54.0F * var3);
      float var8 = var2.VVuuUN + var5;
      float var9 = var2.vNUvnnVnUvu + var2.vuuuNvNuv * 0.5F - var7 * 0.5F;
      float var10 = var2.UnUNuUU ? 0.66F + 0.34F * (float)Math.sin(this.nNvNUVU * 2.1F) : 0.36F + 0.16F * var2.nUUVuvU;
      int var11 = UuUVuuUu(this.UuNnnVnuNNV, this.vvUVNVvvNUv, var10, (0.1F + var2.nUUVuvU * 0.16F + (var2.UnUNuUU ? 0.12F : 0.0F)) * var4);
      var1.UuUVuuUu(var8, var9, var7, var7, var7 * 0.32F, var11);
      if (var2.UvnvNVnnnnNU > 0.001F) {
         float var12 = var2.VVuuUN + 26.0F * var3;
         float var13 = var2.vNUvnnVnUvu + var2.vuuuNvNuv - 8.0F * var3;
         float var14 = (var2.uVUuuVnNVU - 52.0F * var3) * var2.UvnvNVnnnnNU;
         var1.UuUVuuUu(
            var12,
            var13,
            var14,
            2.4F * var3,
            1.2F * var3,
            UuUVuuUu(this.UuNnnVnuNNV, this.vvUVNVvvNUv, 0.5F + var2.UvnvNVnnnnNU * 0.25F, 0.42F * var4 * var2.UvnvNVnnnnNU)
         );
      }

      uNuVuVnNnu.nvnNNunvv var21 = var6 == null ? null : (this.vNVuvnUUnuUn() ? this.uNNnnnuuuN(var6) : this.vVvUvVVuuNvV(var6));
      int var22 = var21 == null ? 0 : var21.UuUVuuUu();
      if (var22 > 0) {
         var1.UuUVuuUu(var22, var8 + 2.0F * var3, var9 + 2.0F * var3, var7 - 4.0F * var3, var7 - 4.0F * var3, 0.0F, 0.0F, 1.0F, 1.0F, var7 * 0.25F);
         var1.UuUVuuUu(var8, var9, var7, var7, var7 * 0.32F, UuUVuuUu(1.0F, 1.0F, 1.0F, (0.032F + var2.nUUVuvU * 0.026F) * var4));
      } else {
         var1.UuUVuuUu(
            vNvnnVvvVUu.vNUvnnVnUvu,
            var8 + var7 * 0.5F,
            var9 + var7 * 0.72F,
            var7 * 0.82F,
            "w",
            this.UUuUnNVNuuv ? this.uUnuvNvvNU((0.72F + var2.nUUVuvU * 0.2F) * var4) : UuUVuuUu(1.0F, 1.0F, 1.0F, (0.72F + var2.nUUVuvU * 0.2F) * var4),
            "c"
         );
      }

      float var23 = var8 + var7 + 18.0F * var3;
      String var15 = var6 != null ? this.C00OOC00oO(var6) : "";
      float var16 = var2.UvUvUNuvNU ? Math.max(72.0F * var3, UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var15, 24.0F * var3).UuUVuuUu + 24.0F * var3) : 0.0F;
      float var17 = var2.UvUvUNuvNU ? var16 + 48.0F * var3 : 80.0F * var3;
      float var18 = var2.uVUuuVnNVU - (var23 - var2.VVuuUN) - var17;
      String var19 = UuUVuuUu(var2.UuUVuuUu, var18, 25.0F * var3, vNvnnVvvVUu.vVvUvVVuuNvV);
      String var20 = UuUVuuUu(var2.C00OOC00oO, var18, 22.0F * var3, vNvnnVvvVUu.UuUVuuUu);
      var1.UuUVuuUu(
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var23,
         var2.vNUvnnVnUvu + var2.vuuuNvNuv * 0.5F - 6.0F * var3,
         25.0F * var3,
         var19,
         this.uUnuvNvvNU((0.88F + var2.nUUVuvU * 0.08F) * var4)
      );
      var1.UuUVuuUu(
         vNvnnVvvVUu.UuUVuuUu,
         var23,
         var2.vNUvnnVnUvu + var2.vuuuNvNuv * 0.5F + 12.0F * var3,
         22.0F * var3,
         "IP: " + var20,
         this.vVvUvVVuuNvV((0.4F + var2.nUUVuvU * 0.18F) * var4)
      );
      if (var2.UvUvUNuvNU && var6 != null) {
         this.UuUVuuUu(var1, var2, var6, var3, var4);
      }
   }

   private void C00OOC00oO(UnVNvNnU var1, uNuVuVnNnu.VvunVVUvUNnv var2, float var3) {
      float var4 = var2.NnUuNNU * (var2.UvUvUNuvNU ? 0.88F : 0.28F);
      float var5 = var2.VVuuUN + var2.uVUuuVnNVU * 0.5F;
      float var6 = var2.vNUvnnVnUvu + var2.vuuuNvNuv * 0.5F;
      var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var5, var6 + 4.0F * var3, 26.0F * var3, var2.UuUVuuUu, this.uUnuvNvvNU(var4), "c");
   }

   private void UuUVuuUu(UnVNvNnU var1, uNuVuVnNnu.VvunVVUvUNnv var2, class_642 var3, float var4, float var5) {
      String var6 = this.C00OOC00oO(var3);
      float var7 = 24.0F * var4;
      float var8 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var6, 24.0F * var4).UuUVuuUu;
      float var9 = Math.max(48.0F * var4, var8 + 16.0F * var4);
      float var10 = var2.VVuuUN + var2.uVUuuVnNVU - 24.0F * var4;
      float var11 = var10 - var9;
      float var12 = var2.vNUvnnVnUvu + var2.vuuuNvNuv * 0.5F - var7 * 0.5F;
      var1.UuUVuuUu(
         var11,
         var12,
         var9,
         var7,
         var7 * 0.45F,
         this.UUuUnNVNuuv
            ? UuUVuuUu(1.0F, 1.0F, 1.0F, (0.54F + var2.nUUVuvU * 0.12F) * var5)
            : UuUVuuUu(0.018F, 0.022F, 0.028F, (0.44F + var2.nUUVuvU * 0.1F) * var5)
      );
      var1.UuUVuuUu(
         vNvnnVvvVUu.UuUVuuUu, var11 + var9 * 0.5F, var12 + var7 * 0.66F, 24.0F * var4, var6, this.UuUVuuUu(var3, (0.72F + var2.nUUVuvU * 0.18F) * var5), "c"
      );
   }

   private String UuUVuuUu(class_642 var1) {
      if (var1.method_55825() == class_9083.field_47881) {
         return "Pinging server...";
      } else if (var1.method_55825() == class_9083.field_47882) {
         return var1.field_3757 == null ? "Server is offline" : var1.field_3757.getString();
      } else if (var1.method_55825() == class_9083.field_47883 && var1.field_3760 != null) {
         return "Version: " + var1.field_3760.getString();
      } else {
         return var1.field_3757 != null && !var1.field_3757.getString().isBlank() ? var1.field_3757.getString().replace('\n', ' ') : "Waiting for response";
      }
   }

   private String C00OOC00oO(class_642 var1) {
      if (var1.method_55825() == class_9083.field_47881) {
         return this.vuuuNvNuv();
      } else {
         String var2 = this.UuUVuuUu(var1.field_3753);
         if (var1.field_41861 == null || var1.field_41861.comp_1279() <= 0 && var1.field_41861.comp_1280() <= 0) {
            if (this.UuUVuuUu(var2)) {
               return var2;
            } else {
               return var1.field_41861 != null ? var1.field_41861.comp_1280() + "/" + var1.field_41861.comp_1279() : "-";
            }
         } else {
            return var1.field_41861.comp_1280() + "/" + var1.field_41861.comp_1279();
         }
      }
   }

   private String vuuuNvNuv() {
      int var1 = 1 + (int)(this.nNvNUVU * 6.0F) % 3;
      return ".".repeat(var1);
   }

   private String UuUVuuUu(class_2561 var1) {
      if (var1 == null) {
         return "";
      } else {
         String var2 = var1.getString();
         StringBuilder var3 = null;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var2.length();

         while (var5 < var6 && Character.isWhitespace(var2.charAt(var5))) {
            var5++;
         }

         while (var6 > var5 && Character.isWhitespace(var2.charAt(var6 - 1))) {
            var6--;
         }

         for (int var7 = var5; var7 < var6; var7++) {
            char var8 = var2.charAt(var7);
            boolean var9 = Character.isWhitespace(var8);
            if (var9) {
               if (!var4) {
                  if (var3 == null) {
                     var3 = new StringBuilder(var2.length());
                     var3.append(var2, var5, var7);
                  }

                  var3.append(' ');
                  var4 = true;
               }
            } else {
               if (var3 != null) {
                  var3.append(var8);
               }

               var4 = false;
            }
         }

         return var3 == null ? var2.substring(var5, var6) : var3.toString();
      }
   }

   private boolean UuUVuuUu(String var1) {
      if (var1 != null && !var1.isBlank()) {
         String var2 = var1.trim();
         return !var2.equals("-") && !var2.equals("?") && !var2.equals("???") && !var2.equals("...");
      } else {
         return false;
      }
   }

   private String uUnuvNvvNU(class_642 var1) {
      if (var1.method_55825() == class_9083.field_47881) {
         return "ping";
      } else if (var1.field_3758 >= 0L) {
         return var1.field_3758 + " ms";
      } else {
         return var1.method_55825() == class_9083.field_47882 ? "offline" : "-";
      }
   }

   private int UuUVuuUu(class_642 var1, float var2) {
      return switch (var1.method_55825()) {
         case field_47884 -> UuUVuuUu(this.UuNnnVnuNNV, this.vvUVNVvvNUv, 0.35F + 0.25F * (float)Math.sin(this.nNvNUVU * 1.6F), 0.82F * var2);
         case field_47881 -> UuUVuuUu(0.68F, 0.76F, 0.84F, 0.62F * var2);
         case field_47883 -> UuUVuuUu(1.0F, 0.7F, 0.36F, 0.72F * var2);
         case field_47882 -> UuUVuuUu(1.0F, 0.32F, 0.36F, 0.72F * var2);
         case field_47880 -> UuUVuuUu(0.58F, 0.64F, 0.7F, 0.54F * var2);
         default -> throw new MatchException(null, null);
      };
   }

   private void UuUVuuUu(uNuVuVnNnu.NVnVnNnN var1) {
      class_310 var2 = this.field_22787 == null ? class_310.method_1551() : this.field_22787;
      if (var2 != null) {
         switch (var1) {
            case SERVER:
            default:
               break;
            case JOIN:
               var2.execute(this::nvUVNnuu);
               break;
            case DIRECT:
               var2.execute(() -> this.UuUVuuUu(var2));
               break;
            case ADD:
               var2.execute(() -> this.C00OOC00oO(var2));
               break;
            case EDIT:
               var2.execute(() -> this.uUnuvNvvNU(var2));
               break;
            case DELETE:
               var2.execute(() -> this.vVvUvVVuuNvV(var2));
               break;
            case PROXY:
               var2.execute(() -> var2.method_1507(new UUnnuuNNvVV(this)));
               break;
            case REFRESH:
               this.uNNnnnuuuN();
               break;
            case BACK:
               var2.execute(() -> var2.method_1507(this.nuUnNvnuUu));
         }
      }
   }

   private void nvUVNnuu() {
      class_310 var1 = this.field_22787 == null ? class_310.method_1551() : this.field_22787;
      class_642 var2 = this.UuuNnUvUuv();
      if (var1 != null && var2 != null && var2.field_3761 != null && !var2.field_3761.isBlank()) {
         this.VuunNUUUvu = "Resolving address...";
         CompletableFuture.<class_639>supplyAsync(() -> class_639.method_2950(var2.field_3761), class_156.method_18349())
            .whenComplete((var3, var4) -> var1.execute(() -> {
               if (var4 == null && var3 != null) {
                  class_412.method_36877(this, var1, var3, var2, false, null);
               } else {
                  this.VuunNUUUvu = "Invalid server address";
               }
            }));
      } else {
         this.VuunNUUUvu = "Select a server";
      }
   }

   private void UuUVuuUu(class_310 var1) {
      class_642 var2 = new class_642("Direct Server", "", class_8678.field_45611);
      var1.method_1507(
         new class_420(
            this,
            var3 -> {
               if (var3) {
                  this.VuunNUUUvu = "Resolving address...";
                  CompletableFuture.<class_639>supplyAsync(() -> class_639.method_2950(var2.field_3761), class_156.method_18349())
                     .whenComplete((var3x, var4) -> var1.execute(() -> {
                        if (var4 == null && var3x != null) {
                           class_412.method_36877(this, var1, var3x, var2, false, null);
                        } else {
                           this.VuunNUUUvu = "Invalid server address";
                           var1.method_1507(this);
                        }
                     }));
               } else {
                  var1.method_1507(this);
               }
            },
            var2
         )
      );
   }

   private void C00OOC00oO(class_310 var1) {
      class_642 var2 = new class_642("Minecraft Server", "", class_8678.field_45611);
      var1.method_1507(new class_422(this, var3 -> {
         if (var3 && this.NVNnnvnuunNv != null) {
            try {
               this.NVNnnvnuunNv.method_2988(var2, false);
               this.nvUVNnuu.add(var2);
               this.uUnuvNvvNU();
               this.NVuNUuVnVUN = this.NVNnnvnuunNv.method_2984() - 1;
               this.VuunNUUUvu = "Server added";
            } catch (Throwable var5) {
               this.VuunNUUUvu = "Failed to add server";
            }
         }

         var1.method_1507(this);
      }, var2));
   }

   private void uUnuvNvvNU(class_310 var1) {
      class_642 var2 = this.UuuNnUvUuv();
      if (var2 != null && this.NVNnnvnuunNv != null && this.NVuNUuVnVUN >= 0 && this.NVuNUuVnVUN < this.NVNnnvnuunNv.method_2984()) {
         int var3 = this.NVuNUuVnVUN;
         class_642 var4 = new class_642(var2.field_3752, var2.field_3761, var2.method_55616());
         var4.method_2996(var2);
         var1.method_1507(new class_422(this, var4x -> {
            if (var4x && this.NVNnnvnuunNv != null && var3 >= 0 && var3 < this.NVNnnvnuunNv.method_2984()) {
               try {
                  this.NVNnnvnuunNv.method_2980(var3, var4);
                  if (var3 < this.nvUVNnuu.size()) {
                     this.nvUVNnuu.set(var3, var4);
                  }

                  this.uUnuvNvvNU();
                  this.NVuNUuVnVUN = var3;
                  this.VuunNUUUvu = "Server updated";
               } catch (Throwable var6) {
                  this.VuunNUUUvu = "Failed to save changes";
               }
            }

            var1.method_1507(this);
         }, var4));
      } else {
         this.VuunNUUUvu = "Select a server";
      }
   }

   private void vVvUvVVuuNvV(class_310 var1) {
      class_642 var2 = this.UuuNnUvUuv();
      if (var2 != null && this.NVNnnvnuunNv != null) {
         String var3 = UuUVuuUu(var2.field_3752, "Unnamed server");
         var1.method_1507(new class_410(var3x -> {
            if (var3x && this.NVNnnvnuunNv != null) {
               try {
                  this.NVNnnvnuunNv.method_2983(var2);
                  this.nvUVNnuu.remove(var2);
                  this.uUnuvNvvNU();
                  this.NVuNUuVnVUN = Math.min(this.NVuNUuVnVUN, Math.max(0, this.NVNnnvnuunNv.method_2984() - 1));
                  if (this.NVNnnvnuunNv.method_2984() == 0) {
                     this.NVuNUuVnVUN = -1;
                  }

                  this.VuunNUUUvu = "Server deleted";
               } catch (Throwable var5) {
                  this.VuunNUUUvu = "Failed to delete server";
               }
            }

            var1.method_1507(this);
         }, class_2561.method_43470("Delete server?"), class_2561.method_43470(var3)));
      } else {
         this.VuunNUUUvu = "Select a server";
      }
   }

   private class_642 UuuNnUvUuv() {
      return this.NVuNUuVnVUN >= 0 && this.NVuNUuVnVUN < this.nvUVNnuu.size() ? this.nvUVNnuu.get(this.NVuNUuVnVUN) : null;
   }

   private void nUUVuvU() {
      class_642 var1 = this.UuuNnUvUuv();
      if (var1 != null && var1.field_3761 != null && !var1.field_3761.isBlank()) {
         class_310 var2 = this.field_22787 == null ? class_310.method_1551() : this.field_22787;
         if (var2 != null && var2.field_1774 != null) {
            var2.field_1774.method_1455(var1.field_3761);
            this.VuunNUUUvu = "IP copied: " + var1.field_3761;
         }
      } else {
         this.VuunNUUUvu = "Select a server";
      }
   }

   private void uUnuvNvvNU(int var1) {
      if (this.NVNnnvnuunNv != null && this.NVuNUuVnVUN >= 0 && this.NVuNUuVnVUN < this.nvUVNnuu.size()) {
         int var2 = this.NVuNUuVnVUN + var1;
         if (var2 >= 0 && var2 < this.nvUVNnuu.size() && var2 < this.NVNnnvnuunNv.method_2984()) {
            try {
               class_642 var3 = this.NVNnnvnuunNv.method_2982(this.NVuNUuVnVUN);
               class_642 var4 = this.NVNnnvnuunNv.method_2982(var2);
               this.NVNnnvnuunNv.method_2980(this.NVuNUuVnVUN, var4);
               this.NVNnnvnuunNv.method_2980(var2, var3);
               Collections.swap(this.nvUVNnuu, this.NVuNUuVnVUN, var2);
               this.uUnuvNvvNU();
               this.NVuNUuVnVUN = var2;
               this.VuunNUUUvu = "Server moved";
               this.UnUNVVVNuv();
            } catch (Throwable var5) {
               this.VuunNUUUvu = "Failed to move server";
            }
         }
      } else {
         this.VuunNUUUvu = "Select a server";
      }
   }

   private boolean C00OOC00oO(uNuVuVnNnu.NVnVnNnN var1) {
      boolean var2 = this.UuuNnUvUuv() != null;

      return switch (var1) {
         case SERVER -> false;
         case JOIN, EDIT, DELETE -> var2;
         case DIRECT, ADD, PROXY, REFRESH, BACK -> true;
      };
   }

   private void vVvUvVVuuNvV(int var1) {
      if (this.nvUVNnuu.isEmpty()) {
         this.NVuNUuVnVUN = -1;
         this.VuunNUUUvu = "No saved servers";
      } else {
         this.NVuNUuVnVUN = UuUVuuUu(this.NVuNUuVnVUN + var1, 0, this.nvUVNnuu.size() - 1);
         this.VuunNUUUvu = "Ready";
         this.UnUNVVVNuv();
      }
   }

   private void UnUNVVVNuv() {
      if (this.NVuNUuVnVUN >= 0) {
         if (this.NVuNUuVnVUN < this.NVuunNnvvvVu) {
            this.NVuunNnvvvVu = this.NVuNUuVnVUN;
         }

         if (this.NVuNUuVnVUN > this.NVuunNnvvvVu + this.VUuuVUnun - 1.0F) {
            this.NVuunNnvvvVu = this.NVuNUuVnVUN - this.VUuuVUnun + 1;
         }

         int var1 = Math.max(0, this.nvUVNnuu.size() - Math.max(1, this.VUuuVUnun));
         this.NVuunNnvvvVu = C00OOC00oO(this.NVuunNnvvvVu, 0.0F, (float)var1);
      }
   }

   private uNuVuVnNnu.nvnNNunvv vVvUvVVuuNvV(class_642 var1) {
      byte[] var2 = var1.method_49306();
      if (var2 != null && var2.length != 0) {
         String var3 = this.UuUVuuUu(var1, var2);
         uNuVuVnNnu.nvnNNunvv var4 = this.nUUVuvU.get(var3);
         if (var4 != null) {
            return var4;
         } else {
            try {
               class_1011 var5 = class_1011.method_49277(var2);
               class_1043 var6 = new class_1043(() -> "wild_server_icon", var5);
               var6.method_4527(true, false);
               var6.method_4524();
               uNuVuVnNnu.nvnNNunvv var7 = new uNuVuVnNnu.nvnNNunvv(var6);
               this.nUUVuvU.put(var3, var7);
               return var7;
            } catch (Throwable var8) {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   private uNuVuVnNnu.nvnNNunvv uNNnnnuuuN(class_642 var1) {
      byte[] var2 = var1.method_49306();
      return var2 != null && var2.length != 0 ? this.nUUVuvU.get(this.UuUVuuUu(var1, var2)) : null;
   }

   private boolean vNVuvnUUnuUn() {
      return System.nanoTime() - this.UnvuVuVnNuvu < 180000000L || Math.abs(this.NVuunNnvvvVu - this.vNnNuuvVn) > 0.06F;
   }

   private String UuUVuuUu(class_642 var1, byte[] var2) {
      return UuUVuuUu(var1.field_3761, "") + ":" + Arrays.hashCode(var2);
   }

   private void UvnvNVnnnnNU() {
      for (uNuVuVnNnu.nvnNNunvv var2 : this.nUUVuvU.values()) {
         var2.close();
      }

      this.nUUVuvU.clear();
   }

   private float UuUVuuUu(class_1041 var1, double var2) {
      return (float)(var2 * var1.method_4489() / Math.max(1.0, (double)var1.method_4486()));
   }

   private float C00OOC00oO(class_1041 var1, double var2) {
      return (float)(var2 * var1.method_4506() / Math.max(1.0, (double)var1.method_4502()));
   }

   private static String UuUVuuUu(String var0, String var1) {
      return var0 != null && !var0.isBlank() ? var0 : var1;
   }

   private static String UuUVuuUu(String var0, float var1, float var2, nUVnuvUu var3) {
      if (var0 == null) {
         return "";
      } else if (var1 <= 0.0F) {
         return "";
      } else if (UnVNvNnU.UuUVuuUu(var3, var0, var2).UuUVuuUu <= var1) {
         return var0;
      } else {
         String var4 = "...";
         if (UnVNvNnU.UuUVuuUu(var3, var4, var2).UuUVuuUu > var1) {
            return "";
         } else {
            int var5 = 1;
            int var6 = var0.length();
            int var7 = 1;

            while (var5 <= var6) {
               int var8 = var5 + var6 >>> 1;
               if (UnVNvNnU.UuUVuuUu(var3, var0.substring(0, var8) + var4, var2).UuUVuuUu <= var1) {
                  var7 = var8;
                  var5 = var8 + 1;
               } else {
                  var6 = var8 - 1;
               }
            }

            return var0.substring(0, var7) + var4;
         }
      }
   }

   private static float UuUVuuUu(float var0, float var1) {
      return C00OOC00oO(Math.min(var0 / 1920.0F, var1 / 1080.0F) * 1.08F, 0.62F, 1.2F);
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

   private static float C00OOC00oO(float var0, float var1) {
      return (float)Math.sqrt(var0 * var0 + var1 * var1);
   }

   private static float C00OOC00oO(float var0) {
      float var1 = C00OOC00oO(var0, 0.0F, 1.0F);
      return var1 * var1 * var1 * (var1 * (var1 * 6.0F - 15.0F) + 10.0F);
   }

   private static float C00OOC00oO(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   private static int UuUVuuUu(int var0, int var1, int var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   private static float uNNnnnuuuN(int var0) {
      return (var0 >> 16 & 0xFF) / 255.0F;
   }

   private static float nuUnNvnuUu(int var0) {
      return (var0 >> 8 & 0xFF) / 255.0F;
   }

   private static float VVuuUN(int var0) {
      return (var0 & 0xFF) / 255.0F;
   }

   private int uUnuvNvvNU(float var1) {
      return this.UUuUnNVNuuv ? UuUVuuUu(0.1F, 0.1F, 0.1F, var1) : UuUVuuUu(1.0F, 1.0F, 1.0F, var1);
   }

   private int vVvUvVVuuNvV(float var1) {
      return this.UUuUnNVNuuv ? UuUVuuUu(0.4F, 0.4F, 0.4F, var1) : UuUVuuUu(0.78F, 0.84F, 0.88F, var1);
   }

   private static int UuUVuuUu(float var0, float var1, float var2, float var3) {
      int var4 = Math.round(C00OOC00oO(var0, 0.0F, 1.0F) * 255.0F);
      int var5 = Math.round(C00OOC00oO(var1, 0.0F, 1.0F) * 255.0F);
      int var6 = Math.round(C00OOC00oO(var2, 0.0F, 1.0F) * 255.0F);
      int var7 = Math.round(C00OOC00oO(var3, 0.0F, 1.0F) * 255.0F);
      return var7 << 24 | var4 << 16 | var5 << 8 | var6;
   }

   private static int UuUVuuUu(int var0, int var1, float var2, float var3) {
      float var4 = C00OOC00oO(var2, 0.0F, 1.0F);
      int var5 = VnVnuUn.vVvUvVVuuNvV(var0, var1, var4);
      int var6 = Math.round(C00OOC00oO(var3, 0.0F, 1.0F) * 255.0F);
      return var6 << 24 | var5;
   }

   static enum NVnVnNnN {
      SERVER,
      JOIN,
      DIRECT,
      ADD,
      EDIT,
      DELETE,
      PROXY,
      REFRESH,
      BACK;
   }

   static final class VvunVVUvUNnv {
      String UuUVuuUu;
      String C00OOC00oO = "";
      final uNuVuVnNnu.NVnVnNnN uUnuvNvvNU;
      final vVnuUUVvvnV vVvUvVVuuNvV = new vVnuUUVvvnV(Cc0cOoOcC0o.uNNnnnuuuN());
      float uNNnnnuuuN;
      float nuUnNvnuUu;
      float VVuuUN;
      float vNUvnnVnUvu;
      float uVUuuVnNVU;
      float vuuuNvNuv;
      float nvUVNnuu;
      float UuuNnUvUuv;
      float nUUVuvU;
      float UnUNVVVNuv;
      float vNVuvnUUnuUn;
      float UvnvNVnnnnNU;
      float uVUVnuvnuVuv = 1.0F;
      float NVNnnvnuunNv = 0.5F;
      float uVunuUNVVUUV = 0.5F;
      float UNnVVNvvnVvU;
      float uNnUnnuNUnNu;
      float NnUuNNU;
      int nNvNUVU = -1;
      boolean UnUNuUU;
      boolean uUVuVvuNUvnu;
      boolean UvUvUNuvNU = true;

      VvunVVUvUNnv(String var1, uNuVuVnNnu.NVnVnNnN var2) {
         this.UuUVuuUu = var1;
         this.uUnuvNvvNU = var2;
      }

      void UuUVuuUu() {
         this.UuuNnUvUuv = 0.0F;
         this.nUUVuvU = 0.0F;
         this.UnUNVVVNuv = 0.0F;
         this.vNVuvnUUnuUn = 0.0F;
         this.UvnvNVnnnnNU = 0.0F;
         this.uVUVnuvnuVuv = 1.0F;
         this.NVNnnvnuunNv = 0.5F;
         this.uVunuUNVVUUV = 0.5F;
         this.UNnVVNvvnVvU = 0.0F;
         this.NnUuNNU = 0.0F;
         this.UnUNuUU = false;
         this.uUVuVvuNUvnu = false;
         this.UvUvUNuvNU = true;
         this.vVvUvVVuuNvV.UuUVuuUu(1.0F);
      }

      boolean UuUVuuUu(float var1, float var2) {
         return uNuVuVnNnu.UuUVuuUu(var1, var2, this.uNNnnnuuuN, this.nuUnNvnuUu, this.uVUuuVnNVU, this.vuuuNvNuv, this.nvUVNnuu) <= 0.0F;
      }
   }

   static final class nvnNNunvv implements AutoCloseable {
      private final class_1043 UuUVuuUu;

      nvnNNunvv(class_1043 var1) {
         this.UuUVuuUu = var1;
      }

      int UuUVuuUu() {
         return this.UuUVuuUu.method_68004() instanceof class_10868 var1 ? var1.method_68427() : 0;
      }

      @Override
      public void close() {
         this.UuUVuuUu.close();
      }
   }

   static final class uunvUUVnuNn {
      float UuUVuuUu;
      float C00OOC00oO;
      float uUnuvNvvNU = -100.0F;
      float vVvUvVVuuNvV;
   }
}
