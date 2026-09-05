package ru.metaculture.protection;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3966;
import net.minecraft.class_4184;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AttackEffect",
   C00OOC00oO = "Красивые эффекты в точке удара",
   uUnuvNvvNU = oOOOo0.Visuals
)
public class AttackEffect extends Module {
   private static final String VVnVNnunVvu = "Торус";
   private static final String unNNVVNnvvV = "Плазма";
   private static final int NuunnvnN = 6061311;
   private static final int NVUunUNUN = 6748116;
   private static final long UUVNuUNUvUnV = 30L;
   private static final double vuvnUnVnUNnV = 9.0;
   public final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим", "Торус", "Торус", "Плазма");
   public final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Радиус волны", 1.8F, 0.1F, 3.5F, 0.05F, false).UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Торус"));
   public final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Сила преломления", 0.06F, 0.01F, 0.16F, 0.001F, false)
      .UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Торус"));
   public final nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Длительность", 420.0F, 200.0F, 1600.0F, 10.0F, false)
      .UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Торус"));
   public final vvNnnUNnVvn NnUuNNU = new vvNnnUNnVvn("Спектральная дисперсия", true).UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Торус"));
   public final vvNnnUNnVvn nNvNUVU = new vvNnnUNnVvn("Не сквозь игрока", true).UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Торус"));
   public final nNUuNvVn UnUNuUU = new nNUuNvVn("Радиус плазмы", 1.4F, 1.0F, 3.0F, 0.05F, false).UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Плазма"));
   public final nNUuNvVn uUVuVvuNUvnu = new nNUuNvVn("Температура плазмы", 1.0F, 0.5F, 2.0F, 0.05F, false)
      .UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Плазма"));
   public final nNUuNvVn UvUvUNuvNU = new nNUuNvVn("Яркость плазмы", 0.8F, 0.3F, 1.6F, 0.02F, false).UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Плазма"));
   public final nNUuNvVn c0oOOCcCoC0 = new nNUuNvVn("Длительность плазмы", 480.0F, 220.0F, 900.0F, 10.0F, false)
      .UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Плазма"));
   private final List<UVNnuuVnuuU> nnuUVNUuvvVU = new CopyOnWriteArrayList<>();
   private final List<VVVUNvUNuvV> nVVUuvuNnUN = new CopyOnWriteArrayList<>();
   private long nNnVnUNVV;
   private int nuunNvv = Integer.MIN_VALUE;
   private int uUVVvVVNvvn;

   public AttackEffect() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.NVNnnvnuunNv,
            this.uVunuUNVVUUV,
            this.UNnVVNvvnVvU,
            this.uNnUnnuNUnNu,
            this.NnUuNNU,
            this.nNvNUVU,
            this.UnUNuUU,
            this.uUVuVvuNUvnu,
            this.UvUvUNuvNU,
            this.c0oOOCcCoC0
         }
      );
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uNvNuNnVNUvv var1) {
      if (var1 != null) {
         this.UuUVuuUu(var1.uUnuvNvvNU());
      }
   }

   public void UuUVuuUu(class_1297 var1) {
      if (this.nuUnNvnuUu && var1 != null && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (var1 != uUnuvNvvNU.field_1724) {
            long var2 = System.currentTimeMillis();
            if (var1.method_5628() != this.nuunNvv || var2 - this.nNnVnUNVV >= 30L) {
               this.nuunNvv = var1.method_5628();
               this.nNnVnUNVV = var2;
               class_243 var4 = uUnuvNvvNU.field_1724.method_5828(1.0F).method_1029();
               if (this.NVNnnvnuunNv.C00OOC00oO("Плазма")) {
                  this.C00OOC00oO(var1, var4, var2);
               } else {
                  this.UuUVuuUu(var1, var4, var2);
               }
            }
         }
      }
   }

   private void UuUVuuUu(class_1297 var1, class_243 var2, long var3) {
      class_243 var5 = var1.method_5829().method_1005();
      UVNnuuVnuuU var6 = new UVNnuuVnuuU(
         var5, var2, var3, (long)this.uNnUnnuNUnNu.vVvUvVVuuNvV, this.uVunuUNVVUUV.vVvUvVVuuNvV, this.UNnVVNvvnVvU.vVvUvVVuuNvV, this.nUUVuvU()
      );
      this.nnuUVNUuvvVU.add(var6);

      while (this.nnuUVNUuvvVU.size() > 10) {
         this.nnuUVNUuvvVU.remove(0);
      }
   }

   private void C00OOC00oO(class_1297 var1, class_243 var2, long var3) {
      class_243 var5 = this.UuUVuuUu(var1, var2);
      this.uUVVvVVNvvn = this.uUVVvVVNvvn + 1 & 1023;
      float var6 = this.uUVVvVVNvvn * 7.31F % 41.0F;
      VVVUNvUNuvV var7 = new VVVUNvUNuvV(
         var5,
         var2,
         var3,
         (long)this.c0oOOCcCoC0.vVvUvVVuuNvV,
         this.UnUNuUU.vVvUvVVuuNvV,
         this.uUVuVvuNUvnu.vVvUvVVuuNvV,
         this.UvUvUNuvNU.vVvUvVVuuNvV,
         var6,
         this.UuuNnUvUuv()
      );
      this.nVVUuvuNnUN.add(var7);

      while (this.nVVUuvuNnUN.size() > 12) {
         this.nVVUuvuNnUN.remove(0);
      }
   }

   private class_243 UuUVuuUu(class_1297 var1, class_243 var2) {
      if (uUnuvNvvNU.field_1765 instanceof class_3966 var4 && var4.method_17782() == var1) {
         return var4.method_17784();
      } else {
         class_238 var7 = var1.method_5829();
         class_243 var5 = uUnuvNvvNU.field_1724.method_33571();
         class_243 var6 = var5.method_1019(var2.method_1021(9.0));
         return var7.method_992(var5, var6).orElse(var7.method_1005());
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uUnnuUn var1) {
      if (this.nuUnNvnuUu && var1 != null) {
         long var2 = System.currentTimeMillis();
         this.nnuUVNUuvvVU.removeIf(var2x -> var2x.C00OOC00oO(var2));
         this.nVVUuvuNnUN.removeIf(var2x -> var2x.C00OOC00oO(var2));
         if (!this.nnuUVNUuvvVU.isEmpty() || !this.nVVUuvuNnUN.isEmpty()) {
            class_4184 var4 = var1.uNNnnnuuuN().UuUVuuUu();
            if (var4 != null) {
               class_243 var5 = var4.method_19326();
               Matrix4f var6 = var1.VVuuUN();
               Matrix4f var7 = var1.vNUvnnVnUvu();
               float var8 = (float)(var2 % 100000L) / 1000.0F;
               if (!this.nnuUVNUuvvVU.isEmpty()) {
                  NNUvnNnnvNN.UuUVuuUu().UuUVuuUu(uUnuvNvvNU, this.nnuUVNUuvvVU, var6, var7, var5, this.NnUuNNU.uUnuvNvvNU(), this.nNvNUVU.uUnuvNvvNU(), var8);
               }

               if (!this.nVVUuvuNnUN.isEmpty()) {
                  NvvNNvNnnNnN.UuUVuuUu().UuUVuuUu(uUnuvNvvNU, this.nVVUuvuNnUN, var6, var7, var5, var8);
               }
            }
         }
      }
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      this.nnuUVNUuvvVU.clear();
      this.nVVUuvuNnUN.clear();
   }

   private int UuuNnUvUuv() {
      return this.UuUVuuUu(6748116);
   }

   private int nUUVuvU() {
      return this.UuUVuuUu(6061311);
   }

   private int UuUVuuUu(int var1) {
      try {
         if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nvUVNnuu != null) {
            NvVNvUvunNNu var2 = NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO();
            if (var2 == NvVNvUvunNNu.CUSTOM) {
               return NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO.vNUvnnVnUvu() & 16777215;
            }

            if (var2 != null && var2.UuUVuuUu() != null) {
               return var2.UuUVuuUu().getRGB() & 16777215;
            }
         }
      } catch (Throwable var3) {
      }

      return var1;
   }

   private boolean UuUVuuUu(int var1, int var2) {
      int var3 = Math.abs((var1 >> 16 & 0xFF) - (var2 >> 16 & 0xFF));
      int var4 = Math.abs((var1 >> 8 & 0xFF) - (var2 >> 8 & 0xFF));
      int var5 = Math.abs((var1 & 0xFF) - (var2 & 0xFF));
      return var3 <= 3 && var4 <= 3 && var5 <= 3;
   }
}
