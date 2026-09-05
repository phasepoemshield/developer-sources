package ru.metaculture.protection;

import net.minecraft.class_2708;
import net.minecraft.class_2743;
import net.minecraft.class_3532;
import net.minecraft.class_6373;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Timer",
   C00OOC00oO = "Ускорение игры",
   uUnuvNvvNU = oOOOo0.Movement
)
public class Timer extends Module {
   public static float NVNnnvnuunNv = 1.0F;
   private final UvNnUnuNUUU uVunuUNVVUUV = new UvNnUnuNUUU("Режим", "Умный", "Умный", "Бёрст", "Грим");
   private final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Скорость", 2.0F, 0.0F, 10.0F, 0.01F, false).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("Умный"));
   private final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("Умный сброс", true).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("Умный"));
   private final nNUuNvVn NnUuNNU = new nNUuNvVn("Скорость убывания", 3.8F, 0.15F, 5.0F, 0.1F, false)
      .UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("Умный") || !this.uNnUnnuNUnNu.uUnuvNvvNU());
   private final nNUuNvVn nNvNUVU = new nNUuNvVn("Окно дрифта", 110.0F, 40.0F, 120.0F, 1.0F, false).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("Бёрст"));
   private final nNUuNvVn UnUNuUU = new nNUuNvVn("Скорость бёрста", 3.0F, 1.5F, 6.0F, 0.1F, false).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("Бёрст"));
   private final nNUuNvVn uUVuVvuNUvnu = new nNUuNvVn("Скорость зарядки", 0.6F, 0.1F, 0.95F, 0.05F, false)
      .UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("Бёрст"));
   private final nNUuNvVn UvUvUNuvNU = new nNUuNvVn("Запас до флага", 15.0F, 0.0F, 40.0F, 1.0F, false).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("Бёрст"));
   private final nNUuNvVn c0oOOCcCoC0 = new nNUuNvVn("Скорость грима", 2.0F, 1.0F, 6.0F, 0.1F, false).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("Грим"));
   private final uVNuNUVvn VVnVNnunVvu = new uVNuNUVvn("Кнопка буста", -1).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("Грим"));
   private final vvNnnUNnVvn unNNVVNnvvV = new vvNnnUNnVvn("Ускорять в воздухе", false).UuUVuuUu(() -> this.uVunuUNVVUUV.C00OOC00oO("Грим"));
   private final float NuunnvnN = 100.0F;
   private float NVUunUNUN = 0.0F;
   private boolean UUVNuUNUvUnV = false;
   private double vuvnUnVnUNnV = 0.0;
   private long nnuUVNUuvvVU = 0L;
   private boolean nVVUuvuNnUN = false;
   private boolean nNnVnUNVV = false;
   private float nuunNvv = 0.0F;
   private long uUVVvVVNvvn = 0L;
   private long vvUVNVvvNUv = 0L;

   public Timer() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.uVunuUNVVUUV,
            this.UNnVVNvvnVvU,
            this.uNnUnnuNUnNu,
            this.NnUuNNU,
            this.nNvNUVU,
            this.UnUNuUU,
            this.uUVuVvuNUvnu,
            this.UvUvUNuvNU,
            this.c0oOOCcCoC0,
            this.VVnVNnunVvu,
            this.unNNVVNnvvV
         }
      );
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (this.uVunuUNVVUUV.C00OOC00oO("Грим")) {
         this.nUUVuvU();
      } else if (!this.unNNVVNnvvV.uUnuvNvvNU() || uUnuvNvvNU.field_1724 != null && !uUnuvNvvNU.field_1724.method_24828()) {
         if (this.uVunuUNVVUUV.C00OOC00oO("Бёрст")) {
            this.UuuNnUvUuv();
         } else if (!this.uNnUnnuNUnNu.uUnuvNvvNU()) {
            NVNnnvnuunNv = this.UNnVVNvvnVvU.uUnuvNvvNU();
         } else {
            if (this.UUVNuUNUvUnV) {
               this.NVUunUNUN = this.NVUunUNUN - this.NnUuNNU.uUnuvNvvNU();
               NVNnnvnuunNv = 1.0F;
               if (this.NVUunUNUN <= 0.0F) {
                  this.NVUunUNUN = 0.0F;
                  this.UUVNuUNUvUnV = false;
               }
            } else {
               NVNnnvnuunNv = this.UNnVVNvvnVvU.uUnuvNvvNU();
               this.NVUunUNUN = this.NVUunUNUN + this.NnUuNNU.uUnuvNvvNU();
               if (this.NVUunUNUN >= 100.0F) {
                  this.NVUunUNUN = 100.0F;
                  this.UUVNuUNUvUnV = true;
               }
            }
         }
      } else {
         NVNnnvnuunNv = 1.0F;
         this.UnUNVVVNuv();
      }
   }

   private void UuuNnUvUuv() {
      long var1 = System.nanoTime();
      boolean var3 = uUnuvNvvNU.field_1724 != null
         && (
            Math.abs(uUnuvNvvNU.field_1724.method_23317() - uUnuvNvvNU.field_1724.field_6014) > 0.001
               || Math.abs(uUnuvNvvNU.field_1724.method_23321() - uUnuvNvvNU.field_1724.field_5969) > 0.001
               || !uUnuvNvvNU.field_1724.method_24828()
         );
      if (this.nnuUVNUuvvVU == 0L) {
         this.nnuUVNUuvvVU = var1;
         this.vuvnUnVnUNnV = -this.nNvNUVU.uUnuvNvvNU();
         this.nVVUuvuNnUN = false;
         this.nNnVnUNVV = var3;
         NVNnnvnuunNv = this.UnUNuUU.uUnuvNvvNU();
      } else {
         double var4 = (var1 - this.nnuUVNUuvvVU) / 1000000.0;
         this.nnuUVNUuvvVU = var1;
         if (var4 > 300.0 || var4 < 0.0) {
            var4 = 50.0;
         }

         if (var3 && !this.nNnVnUNVV) {
            this.vuvnUnVnUNnV = -this.nNvNUVU.uUnuvNvvNU();
            this.nVVUuvuNnUN = false;
         }

         this.nNnVnUNVV = var3;
         this.vuvnUnVnUNnV += 50.0 - var4;
         if (this.vuvnUnVnUNnV < -this.nNvNUVU.uUnuvNvvNU()) {
            this.vuvnUnVnUNnV = -this.nNvNUVU.uUnuvNvvNU();
         }

         if (this.nVVUuvuNnUN) {
            NVNnnvnuunNv = this.uUVuVvuNUvnu.uUnuvNvvNU();
            if (this.vuvnUnVnUNnV <= -this.nNvNUVU.uUnuvNvvNU() + 2.0) {
               this.nVVUuvuNnUN = false;
            }
         } else {
            double var6 = Math.max(0.0, 50.0 - var4);
            if (this.vuvnUnVnUNnV + var6 >= -this.UvUvUNuvNU.uUnuvNvvNU()) {
               this.nVVUuvuNnUN = true;
               NVNnnvnuunNv = this.uUVuVvuNUvnu.uUnuvNvvNU();
            } else {
               NVNnnvnuunNv = this.UnUNuUU.uUnuvNvvNU();
            }
         }
      }
   }

   private void nUUVuvU() {
      long var1 = System.currentTimeMillis();
      int var3 = this.VVnVNnunVvu.uUnuvNvvNU();
      boolean var4 = var3 == -1 || uVNuNUVvn.C00OOC00oO(var3);
      if (!(this.nuunNvv <= 0.0F) && var4 && var1 - this.vvUVNVvvNUv >= 2000L) {
         NVNnnvnuunNv = Math.max(this.c0oOOCcCoC0.uUnuvNvvNU(), 1.0F);
         this.nuunNvv = class_3532.method_15363(this.nuunNvv - (0.0025F * this.c0oOOCcCoC0.uUnuvNvvNU() - 0.0025F), 0.0F, 1.0F);
      } else {
         NVNnnvnuunNv = 1.0F;
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (!var1.uUnuvNvvNU() && uUnuvNvvNU.field_1724 != null) {
         if (this.uVunuUNVVUUV.C00OOC00oO("Грим")) {
            this.C00OOC00oO(var1);
         } else {
            if (this.uVunuUNVVUUV.C00OOC00oO("Бёрст")) {
               boolean var2 = var1.vVvUvVVuuNvV() instanceof class_2708;
               boolean var3 = var1.vVvUvVVuuNvV() instanceof class_2743 var4 && var4.method_11818() == uUnuvNvvNU.field_1724.method_5628();
               if (var2 || var3) {
                  this.vuvnUnVnUNnV = -this.nNvNUVU.uUnuvNvvNU();
                  this.nVVUuvuNnUN = true;
                  this.nnuUVNUuvvVU = 0L;
               }
            }
         }
      }
   }

   private void C00OOC00oO(uvUUuvnunU var1) {
      long var2 = System.currentTimeMillis();
      if (var1.vVvUvVVuuNvV() instanceof class_2708) {
         this.vvUVNVvvNUv = var2;
         NVNnnvnuunNv = 1.0F;
         this.nuunNvv = 0.0F;
      } else if (var1.vVvUvVVuuNvV() instanceof class_2743 var4 && var4.method_11818() == uUnuvNvvNU.field_1724.method_5628()) {
         NVNnnvnuunNv = 1.0F;
         this.nuunNvv = 0.0F;
      } else {
         if (var1.vVvUvVVuuNvV() instanceof class_6373 && var2 - this.vvUVNVvvNUv > 2000L) {
            if (var2 - this.uUVVvVVNvvn > 25000L) {
               this.uUVVvVVNvvn = var2;
               this.nuunNvv = 0.0F;
               return;
            }

            if (!UNnnNuVnu.UuUVuuUu()) {
               this.nuunNvv = class_3532.method_15363(this.nuunNvv + 0.005F, 0.0F, 1.0F);
            }

            var1.C00OOC00oO();
         }
      }
   }

   private void UnUNVVVNuv() {
      this.NVUunUNUN = 0.0F;
      this.UUVNuUNUvUnV = false;
      this.vuvnUnVnUNnV = 0.0;
      this.nnuUVNUuvvVU = 0L;
      this.nVVUuvuNnUN = false;
      this.nNnVnUNVV = false;
      this.nuunNvv = 0.0F;
      this.uUVVvVVNvvn = System.currentTimeMillis();
      this.vvUVNVvvNUv = 0L;
   }

   @Override
   public void UuUVuuUu() {
      this.UnUNVVVNuv();
      super.UuUVuuUu();
   }

   @Override
   public void C00OOC00oO() {
      NVNnnvnuunNv = 1.0F;
      this.UnUNVVVNuv();
      super.C00OOC00oO();
   }
}
