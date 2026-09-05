package ru.metaculture.protection;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaInfo;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_10868;
import net.minecraft.class_2960;

@vuUuvvvNnVV(
   UuUVuuUu = "MusicPlayer",
   C00OOC00oO = "w"
)
public final class VVVVUN extends nnvNuuNvvuu {
   private static final VVVVUN UuUVuuUu = new VVVVUN();
   private static final String c0oOOCcCoC0 = "Ожидание...";
   private static final String VVnVNnunVvu = "Нет данных";
   private static final long unNNVVNnvvV = 160L;
   private static final VVnnnnN NuunnvnN = new VVnnnnN();
   private static final ExecutorService NVUunUNUN = Executors.newSingleThreadExecutor(var0 -> {
      Thread var1 = new Thread(var0, "Wild-Media-Fetch");
      var1.setDaemon(true);
      return var1;
   });
   private volatile String UUVNuUNUvUnV = "Ожидание...";
   private volatile String vuvnUnVnUNnV = "Нет данных";
   private volatile boolean nnuUVNUuvvVU = false;
   private volatile double nVVUuvuNnUN = 0.0;
   private volatile long nNnVnUNVV = 0L;
   private volatile long nuunNvv = 0L;
   private volatile long uUVVvVVNvvn = 0L;
   private volatile long vvUVNVvvNUv = 10000000L;
   private volatile long UuNnnVnuNNV = 0L;
   private volatile boolean uUVvnUuNvvN = false;
   private volatile double UUuUnNVNuuv = 0.0;
   private final VVnnnnN NVuNUuVnVUN = new VVnnnnN();
   private volatile float NVuunNnvvvVu = 0.0F;
   private volatile float vNnNuuvVn = 0.0F;
   private volatile float VUuuVUnun = 0.0F;
   private volatile float vVVuuVVv = 0.0F;
   private volatile byte[] VuunNUUUvu = null;
   private volatile int NNUUNUuVNNVn = 0;
   private volatile boolean VvVvnNUnvuvV = false;
   private int ccOO0COcoco0 = Integer.MIN_VALUE;
   private int NUVvUUVuVNVv = -1;
   private class_2960 nNuVunNUVu = null;
   private volatile int UNvvunVVn = 0;
   private volatile int UnvuVuVnNuvu = 0;
   private MediaPlayerInfo UvNNVUVNVuvV;
   private long NnunUUnU = 0L;
   private static boolean nvuVvuNnNUnv = false;
   private final AtomicBoolean NnVnNVN = new AtomicBoolean(false);
   private final AtomicReference<VVVVUN.NVnVnNnN> vnvvNvUnVv = new AtomicReference<>();
   private final VVnnnnN OCOocoOoOO = new VVnnnnN();

   private VVVVUN() {
      uNvNvUNUnuu.UuUVuuUu(this);
   }

   public static VVVVUN C00OOC00oO() {
      return UuUVuuUu;
   }

   public static void UuUVuuUu(UnVNvNnU var0) {
      UuUVuuUu.C00OOC00oO(var0);
   }

   public static void UvnvNVnnnnNU() {
      NVUunUNUN.shutdownNow();
      UuUVuuUu.vnvvNvUnVv.set(null);
      UuUVuuUu.NnVnNVN.set(false);
   }

   public void C00OOC00oO(UnVNvNnU var1) {
      if (O000c0oocoo.a_.field_1724 != null) {
         NuunnvnN.UuUVuuUu();
         NuunnvnN.UuUVuuUu(1.0, 0.22F, VvVUUNUu.UnUNVVVNuv, false);
         float var2 = NuunnvnN.uNNnnnuuuN();
         if (!(var2 <= 0.01F)) {
            float var3 = nNuUNVu.UuUVuuUu().VVuuUN();
            float var4 = nNuUNVu.UuUVuuUu().vNUvnnVnUvu();
            boolean var5 = nNuUNVu.UuUVuuUu().vuuuNvNuv();
            boolean var6 = nNuUNVu.UuUVuuUu().uVUuuVnNVU();
            if (var5 && this.VUuuVUnun > 0.0F && this.UuUVuuUu(var3, var4, this.NVuunNnvvvVu - 4.0F, this.vNnNuuvVn, this.VUuuVUnun + 8.0F, this.vVVuuVVv)) {
               this.uUVvnUuNvvN = true;
            }

            if (this.uUVvnUuNvvN) {
               nNuUNVu.UuUVuuUu().C00OOC00oO();
            }

            this.uVUVnuvnuVuv();
            this.uVunuUNVVUUV();
            this.UNnVVNvvnVvU();
            float var7 = 7.0F;
            float var8 = 5.0F;
            float var9 = 160.0F;
            float var10 = 26.0F;
            float var11 = 24.0F;
            float var12 = var9 + var7 * 2.0F;
            float var13 = var7 + var9 + var8 + var10 + var8 + var11 + var7;
            nNuUNVu.nvnNNunvv var14 = nNuUNVu.UuUVuuUu().UuUVuuUu("HUD_MusicPlayer", 10.0F, 10.0F, var12, var13);
            float var15 = var14.C00OOC00oO;
            float var16 = var14.uUnuvNvvNU;
            float var17 = var14.vVvUvVVuuNvV;
            float var18 = var14.uNNnnnuuuN;
            float var19 = O000c0oocoo.a_.method_22683().method_4489();
            float var20 = O000c0oocoo.a_.method_22683().method_4506();
            if (var17 > 1.0F && var18 > 1.0F) {
               var15 = Math.max(2.0F, Math.min(var15, var19 - var17 - 2.0F));
               var16 = Math.max(2.0F, Math.min(var16, var20 - var18 - 2.0F));
            }

            this.UuUVuuUu(var15, var16, var17, var18);
            float var21 = var17 / Math.max(1.0F, var12);
            float var22 = var18 / Math.max(1.0F, var13);
            float var23 = Math.min(var21, var22);
            float var24 = var7 * var21;
            float var25 = var7 * var22;
            float var26 = var8 * var22;
            float var27 = var9 * var21;
            float var28 = var9 * var22;
            float var29 = var10 * var22;
            float var30 = var11 * var22;
            float var31 = var2 * this.uVunuUNVVUUV.uUnuvNvvNU();
            float var32 = this.vuuuNvNuv(var31);
            int var33 = (int)(255.0F * var31);
            int var34 = this.UuUVuuUu(var31);
            int var35 = this.C00OOC00oO(var31);
            int var36 = this.uUnuvNvvNU(var31);
            int var37 = this.vVvUvVVuuNvV(var31);
            int var38 = this.uNNnnnuuuN(var31);
            int var39 = this.nuUnNvnuUu(var31);
            int var40 = this.VVuuUN(var31);
            int var41 = this.uNnUnnuNUnNu.uUnuvNvvNU().equals("Светлый") ? var40 : VnVnuUn.uUnuvNvvNU(255, 255, 255, var33);
            boolean var42 = this.nvUVNnuu();
            float var43 = 14.0F;
            this.UuUVuuUu(var1, var15, var16, var17, var18, var43, var31);
            float var44 = var15 + var24;
            float var45 = var16 + var25;
            if (var42) {
               this.C00OOC00oO(var1, var44, var45, var27, var28, 11.0F, var31);
            }

            var1.UuUVuuUu(var44, var45, var27, var28, 11.0F, 11.0F, 4.0F, 4.0F);
            if (this.nNuVunNUVu != null) {
               int var46 = UuUVuuUu(this.nNuVunNUVu);
               if (var46 > 0) {
                  float var47 = 0.0F;
                  float var48 = 0.0F;
                  float var49 = 1.0F;
                  float var50 = 1.0F;
                  if (this.UNvvunVVn > 0 && this.UnvuVuVnNuvu > 0) {
                     if (this.UNvvunVVn > this.UnvuVuVnNuvu) {
                        float var51 = (float)this.UnvuVuVnNuvu / this.UNvvunVVn;
                        float var52 = (1.0F - var51) / 2.0F;
                        var47 = var52;
                        var49 = 1.0F - var52;
                     } else if (this.UnvuVuVnNuvu > this.UNvvunVVn) {
                        float var83 = (float)this.UNvvunVVn / this.UnvuVuVnNuvu;
                        float var85 = (1.0F - var83) / 2.0F;
                        var48 = var85;
                        var50 = 1.0F - var85;
                     }
                  }

                  var1.UuUVuuUu(var46, var44, var45, var27, var28, var47, var48, var49, var50);
               } else if (!var42) {
                  var1.UuUVuuUu(var44, var45, var27, var28, 0.0F, var35);
               }
            } else if (!var42) {
               var1.UuUVuuUu(var44, var45, var27, var28, 0.0F, var35);
            }

            float var78 = 90.0F * var22;
            float var79 = var45 + var28 - var78;
            var1.C00OOC00oO(
               var44, var79, var27, var78, 11.0F, 11.0F, 4.0F, 4.0F, VnVnuUn.uUnuvNvvNU(0, 0, 0, 0), VnVnuUn.uUnuvNvvNU(0, 0, 0, (int)(220.0F * var32))
            );
            float var80 = 26.0F * var23;
            float var81 = 22.0F * var23;
            float var82 = var45 + var28 - 32.0F * var22;
            float var84 = var27 - 16.0F * var21;
            this.UuUVuuUu(
               var1, vNvnnVvvVUu.vVvUvVVuuNvV, this.UUVNuUNUvUnV, var44 + 10.0F * var21, var82, var80, var38, var79, var78, var84, var44 + var27 / 2.0F
            );
            this.UuUVuuUu(
               var1,
               vNvnnVvvVUu.UuUVuuUu,
               this.vuvnUnVnUNnV,
               var44 + 10.0F * var21,
               var82 + 15.0F * var22,
               var81,
               var39,
               var79,
               var78,
               var84,
               var44 + var27 / 2.0F
            );
            var1.nuUnNvnuUu();
            float var86 = var45 + var28 + var26;
            if (var42) {
               this.C00OOC00oO(var1, var44, var86, var27, var29, 7.0F, var31);
            } else {
               var1.UuUVuuUu(var44, var86, var27, var29, 4.0F, 4.0F, 4.0F, 4.0F, var36);
               if (this.uNNnnnuuuN()) {
                  var1.UuUVuuUu(var44, var86, var27, var29, 4.0F, var37, 1.0F);
               }
            }

            float var53 = 20.0F * var23;
            float var54 = var44 + var27 / 2.0F;
            float var55 = var86 + var29 / 2.0F + 4.0F * var22;
            String var56 = this.nnuUVNUuvvVU ? "x" : "p";
            String var57 = "z";
            String var58 = "c";
            float var59 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var56, var53).UuUVuuUu;
            float var60 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var57, var53).UuUVuuUu;
            float var61 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var58, var53).UuUVuuUu;
            float var62 = 22.0F * var21;
            var1.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var54 - var62 - var60 / 2.0F, var55, var53, var57, var41);
            var1.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var54 - var59 / 2.0F, var55, var53, var56, var41);
            var1.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var54 + var62 - var61 / 2.0F, var55, var53, var58, var41);
            if (var5 && !this.uUVvnUuNvvN) {
               float var63 = 24.0F * var21;
               if (this.UuUVuuUu(var3, var4, var54 - var62 - var63 / 2.0F, var86, var63, var29)) {
                  if (NvnvUnUnnuvV.vVvUvVVuuNvV()) {
                     NvnvUnUnnuvV.uUnuvNvvNU();
                  }
               } else if (this.UuUVuuUu(var3, var4, var54 - var63 / 2.0F, var86, var63, var29)) {
                  if (NvnvUnUnnuvV.vVvUvVVuuNvV()) {
                     NvnvUnUnnuvV.UuUVuuUu();
                  }
               } else if (this.UuUVuuUu(var3, var4, var54 + var62 - var63 / 2.0F, var86, var63, var29) && NvnvUnUnnuvV.vVvUvVVuuNvV()) {
                  NvnvUnUnnuvV.C00OOC00oO();
               }
            }

            float var87 = var86 + var29 + var26;
            if (var42) {
               this.C00OOC00oO(var1, var44, var87, var27, var30, 8.0F, var31);
            } else {
               var1.UuUVuuUu(var44, var87, var27, var30, 4.0F, 4.0F, 11.0F, 11.0F, var36);
            }

            float var64 = 20.0F * var23;
            String var65 = this.UuUVuuUu(this.nuunNvv);
            float var66 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var65, var64).UuUVuuUu;
            float var67 = 10.0F * var21;
            float var68 = 8.0F * var21;
            float var69 = var44 + var67 + var66 + var68;
            float var70 = var27 - var67 * 2.0F - var66 * 2.0F - var68 * 2.0F;
            this.NVuunNnvvvVu = var69;
            this.vNnNuuvVn = var87;
            this.VUuuVUnun = var70;
            this.vVVuuVVv = var30;
            long var71 = this.nNnVnUNVV;
            boolean var73 = this.UuUVuuUu(var3, var4, var69 - 4.0F * var21, var87, var70 + 8.0F * var21, var30);
            if (this.uUVvnUuNvvN) {
               this.UUuUnNVNuuv = Math.max(0.0, Math.min(1.0, (double)((var3 - var69) / Math.max(1.0F, var70))));
               var71 = (long)(this.UUuUnNVNuuv * this.nuunNvv);
               if (!var6) {
                  this.uUVvnUuNvvN = false;
                  if (this.nuunNvv > 0L && NvnvUnUnnuvV.vVvUvVVuuNvV()) {
                     long var74 = (long)((double)var71 / this.vvUVNVvvNUv * 1000.0);
                     NvnvUnUnnuvV.UuUVuuUu(var74);
                     this.nNnVnUNVV = var71;
                     this.UuNnnVnuNNV = System.currentTimeMillis();
                     this.uUVVvVVNvvn = System.currentTimeMillis();
                  }
               }
            } else if (this.nnuUVNUuvvVU && this.nuunNvv > 0L) {
               long var88 = System.currentTimeMillis() - this.uUVVvVVNvvn;
               long var76 = (long)(var88 * (this.vvUVNVvvNUv / 1000.0));
               var71 += Math.max(0L, var76);
               if (var71 > this.nuunNvv) {
                  var71 = this.nuunNvv;
               }
            }

            this.nVVUuvuNnUN = this.nuunNvv > 0L ? (double)var71 / this.nuunNvv : 0.0;
            String var89 = this.UuUVuuUu(var71);
            float var75 = var87 + var30 / 2.0F + 3.0F * var22;
            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var44 + var67, var75, var64, var89, var39);
            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var44 + var27 - var67 - var66, var75, var64, var65, var39);
            this.NVuNUuVnVUN.UuUVuuUu();
            this.NVuNUuVnVUN.UuUVuuUu(!var73 && !this.uUVvnUuNvvN ? 0.0 : 1.0, 0.15F, VvVUUNUu.UnUNVVVNuv, false);
            float var90 = 4.0F * var22 + 4.0F * var22 * this.NVuNUuVnVUN.uNNnnnuuuN();
            float var77 = var87 + (var30 - var90) / 2.0F;
            this.OCOocoOoOO.UuUVuuUu();
            this.OCOocoOoOO.UuUVuuUu((float)this.nVVUuvuNnUN, this.uUVvnUuNvvN ? 0.05F : 0.2F, VvVUUNUu.nuUnNvnuUu, false);
            if (var42) {
               this.C00OOC00oO(var1, var69, var77, var70, var90, var90 / 2.0F, var31);
            } else {
               var1.UuUVuuUu(var69, var77, var70, var90, var90 / 2.0F, VnVnuUn.uUnuvNvvNU(100, 100, 100, (int)(80.0F * var32)));
            }

            var1.UuUVuuUu(var69, var77, var70 * this.OCOocoOoOO.uNNnnnuuuN(), var90, var90 / 2.0F, var40);
            nNuUNVu.UuUVuuUu().UuUVuuUu(var14);
            UuUuVnVvnvn.UuUVuuUu(
               var1,
               this,
               var15,
               var16,
               var17,
               var18,
               O000c0oocoo.a_.method_22683().method_4486(),
               O000c0oocoo.a_.method_22683().method_4502(),
               var14.VVuuUN,
               nNuUNVu.UuUVuuUu().VVuuUN(),
               nNuUNVu.UuUVuuUu().vNUvnnVnUvu(),
               nNuUNVu.UuUVuuUu().vuuuNvNuv(),
               nNuUNVu.UuUVuuUu().uVUuuVnNVU()
            );
         }
      }
   }

   private boolean UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6) {
      return var1 >= var3 && var1 <= var3 + var5 && var2 >= var4 && var2 <= var4 + var6;
   }

   private String UuUVuuUu(long var1) {
      if (var1 <= 0L) {
         return "0:00";
      } else {
         long var3 = var1 / this.vvUVNVvvNUv;
         long var5 = var3 % 60L;
         return var3 / 60L + (var5 < 10L ? ":0" : ":") + var5;
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1, nUVnuvUu var2, String var3, float var4, float var5, float var6, int var7, float var8, float var9, float var10, float var11
   ) {
      float var12 = vVVUUuunVVV.UuUVuuUu(var2, var3, var6).UuUVuuUu;
      if (var12 <= var10) {
         var1.UuUVuuUu(var2, var11 - var12 / 2.0F, var5, var6, var3, var7);
      } else {
         float var13 = var12 - var10;
         long var14 = 8000L;
         float var16 = (float)(System.currentTimeMillis() % var14) / (float)var14;
         float var17 = var16 < 0.2F
            ? 0.0F
            : (
               var16 < 0.45F
                  ? this.UuuNnUvUuv((var16 - 0.2F) / 0.3F)
                  : (var16 < 0.7F ? 1.0F : (var16 < 0.95F ? 1.0F - this.UuuNnUvUuv((var16 - 0.7F) / 0.25F) : 0.0F))
            );
         var1.UuUVuuUu(var4, var8, var10, var9, 0.0F, 0.0F, 0.0F, 0.0F);
         var1.UuUVuuUu(var2, var4 - var13 * var17, var5, var6, var3, var7);
         var1.nuUnNvnuUu();
      }
   }

   private float UuuNnUvUuv(float var1) {
      float var2 = 2.0F;
      float var3 = var2 + 1.0F;
      float var4 = var1 - 1.0F;
      return 1.0F + var3 * var4 * var4 * var4 + var2 * var4 * var4;
   }

   private void uVUVnuvnuVuv() {
      long var1 = System.currentTimeMillis();
      if (var1 - this.NnunUUnU >= 160L) {
         this.NnunUUnU = var1;
         if (this.NnVnNVN.compareAndSet(false, true)) {
            NVUunUNUN.execute(() -> {
               try {
                  this.UuUVuuUu(this.NVNnnvnuunNv());
               } catch (Throwable var5) {
                  if (!nvuVvuNnNUnv) {
                     nvuVvuNnNUnv = true;
                  }

                  this.UuUVuuUu(VVVVUN.NVnVnNnN.empty());
               } finally {
                  this.NnVnNVN.set(false);
               }
            });
         }
      }
   }

   private VVVVUN.NVnVnNnN NVNnnvnuunNv() {
      if (this.UvNNVUVNVuvV == null) {
         this.UvNNVUVNVuvV = MediaPlayerInfo.INSTANCE;
      }

      List var1 = this.UvNNVUVNVuvV.getMediaSessions();
      if (var1 != null && !var1.isEmpty()) {
         MediaInfo var2 = null;

         for (IMediaSession var4 : var1) {
            if (var4 != null) {
               MediaInfo var5 = var4.getMedia();
               if (var5 != null && this.UuUVuuUu(var5)) {
                  if (var2 == null) {
                     var2 = var5;
                  }

                  if (var5.isPlaying()) {
                     var2 = var5;
                     break;
                  }
               }
            }
         }

         return var2 == null ? VVVVUN.NVnVnNnN.empty() : VVVVUN.NVnVnNnN.from(var2);
      } else {
         return VVVVUN.NVnVnNnN.empty();
      }
   }

   private void UuUVuuUu(VVVVUN.NVnVnNnN var1) {
      this.vnvvNvUnVv.set(var1);
      if (O000c0oocoo.a_ != null) {
         O000c0oocoo.a_.execute(this::uVunuUNVVUUV);
      }
   }

   private void uVunuUNVVUUV() {
      VVVVUN.NVnVnNnN var1 = this.vnvvNvUnVv.getAndSet(null);
      if (var1 != null) {
         if (!var1.available()) {
            this.uNnUnnuNUnNu();
         } else {
            this.UUVNuUNUvUnV = var1.title();
            this.vuvnUnVnUNnV = var1.artist();
            this.nnuUVNUuvvVU = var1.playing();
            if (!this.uUVvnUuNvvN && System.currentTimeMillis() - this.UuNnnVnuNNV > 2000L) {
               this.nNnVnUNVV = var1.position();
            }

            this.nuunNvv = var1.duration();
            this.uUVVvVVNvvn = System.currentTimeMillis();
            if (this.nuunNvv > 360000000L) {
               this.vvUVNVvvNUv = 10000000L;
            } else if (this.nuunNvv > 100000L) {
               this.vvUVNVvvNUv = 1000L;
            } else {
               this.vvUVNVvvNUv = 1L;
            }

            this.UuUVuuUu(var1.thumbnail());
         }
      }
   }

   private void UuUVuuUu(byte[] var1) {
      if (var1 != null && var1.length > 0) {
         int var2 = Arrays.hashCode(var1);
         if (var2 != this.NNUUNUuVNNVn || this.VuunNUUUvu == null || this.VuunNUUUvu.length != var1.length) {
            this.VuunNUUUvu = Arrays.copyOf(var1, var1.length);
            this.NNUUNUuVNNVn = var2;
            this.VvVvnNUnvuvV = true;
         }
      } else if (this.VuunNUUUvu != null || this.NNUUNUuVNNVn != 0) {
         this.VuunNUUUvu = null;
         this.NNUUNUuVNNVn = 0;
         this.VvVvnNUnvuvV = true;
      }
   }

   private void UNnVVNvvnVvU() {
      byte[] var1 = this.VuunNUUUvu;
      int var2 = this.NNUUNUuVNNVn;
      boolean var3 = this.VvVvnNUnvuvV;
      if (var1 == null) {
         if (var3) {
            this.VvVvnNUnvuvV = false;
            this.ccOO0COcoco0 = Integer.MIN_VALUE;
            this.NUVvUUVuVNVv = -1;
            this.UNvvunVVn = 0;
            this.UnvuVuVnNuvu = 0;
            if (this.nNuVunNUVu != null) {
               O000c0oocoo.a_.method_1531().method_4615(this.nNuVunNUVu);
               this.nNuVunNUVu = null;
            }
         }
      } else if (var3 || var2 != this.ccOO0COcoco0 || var1.length != this.NUVvUUVuVNVv) {
         try {
            this.VvVvnNUnvuvV = false;
            this.ccOO0COcoco0 = var2;
            this.NUVvUUVuVNVv = var1.length;
            class_1011 var4 = class_1011.method_4309(new ByteArrayInputStream(var1));
            this.UNvvunVVn = var4.method_4307();
            this.UnvuVuVnNuvu = var4.method_4323();
            if (this.nNuVunNUVu != null) {
               O000c0oocoo.a_.method_1531().method_4615(this.nNuVunNUVu);
            }

            class_1043 var5 = new class_1043(() -> "media_cover", var4);
            this.nNuVunNUVu = class_2960.method_60655("wild", "media_cover_" + System.nanoTime());
            O000c0oocoo.a_.method_1531().method_4616(this.nNuVunNUVu, var5);
         } catch (Exception var6) {
         }
      }
   }

   private void uNnUnnuNUnNu() {
      this.UUVNuUNUvUnV = "Ожидание...";
      this.vuvnUnVnUNnV = "Нет данных";
      this.nnuUVNUuvvVU = false;
      this.nVVUuvuNnUN = 0.0;
      this.nNnVnUNVV = 0L;
      this.nuunNvv = 0L;
      this.uUVVvVVNvvn = System.currentTimeMillis();
      if (this.VuunNUUUvu != null || this.NNUUNUuVNNVn != 0) {
         this.VuunNUUUvu = null;
         this.NNUUNUuVNNVn = 0;
         this.VvVvnNUnvuvV = true;
      }
   }

   private boolean UuUVuuUu(MediaInfo var1) {
      if (var1 == null) {
         return false;
      } else {
         String var2 = var1.getTitle();
         String var3 = var1.getArtist();
         return var2 != null && !var2.isBlank() || var3 != null && !var3.isBlank() || var1.getDuration() > 0L || var1.getPosition() > 0L || var1.isPlaying();
      }
   }

   private static int UuUVuuUu(class_2960 var0) {
      if (O000c0oocoo.a_ == null) {
         return -1;
      } else {
         class_1044 var1 = O000c0oocoo.a_.method_1531().method_4619(var0);
         return var1 != null && var1.method_68004() instanceof class_10868 var2 ? var2.method_68427() : -1;
      }
   }

   record NVnVnNnN(boolean available, String title, String artist, long position, long duration, boolean playing, byte[] thumbnail) {
      private NVnVnNnN(boolean available, String title, String artist, long position, long duration, boolean playing, byte[] thumbnail) {
         title = title != null && !title.isBlank() ? title : "Ожидание...";
         artist = artist != null && !artist.isBlank() ? artist : "Нет данных";
         position = Math.max(0L, position);
         duration = Math.max(0L, duration);
         thumbnail = thumbnail != null && thumbnail.length != 0 ? Arrays.copyOf(thumbnail, thumbnail.length) : null;
         this.available = available;
         this.title = title;
         this.artist = artist;
         this.position = position;
         this.duration = duration;
         this.playing = playing;
         this.thumbnail = thumbnail;
      }

      static VVVVUN.NVnVnNnN empty() {
         return new VVVVUN.NVnVnNnN(false, "Ожидание...", "Нет данных", 0L, 0L, false, null);
      }

      static VVVVUN.NVnVnNnN from(MediaInfo var0) {
         return new VVVVUN.NVnVnNnN(true, var0.getTitle(), var0.getArtist(), var0.getPosition(), var0.getDuration(), var0.isPlaying(), var0.getArtworkPng());
      }

      public byte[] thumbnail() {
         return this.thumbnail == null ? null : Arrays.copyOf(this.thumbnail, this.thumbnail.length);
      }
   }
}
