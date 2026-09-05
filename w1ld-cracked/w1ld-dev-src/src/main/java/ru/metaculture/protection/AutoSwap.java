package ru.metaculture.protection;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Locale;
import net.minecraft.class_1041;
import net.minecraft.class_1074;
import net.minecraft.class_1304;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2561;
import net.minecraft.class_2815;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_3675;
import net.minecraft.class_7887;
import net.minecraft.class_7923;
import net.minecraft.class_9285;
import net.minecraft.class_9290;
import net.minecraft.class_9334;
import net.minecraft.class_1792.class_9635;
import net.minecraft.class_1836.class_1837;
import net.minecraft.class_9285.class_9287;
import org.lwjgl.glfw.GLFW;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoSwap",
   C00OOC00oO = "Автоматически свапает предметы через бинд",
   uUnuvNvvNU = oOOOo0.Combat,
   vVvUvVVuuNvV = {uVUNNUnNvU.GRIM}
)
public class AutoSwap extends Module {
   private static final String uUVuVvuNUvnu = "Обычный";
   private static final String UvUvUNuvNU = "Трио свап";
   private static final String c0oOOCcCoC0 = "Без фильтра";
   private static final String VVnVNnunVvu = "FT/RW";
   private static final int unNNVVNnvvV = 3;
   private static boolean NuunnvnN;
   public static UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Выбор работы свапов:", "Трио свап", "Обычный", "Трио свап");
   public static UvNnUnuNUUU uVunuUNVVUUV = new UvNnUnuNUUU("Фильтр свапов", "Без фильтра", "Без фильтра", "FT/RW");
   public static UvNnUnuNUUU UNnVVNvvnVvU = new UvNnUnuNUUU("Первый предмет", "Шар", "Золотое яблоко", "Щит", "Шар", "Тотем")
      .UuUVuuUu(() -> !NVNnnvnuunNv.C00OOC00oO("Обычный"));
   public static UvNnUnuNUUU uNnUnnuNUnNu = new UvNnUnuNUUU("Второй предмет", "Тотем 2", "Золотое яблоко 2", "Щит 2", "Шар 2", "Тотем 2")
      .UuUVuuUu(() -> !NVNnnvnuunNv.C00OOC00oO("Обычный"));
   public static uVNuNUVvn NnUuNNU = new uVNuNUVvn("Кнопка", -1);
   public static vvNnnUNnVvn nNvNUVU = new vvNnnUNnVvn("Только зачарованых тотемов", false).UuUVuuUu(() -> !NVNnnvnuunNv.C00OOC00oO("Обычный"));
   private boolean NVUunUNUN;
   private final unnunUVvU UUVNuUNUvUnV = new unnunUVvU();
   private final class_1799[] vuvnUnVnUNnV = new class_1799[]{class_1799.field_8037, class_1799.field_8037, class_1799.field_8037};
   private final String[] nnuUVNUuvvVU = new String[]{"", "", ""};
   private int nVVUuvuNnUN = 0;
   private int nNnVnUNVV = 0;
   private int nuunNvv = -1;
   private String uUVVvVVNvvn = "";
   private class_1799 vvUVNVvvNUv = class_1799.field_8037;
   private String UuNnnVnuNNV = "";
   private int uUVvnUuNvvN = 0;
   private int UUuUnNVNuuv = 0;
   private int NVuNUuVnVUN = -1;
   private String NVuunNnvvvVu = "";
   private boolean vNnNuuvVn = false;
   private boolean VUuuVUnun;
   private boolean vVVuuVVv;
   private int VuunNUUUvu = -1;
   private int NNUUNUuVNNVn = -1;
   private float VvVvnNUnvuvV;
   private float ccOO0COcoco0;
   private float NUVvUUVuVNVv;
   private float nNuVunNUVu;
   private long UNvvunVVn;
   private long UnvuVuVnNuvu;
   private long UvNNVUVNVuvV;
   private float[] NnunUUnU = new float[3];
   public static boolean UnUNuUU = false;

   public AutoSwap() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv, uVunuUNVVUUV, UNnVVNvvnVvU, uNnUnnuNUnNu, NnUuNNU, nNvNUVU});
   }

   public static boolean UuuNnUvUuv() {
      return NuunnvnN;
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVUVuNnVvU var1) {
      if (uUnuvNvvNU.field_1724 == null || uUnuvNvvNU.field_1687 == null) {
         this.NuunnvnN();
      } else if (this.VUuuVUnun) {
         if (!NVNnnvnuunNv.C00OOC00oO("Трио свап") || NnUuNNU.uUnuvNvvNU() == -1) {
            this.uUnuvNvvNU(false);
         } else if (!this.nuUnNvnuUu(NnUuNNU.uUnuvNvvNU())) {
            this.uUnuvNvvNU(true);
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 == null || uUnuvNvvNU.field_1687 == null) {
         this.NuunnvnN();
      } else if (this.vNnNuuvVn) {
         if (this.nNnVnUNVV > 0) {
            this.nNnVnUNVV--;
         } else if (!this.NVNnnvnuunNv() && this.UUuUnNVNuuv < 25) {
            this.UUuUnNVNuuv++;
            this.nNnVnUNVV = 1;
         } else {
            int var2 = this.NVuNUuVnVUN;
            String var3 = this.NVuunNnvvvVu;
            this.vNnNuuvVn = false;
            this.NVuNUuVnVUN = -1;
            this.NVuunNnvvvVu = "";
            this.UUuUnNVNuuv = 0;
            this.nNnVnUNVV = 0;
            this.C00OOC00oO(var2, var3);
         }
      } else if (this.nVVUuvuNnUN > 0) {
         this.UvnvNVnnnnNU();
         if (this.nNnVnUNVV > 0) {
            this.nNnVnUNVV--;
         } else {
            this.nUUVuvU();
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(O0C0OC0OCcCO var1) {
      if (this.VUuuVUnun && NVNnnvnuunNv.C00OOC00oO("Трио свап") && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         UnVNvNnU var2 = var1.vVvUvVVuuNvV();
         class_332 var3 = var1.vNUvnnVnUvu();
         if (var2 != null && var3 != null) {
            var2.UuUVuuUu(7.0F);
            this.UvUvUNuvNU();
            int var4 = var1.nuUnNvnuUu();
            int var5 = var1.VVuuUN();
            if (this.vVVuuVVv) {
               this.UnUNuUU();
               this.C00OOC00oO(var2, var3, var4, var5);
            } else {
               this.VuunNUUUvu = this.C00OOC00oO(this.VvVvnNUnvuvV, this.ccOO0COcoco0, var4, var5);
               this.UnUNuUU();
               this.UuUVuuUu(var2, var3, var4, var5);
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vVvuNVUVvNv var1) {
      if (var1.vVvUvVVuuNvV() == NnUuNNU.uUnuvNvvNU() && NnUuNNU.uUnuvNvvNU() != -1) {
         if (!NVNnnvnuunNv.C00OOC00oO("Трио свап")) {
            if (uUnuvNvvNU.field_1755 == null && var1.nuUnNvnuUu() == 1 && this.UUVNuUNUvUnV.vVvUvVVuuNvV(300L) && this.nVVUuvuNnUN == 0) {
               this.UUVNuUNUvUnV.UuUVuuUu();
               this.UnUNVVVNuv();
            }
         } else {
            if (var1.nuUnNvnuUu() == 1 && this.nVVUuvuNnUN == 0 && !this.VUuuVUnun && this.UUVNuUNUvUnV.vVvUvVVuuNvV(120L)) {
               this.uNnUnnuNUnNu();
               this.UUVNuUNUvUnV.UuUVuuUu();
               var1.C00OOC00oO();
            } else if (var1.nuUnNvnuUu() == 0 && this.VUuuVUnun) {
               this.uUnuvNvvNU(true);
               var1.C00OOC00oO();
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VnuuuuVvVnN var1) {
      if (!var1.uVUuuVnNVU()) {
         int var2 = -100 - var1.vVvUvVVuuNvV();
         if (NVNnnvnuunNv.C00OOC00oO("Трио свап") && NnUuNNU.uUnuvNvvNU() == var2 && this.nVVUuvuNnUN == 0) {
            if (var1.vuuuNvNuv() && !this.VUuuVUnun && this.UUVNuUNUvUnV.vVvUvVVuuNvV(120L)) {
               this.UuUVuuUu((float)var1.VVuuUN(), (float)var1.vNUvnnVnUvu());
               this.uNnUnnuNUnNu();
               this.UUVNuUNUvUnV.UuUVuuUu();
               var1.C00OOC00oO();
               return;
            }

            if (var1.nvUVNnuu() && this.VUuuVUnun) {
               this.UuUVuuUu((float)var1.VVuuUN(), (float)var1.vNUvnnVnUvu());
               this.uUnuvNvvNU(true);
               var1.C00OOC00oO();
               return;
            }
         }

         if (this.VUuuVUnun) {
            this.UuUVuuUu((float)var1.VVuuUN(), (float)var1.vNUvnnVnUvu());
            if (var1.vuuuNvNuv()) {
               this.uUnuvNvvNU(var1.vVvUvVVuuNvV());
            }

            var1.C00OOC00oO();
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vNuUUUVVunnV var1) {
      if (this.VUuuVUnun) {
         var1.C00OOC00oO();
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(NNVuvnnUnnuv var1) {
      if (this.VUuuVUnun) {
         var1.C00OOC00oO();
      }
   }

   private void nUUVuvU() {
      switch (this.nVVUuvuNnUN) {
         case 1:
            this.UvnvNVnnnnNU();
            this.uVUVnuvnuVuv();
            this.nVVUuvuNnUN = 2;
            this.nNnVnUNVV = 1;
            break;
         case 2:
            if (this.nuunNvv < 0 || this.nuunNvv >= 36) {
               this.nVVUuvuNnUN = 3;
               this.nNnVnUNVV = 1;
               return;
            }

            if (uUnuvNvvNU.field_1724.method_5624()) {
               this.UvnvNVnnnnNU();
               this.nNnVnUNVV = 1;
               return;
            }

            class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(this.nuunNvv);
            if (var3.method_7960()) {
               this.nVVUuvuNnUN = 3;
               this.nNnVnUNVV = 1;
               return;
            }

            this.vvUVNVvvNUv = var3.method_7972();
            this.vvUVNVvvNUv.method_7939(1);
            this.UuNnnVnuNNV = this.uUnuvNvvNU(var3, this.uUVVvVVNvvn);
            int var2 = uUnuvNvvNU.field_1724.field_7512.field_7763;
            uUnuvNvvNU.field_1761.method_2906(var2, this.nuunNvv < 9 ? this.nuunNvv + 36 : this.nuunNvv, 40, class_1713.field_7791, uUnuvNvvNU.field_1724);
            uUnuvNvvNU.field_1724.field_3944.method_52787(new class_2815(var2));
            this.uUVvnUuNvvN = 1;
            this.nVVUuvuNnUN = 3;
            this.nNnVnUNVV = 1;
            break;
         case 3:
            if (this.uUVvnUuNvvN > 0) {
               this.uUVvnUuNvvN--;
               this.nNnVnUNVV = 1;
               return;
            }

            if (this.uVunuUNVVUUV()) {
               class_1799 var1 = uUnuvNvvNU.field_1724.method_6079();
               this.C00OOC00oO(var1.method_7960() ? this.vvUVNVvvNUv : var1, this.UuNnnVnuNNV);
            }

            NVnVnU.UuUVuuUu().C00OOC00oO("AutoSwap");
            this.nVVUuvuNnUN = 0;
            this.nuunNvv = -1;
            UnUNuUU = false;
            this.vvUVNVvvNUv = class_1799.field_8037;
            this.UuNnnVnuNNV = "";
            this.uUVvnUuNvvN = 0;
            this.UUuUnNVNuuv = 0;
      }
   }

   private void UnUNVVVNuv() {
      boolean var1 = false;
      if (this.NVUunUNUN) {
         String var2 = uNnUnnuNUnNu.uUnuvNvvNU();
         switch (var2) {
            case "Шар 2":
               var1 = this.UuUVuuUu(class_1802.field_8575, "Шар", false);
               break;
            case "Золотое яблоко 2":
               var1 = this.UuUVuuUu(class_1802.field_8463, "Золотое яблоко", false);
               break;
            case "Тотем 2":
               var1 = this.UuUVuuUu(class_1802.field_8288, "Тотем", nNvNUVU.uUnuvNvvNU());
               break;
            case "Щит 2":
               var1 = this.UuUVuuUu(class_1802.field_8255, "Щит", false);
         }

         if (var1 || !this.UuUVuuUu(uNnUnnuNUnNu.uUnuvNvvNU())) {
            this.NVUunUNUN = false;
         }
      } else {
         String var4 = UNnVVNvvnVvU.uUnuvNvvNU();
         switch (var4) {
            case "Шар":
               var1 = this.UuUVuuUu(class_1802.field_8575, "Шар", false);
               break;
            case "Тотем":
               var1 = this.UuUVuuUu(class_1802.field_8288, "Тотем", nNvNUVU.uUnuvNvvNU());
               break;
            case "Золотое яблоко":
               var1 = this.UuUVuuUu(class_1802.field_8463, "Золотое яблоко", false);
               break;
            case "Щит":
               var1 = this.UuUVuuUu(class_1802.field_8255, "Щит", false);
         }

         if (var1 || !this.UuUVuuUu(UNnVVNvvnVvU.uUnuvNvvNU())) {
            this.NVUunUNUN = true;
         }
      }
   }

   private boolean UuUVuuUu(String var1) {
      return uVunuUNVVUUV.C00OOC00oO("FT/RW") && ("Шар".equals(var1) || "Шар 2".equals(var1));
   }

   private boolean UuUVuuUu(class_1792 var1, String var2, boolean var3) {
      int var4 = var1 == class_1802.field_8575 && uVunuUNVVUUV.C00OOC00oO("FT/RW") ? this.UNnVVNvvnVvU() : this.UuUVuuUu(var1, var3);
      if (var4 == -1) {
         return false;
      } else {
         this.UuUVuuUu(var4, var2);
         return true;
      }
   }

   private boolean UuUVuuUu(int var1) {
      if (var1 >= 0 && var1 < 3) {
         class_1799 var2 = this.vuvnUnVnUNnV[var1];
         String var3 = this.uNNnnnuuuN(var1);
         if ((!var2.method_7960() || !var3.isEmpty()) && !this.C00OOC00oO(var1)) {
            int var4 = this.UuUVuuUu(var2, var3);
            if (var4 == -1) {
               return false;
            } else {
               this.UuUVuuUu(var4, this.uUnuvNvvNU(uUnuvNvvNU.field_1724.method_31548().method_5438(var4), var2.method_7964().getString()));
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean vNVuvnUUnuUn() {
      try {
         Class var1 = Class.forName("ru.metaculture.protection.AttackAura");
         Field var2 = var1.getDeclaredField("VNNnnVUuvv");
         var2.setAccessible(true);
         return var2.getInt(null) != 0;
      } catch (Throwable var3) {
         return false;
      }
   }

   private void UuUVuuUu(int var1, String var2) {
      if (!this.vNVuvnUUnuUn()) {
         this.NVuNUuVnVUN = var1;
         this.NVuunNnvvvVu = var2;
         this.vNnNuuvVn = true;
         this.UUuUnNVNuuv = 0;
         this.nNnVnUNVV = 0;
      }
   }

   private void UvnvNVnnnnNU() {
      Sprint.NnUuNNU = 2;
      NVnVnU.UuUVuuUu().UuUVuuUu("AutoSwap");
      uUnuvNvvNU.field_1690.field_1867.method_23481(false);
      uUnuvNvvNU.field_1724.method_5728(false);
   }

   private void uVUVnuvnuVuv() {
      try {
         Class var1 = Class.forName("ru.metaculture.protection.oCCO0cc0C0Oc");
         var1.getMethod("nvUVNnuu").invoke(null);
      } catch (Throwable var2) {
      }
   }

   private void C00OOC00oO(int var1, String var2) {
      if (!this.vNVuvnUUnuUn()) {
         this.nuunNvv = var1;
         this.uUVVvVVNvvn = var2;
         this.vvUVNVvvNUv = class_1799.field_8037;
         this.UuNnnVnuNNV = var2;
         this.nVVUuvuNnUN = 1;
         UnUNuUU = true;
         this.nUUVuvU();
      }
   }

   private boolean NVNnnvnuunNv() {
      if (uUnuvNvvNU.field_1724 == null) {
         return true;
      } else if (uUnuvNvvNU.field_1724.method_24828()) {
         return true;
      } else {
         try {
            Class var1 = Class.forName("ru.metaculture.protection.AttackAura");
            Object var2 = var1.getField("ccOO0COcoco0").get(null);
            if (var2 == null) {
               return true;
            }
         } catch (Throwable var5) {
            return true;
         }

         try {
            Class var7 = Class.forName("ru.metaculture.protection.oCCO0cc0C0Oc");
            boolean var8 = (Boolean)var7.getMethod("nUUVuvU").invoke(null);
            if (!var8) {
               return false;
            } else {
               boolean var3 = (Boolean)var7.getMethod("isBestMomentToHit", boolean.class).invoke(null, true);
               return !var3 ? false : uUnuvNvvNU.field_1724.field_6017 > 0.0 || uUnuvNvvNU.field_1724.method_18798().field_1351 < -0.08;
            }
         } catch (Throwable var6) {
            return true;
         }
      }
   }

   private boolean uVunuUNVVUUV() {
      if (uUnuvNvvNU.field_1724 != null && this.vvUVNVvvNUv != null && !this.vvUVNVvvNUv.method_7960()) {
         class_1799 var1 = uUnuvNvvNU.field_1724.method_6079();
         if (var1 != null && !var1.method_7960()) {
            if (this.UuUVuuUu(var1, this.vvUVNVvvNUv, this.C00OOC00oO(this.vvUVNVvvNUv))) {
               return true;
            } else {
               return class_1799.method_31577(var1, this.vvUVNVvvNUv) ? true : var1.method_31574(this.vvUVNVvvNUv.method_7909());
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private int UuUVuuUu(class_1792 var1, boolean var2) {
      if (uUnuvNvvNU.field_1724 == null) {
         return -1;
      } else {
         for (int var3 = 0; var3 < 36; var3++) {
            class_1799 var4 = uUnuvNvvNU.field_1724.method_31548().method_5438(var3);
            if (var4.method_31574(var1) && (!var2 || var4.method_7942() || var4.method_7958())) {
               return var3;
            }
         }

         return -1;
      }
   }

   private int UNnVVNvvnVvU() {
      if (uUnuvNvvNU.field_1724 == null) {
         return -1;
      } else {
         for (int var1 = 0; var1 < 36; var1++) {
            class_1799 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(var1);
            if (this.uNNnnnuuuN(var2)) {
               return var1;
            }
         }

         return -1;
      }
   }

   private int UuUVuuUu(class_1799 var1, String var2) {
      if (uUnuvNvvNU.field_1724 == null) {
         return -1;
      } else {
         for (int var3 = 0; var3 < 36; var3++) {
            class_1799 var4 = uUnuvNvvNU.field_1724.method_31548().method_5438(var3);
            if (this.UuUVuuUu(var4, var1, var2)) {
               return var3;
            }
         }

         return -1;
      }
   }

   private boolean C00OOC00oO(int var1) {
      if (uUnuvNvvNU.field_1724 != null && var1 >= 0 && var1 < 3 && (!this.vuvnUnVnUNnV[var1].method_7960() || !this.uNNnnnuuuN(var1).isEmpty())) {
         class_1799 var2 = uUnuvNvvNU.field_1724.method_6079();
         return var2 != null && !var2.method_7960() ? this.UuUVuuUu(var2, this.vuvnUnVnUNnV[var1], this.uNNnnnuuuN(var1)) : false;
      } else {
         return false;
      }
   }

   private void uNnUnnuNUnNu() {
      this.VUuuVUnun = true;
      this.VuunNUUUvu = -1;
      this.nNvNUVU();
      UnUNuUU = true;
      this.UNvvunVVn = this.UnvuVuVnNuvu = this.UvNNVUVNVuvV = System.nanoTime();
      Arrays.fill(this.NnunUUnU, 0.0F);
      this.c0oOOCcCoC0();
      this.NUVvUUVuVNVv = this.VvVvnNUnvuvV;
      this.nNuVunNUVu = this.ccOO0COcoco0;
      if (uUnuvNvvNU.field_1729 != null) {
         uUnuvNvvNU.field_1729.method_1610();
      }

      this.VVnVNnunVvu();
   }

   private void uUnuvNvvNU(boolean var1) {
      if (this.VUuuVUnun) {
         this.UvUvUNuvNU();
         boolean var2 = this.vVVuuVVv;
         int var3 = var2
            ? -1
            : this.C00OOC00oO(this.VvVvnNUnvuvV, this.ccOO0COcoco0, uUnuvNvvNU.method_22683().method_4489(), uUnuvNvvNU.method_22683().method_4506());
         this.VUuuVUnun = false;
         this.VuunNUUUvu = -1;
         this.nNvNUVU();
         NuunnvnN = false;
         boolean var4 = var1 && var3 != -1 && this.UuUVuuUu(var3);
         if (!var4 && this.nVVUuvuNnUN == 0) {
            UnUNuUU = false;
         }

         if (uUnuvNvvNU.field_1755 == null && uUnuvNvvNU.field_1729 != null) {
            uUnuvNvvNU.field_1729.method_1612();
         }
      }
   }

   private void uUnuvNvvNU(int var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.method_22683() != null) {
         if (this.vVVuuVVv) {
            if (var1 == 0) {
               this.NnUuNNU();
            }

            if (var1 == 1) {
               this.nNvNUVU();
            }
         } else {
            int var2 = this.C00OOC00oO(this.VvVvnNUnvuvV, this.ccOO0COcoco0, uUnuvNvvNU.method_22683().method_4489(), uUnuvNvvNU.method_22683().method_4506());
            if (var2 != -1) {
               if (var1 == 0) {
                  this.vVVuuVVv = true;
                  this.NNUUNUuVNNVn = var2;
                  this.UnvuVuVnNuvu = System.nanoTime();
                  NuunnvnN = true;
               } else if (var1 == 1) {
                  this.vuvnUnVnUNnV[var2] = class_1799.field_8037;
                  this.nnuUVNUuvvVU[var2] = "";
                  this.unNNVVNnvvV();
               }
            }
         }
      }
   }

   private void NnUuNNU() {
      int var1 = this.vVvUvVVuuNvV(this.VvVvnNUnvuvV, this.ccOO0COcoco0, uUnuvNvvNU.method_22683().method_4489(), uUnuvNvvNU.method_22683().method_4506());
      if (var1 >= 0 && this.NNUUNUuVNNVn >= 0 && this.NNUUNUuVNNVn < 3) {
         class_1799 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(var1);
         if (!var2.method_7960()) {
            class_1799 var3 = var2.method_7972();
            var3.method_7939(1);
            this.vuvnUnVnUNnV[this.NNUUNUuVNNVn] = var3;
            this.nnuUVNUuvvVU[this.NNUUNUuVNNVn] = this.uUnuvNvvNU(var3);
            this.nNvNUVU();
            this.unNNVVNnvvV();
         }
      } else {
         this.nNvNUVU();
      }
   }

   private void nNvNUVU() {
      this.vVVuuVVv = false;
      this.NNUUNUuVNNVn = -1;
      NuunnvnN = false;
   }

   private void UnUNuUU() {
      long var1 = System.nanoTime();
      float var3 = this.UvNNVUVNVuvV == 0L ? 0.016F : this.UuUVuuUu((float)(var1 - this.UvNNVUVNVuvV) / 1.0E9F, 0.001F, 0.05F);
      this.UvNNVUVNVuvV = var1;

      for (int var4 = 0; var4 < 3; var4++) {
         this.NnunUUnU[var4] = this.UuUVuuUu(this.NnunUUnU[var4], var4 == this.VuunNUUUvu ? 1.0F : 0.0F, var3, 20.0F);
      }
   }

   private float vVvUvVVuuNvV(int var1) {
      float var2 = (float)(System.nanoTime() - this.UNvvunVVn) / 1000000.0F - var1 * 24.0F;
      return this.UuUVuuUu(this.UuUVuuUu(var2 / 135.0F, 0.0F, 1.0F));
   }

   private float uUVuVvuNUvnu() {
      return this.UuUVuuUu(this.UuUVuuUu((float)(System.nanoTime() - this.UnvuVuVnNuvu) / 1.2E8F, 0.0F, 1.0F));
   }

   private float UuUVuuUu(int var1, int var2) {
      float var3 = (float)(System.nanoTime() - this.UnvuVuVnNuvu) / 1000000.0F - (var1 * 9 + var2) * 3.2F;
      return this.UuUVuuUu(this.UuUVuuUu(var3 / 120.0F, 0.0F, 1.0F));
   }

   private void UuUVuuUu(UnVNvNnU var1, class_332 var2, int var3, int var4) {
      for (int var5 = 0; var5 < 3; var5++) {
         AutoSwap.nvnNNunvv var6 = this.UuUVuuUu(var5, var3, var4);
         boolean var7 = var5 == this.VuunNUUUvu;
         boolean var8 = this.C00OOC00oO(var5);
         float var9 = this.vVvUvVVuuNvV(var5);
         float var10 = this.NnunUUnU[var5];
         float var11 = var6.size * (0.86F + var9 * 0.14F + var10 * 0.035F);
         float var12 = this.C00OOC00oO(var3 / 2.0F, var6.centerX(), var9);
         float var13 = this.C00OOC00oO(var4 / 2.0F, var6.centerY(), var9);
         float var14 = var12 - var11 / 2.0F;
         float var15 = var13 - var11 / 2.0F;
         float var16 = Math.max(8.0F, var11 * 0.16F);
         int var17 = var8
            ? VnVnuUn.uUnuvNvvNU(90, 20, 26, var7 ? 180 : 135)
            : (var7 ? VnVnuUn.uUnuvNvvNU(70, 66, 28, 168) : VnVnuUn.uUnuvNvvNU(24, 26, 32, 132));
         int var18 = var8
            ? VnVnuUn.uUnuvNvvNU(44, 14, 18, var7 ? 170 : 120)
            : (var7 ? VnVnuUn.uUnuvNvvNU(34, 34, 22, 156) : VnVnuUn.uUnuvNvvNU(12, 14, 18, 118));
         int var19 = var8
            ? VnVnuUn.uUnuvNvvNU(255, 65, 75, var7 ? 230 : 190)
            : (var7 ? VnVnuUn.uUnuvNvvNU(255, 245, 110, 215) : VnVnuUn.uUnuvNvvNU(255, 255, 255, 115));
         var1.uNNnnnuuuN(var9);
         var1.UuUVuuUu(
            var14,
            var15,
            var11,
            var11,
            var16,
            var7 ? 10.0F : 6.0F,
            1.5F,
            var8 ? VnVnuUn.uUnuvNvvNU(255, 55, 65, var7 ? 70 : 45) : VnVnuUn.uUnuvNvvNU(0, 0, 0, var7 ? 90 : 60)
         );
         this.UuUVuuUu(var1, var14, var15, var11, var11, var16, var17, var18, var19, var7 ? 23.0F : 60.0F, var8 ? 2.4F : (var7 ? 2.0F : 1.25F));
         if (this.vuvnUnVnUNnV[var5].method_7960()) {
            this.UuUVuuUu(var1, var12, var13, var11 * 0.28F, VnVnuUn.uUnuvNvvNU(255, 255, 255, var7 ? 230 : 160));
         }

         var1.vuuuNvNuv();
      }

      var1.uUnuvNvvNU();

      for (int var23 = 0; var23 < 3; var23++) {
         class_1799 var24 = this.vuvnUnVnUNnV[var23];
         if (!var24.method_7960()) {
            AutoSwap.nvnNNunvv var25 = this.UuUVuuUu(var23, var3, var4);
            float var26 = this.vVvUvVVuuNvV(var23);
            if (!(var26 <= 0.08F)) {
               float var27 = this.NnunUUnU[var23];
               float var28 = this.C00OOC00oO(var3 / 2.0F, var25.centerX(), var26);
               float var29 = this.C00OOC00oO(var4 / 2.0F, var25.centerY(), var26);
               float var30 = (var23 == this.VuunNUUUvu ? 2.85F : 2.55F) * (0.84F + var26 * 0.16F + var27 * 0.035F);
               float var31 = 16.0F * var30;
               float var32 = var25.size * (0.86F + var26 * 0.14F + var27 * 0.035F);
               float var33 = var28 - var32 * 0.5F;
               float var34 = var29 - var32 * 0.5F;
               float var35 = Math.max(8.0F, var32 * 0.16F);
               var1.UuUVuuUu(var33, var34, var32, var32, var35, var35, var35, var35);

               try {
                  NuNvVUuUUnun.UuUVuuUu(
                     var1,
                     var24,
                     NuNvVUuUUnun.UuUVuuUu(var28 - var31 * 0.5F),
                     NuNvVUuUUnun.UuUVuuUu(var29 - var31 * 0.5F),
                     NuNvVUuUUnun.uUnuvNvvNU(var30),
                     var23,
                     true,
                     var23
                  );
               } finally {
                  var1.uUnuvNvvNU();
                  var1.nuUnNvnuUu();
               }
            }
         }
      }
   }

   private void C00OOC00oO(UnVNvNnU var1, class_332 var2, int var3, int var4) {
      AutoSwap.NVnVnNnN var5 = this.C00OOC00oO(var3, var4);
      float var6 = 10.0F;
      float var7 = var5.startX - var6;
      float var8 = var5.startY - var6;
      float var9 = var5.width + var6 * 2.0F;
      float var10 = var5.height + var6 * 2.0F;
      int var11 = VnVnuUn.uUnuvNvvNU(15, 15, 18, 150);
      int var12 = VnVnuUn.uUnuvNvvNU(255, 255, 255, 80);
      float var13 = this.uUVuVvuNUvnu();
      var1.uNNnnnuuuN(var13);
      this.UuUVuuUu(var1, var7, var8, var9, var10, 10.0F, var11, VnVnuUn.uUnuvNvvNU(8, 8, 10, 130), var12, 23.0F, 1.25F);
      int var14 = this.vVvUvVVuuNvV(this.VvVvnNUnvuvV, this.ccOO0COcoco0, var3, var4);

      for (int var15 = 0; var15 < 4; var15++) {
         for (int var16 = 0; var16 < 9; var16++) {
            int var17 = this.uUnuvNvvNU(var15, var16);
            float var18 = var5.startX + var16 * (var5.slotSize + var5.gap);
            float var19 = var5.startY + var15 * (var5.slotSize + var5.gap);
            class_1799 var20 = uUnuvNvvNU.field_1724.method_31548().method_5438(var17);
            boolean var21 = var17 == var14;
            boolean var22 = this.UuUVuuUu(var20);
            int var23 = var21 ? VnVnuUn.uUnuvNvvNU(255, 255, 255, 75) : VnVnuUn.uUnuvNvvNU(0, 0, 0, 75);
            int var24 = var22 ? VnVnuUn.uUnuvNvvNU(255, 55, 65, 225) : (var21 ? VnVnuUn.uUnuvNvvNU(255, 245, 120, 210) : VnVnuUn.uUnuvNvvNU(255, 255, 255, 45));
            if (var21) {
               this.UuUVuuUu(var1, var18, var19, var5.slotSize, var5.slotSize, 5.0F, var23, VnVnuUn.uUnuvNvvNU(0, 0, 0, 62), var24, 23.0F, var22 ? 2.0F : 1.0F);
            } else {
               var1.UuUVuuUu(var18, var19, var5.slotSize, var5.slotSize, 5.0F, var23);
               var1.UuUVuuUu(var18, var19, var5.slotSize, var5.slotSize, 5.0F, var24, var22 ? 2.0F : 1.0F);
            }
         }
      }

      var1.vuuuNvNuv();
      var1.uUnuvNvvNU();
      var1.UuUVuuUu(var7, var8, var9, var10, 10.0F, 10.0F, 10.0F, 10.0F);

      try {
         for (int var28 = 0; var28 < 4; var28++) {
            for (int var29 = 0; var29 < 9; var29++) {
               int var30 = this.uUnuvNvvNU(var28, var29);
               class_1799 var31 = uUnuvNvvNU.field_1724.method_31548().method_5438(var30);
               if (!var31.method_7960()) {
                  float var32 = this.UuUVuuUu(var28, var29);
                  if (!(var32 <= 0.05F)) {
                     float var33 = var5.slotSize / 22.0F * (0.76F + var32 * 0.24F);
                     float var34 = 16.0F * var33;
                     float var35 = var5.startX + var29 * (var5.slotSize + var5.gap) + (var5.slotSize - var34) / 2.0F;
                     float var36 = var5.startY + var28 * (var5.slotSize + var5.gap) + (var5.slotSize - var34) / 2.0F;
                     NuNvVUuUUnun.UuUVuuUu(
                        var1, var31, NuNvVUuUUnun.UuUVuuUu(var35), NuNvVUuUUnun.UuUVuuUu(var36), NuNvVUuUUnun.uUnuvNvvNU(var33), var30, true, var30
                     );
                  }
               }
            }
         }
      } finally {
         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }
   }

   private int UuUVuuUu(float var1, float var2, int var3, int var4) {
      for (int var5 = 0; var5 < 3; var5++) {
         AutoSwap.nvnNNunvv var6 = this.UuUVuuUu(var5, var3, var4);
         if (nunvNNUnvU.UuUVuuUu(var1, var2, var6.x, var6.y, var6.size, var6.size)) {
            return var5;
         }
      }

      return -1;
   }

   private int C00OOC00oO(float var1, float var2, int var3, int var4) {
      int var5 = this.UuUVuuUu(var1, var2, var3, var4);
      return var5 != -1 ? var5 : this.uUnuvNvvNU(var1, var2, var3, var4);
   }

   private int uUnuvNvvNU(float var1, float var2, int var3, int var4) {
      float var5 = var1 - this.NUVvUUVuVNVv;
      float var6 = var2 - this.nNuVunNUVu;
      float var7 = this.UuUVuuUu(Math.min(var3, var4) * 0.035F, 18.0F, 38.0F);
      float var8 = var5 * var5 + var6 * var6;
      if (var8 < var7 * var7) {
         return -1;
      } else {
         float var9 = 1.0F / (float)Math.sqrt(var8);
         float var10 = var5 * var9;
         float var11 = var6 * var9;
         if (var11 > 0.82F && Math.abs(var10) < 0.38F) {
            return -1;
         } else {
            float var12 = -var11;
            float var13 = var10 * 0.848F + var11 * 0.53F;
            float var14 = -var10 * 0.848F + var11 * 0.53F;
            float var15 = Math.max(var12, Math.max(var13, var14));
            if (var15 < 0.45F) {
               return -1;
            } else if (var15 == var12) {
               return 0;
            } else {
               return var15 == var13 ? 1 : 2;
            }
         }
      }
   }

   private int vVvUvVVuuNvV(float var1, float var2, int var3, int var4) {
      AutoSwap.NVnVnNnN var5 = this.C00OOC00oO(var3, var4);

      for (int var6 = 0; var6 < 4; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            float var8 = var5.startX + var7 * (var5.slotSize + var5.gap);
            float var9 = var5.startY + var6 * (var5.slotSize + var5.gap);
            if (var1 >= var8 && var1 <= var8 + var5.slotSize && var2 >= var9 && var2 <= var9 + var5.slotSize) {
               return this.uUnuvNvvNU(var6, var7);
            }
         }
      }

      return -1;
   }

   private AutoSwap.NVnVnNnN C00OOC00oO(int var1, int var2) {
      float var3 = this.UuUVuuUu(Math.min(var1, var2) * 0.042F, 30.0F, 42.0F);
      float var4 = Math.max(4.0F, var3 * 0.14F);
      float var5 = var3 * 9.0F + var4 * 8.0F;
      float var6 = var3 * 4.0F + var4 * 3.0F;
      float var7 = (var1 - var5) / 2.0F;
      float var8 = (var2 - var6) / 2.0F;
      return new AutoSwap.NVnVnNnN(var7, var8, var3, var4, var5, var6);
   }

   private int uUnuvNvvNU(int var1, int var2) {
      return var1 == 3 ? var2 : 9 + var1 * 9 + var2;
   }

   private AutoSwap.nvnNNunvv UuUVuuUu(int var1, int var2, int var3) {
      float var4 = this.vVvUvVVuuNvV(var2, var3);
      float var5 = var2 / 2.0F;
      float var6 = var3 / 2.0F;
      float var7 = var4 * 1.35F;
      float var8 = var4 * 1.25F;
      float var9 = var4 * 0.85F;
      float var10 = var5 - var4 / 2.0F;
      float var11 = var6 - var8 - var4 / 2.0F;
      if (var1 == 1) {
         var10 = var5 + var7 - var4 / 2.0F;
         var11 = var6 + var9 - var4 / 2.0F;
      } else if (var1 == 2) {
         var10 = var5 - var7 - var4 / 2.0F;
         var11 = var6 + var9 - var4 / 2.0F;
      }

      return new AutoSwap.nvnNNunvv(var10, var11, var4, Math.max(8.0F, var4 * 0.16F));
   }

   private float vVvUvVVuuNvV(int var1, int var2) {
      return this.UuUVuuUu(Math.min(var1, var2) * 0.155F, 76.0F, 118.0F);
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, float var10, float var11) {
      nunvNNUnvU.UuUVuuUu(var1, var2, var3, var4, var5, var6, () -> {
         var1.UuUVuuUu(var2, var3, var4, var5, var6, var10);
         var1.C00OOC00oO(var2, var3, var4, var5, 0.0F, var7, var8);
      });
      var1.UuUVuuUu(var2, var3, var4, var5, var6, var9, var11);
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, int var5) {
      float var6 = Math.max(2.0F, var4 * 0.16F);
      var1.UuUVuuUu(var2 - var6 / 2.0F, var3 - var4 / 2.0F, var6, var4, var6 / 2.0F, var5);
      var1.UuUVuuUu(var2 - var4 / 2.0F, var3 - var6 / 2.0F, var4, var6, var6 / 2.0F, var5);
   }

   private boolean UuUVuuUu(class_1799 var1) {
      if (uUnuvNvvNU.field_1724 != null && var1 != null && !var1.method_7960()) {
         class_1799 var2 = uUnuvNvvNU.field_1724.method_6079();
         return var2 != null && !var2.method_7960() && this.UuUVuuUu(var2, var1, this.C00OOC00oO(var1));
      } else {
         return false;
      }
   }

   private boolean UuUVuuUu(class_1799 var1, class_1799 var2) {
      return this.UuUVuuUu(var1, var2, this.C00OOC00oO(var2));
   }

   private boolean UuUVuuUu(class_1799 var1, class_1799 var2, String var3) {
      if (var1 == null || var1.method_7960()) {
         return false;
      } else if (var2 != null && !var2.method_7960()) {
         String var5 = this.C00OOC00oO(var3);
         if (!var5.isEmpty()) {
            return "ft:sphere:any".equals(var5) ? this.uNNnnnuuuN(var1) : var5.equals(this.C00OOC00oO(var1));
         } else if (!uVunuUNVVUUV.C00OOC00oO("FT/RW") || !var2.method_31574(class_1802.field_8575) && !this.uNNnnnuuuN(var2)) {
            return !var1.method_31574(var2.method_7909()) ? false : var2.method_57380().method_57848() || class_1799.method_31577(var1, var2);
         } else {
            return this.uNNnnnuuuN(var1);
         }
      } else {
         String var4 = this.C00OOC00oO(var3);
         return "ft:sphere:any".equals(var4) ? this.uNNnnnuuuN(var1) : !var4.isEmpty() && var4.equals(this.C00OOC00oO(var1));
      }
   }

   private String uNNnnnuuuN(int var1) {
      if (var1 >= 0 && var1 < 3) {
         String var2 = this.C00OOC00oO(this.nnuUVNUuvvVU[var1]);
         return !var2.isEmpty() ? var2 : this.C00OOC00oO(this.vuvnUnVnUNnV[var1]);
      } else {
         return "";
      }
   }

   private String C00OOC00oO(class_1799 var1) {
      if (var1 != null && !var1.method_7960()) {
         String var2 = this.vVvUvVVuuNvV(var1);
         if (!var2.isEmpty()) {
            return var2;
         } else {
            if (var1.method_57826(class_9334.field_49631)) {
               String var3 = this.uUnuvNvvNU(var1.method_7964().getString());
               if (!var3.isEmpty()) {
                  return "name:" + class_7923.field_41178.method_10221(var1.method_7909()) + ":" + var3;
               }
            }

            return "item:" + class_7923.field_41178.method_10221(var1.method_7909());
         }
      } else {
         return "";
      }
   }

   private String uUnuvNvvNU(class_1799 var1) {
      return this.C00OOC00oO(var1);
   }

   private String UuUVuuUu(String var1, class_1799 var2) {
      String var3 = this.C00OOC00oO(var1);
      if ("ft:sphere:any".equals(var3) && var2 != null && !var2.method_7960()) {
         String var4 = this.C00OOC00oO(var2);
         if (var4.startsWith("ft:sphere:") && !"ft:sphere:any".equals(var4)) {
            return var4;
         }
      }

      return var3;
   }

   private String vVvUvVVuuNvV(class_1799 var1) {
      if (vnVVvun.UuUVuuUu(var1)) {
         return "ft:sphere:haos";
      } else if (vnVVvun.C00OOC00oO(var1)) {
         return "ft:sphere:titan";
      } else if (vnVVvun.uUnuvNvvNU(var1)) {
         return "ft:sphere:ares";
      } else if (vnVVvun.vVvUvVVuuNvV(var1)) {
         return "ft:sphere:besti";
      } else if (vnVVvun.uNNnnnuuuN(var1)) {
         return "ft:sphere:gidra";
      } else if (vnVVvun.nuUnNvnuUu(var1)) {
         return "ft:sphere:ikara";
      } else if (vnVVvun.VVuuUN(var1)) {
         return "ft:sphere:erida";
      } else if (vnVVvun.vNUvnnVnUvu(var1)) {
         return "ft:sphere:satira";
      } else if (vnVVvun.uVUuuVnNVU(var1)) {
         return "ft:sphere:moroz";
      } else if (vnVVvun.vuuuNvNuv(var1)) {
         return "ft:talisman:demon";
      } else if (vnVVvun.nvUVNnuu(var1)) {
         return "ft:talisman:karatel";
      } else if (vnVVvun.UuuNnUvUuv(var1)) {
         return "ft:talisman:mrak";
      } else if (vnVVvun.nUUVuvU(var1)) {
         return "ft:talisman:yaristi";
      } else if (vnVVvun.UnUNVVVNuv(var1)) {
         return "ft:talisman:tiran";
      } else if (vnVVvun.vNVuvnUUnuUn(var1)) {
         return "ft:talisman:krushitel";
      } else if (vnVVvun.UvnvNVnnnnNU(var1)) {
         return "ft:talisman:razdor";
      } else if (vnVVvun.uVUVnuvnuVuv(var1)) {
         return "ft:talisman:sara";
      } else if (vnVVvun.uVunuUNVVUUV(var1)) {
         return "ft:potion:assassin";
      } else if (vnVVvun.UNnVVNvvnVvU(var1)) {
         return "ft:potion:gnev";
      } else if (vnVVvun.uNnUnnuNUnNu(var1)) {
         return "ft:potion:hlopushka";
      } else if (vnVVvun.NnUuNNU(var1)) {
         return "ft:potion:holy_water";
      } else if (vnVVvun.nNvNUVU(var1)) {
         return "ft:potion:paladin";
      } else if (vnVVvun.UnUNuUU(var1)) {
         return "ft:potion:radiation";
      } else if (vnVVvun.uUVuVvuNUvnu(var1)) {
         return "ft:potion:snotvornoye";
      } else if (vnVVvun.UvUvUNuvNU(var1)) {
         return "ft:item:light_dust";
      } else if (vnVVvun.c0oOOCcCoC0(var1)) {
         return "ft:item:disorientation";
      } else if (vnVVvun.VVnVNnunVvu(var1)) {
         return "ft:item:trapka";
      } else if (vnVVvun.unNNVVNnvvV(var1)) {
         return "ft:item:lockpick_spheres";
      } else if (vnVVvun.NuunnvnN(var1)) {
         return "ft:item:plast";
      } else if (vnVVvun.vNnNuuvVn(var1)) {
         return "ft:item:dragon_skin";
      } else if (vnVVvun.VUuuVUnun(var1)) {
         return "ft:item:fire_whirlwind";
      } else if (vnVVvun.vVVuuVVv(var1)) {
         return "ft:item:freezing_snowball";
      } else if (vnVVvun.VuunNUUUvu(var1)) {
         return "ft:item:gods_aura";
      } else {
         return vnVVvun.NNUUNUuVNNVn(var1) ? "ft:item:silver" : "";
      }
   }

   private String C00OOC00oO(String var1) {
      return var1 == null ? "" : var1.trim().toLowerCase(Locale.ROOT);
   }

   private String uUnuvNvvNU(String var1) {
      return var1 == null
         ? ""
         : var1.replaceAll("§.", "").replaceAll("В§.", "").replaceAll("&.", "").replace(' ', ' ').replaceAll("\\s+", " ").trim().toLowerCase(Locale.ROOT);
   }

   private boolean uNNnnnuuuN(class_1799 var1) {
      return var1 != null && var1.method_31574(class_1802.field_8575) && (this.vNUvnnVnUvu(var1) || this.nuUnNvnuUu(var1) || this.VVuuUN(var1));
   }

   private boolean nuUnNvnuUu(class_1799 var1) {
      class_9285 var2 = (class_9285)var1.method_58694(class_9334.field_49636);
      if (var2 == null) {
         return false;
      } else {
         for (class_9287 var4 : var2.comp_2393()) {
            if (var4.comp_2397().method_57286(class_1304.field_6171)) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean VVuuUN(class_1799 var1) {
      if (var1 != null && !var1.method_7960()) {
         class_9290 var2 = (class_9290)var1.method_58694(class_9334.field_49632);
         if (var2 == null) {
            return false;
         } else {
            String var3 = this.vVvUvVVuuNvV(class_1074.method_4662("item.modifiers.offhand", new Object[0]));
            StringBuilder var4 = new StringBuilder();

            for (class_2561 var6 : var2.comp_2400()) {
               String var7 = this.vVvUvVVuuNvV(var6.getString());
               var4.append(' ').append(var7);
               if (var7.contains("when in off hand")
                  || !var3.isEmpty() && var7.contains(var3)
                  || var7.contains("когда во второстепенной")
                  || var7.contains("коли в другій руці")
                  || var7.contains("при ношении в левой")
                  || var7.contains("в лівій руці")) {
                  return true;
               }
            }

            String var8 = var4.toString();
            return var8.contains("when in off hand")
               || !var3.isEmpty() && var8.contains(var3)
               || var8.contains("когда во второстепенной")
               || var8.contains("коли в другій руці")
               || var8.contains("при ношении в левой")
               || var8.contains("в лівій руці");
         }
      } else {
         return false;
      }
   }

   private boolean vNUvnnVnUvu(class_1799 var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         try {
            for (class_2561 var3 : var1.method_7950(class_9635.method_59528(uUnuvNvvNU.field_1687), uUnuvNvvNU.field_1724, class_1837.field_41070)) {
               if (this.uNNnnnuuuN(this.vVvUvVVuuNvV(var3.getString()))) {
                  return true;
               }
            }

            return false;
         } catch (Throwable var4) {
            return false;
         }
      } else {
         return false;
      }
   }

   private String vVvUvVVuuNvV(String var1) {
      return var1 == null ? "" : var1.replaceAll("§[0-9a-fk-orA-FK-OR]", "").replace(' ', ' ').replaceAll("\\s+", " ").trim().toLowerCase(Locale.ROOT);
   }

   private boolean uNNnnnuuuN(String var1) {
      String var2 = this.vVvUvVVuuNvV(class_1074.method_4662("item.modifiers.offhand", new Object[0]));
      return var1.contains("when in off hand")
         || !var2.isEmpty() && var1.contains(var2)
         || var1.contains("когда во второстепенной")
         || var1.contains("коли в другій руці")
         || var1.contains("при ношении в левой")
         || var1.contains("в лівій руці");
   }

   private void UvUvUNuvNU() {
      if (uUnuvNvvNU.method_22683() != null) {
         double[] var1 = new double[1];
         double[] var2 = new double[1];
         GLFW.glfwGetCursorPos(uUnuvNvvNU.method_22683().method_4490(), var1, var2);
         this.UuUVuuUu((float)var1[0], (float)var2[0]);
      }
   }

   private void c0oOOCcCoC0() {
      class_1041 var1 = uUnuvNvvNU.method_22683();
      if (var1 != null && !var1.method_65966() && var1.method_4489() > 0 && var1.method_4506() > 0) {
         this.VvVvnNUnvuvV = var1.method_4489() * 0.5F;
         this.ccOO0COcoco0 = var1.method_4506() * 0.5F;
      }
   }

   private void VVnVNnunVvu() {
      class_1041 var1 = uUnuvNvvNU.method_22683();
      if (var1 != null && !var1.method_65966() && var1.method_4480() > 0 && var1.method_4507() > 0) {
         GLFW.glfwSetCursorPos(var1.method_4490(), var1.method_4480() * 0.5, var1.method_4507() * 0.5);
      }
   }

   private void UuUVuuUu(float var1, float var2) {
      if (Float.isFinite(var1) && Float.isFinite(var2)) {
         class_1041 var3 = uUnuvNvvNU.method_22683();
         if (var3 != null && !var3.method_65966() && var3.method_4489() > 0 && var3.method_4506() > 0 && var3.method_4480() > 0 && var3.method_4507() > 0) {
            this.VvVvnNUnvuvV = this.UuUVuuUu(
               (float)((double)(var1 * var3.method_4489()) / var3.method_4480()), 0.0F, Math.max(0.0F, var3.method_4489() - 1.0F)
            );
            this.ccOO0COcoco0 = this.UuUVuuUu(
               (float)((double)(var2 * var3.method_4506()) / var3.method_4507()), 0.0F, Math.max(0.0F, var3.method_4506() - 1.0F)
            );
            return;
         }

         this.VvVvnNUnvuvV = var1;
         this.ccOO0COcoco0 = var2;
      }
   }

   private boolean nuUnNvnuUu(int var1) {
      if (uUnuvNvvNU.method_22683() == null) {
         return false;
      } else {
         long var2 = uUnuvNvvNU.method_22683().method_4490();
         if (var1 >= 0) {
            return class_3675.method_15987(var2, var1);
         } else if (var1 > -100) {
            return false;
         } else {
            int var4 = -var1 - 100;
            return var4 >= 0 && var4 <= 7 && GLFW.glfwGetMouseButton(var2, var4) == 1;
         }
      }
   }

   private void C00OOC00oO(class_1799 var1, String var2) {
      nuVVunNUnVnv.UuUVuuUu(var1, var2, 2200L);
   }

   private void unNNVVNnvvV() {
      if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
         ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
      }
   }

   private String uUnuvNvvNU(class_1799 var1, String var2) {
      if (var1 == null || var1.method_7960()) {
         return var2;
      } else if (vnVVvun.UuUVuuUu(var1)) {
         return "Сфера Хаоса";
      } else if (vnVVvun.C00OOC00oO(var1)) {
         return "Сфера Титана";
      } else if (vnVVvun.uUnuvNvvNU(var1)) {
         return "Сфера Ареса";
      } else if (vnVVvun.vVvUvVVuuNvV(var1)) {
         return "Сфера Бестии";
      } else if (vnVVvun.uNNnnnuuuN(var1)) {
         return "Сфера Гидры";
      } else if (vnVVvun.nuUnNvnuUu(var1)) {
         return "Сфера Икара";
      } else if (vnVVvun.VVuuUN(var1)) {
         return "Сфера Эрида";
      } else if (vnVVvun.vNUvnnVnUvu(var1)) {
         return "Сфера Сатира";
      } else if (vnVVvun.uVUuuVnNVU(var1)) {
         return "Сфера Мороз";
      } else if (vnVVvun.vuuuNvNuv(var1)) {
         return "Талисман Демона";
      } else if (vnVVvun.nvUVNnuu(var1)) {
         return "Талисман Карателя";
      } else if (vnVVvun.UuuNnUvUuv(var1)) {
         return "Талисман Мрака";
      } else if (vnVVvun.nUUVuvU(var1)) {
         return "Талисман Ярости";
      } else if (vnVVvun.UnUNVVVNuv(var1)) {
         return "Талисман Тирана";
      } else if (vnVVvun.vNVuvnUUnuUn(var1)) {
         return "Талисман Крушителя";
      } else if (vnVVvun.UvnvNVnnnnNU(var1)) {
         return "Талисман Раздора";
      } else {
         return var1.method_57826(class_9334.field_49631) ? var1.method_7964().getString() : var2;
      }
   }

   private void NuunnvnN() {
      boolean var1 = this.VUuuVUnun;
      if (this.nVVUuvuNnUN > 0) {
         NVnVnU.UuUVuuUu().C00OOC00oO("AutoSwap");
      }

      this.VUuuVUnun = false;
      this.VuunNUUUvu = -1;
      this.nNvNUVU();
      NuunnvnN = false;
      this.nVVUuvuNnUN = 0;
      this.nNnVnUNVV = 0;
      this.nuunNvv = -1;
      UnUNuUU = false;
      this.vNnNuuvVn = false;
      this.NVuNUuVnVUN = -1;
      this.NVuunNnvvvVu = "";
      this.vvUVNVvvNUv = class_1799.field_8037;
      this.UuNnnVnuNNV = "";
      this.uUVvnUuNvvN = 0;
      this.UUuUnNVNuuv = 0;
      if (var1 && uUnuvNvvNU.field_1755 == null && uUnuvNvvNU.field_1729 != null) {
         uUnuvNvvNU.field_1729.method_1612();
      }
   }

   @Override
   public JsonObject b_() {
      JsonObject var1 = super.b_();
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (int var4 = 0; var4 < 3; var4++) {
         JsonObject var5 = new JsonObject();
         class_1799 var6 = this.vuvnUnVnUNnV[var4];
         if (var6 != null && !var6.method_7960()) {
            var5.addProperty("item", class_7923.field_41178.method_10221(var6.method_7909()).toString());
            String var7 = this.uNNnnnuuuN(var4);
            if (!var7.isEmpty()) {
               var5.addProperty("key", var7);
            }

            class_1799 var8 = var6.method_7972();
            var8.method_7939(1);
            class_1799.field_24671.encodeStart(this.NVUunUNUN(), var8).result().ifPresent(var1x -> var5.add("stack", var1x));
         }

         var3.add(var5);
      }

      var2.add("Slots", var3);
      var1.add("AutoSwapTrio", var2);
      return var1;
   }

   @Override
   public void UuUVuuUu(JsonObject var1) {
      super.UuUVuuUu(var1);
      if (var1 != null && var1.has("AutoSwapTrio") && var1.get("AutoSwapTrio").isJsonObject()) {
         JsonObject var2 = var1.getAsJsonObject("AutoSwapTrio");
         if (var2.has("Slots") && var2.get("Slots").isJsonArray()) {
            class_1799[] var3 = new class_1799[]{class_1799.field_8037, class_1799.field_8037, class_1799.field_8037};
            String[] var4 = new String[]{"", "", ""};
            JsonArray var5 = var2.getAsJsonArray("Slots");

            for (int var6 = 0; var6 < Math.min(3, var5.size()); var6++) {
               JsonElement var7 = var5.get(var6);
               if (var7 != null && var7.isJsonObject()) {
                  JsonObject var8 = var7.getAsJsonObject();
                  if (var8.has("key")) {
                     var4[var6] = this.C00OOC00oO(var8.get("key").getAsString());
                  }

                  if (var8.has("stack")) {
                     class_1799 var9 = class_1799.field_24671.parse(this.NVUunUNUN(), var8.get("stack")).result().orElse(class_1799.field_8037);
                     if (!var9.method_7960()) {
                        var9.method_7939(1);
                        var3[var6] = var9;
                        var4[var6] = this.UuUVuuUu(var4[var6], var9);
                        if (var4[var6].isEmpty()) {
                           var4[var6] = this.uUnuvNvvNU(var9);
                        }
                        continue;
                     }
                  }

                  if (var8.has("item")) {
                     class_2960 var12 = class_2960.method_12829(var8.get("item").getAsString());
                     if (var12 != null) {
                        class_1792 var10 = (class_1792)class_7923.field_41178.method_63535(var12);
                        if (var10 != class_1802.field_8162) {
                           var3[var6] = new class_1799(var10);
                           if (var4[var6].isEmpty()) {
                              var4[var6] = var10 == class_1802.field_8575 && uVunuUNVVUUV.C00OOC00oO("FT/RW") ? "ft:sphere:any" : this.uUnuvNvvNU(var3[var6]);
                           }
                        }
                     }
                  }
               }
            }

            for (int var11 = 0; var11 < 3; var11++) {
               this.vuvnUnVnUNnV[var11] = var3[var11];
               this.nnuUVNUuvvVU[var11] = var4[var11];
            }
         }
      }
   }

   private DynamicOps<JsonElement> NVUunUNUN() {
      if (uUnuvNvvNU.field_1687 != null) {
         return uUnuvNvvNU.field_1687.method_30349().method_57093(JsonOps.INSTANCE);
      } else {
         return uUnuvNvvNU.method_1562() != null
            ? uUnuvNvvNU.method_1562().method_29091().method_57093(JsonOps.INSTANCE)
            : class_7887.method_46817().method_57093(JsonOps.INSTANCE);
      }
   }

   @Override
   public void C00OOC00oO() {
      this.NuunnvnN();
      super.C00OOC00oO();
   }

   private float UuUVuuUu(float var1, float var2, float var3) {
      return Math.max(var2, Math.min(var3, var1));
   }

   private float UuUVuuUu(float var1, float var2, float var3, float var4) {
      return var1 + (var2 - var1) * (1.0F - (float)Math.exp(-var4 * var3));
   }

   private float UuUVuuUu(float var1) {
      float var2 = 1.0F - this.UuUVuuUu(var1, 0.0F, 1.0F);
      return 1.0F - var2 * var2 * var2;
   }

   private float C00OOC00oO(float var1, float var2, float var3) {
      return var1 + (var2 - var1) * var3;
   }

   record NVnVnNnN(float startX, float startY, float slotSize, float gap, float width, float height) {
   }

   record nvnNNunvv(float x, float y, float size, float radius) {

      float centerX() {
         return this.x + this.size / 2.0F;
      }

      float centerY() {
         return this.y + this.size / 2.0F;
      }
   }
}
