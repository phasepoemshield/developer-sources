package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class vvUnNVVnV {
   public static final float UuUVuuUu = 240.0F;
   public static final float C00OOC00oO = 0.004166667F;
   public static final int uUnuvNvvNU = 60;
   private static final float vVvUvVVuuNvV = 1.0E-4F;
   private static final float uNNnnnuuuN = 0.016666668F;
   private static final float nuUnNvnuUu = 0.1F;
   private static final vvUnNVVnV VVuuUN = new vvUnNVVnV();
   private final Object vNUvnnVnUvu = new Object();
   private final List<vvUnNVVnV.NVnVnNnN> uVUuuVnNVU = new ArrayList<>();
   private long vuuuNvNuv = System.nanoTime();
   private float nvUVNnuu = 0.016666668F;
   private long UuuNnUvUuv = 0L;

   private vvUnNVVnV() {
   }

   public static vvUnNVVnV UuUVuuUu() {
      return VVuuUN;
   }

   public void C00OOC00oO() {
      long var1 = System.nanoTime();
      long var3 = var1 - this.vuuuNvNuv;
      this.vuuuNvNuv = var1;
      if (var3 < 0L) {
         var3 = 0L;
      }

      float var5 = (float)var3 / 1.0E9F;
      if (var5 < 1.0E-4F) {
         var5 = 1.0E-4F;
      } else if (var5 > 0.1F) {
         var5 = 0.016666668F;
      }

      this.nvUVNnuu = var5;
      this.UuuNnUvUuv++;
      synchronized (this.vNUvnnVnUvu) {
         if (!this.uVUuuVnNVU.isEmpty()) {
            Iterator var7 = this.uVUuuVnNVU.iterator();

            while (var7.hasNext()) {
               vvUnNVVnV.NVnVnNnN var8 = (vvUnNVVnV.NVnVnNnN)var7.next();
               boolean var9 = var8.UuUVuuUu(var5);
               if (!var9) {
                  var7.remove();
               }
            }
         }
      }
   }

   public float uUnuvNvvNU() {
      return this.nvUVNnuu;
   }

   public long vVvUvVVuuNvV() {
      return this.UuuNnUvUuv;
   }

   public void uNNnnnuuuN() {
      this.vuuuNvNuv = System.nanoTime();
      this.nvUVNnuu = 0.016666668F;
      this.UuuNnUvUuv++;
   }

   public void UuUVuuUu(vvUnNVVnV.NVnVnNnN var1) {
      if (var1 != null) {
         synchronized (this.vNUvnnVnUvu) {
            if (!this.uVUuuVnNVU.contains(var1)) {
               this.uVUuuVnNVU.add(var1);
            }
         }
      }
   }

   public void C00OOC00oO(vvUnNVVnV.NVnVnNnN var1) {
      if (var1 != null) {
         synchronized (this.vNUvnnVnUvu) {
            this.uVUuuVnNVU.remove(var1);
         }
      }
   }

   public interface NVnVnNnN {
      boolean UuUVuuUu(float var1);
   }
}
