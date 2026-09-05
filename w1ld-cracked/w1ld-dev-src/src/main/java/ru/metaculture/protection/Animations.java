package ru.metaculture.protection;

import net.minecraft.class_408;
import net.minecraft.class_437;
import net.minecraft.class_490;
import net.minecraft.class_5498;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Animations",
   uUnuvNvvNU = oOOOo0.Visuals,
   C00OOC00oO = "Анимки на все действия, таб, открытие инва итд"
)
public class Animations extends Module {
   private static final long NuunnvnN = 240L;
   private static final long NVUunUNUN = 220L;
   private static final long UUVNuUNUvUnV = 300L;
   private static final long vuvnUnVnUNnV = 240L;
   private static final long nnuUVNUuvvVU = 90L;
   private static final long nVVUuvuNnUN = 120L;
   private static final long nNnVnUNVV = 260L;
   public final VUVnvvnNN NVNnnvnuunNv = new VUVnvvnNN(
      "Анимировать",
      new vvNnnUNnVvn("Чат", false),
      new vvNnnUNnVvn("Таб", false),
      new vvNnnUNnVvn("Инвентарь", false),
      new vvNnnUNnVvn("Сундуки", false),
      new vvNnnUNnVvn("Кнопки", false),
      new vvNnnUNnVvn("F5", false)
   );
   public final UvNnUnuNUUU uVunuUNVVUUV = new UvNnUnuNUUU(
      "Режим анимации",
      "Ease Out Back",
      "Linear",
      "Ease Out Quad",
      "Ease Out Cubic",
      "Ease Out Quart",
      "Ease Out Expo",
      "Ease Out Back",
      "Ease Out Elastic",
      "Ease Out Bounce",
      "Shrink Easing"
   );
   public final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Скорость чата", 1.0F, 0.1F, 3.0F, 0.1F, false).UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Чат"));
   public final nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Скорость таба", 1.0F, 0.1F, 3.0F, 0.1F, false).UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Таб"));
   public final nNUuNvVn NnUuNNU = new nNUuNvVn("Скорость инвентаря", 1.0F, 0.1F, 3.0F, 0.1F, false).UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Инвентарь"));
   public final nNUuNvVn nNvNUVU = new nNUuNvVn("Скорость сундуков", 1.0F, 0.1F, 3.0F, 0.1F, false).UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Сундуки"));
   public final nNUuNvVn UnUNuUU = new nNUuNvVn("Скорость кнопок", 1.0F, 0.1F, 3.0F, 0.1F, false).UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Кнопки"));
   public final nNUuNvVn uUVuVvuNUvnu = new nNUuNvVn("Скорость F5", 1.0F, 0.1F, 3.0F, 0.1F, false).UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("F5"));
   public uvNVnuNn UvUvUNuvNU;
   public uvNVnuNn c0oOOCcCoC0;
   public uvNVnuNn VVnVNnunVvu;
   public static float unNNVVNnvvV = 1.0F;
   private class_5498 nuunNvv = class_5498.field_26664;
   private class_5498 uUVVvVVNvvn = class_5498.field_26664;
   private class_5498 vvUVNVvvNUv = class_5498.field_26664;
   private long UuNnnVnuNNV;
   private boolean uUVvnUuNvvN;
   private boolean UUuUnNVNuuv;
   private long NVuNUuVnVUN;
   private boolean NVuunNnvvvVu;
   private long vNnNuuvVn;
   private class_437 VUuuVUnun;
   private boolean vVVuuVVv;

   public Animations() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu, this.NnUuNNU, this.nNvNUVU, this.UnUNuUU, this.uUVuVvuNUvnu
         }
      );
   }

   public VUuNVnvnVun UuuNnUvUuv() {
      String var1 = this.uVunuUNVVUUV.uUnuvNvvNU();

      for (VUuNVnvnVun var5 : VUuNVnvnVun.values()) {
         if (var5.toString().equalsIgnoreCase(var1)) {
            return var5;
         }
      }

      return VUuNVnvnVun.EASE_OUT_BACK;
   }

   public VUuNVnvnVun nUUVuvU() {
      return this.UnUNVVVNuv();
   }

   public VUuNVnvnVun UnUNVVVNuv() {
      VUuNVnvnVun var1 = this.UuuNnUvUuv();

      return switch (var1) {
         case EASE_OUT_BACK, EASE_OUT_ELASTIC, SHRINK_EASING -> VUuNVnvnVun.EASE_OUT_QUAD;
         default -> var1;
      };
   }

   public float vNVuvnUUnuUn() {
      return UuUVuuUu(this.UnUNuUU);
   }

   public void UvnvNVnnnnNU() {
      if (this.UUuUnNVNuuv && this.c0oOOCcCoC0 != null && !this.c0oOOCcCoC0.vuuuNvNuv()) {
         this.UUuUnNVNuuv = false;
         this.NVuNUuVnVUN = 0L;
         float var1 = (float)this.c0oOOCcCoC0.uVUuuVnNVU();
         long var2 = this.nuunNvv();
         long var4 = Math.max(UuUVuuUu(80L, this.UNnVVNvvnVvU), Math.round(var2 * (1.0 - var1)));
         this.c0oOOCcCoC0.UuUVuuUu(this.UuuNnUvUuv());
         this.c0oOOCcCoC0.UuUVuuUu(var4);
         this.c0oOOCcCoC0.UuUVuuUu(1.0);
      } else {
         this.UUuUnNVNuuv = false;
         this.NVuNUuVnVUN = 0L;
         if (this.c0oOOCcCoC0 == null) {
            this.c0oOOCcCoC0 = new uvNVnuNn(this.UuuNnUvUuv(), this.nuunNvv());
         }

         this.c0oOOCcCoC0.UuUVuuUu(this.UuuNnUvUuv());
         this.c0oOOCcCoC0.UuUVuuUu(this.nuunNvv());
         this.c0oOOCcCoC0.UuUVuuUu(1.0);
      }
   }

   public void uVUVnuvnuVuv() {
      if (this.c0oOOCcCoC0 == null) {
         this.c0oOOCcCoC0 = new uvNVnuNn(this.nUUVuvU(), this.uUVVvVVNvvn());
         this.c0oOOCcCoC0.vVvUvVVuuNvV(1.0);
         this.c0oOOCcCoC0.C00OOC00oO(1.0);
         this.c0oOOCcCoC0.uUnuvNvvNU(1.0);
         this.c0oOOCcCoC0.UuUVuuUu(true);
      }

      if (!this.UUuUnNVNuuv) {
         this.UUuUnNVNuuv = true;
         this.NVuNUuVnVUN = System.currentTimeMillis();
         float var1 = (float)this.c0oOOCcCoC0.uVUuuVnNVU();
         long var2 = this.uUVVvVVNvvn();
         long var4 = Math.max(UuUVuuUu(80L, this.UNnVVNvvnVvU), (long)Math.round((float)var2 * var1));
         this.c0oOOCcCoC0.UuUVuuUu(this.nUUVuvU());
         this.c0oOOCcCoC0.UuUVuuUu(var4);
      }

      this.c0oOOCcCoC0.UuUVuuUu(0.0);
   }

   public boolean NVNnnvnuunNv() {
      return this.UUuUnNVNuuv;
   }

   public boolean uVunuUNVVUUV() {
      if (!this.UUuUnNVNuuv) {
         return false;
      } else if (this.c0oOOCcCoC0 == null) {
         return true;
      } else {
         long var1 = System.currentTimeMillis() - this.NVuNUuVnVUN;
         return var1 >= this.c0oOOCcCoC0.vVvUvVVuuNvV() + 20L ? true : this.c0oOOCcCoC0.vuuuNvNuv() && this.c0oOOCcCoC0.uVUuuVnNVU() <= 0.001;
      }
   }

   public float UNnVVNvvnVvU() {
      return this.c0oOOCcCoC0 == null ? 0.0F : (float)this.c0oOOCcCoC0.uVUuuVnNVU();
   }

   public void uNnUnnuNUnNu() {
      this.c0oOOCcCoC0 = null;
      this.UUuUnNVNuuv = false;
      this.NVuNUuVnVUN = 0L;
   }

   public boolean UuUVuuUu(class_437 var1) {
      if (var1 != null && this.nuUnNvnuUu) {
         boolean var2 = var1 instanceof class_490;
         return var2 && this.NVNnnvnuunNv.C00OOC00oO("Инвентарь") ? true : !var2 && this.NVNnnvnuunNv.C00OOC00oO("Сундуки");
      } else {
         return false;
      }
   }

   public float C00OOC00oO(class_437 var1) {
      if (!this.UuUVuuUu(var1)) {
         return 1.0F;
      } else {
         boolean var2 = this.NVuunNnvvvVu && (this.VUuuVUnun == null || this.VUuuVUnun == var1);
         long var3 = this.UuUVuuUu(var1, var2);
         if (this.UvUvUNuvNU == null) {
            this.UvUvUNuvNU = new uvNVnuNn(var2 ? this.UnUNVVVNuv() : this.UuuNnUvUuv(), var3);
            if (var2) {
               this.UvUvUNuvNU.vVvUvVVuuNvV(1.0);
               this.UvUvUNuvNU.C00OOC00oO(1.0);
               this.UvUvUNuvNU.uUnuvNvvNU(1.0);
               this.UvUvUNuvNU.UuUVuuUu(true);
            }
         }

         this.UvUvUNuvNU.UuUVuuUu(var2 ? this.UnUNVVVNuv() : this.UuuNnUvUuv());
         this.UvUvUNuvNU.UuUVuuUu(var3);
         this.UvUvUNuvNU.UuUVuuUu(var2 ? 0.0 : 1.0);
         return uUnuvNvvNU((float)this.UvUvUNuvNU.uVUuuVnNVU());
      }
   }

   public void uUnuvNvvNU(class_437 var1) {
      if (var1 != null && !this.vVVuuVVv && this.UuUVuuUu(var1)) {
         if (this.UvUvUNuvNU == null) {
            this.UvUvUNuvNU = new uvNVnuNn(this.UnUNVVVNuv(), this.vVvUvVVuuNvV(var1));
            this.UvUvUNuvNU.vVvUvVVuuNvV(1.0);
            this.UvUvUNuvNU.C00OOC00oO(1.0);
            this.UvUvUNuvNU.uUnuvNvvNU(1.0);
            this.UvUvUNuvNU.UuUVuuUu(true);
         }

         if (!this.NVuunNnvvvVu || this.VUuuVUnun != var1) {
            this.NVuunNnvvvVu = true;
            this.vNnNuuvVn = System.currentTimeMillis();
            this.VUuuVUnun = var1;
            this.UvUvUNuvNU.UuUVuuUu(this.UnUNVVVNuv());
            this.UvUvUNuvNU.UuUVuuUu(this.vVvUvVVuuNvV(var1));
         }

         this.UvUvUNuvNU.UuUVuuUu(0.0);
      }
   }

   public boolean NnUuNNU() {
      return this.NVuunNnvvvVu;
   }

   public boolean nNvNUVU() {
      return this.vVVuuVVv;
   }

   public void UnUNuUU() {
      this.UvUvUNuvNU = null;
      this.NVuunNnvvvVu = false;
      this.vNnNuuvVn = 0L;
      this.VUuuVUnun = null;
      this.vVVuuVVv = false;
   }

   public boolean uUnuvNvvNU(boolean var1) {
      if (!this.nuUnNvnuUu || !this.NVNnnvnuunNv.C00OOC00oO("Таб")) {
         return var1;
      } else {
         return var1 ? true : this.VVnVNnunVvu != null && (!this.VVnVNnunVvu.vuuuNvNuv() || this.VVnVNnunVvu.uVUuuVnNVU() > 0.001);
      }
   }

   public float vVvUvVVuuNvV(boolean var1) {
      long var2 = this.uNNnnnuuuN(var1);
      if (this.VVnVNnunVvu == null) {
         this.VVnVNnunVvu = new uvNVnuNn(var1 ? this.UuuNnUvUuv() : this.UnUNVVVNuv(), var2);
         if (!var1) {
            this.VVnVNnunVvu.vVvUvVVuuNvV(1.0);
            this.VVnVNnunVvu.C00OOC00oO(1.0);
            this.VVnVNnunVvu.uUnuvNvvNU(1.0);
            this.VVnVNnunVvu.UuUVuuUu(true);
         }
      }

      this.VVnVNnunVvu.UuUVuuUu(var1 ? this.UuuNnUvUuv() : this.UnUNVVVNuv());
      this.VVnVNnunVvu.UuUVuuUu(var2);
      this.VVnVNnunVvu.UuUVuuUu(var1 ? 1.0 : 0.0);
      float var4 = uUnuvNvvNU((float)this.VVnVNnunVvu.uVUuuVnNVU());
      if (!var1 && this.VVnVNnunVvu.vuuuNvNuv() && var4 <= 0.001F) {
         this.VVnVNnunVvu = null;
      }

      return var4;
   }

   public float uUVuVvuNUvnu() {
      if (this.nuUnNvnuUu && this.NVNnnvnuunNv.C00OOC00oO("F5") && this.uUVvnUuNvvN) {
         long var1 = System.currentTimeMillis() - this.UuNnnVnuNNV;
         unNNVVNnvvV = uUnuvNvvNU((float)var1 / (float)this.vvUVNVvvNUv());
         if (unNNVVNnvvV >= 1.0F) {
            unNNVVNnvvV = 1.0F;
            this.uUVvnUuNvvN = false;
         }

         return unNNVVNnvvV;
      } else {
         unNNVVNnvvV = 1.0F;
         this.uUVvnUuNvvN = false;
         return unNNVVNnvvV;
      }
   }

   public float UvUvUNuvNU() {
      float var1 = this.uUVuVvuNUvnu();
      return 1.0F - (float)Math.pow(1.0F - var1, 3.0);
   }

   public boolean c0oOOCcCoC0() {
      return this.uUVvnUuNvvN && this.uUVVvVVNvvn == class_5498.field_26664 && this.vvUVNVvvNUv == class_5498.field_26665;
   }

   public boolean VVnVNnunVvu() {
      return this.uUVvnUuNvvN && this.uUVVvVVNvvn != class_5498.field_26664 && this.vvUVNVvvNUv == class_5498.field_26664;
   }

   public boolean unNNVVNnvvV() {
      return this.uUVvnUuNvvN
         && (
            this.uUVVvVVNvvn == class_5498.field_26665 && this.vvUVNVvvNUv == class_5498.field_26666
               || this.uUVVvVVNvvn == class_5498.field_26666 && this.vvUVNVvvNUv == class_5498.field_26665
         );
   }

   public boolean NuunnvnN() {
      return this.unNNVVNnvvV() && this.uUVVvVVNvvn == class_5498.field_26665 && this.vvUVNVvvNUv == class_5498.field_26666;
   }

   public boolean NVUunUNUN() {
      return this.unNNVVNnvvV() && this.uUVVvVVNvvn == class_5498.field_26666 && this.vvUVNVvvNUv == class_5498.field_26665;
   }

   public float UUVNuUNUvUnV() {
      float var1 = this.UvUvUNuvNU();
      if (this.uUVVvVVNvvn == class_5498.field_26665 && this.vvUVNVvvNUv == class_5498.field_26666) {
         return 180.0F * var1;
      } else if (this.uUVVvVVNvvn == class_5498.field_26666 && this.vvUVNVvvNUv == class_5498.field_26665) {
         return 180.0F * (1.0F - var1);
      } else {
         return this.vvUVNVvvNUv == class_5498.field_26666 ? 180.0F : 0.0F;
      }
   }

   public float UuUVuuUu(float var1) {
      float var2 = this.UvUvUNuvNU();
      if (this.uUVVvVVNvvn == class_5498.field_26665 && this.vvUVNVvvNUv == class_5498.field_26666) {
         return UuUVuuUu(var1, -var1, var2);
      } else if (this.uUVVvVVNvvn == class_5498.field_26666 && this.vvUVNVvvNUv == class_5498.field_26665) {
         return UuUVuuUu(var1, -var1, 1.0F - var2);
      } else {
         return this.vvUVNVvvNUv == class_5498.field_26666 ? -var1 : var1;
      }
   }

   public float vuvnUnVnUNnV() {
      if (!this.VVnVNnunVvu()) {
         return 0.0F;
      } else {
         return this.uUVVvVVNvvn == class_5498.field_26666 ? 180.0F * (1.0F - this.UvUvUNuvNU()) : 0.0F;
      }
   }

   public float C00OOC00oO(float var1) {
      if (!this.VVnVNnunVvu()) {
         return var1;
      } else {
         return this.uUVVvVVNvvn == class_5498.field_26666 ? UuUVuuUu(-var1, var1, this.UvUvUNuvNU()) : var1;
      }
   }

   public float nnuUVNUuvvVU() {
      return this.VVnVNnunVvu() ? 1.0F - this.UvUvUNuvNU() : 0.0F;
   }

   private boolean nVVUuvuNnUN() {
      if (!this.NVuunNnvvvVu) {
         return false;
      } else if (this.UvUvUNuvNU == null) {
         return true;
      } else {
         long var1 = System.currentTimeMillis() - this.vNnNuuvVn;
         return var1 >= this.UvUvUNuvNU.vVvUvVVuuNvV() + 40L ? true : this.UvUvUNuvNU.vuuuNvNuv() && this.UvUvUNuvNU.uVUuuVnNVU() <= 0.001;
      }
   }

   private void nNnVnUNVV() {
      class_437 var1 = this.VUuuVUnun;
      this.vVVuuVVv = true;

      try {
         if (var1 != null && uUnuvNvvNU.field_1755 == var1) {
            var1.method_25419();
         } else if (uUnuvNvvNU.field_1755 != null && this.UuUVuuUu(uUnuvNvvNU.field_1755)) {
            uUnuvNvvNU.method_1507(null);
         }
      } finally {
         this.UnUNuUU();
      }
   }

   private static float uUnuvNvvNU(float var0) {
      return Math.max(0.0F, Math.min(1.0F, var0));
   }

   private long nuunNvv() {
      return UuUVuuUu(240L, this.UNnVVNvvnVvU);
   }

   private long uUVVvVVNvvn() {
      return UuUVuuUu(220L, this.UNnVVNvvnVvU);
   }

   private long uNNnnnuuuN(boolean var1) {
      return UuUVuuUu(var1 ? 300L : 240L, this.uNnUnnuNUnNu);
   }

   private long UuUVuuUu(class_437 var1, boolean var2) {
      return UuUVuuUu(var2 ? 120L : 90L, this.uNNnnnuuuN(var1));
   }

   private long vVvUvVVuuNvV(class_437 var1) {
      return UuUVuuUu(120L, this.uNNnnnuuuN(var1));
   }

   private long vvUVNVvvNUv() {
      return UuUVuuUu(260L, this.uUVuVvuNUvnu);
   }

   private nNUuNvVn uNNnnnuuuN(class_437 var1) {
      return var1 instanceof class_490 ? this.NnUuNNU : this.nNvNUVU;
   }

   private static long UuUVuuUu(long var0, nNUuNvVn var2) {
      return Math.max(1L, (long)Math.round((float)var0 / UuUVuuUu(var2)));
   }

   private static float UuUVuuUu(nNUuNvVn var0) {
      if (var0 == null) {
         return 1.0F;
      } else {
         float var1 = var0.uUnuvNvvNU();
         return Float.isFinite(var1) && !(var1 <= 0.0F) ? var1 : 1.0F;
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (!NUvunNNvN.UuUVuuUu()) {
         if (!uUnuvNvvNU.field_1690.field_1907.method_1434() && this.VVnVNnunVvu != null) {
            this.vVvUvVVuuNvV(false);
         }

         class_5498 var2 = uUnuvNvvNU.field_1690.method_31044();
         if (var2 != this.nuunNvv) {
            this.uUVVvVVNvvn = this.nuunNvv;
            this.vvUVNVvvNUv = var2;
            this.nuunNvv = var2;
            if (this.nuUnNvnuUu && this.NVNnnvnuunNv.C00OOC00oO("F5")) {
               unNNVVNnvvV = 0.0F;
               this.UuNnnVnuNNV = System.currentTimeMillis();
               this.uUVvnUuNvvN = true;
            } else {
               unNNVVNnvvV = 1.0F;
               this.uUVvnUuNvvN = false;
            }
         }

         this.uUVuVvuNUvnu();
         if (this.UUuUnNVNuuv && uUnuvNvvNU.field_1755 instanceof class_408 && this.uVunuUNVVUUV()) {
            uUnuvNvvNU.method_1507(null);
            this.uNnUnnuNUnNu();
         }

         if (this.NVuunNnvvvVu && this.nVVUuvuNnUN()) {
            this.nNnVnUNVV();
         }
      }
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * uUnuvNvvNU(var2);
   }
}
