package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.GoalNear;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.Map.Entry;
import net.minecraft.class_1268;
import net.minecraft.class_1713;
import net.minecraft.class_1714;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_3965;
import net.minecraft.class_479;
import net.minecraft.class_7923;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoCraft",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Автоматически крафтит выбранный рецепт"
)
public class AutoCraft extends Module {
   public final NVnVVNVNnv NVNnnvnuunNv = new NVnVVNVNnv("Рецепт");
   public final NVuVVUNUvV uVunuUNVVUUV = new NVuVVUNUvV("Кол-во предметов", "64").UuUVuuUu(6);
   public final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Задержка", 80.0F, 20.0F, 500.0F, 10.0F, false);
   public final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("Не отображать экран", false);
   private final VuNvNNvVV NnUuNNU = new VuNvNNvVV();
   private final VuNvNNvVV nNvNUVU = new VuNvNNvVV();
   private final VuNvNNvVV UnUNuUU = new VuNvNNvVV();
   private final Queue<Runnable> uUVuVvuNUvnu = new ArrayDeque<>();
   private IBaritone UvUvUNuvNU;
   private AutoCraft.NVnVnNnN c0oOOCcCoC0 = AutoCraft.NVnVnNnN.IDLE;
   private class_2338 VVnVNnunVvu;
   private int unNNVVNnvvV;
   private int NuunnvnN;
   private int NVUunUNUN;
   private String UUVNuUNUvUnV = "";
   private class_479 vuvnUnVnUNnV;

   public AutoCraft() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu});
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.UvUvUNuvNU = BaritoneAPI.getProvider().getPrimaryBaritone();
      this.unNNVVNnvvV = 0;
      this.NuunnvnN = 0;
      this.NVUunUNUN = 0;
      this.uUVuVvuNUvnu.clear();
      this.UUVNuUNUvUnV = "";
      if (this.NVNnnvnuunNv.vVvUvVVuuNvV()) {
         this.uUnuvNvvNU("§cРецепт пуст.");
      } else if (this.UvUvUNuvNU() <= 0) {
         this.uUnuvNvvNU("§cНекорректное количество предметов.");
      } else {
         this.c0oOOCcCoC0 = AutoCraft.NVnVnNnN.FINDING_TABLE;
         this.NnUuNNU.UuUVuuUu();
         this.nNvNUVU.UuUVuuUu();
         this.UnUNuUU.UuUVuuUu();
      }
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      this.uUVuVvuNUvnu.clear();
      this.VVnVNnunVvu = null;
      this.NuunnvnN = 0;
      this.NVUunUNUN = 0;
      this.c0oOOCcCoC0 = AutoCraft.NVnVnNnN.IDLE;
      this.vuvnUnVnUNnV = null;
      COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
      if (this.UvUvUNuvNU != null) {
         this.UvUvUNuvNU.getPathingBehavior().cancelEverything();
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(CocoCOCco0C var1) {
      if (this.uNnUnnuNUnNu.uUnuvNvvNU() && this.c0oOOCcCoC0 != AutoCraft.NVnVnNnN.IDLE && var1.uUnuvNvvNU() instanceof class_479 var2) {
         this.vuvnUnVnUNnV = var2;
         var1.vVvUvVVuuNvV();
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         if (!this.UuuNnUvUuv()) {
            if (!this.NnUuNNU()) {
               if (!this.UUVNuUNUvUnV.isBlank()) {
                  this.uUnuvNvvNU("§cНе хватает предмета: §f" + this.C00OOC00oO(this.UUVNuUNUvUnV));
               } else {
                  switch (this.c0oOOCcCoC0) {
                     case IDLE:
                     default:
                        break;
                     case FINDING_TABLE:
                        this.nUUVuvU();
                        break;
                     case GOING_TO_TABLE:
                        this.UnUNVVVNuv();
                        break;
                     case AIMING_TABLE:
                        this.vNVuvnUUnuUn();
                        break;
                     case OPENING_TABLE:
                        this.UvnvNVnnnnNU();
                        break;
                     case CLEARING_GRID:
                        this.uVUVnuvnuVuv();
                        break;
                     case PLACING_RECIPE:
                        this.NVNnnvnuunNv();
                        break;
                     case WAITING_RESULT:
                        this.uVunuUNVVUUV();
                        break;
                     case TAKING_RESULT:
                        this.UNnVVNvvnVvU();
                        break;
                     case CLOSING:
                        this.uNnUnnuNUnNu();
                  }
               }
            }
         }
      }
   }

   private boolean UuuNnUvUuv() {
      if (!PlayerHelper.UuuNnUvUuv()) {
         return false;
      } else {
         if (this.UvUvUNuvNU != null) {
            this.UvUvUNuvNU.getPathingBehavior().cancelEverything();
         }

         COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
         COC0OCc.nuUnNvnuUu = 0;
         COC0OCc.uVUuuVnNVU = null;
         return true;
      }
   }

   private void nUUVuvU() {
      if (this.NnUuNNU.uNNnnnuuuN(this.uUVuVvuNUvnu())) {
         this.VVnVNnunVvu = this.UnUNuUU();
         if (this.VVnVNnunVvu == null) {
            this.uUnuvNvvNU("§cВерстак рядом не найден.");
         } else {
            this.c0oOOCcCoC0 = AutoCraft.NVnVnNnN.GOING_TO_TABLE;
            this.NnUuNNU.UuUVuuUu();
            this.nNvNUVU.UuUVuuUu();
            this.UnUNuUU.UuUVuuUu();
         }
      }
   }

   private void UnUNVVVNuv() {
      if (!this.UuUVuuUu(this.VVnVNnunVvu)) {
         this.c0oOOCcCoC0 = AutoCraft.NVnVnNnN.FINDING_TABLE;
         this.NnUuNNU.UuUVuuUu();
      } else {
         double var1 = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(this.VVnVNnunVvu));
         if (var1 <= 4.0) {
            if (this.UvUvUNuvNU != null) {
               this.UvUvUNuvNU.getPathingBehavior().cancelEverything();
            }

            this.c0oOOCcCoC0 = AutoCraft.NVnVnNnN.AIMING_TABLE;
            this.NnUuNNU.UuUVuuUu();
         } else {
            if (this.UvUvUNuvNU != null && (!this.UvUvUNuvNU.getCustomGoalProcess().isActive() || this.nNvNUVU.uNNnnnuuuN(1500L))) {
               this.UvUvUNuvNU.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.VVnVNnunVvu, 2));
               this.nNvNUVU.UuUVuuUu();
            }

            if (this.UnUNuUU.uNNnnnuuuN(15000L)) {
               this.uUnuvNvvNU("§cНе удалось дойти до верстака.");
            }
         }
      }
   }

   private void vNVuvnUUnuUn() {
      uuUuvNuNVNVU var1 = this.UuUVuuUu(class_243.method_24953(this.VVnVNnunVvu));
      COC0OCc.UuUVuuUu(var1, 45.0F, 45.0F, 30.0F, 30.0F, 4, 5, false);
      if (!(new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var1) > 4.0F) && this.NnUuNNU.uNNnnnuuuN(this.uUVuVvuNUvnu())) {
         class_3965 var2 = new class_3965(class_243.method_24953(this.VVnVNnunVvu), class_2350.field_11036, this.VVnVNnunVvu, false);
         uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var2);
         uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
         this.c0oOOCcCoC0 = AutoCraft.NVnVnNnN.OPENING_TABLE;
         this.NnUuNNU.UuUVuuUu();
      }
   }

   private void UvnvNVnnnnNU() {
      if (this.nNvNUVU() != null) {
         this.c0oOOCcCoC0 = AutoCraft.NVnVnNnN.CLEARING_GRID;
         this.NnUuNNU.UuUVuuUu();
      } else {
         if (this.NnUuNNU.uNNnnnuuuN(5000L)) {
            this.uUnuvNvvNU("§cВерстак не открылся.");
         }
      }
   }

   private void uVUVnuvnuVuv() {
      class_479 var1 = this.nNvNUVU();
      if (var1 == null) {
         this.c0oOOCcCoC0 = AutoCraft.NVnVnNnN.FINDING_TABLE;
         this.NnUuNNU.UuUVuuUu();
      } else {
         class_1714 var2 = (class_1714)var1.method_17577();

         for (int var3 = 1; var3 <= 9; var3++) {
            if (var2.method_7611(var3).method_7681()) {
               int var4 = var3;
               this.uUVuVvuNUvnu.add(() -> uUnuvNvvNU.field_1761.method_2906(var2.field_7763, var4, 0, class_1713.field_7794, uUnuvNvvNU.field_1724));
            }
         }

         this.c0oOOCcCoC0 = AutoCraft.NVnVnNnN.PLACING_RECIPE;
         this.NnUuNNU.UuUVuuUu();
      }
   }

   private void NVNnnvnuunNv() {
      class_479 var1 = this.nNvNUVU();
      if (var1 == null) {
         this.c0oOOCcCoC0 = AutoCraft.NVnVnNnN.FINDING_TABLE;
         this.NnUuNNU.UuUVuuUu();
      } else {
         class_1714 var2 = (class_1714)var1.method_17577();
         String var3 = this.UuUVuuUu(var2);
         if (!var3.isBlank()) {
            this.uUnuvNvvNU("§cНе хватает предмета: §f" + this.C00OOC00oO(var3));
         } else {
            for (int var4 = 0; var4 < 9; var4++) {
               String var5 = this.NVNnnvnuunNv.UuUVuuUu(var4);
               if (!var5.isBlank()) {
                  int var6 = var4 + 1;
                  this.uUVuVvuNUvnu.add(() -> this.UuUVuuUu(var2, var5, var6));
               }
            }

            this.c0oOOCcCoC0 = AutoCraft.NVnVnNnN.WAITING_RESULT;
            this.NnUuNNU.UuUVuuUu();
         }
      }
   }

   private void uVunuUNVVUUV() {
      class_479 var1 = this.nNvNUVU();
      if (var1 == null) {
         this.c0oOOCcCoC0 = AutoCraft.NVnVnNnN.FINDING_TABLE;
         this.NnUuNNU.UuUVuuUu();
      } else if (this.NnUuNNU.uNNnnnuuuN(Math.max(150, this.uUVuVvuNUvnu() * 2))) {
         if (!((class_1714)var1.method_17577()).method_7611(0).method_7681()) {
            this.uUnuvNvvNU("§cРецепт не даёт результат.");
         } else {
            class_1799 var2 = ((class_1714)var1.method_17577()).method_7611(0).method_7677().method_7972();
            int var3 = Math.max(1, var2.method_7947());
            int var4 = Math.max(1, this.UvUvUNuvNU() - this.unNNVVNnvvV);
            int var5 = Math.max(1, (var4 + var3 - 1) / var3);
            this.NVUunUNUN = Math.max(1, Math.min(var5, this.C00OOC00oO((class_1714)var1.method_17577())));
            this.NuunnvnN = this.NVUunUNUN * var3;
            int var6 = this.NVUunUNUN - 1;
            if (var6 > 0) {
               this.UuUVuuUu((class_1714)var1.method_17577(), var6);
            }

            this.c0oOOCcCoC0 = AutoCraft.NVnVnNnN.TAKING_RESULT;
            this.NnUuNNU.UuUVuuUu();
         }
      }
   }

   private void UNnVVNvvnVvU() {
      class_479 var1 = this.nNvNUVU();
      if (var1 == null) {
         this.c0oOOCcCoC0 = AutoCraft.NVnVnNnN.FINDING_TABLE;
         this.NnUuNNU.UuUVuuUu();
      } else if (this.NnUuNNU.uNNnnnuuuN(this.uUVuVvuNUvnu())) {
         class_1799 var2 = ((class_1714)var1.method_17577()).method_7611(0).method_7677().method_7972();
         int var3 = Math.max(1, var2.method_7947());
         uUnuvNvvNU.field_1761.method_2906(((class_1714)var1.method_17577()).field_7763, 0, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
         this.unNNVVNnvvV = this.unNNVVNnvvV + Math.max(var3, this.NuunnvnN);
         vVnvuVVUunuv.UuUVuuUu("§8[§6AutoCraft§8] §aСкрафтил: §f" + Math.min(this.unNNVVNnvvV, this.UvUvUNuvNU()) + "/" + this.UvUvUNuvNU());
         this.NuunnvnN = 0;
         this.NVUunUNUN = 0;
         this.c0oOOCcCoC0 = AutoCraft.NVnVnNnN.CLOSING;
         this.NnUuNNU.UuUVuuUu();
      }
   }

   private void uNnUnnuNUnNu() {
      if (this.NnUuNNU.uNNnnnuuuN(this.uUVuVvuNUvnu())) {
         if (this.unNNVVNnvvV >= this.UvUvUNuvNU()) {
            if (uUnuvNvvNU.field_1724 != null) {
               uUnuvNvvNU.field_1724.method_7346();
            }

            this.vuvnUnVnUNnV = null;
            vVnvuVVUunuv.UuUVuuUu("§8[§6AutoCraft§8] §aГотово.");
            this.UuUVuuUu(false);
         } else {
            this.c0oOOCcCoC0 = AutoCraft.NVnVnNnN.CLEARING_GRID;
            this.NnUuNNU.UuUVuuUu();
         }
      }
   }

   private boolean NnUuNNU() {
      if (this.uUVuVvuNUvnu.isEmpty()) {
         return false;
      } else if (!this.NnUuNNU.uNNnnnuuuN(this.uUVuVvuNUvnu())) {
         return true;
      } else {
         this.uUVuVvuNUvnu.poll().run();
         this.NnUuNNU.UuUVuuUu();
         return true;
      }
   }

   private class_479 nNvNUVU() {
      class_479 var1 = VuUNvNNvvnV.UuUVuuUu(uUnuvNvvNU, this.vuvnUnVnUNnV, class_479.class);
      if (var1 == null) {
         this.vuvnUnVnUNnV = null;
      }

      return var1;
   }

   private String UuUVuuUu(class_1714 var1) {
      HashMap var2 = new HashMap();

      for (String var6 : this.NVNnnvnuunNv.uNNnnnuuuN()) {
         if (var6 != null && !var6.isBlank()) {
            var2.put(var6, var2.getOrDefault(var6, 0) + 1);
         }
      }

      for (Entry var8 : var2.entrySet()) {
         int var9 = this.UuUVuuUu(var1, (String)var8.getKey());
         if (var9 < (Integer)var8.getValue()) {
            return (String)var8.getKey();
         }
      }

      return "";
   }

   private int UuUVuuUu(class_1714 var1, String var2) {
      int var3 = 0;

      for (int var4 = 10; var4 < var1.field_7761.size(); var4++) {
         class_1799 var5 = var1.method_7611(var4).method_7677();
         if (this.UuUVuuUu(var5, var2)) {
            var3 += var5.method_7947();
         }
      }

      return var3;
   }

   private int C00OOC00oO(class_1714 var1) {
      HashMap var2 = new HashMap();
      int var3 = 64;

      for (String var7 : this.NVNnnvnuunNv.uNNnnnuuuN()) {
         if (var7 != null && !var7.isBlank()) {
            var2.put(var7, var2.getOrDefault(var7, 0) + 1);
            class_1799 var8 = this.UuUVuuUu(var7);
            if (!var8.method_7960()) {
               var3 = Math.min(var3, var8.method_7914());
            }
         }
      }

      int var9 = var3;

      for (Entry var11 : var2.entrySet()) {
         int var12 = (Integer)var11.getValue();
         int var13 = this.UuUVuuUu(var1, (String)var11.getKey()) + var12;
         var9 = Math.min(var9, var13 / (Integer)var11.getValue());
      }

      return Math.max(1, var9);
   }

   private void UuUVuuUu(class_1714 var1, int var2) {
      for (int var3 = 0; var3 < 9; var3++) {
         String var4 = this.NVNnnvnuunNv.UuUVuuUu(var3);
         if (!var4.isBlank()) {
            int var5 = var3 + 1;
            this.uUVuVvuNUvnu.add(() -> this.UuUVuuUu(var1, var4, var5, var2));
         }
      }
   }

   private void UuUVuuUu(class_1714 var1, String var2, int var3) {
      int var4 = this.C00OOC00oO(var1, var2);
      if (var4 == -1) {
         this.UUVNuUNUvUnV = var2;
      } else {
         uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var4, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
         uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var3, 1, class_1713.field_7790, uUnuvNvvNU.field_1724);
         uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var4, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
      }
   }

   private void UuUVuuUu(class_1714 var1, String var2, int var3, int var4) {
      int var5 = var4;

      while (var5 > 0) {
         int var6 = this.C00OOC00oO(var1, var2);
         if (var6 == -1) {
            this.UUVNuUNUvUnV = var2;
            return;
         }

         uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var6, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
         int var7 = var5;
         if (var1.method_34255().method_7960()) {
            this.UUVNuUNUvUnV = var2;
            return;
         }

         while (var5 > 0 && !var1.method_34255().method_7960()) {
            uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var3, 1, class_1713.field_7790, uUnuvNvvNU.field_1724);
            var5--;
         }

         if (var5 == var7) {
            this.UUVNuUNUvUnV = var2;
            return;
         }

         if (!var1.method_34255().method_7960()) {
            uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var6, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
         }
      }
   }

   private int C00OOC00oO(class_1714 var1, String var2) {
      for (int var3 = 10; var3 < var1.field_7761.size(); var3++) {
         class_1735 var4 = var1.method_7611(var3);
         if (var4.method_7681() && this.UuUVuuUu(var4.method_7677(), var2)) {
            return var3;
         }
      }

      return -1;
   }

   private boolean UuUVuuUu(class_1799 var1, String var2) {
      if (var1 != null && !var1.method_7960() && var2 != null && !var2.isBlank()) {
         class_2960 var3 = class_7923.field_41178.method_10221(var1.method_7909());
         return var3 != null && var3.toString().equals(var2);
      } else {
         return false;
      }
   }

   private class_1799 UuUVuuUu(String var1) {
      class_2960 var2 = class_2960.method_12829(var1 == null ? "" : var1);
      if (var2 == null) {
         return class_1799.field_8037;
      } else {
         class_1792 var3 = (class_1792)class_7923.field_41178.method_63535(var2);
         return var3 == class_1802.field_8162 ? class_1799.field_8037 : var3.method_7854();
      }
   }

   private class_2338 UnUNuUU() {
      class_2338 var1 = uUnuvNvvNU.field_1724.method_24515();
      class_2338 var2 = null;
      double var3 = Double.MAX_VALUE;
      byte var5 = 16;

      for (class_2338 var7 : class_2338.method_10097(var1.method_10069(-var5, -5, -var5), var1.method_10069(var5, 5, var5))) {
         if (this.UuUVuuUu(var7)) {
            double var8 = var1.method_10262(var7);
            if (var8 < var3) {
               var3 = var8;
               var2 = var7.method_10062();
            }
         }
      }

      return var2;
   }

   private boolean UuUVuuUu(class_2338 var1) {
      return var1 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1687.method_8320(var1).method_27852(class_2246.field_9980);
   }

   private uuUuvNuNVNVU UuUVuuUu(class_243 var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
      double var3 = var1.field_1352 - var2.field_1352;
      double var5 = var1.field_1351 - var2.field_1351;
      double var7 = var1.field_1350 - var2.field_1350;
      float var9 = (float)Math.toDegrees(Math.atan2(var7, var3)) - 90.0F;
      float var10 = (float)(-Math.toDegrees(Math.atan2(var5, Math.sqrt(var3 * var3 + var7 * var7))));
      return new uuUuvNuNVNVU(var9, var10);
   }

   private int uUVuVvuNUvnu() {
      return Math.max(20, (int)this.UNnVVNvvnVvU.uUnuvNvvNU());
   }

   private int UvUvUNuvNU() {
      String var1 = this.uVunuUNVVUUV.uUnuvNvvNU().trim();
      if (var1.isEmpty()) {
         return 0;
      } else {
         try {
            return Math.max(0, Math.min(999999, Integer.parseInt(var1)));
         } catch (NumberFormatException var3) {
            return 0;
         }
      }
   }

   private String C00OOC00oO(String var1) {
      class_2960 var2 = class_2960.method_12829(var1);
      if (var2 == null) {
         return var1;
      } else {
         class_1792 var3 = (class_1792)class_7923.field_41178.method_63535(var2);
         return var3 == class_1802.field_8162 ? var1 : var3.method_63680().getString();
      }
   }

   private void uUnuvNvvNU(String var1) {
      vVnvuVVUunuv.UuUVuuUu("§8[§6AutoCraft§8] " + var1);
      this.UuUVuuUu(false);
   }

   static enum NVnVnNnN {
      IDLE,
      FINDING_TABLE,
      GOING_TO_TABLE,
      AIMING_TABLE,
      OPENING_TABLE,
      CLEARING_GRID,
      PLACING_RECIPE,
      WAITING_RESULT,
      TAKING_RESULT,
      CLOSING;
   }
}
