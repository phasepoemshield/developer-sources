package ru.metaculture.protection;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.Arrays;
import java.util.Map;
import net.minecraft.class_1923;
import net.minecraft.class_2338;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_2806;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_3532;
import net.minecraft.class_4076;
import net.minecraft.class_638;
import net.minecraft.class_2338.class_2339;

public final class NnUuunvvvUun {
   public static final int UuUVuuUu = 520;
   private static final long C00OOC00oO = 400000L;
   private static final long uUnuvNvvNU = 2000000L;
   private static final int vVvUvVVuuNvV = 48;
   private static final int uNNnnnuuuN = 33;
   private static final int nuUnNvnuUu = 35;
   private static final int VVuuUN = 32768;
   private static final int vNUvnnVnUvu = 4096;
   private static final int uVUuuVnNVU = 512;
   private static final int vuuuNvNuv = 4000;
   private static final int nvUVNnuu = 4352;
   private static final int UuuNnUvUuv = 64;
   private static final int nUUVuvU = 8192;
   private static final int[] UnUNVVVNuv;
   private static final int[] vNVuvnUUnuUn;
   private static final int[] UvnvNVnnnnNU;
   private final Long2ObjectOpenHashMap<NnUuunvvvUun.nvnNNunvv> uVUVnuvnuVuv = new Long2ObjectOpenHashMap();
   private final LongLinkedOpenHashSet NVNnnvnuunNv = new LongLinkedOpenHashSet();
   private final LongOpenHashSet uVunuUNVVUUV = new LongOpenHashSet();
   private final LongOpenHashSet UNnVVNvvnVvU = new LongOpenHashSet();
   private final LongOpenHashSet uNnUnnuNUnNu = new LongOpenHashSet();
   private final Object NnUuNNU = new Object();
   private final LongOpenHashSet nNvNUVU = new LongOpenHashSet();
   private final LongOpenHashSet UnUNuUU = new LongOpenHashSet();
   private final LongOpenHashSet uUVuVvuNUvnu = new LongOpenHashSet();
   private final long[] UvUvUNuvNU = new long[4352];
   private final byte[] c0oOOCcCoC0 = new byte[4352];
   private final class_2339 VVnVNnunVvu = new class_2339();
   private final long[] unNNVVNnvvV = new long[8192];
   private final byte[] NuunnvnN = new byte[8192];
   private final int[] NVUunUNUN = new int[8192];
   private final long[] UUVNuUNUvUnV = new long[8192];
   private final byte[] vuvnUnVnUNnV = new byte[8192];
   private final int[] nnuUVNUuvvVU = new int[65];
   private final int[] nVVUuvuNnUN = new int[65];
   private int nNnVnUNVV;
   private final long[] nuunNvv = new long[512];
   private final byte[] uUVVvVVNvvn = new byte[512];
   private final int[] vvUVNVvvNUv = new int[512];
   private int UuNnnVnuNNV;
   private final NnUuunvvvUun.NVnVnNnN uUVvnUuNvvN = new NnUuunvvvUun.NVnVnNnN();
   private int UUuUnNVNuuv;
   private int NVuNUuVnVUN;
   private int NVuunNnvvvVu;
   private int vNnNuuvVn = Integer.MIN_VALUE;
   private int VUuuVUnun = Integer.MIN_VALUE;
   private boolean vVVuuVVv;
   private boolean VuunNUUUvu;
   private boolean NNUUNUuVNNVn;
   private boolean VvVvnNUnvuvV;
   private volatile boolean ccOO0COcoco0;
   private double NUVvUUVuVNVv;
   private double nNuVunNUVu;
   private int UNvvunVVn;
   private int UnvuVuVnNuvu = 33;

   public void UuUVuuUu(int var1) {
      this.UnvuVuVnNuvu = class_3532.method_15340(var1, 1, 33);
   }

   public void UuUVuuUu() {
      this.uVUVnuvnuVuv.clear();
      this.uVUVnuvnuVuv.trim();
      this.NVNnnvnuunNv.clear();
      this.NVNnnvnuunNv.trim();
      synchronized (this.NnUuNNU) {
         this.uVunuUNVVUUV.clear();
         this.UNnVVNvvnVvU.clear();
         this.uNnUnnuNUnNu.clear();
      }

      this.nNvNUVU.clear();
      this.UnUNuUU.clear();
      this.uUVuVvuNUvnu.clear();
      this.uUVvnUuNvvN.C00OOC00oO();
      this.UuNnnVnuNNV = 0;
      this.ccOO0COcoco0 = false;
      this.vNnNuuvVn = Integer.MIN_VALUE;
      this.VUuuVUnun = Integer.MIN_VALUE;
      this.UUuUnNVNuuv = 0;
      this.NVuNUuVnVUN = 0;
      this.VvVvnNUnvuvV = true;
      this.vVVuuVVv = true;
   }

   public void C00OOC00oO() {
      this.VvVvnNUnvuvV = true;
   }

   public boolean uUnuvNvvNU() {
      boolean var1 = this.vVVuuVVv;
      this.vVVuuVVv = false;
      return var1;
   }

   public void UuUVuuUu(int var1, int var2, int var3) {
      long var4 = class_2338.method_10064(var1, var2, var3);
      synchronized (this.NnUuNNU) {
         if (this.uVunuUNVVUUV.size() >= 32768) {
            this.ccOO0COcoco0 = true;
         } else {
            this.uVunuUNVVUUV.add(var4);
         }
      }
   }

   public void UuUVuuUu(long[] var1, int var2) {
      if (var2 > 0) {
         synchronized (this.NnUuNNU) {
            if (this.uVunuUNVVUUV.size() + var2 > 32768) {
               this.ccOO0COcoco0 = true;
            } else {
               for (int var4 = 0; var4 < var2; var4++) {
                  this.uVunuUNVVUUV.add(var1[var4]);
               }
            }
         }
      }
   }

   public void UuUVuuUu(int var1, int var2) {
      long var3 = class_1923.method_8331(var1, var2);
      synchronized (this.NnUuNNU) {
         if (this.UNnVVNvvnVvU.size() >= 32768) {
            this.ccOO0COcoco0 = true;
         } else {
            this.UNnVVNvvnVvU.add(var3);
            this.uNnUnnuNUnNu.remove(var3);
         }
      }
   }

   public void C00OOC00oO(int var1, int var2) {
      long var3 = class_1923.method_8331(var1, var2);
      synchronized (this.NnUuNNU) {
         if (this.uNnUnnuNUnNu.size() >= 32768) {
            this.ccOO0COcoco0 = true;
         } else {
            this.uNnUnnuNUnNu.add(var3);
            this.UNnVVNvvnVvU.remove(var3);
         }
      }
   }

   public void UuUVuuUu(class_638 var1, int var2, int var3) {
      int var4 = var1.method_32890();
      int var5 = var1.method_32891();
      if (var4 != this.NVuNUuVnVUN || var5 != this.NVuunNnvvvVu) {
         this.NVuNUuVnVUN = var4;
         this.UUuUnNVNuuv = Math.min(var4, 64);
         this.NVuunNnvvvVu = var5;
         this.uVUVnuvnuVuv.clear();
         this.NVNnnvnuunNv.clear();
         this.VvVvnNUnvuvV = true;
         this.vVVuuVVv = true;
      }

      boolean var6 = var2 != this.vNnNuuvVn || var3 != this.VUuuVUnun;
      this.vNnNuuvVn = var2;
      this.VUuuVUnun = var3;
      if (var6) {
         this.uVUuuVnNVU();
      }

      if (this.ccOO0COcoco0) {
         this.ccOO0COcoco0 = false;
         this.VvVvnNUnvuvV = true;
      }

      if (this.VvVvnNUnvuvV) {
         this.VvVvnNUnvuvV = false;
         this.vNUvnnVnUvu();
      }

      this.UuUVuuUu(var1);
      this.vuuuNvNuv();
      this.C00OOC00oO(var1);
   }

   private void vNUvnnVnUvu() {
      int var1 = UvnvNVnnnnNU[this.UnvuVuVnNuvu];

      for (int var2 = 0; var2 < var1; var2++) {
         long var3 = class_1923.method_8331(this.vNnNuuvVn + UnUNVVVNuv[var2], this.VUuuVUnun + vNVuvnUUnuUn[var2]);
         NnUuunvvvUun.nvnNNunvv var5 = (NnUuunvvvUun.nvnNNunvv)this.uVUVnuvnuVuv.get(var3);
         if (var5 != null) {
            var5.UuUVuuUu = 0L;
         }

         this.NVNnnvnuunNv.add(var3);
      }
   }

   private void uVUuuVnNVU() {
      if (!this.uVUVnuvnuVuv.isEmpty()) {
         LongIterator var1 = this.uVUVnuvnuVuv.keySet().iterator();

         while (var1.hasNext()) {
            long var2 = var1.nextLong();
            if (Math.abs(class_1923.method_8325(var2) - this.vNnNuuvVn) > 35 || Math.abs(class_1923.method_8332(var2) - this.VUuuVUnun) > 35) {
               NnUuunvvvUun.nvnNNunvv var4 = (NnUuunvvvUun.nvnNNunvv)this.uVUVnuvnuVuv.get(var2);
               if (var4 != null && var4.C00OOC00oO != 0L) {
                  this.vVVuuVVv = true;
               }

               var1.remove();
               this.NVNnnvnuunNv.remove(var2);
            }
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(class_638 var1) {
      long[] var2 = this.uUVuVvuNUvnu.toLongArray();
      long[] var3 = this.UnUNuUU.toLongArray();
      long[] var4 = this.nNvNUVU.toLongArray();
      this.uUVuVvuNUvnu.clear();
      this.UnUNuUU.clear();
      this.nNvNUVU.clear();
      Object var5 = this.NnUuNNU;
      synchronized (this.NnUuNNU){} // $VF: monitorenter 
      boolean var12 = false /* VF: Semaphore variable */;

      try {
         var12 = true;
         if (!this.uNnUnnuNUnNu.isEmpty()) {
            this.uUVuVvuNUvnu.addAll(this.uNnUnnuNUnNu);
            this.uNnUnnuNUnNu.clear();
         }

         if (!this.UNnVVNvvnVvU.isEmpty()) {
            this.UnUNuUU.addAll(this.UNnVVNvvnVvU);
            this.UNnVVNvvnVvU.clear();
         }

         if (!this.uVunuUNVVUUV.isEmpty()) {
            this.nNvNUVU.addAll(this.uVunuUNVVUUV);
            this.uVunuUNVVUUV.clear();
         }

         // $VF: monitorexit
         var12 = false;
      } finally {
         if (var12) {
            // $VF: monitorexit
         }
      }

      for (long var8 : var2) {
         NnUuunvvvUun.nvnNNunvv var10 = (NnUuunvvvUun.nvnNNunvv)this.uVUVnuvnuVuv.remove(var8);
         this.NVNnnvnuunNv.remove(var8);
         if (var10 != null && var10.C00OOC00oO != 0L) {
            this.vVVuuVVv = true;
         }
      }

      for (long var21 : var3) {
         NnUuunvvvUun.nvnNNunvv var23 = (NnUuunvvvUun.nvnNNunvv)this.uVUVnuvnuVuv.get(var21);
         if (var23 != null) {
            var23.UuUVuuUu = 0L;
         }

         this.NVNnnvnuunNv.addAndMoveToFirst(var21);
      }

      int var16 = 0;

      for (long var9 : var4) {
         if (var16++ >= 4096) {
            this.nNvNUVU.add(var9);
         } else {
            this.UuUVuuUu(var1, var9);
         }
      }

      if (this.uUVvnUuNvvN.UuUVuuUu()) {
         this.uUVvnUuNvvN.UuUVuuUu(UUNNUNvuNNUn.UuUVuuUu(), 4000);
      }
   }

   private void UuUVuuUu(class_638 var1, long var2) {
      int var4 = class_2338.method_10061(var2);
      int var5 = class_2338.method_10071(var2);
      int var6 = class_2338.method_10083(var2);
      NnUuunvvvUun.nvnNNunvv var7 = (NnUuunvvvUun.nvnNNunvv)this.uVUVnuvnuVuv.get(class_1923.method_8331(var4 >> 4, var6 >> 4));
      if (var7 != null) {
         int var8 = (var5 >> 4) - this.NVuunNnvvvVu;
         if (var8 >= 0 && var8 < this.UUuUnNVNuuv) {
            int var9 = this.UuUVuuUu(var1, var4, var5, var6);
            UUnUvUV var10 = var7.uUnuvNvvNU == null ? null : var7.uUnuvNvvNU[var8];
            byte var11 = var10 == null ? -1 : var10.UuUVuuUu(var2);
            if (var11 != var9) {
               int var12 = UUNNUNvuNNUn.UuUVuuUu();
               if (var9 < 0) {
                  var10.C00OOC00oO(var2);
                  if (var10.UuUVuuUu() == 0) {
                     var7.C00OOC00oO &= ~(1L << var8);
                  }

                  this.UuUVuuUu(var2, var11, var12);
               } else {
                  if (var7.uUnuvNvvNU == null) {
                     var7.uUnuvNvvNU = new UUnUvUV[this.UUuUnNVNuuv];
                  }

                  if (var10 == null) {
                     var10 = new UUnUvUV();
                     var7.uUnuvNvvNU[var8] = var10;
                  }

                  var10.UuUVuuUu(var2, (byte)var9);
                  var7.C00OOC00oO |= 1L << var8;
                  this.uUVvnUuNvvN.UuUVuuUu(var2, var12);
               }

               this.vVVuuVVv = true;
            }
         }
      }
   }

   private int UuUVuuUu(class_638 var1, int var2, int var3, int var4) {
      this.VVnVNnunVvu.method_10103(var2, var3, var4);
      class_2680 var5 = var1.method_8320(this.VVnVNnunVvu);
      int var6 = vuUVvnUnUU.UuUVuuUu(var5);
      if (var6 >= 0) {
         return var6;
      } else if (!var5.method_31709()) {
         return -1;
      } else {
         class_2586 var7 = var1.method_8321(this.VVnVNnunVvu);
         return var7 == null ? -1 : vuUVvnUnUU.UuUVuuUu(var7.method_11017());
      }
   }

   private void UuUVuuUu(long var1, byte var3, int var4) {
      if (var3 >= 0) {
         for (int var5 = 0; var5 < this.UuNnnVnuNNV; var5++) {
            if (this.nuunNvv[var5] == var1) {
               this.uUVVvVVNvvn[var5] = var3;
               this.vvUVNVvvNUv[var5] = var4;
               return;
            }
         }

         if (this.UuNnnVnuNNV == 512) {
            System.arraycopy(this.nuunNvv, 1, this.nuunNvv, 0, 511);
            System.arraycopy(this.uUVVvVVNvvn, 1, this.uUVVvVVNvvn, 0, 511);
            System.arraycopy(this.vvUVNVvvNUv, 1, this.vvUVNVvvNUv, 0, 511);
            this.UuNnnVnuNNV--;
         }

         this.nuunNvv[this.UuNnnVnuNNV] = var1;
         this.uUVVvVVNvvn[this.UuNnnVnuNNV] = var3;
         this.vvUVNVvvNUv[this.UuNnnVnuNNV] = var4;
         this.UuNnnVnuNNV++;
      }
   }

   private void vuuuNvNuv() {
      if (this.UuNnnVnuNNV != 0) {
         int var1 = UUNNUNvuNNUn.UuUVuuUu();
         int var2 = 0;

         for (int var3 = 0; var3 < this.UuNnnVnuNNV; var3++) {
            if (var1 - this.vvUVNVvvNUv[var3] <= 520) {
               this.nuunNvv[var2] = this.nuunNvv[var3];
               this.uUVVvVVNvvn[var2] = this.uUVVvVVNvvn[var3];
               this.vvUVNVvvNUv[var2] = this.vvUVNVvvNUv[var3];
               var2++;
            }
         }

         this.UuNnnVnuNNV = var2;
      }
   }

   private void C00OOC00oO(class_638 var1) {
      if (!this.NVNnnvnuunNv.isEmpty()) {
         long var2 = this.NVNnnvnuunNv.size() >= 48 ? 2000000L : 400000L;
         long var4 = System.nanoTime() + var2;
         int var6 = 0;

         while (!this.NVNnnvnuunNv.isEmpty()) {
            if ((++var6 & 63) == 0 && System.nanoTime() >= var4) {
               return;
            }

            long var7 = this.NVNnnvnuunNv.firstLong();
            int var9 = class_1923.method_8325(var7);
            int var10 = class_1923.method_8332(var7);
            class_2818 var11 = var1.method_2935().method_2857(var9, var10, class_2806.field_12803, false);
            if (var11 == null) {
               this.NVNnnvnuunNv.removeFirstLong();
               NnUuunvvvUun.nvnNNunvv var12 = (NnUuunvvvUun.nvnNNunvv)this.uVUVnuvnuVuv.remove(var7);
               if (var12 != null && var12.C00OOC00oO != 0L) {
                  this.vVVuuVVv = true;
               }
            } else {
               NnUuunvvvUun.nvnNNunvv var13 = (NnUuunvvvUun.nvnNNunvv)this.uVUVnuvnuVuv.get(var7);
               if (var13 == null) {
                  var13 = new NnUuunvvvUun.nvnNNunvv();
                  var13.vVvUvVVuuNvV = UUNNUNvuNNUn.UuUVuuUu();
                  this.uVUVnuvnuVuv.put(var7, var13);
               }

               if (this.UuUVuuUu(var11, var13, var9, var10, var4)) {
                  this.NVNnnvnuunNv.removeFirstLong();
               }

               if (System.nanoTime() >= var4) {
                  return;
               }
            }
         }
      }
   }

   private boolean UuUVuuUu(class_2818 var1, NnUuunvvvUun.nvnNNunvv var2, int var3, int var4, long var5) {
      class_2826[] var7 = var1.method_12006();
      int var8 = Math.min(var7.length, this.UUuUnNVNuuv);
      long var9 = var8 >= 64 ? -1L : (1L << var8) - 1L;
      this.UuUVuuUu(var1, var8);

      for (int var11 = 0; var11 < var8; var11++) {
         if ((var2.UuUVuuUu & 1L << var11) == 0L) {
            this.UuUVuuUu(var1, var7[var11], var2, var11, var3, var4);
            var2.UuUVuuUu |= 1L << var11;
            if (System.nanoTime() >= var5) {
               break;
            }
         }
      }

      return (var2.UuUVuuUu & var9) == var9;
   }

   private void UuUVuuUu(class_2818 var1, int var2) {
      this.nNnVnUNVV = 0;
      int var3 = Math.min(var2, 64);
      Arrays.fill(this.nnuUVNUuvvVU, 0, var3 + 1, 0);
      Map var4 = var1.method_12214();
      if (!var4.isEmpty()) {
         for (class_2586 var6 : var4.values()) {
            if (this.nNnVnUNVV == 8192) {
               break;
            }

            int var7 = vuUVvnUnUU.UuUVuuUu(var6.method_11017());
            if (var7 >= 0) {
               class_2338 var8 = var6.method_11016();
               int var9 = (var8.method_10264() >> 4) - this.NVuunNnvvvVu;
               if (var9 >= 0 && var9 < var3) {
                  this.unNNVVNnvvV[this.nNnVnUNVV] = class_2338.method_10064(var8.method_10263(), var8.method_10264(), var8.method_10260());
                  this.NuunnvnN[this.nNnVnUNVV] = (byte)var7;
                  this.NVUunUNUN[this.nNnVnUNVV] = var9;
                  this.nNnVnUNVV++;
                  this.nnuUVNUuvvVU[var9 + 1]++;
               }
            }
         }
      }

      for (int var10 = 0; var10 < var3; var10++) {
         this.nnuUVNUuvvVU[var10 + 1] = this.nnuUVNUuvvVU[var10 + 1] + this.nnuUVNUuvvVU[var10];
      }

      System.arraycopy(this.nnuUVNUuvvVU, 0, this.nVVUuvuNnUN, 0, var3 + 1);

      for (int var11 = 0; var11 < this.nNnVnUNVV; var11++) {
         int var12 = this.nVVUuvuNnUN[this.NVUunUNUN[var11]]++;
         this.UUVNuUNUvUnV[var12] = this.unNNVVNnvvV[var11];
         this.vuvnUnVnUNnV[var12] = this.NuunnvnN[var11];
      }
   }

   private void UuUVuuUu(class_2818 var1, class_2826 var2, NnUuunvvvUun.nvnNNunvv var3, int var4, int var5, int var6) {
      int var7 = 0;
      int var8 = var5 << 4;
      int var9 = var6 << 4;
      int var10 = this.NVuunNnvvvVu + var4 << 4;
      if (var2 != null && !var2.method_38292() && var2.method_19523(vuUVvnUnUU.UuUVuuUu())) {
         for (int var11 = 0; var11 < 16; var11++) {
            for (int var12 = 0; var12 < 16; var12++) {
               for (int var13 = 0; var13 < 16; var13++) {
                  class_2680 var14 = var2.method_12254(var13, var11, var12);
                  int var15 = vuUVvnUnUU.UuUVuuUu(var14);
                  if (var15 >= 0) {
                     this.UvUvUNuvNU[var7] = class_2338.method_10064(var8 + var13, var10 + var11, var9 + var12);
                     this.c0oOOCcCoC0[var7] = (byte)var15;
                     var7++;
                  }
               }
            }
         }
      }

      if (var4 < 64) {
         int var16 = this.nnuUVNUuvvVU[var4 + 1];

         for (int var18 = this.nnuUVNUuvvVU[var4]; var18 < var16 && var7 != 4352; var18++) {
            this.UvUvUNuvNU[var7] = this.UUVNuUNUvUnV[var18];
            this.c0oOOCcCoC0[var7] = this.vuvnUnVnUNnV[var18];
            var7++;
         }
      }

      UUnUvUV var17 = var3.uUnuvNvvNU == null ? null : var3.uUnuvNvvNU[var4];
      if (var7 == 0) {
         if (var17 != null && var17.UuUVuuUu() != 0) {
            var17.uNNnnnuuuN();
            var3.C00OOC00oO &= ~(1L << var4);
            this.vVVuuVVv = true;
         }
      } else {
         if (var17 != null && var17.UuUVuuUu() == var7) {
            boolean var19 = true;

            for (int var21 = 0; var21 < var7; var21++) {
               if (var17.UuUVuuUu(this.UvUvUNuvNU[var21]) != this.c0oOOCcCoC0[var21]) {
                  var19 = false;
                  break;
               }
            }

            if (var19) {
               var3.C00OOC00oO |= 1L << var4;
               return;
            }
         }

         if (var3.uUnuvNvvNU == null) {
            var3.uUnuvNvvNU = new UUnUvUV[this.UUuUnNVNuuv];
         }

         if (var17 == null) {
            var17 = new UUnUvUV();
            var3.uUnuvNvvNU[var4] = var17;
         } else {
            var17.uNNnnnuuuN();
         }

         for (int var20 = 0; var20 < var7; var20++) {
            var17.UuUVuuUu(this.UvUvUNuvNU[var20], this.c0oOOCcCoC0[var20]);
         }

         var3.C00OOC00oO |= 1L << var4;
         this.vVVuuVVv = true;
      }
   }

   private boolean UuUVuuUu(long var1) {
      int var3 = class_2338.method_10061(var1);
      int var4 = class_2338.method_10071(var1);
      int var5 = class_2338.method_10083(var1);
      NnUuunvvvUun.nvnNNunvv var6 = (NnUuunvvvUun.nvnNNunvv)this.uVUVnuvnuVuv.get(class_1923.method_8331(var3 >> 4, var5 >> 4));
      if (var6 != null && var6.uUnuvNvvNU != null) {
         int var7 = (var4 >> 4) - this.NVuunNnvvvVu;
         if (var7 >= 0 && var7 < this.UUuUnNVNuuv) {
            UUnUvUV var8 = var6.uUnuvNvvNU[var7];
            return var8 != null && var8.UuUVuuUu(var1) != -1;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public int UuUVuuUu(long[] var1, byte[] var2, int[] var3, int var4, int var5, int var6, double var7, double var9, double var11, double var13) {
      this.VuunNUUUvu = false;
      this.NNUUNUuVNNVn = false;
      this.NUVvUUVuVNVv = 0.0;
      this.UNvvunVVn = 0;
      if (var4 > 0 && var5 != 0 && this.UUuUnNVNuuv != 0 && this.vNnNuuvVn != Integer.MIN_VALUE) {
         int var15 = UUNNUNvuNNUn.UuUVuuUu();
         double var16 = var13 * var13;
         int var18 = 0;

         for (int var19 = 0; var19 < this.UuNnnVnuNNV && var18 < var4; var19++) {
            byte var20 = this.uUVVvVVNvvn[var19];
            if ((var5 & 1 << var20) != 0 && var15 - this.vvUVNVvvNUv[var19] <= 520) {
               long var21 = this.nuunNvv[var19];
               if (!this.UuUVuuUu(var21) && this.UuUVuuUu(var21, var7, var9, var11, var16)) {
                  var1[var18] = var21;
                  var2[var18] = var20;
                  var3[var18] = UUNNUNvuNNUn.UuUVuuUu(this.vvUVNVvvNUv[var19]) | 65536;
                  var18++;
                  this.UNvvunVVn++;
               }
            }
         }

         boolean var40 = (var5 & 4095) != 0;
         boolean var41 = (var5 & 4190208) != 0;
         int var42 = class_3532.method_15340((int)Math.ceil(var13 / 16.0) + 1, 1, 33);
         int var22 = class_3532.method_15340(class_4076.method_18675(class_3532.method_15357(var9)) - this.NVuunNnvvvVu, 0, Math.max(this.UUuUnNVNuuv - 1, 0));
         int var23 = UvnvNVnnnnNU[var42];

         for (int var24 = 0; var24 < var23; var24++) {
            if (var18 >= var4) {
               this.VuunNUUUvu = true;
               break;
            }

            int var25 = UnUNVVVNuv[var24];
            int var26 = vNVuvnUUnuUn[var24];
            NnUuunvvvUun.nvnNNunvv var27 = (NnUuunvvvUun.nvnNNunvv)this.uVUVnuvnuVuv
               .get(class_1923.method_8331(this.vNnNuuvVn + var25, this.VUuuVUnun + var26));
            if (var27 != null && var27.C00OOC00oO != 0L && var27.uUnuvNvvNU != null) {
               boolean var28 = var40 && Math.abs(var25) <= var6 && Math.abs(var26) <= var6;
               if (var41 || var28) {
                  for (int var29 = 0; var29 < this.UUuUnNVNuuv * 2 && var18 < var4; var29++) {
                     int var30 = var29 + 1 >> 1;
                     if (var30 >= this.UUuUnNVNuuv) {
                        break;
                     }

                     int var31 = (var29 & 1) == 0 ? var22 - var30 : var22 + var30;
                     if (var31 >= 0 && var31 < this.UUuUnNVNuuv && (var27.C00OOC00oO & 1L << var31) != 0L) {
                        UUnUvUV var32 = var27.uUnuvNvvNU[var31];
                        if (var32 != null) {
                           long[] var33 = var32.uUnuvNvvNU();
                           byte[] var34 = var32.vVvUvVVuuNvV();

                           for (int var35 = 0; var35 < var34.length; var35++) {
                              byte var36 = var34[var35];
                              if (var36 != -1 && (var5 & 1 << var36) != 0 && (var36 >= 12 || var28)) {
                                 long var37 = var33[var35];
                                 if (!this.UuUVuuUu(var37, var7, var9, var11, var16)) {
                                    this.VuunNUUUvu = true;
                                 } else {
                                    if (var18 >= var4) {
                                       this.VuunNUUUvu = true;
                                       break;
                                    }

                                    int var39 = this.uUVvnUuNvvN.C00OOC00oO(var37, var27.vVvUvVVuuNvV);
                                    var1[var18] = var37;
                                    var2[var18] = var36;
                                    if (var15 - var39 > 4000) {
                                       var3[var18] = 65535;
                                    } else {
                                       var3[var18] = UUNNUNvuNNUn.UuUVuuUu(var39);
                                       this.NNUUNUuVNNVn = true;
                                    }

                                    this.NUVvUUVuVNVv = Math.max(this.NUVvUUVuVNVv, this.nNuVunNUVu);
                                    var18++;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         return var18;
      } else {
         return 0;
      }
   }

   public boolean vVvUvVVuuNvV() {
      return this.VuunNUUUvu;
   }

   public boolean uNNnnnuuuN() {
      return this.NNUUNUuVNNVn;
   }

   public double nuUnNvnuUu() {
      return Math.sqrt(this.NUVvUUVuVNVv);
   }

   public int VVuuUN() {
      return this.UNvvunVVn;
   }

   private boolean UuUVuuUu(long var1, double var3, double var5, double var7, double var9) {
      double var11 = class_2338.method_10061(var1) + 0.5 - var3;
      double var13 = class_2338.method_10071(var1) + 0.5 - var5;
      double var15 = class_2338.method_10083(var1) + 0.5 - var7;
      this.nNuVunNUVu = var11 * var11 + var13 * var13 + var15 * var15;
      return this.nNuVunNUVu <= var9;
   }

   static {
      byte var0 = 67;
      int var1 = var0 * var0;
      int[] var2 = new int[var1];
      int[] var3 = new int[var1];
      long[] var4 = new long[var1];
      int var5 = 0;

      for (int var6 = -33; var6 <= 33; var6++) {
         for (int var7 = -33; var7 <= 33; var7++) {
            var2[var5] = var6;
            var3[var5] = var7;
            int var8 = Math.max(Math.abs(var6), Math.abs(var7));
            var4[var5] = (long)var8 << 40 | (long)(var6 * var6 + var7 * var7) << 16 | var5;
            var5++;
         }
      }

      Arrays.sort(var4);
      UnUNVVVNuv = new int[var1];
      vNVuvnUUnuUn = new int[var1];

      for (int var9 = 0; var9 < var1; var9++) {
         int var11 = (int)(var4[var9] & 65535L);
         UnUNVVVNuv[var9] = var2[var11];
         vNVuvnUUnuUn[var9] = var3[var11];
      }

      UvnvNVnnnnNU = new int[34];
      int var10 = 0;

      for (int var12 = 0; var12 <= 33; var12++) {
         while (var10 < var1 && Math.max(Math.abs(UnUNVVVNuv[var10]), Math.abs(vNVuvnUUnuUn[var10])) <= var12) {
            var10++;
         }

         UvnvNVnnnnNU[var12] = var10;
      }
   }

   static final class NVnVnNnN {
      private long[] UuUVuuUu = new long[1024];
      private int[] C00OOC00oO = new int[1024];
      private boolean[] uUnuvNvvNU = new boolean[1024];
      private int vVvUvVVuuNvV = 1023;
      private int uNNnnnuuuN;

      int UuUVuuUu(long var1) {
         long var3 = var1 * -7046029254386353131L;
         var3 ^= var3 >>> 32;
         return (int)var3 & this.vVvUvVVuuNvV;
      }

      void UuUVuuUu(long var1, int var3) {
         int var4;
         for (var4 = this.UuUVuuUu(var1); this.uUnuvNvvNU[var4]; var4 = var4 + 1 & this.vVvUvVVuuNvV) {
            if (this.UuUVuuUu[var4] == var1) {
               this.C00OOC00oO[var4] = var3;
               return;
            }
         }

         this.uUnuvNvvNU[var4] = true;
         this.UuUVuuUu[var4] = var1;
         this.C00OOC00oO[var4] = var3;
         this.uNNnnnuuuN++;
      }

      int C00OOC00oO(long var1, int var3) {
         for (int var4 = this.UuUVuuUu(var1); this.uUnuvNvvNU[var4]; var4 = var4 + 1 & this.vVvUvVVuuNvV) {
            if (this.UuUVuuUu[var4] == var1) {
               return this.C00OOC00oO[var4];
            }
         }

         return var3;
      }

      boolean UuUVuuUu() {
         return this.uNNnnnuuuN >= this.UuUVuuUu.length >> 1;
      }

      void UuUVuuUu(int var1, int var2) {
         long[] var3 = this.UuUVuuUu;
         int[] var4 = this.C00OOC00oO;
         boolean[] var5 = this.uUnuvNvvNU;
         this.UuUVuuUu = new long[var3.length];
         this.C00OOC00oO = new int[var3.length];
         this.uUnuvNvvNU = new boolean[var3.length];
         this.uNNnnnuuuN = 0;

         for (int var6 = 0; var6 < var5.length; var6++) {
            if (var5[var6] && var1 - var4[var6] <= var2) {
               this.UuUVuuUu(var3[var6], var4[var6]);
            }
         }
      }

      void C00OOC00oO() {
         Arrays.fill(this.uUnuvNvvNU, false);
         this.uNNnnnuuuN = 0;
      }
   }

   static final class nvnNNunvv {
      long UuUVuuUu;
      long C00OOC00oO;
      UUnUvUV[] uUnuvNvvNU;
      int vVvUvVVuuNvV;
   }
}
