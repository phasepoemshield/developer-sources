package ru.metaculture.protection;

import com.mojang.logging.LogUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import net.minecraft.class_2338;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public final class VVuNvNvUUvn {
   private static final Logger uNNnnnuuuN = LogUtils.getLogger();
   public static final int UuUVuuUu = 32;
   public static final int C00OOC00oO = 8;
   public static final int uUnuvNvvNU = 4;
   public static final int vVvUvVVuuNvV = 128;
   private static final float nuUnNvnuUu = 0.004F;
   private static final long VVuuUN = 150L;
   private static final int vNUvnnVnUvu = 6;
   private static final int uVUuuVnNVU = 64;
   private static final int vuuuNvNuv = 127;
   private static final boolean nvUVNnuu = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
   private static final int[][] UuuNnUvUuv = new int[][]{
      {0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0},
      {1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1},
      {0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1},
      {0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0},
      {0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0},
      {0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1}
   };
   private static final int[][] nUUVuvU = new int[][]{{4, 5, 2, 3}, {2, 3, 4, 5}, {0, 1, 4, 5}, {4, 5, 0, 1}, {2, 3, 0, 1}, {0, 1, 2, 3}};
   private static final int[] UnUNVVVNuv = new int[]{-1, 1, 0, 0, 0, 0};
   private static final int[] vNVuvnUUnuUn = new int[]{0, 0, -1, 1, 0, 0};
   private static final int[] UvnvNVnnnnNU = new int[]{0, 0, 0, 0, -1, 1};
   private static final int[] uVUVnuvnuVuv = new int[6];
   private static final int[] NVNnnvnuunNv = new int[8];
   private final AtomicReference<VVuNvNvUUvn.NVnVnNnN> uVunuUNVVUUV = new AtomicReference<>();
   private final AtomicBoolean UNnVVNvvnVvU = new AtomicBoolean();
   private final AtomicBoolean uNnUnnuNUnNu = new AtomicBoolean();
   private final Object NnUuNNU = new Object();
   private final VVuNvNvUUvn.VvunVVUvUNnv nNvNUVU = new VVuNvNvUUvn.VvunVVUvUNnv();
   private final int[] UnUNuUU = new int[32];
   private int[] uUVuVvuNUvnu = new int[0];
   private byte[] UvUvUNuvNU = new byte[0];
   private int[] c0oOOCcCoC0 = new int[0];
   private int[] VVnVNnunVvu = new int[0];
   private int[] unNNVVNnvvV = new int[0];
   private long[] NuunnvnN = new long[0];
   private boolean[] NVUunUNUN = new boolean[0];
   private long[] UUVNuUNUvUnV = new long[0];
   private float[] vuvnUnVnUNnV = new float[0];
   private int[] nnuUVNUuvvVU = new int[0];
   private int[] nVVUuvuNnUN = new int[0];
   private VVuNvNvUUvn.nvnNNunvv nNnVnUNVV;
   private volatile boolean nuunNvv;
   private volatile int uUVVvVVNvvn;
   private Thread vvUVNVvvNUv;

   public void UuUVuuUu() {
      if (this.vvUVNVvvNUv == null) {
         this.nuunNvv = true;
         int var1 = ++this.uUVVvVVNvvn;
         this.vvUVNVvvNUv = new Thread(() -> this.UuUVuuUu(var1), "Wild BlockESP Geometry");
         this.vvUVNVvvNUv.setDaemon(true);
         this.vvUVNVvvNUv.setPriority(4);
         this.vvUVNVvvNUv.start();
      }
   }

   public void C00OOC00oO() {
      Thread var1 = this.vvUVNVvvNUv;
      this.vvUVNVvvNUv = null;
      this.nuunNvv = false;
      this.uUVVvVVNvvn++;
      synchronized (this.NnUuNNU) {
         this.nNnVnUNVV = null;
         this.NnUuNNU.notifyAll();
      }

      if (var1 != null && this.UNnVVNvvnVvU.get()) {
         try {
            var1.join(150L);
         } catch (InterruptedException var4) {
            Thread.currentThread().interrupt();
         }
      }

      UuUVuuUu(this.uVunuUNVVUUV.getAndSet(null));
      this.uNnUnnuNUnNu.set(false);
      this.UNnVVNvvnVvU.set(false);
   }

   public boolean uUnuvNvvNU() {
      return this.UNnVVNvvnVvU.get();
   }

   public boolean vVvUvVVuuNvV() {
      return this.uNnUnnuNUnNu.compareAndSet(true, false);
   }

   public boolean UuUVuuUu(long[] var1, byte[] var2, int[] var3, int var4, int[] var5, int var6, int var7, int var8) {
      if (!this.UNnVVNvvnVvU.compareAndSet(false, true)) {
         return false;
      } else {
         VVuNvNvUUvn.nvnNNunvv var9 = new VVuNvNvUUvn.nvnNNunvv();
         var9.UuUVuuUu = var1;
         var9.C00OOC00oO = var2;
         var9.uUnuvNvvNU = var3;
         var9.vVvUvVVuuNvV = var4;
         var9.uNNnnnuuuN = var5;
         var9.nuUnNvnuUu = var6;
         var9.VVuuUN = var7;
         var9.vNUvnnVnUvu = var8;
         synchronized (this.NnUuNNU) {
            this.nNnVnUNVV = var9;
            this.NnUuNNU.notifyAll();
            return true;
         }
      }
   }

   public VVuNvNvUUvn.NVnVnNnN uNNnnnuuuN() {
      return this.uVunuUNVVUUV.getAndSet(null);
   }

   public static void UuUVuuUu(VVuNvNvUUvn.NVnVnNnN var0) {
      if (var0 != null && var0.UuUVuuUu != null) {
         MemoryUtil.memFree(var0.UuUVuuUu);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(int var1) {
      while (this.nuunNvv) {
         VVuNvNvUUvn.nvnNNunvv var2;
         synchronized (this.NnUuNNU) {
            while (this.nuunNvv && this.nNnVnUNVV == null) {
               try {
                  this.NnUuNNU.wait();
               } catch (InterruptedException var12) {
                  Thread.currentThread().interrupt();
                  return;
               }
            }

            if (!this.nuunNvv) {
               return;
            }

            var2 = this.nNnVnUNVV;
            this.nNnVnUNVV = null;
         }

         VVuNvNvUUvn.NVnVnNnN var16 = null;
         boolean var4 = false;
         boolean var11 = false /* VF: Semaphore variable */;

         label168: {
            try {
               var11 = true;
               var16 = this.UuUVuuUu(var2);
               var4 = true;
               var11 = false;
               break label168;
            } catch (Throwable var13) {
               this.uNnUnnuNUnNu.set(true);
               uNNnnnuuuN.error("BlockESP geometry build failed", var13);
               var11 = false;
            } finally {
               if (var11) {
                  if (!var4) {
                     UuUVuuUu(var16);
                  } else if (this.nuunNvv && var1 == this.uUVVvVVNvvn) {
                     UuUVuuUu(this.uVunuUNVVUUV.getAndSet(var16));
                     if (!this.nuunNvv) {
                        UuUVuuUu(this.uVunuUNVVUUV.getAndSet(null));
                     }
                  } else {
                     UuUVuuUu(var16);
                  }

                  this.UNnVVNvvnVvU.set(false);
               }
            }

            if (!var4) {
               UuUVuuUu(var16);
            } else if (this.nuunNvv && var1 == this.uUVVvVVNvvn) {
               UuUVuuUu(this.uVunuUNVVUUV.getAndSet(var16));
               if (!this.nuunNvv) {
                  UuUVuuUu(this.uVunuUNVVUUV.getAndSet(null));
               }
            } else {
               UuUVuuUu(var16);
            }

            this.UNnVVNvvnVvU.set(false);
            continue;
         }

         if (!var4) {
            UuUVuuUu(var16);
         } else if (this.nuunNvv && var1 == this.uUVVvVVNvvn) {
            UuUVuuUu(this.uVunuUNVVUUV.getAndSet(var16));
            if (!this.nuunNvv) {
               UuUVuuUu(this.uVunuUNVVUUV.getAndSet(null));
            }
         } else {
            UuUVuuUu(var16);
         }

         this.UNnVVNvvnVvU.set(false);
      }
   }

   private VVuNvNvUUvn.NVnVnNnN UuUVuuUu(VVuNvNvUUvn.nvnNNunvv var1) {
      int var2 = var1.vVvUvVVuuNvV;
      if (var2 <= 0) {
         return new VVuNvNvUUvn.NVnVnNnN(null, 0, var1.nuUnNvnuUu, var1.VVuuUN, var1.vNUvnnVnUvu, 0, null, null, null);
      } else {
         this.C00OOC00oO(var2);
         long[] var3 = var1.UuUVuuUu;
         int[] var4 = var1.uUnuvNvvNU;
         this.nNvNUVU.UuUVuuUu(var2);

         for (int var5 = 0; var5 < var2; this.uUVuVvuNUvnu[var5] = var5++) {
            if ((var4[var5] & 65536) == 0) {
               this.nNvNUVU.UuUVuuUu(var3[var5], var5);
            }
         }

         int var16 = 0;

         for (int var6 = 0; var6 < var2; var6++) {
            long var7 = var3[var6];
            int var9 = class_2338.method_10061(var7);
            int var10 = class_2338.method_10071(var7);
            int var11 = class_2338.method_10083(var7);
            int var12 = 0;

            for (int var13 = 0; var13 < 6; var13++) {
               int var14 = this.nNvNUVU.UuUVuuUu(class_2338.method_10064(var9 + UnUNVVVNuv[var13], var10 + vNVuvnUUnuUn[var13], var11 + UvnvNVnnnnNU[var13]));
               if (var14 < 0) {
                  var12 |= 1 << var13;
               } else if (var14 != var6) {
                  this.UuUVuuUu(var6, var14);
               }
            }

            this.UvUvUNuvNU[var6] = (byte)var12;
            var16 += Integer.bitCount(var12);
         }

         if (var16 == 0) {
            return new VVuNvNvUUvn.NVnVnNnN(null, 0, var1.nuUnNvnuUu, var1.VVuuUN, var1.vNUvnnVnUvu, 0, null, null, null);
         } else {
            for (int var17 = 0; var17 < var2; var17++) {
               this.c0oOOCcCoC0[var17] = Integer.MAX_VALUE;
               this.VVnVNnunVvu[var17] = Integer.MIN_VALUE;
               this.NuunnvnN[var17] = Long.MAX_VALUE;
               this.NVUunUNUN[var17] = false;
            }

            for (int var18 = 0; var18 < var2; var18++) {
               if ((var4[var18] & 65536) == 0) {
                  int var23 = this.vVvUvVVuuNvV(var18);
                  this.NVUunUNUN[var23] = true;
                  this.UuUVuuUu(var23, var3[var18]);
               }
            }

            for (int var19 = 0; var19 < var2; var19++) {
               int var24 = this.vVvUvVVuuNvV(var19);
               if (!this.NVUunUNUN[var24]) {
                  this.UuUVuuUu(var24, var3[var19]);
               }
            }

            for (int var20 = 0; var20 < var2; var20++) {
               if (this.uUVuVvuNUvnu[var20] == var20) {
                  long var25 = this.NuunnvnN[var20];
                  this.unNNVVNnvvV[var20] = (int)((var25 == Long.MAX_VALUE ? UuUVuuUu(var3[var20]) : var25) & 255L);
               }
            }

            for (int var21 = 0; var21 < var2; var21++) {
               long var26 = var3[var21];
               int var29 = uNNnnnuuuN((class_2338.method_10061(var26) - var1.nuUnNvnuUu >> 6) + 64);
               int var30 = uNNnnnuuuN((class_2338.method_10071(var26) - var1.VVuuUN >> 6) + 64);
               int var31 = uNNnnnuuuN((class_2338.method_10083(var26) - var1.vNUvnnVnUvu >> 6) + 64);
               long var32 = (long)var29 << 14 | (long)var30 << 7 | var31;
               this.UUVNuUNUvUnV[var21] = var32 << 21 | var21;
            }

            Arrays.sort(this.UUVNuUNUvUnV, 0, var2);
            int var22 = 1;

            for (int var27 = 1; var27 < var2; var27++) {
               if (this.UUVNuUNUvUnV[var27] >>> 21 != this.UUVNuUNUvUnV[var27 - 1] >>> 21) {
                  var22++;
               }
            }

            this.uUnuvNvvNU(var22);
            ByteBuffer var28 = MemoryUtil.memAlloc(var16 * 128);

            try {
               return this.UuUVuuUu(var1, var28, var2, var22);
            } catch (Throwable var15) {
               MemoryUtil.memFree(var28);
               throw var15;
            }
         }
      }
   }

   private VVuNvNvUUvn.NVnVnNnN UuUVuuUu(VVuNvNvUUvn.nvnNNunvv var1, ByteBuffer var2, int var3, int var4) {
      IntBuffer var5 = var2.asIntBuffer();
      int[] var6 = this.UnUNuUU;
      int[] var7 = var1.uNNnnnuuuN;
      long[] var8 = var1.UuUVuuUu;
      byte[] var9 = var1.C00OOC00oO;
      int[] var10 = var1.uUnuvNvvNU;
      byte var11 = 0;
      int var12 = -1;
      long var13 = Long.MIN_VALUE;
      float var15 = 0.0F;
      float var16 = 0.0F;
      float var17 = 0.0F;
      float var18 = 0.0F;
      float var19 = 0.0F;
      float var20 = 0.0F;

      for (int var21 = 0; var21 < var3; var21++) {
         long var22 = this.UUVNuUNUvUnV[var21];
         int var24 = (int)(var22 & 2097151L);
         long var25 = var22 >>> 21;
         if (var25 != var13) {
            if (var12 >= 0) {
               this.UuUVuuUu(var12, var11, var15, var16, var17, var18, var19, var20);
            }

            var13 = var25;
            this.nnuUVNUuvvVU[++var12] = var11;
            var15 = Float.MAX_VALUE;
            var16 = Float.MAX_VALUE;
            var17 = Float.MAX_VALUE;
            var18 = -Float.MAX_VALUE;
            var19 = -Float.MAX_VALUE;
            var20 = -Float.MAX_VALUE;
         }

         int var27 = this.UvUvUNuvNU[var24] & 255;
         long var28 = var8[var24];
         int var30 = class_2338.method_10061(var28);
         int var31 = class_2338.method_10071(var28);
         int var32 = class_2338.method_10083(var28);
         float var33 = var30 - var1.nuUnNvnuUu;
         float var34 = var31 - var1.VVuuUN;
         float var35 = var32 - var1.vNUvnnVnUvu;
         if (var33 - 0.004F < var15) {
            var15 = var33 - 0.004F;
         }

         if (var34 - 0.004F < var16) {
            var16 = var34 - 0.004F;
         }

         if (var35 - 0.004F < var17) {
            var17 = var35 - 0.004F;
         }

         if (var33 + 1.0F + 0.004F > var18) {
            var18 = var33 + 1.0F + 0.004F;
         }

         if (var34 + 1.0F + 0.004F > var19) {
            var19 = var34 + 1.0F + 0.004F;
         }

         if (var35 + 1.0F + 0.004F > var20) {
            var20 = var35 + 1.0F + 0.004F;
         }

         if (var27 != 0) {
            int var36 = this.vVvUvVVuuNvV(var24);
            int var37 = this.c0oOOCcCoC0[var36];
            int var38 = this.VVnVNnunVvu[var36] + 1 - var37;
            float var39 = 1.0F / var38;
            int var40 = this.unNNVVNnvvV[var36];
            int var41 = var7[var9[var24] & 255];
            int var42 = UuUVuuUu(var41 >> 16 & 0xFF, var41 >> 8 & 0xFF, var41 & 0xFF, var40);
            int var43 = var10[var24];
            int var44 = (var43 & 65536) != 0 ? 16 : 0;
            int var45 = var43 & 65535;

            for (int var46 = 0; var46 < 6; var46++) {
               if ((var27 & 1 << var46) != 0) {
                  int[] var47 = nUUVuvU[var46];
                  byte var48 = 0;
                  if ((var27 & 1 << var47[0]) != 0) {
                     var48 |= 1;
                  }

                  if ((var27 & 1 << var47[1]) != 0) {
                     var48 |= 2;
                  }

                  if ((var27 & 1 << var47[2]) != 0) {
                     var48 |= 4;
                  }

                  if ((var27 & 1 << var47[3]) != 0) {
                     var48 |= 8;
                  }

                  int[] var49 = UuuNnUvUuv[var46];
                  int var50 = uVUVnuvnuVuv[var46];
                  int var51 = var46 >> 1;
                  float var52 = var51 == 0 ? 0.004F : 0.0F;
                  float var53 = var51 == 1 ? 0.004F : 0.0F;
                  float var54 = var51 == 2 ? 0.004F : 0.0F;

                  for (int var55 = 0; var55 < 4; var55++) {
                     int var56 = var49[var55 * 3];
                     int var57 = var49[var55 * 3 + 1];
                     int var58 = var49[var55 * 3 + 2];
                     float var59 = 0.0F;
                     float var60 = 0.0F;
                     float var61 = 0.0F;

                     for (int var62 = 0; var62 < 4; var62++) {
                        if ((var48 & 1 << var62) != 0) {
                           int var63 = var47[var62];
                           int var64 = var63 & 1;
                           switch (var63 >> 1) {
                              case 0:
                                 if (var56 == var64) {
                                    var59 = var64 == 1 ? 0.004F : -0.004F;
                                 }
                                 break;
                              case 1:
                                 if (var57 == var64) {
                                    var60 = var64 == 1 ? 0.004F : -0.004F;
                                 }
                                 break;
                              default:
                                 if (var58 == var64) {
                                    var61 = var64 == 1 ? 0.004F : -0.004F;
                                 }
                           }
                        }
                     }

                     int var66 = var55 * 8;
                     var6[var66] = Float.floatToRawIntBits(var33 + (var56 == 0 ? -var52 : 1.0F + var52) + var59);
                     var6[var66 + 1] = Float.floatToRawIntBits(var34 + (var57 == 0 ? -var53 : 1.0F + var53) + var60);
                     var6[var66 + 2] = Float.floatToRawIntBits(var35 + (var58 == 0 ? -var54 : 1.0F + var54) + var61);
                     var6[var66 + 3] = NVNnnvnuunNv[var55 * 2];
                     var6[var66 + 4] = NVNnnvnuunNv[var55 * 2 + 1];
                     var6[var66 + 5] = var42;
                     int var67 = Math.round((var31 + var57 - var37) * var39 * 255.0F);
                     if (var67 < 0) {
                        var67 = 0;
                     } else if (var67 > 255) {
                        var67 = 255;
                     }

                     var6[var66 + 6] = C00OOC00oO(var48 | var44 | var67 << 8, var45);
                     var6[var66 + 7] = var50;
                  }

                  var5.put(var6, 0, var6.length);
                  var11 += 4;
               }
            }
         }
      }

      if (var12 >= 0) {
         this.UuUVuuUu(var12, var11, var15, var16, var17, var18, var19, var20);
      }

      var2.position(0).limit(var11 * 32);
      int var65 = var12 + 1;
      return new VVuNvNvUUvn.NVnVnNnN(
         var2,
         var11,
         var1.nuUnNvnuUu,
         var1.VVuuUN,
         var1.vNUvnnVnUvu,
         var65,
         Arrays.copyOf(this.vuvnUnVnUNnV, var65 * 6),
         Arrays.copyOf(this.nnuUVNUuvvVU, var65),
         Arrays.copyOf(this.nVVUuvuNnUN, var65)
      );
   }

   private void UuUVuuUu(int var1, int var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.nVVUuvuNnUN[var1] = var2 - this.nnuUVNUuvvVU[var1];
      int var9 = var1 * 6;
      this.vuvnUnVnUNnV[var9] = var3;
      this.vuvnUnVnUNnV[var9 + 1] = var4;
      this.vuvnUnVnUNnV[var9 + 2] = var5;
      this.vuvnUnVnUNnV[var9 + 3] = var6;
      this.vuvnUnVnUNnV[var9 + 4] = var7;
      this.vuvnUnVnUNnV[var9 + 5] = var8;
   }

   private void C00OOC00oO(int var1) {
      if (this.uUVuVvuNUvnu.length < var1) {
         int var2 = Integer.highestOneBit(Math.max(1024, var1 - 1)) << 1;
         this.uUVuVvuNUvnu = new int[var2];
         this.UvUvUNuvNU = new byte[var2];
         this.c0oOOCcCoC0 = new int[var2];
         this.VVnVNnunVvu = new int[var2];
         this.unNNVVNnvvV = new int[var2];
         this.NuunnvnN = new long[var2];
         this.NVUunUNUN = new boolean[var2];
         this.UUVNuUNUvUnV = new long[var2];
      }
   }

   private void uUnuvNvvNU(int var1) {
      if (this.nnuUVNUuvvVU.length < var1) {
         int var2 = Integer.highestOneBit(Math.max(64, var1 - 1)) << 1;
         this.nnuUVNUuvvVU = new int[var2];
         this.nVVUuvuNnUN = new int[var2];
         this.vuvnUnVnUNnV = new float[var2 * 6];
      }
   }

   private int vVvUvVVuuNvV(int var1) {
      int var2 = var1;

      while (this.uUVuVvuNUvnu[var2] != var2) {
         var2 = this.uUVuVvuNUvnu[var2];
      }

      while (this.uUVuVvuNUvnu[var1] != var2) {
         int var3 = this.uUVuVvuNUvnu[var1];
         this.uUVuVvuNUvnu[var1] = var2;
         var1 = var3;
      }

      return var2;
   }

   private void UuUVuuUu(int var1, long var2) {
      int var4 = class_2338.method_10071(var2);
      if (var4 < this.c0oOOCcCoC0[var1]) {
         this.c0oOOCcCoC0[var1] = var4;
      }

      if (var4 > this.VVnVNnunVvu[var1]) {
         this.VVnVNnunVvu[var1] = var4;
      }

      long var5 = UuUVuuUu(var2);
      if (var5 < this.NuunnvnN[var1]) {
         this.NuunnvnN[var1] = var5;
      }
   }

   private void UuUVuuUu(int var1, int var2) {
      int var3 = this.vVvUvVVuuNvV(var1);
      int var4 = this.vVvUvVVuuNvV(var2);
      if (var3 != var4) {
         if (var3 < var4) {
            this.uUVuVvuNUvnu[var4] = var3;
         } else {
            this.uUVuVvuNUvnu[var3] = var4;
         }
      }
   }

   private static int uNNnnnuuuN(int var0) {
      return var0 < 0 ? 0 : Math.min(var0, 127);
   }

   private static long UuUVuuUu(long var0) {
      long var2 = var0 * -7046029254386353131L;
      var2 ^= var2 >>> 29;
      var2 *= -4658895280553007687L;
      return var2 ^ var2 >>> 32;
   }

   private static int nuUnNvnuUu(int var0) {
      return var0 > 0 ? 127 : (var0 < 0 ? -127 : 0);
   }

   private static int UuUVuuUu(int var0, int var1, int var2, int var3) {
      return nvUVNnuu
         ? var0 & 0xFF | (var1 & 0xFF) << 8 | (var2 & 0xFF) << 16 | (var3 & 0xFF) << 24
         : (var0 & 0xFF) << 24 | (var1 & 0xFF) << 16 | (var2 & 0xFF) << 8 | var3 & 0xFF;
   }

   private static int C00OOC00oO(int var0, int var1) {
      return nvUVNnuu ? var0 & 65535 | (var1 & 65535) << 16 : (var0 & 65535) << 16 | var1 & 65535;
   }

   static {
      for (int var0 = 0; var0 < 6; var0++) {
         uVUVnuvnuVuv[var0] = UuUVuuUu(nuUnNvnuUu(UnUNVVVNuv[var0]), nuUnNvnuUu(vNVuvnUUnuUn[var0]), nuUnNvnuUu(UvnvNVnnnnNU[var0]), 0);
      }

      float[] var3 = new float[]{0.0F, 1.0F, 1.0F, 0.0F};
      float[] var1 = new float[]{0.0F, 0.0F, 1.0F, 1.0F};

      for (int var2 = 0; var2 < 4; var2++) {
         NVNnnvnuunNv[var2 * 2] = Float.floatToRawIntBits(var3[var2]);
         NVNnnvnuunNv[var2 * 2 + 1] = Float.floatToRawIntBits(var1[var2]);
      }
   }

   public static final class NVnVnNnN {
      public final ByteBuffer UuUVuuUu;
      public final int C00OOC00oO;
      public final int uUnuvNvvNU;
      public final int vVvUvVVuuNvV;
      public final int uNNnnnuuuN;
      public final int nuUnNvnuUu;
      public final float[] VVuuUN;
      public final int[] vNUvnnVnUvu;
      public final int[] uVUuuVnNVU;

      NVnVnNnN(ByteBuffer var1, int var2, int var3, int var4, int var5, int var6, float[] var7, int[] var8, int[] var9) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
         this.nuUnNvnuUu = var6;
         this.VVuuUN = var7;
         this.vNUvnnVnUvu = var8;
         this.uVUuuVnNVU = var9;
      }

      public int UuUVuuUu() {
         return this.C00OOC00oO * 32;
      }
   }

   static final class VvunVVUvUNnv {
      private long[] UuUVuuUu = new long[1024];
      private int[] C00OOC00oO = new int[1024];
      private boolean[] uUnuvNvvNU = new boolean[1024];
      private int vVvUvVVuuNvV = 1023;

      void UuUVuuUu(int var1) {
         int var2 = Integer.highestOneBit(Math.max(16, var1 * 2 - 1)) << 1;
         if (var2 > this.UuUVuuUu.length) {
            this.UuUVuuUu = new long[var2];
            this.C00OOC00oO = new int[var2];
            this.uUnuvNvvNU = new boolean[var2];
            this.vVvUvVVuuNvV = var2 - 1;
         } else {
            Arrays.fill(this.uUnuvNvvNU, false);
         }
      }

      private int C00OOC00oO(long var1) {
         long var3 = var1 * -7046029254386353131L;
         var3 ^= var3 >>> 32;
         return (int)var3 & this.vVvUvVVuuNvV;
      }

      void UuUVuuUu(long var1, int var3) {
         int var4;
         for (var4 = this.C00OOC00oO(var1); this.uUnuvNvvNU[var4]; var4 = var4 + 1 & this.vVvUvVVuuNvV) {
            if (this.UuUVuuUu[var4] == var1) {
               this.C00OOC00oO[var4] = var3;
               return;
            }
         }

         this.uUnuvNvvNU[var4] = true;
         this.UuUVuuUu[var4] = var1;
         this.C00OOC00oO[var4] = var3;
      }

      int UuUVuuUu(long var1) {
         for (int var3 = this.C00OOC00oO(var1); this.uUnuvNvvNU[var3]; var3 = var3 + 1 & this.vVvUvVVuuNvV) {
            if (this.UuUVuuUu[var3] == var1) {
               return this.C00OOC00oO[var3];
            }
         }

         return -1;
      }
   }

   static final class nvnNNunvv {
      long[] UuUVuuUu;
      byte[] C00OOC00oO;
      int[] uUnuvNvvNU;
      int vVvUvVVuuNvV;
      int[] uNNnnnuuuN;
      int nuUnNvnuUu;
      int VVuuUN;
      int vNUvnnVnUvu;
   }
}
