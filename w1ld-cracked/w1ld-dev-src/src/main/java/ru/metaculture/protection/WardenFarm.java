package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalNear;
import baritone.api.pathing.goals.GoalXZ;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.awt.Color;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import net.minecraft.class_10799;
import net.minecraft.class_1268;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1531;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1826;
import net.minecraft.class_1844;
import net.minecraft.class_1921;
import net.minecraft.class_1923;
import net.minecraft.class_2190;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2586;
import net.minecraft.class_2595;
import net.minecraft.class_2625;
import net.minecraft.class_2627;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_2886;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_3719;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_408;
import net.minecraft.class_418;
import net.minecraft.class_433;
import net.minecraft.class_4588;
import net.minecraft.class_476;
import net.minecraft.class_7260;
import net.minecraft.class_7439;
import net.minecraft.class_9334;
import net.minecraft.class_1921.class_4688;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "WardenFarm",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Умный авто-фарм Варден данжа"
)
public class WardenFarm extends Module {
   public final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим", "Варден", "Варден", "Медный данж");
   public final VUVnvvnNN uVunuUNVVUUV = new VUVnvvnNN(
      "Предметы для лута",
      new vvNnnUNnVvn("Дон зелья", false),
      new vvNnnUNnVvn("Сферы", true),
      new vvNnnUNnVvn("Талисманы", true),
      new vvNnnUNnVvn("Стрелы", false),
      new vvNnnUNnVvn("Незер вещи", true),
      new vvNnnUNnVvn("Оружие", false),
      new vvNnnUNnVvn("Броня", false),
      new vvNnnUNnVvn("Ценные предметы", true),
      new vvNnnUNnVvn("Яйца", false)
   );
   public final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Стелс режим (Варден)", true);
   public final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("Отходить после лута", true);
   public final vvNnnUNnVvn NnUuNNU = new vvNnnUNnVvn("Подбирать лут после смерти", true);
   public final vvNnnUNnVvn nNvNUVU = new vvNnnUNnVvn("Освобождать хотбар", true);
   public final vvNnnUNnVvn UnUNuUU = new vvNnnUNnVvn("Стоп при выбросе", true);
   public final nNUuNvVn uUVuVvuNUvnu = new nNUuNvVn("Ждать сундук до (сек)", 240.0F, 5.0F, 600.0F, 10.0F, false);
   public final vvNnnUNnVvn UvUvUNuvNU = new vvNnnUNnVvn("Авто еда и инвиз", true);
   public final vvNnnUNnVvn c0oOOCcCoC0 = new vvNnnUNnVvn("Зелья скорости (брать и пить)", true).UuUVuuUu(() -> !this.UvUvUNuvNU.uUnuvNvvNU());
   public final vvNnnUNnVvn VVnVNnunVvu = new vvNnnUNnVvn("Складывать дроп", true);
   public final UvNnUnuNUUU unNNVVNnvvV = new UvNnUnuNUUU("Куда складывать", "Ресы", "Ресы", "В клан").UuUVuuUu(() -> !this.VVnVNnunVvu.uUnuvNvvNU());
   public final vvNnnUNnVvn NuunnvnN = new vvNnnUNnVvn("Свапать анархии", true);
   public final NVuVVUNUvV NVUunUNUN = new NVuVVUNUvV("Анархии для фарма", "903,102,504").UuUVuuUu(() -> !this.NuunnvnN.uUnuvNvvNU());
   public final NVuVVUNUvV UUVNuUNUvUnV = new NVuVVUNUvV("Базовая анархия", "109").UuUVuuUu(() -> !this.NuunnvnN.uUnuvNvvNU());
   public final NVuVVUNUvV vuvnUnVnUNnV = new NVuVVUNUvV("Хом для вардена", "warden").UuUVuuUu(() -> !this.NuunnvnN.uUnuvNvvNU());
   private final Map<String, Map<class_2338, Long>> nnuUVNUuvvVU = new ConcurrentHashMap<>();
   private final Map<String, Map<class_2338, Long>> nVVUuvuNnUN = new ConcurrentHashMap<>();
   private final Map<String, Integer> nNnVnUNVV = new HashMap<>();
   private final Map<class_2338, Long> nuunNvv = new HashMap<>();
   private final List<class_2338> uUVVvVVNvvn = new ArrayList<>();
   private final Queue<Runnable> vvUVNVvvNUv = new ArrayDeque<>();
   private String UuNnnVnuNNV = "UNKNOWN";
   private Map<class_2338, Long> uUVvnUuNvvN = new ConcurrentHashMap<>();
   private Map<class_2338, Long> UUuUnNVNuuv = new ConcurrentHashMap<>();
   private IBaritone NVuNUuVnVUN;
   private WardenFarm.nvnNNunvv NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
   private class_2338 vNnNuuvVn = null;
   private class_2338 VUuuVUnun = null;
   private class_2338 vVVuuVVv = null;
   private double VuunNUUUvu = -1.0;
   private final VuNvNNvVV NNUUNUuVNNVn = new VuNvNNvVV();
   private final VuNvNNvVV VvVvnNUnvuvV = new VuNvNNvVV();
   private final VuNvNNvVV ccOO0COcoco0 = new VuNvNNvVV();
   private final VuNvNNvVV NUVvUUVuVNVv = new VuNvNNvVV();
   private final VuNvNNvVV nNuVunNUVu = new VuNvNNvVV();
   private final VuNvNNvVV UNvvunVVn = new VuNvNNvVV();
   private final VuNvNNvVV UnvuVuVnNuvu = new VuNvNNvVV();
   private final VuNvNNvVV UvNNVUVNVuvV = new VuNvNNvVV();
   private final VuNvNNvVV NnunUUnU = new VuNvNNvVV();
   private final VuNvNNvVV nvuVvuNnNUnv = new VuNvNNvVV();
   private boolean NnVnNVN = false;
   private long vnvvNvUnVv = 0L;
   private String OCOocoOoOO = "N/A";
   private int o0Ooc0COOoc = 0;
   private boolean nvvnUnUn = true;
   private boolean UnUUVuVunvVu = true;
   private boolean nnvuvUNuUnN = true;
   private class_2338 UVnuVUUVnnU = null;
   private int VunnVNvNV = 0;
   private int NvUVUvVVnUu = -1;
   private static final Pattern unnUnUNVnN = Pattern.compile("(\\d{1,2}):(\\d{1,2})");
   private static final Pattern NnuUnUNnu = Pattern.compile("(\\d{1,2}):(\\d{2})(?::(\\d{2}))?");
   private static final Pattern UnnnvvU = Pattern.compile("(\\d+)\\s*(с|s|сек|sec)");
   private static final Pattern VUUnuVvVu = Pattern.compile(
      "Смерть на координатах \\[(-?\\d+(?:[.,]\\d+)?),\\s*(-?\\d+(?:[.,]\\d+)?),\\s*(-?\\d+(?:[.,]\\d+)?)]"
   );
   private static final double VvVuvUvvNNVv = -2000.0;
   private static final double UnnNNvuvvUU = -2000.0;
   private static final double VNNnnVUuvv = 2000.0;
   private static final double vUvUvUNNuNvn = 2000.0;
   private static final double uuVuUuuVVNvN = 62500.0;
   private static final double VvuUUUNNNv = -2068.0;
   private static final double uuuVnuvnnNnU = -1932.0;
   private static final double nNunUnVN = -60.0;
   private static final double VnVuuvVvnNv = -20.0;
   private static final double vuvvuVuVv = -2066.0;
   private static final double uunNUuunVU = -1934.0;
   private static final long NvnuuuvnVV = 3000L;
   private static final double NnUVNnuvUv = 3.0;
   private static final long UuuuNNunN = 5000L;
   private static final long NNVNuUvVn = 20000L;
   private static final long vuNnuUnu = 35000L;
   private static final int uuvvuNvuUNVV = 1;
   private static final int uVvunVUNuUvu = 3;
   private static final int NVNnnvVnvV = 1;
   private static final int vUNuuvvnVnv = 16;
   private static final double unnnNUNnVu = 24.0;
   private static final double NvnnUUuVvNU = 40.0;
   private static final double vVvuUVnV = 16.0;
   private static final long nvuUVvuuN = 270000L;
   private static final long CC0COO = 1200L;
   private static final long uNnNUNvuVnu = 4000L;
   private static final double VnnnvUunNvuu = 2.9;
   private static final long VuuUVVu = 1500L;
   private static final long nUNnuUNnV = 100L;
   private static final long VuNVnvNNuNnn = 1000L;
   private static final long uvVuuuvvVU = 750L;
   private static final double NNnvvunuVNUn = 14.0;
   private static final long nVuuUnnUUVU = 15000L;
   private static final long nUununvNvvn = 45000L;
   private static final long NuvunVvnnN = 5000L;
   private static final double vuvnnvuNVvu = 25.0;
   private static final double NVvnvnn = 20.0;
   private static final String[] vUvVUNnN = new String[]{"ресы", "ресурс"};
   private static final String[] NUuVnnuUnvu = new String[]{"кит", "kit", "инвиз", "invis", "зель", "морков", "carrot", "припас", "скор", "speed"};
   private long vnuNNVvVVuN = 0L;
   private Runnable Oco0Oococc = null;
   private boolean uNUnUuUnvnnU = false;
   private final Set<class_2338> OoccOc0CO = new HashSet<>();
   private class_2338 UvuVvvVuUuuu = null;
   private int NUUVUvvuNNVU = 0;
   private WardenFarm.VUnuUnnuNvVu VUNvNUuNVnn = WardenFarm.VUnuUnnuNvVu.NONE;
   private int[] UNNunNuUNVuU = null;
   private class_2338 NuUuUvUUvU = null;
   private long VUVvNvvVUN = 0L;
   private boolean UvvNuvUNNNUv = false;
   private boolean NunUUVVVuu = false;
   private long uNUnuUUvvuU = 0L;
   private final VuNvNNvVV vvVVVvVNVVVN = new VuNvNNvVV();
   private class_2338 uUuuVvVunVVu = null;
   private long NuUvUNN = 0L;
   private WardenFarm.uunvUUVnuNn vunuUUVVUv = WardenFarm.uunvUUVnuNn.NONE;
   private WardenFarm.VvunVVUvUNnv uuuNUnuvvNNv = WardenFarm.VvunVVUvUNnv.FIND;
   private class_2338 unUVnu = null;
   private String NvNUuuuvUvu = "N/A";
   private boolean nNVVUnuVVVuV = false;
   private boolean vnVuunuNN = false;
   private boolean UvUNuNvvNVNv = false;
   private boolean vNnNNNuVVnUv = false;
   private boolean UVUnUvUNU = false;
   private WardenFarm.VUUnVnVNNU UvUnnnn = WardenFarm.VUUnVnVNNU.NONE;
   private boolean occOCoc0OcO = false;
   private boolean VnvunuuvUNu = false;
   private boolean nuVuunUn = false;
   private int NvNvVNUv = 0;
   private final Set<class_2338> vNUUvuuVU = new HashSet<>();
   private int unNuVNVUnV = -1;
   private WardenFarm.nvUnvV UvNNNUvNnUUV = WardenFarm.nvUnvV.NONE;
   private int vVuNvnVUvvv = 0;
   private long OCCc0co0OOC = 0L;
   private final NnuUuVVVvUu unUvvVVVVUu = new NnuUuVVVvUu();
   private double nnUunUnNUN;
   private double UNuUVVuUuU;
   private long NunnVUUuvUV = 0L;
   private List<class_2248> nVUNnUuU = null;
   private class_243 VNvuVnvnun = null;
   private long unVVnuunNU = 0L;
   private long vVnuVVvVNuNu = 0L;
   private WardenFarm.NVnVnNnN uNVvVvUuuuU = WardenFarm.NVnVnNnN.NONE;
   private int nvnUvvnUUN = -1;
   private int uuuvuUUNVVUN = -1;
   private final VuNvNNvVV VnUvVu = new VuNvNNvVV();
   private final VuNvNNvVV NvUVuUNUUNvv = new VuNvNNvVV();
   private final VuNvNNvVV NnvVNVnn = new VuNvNNvVV();
   private long O0ooccOc0 = 0L;
   private boolean nvuVnuvUVvVu = false;
   private long coOocCcoOc0 = 0L;
   private long uvNnUuvvNU = 0L;
   private boolean UuUUvvVunV = false;
   private int VuNNvnVVUUn = 0;
   private boolean UnVvNNuNu = false;
   private boolean vuNunNnvnunv = false;
   private final VuNvNNvVV UVVNUnVnNV = new VuNvNNvVV();
   private boolean vnUUvvnUVUu = false;
   private boolean vNVvnNNnVV = false;
   private long UvnnnuuNvUvv = 0L;
   private static final int uVUUnuunuv = 65536;
   private static final RenderPipeline vvNvvuUUUVvv = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "block_esp_box"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final class_1921 nvvVNNnnUvVN = class_1921.method_24049(
      "chest_esp_box", 65536, false, true, vvNvvuUUUVvv, class_4688.method_23598().method_23617(false)
   );

   public WardenFarm() {
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
            this.NuunnvnN,
            this.NVUunUNUN,
            this.UUVNuUNUvUnV,
            this.vuvnUnVnUNnV
         }
      );
   }

   @Override
   public void UuUVuuUu() {
      NNvvnnunn.UuUVuuUu = true;
      super.UuUVuuUu();
      this.NVuNUuVnVUN = BaritoneAPI.getProvider().getPrimaryBaritone();
      this.nvvnUnUn = (Boolean)BaritoneAPI.getSettings().allowSprint.value;
      this.UnUUVuVunvVu = (Boolean)BaritoneAPI.getSettings().allowBreak.value;
      this.nnvuvUNuUnN = (Boolean)BaritoneAPI.getSettings().allowPlace.value;
      this.UnUUVuVunvVu();
      BaritoneAPI.getSettings().allowBreak.value = false;
      BaritoneAPI.getSettings().allowPlace.value = false;
      this.nnUunUnNUN = Math.random() * Math.PI * 2.0;
      this.UNuUVVuUuU = Math.random() * Math.PI * 2.0;
      this.NUVvUUVuVNVv.UuUVuuUu();
      this.UnUNVVVNuv();
      vnvuUUVun.UuUVuuUu.UuUVuuUu();
      if (this.UvUvUNuvNU.uUnuvNvvNU() && this.NuunnvnN.uUnuvNvvNU() && this.uUnuvNvvNU(vnvuUUVun.UuUVuuUu.uUnuvNvvNU()) && this.vVvuUVnV()) {
         this.vuNnuUnu();
      }
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      if (this.NVuNUuVnVUN != null) {
         this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
         BaritoneAPI.getSettings().allowSprint.value = this.nvvnUnUn;
      }

      BaritoneAPI.getSettings().allowBreak.value = this.UnUUVuVunvVu;
      BaritoneAPI.getSettings().allowPlace.value = this.nnvuvUNuUnN;
      this.nnvuvUNuUnN();
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_5660(false);
      }

      this.vuvnnvuNVvu();
      this.vUvVUNnN();
      this.UnUNVVVNuv();
      this.unUvvVVVVUu.UuUVuuUu();
      COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
      COC0OCc.nuUnNvnuUu = 0;
      COC0OCc.uVUuuVnNVU = null;
      NNvvnnunn.UuUVuuUu = false;
   }

   private void UuuNnUvUuv() {
      if (this.UnvuVuVnNuvu.uNNnnnuuuN(1000L)) {
         vnvuUUVun.UuUVuuUu.UuUVuuUu();
         String var1 = vnvuUUVun.UuUVuuUu.uUnuvNvvNU();
         String var2 = var1 != null && !var1.equals("N/A") ? var1 : "UNKNOWN";
         if (!var2.equals(this.UuNnnVnuNNV)) {
            this.UuNnnVnuNNV = var2;
            this.uUVvnUuNvvN = this.nnuUVNUuvvVU.computeIfAbsent(this.UuNnnVnuNNV, var0 -> new ConcurrentHashMap<>());
            this.UUuUnNVNuuv = this.nVVUuvuNnUN.computeIfAbsent(this.UuNnnVnuNNV, var0 -> new ConcurrentHashMap<>());
            this.nUUVuvU();
         }

         long var3 = System.currentTimeMillis();
         this.uUVvnUuNvvN.entrySet().removeIf(var2x -> var2x.getValue() < var3);
         this.UUuUnNVNuuv.entrySet().removeIf(var2x -> var2x.getValue() < var3);
         this.UnvuVuVnNuvu.UuUVuuUu();
      }
   }

   private void nUUVuvU() {
      if (this.NVuNUuVnVUN != null) {
         this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
      }

      this.VunnVNvNV();
      this.uUVVvVVNvvn.clear();
      this.nuunNvv.clear();
      this.OoccOc0CO.clear();
      this.vvUVNVvvNUv.clear();
      this.vNnNuuvVn = null;
      this.VUuuVUnun = null;
      this.vVVuuVVv = null;
      this.UvuVvvVuUuuu = null;
      this.NUUVUvvuNNVU = 0;
      this.VUNvNUuNVnn = WardenFarm.VUnuUnnuNvVu.NONE;
      this.uUuuVvVunVVu = null;
      this.VuunNUUUvu = -1.0;
      this.coOocCcoOc0 = 0L;
      this.VuNNvnVVUUn = 0;
      this.UnVvNNuNu = false;
      this.UuUUvvVunV = false;
      this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
      this.UNvvunVVn.UuUVuuUu();
      this.NnunUUnU.C00OOC00oO(-1000L);
   }

   private void UnUNVVVNuv() {
      this.uUVVvVVNvvn.clear();
      this.nuunNvv.clear();
      this.nNnVnUNVV.clear();
      this.vvUVNVvvNUv.clear();
      this.OoccOc0CO.clear();
      this.UvuVvvVuUuuu = null;
      this.NUUVUvvuNNVU = 0;
      this.VUNvNUuNVnn = WardenFarm.VUnuUnnuNvVu.NONE;
      this.vNnNuuvVn = null;
      this.vVVuuVVv = null;
      this.VuunNUUUvu = -1.0;
      this.coOocCcoOc0 = 0L;
      this.UuUUvvVunV = false;
      this.UNNunNuUNVuU = null;
      this.NuUuUvUUvU = null;
      this.VUVvNvvVUN = 0L;
      this.NUVvUUVuVNVv();
      this.uUuuVvVunVVu = null;
      this.NuUvUNN = 0L;
      this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
      this.NnVnNVN = false;
      this.vnuNNVvVVuN = 0L;
      this.Oco0Oococc = null;
      this.uNUnUuUnvnnU = false;
      this.nvuVnuvUVvVu = false;
      this.vnVuunuNN = false;
      this.VnVuuvVvnNv();
      this.UNvvunVVn.UuUVuuUu();
      COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(coOCCcooOcOO var1) {
      this.uUVVvVVNvvn.clear();
      this.nuunNvv.clear();
      this.OoccOc0CO.clear();
      this.vNnNuuvVn = null;
      this.UNNunNuUNVuU = null;
      this.VuunNUUUvu = -1.0;
      this.uUuuVvVunVVu = null;
      this.NuUvUNN = 0L;
      this.NUVvUUVuVNVv();
      this.NUVvUUVuVNVv.UuUVuuUu();
      this.UuNnnVnuNNV = "UNKNOWN";
      this.NnunUUnU.C00OOC00oO(-1000L);
      if (this.vunuUUVVUv == WardenFarm.uunvUUVnuNn.NONE
         && this.NVuunNnvvvVu != WardenFarm.nvnNNunvv.HUB_WAITING_FOR_CHEST
         && this.NVuunNnvvvVu != WardenFarm.nvnNNunvv.SWAPPING_TO_SAVE_ANARCHY
         && this.NVuunNnvvvVu != WardenFarm.nvnNNunvv.GOING_TO_STASH
         && this.NVuunNnvvvVu != WardenFarm.nvnNNunvv.OPENING_STASH
         && this.NVuunNnvvvVu != WardenFarm.nvnNNunvv.ROTATING_STASH
         && this.NVuunNnvvvVu != WardenFarm.nvnNNunvv.OPENING_STASH_BLOCK
         && this.NVuunNnvvvVu != WardenFarm.nvnNNunvv.WAITING_FOR_GUI_STASH
         && this.NVuunNnvvvVu != WardenFarm.nvnNNunvv.STORING_IN_CHEST) {
         this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
         this.UNvvunVVn.UuUVuuUu();
      }
   }

   private boolean UuUVuuUu(class_243 var1) {
      return this.NVNnnvnuunNv.C00OOC00oO("Варден")
         ? (var1.field_1352 - -2000.0) * (var1.field_1352 - -2000.0) + (var1.field_1350 - -2000.0) * (var1.field_1350 - -2000.0) <= 62500.0
         : (var1.field_1352 - 2000.0) * (var1.field_1352 - 2000.0) + (var1.field_1350 - 2000.0) * (var1.field_1350 - 2000.0) <= 62500.0;
   }

   private boolean vNVuvnUUnuUn() {
      return uUnuvNvvNU.field_1724 != null
            && uUnuvNvvNU.field_1687 != null
            && "minecraft:overworld".equals(uUnuvNvvNU.field_1687.method_27983().method_29177().toString())
         ? this.UuUVuuUu(uUnuvNvvNU.field_1724.method_19538())
         : false;
   }

   private boolean C00OOC00oO(class_243 var1) {
      return !this.NVNnnvnuunNv.C00OOC00oO("Варден")
         ? this.UuUVuuUu(var1)
         : var1.field_1352 >= -2068.0
            && var1.field_1352 <= -1932.0
            && var1.field_1351 >= -60.0
            && var1.field_1351 <= -20.0
            && var1.field_1350 >= -2066.0
            && var1.field_1350 <= -1934.0;
   }

   private int[] UvnvNVnnnnNU() {
      if (this.NVNnnvnuunNv.C00OOC00oO("Варден")) {
         int var7 = (int)(-2068.0 + Math.random() * 136.0);
         int var2 = (int)(-2066.0 + Math.random() * 132.0);
         return new int[]{var7, var2};
      } else {
         double var1 = Math.random() * Math.PI * 2.0;
         double var3 = Math.sqrt(Math.random()) * 240.0;
         int var5 = (int)(2000.0 + var3 * Math.cos(var1));
         int var6 = (int)(2000.0 + var3 * Math.sin(var1));
         return new int[]{var5, var6};
      }
   }

   private long UuUVuuUu(class_2338 var1) {
      return this.uUVvnUuNvvN.getOrDefault(var1, 0L);
   }

   private String uVUVnuvnuVuv() {
      String[] var1 = this.NVUunUNUN.uUnuvNvvNU().split(",");
      if (var1.length != 0 && !var1[0].trim().isEmpty()) {
         vnvuUUVun.UuUVuuUu.UuUVuuUu();
         String var2 = vnvuUUVun.UuUVuuUu.uUnuvNvvNU();

         for (int var3 = 0; var3 < var1.length; var3++) {
            if (var1[var3].trim().equals(var2)) {
               this.o0Ooc0COOoc = var3;
               break;
            }
         }

         this.o0Ooc0COOoc = (this.o0Ooc0COOoc + 1) % var1.length;
         return var1[this.o0Ooc0COOoc].trim();
      } else {
         return this.UUVNuUNUvUnV.uUnuvNvvNU();
      }
   }

   private boolean NVNnnvnuunNv() {
      boolean var1;
      if (vnvuUUVun.C00OOC00oO()) {
         var1 = true;
      } else if (PvPSafe.nUUVuvU()) {
         if (this.UvnnnuuNvUvv == 0L) {
            this.UvnnnuuNvUvv = System.currentTimeMillis();
         }

         var1 = System.currentTimeMillis() - this.UvnnnuuNvUvv <= 90000L;
      } else {
         this.UvnnnuuNvUvv = 0L;
         var1 = false;
      }

      if (var1) {
         this.O0ooccOc0 = System.currentTimeMillis();
      }

      return var1;
   }

   private boolean uVunuUNVVUUV() {
      return this.O0ooccOc0 > 0L && System.currentTimeMillis() - this.O0ooccOc0 < 1500L;
   }

   private void UNnVVNvvnVvU() {
      boolean var1 = this.UvvNuvUNNNUv
         || uUnuvNvvNU.field_1724.method_5715()
         || this.uNUnUuUnvnnU()
         || this.uNVvVvUuuuU != WardenFarm.NVnVnNnN.NONE
         || this.vNVvnNNnVV;
      boolean var2 = this.NVuNUuVnVUN != null && this.NVuNUuVnVUN.getCustomGoalProcess().isActive();
      BaritoneAPI.getSettings().allowSprint.value = var2 && !var1;
      if (var1 && uUnuvNvvNU.field_1724.method_5624()) {
         uUnuvNvvNU.field_1724.method_5728(false);
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (this.NUVvUUVuVNVv.uNNnnnuuuN(1000L)) {
            this.UuuNnUvUuv();
            this.uNnUnnuNUnNu();
            this.UNnVVNvvnVvU();
            if (!uUnuvNvvNU.field_1724.method_29504() && !(uUnuvNvvNU.field_1755 instanceof class_418)) {
               if (!(uUnuvNvvNU.field_1755 instanceof class_476)) {
                  this.NvUVUvVVnUu = -1;
               }

               if (!this.vNVuvnUUnuUn()) {
                  this.NUVvUUVuVNVv();
               }

               if (this.UnUNuUU.uUnuvNvvNU() && AutoDrop.NVNnnvnuunNv) {
                  if (this.NVuNUuVnVUN != null) {
                     this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
                  }

                  this.vuvnnvuNVvu();
                  this.unUvvVVVVUu.UuUVuuUu();
                  COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
               } else if (!this.OoccOc0CO()) {
                  this.UVnuVUUVnnU();
                  if (this.uNUnUuUnvnnU && !this.UvUvUNuvNU()) {
                     this.uNUnUuUnvnnU = false;
                     this.uuVuUuuVVNvN();
                  } else if (this.vunuUUVVUv != WardenFarm.uunvUUVnuNn.NONE) {
                     if (uUnuvNvvNU.field_1755 instanceof class_476 var12) {
                        this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
                        if (this.UuUVuuUu(var12)) {
                           this.uuuNUnuvvNNv = WardenFarm.VvunVVUvUNnv.WAIT_GUI;
                           this.vVvUvVVuuNvV((class_1707)var12.method_17577());
                        }
                     } else {
                        this.VnnnvUunNvuu();
                     }
                  } else if (this.UvUnnnn == WardenFarm.VUUnVnVNNU.NONE || !this.NnUVNnuvUv()) {
                     if (this.nNVVUnuVVVuV && !uUnuvNvvNU.field_1724.method_29504() && !(uUnuvNvvNU.field_1755 instanceof class_418)) {
                        this.nNVVUnuVVVuV = false;
                        this.nNvNUVU();
                     } else if (this.NnVnNVN) {
                        if (System.currentTimeMillis() >= this.vnvvNvUnVv) {
                           vnvuUUVun.UuUVuuUu.UuUVuuUu();
                           String var11 = vnvuUUVun.UuUVuuUu.uUnuvNvvNU();
                           String var13 = !"N/A".equals(this.OCOocoOoOO) && this.OCOocoOoOO != null ? this.OCOocoOoOO : this.NVNnnvVnvV();
                           if ("N/A".equals(var11) || !var11.equals(var13) && !this.uUnuvNvvNU(var11)) {
                              if (!this.UvUvUNuvNU() && !"N/A".equals(var13)) {
                                 uUnuvNvvNU.field_1724.field_3944.method_45730("an" + var13);
                                 this.vnvvNvUnVv = System.currentTimeMillis() + 8000L;
                              } else {
                                 this.vnvvNvUnVv = System.currentTimeMillis() + 2000L;
                              }
                           } else {
                              this.NnVnNVN = false;
                              this.ccOO0COcoco0.UuUVuuUu();
                              this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
                              this.UNvvunVVn.UuUVuuUu();
                           }
                        }
                     } else if (this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.HUB_WAITING_FOR_CHEST) {
                        if (this.vVVuuVVv != null) {
                           long var10 = this.UuUVuuUu(this.vVVuuVVv) - System.currentTimeMillis();
                           if (var10 <= 2000L) {
                              this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
                              this.UNvvunVVn.UuUVuuUu();
                              this.NnVnNVN = true;
                              this.vnvvNvUnVv = System.currentTimeMillis();
                           }
                        } else {
                           this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
                           this.UNvvunVVn.UuUVuuUu();
                        }
                     } else {
                        if (this.vunuUUVVUv == WardenFarm.uunvUUVnuNn.NONE && this.UvUnnnn == WardenFarm.VUUnVnVNNU.NONE && !this.vNVuvnUUnuUn()) {
                           if ("UNKNOWN".equals(this.UuNnnVnuNNV)) {
                              if (this.NunnVUUuvUV == 0L) {
                                 this.NunnVUUuvUV = System.currentTimeMillis();
                              } else if (System.currentTimeMillis() - this.NunnVUUuvUV > 15000L) {
                                 this.NunnVUUuvUV = 0L;
                                 this.NnVnNVN = true;
                                 this.vnvvNvUnVv = System.currentTimeMillis();
                                 return;
                              }
                           } else {
                              this.NunnVUUuvUV = 0L;
                           }
                        }

                        boolean var2 = this.vunuUUVVUv != WardenFarm.uunvUUVnuNn.NONE;
                        boolean var3 = this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.SWAPPING_TO_SAVE_ANARCHY
                           || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.GOING_TO_STASH
                           || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.OPENING_STASH
                           || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.ROTATING_STASH
                           || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.OPENING_STASH_BLOCK
                           || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.WAITING_FOR_GUI_STASH
                           || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.STORING_IN_CHEST;
                        boolean var4 = uUnuvNvvNU.field_1755 instanceof class_476;
                        if (this.NVuNUuVnVUN != null) {
                           if (!this.vNVuvnUUnuUn() && !var3 && !var2 && !var4) {
                              if (!this.vnVuunuNN || !this.UuuuNNunN()) {
                                 if (this.uUnuvNvvNU(vnvuUUVun.UuUVuuUu.uUnuvNvvNU()) && (this.UvUnnnn != WardenFarm.VUUnVnVNNU.NONE || this.NvnuuuvnVV())) {
                                    ;
                                 }
                              }
                           } else {
                              if (this.vNVuvnUUnuUn()) {
                                 this.vnVuunuNN = false;
                                 this.UNvvunVVn();
                                 this.ccOO0COcoco0();
                                 this.nUNnuUNnV();
                                 if (this.UvNNVUVNVuvV.uNNnnnuuuN(500L)) {
                                    this.nNuVunNUVu();
                                    this.UvNNVUVNVuvV.UuUVuuUu();
                                 }
                              }

                              if (this.uNVvVvUuuuU != WardenFarm.NVnVnNnN.NONE && uUnuvNvvNU.field_1755 == null) {
                                 if (this.vNVuvnUUnuUn()) {
                                    this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
                                    if (uUnuvNvvNU.field_1724.method_5624()) {
                                       uUnuvNvvNU.field_1724.method_5728(false);
                                    }

                                    return;
                                 }

                                 this.vuvnnvuNVvu();
                              }

                              if (uUnuvNvvNU.field_1755 instanceof class_476 var5) {
                                 this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
                                 String var15 = var5.method_25440().getString().toLowerCase().replaceAll("§.", "").trim();
                                 boolean var7 = var15.contains("клан") || var15.contains("clan") || var15.contains("хранилище");
                                 boolean var8 = this.NVNnnvnuunNv.C00OOC00oO("Варден")
                                    ? var15.equals("сундук") || var15.equals("большой сундук") || var15.equals("chest") || var15.equals("large chest")
                                    : var15.equals("бочка") || var15.equals("barrel");
                                 boolean var9 = this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.WAITING_FOR_GUI_STASH
                                    || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.STORING_IN_CHEST
                                    || !this.vNVuvnUUnuUn() && this.VVnVNnunVvu.uUnuvNvvNU() && this.vUNuuvvnVnv() && this.VvuUUUNNNv();
                                 if (var7 && this.unNNVVNnvvV.C00OOC00oO("В клан")) {
                                    this.uUnuvNvvNU((class_1707)var5.method_17577());
                                 } else if (var9) {
                                    this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.STORING_IN_CHEST;
                                    this.uUnuvNvvNU((class_1707)var5.method_17577());
                                 } else if (this.vNVuvnUUnuUn() && var8) {
                                    this.UuUVuuUu((class_1707)var5.method_17577());
                                 }
                              } else {
                                 if (this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.GOING_TO_CHEST
                                    || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.ROTATING
                                    || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.OPENING) {
                                    this.OCOocoOoOO();
                                 }

                                 switch (this.NVuunNnvvvVu) {
                                    case SEARCHING:
                                       this.unNNVVNnvvV();
                                       break;
                                    case GOING_TO_CHEST:
                                       this.NVUunUNUN();
                                       break;
                                    case ROTATING:
                                       this.UUVNuUNUvUnV();
                                       break;
                                    case OPENING:
                                       this.vuvnUnVnUNnV();
                                       break;
                                    case WAITING_FOR_GUI:
                                       this.NNUUNUuVNNVn();
                                       break;
                                    case RETREATING:
                                       this.uUVVvVVNvvn();
                                       break;
                                    case GOING_TO_DEATH_LOOT:
                                       this.UuNnnVnuNNV();
                                       break;
                                    case COLLECTING_DEATH_LOOT:
                                       this.uUVvnUuNvvN();
                                    case HUB_WAITING_FOR_CHEST:
                                    default:
                                       break;
                                    case SWAPPING_TO_SAVE_ANARCHY:
                                       this.NVuNUuVnVUN();
                                       break;
                                    case GOING_TO_STASH:
                                       this.NVuunNnvvvVu();
                                       break;
                                    case OPENING_STASH:
                                       this.VuunNUUUvu();
                                       break;
                                    case ROTATING_STASH:
                                       this.vNnNuuvVn();
                                       break;
                                    case OPENING_STASH_BLOCK:
                                       this.VUuuVUnun();
                                       break;
                                    case WAITING_FOR_GUI_STASH:
                                       this.vVVuuVVv();
                                 }

                                 if (this.vunuUUVVUv == WardenFarm.uunvUUVnuNn.NONE) {
                                    this.uUVuVvuNUvnu();
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            } else {
               this.NnUuNNU();
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (uUnuvNvvNU.field_1724 != null && var1.uNNnnnuuuN() == uvUUuvnunU.NVnVnNnN.RECEIVE) {
         if (var1.vVvUvVVuuNvV() instanceof class_7439 var2) {
            String var12 = var2.comp_763().getString();
            if (this.NnUuNNU.uUnuvNvvNU()) {
               Matcher var4 = VUUnuVvVu.matcher(var12);
               if (var4.find()) {
                  try {
                     double var5 = Double.parseDouble(var4.group(1).replace(',', '.'));
                     double var7 = Double.parseDouble(var4.group(2).replace(',', '.'));
                     double var9 = Double.parseDouble(var4.group(3).replace(',', '.'));
                     if (this.C00OOC00oO(new class_243(var5, var7, var9))) {
                        this.NuUuUvUUvU = class_2338.method_49637(var5, var7, var9);
                        this.VUVvNvvVUN = System.currentTimeMillis() + 270000L;
                     }
                  } catch (NumberFormatException var11) {
                  }
               }
            }

            if (this.UvUnnnn != WardenFarm.VUUnVnVNNU.NONE || this.vunuUUVVUv == WardenFarm.uunvUUVnuNn.TELEPORT_WARDEN) {
               if (this.vVvUvVVuuNvV(var12)) {
                  this.vNnNNNuVVnUv = true;
               }
            }
         }
      }
   }

   private void uNnUnnuNUnNu() {
      if (this.UvUvUNuvNU.uUnuvNvvNU() && this.NuunnvnN.uUnuvNvvNU() && uUnuvNvvNU.field_1724 != null) {
         if (uUnuvNvvNU.field_1755 instanceof class_418 || uUnuvNvvNU.field_1724.method_29504()) {
            if (this.unnnNUNnVu()) {
               if (!this.nNVVUnuVVVuV) {
                  vnvuUUVun.UuUVuuUu.UuUVuuUu();
                  String var1 = vnvuUUVun.UuUVuuUu.uUnuvNvvNU();
                  if (!"N/A".equals(var1)) {
                     this.NvNUuuuvUvu = var1;
                  }

                  this.uunNUuunVU();
                  this.VnVuuvVvnNv();
                  this.nNVVUnuVVVuV = true;
                  this.vnVuunuNN = true;
                  this.nNnVnUNVV.clear();
                  this.vvUVNVvvNUv.clear();
                  this.nvuVnuvUVvVu = false;
                  this.Oco0Oococc = null;
                  this.uNUnUuUnvnnU = false;
                  this.vNnNuuvVn = null;
                  this.UVnuVUUVnnU = null;
                  this.UNNunNuUNVuU = null;
                  this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
                  if (this.NVuNUuVnVUN != null) {
                     this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
                  }

                  this.UNvvunVVn.UuUVuuUu();
                  this.ccOO0COcoco0.UuUVuuUu();
               }
            }
         }
      }
   }

   private void NnUuNNU() {
      if (this.NVuNUuVnVUN != null) {
         this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
      }

      this.vuvnnvuNVvu();
      if (this.NnvVNVnn.uNNnnnuuuN(1000L)) {
         uUnuvNvvNU.field_1724.method_7331();
         if (uUnuvNvvNU.field_1755 instanceof class_418) {
            uUnuvNvvNU.method_1507(null);
         }

         this.NnvVNVnn.UuUVuuUu();
      }
   }

   private void nNvNUVU() {
      this.uunNUuunVU();
      this.vNnNuuvVn = null;
      this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
      this.UNvvunVVn.UuUVuuUu();
      this.ccOO0COcoco0.UuUVuuUu();
      this.NNUUNUuVNNVn.UuUVuuUu();
      if (this.NVuNUuVnVUN != null) {
         this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
      }

      vnvuUUVun.UuUVuuUu.UuUVuuUu();
      if (this.vVvuUVnV()) {
         this.uuvvuNvuUNVV();
      } else {
         if (!this.vNVuvnUUnuUn()) {
            this.vnVuunuNN = true;
            this.NNUUNUuVNNVn.UuUVuuUu();
         }
      }
   }

   private boolean UnUNuUU() {
      if (uUnuvNvvNU.field_1755 instanceof class_476 var1) {
         String var4 = var1.method_25440().getString().toLowerCase().replaceAll("§.", "").trim();
         boolean var3 = this.NVNnnvnuunNv.C00OOC00oO("Варден")
            ? var4.equals("сундук") || var4.equals("большой сундук") || var4.equals("chest") || var4.equals("large chest")
            : var4.equals("бочка") || var4.equals("barrel");
         if (this.vNVuvnUUnuUn() && var3) {
            return true;
         }
      }

      return this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.ROTATING
         || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.OPENING
         || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.WAITING_FOR_GUI;
   }

   private void uUVuVvuNUvnu() {
      if (this.Oco0Oococc != null && !this.UvUvUNuvNU() && !this.UnUNuUU()) {
         Runnable var1 = this.Oco0Oococc;
         this.Oco0Oococc = null;
         var1.run();
      }
   }

   private boolean UvUvUNuvNU() {
      if (this.vnuNNVvVVuN > 0L && System.currentTimeMillis() - this.vnuNNVvVVuN < 3000L) {
         return true;
      } else {
         return this.NVNnnvnuunNv() ? true : this.uVunuUNVVUUV();
      }
   }

   private void c0oOOCcCoC0() {
      this.vnuNNVvVVuN = System.currentTimeMillis();
   }

   private void UuUVuuUu(Runnable var1) {
      this.uUnuvNvvNU(var1);
   }

   private void C00OOC00oO(Runnable var1) {
      this.uUnuvNvvNU(var1);
   }

   private void uUnuvNvvNU(Runnable var1) {
      if (!this.UvUvUNuvNU()) {
         var1.run();
      } else {
         this.Oco0Oococc = var1;
         this.VVnVNnunVvu();
      }
   }

   private void VVnVNnunVvu() {
      if (this.vNVuvnUUnuUn()) {
         if (this.NVuunNnvvvVu != WardenFarm.nvnNNunvv.SWAPPING_TO_SAVE_ANARCHY
            && this.NVuunNnvvvVu != WardenFarm.nvnNNunvv.GOING_TO_STASH
            && this.NVuunNnvvvVu != WardenFarm.nvnNNunvv.OPENING_STASH
            && this.NVuunNnvvvVu != WardenFarm.nvnNNunvv.ROTATING_STASH
            && this.NVuunNnvvvVu != WardenFarm.nvnNNunvv.OPENING_STASH_BLOCK
            && this.NVuunNnvvvVu != WardenFarm.nvnNNunvv.WAITING_FOR_GUI_STASH
            && this.NVuunNnvvvVu != WardenFarm.nvnNNunvv.STORING_IN_CHEST
            && this.NVuunNnvvvVu != WardenFarm.nvnNNunvv.HUB_WAITING_FOR_CHEST) {
            this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
            this.UNvvunVVn.UuUVuuUu();
         }
      }
   }

   private void unNNVVNnvvV() {
      this.VunnVNvNV();
      if (!this.vNVuvnUUnuUn()) {
         if (this.uUnuvNvvNU(vnvuUUVun.UuUVuuUu.uUnuvNvvNU())) {
            if (this.UvUnnnn != WardenFarm.VUUnVnVNNU.NONE) {
               return;
            }

            this.NvnuuuvnVV();
         }
      } else if (this.UvUvUNuvNU.uUnuvNvvNU() && this.NuunnvnN.uUnuvNvvNU() && this.uUnuvNvvNU(vnvuUUVun.UuUVuuUu.uUnuvNvvNU()) && this.vVvuUVnV()) {
         this.vuNnuUnu();
      } else if (this.vvUVNVvvNUv()) {
         this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
         this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.GOING_TO_DEATH_LOOT;
         this.NNUUNUuVNNVn.UuUVuuUu();
         this.ccOO0COcoco0.UuUVuuUu();
         this.nNuVunNUVu.UuUVuuUu();
      } else {
         boolean var1 = this.Oco0Oococc != null || this.uNUnUuUnvnnU;
         if (var1) {
            if (this.NVuNUuVnVUN.getCustomGoalProcess().isActive()) {
               this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
            }

            this.nuunNvv();
         } else if (this.UvNNVUVNVuvV()) {
            this.vUvUvUNNuNvn();
         } else {
            this.UnvuVuVnNuvu();
            this.vNnNuuvVn = this.nvvnUnUn();
            if (this.vNnNuuvVn != null) {
               this.VUuuVUnun = this.NVNnnvnuunNv(this.vNnNuuvVn);
               this.VuNNvnVVUUn = 0;
               this.UnVvNNuNu = false;
               this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.GOING_TO_CHEST;
               this.NnVnNVN();
               this.VuunNUUUvu = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(this.vNnNuuvVn));
               this.coOocCcoOc0 = 0L;
               this.UuUUvvVunV = false;
               this.vUvVUNnN();
               this.vnUUvvnUVUu = false;
               this.ccOO0COcoco0.UuUVuuUu();
               this.UNvvunVVn.UuUVuuUu();
            } else {
               boolean var2 = false;
               if (this.UNvvunVVn.uNNnnnuuuN(20000L)) {
                  var2 = this.VvVvnNUnvuvV();
               }

               if (!var2) {
                  class_2338 var3 = this.NuunnvnN();
                  if (var3 != null) {
                     double var6 = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(var3));
                     if (var6 > 6.0) {
                        if (!this.NVuNUuVnVUN.getCustomGoalProcess().isActive() || this.nNuVunNUVu.uNNnnnuuuN(3000L)) {
                           this.NVuNUuVnVUN.getCustomGoalProcess().setGoalAndPath(new GoalNear(var3, 3));
                           this.nNuVunNUVu.UuUVuuUu();
                        }
                     } else if (this.NVuNUuVnVUN.getCustomGoalProcess().isActive()) {
                        this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
                     }
                  } else {
                     if (!this.NVuNUuVnVUN.getCustomGoalProcess().isActive() || this.nNuVunNUVu.uNNnnnuuuN(6000L)) {
                        int[] var4 = this.UvnvNVnnnnNU();
                        this.NVuNUuVnVUN.getCustomGoalProcess().setGoalAndPath(new GoalXZ(var4[0], var4[1]));
                        this.nNuVunNUVu.UuUVuuUu();
                     }
                  }
               }
            }
         }
      }
   }

   private class_2338 NuunnvnN() {
      long var1 = System.currentTimeMillis();
      return this.uUVVvVVNvvn
         .stream()
         .filter(var1x -> !this.OoccOc0CO.contains(var1x))
         .filter(this::uVUuuVnNVU)
         .filter(var1x -> this.UnUNVVVNuv(var1x) <= this.o0Ooc0COOoc())
         .filter(var3 -> {
            Long var4 = this.UUuUnNVNuuv.get(var3);
            return var4 == null || var4 <= var1;
         })
         .min(
            Comparator.<class_2338>comparingLong(var1x -> Math.max(0L, this.UnUNVVVNuv(var1x)))
               .thenComparingDouble(var0 -> uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(var0)))
         )
         .orElse(null);
   }

   private void NVUunUNUN() {
      if (this.vNnNuuvVn == null
         || this.uUnuvNvvNU(this.vNnNuuvVn)
         || uUnuvNvvNU.field_1687.method_8320(this.vNnNuuvVn).method_26204()
            != (this.NVNnnvnuunNv.C00OOC00oO("Варден") ? class_2246.field_10034 : class_2246.field_16328)) {
         this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
         this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
         this.UNvvunVVn.UuUVuuUu();
      } else if (!this.uVUuuVnNVU(this.vNnNuuvVn)) {
         this.UUuUnNVNuuv.put(this.vNnNuuvVn, System.currentTimeMillis() + 5000L);
         this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
         this.vNnNuuvVn = null;
         this.uUuuVvVunVVu = null;
         this.VuunNUUUvu = -1.0;
         this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
         this.UNvvunVVn.UuUVuuUu();
      } else {
         double var1 = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(this.vNnNuuvVn));
         if (var1 < this.VuunNUUUvu - 1.0) {
            this.VuunNUUUvu = var1;
            this.ccOO0COcoco0.UuUVuuUu();
         }

         boolean var3 = var1 <= 2.9;
         boolean var4 = var3 && this.uNnUnnuNUnNu(this.vNnNuuvVn);
         if (var4) {
            this.uUuuVvVunVVu = null;
            long var9 = this.UuUVuuUu(this.vNnNuuvVn) - System.currentTimeMillis();
            class_2338 var7 = this.vNVuvnUUnuUn(this.vNnNuuvVn);
            if (var7 != null) {
               this.UvnvNVnnnnNU(var7);
            } else if (this.UuUUvvVunV || var9 <= 45000L) {
               this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
               boolean var10 = var9 <= 0L && !this.C00OOC00oO(this.vNnNuuvVn);
               if (var10) {
                  this.coOocCcoOc0 = System.currentTimeMillis();
                  this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.ROTATING;
                  this.NNUUNUuVNNVn.UuUVuuUu();
               } else {
                  this.coOocCcoOc0 = 0L;
               }
            } else if (this.UvUvUNuvNU()) {
               this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
            } else {
               vnvuUUVun.UuUVuuUu.UuUVuuUu();
               String var8 = vnvuUUVun.UuUVuuUu.uUnuvNvvNU();
               if (!"N/A".equals(var8)) {
                  this.OCOocoOoOO = var8;
               }

               this.vVVuuVVv = this.vNnNuuvVn;
               this.C00OOC00oO((Runnable)(() -> {
                  uUnuvNvvNU.field_1724.field_3944.method_45730("hub");
                  this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.HUB_WAITING_FOR_CHEST;
               }));
            }
         } else if (var3) {
            class_2338 var5 = this.vNVuvnUUnuUn(this.vNnNuuvVn);
            if (var5 != null) {
               this.UvnvNVnnnnNU(var5);
            } else {
               if (this.uUuuVvVunVVu == null || !this.uUuuVvVunVVu.equals(this.vNnNuuvVn)) {
                  this.uUuuVvVunVVu = this.vNnNuuvVn;
                  this.NuUvUNN = System.currentTimeMillis();
               }

               if (!this.NVuNUuVnVUN.getCustomGoalProcess().isActive()) {
                  this.VUuuVUnun = this.NVNnnvnuunNv(this.vNnNuuvVn);
                  if (this.VUuuVUnun != null) {
                     this.NVuNUuVnVUN.getCustomGoalProcess().setGoalAndPath(new GoalBlock(this.VUuuVUnun));
                  }
               }

               if (System.currentTimeMillis() - this.NuUvUNN >= 4000L) {
                  this.UUuUnNVNuuv.put(this.vNnNuuvVn, System.currentTimeMillis() + 30000L);
                  this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
                  this.vNnNuuvVn = null;
                  this.uUuuVvVunVVu = null;
                  this.VuunNUUUvu = -1.0;
                  this.ccOO0COcoco0.UuUVuuUu();
                  this.nNuVunNUVu.UuUVuuUu();
                  this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
                  this.UNvvunVVn.UuUVuuUu();
               }
            }
         } else {
            this.uUuuVvVunVVu = null;
            if (!this.NVuNUuVnVUN.getCustomGoalProcess().isActive()) {
               this.VUuuVUnun = this.NVNnnvnuunNv(this.vNnNuuvVn);
               this.NnVnNVN();
            }

            if (this.ccOO0COcoco0.uNNnnnuuuN(15000L)) {
               this.UUuUnNVNuuv.put(this.vNnNuuvVn, System.currentTimeMillis() + 30000L);
               this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
               this.vNnNuuvVn = null;
               this.uUuuVvVunVVu = null;
               this.VuunNUUUvu = -1.0;
               this.ccOO0COcoco0.UuUVuuUu();
               this.nNuVunNUVu.UuUVuuUu();
               this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
               this.UNvvunVVn.UuUVuuUu();
            }
         }
      }
   }

   private void UUVNuUNUvUnV() {
      if (this.vNnNuuvVn == null) {
         this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
         this.UNvvunVVn.UuUVuuUu();
      } else {
         class_2338 var1 = this.vNVuvnUUnuUn(this.vNnNuuvVn);
         if (var1 != null) {
            this.UvnvNVnnnnNU(var1);
         } else if (!this.nNvNUVU(this.vNnNuuvVn)) {
            this.VuunNUUUvu = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(this.vNnNuuvVn));
            this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.GOING_TO_CHEST;
            this.ccOO0COcoco0.UuUVuuUu();
         } else {
            uuUuvNuNVNVU var2 = this.uUnuvNvvNU(this.NnUuNNU(this.vNnNuuvVn));
            this.unUvvVVVVUu.UuUVuuUu(this.UuUVuuUu(var2, this.UuUVuuUu(var2)), 35.0F, 35.0F, 35.0F, 35.0F, 20, 1);
            if (this.UnUNuUU(this.vNnNuuvVn) != null) {
               this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.OPENING;
               this.NNUUNUuVNNVn.UuUVuuUu();
            }
         }
      }
   }

   private void vuvnUnVnUNnV() {
      if (this.vNnNuuvVn == null) {
         this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
         this.UNvvunVVn.UuUVuuUu();
      } else {
         class_2338 var1 = this.vNVuvnUUnuUn(this.vNnNuuvVn);
         if (var1 != null) {
            this.UvnvNVnnnnNU(var1);
         } else if (!this.nNvNUVU(this.vNnNuuvVn)) {
            this.VuunNUUUvu = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(this.vNnNuuvVn));
            this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.GOING_TO_CHEST;
            this.ccOO0COcoco0.UuUVuuUu();
         } else if (!this.Oco0Oococc()) {
            this.VunnVNvNV();
         } else {
            int var2 = uUnuvNvvNU.field_1724.method_31548().method_67532();
            class_1799 var3 = (class_1799)uUnuvNvvNU.field_1724.method_31548().method_67533().get(var2);
            if (var3.method_7909() == class_1802.field_8366 || var3.method_7964().getString().contains("[★]")) {
               for (int var4 = 0; var4 < 9; var4++) {
                  class_1799 var5 = (class_1799)uUnuvNvvNU.field_1724.method_31548().method_67533().get(var4);
                  if (var5.method_7960() || var5.method_7909() != class_1802.field_8366 && !var5.method_7964().getString().contains("[★]")) {
                     uUnuvNvvNU.field_1724.method_31548().method_61496(var4);
                     this.NNUUNUuVNNVn.UuUVuuUu();
                     break;
                  }
               }
            }

            uuUuvNuNVNVU var6 = this.uUnuvNvvNU(this.NnUuNNU(this.vNnNuuvVn));
            this.unUvvVVVVUu.UuUVuuUu(this.UuUVuuUu(var6, 0.6F), 26.0F, 26.0F, 28.0F, 28.0F, 20, 1);
            class_3965 var7 = this.UnUNuUU(this.vNnNuuvVn);
            if (var7 == null) {
               if (this.NNUUNUuVNNVn.uNNnnnuuuN(700L)) {
                  this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.ROTATING;
                  this.NNUUNUuVNNVn.UuUVuuUu();
               }
            } else {
               if (this.NNUUNUuVNNVn.uNNnnnuuuN(0L)) {
                  uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
                  uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var7);
                  this.VuNNvnVVUUn++;
                  this.UnVvNNuNu = false;
                  this.coOocCcoOc0 = System.currentTimeMillis();
                  this.VunnVNvNV();
                  this.c0oOOCcCoC0();
                  this.UUuUnNVNuuv.put(this.vNnNuuvVn, System.currentTimeMillis() + 5000L);
                  this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.WAITING_FOR_GUI;
                  this.NNUUNUuVNNVn.UuUVuuUu();
               }
            }
         }
      }
   }

   private boolean nnuUVNUuvvVU() {
      for (class_1657 var2 : uUnuvNvvNU.field_1687.method_18456()) {
         if (var2 != uUnuvNvvNU.field_1724 && !var2.method_29504() && uUnuvNvvNU.field_1724.method_5739(var2) <= 40.0) {
            return true;
         }
      }

      for (class_1297 var4 : uUnuvNvvNU.field_1687.method_18112()) {
         if (var4 instanceof class_7260 && uUnuvNvvNU.field_1724.method_5739(var4) <= 24.0) {
            return true;
         }
      }

      return false;
   }

   private class_243 nVVUuvuNnUN() {
      double var1 = uUnuvNvvNU.field_1724.method_23317();
      double var3 = uUnuvNvvNU.field_1724.method_23321();
      double var5 = 0.0;
      double var7 = 0.0;

      for (class_1657 var10 : uUnuvNvvNU.field_1687.method_18456()) {
         if (var10 != uUnuvNvvNU.field_1724 && !var10.method_29504()) {
            double var11 = var1 - var10.method_23317();
            double var13 = var3 - var10.method_23321();
            double var15 = Math.max(1.0, Math.hypot(var11, var13));
            double var17 = 1.0 / (var15 * var15);
            var5 += var11 / var15 * var17;
            var7 += var13 / var15 * var17;
         }
      }

      for (class_1297 var21 : uUnuvNvvNU.field_1687.method_18112()) {
         if (var21 instanceof class_7260) {
            double var22 = var1 - var21.method_23317();
            double var24 = var3 - var21.method_23321();
            double var25 = Math.max(1.0, Math.hypot(var22, var24));
            double var26 = 1.5 / (var25 * var25);
            var5 += var22 / var25 * var26;
            var7 += var24 / var25 * var26;
         }
      }

      double var20 = Math.hypot(var5, var7);
      if (var20 < 1.0E-6) {
         double var23 = Math.random() * Math.PI * 2.0;
         return new class_243(Math.cos(var23), 0.0, Math.sin(var23));
      } else {
         return new class_243(var5 / var20, 0.0, var7 / var20);
      }
   }

   private double UuUVuuUu(double var1, double var3) {
      double var5 = 0.0;

      for (class_1657 var8 : uUnuvNvvNU.field_1687.method_18456()) {
         if (var8 != uUnuvNvvNU.field_1724 && !var8.method_29504()) {
            double var9 = Math.hypot(var8.method_23317() - var1, var8.method_23321() - var3);
            var5 += 12.0 / (var9 + 2.0);
            if (var9 < 10.0) {
               var5 += (10.0 - var9) * 2.0;
            }
         }
      }

      for (class_1297 var12 : uUnuvNvvNU.field_1687.method_18112()) {
         if (var12 instanceof class_7260) {
            double var13 = Math.hypot(var12.method_23317() - var1, var12.method_23321() - var3);
            var5 += 18.0 / (var13 + 2.0);
            if (var13 < 14.0) {
               var5 += (14.0 - var13) * 3.0;
            }
         }
      }

      return var5;
   }

   private boolean UuUVuuUu(double var1, double var3, double var5, double var7) {
      byte var9 = 6;

      for (int var10 = 1; var10 <= var9; var10++) {
         double var11 = (double)var10 / var9;
         double var13 = var1 + (var5 - var1) * var11;
         double var15 = var3 + (var7 - var3) * var11;

         for (class_1657 var18 : uUnuvNvvNU.field_1687.method_18456()) {
            if (var18 != uUnuvNvvNU.field_1724 && !var18.method_29504() && Math.hypot(var18.method_23317() - var13, var18.method_23321() - var15) < 6.0) {
               return false;
            }
         }
      }

      return true;
   }

   private int[] nNnVnUNVV() {
      class_243 var1 = this.nVVUuvuNnUN();
      double var2 = Math.atan2(var1.field_1350, var1.field_1352);
      double var4 = uUnuvNvvNU.field_1724.method_23317();
      double var6 = uUnuvNvvNU.field_1724.method_23321();
      double var8 = Double.MAX_VALUE;
      int[] var10 = null;
      int[] var11 = null;
      double var12 = Double.MAX_VALUE;

      for (int var14 = 0; var14 < 32; var14++) {
         double var15 = Math.toRadians(15.0 + Math.random() * 65.0);
         double var17 = Math.random() < 0.8 ? var2 + (Math.random() * 2.0 - 1.0) * var15 : Math.random() * Math.PI * 2.0;
         double var19 = 22.0 + Math.random() * 26.0;
         double var21 = var4 + var19 * Math.cos(var17);
         double var23 = var6 + var19 * Math.sin(var17);
         if (this.C00OOC00oO(new class_243(var21, uUnuvNvvNU.field_1724.method_23318(), var23))) {
            double var25 = this.UuUVuuUu(var21, var23);
            if (var25 < var12) {
               var12 = var25;
               var11 = new int[]{(int)var21, (int)var23};
            }

            if (this.UuUVuuUu(var4, var6, var21, var23) && var25 < var8) {
               var8 = var25;
               var10 = new int[]{(int)var21, (int)var23};
            }
         }
      }

      if (var10 != null) {
         return var10;
      } else if (var11 != null) {
         return var11;
      } else {
         double var27 = var4 + var1.field_1352 * 26.0;
         double var16 = var6 + var1.field_1350 * 26.0;
         return this.C00OOC00oO(new class_243(var27, uUnuvNvvNU.field_1724.method_23318(), var16)) ? new int[]{(int)var27, (int)var16} : null;
      }
   }

   private void nuunNvv() {
      this.VunnVNvNV();
      if (this.uNnUnnuNUnNu.uUnuvNvvNU() && this.vNVuvnUUnuUn() && this.nnuUVNUuvvVU()) {
         int[] var1 = this.nNnVnUNVV();
         if (var1 != null) {
            this.UNNunNuUNVuU = var1;
            this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
            this.NVuNUuVnVUN.getCustomGoalProcess().setGoalAndPath(new GoalXZ(var1[0], var1[1]));
            this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.RETREATING;
            this.ccOO0COcoco0.UuUVuuUu();
            this.nNuVunNUVu.UuUVuuUu();
         }
      }
   }

   private void uUVVvVVNvvn() {
      this.VunnVNvNV();
      if (this.UNNunNuUNVuU == null) {
         this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
         this.UNvvunVVn.UuUVuuUu();
      } else {
         boolean var1 = Math.hypot(uUnuvNvvNU.field_1724.method_23317() - this.UNNunNuUNVuU[0], uUnuvNvvNU.field_1724.method_23321() - this.UNNunNuUNVuU[1])
            <= 3.0;
         if (!var1 && this.nnuUVNUuvvVU() && !this.ccOO0COcoco0.uNNnnnuuuN(15000L)) {
            if (!this.NVuNUuVnVUN.getCustomGoalProcess().isActive() || this.nNuVunNUVu.uNNnnnuuuN(2500L)) {
               this.NVuNUuVnVUN.getCustomGoalProcess().setGoalAndPath(new GoalXZ(this.UNNunNuUNVuU[0], this.UNNunNuUNVuU[1]));
               this.nNuVunNUVu.UuUVuuUu();
            }
         } else {
            this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
            this.UNNunNuUNVuU = null;
            this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
            this.UNvvunVVn.UuUVuuUu();
         }
      }
   }

   private boolean vvUVNVvvNUv() {
      if (this.NuUuUvUUvU == null) {
         return false;
      } else if (this.NnUuNNU.uUnuvNvvNU() && System.currentTimeMillis() <= this.VUVvNvvVUN) {
         return true;
      } else {
         this.NuUuUvUUvU = null;
         return false;
      }
   }

   private void UuNnnVnuNNV() {
      if (!this.vvUVNVvvNUv()) {
         this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
         this.UNvvunVVn.UuUVuuUu();
      } else {
         double var1 = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(this.NuUuUvUUvU));
         if (var1 <= 6.0) {
            this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
            this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.COLLECTING_DEATH_LOOT;
            this.NNUUNUuVNNVn.UuUVuuUu();
            this.ccOO0COcoco0.UuUVuuUu();
            this.nNuVunNUVu.UuUVuuUu();
         } else {
            if (!this.NVuNUuVnVUN.getCustomGoalProcess().isActive() || this.nNuVunNUVu.uNNnnnuuuN(2500L)) {
               this.NVuNUuVnVUN.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.NuUuUvUUvU, 2));
               this.nNuVunNUVu.UuUVuuUu();
            }

            if (this.ccOO0COcoco0.uNNnnnuuuN(40000L)) {
               this.UUuUnNVNuuv();
            }
         }
      }
   }

   private void uUVvnUuNvvN() {
      if (!this.vvUVNVvvNUv()) {
         this.UUuUnNVNuuv();
      } else {
         class_1542 var1 = null;
         double var2 = Double.MAX_VALUE;

         for (class_1297 var5 : uUnuvNvvNU.field_1687.method_18112()) {
            if (var5 instanceof class_1542 var6 && var6.method_5805() && !(var6.method_19538().method_1022(class_243.method_24953(this.NuUuUvUUvU)) > 16.0)) {
               double var7 = uUnuvNvvNU.field_1724.method_19538().method_1022(var6.method_19538());
               if (var7 < var2) {
                  var2 = var7;
                  var1 = var6;
               }
            }
         }

         if (var1 == null) {
            if (this.NNUUNUuVNNVn.uNNnnnuuuN(2000L)) {
               this.UUuUnNVNuuv();
            }
         } else {
            this.NNUUNUuVNNVn.UuUVuuUu();
            if (this.ccOO0COcoco0.uNNnnnuuuN(90000L)) {
               this.UUuUnNVNuuv();
            } else {
               if (!this.NVuNUuVnVUN.getCustomGoalProcess().isActive() || this.nNuVunNUVu.uNNnnnuuuN(1500L)) {
                  this.NVuNUuVnVUN.getCustomGoalProcess().setGoalAndPath(new GoalNear(var1.method_24515(), 1));
                  this.nNuVunNUVu.UuUVuuUu();
               }
            }
         }
      }
   }

   private void UUuUnNVNuuv() {
      this.NuUuUvUUvU = null;
      this.VUVvNvvVUN = 0L;
      this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
      this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
      this.UNvvunVVn.UuUVuuUu();
      if (this.VVnVNnunVvu.uUnuvNvvNU() && this.uuuVnuvnnNnU()) {
         this.vUvUvUNNuNvn();
      }
   }

   private void NVuNUuVnVUN() {
      vnvuUUVun.UuUVuuUu.UuUVuuUu();
      if (vnvuUUVun.UuUVuuUu.uUnuvNvvNU().equals(this.UUVNuUNUvUnV.uUnuvNvvNU())) {
         if (this.NNUUNUuVNNVn.uNNnnnuuuN(100L)) {
            this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.GOING_TO_STASH;
            this.NNUUNUuVNNVn.UuUVuuUu();
            this.ccOO0COcoco0.UuUVuuUu();
         }
      } else {
         this.NNUUNUuVNNVn.UuUVuuUu();
         if (!this.UvUvUNuvNU() && this.ccOO0COcoco0.uNNnnnuuuN(4000L)) {
            uUnuvNvvNU.field_1724.field_3944.method_45730("an" + this.UUVNuUNUvUnV.uUnuvNvvNU());
            this.ccOO0COcoco0.UuUVuuUu();
         }
      }
   }

   private void NVuunNnvvvVu() {
      this.VunnVNvNV();
      if (!this.uuuVnuvnnNnU()) {
         this.nNunUnVN();
      } else if (this.unNNVVNnvvV.C00OOC00oO("В клан")) {
         if (this.NNUUNUuVNNVn.uNNnnnuuuN(500L)) {
            this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.OPENING_STASH;
            this.NNUUNUuVNNVn.UuUVuuUu();
         }
      } else {
         if (this.NNUUNUuVNNVn.uNNnnnuuuN(300L)) {
            this.VvVuvUvvNNVv();
            this.NNUUNUuVNNVn.UuUVuuUu();
         }

         if (this.UVnuVUUVnnU != null && this.c0oOOCcCoC0(this.UVnuVUUVnnU)) {
            double var1 = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(this.UVnuVUUVnnU));
            if (var1 <= 2.9 && this.uNnUnnuNUnNu(this.UVnuVUUVnnU)) {
               this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
               this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.ROTATING_STASH;
               this.NNUUNUuVNNVn.UuUVuuUu();
            } else {
               if (!this.NVuNUuVnVUN.getCustomGoalProcess().isActive() || this.nNuVunNUVu.uNNnnnuuuN(2500L)) {
                  this.NVuNUuVnVUN.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.UVnuVUUVnnU, 1));
                  this.nNuVunNUVu.UuUVuuUu();
               }

               if (this.ccOO0COcoco0.uNNnnnuuuN(15000L)) {
                  this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
                  this.nNunUnVN();
               }
            }
         } else {
            if (this.ccOO0COcoco0.uNNnnnuuuN(15000L)) {
               this.nNunUnVN();
            }
         }
      }
   }

   private void vNnNuuvVn() {
      if (this.UVnuVUUVnnU == null) {
         this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.GOING_TO_STASH;
         this.NNUUNUuVNNVn.UuUVuuUu();
         this.ccOO0COcoco0.UuUVuuUu();
      } else if (!this.nNvNUVU(this.UVnuVUUVnnU)) {
         this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.GOING_TO_STASH;
         this.NNUUNUuVNNVn.UuUVuuUu();
         this.ccOO0COcoco0.UuUVuuUu();
      } else {
         uuUuvNuNVNVU var1 = this.uUnuvNvvNU(this.NnUuNNU(this.UVnuVUUVnnU));
         this.unUvvVVVVUu.UuUVuuUu(this.UuUVuuUu(var1, this.UuUVuuUu(var1)), 45.0F, 45.0F, 45.0F, 45.0F, 20, 1);
         if (this.UnUNuUU(this.UVnuVUUVnnU) != null && this.NNUUNUuVNNVn.uNNnnnuuuN(70L)) {
            this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.OPENING_STASH_BLOCK;
            this.NNUUNUuVNNVn.UuUVuuUu();
         }
      }
   }

   private void VUuuVUnun() {
      int var1 = uUnuvNvvNU.field_1724.method_31548().method_67532();
      class_1799 var2 = (class_1799)uUnuvNvvNU.field_1724.method_31548().method_67533().get(var1);
      if (var2.method_7909() == class_1802.field_8366 || var2.method_7964().getString().contains("[★]")) {
         for (int var3 = 0; var3 < 9; var3++) {
            class_1799 var4 = (class_1799)uUnuvNvvNU.field_1724.method_31548().method_67533().get(var3);
            if (var4.method_7960() || var4.method_7909() != class_1802.field_8366 && !var4.method_7964().getString().contains("[★]")) {
               uUnuvNvvNU.field_1724.method_31548().method_61496(var3);
               this.NNUUNUuVNNVn.UuUVuuUu();
               break;
            }
         }
      }

      if (!this.nNvNUVU(this.UVnuVUUVnnU)) {
         this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.GOING_TO_STASH;
         this.NNUUNUuVNNVn.UuUVuuUu();
         this.ccOO0COcoco0.UuUVuuUu();
      } else {
         uuUuvNuNVNVU var5 = this.uUnuvNvvNU(this.NnUuNNU(this.UVnuVUUVnnU));
         this.unUvvVVVVUu.UuUVuuUu(this.UuUVuuUu(var5, 0.6F), 26.0F, 26.0F, 28.0F, 28.0F, 20, 1);
         class_3965 var6 = this.UnUNuUU(this.UVnuVUUVnnU);
         if (var6 == null) {
            if (this.NNUUNUuVNNVn.uNNnnnuuuN(700L)) {
               this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.ROTATING_STASH;
               this.NNUUNUuVNNVn.UuUVuuUu();
            }
         } else {
            if (this.NNUUNUuVNNVn.uNNnnnuuuN(90L)) {
               uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
               uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var6);
               COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
               this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.WAITING_FOR_GUI_STASH;
               this.NNUUNUuVNNVn.UuUVuuUu();
            }
         }
      }
   }

   private void vVVuuVVv() {
      this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
      if (this.NNUUNUuVNNVn.uNNnnnuuuN(2000L)) {
         if (this.VunnVNvNV < 3) {
            this.VunnVNvNV++;
            this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.GOING_TO_STASH;
            this.NNUUNUuVNNVn.UuUVuuUu();
            this.ccOO0COcoco0.UuUVuuUu();
         } else {
            this.nNunUnVN();
         }
      }
   }

   private void VuunNUUUvu() {
      this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
      if (this.NNUUNUuVNNVn.uNNnnnuuuN(1500L) && uUnuvNvvNU.field_1755 == null) {
         uUnuvNvvNU.field_1724.field_3944.method_45730("clan storage");
         this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.WAITING_FOR_GUI_STASH;
         this.NNUUNUuVNNVn.UuUVuuUu();
      }
   }

   private void NNUUNUuVNNVn() {
      this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
      this.VunnVNvNV();
      if (this.Oco0Oococc()) {
         if (this.coOocCcoOc0 > 0L && System.currentTimeMillis() - this.coOocCcoOc0 >= 1000L) {
            if (this.vNnNuuvVn != null && this.VuNNvnVVUUn < 2 && !this.UnVvNNuNu && this.nNvNUVU(this.vNnNuuvVn)) {
               this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.OPENING;
               this.NNUUNUuVNNVn.UuUVuuUu();
            } else {
               this.UuUVuuUu(10000L);
            }
         } else {
            if (this.NNUUNUuVNNVn.uNNnnnuuuN(100L) && this.vNnNuuvVn != null && this.VuNNvnVVUUn < 2 && this.nNvNUVU(this.vNnNuuvVn)) {
               class_3965 var1 = this.UnUNuUU(this.vNnNuuvVn);
               if (var1 != null) {
                  uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
                  uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var1);
                  this.VuNNvnVVUUn++;
                  this.VunnVNvNV();
                  this.NNUUNUuVNNVn.UuUVuuUu();
               }
            }
         }
      }
   }

   private void UuUVuuUu(long var1) {
      this.VunnVNvNV();
      if (this.vNnNuuvVn != null) {
         this.UUuUnNVNuuv.put(this.vNnNuuvVn, System.currentTimeMillis() + var1);
      }

      this.vNnNuuvVn = null;
      this.VUuuVUnun = null;
      this.coOocCcoOc0 = 0L;
      this.VuNNvnVVUUn = 0;
      this.UnVvNNuNu = false;
      this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
      this.UNvvunVVn.UuUVuuUu();
   }

   private boolean VvVvnNUnvuvV() {
      long var1 = Long.MAX_VALUE;

      for (class_2338 var4 : this.uUVVvVVNvvn) {
         long var5 = this.UuUVuuUu(var4) - System.currentTimeMillis();
         if (var5 < var1) {
            var1 = var5;
         }
      }

      if ((this.uUVVvVVNvvn.isEmpty() || var1 > this.o0Ooc0COOoc()) && (this.NuunnvnN.uUnuvNvvNU() || var1 != Long.MAX_VALUE)) {
         if (this.UvUvUNuvNU()) {
            return false;
         } else {
            vnvuUUVun.UuUVuuUu.UuUVuuUu();
            String var7 = vnvuUUVun.UuUVuuUu.uUnuvNvvNU();
            if (!"N/A".equals(var7)) {
               this.OCOocoOoOO = var7;
            }

            this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
            this.vNnNuuvVn = null;
            if (this.NuunnvnN.uUnuvNvvNU()) {
               String var8 = this.uVUVnuvnuVuv();
               this.OCOocoOoOO = var8;
               this.C00OOC00oO((Runnable)(() -> {
                  uUnuvNvvNU.field_1724.field_3944.method_45730("hub");
                  this.NnVnNVN = true;
                  this.vnvvNvUnVv = System.currentTimeMillis() + 1700L;
               }));
            } else {
               long var9 = var1 - 25000L;
               this.C00OOC00oO((Runnable)(() -> {
                  uUnuvNvvNU.field_1724.field_3944.method_45730("hub");
                  this.NnVnNVN = true;
                  this.vnvvNvUnVv = System.currentTimeMillis() + var9;
                  this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
                  this.UNvvunVVn.UuUVuuUu();
               }));
            }

            return true;
         }
      } else {
         return false;
      }
   }

   private void ccOO0COcoco0() {
      if (!this.UNnVVNvvnVvU.uUnuvNvvNU()) {
         this.NUVvUUVuVNVv();
      } else {
         boolean var1 = this.NunUUVVVuu;
         long var2 = System.currentTimeMillis();
         if (this.vvVVVvVNVVVN.uNNnnnuuuN(300L)) {
            var1 = false;
            class_2338 var4 = uUnuvNvvNU.field_1724.method_24515();

            for (class_2338 var6 : class_2338.method_10097(var4.method_10069(-5, -5, -5), var4.method_10069(5, 5, 5))) {
               class_2248 var7 = uUnuvNvvNU.field_1687.method_8320(var6).method_26204();
               if (var7 == class_2246.field_37568 || var7 == class_2246.field_28108 || var7 == class_2246.field_37571 || var7 == class_2246.field_37570) {
                  var1 = true;
                  break;
               }
            }

            this.NunUUVVVuu = var1;
            this.vvVVVvVNVVVN.UuUVuuUu();
         }

         if (var1) {
            this.uNUnuUUvvuU = var2;
            this.UvvNuvUNNNUv = true;
         }

         if (this.UvvNuvUNNNUv) {
            if (!var1 && var2 - this.uNUnuUUvvuU >= 1200L) {
               this.NUVvUUVuVNVv();
            } else {
               if (!uUnuvNvvNU.field_1724.method_5715()) {
                  uUnuvNvvNU.field_1724.method_5660(true);
               }

               if ((Boolean)BaritoneAPI.getSettings().allowSprint.value) {
                  BaritoneAPI.getSettings().allowSprint.value = false;
               }
            }
         }
      }
   }

   private void NUVvUUVuVNVv() {
      if (this.UvvNuvUNNNUv) {
         this.UvvNuvUNNNUv = false;
         this.uNUnuUUvvuU = 0L;
         this.NunUUVVVuu = false;
         if (uUnuvNvvNU.field_1724 != null) {
            uUnuvNvvNU.field_1724.method_5660(false);
         }

         BaritoneAPI.getSettings().allowSprint.value = this.nvvnUnUn;
      }
   }

   private long UuUVuuUu(String var1, boolean var2) {
      Matcher var3 = var2 ? unnUnUNVnN.matcher(var1) : NnuUnUNnu.matcher(var1);
      if (var3.find()) {
         try {
            if (var2) {
               return (Integer.parseInt(var3.group(1)) * 60L + Integer.parseInt(var3.group(2))) * 1000L;
            }

            int var8 = Integer.parseInt(var3.group(1));
            int var5 = Integer.parseInt(var3.group(2));
            return var3.group(3) != null ? (var8 * 3600L + var5 * 60L + Integer.parseInt(var3.group(3))) * 1000L : (var8 * 60L + var5) * 1000L;
         } catch (NumberFormatException var7) {
         }
      }

      Matcher var4 = UnnnvvU.matcher(var1);
      if (var4.find()) {
         try {
            return Integer.parseInt(var4.group(1)) * 1000L;
         } catch (NumberFormatException var6) {
         }
      }

      return -1L;
   }

   private void nNuVunNUVu() {
      boolean var1 = this.NVNnnvnuunNv.C00OOC00oO("Варден");
      class_2248 var2 = var1 ? class_2246.field_10034 : class_2246.field_16328;

      for (class_1297 var4 : uUnuvNvvNU.field_1687.method_18112()) {
         if (var4 instanceof class_1531) {
            long var5 = this.UuUVuuUu(var4.method_5477().getString(), var1);
            if (var5 >= 0L) {
               class_2338 var7 = new class_2338(var4.method_31477(), var4.method_31478() - 1, var4.method_31479());
               if (uUnuvNvvNU.field_1687.method_8320(var7).method_26204() == var2) {
                  this.uUVvnUuNvvN.put(var7, System.currentTimeMillis() + var5);
               } else {
                  var7 = var7.method_10074();
                  if (uUnuvNvvNU.field_1687.method_8320(var7).method_26204() == var2) {
                     this.uUVvnUuNvvN.put(var7, System.currentTimeMillis() + var5);
                  }
               }
            }
         }
      }
   }

   private boolean C00OOC00oO(class_2338 var1) {
      if (uUnuvNvvNU.field_1687 != null && var1 != null) {
         boolean var2 = this.NVNnnvnuunNv.C00OOC00oO("Варден");

         for (class_1297 var4 : uUnuvNvvNU.field_1687.method_18112()) {
            if (var4 instanceof class_1531 && this.UuUVuuUu(var4.method_5477().getString(), var2) > 250L) {
               class_2338 var5 = new class_2338(var4.method_31477(), var4.method_31478() - 1, var4.method_31479());
               if (var5.equals(var1) || var5.method_10074().equals(var1)) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean uUnuvNvvNU(class_2338 var1) {
      Long var2 = this.UUuUnNVNuuv.get(var1);
      return var2 != null && var2 > System.currentTimeMillis() ? true : this.UnUNVVVNuv(var1) > this.uNNnnnuuuN(var1);
   }

   private long vVvUvVVuuNvV(class_2338 var1) {
      double var2 = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(var1));
      return (long)(var2 / 3.0 * 1000.0);
   }

   private long uNNnnnuuuN(class_2338 var1) {
      return Math.max(20000L, this.vVvUvVVuuNvV(var1) + 5000L);
   }

   private long nuUnNvnuUu(class_2338 var1) {
      return Math.max(this.vVvUvVVuuNvV(var1), Math.max(0L, this.UnUNVVVNuv(var1)));
   }

   private void UNvvunVVn() {
      if (uUnuvNvvNU.field_1687 == null) {
         this.nuunNvv.clear();
      } else {
         long var1 = System.currentTimeMillis() + 5000L;

         for (class_1297 var4 : uUnuvNvvNU.field_1687.method_18112()) {
            if (var4 instanceof class_7260 var5 && this.C00OOC00oO(var5.method_19538())) {
               this.nuunNvv.put(var5.method_24515().method_10062(), var1);
            }
         }

         long var6 = System.currentTimeMillis();
         this.nuunNvv.entrySet().removeIf(var2 -> var2.getValue() <= var6);
      }
   }

   private boolean VVuuUN(class_2338 var1) {
      if (!this.NVNnnvnuunNv.C00OOC00oO("Варден")) {
         return false;
      } else {
         for (class_2338 var3 : this.nuunNvv.keySet()) {
            if (var3.method_10262(var1) < 25.0) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean vNUvnnVnUvu(class_2338 var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         class_243 var2 = class_243.method_24953(var1);

         for (class_1657 var4 : uUnuvNvvNU.field_1687.method_18456()) {
            if (var4 != uUnuvNvvNU.field_1724
               && !var4.method_29504()
               && !(var4.method_19538().method_1025(var2) >= 20.0)
               && (
                  !var4.method_6118(class_1304.field_6169).method_7960()
                     || !var4.method_6118(class_1304.field_6174).method_7960()
                     || !var4.method_6118(class_1304.field_6172).method_7960()
                     || !var4.method_6118(class_1304.field_6166).method_7960()
               )) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean uVUuuVnNVU(class_2338 var1) {
      return this.uVunuUNVVUUV(var1) && (!this.NVNnnvnuunNv.C00OOC00oO("Варден") || !this.VVuuUN(var1) && !this.vNUvnnVnUvu(var1));
   }

   private boolean vuuuNvNuv(class_2338 var1) {
      long var2 = Math.max(0L, this.UnUNVVVNuv(var1));
      return var2 >= 20000L && var2 <= 35000L;
   }

   private int nvUVNnuu(class_2338 var1) {
      if (this.vuuuNvNuv(var1)) {
         return 0;
      } else {
         return this.UnUNVVVNuv(var1) <= 0L ? 1 : 2;
      }
   }

   private double UuuNnUvUuv(class_2338 var1) {
      double var2 = var1.method_10263() + 0.5 - uUnuvNvvNU.field_1724.method_23317();
      double var4 = var1.method_10264() + 0.5 - uUnuvNvvNU.field_1724.method_23320();
      double var6 = var1.method_10260() + 0.5 - uUnuvNvvNU.field_1724.method_23321();
      return var2 * var2 + var6 * var6 + var4 * var4 * (var4 > 0.0 ? 2.0 : 1.0);
   }

   private void UnvuVuVnNuvu() {
      if (this.NnunUUnU.uNNnnnuuuN(750L)) {
         this.NnunUUnU.UuUVuuUu();
         this.uUVVvVVNvvn.clear();
         class_2338 var1 = uUnuvNvvNU.field_1724.method_24515();
         class_1923 var2 = new class_1923(var1);
         byte var3 = 10;
         class_2248 var4 = this.NVNnnvnuunNv.C00OOC00oO("Варден") ? class_2246.field_10034 : class_2246.field_16328;

         for (int var5 = -var3; var5 <= var3; var5++) {
            for (int var6 = -var3; var6 <= var3; var6++) {
               class_2818 var7 = uUnuvNvvNU.field_1687.method_8497(var2.field_9181 + var5, var2.field_9180 + var6);
               if (var7 != null) {
                  for (class_2338 var9 : var7.method_12214().keySet()) {
                     if (var7.method_8320(var9).method_26204() == var4 && this.C00OOC00oO(class_243.method_24953(var9))) {
                        this.uUVVvVVNvvn.add(var9);
                     }
                  }
               }
            }
         }
      }
   }

   private boolean UvNNVUVNVuvV() {
      return this.VVnVNnunVvu.uUnuvNvvNU() && this.uuuVnuvnnNnU();
   }

   private void nUUVuvU(class_2338 var1) {
      this.VunnVNvNV();
      if (var1 != null) {
         this.OoccOc0CO.add(var1);
      }

      this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
      this.vNnNuuvVn = null;
      this.uUuuVvVunVVu = null;
      this.VuunNUUUvu = -1.0;
      this.coOocCcoOc0 = 0L;
      this.ccOO0COcoco0.UuUVuuUu();
      this.nNuVunNUVu.UuUVuuUu();
      boolean var2 = this.VVnVNnunVvu.uUnuvNvvNU() && this.uuuVnuvnnNnU();
      if (var2 && this.NnunUUnU()) {
         class_2338 var3 = this.nvuVvuNnNUnv();
         if (var3 != null) {
            this.vNnNuuvVn = var3;
            this.VUuuVUnun = this.NVNnnvnuunNv(var3);
            this.NnVnNVN();
            this.VuunNUUUvu = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(var3));
            this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.GOING_TO_CHEST;
            this.coOocCcoOc0 = 0L;
            this.UuUUvvVunV = true;
            this.ccOO0COcoco0.UuUVuuUu();
            this.UNvvunVVn.UuUVuuUu();
            return;
         }
      }

      if (!var2) {
         this.nNnVnUNVV.clear();
         this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
         this.UNvvunVVn.UuUVuuUu();
         this.nuunNvv();
      } else {
         this.vUvUvUNNuNvn();
         if (this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.SEARCHING) {
            this.nuunNvv();
         }
      }
   }

   private boolean NnunUUnU() {
      for (int var1 = 0; var1 < 36; var1++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_7960()) {
            return true;
         }
      }

      return false;
   }

   private class_2338 nvuVvuNnNUnv() {
      this.UnvuVuVnNuvu();
      long var1 = System.currentTimeMillis();
      return this.uUVVvVVNvvn
         .stream()
         .filter(var1x -> !this.OoccOc0CO.contains(var1x))
         .filter(var3 -> {
            Long var4 = this.UUuUnNVNuuv.get(var3);
            return var4 == null || var4 <= var1;
         })
         .filter(this::uVUuuVnNVU)
         .filter(var0 -> uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(var0)) <= 14.0)
         .filter(var1x -> this.UnUNVVVNuv(var1x) <= 35000L)
         .min(
            Comparator.<class_2338>comparingInt(this::nvUVNnuu)
               .thenComparingLong(this::nuUnNvnuUu)
               .thenComparingDouble(var0 -> uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(var0)))
         )
         .orElse(null);
   }

   private long UnUNVVVNuv(class_2338 var1) {
      return this.UuUVuuUu(var1) - System.currentTimeMillis();
   }

   private class_2338 vNVuvnUUnuUn(class_2338 var1) {
      if (uUnuvNvvNU.field_1724 == null) {
         return null;
      } else {
         long var2 = System.currentTimeMillis();
         class_2338 var4 = null;
         double var5 = Double.MAX_VALUE;

         for (class_2338 var8 : this.uUVVvVVNvvn) {
            if (!var8.equals(var1) && !this.OoccOc0CO.contains(var8)) {
               Long var9 = this.UUuUnNVNuuv.get(var8);
               if ((var9 == null || var9 <= var2) && this.UnUNVVVNuv(var8) <= -300L) {
                  double var10 = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(var8));
                  if (!(var10 > 14.0) && !(var10 >= var5)) {
                     var5 = var10;
                     var4 = var8;
                  }
               }
            }
         }

         return var4;
      }
   }

   private void UvnvNVnnnnNU(class_2338 var1) {
      if (this.NVuNUuVnVUN != null) {
         this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
      }

      this.VunnVNvNV();
      this.vNnNuuvVn = var1;
      this.VuNNvnVVUUn = 0;
      this.UnVvNNuNu = false;
      this.VUuuVUnun = this.NVNnnvnuunNv(var1);
      this.VuunNUUUvu = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(var1));
      this.coOocCcoOc0 = 0L;
      this.UuUUvvVunV = false;
      this.uUuuVvVunVVu = null;
      this.ccOO0COcoco0.UuUVuuUu();
      this.nNuVunNUVu.UuUVuuUu();
      this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.GOING_TO_CHEST;
      this.NnVnNVN();
      this.UNvvunVVn.UuUVuuUu();
   }

   private void NnVnNVN() {
      if (this.NVuNUuVnVUN != null && this.vNnNuuvVn != null) {
         if (this.VUuuVUnun != null) {
            this.NVuNUuVnVUN.getCustomGoalProcess().setGoalAndPath(new GoalBlock(this.VUuuVUnun));
         } else {
            this.NVuNUuVnVUN.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.vNnNuuvVn, 1));
         }
      }
   }

   private class_2338 vnvvNvUnVv() {
      long var1 = System.currentTimeMillis();
      return this.uUVVvVVNvvn
         .stream()
         .filter(var1x -> !this.OoccOc0CO.contains(var1x))
         .filter(var3 -> {
            Long var4 = this.UUuUnNVNuuv.get(var3);
            return var4 == null || var4 <= var1;
         })
         .filter(this::uVUuuVnNVU)
         .filter(var1x -> {
            long var2 = this.UnUNVVVNuv(var1x);
            return var2 >= 20000L && var2 <= 35000L;
         })
         .filter(var1x -> this.vVvUvVVuuNvV(var1x) <= this.UnUNVVVNuv(var1x) + 5000L)
         .min(
            Comparator.<class_2338>comparingLong(this::nuUnNvnuUu)
               .thenComparingLong(var1x -> Math.max(0L, this.UnUNVVVNuv(var1x)))
               .thenComparingDouble(this::UuuNnUvUuv)
         )
         .orElse(null);
   }

   private void OCOocoOoOO() {
      this.UnvuVuVnNuvu();
      class_2338 var1 = this.vnvvNvUnVv();
      if (var1 != null && !var1.equals(this.vNnNuuvVn)) {
         long var2 = System.currentTimeMillis();
         long var4 = this.nuUnNvnuUu(var1);
         long var6 = this.vNnNuuvVn == null ? Long.MAX_VALUE : this.nuUnNvnuUu(this.vNnNuuvVn);
         if (this.vNnNuuvVn == null || !this.vuuuNvNuv(this.vNnNuuvVn) || var2 - this.uvNnUuvvNU >= 750L && var4 + 750L < var6) {
            this.uvNnUuvvNU = var2;
            this.UvnvNVnnnnNU(var1);
         }
      }
   }

   private long o0Ooc0COOoc() {
      return (long)(this.uUVuVvuNUvnu.uUnuvNvvNU() * 1000.0F);
   }

   private class_2338 nvvnUnUn() {
      return this.uUVVvVVNvvn
         .stream()
         .filter(var1 -> !this.OoccOc0CO.contains(var1))
         .filter(var1 -> !this.uUnuvNvvNU(var1))
         .filter(this::uVUuuVnNVU)
         .min(Comparator.<class_2338>comparingInt(this::nvUVNnuu).thenComparingLong(this::nuUnNvnuUu).thenComparingDouble(this::UuuNnUvUuv))
         .orElse(null);
   }

   private boolean UuUVuuUu(class_2248 var1) {
      return var1 == class_2246.field_37568
         || var1 == class_2246.field_28108
         || var1 == class_2246.field_37571
         || var1 == class_2246.field_37570
         || var1 == class_2246.field_37569;
   }

   private boolean uVUVnuvnuVuv(class_2338 var1) {
      class_2338 var2 = var1.method_10084();
      class_2338 var3 = var1.method_10074();
      class_2680 var4 = uUnuvNvvNU.field_1687.method_8320(var1);
      class_2680 var5 = uUnuvNvvNU.field_1687.method_8320(var2);
      class_2680 var6 = uUnuvNvvNU.field_1687.method_8320(var3);
      return var4.method_26227().method_15769()
         && var4.method_26220(uUnuvNvvNU.field_1687, var1).method_1110()
         && var5.method_26227().method_15769()
         && var5.method_26220(uUnuvNvvNU.field_1687, var2).method_1110()
         && !var6.method_26220(uUnuvNvvNU.field_1687, var3).method_1110()
         && !this.UuUVuuUu(var4.method_26204())
         && !this.UuUVuuUu(var5.method_26204())
         && !this.UuUVuuUu(var6.method_26204());
   }

   private class_2338 NVNnnvnuunNv(class_2338 var1) {
      ArrayList var2 = new ArrayList();
      var2.add(var1);
      int[] var3 = new int[]{1, -1, 0, 0};
      int[] var4 = new int[]{0, 0, 1, -1};
      if (this.NVNnnvnuunNv.C00OOC00oO("╨Æ╨░╤Ç╨┤╨╡╨╜")) {
         for (int var5 = 0; var5 < var3.length; var5++) {
            class_2338 var6 = var1.method_10069(var3[var5], 0, var4[var5]);
            if (uUnuvNvvNU.field_1687.method_8320(var6).method_27852(class_2246.field_10034)) {
               var2.add(var6);
            }
         }
      }

      int[] var21 = new int[]{1, -1, 0, 0, 1, 1, -1, -1};
      int[] var22 = new int[]{0, 0, 1, -1, 1, -1, 1, -1};
      HashSet var7 = new HashSet();

      for (class_2338 var9 : var2) {
         for (int var10 = 0; var10 < var21.length; var10++) {
            var7.add(var9.method_10069(var21[var10], 0, var22[var10]));
         }
      }

      class_2338 var23 = null;
      double var24 = Double.MAX_VALUE;

      for (class_2338 var12 : var7) {
         if (this.uVUVnuvnuVuv(var12)) {
            class_243 var13 = class_243.method_24955(var12).method_1031(0.0, uUnuvNvvNU.field_1724.method_5751(), 0.0);
            double var14 = Double.MAX_VALUE;
            boolean var16 = false;

            for (class_2338 var18 : var2) {
               class_243 var19 = class_243.method_24953(var18);
               var14 = Math.min(var14, var13.method_1022(var19));
               class_3965 var20 = uUnuvNvvNU.field_1687
                  .method_17742(new class_3959(var13, var19, class_3960.field_17559, class_242.field_1348, uUnuvNvvNU.field_1724));
               if (var20.method_17783() == class_240.field_1333 || var2.contains(var20.method_17777())) {
                  var16 = true;
               }
            }

            if (var16 && !(var14 > 2.9)) {
               double var25 = uUnuvNvvNU.field_1724.method_19538().method_1025(class_243.method_24955(var12));
               if (var25 < var24) {
                  var24 = var25;
                  var23 = var12;
               }
            }
         }
      }

      return var23;
   }

   private boolean uVunuUNVVUUV(class_2338 var1) {
      return this.NVNnnvnuunNv(var1) != null;
   }

   private class_243 UNnVVNvvnVvU(class_2338 var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
      double var3 = var1.method_10263();
      double var5 = var1.method_10264();
      double var7 = var1.method_10260();
      class_243[] var9 = new class_243[]{
         new class_243(var3 + 0.5, var5 + 0.5, var7 + 0.5),
         new class_243(var3 + 0.5, var5 + 0.9, var7 + 0.5),
         new class_243(var3 + 0.5, var5 + 0.5, var7 + 0.05),
         new class_243(var3 + 0.5, var5 + 0.5, var7 + 0.95),
         new class_243(var3 + 0.05, var5 + 0.5, var7 + 0.5),
         new class_243(var3 + 0.95, var5 + 0.5, var7 + 0.5)
      };

      for (class_243 var13 : var9) {
         class_3965 var14 = uUnuvNvvNU.field_1687
            .method_17742(new class_3959(var2, var13, class_3960.field_17559, class_242.field_1348, uUnuvNvvNU.field_1724));
         if (var14.method_17783() == class_240.field_1333 || var14.method_17777().equals(var1)) {
            return var13;
         }
      }

      return null;
   }

   private boolean uNnUnnuNUnNu(class_2338 var1) {
      return this.UNnVVNvvnVvU(var1) != null;
   }

   private class_243 NnUuNNU(class_2338 var1) {
      class_243 var2 = this.UNnVVNvvnVvU(var1);
      return var2 != null ? var2 : class_243.method_24953(var1);
   }

   private boolean nNvNUVU(class_2338 var1) {
      return var1 != null && uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(var1)) <= 2.9 && this.uNnUnnuNUnNu(var1);
   }

   private class_3965 UnUNuUU(class_2338 var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
      class_243 var3 = var2.method_1019(uUnuvNvvNU.field_1724.method_5828(1.0F).method_1021(3.4));
      class_3965 var4 = uUnuvNvvNU.field_1687.method_17742(new class_3959(var2, var3, class_3960.field_17559, class_242.field_1348, uUnuvNvvNU.field_1724));
      return var4.method_17783() == class_240.field_1332 && var4.method_17777().equals(var1) ? var4 : null;
   }

   private float UuUVuuUu(uuUuvNuNVNVU var1) {
      float var2 = new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var1);
      return Math.min(2.0F, 0.45F + var2 * 0.1F);
   }

   private void UnUUVuVunvVu() {
      ArrayList var1 = new ArrayList((Collection)BaritoneAPI.getSettings().blocksToAvoid.value);
      this.nVUNnUuU = new ArrayList<>(var1);
      class_2248[] var2 = new class_2248[]{
         class_2246.field_37568, class_2246.field_28108, class_2246.field_37571, class_2246.field_37570, class_2246.field_37569
      };

      for (class_2248 var6 : var2) {
         if (!var1.contains(var6)) {
            var1.add(var6);
         }
      }

      BaritoneAPI.getSettings().blocksToAvoid.value = var1;
   }

   private void nnvuvUNuUnN() {
      if (this.nVUNnUuU != null) {
         BaritoneAPI.getSettings().blocksToAvoid.value = this.nVUNnUuU;
         this.nVUNnUuU = null;
      }
   }

   private void UVnuVUUVnnU() {
      if (uUnuvNvvNU.field_1724 != null
         && this.NVuNUuVnVUN != null
         && this.NVuNUuVnVUN.getCustomGoalProcess().isActive()
         && !this.uNUnUuUnvnnU()
         && this.uNVvVvUuuuU == WardenFarm.NVnVnNnN.NONE) {
         long var1 = System.currentTimeMillis();
         class_243 var3 = uUnuvNvvNU.field_1724.method_19538();
         if (this.VNvuVnvnun != null && !(var3.method_1025(this.VNvuVnvnun) > 0.36)) {
            if (var1 - this.unVVnuunNU > 3500L) {
               this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
               this.VNvuVnvnun = null;
            }
         } else {
            this.VNvuVnvnun = var3;
            this.unVVnuunNU = var1;
         }
      } else {
         this.VNvuVnvnun = null;
      }
   }

   private uuUuvNuNVNVU UuUVuuUu(uuUuvNuNVNVU var1, float var2) {
      double var3 = System.currentTimeMillis() / 1000.0;
      float var5 = (float)((Math.sin(var3 * 7.3 + this.nnUunUnNUN) * 0.62 + Math.sin(var3 * 13.7 + this.UNuUVVuUuU) * 0.38) * var2);
      float var6 = (float)((Math.sin(var3 * 9.1 + this.UNuUVVuUuU) * 0.55 + Math.sin(var3 * 15.9 + this.nnUunUnNUN) * 0.45) * var2 * 0.6);
      float var7 = Math.max(-90.0F, Math.min(90.0F, var1.C00OOC00oO + var6));
      return new uuUuvNuNVNVU(var1.UuUVuuUu + var5, var7);
   }

   private uuUuvNuNVNVU uUnuvNvvNU(class_243 var1) {
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

   private void VunnVNvNV() {
      this.unUvvVVVVUu.UuUVuuUu();
      COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
      COC0OCc.nuUnNvnuUu = 0;
      COC0OCc.uVUuuVnNVU = null;
   }

   private void UuUVuuUu(class_1707 var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         this.C00OOC00oO(var1);
         if (!this.vvUVNVvvNUv.isEmpty()) {
            if (this.VvVvnNUnvuvV.uNNnnnuuuN(50L)) {
               this.vvUVNVvvNUv.poll().run();
               this.VvVvnNUnvuvV.UuUVuuUu();
            }
         } else {
            this.NvUVUvVVnUu();
            boolean var2 = false;
            int var3 = var1.field_7761.size() - 36;

            for (int var4 = 0; var4 < var3; var4++) {
               class_1735 var5 = (class_1735)var1.field_7761.get(var4);
               if (var5.method_7681()) {
                  class_1799 var6 = var5.method_7677();
                  if (this.VVuuUN(var6) && this.VvVvnNUnvuvV.uNNnnnuuuN(50L)) {
                     class_1799 var12 = var6.method_7972();
                     String var8 = this.nuUnNvnuUu(var12);
                     this.nNnVnUNVV.put(var8, this.nNnVnUNVV.getOrDefault(var8, 0) + var12.method_7947());
                     this.UnVvNNuNu = true;
                     uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var4, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
                     this.VvVvnNUnvuvV.UuUVuuUu();
                     var2 = true;
                     return;
                  }

                  if (this.UuUVuuUu(var6) && this.VvVvnNUnvuvV.uNNnnnuuuN(50L)) {
                     int var7 = this.UuUVuuUu(this.VUNvNUuNVnn) - this.NUUVUvvuNNVU;
                     if (this.UuUVuuUu(var1, var4, var7)) {
                        var2 = true;
                        return;
                     }
                  }
               }
            }

            if (!var2 && var3 > 0) {
               boolean var11 = this.UuUVuuUu(var1, var3);
               if (!var11) {
                  uUnuvNvvNU.field_1724.method_7346();
                  this.VunnVNvNV();
                  if (this.UnVvNNuNu) {
                     this.nUUVuvU(this.vNnNuuvVn);
                  } else if (this.VuNNvnVVUUn < 2 && this.vNnNuuvVn != null) {
                     this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.OPENING;
                     this.NNUUNUuVNNVn.UuUVuuUu();
                  } else {
                     this.UuUVuuUu(30000L);
                  }
               }
            }
         }
      } else {
         this.VunnVNvNV();
      }
   }

   private void NvUVUvVVnUu() {
      if (this.vNnNuuvVn != null) {
         if (!this.vNnNuuvVn.equals(this.UvuVvvVuUuuu)) {
            this.UvuVvvVuUuuu = this.vNnNuuvVn;
            this.NUUVUvvuNNVU = 0;
            this.VUNvNUuNVnn = this.uUVuVvuNUvnu(this.vNnNuuvVn);
         }
      }
   }

   private boolean UuUVuuUu(class_1707 var1, int var2) {
      for (int var3 = 0; var3 < var2; var3++) {
         class_1799 var4 = ((class_1735)var1.field_7761.get(var3)).method_7677();
         if (!var4.method_7960() && (this.VVuuUN(var4) || this.UuUVuuUu(var4))) {
            return true;
         }
      }

      return false;
   }

   private boolean UuUVuuUu(class_1707 var1, int var2, int var3) {
      if (var3 <= 0) {
         return false;
      } else {
         class_1735 var4 = (class_1735)var1.field_7761.get(var2);
         if (!var4.method_7681()) {
            return false;
         } else {
            int var5 = this.vVvUvVVuuNvV(var1, var1.field_7761.size() - 36);
            if (var5 == -1) {
               return false;
            } else {
               int var6 = var4.method_7677().method_7947();
               if (var6 <= var3) {
                  uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var2, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
               } else {
                  uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var2, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);

                  for (int var7 = 0; var7 < var3; var7++) {
                     uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var5, 1, class_1713.field_7790, uUnuvNvvNU.field_1724);
                  }

                  uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var2, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
               }

               this.NUUVUvvuNNVU = this.NUUVUvvuNNVU + Math.min(var6, var3);
               this.VvVvnNUnvuvV.UuUVuuUu();
               return true;
            }
         }
      }
   }

   private void C00OOC00oO(class_1707 var1) {
      if (var1.field_7763 != this.unNuVNVUnV) {
         this.unNuVNVUnV = var1.field_7763;
         this.VvVvnNUnvuvV.UuUVuuUu();
         this.NNUUNUuVNNVn.UuUVuuUu();
      }
   }

   private WardenFarm.VUnuUnnuNvVu uUVuVvuNUvnu(class_2338 var1) {
      if (this.UvUvUNuvNU.uUnuvNvvNU() && var1 != null && uUnuvNvvNU.field_1687 != null) {
         String var2 = this.UvUvUNuvNU(var1).toLowerCase(Locale.ROOT);
         if (var2.contains("ресы") || var2.contains("ресурс")) {
            return WardenFarm.VUnuUnnuNvVu.NONE;
         } else if (var2.contains("инвиз")) {
            return WardenFarm.VUnuUnnuNvVu.INVIS;
         } else {
            return var2.contains("морков") ? WardenFarm.VUnuUnnuNvVu.CARROT : WardenFarm.VUnuUnnuNvVu.NONE;
         }
      } else {
         return WardenFarm.VUnuUnnuNvVu.NONE;
      }
   }

   private String UvUvUNuvNU(class_2338 var1) {
      if (var1 != null && uUnuvNvvNU.field_1687 != null) {
         class_2625 var2 = null;
         double var3 = Double.MAX_VALUE;
         class_2338 var5 = var1.method_10069(-1, -1, -1);
         class_2338 var6 = var1.method_10069(1, 1, 1);

         for (class_2338 var8 : class_2338.method_10097(var5, var6)) {
            if (uUnuvNvvNU.field_1687.method_8321(var8) instanceof class_2625 var10) {
               double var11 = var8.method_10262(var1);
               if (var11 < var3) {
                  var3 = var11;
                  var2 = var10;
               }
            }
         }

         return var2 == null ? "" : this.UuUVuuUu(var2);
      } else {
         return "";
      }
   }

   private boolean UuUVuuUu(class_2338 var1, String[] var2, String... var3) {
      String var4 = this.UvUvUNuvNU(var1).toLowerCase(Locale.ROOT);
      if (var4.isEmpty()) {
         return false;
      } else {
         boolean var5 = false;

         for (String var9 : var2) {
            if (var4.contains(var9.toLowerCase(Locale.ROOT))) {
               var5 = true;
               break;
            }
         }

         if (!var5) {
            return false;
         } else {
            for (String var13 : var3) {
               if (var4.contains(var13.toLowerCase(Locale.ROOT))) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   private boolean c0oOOCcCoC0(class_2338 var1) {
      return var1 != null && this.UuUVuuUu(var1, vUvVUNnN, "морков", "инвиз");
   }

   private boolean unnUnUNVnN() {
      return this.nvuUVvuuN() < 1 && !this.uNnNUNvuVnu();
   }

   private boolean NnuUnUNnu() {
      return this.CC0COO() < 3;
   }

   private boolean UnnnvvU() {
      return this.c0oOOCcCoC0.uUnuvNvvNU() && !this.VnvunuuvUNu && this.VNNnnVUuvv() < 1;
   }

   private boolean UuUVuuUu(String var1) {
      if (!var1.isEmpty() && !var1.contains("ресы") && !var1.contains("ресурс")) {
         for (String var5 : NUuVnnuUnvu) {
            if (var1.contains(var5)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean C00OOC00oO(String var1) {
      if (!var1.contains("кит") && !var1.contains("kit") && !var1.contains("зель") && !var1.contains("припас")) {
         if (!this.unnUnUNVnN() || !var1.contains("инвиз") && !var1.contains("invis")) {
            return !this.NnuUnUNnu() || !var1.contains("морков") && !var1.contains("carrot")
               ? this.UnnnvvU() && (var1.contains("скор") || var1.contains("speed") || var1.contains("инвиз") || var1.contains("invis"))
               : true;
         } else {
            return true;
         }
      } else {
         return this.unnUnUNVnN() || this.NnuUnUNnu() || this.UnnnvvU();
      }
   }

   private class_2338 VUUnuVvVu() {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         class_1923 var1 = new class_1923(uUnuvNvvNU.field_1724.method_24515());
         byte var2 = 10;
         class_2338 var3 = null;
         double var4 = Double.MAX_VALUE;

         for (int var6 = -var2; var6 <= var2; var6++) {
            for (int var7 = -var2; var7 <= var2; var7++) {
               class_2818 var8 = uUnuvNvvNU.field_1687.method_8497(var1.field_9181 + var6, var1.field_9180 + var7);
               if (var8 != null) {
                  for (class_2338 var10 : var8.method_12214().keySet()) {
                     if (this.unNNVVNnvvV(var10) && !this.vNUUvuuVU.contains(var10)) {
                        String var11 = this.UvUvUNuvNU(var10).toLowerCase(Locale.ROOT);
                        if (this.UuUVuuUu(var11) && this.C00OOC00oO(var11)) {
                           double var12 = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(var10));
                           if (var12 < var4) {
                              var4 = var12;
                              var3 = var10;
                           }
                        }
                     }
                  }
               }
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   private void VVnVNnunVvu(class_2338 var1) {
      if (var1 != null) {
         this.vNUUvuuVU.add(var1);

         for (class_2338 var5 : new class_2338[]{var1.method_10095(), var1.method_10072(), var1.method_10078(), var1.method_10067()}) {
            if (uUnuvNvvNU.field_1687.method_8321(var5) instanceof class_2595) {
               this.vNUUvuuVU.add(var5.method_10062());
            }
         }
      }
   }

   private void VvVuvUvvNNVv() {
      if (this.UVnuVUUVnnU != null && !this.c0oOOCcCoC0(this.UVnuVUUVnnU)) {
         this.UVnuVUUVnnU = null;
      }

      class_2338 var1 = this.UnnNNvuvvUU();
      if (var1 != null) {
         this.UVnuVUUVnnU = var1;
      }
   }

   private boolean unNNVVNnvvV(class_2338 var1) {
      if (uUnuvNvvNU.field_1687 == null) {
         return false;
      } else {
         class_2586 var2 = uUnuvNvvNU.field_1687.method_8321(var1);
         return var2 instanceof class_2595 || var2 instanceof class_3719 || var2 instanceof class_2627;
      }
   }

   private class_2338 UnnNNvuvvUU() {
      return this.UuUVuuUu(vUvVUNnN, "морков", "инвиз");
   }

   private class_2338 UuUVuuUu(String[] var1, String... var2) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         class_2338 var3 = uUnuvNvvNU.field_1724.method_24515();
         class_1923 var4 = new class_1923(var3);
         byte var5 = 10;
         class_2338 var6 = null;
         double var7 = Double.MAX_VALUE;

         for (int var9 = -var5; var9 <= var5; var9++) {
            for (int var10 = -var5; var10 <= var5; var10++) {
               class_2818 var11 = uUnuvNvvNU.field_1687.method_8497(var4.field_9181 + var9, var4.field_9180 + var10);
               if (var11 != null) {
                  for (class_2338 var13 : var11.method_12214().keySet()) {
                     if (this.unNNVVNnvvV(var13) && this.UuUVuuUu(var13, var1, var2)) {
                        double var14 = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(var13));
                        if (var14 < var7) {
                           var7 = var14;
                           var6 = var13;
                        }
                     }
                  }
               }
            }
         }

         return var6;
      } else {
         return null;
      }
   }

   private String UuUVuuUu(class_2625 var1) {
      StringBuilder var2 = new StringBuilder();

      for (class_2561 var6 : var1.method_49853().method_49877(false)) {
         var2.append(var6.getString()).append(' ');
      }

      for (class_2561 var10 : var1.method_49854().method_49877(false)) {
         var2.append(var10.getString()).append(' ');
      }

      return var2.toString().replaceAll("§.", "").trim();
   }

   private int UuUVuuUu(WardenFarm.VUnuUnnuNvVu var1) {
      return switch (var1) {
         case INVIS -> 1;
         case CARROT -> 3;
         default -> 0;
      };
   }

   private boolean UuUVuuUu(class_1799 var1) {
      if (this.UvUvUNuvNU.uUnuvNvvNU() && this.VUNvNUuNVnn != WardenFarm.VUnuUnnuNvVu.NONE) {
         if (this.NUUVUvvuNNVU >= this.UuUVuuUu(this.VUNvNUuNVnn)) {
            return false;
         } else {
            return switch (this.VUNvNUuNVnn) {
               case INVIS -> this.unnUnUNVnN() && this.vVvUvVVuuNvV(var1);
               case CARROT -> this.NnuUnUNnu() && this.UuuNnUvUuv(var1);
               default -> false;
            };
         }
      } else {
         return false;
      }
   }

   private boolean C00OOC00oO(class_1799 var1) {
      if (var1.method_7960()) {
         return false;
      } else {
         String var2 = var1.method_7964().getString().toLowerCase(Locale.ROOT);
         if (!var2.contains("invis") && !var2.contains("невид")) {
            class_1844 var3 = (class_1844)var1.method_58694(class_9334.field_49651);
            if (var3 == null) {
               return false;
            } else {
               for (class_1293 var5 : var3.method_57397()) {
                  if (var5.method_5579().equals(class_1294.field_5905)) {
                     return true;
                  }
               }

               return false;
            }
         } else {
            return true;
         }
      }
   }

   private boolean uUnuvNvvNU(class_1799 var1) {
      if (var1.method_7960()) {
         return false;
      } else {
         String var2 = var1.method_7964().getString().toLowerCase(Locale.ROOT);
         if (!var2.contains("скорост") && !var2.contains("speed") && !var2.contains("swift")) {
            class_1844 var3 = (class_1844)var1.method_58694(class_9334.field_49651);
            if (var3 == null) {
               return false;
            } else {
               for (class_1293 var5 : var3.method_57397()) {
                  if (var5.method_5579().equals(class_1294.field_5904)) {
                     return true;
                  }
               }

               return false;
            }
         } else {
            return true;
         }
      }
   }

   private boolean vVvUvVVuuNvV(class_1799 var1) {
      return !var1.method_7960() && var1.method_31574(class_1802.field_8574) && this.C00OOC00oO(var1) && !this.VVuuUN(var1);
   }

   private boolean uNNnnnuuuN(class_1799 var1) {
      return !var1.method_7960() && var1.method_31574(class_1802.field_8574) && this.uUnuvNvvNU(var1) && !this.VVuuUN(var1);
   }

   private int VNNnnVUuvv() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var2);
         if (this.uNNnnnuuuN(var3)) {
            var1 += var3.method_7947();
         }
      }

      return var1;
   }

   private void vUvUvUNNuNvn() {
      if (this.VVnVNnunVvu.uUnuvNvvNU() && this.uuuVnuvnnNnU()) {
         vnvuUUVun.UuUVuuUu.UuUVuuUu();
         boolean var1 = this.NuunnvnN.uUnuvNvvNU() && !vnvuUUVun.UuUVuuUu.uUnuvNvvNU().equals(this.UUVNuUNUvUnV.uUnuvNvvNU());
         if (var1 && this.UvUvUNuvNU()) {
            this.Oco0Oococc = this::uuVuUuuVVNvN;
            this.VVnVNnunVvu();
         } else {
            this.uuVuUuuVVNvN();
         }
      } else {
         this.nNnVnUNVV.clear();
         if (this.nvuVnuvUVvVu) {
            this.nvuVnuvUVvVu = false;
            this.uuvvuNvuUNVV();
         }
      }
   }

   private void uuVuUuuVVNvN() {
      this.VunnVNvNV();
      vnvuUUVun.UuUVuuUu.UuUVuuUu();
      if (!this.uuuVnuvnnNnU()) {
         this.nNnVnUNVV.clear();
         this.uNUnUuUnvnnU = false;
         this.nvuVnuvUVvVu = false;
         this.Oco0Oococc = null;
         this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
         this.UNvvunVVn.UuUVuuUu();
      } else {
         this.UVnuVUUVnnU = null;
         this.VunnVNvNV = 0;
         this.NvUVUvVVnUu = -1;
         this.VvVuvUvvNNVv();
         if (this.NuunnvnN.uUnuvNvvNU() && !vnvuUUVun.UuUVuuUu.uUnuvNvvNU().equals(this.UUVNuUNUvUnV.uUnuvNvvNU())) {
            if (this.UvUvUNuvNU()) {
               this.uNUnUuUnvnnU = true;
               this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
               this.UNvvunVVn.UuUVuuUu();
               return;
            }

            String var1 = vnvuUUVun.UuUVuuUu.uUnuvNvvNU();
            if (!"N/A".equals(var1)) {
               this.OCOocoOoOO = var1;
            }

            uUnuvNvvNU.field_1724.field_3944.method_45730("an" + this.UUVNuUNUvUnV.uUnuvNvvNU());
            this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SWAPPING_TO_SAVE_ANARCHY;
            this.NNUUNUuVNNVn.UuUVuuUu();
            this.ccOO0COcoco0.UuUVuuUu();
         } else {
            this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.GOING_TO_STASH;
            this.NNUUNUuVNNVn.UuUVuuUu();
            this.ccOO0COcoco0.UuUVuuUu();
         }
      }
   }

   private void uUnuvNvvNU(class_1707 var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         int var2 = var1.field_7761.size() - 36;
         int var3 = this.C00OOC00oO(var1, var2);
         if (this.NvUVUvVVnUu >= 0 && var3 >= this.NvUVUvVVnUu) {
            if (this.nvuVvuNnNUnv.uNNnnnuuuN(6000L)) {
               this.nNunUnVN();
               return;
            }
         } else {
            this.NvUVUvVVnUu = var3;
            this.nvuVvuNnNUnv.UuUVuuUu();
         }

         if (!this.vvUVNVvvNUv.isEmpty()) {
            if (this.VvVvnNUnvuvV.uNNnnnuuuN(50L)) {
               this.vvUVNVvvNUv.poll().run();
               this.VvVvnNUnvuvV.UuUVuuUu();
            }
         } else {
            boolean var4 = false;

            for (int var5 = var2; var5 < var1.field_7761.size(); var5++) {
               class_1735 var6 = (class_1735)var1.field_7761.get(var5);
               if (var6.method_7681()) {
                  class_1799 var7 = var6.method_7677();
                  String var8 = this.nuUnNvnuUu(var7);
                  if (this.nNnVnUNVV.getOrDefault(var8, 0) > 0 || this.VVuuUN(var7)) {
                     var4 = true;
                     int var9 = var5;
                     this.vvUVNVvvNUv.add(() -> uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var9, 0, class_1713.field_7794, uUnuvNvvNU.field_1724));
                     this.nNnVnUNVV.remove(var8);
                     return;
                  }
               }
            }

            if (!var4) {
               this.nNunUnVN();
            }
         }
      }
   }

   private int C00OOC00oO(class_1707 var1, int var2) {
      int var3 = 0;

      for (int var4 = var2; var4 < var1.field_7761.size(); var4++) {
         class_1735 var5 = (class_1735)var1.field_7761.get(var4);
         if (var5.method_7681()) {
            class_1799 var6 = var5.method_7677();
            if (this.nNnVnUNVV.getOrDefault(this.nuUnNvnuUu(var6), 0) > 0 || this.VVuuUN(var6)) {
               var3++;
            }
         }
      }

      return var3;
   }

   private boolean VvuUUUNNNv() {
      for (int var1 = 0; var1 < 36; var1++) {
         if (this.VVuuUN(uUnuvNvvNU.field_1724.method_31548().method_5438(var1))) {
            return true;
         }
      }

      return false;
   }

   private boolean uuuVnuvnnNnU() {
      for (int var1 = 0; var1 < 36; var1++) {
         class_1799 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(var1);
         if (!var2.method_7960() && (this.VVuuUN(var2) || this.nNnVnUNVV.getOrDefault(this.nuUnNvnuUu(var2), 0) > 0)) {
            return true;
         }
      }

      return false;
   }

   private void nNunUnVN() {
      this.VunnVNvNV();
      this.nNnVnUNVV.clear();
      this.OoccOc0CO.clear();
      this.vvUVNVvvNUv.clear();
      this.VunnVNvNV = 0;
      this.NvUVUvVVnUu = -1;
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_7346();
      }

      this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
      this.UNvvunVVn.UuUVuuUu();
      if (!this.nvuVnuvUVvVu) {
         if (this.VVnVNnunVvu.uUnuvNvvNU()
            && this.NuunnvnN.uUnuvNvvNU()
            && !"N/A".equals(this.OCOocoOoOO)
            && !this.OCOocoOoOO.equals(this.UUVNuUNUvUnV.uUnuvNvvNU())) {
            this.C00OOC00oO((Runnable)(() -> {
               this.NnVnNVN = true;
               this.vnvvNvUnVv = System.currentTimeMillis() + 500L;
            }));
         }
      } else {
         this.nvuVnuvUVvVu = false;
         if ("N/A".equals(this.NvNUuuuvUvu) || this.NvNUuuuvUvu == null) {
            this.NvNUuuuvUvu = "N/A".equals(this.OCOocoOoOO) ? this.NVNnnvVnvV() : this.OCOocoOoOO;
         }

         this.uuvvuNvuUNVV();
      }
   }

   private String nuUnNvnuUu(class_1799 var1) {
      return var1.method_7909().toString() + "|" + var1.method_7964().getString();
   }

   private boolean VVuuUN(class_1799 var1) {
      if (var1.method_7960()) {
         return false;
      } else {
         String var2 = var1.method_7964().getString();
         if (var2.contains("[★]")) {
            return true;
         } else {
            class_1792 var3 = var1.method_7909();
            if (this.uVunuUNVVUUV.C00OOC00oO("Незер вещи") && this.C00OOC00oO(var3)) {
               return true;
            } else if (this.uVunuUNVVUUV.C00OOC00oO("Дон зелья") && this.vNUvnnVnUvu(var1)) {
               return true;
            } else if (this.uVunuUNVVUUV.C00OOC00oO("Сферы") && this.uVUuuVnNVU(var1)) {
               return true;
            } else if (this.uVunuUNVVUUV.C00OOC00oO("Талисманы") && this.vuuuNvNuv(var1)) {
               return true;
            } else if (!this.uVunuUNVVUUV.C00OOC00oO("Стрелы")
               || var3 != class_1802.field_8107 && var3 != class_1802.field_8087 && var3 != class_1802.field_8236) {
               if (this.uVunuUNVVUUV.C00OOC00oO("Оружие") && this.UuUVuuUu(var3)) {
                  return true;
               } else if (this.uVunuUNVVUUV.C00OOC00oO("Броня") && AutoBuy.C00OOC00oO(var3)) {
                  return true;
               } else {
                  return this.uVunuUNVVUUV.C00OOC00oO("Яйца") && var3 instanceof class_1826
                     ? true
                     : this.uVunuUNVVUUV.C00OOC00oO("Ценные предметы") && this.nvUVNnuu(var1);
               }
            } else {
               return true;
            }
         }
      }
   }

   private boolean UuUVuuUu(class_1792 var1) {
      return var1 == class_1802.field_8091
         || var1 == class_1802.field_8528
         || var1 == class_1802.field_8371
         || var1 == class_1802.field_8845
         || var1 == class_1802.field_8802
         || var1 == class_1802.field_22022
         || var1 == class_1802.field_8406
         || var1 == class_1802.field_8062
         || var1 == class_1802.field_8475
         || var1 == class_1802.field_8825
         || var1 == class_1802.field_8556
         || var1 == class_1802.field_22025
         || var1 == class_1802.field_8547
         || var1 == class_1802.field_49814
         || var1 == class_1802.field_8102
         || var1 == class_1802.field_8399;
   }

   private boolean C00OOC00oO(class_1792 var1) {
      return var1 == class_1802.field_22027
         || var1 == class_1802.field_22028
         || var1 == class_1802.field_22029
         || var1 == class_1802.field_22030
         || var1 == class_1802.field_22022
         || var1 == class_1802.field_22024;
   }

   private boolean vNUvnnVnUvu(class_1799 var1) {
      return vnVVvun.uVunuUNVVUUV(var1)
         || vnVVvun.UNnVVNvvnVvU(var1)
         || vnVVvun.uNnUnnuNUnNu(var1)
         || vnVVvun.NnUuNNU(var1)
         || vnVVvun.nNvNUVU(var1)
         || vnVVvun.UnUNuUU(var1)
         || vnVVvun.uUVuVvuNUvnu(var1);
   }

   private boolean uVUuuVnNVU(class_1799 var1) {
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

   private boolean vuuuNvNuv(class_1799 var1) {
      return vnVVvun.vuuuNvNuv(var1)
         || vnVVvun.nvUVNnuu(var1)
         || vnVVvun.UuuNnUvUuv(var1)
         || vnVVvun.nUUVuvU(var1)
         || vnVVvun.UnUNVVVNuv(var1)
         || vnVVvun.vNVuvnUUnuUn(var1)
         || vnVVvun.UvnvNVnnnnNU(var1)
         || vnVVvun.uVUVnuvnuVuv(var1);
   }

   private boolean nvUVNnuu(class_1799 var1) {
      class_1792 var2 = var1.method_7909();
      if (this.uVunuUNVVUUV.C00OOC00oO("Незер вещи") && this.C00OOC00oO(var2)) {
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
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         class_4598 var2 = nNNnNvVVv.UuUVuuUu();

         try {
            class_243 var3 = uUnuvNvvNU.field_1773.method_19418().method_19326();
            Matrix4f var4 = var1.uUnuvNvvNU().method_23760().method_23761();
            class_4588 var5 = var2.getBuffer(nvvVNNnnUvVN);
            if (this.VVnVNnunVvu.uUnuvNvvNU() && this.unNNVVNnvvV.C00OOC00oO("Ресы") && this.UVnuVUUVnnU != null) {
               this.UuUVuuUu(var5, var4, this.UVnuVUUVnnU, var3, new Color(150, 50, 255, 120), new Color(150, 50, 255, 0));
            }

            if (this.NuUuUvUUvU != null) {
               this.UuUVuuUu(var5, var4, this.NuUuUvUUvU, var3, new Color(255, 220, 0, 140), new Color(255, 220, 0, 0));
            }

            if (!this.vNVuvnUUnuUn()) {
               return;
            }

            for (class_2338 var8 : this.uUVVvVVNvvn.stream().sorted(Comparator.comparingLong(this::UuUVuuUu)).limit(5L).collect(Collectors.toList())) {
               long var9 = this.UuUVuuUu(var8) - System.currentTimeMillis();
               Color var11;
               Color var12;
               if (var8.equals(this.vNnNuuvVn)) {
                  float var13 = (float)(Math.sin(System.currentTimeMillis() / 60.0) * 0.5 + 0.5);
                  var11 = new Color(0, 150, 255, Math.min(255, (int)(80.0F + 150.0F * var13)));
                  var12 = new Color(0, 150, 255, 0);
               } else if (var9 <= 0L) {
                  var11 = new Color(0, 255, 150, 120);
                  var12 = new Color(0, 255, 150, 0);
               } else if (var9 <= 20000L) {
                  float var17 = (float)(Math.sin(System.currentTimeMillis() / 60.0) * 0.5 + 0.5);
                  var11 = new Color(255, 140, 0, Math.min(255, (int)(80.0F + 150.0F * var17)));
                  var12 = new Color(255, 140, 0, 0);
               } else {
                  var11 = new Color(255, 0, 0, 150);
                  var12 = new Color(255, 0, 0, 0);
               }

               this.UuUVuuUu(var5, var4, var8, var3, var11, var12);
            }
         } finally {
            nNNnNvVVv.C00OOC00oO();
         }
      }
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

   private void VnVuuvVvnNv() {
      this.vunuUUVVUv = WardenFarm.uunvUUVnuNn.NONE;
      this.uVvunVUNuUvu();
      this.nNVVUnuVVVuV = false;
      this.uunNUuunVU();
      this.vuvnnvuNVvu();
   }

   private void vuvvuVuVv() {
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_7346();
      }

      if (this.NVuNUuVnVUN != null) {
         this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
      }

      this.VnVuuvVvnNv();
      this.vnVuunuNN = !this.vNVuvnUUnuUn();
      this.vUvVUNnN();
      this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
      this.vNnNuuvVn = null;
      this.unUvvVVVVUu.UuUVuuUu();
      COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
      this.UNvvunVVn.UuUVuuUu();
      this.NNUUNUuVNNVn.UuUVuuUu();
      this.ccOO0COcoco0.UuUVuuUu();
   }

   private void uunNUuunVU() {
      this.UvUNuNvvNVNv = false;
      this.vNnNNNuVVnUv = false;
      this.UVUnUvUNU = false;
      this.UvUnnnn = WardenFarm.VUUnVnVNNU.NONE;
   }

   private boolean NvnuuuvnVV() {
      if (this.vNVuvnUUnuUn() || uUnuvNvvNU.field_1724 == null) {
         this.uunNUuunVU();
         return false;
      } else if (this.UvUnnnn == WardenFarm.VUUnVnVNNU.WAITING) {
         return true;
      } else {
         if (!this.UvUNuNvvNVNv) {
            uUnuvNvvNU.field_1724.field_3944.method_45730("home " + this.vuvnUnVnUNnV.uUnuvNvvNU().trim());
            this.UvUNuNvvNVNv = true;
            this.UvUnnnn = WardenFarm.VUUnVnVNNU.WAITING;
            this.vNnNNNuVVnUv = false;
            this.UVUnUvUNU = false;
            this.NNUUNUuVNNVn.UuUVuuUu();
            this.ccOO0COcoco0.UuUVuuUu();
         }

         return true;
      }
   }

   private boolean NnUVNnuvUv() {
      if (this.UvUnnnn != WardenFarm.VUUnVnVNNU.WAITING) {
         return false;
      } else if (this.vNnNNNuVVnUv) {
         if (!this.UVUnUvUNU) {
            this.UVUnUvUNU = true;
         }

         if (this.ccOO0COcoco0.uNNnnnuuuN(5000L)) {
            this.uunNUuunVU();
         }

         return true;
      } else if (!this.vNVuvnUUnuUn() && !this.NNUUNUuVNNVn.uNNnnnuuuN(2500L)) {
         return true;
      } else {
         this.uunNUuunVU();
         return false;
      }
   }

   private boolean UuuuNNunN() {
      if (!this.vnVuunuNN || uUnuvNvvNU.field_1724 == null) {
         return false;
      } else if (!this.vNVuvnUUnuUn() && this.NuunnvnN.uUnuvNvvNU()) {
         vnvuUUVun.UuUVuuUu.UuUVuuUu();
         String var1 = vnvuUUVun.UuUVuuUu.uUnuvNvvNU();
         if (this.uUnuvNvvNU(var1)) {
            return this.UvUnnnn != WardenFarm.VUUnVnVNNU.NONE || this.NvnuuuvnVV();
         } else if (this.UvUvUNuvNU()) {
            return true;
         } else {
            if (this.NNUUNUuVNNVn.uNNnnnuuuN(3000L)) {
               String var2 = this.NvNUuuuvUvu;
               if (!this.uUnuvNvvNU(var2)) {
                  var2 = this.NVNnnvVnvV();
               }

               if (!this.uUnuvNvvNU(var2)) {
                  this.vnVuunuNN = false;
                  return false;
               }

               uUnuvNvvNU.field_1724.field_3944.method_45730("an" + var2);
               this.NNUUNUuVNNVn.UuUVuuUu();
            }

            return true;
         }
      } else {
         this.vnVuunuNN = false;
         return false;
      }
   }

   private void NNVNuUvVn() {
      if (this.vNVuvnUUnuUn()) {
         this.vunuUUVVUv = WardenFarm.uunvUUVnuNn.USE_INVIS;
         this.NNUUNUuVNNVn.UuUVuuUu();
      } else {
         if (this.NvnuuuvnVV()) {
            this.vunuUUVVUv = WardenFarm.uunvUUVnuNn.TELEPORT_WARDEN;
         } else {
            this.vunuUUVVUv = WardenFarm.uunvUUVnuNn.USE_INVIS;
            this.NNUUNUuVNNVn.UuUVuuUu();
         }
      }
   }

   private void vuNnuUnu() {
      this.NvNUuuuvUvu = this.NVNnnvVnvV();
      if (this.VVnVNnunVvu.uUnuvNvvNU() && this.uuuVnuvnnNnU()) {
         this.nvuVnuvUVvVu = true;
         this.vUvUvUNNuNvn();
      } else {
         this.nNnVnUNVV.clear();
         this.uuvvuNvuUNVV();
      }
   }

   private void uuvvuNvuUNVV() {
      if (this.UvUvUNuvNU.uUnuvNvvNU() && this.NuunnvnN.uUnuvNvvNU()) {
         if (this.NVuNUuVnVUN != null) {
            this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
         }

         if (uUnuvNvvNU.field_1724 != null) {
            uUnuvNvvNU.field_1724.method_7346();
         }

         if ("N/A".equals(this.NvNUuuuvUvu) || this.NvNUuuuvUvu == null) {
            this.NvNUuuuvUvu = this.NVNnnvVnvV();
         }

         this.occOCoc0OcO = false;
         this.VnvunuuvUNu = false;
         this.nuVuunUn = false;
         this.vNUUvuuVU.clear();
         this.uVvunVUNuUvu();
         this.vunuUUVVUv = WardenFarm.uunvUUVnuNn.SWAP_TO_BASE;
         this.NVuunNnvvvVu = WardenFarm.nvnNNunvv.SEARCHING;
         this.vNnNuuvVn = null;
         this.NNUUNUuVNNVn.UuUVuuUu();
         this.ccOO0COcoco0.UuUVuuUu();
      }
   }

   private void uVvunVUNuUvu() {
      this.uuuNUnuvvNNv = WardenFarm.VvunVVUvUNnv.FIND;
      this.unUVnu = null;
      this.NvNvVNUv = 0;
      this.UvuVvvVuUuuu = null;
      this.NUUVUvvuNNVU = 0;
      this.VUNvNUuNVnn = WardenFarm.VUnuUnnuNvVu.NONE;
      this.vvUVNVvvNUv.clear();
      this.unNuVNVUnV = -1;
      this.UvNNNUvNnUUV = WardenFarm.nvUnvV.NONE;
      this.vVuNvnVUvvv = 0;
      this.OCCc0co0OOC = 0L;
   }

   private String NVNnnvVnvV() {
      vnvuUUVun.UuUVuuUu.UuUVuuUu();
      String var1 = vnvuUUVun.UuUVuuUu.uUnuvNvvNU();
      if (this.uUnuvNvvNU(var1)) {
         return var1;
      } else {
         String[] var2 = this.NVUunUNUN.uUnuvNvvNU().split(",");
         return var2.length > 0 && !var2[0].trim().isEmpty() ? var2[0].trim() : var1;
      }
   }

   private boolean uUnuvNvvNU(String var1) {
      if (var1 != null && !"N/A".equals(var1) && !var1.equals(this.UUVNuUNUvUnV.uUnuvNvvNU())) {
         for (String var5 : this.NVUunUNUN.uUnuvNvvNU().split(",")) {
            if (var5.trim().equals(var1)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean vUNuuvvnVnv() {
      vnvuUUVun.UuUVuuUu.UuUVuuUu();
      return vnvuUUVun.UuUVuuUu.uUnuvNvvNU().equals(this.UUVNuUNUvUnV.uUnuvNvvNU());
   }

   private boolean unnnNUNnVu() {
      return !this.uUnuvNvvNU(vnvuUUVun.UuUVuuUu.uUnuvNvvNU())
         ? false
         : this.vNVuvnUUnuUn()
            || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.GOING_TO_CHEST
            || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.ROTATING
            || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.OPENING
            || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.WAITING_FOR_GUI;
   }

   private boolean NvnnUUuVvNU() {
      if (!this.UvUvUNuvNU.uUnuvNvvNU()) {
         return true;
      } else {
         boolean var1 = this.nvuUVvuuN() >= 1 || this.uNnNUNvuVnu() || this.nuVuunUn;
         boolean var2 = this.CC0COO() >= 3 || this.occOCoc0OcO;
         return var1 && var2;
      }
   }

   private boolean vVvuUVnV() {
      if (!this.UvUvUNuvNU.uUnuvNvvNU()) {
         return false;
      } else if (!this.uNnNUNvuVnu() && this.nvuUVvuuN() == 0 && !this.nuVuunUn) {
         return true;
      } else {
         return this.c0oOOCcCoC0.uUnuvNvvNU() && !this.VnvunuuvUNu && !uUnuvNvvNU.field_1724.method_6059(class_1294.field_5904) && this.VNNnnVUuvv() == 0
            ? true
            : this.CC0COO() < 3 && !this.occOCoc0OcO;
      }
   }

   private int nvuUVvuuN() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var2);
         if (this.vVvUvVVuuNvV(var3)) {
            var1 += var3.method_7947();
         }
      }

      return var1;
   }

   private boolean UuuNnUvUuv(class_1799 var1) {
      if (var1.method_7960()) {
         return false;
      } else if (!var1.method_31574(class_1802.field_8071) && !var1.method_31574(class_1802.field_8179)) {
         String var2 = var1.method_7964().getString().toLowerCase(Locale.ROOT);
         return var2.contains("морков") || var2.contains("carrot");
      } else {
         return true;
      }
   }

   private int CC0COO() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var2);
         if (this.UuuNnUvUuv(var3)) {
            var1 += var3.method_7947();
         }
      }

      return var1;
   }

   private boolean uNnNUNvuVnu() {
      return uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1724.method_6059(class_1294.field_5905);
   }

   private boolean vVvUvVVuuNvV(String var1) {
      String var2 = var1.toLowerCase(Locale.ROOT).replaceAll("§.", "");
      return var2.contains("не найден")
         || var2.contains("не существует")
         || var2.contains("нет дома")
         || var2.contains("нет точки")
         || var2.contains("not found")
         || var2.contains("unknown home")
         || var2.contains("home") && var2.contains("нет");
   }

   private void VnnnvUunNvuu() {
      if (uUnuvNvvNU.field_1724 != null && this.NVuNUuVnVUN != null) {
         vnvuUUVun.UuUVuuUu.UuUVuuUu();
         switch (this.vunuUUVVUv) {
            case SWAP_TO_BASE:
               if (this.vUNuuvvnVnv()) {
                  this.vunuUUVVUv = WardenFarm.uunvUUVnuNn.COLLECT_KIT;
                  this.uVvunVUNuUvu();
                  this.NNUUNUuVNNVn.UuUVuuUu();
                  this.ccOO0COcoco0.UuUVuuUu();
               } else if (this.UvUvUNuvNU()) {
                  this.ccOO0COcoco0.UuUVuuUu();
               } else if (this.NNUUNUuVNNVn.uNNnnnuuuN(700L)) {
                  uUnuvNvvNU.field_1724.field_3944.method_45730("an" + this.UUVNuUNUvUnV.uUnuvNvvNU());
                  this.vunuUUVVUv = WardenFarm.uunvUUVnuNn.WAIT_BASE;
                  this.NNUUNUuVNNVn.UuUVuuUu();
                  this.ccOO0COcoco0.UuUVuuUu();
               }
               break;
            case WAIT_BASE:
               if (this.vUNuuvvnVnv()) {
                  this.vunuUUVVUv = WardenFarm.uunvUUVnuNn.COLLECT_KIT;
                  this.uVvunVUNuUvu();
                  this.NNUUNUuVNNVn.UuUVuuUu();
                  this.ccOO0COcoco0.UuUVuuUu();
               } else if (this.ccOO0COcoco0.uNNnnnuuuN(20000L)) {
                  this.vuvvuVuVv();
               }
               break;
            case COLLECT_KIT:
               this.VuuUVVu();
               break;
            case SWAP_TO_FARM:
               if (this.NvnnUUuVvNU()) {
                  String var1 = this.NvNUuuuvUvu;
                  if ("N/A".equals(var1) || var1 == null) {
                     var1 = this.NVNnnvVnvV();
                  }

                  if (vnvuUUVun.UuUVuuUu.uUnuvNvvNU().equals(var1)) {
                     this.NNVNuUvVn();
                  } else if (this.UvUvUNuvNU()) {
                     this.ccOO0COcoco0.UuUVuuUu();
                  } else if (this.NNUUNUuVNNVn.uNNnnnuuuN(700L)) {
                     uUnuvNvvNU.field_1724.field_3944.method_45730("an" + var1);
                     this.vunuUUVVUv = WardenFarm.uunvUUVnuNn.WAIT_FARM;
                     this.NNUUNUuVNNVn.UuUVuuUu();
                     this.ccOO0COcoco0.UuUVuuUu();
                  }
               } else if (this.ccOO0COcoco0.uNNnnnuuuN(15000L)) {
                  this.vuvvuVuVv();
               } else {
                  this.vunuUUVVUv = WardenFarm.uunvUUVnuNn.COLLECT_KIT;
                  this.uVvunVUNuUvu();
               }
               break;
            case WAIT_FARM:
               if (this.uUnuvNvvNU(vnvuUUVun.UuUVuuUu.uUnuvNvvNU())) {
                  this.NNVNuUvVn();
                  this.ccOO0COcoco0.UuUVuuUu();
               } else if (this.ccOO0COcoco0.uNNnnnuuuN(20000L)) {
                  this.vuvvuVuVv();
               }
               break;
            case TELEPORT_WARDEN:
               if (this.NnUVNnuvUv()) {
                  return;
               }

               this.vunuUUVVUv = WardenFarm.uunvUUVnuNn.USE_INVIS;
               this.NNUUNUuVNNVn.UuUVuuUu();
               break;
            case USE_INVIS:
               if (!this.uNnNUNvuVnu()) {
                  if (this.uNVvVvUuuuU == WardenFarm.NVnVnNnN.NONE) {
                     if (this.VuNVnvNNuNnn() == -1) {
                        if (this.nuVuunUn) {
                           this.vuvvuVuVv();
                        } else {
                           this.uuvvuNvuUNVV();
                        }

                        return;
                     }

                     this.UuUVuuUu(WardenFarm.NVnVnNnN.DRINK_INVIS);
                  } else {
                     this.NuvunVvnnN();
                  }

                  return;
               }

               this.vuvvuVuVv();
         }
      }
   }

   private void VuuUVVu() {
      if (this.NvnnUUuVvNU() && !this.UnnnvvU()) {
         this.uVvunVUNuUvu();
         this.vunuUUVVUv = WardenFarm.uunvUUVnuNn.SWAP_TO_FARM;
         this.NNUUNUuVNNVn.UuUVuuUu();
         this.ccOO0COcoco0.UuUVuuUu();
      } else {
         switch (this.uuuNUnuvvNNv) {
            case FIND:
               this.unUVnu = this.VUUnuVvVu();
               if (this.unUVnu == null) {
                  if (this.ccOO0COcoco0.uNNnnnuuuN(1500L)) {
                     this.occOCoc0OcO = this.CC0COO() < 3;
                     this.VnvunuuvUNu = this.c0oOOCcCoC0.uUnuvNvvNU() && this.VNNnnVUuvv() < 1;
                     if (!this.uNnNUNvuVnu() && this.nvuUVvuuN() < 1) {
                        this.nuVuunUn = true;
                     }

                     this.uVvunVUNuUvu();
                     this.vunuUUVVUv = WardenFarm.uunvUUVnuNn.SWAP_TO_FARM;
                     this.NNUUNUuVNNVn.UuUVuuUu();
                     this.ccOO0COcoco0.UuUVuuUu();
                  }

                  return;
               }

               this.uuuNUnuvvNNv = WardenFarm.VvunVVUvUNnv.GOING;
               this.NNUUNUuVNNVn.UuUVuuUu();
               this.ccOO0COcoco0.UuUVuuUu();
               break;
            case GOING:
               double var4 = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(this.unUVnu));
               if (var4 <= 2.9 && this.uNnUnnuNUnNu(this.unUVnu)) {
                  this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
                  this.uuuNUnuvvNNv = WardenFarm.VvunVVUvUNnv.ROTATING;
                  this.NNUUNUuVNNVn.UuUVuuUu();
               } else if (this.ccOO0COcoco0.uNNnnnuuuN(15000L)) {
                  this.VVnVNnunVvu(this.unUVnu);
                  this.unUVnu = null;
                  this.uuuNUnuvvNNv = WardenFarm.VvunVVUvUNnv.FIND;
                  this.ccOO0COcoco0.UuUVuuUu();
               } else if (!this.NVuNUuVnVUN.getCustomGoalProcess().isActive() || this.nNuVunNUVu.uNNnnnuuuN(2500L)) {
                  this.NVuNUuVnVUN.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.unUVnu, 1));
                  this.nNuVunNUVu.UuUVuuUu();
               }
               break;
            case ROTATING:
               if (!this.nNvNUVU(this.unUVnu)) {
                  this.uuuNUnuvvNNv = WardenFarm.VvunVVUvUNnv.GOING;
                  this.NNUUNUuVNNVn.UuUVuuUu();
                  this.ccOO0COcoco0.UuUVuuUu();
                  return;
               }

               uuUuvNuNVNVU var3 = this.uUnuvNvvNU(this.NnUuNNU(this.unUVnu));
               this.unUvvVVVVUu.UuUVuuUu(this.UuUVuuUu(var3, this.UuUVuuUu(var3)), 35.0F, 35.0F, 35.0F, 35.0F, 20, 1);
               if (this.UnUNuUU(this.unUVnu) != null && this.NNUUNUuVNNVn.uNNnnnuuuN(100L)) {
                  this.uuuNUnuvvNNv = WardenFarm.VvunVVUvUNnv.OPENING;
                  this.NNUUNUuVNNVn.UuUVuuUu();
               }
               break;
            case OPENING:
               if (!this.nNvNUVU(this.unUVnu)) {
                  this.uuuNUnuvvNNv = WardenFarm.VvunVVUvUNnv.GOING;
                  this.NNUUNUuVNNVn.UuUVuuUu();
                  this.ccOO0COcoco0.UuUVuuUu();
                  return;
               }

               uuUuvNuNVNVU var1 = this.uUnuvNvvNU(this.NnUuNNU(this.unUVnu));
               this.unUvvVVVVUu.UuUVuuUu(this.UuUVuuUu(var1, 0.6F), 18.0F, 18.0F, 20.0F, 20.0F, 20, 1);
               class_3965 var2 = this.UnUNuUU(this.unUVnu);
               if (var2 == null) {
                  if (this.NNUUNUuVNNVn.uNNnnnuuuN(1200L)) {
                     this.uuuNUnuvvNNv = WardenFarm.VvunVVUvUNnv.ROTATING;
                     this.NNUUNUuVNNVn.UuUVuuUu();
                  }

                  return;
               }

               if (System.currentTimeMillis() - this.vVnuVVvVNuNu < 400L) {
                  return;
               }

               if (this.NNUUNUuVNNVn.uNNnnnuuuN(100L)) {
                  uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
                  uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var2);
                  COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
                  this.uuuNUnuvvNNv = WardenFarm.VvunVVUvUNnv.WAIT_GUI;
                  this.NNUUNUuVNNVn.UuUVuuUu();
               }
               break;
            case WAIT_GUI:
               if (this.NNUUNUuVNNVn.uNNnnnuuuN(1500L)) {
                  this.NvNvVNUv++;
                  if (this.NvNvVNUv >= 4) {
                     this.NvNvVNUv = 0;
                     this.unUVnu = null;
                     this.uuuNUnuvvNNv = WardenFarm.VvunVVUvUNnv.FIND;
                  } else if (this.nNvNUVU(this.unUVnu)) {
                     this.uuuNUnuvvNNv = WardenFarm.VvunVVUvUNnv.OPENING;
                  } else {
                     this.uuuNUnuvvNNv = WardenFarm.VvunVVUvUNnv.GOING;
                  }

                  this.NNUUNUuVNNVn.UuUVuuUu();
                  this.ccOO0COcoco0.UuUVuuUu();
               }
         }
      }
   }

   private boolean UuUVuuUu(class_476 var1) {
      String var2 = var1.method_25440().getString().toLowerCase(Locale.ROOT).replaceAll("§.", "").trim();
      return var2.contains("сундук") || var2.contains("chest") || var2.contains("бочка") || var2.contains("barrel") || var2.contains("шалкер");
   }

   private void vVvUvVVuuNvV(class_1707 var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null && this.unUVnu != null) {
         this.C00OOC00oO(var1);
         if (!this.vvUVNVvvNUv.isEmpty()) {
            if (this.VvVvnNUnvuvV.uNNnnnuuuN(60L)) {
               this.vvUVNVvvNUv.poll().run();
               this.VvVvnNUnvuvV.UuUVuuUu();
            }
         } else {
            if (this.UvNNNUvNnUUV != WardenFarm.nvUnvV.NONE) {
               if (this.UuUVuuUu(this.UvNNNUvNnUUV) >= this.vVuNvnVUvvv) {
                  this.UvNNNUvNnUUV = WardenFarm.nvUnvV.NONE;
                  this.vVuNvnVUvvv = 0;
                  this.OCCc0co0OOC = 0L;
                  this.NNUUNUuVNNVn.UuUVuuUu();
               } else {
                  if (System.currentTimeMillis() - this.OCCc0co0OOC < 1200L) {
                     return;
                  }

                  this.UvNNNUvNnUUV = WardenFarm.nvUnvV.NONE;
                  this.vVuNvnVUvvv = 0;
                  this.OCCc0co0OOC = 0L;
               }
            }

            int var2 = var1.field_7761.size() - 36;
            int var3 = this.unnUnUNVnN() ? 1 - this.nvuUVvuuN() : 0;
            int var4 = this.UnnnvvU() && !uUnuvNvvNU.field_1724.method_6059(class_1294.field_5904) ? 1 - this.VNNnnVUuvv() : 0;
            int var5 = this.NnuUnUNnu() && !this.occOCoc0OcO ? 3 - this.CC0COO() : 0;
            if (var3 <= 0 && var4 <= 0 && var5 <= 0) {
               this.occOCoc0OcO = false;
               this.VnvunuuvUNu = false;
               this.nuVuunUn = false;
               uUnuvNvvNU.field_1724.method_7346();
               this.uVvunVUNuUvu();
               this.vunuUUVVUv = WardenFarm.uunvUUVnuNn.SWAP_TO_FARM;
               this.NNUUNUuVNNVn.UuUVuuUu();
               this.ccOO0COcoco0.UuUVuuUu();
            } else if (!this.UuUVuuUu(var1, var2, this::vVvUvVVuuNvV, var3, WardenFarm.nvUnvV.INVIS)
               && !this.UuUVuuUu(var1, var2, this::uNNnnnuuuN, var4, WardenFarm.nvUnvV.SPEED)
               && !this.UuUVuuUu(var1, var2, this::UuuNnUvUuv, var5, WardenFarm.nvUnvV.CARROT)) {
               long var6 = this.uUnuvNvvNU(var1, var2) ? 350L : 1500L;
               if (this.NNUUNUuVNNVn.uNNnnnuuuN(var6)) {
                  this.VVnVNnunVvu(this.unUVnu);
                  uUnuvNvvNU.field_1724.method_7346();
                  this.vVnuVVvVNuNu = System.currentTimeMillis();
                  this.uVvunVUNuUvu();
                  this.NNUUNUuVNNVn.UuUVuuUu();
                  this.ccOO0COcoco0.UuUVuuUu();
               }
            } else {
               this.NNUUNUuVNNVn.UuUVuuUu();
            }
         }
      }
   }

   private boolean UuUVuuUu(class_1707 var1, int var2, Predicate<class_1799> var3, int var4, WardenFarm.nvUnvV var5) {
      if (var4 <= 0) {
         return false;
      } else {
         for (int var6 = 0; var6 < var2; var6++) {
            class_1735 var7 = (class_1735)var1.field_7761.get(var6);
            if (var7.method_7681() && var3.test(var7.method_7677())) {
               int var8 = this.UuUVuuUu(var1, var2, var3, var4);
               if (var8 == -1) {
                  return false;
               }

               int var9 = var6;
               int var10 = Math.min(var7.method_7677().method_7947(), var4);
               this.UvNNNUvNnUUV = var5;
               this.vVuNvnVUvvv = this.UuUVuuUu(var5) + var10;
               this.OCCc0co0OOC = System.currentTimeMillis();
               if (var7.method_7677().method_7947() <= var4) {
                  this.vvUVNVvvNUv.add(() -> uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var9, 0, class_1713.field_7794, uUnuvNvvNU.field_1724));
                  return true;
               }

               this.vvUVNVvvNUv.add(() -> uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var9, 0, class_1713.field_7790, uUnuvNvvNU.field_1724));

               for (int var11 = 0; var11 < var10; var11++) {
                  this.vvUVNVvvNUv.add(() -> uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var8, 1, class_1713.field_7790, uUnuvNvvNU.field_1724));
               }

               this.vvUVNVvvNUv.add(() -> uUnuvNvvNU.field_1761.method_2906(var1.field_7763, var9, 0, class_1713.field_7790, uUnuvNvvNU.field_1724));
               return true;
            }
         }

         return false;
      }
   }

   private int UuUVuuUu(WardenFarm.nvUnvV var1) {
      return switch (var1) {
         case INVIS -> this.nvuUVvuuN();
         case SPEED -> this.VNNnnVUuvv();
         case CARROT -> this.CC0COO();
         default -> 0;
      };
   }

   private int UuUVuuUu(class_1707 var1, int var2, Predicate<class_1799> var3, int var4) {
      for (int var5 = var2; var5 < var1.field_7761.size(); var5++) {
         class_1799 var6 = ((class_1735)var1.field_7761.get(var5)).method_7677();
         if (!var6.method_7960() && var3.test(var6) && var6.method_7947() + var4 <= var6.method_7914()) {
            return var5;
         }
      }

      return this.vVvUvVVuuNvV(var1, var2);
   }

   private boolean uUnuvNvvNU(class_1707 var1, int var2) {
      for (int var3 = 0; var3 < var2; var3++) {
         if (((class_1735)var1.field_7761.get(var3)).method_7681()) {
            return true;
         }
      }

      return false;
   }

   private int vVvUvVVuuNvV(class_1707 var1, int var2) {
      for (int var3 = var2; var3 < var1.field_7761.size(); var3++) {
         if (!((class_1735)var1.field_7761.get(var3)).method_7681()) {
            return var3;
         }
      }

      return -1;
   }

   private void nUNnuUNnV() {
      if (!this.UvUvUNuvNU.uUnuvNvvNU() || this.vunuUUVVUv != WardenFarm.uunvUUVnuNn.NONE || !this.Oco0Oococc()) {
         this.vuvnnvuNVvu();
      } else if (this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.SWAPPING_TO_SAVE_ANARCHY
         || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.GOING_TO_STASH
         || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.ROTATING_STASH
         || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.OPENING_STASH_BLOCK
         || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.WAITING_FOR_GUI_STASH
         || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.STORING_IN_CHEST
         || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.OPENING_STASH) {
         this.vuvnnvuNVvu();
      } else if (this.uNVvVvUuuuU != WardenFarm.NVnVnNnN.NONE) {
         this.NuvunVvnnN();
      } else if (uUnuvNvvNU.field_1724.method_7344().method_7586() <= 16 && this.nVuuUnnUUVU() != -1) {
         this.UuUVuuUu(WardenFarm.NVnVnNnN.EAT_CARROT);
      } else if (this.c0oOOCcCoC0.uUnuvNvvNU() && !uUnuvNvvNU.field_1724.method_6059(class_1294.field_5904)) {
         if (this.NNnvvunuVNUn() != -1) {
            this.UuUVuuUu(WardenFarm.NVnVnNnN.DRINK_SPEED);
         }
      } else {
         if (!this.uNnNUNvuVnu()) {
            if (this.VuNVnvNNuNnn() != -1) {
               this.UuUVuuUu(WardenFarm.NVnVnNnN.DRINK_INVIS);
            } else if (this.vVvuUVnV()) {
               this.vuNnuUnu();
            }
         }
      }
   }

   private int VuNVnvNNuNnn() {
      for (int var1 = 0; var1 < 36; var1++) {
         if (this.vVvUvVVuuNvV(uUnuvNvvNU.field_1724.method_31548().method_5438(var1))) {
            return var1;
         }
      }

      return -1;
   }

   private int uvVuuuvvVU() {
      for (int var1 = 0; var1 < 36; var1++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_31574(class_1802.field_8071)) {
            return var1;
         }
      }

      for (int var3 = 0; var3 < 36; var3++) {
         class_1799 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(var3);
         if (this.UuuNnUvUuv(var2)) {
            return var3;
         }
      }

      return -1;
   }

   private int NNnvvunuVNUn() {
      for (int var1 = 0; var1 < 36; var1++) {
         class_1799 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(var1);
         if (this.uNNnnnuuuN(var2) && !this.C00OOC00oO(var2)) {
            return var1;
         }
      }

      return -1;
   }

   private boolean nUUVuvU(class_1799 var1) {
      if (var1.method_7960()) {
         return false;
      } else if (this.UuuNnUvUuv(var1)) {
         return true;
      } else {
         return var1.method_58694(class_9334.field_50075) == null ? false : !this.VVuuUN(var1);
      }
   }

   private int nVuuUnnUUVU() {
      int var1 = this.uvVuuuvvVU();
      if (var1 != -1) {
         return var1;
      } else {
         for (int var2 = 0; var2 < 36; var2++) {
            class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var2);
            if (this.nUUVuvU(var3)) {
               return var2;
            }
         }

         return -1;
      }
   }

   private void UuUVuuUu(WardenFarm.NVnVnNnN var1) {
      int var2 = switch (var1) {
         case DRINK_INVIS -> this.VuNVnvNNuNnn();
         case EAT_CARROT -> this.nVuuUnnUUVU();
         case DRINK_SPEED -> this.NNnvvunuVNUn();
         default -> -1;
      };
      if (var2 != -1) {
         this.uuuvuUUNVVUN = uUnuvNvvNU.field_1724.method_31548().method_67532();
         this.nvnUvvnUUN = var2;
         this.uNVvVvUuuuU = var1;
         this.VnUvVu.UuUVuuUu();
         this.vnUUvvnUVUu = false;
         this.vNVvnNNnVV = false;
         this.UuUVuuUu(var2);
         if (var2 <= 8) {
            this.nUununvNvvn();
         } else {
            uUnuvNvvNU.field_1690.field_1904.method_23481(true);
         }
      }
   }

   private void nUununvNvvn() {
      uUnuvNvvNU.field_1690.field_1904.method_23481(true);
      if (!(uUnuvNvvNU.field_1755 instanceof class_408) && !this.vnuNNVvVVuN()) {
         if (uUnuvNvvNU.field_1761 != null) {
            uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
         }
      } else if (!this.vnUUvvnUVUu && uUnuvNvvNU.method_1562() != null) {
         uUnuvNvvNU.method_1562()
            .method_52787(new class_2886(class_1268.field_5808, 0, uUnuvNvvNU.field_1724.method_36454(), uUnuvNvvNU.field_1724.method_36455()));
         this.vnUUvvnUVUu = true;
      }

      this.vNVvnNNnVV = true;
   }

   private void NuvunVvnnN() {
      class_1799 var1 = uUnuvNvvNU.field_1724.method_6047();

      boolean var2 = switch (this.uNVvVvUuuuU) {
         case DRINK_INVIS -> this.vVvUvVVuuNvV(var1);
         case EAT_CARROT -> this.nUUVuvU(var1);
         case DRINK_SPEED -> this.uNNnnnuuuN(var1);
         default -> false;
      };
      if (!var2) {
         if (this.VnUvVu.nuUnNvnuUu() < 300L && !this.vnuNNVvVVuN()) {
            uUnuvNvvNU.field_1690.field_1904.method_23481(true);
         } else {
            this.vuvnnvuNVvu();
         }
      } else {
         if (!this.vNVvnNNnVV) {
            this.nUununvNvvn();
         } else if (!this.vnuNNVvVVuN()) {
            uUnuvNvvNU.field_1690.field_1904.method_23481(true);
         }
         boolean var3 = switch (this.uNVvVvUuuuU) {
            case DRINK_INVIS -> this.uNnNUNvuVnu();
            case EAT_CARROT -> uUnuvNvvNU.field_1724.method_7344().method_7586() > 16;
            case DRINK_SPEED -> uUnuvNvvNU.field_1724.method_6059(class_1294.field_5904);
            default -> true;
         };
         if (var3 || this.VnUvVu.uNNnnnuuuN(4500L)) {
            this.vuvnnvuNVvu();
         }
      }
   }

   private void vuvnnvuNVvu() {
      uUnuvNvvNU.field_1690.field_1904.method_23481(false);
      if (uUnuvNvvNU.field_1724 != null && this.nvnUvvnUUN != -1 && this.uuuvuUUNVVUN != -1) {
         uUnuvNvvNU.field_1724.method_31548().method_61496(this.uuuvuUUNVVUN);
      }

      this.uNVvVvUuuuU = WardenFarm.NVnVnNnN.NONE;
      this.nvnUvvnUUN = -1;
      this.uuuvuUUNVVUN = -1;
      this.vnUUvvnUVUu = false;
      this.vNVvnNNnVV = false;
   }

   private void NVvnvnn() {
      if (!this.vuNunNnvnunv) {
         NVnVnU.UuUVuuUu().UuUVuuUu("WardenFarmInvMove");
         this.vuNunNnvnunv = true;
      }

      this.UVVNUnVnNV.UuUVuuUu();
   }

   private void vUvVUNnN() {
      if (this.vuNunNnvnunv) {
         NVnVnU.UuUVuuUu().C00OOC00oO("WardenFarmInvMove");
         this.vuNunNnvnunv = false;
      }
   }

   private void NUuVnnuUnvu() {
      if (this.vuNunNnvnunv && this.UVVNUnVnNV.uNNnnnuuuN(200L)) {
         this.vUvVUNnN();
      }
   }

   private boolean vnuNNVvVVuN() {
      return uUnuvNvvNU.field_1755 instanceof class_433;
   }

   private boolean Oco0Oococc() {
      return uUnuvNvvNU.field_1755 == null || uUnuvNvvNU.field_1755 instanceof class_408 || uUnuvNvvNU.field_1755 instanceof class_433;
   }

   private boolean uNUnUuUnvnnU() {
      return !this.Oco0Oococc();
   }

   private boolean OoccOc0CO() {
      if (!this.nNvNUVU.uUnuvNvvNU() || uUnuvNvvNU.field_1724 == null || uUnuvNvvNU.field_1761 == null) {
         this.NUuVnnuUnvu();
         return false;
      } else if (uUnuvNvvNU.field_1724.method_29504() || this.uNUnUuUnvnnU() || this.uNVvVvUuuuU != WardenFarm.NVnVnNnN.NONE) {
         this.NUuVnnuUnvu();
         return false;
      } else if (this.UnUNuUU()
         || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.ROTATING_STASH
         || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.OPENING_STASH_BLOCK
         || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.WAITING_FOR_GUI_STASH
         || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.STORING_IN_CHEST
         || this.NVuunNnvvvVu == WardenFarm.nvnNNunvv.OPENING_STASH) {
         this.NUuVnnuUnvu();
         return false;
      } else if (this.vunuUUVVUv != WardenFarm.uunvUUVnuNn.NONE
         && this.uuuNUnuvvNNv != WardenFarm.VvunVVUvUNnv.FIND
         && this.uuuNUnuvvNNv != WardenFarm.VvunVVUvUNnv.GOING) {
         this.NUuVnnuUnvu();
         return false;
      } else {
         int var1 = this.UvuVvvVuUuuu();
         if (var1 == -1) {
            this.NUuVnnuUnvu();
            return false;
         } else {
            int var2 = this.NUUVUvvuNNVU();
            if (var2 == -1) {
               this.NUuVnnuUnvu();
               return false;
            } else {
               if (this.NVuNUuVnVUN != null) {
                  this.NVuNUuVnVUN.getPathingBehavior().cancelEverything();
               }

               this.NVvnvnn();
               if (this.NvUVuUNUUNvv.uNNnnnuuuN(150L)) {
                  uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var2, var1, class_1713.field_7791, uUnuvNvvNU.field_1724);
                  this.NvUVuUNUUNvv.UuUVuuUu();
               }

               return true;
            }
         }
      }
   }

   private int UvuVvvVuUuuu() {
      for (int var1 = 0; var1 <= 8; var1++) {
         if (!uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_7960()) {
            return var1;
         }
      }

      return -1;
   }

   private int NUUVUvvuNNVU() {
      for (int var1 = 9; var1 < 36; var1++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_7960()) {
            return var1;
         }
      }

      return -1;
   }

   private void UuUVuuUu(int var1) {
      if (var1 <= 8) {
         uUnuvNvvNU.field_1724.method_31548().method_61496(var1);
         this.nvnUvvnUUN = var1;
      } else {
         int var2 = this.VUNvNUuNVnn();
         if (var2 == -1) {
            var2 = this.uuuvuUUNVVUN;
         }

         uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var1, var2, class_1713.field_7791, uUnuvNvvNU.field_1724);
         uUnuvNvvNU.field_1724.method_31548().method_61496(var2);
         this.nvnUvvnUUN = var2;
      }
   }

   private int VUNvNUuNVnn() {
      for (int var1 = 0; var1 <= 8; var1++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_7960()) {
            return var1;
         }
      }

      return -1;
   }

   static enum NVnVnNnN {
      NONE,
      DRINK_INVIS,
      EAT_CARROT,
      DRINK_SPEED;
   }

   static enum VUUnVnVNNU {
      NONE,
      WAITING;
   }

   static enum VUnuUnnuNvVu {
      NONE,
      INVIS,
      CARROT;
   }

   static enum VvunVVUvUNnv {
      FIND,
      GOING,
      ROTATING,
      OPENING,
      WAIT_GUI;
   }

   static enum nvUnvV {
      NONE,
      INVIS,
      SPEED,
      CARROT;
   }

   static enum nvnNNunvv {
      SEARCHING,
      GOING_TO_CHEST,
      ROTATING,
      OPENING,
      WAITING_FOR_GUI,
      RETREATING,
      GOING_TO_DEATH_LOOT,
      COLLECTING_DEATH_LOOT,
      HUB_WAITING_FOR_CHEST,
      SWAPPING_TO_SAVE_ANARCHY,
      GOING_TO_STASH,
      OPENING_STASH,
      ROTATING_STASH,
      OPENING_STASH_BLOCK,
      WAITING_FOR_GUI_STASH,
      STORING_IN_CHEST;
   }

   static enum uunvUUVnuNn {
      NONE,
      SWAP_TO_BASE,
      WAIT_BASE,
      COLLECT_KIT,
      SWAP_TO_FARM,
      WAIT_FARM,
      TELEPORT_WARDEN,
      USE_INVIS;
   }
}
