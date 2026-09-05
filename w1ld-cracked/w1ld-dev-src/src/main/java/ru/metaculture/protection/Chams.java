package ru.metaculture.protection;

import java.awt.Color;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_10042;
import net.minecraft.class_10055;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Chams",
   C00OOC00oO = "Красивая шейдерная заливка моделей сущностей за стенами.",
   uUnuvNvvNU = oOOOo0.Visuals
)
public final class Chams extends Module {
   public static final String NVNnnvnuunNv = "Crystal";
   public static final String uVunuUNVVUUV = "Void";
   public static final String UNnVVNvvnVvU = "Phantom";
   public static final String uNnUnnuNUnNu = "Гибрид";
   public static final String NnUuNNU = "По сцене";
   public static final String nNvNUVU = "Сквозь стены";
   public final VUVnvvnNN UnUNuUU = new VUVnvvnNN(
      "Цели", new vvNnnUNnVvn("Игроки", true), new vvNnnUNnVvn("Мобы", true), new vvNnnUNnVvn("Себя", false), new vvNnnUNnVvn("Невидимые", true)
   );
   public final UvNnUnuNUUU uUVuVvuNUvnu = new UvNnUnuNUUU("Режим", "Crystal", "Crystal", "Void", "Phantom");
   public final UvNnUnuNUUU UvUvUNuvNU = new UvNnUnuNUUU("Глубина", "Гибрид", "Гибрид", "По сцене", "Сквозь стены");
   public final vvNnnUNnVvn c0oOOCcCoC0 = new vvNnnUNnVvn("Скрывать броню и предметы", true);
   public final vvNnnUNnVvn VVnVNnunVvu = new vvNnnUNnVvn("Скрывать ванильную тень", true);
   public final nNUuNvVn unNNVVNnvvV = new nNUuNvVn("Дистанция", 96.0F, 8.0F, 256.0F, 1.0F, false);
   public final VnnUvVNuNuVv NuunnvnN = new VnnUvVNuNuVv("Верхний акцент", 58.0F, 0.72F, 1.0F, 1.0F);
   public final VnnUvVNuNuVv NVUunUNUN = new VnnUvVNuNuVv("Нижний акцент", 76.0F, 0.82F, 1.0F, 1.0F);
   public final nNUuNvVn UUVNuUNUvUnV = new nNUuNvVn("Интенсивность", 1.35F, 0.35F, 3.0F, 0.05F, false);
   public final nNUuNvVn vuvnUnVnUNnV = new nNUuNvVn("Прозрачность", 1.0F, 0.25F, 1.0F, 0.01F, true);
   public final nNUuNvVn nnuUVNUuvvVU = new nNUuNvVn("Преломление", 0.72F, 0.35F, 1.15F, 0.01F, false);
   private final Map<Integer, Chams.NVnVnNnN> nVVUuvuNnUN = new ConcurrentHashMap<>();

   public Chams() {
      nUNuvunv.UuUVuuUu();
      this.uUVuVvuNUvnu.nuUnNvnuUu = "Screen-space шейдер чамсов: Crystal, Void или Phantom";
      this.UvUvUNuvNU.nuUnNvnuUu = "Гибрид рисует скрытый проход через стены и основной проход по depth buffer";
      this.c0oOOCcCoC0.vVvUvVVuuNvV = "Отключает броню, предметы в руках и остальные feature layers у подсвеченной сущности";
      this.VVnVNnunVvu.vVvUvVVuuNvV = "Убирает стандартную круглую тень Minecraft под подсвеченной сущностью";
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.UnUNuUU,
            this.uUVuVvuNUvnu,
            this.UvUvUNuvNU,
            this.c0oOOCcCoC0,
            this.VVnVNnunVvu,
            this.unNNVVNnvvV,
            this.NuunnvnN,
            this.NVUunUNUN,
            this.UUVNuUNUvUnV,
            this.vuvnUnVnUNnV,
            this.nnuUVNUuvvVU
         }
      );
   }

   public boolean UuUVuuUu(class_10042 var1) {
      return this.vVvUvVVuuNvV(var1) > 0.001F;
   }

   public boolean C00OOC00oO(class_10042 var1) {
      return this.c0oOOCcCoC0.uUnuvNvvNU() && this.vVvUvVVuuNvV(var1) > 0.001F;
   }

   public boolean uUnuvNvvNU(class_10042 var1) {
      return this.VVnVNnunVvu.uUnuvNvvNU() && this.vVvUvVVuuNvV(var1) > 0.001F;
   }

   public float vVvUvVVuuNvV(class_10042 var1) {
      if (var1 == null) {
         return 0.0F;
      } else {
         int var2 = nuUnNvnuUu(var1);
         boolean var3 = this.uNNnnnuuuN(var1);
         Chams.NVnVnNnN var4 = this.nVVUuvuNnUN.get(var2);
         if (var4 == null && !var3) {
            return 0.0F;
         } else {
            if (var4 == null) {
               var4 = new Chams.NVnVnNnN();
               this.nVVUuvuNnUN.put(var2, var4);
            }

            long var5 = System.nanoTime();
            float var7 = var4.uUnuvNvvNU == 0L ? 0.0F : Math.min((float)(var5 - var4.uUnuvNvvNU) / 1.0E9F, 0.05F);
            var4.uUnuvNvvNU = var5;
            float var8 = var3 ? 1.0F : 0.0F;
            float var9 = var8 - var4.UuUVuuUu;
            var4.C00OOC00oO += var9 * 42.0F * var7;
            var4.C00OOC00oO = var4.C00OOC00oO * (float)Math.exp(-13.0F * var7);
            var4.UuUVuuUu = var4.UuUVuuUu + var4.C00OOC00oO * var7;
            if (var4.UuUVuuUu < 0.0F) {
               var4.UuUVuuUu = 0.0F;
               var4.C00OOC00oO = 0.0F;
            } else if (var4.UuUVuuUu > 1.12F) {
               var4.UuUVuuUu = 1.12F;
               var4.C00OOC00oO *= -0.22F;
            }

            if (!var3 && var4.UuUVuuUu <= 0.001F) {
               this.nVVUuvuNnUN.remove(var2);
               return 0.0F;
            } else {
               return var4.UuUVuuUu;
            }
         }
      }
   }

   public boolean UuuNnUvUuv() {
      Iterator var1 = this.nVVUuvuNnUN.entrySet().iterator();

      while (var1.hasNext()) {
         Chams.NVnVnNnN var2 = (Chams.NVnVnNnN)((Entry)var1.next()).getValue();
         if (!(var2.UuUVuuUu <= 0.001F) || !(var2.C00OOC00oO <= 0.001F)) {
            return true;
         }

         var1.remove();
      }

      return false;
   }

   public int nUUVuvU() {
      if (this.uUVuVvuNUvnu.C00OOC00oO("Void")) {
         return 1;
      } else {
         return this.uUVuVvuNUvnu.C00OOC00oO("Phantom") ? 2 : 0;
      }
   }

   public boolean UnUNVVVNuv() {
      return this.UvUvUNuvNU.C00OOC00oO("Гибрид");
   }

   public boolean vNVuvnUUnuUn() {
      return this.UvUvUNuvNU.C00OOC00oO("По сцене");
   }

   private boolean uNNnnnuuuN(class_10042 var1) {
      if (!this.nuUnNvnuUu) {
         return false;
      } else if (var1 == null || uUnuvNvvNU == null || uUnuvNvvNU.field_1687 == null) {
         return false;
      } else if (var1.field_53333 && !this.UnUNuUU.C00OOC00oO("Невидимые")) {
         return false;
      } else {
         float var2 = Math.max(1.0F, this.unNNVVNnvvV.uUnuvNvvNU());
         if (var1.field_53332 > var2 * var2) {
            return false;
         } else if (var1 instanceof class_10055 var3) {
            return uUnuvNvvNU.field_1724 != null && var3.field_53529 != null && var3.field_53529.equals(uUnuvNvvNU.field_1724.method_5477().getString())
               ? this.UnUNuUU.C00OOC00oO("Себя")
               : this.UnUNuUU.C00OOC00oO("Игроки");
         } else {
            return this.UnUNuUU.C00OOC00oO("Мобы");
         }
      }
   }

   public float[] UvnvNVnnnnNU() {
      return UuUVuuUu(this.NuunnvnN.uUnuvNvvNU());
   }

   public float[] uVUVnuvnuVuv() {
      return UuUVuuUu(this.NVUunUNUN.uUnuvNvvNU());
   }

   public static Chams NVNnnvnuunNv() {
      Chams var0 = uVunuUNVVUUV();
      return var0 == null || !var0.nuUnNvnuUu && !var0.UuuNnUvUuv() ? null : var0;
   }

   public static Chams uVunuUNVVUUV() {
      return ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO != null
         ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(Chams.class)
         : null;
   }

   private static int nuUnNvnuUu(class_10042 var0) {
      int var1 = ((uuUUunvVVu)var0).wild$getEntityId();
      if (var1 != Integer.MIN_VALUE) {
         return var1;
      } else {
         int var2 = var0.field_58171 == null ? 0 : var0.field_58171.hashCode();
         int var3 = Math.round((float)var0.field_53325 * 8.0F);
         int var4 = Math.round((float)var0.field_53326 * 8.0F);
         int var5 = Math.round((float)var0.field_53327 * 8.0F);
         int var6 = var2 * 31 + var3;
         var6 = var6 * 31 + var4;
         return var6 * 31 + var5;
      }
   }

   private static float[] UuUVuuUu(Color var0) {
      return new float[]{var0.getRed() / 255.0F, var0.getGreen() / 255.0F, var0.getBlue() / 255.0F, var0.getAlpha() / 255.0F};
   }

   static final class NVnVnNnN {
      float UuUVuuUu;
      float C00OOC00oO;
      long uUnuvNvvNU;
   }
}
