package ru.metaculture.protection;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1887;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_6880;
import net.minecraft.class_7923;
import net.minecraft.class_9304;
import net.minecraft.class_9334;
import org.wild.module.api.Module;
import ru.metaculture.profile.Profile;

public final class nUvUnuNNNnUN implements UvUuUvUVUU {
   private static final Cc0cOoOcC0o UuUVuuUu = Cc0cOoOcC0o.UuUVuuUu();
   private static final Cc0cOoOcC0o C00OOC00oO = Cc0cOoOcC0o.vNUvnnVnUvu();
   private static final Cc0cOoOcC0o uUnuvNvvNU = Cc0cOoOcC0o.vNVuvnUUnuUn();
   private static final Cc0cOoOcC0o vVvUvVVuuNvV = Cc0cOoOcC0o.vNUvnnVnUvu();
   private static final SimpleDateFormat uNNnnnuuuN = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
   private static final SimpleDateFormat nuUnNvnuUu = new SimpleDateFormat("dd.MM.yyyy");
   private static final String[] VVuuUN = new String[]{"FunTime", "SpookyTime", "HolyWorld"};
   private static final Map<String, String> vNUvnnVnUvu = Map.ofEntries(
      Map.entry("protection", "Защита"),
      Map.entry("fire_protection", "Огнеупорность"),
      Map.entry("feather_falling", "Невесомость"),
      Map.entry("blast_protection", "Взрывоустойчивость"),
      Map.entry("projectile_protection", "Защита от снарядов"),
      Map.entry("respiration", "Подводное дыхание"),
      Map.entry("aqua_affinity", "Подводник"),
      Map.entry("thorns", "Шипы"),
      Map.entry("depth_strider", "Подводная ходьба"),
      Map.entry("frost_walker", "Ледоход"),
      Map.entry("binding_curse", "Проклятие несъемности"),
      Map.entry("soul_speed", "Скорость души"),
      Map.entry("swift_sneak", "Проворство"),
      Map.entry("unbreaking", "Прочность"),
      Map.entry("mending", "Починка"),
      Map.entry("vanishing_curse", "Проклятие утраты"),
      Map.entry("efficiency", "Эффективность"),
      Map.entry("fortune", "Удача"),
      Map.entry("sharpness", "Острота"),
      Map.entry("smite", "Небесная кара"),
      Map.entry("bane_of_arthropods", "Бич членистоногих"),
      Map.entry("fire_aspect", "Заговор огня"),
      Map.entry("sweeping_edge", "Разящий клинок"),
      Map.entry("looting", "Добыча"),
      Map.entry("piercing", "Пронзатель"),
      Map.entry("multishot", "Тройной выстрел"),
      Map.entry("quick_charge", "Быстрая перезарядка"),
      Map.entry("luck_of_the_sea", "Морская удача")
   );
   private static final List<String> uVUuuVnNVU = List.of(
      "Шлем Крушителя",
      "Нагрудник Крушителя",
      "Поножи Крушителя",
      "Ботинки Крушителя",
      "Меч Крушителя",
      "Кирка Крушителя",
      "Лук Крушителя",
      "Арбалет Крушителя",
      "Трезубец Крушителя",
      "Булава Крушителя",
      "Элитры Крушителя",
      "Удочка Крушителя",
      "Сфера Хаоса",
      "Сфера Титана",
      "Сфера Ареса",
      "Сфера Бестии",
      "Сфера Гидры",
      "Сфера Икара",
      "Сфера Эрида",
      "Сфера Сатира",
      "Талисман Демона",
      "Талисман Карателя",
      "Талисман Мрака",
      "Талисман Ярости",
      "Талисман Тирана",
      "Талисман Крушителя",
      "Талисман Раздора",
      "Зелье Ассасина",
      "Зелье Гнева",
      "Хлопушка",
      "Святая Вода",
      "Зелье Палладина",
      "Зелье Радиации",
      "Снотворное",
      "Пласт",
      "Опыт 15",
      "Опыт 30",
      "Опыт 45",
      "Вайт",
      "Блек",
      "Блок дамагер",
      "Прогрузчик чанков",
      "Маяк",
      "Проклятая Душа",
      "Драконий Скин",
      "Огненный Смерч",
      "Снежок Заморозка",
      "Божья Аура",
      "Серебро",
      "Божье Касание",
      "Мощный Удар",
      "Мега Бульдозер",
      "Нерушимые Элитры"
   );
   private static List<nUvUnuNNNnUN.NVnVnNnN> vuuuNvNuv;
   private final List<nUvUnuNNNnUN.nvnNNunvv> nvUVNnuu = new ArrayList<>();
   private String UuuNnUvUuv = "";
   private boolean nUUVuvU = false;
   private final Map<String, NVuVVUNUvV> UnUNVVVNuv = new HashMap<>();
   private String vNVuvnUUnuUn = null;
   private final VwVVvwWW UvnvNVnnnnNU = new VwVVvwWW();
   private final VwVVvwWW uVUVnuvnuVuv = new VwVVvwWW();
   private final VwVVvwWW NVNnnvnuunNv = new VwVVvwWW();
   private final VwVVvwWW uVunuUNVVUUV = new VwVVvwWW();
   private float UNnVVNvvnVvU;
   private float uNnUnnuNUnNu;
   private float NnUuNNU;
   private float nNvNUVU;
   private float UnUNuUU;
   private float uUVuVvuNUvnu;
   private float UvUvUNuvNU;
   private float c0oOOCcCoC0;
   private final uvNVnuNn VVnVNnunVvu = new uvNVnuNn(VUuNVnvnVun.EASE_IN_OUT_QUAD, 460L);
   private uvNVnuNn unNNVVNnvvV = new uvNVnuNn(VUuNVnvnVun.EASE_OUT_CUBIC, 600L);
   private int NuunnvnN = -1;
   private final NVuVVUNUvV NVUunUNUN = new NVuVVUNUvV("Catalog Search", "");
   private final Map<String, NVuVVUNUvV> UUVNuUNUvUnV = new LinkedHashMap<>();
   private String vuvnUnVnUNnV = null;
   private String nnuUVNUuvvVU = null;
   private boolean nVVUuvuNnUN = false;
   private float nNnVnUNVV = 0.0F;
   private float nuunNvv = 1.0F;
   private nUvUnuNNNnUN.nUNvUnnVN uUVVvVVNvvn = nUvUnuNNNnUN.nUNvUnnVN.hidden();
   private nUvUnuNNNnUN.nUNvUnnVN vvUVNVvvNUv = nUvUnuNNNnUN.nUNvUnnVN.hidden();
   private nUvUnuNNNnUN.nUNvUnnVN UuNnnVnuNNV = nUvUnuNNNnUN.nUNvUnnVN.hidden();
   private nUvUnuNNNnUN.nUNvUnnVN uUVvnUuNvvN = nUvUnuNNNnUN.nUNvUnnVN.hidden();
   private boolean UUuUnNVNuuv;
   private boolean NVuNUuVnVUN;
   private boolean NVuunNnvvvVu;
   private boolean vNnNuuvVn;
   private float VUuuVUnun;
   private int vVVuuVVv = 0;
   private String VuunNUUUvu;
   private long NNUUNUuVNNVn;
   private float VvVvnNUnvuvV;
   private float ccOO0COcoco0;

   @Override
   public boolean UuUVuuUu(Module var1) {
      return var1 instanceof AutoBuy;
   }

   @Override
   public boolean UuUVuuUu(Module var1, vNvvVnNuUVvv var2) {
      return var2.vNnNuuvVn().contains(var1) || var2.UuUVuuUu(vnvnUnVnuunn.UuUVuuUu(var1)) > 0.01F;
   }

   @Override
   public void UuUVuuUu(vNvvVnNuUVvv var1) {
      this.vVvUvVVuuNvV();
      this.nUUVuvU = false;
   }

   @Override
   public void C00OOC00oO(vNvvVnNuUVvv var1) {
      this.vVvUvVVuuNvV();
   }

   @Override
   public void uUnuvNvvNU(vNvvVnNuUVvv var1) {
      this.UUuUnNVNuuv = false;
      this.NVuNUuVnVUN = false;
      this.NVuunNnvvvVu = false;
      this.vNnNuuvVn = false;
      this.VUuuVUnun = 0.0F;
      this.nnuUVNUuvvVU = null;
      this.nVVUuvuNnUN = false;
      this.nNnVnUNVV = 0.0F;
      this.nuunNvv = 1.0F;
   }

   @Override
   public float UuUVuuUu(Module var1, nUvnuVnNUU var2, vNvvVnNuUVvv var3) {
      return var2.UuUVuuUu(386.0F);
   }

   @Override
   public void UuUVuuUu(Module var1, vNvvVnNuUVvv var2, Cc0cOoOcC0o var3, Cc0cOoOcC0o var4) {
      if (var1 instanceof AutoBuy var5) {
         boolean var6 = !var2.NvUVUvVVnUu();
         boolean var7 = var6 && (var2.vNnNuuvVn().contains(var1) || var2.UNvvunVVn());
         long var8 = var2.UNvvunVVn() ? var2.unnnNUNnVu() : var2.uUnuvNvvNU(var1);
         long var10 = System.currentTimeMillis();
         var2.C00OOC00oO(vnvnUnVnuunn.uVunuUNVVUUV(), var7 ? 1.0F : 0.0F, var7 ? var3 : uUnuvNvvNU);
         List var12 = this.C00OOC00oO(var5, this.NVUunUNUN.uNNnnnuuuN);
         int var13 = Math.min(var12.size(), 80);

         for (int var14 = 0; var14 < var13; var14++) {
            nUvUnuNNNnUN.NVnVnNnN var15 = (nUvUnuNNNnUN.NVnVnNnN)var12.get(var14);
            float var16 = !var7 || this.vVVuuVVv != 0 || var8 > 0L && var10 - var8 < 12L * var14 ? 0.0F : 1.0F;
            var2.C00OOC00oO(vnvnUnVnuunn.UuUVuuUu(var15.key()), var16, var16 > 0.0F ? var3 : uUnuvNvvNU);
         }

         List var18 = this.C00OOC00oO();

         for (int var19 = 0; var19 < var18.size(); var19++) {
            String var21 = (String)var18.get(var19);
            float var17 = !var7 || this.vVVuuVVv != 0 || var8 > 0L && var10 - var8 < 24L * var19 + 70L ? 0.0F : 1.0F;
            var2.C00OOC00oO(vnvnUnVnuunn.C00OOC00oO(var21), var17, var17 > 0.0F ? var3 : uUnuvNvvNU);
         }

         for (int var20 = 0; var20 < this.nvUVNnuu.size(); var20++) {
            nUvUnuNNNnUN.nvnNNunvv var22 = this.nvUVNnuu.get(var20);
            float var23 = !var7 || this.vVVuuVVv != 2 || var8 > 0L && var10 - var8 < 24L * var20 + 70L ? 0.0F : 1.0F;
            var2.C00OOC00oO("cfg_entry:" + var22.name(), var23, var23 > 0.0F ? var3 : uUnuvNvvNU);
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void UuUVuuUu(UnVNvNnU var1, class_332 var2, vNvvVnNuUVvv var3, VvvVunn var4, nUVuuNUVnV var5) {
      if (var4.UuUVuuUu() instanceof AutoBuy var6) {
         if (this.vVVuuVVv == 2 && !this.nUUVuvU) {
            this.UuUVuuUu(var6);
            this.nUUVuvU = true;
         }

         nUvnuVnNUU var14 = var5.uNNnnnuuuN();
         nUvUnuNNNnUN.uunvUUVnuNn var8 = this.UuUVuuUu(var4, var14);
         if (!(var8.width() <= 1.0F) && !(var8.height() <= 1.0F)) {
            float var9 = var14.UuUVuuUu(4.0F);
            var1.uUnuvNvvNU();
            var1.UuUVuuUu(
               var8.x() - var9,
               var8.y() - var9,
               var8.width() + var9 * 2.0F,
               var8.height() + var9 * 2.0F,
               var14.UuUVuuUu(10.0F),
               var14.UuUVuuUu(10.0F),
               var14.UuUVuuUu(10.0F),
               var14.UuUVuuUu(10.0F)
            );
            boolean var12 = false /* VF: Semaphore variable */;

            try {
               var12 = true;
               this.UuUVuuUu(var1, var3, var6, var8, var5);
               if (this.vVVuuVVv == 1) {
                  this.UuUVuuUu(var1, var2, var3, var6, var8, var5);
                  var12 = false;
               } else if (this.vVVuuVVv == 2) {
                  this.C00OOC00oO(var1, var3, var6, var8, var5);
                  var12 = false;
               } else {
                  this.C00OOC00oO(var1, var2, var3, var6, var8, var5);
                  this.UuUVuuUu(var1, var2, var3, var8, var5);
                  var12 = false;
               }
            } finally {
               if (var12) {
                  var1.uUnuvNvvNU();
                  var1.nuUnNvnuUu();
               }
            }

            var1.uUnuvNvvNU();
            var1.nuUnNvnuUu();
            this.nuUnNvnuUu(var3);
         }
      }
   }

   @Override
   public void UuUVuuUu(List<NVUVNNunvvNN> var1, vNvvVnNuUVvv var2, VvvVunn var3, nUvnuVnNUU var4) {
      if (var3.UuUVuuUu() instanceof AutoBuy var5) {
         if (this.vVVuuVVv == 2 && !this.nUUVuvU) {
            this.UuUVuuUu(var5);
            this.nUUVuvU = true;
         }

         nUvUnuNNNnUN.uunvUUVnuNn var7 = this.UuUVuuUu(var3, var4);
         if (!(var7.height() <= var4.UuUVuuUu(40.0F))) {
            this.UuUVuuUu(var1, var5, var7, var4);
            if (this.vVVuuVVv == 1) {
               this.uUnuvNvvNU(var1, var7, var4);
            } else if (this.vVVuuVVv == 2) {
               this.C00OOC00oO(var1, var5, var7, var4);
            } else {
               this.UuUVuuUu(var1, var2, var5, var7, var4);
               this.UuUVuuUu(var1, var2, var7, var4);
            }

            var1.add(
               NVUVNNunvvNN.UuUVuuUu()
                  .UuUVuuUu(0)
                  .UuUVuuUu(var7.x())
                  .C00OOC00oO(var7.y())
                  .uUnuvNvvNU(var7.width())
                  .vVvUvVVuuNvV(var7.height())
                  .UuUVuuUu(var1x -> {
                     var1x.uVUuuVnNVU(false);
                     if (!this.UuUVuuUu(var1x.NuUuUvUUvU()) && this.uNNnnnuuuN(var1x) == null) {
                        var1x.UuUVuuUu(null);
                     }
                  })
                  .UuUVuuUu()
            );
         }
      }
   }

   @Override
   public boolean UuUVuuUu(vNvvVnNuUVvv var1, CCCo0o0cCCo var2, nUvnuVnNUU var3, float var4, float var5, double var6) {
      for (VvvVunn var9 : var2.C00OOC00oO()) {
         if (var9.UuUVuuUu() instanceof AutoBuy var10 && (var1.vNnNuuvVn().contains(var9.UuUVuuUu()) || var1.UNvvunVVn())) {
            nUvUnuNNNnUN.uunvUUVnuNn var12 = this.UuUVuuUu(var9, var3);
            if (this.vVVuuVVv == 1) {
               if (nunvNNUnvU.UuUVuuUu(var4, var5, var12.x(), var12.panelY(), var12.width(), var12.panelH())) {
                  this.UuUVuuUu(this.NVNnnvnuunNv, this.vVvUvVVuuNvV(var12, var3), var6);
                  return true;
               }

               return false;
            }

            if (this.vVVuuVVv == 2) {
               if (nunvNNUnvU.UuUVuuUu(var4, var5, var12.x(), var12.panelY(), var12.width(), var12.panelH())) {
                  this.UuUVuuUu(this.uVunuUNVVUUV, this.uNNnnnuuuN(var12, var3), var6);
                  return true;
               }

               return false;
            }

            if (nunvNNUnvU.UuUVuuUu(var4, var5, var12.leftX(), var12.panelY(), var12.leftW(), var12.panelH())) {
               this.UuUVuuUu(this.UvnvNVnnnnNU, this.UuUVuuUu(var10, var12, var3), var6);
               return true;
            }

            if (nunvNNUnvU.UuUVuuUu(var4, var5, var12.rightX(), var12.panelY(), var12.rightW(), var12.panelH())) {
               this.UuUVuuUu(this.uVUVnuvnuVuv, this.uUnuvNvvNU(var12, var3), var6);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean UuUVuuUu(vNvvVnNuUVvv var1, float var2, float var3) {
      if (this.nnuUVNUuvvVU != null) {
         this.UuUVuuUu(this.nnuUVNUuvvVU, var2, var1);
         return true;
      } else if (this.vVVuuVVv == 1) {
         if (this.NVuunNnvvvVu && this.UuNnnVnuNNV.visible()) {
            this.C00OOC00oO("history", var3, this.UuNnnVnuNNV);
            return true;
         } else {
            return false;
         }
      } else if (this.vVVuuVVv == 2) {
         if (this.vNnNuuvVn && this.uUVvnUuNvvN.visible()) {
            this.C00OOC00oO("cloud", var3, this.uUVvnUuNvvN);
            return true;
         } else {
            return false;
         }
      } else if (this.UUuUnNVNuuv && this.uUVVvVVNvvn.visible()) {
         this.C00OOC00oO("catalog", var3, this.uUVVvVVNvvn);
         return true;
      } else if (this.NVuNUuVnVUN && this.vvUVNVvvNUv.visible()) {
         this.C00OOC00oO("rules", var3, this.vvUVNVvvNUv);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean vVvUvVVuuNvV(vNvvVnNuUVvv var1) {
      boolean var2 = this.UUuUnNVNuuv || this.NVuNUuVnVUN || this.NVuunNnvvvVu || this.vNnNuuvVn || this.nnuUVNUuvvVU != null;
      this.uUnuvNvvNU(var1);
      return var2;
   }

   @Override
   public boolean UuUVuuUu(vNvvVnNuUVvv var1, int var2) {
      if (var1.NuUuUvUUvU() == this.NVUunUNUN) {
         if (var2 == 256 || var2 == 257) {
            var1.UuUVuuUu(null);
            return true;
         } else if (var2 == 259 && !this.NVUunUNUN.uNNnnnuuuN.isEmpty()) {
            this.NVUunUNUN.uNNnnnuuuN = this.NVUunUNUN.uNNnnnuuuN.substring(0, this.NVUunUNUN.uNNnnnuuuN.length() - 1);
            this.uUnuvNvvNU();
            return true;
         } else if (var2 == 261 && !this.NVUunUNUN.uNNnnnuuuN.isEmpty()) {
            this.NVUunUNUN.uNNnnnuuuN = "";
            this.uUnuvNvvNU();
            return true;
         } else {
            return true;
         }
      } else {
         String var3 = this.uNNnnnuuuN(var1);
         if (var3 != null) {
            NVuVVUNUvV var6 = this.UnUNVVVNuv.get(var3);
            if (var2 == 256 || var2 == 257) {
               var1.UuUVuuUu(null);
               return true;
            } else if (var2 == 259 && !var6.uNNnnnuuuN.isEmpty()) {
               var6.uNNnnnuuuN = var6.uNNnnnuuuN.substring(0, var6.uNNnnnuuuN.length() - 1);
               return true;
            } else {
               return true;
            }
         } else {
            String var4 = this.VVuuUN(var1);
            if (var4 == null) {
               return false;
            } else {
               NVuVVUNUvV var5 = this.UUVNuUNUvUnV.get(var4);
               if (var2 == 256 || var2 == 257) {
                  var1.UuUVuuUu(null);
                  var1.uUVvnUuNvvN();
                  return true;
               } else if (var2 == 259 && !var5.uNNnnnuuuN.isEmpty()) {
                  var5.uNNnnnuuuN = UNNNnNVnUnn.UuUVuuUu(var5.uNNnnnuuuN);
                  this.UuUVuuUu(var4, var5.uNNnnnuuuN, var1);
                  return true;
               } else if (var2 == 261) {
                  var5.uNNnnnuuuN = "";
                  this.UuUVuuUu(var4, var5.uNNnnnuuuN, var1);
                  return true;
               } else {
                  return true;
               }
            }
         }
      }
   }

   @Override
   public boolean UuUVuuUu(vNvvVnNuUVvv var1, char var2) {
      if (var1.NuUuUvUUvU() == this.NVUunUNUN) {
         if (!Character.isISOControl(var2) && this.NVUunUNUN.uNNnnnuuuN.length() < 64) {
            this.NVUunUNUN.uNNnnnuuuN = this.NVUunUNUN.uNNnnnuuuN + var2;
            this.uUnuvNvvNU();
         }

         return true;
      } else {
         String var3 = this.uNNnnnuuuN(var1);
         if (var3 != null) {
            NVuVVUNUvV var7 = this.UnUNVVVNuv.get(var3);
            if (!Character.isISOControl(var2) && var7.uNNnnnuuuN.length() < 25 && String.valueOf(var2).matches("[a-zA-Z0-9_\\- ]")) {
               var7.uNNnnnuuuN = var7.uNNnnnuuuN + var2;
            }

            return true;
         } else {
            String var4 = this.VVuuUN(var1);
            if (var4 == null) {
               return false;
            } else {
               if (Character.isDigit(var2)) {
                  NVuVVUNUvV var5 = this.UUVNuUNUvUnV.get(var4);
                  String var6 = UNNNnNVnUnn.UuUVuuUu(var5.uNNnnnuuuN, var2);
                  if (!var6.equals(var5.uNNnnnuuuN)) {
                     var5.uNNnnnuuuN = var6;
                     this.UuUVuuUu(var4, var5.uNNnnnuuuN, var1);
                  }
               }

               return true;
            }
         }
      }
   }

   private void UuUVuuUu(AutoBuy var1) {
      this.nvUVNnuu.clear();
      File var2 = var1.uVunuUNVVUUV();
      if (var2.exists()) {
         File[] var3 = var2.listFiles((var0, var1x) -> var1x.endsWith(".json"));
         if (var3 != null) {
            String var4 = "Игрок";

            try {
               String var5 = Profile.getUsername();
               if (var5 != null) {
                  var4 = var5;
               }
            } catch (Throwable var10) {
               if (class_310.method_1551().method_1548() != null) {
                  var4 = class_310.method_1551().method_1548().method_1676();
               }
            }

            for (File var8 : var3) {
               String var9 = var8.getName().replace(".json", "");
               this.nvUVNnuu.add(new nUvUnuNNNnUN.nvnNNunvv(var9, var4, var8.lastModified()));
            }

            this.nvUVNnuu.sort((var0, var1x) -> Long.compare(var1x.timestamp, var0.timestamp));
         }
      }
   }

   private String uNNnnnuuuN(vNvvVnNuUVvv var1) {
      NVuVVUNUvV var2 = var1.NuUuUvUUvU();
      if (var2 == null) {
         return null;
      } else {
         for (Entry var4 : this.UnUNVVVNuv.entrySet()) {
            if (var4.getValue() == var2) {
               return (String)var4.getKey();
            }
         }

         return null;
      }
   }

   private nUvUnuNNNnUN.NVnVnNnN UuUVuuUu(AutoBuy var1, String var2) {
      if (var2 == null) {
         return this.C00OOC00oO("");
      } else {
         String var3 = var2.replace(' ', ' ').trim();
         var3 = var3.replaceAll("^\\[.*?\\]\\s*", "").trim();
         if (var3.matches("(?i).*\\s+[xхXХ]?\\d+[xхXХ]?$")) {
            int var4 = var3.lastIndexOf(32);
            if (var4 != -1) {
               var3 = var3.substring(0, var4).trim();
            }
         }

         if (var3.matches("(?i)^[xхXХ]?\\d+[xхXХ]?\\s+.*")) {
            int var8 = var3.indexOf(32);
            if (var8 != -1) {
               var3 = var3.substring(var8 + 1).trim();
            }
         }

         String var9 = var3.toLowerCase(Locale.ROOT);

         for (String var6 : uVUuuVnNVU) {
            if (var9.contains(var6.toLowerCase(Locale.ROOT))) {
               return new nUvUnuNNNnUN.NVnVnNnN(var6, var6, class_1799.field_8037, true);
            }
         }

         for (nUvUnuNNNnUN.NVnVnNnN var11 : this.C00OOC00oO(var1)) {
            if (var9.contains(var11.label().toLowerCase(Locale.ROOT)) || var9.contains(var11.key().toLowerCase(Locale.ROOT))) {
               return var11;
            }
         }

         return this.C00OOC00oO(var3);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, AutoBuy var3, nUvUnuNNNnUN.uunvUUVnuNn var4, nUVuuNUVnV var5) {
      nUvnuVnNUU var6 = var5.uNNnnnuuuN();
      NUunUunuNV var7 = var5.nuUnNvnuUu();
      nUvUnuNNNnUN.nUVVnVNu var8 = this.UuUVuuUu(var4, var6);
      float var9 = var8.stripH();
      float var10 = var8.modeX();
      float var11 = var8.modeY();
      float var12 = var8.toggleW();
      float var13 = var8.toggleX();
      float var14 = var8.gap();
      float var15 = var8.tabBtnSize();
      float var16 = var8.chipW();
      float var17 = var10;

      for (String var21 : VVuuUN) {
         boolean var22 = var3.NnUuNNU.C00OOC00oO(var21);
         float var23 = 10.0F;

         while (var23 > 8.0F && nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var21, var23) > var16 - var6.UuUVuuUu(12.0F)) {
            var23 -= 0.5F;
         }

         String var24 = vnvnUnVnuunn.nuUnNvnuUu("mode:" + var21);
         float var25 = var2.UuUVuuUu(var24, nunvNNUnvU.UuUVuuUu(var2, var17, var11, var16, var9) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv());
         var1.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var25, var2.C00OOC00oO(var24), 0.016F, 0.006F), var17 + var16 * 0.5F, var11 + var9 * 0.5F);
         boolean var28 = false /* VF: Semaphore variable */;

         try {
            var28 = true;
            this.UuUVuuUu(
               var1,
               var2,
               "mode:" + var21,
               var17,
               var11,
               var16,
               var9,
               var6.UuUVuuUu(8.0F),
               var25,
               var22 ? 0.78F : 0.0F,
               nUvUnuNNNnUN.VUVvVuvuN.CONTROL,
               false,
               var6,
               var7
            );
            this.UuUVuuUu(
               var1,
               var6,
               vNvnnVvvVUu.vVvUvVVuuNvV,
               var17,
               var11,
               var16,
               var9,
               var23,
               var21,
               var22 ? var7.uVunuUNVVUUV() : NUunUunuNV.UuUVuuUu(var7.UvnvNVnnnnNU(), var7.uVUVnuvnuVuv(), var25)
            );
            var28 = false;
         } finally {
            if (var28) {
               var1.uVUuuVnNVU();
            }
         }

         var1.uVUuuVnNVU();
         var17 += var16 + var14;
      }

      this.UuUVuuUu(var1, var2, "catalog_tab", this.vVVuuVVv == 0, var17, var11, var15, "W", false, var5);
      var17 += var15 + var14;
      this.UuUVuuUu(var1, var2, "history_tab", this.vVVuuVVv == 1, var17, var11, var15, "E", false, var5);
      var17 += var15 + var14;
      this.UuUVuuUu(var1, var2, "cloud_tab", this.vVVuuVVv == 2, var17, var11, var15, "Y", !var8.showReparse(), var5);
      if (var8.showReparse()) {
         this.UuUVuuUu(var1, var2, var3, var8, var5);
      }

      float var32 = var6.UuUVuuUu(4.0F);
      float var33 = (var12 - var32) * 0.5F;
      float var34 = var13 + var33 + var32;
      float var35 = var2.UuUVuuUu(
         vnvnUnVnuunn.nuUnNvnuUu("toggle:inactive"), nunvNNUnvU.UuUVuuUu(var2, var13, var11, var33, var9) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv()
      );
      float var36 = var2.UuUVuuUu(
         vnvnUnVnuunn.nuUnNvnuUu("toggle:active"), nunvNNUnvU.UuUVuuUu(var2, var34, var11, var33, var9) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv()
      );
      float var37 = var2.UuUVuuUu(vnvnUnVnuunn.uUnuvNvvNU(var3));
      this.UuUVuuUu(
         var1,
         var2,
         "toggle:inactive",
         var13,
         var11,
         var33,
         var9,
         var6.UuUVuuUu(8.0F),
         var35,
         (1.0F - var37) * 0.48F,
         nUvUnuNNNnUN.VUVvVuvuN.CONTROL,
         false,
         var6,
         var7
      );
      this.UuUVuuUu(
         var1, var2, "toggle:active", var34, var11, var33, var9, var6.UuUVuuUu(8.0F), var36, var37 * 0.48F, nUvUnuNNNnUN.VUVvVuvuN.CONTROL, false, var6, var7
      );
      this.UuUVuuUu(
         var1,
         var6,
         vNvnnVvvVUu.UuUVuuUu,
         var13,
         var11,
         var33,
         var9,
         11.0F,
         "Пауза",
         NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var7.C00OOC00oO(), 155), var7.UvnvNVnnnnNU(), var37 * 0.82F)
      );
      this.UuUVuuUu(
         var1,
         var6,
         vNvnnVvvVUu.UuUVuuUu,
         var34,
         var11,
         var33,
         var9,
         11.0F,
         "Активен",
         NUunUunuNV.UuUVuuUu(var7.UvnvNVnnnnNU(), NUunUunuNV.UuUVuuUu(var7.UuUVuuUu(), 165), var37)
      );
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, AutoBuy var3, nUvUnuNNNnUN.nUVVnVNu var4, nUVuuNUVnV var5) {
      nUvnuVnNUU var6 = var5.uNNnnnuuuN();
      NUunUunuNV var7 = var5.nuUnNvnuUu();
      boolean var8 = var3.uUVuVvuNUvnu.uUnuvNvvNU();
      float var9 = var4.reparseX();
      float var10 = var4.modeY();
      float var11 = var4.stripH();
      float var12 = var4.reparseToggleW();
      float var13 = var4.reparseSliderX();
      float var14 = var4.reparseSliderW();
      float var15 = var2.UuUVuuUu(
         vnvnUnVnuunn.nuUnNvnuUu("reparse:toggle"), nunvNNUnvU.UuUVuuUu(var2, var9, var10, var12, var11) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv()
      );
      float var16 = var2.UuUVuuUu(vnvnUnVnuunn.nuUnNvnuUu("reparse:active"), var8 ? 1.0F : 0.0F, UuUVuuUu);
      this.UuUVuuUu(
         var1, var2, "reparse:toggle", var9, var10, var12, var11, var6.UuUVuuUu(8.0F), var15, var16, nUvUnuNNNnUN.VUVvVuvuN.CONTROL, false, var6, var7
      );
      this.UuUVuuUu(
         var1,
         var6,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var9,
         var10,
         var12,
         var11,
         10.0F,
         "ReParse",
         var8 ? NUunUunuNV.UuUVuuUu(var7.UuUVuuUu(), 180) : var7.uVUVnuvnuVuv()
      );
      float var17 = var2.UuUVuuUu(
         vnvnUnVnuunn.nuUnNvnuUu("reparse:slider"), nunvNNUnvU.UuUVuuUu(var2, var13, var10, var14, var11) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv()
      );
      float var18 = var3.UvUvUNuvNU.uUnuvNvvNU();
      float var19 = this.UuUVuuUu(var18, var3.UvUvUNuvNU.uNNnnnuuuN, var3.UvUvUNuvNU.nuUnNvnuUu);
      float var20 = var13 + var6.UuUVuuUu(8.0F);
      float var21 = var10 + var6.UuUVuuUu(21.0F);
      float var22 = Math.max(var6.UuUVuuUu(28.0F), var14 - var6.UuUVuuUu(16.0F));
      float var23 = var6.UuUVuuUu(4.0F);
      this.UuUVuuUu(
         var1,
         var2,
         "reparse:slider",
         var13,
         var10,
         var14 + var6.UuUVuuUu(9.0F),
         var11,
         var6.UuUVuuUu(8.0F),
         var17,
         var8 ? 0.14F : 0.0F,
         nUvUnuNNNnUN.VUVvVuvuN.CONTROL,
         false,
         var6,
         var7
      );
      var1.UuUVuuUu(
         var20,
         var21,
         var22,
         var23,
         var6.UuUVuuUu(3.0F),
         NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var7.VVuuUN(), var7.nuUnNvnuUu(), 0.72F), var7.uNnUnnuNUnNu() ? 146 : 208)
      );
      var1.UuUVuuUu(var20, var21, var22, var23, var6.UuUVuuUu(3.0F), var7.vuuuNvNuv(), Math.max(0.5F, var6.UuUVuuUu(0.45F)));
      var1.UuUVuuUu(var20, var21, var22 * var19, var23, var6.UuUVuuUu(3.0F), NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), 138));
      float var24 = var20 + var22 * var19;
      var1.UuUVuuUu(
         var24 - var6.UuUVuuUu(2.5F),
         var21 - var6.UuUVuuUu(2.0F),
         var6.UuUVuuUu(5.0F),
         var6.UuUVuuUu(8.0F),
         var6.UuUVuuUu(3.0F),
         var8 ? var7.uVunuUNVVUUV() : var7.uVUVnuvnuVuv()
      );
      String var25 = Math.round(var18) + " мин";
      float var26 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var25, 9.0F);
      nunvNNUnvU.UuUVuuUu(
         var1,
         var6,
         vNvnnVvvVUu.UuUVuuUu,
         var13 + (var14 - var26) * 0.5F,
         var10 + var6.UuUVuuUu(5.0F),
         var6.UuUVuuUu(10.0F),
         9.0F,
         var25,
         var8 ? var7.uVunuUNVVUUV() : var7.UvnvNVnnnnNU()
      );
   }

   private nUvUnuNNNnUN.nUVVnVNu UuUVuuUu(nUvUnuNNNnUN.uunvUUVnuNn var1, nUvnuVnNUU var2) {
      float var3 = var2.UuUVuuUu(34.0F);
      float var4 = var1.x();
      float var5 = var1.y();
      float var6 = var2.UuUVuuUu(150.0F);
      float var7 = var1.x() + var1.width() - var6;
      float var8 = var2.UuUVuuUu(8.0F);
      float var10 = var3 * 3.0F + var8 * 2.0F;
      float var11 = 0.0F;

      for (String var15 : VVuuUN) {
         var11 = Math.max(var11, nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var15, 9.0F));
      }

      float var26 = Math.max(var2.UuUVuuUu(64.0F), var11 + var2.UuUVuuUu(18.0F));
      float var27 = var26 * VVuuUN.length + var8 * (VVuuUN.length - 1.0F);
      float var28 = var2.UuUVuuUu(158.0F);
      float var29 = var2.UuUVuuUu(224.0F);
      float var16 = Math.max(0.0F, var7 - var4);
      boolean var17 = var16 >= var27 + var10 + var28 + var8 * 3.0F;
      float var18 = var17 ? Math.min(var29, Math.max(var28, var16 - var27 - var10 - var8 * 3.0F)) : 0.0F;
      float var19 = UNNNnNVnUnn.UuUVuuUu(var16, var10, var18, var17, var8);
      float var20 = Math.max(var2.UuUVuuUu(24.0F), (var19 - var8 * (VVuuUN.length - 1.0F)) / VVuuUN.length);
      if (var17 && var20 < var26) {
         var17 = false;
         var18 = 0.0F;
         var19 = var16 - var10 - var8;
         var20 = Math.max(var2.UuUVuuUu(24.0F), (var19 - var8 * (VVuuUN.length - 1.0F)) / VVuuUN.length);
      }

      float var21 = var4 + var20 * VVuuUN.length + var8 * VVuuUN.length;
      float var22 = var21 + var10 + var8;
      float var23 = var17 ? Math.min(var2.UuUVuuUu(92.0F), Math.max(var2.UuUVuuUu(74.0F), var18 * 0.42F)) : 0.0F;
      float var24 = var22 + var23 + var8;
      float var25 = var17 ? Math.max(var2.UuUVuuUu(64.0F), var18 - var23 - var8) : 0.0F;
      return new nUvUnuNNNnUN.nUVVnVNu(var3, var4, var5, var7, var6, var8, var3, var20, var17, var22, var18, var23, var24, var25);
   }

   private float UuUVuuUu(float var1, float var2, float var3) {
      return this.C00OOC00oO((var1 - var2) / Math.max(0.001F, var3 - var2), 0.0F, 1.0F);
   }

   private void UuUVuuUu(AutoBuy var1, float var2, float var3, float var4) {
      float var5 = this.C00OOC00oO((var2 - var3) / Math.max(1.0F, var4), 0.0F, 1.0F);
      float var6 = var1.UvUvUNuvNU.uNNnnnuuuN;
      float var7 = var1.UvUvUNuvNU.nuUnNvnuUu;
      float var8 = Math.max(1.0F, var1.UvUvUNuvNU.VVuuUN);
      float var9 = var6 + (var7 - var6) * var5;
      float var10 = var6 + (float)UuvVnuU.uUnuvNvvNU((double)((var9 - var6) / var8), 0) * var8;
      var1.UvUvUNuvNU.UuUVuuUu(var10);
   }

   private void UuUVuuUu(
      UnVNvNnU var1, vNvvVnNuUVvv var2, String var3, boolean var4, float var5, float var6, float var7, String var8, boolean var9, nUVuuNUVnV var10
   ) {
      nUvnuVnNUU var11 = var10.uNNnnnuuuN();
      NUunUunuNV var12 = var10.nuUnNvnuUu();
      String var13 = vnvnUnVnuunn.nuUnNvnuUu("tab:" + var3);
      float var14 = var2.UuUVuuUu(var13, nunvNNUnvU.UuUVuuUu(var2, var5, var6, var7, var7) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv());
      var1.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var14, var2.C00OOC00oO(var13)), var5 + var7 * 0.5F, var6 + var7 * 0.5F);

      try {
         float var15 = var7 + (var9 ? var11.UuUVuuUu(9.0F) : 0.0F);
         this.UuUVuuUu(
            var1,
            var2,
            "tab:" + var3,
            var5,
            var6,
            var15,
            var7,
            var11.UuUVuuUu(8.0F),
            var14,
            var4 ? 0.74F : 0.0F,
            nUvUnuNNNnUN.VUVvVuvuN.CONTROL,
            false,
            var11,
            var12
         );
         nunvNNUnvU.UuUVuuUu(
            var1,
            var11,
            vNvnnVvvVUu.vNUvnnVnUvu,
            var5,
            var6,
            var7,
            var7,
            12.0F,
            var8,
            var4 ? var12.uVunuUNVVUUV() : NUunUunuNV.UuUVuuUu(var12.UvnvNVnnnnNU(), var12.uVUVnuvnuVuv(), var14)
         );
      } finally {
         var1.uVUuuVnNVU();
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1, vNvvVnNuUVvv var2, String var3, float var4, float var5, float var6, String var7, boolean var8, boolean var9, nUVuuNUVnV var10
   ) {
      nUvnuVnNUU var11 = var10.uNNnnnuuuN();
      NUunUunuNV var12 = var10.nuUnNvnuUu();
      String var13 = vnvnUnVnuunn.nuUnNvnuUu("iconBtn:" + var3);
      float var14 = var2.UuUVuuUu(var13, nunvNNUnvU.UuUVuuUu(var2, var4, var5, var6, var6) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv());
      var1.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var14, var2.C00OOC00oO(var13)), var4 + var6 * 0.5F, var5 + var6 * 0.5F);

      try {
         this.UuUVuuUu(
            var1,
            var2,
            "iconBtn:" + var3,
            var4,
            var5,
            var6,
            var6,
            var11.UuUVuuUu(6.0F),
            var14,
            var9 ? 0.68F : 0.0F,
            nUvUnuNNNnUN.VUVvVuvuN.CONTROL,
            false,
            var11,
            var12
         );
         if (var8) {
            var1.UuUVuuUu(
               var4 + var11.UuUVuuUu(1.0F),
               var5 + var11.UuUVuuUu(1.0F),
               var6 - var11.UuUVuuUu(2.0F),
               var6 - var11.UuUVuuUu(2.0F),
               var11.UuUVuuUu(5.0F),
               NUunUunuNV.UuUVuuUu(var12.C00OOC00oO(), Math.round(10.0F + var14 * 24.0F))
            );
         }

         int var15 = var9 ? var12.uVunuUNVVUUV() : var12.uVUVnuvnuVuv();
         int var16 = var8 ? var12.C00OOC00oO() : var12.NVNnnvnuunNv();
         int var17 = NUunUunuNV.UuUVuuUu(var15, var16, var14);
         nunvNNUnvU.UuUVuuUu(var1, var11, vNvnnVvvVUu.vNUvnnVnUvu, var4, var5, var6, var6, 11.0F, var7, var17);
      } finally {
         var1.uVUuuVnNVU();
      }
   }

   private void C00OOC00oO(UnVNvNnU var1, vNvvVnNuUVvv var2, AutoBuy var3, nUvUnuNNNnUN.uunvUUVnuNn var4, nUVuuNUVnV var5) {
      nUvnuVnNUU var6 = var5.uNNnnnuuuN();
      NUunUunuNV var7 = var5.nuUnNvnuUu();
      float var8 = var2.UuUVuuUu(vnvnUnVnuunn.uVunuUNVVUUV());
      float var9 = this.uNNnnnuuuN(var4, var6);
      float var10 = this.UuUVuuUu(this.uVunuUNVVUUV, var9);
      this.nNvNUVU = var10 - this.c0oOOCcCoC0;
      this.c0oOOCcCoC0 = var10;
      float var11 = var6.UuUVuuUu(62.0F);
      this.uUVvnUuNvvN = this.UuUVuuUu(
         var4.x() + var4.width() - var6.UuUVuuUu(10.0F),
         var4.panelY() + var11,
         var4.scrollbarW(),
         var4.panelH() - var11 - var6.UuUVuuUu(10.0F),
         var9,
         var10,
         var6
      );
      this.UuUVuuUu(
         var1,
         var2,
         null,
         var4.x(),
         var4.panelY(),
         var4.width(),
         var4.panelH(),
         var6.UuUVuuUu(10.0F),
         0.0F,
         0.0F,
         nUvUnuNNNnUN.VUVvVuvuN.WELL,
         false,
         var6,
         var7
      );
      float var12 = var4.x() + var6.UuUVuuUu(16.0F);
      float var13 = var4.panelY() + var6.UuUVuuUu(14.0F);
      var1.uNNnnnuuuN(var8);

      try {
         nunvNNUnvU.UuUVuuUu(
            var1, var6, vNvnnVvvVUu.vVvUvVVuuNvV, var12, var13, var6.UuUVuuUu(16.0F), 13.0F, "Конфигурации покупаемых предметов", var7.uVUVnuvnuVuv()
         );
         nunvNNUnvU.UuUVuuUu(
            var1,
            var6,
            vNvnnVvvVUu.UuUVuuUu,
            var12,
            var13 + var6.UuUVuuUu(20.0F),
            var6.UuUVuuUu(12.0F),
            10.0F,
            "Загрузите готовый конфиг, чтобы не настраивать каждый предмет вручную.",
            var7.UvnvNVnnnnNU()
         );
         float var14 = var6.UuUVuuUu(28.0F);
         float var15 = var6.UuUVuuUu(8.0F);
         float var16 = var4.x() + var4.width() - var6.UuUVuuUu(16.0F) - var14;
         this.UuUVuuUu(var1, var2, "cloud_btn_Y", var16, var13, var14, "Y", false, false, var5);
         var16 -= var14 + var15;
         this.UuUVuuUu(var1, var2, "cloud_btn_R", var16, var13, var14, "R", false, false, var5);
         var16 -= var14 + var15;
         this.UuUVuuUu(var1, var2, "cloud_btn_T", var16, var13, var14, "T", false, false, var5);
      } finally {
         var1.vuuuNvNuv();
      }

      float var68 = var4.x() + var6.UuUVuuUu(16.0F);
      float var69 = var4.panelY() + var11;
      float var72 = var4.width() - var6.UuUVuuUu(25.0F) - var4.scrollbarW() - var6.UuUVuuUu(0.0F);
      float var17 = var4.panelH() - var11 - var6.UuUVuuUu(10.0F);
      var1.uUnuvNvvNU();
      var1.UuUVuuUu(var68, var69, var72, var17, var6.UuUVuuUu(6.0F), var6.UuUVuuUu(6.0F), var6.UuUVuuUu(6.0F), var6.UuUVuuUu(6.0F));

      try {
         if (this.nvUVNnuu.isEmpty()) {
            var1.uNNnnnuuuN(var8);

            try {
               float var73 = var69 + var17 * 0.5F - var6.UuUVuuUu(6.0F);
               String var74 = "Конфигурации не найдены";
               float var75 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var74, 12.0F);
               nunvNNUnvU.UuUVuuUu(
                  var1,
                  var6,
                  vNvnnVvvVUu.UuUVuuUu,
                  var68 + (var72 - var75) * 0.5F,
                  var73 - var6.UuUVuuUu(10.0F),
                  var6.UuUVuuUu(12.0F),
                  12.0F,
                  var74,
                  var7.UvnvNVnnnnNU()
               );
            } finally {
               var1.vuuuNvNuv();
            }
         } else {
            float var18 = var6.UuUVuuUu(58.0F);
            float var19 = var6.UuUVuuUu(8.0F);
            float var20 = var72 - var6.UuUVuuUu(24.0F);

            for (int var21 = 0; var21 < this.nvUVNnuu.size(); var21++) {
               nUvUnuNNNnUN.nvnNNunvv var22 = this.nvUVNnuu.get(var21);
               float var23 = var69 + var10 + var21 * (var18 + var19);
               float var24 = var2.UuUVuuUu("cfg_entry:" + var22.name);
               float var25 = Math.min(var24, var8);
               if (!(var25 <= 0.01F)) {
                  float var26 = (1.0F - var24) * var6.UuUVuuUu(12.0F);
                  float var27 = var23 + var26;
                  if (!(var27 > var69 + var17) && !(var27 + var18 < var69)) {
                     NVuVVUNUvV var28 = this.UnUNVVVNuv.computeIfAbsent(var22.name, var0 -> new NVuVVUNUvV("Name", var0));
                     boolean var29 = var2.NuUuUvUUvU() == var28;
                     if (!var29 && this.vNVuvnUUnuUn != null && this.vNVuvnUUnuUn.equals(var22.name)) {
                        String var30 = var28.uNNnnnuuuN.trim();
                        if (!var30.isEmpty() && !var30.equals(var22.name)) {
                           var3.UuUVuuUu(var22.name, var30);
                           if (this.UuuNnUvUuv.equals(var22.name)) {
                              this.UuuNnUvUuv = var30;
                           }

                           this.UnUNVVVNuv.remove(var22.name);
                           this.UuUVuuUu(var3);
                           this.vNVuvnUUnuUn = null;
                           return;
                        }

                        this.vNVuvnUUnuUn = null;
                     }

                     if (var29) {
                        this.vNVuvnUUnuUn = var22.name;
                     }

                     boolean var76 = this.UuuNnUvUuv.equals(var22.name);
                     float var31 = var2.UuUVuuUu("cfg_active:" + var22.name, var76 ? 1.0F : 0.0F, UuUVuuUu);
                     float var32 = var2.UuUVuuUu(
                        "cfg_hover:" + var22.name, nunvNNUnvU.UuUVuuUu(var2, var68, var27, var20, var18) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv()
                     );
                     var1.uNNnnnuuuN(var25);
                     var1.UuUVuuUu(
                        nunvNNUnvU.UuUVuuUu(var32, Math.abs(var2.C00OOC00oO("cfg_hover:" + var22.name)), 0.01F, 5.0E-4F),
                        var68 + var20 * 0.5F,
                        var27 + var18 * 0.5F
                     );

                     try {
                        int var33 = NUunUunuNV.UuUVuuUu(var7.uVUuuVnNVU(), var7.nvUVNnuu(), var32);
                        int var34 = NUunUunuNV.UuUVuuUu(var33, NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), 30), var31 * 0.35F);
                        var1.UuUVuuUu(var68, var27, var20, var18, var6.UuUVuuUu(8.0F), var34);
                        float var35 = var68 + var6.UuUVuuUu(16.0F);
                        float var36 = var27 + var6.UuUVuuUu(12.0F);
                        int var37 = NUunUunuNV.UuUVuuUu(var7.NVNnnvnuunNv(), var7.uVunuUNVVUUV(), var31);
                        if (var29) {
                           String var38 = var28.uNNnnnuuuN;
                           if (System.currentTimeMillis() % 1000L > 500L) {
                              var38 = var38 + "|";
                           }

                           nunvNNUnvU.UuUVuuUu(var1, var6, vNvnnVvvVUu.vVvUvVVuuNvV, var35, var36, var6.UuUVuuUu(14.0F), 13.0F, var38, var7.NVNnnvnuunNv());
                        } else {
                           nunvNNUnvU.UuUVuuUu(var1, var6, vNvnnVvvVUu.vVvUvVVuuNvV, var35, var36, var6.UuUVuuUu(14.0F), 13.0F, var22.name, var37);
                        }

                        float var77 = var36 + var6.UuUVuuUu(22.0F);
                        nunvNNUnvU.UuUVuuUu(
                           var1, var6, vNvnnVvvVUu.vNUvnnVnUvu, var35, var77 - var6.UuUVuuUu(0.5F), var6.UuUVuuUu(12.0F), 8.0F, "r", var7.UvnvNVnnnnNU()
                        );
                        float var39 = var35 + var6.UuUVuuUu(14.0F);
                        float var40 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var22.author, 10.0F);
                        nunvNNUnvU.UuUVuuUu(var1, var6, vNvnnVvvVUu.UuUVuuUu, var39, var77, var6.UuUVuuUu(12.0F), 10.0F, var22.author, var7.uVUVnuvnuVuv());
                        var39 += var40 + var6.UuUVuuUu(6.0F);
                        nunvNNUnvU.UuUVuuUu(var1, var6, vNvnnVvvVUu.vNUvnnVnUvu, var39, var77 + 0.5F, var6.UuUVuuUu(12.0F), 6.0F, "k", var7.UvnvNVnnnnNU());
                        var39 += var6.UuUVuuUu(12.0F);
                        nunvNNUnvU.UuUVuuUu(
                           var1, var6, vNvnnVvvVUu.vNUvnnVnUvu, var39, var77 - var6.UuUVuuUu(0.5F), var6.UuUVuuUu(12.0F), 10.0F, "Q", var7.UvnvNVnnnnNU()
                        );
                        var39 += var6.UuUVuuUu(14.0F);
                        String var41 = nuUnNvnuUu.format(new Date(var22.timestamp));
                        nunvNNUnvU.UuUVuuUu(var1, var6, vNvnnVvvVUu.UuUVuuUu, var39, var77, var6.UuUVuuUu(12.0F), 10.0F, var41, var7.uVUVnuvnuVuv());
                        float var42 = var6.UuUVuuUu(26.0F);
                        float var43 = var6.UuUVuuUu(8.0F);
                        float var44 = var68 + var20 + var6.UuUVuuUu(8.0F);
                        nunvNNUnvU.UuUVuuUu(var1, var6, vNvnnVvvVUu.vNUvnnVnUvu, var44, var27 + (var18 - var42) * 0.5F, var42, 12.0F, "O", var7.uVUVnuvnuVuv());
                        float var45 = var68 + var20 - var6.UuUVuuUu(12.0F) - var42;
                        this.UuUVuuUu(var1, var2, "cfg_I_" + var22.name, var45, var27 + (var18 - var42) * 0.5F, var42, "I", true, false, var5);
                        var45 -= var42 + var43;
                        this.UuUVuuUu(var1, var2, "cfg_U_" + var22.name, var45, var27 + (var18 - var42) * 0.5F, var42, "U", false, var76, var5);
                     } finally {
                        var1.uVUuuVnNVU();
                        var1.vuuuNvNuv();
                     }
                  }
               }
            }
         }
      } finally {
         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }

      nunvNNUnvU.UuUVuuUu(var1, var6, var7, var68, var69, var72, var17, var6.UuUVuuUu(6.0F), this.nNvNUVU);
      this.UuUVuuUu(var1, this.uUVvnUuNvvN, this.vNnNuuvVn, this.nNvNUVU, var6, var7);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(UnVNvNnU var1, class_332 var2, vNvvVnNuUVvv var3, AutoBuy var4, nUvUnuNNNnUN.uunvUUVnuNn var5, nUVuuNUVnV var6) {
      nUvnuVnNUU var7 = var6.uNNnnnuuuN();
      NUunUunuNV var8 = var6.nuUnNvnuUu();
      float var9 = var3.UuUVuuUu(vnvnUnVnuunn.uVunuUNVVUUV());
      float var10 = this.vVvUvVVuuNvV(var5, var7);
      float var11 = this.UuUVuuUu(this.NVNnnvnuunNv, var10);
      this.NnUuNNU = var11 - this.UvUvUNuvNU;
      this.UvUvUNuvNU = var11;
      int var12 = AutoBuy.vVVuuVVv.size();
      if (this.NuunnvnN >= 0 && var12 > this.NuunnvnN) {
         this.unNNVVNnvvV = new uvNVnuNn(VUuNVnvnVun.EASE_OUT_CUBIC, 600L);
         this.unNNVVNnvvV.UuUVuuUu(1.0);
      }

      this.NuunnvnN = var12;
      this.unNNVVNnvvV.UuUVuuUu(1.0);
      this.VVnVNnunVvu.UuUVuuUu(1.0);
      float var13 = this.C00OOC00oO((float)this.VVnVNnunVvu.uVUuuVnNVU(), 0.0F, 1.0F);
      float var14 = this.C00OOC00oO(1.0F - (float)this.unNNVVNnvvV.uVUuuVnNVU(), 0.0F, 1.0F);
      float var15 = var7.UuUVuuUu(42.0F);
      this.UuNnnVnuNNV = this.UuUVuuUu(
         var5.x() + var5.width() - var7.UuUVuuUu(10.0F),
         var5.panelY() + var15,
         var5.scrollbarW(),
         var5.panelH() - var15 - var7.UuUVuuUu(10.0F),
         var10,
         var11,
         var7
      );
      this.UuUVuuUu(
         var1,
         var3,
         null,
         var5.x(),
         var5.panelY(),
         var5.width(),
         var5.panelH(),
         var7.UuUVuuUu(10.0F),
         0.0F,
         0.0F,
         nUvUnuNNNnUN.VUVvVuvuN.WELL,
         false,
         var7,
         var8
      );
      float var16 = var5.x() + var7.UuUVuuUu(16.0F);
      float var17 = var5.panelY() + var7.UuUVuuUu(14.0F);
      var1.uNNnnnuuuN(var9);
      boolean var64 = false /* VF: Semaphore variable */;

      try {
         var64 = true;
         nunvNNUnvU.UuUVuuUu(var1, var7, vNvnnVvvVUu.vVvUvVVuuNvV, var16, var17, var7.UuUVuuUu(16.0F), 14.0F, "История покупок", var8.uVUVnuvnuVuv());
         float var18 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, "История покупок", 14.0F);
         this.UuUVuuUu(var1, var7, var8, var16 + var18 + var7.UuUVuuUu(12.0F), var17, var13, var14, var12);
         float var19 = var7.UuUVuuUu(75.0F);
         float var20 = var7.UuUVuuUu(20.0F);
         float var21 = var5.x() + var5.width() - var7.UuUVuuUu(16.0F) - var19;
         String var22 = "history_clear_all";
         float var23 = var3.UuUVuuUu(var22, nunvNNUnvU.UuUVuuUu(var3, var21, var17, var19, var20) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv());
         var1.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var23, var3.C00OOC00oO(var22)), var21 + var19 * 0.5F, var17 + var20 * 0.5F);
         var1.UuUVuuUu(
            var21,
            var17,
            var19,
            var20,
            var7.UuUVuuUu(6.0F),
            NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var8.C00OOC00oO(), 20), NUunUunuNV.UuUVuuUu(var8.C00OOC00oO(), 40), var23)
         );
         var1.UuUVuuUu(
            var21,
            var17,
            var19,
            var20,
            var7.UuUVuuUu(6.0F),
            NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var8.C00OOC00oO(), 60), NUunUunuNV.UuUVuuUu(var8.C00OOC00oO(), 120), var23),
            0.5F
         );
         float var24 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, "I", 10.0F);
         float var25 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, "Очистить", 10.0F);
         float var26 = var7.UuUVuuUu(4.0F);
         float var27 = var21 + (var19 - (var24 + var26 + var25)) / 2.0F;
         nunvNNUnvU.UuUVuuUu(
            var1, var7, vNvnnVvvVUu.vNUvnnVnUvu, var27, var17, var20, 10.0F, "I", NUunUunuNV.UuUVuuUu(var8.uVUVnuvnuVuv(), var8.C00OOC00oO(), var23)
         );
         nunvNNUnvU.UuUVuuUu(
            var1,
            var7,
            vNvnnVvvVUu.UuUVuuUu,
            var27 + var24 + var26,
            var17,
            var20,
            10.0F,
            "Очистить",
            NUunUunuNV.UuUVuuUu(var8.uVUVnuvnuVuv(), var8.NVNnnvnuunNv(), var23)
         );
         var1.uVUuuVnNVU();
         var64 = false;
      } finally {
         if (var64) {
            var1.vuuuNvNuv();
         }
      }

      var1.vuuuNvNuv();
      float var69 = var5.x() + var7.UuUVuuUu(16.0F);
      float var70 = var5.panelY() + var15;
      float var71 = var5.width() - var7.UuUVuuUu(20.0F) - var5.scrollbarW();
      float var72 = var5.panelH() - var15 - var7.UuUVuuUu(10.0F);
      float var73 = this.NVNnnvnuunNv.vNUvnnVnUvu();
      float var74 = var71 - var7.UuUVuuUu(36.0F);
      var1.uUnuvNvvNU();
      var1.UuUVuuUu(var69, var70, var71, var72, var7.UuUVuuUu(6.0F), var7.UuUVuuUu(6.0F), var7.UuUVuuUu(6.0F), var7.UuUVuuUu(6.0F));

      try {
         if (AutoBuy.vVVuuVVv.isEmpty()) {
            var1.uNNnnnuuuN(var9);

            try {
               String var75 = "История покупок пуста";
               float var77 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var75, 12.0F);
               nunvNNUnvU.UuUVuuUu(
                  var1,
                  var7,
                  vNvnnVvvVUu.UuUVuuUu,
                  var69 + (var71 - var77) * 0.5F,
                  var70 + var72 * 0.5F - var7.UuUVuuUu(6.0F),
                  var7.UuUVuuUu(12.0F),
                  12.0F,
                  var75,
                  var8.UvnvNVnnnnNU()
               );
            } finally {
               var1.vuuuNvNuv();
            }
         } else {
            float var76 = var7.UuUVuuUu(42.0F);
            float var78 = var7.UuUVuuUu(6.0F);

            for (int var79 = 0; var79 < AutoBuy.vVVuuVVv.size(); var79++) {
               AutoBuy.VUnuUnnuNvVu var80 = AutoBuy.vVVuuVVv.get(var79);
               float var28 = var70 + var73 + var79 * (var76 + var78);
               if (!(var28 > var70 + var72) && !(var28 + var76 < var70)) {
                  var1.uNNnnnuuuN(var9);

                  try {
                     var1.UuUVuuUu(var69, var28, var74, var76, var7.UuUVuuUu(8.0F), var8.uVUuuVnNVU());
                     var1.UuUVuuUu(var69, var28, var74, var76, var7.UuUVuuUu(8.0F), var8.nvUVNnuu(), 0.5F);
                     float var29 = var7.UuUVuuUu(28.0F);
                     float var30 = var69 + var7.UuUVuuUu(8.0F);
                     float var31 = var28 + (var76 - var29) * 0.5F;
                     nUvUnuNNNnUN.NVnVnNnN var32 = this.UuUVuuUu(var4, var80.C00OOC00oO);
                     this.UuUVuuUu(
                        var1, var2, var32, var30 + var7.UuUVuuUu(6.0F), var31 + var7.UuUVuuUu(6.0F), var7.UuUVuuUu(16.0F), var9, var69, var70, var71, var72
                     );
                     float var33 = var30 + var29 + var7.UuUVuuUu(6.0F);
                     String var35 = "Куплено ";
                     String var36 = (var80.uUnuvNvvNU > 1 ? "x" + var80.uUnuvNvvNU + " " : "") + var80.C00OOC00oO;
                     String var37 = " за ";
                     String var38 = this.UuUVuuUu(var80.vVvUvVVuuNvV);
                     float var39 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var35, 10.0F);
                     float var40 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var36, 10.0F);
                     float var41 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var37, 10.0F);
                     nunvNNUnvU.UuUVuuUu(var1, var7, vNvnnVvvVUu.UuUVuuUu, var33, var28, var76, 10.0F, var35, var8.uVUVnuvnuVuv());
                     nunvNNUnvU.UuUVuuUu(var1, var7, vNvnnVvvVUu.vVvUvVVuuNvV, var33 + var39, var28 - 1.0F, var76, 10.0F, var36, var8.NVNnnvnuunNv());
                     nunvNNUnvU.UuUVuuUu(var1, var7, vNvnnVvvVUu.UuUVuuUu, var33 + var39 + var40, var28, var76, 10.0F, var37, var8.uVUVnuvnuVuv());
                     nunvNNUnvU.UuUVuuUu(
                        var1,
                        var7,
                        vNvnnVvvVUu.vVvUvVVuuNvV,
                        var33 + var39 + var40 + var41,
                        var28 - 1.0F,
                        var76,
                        10.0F,
                        var38,
                        NUunUunuNV.UuUVuuUu(var8.UuUVuuUu(), 200)
                     );
                     String var42 = uNNnnnuuuN.format(new Date(var80.uNNnnnuuuN));
                     float var43 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var42, 9.0F);
                     nunvNNUnvU.UuUVuuUu(
                        var1, var7, vNvnnVvvVUu.UuUVuuUu, var69 + var74 - var43 - var7.UuUVuuUu(10.0F), var28, var76, 9.0F, var42, var8.UvnvNVnnnnNU()
                     );
                     nunvNNUnvU.UuUVuuUu(
                        var1, var7, vNvnnVvvVUu.vNUvnnVnUvu, var69 + var74 - var43 - var7.UuUVuuUu(24.0F), var28 - 1.0F, var76, 10.0F, "Q", var8.UvnvNVnnnnNU()
                     );
                     float var44 = var7.UuUVuuUu(26.0F);
                     float var45 = var69 + var74 + var7.UuUVuuUu(6.0F);
                     this.UuUVuuUu(
                        var1, var3, "hist_del_" + var80.uNNnnnuuuN + "_" + var79, var45, var28 + (var76 - var44) * 0.5F, var44, "I", true, false, var6
                     );
                  } finally {
                     var1.vuuuNvNuv();
                  }
               }
            }
         }
      } finally {
         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }

      nunvNNUnvU.UuUVuuUu(var1, var7, var8, var69, var70, var71, var72, var7.UuUVuuUu(6.0F), this.NnUuNNU);
      this.UuUVuuUu(var1, this.UuNnnVnuNNV, this.NVuunNnvvvVu, this.NnUuNNU, var7, var8);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void C00OOC00oO(UnVNvNnU var1, class_332 var2, vNvvVnNuUVvv var3, AutoBuy var4, nUvUnuNNNnUN.uunvUUVnuNn var5, nUVuuNUVnV var6) {
      nUvnuVnNUU var7 = var6.uNNnnnuuuN();
      NUunUunuNV var8 = var6.nuUnNvnuUu();
      float var9 = var3.UuUVuuUu(vnvnUnVnuunn.uVunuUNVVUUV());
      List var10 = this.C00OOC00oO(var4, this.NVUunUNUN.uNNnnnuuuN);
      float var11 = this.UuUVuuUu(var4, var5, var7);
      float var12 = this.UuUVuuUu(this.UvnvNVnnnnNU, var11);
      this.UNnVVNvvnVvU = var12 - this.UnUNuUU;
      this.UnUNuUU = var12;
      this.uUVVvVVNvvn = this.UuUVuuUu(var5.catalogScrollbarX(), var5.catalogViewportY(), var5.scrollbarW(), var5.catalogViewportH(), var11, var12, var7);
      this.UuUVuuUu(
         var1,
         var3,
         null,
         var5.leftX(),
         var5.panelY(),
         var5.leftW(),
         var5.panelH(),
         var7.UuUVuuUu(10.0F),
         0.0F,
         0.0F,
         nUvUnuNNNnUN.VUVvVuvuN.WELL,
         false,
         var7,
         var8
      );
      nunvNNUnvU.UuUVuuUu(
         var1,
         var7,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var5.leftX() + var7.UuUVuuUu(12.0F),
         var5.panelY() + var7.UuUVuuUu(11.0F),
         var7.UuUVuuUu(14.0F),
         12.0F,
         "Каталог предметов",
         var8.uVUVnuvnuVuv()
      );
      nunvNNUnvU.UuUVuuUu(
         var1,
         var7,
         vNvnnVvvVUu.UuUVuuUu,
         var5.leftX() + var7.UuUVuuUu(12.0F),
         var5.panelY() + var7.UuUVuuUu(28.0F),
         var7.UuUVuuUu(12.0F),
         10.0F,
         "ЛКМ по предмету — настроить цену",
         var8.UvnvNVnnnnNU()
      );
      this.UuUVuuUu(var1, var3, var5, var7, var8);
      var1.uUnuvNvvNU();
      var1.UuUVuuUu(
         var5.catalogViewportX(),
         var5.catalogViewportY(),
         var5.catalogViewportW(),
         var5.catalogViewportH(),
         var7.UuUVuuUu(6.0F),
         var7.UuUVuuUu(6.0F),
         var7.UuUVuuUu(6.0F),
         var7.UuUVuuUu(6.0F)
      );
      boolean var15 = false /* VF: Semaphore variable */;

      try {
         var15 = true;
         this.UuUVuuUu(var1, var2, var3, var10, var5, var7, var8, var12, var9);
         var15 = false;
      } finally {
         if (var15) {
            var1.uUnuvNvvNU();
            var1.nuUnNvnuUu();
         }
      }

      var1.uUnuvNvvNU();
      var1.nuUnNvnuUu();
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      class_332 var2,
      vNvvVnNuUVvv var3,
      List<nUvUnuNNNnUN.NVnVnNnN> var4,
      nUvUnuNNNnUN.uunvUUVnuNn var5,
      nUvnuVnNUU var6,
      NUunUunuNV var7,
      float var8,
      float var9
   ) {
      int var10 = this.nuUnNvnuUu(var5, var6);
      float var11 = this.UuUVuuUu(var6);
      float var12 = this.C00OOC00oO(var6);
      float var13 = this.uUnuvNvvNU(var6);
      int var14 = Math.max(1, (var4.size() + var10 - 1) / var10);
      int var15 = Math.max(0, (int)Math.floor(-var8 / (var12 + var13)) - 1);
      int var16 = Math.min(var14, (int)Math.ceil((var5.catalogViewportH() - var8) / (var12 + var13)) + 1);

      for (int var17 = var15; var17 < var16; var17++) {
         for (int var18 = 0; var18 < var10; var18++) {
            int var19 = var17 * var10 + var18;
            if (var19 >= var4.size()) {
               break;
            }

            nUvUnuNNNnUN.NVnVnNnN var20 = (nUvUnuNNNnUN.NVnVnNnN)var4.get(var19);
            float var21 = var5.catalogViewportX() + var18 * (var11 + var13);
            float var22 = var5.catalogViewportY() + var8 + var17 * (var12 + var13);
            if (!(var22 > var5.catalogViewportY() + var5.catalogViewportH()) && !(var22 + var12 < var5.catalogViewportY())) {
               float var23 = var3.UuUVuuUu(vnvnUnVnuunn.UuUVuuUu(var20.key()));
               if (var19 >= 80) {
                  var23 = var9;
               }

               if (!(var23 <= 0.01F)) {
                  float var24 = (1.0F - var23) * var6.UuUVuuUu(9.0F);
                  var1.uNNnnnuuuN(var23);

                  try {
                     this.UuUVuuUu(
                        var1,
                        var2,
                        var3,
                        var20,
                        var21,
                        var22 + var24,
                        var11,
                        var12,
                        var6,
                        var7,
                        Math.min(var23, var9),
                        var5.catalogViewportX(),
                        var5.catalogViewportY(),
                        var5.catalogViewportW(),
                        var5.catalogViewportH()
                     );
                  } finally {
                     var1.vuuuNvNuv();
                  }
               }
            }
         }
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      class_332 var2,
      vNvvVnNuUVvv var3,
      nUvUnuNNNnUN.NVnVnNnN var4,
      float var5,
      float var6,
      float var7,
      float var8,
      nUvnuVnNUU var9,
      NUunUunuNV var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15
   ) {
      boolean var16 = AutoBuy.UuNnnVnuNNV.containsKey(var4.key());
      boolean var17 = var4.key().equals(this.vuvnUnVnUNnV);
      int var18 = AutoBuy.uVUuuVnNVU(var4.key());
      int var19 = AutoBuy.vuuuNvNuv(var4.key());
      float var20 = var3.UuUVuuUu(vnvnUnVnuunn.uUnuvNvvNU(var4.key()), nunvNNUnvU.UuUVuuUu(var3, var5, var6, var7, var8) ? 1.0F : 0.0F, vVvUvVVuuNvV);
      float var21 = var3.UuUVuuUu("ab_settings_tile:" + var4.key(), var17 ? 1.0F : 0.0F, C00OOC00oO);
      UUNnvUVnnnnN var22 = var3.VUuuVUnun().get(vnvnUnVnuunn.uUnuvNvvNU(var4.key()));
      float var23 = var22 == null ? 0.0F : Math.abs(var22.uUnuvNvvNU());
      float var24 = nunvNNUnvU.UuUVuuUu(var20, var23, 0.018F, 0.006F);
      this.UuUVuuUu(
         var1, var3, "catalog:" + var4.key(), var5, var6, var7, var8, var9.UuUVuuUu(10.0F), var20, var21, nUvUnuNNNnUN.VUVvVuvuN.TILE, true, var9, var10
      );
      float var26 = var9.UuUVuuUu(30.0F);
      float var27 = var5 + (var7 - var26) * 0.5F;
      float var28 = var6 + var9.UuUVuuUu(7.0F);
      float var29 = var27 + var26 * 0.5F;
      float var30 = var28 + var26 * 0.5F;
      var1.UuUVuuUu(var24, var29, var30);

      try {
         this.C00OOC00oO(var1, var27, var28, var26, Math.max(var20, var21), var16 ? 0.22F : 0.0F, var9, var10);
         class_1799 var31 = var4.custom() ? VnuunNV.UuUVuuUu(var4.key()) : var4.stack();
         if (var31 != null && !var31.method_7960()) {
            this.UuUVuuUu(var1, var2, var4, var27 + var9.UuUVuuUu(5.0F), var28 + var9.UuUVuuUu(5.0F), var9.UuUVuuUu(20.0F), var11, var12, var13, var14, var15);
         } else {
            this.UuUVuuUu(var1, var9, vNvnnVvvVUu.vVvUvVVuuNvV, var27, var28, var26, var26, 12.0F, "?", var10.vNVuvnUUnuUn());
         }
      } finally {
         var1.uVUuuVnNVU();
      }

      if (this.VVuuUN(var4.key()) && (var18 > 0 || var19 < 100)) {
         String var38 = var18 + "-" + var19 + "%";
         float var32 = var9.UuUVuuUu(13.0F);
         float var33 = Math.max(var9.UuUVuuUu(24.0F), nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var38, 7.5F) + var9.UuUVuuUu(8.0F));
         float var34 = Math.min(var27 + var26 - var33 + var9.UuUVuuUu(4.0F), var5 + var7 - var33);
         float var35 = Math.max(var6, var28 - var9.UuUVuuUu(5.0F));
         var1.UuUVuuUu(var34, var35, var33, var32, var9.UuUVuuUu(5.0F), NUunUunuNV.UuUVuuUu(var10.VVuuUN(), 238));
         var1.UuUVuuUu(var34, var35, var33, var32, var9.UuUVuuUu(5.0F), NUunUunuNV.UuUVuuUu(var10.uVunuUNVVUUV(), 116), 0.5F);
         this.UuUVuuUu(var1, var9, vNvnnVvvVUu.UuUVuuUu, var34, var35, var33, var32, 7.5F, var38, NUunUunuNV.UuUVuuUu(var10.uVunuUNVVUUV(), 205));
      }

      nUvUnuNNNnUN.vUvuUvvVvvnN var39 = this.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var4.label(), 8.8F, 7.2F, var7 - var9.UuUVuuUu(8.0F), 2);
      this.UuUVuuUu(
         var1,
         var9,
         vNvnnVvvVUu.UuUVuuUu,
         var39,
         var5,
         var6 + var9.UuUVuuUu(43.0F),
         var9.UuUVuuUu(10.5F),
         NUunUunuNV.UuUVuuUu(var10.UvnvNVnnnnNU(), var10.uVUVnuvnuVuv(), Math.max(var20, var16 ? 0.22F : 0.0F)),
         true,
         var7
      );
      String var40 = var16 ? this.UuUVuuUu(AutoBuy.UuNnnVnuNNV.getOrDefault(var4.key(), 0L)) : "не задано";
      float var41 = var40.length() > 10 ? 7.5F : 8.3F;
      float var42 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var40, var41);
      nunvNNUnvU.UuUVuuUu(
         var1,
         var9,
         vNvnnVvvVUu.UuUVuuUu,
         var5 + (var7 - var42) * 0.5F,
         var6 + var9.UuUVuuUu(68.0F),
         var9.UuUVuuUu(10.0F),
         var41,
         var40,
         var16 ? NUunUunuNV.UuUVuuUu(var10.UNnVVNvvnVvU(), var10.uVunuUNVVUUV(), 0.65F) : var10.UvnvNVnnnnNU()
      );
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUvUnuNNNnUN.uunvUUVnuNn var3, nUvnuVnNUU var4, NUunUunuNV var5) {
      float var6 = this.VVuuUN(var3, var4);
      float var7 = this.vNUvnnVnUvu(var3, var4);
      float var8 = this.uVUuuVnNVU(var3, var4);
      float var9 = this.vVvUvVVuuNvV(var4);
      float var10 = var2.UuUVuuUu(vnvnUnVnuunn.VVuuUN("catalog:search"), var2.NuUuUvUUvU() == this.NVUunUNUN ? 1.0F : 0.0F, C00OOC00oO);
      float var11 = this.NVUunUNUN.uNNnnnuuuN != null && !this.NVUunUNUN.uNNnnnuuuN.isBlank() ? 1.0F : 0.0F;
      var1.UuUVuuUu(var6, var7, var8, var9, var4.UuUVuuUu(8.0F), NUunUunuNV.UuUVuuUu(var5.vNUvnnVnUvu(), var5.vuuuNvNuv(), var10));
      var1.UuUVuuUu(
         var6,
         var7,
         var8,
         var9,
         var4.UuUVuuUu(8.0F),
         NUunUunuNV.UuUVuuUu(var5.vuuuNvNuv(), NUunUunuNV.UuUVuuUu(var5.uVunuUNVVUUV(), 105), Math.max(var10, var11 * 0.35F)),
         Math.max(0.75F, var4.UuUVuuUu(0.55F))
      );
      if (var10 > 0.01F) {
         var1.UuUVuuUu(
            var6,
            var7,
            var8,
            var9,
            var4.UuUVuuUu(8.0F),
            var4.UuUVuuUu(10.0F) * var10,
            var4.UuUVuuUu(1.8F),
            NUunUunuNV.UuUVuuUu(var5.uVunuUNVVUUV(), Math.round(14.0F * var10))
         );
      }

      String var12 = this.NVUunUNUN.uNNnnnuuuN == null ? "" : this.NVUunUNUN.uNNnnnuuuN;
      String var13 = var12.isEmpty() ? "Поиск предметов" : var12;
      if (var2.NuUuUvUUvU() == this.NVUunUNUN && System.currentTimeMillis() % 1000L > 500L) {
         var13 = var13 + "|";
      }

      nunvNNUnvU.UuUVuuUu(
         var1,
         var4,
         vNvnnVvvVUu.UuUVuuUu,
         var6 + var4.UuUVuuUu(12.0F),
         var7,
         var9,
         10.5F,
         nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var13, 10.5F, var8 - var4.UuUVuuUu(44.0F)),
         var12.isEmpty() ? var5.UvnvNVnnnnNU() : var5.uVUVnuvnuVuv()
      );
      if (!var12.isEmpty()) {
         nunvNNUnvU.UuUVuuUu(
            var1, var4, vNvnnVvvVUu.uNNnnnuuuN, var6 + var8 - var4.UuUVuuUu(25.0F), var7, var9, 10.0F, "l", NUunUunuNV.UuUVuuUu(var5.uVunuUNVVUUV(), 170)
         );
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(UnVNvNnU var1, class_332 var2, vNvvVnNuUVvv var3, nUvUnuNNNnUN.uunvUUVnuNn var4, nUVuuNUVnV var5) {
      nUvnuVnNUU var6 = var5.uNNnnnuuuN();
      NUunUunuNV var7 = var5.nuUnNvnuUu();
      float var8 = var3.UuUVuuUu(vnvnUnVnuunn.uVunuUNVVUUV());
      List var9 = this.C00OOC00oO();
      float var10 = this.UuUVuuUu(var4, var6, var3);
      float var11 = this.UuUVuuUu(this.uVUVnuvnuVuv, var10);
      this.uNnUnnuNUnNu = var11 - this.uUVuVvuNUvnu;
      this.uUVuVvuNUvnu = var11;
      this.vvUVNVvvNUv = this.UuUVuuUu(var4.rulesScrollbarX(), var4.rulesViewportY(), var4.scrollbarW(), var4.rulesViewportH(), var10, var11, var6);
      this.UuUVuuUu(
         var1,
         var3,
         null,
         var4.rightX(),
         var4.panelY(),
         var4.rightW(),
         var4.panelH(),
         var6.UuUVuuUu(10.0F),
         0.0F,
         0.0F,
         nUvUnuNNNnUN.VUVvVuvuN.WELL,
         false,
         var6,
         var7
      );
      nunvNNUnvU.UuUVuuUu(
         var1,
         var6,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var4.rightX() + var6.UuUVuuUu(12.0F),
         var4.panelY() + var6.UuUVuuUu(11.0F),
         var6.UuUVuuUu(14.0F),
         12.0F,
         "Настроенные предметы",
         var7.NVNnnvnuunNv()
      );
      nunvNNUnvU.UuUVuuUu(
         var1,
         var6,
         vNvnnVvvVUu.UuUVuuUu,
         var4.rightX() + var6.UuUVuuUu(12.0F),
         var4.panelY() + var6.UuUVuuUu(28.0F),
         var6.UuUVuuUu(12.0F),
         10.0F,
         "Цена, статус, настройки и удаление",
         var7.uVUVnuvnuVuv()
      );
      this.C00OOC00oO(var1, var3, var4, var6, var7);
      var1.uUnuvNvvNU();
      var1.UuUVuuUu(
         var4.rulesViewportX(),
         var4.rulesViewportY(),
         var4.rulesViewportW(),
         var4.rulesViewportH(),
         var6.UuUVuuUu(6.0F),
         var6.UuUVuuUu(6.0F),
         var6.UuUVuuUu(6.0F),
         var6.UuUVuuUu(6.0F)
      );
      boolean var31 = false /* VF: Semaphore variable */;

      try {
         var31 = true;
         if (var9.isEmpty()) {
            this.UuUVuuUu(var1, var4, var6, var7);
            var31 = false;
         } else {
            float var12 = var6.UuUVuuUu(6.0F);
            float var13 = var4.rulesViewportX() + var12;
            float var14 = var4.rulesViewportW() - var12 * 2.0F;
            float var15 = var4.rulesViewportY() + var11;

            for (int var16 = 0; var16 < var9.size(); var16++) {
               String var17 = (String)var9.get(var16);
               float var18 = this.UuUVuuUu(var3, var17);
               float var19 = this.UuUVuuUu(var17, var6, var18);
               if (!(var15 > var4.rulesViewportY() + var4.rulesViewportH()) && !(var15 + var19 < var4.rulesViewportY())) {
                  float var20 = var3.UuUVuuUu(vnvnUnVnuunn.C00OOC00oO(var17));
                  if (var20 <= 0.01F) {
                     var15 += var19 + this.nuUnNvnuUu(var6);
                  } else {
                     float var21 = (1.0F - var20) * var6.UuUVuuUu(12.0F);
                     var1.uNNnnnuuuN(var20);

                     try {
                        this.UuUVuuUu(
                           var1,
                           var2,
                           var3,
                           var17,
                           var13,
                           var15 + var21,
                           var14,
                           this.uNNnnnuuuN(var6),
                           var6,
                           var7,
                           Math.min(var20, var8),
                           var4.rulesViewportX(),
                           var4.rulesViewportY(),
                           var4.rulesViewportW(),
                           var4.rulesViewportH()
                        );
                        if (var18 > 0.01F && this.VVuuUN(var17)) {
                           float var22 = this.UuUVuuUu(var17, var6);
                           float var23 = var15 + this.uNNnnnuuuN(var6) + var6.UuUVuuUu(6.0F) * var18 + var21;
                           float var24 = Math.max(var6.UuUVuuUu(1.0F), var22 * var18);
                           var1.uUnuvNvvNU();
                           var1.UuUVuuUu(var13, var23, var14, var24, var6.UuUVuuUu(12.0F), var6.UuUVuuUu(12.0F), var6.UuUVuuUu(12.0F), var6.UuUVuuUu(12.0F));
                           var1.uNNnnnuuuN(var18);

                           try {
                              this.C00OOC00oO(
                                 var1,
                                 var2,
                                 var3,
                                 var17,
                                 var13,
                                 var23 - var6.UuUVuuUu(7.0F) * (1.0F - var18),
                                 var14,
                                 var22,
                                 var6,
                                 var7,
                                 Math.min(var20, var8) * var18,
                                 var4.rulesViewportX(),
                                 var4.rulesViewportY(),
                                 var4.rulesViewportW(),
                                 var4.rulesViewportH()
                              );
                           } finally {
                              var1.vuuuNvNuv();
                              var1.uUnuvNvvNU();
                              var1.nuUnNvnuUu();
                           }
                        }
                     } finally {
                        var1.vuuuNvNuv();
                     }

                     var15 += var19 + this.nuUnNvnuUu(var6);
                  }
               } else {
                  var15 += var19 + this.nuUnNvnuUu(var6);
               }
            }

            var31 = false;
         }
      } finally {
         if (var31) {
            var1.uUnuvNvvNU();
            var1.nuUnNvnuUu();
         }
      }

      var1.uUnuvNvvNU();
      var1.nuUnNvnuUu();
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvUnuNNNnUN.uunvUUVnuNn var2, nUvnuVnNUU var3, NUunUunuNV var4) {
      String var5 = "Нет настроенных предметов";
      String var6 = "Выберите предмет из каталога";
      float var7 = var2.rulesViewportY() + var2.rulesViewportH() * 0.5F - var3.UuUVuuUu(14.0F);
      float var8 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var5, 12.0F);
      float var9 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var6, 10.0F);
      nunvNNUnvU.UuUVuuUu(
         var1,
         var3,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var2.rulesViewportX() + (var2.rulesViewportW() - var8) * 0.5F,
         var7,
         var3.UuUVuuUu(14.0F),
         12.0F,
         var5,
         var4.uVUVnuvnuVuv()
      );
      nunvNNUnvU.UuUVuuUu(
         var1,
         var3,
         vNvnnVvvVUu.UuUVuuUu,
         var2.rulesViewportX() + (var2.rulesViewportW() - var9) * 0.5F,
         var7 + var3.UuUVuuUu(16.0F),
         var3.UuUVuuUu(12.0F),
         10.0F,
         var6,
         var4.UvnvNVnnnnNU()
      );
   }

   private nUvUnuNNNnUN.VUnuUnnuNvVu C00OOC00oO(nUvUnuNNNnUN.uunvUUVnuNn var1, nUvnuVnNUU var2) {
      float var3 = var2.UuUVuuUu(24.0F);
      float var4 = var1.panelY() + var2.UuUVuuUu(12.0F);
      float var5 = var2.UuUVuuUu(38.0F);
      float var6 = var2.UuUVuuUu(38.0F);
      float var7 = var2.UuUVuuUu(122.0F);
      float var8 = var2.UuUVuuUu(6.0F);
      float var9 = var1.rightX() + var1.rightW() - var5 - var2.UuUVuuUu(12.0F);
      float var10 = var9 - var8 - var6;
      float var11 = var10 - var8 - var7;
      boolean var12 = var11 >= var1.rightX() + var2.UuUVuuUu(206.0F);
      return new nUvUnuNNNnUN.VUnuUnnuNvVu(var12, var11, var4, var7, var3, var10, var6, var9, var5);
   }

   private void C00OOC00oO(UnVNvNnU var1, vNvvVnNuUVvv var2, nUvUnuNNNnUN.uunvUUVnuNn var3, nUvnuVnNUU var4, NUunUunuNV var5) {
      AutoBuy var6 = AutoBuy.NVNnnvnuunNv;
      if (var6 != null) {
         nUvUnuNNNnUN.VUnuUnnuNvVu var7 = this.C00OOC00oO(var3, var4);
         if (var7.visible()) {
            boolean var8 = var6.NVUunUNUN.uUnuvNvvNU();
            boolean var9 = var6.vuvnUnVnUNnV.uUnuvNvvNU();
            nUNuNuUUuUVU var10 = var6.uNnUnnuNUnNu();
            boolean var11 = var8 && var10.nvUVNnuu() > 0;
            boolean var12 = var8 && var6.UNnVVNvvnVvU();
            String var13;
            int var14;
            if (!var8) {
               var13 = "Детект: выкл";
               var14 = var5.UvnvNVnnnnNU();
            } else if (!var11) {
               var13 = "Аук: нет данных";
               var14 = var5.uVUVnuvnuVuv();
            } else if (var12) {
               var13 = "Замедлен ~" + var10.VVuuUN() + "мс";
               var14 = var5.C00OOC00oO();
            } else {
               var13 = "Аук ~" + var10.VVuuUN() + "мс";
               var14 = var5.UuUVuuUu();
            }

            float var15 = var2.UuUVuuUu(
               vnvnUnVnuunn.nuUnNvnuUu("lag:chip"),
               nunvNNUnvU.UuUVuuUu(var2, var7.chipX(), var7.chipY(), var7.chipW(), var7.chipH()) ? 1.0F : 0.0F,
               Cc0cOoOcC0o.vuuuNvNuv()
            );
            var1.UuUVuuUu(
               var7.chipX(),
               var7.chipY(),
               var7.chipW(),
               var7.chipH(),
               var4.UuUVuuUu(8.0F),
               NUunUunuNV.UuUVuuUu(var5.uVUuuVnNVU(), var5.UuuNnUvUuv(), var15 * 0.6F)
            );
            var1.UuUVuuUu(
               var7.chipX(),
               var7.chipY(),
               var7.chipW(),
               var7.chipH(),
               var4.UuUVuuUu(8.0F),
               NUunUunuNV.UuUVuuUu(var5.vuuuNvNuv(), NUunUunuNV.UuUVuuUu(var14, 110), var8 ? 0.65F : var15),
               0.5F
            );
            float var16 = Math.max(1.0F, var4.UuUVuuUu(1.25F));
            float var17 = var4.UuUVuuUu(10.0F);
            float var18 = var7.chipX() + var4.UuUVuuUu(10.0F);
            float var19 = var7.chipY() + (var7.chipH() - var17) * 0.5F;
            float var20 = var8 ? var4.UuUVuuUu(var12 ? 8.5F : 6.5F) : var4.UuUVuuUu(3.0F);
            var1.UuUVuuUu(var18, var19, var16, var17, var16 * 0.5F, NUunUunuNV.UuUVuuUu(var14, var8 ? 86 : 44));
            var1.UuUVuuUu(var18, var19 + (var17 - var20) * 0.5F, var16, var20, var16 * 0.5F, var8 ? NUunUunuNV.UuUVuuUu(var14, 210) : var5.UvnvNVnnnnNU());
            String var21 = nunvNNUnvU.UuUVuuUu(var4, vNvnnVvvVUu.vVvUvVVuuNvV, var13, 9.0F, var7.chipW() - var4.UuUVuuUu(28.0F));
            nunvNNUnvU.UuUVuuUu(
               var1,
               var4,
               vNvnnVvvVUu.vVvUvVVuuNvV,
               var18 + var16 + var4.UuUVuuUu(7.0F),
               var7.chipY(),
               var7.chipH(),
               9.0F,
               var21,
               var8 ? NUunUunuNV.UuUVuuUu(var14, 190) : var5.uVUVnuvnuVuv()
            );
            boolean var22 = var6.UUVNuUNUvUnV.uUnuvNvvNU();
            float var23 = var2.UuUVuuUu(
               vnvnUnVnuunn.nuUnNvnuUu("lag:fix"),
               nunvNNUnvU.UuUVuuUu(var2, var7.fixX(), var7.chipY(), var7.fixW(), var7.chipH()) ? 1.0F : 0.0F,
               Cc0cOoOcC0o.vuuuNvNuv()
            );
            float var24 = var2.UuUVuuUu(vnvnUnVnuunn.nuUnNvnuUu("lag:fixOn"), var22 ? 1.0F : 0.0F, UuUVuuUu);
            int var25 = NUunUunuNV.UuUVuuUu(var5.uVUuuVnNVU(), NUunUunuNV.UuUVuuUu(24, 140, 72, 72), var24);
            int var26 = NUunUunuNV.UuUVuuUu(var5.vuuuNvNuv(), NUunUunuNV.UuUVuuUu(var5.UuUVuuUu(), 95), var24);
            var1.UuUVuuUu(
               var7.fixX(), var7.chipY(), var7.fixW(), var7.chipH(), var4.UuUVuuUu(8.0F), NUunUunuNV.UuUVuuUu(var25, var5.UuuNnUvUuv(), var23 * 0.5F)
            );
            var1.UuUVuuUu(var7.fixX(), var7.chipY(), var7.fixW(), var7.chipH(), var4.UuUVuuUu(8.0F), NUunUunuNV.UuUVuuUu(var26, var5.UuuNnUvUuv(), var23), 0.5F);
            this.UuUVuuUu(
               var1,
               var4,
               vNvnnVvvVUu.vVvUvVVuuNvV,
               var7.fixX(),
               var7.chipY(),
               var7.fixW(),
               var7.chipH(),
               9.0F,
               "фикс",
               var22 ? NUunUunuNV.UuUVuuUu(var5.UuUVuuUu(), 180) : var5.uVUVnuvnuVuv()
            );
            float var27 = var2.UuUVuuUu(
               vnvnUnVnuunn.nuUnNvnuUu("lag:stat"),
               nunvNNUnvU.UuUVuuUu(var2, var7.statX(), var7.chipY(), var7.statW(), var7.chipH()) ? 1.0F : 0.0F,
               Cc0cOoOcC0o.vuuuNvNuv()
            );
            float var28 = var2.UuUVuuUu(vnvnUnVnuunn.nuUnNvnuUu("lag:statOn"), var9 ? 1.0F : 0.0F, UuUVuuUu);
            int var29 = NUunUunuNV.UuUVuuUu(var5.uVUuuVnNVU(), NUunUunuNV.UuUVuuUu(var5.uVunuUNVVUUV(), 52), var28);
            int var30 = NUunUunuNV.UuUVuuUu(var5.vuuuNvNuv(), NUunUunuNV.UuUVuuUu(var5.uVunuUNVVUUV(), 110), var28);
            var1.UuUVuuUu(
               var7.statX(), var7.chipY(), var7.statW(), var7.chipH(), var4.UuUVuuUu(8.0F), NUunUunuNV.UuUVuuUu(var29, var5.UuuNnUvUuv(), var27 * 0.5F)
            );
            var1.UuUVuuUu(
               var7.statX(), var7.chipY(), var7.statW(), var7.chipH(), var4.UuUVuuUu(8.0F), NUunUunuNV.UuUVuuUu(var30, var5.UuuNnUvUuv(), var27), 0.5F
            );
            this.UuUVuuUu(
               var1,
               var4,
               vNvnnVvvVUu.vVvUvVVuuNvV,
               var7.statX(),
               var7.chipY(),
               var7.statW(),
               var7.chipH(),
               9.0F,
               "стат",
               var9 ? var5.uVunuUNVVUUV() : var5.uVUVnuvnuVuv()
            );
         }
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      class_332 var2,
      vNvvVnNuUVvv var3,
      String var4,
      float var5,
      float var6,
      float var7,
      float var8,
      nUvnuVnNUU var9,
      NUunUunuNV var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15
   ) {
      boolean var16 = this.VVuuUN(var4);
      nUvUnuNNNnUN.VUUnVnVNNU var17 = this.UuUVuuUu(var5, var6, var7, var8, var16, var9);
      boolean var18 = nunvNNUnvU.UuUVuuUu(var3, var17.priceX(), var17.controlY(), var17.priceW(), var17.controlH())
         || nunvNNUnvU.UuUVuuUu(var3, var17.statusX(), var17.controlY(), var17.statusW(), var17.controlH())
         || nunvNNUnvU.UuUVuuUu(var3, var17.deleteX(), var17.controlY(), var17.deleteW(), var17.controlH())
         || var16 && nunvNNUnvU.UuUVuuUu(var3, var17.settingsX(), var17.controlY(), var17.settingsW(), var17.controlH());
      String var19 = vnvnUnVnuunn.vVvUvVVuuNvV(var4);
      float var20 = var3.UuUVuuUu(var19, nunvNNUnvU.UuUVuuUu(var3, var5, var6, var7, var8) && !var18 ? 1.0F : 0.0F, vVvUvVVuuNvV);
      boolean var21 = !AutoBuy.vNnNuuvVn.contains(var4);
      float var22 = var3.UuUVuuUu(this.UuuNnUvUuv(var4));
      this.UuUVuuUu(var1, var3, "rule:" + var4, var5, var6, var7, var8, var9.UuUVuuUu(12.0F), var20, var22, nUvUnuNNNnUN.VUVvVuvuN.CARD, true, var9, var10);
      nUvUnuNNNnUN.NVnVnNnN var24 = this.C00OOC00oO(var4);
      float var25 = var9.UuUVuuUu(34.0F);
      float var26 = var5 + var9.UuUVuuUu(10.0F);
      float var27 = var6 + (var8 - var25) * 0.5F;
      this.UuUVuuUu(var1, var26, var27, var25, Math.max(var20, var22), var9, var10);
      this.UuUVuuUu(var1, var2, var24, var26 + var9.UuUVuuUu(8.0F), var27 + var9.UuUVuuUu(8.0F), var9.UuUVuuUu(18.0F), var11, var12, var13, var14, var15);
      float var28 = var3.UuUVuuUu(vnvnUnVnuunn.UuUVuuUu(this.vNUvnnVnUvu(var4)), var21 ? 1.0F : 0.0F, UuUVuuUu);
      this.UuUVuuUu(var1, var26, var27, var25, var28, var20, var9, var10);
      if (var17.titleW() > var9.UuUVuuUu(8.0F)) {
         nUvUnuNNNnUN.vUvuUvvVvvnN var29 = this.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var24.label(), 11.5F, 8.0F, var17.titleW(), 2);
         float var30 = var9.UuUVuuUu(11.5F);
         float var31 = var29.lines().size() * var30;
         float var32 = var6 + (var8 - var31) * 0.5F;
         int var33 = (int)Math.floor(var17.titleX());
         int var34 = (int)Math.ceil(var17.titleX() + var17.titleW());
         var1.UuUVuuUu(var33, (int)Math.floor(var6), Math.max(1, var34 - var33), Math.max(1, (int)Math.ceil(var8)));

         try {
            this.UuUVuuUu(
               var1,
               var9,
               vNvnnVvvVUu.vVvUvVVuuNvV,
               var29,
               var17.titleX(),
               var32,
               var30,
               var21 ? var10.NVNnnvnuunNv() : var10.uVUVnuvnuVuv(),
               false,
               var17.titleW()
            );
         } finally {
            var1.nuUnNvnuUu();
         }
      }

      this.UuUVuuUu(var1, var3, var4, var17.priceX(), var17.controlY(), var17.priceW(), var17.controlH(), var9, var10);
      this.UuUVuuUu(var1, var3, var4, var17.statusX(), var17.controlY(), var17.statusW(), var17.controlH(), var9, var10, var28);
      this.C00OOC00oO(var1, var3, var4, var17.deleteX(), var17.controlY(), var17.deleteW(), var17.controlH(), var9, var10);
      if (var16) {
         this.UuUVuuUu(var1, var3, var4, var17.settingsX(), var17.controlY(), var17.settingsW(), var9, var10);
      }
   }

   private nUvUnuNNNnUN.VUUnVnVNNU UuUVuuUu(float var1, float var2, float var3, float var4, boolean var5, nUvnuVnNUU var6) {
      float var7 = var6.UuUVuuUu(29.0F);
      float var8 = var5 ? var6.UuUVuuUu(29.0F) : 0.0F;
      float var9 = var6.UuUVuuUu(29.0F);
      float var10 = var6.UuUVuuUu(38.0F);
      float var11 = var6.UuUVuuUu(86.0F);
      float var12 = var6.UuUVuuUu(6.0F);
      float var13 = var6.UuUVuuUu(10.0F);
      UNNNnNVnUnn.NVnVnNnN var14 = UNNNnNVnUnn.UuUVuuUu(var1, var3, var13, var12, var11, var10, var9, var8);
      float var15 = var1 + var6.UuUVuuUu(54.0F);
      float var16 = Math.max(0.0F, var14.priceX() - var15 - var6.UuUVuuUu(10.0F));
      return new nUvUnuNNNnUN.VUUnVnVNNU(
         var15,
         var16,
         var14.priceX(),
         var14.priceWidth(),
         var14.statusX(),
         var14.statusWidth(),
         var14.deleteX(),
         var14.deleteWidth(),
         var14.settingsX(),
         var14.settingsWidth(),
         var2 + (var4 - var7) * 0.5F,
         var7
      );
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, String var3, float var4, float var5, float var6, float var7, nUvnuVnNUU var8, NUunUunuNV var9) {
      NVuVVUNUvV var10 = this.vNUvnnVnUvu(var3);
      if (var2.NuUuUvUUvU() != var10) {
         var10.uNNnnnuuuN = this.uVUuuVnNVU(var3);
      }

      boolean var11 = var2.NuUuUvUUvU() == var10;
      float var12 = var2.UuUVuuUu(vnvnUnVnuunn.VVuuUN(var3), var11 ? 1.0F : 0.0F, C00OOC00oO);
      float var13 = var2.UuUVuuUu(vnvnUnVnuunn.nuUnNvnuUu("price:" + var3), nunvNNUnvU.UuUVuuUu(var2, var4, var5, var6, var7) ? 1.0F : 0.0F, vVvUvVVuuNvV);
      this.UuUVuuUu(var1, var2, "price:" + var3, var4, var5, var6, var7, var8.UuUVuuUu(8.0F), var13, var12, nUvUnuNNNnUN.VUVvVuvuN.INSET, false, var8, var9);
      String var14 = var10.uNNnnnuuuN == null ? "" : var10.uNNnnnuuuN;
      String var15 = UNNNnNVnUnn.UuUVuuUu(var14, var11);
      boolean var16 = !var11 && var15.equals("Макс. цена");
      float var17 = var4 + var8.UuUVuuUu(8.0F);
      float var18 = var4 + var6 - var8.UuUVuuUu(8.0F);
      float var19 = Math.max(1.0F, var18 - var17);
      float var20 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var15, 10.0F);
      float var21 = var17;
      if (var11 && !var15.isEmpty()) {
         var21 = var17 - Math.max(0.0F, var20 - var19);
      }

      int var22 = (int)Math.floor(var17);
      int var23 = (int)Math.ceil(var18);
      var1.UuUVuuUu(var22, (int)Math.floor(var5), Math.max(1, var23 - var22), Math.max(1, (int)Math.ceil(var7)));
      boolean var28 = false /* VF: Semaphore variable */;

      try {
         var28 = true;
         nunvNNUnvU.UuUVuuUu(
            var1,
            var8,
            vNvnnVvvVUu.UuUVuuUu,
            var21,
            var5,
            var7,
            10.0F,
            var15,
            var16 ? var9.UvnvNVnnnnNU() : NUunUunuNV.UuUVuuUu(var9.uVUVnuvnuVuv(), var9.NVNnnvnuunNv(), var12 * 0.34F)
         );
         if (var11) {
            if (System.currentTimeMillis() % 1000L > 500L) {
               float var24 = var21 + var20 + var8.UuUVuuUu(1.0F);
               float var25 = var8.UuUVuuUu(11.0F);
               var1.UuUVuuUu(
                  var24,
                  var5 + (var7 - var25) * 0.5F,
                  Math.max(1.0F, var8.UuUVuuUu(1.0F)),
                  var25,
                  0.0F,
                  NUunUunuNV.UuUVuuUu(var9.vVvUvVVuuNvV(), Math.round(150.0F + 90.0F * var12))
               );
               var28 = false;
            } else {
               var28 = false;
            }
         } else {
            var28 = false;
         }
      } finally {
         if (var28) {
            var1.nuUnNvnuUu();
         }
      }

      var1.nuUnNvnuUu();
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, nUvnuVnNUU var7, NUunUunuNV var8) {
      float var9 = var7.UuUVuuUu(8.0F);
      float var10 = var2 + var4 - var9 - var7.UuUVuuUu(1.5F);
      float var11 = var3 + var4 - var9 - var7.UuUVuuUu(1.5F);
      float var12 = this.C00OOC00oO(var5, 0.0F, 1.0F);
      int var13 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var8.VVuuUN(), 244), NUunUunuNV.UuUVuuUu(var8.UuUVuuUu(), 132), var12 * 0.34F);
      int var14 = NUunUunuNV.UuUVuuUu(var8.UnUNVVVNuv(), NUunUunuNV.UuUVuuUu(var8.UuUVuuUu(), 220), var12);
      int var15 = NUunUunuNV.UuUVuuUu(var8.UvnvNVnnnnNU(), var8.UuUVuuUu(), var12);
      if (var12 > 0.01F) {
         var1.UuUVuuUu(
            var10,
            var11,
            var9,
            var9,
            var9 * 0.5F,
            var7.UuUVuuUu(5.0F + var6 * 2.0F),
            var7.UuUVuuUu(0.5F),
            NUunUunuNV.UuUVuuUu(var8.UuUVuuUu(), Math.round((34.0F + var6 * 20.0F) * var12))
         );
      }

      var1.UuUVuuUu(var10, var11, var9, var9, var9 * 0.5F, var13);
      var1.UuUVuuUu(var10, var11, var9, var9, var9 * 0.5F, var14, Math.max(0.5F, var7.UuUVuuUu(0.55F)));
      float var16 = var7.UuUVuuUu(3.0F + var12);
      var1.UuUVuuUu(var10 + (var9 - var16) * 0.5F, var11 + (var9 - var16) * 0.5F, var16, var16, var16 * 0.5F, var15);
   }

   private void UuUVuuUu(
      UnVNvNnU var1, vNvvVnNuUVvv var2, String var3, float var4, float var5, float var6, float var7, nUvnuVnNUU var8, NUunUunuNV var9, float var10
   ) {
      String var11 = vnvnUnVnuunn.nuUnNvnuUu(var3);
      float var12 = var2.UuUVuuUu(var11, nunvNNUnvU.UuUVuuUu(var2, var4, var5, var6, var7) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv());
      var1.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var12, var2.C00OOC00oO(var11), 0.02F, 0.006F), var4 + var6 * 0.5F, var5 + var7 * 0.5F);

      try {
         this.UuUVuuUu(
            var1, var2, "status:" + var3, var4, var5, var6, var7, var8.UuUVuuUu(8.0F), var12, var10 * 0.28F, nUvUnuNNNnUN.VUVvVuvuN.CONTROL, false, var8, var9
         );
         float var13 = var8.UuUVuuUu(22.0F);
         float var14 = var8.UuUVuuUu(11.0F);
         float var15 = var4 + (var6 - var13) * 0.5F;
         float var16 = var5 + (var7 - var14) * 0.5F;
         float var17 = var14 * 0.5F;
         int var18 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var9.VVuuUN(), 226), NUunUunuNV.UuUVuuUu(var9.UuUVuuUu(), 116), var10);
         int var19 = NUunUunuNV.UuUVuuUu(var9.UnUNVVVNuv(), NUunUunuNV.UuUVuuUu(var9.UuUVuuUu(), 178), var10);
         var1.UuUVuuUu(var15, var16, var13, var14, var17, var18);
         var1.UuUVuuUu(var15, var16, var13, var14, var17, var19, Math.max(0.5F, var8.UuUVuuUu(0.55F)));
         float var20 = var8.UuUVuuUu(7.0F);
         float var21 = var8.UuUVuuUu(2.0F);
         float var22 = var15 + var21 + (var13 - var21 * 2.0F - var20) * var10;
         float var23 = var16 + (var14 - var20) * 0.5F;
         if (var10 > 0.01F) {
            var1.UuUVuuUu(
               var22,
               var23,
               var20,
               var20,
               var20 * 0.5F,
               var8.UuUVuuUu(5.0F + var12),
               var8.UuUVuuUu(0.4F),
               NUunUunuNV.UuUVuuUu(var9.UuUVuuUu(), Math.round((38.0F + var12 * 20.0F) * var10))
            );
         }

         int var24 = NUunUunuNV.UuUVuuUu(var9.uVUVnuvnuVuv(), var9.UuUVuuUu(), var10);
         var1.UuUVuuUu(var22, var23, var20, var20, var20 * 0.5F, var24);
         float var25 = var8.UuUVuuUu(2.0F);
         var1.UuUVuuUu(
            var22 + var8.UuUVuuUu(1.2F),
            var23 + var8.UuUVuuUu(1.1F),
            var25,
            var25,
            var25 * 0.5F,
            NUunUunuNV.UuUVuuUu(var9.NVNnnvnuunNv(), Math.round(52.0F + 68.0F * var10))
         );
      } finally {
         var1.uVUuuVnNVU();
      }
   }

   private void C00OOC00oO(UnVNvNnU var1, vNvvVnNuUVvv var2, String var3, float var4, float var5, float var6, float var7, nUvnuVnNUU var8, NUunUunuNV var9) {
      String var10 = vnvnUnVnuunn.uNNnnnuuuN(var3);
      float var11 = var2.UuUVuuUu(var10, nunvNNUnvU.UuUVuuUu(var2, var4, var5, var6, var7) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv());
      var1.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var11, var2.C00OOC00oO(var10), 0.03F, 0.008F), var4 + var6 * 0.5F, var5 + var7 * 0.5F);

      try {
         this.UuUVuuUu(
            var1, var2, "delete:" + var3, var4, var5, var6, var7, var8.UuUVuuUu(8.0F), var11, 0.0F, nUvUnuNNNnUN.VUVvVuvuN.CONTROL, false, var8, var9
         );
         float var12 = 10.0F;
         nunvNNUnvU.UuUVuuUu(
            var1, var8, vNvnnVvvVUu.vNUvnnVnUvu, var4, var5, var6, var7, var12, "I", NUunUunuNV.UuUVuuUu(var9.UvnvNVnnnnNU(), var9.C00OOC00oO(), var11)
         );
      } finally {
         var1.uVUuuVnNVU();
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, String var3, float var4, float var5, float var6, nUvnuVnNUU var7, NUunUunuNV var8) {
      boolean var9 = var3.equals(this.vuvnUnVnUNnV);
      String var10 = vnvnUnVnuunn.nuUnNvnuUu("settings:" + var3);
      float var11 = var2.UuUVuuUu(var10, nunvNNUnvU.UuUVuuUu(var2, var4, var5, var6, var6) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv());
      float var12 = var2.UuUVuuUu("ab_settings_on:" + var3, var9 ? 1.0F : 0.0F, C00OOC00oO);
      var1.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var11, var2.C00OOC00oO(var10), 0.03F, 0.008F), var4 + var6 * 0.5F, var5 + var6 * 0.5F);

      try {
         this.UuUVuuUu(
            var1, var2, "settings:" + var3, var4, var5, var6, var6, var7.UuUVuuUu(8.0F), var11, var12, nUvUnuNNNnUN.VUVvVuvuN.CONTROL, false, var7, var8
         );
         float var13 = 11.0F;
         nunvNNUnvU.UuUVuuUu(
            var1,
            var7,
            vNvnnVvvVUu.uUnuvNvvNU,
            var4,
            var5,
            var6,
            var6,
            var13,
            "I",
            NUunUunuNV.UuUVuuUu(var8.UvnvNVnnnnNU(), var8.uVunuUNVVUUV(), Math.max(var11, var12))
         );
      } finally {
         var1.uVUuuVnNVU();
      }
   }

   private void C00OOC00oO(
      UnVNvNnU var1,
      class_332 var2,
      vNvvVnNuUVvv var3,
      String var4,
      float var5,
      float var6,
      float var7,
      float var8,
      nUvnuVnNUU var9,
      NUunUunuNV var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15
   ) {
      float var16 = var3.UuUVuuUu(
         vnvnUnVnuunn.nuUnNvnuUu("settingsPanel:" + var4), nunvNNUnvU.UuUVuuUu(var3, var5, var6, var7, var8) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv()
      );
      float var17 = var3.UuUVuuUu(this.UuuNnUvUuv(var4));
      this.UuUVuuUu(
         var1, var3, "settingsPanel:" + var4, var5, var6, var7, var8, var9.UuUVuuUu(12.0F), var16, var17, nUvUnuNNNnUN.VUVvVuvuN.CARD, true, var9, var10
      );
      nUvUnuNNNnUN.NVnVnNnN var18 = this.C00OOC00oO(var4);
      float var19 = var9.UuUVuuUu(16.0F);
      float var20 = var9.UuUVuuUu(32.0F);
      float var21 = var5 + var19;
      float var22 = var6 + var9.UuUVuuUu(12.0F);
      this.UuUVuuUu(var1, var21, var22, var20, Math.max(var16, var17), var9, var10);
      this.UuUVuuUu(var1, var2, var18, var21 + var9.UuUVuuUu(7.0F), var22 + var9.UuUVuuUu(7.0F), var9.UuUVuuUu(18.0F), var11, var12, var13, var14, var15);
      float var23 = var21 + var20 + var9.UuUVuuUu(10.0F);
      nunvNNUnvU.UuUVuuUu(
         var1, var9, vNvnnVvvVUu.vVvUvVVuuNvV, var23, var6 + var9.UuUVuuUu(12.0F), var9.UuUVuuUu(15.0F), 12.5F, "Настройки предмета", var10.NVNnnvnuunNv()
      );
      String var24 = AutoBuy.uVUuuVnNVU(var4) + "-" + AutoBuy.vuuuNvNuv(var4) + "%";
      float var25 = Math.max(var9.UuUVuuUu(48.0F), nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var24, 10.0F) + var9.UuUVuuUu(14.0F));
      float var26 = var5 + var7 - var19 - var25;
      float var27 = var6 + var9.UuUVuuUu(14.0F);
      float var28 = var9.UuUVuuUu(22.0F);
      int var29 = NUunUunuNV.UuUVuuUu(
         NUunUunuNV.UuUVuuUu(var10.VVuuUN(), var10.nuUnNvnuUu(), var10.uNnUnnuNUnNu() ? 0.34F : 0.44F), var10.uNnUnnuNUnNu() ? 164 : 220
      );
      int var30 = NUunUunuNV.UuUVuuUu(
         NUunUunuNV.UuUVuuUu(var10.VVuuUN(), var10.nuUnNvnuUu(), var10.uNnUnnuNUnNu() ? 0.48F : 0.7F), var10.uNnUnnuNUnNu() ? 144 : 202
      );
      float var31 = Math.max(0.5F, var9.UuUVuuUu(0.8F));
      var1.UuUVuuUu(var26, var27, var25, var28, var9.UuUVuuUu(7.0F), var29);
      var1.UuUVuuUu(var26 + var31, var27 + var31, var25 - var31 * 2.0F, var28 - var31 * 2.0F, var9.UuUVuuUu(6.0F), var30);
      var1.UuUVuuUu(var26, var27, var25, var28, var9.UuUVuuUu(7.0F), var10.nvUVNnuu(), Math.max(0.5F, var9.UuUVuuUu(0.5F)));
      this.UuUVuuUu(var1, var9, vNvnnVvvVUu.vVvUvVVuuNvV, var26, var6 + var9.UuUVuuUu(14.0F), var25, var9.UuUVuuUu(22.0F), 10.0F, var24, var10.uVunuUNVVUUV());
      float var32 = var26 - var23 - var9.UuUVuuUu(8.0F);
      nUvUnuNNNnUN.vUvuUvvVvvnN var33 = this.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var18.label(), 10.0F, 8.0F, var32, 2);
      this.UuUVuuUu(var1, var9, vNvnnVvvVUu.UuUVuuUu, var33, var23, var6 + var9.UuUVuuUu(31.0F), var9.UuUVuuUu(10.0F), var10.uVUVnuvnuVuv(), false, var32);
      this.uUnuvNvvNU(var1, var3, var4, var5 + var19, var6 + var9.UuUVuuUu(58.0F), var7 - var19 * 2.0F, var9.UuUVuuUu(36.0F), var9, var10);
      nUvUnuNNNnUN.nvUnvV var34 = this.uUnuvNvvNU(var4);
      if (!var34.enchantments().isEmpty()) {
         nunvNNUnvU.UuUVuuUu(
            var1, var9, vNvnnVvvVUu.UuUVuuUu, var5 + var19, var6 + var9.UuUVuuUu(108.0F), var9.UuUVuuUu(12.0F), 9.5F, "Зачарования", var10.uVUVnuvnuVuv()
         );
         this.UuUVuuUu(var1, var3, var4, var34.enchantments(), var5 + var19, var6 + var9.UuUVuuUu(128.0F), var7 - var19 * 2.0F, var9, var10);
      }
   }

   private void uUnuvNvvNU(UnVNvNnU var1, vNvvVnNuUVvv var2, String var3, float var4, float var5, float var6, float var7, nUvnuVnNUU var8, NUunUunuNV var9) {
      int var10 = AutoBuy.uVUuuVnNVU(var3);
      int var11 = AutoBuy.vuuuNvNuv(var3);
      float var13 = var5 + var8.UuUVuuUu(22.0F);
      float var15 = var8.UuUVuuUu(5.0F);
      float var16 = var4 + var6 * var10 / 100.0F;
      float var17 = var4 + var6 * var11 / 100.0F;
      float var18 = var2.UuUVuuUu(
         vnvnUnVnuunn.nuUnNvnuUu("durSlider:" + var3), nunvNNUnvU.UuUVuuUu(var2, var4, var5, var6, var7) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv()
      );
      float var19 = this.UuUVuuUu("durability:" + var3);
      float var20 = var19 <= 0.0F ? 0.0F : (float)Math.sin(var19 * Math.PI);
      nunvNNUnvU.UuUVuuUu(var1, var8, vNvnnVvvVUu.UuUVuuUu, var4, var5, var8.UuUVuuUu(12.0F), 10.0F, "Диапазон прочности", var9.uVUVnuvnuVuv());
      float var21 = Math.max(0.5F, var8.UuUVuuUu(0.75F));
      var1.UuUVuuUu(
         var4,
         var13,
         var6,
         var15,
         var8.UuUVuuUu(3.0F),
         NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var9.VVuuUN(), var9.nuUnNvnuUu(), var9.uNnUnnuNUnNu() ? 0.38F : 0.76F), var9.uNnUnnuNUnNu() ? 154 : 218)
      );
      var1.UuUVuuUu(
         var4 + var21,
         var13 + var21,
         var6 - var21 * 2.0F,
         var15 - var21 * 2.0F,
         var8.UuUVuuUu(2.0F),
         NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var9.VVuuUN(), var9.nuUnNvnuUu(), var9.uNnUnnuNUnNu() ? 0.52F : 0.86F), var9.uNnUnnuNUnNu() ? 142 : 210)
      );
      var1.UuUVuuUu(var4, var13, var6, var15, var8.UuUVuuUu(3.0F), var9.vuuuNvNuv(), Math.max(0.5F, var8.UuUVuuUu(0.45F)));
      var1.UuUVuuUu(var16, var13, Math.max(var8.UuUVuuUu(3.0F), var17 - var16), var15, var8.UuUVuuUu(3.0F), NUunUunuNV.UuUVuuUu(var9.uVunuUNVVUUV(), 138));
      this.UuUVuuUu(var1, var16, var13 + var15 * 0.5F, var10 == 0 ? var9.uVUVnuvnuVuv() : var9.uVunuUNVVUUV(), var18 + var20 * 0.45F, var8, var9);
      this.UuUVuuUu(var1, var17, var13 + var15 * 0.5F, var11 == 100 ? var9.uVUVnuvnuVuv() : var9.uVunuUNVVUUV(), var18 + var20 * 0.45F, var8, var9);
      nunvNNUnvU.UuUVuuUu(
         var1, var8, vNvnnVvvVUu.UuUVuuUu, var4, var5 + var8.UuUVuuUu(30.0F), var8.UuUVuuUu(10.0F), 8.5F, "Мин " + var10 + "%", var9.UvnvNVnnnnNU()
      );
      String var22 = "Макс " + var11 + "%";
      float var23 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var22, 8.5F);
      nunvNNUnvU.UuUVuuUu(
         var1, var8, vNvnnVvvVUu.UuUVuuUu, var4 + var6 - var23, var5 + var8.UuUVuuUu(30.0F), var8.UuUVuuUu(10.0F), 8.5F, var22, var9.UvnvNVnnnnNU()
      );
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, int var4, float var5, nUvnuVnNUU var6, NUunUunuNV var7) {
      float var8 = this.C00OOC00oO(var5, 0.0F, 1.0F);
      float var9 = var6.UuUVuuUu(10.0F + var8 * 1.7F);
      float var10 = var2 - var9 * 0.5F;
      float var11 = var3 - var9 * 0.5F;
      float var12 = Math.max(0.5F, var6.UuUVuuUu(1.0F));
      if (var8 > 0.012F) {
         var1.UuUVuuUu(
            var10,
            var11 + var6.UuUVuuUu(0.5F),
            var9,
            var9,
            var9 * 0.5F,
            var6.UuUVuuUu(4.5F) * var8,
            var6.UuUVuuUu(0.4F),
            NUunUunuNV.UuUVuuUu(var4, Math.round(12.0F + 16.0F * var8))
         );
      }

      var1.UuUVuuUu(
         var10,
         var11,
         var9,
         var9,
         var9 * 0.5F,
         NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var7.VVuuUN(), var7.nuUnNvnuUu(), 0.38F), var7.uNnUnnuNUnNu() ? 212 : 238)
      );
      var1.UuUVuuUu(var10 + var12, var11 + var12, var9 - var12 * 2.0F, var9 - var12 * 2.0F, Math.max(0.0F, var9 * 0.5F - var12), NUunUunuNV.UuUVuuUu(var4, 228));
      var1.UuUVuuUu(var10, var11, var9, var9, var9 * 0.5F, var7.UuuNnUvUuv(), Math.max(0.5F, var6.UuUVuuUu(0.5F)));
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, nUvnuVnNUU var6, NUunUunuNV var7) {
      float var8 = this.C00OOC00oO(var5, 0.0F, 1.0F);
      this.C00OOC00oO(var1, var2, var3, var4, var8, var8, var6, var7);
   }

   private void C00OOC00oO(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, nUvnuVnNUU var7, NUunUunuNV var8) {
      float var9 = this.C00OOC00oO(var5, 0.0F, 1.0F);
      float var10 = this.C00OOC00oO(var6, 0.0F, 1.0F);
      float var11 = var7.UuUVuuUu(9.0F);
      float var12 = Math.max(0.5F, var7.UuUVuuUu(1.0F));
      int var13 = NUunUunuNV.UuUVuuUu(
         NUunUunuNV.UuUVuuUu(var8.VVuuUN(), var8.nuUnNvnuUu(), var8.uNnUnnuNUnNu() ? 0.36F : 0.7F), var8.uNnUnnuNUnNu() ? 156 : 224
      );
      int var14 = NUunUunuNV.UuUVuuUu(
         NUunUunuNV.UuUVuuUu(var8.VVuuUN(), var8.nuUnNvnuUu(), var8.uNnUnnuNUnNu() ? 0.54F : 0.84F), var8.uNnUnnuNUnNu() ? 142 : 206
      );
      if (var9 > 0.012F) {
         float var15 = var4 * 0.46F;
         float var16 = var2 + (var4 - var15) * 0.5F;
         float var17 = var3 + (var4 - var15) * 0.5F;
         var1.UuUVuuUu(
            var16,
            var17,
            var15,
            var15,
            var15 * 0.5F,
            var7.UuUVuuUu(6.0F) * var9,
            0.0F,
            NUunUunuNV.UuUVuuUu(var8.uVunuUNVVUUV(), Math.round(8.0F + 12.0F * var9))
         );
      }

      var1.UuUVuuUu(var2, var3, var4, var4, var11, var13);
      var1.UuUVuuUu(var2 + var12, var3 + var12, var4 - var12 * 2.0F, var4 - var12 * 2.0F, Math.max(0.0F, var11 - var12), var14);
      var1.UuUVuuUu(var2, var3, var4, var4, var11, var8.nvUVNnuu(), Math.max(0.5F, var7.UuUVuuUu(0.5F)));
      var1.UuUVuuUu(
         var2 + var12,
         var3 + var12,
         var4 - var12 * 2.0F,
         var4 - var12 * 2.0F,
         Math.max(0.0F, var11 - var12),
         NUunUunuNV.UuUVuuUu(var8.vuuuNvNuv(), NUunUunuNV.UuUVuuUu(var8.uVunuUNVVUUV(), 62), Math.max(var9 * 0.34F, var10 * 0.26F)),
         Math.max(0.5F, var7.UuUVuuUu(0.45F))
      );
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      vNvvVnNuUVvv var2,
      String var3,
      String var4,
      String var5,
      boolean var6,
      boolean var7,
      float var8,
      float var9,
      float var10,
      float var11,
      nUvnuVnNUU var12,
      NUunUunuNV var13
   ) {
      float var14 = var2.UuUVuuUu(
         vnvnUnVnuunn.nuUnNvnuUu("check:" + var3 + ":" + var4),
         var7 && nunvNNUnvU.UuUVuuUu(var2, var8, var9, var10, var11) ? 1.0F : 0.0F,
         Cc0cOoOcC0o.vuuuNvNuv()
      );
      float var15 = this.C00OOC00oO(var2.UuUVuuUu("ab_check_on:" + var3 + ":" + var4, var6 && var7 ? 1.0F : 0.0F, UuUVuuUu), 0.0F, 1.0F);
      float var16 = var15 * var15 * (3.0F - 2.0F * var15);
      int var17 = var7 ? NUunUunuNV.UuUVuuUu(var13.uVUVnuvnuVuv(), var13.NVNnnvnuunNv(), var14) : var13.UvnvNVnnnnNU();
      float var18 = var12.UuUVuuUu(14.0F);
      float var19 = var9 + (var11 - var18) * 0.5F;
      float var20 = this.UuUVuuUu("check:" + var3 + ":" + var4);
      float var21 = var20 <= 0.0F ? 0.0F : (float)Math.sin(var20 * Math.PI);
      float var22 = Math.max(0.5F, var12.UuUVuuUu(1.0F));
      if (var14 > 0.012F) {
         var1.UuUVuuUu(
            var8 - var12.UuUVuuUu(3.0F),
            var9,
            Math.max(0.0F, var10 - var12.UuUVuuUu(1.0F)),
            var11,
            var12.UuUVuuUu(6.0F),
            NUunUunuNV.UuUVuuUu(var13.NVNnnvnuunNv(), Math.round(4.0F + 8.0F * var14))
         );
      }

      var1.UuUVuuUu(
         var8,
         var19,
         var18,
         var18,
         var12.UuUVuuUu(4.0F),
         NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var13.VVuuUN(), var13.nuUnNvnuUu(), var13.uNnUnnuNUnNu() ? 0.42F : 0.74F), var13.uNnUnnuNUnNu() ? 168 : 224)
      );
      var1.UuUVuuUu(
         var8 + var22,
         var19 + var22,
         var18 - var22 * 2.0F,
         var18 - var22 * 2.0F,
         var12.UuUVuuUu(3.0F),
         NUunUunuNV.UuUVuuUu(
            NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var13.VVuuUN(), var13.nuUnNvnuUu(), var13.uNnUnnuNUnNu() ? 0.56F : 0.84F), var13.uNnUnnuNUnNu() ? 150 : 204),
            NUunUunuNV.UuUVuuUu(var13.uVunuUNVVUUV(), 54),
            var16 * 0.34F
         )
      );
      var1.UuUVuuUu(
         var8,
         var19,
         var18,
         var18,
         var12.UuUVuuUu(4.0F),
         NUunUunuNV.UuUVuuUu(var13.nvUVNnuu(), NUunUunuNV.UuUVuuUu(var13.uVunuUNVVUUV(), 72), Math.max(var16 * 0.52F, var14 * 0.25F)),
         Math.max(0.5F, var12.UuUVuuUu(0.5F))
      );
      if (var16 > 0.001F) {
         float var23 = 7.5F;
         float var24 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, "j", var23);
         var1.UuUVuuUu(0.7F + var16 * 0.3F, var8 + var18 * 0.5F, var19 + var18 * 0.5F);

         try {
            int var25 = NUunUunuNV.UuUVuuUu(var13.NVNnnvnuunNv(), Math.round(238.0F * var16));
            nunvNNUnvU.UuUVuuUu(
               var1,
               var12,
               vNvnnVvvVUu.vNUvnnVnUvu,
               var8 + (var18 - var24) * 0.5F,
               var19,
               var18,
               var23,
               "j",
               NUunUunuNV.UuUVuuUu(var25, NUunUunuNV.UuUVuuUu(var13.uVunuUNVVUUV(), Math.round(238.0F * var16)), 0.34F + var21 * 0.2F)
            );
         } finally {
            var1.uVUuuVnNVU();
         }
      }

      nunvNNUnvU.UuUVuuUu(
         var1,
         var12,
         vNvnnVvvVUu.UuUVuuUu,
         var8 + var18 + var12.UuUVuuUu(7.0F),
         var9,
         var11,
         9.5F,
         nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var5, 9.5F, var10 - var18 - var12.UuUVuuUu(10.0F)),
         var17
      );
   }

   private void UuUVuuUu(
      UnVNvNnU var1, vNvvVnNuUVvv var2, String var3, List<nUvUnuNNNnUN.VvunVVUvUNnv> var4, float var5, float var6, float var7, nUvnuVnNUU var8, NUunUunuNV var9
   ) {
      if (var4.isEmpty()) {
         nunvNNUnvU.UuUVuuUu(var1, var8, vNvnnVvvVUu.UuUVuuUu, var5, var6, var8.UuUVuuUu(14.0F), 9.5F, "Нет заданных зачарований", var9.UvnvNVnnnnNU());
      } else {
         float var10 = var8.UuUVuuUu(8.0F);
         float var11 = var8.UuUVuuUu(22.0F);
         float var12 = (var7 - var10) * 0.5F;

         for (int var13 = 0; var13 < var4.size(); var13++) {
            nUvUnuNNNnUN.VvunVVUvUNnv var14 = (nUvUnuNNNnUN.VvunVVUvUNnv)var4.get(var13);
            float var15 = var5 + var13 % 2 * (var12 + var10);
            float var16 = var6 + var13 / 2 * (var11 + var8.UuUVuuUu(4.0F));
            boolean var17 = AutoBuy.C00OOC00oO(var3, var14.key());
            this.UuUVuuUu(var1, var2, var3, var14.key(), var14.label(), var17, true, var15, var16, var12, var11, var8, var9);
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, nUVnuvUu var3, float var4, float var5, float var6, float var7, float var8, String var9, int var10) {
      float var11 = nunvNNUnvU.UuUVuuUu(var3, var9, var8);
      nunvNNUnvU.UuUVuuUu(var1, var2, var3, var4 + (var6 - var11) * 0.5F, var5, var7, var8, var9, var10);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7, int var8) {
      if (!(var6 <= 0.01F)) {
         int var9 = var3.UuUVuuUu();
         float var10 = (1.0F - var6) * var2.UuUVuuUu(6.0F);
         var1.uNNnnnuuuN(var6);
         boolean var19 = false /* VF: Semaphore variable */;

         try {
            var19 = true;
            float var11 = var4 + var10;
            float var12 = Math.max(1.0F, var2.UuUVuuUu(1.4F));
            float var13 = var2.UuUVuuUu(9.0F);
            float var14 = var5 + (var2.UuUVuuUu(16.0F) - var13) * 0.5F;
            float var15 = var2.UuUVuuUu(4.0F) + var2.UuUVuuUu(4.0F) * var7;
            var1.UuUVuuUu(var11, var14, var12, var13, var12 * 0.5F, NUunUunuNV.UuUVuuUu(var9, Math.round(82.0F + 56.0F * var7)));
            var1.UuUVuuUu(var11, var14 + (var13 - var15) * 0.5F, var12, var15, var12 * 0.5F, NUunUunuNV.UuUVuuUu(var9, Math.round(158.0F + 76.0F * var7)));
            String var16 = var8 <= 0 ? "Мониторинг" : "Покупок: " + var8;
            nunvNNUnvU.UuUVuuUu(
               var1,
               var2,
               vNvnnVvvVUu.UuUVuuUu,
               var11 + var12 + var2.UuUVuuUu(6.0F),
               var5,
               var2.UuUVuuUu(16.0F),
               9.5F,
               var16,
               NUunUunuNV.UuUVuuUu(var9, Math.round(152.0F + 72.0F * var7))
            );
            var19 = false;
         } finally {
            if (var19) {
               var1.vuuuNvNuv();
            }
         }

         var1.vuuuNvNuv();
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      vNvvVnNuUVvv var2,
      String var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      nUvUnuNNNnUN.VUVvVuvuN var11,
      boolean var12,
      nUvnuVnNUU var13,
      NUunUunuNV var14
   ) {
      float var15 = this.C00OOC00oO(var9, 0.0F, 1.0F);
      float var16 = this.C00OOC00oO(var10, 0.0F, 1.0F);
      float var17 = this.UuUVuuUu(var3);
      float var18 = var17 <= 0.0F ? 0.0F : (float)Math.sin(var17 * Math.PI);
      float var19 = Math.max(var15, Math.max(var16, var18));
      float var20 = var18 > 0.001F ? this.VvVvnNUnvuvV : var2.unnUnUNVnN();
      float var21 = var18 > 0.001F ? this.ccOO0COcoco0 : var2.NnuUnUNnu();
      float var22 = var19 > 0.001F ? this.C00OOC00oO((var20 - var4) / Math.max(1.0F, var6), 0.07F, 0.93F) : 0.72F;
      float var23 = var19 > 0.001F ? this.C00OOC00oO((var21 - var5) / Math.max(1.0F, var7), 0.1F, 0.84F) : 0.18F;
      int var24 = this.UuUVuuUu(var14, var11);
      int var25 = var24 >>> 24 & 0xFF;

      float var26 = switch (var11) {
         case WELL -> var14.uNnUnnuNUnNu() ? 0.006F : 0.01F;
         case TILE -> var14.uNnUnnuNUnNu() ? 0.008F : 0.014F;
         case CARD -> var14.uNnUnnuNUnNu() ? 0.012F : 0.021F;
         case CONTROL -> var14.uNnUnnuNUnNu() ? 0.01F : 0.017F;
         case INSET -> var14.uNnUnnuNUnNu() ? 0.004F : 0.007F;
      };

      float var27 = switch (var11) {
         case WELL -> var14.uNnUnnuNUnNu() ? 0.006F : 0.012F;
         case TILE -> var14.uNnUnnuNUnNu() ? 0.008F : 0.017F;
         case CARD -> var14.uNnUnnuNUnNu() ? 0.012F : 0.026F;
         case CONTROL -> var14.uNnUnnuNUnNu() ? 0.01F : 0.021F;
         case INSET -> var14.uNnUnnuNUnNu() ? 0.007F : 0.013F;
      };
      int var28 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var24, NUunUunuNV.UuUVuuUu(var14.NVNnnvnuunNv(), 255), var26), var25);
      int var29 = var14.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(58, 70, 82, 255) : NUunUunuNV.UuUVuuUu(0, 0, 0, 255);
      int var30 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var24, var29, var27), var25);
      float var31 = var11 == nUvUnuNNNnUN.VUVvVuvuN.CARD && var12 ? 0.62F : 0.0F;
      float var32 = Math.max(var31, var12 ? var19 : 0.0F);
      if (var32 > 0.012F) {
         float var33 = var11 == nUvUnuNNNnUN.VUVvVuvuN.CARD ? 0.72F + var32 * 0.38F : 0.28F + var32 * 0.72F;
         var1.UuUVuuUu(
            var4,
            var5 + var13.UuUVuuUu(0.8F) * var32,
            var6,
            var7,
            var8,
            var13.UuUVuuUu(var11 == nUvUnuNNNnUN.VUVvVuvuN.CARD ? 5.2F : 4.2F) * var33,
            var13.UuUVuuUu(0.65F) * var33,
            var14.uNnUnnuNUnNu()
               ? NUunUunuNV.UuUVuuUu(52, 64, 76, Math.round((var11 == nUvUnuNNNnUN.VUVvVuvuN.CARD ? 15.0F : 18.0F) * var33))
               : NUunUunuNV.UuUVuuUu(0, 0, 0, Math.round((var11 == nUvUnuNNNnUN.VUVvVuvuN.CARD ? 34.0F : 40.0F) * var33))
         );
      }

      var1.UuUVuuUu(
         var4, var5, var6, var7, var8, var28, var30, var14.uVunuUNVVUUV(), var14.UNnVVNvvnVvU(), var22, var23, var15, Math.max(var16, var17), var17 > 0.001F, 6
      );
      int var37;
      if (var14.uNnUnnuNUnNu()) {
         var37 = nunvNNUnvU.C00OOC00oO(var14, var11 == nUvUnuNNNnUN.VUVvVuvuN.CARD ? 0.82F : (var11 == nUvUnuNNNnUN.VUVvVuvuN.WELL ? 0.62F : 0.72F));
      } else {
         switch (var11) {
            case WELL:
            case INSET:
               var37 = var14.vuuuNvNuv();
               break;
            case TILE:
               var37 = var14.nvUVNnuu();
               break;
            case CARD:
            case CONTROL:
               var37 = var14.UuuNnUvUuv();
               break;
            default:
               throw new MatchException(null, null);
         }
      }

      int var35 = var37;
      float var34 = var11 == nUvUnuNNNnUN.VUVvVuvuN.CARD ? var13.UuUVuuUu(0.65F) : var13.UuUVuuUu(0.55F);
      var1.UuUVuuUu(var4, var5, var6, var7, var8, var35, Math.max(0.5F, var34));
   }

   private int UuUVuuUu(NUunUunuNV var1, nUvUnuNNNnUN.VUVvVuvuN var2) {
      if (var1.uNnUnnuNUnNu()) {
         int var3 = nunvNNUnvU.UuUVuuUu(var1, 0.0F);

         return switch (var2) {
            case WELL -> NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var3, NUunUunuNV.UuUVuuUu(var1.VVuuUN(), 255), 0.34F), 228);
            case TILE -> NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var3, NUunUunuNV.UuUVuuUu(var1.VVuuUN(), 255), 0.24F), 234);
            case CARD -> NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var3, NUunUunuNV.UuUVuuUu(var1.VVuuUN(), 255), 0.08F), 242);
            case CONTROL -> NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var3, NUunUunuNV.UuUVuuUu(var1.VVuuUN(), 255), 0.15F), 238);
            case INSET -> NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var3, NUunUunuNV.UuUVuuUu(var1.VVuuUN(), 255), 0.48F), 232);
         };
      } else {
         return switch (var2) {
            case WELL -> NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var1.VVuuUN(), var1.nuUnNvnuUu(), 0.7F), 242);
            case TILE -> NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var1.VVuuUN(), var1.nuUnNvnuUu(), 0.46F), 244);
            case CARD -> NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var1.VVuuUN(), var1.nuUnNvnuUu(), 0.16F), 248);
            case CONTROL -> NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var1.VVuuUN(), var1.nuUnNvnuUu(), 0.28F), 246);
            case INSET -> NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var1.VVuuUN(), var1.nuUnNvnuUu(), 0.74F), 244);
         };
      }
   }

   private void UuUVuuUu(String var1, vNvvVnNuUVvv var2) {
      this.VuunNUUUvu = var1;
      this.NNUUNUuVNNVn = System.currentTimeMillis();
      this.VvVvnNUnvuvV = var2.unnUnUNVnN();
      this.ccOO0COcoco0 = var2.NnuUnUNnu();
   }

   private float UuUVuuUu(String var1) {
      if (var1 != null && this.VuunNUUUvu != null && this.VuunNUUUvu.equals(var1) && this.NNUUNUuVNNVn > 0L) {
         float var2 = (float)(System.currentTimeMillis() - this.NNUUNUuVNNVn) / 260.0F;
         if (var2 >= 1.0F) {
            this.VuunNUUUvu = null;
            this.NNUUNUuVNNVn = 0L;
            return 0.0F;
         } else {
            return this.C00OOC00oO(var2, 0.0F, 1.0F);
         }
      } else {
         return 0.0F;
      }
   }

   private nUvUnuNNNnUN.vUvuUvvVvvnN UuUVuuUu(nUVnuvUu var1, String var2, float var3, float var4, float var5, int var6) {
      String var7 = var2 == null ? "" : var2.trim();
      float var8 = Math.max(4.5F, var4 * 0.55F);

      for (float var9 = var3; var9 >= var8; var9 -= 0.5F) {
         List var10 = this.UuUVuuUu(var1, var7, var9, var5);
         if (var10.size() <= var6) {
            return new nUvUnuNNNnUN.vUvuUvvVvvnN(var10, var9);
         }
      }

      List var15 = this.UuUVuuUu(var1, var7, var8, var5);
      if (var15.size() <= var6) {
         return new nUvUnuNNNnUN.vUvuUvvVvvnN(var15, var8);
      } else {
         ArrayList var16 = new ArrayList(var6);

         for (int var11 = 0; var11 < var6; var11++) {
            int var12 = var11 * var15.size() / var6;
            int var13 = (var11 + 1) * var15.size() / var6;
            var16.add(String.join(" ", var15.subList(var12, var13)));
         }

         float var17 = var8;

         for (String var19 : var16) {
            float var14 = nunvNNUnvU.UuUVuuUu(var1, var19, var8);
            if (var14 > var5) {
               var17 = Math.min(var17, var8 * var5 / var14);
            }
         }

         return new nUvUnuNNNnUN.vUvuUvvVvvnN(var16, Math.max(1.5F, var17));
      }
   }

   private List<String> UuUVuuUu(nUVnuvUu var1, String var2, float var3, float var4) {
      ArrayList var5 = new ArrayList();
      if (var2.isEmpty()) {
         return var5;
      } else {
         StringBuilder var6 = new StringBuilder();

         for (String var10 : var2.split("\\s+")) {
            if (!var10.isEmpty()) {
               if (var6.isEmpty()) {
                  this.UuUVuuUu(var5, var6, var1, var10, var3, var4);
               } else {
                  String var11 = var6 + " " + var10;
                  if (nunvNNUnvU.UuUVuuUu(var1, var11, var3) <= var4) {
                     var6.append(' ').append(var10);
                  } else {
                     var5.add(var6.toString());
                     var6.setLength(0);
                     this.UuUVuuUu(var5, var6, var1, var10, var3, var4);
                  }
               }
            }
         }

         if (!var6.isEmpty()) {
            var5.add(var6.toString());
         }

         return var5;
      }
   }

   private void UuUVuuUu(List<String> var1, StringBuilder var2, nUVnuvUu var3, String var4, float var5, float var6) {
      if (nunvNNUnvU.UuUVuuUu(var3, var4, var5) <= var6) {
         var2.append(var4);
      } else {
         int var7 = 0;

         while (var7 < var4.length()) {
            int var8 = var4.codePointAt(var7);
            Object var9 = new String(Character.toChars(var8));
            if (!var2.isEmpty() && nunvNNUnvU.UuUVuuUu(var3, var2 + var9, var5) > var6) {
               var1.add(var2.toString());
               var2.setLength(0);
            }

            var2.append((String)var9);
            var7 += Character.charCount(var8);
         }
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1, nUvnuVnNUU var2, nUVnuvUu var3, nUvUnuNNNnUN.vUvuUvvVvvnN var4, float var5, float var6, float var7, int var8, boolean var9, float var10
   ) {
      for (int var11 = 0; var11 < var4.lines().size(); var11++) {
         String var12 = var4.lines().get(var11);
         float var13 = var9 ? var5 + (var10 - nunvNNUnvU.UuUVuuUu(var3, var12, var4.size())) * 0.5F : var5;
         nunvNNUnvU.UuUVuuUu(var1, var2, var3, var13, var6 + var7 * var11, var7, var4.size(), var12, var8);
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvUnuNNNnUN.nUNvUnnVN var2, boolean var3, float var4, nUvnuVnNUU var5, NUunUunuNV var6) {
      if (var2.visible()) {
         nunvNNUnvU.C00OOC00oO(var1, var5, var6, var2.x(), var2.y(), var2.w(), var2.h(), var2.thumbY(), var2.thumbH(), var4, var3 ? 1.0F : 0.0F);
      }
   }

   private void UuUVuuUu(List<NVUVNNunvvNN> var1, AutoBuy var2, nUvUnuNNNnUN.uunvUUVnuNn var3, nUvnuVnNUU var4) {
      nUvUnuNNNnUN.nUVVnVNu var5 = this.UuUVuuUu(var3, var4);
      float var6 = var5.stripH();
      float var7 = var5.modeX();
      float var8 = var5.toggleW();
      float var9 = var5.toggleX();
      float var10 = var5.gap();
      float var11 = var5.tabBtnSize();
      float var12 = var5.chipW();
      float var13 = var7;

      for (String var17 : VVuuUN) {
         var1.add(NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(0).UuUVuuUu(var13).C00OOC00oO(var3.y()).uUnuvNvvNU(var12).vVvUvVVuuNvV(var6).UuUVuuUu(var3x -> {
            this.UuUVuuUu("mode:" + var17, var3x);
            var2.NnUuNNU.uNNnnnuuuN = var17;
            var2.NnUuNNU.vNUvnnVnUvu = var2.NnUuNNU.vVvUvVVuuNvV.indexOf(var17);
            this.C00OOC00oO(this.UvnvNVnnnnNU, 0.0F);
            var3x.uVUuuVnNVU(false);
            var3x.uUVvnUuNvvN();
         }).UuUVuuUu());
         var13 += var12 + var10;
      }

      var1.add(NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(0).UuUVuuUu(var13).C00OOC00oO(var3.y()).uUnuvNvvNU(var11).vVvUvVVuuNvV(var11).UuUVuuUu(var1x -> {
         this.UuUVuuUu("tab:catalog_tab", var1x);
         this.vVVuuVVv = 0;
         var1x.uUVvnUuNvvN();
      }).UuUVuuUu());
      var13 += var11 + var10;
      var1.add(NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(0).UuUVuuUu(var13).C00OOC00oO(var3.y()).uUnuvNvvNU(var11).vVvUvVVuuNvV(var11).UuUVuuUu(var1x -> {
         this.UuUVuuUu("tab:history_tab", var1x);
         this.vVVuuVVv = 1;
         this.VVnVNnunVvu.vVvUvVVuuNvV(0.0);
         this.VVnVNnunVvu.C00OOC00oO();
         var1x.uUVvnUuNvvN();
      }).UuUVuuUu());
      var13 += var11 + var10;
      var1.add(NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(0).UuUVuuUu(var13).C00OOC00oO(var3.y()).uUnuvNvvNU(var11).vVvUvVVuuNvV(var11).UuUVuuUu(var1x -> {
         this.UuUVuuUu("tab:cloud_tab", var1x);
         this.vVVuuVVv = 2;
         var1x.uUVvnUuNvvN();
      }).UuUVuuUu());
      if (var5.showReparse()) {
         var1.add(
            NVUVNNunvvNN.UuUVuuUu()
               .UuUVuuUu(0)
               .UuUVuuUu(var5.reparseX())
               .C00OOC00oO(var3.y())
               .uUnuvNvvNU(var5.reparseToggleW())
               .vVvUvVVuuNvV(var6)
               .UuUVuuUu(var2x -> {
                  this.UuUVuuUu("reparse:toggle", var2x);
                  var2.uUVuVvuNUvnu.C00OOC00oO(!var2.uUVuVvuNUvnu.uUnuvNvvNU());
                  var2x.uVUuuVnNVU(false);
                  var2x.uUVvnUuNvvN();
               })
               .UuUVuuUu()
         );
         var1.add(
            NVUVNNunvvNN.UuUVuuUu()
               .UuUVuuUu(0)
               .UuUVuuUu(var5.reparseSliderX())
               .C00OOC00oO(var3.y())
               .uUnuvNvvNU(var5.reparseSliderW())
               .vVvUvVVuuNvV(var6)
               .UuUVuuUu(var4x -> {
                  this.UuUVuuUu("reparse:slider", var4x);
                  float var5x = var5.reparseSliderX() + var4.UuUVuuUu(8.0F);
                  float var6x = Math.max(var4.UuUVuuUu(28.0F), var5.reparseSliderW() - var4.UuUVuuUu(16.0F));
                  this.UuUVuuUu(var2, var4x.unnUnUNVnN(), var5x, var6x);
                  var4x.UuUVuuUu(var2.UvUvUNuvNU);
                  var4x.nnuUVNUuvvVU(var5x);
                  var4x.nVVUuvuNnUN(var6x);
                  var4x.uVUuuVnNVU(false);
                  var4x.uUVvnUuNvvN();
               })
               .UuUVuuUu()
         );
      }

      float var21 = var4.UuUVuuUu(4.0F);
      float var22 = (var8 - var21) * 0.5F;
      var1.add(NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(0).UuUVuuUu(var9).C00OOC00oO(var3.y()).uUnuvNvvNU(var22).vVvUvVVuuNvV(var6).UuUVuuUu(var2x -> {
         this.UuUVuuUu("toggle:inactive", var2x);
         if (var2.nuUnNvnuUu) {
            var2.a_();
         }

         var2x.uVUuuVnNVU(false);
         var2x.uUVvnUuNvvN();
      }).UuUVuuUu());
      var1.add(NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(0).UuUVuuUu(var9 + var22 + var21).C00OOC00oO(var3.y()).uUnuvNvvNU(var22).vVvUvVVuuNvV(var6).UuUVuuUu(var2x -> {
         this.UuUVuuUu("toggle:active", var2x);
         if (!var2.nuUnNvnuUu) {
            var2.a_();
         }

         var2x.uVUuuVnNVU(false);
         var2x.uUVvnUuNvvN();
      }).UuUVuuUu());
   }

   private void UuUVuuUu(List<NVUVNNunvvNN> var1, vNvvVnNuUVvv var2, AutoBuy var3, nUvUnuNNNnUN.uunvUUVnuNn var4, nUvnuVnNUU var5) {
      this.UuUVuuUu(var1, var4, var5);
      List var6 = this.C00OOC00oO(var3, this.NVUunUNUN.uNNnnnuuuN);
      nUvUnuNNNnUN.nUNvUnnVN var7 = this.UuUVuuUu(
         var4.catalogScrollbarX(),
         var4.catalogViewportY(),
         var4.scrollbarW(),
         var4.catalogViewportH(),
         this.UuUVuuUu(var3, var4, var5),
         this.UvnvNVnnnnNU.vNUvnnVnUvu(),
         var5
      );
      float var8 = this.UvnvNVnnnnNU.vNUvnnVnUvu();
      int var9 = this.nuUnNvnuUu(var4, var5);
      float var10 = this.UuUVuuUu(var5);
      float var11 = this.C00OOC00oO(var5);
      float var12 = this.uUnuvNvvNU(var5);
      int var13 = Math.max(1, (var6.size() + var9 - 1) / var9);
      int var14 = Math.max(0, (int)Math.floor(-var8 / (var11 + var12)) - 1);
      int var15 = Math.min(var13, (int)Math.ceil((var4.catalogViewportH() - var8) / (var11 + var12)) + 1);

      for (int var16 = var14; var16 < var15; var16++) {
         for (int var17 = 0; var17 < var9; var17++) {
            int var18 = var16 * var9 + var17;
            if (var18 >= var6.size()) {
               break;
            }

            nUvUnuNNNnUN.NVnVnNnN var19 = (nUvUnuNNNnUN.NVnVnNnN)var6.get(var18);
            float var20 = var4.catalogViewportX() + var17 * (var10 + var12);
            float var21 = var4.catalogViewportY() + var8 + var16 * (var11 + var12);
            if (!(var21 > var4.catalogViewportY() + var4.catalogViewportH()) && !(var21 + var11 < var4.catalogViewportY())) {
               float var22 = var2.UuUVuuUu(vnvnUnVnuunn.UuUVuuUu(var19.key()));
               if (!(var22 < 0.98F)) {
                  var1.add(NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(0).UuUVuuUu(var20).C00OOC00oO(var21).uUnuvNvvNU(var10).vVvUvVVuuNvV(var11).UuUVuuUu(var2x -> {
                     boolean var3x = !AutoBuy.UuNnnVnuNNV.containsKey(var19.key());
                     this.UuUVuuUu("catalog:" + var19.key(), var2x);
                     AutoBuy.UuNnnVnuNNV.putIfAbsent(var19.key(), 0L);
                     AutoBuy.vNnNuuvVn.remove(var19.key());
                     if (var3x) {
                        var2x.VUuuVUnun().remove(vnvnUnVnuunn.C00OOC00oO(var19.key()));
                     }

                     var2x.uVUuuVnNVU(false);
                     var2x.UuUVuuUu(this.vNUvnnVnUvu(var19.key()));
                     var2x.uUVvnUuNvvN();
                  }).UuUVuuUu());
                  var1.add(
                     NVUVNNunvvNN.UuUVuuUu()
                        .UuUVuuUu(1)
                        .UuUVuuUu(var20)
                        .C00OOC00oO(var21)
                        .uUnuvNvvNU(var10)
                        .vVvUvVVuuNvV(var11)
                        .uNNnnnuuuN(var4.catalogViewportX())
                        .nuUnNvnuUu(var4.catalogViewportY())
                        .VVuuUN(var4.catalogViewportW())
                        .vNUvnnVnUvu(var4.catalogViewportH())
                        .UuUVuuUu(var2x -> {
                           this.UuUVuuUu("catalog:" + var19.key(), var2x);
                           this.C00OOC00oO(var19.key(), var2x);
                        })
                        .UuUVuuUu()
                  );
               }
            }
         }
      }

      this.UuUVuuUu(var1, "catalog", var7, var5);
   }

   private void UuUVuuUu(List<NVUVNNunvvNN> var1, nUvUnuNNNnUN.uunvUUVnuNn var2, nUvnuVnNUU var3) {
      float var4 = this.VVuuUN(var2, var3);
      float var5 = this.vNUvnnVnUvu(var2, var3);
      float var6 = this.uVUuuVnNVU(var2, var3);
      float var7 = this.vVvUvVVuuNvV(var3);
      if (this.NVUunUNUN.uNNnnnuuuN != null && !this.NVUunUNUN.uNNnnnuuuN.isEmpty()) {
         var1.add(
            NVUVNNunvvNN.UuUVuuUu()
               .UuUVuuUu(0)
               .UuUVuuUu(var4 + var6 - var3.UuUVuuUu(34.0F))
               .C00OOC00oO(var5)
               .uUnuvNvvNU(var3.UuUVuuUu(34.0F))
               .vVvUvVVuuNvV(var7)
               .UuUVuuUu(var1x -> {
                  this.NVUunUNUN.uNNnnnuuuN = "";
                  var1x.UuUVuuUu(null);
                  this.uUnuvNvvNU();
               })
               .UuUVuuUu()
         );
      }

      var1.add(NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(0).UuUVuuUu(var4).C00OOC00oO(var5).uUnuvNvvNU(var6).vVvUvVVuuNvV(var7).UuUVuuUu(var1x -> {
         var1x.uVUuuVnNVU(false);
         var1x.UuUVuuUu(this.NVUunUNUN);
      }).UuUVuuUu());
   }

   private void UuUVuuUu(List<NVUVNNunvvNN> var1, vNvvVnNuUVvv var2, nUvUnuNNNnUN.uunvUUVnuNn var3, nUvnuVnNUU var4) {
      this.C00OOC00oO(var1, var3, var4);
      List var5 = this.C00OOC00oO();
      nUvUnuNNNnUN.nUNvUnnVN var6 = this.UuUVuuUu(
         var3.rulesScrollbarX(),
         var3.rulesViewportY(),
         var3.scrollbarW(),
         var3.rulesViewportH(),
         this.uUnuvNvvNU(var3, var4),
         this.uVUVnuvnuVuv.vNUvnnVnUvu(),
         var4
      );
      float var7 = this.uVUVnuvnuVuv.vNUvnnVnUvu();
      float var8 = this.uNNnnnuuuN(var4);
      float var9 = this.nuUnNvnuUu(var4);
      float var10 = var4.UuUVuuUu(6.0F);
      float var11 = var3.rulesViewportX() + var10;
      float var12 = var3.rulesViewportW() - var10 * 2.0F;
      float var13 = var3.rulesViewportY() + var7;

      for (int var14 = 0; var14 < var5.size(); var14++) {
         String var15 = (String)var5.get(var14);
         float var16 = this.C00OOC00oO(var2, var15);
         float var17 = this.UuUVuuUu(var15, var4, var16);
         if (!(var13 > var3.rulesViewportY() + var3.rulesViewportH()) && !(var13 + var17 < var3.rulesViewportY())) {
            float var18 = var2.UuUVuuUu(vnvnUnVnuunn.C00OOC00oO(var15));
            if (var18 < 0.98F) {
               var13 += var17 + var9;
            } else {
               boolean var19 = this.VVuuUN(var15);
               nUvUnuNNNnUN.VUUnVnVNNU var20 = this.UuUVuuUu(var11, var13, var12, var8, var19, var4);
               var1.add(
                  NVUVNNunvvNN.UuUVuuUu()
                     .UuUVuuUu(0)
                     .UuUVuuUu(var20.deleteX())
                     .C00OOC00oO(var20.controlY())
                     .uUnuvNvvNU(var20.deleteW())
                     .vVvUvVVuuNvV(var20.controlH())
                     .UuUVuuUu(var2x -> {
                        this.UuUVuuUu("delete:" + var15, var2x);
                        this.C00OOC00oO(var15, var2x);
                     })
                     .UuUVuuUu()
               );
               if (var19) {
                  var1.add(
                     NVUVNNunvvNN.UuUVuuUu()
                        .UuUVuuUu(0)
                        .UuUVuuUu(var20.settingsX())
                        .C00OOC00oO(var20.controlY())
                        .uUnuvNvvNU(var20.settingsW())
                        .vVvUvVVuuNvV(var20.controlH())
                        .UuUVuuUu(var2x -> {
                           this.UuUVuuUu("settings:" + var15, var2x);
                           this.vuvnUnVnUNnV = var15.equals(this.vuvnUnVnUNnV) ? null : var15;
                           var2x.uVUuuVnNVU(false);
                           if (!var15.equals(this.VVuuUN(var2x))) {
                              var2x.UuUVuuUu(null);
                           }
                        })
                        .UuUVuuUu()
                  );
               }

               var1.add(
                  NVUVNNunvvNN.UuUVuuUu()
                     .UuUVuuUu(0)
                     .UuUVuuUu(var20.statusX())
                     .C00OOC00oO(var20.controlY())
                     .uUnuvNvvNU(var20.statusW())
                     .vVvUvVVuuNvV(var20.controlH())
                     .UuUVuuUu(var2x -> {
                        this.UuUVuuUu("status:" + var15, var2x);
                        if (AutoBuy.vNnNuuvVn.contains(var15)) {
                           AutoBuy.vNnNuuvVn.remove(var15);
                        } else {
                           AutoBuy.vNnNuuvVn.add(var15);
                        }

                        var2x.uVUuuVnNVU(false);
                        var2x.uUVvnUuNvvN();
                     })
                     .UuUVuuUu()
               );
               var1.add(
                  NVUVNNunvvNN.UuUVuuUu()
                     .UuUVuuUu(0)
                     .UuUVuuUu(var20.priceX())
                     .C00OOC00oO(var20.controlY())
                     .uUnuvNvvNU(var20.priceW())
                     .vVvUvVVuuNvV(var20.controlH())
                     .UuUVuuUu(var2x -> {
                        this.UuUVuuUu("price:" + var15, var2x);
                        var2x.uVUuuVnNVU(false);
                        var2x.UuUVuuUu(this.vNUvnnVnUvu(var15));
                     })
                     .UuUVuuUu()
               );
               if (var15.equals(this.vuvnUnVnUNnV) && this.VVuuUN(var15) && var16 > 0.95F) {
                  this.UuUVuuUu(var1, var15, var11, var13 + var8 + var4.UuUVuuUu(6.0F) * var16, var12, this.UuUVuuUu(var15, var4) * var16, var4);
               }

               var13 += var17 + var9;
            }
         } else {
            var13 += var17 + var9;
         }
      }

      this.UuUVuuUu(var1, "rules", var6, var4);
   }

   private void UuUVuuUu(List<NVUVNNunvvNN> var1, String var2, float var3, float var4, float var5, float var6, nUvnuVnNUU var7) {
      float var8 = var3 + var7.UuUVuuUu(16.0F);
      float var9 = var4 + var7.UuUVuuUu(58.0F);
      float var10 = var5 - var7.UuUVuuUu(32.0F);
      var1.add(
         NVUVNNunvvNN.UuUVuuUu()
            .UuUVuuUu(0)
            .UuUVuuUu(var8 - var7.UuUVuuUu(6.0F))
            .C00OOC00oO(var9 + var7.UuUVuuUu(12.0F))
            .uUnuvNvvNU(var10 + var7.UuUVuuUu(12.0F))
            .vVvUvVVuuNvV(var7.UuUVuuUu(24.0F))
            .UuUVuuUu(var4x -> {
               this.UuUVuuUu("durability:" + var2, var4x);
               this.UuUVuuUu(var2, var4x.unnUnUNVnN(), var8, var10);
               this.UuUVuuUu(var2, var4x.unnUnUNVnN(), var4x);
            })
            .UuUVuuUu()
      );
      nUvUnuNNNnUN.nvUnvV var11 = this.uUnuvNvvNU(var2);
      float var12 = var4 + var7.UuUVuuUu(128.0F);
      float var13 = (var5 - var7.UuUVuuUu(40.0F)) * 0.5F;
      float var14 = var7.UuUVuuUu(8.0F);
      float var15 = var7.UuUVuuUu(22.0F);

      for (int var16 = 0; var16 < var11.enchantments().size(); var16++) {
         nUvUnuNNNnUN.VvunVVUvUNnv var17 = var11.enchantments().get(var16);
         this.UuUVuuUu(
            var1, var2, var17.key(), var3 + var7.UuUVuuUu(16.0F) + var16 % 2 * (var13 + var14), var12 + var16 / 2 * (var15 + var7.UuUVuuUu(4.0F)), var13, var15
         );
      }
   }

   private void C00OOC00oO(List<NVUVNNunvvNN> var1, nUvUnuNNNnUN.uunvUUVnuNn var2, nUvnuVnNUU var3) {
      AutoBuy var4 = AutoBuy.NVNnnvnuunNv;
      if (var4 != null) {
         nUvUnuNNNnUN.VUnuUnnuNvVu var5 = this.C00OOC00oO(var2, var3);
         if (var5.visible()) {
            var1.add(
               NVUVNNunvvNN.UuUVuuUu()
                  .UuUVuuUu(0)
                  .UuUVuuUu(var5.chipX())
                  .C00OOC00oO(var5.chipY())
                  .uUnuvNvvNU(var5.chipW())
                  .vVvUvVVuuNvV(var5.chipH())
                  .UuUVuuUu(var1x -> {
                     var4.NVUunUNUN.C00OOC00oO(!var4.NVUunUNUN.uUnuvNvvNU());
                     var1x.uVUuuVnNVU(false);
                     var1x.uUVvnUuNvvN();
                  })
                  .UuUVuuUu()
            );
            var1.add(
               NVUVNNunvvNN.UuUVuuUu()
                  .UuUVuuUu(0)
                  .UuUVuuUu(var5.fixX())
                  .C00OOC00oO(var5.chipY())
                  .uUnuvNvvNU(var5.fixW())
                  .vVvUvVVuuNvV(var5.chipH())
                  .UuUVuuUu(var1x -> {
                     var4.UUVNuUNUvUnV.C00OOC00oO(!var4.UUVNuUNUvUnV.uUnuvNvvNU());
                     var1x.uVUuuVnNVU(false);
                     var1x.uUVvnUuNvvN();
                  })
                  .UuUVuuUu()
            );
            var1.add(
               NVUVNNunvvNN.UuUVuuUu()
                  .UuUVuuUu(0)
                  .UuUVuuUu(var5.statX())
                  .C00OOC00oO(var5.chipY())
                  .uUnuvNvvNU(var5.statW())
                  .vVvUvVVuuNvV(var5.chipH())
                  .UuUVuuUu(var1x -> {
                     var4.vuvnUnVnUNnV.C00OOC00oO(!var4.vuvnUnVnUNnV.uUnuvNvvNU());
                     var1x.uVUuuVnNVU(false);
                     var1x.uUVvnUuNvvN();
                  })
                  .UuUVuuUu()
            );
         }
      }
   }

   private void UuUVuuUu(List<NVUVNNunvvNN> var1, String var2, String var3, float var4, float var5, float var6, float var7) {
      var1.add(NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(0).UuUVuuUu(var4).C00OOC00oO(var5).uUnuvNvvNU(var6).vVvUvVVuuNvV(var7).UuUVuuUu(var3x -> {
         this.UuUVuuUu("check:" + var2 + ":" + var3, var3x);
         AutoBuy.UuUVuuUu(var2, var3, !AutoBuy.C00OOC00oO(var2, var3));
         var3x.uVUuuVnNVU(false);
         var3x.uUVvnUuNvvN();
      }).UuUVuuUu());
   }

   private void UuUVuuUu(String var1, float var2, float var3, float var4) {
      int var5 = AutoBuy.uVUuuVnNVU(var1);
      int var6 = AutoBuy.vuuuNvNuv(var1);
      float var7 = var3 + var4 * var5 / 100.0F;
      float var8 = var3 + var4 * var6 / 100.0F;
      this.nnuUVNUuvvVU = var1;
      this.nVVUuvuNnUN = Math.abs(var2 - var8) < Math.abs(var2 - var7);
      this.nNnVnUNVV = var3;
      this.nuunNvv = Math.max(1.0F, var4);
   }

   private void UuUVuuUu(String var1, float var2, vNvvVnNuUVvv var3) {
      int var4 = (int)UuvVnuU.uUnuvNvvNU((double)(this.C00OOC00oO((var2 - this.nNnVnUNVV) / this.nuunNvv, 0.0F, 1.0F) * 100.0F), 0);
      int var5 = AutoBuy.uVUuuVnNVU(var1);
      int var6 = AutoBuy.vuuuNvNuv(var1);
      if (this.nVVUuvuNnUN) {
         var6 = Math.max(var5, var4);
      } else {
         var5 = Math.min(var6, var4);
      }

      AutoBuy.UuUVuuUu(var1, var5, var6);
      var3.uVUuuVnNVU(false);
      var3.uUVvnUuNvvN();
   }

   private void uUnuvNvvNU(List<NVUVNNunvvNN> var1, nUvUnuNNNnUN.uunvUUVnuNn var2, nUvnuVnNUU var3) {
      float var4 = this.vVvUvVVuuNvV(var2, var3);
      float var5 = var3.UuUVuuUu(42.0F);
      nUvUnuNNNnUN.nUNvUnnVN var6 = this.UuUVuuUu(
         var2.x() + var2.width() - var3.UuUVuuUu(10.0F),
         var2.panelY() + var5,
         var2.scrollbarW(),
         var2.panelH() - var5 - var3.UuUVuuUu(10.0F),
         var4,
         this.NVNnnvnuunNv.vNUvnnVnUvu(),
         var3
      );
      this.UuUVuuUu(var1, "history", var6, var3);
      float var7 = var2.panelY() + var3.UuUVuuUu(14.0F);
      float var8 = var3.UuUVuuUu(64.0F);
      float var9 = var3.UuUVuuUu(20.0F);
      float var10 = var2.x() + var2.width() - var3.UuUVuuUu(16.0F) - var8;
      var1.add(NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(0).UuUVuuUu(var10).C00OOC00oO(var7).uUnuvNvvNU(var8).vVvUvVVuuNvV(var9).UuUVuuUu(var0 -> {
         AutoBuy.vVVuuVVv.clear();
         var0.uUVvnUuNvvN();
      }).UuUVuuUu());
      float var11 = var3.UuUVuuUu(42.0F);
      float var12 = var3.UuUVuuUu(6.0F);
      float var13 = var2.x() + var3.UuUVuuUu(16.0F);
      float var14 = var2.panelY() + var5;
      float var15 = var2.width() - var3.UuUVuuUu(20.0F) - var2.scrollbarW();
      float var16 = var2.panelH() - var5 - var3.UuUVuuUu(10.0F);
      float var17 = this.NVNnnvnuunNv.vNUvnnVnUvu();
      float var18 = var15 - var3.UuUVuuUu(36.0F);

      for (int var19 = 0; var19 < AutoBuy.vVVuuVVv.size(); var19++) {
         float var20 = var14 + var17 + var19 * (var11 + var12);
         if (!(var20 > var14 + var16) && !(var20 + var11 < var14)) {
            float var21 = var3.UuUVuuUu(26.0F);
            float var22 = var13 + var18 + var3.UuUVuuUu(6.0F);
            int var23 = var19;
            var1.add(
               NVUVNNunvvNN.UuUVuuUu()
                  .UuUVuuUu(0)
                  .UuUVuuUu(var22)
                  .C00OOC00oO(var20 + (var11 - var21) * 0.5F)
                  .uUnuvNvvNU(var21)
                  .vVvUvVVuuNvV(var21)
                  .UuUVuuUu(var1x -> {
                     if (var23 < AutoBuy.vVVuuVVv.size()) {
                        AutoBuy.vVVuuVVv.remove(var23);
                        var1x.uUVvnUuNvvN();
                     }
                  })
                  .UuUVuuUu()
            );
         }
      }
   }

   private void C00OOC00oO(List<NVUVNNunvvNN> var1, AutoBuy var2, nUvUnuNNNnUN.uunvUUVnuNn var3, nUvnuVnNUU var4) {
      float var5 = this.uNNnnnuuuN(var3, var4);
      float var6 = var4.UuUVuuUu(62.0F);
      nUvUnuNNNnUN.nUNvUnnVN var7 = this.UuUVuuUu(
         var3.x() + var3.width() - var4.UuUVuuUu(10.0F),
         var3.panelY() + var6,
         var3.scrollbarW(),
         var3.panelH() - var6 - var4.UuUVuuUu(10.0F),
         var5,
         this.uVunuUNVVUUV.vNUvnnVnUvu(),
         var4
      );
      this.UuUVuuUu(var1, "cloud", var7, var4);
      float var8 = var3.panelY() + var4.UuUVuuUu(14.0F);
      float var9 = var4.UuUVuuUu(28.0F);
      float var10 = var4.UuUVuuUu(8.0F);
      float var11 = var3.x() + var3.width() - var4.UuUVuuUu(16.0F) - var9;
      var1.add(NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(0).UuUVuuUu(var11).C00OOC00oO(var8).uUnuvNvvNU(var9).vVvUvVVuuNvV(var9).UuUVuuUu(var1x -> {
         try {
            File var2x = var2.uVunuUNVVUUV();
            String var3x = System.getProperty("os.name").toLowerCase();
            if (var3x.contains("win")) {
               Runtime.getRuntime().exec(new String[]{"explorer", var2x.getAbsolutePath()});
            } else if (var3x.contains("mac")) {
               Runtime.getRuntime().exec(new String[]{"open", var2x.getAbsolutePath()});
            } else {
               Runtime.getRuntime().exec(new String[]{"xdg-open", var2x.getAbsolutePath()});
            }
         } catch (Exception var4x) {
         }
      }).UuUVuuUu());
      var11 -= var9 + var10;
      var1.add(
         NVUVNNunvvNN.UuUVuuUu()
            .UuUVuuUu(0)
            .UuUVuuUu(var11)
            .C00OOC00oO(var8)
            .uUnuvNvvNU(var9)
            .vVvUvVVuuNvV(var9)
            .UuUVuuUu(var2x -> this.UuUVuuUu(var2))
            .UuUVuuUu()
      );
      var11 -= var9 + var10;
      var1.add(NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(0).UuUVuuUu(var11).C00OOC00oO(var8).uUnuvNvvNU(var9).vVvUvVVuuNvV(var9).UuUVuuUu(var2x -> {
         String var3x = "Default";
         String var4x = var3x;
         int var5x = 1;

         for (File var6x = var2.uVunuUNVVUUV(); new File(var6x, var4x + ".json").exists(); var5x++) {
            var4x = var3x + var5x;
         }

         var2.uNNnnnuuuN(var4x);
         this.UuuNnUvUuv = var4x;
         this.UuUVuuUu(var2);
      }).UuUVuuUu());
      float var12 = var4.UuUVuuUu(58.0F);
      float var13 = var4.UuUVuuUu(8.0F);
      float var14 = var3.x() + var4.UuUVuuUu(16.0F);
      float var15 = var3.panelY() + var6;
      float var16 = var3.width() - var4.UuUVuuUu(25.0F) - var3.scrollbarW();
      float var17 = var3.panelH() - var6 - var4.UuUVuuUu(10.0F);
      float var18 = this.uVunuUNVVUUV.vNUvnnVnUvu();
      float var19 = var16 - var4.UuUVuuUu(24.0F);

      for (int var20 = 0; var20 < this.nvUVNnuu.size(); var20++) {
         nUvUnuNNNnUN.nvnNNunvv var21 = this.nvUVNnuu.get(var20);
         float var22 = var15 + var18 + var20 * (var12 + var13);
         if (!(var22 > var15 + var17) && !(var22 + var12 < var15)) {
            float var23 = var4.UuUVuuUu(26.0F);
            float var24 = var4.UuUVuuUu(8.0F);
            float var25 = var14 + var19 - var4.UuUVuuUu(12.0F) - var23;
            var1.add(
               NVUVNNunvvNN.UuUVuuUu()
                  .UuUVuuUu(0)
                  .UuUVuuUu(var25)
                  .C00OOC00oO(var22 + (var12 - var23) * 0.5F)
                  .uUnuvNvvNU(var23)
                  .vVvUvVVuuNvV(var23)
                  .UuUVuuUu(var3x -> {
                     var2.VVuuUN(var21.name);
                     if (this.UuuNnUvUuv.equals(var21.name)) {
                        this.UuuNnUvUuv = "";
                     }

                     this.UuUVuuUu(var2);
                  })
                  .UuUVuuUu()
            );
            var25 -= var23 + var24;
            var1.add(
               NVUVNNunvvNN.UuUVuuUu()
                  .UuUVuuUu(0)
                  .UuUVuuUu(var25)
                  .C00OOC00oO(var22 + (var12 - var23) * 0.5F)
                  .uUnuvNvvNU(var23)
                  .vVvUvVVuuNvV(var23)
                  .UuUVuuUu(var3x -> {
                     var2.nuUnNvnuUu(var21.name);
                     this.UuuNnUvUuv = var21.name;
                  })
                  .UuUVuuUu()
            );
            float var26 = var22 + var4.UuUVuuUu(12.0F);
            float var27 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var21.name, 13.0F);
            var1.add(
               NVUVNNunvvNN.UuUVuuUu()
                  .UuUVuuUu(0)
                  .UuUVuuUu(var14 + var4.UuUVuuUu(12.0F))
                  .C00OOC00oO(var26 - var4.UuUVuuUu(4.0F))
                  .uUnuvNvvNU(var27 + var4.UuUVuuUu(24.0F))
                  .vVvUvVVuuNvV(var4.UuUVuuUu(18.0F))
                  .UuUVuuUu(var2x -> var2x.UuUVuuUu(this.UnUNVVVNuv.computeIfAbsent(var21.name, var0 -> new NVuVVUNUvV("Name", var0))))
                  .UuUVuuUu()
            );
         }
      }
   }

   private void UuUVuuUu(List<NVUVNNunvvNN> var1, String var2, nUvUnuNNNnUN.nUNvUnnVN var3, nUvnuVnNUU var4) {
      if (var3.visible()) {
         float var5 = var4.UuUVuuUu(5.0F);
         var1.add(
            NVUVNNunvvNN.UuUVuuUu()
               .UuUVuuUu(0)
               .UuUVuuUu(var3.x() - var5)
               .C00OOC00oO(var3.y())
               .uUnuvNvvNU(var3.w() + var5 * 2.0F)
               .vVvUvVVuuNvV(var3.h())
               .UuUVuuUu(var3x -> {
                  this.UuUVuuUu(var2, var3x.NnuUnUNnu(), var3);
                  var3x.uVUuuVnNVU(false);
                  if (!this.UuUVuuUu(var3x.NuUuUvUUvU()) && this.uNNnnnuuuN(var3x) == null) {
                     var3x.UuUVuuUu(null);
                  }
               })
               .UuUVuuUu()
         );
      }
   }

   private nUvUnuNNNnUN.nUNvUnnVN UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, nUvnuVnNUU var7) {
      if (!(var5 <= 0.5F) && !(var4 <= var7.UuUVuuUu(8.0F))) {
         float var8 = Math.max(var7.UuUVuuUu(34.0F), var4 * (var4 / (var4 + var5)));
         var8 = Math.min(var4, var8);
         float var9 = Math.max(0.0F, var4 - var8);
         float var10 = var5 <= 0.001F ? 0.0F : this.C00OOC00oO(-var6 / var5, 0.0F, 1.0F);
         float var11 = var2 + var9 * var10;
         return new nUvUnuNNNnUN.nUNvUnnVN(var1, var2, var3, var4, var5, var11, var8, true);
      } else {
         return nUvUnuNNNnUN.nUNvUnnVN.hidden(var1, var2, var3, var4);
      }
   }

   private void UuUVuuUu(String var1, float var2, nUvUnuNNNnUN.nUNvUnnVN var3) {
      if (var3.visible()) {
         this.UUuUnNVNuuv = "catalog".equals(var1);
         this.NVuNUuVnVUN = "rules".equals(var1);
         this.NVuunNnvvvVu = "history".equals(var1);
         this.vNnNuuvVn = "cloud".equals(var1);
         if (var2 >= var3.thumbY() && var2 <= var3.thumbY() + var3.thumbH()) {
            this.VUuuVUnun = var2 - var3.thumbY();
         } else {
            this.VUuuVUnun = var3.thumbH() * 0.5F;
         }

         this.C00OOC00oO(var1, var2, var3);
      }
   }

   private void C00OOC00oO(String var1, float var2, nUvUnuNNNnUN.nUNvUnnVN var3) {
      if (var3.visible()) {
         float var4 = var3.travel();
         float var5 = this.C00OOC00oO(var2 - this.VUuuVUnun, var3.y(), var3.y() + var4);
         float var6 = var4 <= 0.001F ? 0.0F : (var5 - var3.y()) / var4;
         float var7 = -var3.maxScroll() * var6;
         if ("catalog".equals(var1)) {
            this.C00OOC00oO(this.UvnvNVnnnnNU, var7);
         } else if ("rules".equals(var1)) {
            this.C00OOC00oO(this.uVUVnuvnuVuv, var7);
         } else if ("history".equals(var1)) {
            this.C00OOC00oO(this.NVNnnvnuunNv, var7);
         } else if ("cloud".equals(var1)) {
            this.C00OOC00oO(this.uVunuUNVVUUV, var7);
         }
      }
   }

   private nUvUnuNNNnUN.uunvUUVnuNn UuUVuuUu(VvvVunn var1, nUvnuVnNUU var2) {
      float var3 = var1.C00OOC00oO() + var2.UuUVuuUu(16.0F);
      float var4 = var2.UuUVuuUu(5.0F);
      float var5 = var1.uUnuvNvvNU() + var2.UvnvNVnnnnNU() + var2.UuUVuuUu(10.0F) + var4;
      float var6 = var1.vVvUvVVuuNvV() - var2.UuUVuuUu(32.0F);
      float var7 = Math.max(0.0F, var1.nuUnNvnuUu() - var2.UuUVuuUu(20.0F) - var4);
      float var8 = var2.UuUVuuUu(34.0F);
      float var9 = var2.UuUVuuUu(8.0F);
      float var10 = var5 + var8 + var9;
      float var11 = Math.max(var2.UuUVuuUu(80.0F), var7 - var8 - var9);
      float var12 = var2.UuUVuuUu(10.0F);
      float var13 = Math.min(var2.UuUVuuUu(300.0F), var6 * 0.44F);
      float var14 = Math.min(var2.UuUVuuUu(180.0F), var6 * 0.46F);
      float var15 = Math.min(var2.UuUVuuUu(220.0F), var6 * 0.46F);
      float var16 = Math.max(var2.UuUVuuUu(120.0F), var6 - var15 - var12);
      var13 = Math.max(var14, Math.min(var13, var16));
      if (var13 + var12 + var2.UuUVuuUu(120.0F) > var6) {
         var13 = Math.max(var2.UuUVuuUu(120.0F), var6 - var2.UuUVuuUu(120.0F) - var12);
      }

      float var17 = Math.max(var2.UuUVuuUu(120.0F), var6 - var13 - var12);
      float var18 = var3 + var13 + var12;
      float var19 = var2.UuUVuuUu(10.0F);
      float var20 = var2.UuUVuuUu(82.0F);
      float var21 = var2.UuUVuuUu(48.0F);
      float var22 = Math.max(var2.UuUVuuUu(5.5F), 4.0F);
      float var23 = var3 + var19;
      float var24 = var10 + var20;
      float var25 = Math.max(var2.UuUVuuUu(60.0F), var13 - var19 * 2.0F - var22 - var2.UuUVuuUu(5.0F));
      float var26 = Math.max(var2.UuUVuuUu(30.0F), var11 - var20 - var2.UuUVuuUu(12.0F));
      float var27 = var18 + var19;
      float var28 = var10 + var21;
      float var29 = Math.max(var2.UuUVuuUu(120.0F), var17 - var19 * 2.0F - var22 - var2.UuUVuuUu(5.0F));
      float var30 = Math.max(var2.UuUVuuUu(30.0F), var11 - var21 - var2.UuUVuuUu(12.0F));
      return new nUvUnuNNNnUN.uunvUUVnuNn(
         var3,
         var5,
         var6,
         var7,
         var3,
         var18,
         var13,
         var17,
         var10,
         var11,
         var23,
         var24,
         var25,
         var26,
         var23 + var25 + var2.UuUVuuUu(5.0F),
         var27,
         var28,
         var29,
         var30,
         var27 + var29 + var2.UuUVuuUu(5.0F),
         var22
      );
   }

   private List<nUvUnuNNNnUN.NVnVnNnN> C00OOC00oO(AutoBuy var1) {
      return this.C00OOC00oO(var1, "");
   }

   private List<nUvUnuNNNnUN.NVnVnNnN> C00OOC00oO(AutoBuy var1, String var2) {
      ArrayList var3 = new ArrayList();
      if (var1 != null && var1.NnUuNNU.C00OOC00oO("HolyWorld")) {
         for (vNnnVNUVU.nvUnvV var10 : vNnnVNUVU.UuUVuuUu()) {
            var3.add(new nUvUnuNNNnUN.NVnVnNnN(var10.key(), var10.label(), new class_1799(var10.item()), true));
         }
      } else {
         for (String var5 : uVUuuVnNVU) {
            var3.add(new nUvUnuNNNnUN.NVnVnNnN(var5, var5, this.vVvUvVVuuNvV(var5), true));
         }
      }

      var3.addAll(UuUVuuUu());
      String var9 = var2 == null ? "" : var2.trim().toLowerCase(Locale.ROOT);
      if (var9.isEmpty()) {
         return var3;
      } else {
         ArrayList var11 = new ArrayList();

         for (nUvUnuNNNnUN.NVnVnNnN var7 : var3) {
            if (var7.label().toLowerCase(Locale.ROOT).contains(var9) || var7.key().toLowerCase(Locale.ROOT).contains(var9)) {
               var11.add(var7);
            }
         }

         return var11;
      }
   }

   private static List<nUvUnuNNNnUN.NVnVnNnN> UuUVuuUu() {
      if (vuuuNvNuv != null) {
         return vuuuNvNuv;
      } else {
         ArrayList var0 = new ArrayList();

         for (class_1792 var2 : class_7923.field_41178) {
            if (var2 != class_1802.field_8162) {
               class_2960 var3 = class_7923.field_41178.method_10221(var2);
               if (var3 != null && "minecraft".equals(var3.method_12836())) {
                  class_1799 var4 = var2.method_7854();
                  var0.add(new nUvUnuNNNnUN.NVnVnNnN(var3.toString(), var4.method_7964().getString(), var4, false));
               }
            }
         }

         var0.sort(Comparator.comparing(nUvUnuNNNnUN.NVnVnNnN::label, String.CASE_INSENSITIVE_ORDER));
         vuuuNvNuv = List.copyOf(var0);
         return vuuuNvNuv;
      }
   }

   private nUvUnuNNNnUN.NVnVnNnN C00OOC00oO(String var1) {
      if (vNnnVNUVU.UuUVuuUu(var1)) {
         vNnnVNUVU.nvUnvV var5 = vNnnVNUVU.uUnuvNvvNU(var1);
         if (var5 != null) {
            class_1799 var6 = vNnnVNUVU.nuUnNvnuUu(var5.key());
            if (var6.method_7960()) {
               var6 = new class_1799(var5.item());
            }

            return new nUvUnuNNNnUN.NVnVnNnN(var5.key(), var5.label(), var6, true);
         } else {
            return new nUvUnuNNNnUN.NVnVnNnN(var1 == null ? "" : var1, var1 == null ? "" : var1, class_1799.field_8037, true);
         }
      } else if (uVUuuVnNVU.contains(var1)) {
         return new nUvUnuNNNnUN.NVnVnNnN(var1, var1, this.vVvUvVVuuNvV(var1), true);
      } else {
         if (var1 != null && var1.startsWith("minecraft:")) {
            class_2960 var2 = class_2960.method_12829(var1);
            if (var2 != null) {
               class_1792 var3 = (class_1792)class_7923.field_41178.method_63535(var2);
               if (var3 != class_1802.field_8162) {
                  class_1799 var4 = var3.method_7854();
                  return new nUvUnuNNNnUN.NVnVnNnN(var1, var4.method_7964().getString(), var4, false);
               }
            }
         }

         return new nUvUnuNNNnUN.NVnVnNnN(var1 == null ? "" : var1, var1 == null ? "" : var1, class_1799.field_8037, true);
      }
   }

   private nUvUnuNNNnUN.nvUnvV uUnuvNvvNU(String var1) {
      vNnnVNUVU.nvUnvV var2 = vNnnVNUVU.uUnuvNvvNU(var1);
      if (var2 != null) {
         ArrayList var7 = new ArrayList();

         for (String var5 : var2.enchantments()) {
            String var6 = vNnnVNUVU.uNNnnnuuuN(var5);
            if (!var6.isBlank()) {
               var7.add(new nUvUnuNNNnUN.VvunVVUvUNnv(var6, this.nuUnNvnuUu(var5)));
            }
         }

         return new nUvUnuNNNnUN.nvUnvV(var7);
      } else {
         class_1799 var3 = this.uNNnnnuuuN(var1);
         return !var3.method_7960() ? new nUvUnuNNNnUN.nvUnvV(this.UuUVuuUu(var3)) : new nUvUnuNNNnUN.nvUnvV(List.of());
      }
   }

   private class_1799 vVvUvVVuuNvV(String var1) {
      class_1799 var2 = this.uNNnnnuuuN(var1);
      if (!var2.method_7960()) {
         return var2;
      } else {
         class_1799 var3 = VnuunNV.UuUVuuUu(var1);
         return var3 == null ? class_1799.field_8037 : var3;
      }
   }

   private class_1799 uNNnnnuuuN(String var1) {
      if (var1 == null) {
         return class_1799.field_8037;
      } else {
         return switch (var1) {
            case "Шлем Крушителя" -> NnNVvVVn.UuUVuuUu();
            case "Нагрудник Крушителя" -> NnNVvVVn.C00OOC00oO();
            case "Поножи Крушителя" -> NnNVvVVn.uUnuvNvvNU();
            case "Ботинки Крушителя" -> NnNVvVVn.vVvUvVVuuNvV();
            case "Меч Крушителя" -> NnNVvVVn.uNNnnnuuuN();
            case "Кирка Крушителя" -> NnNVvVVn.nuUnNvnuUu();
            case "Арбалет Крушителя" -> NnNVvVVn.VVuuUN();
            case "Трезубец Крушителя" -> NnNVvVVn.vNUvnnVnUvu();
            case "Булава Крушителя" -> NnNVvVVn.uVUuuVnNVU();
            default -> class_1799.field_8037;
         };
      }
   }

   private List<nUvUnuNNNnUN.VvunVVUvUNnv> UuUVuuUu(class_1799 var1) {
      class_9304 var2 = (class_9304)var1.method_58694(class_9334.field_49633);
      if (var2 != null && !var2.method_57543()) {
         ArrayList var3 = new ArrayList();

         for (it.unimi.dsi.fastutil.objects.Object2IntMap.Entry var5 : var2.method_57539()) {
            String var6 = this.UuUVuuUu((class_6880<class_1887>)var5.getKey());
            if (!var6.isBlank()) {
               String var7 = var6 + ":" + var5.getIntValue();
               String var8 = vNnnVNUVU.uNNnnnuuuN(var7);
               if (!var8.isBlank()) {
                  var3.add(new nUvUnuNNNnUN.VvunVVUvUNnv(var8, this.nuUnNvnuUu(var7)));
               }
            }
         }

         return var3;
      } else {
         return List.of();
      }
   }

   private String UuUVuuUu(class_6880<class_1887> var1) {
      return var1.method_40230().map(var0 -> var0.method_29177().toString()).orElse("");
   }

   private String nuUnNvnuUu(String var1) {
      if (var1 != null && !var1.isBlank()) {
         String[] var2 = var1.split(":");
         String var3 = var2.length >= 2 ? var2[1] : var1.replace("minecraft:", "");
         String var4 = vNUvnnVnUvu.getOrDefault(var3, var3.replace('_', ' '));
         return var2.length >= 3 ? var4 + " " + var2[2] : var4;
      } else {
         return "";
      }
   }

   private boolean VVuuUN(String var1) {
      vNnnVNUVU.nvUnvV var2 = vNnnVNUVU.uUnuvNvvNU(var1);
      if (var2 != null) {
         return AutoBuy.UuUVuuUu(var2.item());
      } else {
         nUvUnuNNNnUN.NVnVnNnN var3 = this.C00OOC00oO(var1);
         return var3 != null && !var3.stack().method_7960() && AutoBuy.UuUVuuUu(var3.stack().method_7909());
      }
   }

   private List<String> C00OOC00oO() {
      return new ArrayList<>(AutoBuy.UuNnnVnuNNV.keySet());
   }

   private NVuVVUNUvV vNUvnnVnUvu(String var1) {
      return this.UUVNuUNUvUnV.computeIfAbsent(var1, var1x -> new NVuVVUNUvV("Макс. цена", this.uVUuuVnNVU(var1x)));
   }

   private String uVUuuVnNVU(String var1) {
      long var2 = AutoBuy.UuNnnVnuNNV.getOrDefault(var1, 0L);
      return var2 <= 0L ? "" : Long.toString(var2);
   }

   private void nuUnNvnuUu(vNvvVnNuUVvv var1) {
      this.UUVNuUNUvUnV.entrySet().removeIf(var1x -> !AutoBuy.UuNnnVnuNNV.containsKey(var1x.getKey()) && var1.NuUuUvUUvU() != var1x.getValue());
   }

   private boolean UuUVuuUu(NVuVVUNUvV var1) {
      return var1 != null && this.UUVNuUNUvUnV.containsValue(var1);
   }

   private String VVuuUN(vNvvVnNuUVvv var1) {
      NVuVVUNUvV var2 = var1.NuUuUvUUvU();
      if (var2 == null) {
         return null;
      } else {
         for (Entry var4 : this.UUVNuUNUvUnV.entrySet()) {
            if (var4.getValue() == var2) {
               return (String)var4.getKey();
            }
         }

         return null;
      }
   }

   private void UuUVuuUu(String var1, String var2, vNvvVnNuUVvv var3) {
      AutoBuy.UuNnnVnuNNV.put(var1, UNNNnNVnUnn.C00OOC00oO(var2));
      var3.uUVvnUuNvvN();
   }

   private long vuuuNvNuv(String var1) {
      return UNNNnNVnUnn.C00OOC00oO(var1);
   }

   private void C00OOC00oO(String var1, vNvvVnNuUVvv var2) {
      NVuVVUNUvV var3 = this.UUVNuUNUvUnV.remove(var1);
      if (var2.NuUuUvUUvU() == var3) {
         var2.UuUVuuUu(null);
      }

      if (var1 != null && var1.equals(this.vuvnUnVnUNnV)) {
         this.vuvnUnVnUNnV = null;
      }

      AutoBuy.UuNnnVnuNNV.remove(var1);
      AutoBuy.uUVvnUuNvvN.remove(var1);
      AutoBuy.UUuUnNVNuuv.remove(var1);
      AutoBuy.NVuNUuVnVUN.remove(var1);
      AutoBuy.vNnNuuvVn.remove(var1);
      AutoBuy.NVuunNnvvvVu.remove(var1);
      var2.uVUuuVnNVU(false);
      var2.uUVvnUuNvvN();
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      class_332 var2,
      nUvUnuNNNnUN.NVnVnNnN var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11
   ) {
      if (var3 != null && !(var7 < 0.05F)) {
         if (!(var4 + var6 <= var8) && !(var5 + var6 <= var9) && !(var4 >= var8 + var10) && !(var5 >= var9 + var11)) {
            class_1799 var12 = var3.custom() ? VnuunNV.UuUVuuUu(var3.key()) : var3.stack();
            if (var12 != null && !var12.method_7960()) {
               float var13 = var6 / 16.0F;
               float var14 = var7 < 0.95F ? var7 : Math.min(1.0F, 0.5F + 0.5F * var7);
               if (var14 >= 0.999F) {
                  NuNvVUuUUnun.UuUVuuUu(var1, var12, var4, var5, var13, 0, false, 0);
               } else {
                  float var15 = var4 + var6 * 0.5F;
                  float var16 = var5 + var6 * 0.5F;
                  var1.UuUVuuUu(var14, var15, var16);

                  try {
                     NuNvVUuUUnun.UuUVuuUu(var1, var12, var4, var5, var13, 0, false, 0);
                  } finally {
                     var1.uVUuuVnNVU();
                  }
               }
            }
         }
      }
   }

   private float UuUVuuUu(AutoBuy var1, nUvUnuNNNnUN.uunvUUVnuNn var2, nUvnuVnNUU var3) {
      int var4 = this.nuUnNvnuUu(var2, var3);
      int var5 = Math.max(1, (this.C00OOC00oO(var1, this.NVUunUNUN.uNNnnnuuuN).size() + var4 - 1) / var4);
      float var6 = var5 * this.C00OOC00oO(var3) + Math.max(0, var5 - 1) * this.uUnuvNvvNU(var3);
      return Math.max(0.0F, var6 - var2.catalogViewportH());
   }

   private float uUnuvNvvNU(nUvUnuNNNnUN.uunvUUVnuNn var1, nUvnuVnNUU var2) {
      return this.UuUVuuUu(var1, var2, null);
   }

   private float UuUVuuUu(nUvUnuNNNnUN.uunvUUVnuNn var1, nUvnuVnNUU var2, vNvvVnNuUVvv var3) {
      List var4 = this.C00OOC00oO();
      float var5 = 0.0F;

      for (int var6 = 0; var6 < var4.size(); var6++) {
         var5 += this.UuUVuuUu(
            (String)var4.get(var6), var2, var3 == null ? this.nvUVNnuu((String)var4.get(var6)) : this.C00OOC00oO(var3, (String)var4.get(var6))
         );
         if (var6 < var4.size() - 1) {
            var5 += this.nuUnNvnuUu(var2);
         }
      }

      return Math.max(0.0F, var5 - var1.rulesViewportH());
   }

   private float vVvUvVVuuNvV(nUvUnuNNNnUN.uunvUUVnuNn var1, nUvnuVnNUU var2) {
      float var3 = var2.UuUVuuUu(42.0F);
      float var4 = var2.UuUVuuUu(6.0F);
      float var5 = var2.UuUVuuUu(42.0F);
      float var6 = var1.panelH() - var5 - var2.UuUVuuUu(10.0F);
      float var7 = AutoBuy.vVVuuVVv.size() * var3 + Math.max(0, AutoBuy.vVVuuVVv.size() - 1) * var4;
      return Math.max(0.0F, var7 - var6);
   }

   private float uNNnnnuuuN(nUvUnuNNNnUN.uunvUUVnuNn var1, nUvnuVnNUU var2) {
      float var3 = var2.UuUVuuUu(58.0F);
      float var4 = var2.UuUVuuUu(8.0F);
      float var5 = var1.panelH() - var2.UuUVuuUu(72.0F);
      float var6 = this.nvUVNnuu.size() * var3 + Math.max(0, this.nvUVNnuu.size() - 1) * var4;
      return Math.max(0.0F, var6 - var5);
   }

   private int nuUnNvnuUu(nUvUnuNNNnUN.uunvUUVnuNn var1, nUvnuVnNUU var2) {
      float var3 = this.UuUVuuUu(var2);
      float var4 = this.uUnuvNvvNU(var2);
      return Math.max(1, (int)((var1.catalogViewportW() + var4) / (var3 + var4)));
   }

   private float UuUVuuUu(nUvnuVnNUU var1) {
      return var1.UuUVuuUu(72.0F);
   }

   private float C00OOC00oO(nUvnuVnNUU var1) {
      return var1.UuUVuuUu(86.0F);
   }

   private float uUnuvNvvNU(nUvnuVnNUU var1) {
      return var1.UuUVuuUu(8.0F);
   }

   private float VVuuUN(nUvUnuNNNnUN.uunvUUVnuNn var1, nUvnuVnNUU var2) {
      return var1.leftX() + var2.UuUVuuUu(10.0F);
   }

   private float vNUvnnVnUvu(nUvUnuNNNnUN.uunvUUVnuNn var1, nUvnuVnNUU var2) {
      return var1.panelY() + var2.UuUVuuUu(45.0F);
   }

   private float uVUuuVnNVU(nUvUnuNNNnUN.uunvUUVnuNn var1, nUvnuVnNUU var2) {
      return Math.max(var2.UuUVuuUu(80.0F), var1.leftW() - var2.UuUVuuUu(20.0F));
   }

   private float vVvUvVVuuNvV(nUvnuVnNUU var1) {
      return var1.UuUVuuUu(27.0F);
   }

   private void uUnuvNvvNU() {
      this.C00OOC00oO(this.UvnvNVnnnnNU, 0.0F);
   }

   private void vVvUvVVuuNvV() {
      this.C00OOC00oO(this.UvnvNVnnnnNU, 0.0F);
      this.C00OOC00oO(this.uVUVnuvnuVuv, 0.0F);
      this.C00OOC00oO(this.NVNnnvnuunNv, 0.0F);
      this.C00OOC00oO(this.uVunuUNVVUUV, 0.0F);
      this.uUVVvVVNvvn = nUvUnuNNNnUN.nUNvUnnVN.hidden();
      this.vvUVNVvvNUv = nUvUnuNNNnUN.nUNvUnnVN.hidden();
      this.UuNnnVnuNNV = nUvUnuNNNnUN.nUNvUnnVN.hidden();
      this.uUVvnUuNvvN = nUvUnuNNNnUN.nUNvUnnVN.hidden();
      this.UUuUnNVNuuv = false;
      this.NVuNUuVnVUN = false;
      this.NVuunNnvvvVu = false;
      this.vNnNuuvVn = false;
      this.VUuuVUnun = 0.0F;
      this.UUVNuUNUvUnV.clear();
      this.vuvnUnVnUNnV = null;
      this.nnuUVNUuvvVU = null;
      this.UnUNVVVNuv.clear();
      this.vNVuvnUUnuUn = null;
      this.NuunnvnN = -1;
      this.VVnVNnunVvu.vVvUvVVuuNvV(0.0);
      this.VVnVNnunVvu.C00OOC00oO();
      this.VuunNUUUvu = null;
      this.NNUUNUuVNNVn = 0L;
      this.VvVvnNUnvuvV = 0.0F;
      this.ccOO0COcoco0 = 0.0F;
   }

   private float uNNnnnuuuN(nUvnuVnNUU var1) {
      return var1.UuUVuuUu(72.0F);
   }

   private float UuUVuuUu(String var1, nUvnuVnNUU var2, float var3) {
      return this.uNNnnnuuuN(var2) + (var2.UuUVuuUu(6.0F) + this.UuUVuuUu(var1, var2)) * this.C00OOC00oO(var3, 0.0F, 1.0F);
   }

   private float UuUVuuUu(String var1, nUvnuVnNUU var2) {
      int var3 = this.uUnuvNvvNU(var1).enchantments().size();
      if (var3 == 0) {
         return var2.UuUVuuUu(112.0F);
      } else {
         int var4 = (var3 + 1) / 2;
         return var2.UuUVuuUu(128.0F + var4 * 22.0F + Math.max(0, var4 - 1) * 4.0F + 14.0F);
      }
   }

   private float nvUVNnuu(String var1) {
      return var1 != null && var1.equals(this.vuvnUnVnUNnV) && this.VVuuUN(var1) ? 1.0F : 0.0F;
   }

   private float UuUVuuUu(vNvvVnNuUVvv var1, String var2) {
      return var1.C00OOC00oO(this.UuuNnUvUuv(var2), this.nvUVNnuu(var2), UuUVuuUu);
   }

   private float C00OOC00oO(vNvvVnNuUVvv var1, String var2) {
      return var1.UuUVuuUu(this.UuuNnUvUuv(var2));
   }

   private String UuuNnUvUuv(String var1) {
      return "ab:armor-settings:open:" + var1;
   }

   private float nuUnNvnuUu(nUvnuVnNUU var1) {
      return var1.UuUVuuUu(8.0F);
   }

   private String UuUVuuUu(long var1) {
      return UNNNnNVnUnn.UuUVuuUu(var1);
   }

   private float C00OOC00oO(float var1, float var2, float var3) {
      return Math.max(var2, Math.min(var3, var1));
   }

   private float UuUVuuUu(VwVVvwWW var1, float var2) {
      var1.uUnuvNvvNU(-var2);
      var1.UuUVuuUu(this.C00OOC00oO(var1.VVuuUN(), -var2, 0.0F));
      var1.uUnuvNvvNU();
      return var1.vNUvnnVnUvu();
   }

   private void UuUVuuUu(VwVVvwWW var1, float var2, double var3) {
      var1.uUnuvNvvNU(-var2);
      var1.UuUVuuUu(var3);
      var1.UuUVuuUu(this.C00OOC00oO(var1.VVuuUN(), -var2, 0.0F));
   }

   private void C00OOC00oO(VwVVvwWW var1, float var2) {
      var1.UuUVuuUu(var2);
      var1.C00OOC00oO(var2);
   }

   record NVnVnNnN(String key, String label, class_1799 stack, boolean custom) {
   }

   record VUUnVnVNNU(
      float titleX,
      float titleW,
      float priceX,
      float priceW,
      float statusX,
      float statusW,
      float deleteX,
      float deleteW,
      float settingsX,
      float settingsW,
      float controlY,
      float controlH
   ) {
   }

   static enum VUVvVuvuN {
      WELL,
      TILE,
      CARD,
      CONTROL,
      INSET;
   }

   record VUnuUnnuNvVu(boolean visible, float chipX, float chipY, float chipW, float chipH, float fixX, float fixW, float statX, float statW) {
   }

   record VvunVVUvUNnv(String key, String label) {
   }

   record nUNvUnnVN(float x, float y, float w, float h, float maxScroll, float thumbY, float thumbH, boolean visible) {
      static nUvUnuNNNnUN.nUNvUnnVN hidden() {
         return hidden(0.0F, 0.0F, 0.0F, 0.0F);
      }

      static nUvUnuNNNnUN.nUNvUnnVN hidden(float var0, float var1, float var2, float var3) {
         return new nUvUnuNNNnUN.nUNvUnnVN(var0, var1, var2, var3, 0.0F, var1, 0.0F, false);
      }

      float travel() {
         return Math.max(0.0F, this.h - this.thumbH);
      }
   }

   record nUVVnVNu(
      float stripH,
      float modeX,
      float modeY,
      float toggleX,
      float toggleW,
      float gap,
      float tabBtnSize,
      float chipW,
      boolean showReparse,
      float reparseX,
      float reparseW,
      float reparseToggleW,
      float reparseSliderX,
      float reparseSliderW
   ) {
   }

   record nvUnvV(List<nUvUnuNNNnUN.VvunVVUvUNnv> enchantments) {
   }

   record nvnNNunvv(String name, String author, long timestamp) {
   }

   record uunvUUVnuNn(
      float x,
      float y,
      float width,
      float height,
      float leftX,
      float rightX,
      float leftW,
      float rightW,
      float panelY,
      float panelH,
      float catalogViewportX,
      float catalogViewportY,
      float catalogViewportW,
      float catalogViewportH,
      float catalogScrollbarX,
      float rulesViewportX,
      float rulesViewportY,
      float rulesViewportW,
      float rulesViewportH,
      float rulesScrollbarX,
      float scrollbarW
   ) {
   }

   record vUvuUvvVvvnN(List<String> lines, float size) {
   }
}
