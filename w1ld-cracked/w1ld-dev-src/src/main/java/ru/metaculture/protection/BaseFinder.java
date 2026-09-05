package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.GoalBlock;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.awt.Color;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_10799;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1588;
import net.minecraft.class_1646;
import net.minecraft.class_1657;
import net.minecraft.class_1694;
import net.minecraft.class_1700;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_1921;
import net.minecraft.class_1923;
import net.minecraft.class_1944;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2269;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2482;
import net.minecraft.class_2533;
import net.minecraft.class_2586;
import net.minecraft.class_2591;
import net.minecraft.class_2595;
import net.minecraft.class_2611;
import net.minecraft.class_2627;
import net.minecraft.class_2784;
import net.minecraft.class_2818;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_3489;
import net.minecraft.class_3612;
import net.minecraft.class_3719;
import net.minecraft.class_3866;
import net.minecraft.class_3965;
import net.minecraft.class_4588;
import net.minecraft.class_5762;
import net.minecraft.class_7439;
import net.minecraft.class_1921.class_4688;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "BaseFinder",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Ищет базы, пишет в ТГ и копает"
)
public class BaseFinder extends Module {
   public final VUVnvvnNN NVNnnvnuunNv = new VUVnvvnNN(
      "Блоки",
      new vvNnnUNnVvn("Сундуки", true),
      new vvNnnUNnVvn("Шалкера", true),
      new vvNnnUNnVvn("Бочки", true),
      new vvNnnUNnVvn("Наковальни", true),
      new vvNnnUNnVvn("Печка", false),
      new vvNnnUNnVvn("Эндер сундук", true)
   );
   public final vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Искать вагонетки", true);
   public final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Искать крестьян/аксолотлей", true);
   public final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("Авто-туннель (#)", true);
   public final vvNnnUNnVvn NnUuNNU = new vvNnnUNnVvn("Копать к находке", true).UuUVuuUu(() -> !this.uNnUnnuNUnNu.uUnuvNvvNU());
   public final vvNnnUNnVvn nNvNUVU = new vvNnnUNnVvn("Выкл при игроке", true);
   public final vvNnnUNnVvn UnUNuUU = new vvNnnUNnVvn("Проверки на свет", false);
   public final vvNnnUNnVvn uUVuVvuNUvnu = new vvNnnUNnVvn("Избегать мобов", false);
   public final vvNnnUNnVvn UvUvUNuvNU = new vvNnnUNnVvn("Рендерить находки", true);
   public final vvNnnUNnVvn c0oOOCcCoC0 = new vvNnnUNnVvn("Уведомления в ТГ", false);
   public final nNUuNvVn VVnVNnunVvu = new nNUuNvVn("Радиус чанков", 4.0F, 1.0F, 8.0F, 1.0F, true);
   public final UvNnUnuNUUU unNNVVNnvvV = new UvNnUnuNUUU("Режим работы", "Tonnel", "Tonnel", "FunTime", "HolyWorld", "Поиск приватом");
   public final UvNnUnuNUUU NuunnvnN = new UvNnUnuNUUU("Блок привата", "Изумрудная руда", "Изумрудная руда", "Алмазный блок")
      .UuUVuuUu(() -> !this.unNNVVNnvvV.C00OOC00oO("HolyWorld"));
   private final Set<class_2338> UUVNuUNUvUnV = Collections.newSetFromMap(new ConcurrentHashMap<>());
   private final Map<class_2338, Object> vuvnUnVnUNnV = new ConcurrentHashMap<>();
   private final Set<Integer> nnuUVNUuvvVU = Collections.newSetFromMap(new ConcurrentHashMap<>());
   private static final int nVVUuvuNnUN = 8;
   private static final int nNnVnUNVV = 8;
   private static final int nuunNvv = 2;
   private static final int uUVVvVVNvvn = 2;
   private static final int vvUVNVvvNUv = 8192;
   private static final int UuNnnVnuNNV = 100;
   private static final int uUVvnUuNvvN = 3;
   private static final int UUuUnNVNuuv = 8;
   private static final int NVuNUuVnVUN = 50;
   private static final int NVuunNnvvvVu = 160;
   private static final double vNnNuuvVn = 16384.0;
   private static final int VUuuVUnun = 80;
   private int vVVuuVVv = 0;
   private int VuunNUUUvu = 0;
   private boolean NNUUNUuVNNVn = false;
   private int VvVvnNUnvuvV = 0;
   private int ccOO0COcoco0 = 0;
   private class_2338 NUVvUUVuVNVv = null;
   private class_2338 nNuVunNUVu = null;
   private class_2350 UNvvunVVn = null;
   private final Map<Long, Integer> UnvuVuVnNuvu = new ConcurrentHashMap<>();
   private BaseFinder.NVnVnNnN UvNNVUVNVuvV = BaseFinder.NVnVnNnN.CHECK_SUPPLIES;
   private int NnunUUnU = 0;
   private int nvuVvuNnNUnv = 100;
   private class_2338 NnVnNVN = null;
   private class_2338 vnvvNvUnVv = null;
   private class_2338 OCOocoOoOO = null;
   private class_2350 o0Ooc0COOoc = null;
   private class_2350 nvvnUnUn = null;
   private class_2350 UnUUVuVunvVu = null;
   private class_2338 nnvuvUNuUnN = null;
   private int UVnuVUUVnnU = 30;
   private int VunnVNvNV = -1;
   private int NvUVUvVVnUu = 0;
   public static final Map<Object, Integer> NVUunUNUN = new HashMap<>();
   private static final int unnUnUNVnN = 1024;
   private static final RenderPipeline NnuUnUNnu = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "block_esp_box"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final class_1921 UnnnvvU = class_1921.method_24049(
      "block_esp_box", 1024, false, true, NnuUnUNnu, class_4688.method_23598().method_23617(false)
   );

   public BaseFinder() {
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
            this.c0oOOCcCoC0,
            this.VVnVNnunVvu,
            this.unNNVVNnvvV,
            this.NuunnvnN
         }
      );
      NVUunUNUN.put(class_2591.field_11914, VnVnuUn.uNNnnnuuuN(new Color(255, 194, 84).getRGB(), 100));
      NVUunUNUN.put(class_2591.field_11891, VnVnuUn.uNNnnnuuuN(new Color(143, 109, 62).getRGB(), 100));
      NVUunUNUN.put(class_2591.field_11901, VnVnuUn.uNNnnnuuuN(new Color(153, 49, 238).getRGB(), 100));
      NVUunUNUN.put(class_2591.field_16411, VnVnuUn.uNNnnnuuuN(new Color(250, 225, 62).getRGB(), 100));
      NVUunUNUN.put(class_2591.field_11903, VnVnuUn.uNNnnnuuuN(new Color(115, 115, 115).getRGB(), 100));
      NVUunUNUN.put(class_2591.field_11896, VnVnuUn.uNNnnnuuuN(new Color(246, 123, 123).getRGB(), 100));
      NVUunUNUN.put(class_1694.class, VnVnuUn.uNNnnnuuuN(new Color(255, 100, 0).getRGB(), 100));
      NVUunUNUN.put(class_1700.class, VnVnuUn.uNNnnnuuuN(new Color(100, 100, 100).getRGB(), 100));
      NVUunUNUN.put(class_1646.class, VnVnuUn.uNNnnnuuuN(new Color(139, 90, 60).getRGB(), 100));
      NVUunUNUN.put(class_5762.class, VnVnuUn.uNNnnnuuuN(new Color(255, 182, 193).getRGB(), 100));
      this.nnuUVNUuvvVU();
   }

   @Override
   public void UuUVuuUu() {
      NNvvnnunn.UuUVuuUu = false;
      super.UuUVuuUu();
      if (this.unNNVVNnvvV.C00OOC00oO("HolyWorld")) {
         String var1 = this.NuunnvnN.C00OOC00oO("Алмазный блок") ? "алмазный блок" : "изумрудная руда";
         this.C00OOC00oO("§eНужна кирка на шёлк и " + var1);
      } else if (this.unNNVVNnvvV.C00OOC00oO("FunTime") || this.unNNVVNnvvV.C00OOC00oO("Поиск приватом")) {
         this.C00OOC00oO("§eНужна кирка на шёлк и 2 изумрудной руды");
      }

      this.UUVNuUNUvUnV.clear();
      this.vuvnUnVnUNnV.clear();
      this.nnuUVNUuvvVU.clear();
      this.vVVuuVVv = 0;
      this.VuunNUUUvu = 0;
      this.NNUUNUuVNNVn = false;
      this.VvVvnNUnvuvV = 0;
      this.ccOO0COcoco0 = 0;
      this.NUVvUUVuVNVv = null;
      this.nNuVunNUVu = null;
      this.UnvuVuVnNuvu.clear();
      this.UvNNVUVNVuvV = BaseFinder.NVnVnNnN.CHECK_SUPPLIES;
      this.NnunUUnU = 0;
      this.nvuVvuNnNUnv = 100;
      this.NnVnNVN = null;
      this.vnvvNvUnVv = null;
      this.OCOocoOoOO = null;
      this.o0Ooc0COOoc = null;
      this.nvvnUnUn = null;
      this.UnUUVuVunvVu = null;
      this.nnvuvUNuUnN = null;
      this.VunnVNvNV = -1;
      this.NvUVUvVVnUu = 0;
      if (uUnuvNvvNU.field_1724 != null) {
         if (this.unNNVVNnvvV.C00OOC00oO("Tonnel") && this.uNnUnnuNUnNu.uUnuvNvvNU()) {
            this.UnUNVVVNuv();
            this.UvnvNVnnnnNU();
         }

         if (this.c0oOOCcCoC0.uUnuvNvvNU()) {
            if (!uvNnnnUuVu.UuUVuuUu()) {
               this.C00OOC00oO("§cВнимание! Telegram не настроен. Используйте .tapi");
            } else {
               this.C00OOC00oO("§aУведомления в Telegram включены.");
            }
         }
      }
   }

   @Override
   public void C00OOC00oO() {
      NNvvnnunn.UuUVuuUu = false;
      super.C00OOC00oO();
      this.UNnVVNvvnVvU();
      if (uUnuvNvvNU.field_1724 != null && this.uNnUnnuNUnNu.uUnuvNvvNU()) {
         this.uNNnnnuuuN("stop");
      }

      this.nNvNUVU();
      this.NNUUNUuVNNVn = false;
      this.nNuVunNUVu = null;
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         this.VvVvnNUnvuvV++;
         if (this.nNvNUVU.uUnuvNvvNU()) {
            this.NuunnvnN();
            if (!this.nuUnNvnuUu) {
               return;
            }
         }

         if (this.nUUVuvU() || this.unNNVVNnvvV.C00OOC00oO("Tonnel")) {
            this.UuuNnUvUuv();
         }

         if (this.vVVuuVVv++ >= 10) {
            this.vVVuuVVv = 0;
            if (!this.uUVuVvuNUvnu.uUnuvNvvNU() || !this.vuvnUnVnUNnV()) {
               this.NVUunUNUN();
               if (this.uVunuUNVVUUV.uUnuvNvvNU() || this.UNnVVNvvnVvU.uUnuvNvvNU()) {
                  this.UUVNuUNUvUnV();
               }
            }
         }
      }
   }

   private void UuuNnUvUuv() {
      if (this.NnunUUnU > 0) {
         this.NnunUUnU--;
      } else {
         switch (this.UvNNVUVNVuvV) {
            case CHECK_SUPPLIES:
               if (this.nUUVuvU() && this.VVnVNnunVvu() == -1) {
                  return;
               }

               this.UnUNVVVNuv();
               this.UvnvNVnnnnNU();
               this.UvNNVUVNVuvV = BaseFinder.NVnVnNnN.TUNNELING;
               break;
            case TUNNELING:
               if (uUnuvNvvNU.field_1724.method_5771()) {
                  this.nNvNUVU();
                  this.UNnVVNvvnVvU();
                  this.C00OOC00oO("§cПровалился в лаву! Экстренная остановка.");
                  this.a_();
                  return;
               }

               if (this.NVNnnvnuunNv()) {
                  if (this.uNnUnnuNUnNu.uUnuvNvvNU()) {
                     this.uNnUnnuNUnNu();
                  } else {
                     this.UuUVuuUu(this.vNVuvnUUnuUn());
                  }
               } else if (this.vVvUvVVuuNvV(this.vNVuvnUUnuUn())) {
                  if (this.uNnUnnuNUnNu.uUnuvNvvNU()) {
                     this.UNnVVNvvnVvU();
                  }

                  this.nNvNUVU();
                  this.uUVuVvuNUvnu();
               } else if (this.uUnuvNvvNU(this.vNVuvnUUnuUn())) {
                  if (this.uNnUnnuNUnNu.uUnuvNvvNU()) {
                     this.UNnVVNvvnVvU();
                  }

                  this.nNvNUVU();
                  this.UuUVuuUu("§6Лава впереди. Смещаюсь в сторону.");
               } else {
                  if (this.uNnUnnuNUnNu.uUnuvNvvNU()) {
                     this.uNnUnnuNUnNu();
                     this.nNvNUVU();
                  } else {
                     if (this.uVunuUNVVUUV()) {
                        this.nNvNUVU();
                        break;
                     }

                     this.NnUuNNU();
                  }

                  if (this.UnUNuUU() >= this.UVnuVUUVnnU) {
                     if (this.uNnUnnuNUnNu.uUnuvNvvNU()) {
                        this.UNnVVNvvnVvU();
                     }

                     this.nNvNUVU();
                     this.UvNNVUVNVuvV = BaseFinder.NVnVnNnN.STOPPING;
                     this.NnunUUnU = 10;
                  }
               }
               break;
            case BORDER_SHIFTING:
               if (this.UnUUVuVunvVu != null && this.nnvuvUNuUnN != null) {
                  if (uUnuvNvvNU.field_1724.method_5771()) {
                     this.UNnVVNvvnVvU();
                     this.nNvNUVU();
                     this.C00OOC00oO("§cПопал в лаву при смещении! Экстренная остановка.");
                     this.a_();
                     return;
                  }

                  if (this.uUnuvNvvNU(this.vNVuvnUUnuUn())) {
                     if (this.uNnUnnuNUnNu.uUnuvNvvNU()) {
                        this.UNnVVNvvnVvU();
                     }

                     this.nNvNUVU();
                     this.UuUVuuUu("§6Лава на пути смещения. Меняю линию.");
                  } else {
                     if (this.uNnUnnuNUnNu.uUnuvNvvNU()) {
                        this.C00OOC00oO(this.UnUUVuVunvVu);
                        this.nNvNUVU();
                     } else {
                        if (this.uVunuUNVVUUV()) {
                           this.nNvNUVU();
                           break;
                        }

                        this.NnUuNNU();
                     }

                     if (this.UuUVuuUu(this.nnvuvUNuUnN, this.UnUUVuVunvVu) >= this.nvuVvuNnNUnv) {
                        if (this.uNnUnnuNUnNu.uUnuvNvvNU()) {
                           this.UNnVVNvvnVvU();
                        }

                        this.nNvNUVU();
                        this.o0Ooc0COOoc = this.nvvnUnUn;
                        this.OCOocoOoOO = uUnuvNvvNU.field_1724.method_24515().method_10062();
                        this.UnUUVuVunvVu = null;
                        this.nnvuvUNuUnN = null;
                        this.UvnvNVnnnnNU();
                        this.UvNNVUVNVuvV = BaseFinder.NVnVnNnN.TUNNELING;
                        this.NnunUUnU = 6;
                     }
                  }
               } else {
                  this.UvNNVUVNVuvV = BaseFinder.NVnVnNnN.RESUMING;
                  this.NnunUUnU = 2;
               }
               break;
            case STOPPING:
               this.nNvNUVU();
               this.VunnVNvNV = uUnuvNvvNU.field_1724.method_31548().method_67532();
               if (!this.nUUVuvU()) {
                  this.UvnvNVnnnnNU();
                  this.UvNNVUVNVuvV = BaseFinder.NVnVnNnN.TUNNELING;
               } else if (this.VVnVNnunVvu() != -1) {
                  this.NvUVUvVVnUu = 0;
                  this.UvNNVUVNVuvV = BaseFinder.NVnVnNnN.DIGGING_SPOT;
                  this.NnunUUnU = 5;
               } else {
                  this.C00OOC00oO("§cРуда закончилась! Жду пополнения...");
                  this.UvNNVUVNVuvV = BaseFinder.NVnVnNnN.CHECK_SUPPLIES;
               }
               break;
            case DIGGING_SPOT:
               this.nNvNUVU();
               int var1 = this.unNNVVNnvvV();
               if (var1 != -1 && uUnuvNvvNU.field_1724.method_31548().method_67532() != var1) {
                  uUnuvNvvNU.field_1724.method_31548().method_61496(var1);
               }

               class_2350 var2 = this.vNVuvnUUnuUn();
               class_2338 var3 = uUnuvNvvNU.field_1724.method_24515();

               for (int var15 = 1; var15 <= 2; var15++) {
                  class_2338 var16 = var3.method_10079(var2, var15);
                  class_2338 var17 = var16.method_10084();
                  class_2338 var18 = !uUnuvNvvNU.field_1687.method_8320(var16).method_26215()
                     ? var16
                     : (!uUnuvNvvNU.field_1687.method_8320(var17).method_26215() ? var17 : null);
                  if (var18 != null) {
                     this.UuUVuuUu(class_243.method_24953(var18));
                     uUnuvNvvNU.field_1761.method_2902(var18, var2.method_10153());
                     uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
                     return;
                  }
               }

               this.UvNNVUVNVuvV = BaseFinder.NVnVnNnN.PLACING;
               this.NnunUUnU = 5;
               break;
            case PLACING:
               this.nNvNUVU();
               int var4 = this.VVnVNnunVvu();
               if (var4 != -1) {
                  uUnuvNvvNU.field_1724.method_31548().method_61496(var4);
               }

               class_2350 var5 = this.vNVuvnUUnuUn();
               class_2338 var6 = uUnuvNvvNU.field_1724.method_24515();
               class_2338 var7 = var6.method_10093(var5);
               class_2338 var8 = var6.method_10079(var5, 2);
               boolean var9 = false;
               class_2338[] var10 = new class_2338[]{
                  var7.method_10074(),
                  var8.method_10074(),
                  var6.method_10093(var5.method_10160()).method_10084(),
                  var6.method_10093(var5.method_10170()).method_10084(),
                  var6.method_10093(var5.method_10160()),
                  var6.method_10093(var5.method_10170()),
                  var7.method_10084(),
                  var7
               };

               for (class_2338 var14 : var10) {
                  if (this.UuUVuuUu(var14)) {
                     this.vnvvNvUnVv = var14;
                     var9 = true;
                     break;
                  }
               }

               if (var9) {
                  this.UvNNVUVNVuvV = BaseFinder.NVnVnNnN.WAITING_CHAT;
                  this.NnunUUnU = 10;
               } else if (this.NvUVUvVVnUu++ < 1) {
                  this.UvNNVUVNVuvV = BaseFinder.NVnVnNnN.DIGGING_SPOT;
                  this.NnunUUnU = 5;
               } else {
                  this.C00OOC00oO("§7Некуда поставить блок. Пропуск.");
                  if (this.VunnVNvNV != -1) {
                     uUnuvNvvNU.field_1724.method_31548().method_61496(this.VunnVNvNV);
                  }

                  this.UvNNVUVNVuvV = BaseFinder.NVnVnNnN.RESUMING;
                  this.NnunUUnU = 5;
               }
               break;
            case WAITING_CHAT:
               this.nNvNUVU();
               this.UvNNVUVNVuvV = BaseFinder.NVnVnNnN.BREAKING;
               break;
            case BREAKING:
               this.nNvNUVU();
               if (this.vnvvNvUnVv != null) {
                  int var11 = this.unNNVVNnvvV();
                  if (var11 != -1 && uUnuvNvvNU.field_1724.method_31548().method_67532() != var11) {
                     uUnuvNvvNU.field_1724.method_31548().method_61496(var11);
                  }

                  if (!uUnuvNvvNU.field_1687.method_8320(this.vnvvNvUnVv).method_26215()) {
                     this.UuUVuuUu(class_243.method_24953(this.vnvvNvUnVv));
                     uUnuvNvvNU.field_1761.method_2902(this.vnvvNvUnVv, class_2350.field_11036);
                     uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
                     return;
                  }
               }

               this.UvNNVUVNVuvV = BaseFinder.NVnVnNnN.RESUMING;
               this.NnunUUnU = 5;
               break;
            case RESUMING:
               this.UvnvNVnnnnNU();
               this.UvNNVUVNVuvV = BaseFinder.NVnVnNnN.TUNNELING;
         }
      }
   }

   private void UuUVuuUu(class_243 var1) {
      double var2 = var1.field_1352 - uUnuvNvvNU.field_1724.method_23317();
      double var4 = var1.field_1351 - uUnuvNvvNU.field_1724.method_23320();
      double var6 = var1.field_1350 - uUnuvNvvNU.field_1724.method_23321();
      double var8 = Math.sqrt(var2 * var2 + var6 * var6);
      float var10 = (float)(Math.toDegrees(Math.atan2(var6, var2)) - 90.0);
      float var11 = (float)Math.toDegrees(-Math.atan2(var4, var8));
      uUnuvNvvNU.field_1724.method_36456(var10);
      uUnuvNvvNU.field_1724.method_36457(var11);
   }

   private boolean UuUVuuUu(class_2338 var1) {
      if (!uUnuvNvvNU.field_1687.method_8320(var1).method_26215()) {
         return false;
      } else {
         for (class_2350 var5 : class_2350.values()) {
            class_2338 var6 = var1.method_10093(var5);
            if (!uUnuvNvvNU.field_1687.method_8320(var6).method_26215()) {
               class_2350 var7 = var5.method_10153();
               class_243 var8 = new class_243(
                  var6.method_10263() + 0.5 + var7.method_10148() * 0.5,
                  var6.method_10264() + 0.5 + var7.method_10164() * 0.5,
                  var6.method_10260() + 0.5 + var7.method_10165() * 0.5
               );
               class_3965 var9 = new class_3965(var8, var7, var6, false);
               this.UuUVuuUu(var8);
               uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var9);
               uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
               return true;
            }
         }

         return false;
      }
   }

   private boolean nUUVuvU() {
      return this.unNNVVNnvvV.C00OOC00oO("FunTime") || this.unNNVVNnvvV.C00OOC00oO("HolyWorld") || this.unNNVVNnvvV.C00OOC00oO("Поиск приватом");
   }

   private void UnUNVVVNuv() {
      if (uUnuvNvvNU.field_1724 != null) {
         if (this.OCOocoOoOO == null) {
            this.OCOocoOoOO = uUnuvNvvNU.field_1724.method_24515().method_10062();
         }

         if (this.o0Ooc0COOoc == null || !this.o0Ooc0COOoc.method_10166().method_10179()) {
            this.o0Ooc0COOoc = uUnuvNvvNU.field_1724.method_5735();
         }

         if (this.nvvnUnUn == null || !this.nvvnUnUn.method_10166().method_10179()) {
            this.nvvnUnUn = this.o0Ooc0COOoc;
         }
      }
   }

   private class_2350 vNVuvnUUnuUn() {
      if (this.o0Ooc0COOoc == null || !this.o0Ooc0COOoc.method_10166().method_10179()) {
         this.UnUNVVVNuv();
      }

      return this.o0Ooc0COOoc != null ? this.o0Ooc0COOoc : class_2350.field_11043;
   }

   private void UvnvNVnnnnNU() {
      if (uUnuvNvvNU.field_1724 != null) {
         this.UnUNVVVNuv();
         this.UuUVuuUu(this.vNVuvnUUnuUn());
         this.NnVnNVN = uUnuvNvvNU.field_1724.method_24515();
         this.UVnuVUUVnnU = ThreadLocalRandom.current().nextInt(20, 30);
      }
   }

   private void uVUVnuvnuVuv() {
      this.nNvNUVU();
      this.UvnvNVnnnnNU();
      this.NnunUUnU = 8;
   }

   private boolean NVNnnvnuunNv() {
      if (uUnuvNvvNU.field_1724 != null && this.OCOocoOoOO != null && this.o0Ooc0COOoc != null) {
         class_2338 var1 = uUnuvNvvNU.field_1724.method_24515();

         return switch (this.o0Ooc0COOoc.method_10166()) {
            case field_11048 -> Math.abs(var1.method_10260() - this.OCOocoOoOO.method_10260()) > 1;
            case field_11051 -> Math.abs(var1.method_10263() - this.OCOocoOoOO.method_10263()) > 1;
            default -> false;
         };
      } else {
         return false;
      }
   }

   private void UuUVuuUu(class_2350 var1) {
      if (uUnuvNvvNU.field_1724 != null && var1 != null) {
         this.UuUVuuUu(class_243.method_24953(uUnuvNvvNU.field_1724.method_24515().method_10079(var1, 4)));
      }
   }

   private boolean uVunuUNVVUUV() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         int var1 = this.unNNVVNnvvV();
         if (var1 != -1 && uUnuvNvvNU.field_1724.method_31548().method_67532() != var1) {
            uUnuvNvvNU.field_1724.method_31548().method_61496(var1);
         }

         class_2350 var2 = this.vNVuvnUUnuUn();
         class_2338 var3 = uUnuvNvvNU.field_1724.method_24515();
         class_2338 var4 = var3.method_10093(var2);
         class_2338 var5 = var4.method_10084();
         class_2338 var6 = !uUnuvNvvNU.field_1687.method_8320(var4).method_26215()
            ? var4
            : (!uUnuvNvvNU.field_1687.method_8320(var5).method_26215() ? var5 : null);
         if (var6 == null) {
            return false;
         } else {
            this.UuUVuuUu(class_243.method_24953(var6));
            uUnuvNvvNU.field_1761.method_2902(var6, var2.method_10153());
            uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
            return true;
         }
      } else {
         return false;
      }
   }

   private void UNnVVNvvnVvU() {
      try {
         BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
      } catch (Throwable var2) {
      }

      this.nNuVunNUVu = null;
      this.UNvvunVVn = null;
   }

   private void uNnUnnuNUnNu() {
      this.C00OOC00oO(this.vNVuvnUUnuUn());
   }

   private void C00OOC00oO(class_2350 var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && var1 != null) {
         IBaritone var2 = BaritoneAPI.getProvider().getPrimaryBaritone();
         NNvvnnunn.UuUVuuUu = false;
         if (this.nNuVunNUVu == null || this.UNvvunVVn != var1 || uUnuvNvvNU.field_1724.method_24515().method_19455(this.nNuVunNUVu) <= 2) {
            class_2338 var3 = uUnuvNvvNU.field_1724.method_24515();
            class_2338 var4 = new class_2338(var3.method_10263() + var1.method_10148() * 8, var3.method_10264(), var3.method_10260() + var1.method_10165() * 8);
            this.nNuVunNUVu = var4;
            this.UNvvunVVn = var1;

            try {
               var2.getCustomGoalProcess().setGoalAndPath(new GoalBlock(var4));
            } catch (Throwable var6) {
            }
         }
      }
   }

   private boolean uUnuvNvvNU(class_2350 var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && var1 != null) {
         class_2338 var2 = uUnuvNvvNU.field_1724.method_24515();

         for (int var3 = 0; var3 <= 3; var3++) {
            class_2338 var4 = var2.method_10079(var1, var3);
            class_2338 var5 = var4.method_10084();
            class_2338 var6 = var4.method_10074();
            if (this.C00OOC00oO(var4) || this.C00OOC00oO(var5) || this.C00OOC00oO(var6)) {
               return true;
            }

            for (class_2350 var10 : new class_2350[]{var1.method_10160(), var1.method_10170()}) {
               if (this.C00OOC00oO(var4.method_10093(var10)) || this.C00OOC00oO(var5.method_10093(var10)) || this.C00OOC00oO(var6.method_10093(var10))) {
                  return true;
               }
            }
         }

         return uUnuvNvvNU.field_1724.method_5771();
      } else {
         return false;
      }
   }

   private boolean C00OOC00oO(class_2338 var1) {
      return uUnuvNvvNU.field_1687 != null && var1 != null
         ? uUnuvNvvNU.field_1687.method_8320(var1).method_27852(class_2246.field_10164)
            || uUnuvNvvNU.field_1687.method_8316(var1).method_39360(class_3612.field_15908)
            || uUnuvNvvNU.field_1687.method_8316(var1).method_39360(class_3612.field_15907)
         : false;
   }

   private void NnUuNNU() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1690 != null) {
         this.UuUVuuUu(this.vNVuvnUUnuUn());
         uUnuvNvvNU.field_1690.field_1894.method_23481(true);
         uUnuvNvvNU.field_1690.field_1881.method_23481(false);
         uUnuvNvvNU.field_1690.field_1913.method_23481(false);
         uUnuvNvvNU.field_1690.field_1849.method_23481(false);
         uUnuvNvvNU.field_1690.field_1867.method_23481(true);
      }
   }

   private void nNvNUVU() {
      if (uUnuvNvvNU.field_1690 != null) {
         uUnuvNvvNU.field_1690.field_1894.method_23481(false);
         uUnuvNvvNU.field_1690.field_1881.method_23481(false);
         uUnuvNvvNU.field_1690.field_1913.method_23481(false);
         uUnuvNvvNU.field_1690.field_1849.method_23481(false);
         uUnuvNvvNU.field_1690.field_1867.method_23481(false);
      }
   }

   private int UnUNuUU() {
      return uUnuvNvvNU.field_1724 != null && this.NnVnNVN != null && this.o0Ooc0COOoc != null ? this.UuUVuuUu(this.NnVnNVN, this.o0Ooc0COOoc) : 0;
   }

   private int UuUVuuUu(class_2338 var1, class_2350 var2) {
      if (uUnuvNvvNU.field_1724 != null && var1 != null && var2 != null) {
         class_2338 var3 = uUnuvNvvNU.field_1724.method_24515();

         return switch (var2) {
            case field_11034 -> var3.method_10263() - var1.method_10263();
            case field_11039 -> var1.method_10263() - var3.method_10263();
            case field_11035 -> var3.method_10260() - var1.method_10260();
            case field_11043 -> var1.method_10260() - var3.method_10260();
            default -> var1.method_19455(var3);
         };
      } else {
         return 0;
      }
   }

   private boolean vVvUvVVuuNvV(class_2350 var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null && var1 != null) {
         class_2784 var2 = uUnuvNvvNU.field_1687.method_8621();
         class_2338 var3 = uUnuvNvvNU.field_1724.method_24515();
         int var4 = var3.method_10263();
         int var5 = var3.method_10260();

         return switch (var1) {
            case field_11034 -> var2.method_11963() - var4 <= 100.0;
            case field_11039 -> var4 - var2.method_11976() <= 100.0;
            case field_11035 -> var2.method_11977() - var5 <= 100.0;
            case field_11043 -> var5 - var2.method_11958() <= 100.0;
            default -> false;
         };
      } else {
         return false;
      }
   }

   private void uUVuVvuNUvnu() {
      class_2350 var1 = this.UvUvUNuvNU();
      if (var1 == null) {
         this.C00OOC00oO("§cГраница мира слишком близко. Нет безопасного смещения.");
         this.a_();
      } else {
         this.UnUUVuVunvVu = var1;
         this.nnvuvUNuUnN = uUnuvNvvNU.field_1724.method_24515().method_10062();
         this.o0Ooc0COOoc = var1;
         this.OCOocoOoOO = this.nnvuvUNuUnN;
         this.nvuVvuNnNUnv = 100;
         this.C00OOC00oO("§eГраница мира рядом. Смещаюсь на 100 блоков " + this.nuUnNvnuUu(var1) + ".");
         this.UvnvNVnnnnNU();
         this.UvNNVUVNVuvV = BaseFinder.NVnVnNnN.BORDER_SHIFTING;
         this.NnunUUnU = 4;
      }
   }

   private void UuUVuuUu(String var1) {
      class_2350 var2 = this.c0oOOCcCoC0();
      if (var2 == null) {
         this.C00OOC00oO("§cБезопасного смещения нет. Останавливаюсь.");
         this.a_();
      } else {
         this.UnUUVuVunvVu = var2;
         this.nnvuvUNuUnN = uUnuvNvvNU.field_1724.method_24515().method_10062();
         this.o0Ooc0COOoc = var2;
         this.OCOocoOoOO = this.nnvuvUNuUnN;
         this.nvuVvuNnNUnv = 5;
         this.C00OOC00oO(var1);
         this.UvnvNVnnnnNU();
         this.UvNNVUVNVuvV = BaseFinder.NVnVnNnN.BORDER_SHIFTING;
         this.NnunUUnU = 4;
      }
   }

   private class_2350 UvUvUNuvNU() {
      class_2350 var1 = this.nvvnUnUn != null ? this.nvvnUnUn : this.vNVuvnUUnuUn();
      class_2350 var2 = var1.method_10160();
      class_2350 var3 = var1.method_10170();
      int var4 = this.uNNnnnuuuN(var2);
      int var5 = this.uNNnnnuuuN(var3);
      if (var4 >= 100 && var5 >= 100) {
         return var4 >= var5 ? var2 : var3;
      } else if (var4 >= 100) {
         return var2;
      } else if (var5 >= 100) {
         return var3;
      } else {
         return var4 >= var5 && var4 > 0 ? var2 : (var5 > 0 ? var3 : null);
      }
   }

   private class_2350 c0oOOCcCoC0() {
      class_2350 var1 = this.nvvnUnUn != null ? this.nvvnUnUn : this.vNVuvnUUnuUn();
      class_2350 var2 = var1.method_10160();
      class_2350 var3 = var1.method_10170();
      boolean var4 = !this.uUnuvNvvNU(var2) && this.uNNnnnuuuN(var2) > 2;
      boolean var5 = !this.uUnuvNvvNU(var3) && this.uNNnnnuuuN(var3) > 2;
      if (var4 && var5) {
         return this.uNNnnnuuuN(var2) >= this.uNNnnnuuuN(var3) ? var2 : var3;
      } else if (var4) {
         return var2;
      } else {
         return var5 ? var3 : null;
      }
   }

   private int uNNnnnuuuN(class_2350 var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null && var1 != null) {
         class_2784 var2 = uUnuvNvvNU.field_1687.method_8621();
         class_2338 var3 = uUnuvNvvNU.field_1724.method_24515();
         int var4 = var3.method_10263();
         int var5 = var3.method_10260();

         return switch (var1) {
            case field_11034 -> (int)Math.floor(var2.method_11963() - var4);
            case field_11039 -> (int)Math.floor(var4 - var2.method_11976());
            case field_11035 -> (int)Math.floor(var2.method_11977() - var5);
            case field_11043 -> (int)Math.floor(var5 - var2.method_11958());
            default -> 0;
         };
      } else {
         return 0;
      }
   }

   private String nuUnNvnuUu(class_2350 var1) {
      return switch (var1) {
         case field_11034 -> "вправо";
         case field_11039 -> "влево";
         case field_11035 -> "назад";
         case field_11043 -> "вперёд";
         default -> "в сторону";
      };
   }

   private int VVnVNnunVvu() {
      return this.unNNVVNnvvV.C00OOC00oO("HolyWorld") && this.NuunnvnN.C00OOC00oO("Алмазный блок")
         ? this.UuUVuuUu(class_1802.field_8603)
         : this.UuUVuuUu(class_1802.field_8837, class_1802.field_29216);
   }

   private int UuUVuuUu(class_1792... var1) {
      for (int var2 = 0; var2 < 9; var2++) {
         class_1792 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var2).method_7909();

         for (class_1792 var7 : var1) {
            if (var3 == var7) {
               return var2;
            }
         }
      }

      return -1;
   }

   private int unNNVVNnvvV() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_31573(class_3489.field_42614)) {
            return var1;
         }
      }

      return -1;
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (uUnuvNvvNU.field_1724 != null && var1.uNNnnnuuuN() == uvUUuvnunU.NVnVnNnN.RECEIVE) {
         if (var1.vVvUvVVuuNvV() instanceof class_7439 var2) {
            String var4 = var2.comp_763().getString();
            if (this.uUnuvNvvNU(var4)) {
               uUnuvNvvNU.execute(
                  () -> {
                     if (uUnuvNvvNU.field_1724 != null) {
                        String var1x = this.unNNVVNnvvV.C00OOC00oO("HolyWorld")
                           ? "§d!!! ПРИВАТ ПЕРЕКРЫВАЕТ ДРУГОЙ РЕГИОН !!!"
                           : "§d!!! НАЙДЕНО ПЕРЕСЕЧЕНИЕ РЕГИОНОВ !!!";
                        this.C00OOC00oO(var1x);
                        if (this.c0oOOCcCoC0.uUnuvNvvNU()) {
                           String var2x = this.unNNVVNnvvV.C00OOC00oO("HolyWorld") ? "HolyWorld (Перекрывает регион)" : "FunTime (Регион пересекается)";
                           this.C00OOC00oO(
                              var2x, uUnuvNvvNU.field_1724.method_31477(), uUnuvNvvNU.field_1724.method_31478(), uUnuvNvvNU.field_1724.method_31479()
                           );
                        }

                        if (this.nUUVuvU()) {
                           this.uNNnnnuuuN("stop");
                           this.a_();
                        }
                     }
                  }
               );
               return;
            }

            if (this.nUUVuvU() && this.UvNNVUVNVuvV == BaseFinder.NVnVnNnN.WAITING_CHAT && this.vVvUvVVuuNvV(var4)) {
               uUnuvNvvNU.execute(() -> {
                  this.UvNNVUVNVuvV = BaseFinder.NVnVnNnN.BREAKING;
                  this.NnunUUnU = 2;
               });
            }
         }
      }
   }

   private void NuunnvnN() {
      for (class_1657 var2 : uUnuvNvvNU.field_1687.method_18456()) {
         if (var2 != uUnuvNvvNU.field_1724 && !uNvUVUNvuUVV.UuUVuuUu(var2.method_5477().getString())) {
            String var3 = var2.method_5477().getString();
            int var4 = var2.method_31477();
            int var5 = var2.method_31478();
            int var6 = var2.method_31479();
            this.C00OOC00oO("§cОБНАРУЖЕН ИГРОК: §f" + var3);
            if (this.c0oOOCcCoC0.uUnuvNvvNU()) {
               this.uUnuvNvvNU(var3, var4, var5, var6);
            }

            if (this.uNnUnnuNUnNu.uUnuvNvvNU()) {
               this.uNNnnnuuuN("stop");
            }

            this.a_();
            return;
         }
      }
   }

   private void NVUunUNUN() {
      class_1923 var1 = uUnuvNvvNU.field_1724.method_31476();
      int var2 = (int)this.VVnVNnunVvu.uUnuvNvvNU();

      for (int var3 = var1.field_9181 - var2; var3 <= var1.field_9181 + var2; var3++) {
         for (int var4 = var1.field_9180 - var2; var4 <= var1.field_9180 + var2; var4++) {
            class_2818 var5 = uUnuvNvvNU.field_1687.method_8497(var3, var4);
            if (var5 != null) {
               for (class_2586 var7 : var5.method_12214().values()) {
                  class_2591 var8 = var7.method_11017();
                  if (NVUunUNUN.containsKey(var8) && this.UuUVuuUu(var7)) {
                     class_2338 var9 = var7.method_11016();
                     if (!this.UUVNuUNUvUnV.contains(var9) && (!this.UnUNuUU.uUnuvNvvNU() || this.uUnuvNvvNU(var9))) {
                        this.UUVNuUNUvUnV.add(var9);
                        this.vuvnUnVnUNnV.put(var9, var8);
                        String var10 = this.C00OOC00oO(var7);
                        this.UuUVuuUu(var10, var9.method_10263(), var9.method_10264(), var9.method_10260());
                     }
                  }
               }
            }
         }
      }

      if (this.unNNVVNnvvV.C00OOC00oO("HolyWorld")) {
         this.UuUVuuUu(var1, var2);
      }
   }

   private void UUVNuUNUvUnV() {
      for (class_1297 var2 : uUnuvNvvNU.field_1687.method_18112()) {
         if (!this.nnuUVNUuvvVU.contains(var2.method_5628()) && !(var2.method_5739(uUnuvNvvNU.field_1724) > this.VVnVNnunVvu.uUnuvNvvNU() * 16.0F)) {
            String var3 = null;
            if (this.uVunuUNVVUUV.uUnuvNvvNU()) {
               if (var2 instanceof class_1694) {
                  var3 = "Грузовая вагонетка";
               } else if (var2 instanceof class_1700) {
                  var3 = "Вагонетка с воронкой";
               }
            }

            if (var3 == null && this.UNnVVNvvnVvU.uUnuvNvvNU()) {
               if (var2 instanceof class_1646) {
                  var3 = "Крестьянин";
               } else if (var2 instanceof class_5762) {
                  var3 = "Аксолотль";
               }
            }

            if (var3 != null) {
               this.nnuUVNUuvvVU.add(var2.method_5628());
               class_2338 var4 = var2.method_24515();
               this.UuUVuuUu(var3, var4.method_10263(), var4.method_10264(), var4.method_10260());
            }
         }
      }
   }

   private void UuUVuuUu(String var1, int var2, int var3, int var4) {
      this.C00OOC00oO(String.format("§aНайден §f%s §aна XYZ: §f%d %d %d", var1, var2, var3, var4));
      if (this.c0oOOCcCoC0.uUnuvNvvNU()) {
         this.C00OOC00oO(var1, var2, var3, var4);
      }

      if (!this.nUUVuvU() && this.uNnUnnuNUnNu.uUnuvNvvNU() && this.NnUuNNU.uUnuvNvvNU() && !this.NNUUNUuVNNVn) {
         this.NNUUNUuVNNVn = true;
         this.C00OOC00oO("§aНайдена цель! Перенаправляю Baritone...");
         this.uNNnnnuuuN("goto " + var2 + " " + var3 + " " + var4);
      }
   }

   private void C00OOC00oO(String var1, int var2, int var3, int var4) {
      if (uvNnnnUuVu.UuUVuuUu()) {
         String var5 = uUnuvNvvNU.method_1558() != null ? uUnuvNvvNU.method_1558().field_3761 : "Singleplayer";
         Thread var6 = new Thread(() -> {
            try {
               String var5x = String.format("База найдена!\n\nТип: %s\nКоординаты: %d %d %d\nСервер: %s\n", var1, var2, var3, var4, var5);
               uvNnnnUuVu.UuUVuuUu(var5x);
            } catch (Exception var6x) {
               vVnvuVVUunuv.UuUVuuUu("§cОшибка отправки в Telegram: " + var6x.getMessage());
            }
         }, "Wild-BaseFinder-Telegram");
         var6.setDaemon(true);
         var6.start();
      }
   }

   private void uUnuvNvvNU(String var1, int var2, int var3, int var4) {
      if (uvNnnnUuVu.UuUVuuUu()) {
         String var5 = uUnuvNvvNU.method_1558() != null ? uUnuvNvvNU.method_1558().field_3761 : "Singleplayer";
         Thread var6 = new Thread(() -> {
            try {
               String var5x = String.format("Был обнаружен игрок\nНик: %s\nКоординаты: %d %d %d\nСервер: %s\n", var1, var2, var3, var4, var5);
               uvNnnnUuVu.UuUVuuUu(var5x);
            } catch (Exception var6x) {
               var6x.printStackTrace();
            }
         }, "Wild-BaseFinder-PlayerAlert");
         var6.setDaemon(true);
         var6.start();
      }
   }

   private boolean UuUVuuUu(class_2586 var1) {
      if (var1 instanceof class_2595 && !this.NVNnnvnuunNv.C00OOC00oO("Сундуки")) {
         return false;
      } else if (var1 instanceof class_2611 && !this.NVNnnvnuunNv.C00OOC00oO("Эндер сундук")) {
         return false;
      } else if (var1 instanceof class_3719 && !this.NVNnnvnuunNv.C00OOC00oO("Бочки")) {
         return false;
      } else {
         return var1 instanceof class_3866 && !this.NVNnnvnuunNv.C00OOC00oO("Печка")
            ? false
            : !(var1 instanceof class_2627) || this.NVNnnvnuunNv.C00OOC00oO("Шалкера");
      }
   }

   private boolean uUnuvNvvNU(class_2338 var1) {
      return uUnuvNvvNU.field_1687 == null ? false : uUnuvNvvNU.field_1687.method_8314(class_1944.field_9282, var1) >= 8;
   }

   private boolean vuvnUnVnUNnV() {
      class_238 var1 = new class_238(uUnuvNvvNU.field_1724.method_24515()).method_1014(8.0);

      for (class_1297 var4 : uUnuvNvvNU.field_1687.method_8335(uUnuvNvvNU.field_1724, var1)) {
         if (var4 instanceof class_1588 && var4.method_5805()) {
            return true;
         }
      }

      return false;
   }

   private String C00OOC00oO(class_2586 var1) {
      if (var1 instanceof class_2595) {
         return "Сундук";
      } else if (var1 instanceof class_2611) {
         return "Эндер сундук";
      } else if (var1 instanceof class_3719) {
         return "Бочка";
      } else if (var1 instanceof class_3866) {
         return "Печка";
      } else {
         return var1 instanceof class_2627 ? "Шалкер" : "Неизвестный блок";
      }
   }

   private void UuUVuuUu(class_1923 var1, int var2) {
      int var3 = var2 * 2 + 1;
      int var4 = var3 * var3;
      int var5 = Math.min(2, var4);

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = this.VuunNUUUvu++ % var4;
         int var8 = var7 / var3 - var2;
         int var9 = var7 % var3 - var2;
         this.UuUVuuUu(var1.field_9181 + var8, var1.field_9180 + var9);
      }

      if (this.VuunNUUUvu >= var4) {
         this.VuunNUUUvu %= var4;
      }
   }

   private void UuUVuuUu(int var1, int var2) {
      long var3 = class_1923.method_8331(var1, var2);
      Integer var5 = this.UnvuVuVnNuvu.get(var3);
      if (var5 == null || this.VvVvnNUnvuvV - var5 >= 160) {
         class_2818 var6 = uUnuvNvvNU.field_1687.method_8497(var1, var2);
         if (var6 != null) {
            int var7 = var1 << 4;
            int var8 = var2 << 4;
            int var9 = uUnuvNvvNU.field_1687.method_31607();
            int var10 = uUnuvNvvNU.field_1687.method_31600();
            class_2339 var11 = new class_2339();

            for (int var12 = 0; var12 < 16; var12++) {
               for (int var13 = 0; var13 < 16; var13++) {
                  for (int var14 = var9; var14 <= var10; var14++) {
                     var11.method_10103(var7 + var12, var14, var8 + var13);
                     class_2248 var15 = var6.method_8320(var11).method_26204();
                     if (this.UuUVuuUu(var15)) {
                        class_2338 var16 = var11.method_10062();
                        if (!this.UUVNuUNUvUnV.contains(var16) && (!this.UnUNuUU.uUnuvNvvNU() || this.uUnuvNvvNU(var16))) {
                           if (this.UUVNuUNUvUnV.size() >= 8192) {
                              return;
                           }

                           if (var15 != class_2246.field_10102 && var15 != class_2246.field_10534 || !this.UuUVuuUu(var16, 50)) {
                              this.UUVNuUNUvUnV.add(var16);
                              this.vuvnUnVnUNnV.put(var16, var15);
                              this.UuUVuuUu(this.uUnuvNvvNU(var15), var16.method_10263(), var16.method_10264(), var16.method_10260());
                           }
                        }
                     }
                  }
               }
            }

            this.UnvuVuVnNuvu.put(var3, this.VvVvnNUnvuvV);
         }
      }
   }

   private boolean UuUVuuUu(class_2338 var1, int var2) {
      if (uUnuvNvvNU.field_1687 == null) {
         return false;
      } else {
         class_2784 var3 = uUnuvNvvNU.field_1687.method_8621();
         int var4 = var1.method_10263();
         int var5 = var1.method_10260();
         return var4 - var3.method_11976() <= var2
            || var3.method_11963() - var4 <= var2
            || var5 - var3.method_11958() <= var2
            || var3.method_11977() - var5 <= var2;
      }
   }

   private boolean UuUVuuUu(class_2248 var1) {
      return var1 == class_2246.field_10258
         || var1 == class_2246.field_10562
         || var1 == class_2246.field_10471
         || var1 == class_2246.field_10171
         || var1 == class_2246.field_10102
         || var1 == class_2246.field_10534
         || var1 == class_2246.field_46283
         || var1 == class_2246.field_46282
         || var1 == class_2246.field_10147
         || var1 == class_2246.field_10302
         || var1 == class_2246.field_10114
         || var1 == class_2246.field_10362
         || var1 == class_2246.field_10033
         || var1 == class_2246.field_27115
         || var1 == class_2246.field_10029
         || var1 instanceof class_2533
         || var1 instanceof class_2482
         || var1 instanceof class_2269
         || this.C00OOC00oO(var1);
   }

   private boolean C00OOC00oO(class_2248 var1) {
      return var1 == class_2246.field_10087
         || var1 == class_2246.field_10227
         || var1 == class_2246.field_10574
         || var1 == class_2246.field_10271
         || var1 == class_2246.field_10049
         || var1 == class_2246.field_10157
         || var1 == class_2246.field_10317
         || var1 == class_2246.field_10555
         || var1 == class_2246.field_9996
         || var1 == class_2246.field_10248
         || var1 == class_2246.field_10399
         || var1 == class_2246.field_10060
         || var1 == class_2246.field_10073
         || var1 == class_2246.field_10357
         || var1 == class_2246.field_10272
         || var1 == class_2246.field_9997;
   }

   private String uUnuvNvvNU(class_2248 var1) {
      if (var1 == class_2246.field_10258 || var1 == class_2246.field_10562) {
         return "Губка";
      } else if (var1 == class_2246.field_10471) {
         return "Эндерняк";
      } else if (var1 == class_2246.field_10171) {
         return "Светокамень";
      } else if (var1 instanceof class_2533) {
         return "Люк";
      } else if (var1 == class_2246.field_10102 || var1 == class_2246.field_10534) {
         return "Песок";
      } else if (var1 == class_2246.field_46283) {
         return "Арбуз";
      } else if (var1 == class_2246.field_46282 || var1 == class_2246.field_10147) {
         return "Тыква";
      } else if (var1 == class_2246.field_10302) {
         return "Какао";
      } else if (var1 == class_2246.field_10114) {
         return "Песок душ";
      } else if (var1 == class_2246.field_10362) {
         return "Вспаханная земля";
      } else if (var1 instanceof class_2482) {
         return "Плита";
      } else if (var1 == class_2246.field_10033 || var1 == class_2246.field_27115 || this.C00OOC00oO(var1)) {
         return "Стекло";
      } else if (var1 == class_2246.field_10029) {
         return "Кактус";
      } else {
         return var1 instanceof class_2269 ? "Кнопка" : "HolyWorld блок";
      }
   }

   private void nnuUVNUuvvVU() {
      byte var1 = 100;
      NVUunUNUN.put(class_2246.field_10258, VnVnuUn.uNNnnnuuuN(new Color(222, 207, 67).getRGB(), (int)var1));
      NVUunUNUN.put(class_2246.field_10562, VnVnuUn.uNNnnnuuuN(new Color(172, 184, 68).getRGB(), (int)var1));
      NVUunUNUN.put(class_2246.field_10471, VnVnuUn.uNNnnnuuuN(new Color(226, 222, 156).getRGB(), (int)var1));
      NVUunUNUN.put(class_2246.field_10171, VnVnuUn.uNNnnnuuuN(new Color(255, 211, 91).getRGB(), (int)var1));
      NVUunUNUN.put(class_2246.field_10102, VnVnuUn.uNNnnnuuuN(new Color(219, 203, 142).getRGB(), (int)var1));
      NVUunUNUN.put(class_2246.field_10534, VnVnuUn.uNNnnnuuuN(new Color(190, 98, 38).getRGB(), (int)var1));
      NVUunUNUN.put(class_2246.field_46283, VnVnuUn.uNNnnnuuuN(new Color(85, 176, 57).getRGB(), (int)var1));
      NVUunUNUN.put(class_2246.field_46282, VnVnuUn.uNNnnnuuuN(new Color(214, 119, 27).getRGB(), (int)var1));
      NVUunUNUN.put(class_2246.field_10147, VnVnuUn.uNNnnnuuuN(new Color(214, 119, 27).getRGB(), (int)var1));
      NVUunUNUN.put(class_2246.field_10302, VnVnuUn.uNNnnnuuuN(new Color(111, 67, 36).getRGB(), (int)var1));
      NVUunUNUN.put(class_2246.field_10114, VnVnuUn.uNNnnnuuuN(new Color(83, 63, 55).getRGB(), (int)var1));
      NVUunUNUN.put(class_2246.field_10362, VnVnuUn.uNNnnnuuuN(new Color(110, 75, 41).getRGB(), (int)var1));
      NVUunUNUN.put(class_2246.field_10033, VnVnuUn.uNNnnnuuuN(new Color(180, 230, 240).getRGB(), (int)var1));
      NVUunUNUN.put(class_2246.field_27115, VnVnuUn.uNNnnnuuuN(new Color(80, 65, 95).getRGB(), (int)var1));
      NVUunUNUN.put(class_2246.field_10029, VnVnuUn.uNNnnnuuuN(new Color(56, 135, 45).getRGB(), (int)var1));
   }

   private int UuUVuuUu(Object var1) {
      Integer var2 = NVUunUNUN.get(var1);
      if (var2 != null) {
         return var2;
      } else {
         if (var1 instanceof class_2248 var3) {
            if (var3 instanceof class_2533) {
               return VnVnuUn.uNNnnnuuuN(new Color(128, 92, 51).getRGB(), 100);
            }

            if (var3 instanceof class_2482) {
               return VnVnuUn.uNNnnnuuuN(new Color(150, 150, 150).getRGB(), 100);
            }

            if (var3 instanceof class_2269) {
               return VnVnuUn.uNNnnnuuuN(new Color(178, 178, 178).getRGB(), 100);
            }

            if (this.C00OOC00oO(var3)) {
               return VnVnuUn.uNNnnnuuuN(new Color(125, 200, 230).getRGB(), 100);
            }
         }

         return -1;
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null && this.UvUvUNuvNU.uUnuvNvvNU()) {
         class_4598 var2 = nNNnNvVVv.UuUVuuUu();

         try {
            class_243 var3 = uUnuvNvvNU.field_1773.method_19418().method_19326();
            Matrix4f var4 = var1.uUnuvNvvNU().method_23760().method_23761();
            class_4588 var5 = var2.getBuffer(UnnnvvU);

            for (class_2338 var7 : this.UUVNuUNUvUnV) {
               double var8 = var7.method_10263() + 0.5 - var3.field_1352;
               double var10 = var7.method_10264() + 0.5 - var3.field_1351;
               double var12 = var7.method_10260() + 0.5 - var3.field_1350;
               if (!(var8 * var8 + var10 * var10 + var12 * var12 > 16384.0)) {
                  Object var14 = this.vuvnUnVnUNnV.get(var7);
                  int var15 = this.UuUVuuUu(var14);
                  if (var15 != -1) {
                     this.UuUVuuUu(var5, var4, var3, var7, var15);
                  }
               }
            }

            if (this.uVunuUNVVUUV.uUnuvNvvNU() || this.UNnVVNvvnVvU.uUnuvNvvNU()) {
               for (class_1297 var20 : uUnuvNvvNU.field_1687.method_18112()) {
                  if (this.nnuUVNUuvvVU.contains(var20.method_5628())) {
                     int var21 = -1;
                     if (var20 instanceof class_1694) {
                        var21 = NVUunUNUN.get(class_1694.class);
                     } else if (var20 instanceof class_1700) {
                        var21 = NVUunUNUN.get(class_1700.class);
                     } else if (var20 instanceof class_1646) {
                        var21 = NVUunUNUN.get(class_1646.class);
                     } else if (var20 instanceof class_5762) {
                        var21 = NVUunUNUN.get(class_5762.class);
                     }

                     if (var21 != -1) {
                        uUVNNUvvn.NVnVnNnN.NVnVnNnN.UuUVuuUu(
                           var5,
                           var4,
                           (float)(var20.method_23317() - 0.5 - var3.field_1352),
                           (float)(var20.method_23318() - var3.field_1351),
                           (float)(var20.method_23321() - 0.5 - var3.field_1350),
                           (float)(var20.method_23317() + 0.5 - var3.field_1352),
                           (float)(var20.method_23318() + 0.5 - var3.field_1351),
                           (float)(var20.method_23321() + 0.5 - var3.field_1350),
                           var21
                        );
                     }
                  }
               }
            }
         } finally {
            nNNnNvVVv.C00OOC00oO();
         }
      }
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, class_243 var3, class_2338 var4, int var5) {
      float var6 = (float)(var4.method_10263() - var3.field_1352);
      float var7 = (float)(var4.method_10264() - var3.field_1351);
      float var8 = (float)(var4.method_10260() - var3.field_1350);
      float var9 = (float)(var4.method_10263() + 1 - var3.field_1352);
      float var10 = (float)(var4.method_10264() + 1 - var3.field_1351);
      float var11 = (float)(var4.method_10260() + 1 - var3.field_1350);
      uUVNNUvvn.NVnVnNnN.NVnVnNnN.UuUVuuUu(var1, var2, var6, var7, var8, var9, var10, var11, var5);
   }

   private void C00OOC00oO(String var1) {
      vVnvuVVUunuv.UuUVuuUu("§5[BaseFinder] " + var1);
   }

   private boolean uUnuvNvvNU(String var1) {
      if (this.unNNVVNnvvV.C00OOC00oO("HolyWorld")) {
         return var1.contains("перекрывает другой регион") || var1.contains("не можете разместить блок привата");
      } else {
         return !this.unNNVVNnvvV.C00OOC00oO("FunTime") && !this.unNNVVNnvvV.C00OOC00oO("Поиск приватом")
            ? false
            : var1.contains("Ваш регион пересекается") || var1.contains("[✠]") && var1.contains("пересекается");
      }
   }

   private boolean vVvUvVVuuNvV(String var1) {
      if (this.unNNVVNnvvV.C00OOC00oO("HolyWorld")) {
         return var1.contains("Регион успешно создан") || var1.contains("успешно") && var1.contains("регион");
      } else {
         return !this.unNNVVNnvvV.C00OOC00oO("FunTime") && !this.unNNVVNnvvV.C00OOC00oO("Поиск приватом")
            ? false
            : var1.contains("Регион успешно создан") || var1.contains("[✠]") && var1.contains("успешно");
      }
   }

   private void uNNnnnuuuN(String var1) {
      try {
         IBaritone var2 = BaritoneAPI.getProvider().getPrimaryBaritone();
         if (var2 != null) {
            var2.getCommandManager().execute(var1);
         }
      } catch (Throwable var3) {
      }
   }

   static enum NVnVnNnN {
      CHECK_SUPPLIES,
      TUNNELING,
      BORDER_SHIFTING,
      STOPPING,
      DIGGING_SPOT,
      PLACING,
      WAITING_CHAT,
      BREAKING,
      RESUMING;
   }
}
