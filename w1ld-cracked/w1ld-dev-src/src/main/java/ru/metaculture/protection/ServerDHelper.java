package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.awt.Color;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_10799;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1531;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1826;
import net.minecraft.class_1921;
import net.minecraft.class_1923;
import net.minecraft.class_2190;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2586;
import net.minecraft.class_2595;
import net.minecraft.class_2818;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_3719;
import net.minecraft.class_3965;
import net.minecraft.class_4184;
import net.minecraft.class_4588;
import net.minecraft.class_476;
import net.minecraft.class_5611;
import net.minecraft.class_7439;
import net.minecraft.class_1921.class_4688;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "ServerDHelper",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Удобный модуль для данжа варден, подсветка а так же автоматический лут сундуков"
)
public class ServerDHelper extends Module {
   public final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим", "Варден", "Варден", "Медный данж");
   public final UvNnUnuNUUU uVunuUNVVUUV = new UvNnUnuNUUU("Режим работы", "Лутающий", "Лутающий", "Складывающий");
   public final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Складывать дроп в клан", false);
   public final UvNnUnuNUUU uNnUnnuNUnNu = new UvNnUnuNUUU("Режим", "Авто", "Авто", "По бинду").UuUVuuUu(() -> !this.UNnVVNvvnVvU.uUnuvNvvNU());
   public final uVNuNUVvn NnUuNNU = new uVNuNUVvn("Бинд", -1).UuUVuuUu(() -> !this.uNnUnnuNUnNu.C00OOC00oO("По бинду"));
   public final VUVnvvnNN nNvNUVU = new VUVnvvnNN(
      "Предметы для лута",
      new vvNnnUNnVvn("Дон зелья", false),
      new vvNnnUNnVvn("Сферы", false),
      new vvNnnUNnVvn("Талисманы", false),
      new vvNnnUNnVvn("Модификаторы", false),
      new vvNnnUNnVvn("Незер вещи", false),
      new vvNnnUNnVvn("Стрелы", false),
      new vvNnnUNnVvn("Ценные предметы", false),
      new vvNnnUNnVvn("Яйца", false).UuUVuuUu(() -> !this.UNnVVNvvnVvU.uUnuvNvvNU())
   );
   public final vvNnnUNnVvn UnUNuUU = new vvNnnUNnVvn("Установка точки на сундук", true);
   public final vvNnnUNnVvn uUVuVvuNUvnu = new vvNnnUNnVvn("Ротация на сундук", false);
   public final uVNuNUVvn UvUvUNuvNU = new uVNuNUVvn("Бинд на уст. сундука", -1).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("Складывающий"));
   public final vvNnnUNnVvn c0oOOCcCoC0 = new vvNnnUNnVvn("Не отображать экран", false);
   public static final Map<class_2338, Long> VVnVNnunVvu = new HashMap<>();
   public static final Map<class_2338, Long> unNNVVNnvvV = new HashMap<>();
   private final Queue<Runnable> NuunnvnN = new ArrayDeque<>();
   private final Set<class_2338> NVUunUNUN = new HashSet<>();
   private final Set<class_2338> UUVNuUNUvUnV = new HashSet<>();
   private final Map<class_2338, ServerDHelper.nvnNNunvv> vuvnUnVnUNnV = new HashMap<>();
   private final Map<class_2338, Long> nnuUVNUuvvVU = new HashMap<>();
   private final Map<String, Integer> nVVUuvuNnUN = new HashMap<>();
   private class_2338 nNnVnUNVV = null;
   private class_2338 nuunNvv = null;
   private ServerDHelper.VvunVVUvUNnv uUVVvVVNvvn = ServerDHelper.VvunVVUvUNnv.IDLE;
   private ServerDHelper.NVnVnNnN vvUVNVvvNUv = ServerDHelper.NVnVnNnN.IDLE;
   private final VuNvNNvVV UuNnnVnuNNV = new VuNvNNvVV();
   private final VuNvNNvVV uUVvnUuNvvN = new VuNvNNvVV();
   private final VuNvNNvVV UUuUnNVNuuv = new VuNvNNvVV();
   private final VuNvNNvVV NVuNUuVnVUN = new VuNvNNvVV();
   private final Set<class_2338> NVuunNnvvvVu = new HashSet<>();
   private final Map<class_2338, Long> vNnNuuvVn = new HashMap<>();
   private int VUuuVUnun = 0;
   private boolean vVVuuVVv = true;
   private boolean VuunNUUUvu = false;
   private final VuNvNNvVV NNUUNUuVNNVn = new VuNvNNvVV();
   private String VvVvnNUnvuvV = "N/A";
   private long ccOO0COcoco0 = 500L;
   private static final long NUVvUUVuVNVv = 45000L;
   private boolean nNuVunNUVu = false;
   private long UNvvunVVn = 0L;
   private class_476 UnvuVuVnNuvu;
   private static final int[] UvNNVUVNVuvV = new int[]{10, 11, 12, 13, 14, 15, 16, 19, 20, 21, 22, 23, 24, 25, 28, 29, 30, 31, 32, 33, 34};
   private static final Pattern NnunUUnU = Pattern.compile("(\\d{1,2}):(\\d{1,2})");
   private static final Pattern nvuVvuNnNUnv = Pattern.compile("(\\d{1,2}):(\\d{2})(?::(\\d{2}))?");
   private static final Pattern NnVnNVN = Pattern.compile("(\\d+)\\s*(с|s|сек|sec)");
   private static final Set<String> vnvvNvUnVv = Set.of(
      "модификатор варпов",
      "модификатор вещания",
      "модификатор возврата",
      "модификатор исцеления",
      "модификатор наковальни",
      "модификатор насыщения",
      "модификатор очистки",
      "модификатор переименования",
      "модификатор подъёма",
      "модификатор починки",
      "модификатор прыжка",
      "модификатор эндер-сундука"
   );
   private static final double OCOocoOoOO = 2000.0;
   private static final double o0Ooc0COOoc = 2000.0;
   private static final double nvvnUnUn = 62500.0;
   private static final int UnUUVuVunvVu = 1024;
   private static final RenderPipeline nnvuvUNuUnN = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "block_esp_box"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final class_1921 UVnuVUUVnnU = class_1921.method_24049(
      "chest_esp_box", 1024, false, true, nnvuvUNuUnN, class_4688.method_23598().method_23617(false)
   );

   public ServerDHelper() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.NVNnnvnuunNv,
            this.uVunuUNVVUUV,
            this.UNnVVNvvnVvU,
            this.uNnUnnuNUnNu,
            this.NnUuNNU,
            this.UvUvUNuvNU,
            this.nNvNUVU,
            this.UnUNuUU,
            this.uUVuVvuNUvnu,
            this.c0oOOCcCoC0
         }
      );
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      if (uUnuvNvvNU.field_1690 != null) {
         this.vVVuuVVv = uUnuvNvvNU.field_1690.field_1837;
         uUnuvNvvNU.field_1690.field_1837 = false;
      }
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      this.NuunnvnN.clear();
      this.vuvnUnVnUNnV.clear();
      this.nnuUVNUuvvVU.clear();
      if (uUnuvNvvNU.field_1690 != null) {
         uUnuvNvvNU.field_1690.field_1837 = this.vVVuuVVv;
      }

      if (!this.UUVNuUNUvUnV.isEmpty()) {
         oO0OcCC0OCO.UuUVuuUu = new class_5611(Float.MAX_VALUE, Float.MAX_VALUE);
         this.UUVNuUNUvUnV.clear();
      }

      this.uUVVvVVNvvn = ServerDHelper.VvunVVUvUNnv.IDLE;
      this.vvUVNVvvNUv = ServerDHelper.NVnVnNnN.IDLE;
      this.nuunNvv = null;
      this.VUuuVUnun = 0;
      this.UnvuVuVnNuvu = null;
      this.vNnNuuvVn.clear();
      this.UNnVVNvvnVvU();
      this.VuunNUUUvu = false;
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(CocoCOCco0C var1) {
      if (this.c0oOOCcCoC0.uUnuvNvvNU() && var1.uUnuvNvvNU() instanceof class_476 var2) {
         this.UnvuVuVnNuvu = var2;
         var1.vVvUvVVuuNvV();
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(coOCCcooOcOO var1) {
      this.NVUunUNUN.clear();
      this.UUVNuUNUvUnV.clear();
      this.NVuunNnvvvVu.clear();
      this.vNnNuuvVn.clear();
      this.nuunNvv = null;
      this.vvUVNVvvNUv = ServerDHelper.NVnVnNnN.IDLE;
      this.VUuuVUnun = 0;
      this.UnvuVuVnNuvu = null;
      this.NuunnvnN.clear();
      this.vuvnUnVnUNnV.clear();
      this.nnuUVNUuvvVU.clear();
      this.UNnVVNvvnVvU();
   }

   private boolean UuuNnUvUuv() {
      if (uUnuvNvvNU.field_1724 == null) {
         return false;
      } else {
         double var1 = uUnuvNvvNU.field_1724.method_23317();
         double var3 = uUnuvNvvNU.field_1724.method_23318();
         double var5 = uUnuvNvvNU.field_1724.method_23321();
         return !this.NVNnnvnuunNv.C00OOC00oO("Варден")
            ? (var1 - 2000.0) * (var1 - 2000.0) + (var5 - 2000.0) * (var5 - 2000.0) <= 62500.0
            : var1 >= -2072.0 && var1 <= -1928.0 && var3 >= -56.0 && var3 <= -29.0 && var5 >= -2071.0 && var5 <= -1929.0;
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (this.VuunNUUUvu) {
            if (this.NNUUNUuVNNVn.uNNnnnuuuN(2000L)) {
               if (!"N/A".equals(this.VvVvnNUnvuvV)) {
                  uUnuvNvvNU.field_1724.field_3944.method_45730("an" + this.VvVvnNUnvuvV);
                  vVnvuVVUunuv.UuUVuuUu("§8[§6ServerDHelper§8] §aВозвращаемся на Анархию-" + this.VvVvnNUnvuvV);
               } else {
                  vVnvuVVUunuv.UuUVuuUu("§8[§6ServerDHelper§8] §cНе удалось определить номер анархии для реконнекта!");
               }

               this.VuunNUUUvu = false;
               if (this.uVunuUNVVUUV.C00OOC00oO("Складывающий")) {
                  this.ccOO0COcoco0 = 4000L;
                  this.uUVVvVVNvvn = ServerDHelper.VvunVVUvUNnv.REOPEN_CLAN;
                  this.UuNnnVnuNNV.UuUVuuUu();
               }
            }
         } else {
            boolean var2 = this.UuuNnUvUuv();
            if (!this.uVunuUNVVUUV.C00OOC00oO("Лутающий") || var2) {
               if (this.uVunuUNVVUUV.C00OOC00oO("Лутающий")) {
                  this.UvnvNVnnnnNU();
                  if (this.nNuVunNUVu && !this.vNVuvnUUnuUn() && System.currentTimeMillis() > this.UNvvunVVn) {
                     uUnuvNvvNU.field_1724.field_3944.method_45730("clan storage");
                     this.nNuVunNUVu = false;
                  }
               } else if (this.uVunuUNVVUUV.C00OOC00oO("Складывающий") && this.nNnVnUNVV != null) {
                  this.uVUVnuvnuVuv();
               }

               class_476 var3 = this.nUUVuvU();
               if (var3 != null) {
                  class_1707 var4 = (class_1707)var3.method_17577();
                  String var5 = var3.method_25440().getString().toLowerCase().replaceAll("§.", "").trim();
                  boolean var6 = var5.contains("клан") || var5.contains("clan") || var5.contains("хранилище");
                  if (this.uVunuUNVVUUV.C00OOC00oO("Лутающий")) {
                     if (var6) {
                        this.vVvUvVVuuNvV(var4);
                     } else {
                        boolean var7 = this.NVNnnvnuunNv.C00OOC00oO("Варден")
                           ? var5.equals("сундук") || var5.equals("большой сундук") || var5.equals("chest") || var5.equals("large chest")
                           : var5.equals("бочка") || var5.equals("barrel");
                        if (var7) {
                           this.uUnuvNvvNU(var4);
                        }
                     }
                  } else if (this.uVunuUNVVUUV.C00OOC00oO("Складывающий")) {
                     if (var6) {
                        this.UuUVuuUu(var4);
                     } else {
                        this.C00OOC00oO(var4);
                     }
                  }
               }
            }
         }
      }
   }

   private class_476 nUUVuvU() {
      class_476 var1 = VuUNvNNvvnV.UuUVuuUu(uUnuvNvvNU, this.UnvuVuVnNuvu, class_476.class);
      if (var1 == null) {
         this.UnvuVuVnNuvu = null;
      }

      return var1;
   }

   private boolean UnUNVVVNuv() {
      return this.nUUVuvU() != null;
   }

   private boolean vNVuvnUUnuUn() {
      return VuUNvNNvvnV.C00OOC00oO(uUnuvNvvNU, this.UnvuVuVnNuvu) || VuUNvNNvvnV.UuUVuuUu(uUnuvNvvNU);
   }

   private void UvnvNVnnnnNU() {
      if (!this.uUVuVvuNUvnu.uUnuvNvvNU()
         || !this.uVunuUNVVUUV.C00OOC00oO("Лутающий")
         || uUnuvNvvNU.field_1724 == null
         || uUnuvNvvNU.field_1687 == null
         || uUnuvNvvNU.field_1761 == null) {
         this.uVunuUNVVUUV();
      } else if (this.UnUNVVVNuv()) {
         if (this.nuunNvv != null) {
            this.UuUVuuUu(this.nuunNvv);
         }

         this.uVunuUNVVUUV();
      } else {
         if (this.vvUVNVvvNUv == ServerDHelper.NVnVnNnN.IDLE) {
            class_2338 var1 = this.NVNnnvnuunNv();
            if (var1 == null) {
               return;
            }

            this.nuunNvv = var1;
            this.vvUVNVvvNUv = ServerDHelper.NVnVnNnN.ROTATING;
            this.VUuuVUnun = 0;
            this.uUVvnUuNvvN.UuUVuuUu();
         }

         if (this.nuunNvv != null && this.vVvUvVVuuNvV(this.nuunNvv)) {
            switch (this.vvUVNVvvNUv) {
               case IDLE:
               default:
                  break;
               case ROTATING:
                  uuUuvNuNVNVU var2 = this.UuUVuuUu(class_243.method_24953(this.nuunNvv));
                  COC0OCc.UuUVuuUu(var2, 999.0F, 999.0F, 60.0F, 60.0F, 2, 3, false);
                  if (new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var2) < 3.0F || this.uUVvnUuNvvN.uNNnnnuuuN(120L)) {
                     this.UNnVVNvvnVvU();
                     this.vvUVNVvvNUv = ServerDHelper.NVnVnNnN.OPENING;
                     this.uUVvnUuNvvN.UuUVuuUu();
                  }
                  break;
               case OPENING:
                  if (this.uNnUnnuNUnNu()) {
                     this.uUVvnUuNvvN.UuUVuuUu();
                     return;
                  }

                  if (this.uUVvnUuNvvN.uNNnnnuuuN(90L)) {
                     this.C00OOC00oO(this.nuunNvv);
                     this.VUuuVUnun++;
                     this.vvUVNVvvNUv = ServerDHelper.NVnVnNnN.WAITING_SCREEN;
                     this.uUVvnUuNvvN.UuUVuuUu();
                  }
                  break;
               case WAITING_SCREEN:
                  if (this.uUVvnUuNvvN.uNNnnnuuuN(1400L)) {
                     if (this.VUuuVUnun >= 2) {
                        this.UuUVuuUu(this.nuunNvv);
                        this.uVunuUNVVUUV();
                     } else {
                        this.vvUVNVvvNUv = ServerDHelper.NVnVnNnN.ROTATING;
                        this.uUVvnUuNvvN.UuUVuuUu();
                     }
                  }
            }
         } else {
            this.uVunuUNVVUUV();
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vVvuNVUVvNv var1) {
      if (uUnuvNvvNU.field_1724 != null) {
         if (this.uVunuUNVVUUV.C00OOC00oO("Складывающий") && var1.vVvUvVVuuNvV() == this.UvUvUNuvNU.uUnuvNvvNU()) {
            if (uUnuvNvvNU.field_1765 instanceof class_3965 var2) {
               class_2338 var4 = var2.method_17777();
               if (uUnuvNvvNU.field_1687 == null
                  || !(uUnuvNvvNU.field_1687.method_8321(var4) instanceof class_2595) && !(uUnuvNvvNU.field_1687.method_8321(var4) instanceof class_3719)) {
                  vVnvuVVUunuv.UuUVuuUu("§8[§6ServerDHelper§8] §cСмотрите на сундук или бочку!");
               } else {
                  this.nNnVnUNVV = var4;
                  vVnvuVVUunuv.UuUVuuUu("§8[§6ServerDHelper§8] §aБазовый сундук установлен: " + var4.method_23854());
               }
            }
         } else if (!this.uVunuUNVVUUV.C00OOC00oO("Лутающий") || this.UuuNnUvUuv()) {
            if (this.uVunuUNVVUUV.C00OOC00oO("Лутающий")
               && this.UNnVVNvvnVvU.uUnuvNvvNU()
               && this.uNnUnnuNUnNu.C00OOC00oO("По бинду")
               && var1.vVvUvVVuuNvV() == this.NnUuNNU.uUnuvNvvNU()
               && !this.nVVUuvuNnUN.isEmpty()) {
               uUnuvNvvNU.field_1724.field_3944.method_45730("clan storage");
            }
         }
      }
   }

   private void uVUVnuvnuVuv() {
      if (!this.vNVuvnUUnuUn() && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         switch (this.uUVVvVVNvvn) {
            case IDLE:
            default:
               break;
            case ROTATING:
               uuUuvNuNVNVU var1 = this.UuUVuuUu(
                  new class_243(this.nNnVnUNVV.method_10263() + 0.5, this.nNnVnUNVV.method_10264() + 0.5, this.nNnVnUNVV.method_10260() + 0.5)
               );
               COC0OCc.UuUVuuUu(var1, 35.0F, 35.0F, 35.0F, 35.0F, 20, 1, false);
               if (new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var1) < 4.0F) {
                  this.UNnVVNvvnVvU();
                  this.uUVVvVVNvvn = ServerDHelper.VvunVVUvUNnv.OPENING;
                  this.UuNnnVnuNNV.UuUVuuUu();
               }
               break;
            case OPENING:
               if (this.uNnUnnuNUnNu()) {
                  this.UuNnnVnuNNV.UuUVuuUu();
               } else if (this.UuNnnVnuNNV.uNNnnnuuuN(100L)) {
                  this.C00OOC00oO(this.nNnVnUNVV);
                  this.uUVVvVVNvvn = ServerDHelper.VvunVVUvUNnv.IDLE;
               }
               break;
            case REOPEN_CLAN:
               if (this.UuNnnVnuNNV.uNNnnnuuuN(this.ccOO0COcoco0)) {
                  uUnuvNvvNU.field_1724.field_3944.method_45730("clan storage");
                  this.uUVVvVVNvvn = ServerDHelper.VvunVVUvUNnv.IDLE;
                  this.ccOO0COcoco0 = 500L;
               }
         }
      }
   }

   private class_2338 NVNnnvnuunNv() {
      long var1 = System.currentTimeMillis();
      this.UuUVuuUu(var1);
      class_2338 var3 = null;
      double var4 = Double.MAX_VALUE;

      for (Entry var7 : new HashMap<>(unNNVVNnvvV).entrySet()) {
         class_2338 var8 = (class_2338)var7.getKey();
         if ((Long)var7.getValue() > var1 && !this.NVuunNnvvvVu.contains(var8) && !this.UuUVuuUu(var8, var1) && this.vVvUvVVuuNvV(var8)) {
            double var9 = uUnuvNvvNU.field_1724.method_5707(class_243.method_24953(var8));
            if (!(var9 > 36.0) && var9 < var4) {
               var4 = var9;
               var3 = var8.method_10062();
            }
         }
      }

      return var3;
   }

   private void uVunuUNVVUUV() {
      boolean var1 = this.vvUVNVvvNUv != ServerDHelper.NVnVnNnN.IDLE || this.nuunNvv != null || this.VUuuVUnun != 0;
      this.nuunNvv = null;
      this.vvUVNVvvNUv = ServerDHelper.NVnVnNnN.IDLE;
      this.VUuuVUnun = 0;
      if (var1) {
         this.UNnVVNvvnVvU();
      }
   }

   private void UuUVuuUu(class_2338 var1) {
      if (var1 != null) {
         class_2338 var2 = var1.method_10062();
         this.NVuunNnvvvVu.add(var2);
         this.vNnNuuvVn.put(var2, System.currentTimeMillis() + 45000L);
         unNNVVNnvvV.remove(var2);
         this.UUVNuUNUvUnV.remove(var2);
      }
   }

   private boolean UuUVuuUu(class_2338 var1, long var2) {
      Long var4 = this.vNnNuuvVn.get(var1);
      if (var4 == null) {
         return false;
      } else if (var4 <= var2) {
         this.vNnNuuvVn.remove(var1);
         return false;
      } else {
         return true;
      }
   }

   private void UuUVuuUu(long var1) {
      this.vNnNuuvVn.entrySet().removeIf(var2 -> var2.getValue() <= var1);
   }

   private void UNnVVNvvnVvU() {
      COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
      COC0OCc.nuUnNvnuUu = 0;
      COC0OCc.uVUuuVnNVU = null;
      NNvvnnunn.UuUVuuUu = false;
   }

   private boolean uNnUnnuNUnNu() {
      int var1 = uUnuvNvvNU.field_1724.method_31548().method_67532();
      class_1799 var2 = (class_1799)uUnuvNvvNU.field_1724.method_31548().method_67533().get(var1);
      if (!this.UuUVuuUu(var2)) {
         return false;
      } else {
         for (int var3 = 0; var3 < 9; var3++) {
            class_1799 var4 = (class_1799)uUnuvNvvNU.field_1724.method_31548().method_67533().get(var3);
            if (var4.method_7960() || !this.UuUVuuUu(var4)) {
               uUnuvNvvNU.field_1724.method_31548().method_61496(var3);
               return true;
            }
         }

         return false;
      }
   }

   private boolean UuUVuuUu(class_1799 var1) {
      if (var1.method_7960()) {
         return false;
      } else {
         String var2 = var1.method_7964().getString();
         return var1.method_7909() == class_1802.field_8366 || var2.contains("[★]") || var2.contains("[в\u0098…]");
      }
   }

   private void C00OOC00oO(class_2338 var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         class_2350 var2 = this.uUnuvNvvNU(var1);
         class_243 var3 = new class_243(
            var1.method_10263() + 0.5 + var2.method_10148() * 0.5,
            var1.method_10264() + 0.5 + var2.method_10164() * 0.5,
            var1.method_10260() + 0.5 + var2.method_10165() * 0.5
         );
         class_3965 var4 = new class_3965(var3, var2, var1, false);
         uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
         uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var4);
      }
   }

   private class_2350 uUnuvNvvNU(class_2338 var1) {
      class_243 var2 = class_243.method_24953(var1);
      class_243 var3 = uUnuvNvvNU.field_1724.method_33571().method_1020(var2);
      return class_2350.method_10142(var3.field_1352, var3.field_1351, var3.field_1350);
   }

   private boolean vVvUvVVuuNvV(class_2338 var1) {
      if (uUnuvNvvNU.field_1687 == null) {
         return false;
      } else {
         class_2586 var2 = uUnuvNvvNU.field_1687.method_8321(var1);
         return this.NVNnnvnuunNv.C00OOC00oO("Варден") ? var2 instanceof class_2595 : var2 instanceof class_3719;
      }
   }

   private void UuUVuuUu(class_1707 var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         if (this.UUuUnNVNuuv.uNNnnnuuuN(100L)) {
            boolean var2 = true;
            boolean var3 = false;

            for (int var4 = 0; var4 < 36; var4++) {
               class_1799 var5 = (class_1799)uUnuvNvvNU.field_1724.method_31548().method_67533().get(var4);
               if (var5.method_7960()) {
                  var2 = false;
               } else {
                  var3 = true;
               }
            }

            boolean var11 = false;
            boolean var12 = false;

            for (int var9 : UvNNVUVNVuvV) {
               if (var9 < var1.field_7761.size()) {
                  class_1735 var10 = (class_1735)var1.field_7761.get(var9);
                  if (var10.method_7681() && var10.method_7677().method_7909() != class_1802.field_8162) {
                     var12 = true;
                     if (!var2) {
                        uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var9, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
                        var11 = true;
                     }
                  }
               }
            }

            if (var11) {
               this.UUuUnNVNuuv.UuUVuuUu();
            } else if (var3 && (var2 || !var12)) {
               uUnuvNvvNU.field_1724.method_7346();
               this.uUVVvVVNvvn = ServerDHelper.VvunVVUvUNnv.ROTATING;
            }
         }
      }
   }

   private void C00OOC00oO(class_1707 var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         int var2 = var1.field_7761.size() - 36;

         for (int var3 = var2; var3 < var1.field_7761.size(); var3++) {
            class_1735 var4 = (class_1735)var1.field_7761.get(var3);
            if (var4.method_7681() && var4.method_7677().method_7909() != class_1802.field_8162) {
               if (this.NVuNUuVnVUN.uNNnnnuuuN(150L)) {
                  uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var3, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
                  this.NVuNUuVnVUN.UuUVuuUu();
               }

               return;
            }
         }

         uUnuvNvvNU.field_1724.method_7346();
         this.uUVVvVVNvvn = ServerDHelper.VvunVVUvUNnv.REOPEN_CLAN;
         this.UuNnnVnuNNV.UuUVuuUu();
      }
   }

   private void uUnuvNvvNU(class_1707 var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         int var2 = var1.field_7761.size() - 36;

         for (int var3 = 0; var3 < var2; var3++) {
            class_1735 var4 = (class_1735)var1.field_7761.get(var3);
            if (var4.method_7681() && this.uUnuvNvvNU(var4.method_7677())) {
               if (this.UUuUnNVNuuv.uNNnnnuuuN(50L)) {
                  class_1799 var5 = var4.method_7677().method_7972();
                  String var6 = this.C00OOC00oO(var5);
                  this.nVVUuvuNnUN.put(var6, this.nVVUuvuNnUN.getOrDefault(var6, 0) + var5.method_7947());
                  uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var3, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
                  this.UUuUnNVNuuv.UuUVuuUu();
               }

               return;
            }
         }

         uUnuvNvvNU.field_1724.method_7346();
         this.UuUVuuUu(this.nuunNvv);
         this.uVunuUNVVUUV();
         if (this.UNnVVNvvnVvU.uUnuvNvvNU() && this.uNnUnnuNUnNu.C00OOC00oO("Авто") && !this.nVVUuvuNnUN.isEmpty()) {
            this.nNuVunNUVu = true;
            this.UNvvunVVn = System.currentTimeMillis() + 400L;
         }
      }
   }

   private void vVvUvVVuuNvV(class_1707 var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         if (!this.NuunnvnN.isEmpty()) {
            if (this.UUuUnNVNuuv.uNNnnnuuuN(50L)) {
               this.NuunnvnN.poll().run();
               this.UUuUnNVNuuv.UuUVuuUu();
            }
         } else if (this.nVVUuvuNnUN.isEmpty()) {
            uUnuvNvvNU.field_1724.method_7346();
         } else {
            int var2 = var1.field_7761.size() - 36;
            boolean var3 = false;

            for (int var4 = var2; var4 < var1.field_7761.size(); var4++) {
               class_1735 var5 = (class_1735)var1.field_7761.get(var4);
               if (var5.method_7681()) {
                  String var6 = this.C00OOC00oO(var5.method_7677());
                  int var7 = this.nVVUuvuNnUN.getOrDefault(var6, 0);
                  if (var7 > 0) {
                     var3 = true;
                     int var8 = var5.method_7677().method_7947();
                     if (var8 <= var7) {
                        this.NuunnvnN.add(() -> uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var4, 0, class_1713.field_7794, uUnuvNvvNU.field_1724));
                        int var10 = var7 - var8;
                        if (var10 <= 0) {
                           this.nVVUuvuNnUN.remove(var6);
                        } else {
                           this.nVVUuvuNnUN.put(var6, var10);
                        }
                     } else {
                        int var9 = -1;

                        for (int var15 = 0; var15 < var2; var15++) {
                           if (!((class_1735)var1.field_7761.get(var15)).method_7681()) {
                              var9 = var15;
                              break;
                           }
                        }

                        if (var9 == -1) {
                           this.nVVUuvuNnUN.clear();
                           this.NuunnvnN.clear();
                           uUnuvNvvNU.field_1724.method_7346();
                           return;
                        }

                        int var16 = var9;
                        int var11 = var4;
                        this.NuunnvnN.add(() -> uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var11, 0, class_1713.field_7790, uUnuvNvvNU.field_1724));
                        if (var7 <= var8 / 2) {
                           for (int var17 = 0; var17 < var7; var17++) {
                              this.NuunnvnN
                                 .add(() -> uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var16, 1, class_1713.field_7790, uUnuvNvvNU.field_1724));
                           }

                           this.NuunnvnN.add(() -> uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var11, 0, class_1713.field_7790, uUnuvNvvNU.field_1724));
                        } else {
                           int var12 = var8 - var7;

                           for (int var13 = 0; var13 < var12; var13++) {
                              this.NuunnvnN
                                 .add(() -> uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var11, 1, class_1713.field_7790, uUnuvNvvNU.field_1724));
                           }

                           this.NuunnvnN.add(() -> uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var16, 0, class_1713.field_7790, uUnuvNvvNU.field_1724));
                        }

                        this.nVVUuvuNnUN.remove(var6);
                     }

                     return;
                  }
               }
            }

            if (!var3) {
               this.nVVUuvuNnUN.clear();
               this.NuunnvnN.clear();
               uUnuvNvvNU.field_1724.method_7346();
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         boolean var2 = this.UuuNnUvUuv();
         if (!this.uVunuUNVVUUV.C00OOC00oO("Лутающий") || var2) {
            class_4598 var3 = nNNnNvVVv.UuUVuuUu();

            try {
               class_243 var4 = uUnuvNvvNU.field_1773.method_19418().method_19326();
               Matrix4f var5 = var1.uUnuvNvvNU().method_23760().method_23761();
               class_4588 var6 = var3.getBuffer(UVnuVUUVnnU);
               if (!var2) {
                  if (this.nNnVnUNVV != null) {
                     this.UuUVuuUu(var6, var5, this.nNnVnUNVV, var4, new Color(150, 50, 255, 120), new Color(150, 50, 255, 0));
                  }

                  return;
               }

               class_1923 var7 = uUnuvNvvNU.field_1724.method_31476();
               int var8 = (Integer)uUnuvNvvNU.field_1690.method_42503().method_41753();
               HashSet var9 = new HashSet();
               boolean var10 = this.NVNnnvnuunNv.C00OOC00oO("Варден");

               for (int var11 = var7.field_9181 - var8; var11 <= var7.field_9181 + var8; var11++) {
                  for (int var12 = var7.field_9180 - var8; var12 <= var7.field_9180 + var8; var12++) {
                     class_2818 var13 = uUnuvNvvNU.field_1687.method_8497(var11, var12);
                     if (var13 != null) {
                        for (class_2586 var15 : var13.method_12214().values()) {
                           class_2338 var16 = var15.method_11016();
                           if (this.nNnVnUNVV != null && var16.equals(this.nNnVnUNVV)) {
                              this.UuUVuuUu(var6, var5, this.nNnVnUNVV, var4, new Color(150, 50, 255, 120), new Color(150, 50, 255, 0));
                           } else {
                              boolean var17 = var10 ? var15 instanceof class_2595 : var15 instanceof class_3719;
                              if (var17) {
                                 double var18 = var16.method_10263() + 0.5;
                                 double var20 = var16.method_10264() + 0.5;
                                 double var22 = var16.method_10260() + 0.5;
                                 Iterator var24 = uUnuvNvvNU.field_1687.method_18112().iterator();

                                 while (true) {
                                    if (var24.hasNext()) {
                                       class_1297 var25 = (class_1297)var24.next();
                                       if (!(var25 instanceof class_1531) || !(var25.method_5649(var18, var20, var22) <= 4.0)) {
                                          continue;
                                       }

                                       long var26 = this.UuUVuuUu(var25.method_5477().getString(), var10);
                                       if (var26 == -1L) {
                                          continue;
                                       }

                                       VVnVNnunVvu.put(var16, System.currentTimeMillis() + var26);
                                       this.nnuUVNUuvvVU.merge(var16, var26, Long::max);
                                       if (!this.UuUVuuUu(var16, System.currentTimeMillis())) {
                                          this.NVuunNnvvvVu.remove(var16);
                                       }
                                    }

                                    boolean var36 = false;
                                    long var37 = 0L;
                                    if (VVnVNnunVvu.containsKey(var16)) {
                                       var37 = VVnVNnunVvu.get(var16) - System.currentTimeMillis();
                                       if (var37 > 0L) {
                                          var36 = true;
                                          var9.add(var16);
                                          this.NVUunUNUN.add(var16);
                                          if (var37 <= 5000L && this.UnUNuUU.uUnuvNvvNU() && !this.UUVNuUNUvUnV.contains(var16)) {
                                             oO0OcCC0OCO.UuUVuuUu(var16.method_10263(), var16.method_10260());
                                             this.UUVNuUNUvUnV.add(var16);
                                          }
                                       } else {
                                          VVnVNnunVvu.remove(var16);
                                          this.nnuUVNUuvvVU.remove(var16);
                                          unNNVVNnvvV.put(var16, System.currentTimeMillis() + 45000L);
                                       }
                                    }

                                    if (unNNVVNnvvV.containsKey(var16)) {
                                       if (unNNVVNnvvV.get(var16) - System.currentTimeMillis() > 0L) {
                                          var9.add(var16);
                                          this.NVUunUNUN.add(var16);
                                          if (this.UUVNuUNUvUnV.contains(var16) && uUnuvNvvNU.field_1724.method_5649(var18, var20, var22) < 20.25) {
                                             this.UuUVuuUu(var16, "§aВы у цели. Метка снята.");
                                          }
                                       } else {
                                          unNNVVNnvvV.remove(var16);
                                          if (this.UUVNuUNUvUnV.contains(var16)) {
                                             this.UuUVuuUu(var16, "§cВремя вышло. Метка снята.");
                                          }
                                       }
                                    }

                                    Color var27;
                                    Color var28;
                                    if (var36) {
                                       float var29 = (float)(Math.sin(System.currentTimeMillis() / 150.0) * 0.15 + 0.85);
                                       if (var37 <= 20000L) {
                                          float var30 = (float)(Math.sin(System.currentTimeMillis() / 60.0) * 0.5 + 0.5);
                                          var27 = new Color(255, 140, 0, Math.min(255, (int)((80.0F + 150.0F * var30) * var29)));
                                          var28 = new Color(255, 140, 0, 0);
                                       } else {
                                          var27 = new Color(255, 0, 0, Math.min(255, (int)(150.0F * var29)));
                                          var28 = new Color(255, 0, 0, 0);
                                       }
                                    } else {
                                       var27 = new Color(0, 255, 150, 120);
                                       var28 = new Color(0, 255, 150, 0);
                                    }

                                    this.UuUVuuUu(var6, var5, var16, var4, var27, var28);
                                    break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               Iterator var34 = this.NVUunUNUN.iterator();

               while (var34.hasNext()) {
                  class_2338 var35 = (class_2338)var34.next();
                  if (!var9.contains(var35)) {
                     var34.remove();
                     if (this.UUVNuUNUvUnV.contains(var35)) {
                        this.UUVNuUNUvUnV.remove(var35);
                        if (oO0OcCC0OCO.UuUVuuUu.method_32118() == var35.method_10263() && oO0OcCC0OCO.UuUVuuUu.method_32119() == var35.method_10260()) {
                           oO0OcCC0OCO.UuUVuuUu = new class_5611(Float.MAX_VALUE, Float.MAX_VALUE);
                        }
                     }
                  }
               }
            } finally {
               nNNnNvVVv.C00OOC00oO();
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(O0C0OC0OCcCO var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null && this.UuuNnUvUuv()) {
         UnVNvNnU var2 = var1.vVvUvVVuuNvV();
         class_4184 var3 = uUnuvNvvNU.field_1773.method_19418();
         class_243 var4 = var3.method_19326();
         long var5 = System.currentTimeMillis();
         HashSet var7 = new HashSet();

         for (Entry var9 : new HashMap<>(VVnVNnunVvu).entrySet()) {
            class_2338 var10 = (class_2338)var9.getKey();
            long var11 = (Long)var9.getValue() - var5;
            if (var11 > 0L) {
               class_2586 var13 = uUnuvNvvNU.field_1687.method_8321(var10);
               boolean var14 = this.NVNnnvnuunNv.vVvUvVVuuNvV.isEmpty()
                  || this.NVNnnvnuunNv.uUnuvNvvNU().equalsIgnoreCase(this.NVNnnvnuunNv.vVvUvVVuuNvV.get(0));
               boolean var15 = var14 ? var13 instanceof class_2595 : var13 instanceof class_3719;
               if (var15) {
                  class_243 var16 = new class_243(var10.method_10263() + 0.5, var10.method_10264() + 1.28, var10.method_10260() + 0.5);
                  if (!(var16.method_1025(var4) < 1.0E-6)) {
                     class_243 var17 = VnNnNnvuvn.UuUVuuUu(var16);
                     if (var17 != null && !(var17.field_1350 <= 0.001F) && !(var17.field_1350 > 1.0)) {
                        double var18 = var4.method_1022(var16);
                        long var20 = Math.max(var11, this.nnuUVNUuvvVU.getOrDefault(var10, var11));
                        float var22 = class_3532.method_15363((float)var11 / (float)Math.max(1L, var20), 0.0F, 1.0F);
                        ServerDHelper.nvnNNunvv var23 = this.vuvnUnVnUNnV.computeIfAbsent(var10, var1x -> new ServerDHelper.nvnNNunvv(var22));
                        var23.UuUVuuUu(true, var22);
                        var7.add(var10);
                        this.UuUVuuUu(var2, var23, (float)var17.field_1352, (float)var17.field_1351, (float)var18, var11);
                     }
                  }
               }
            }
         }

         Iterator var24 = this.vuvnUnVnUNnV.entrySet().iterator();

         while (var24.hasNext()) {
            Entry var25 = (Entry)var24.next();
            if (!var7.contains(var25.getKey())) {
               ((ServerDHelper.nvnNNunvv)var25.getValue()).UuUVuuUu(false, 0.0F);
               if (((ServerDHelper.nvnNNunvv)var25.getValue()).UuUVuuUu <= 0.02F) {
                  var24.remove();
               }
            }
         }

         this.nnuUVNUuvvVU.keySet().removeIf(var0 -> !VVnVNnunVvu.containsKey(var0));
      } else {
         this.vuvnUnVnUNnV.clear();
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, ServerDHelper.nvnNNunvv var2, float var3, float var4, float var5, long var6) {
      float var8 = this.UuUVuuUu(var2.UuUVuuUu);
      if (!(var8 <= 0.03F)) {
         float var9 = (float)class_3532.method_15350(16.0 / Math.max((double)var5, 12.0), 0.75, 1.15);
         float var10 = 6.0F * var9;
         float var11 = 4.0F * var9;
         float var12 = 23.0F * var9;
         float var13 = 22.0F * var9;
         float var14 = 18.0F * var9;
         float var15 = 4.0F * var9;
         String var16 = "КД";
         String var17 = this.C00OOC00oO(var6);
         float var18 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var16, var14).UuUVuuUu;
         float var19 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var17, var13).UuUVuuUu;
         float var20 = Math.max(48.0F * var9, var15 + var19 + var11 * 2.0F);
         float var21 = 0.88F + 0.12F * var8;
         float var22 = var3 - var20 / 2.0F;
         float var23 = var4 - var12 - 8.0F * var9 - (1.0F - var8) * 7.0F * var9;
         float var24 = var22 + var20 / 2.0F;
         float var25 = var23 + var12 / 2.0F;
         float var26 = 1.0F - class_3532.method_15363((float)var6 / 20000.0F, 0.0F, 1.0F);
         float var27 = var26 * (0.5F + 0.5F * (float)Math.sin(System.currentTimeMillis() / 90.0));
         int var28 = this.UuUVuuUu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(255, 70, 70, 255), UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(255, 175, 60, 255), var27);
         int var29 = this.UuUVuuUu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(25, 25, 26, 235), var8);
         int var30 = this.UuUVuuUu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(78, 78, 78, 176), var8);
         int var31 = this.UuUVuuUu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(160, 160, 165, 255), var8);
         int var32 = this.UuUVuuUu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(245, 245, 245, 255), var8);
         int var33 = this.UuUVuuUu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(0, 0, 0, 105), var8);
         int var34 = this.UuUVuuUu(var28, var8);
         var1.uUnuvNvvNU(var21, var21, var24, var25);
         var1.UuUVuuUu(var22, var23, var20, var12, var10, var29);
         var1.UuUVuuUu(var22, var23, var20, var12, var10, var30, Math.max(1.0F, 0.8F * var9));
         float var35 = var23 + 15.3F * var9;
         float var36 = var22 + var11;
         var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var36 + var15, var35, var13, var17, var32);
         var1.uVUuuVnNVU();
      }
   }

   private String C00OOC00oO(long var1) {
      long var3 = Math.max(0L, (var1 + 999L) / 1000L);
      long var5 = var3 / 3600L;
      long var7 = var3 % 3600L / 60L;
      long var9 = var3 % 60L;
      return var5 > 0L ? String.format(Locale.ROOT, "%d:%02d:%02d", var5, var7, var9) : String.format(Locale.ROOT, "%02d:%02d", var7, var9);
   }

   private float UuUVuuUu(float var1) {
      float var2 = class_3532.method_15363(var1, 0.0F, 1.0F);
      return 1.0F - (float)Math.pow(1.0F - var2, 3.0);
   }

   private int UuUVuuUu(int var1, int var2, float var3) {
      float var4 = class_3532.method_15363(var3, 0.0F, 1.0F);
      int var5 = var1 >> 24 & 0xFF;
      int var6 = var1 >> 16 & 0xFF;
      int var7 = var1 >> 8 & 0xFF;
      int var8 = var1 & 0xFF;
      int var9 = var2 >> 24 & 0xFF;
      int var10 = var2 >> 16 & 0xFF;
      int var11 = var2 >> 8 & 0xFF;
      int var12 = var2 & 0xFF;
      int var13 = (int)(var5 + (var9 - var5) * var4);
      int var14 = (int)(var6 + (var10 - var6) * var4);
      int var15 = (int)(var7 + (var11 - var7) * var4);
      int var16 = (int)(var8 + (var12 - var8) * var4);
      return UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(var14, var15, var16, var13);
   }

   private int UuUVuuUu(int var1, float var2) {
      int var3 = var1 >> 24 & 0xFF;
      int var4 = var1 >> 16 & 0xFF;
      int var5 = var1 >> 8 & 0xFF;
      int var6 = var1 & 0xFF;
      int var7 = (int)class_3532.method_15363(var3 * var2, 0.0F, 255.0F);
      return UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(var4, var5, var6, var7);
   }

   private void UuUVuuUu(class_2338 var1, String var2) {
      unNNVVNnvvV.remove(var1);
      this.UUVNuUNUvUnV.remove(var1);
      if (oO0OcCC0OCO.UuUVuuUu.method_32118() == var1.method_10263() && oO0OcCC0OCO.UuUVuuUu.method_32119() == var1.method_10260()) {
         oO0OcCC0OCO.UuUVuuUu = new class_5611(Float.MAX_VALUE, Float.MAX_VALUE);
         vVnvuVVUunuv.UuUVuuUu("§8[§6ServerDHelper§8] " + var2);
      }
   }

   private uuUuvNuNVNVU UuUVuuUu(class_243 var1) {
      if (uUnuvNvvNU.field_1724 == null) {
         return new uuUuvNuNVNVU(0.0F, 0.0F);
      } else {
         class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
         double var3 = var1.field_1352 - var2.field_1352;
         double var5 = var1.field_1351 - var2.field_1351;
         double var7 = var1.field_1350 - var2.field_1350;
         float var9 = (float)Math.toDegrees(Math.atan2(var7, var3)) - 90.0F;
         float var10 = (float)(-Math.toDegrees(Math.atan2(var5, Math.sqrt(var3 * var3 + var7 * var7))));
         return new uuUuvNuNVNVU(var9, var10);
      }
   }

   private long UuUVuuUu(String var1, boolean var2) {
      if (var2) {
         Matcher var3 = NnunUUnU.matcher(var1);
         if (var3.find()) {
            try {
               return (Integer.parseInt(var3.group(1)) * 60L + Integer.parseInt(var3.group(2))) * 1000L;
            } catch (NumberFormatException var8) {
            }
         }
      } else {
         Matcher var9 = nvuVvuNnNUnv.matcher(var1);
         if (var9.find()) {
            try {
               int var10 = Integer.parseInt(var9.group(1));
               int var5 = Integer.parseInt(var9.group(2));
               return var9.group(3) != null ? (var10 * 3600L + var5 * 60L + Integer.parseInt(var9.group(3))) * 1000L : (var10 * 60L + var5) * 1000L;
            } catch (NumberFormatException var7) {
            }
         }

         Matcher var4 = NnVnNVN.matcher(var1);
         if (var4.find()) {
            try {
               return Integer.parseInt(var4.group(1)) * 1000L;
            } catch (NumberFormatException var6) {
            }
         }
      }

      return -1L;
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, class_2338 var3, class_243 var4, Color var5, Color var6) {
      float var7 = (float)(var3.method_10263() - var4.field_1352);
      float var8 = (float)(var3.method_10264() - var4.field_1351);
      float var9 = (float)(var3.method_10260() - var4.field_1350);
      float var10 = (float)(var3.method_10263() + 1 - var4.field_1352);
      float var11 = (float)(var3.method_10264() + 1 - var4.field_1351);
      float var12 = (float)(var3.method_10260() + 1 - var4.field_1350);
      this.UuUVuuUu(var1, var2, var7, var8, var9, var10, var11, var12, var5, var6);
   }

   private String C00OOC00oO(class_1799 var1) {
      return var1.method_7909().toString() + "|" + var1.method_7964().getString();
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, float var8, Color var9, Color var10) {
      int var11 = var9.getRed();
      int var12 = var9.getGreen();
      int var13 = var9.getBlue();
      int var14 = var9.getAlpha();
      int var15 = var10.getRed();
      int var16 = var10.getGreen();
      int var17 = var10.getBlue();
      int var18 = var10.getAlpha();
      var1.method_22918(var2, var3, var4, var5).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var6, var4, var5).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var6, var7, var5).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var3, var7, var5).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var3, var7, var8).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var7, var8).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var4, var8).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var4, var8).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var4, var8).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var4, var5).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var7, var5).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var3, var7, var8).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var7, var8).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var7, var5).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var4, var5).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var6, var4, var8).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var4, var5).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var4, var8).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var6, var4, var8).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var6, var4, var5).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var7, var5).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var7, var5).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var7, var8).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var3, var7, var8).method_1336(var15, var16, var17, var18);
   }

   private boolean uUnuvNvvNU(class_1799 var1) {
      if (var1.method_7960()) {
         return false;
      } else {
         String var2 = var1.method_7964().getString();
         if (var2.contains("[★]")) {
            return true;
         } else {
            class_1792 var3 = var1.method_7909();
            if (this.nNvNUVU.C00OOC00oO("Незер вещи") && this.UuUVuuUu(var3)) {
               return true;
            } else if (this.nNvNUVU.C00OOC00oO("Дон зелья") && this.uNNnnnuuuN(var1)) {
               return true;
            } else if (this.nNvNUVU.C00OOC00oO("Сферы") && this.nuUnNvnuUu(var1)) {
               return true;
            } else if (this.nNvNUVU.C00OOC00oO("Талисманы") && this.VVuuUN(var1)) {
               return true;
            } else if (this.nNvNUVU.C00OOC00oO("Модификаторы") && this.vVvUvVVuuNvV(var1)) {
               return true;
            } else if (!this.nNvNUVU.C00OOC00oO("Стрелы") || var3 != class_1802.field_8107 && var3 != class_1802.field_8087 && var3 != class_1802.field_8236) {
               return this.nNvNUVU.C00OOC00oO("Яйца") && var3 instanceof class_1826
                  ? true
                  : this.nNvNUVU.C00OOC00oO("Ценные предметы") && this.vNUvnnVnUvu(var1);
            } else {
               return true;
            }
         }
      }
   }

   private boolean vVvUvVVuuNvV(class_1799 var1) {
      String var2 = var1.method_7964().getString().replaceAll("§.", "").trim().toLowerCase(Locale.ROOT);
      return vnvvNvUnVv.contains(var2);
   }

   private boolean uNNnnnuuuN(class_1799 var1) {
      return vnVVvun.uVunuUNVVUUV(var1)
         || vnVVvun.UNnVVNvvnVvU(var1)
         || vnVVvun.uNnUnnuNUnNu(var1)
         || vnVVvun.NnUuNNU(var1)
         || vnVVvun.nNvNUVU(var1)
         || vnVVvun.UnUNuUU(var1)
         || vnVVvun.uUVuVvuNUvnu(var1);
   }

   private boolean nuUnNvnuUu(class_1799 var1) {
      return vnVVvun.UuUVuuUu(var1)
         || vnVVvun.C00OOC00oO(var1)
         || vnVVvun.uUnuvNvvNU(var1)
         || vnVVvun.vVvUvVVuuNvV(var1)
         || vnVVvun.uNNnnnuuuN(var1)
         || vnVVvun.nuUnNvnuUu(var1)
         || vnVVvun.VVuuUN(var1)
         || vnVVvun.vNUvnnVnUvu(var1)
         || vnVVvun.uVUuuVnNVU(var1);
   }

   private boolean VVuuUN(class_1799 var1) {
      return vnVVvun.vuuuNvNuv(var1)
         || vnVVvun.nvUVNnuu(var1)
         || vnVVvun.UuuNnUvUuv(var1)
         || vnVVvun.nUUVuvU(var1)
         || vnVVvun.UnUNVVVNuv(var1)
         || vnVVvun.vNVuvnUUnuUn(var1)
         || vnVVvun.UvnvNVnnnnNU(var1)
         || vnVVvun.uVUVnuvnuVuv(var1);
   }

   private boolean UuUVuuUu(class_1792 var1) {
      return var1 == class_1802.field_22027
         || var1 == class_1802.field_22028
         || var1 == class_1802.field_22029
         || var1 == class_1802.field_22030
         || var1 == class_1802.field_22022
         || var1 == class_1802.field_22024;
   }

   private boolean vNUvnnVnUvu(class_1799 var1) {
      class_1792 var2 = var1.method_7909();
      if (this.nNvNUVU.C00OOC00oO("Незер вещи") && this.UuUVuuUu(var2)) {
         return true;
      } else if (var2 instanceof class_1747 var3 && var3.method_7711() instanceof class_2190) {
         return true;
      } else if (var2 == class_1802.field_8288 || var2 == class_1802.field_8407 || var2 == class_1802.field_8675 || var2 == class_1802.field_8366) {
         return true;
      } else if (var2 == class_1802.field_8054
         || var2 == class_1802.field_8626
         || var2 == class_1802.field_22020
         || var2 == class_1802.field_8137
         || var2 == class_1802.field_8449) {
         return true;
      } else if (var2 == class_1802.field_8543 || var2 == class_1802.field_8479 || var2 == class_1802.field_8614) {
         return true;
      } else {
         return var2 != class_1802.field_22021 && var2 != class_1802.field_8833
            ? var2 == class_1802.field_17346
               || var2 == class_1802.field_23842
               || var2 == class_1802.field_8668
               || var2 == class_1802.field_8367
               || var2 == class_1802.field_8463
               || var2 == class_1802.field_8849
            : true;
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (var1.vVvUvVVuuNvV() instanceof class_7439 var2) {
         String var4 = var2.comp_763().getString();
         if (var4.contains("Данная команда недоступна в режиме AFK")
            && !this.VuunNUUUvu
            && uUnuvNvvNU.field_1724 != null
            && uUnuvNvvNU.field_1724.field_3944 != null) {
            vnvuUUVun.UuUVuuUu.UuUVuuUu();
            this.VvVvnNUnvuvV = vnvuUUVun.UuUVuuUu.uUnuvNvvNU();
            uUnuvNvvNU.field_1724.field_3944.method_45730("hub");
            this.VuunNUUUvu = true;
            this.NNUUNUuVNNVn.UuUVuuUu();
            if (this.vNVuvnUUnuUn()) {
               uUnuvNvvNU.field_1724.method_7346();
            }

            this.uUVVvVVNvvn = ServerDHelper.VvunVVUvUNnv.IDLE;
         }
      }
   }

   static enum NVnVnNnN {
      IDLE,
      ROTATING,
      OPENING,
      WAITING_SCREEN;
   }

   static enum VvunVVUvUNnv {
      IDLE,
      ROTATING,
      OPENING,
      REOPEN_CLAN;
   }

   static class nvnNNunvv {
      float UuUVuuUu;
      private float C00OOC00oO;
      private long uUnuvNvvNU;

      nvnNNunvv(float var1) {
         this.C00OOC00oO = var1;
         this.uUnuvNvvNU = System.currentTimeMillis();
      }

      void UuUVuuUu(boolean var1, float var2) {
         long var3 = System.currentTimeMillis();
         float var5 = class_3532.method_15363((float)(var3 - this.uUnuvNvvNU) / 16.666F, 0.5F, 3.0F);
         this.uUnuvNvvNU = var3;
         this.UuUVuuUu = this.UuUVuuUu + ((var1 ? 1.0F : 0.0F) - this.UuUVuuUu) * class_3532.method_15363(0.18F * var5, 0.0F, 1.0F);
         this.C00OOC00oO = this.C00OOC00oO + (class_3532.method_15363(var2, 0.0F, 1.0F) - this.C00OOC00oO) * class_3532.method_15363(0.12F * var5, 0.0F, 1.0F);
      }
   }
}
